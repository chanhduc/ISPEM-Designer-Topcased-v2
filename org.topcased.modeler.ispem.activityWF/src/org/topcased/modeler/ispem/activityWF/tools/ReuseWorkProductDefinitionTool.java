package org.topcased.modeler.ispem.activityWF.tools;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.tools.SelectionTool;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.topcased.facilities.dialogs.ChooseDialog;
import org.topcased.ispem.DomainArtifactDefinition;
import org.topcased.ispem.DomainContentPackage;
import org.topcased.ispem.DomainTaskDefinition;
import org.topcased.ispem.EngineeringDomain;
import org.topcased.ispem.LanguageArtifactDefinition;
import org.topcased.ispem.LanguageTaskDefinition;
import org.topcased.ispem.MethodArtifactDefinition;
import org.topcased.ispem.MethodTaskDefinition;
import org.topcased.ispem.provider.IspemItemProviderAdapterFactory;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.edit.DiagramsRootEditPart;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.Modeler;
import org.topcased.modeler.ispem.activityWF.ActivityWFImageRegistry;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;
import org.topcased.spem.Activity;
import org.topcased.spem.BreakdownElement;
import org.topcased.spem.Default_ResponsibilityAssignment;
import org.topcased.spem.Default_TaskDefinitionParameter;
import org.topcased.spem.MethodContentElement;
import org.topcased.spem.MethodContentPackage;
import org.topcased.spem.MethodContentPackageableElement;
import org.topcased.spem.MethodPlugin;
import org.topcased.spem.ProcessParameter;
import org.topcased.spem.ProcessResponsibilityAssignment;
import org.topcased.spem.RoleDefinition;
import org.topcased.spem.RoleUse;
import org.topcased.spem.SpemFactory;
import org.topcased.spem.TaskDefinition;
import org.topcased.spem.TaskUse;
import org.topcased.spem.WorkProductDefinition;
import org.topcased.spem.WorkProductUse;
import org.topcased.spem.impl.SpemFactoryImpl;
import org.topcased.spem.uma.TaskDefinitionPackage;
import org.topcased.spem.uma.WorkProductDefinitionPackage;
import org.topcased.tabbedproperties.providers.TabbedPropertiesLabelProvider;

public class ReuseWorkProductDefinitionTool extends SelectionTool {
	public static final int DISTANCE_X = 100;
	public static final int DISTANCE_Y = 100;
	private Point recentlyLocation = null;
	private Point selectedLocation = null;
	private Shell shell;
	private EditPart rootEP;
	/**
	 * Modeler
	 */
	private Modeler modeler;

	/**
	 * Constructor for Action1.
	 */

	/**
	 * Current activity;
	 */
	private Activity activity;

	/**
	 * MethodContentPackage
	 */
	private MethodContentPackage methodContentPkg;
	/**
	 * Current editor's creation utils
	 */
	private ICreationUtils factory;

	public ReuseWorkProductDefinitionTool()
	{
		super();
		setDefaultCursor(new Cursor(Display.getCurrent(),ActivityWFImageRegistry.getImage("ARTIFACT").getImageData(),0,0));
	}
	
	/**
	 * Get all Task Definition
	 */
	private List<WorkProductDefinition> getAllWorkProductDefinition(
			MethodContentPackage methodContentPkg) {
		List<WorkProductDefinition> lstWPDefinition = new ArrayList<WorkProductDefinition>();
		TreeIterator<EObject> elements = methodContentPkg.eAllContents();
		while (elements.hasNext()) {
			EObject element = elements.next();
			if (element instanceof WorkProductDefinition) {
				WorkProductDefinition wpDef = (WorkProductDefinition) element;
				lstWPDefinition.add(wpDef);
			}
		}
		return lstWPDefinition;
	}

	/**
	 * Get related engineering domain package
	 */
	private DomainContentPackage getRelatedEngineeringDomainPkg(
			EngineeringDomain domain) {

		for (MethodContentPackageableElement element : (List<MethodContentPackageableElement>) methodContentPkg
				.getOwnedMethodContentMember()) {
			if (element instanceof DomainContentPackage) {
				DomainContentPackage curDomainPkg = (DomainContentPackage) element;
				if (curDomainPkg.getRelatedDomain() == domain) {
					return curDomainPkg;
				}

			}
		}
		return null;
	}

	/**
	 * Create Task Use
	 */
	private WorkProductUse createWPUse(WorkProductDefinition wpDefinition) {
		WorkProductUse wpUse = null;
		for (BreakdownElement element : (List<BreakdownElement>) activity
				.getNestedBreakdownElement()) {
			if (element instanceof WorkProductUse) {
				wpUse = (WorkProductUse) element;
				if (wpUse.getWorkProduct() == wpDefinition) {
					// Create Graph element if not exists
					if (Utils
							.getGraphElement(modeler.getActiveDiagram(), wpUse) == null) {
						createGraphElement(wpUse, selectedLocation);
					}
					return wpUse;
				}
			}
		}
		SpemFactory spemFactory = new SpemFactoryImpl();
		wpUse = spemFactory.createWorkProductUse();
		wpUse.setName(wpDefinition.getName() + " use");
		wpUse.setWorkProduct(wpDefinition);
		activity.getNestedBreakdownElement().add(wpUse);

		// Create WordProductUse Node
		createGraphElement(wpUse, selectedLocation);

		return wpUse;
	}

	/**
	 * Display context Task Definition selection dialog
	 */
	private void ShowContextWorkProductDefinitionSelectionDialog(
			DomainContentPackage domainContentPkg) {
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
				shell, new TabbedPropertiesLabelProvider(
						new IspemItemProviderAdapterFactory()),
				new ArtifactDefinitionTreeContentProvider());
		dialog.setAllowMultiple(true);

		dialog.setTitle("Work Product Definition Selection");
		dialog.setMessage("Select the work product definitions in the context:");
		dialog.setInput(domainContentPkg);
		if (dialog.open() == Window.OK) {
			Object[] selection = dialog.getResult();
			for (Object item : selection) {
				WorkProductUse wpUse = createWPUse((WorkProductDefinition) item);
				String message = "Do you want to restore linked method contents "
						+ "(Role definition and Work product definition of the Task Use "
						+ wpUse.getName();
				if (MessageDialog.openConfirm(shell,
						"Restore linked method contents confirmation", message)) {
					createRoleUseFromWPUse(wpUse);
					createTaskUseFromWPUse(wpUse);
				}
			}
		}
	}

	/**
	 * Display normal Task Definition selection dialog
	 */
	private void ShowWorkProductDefinitionSelectionDialog() {
		List<WorkProductDefinition> lstWorkProductDefinition = getAllWorkProductDefinition(methodContentPkg);
		if (lstWorkProductDefinition != null) {
			// display the dialog to choose task definition
			ChooseDialog dialog = new ChooseDialog(shell,
					lstWorkProductDefinition.toArray());

			dialog.setTitle("Work Product Definition Selection: ");
			dialog.setMessage("Select one work product definition to reuse.");
			dialog.setLabelProvider(new TabbedPropertiesLabelProvider(
					new IspemItemProviderAdapterFactory()));
			if (dialog.open() == Window.OK) {
				Object[] selection = dialog.getResult();

				if (selection != null && selection.length > 0) {
					WorkProductDefinition selWPDefinition = (WorkProductDefinition) selection[0];

					WorkProductUse wpUse = createWPUse(selWPDefinition);
					String message = "Do you want to restore linked method contents "
							+ "(Role definition and task definition of the Work Product Use "
							+ wpUse.getName();
					if (MessageDialog.openConfirm(shell,
							"Restore linked method contents confirmation",
							message)) {
						createRoleUseFromWPUse(wpUse);
						createTaskUseFromWPUse(wpUse);
					}
				}
			}
		}
	}

	private class ArtifactDefinitionTreeContentProvider implements
			ITreeContentProvider {

		@Override
		public void dispose() {
			// TODO Auto-generated method stub

		}

		@Override
		public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
			// TODO Auto-generated method stub

		}

		@Override
		public Object[] getChildren(Object arg0) {
			// TODO Auto-generated method stub

			if (arg0 instanceof DomainArtifactDefinition) {
				DomainArtifactDefinition domainArtifactDef = (DomainArtifactDefinition) arg0;
				return domainArtifactDef.getSpecializes().toArray();

			}
			if (arg0 instanceof MethodArtifactDefinition) {
				MethodArtifactDefinition methodArtifactDef = (MethodArtifactDefinition) arg0;
				return methodArtifactDef.getSpecializes().toArray();
			}
			return null;
		}

		@Override
		public Object[] getElements(Object arg0) {
			// TODO Auto-generated method stub
			if (arg0 instanceof DomainContentPackage) {
				DomainContentPackage pkg = (DomainContentPackage) arg0;
				List<DomainArtifactDefinition> lstDomainArtifactDef = new ArrayList<DomainArtifactDefinition>();
				for (MethodContentPackageableElement element : (List<MethodContentPackageableElement>) pkg
						.getOwnedMethodContentMember()) {
					if (element instanceof WorkProductDefinitionPackage) {
						WorkProductDefinitionPackage wpDefPkg = (WorkProductDefinitionPackage) element;

						for (MethodContentElement element_task : (List<MethodContentElement>) wpDefPkg
								.getOwnedMethodContentMember()) {
							if (element_task instanceof DomainArtifactDefinition) {
								DomainArtifactDefinition domainArtifactDef = (DomainArtifactDefinition) element_task;
								lstDomainArtifactDef.add(domainArtifactDef);

							}
						}
						break;
					}
				}
				return lstDomainArtifactDef.toArray();

			}
			return null;
		}

		@Override
		public Object getParent(Object arg0) {
			// TODO Auto-generated method stub

			return ((EObject) arg0).eContainer();
		}

		@Override
		public boolean hasChildren(Object arg0) {
			// TODO Auto-generated method stub
			if (arg0 instanceof LanguageArtifactDefinition) {
				return false;
			}
			return true;
		}

	}

	/**
	 * 
	 */
	/**
	 * Create Role use and Task use from WorkProduct use
	 */
	private void createRoleUseFromWPUse(WorkProductUse wpUse) {
		WorkProductDefinition wpDefinition = wpUse.getWorkProduct();
		WorkProductDefinitionPackage wpDefinitionPkg = (WorkProductDefinitionPackage) wpDefinition
				.eContainer();
		Activity activity = (Activity) wpUse.eContainer();
	
		for (MethodContentPackageableElement element : (List<MethodContentPackageableElement>) wpDefinitionPkg
				.getOwnedMethodContentMember()) {
			if (element instanceof Default_ResponsibilityAssignment) {
				Default_ResponsibilityAssignment responAssignment = (Default_ResponsibilityAssignment) element;
				if (responAssignment.getLinkedWorkProductDefinition() == wpDefinition) {
					// Create role use if not existing
					List<RoleUse> lstLinkedRoleUse = new ArrayList<RoleUse>();
					List<RoleDefinition> lstRoleDefinition = responAssignment
							.getLinkedRoleDefinition();
					List<RoleDefinition> existRoleDefinitions = new ArrayList<RoleDefinition>();
					for (BreakdownElement bdElement : (List<BreakdownElement>) activity
							.getNestedBreakdownElement()) {
						if (bdElement instanceof RoleUse) {
							RoleUse roleUse = (RoleUse) bdElement;
							if (lstRoleDefinition.contains(roleUse.getRole())) {
								existRoleDefinitions.add(roleUse.getRole());
								lstLinkedRoleUse.add(roleUse);
							}
						}
					}
					for (RoleDefinition roleDefinition : lstRoleDefinition) {
						if (!existRoleDefinitions.contains(roleDefinition)) {
							RoleUse roleUse = SpemFactoryImpl.eINSTANCE
									.createRoleUse();
							roleUse.setRole(roleDefinition);
							roleUse.setName(roleDefinition.getName());
							lstLinkedRoleUse.add(roleUse);
							activity.getNestedBreakdownElement().add(roleUse);
							// Create RoleUse Node

							GraphElement graphElement = factory
									.createGraphElement(wpUse);
							graphElement.setPosition(new Point(50, 50));
							modeler.getActiveDiagram().getContained()
									.add(graphElement);
						}
					}
					ProcessResponsibilityAssignment processResponAssignment = SpemFactoryImpl.eINSTANCE
							.createProcessResponsibilityAssignment();
					processResponAssignment.setLinkedWorkProductUse(wpUse);
					processResponAssignment.getLinkedRoleUse().addAll(
							lstLinkedRoleUse);

					activity.getNestedBreakdownElement().add(
							processResponAssignment);
					// Create RoleUse Node

					GraphElement graphElement = factory
							.createGraphElement(processResponAssignment);
					modeler.getActiveDiagram().getContained().add(graphElement);

					RestoreConnectionsRequest request = new RestoreConnectionsRequest();

					EditPart diagramEP = modeler.getGraphicalViewer()
							.getContents();
					EditPart wpUseEP = null;

					for (EditPart graphElementEP : (List<EditPart>) diagramEP
							.getChildren()) {

						if (Utils.getElement((GraphElement) graphElementEP
								.getModel()) == wpUse) {
							wpUseEP = graphElementEP;

						}

					}
					Command cmd = wpUseEP.getCommand(request);
					((CommandStack) modeler.getAdapter(CommandStack.class))
							.execute(cmd);

				}

			}
		}
	}

	private void createTaskUseFromWPUse(WorkProductUse wpUse) {
		WorkProductDefinition wpDefinition = wpUse.getWorkProduct();
		WorkProductDefinitionPackage wpDefinitionPkg = (WorkProductDefinitionPackage) wpDefinition
				.eContainer();
		Activity activity = (Activity) wpUse.eContainer();
		List<TaskUse> lstTaskUse = new ArrayList<TaskUse>();

		// Get all TaskUse
		for (BreakdownElement bdElement : (List<BreakdownElement>) activity
				.getNestedBreakdownElement()) {
			if (bdElement instanceof TaskUse) {
				TaskUse taskUse = (TaskUse) bdElement;
				lstTaskUse.add(taskUse);
			}
		}

		List<Default_TaskDefinitionParameter> lsTaskDefPara = new ArrayList<Default_TaskDefinitionParameter>();
		// Find the related TaskDefinitions
		TreeIterator<EObject> iteMethodContentElement = methodContentPkg
				.eAllContents();
		while (iteMethodContentElement.hasNext()) {
			EObject object = iteMethodContentElement.next();
			if (object instanceof Default_TaskDefinitionParameter) {
				Default_TaskDefinitionParameter taskDefParam = (Default_TaskDefinitionParameter) object;
				if (taskDefParam.getParameterType() == wpDefinition) {
					lsTaskDefPara.add(taskDefParam);
				}
			}
		}
		
		
		for (Default_TaskDefinitionParameter taskDefPara : lsTaskDefPara) {

			TaskDefinition taskDefinition = (TaskDefinition) taskDefPara
					.eContainer();

			TaskUse taskUse = null;
			for (TaskUse element : lstTaskUse) {
				if (element.getTask() == taskDefinition) {
					taskUse = element;
					// create graph element if not exists
					createGraphElement(taskUse, getNextPostion());
					break;
				}
			}
			if (taskUse == null) {
				//create TaskUse and add to model
				taskUse = SpemFactoryImpl.eINSTANCE.createTaskUse();
				taskUse.setName(taskDefinition.getName());
				taskUse.setTask(taskDefinition);
				activity.getNestedBreakdownElement().add(taskUse);
				// Create WorkProductUse Node

				createGraphElement(taskUse, getNextPostion());
			}
			
			//check if process parameter exists
			ProcessParameter processParam = null;
			for (ProcessParameter ownedProcessParam : (List<ProcessParameter>)taskUse.getOwnedProcessParameter())
			{
				if (ownedProcessParam.getParameterType() == wpUse
						&& ownedProcessParam.getDirection() == taskDefPara.getDirection())
				{
					processParam = ownedProcessParam;
					break;
				}
			}
			
			//create process parameter if not exist
			if (processParam == null)
			{
				processParam = SpemFactoryImpl.eINSTANCE
					.createProcessParameter();
				processParam.setParameterType(wpUse);
				processParam.setDirection(taskDefPara.getDirection());
				taskUse.getOwnedProcessParameter().add(processParam);
			}
			

			// Restore connection from Work product use to taskUse
			RestoreConnectionsRequest request = new RestoreConnectionsRequest();
			EditPart diagramEP = modeler.getGraphicalViewer().getContents();
			EditPart artifactEP = null;
			for (EditPart graphElementEP : (List<EditPart>) diagramEP
					.getChildren()) {

				if (Utils.getElement((GraphElement) graphElementEP.getModel()) == wpUse) {
					artifactEP = graphElementEP;

				}

			}
			Command cmd = artifactEP.getCommand(request);
			((CommandStack) modeler.getAdapter(CommandStack.class))
					.execute(cmd);


		}
	}

	/**
	 * Create a graph element from input object and add it to Diagram
	 * 
	 * @param object
	 * @param position
	 * @return
	 */
	private GraphElement createGraphElement(EObject object, Point position) {
		GraphElement graphElement = factory.createGraphElement(object);
		graphElement.setPosition(position);
		modeler.getActiveDiagram().getContained().add(graphElement);
		recentlyLocation = position;
		return graphElement;
	}

	private Point getNextPostion() {
		Point newPoint = new Point();
		if (recentlyLocation == getLocation()) {
			newPoint.setX(recentlyLocation.x + DISTANCE_X);
			newPoint.setY(recentlyLocation.y);
		} else {
			newPoint.setX(recentlyLocation.x);
			newPoint.setY(recentlyLocation.y + DISTANCE_Y);
		}
		return newPoint;

	}

	private Point getRelativeLocationOnGraphicalViewer(Point absoluteLocation) {

		FigureCanvas figureCanvas = (FigureCanvas) modeler.getGraphicalViewer()
				.getControl();
		Point location = figureCanvas.getViewport().getViewLocation();
		location = new Point(absoluteLocation.x + location.x,
				absoluteLocation.y + location.y);
		return location;
	}

	/**
	 * Get modeler and factory from editor
	 */
	private void getEditorInformation() {
		IEditorPart editor = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editor instanceof Modeler) {
			modeler = (Modeler) editor;
			factory = modeler.getActiveConfiguration().getCreationUtils();
			rootEP = modeler.getRootEditPart();
		}
	}

	/**
	 * Get Method Content Package
	 * 
	 * @return
	 */
	private MethodContentPackage getMethodContentPackage() {
		MethodContentPackage pkg = null;

		EObject objModel = Utils.getDiagramModelObject(modeler
				.getActiveDiagram());
		if (objModel instanceof Activity) {
			activity = (Activity) objModel;

			EObject objParent = objModel.eContainer();

			while (!(objParent instanceof MethodPlugin)) {
				objParent = objParent.eContainer();
				if (objParent == null)
					break;
			}
			if (objParent instanceof MethodPlugin) {
				MethodPlugin plugin = (MethodPlugin) objParent;
				pkg = (MethodContentPackage) plugin
						.getOwnedMethodContentPackage().get(0);
			}

		}

		return pkg;
	}

	@Override
	protected boolean handleButtonDown(int button) {
		// super.handleButtonDown(button);
		if (button != 1) {
			return false;
		}
		selectedLocation = getLocation();
		EditPart editPart = getTargetEditPart();

		shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		getEditorInformation();

		if (editPart instanceof DiagramsRootEditPart) {
			EditPart activityEP = ((DiagramsRootEditPart) editPart)
					.getContents();
			methodContentPkg = getMethodContentPackage();
			if (activity instanceof org.topcased.ispem.Activity) {
				if (((org.topcased.ispem.Activity) activity).getContext() != null) {
					org.topcased.ispem.Activity ispemActivity = (org.topcased.ispem.Activity) activity;
					ShowContextWorkProductDefinitionSelectionDialog(getRelatedEngineeringDomainPkg(ispemActivity
							.getContext()));
					// modeler.refreshActiveDiagram();
					return true;
				}

			}

			if (activity instanceof org.topcased.spem.Activity) {
				ShowWorkProductDefinitionSelectionDialog();
				modeler.refreshActiveDiagram();
			}
			return true;
		}
		return false;
	}

}
