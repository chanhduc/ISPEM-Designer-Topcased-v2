package org.topcased.modeler.ispem.activityWF.tools;

import java.util.ArrayList;
import java.util.List;

import org.apache.tools.ant.taskdefs.Sleep;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.tools.SelectionTool;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.topcased.facilities.dialogs.ChooseDialog;
import org.topcased.ispem.DomainContentPackage;
import org.topcased.ispem.DomainTaskDefinition;
import org.topcased.ispem.EngineeringDomain;
import org.topcased.ispem.LanguageTaskDefinition;
import org.topcased.ispem.MethodTaskDefinition;
import org.topcased.ispem.impl.IspemFactoryImpl;
import org.topcased.ispem.provider.IspemItemProviderAdapterFactory;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.edit.DiagramsRootEditPart;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.Modeler;

import org.topcased.modeler.ispem.activityWF.ActivityWFImageRegistry;
import org.topcased.modeler.ispem.activityWF.edit.ActivityWFDiagramEditPart;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;
import org.topcased.spem.Activity;
import org.topcased.spem.BreakdownElement;
import org.topcased.spem.Default_TaskDefinitionParameter;
import org.topcased.spem.Default_TaskDefinitionPerformer;
import org.topcased.spem.MethodContentElement;
import org.topcased.spem.MethodContentPackage;
import org.topcased.spem.MethodContentPackageableElement;
import org.topcased.spem.MethodPlugin;
import org.topcased.spem.ProcessParameter;
import org.topcased.spem.ProcessPerformer;
import org.topcased.spem.RoleDefinition;
import org.topcased.spem.RoleUse;
import org.topcased.spem.SpemFactory;
import org.topcased.spem.TaskDefinition;
import org.topcased.spem.TaskUse;
import org.topcased.spem.WorkProductDefinition;
import org.topcased.spem.WorkProductUse;
import org.topcased.spem.impl.SpemFactoryImpl;
import org.topcased.spem.uma.TaskDefinitionPackage;
import org.topcased.tabbedproperties.providers.TabbedPropertiesLabelProvider;

public class ReuseTaskDefinitionTool extends SelectionTool {

	public static final int DISTANCE_X = 100;
	public  static final int DISTANCE_Y = 100;
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

	private class TaskDefinitionTreeContentProvider implements
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

			if (arg0 instanceof DomainTaskDefinition) {
				DomainTaskDefinition domainTaskDef = (DomainTaskDefinition) arg0;
				return domainTaskDef.getSpecializes().toArray();

			}
			if (arg0 instanceof MethodTaskDefinition) {
				MethodTaskDefinition methodTaskDefinition = (MethodTaskDefinition) arg0;
				return methodTaskDefinition.getSpecializes().toArray();
			}
			return null;
		}

		@Override
		public Object[] getElements(Object arg0) {
			// TODO Auto-generated method stub
			if (arg0 instanceof DomainContentPackage) {
				DomainContentPackage pkg = (DomainContentPackage) arg0;
				List<DomainTaskDefinition> lstDomainTaskDef = new ArrayList<DomainTaskDefinition>();
				for (MethodContentPackageableElement element : (List<MethodContentPackageableElement>) pkg
						.getOwnedMethodContentMember()) {
					if (element instanceof TaskDefinitionPackage) {
						TaskDefinitionPackage taskDefPkg = (TaskDefinitionPackage) element;

						for (MethodContentElement element_task : (List<MethodContentElement>) taskDefPkg
								.getOwnedMethodContentMember()) {
							if (element_task instanceof DomainTaskDefinition) {
								DomainTaskDefinition domainTaskDef = (DomainTaskDefinition) element_task;
								lstDomainTaskDef.add(domainTaskDef);

							}
						}
						break;
					}
				}
				return lstDomainTaskDef.toArray();

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
			if (arg0 instanceof LanguageTaskDefinition) {
				return false;
			}
			return true;
		}

	}

	@Override
	protected boolean handleButtonDown(int button) {
		// super.handleButtonDown(button);
		if (button != 1)
		{
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
					ShowContextTaskDefinitionSelectionDialog(getRelatedEngineeringDomainPkg(ispemActivity
							.getContext()));
					// modeler.refreshActiveDiagram();
					return true;
				}

			}

			if (activity instanceof org.topcased.spem.Activity) {
				ShowTaskDefinitionSelectionDialog();
				modeler.refreshActiveDiagram();
			}
			return true;
		}
		return false;
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

	/**
	 * Get all Task Definition
	 */
	private List<TaskDefinition> getAllTaskDefinition(
			MethodContentPackage methodContentPkg) {
		List<TaskDefinition> lstTaskDefinition = new ArrayList<TaskDefinition>();
		TreeIterator<EObject> elements = methodContentPkg.eAllContents();
		while (elements.hasNext()) {
			EObject element = elements.next();
			if (element instanceof TaskDefinition) {
				TaskDefinition taskDef = (TaskDefinition) element;
				lstTaskDefinition.add(taskDef);
			}
		}
		return lstTaskDefinition;
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
	private TaskUse createTaskUse(TaskDefinition taskDefinition) {
		TaskUse taskUse = null;
		for (BreakdownElement element : (List<BreakdownElement>) activity
				.getNestedBreakdownElement()) {
			if (element instanceof TaskUse) {
				taskUse = (TaskUse) element;
				if (taskUse.getTask() == taskDefinition) {
					return taskUse;
				}
			}
		}
		SpemFactory spemFactory = new SpemFactoryImpl();
		taskUse = spemFactory.createTaskUse();
		taskUse.setName(taskDefinition.getName() + " use");
		taskUse.setTask(taskDefinition);
		activity.getNestedBreakdownElement().add(taskUse);

		// Create TaskUse Node
		GraphElement graphElement = createGraphElement(taskUse,  getRelativeLocationOnGraphicalViewer(selectedLocation));
		recentlyLocation = graphElement.getPosition();
		return taskUse;
	}

	/**
	 * Display context Task Definition selection dialog
	 */
	private void ShowContextTaskDefinitionSelectionDialog(
			DomainContentPackage domainContentPkg) {
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
				shell, new TabbedPropertiesLabelProvider(
						new IspemItemProviderAdapterFactory()),
				new TaskDefinitionTreeContentProvider());
		dialog.setAllowMultiple(true);

		dialog.setTitle("Task Definition Selection");
		dialog.setMessage("Select the one task definition in the context:");
		dialog.setInput(domainContentPkg);
		if (dialog.open() == Window.OK) {
			Object[] selection = dialog.getResult();
			for (Object item : selection) {
				TaskUse taskUse = createTaskUse((TaskDefinition) item);
				String message = "Do you want to restore linked method contents "
						+ "(Role definition and Work product definition of the Task Use "
						+ taskUse.getName();
				if (MessageDialog.openConfirm(shell,
						"Restore linked method contents confirmation", message)) {
					createRoleUseFromTaskUse(taskUse);
					createArtifactFromTaskUse(taskUse);
				}

			}
		}
	}

	/**
	 * Display normal Task Definition selection dialog
	 */
	private void ShowTaskDefinitionSelectionDialog() {
		List<TaskDefinition> lstTaskDefinition = getAllTaskDefinition(methodContentPkg);
		if (lstTaskDefinition != null) {
			// display the dialog to choose task definition
			ChooseDialog dialog = new ChooseDialog(shell,
					lstTaskDefinition.toArray());

			dialog.setTitle("Task Definition Selection: ");
			dialog.setLabelProvider(new TabbedPropertiesLabelProvider(
					new IspemItemProviderAdapterFactory()));
			if (dialog.open() == Window.OK) {
				Object[] selection = dialog.getResult();

				if (selection != null && selection.length > 0) {
					TaskDefinition selTaskDefinition = (TaskDefinition) selection[0];

					TaskUse taskUse = createTaskUse(selTaskDefinition);
					String message = "Do you want to restore linked method contents "
							+ "(Role definition and Work product definition of the Task Use "
							+ taskUse.getName();
					if (MessageDialog.openConfirm(shell,
							"Restore linked method contents confirmation",
							message)) {
						createRoleUseFromTaskUse(taskUse);
						createArtifactFromTaskUse(taskUse);
					}
				}
			}
		}
	}

	/**
	 * 
	 */
	/**
	 * Create Role use and Workproduct use from Task use
	 */
	private void createRoleUseFromTaskUse(TaskUse taskUse) {
		TaskDefinition taskDefinition = taskUse.getTask();
		TaskDefinitionPackage taskDefinitionPkg = (TaskDefinitionPackage) taskDefinition
				.eContainer();
		Activity activity = (Activity) taskUse.eContainer();
		ICreationUtils factory = modeler.getActiveConfiguration()
				.getCreationUtils();
		

		// get list of linkedROleDefinition
		// 1 TaskDefinition have to be linked from just one
		// Default_TaskDefinitionPerformer
		List<RoleDefinition> lstLinkedRoleDef = new ArrayList<RoleDefinition>();
		for (MethodContentPackageableElement element : (List<MethodContentPackageableElement>) taskDefinitionPkg
				.getOwnedMethodContentMember()) {
			if (element instanceof Default_TaskDefinitionPerformer) {
				Default_TaskDefinitionPerformer taskDefPerformer = (Default_TaskDefinitionPerformer) element;
				if (taskDefPerformer.getLinkedTaskDefinition() == taskDefinition) {
					lstLinkedRoleDef.addAll(taskDefPerformer
							.getLinkedRoleDefinition());
					break;
				}
			}
		}
		if (lstLinkedRoleDef.isEmpty()) return;
		List<RoleDefinition> lstNotExistRoleDefinition = new ArrayList<RoleDefinition>();
		List<RoleUse> lstRoleUse = new ArrayList<RoleUse>();
		ProcessPerformer processPerformer = null;

		for (BreakdownElement bdElement : (List<BreakdownElement>) activity
				.getNestedBreakdownElement()) {

			if (bdElement instanceof RoleUse) {
				// find not existing role use linked with role definition
				RoleUse roleUse = (RoleUse) bdElement;
				if (lstNotExistRoleDefinition.contains(roleUse.getRole())) {
					lstNotExistRoleDefinition.remove(roleUse.getRole());
					lstRoleUse.add(roleUse);
					// force restore editpart
					if (Utils.getGraphElement(modeler.getActiveDiagram(),
							roleUse) == null) {
						// Create RoleUse Node
						GraphElement graphElement = createGraphElement(roleUse, getNextPostion());
						recentlyLocation = graphElement.getPosition();
					}
				}

			}
			if (bdElement instanceof ProcessPerformer) {
				// get Process Performer
				if (((ProcessPerformer) bdElement).getLinkedTaskUse() == taskUse) {
					processPerformer = (ProcessPerformer) bdElement;
				}

			}
		}

		// Create not existing role uses
		for (RoleDefinition roleDefinition : lstNotExistRoleDefinition) {
			//Create RoleUse and add to model
			RoleUse roleUse = SpemFactoryImpl.eINSTANCE.createRoleUse();
			roleUse.setRole(roleDefinition);
			roleUse.setName(roleDefinition.getName());
			activity.getNestedBreakdownElement().add(roleUse);
			
			lstRoleUse.add(roleUse);
			// Create RoleUse Node

			GraphElement graphElement = createGraphElement(roleUse, getNextPostion());
			recentlyLocation = graphElement.getPosition();
		}
		
		//Create ProcessPerformer if not exists
		if (processPerformer == null)
		{
			processPerformer = SpemFactoryImpl.eINSTANCE
					.createProcessPerformer();
			processPerformer.setLinkedTaskUse(taskUse);
				activity.getNestedBreakdownElement().add(processPerformer);	
		}
		
		//Add RoleUse to ProcessPerformer
		for (RoleUse roleUse:lstRoleUse)
		{
			if (!processPerformer.getLinkedRoleUse().contains(roleUse))
			{
				processPerformer.getLinkedRoleUse().add(roleUse);
			}
		}
		
		//Restore connection TaskUse to RoleUse
		RestoreConnectionsRequest request = new RestoreConnectionsRequest();

		EditPart diagramEP = modeler.getGraphicalViewer()
				.getContents();
		EditPart taskUseEP = null;

		for (EditPart graphElementEP : (List<EditPart>) diagramEP
				.getChildren()) {

			if (Utils.getElement((GraphElement) graphElementEP
					.getModel()) == taskUse) {
				taskUseEP = graphElementEP;

			}

		}
		Command cmd = taskUseEP.getCommand(request);
		((CommandStack) modeler.getAdapter(CommandStack.class))
				.execute(cmd);
		
		
		
	}

	private void createArtifactFromTaskUse(TaskUse taskUse) {
		TaskDefinition taskDefinition = taskUse.getTask();
		TaskDefinitionPackage taskDefinitionPkg = (TaskDefinitionPackage) taskDefinition
				.eContainer();
		Activity activity = (Activity) taskUse.eContainer();
		List<WorkProductUse> lstArtifactUse = new ArrayList<WorkProductUse>();
		
		//Get all Work product use
		for (BreakdownElement bdElement : (List<BreakdownElement>) activity
				.getNestedBreakdownElement()) {
			if (bdElement instanceof WorkProductUse) {
				WorkProductUse artifact = (WorkProductUse) bdElement;
				lstArtifactUse.add(artifact);
			}
		}
		
		//check if existing work product use linked with wpd
		List<Default_TaskDefinitionParameter> lsTaskDefPara = taskDefinition
				.getOwnedTaskDefinitionParameter();
		for (Default_TaskDefinitionParameter taskDefPara : lsTaskDefPara) {

			WorkProductDefinition wpDefinition = taskDefPara.getParameterType();

			if (wpDefinition != null) {
				// Find if exists WorkProductUse
				WorkProductUse artifact = null;
				for (WorkProductUse element : lstArtifactUse) {
					if (element.getWorkProduct() == wpDefinition) {
						// if found, force create graph element
						artifact = element;
						
						if(Utils.getGraphElement(modeler.getActiveDiagram(), artifact)==null)
						{
							createGraphElement(artifact, getNextPostion());
						}
						//check if exist ProcessParameter
						for (ProcessParameter processParam : (List<ProcessParameter>) taskUse
								.getOwnedProcessParameter()) {
							if (processParam.getParameterType() == artifact
									&& processParam.getDirection() == taskDefPara
											.getDirection())
							// if ProcessParameter exist
							{
								break;
							}

						}
						break;
					}
				}
				if (artifact == null) // if not found, create a new
										// WorkProductUse
				{
					artifact = SpemFactoryImpl.eINSTANCE.createWorkProductUse();
					artifact.setName(wpDefinition.getName());
					artifact.setWorkProduct(wpDefinition);
					activity.getNestedBreakdownElement().add(artifact);
					// Create WorkProductUse Node

					createGraphElement(artifact, getNextPostion());
					
				}
				
				//Create ProcessParam and add to model
				ProcessParameter processParam = SpemFactoryImpl.eINSTANCE
						.createProcessParameter();
				processParam.setParameterType(artifact);
				processParam.setDirection(taskDefPara.getDirection());
				taskUse.getOwnedProcessParameter().add(processParam);
				
				//Restore connection from TaskUse to Artifact
				RestoreConnectionsRequest request = new RestoreConnectionsRequest();

				EditPart diagramEP = modeler.getGraphicalViewer().getContents();
				EditPart taskUseEP = null;
				EditPart artifactEP = null;
				for (EditPart graphElementEP : (List<EditPart>) diagramEP
						.getChildren()) {

					if (Utils.getElement((GraphElement) graphElementEP
							.getModel()) == taskUse) {
						taskUseEP = graphElementEP;

					}
					if (Utils.getElement((GraphElement) graphElementEP
							.getModel()) == artifact) {
						artifactEP = graphElementEP;

					}
				}
				Command cmd = taskUseEP.getCommand(request);
				((CommandStack) modeler.getAdapter(CommandStack.class))
						.execute(cmd);

			}

		}
	}
	/**
	 * Create a graph element from input object and add it to Diagram
	 * @param object
	 * @param position
	 * @return
	 */
	private GraphElement createGraphElement(EObject object, Point position
			) {
		GraphElement graphElement = factory.createGraphElement(object);
		graphElement.setPosition(position);
		modeler.getActiveDiagram().getContained().add(graphElement);
		recentlyLocation = position;
		return graphElement;
	}
	
	private Point getNextPostion()
	{
		Point newPoint = new Point();
		if (recentlyLocation == getLocation())
		{
			newPoint.setX(recentlyLocation.x+DISTANCE_X);
			newPoint.setY(recentlyLocation.y);
		}
		else
		{
			newPoint.setX(recentlyLocation.x);
			newPoint.setY(recentlyLocation.y+DISTANCE_Y);
		}
		return newPoint;	
		
	}
	
	private Point getRelativeLocationOnGraphicalViewer (Point absoluteLocation)
	{
			
		FigureCanvas figureCanvas = (FigureCanvas)modeler.getGraphicalViewer().getControl();
		Point location = figureCanvas.getViewport().getViewLocation();
		location = new Point(absoluteLocation.x + location.x, absoluteLocation.y + location.y);
		return location;
	}
	
	public ReuseTaskDefinitionTool()
	{
		super();
		setDefaultCursor(new Cursor(Display.getCurrent(),ActivityWFImageRegistry.getImage("TASKUSE").getImageData(),0,0));
	}
}
