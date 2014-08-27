package org.topcased.modeler.ispem.activityWF.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.topcased.facilities.dialogs.ChooseDialog;
import org.topcased.ispem.Artifact;
import org.topcased.ispem.DevelopmentMethodContentPackage;
import org.topcased.ispem.DomainContentPackage;
import org.topcased.ispem.DomainTaskDefinition;
import org.topcased.ispem.EngineeringDomain;
import org.topcased.ispem.EngineeringDomainPackage;
import org.topcased.ispem.LanguageTaskDefinition;
import org.topcased.ispem.MethodTaskDefinition;
import org.topcased.ispem.impl.IspemFactoryImpl;
import org.topcased.ispem.provider.IspemItemProviderAdapterFactory;
import org.topcased.modeler.di.model.DiagramElement;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.edit.EMFGraphEdgeEditPart;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.Modeler;
import org.topcased.modeler.ispem.activityWF.commands.TaskUseRestoreConnectionCommand;
import org.topcased.modeler.ispem.activityWF.edit.TaskUseEditPart;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;
import org.topcased.spem.Activity;
import org.topcased.spem.BreakdownElement;
import org.topcased.spem.Default_ResponsibilityAssignment;
import org.topcased.spem.Default_TaskDefinitionParameter;
import org.topcased.spem.Default_TaskDefinitionPerformer;
import org.topcased.spem.MethodContentElement;
import org.topcased.spem.MethodContentPackage;
import org.topcased.spem.MethodContentPackageableElement;
import org.topcased.spem.MethodPlugin;
import org.topcased.spem.ProcessElement;
import org.topcased.spem.ProcessParameter;
import org.topcased.spem.ProcessPerformer;
import org.topcased.spem.ProcessResponsibilityAssignment;
import org.topcased.spem.RoleDefinition;
import org.topcased.spem.RoleUse;
import org.topcased.spem.SpemFactory;
import org.topcased.spem.TaskDefinition;
import org.topcased.spem.TaskUse;
import org.topcased.spem.WorkProductDefinition;
import org.topcased.spem.WorkProductUse;
import org.topcased.ispem.Artifact;
import org.topcased.spem.impl.SpemFactoryImpl;
import org.topcased.spem.impl.TaskUseImpl;
import org.topcased.spem.provider.SpemItemProviderAdapterFactory;
import org.topcased.spem.uma.TaskDefinitionPackage;
import org.topcased.spem.uma.WorkProductDefinitionPackage;
import org.topcased.spem.util.SpemAdapterFactory;
import org.topcased.tabbedproperties.providers.TabbedPropertiesLabelProvider;

public class ReuseWorkProductDefinitionAction implements IObjectActionDelegate {

	private Shell shell;
	
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
	
	public ReuseWorkProductDefinitionAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		methodContentPkg = getMethodContentPackage();
		if(activity instanceof org.topcased.ispem.Activity)
		{
			if(((org.topcased.ispem.Activity) activity).getContext()!=null)
			{
			org.topcased.ispem.Activity ispemActivity = (org.topcased.ispem.Activity)activity;
			ShowContextWorkProductDefinitionSelectionDialog(getRelatedEngineeringDomainPkg(ispemActivity.getContext()));
			//modeler.refreshActiveDiagram();
			return;
			}
			
		}
		
		if(activity instanceof org.topcased.spem.Activity)
		{
			ShowWorkProductDefinitionSelectionDialog();
			modeler.refreshActiveDiagram();
		}
		
	
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}
	
	/**
	 * Get MethodContentPackage
	 */
	
	private MethodContentPackage getMethodContentPackage()
	{
		MethodContentPackage pkg = null;
		
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		
		  if (editor instanceof Modeler)
	        {
	            modeler = (Modeler)  editor;
	            
	            EObject objModel= Utils.getDiagramModelObject(modeler.getActiveDiagram());
	            if (objModel instanceof Activity)
	            {
	            	activity = (Activity)objModel;
	            	EObject objParent = objModel.eContainer();
	            	
	            	while (! (objParent instanceof MethodPlugin))
	            	{
	            		objParent = objParent.eContainer();
	            		if (objParent == null)
	            			break;
	            	}
	            	if (objParent instanceof MethodPlugin)
	            	{
	            		MethodPlugin plugin = (MethodPlugin) objParent;
	            		pkg = (MethodContentPackage) plugin.getOwnedMethodContentPackage().get(0);
	            	}
	            		
	            }
	        }
		return pkg;
	}
	
	/**
	 * Get all Task Definition 
	 */
	private List<WorkProductDefinition> getAllWorkProductDefinition(MethodContentPackage methodContentPkg)
	{
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
	private DomainContentPackage getRelatedEngineeringDomainPkg(EngineeringDomain domain)
	{
		
		for(MethodContentPackageableElement element:(List<MethodContentPackageableElement>)methodContentPkg.getOwnedMethodContentMember())
		{
			if (element instanceof DomainContentPackage) {
				DomainContentPackage curDomainPkg = (DomainContentPackage) element;
				if(curDomainPkg.getRelatedDomain() == domain)
				{
					return curDomainPkg;
				}
				
			}
		}
		return null;
	}
	/**
	 * Create Task Use
	 */
	private WorkProductUse createWPUse(WorkProductDefinition wpDefinition)
	{
		WorkProductUse wpUse = null;
		for (BreakdownElement element : (List<BreakdownElement>)activity.getNestedBreakdownElement())
		{
			if (element instanceof WorkProductUse) {
				wpUse = (WorkProductUse) element;
				if (wpUse.getWorkProduct()== wpDefinition)
				{
					return wpUse;
				}
			}
		}
		SpemFactory spemFactory = new SpemFactoryImpl();
		wpUse = spemFactory.createWorkProductUse();
		wpUse.setName(wpDefinition.getName()+ " use");
		wpUse.setWorkProduct(wpDefinition);
		activity.getNestedBreakdownElement().add(wpUse);
		
		//Create WordProductUse Node
		ICreationUtils factory = modeler.getActiveConfiguration().getCreationUtils();
		GraphElement graphElement = factory.createGraphElement(wpUse);
		
		modeler.getActiveDiagram().getContained().add(graphElement);
		
		
		return wpUse;
	}
	/**
	 * Display context Task Definition selection dialog
	 */
	private void ShowContextWorkProductDefinitionSelectionDialog(DomainContentPackage domainContentPkg)
	{
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
			    shell,
			    new TabbedPropertiesLabelProvider(new IspemItemProviderAdapterFactory()),
			    new TaskDefinitionTreeContentProvider());
		dialog.setAllowMultiple(true);
		
			dialog.setTitle("Work Product Definition Selection");
			dialog.setMessage("Select the work product definitions in the context:");
			dialog.setInput(domainContentPkg);
			if(dialog.open()==Window.OK)
			{
				Object[] selection = dialog.getResult();
				for(Object item:selection)
				{
					WorkProductUse wpUse = createWPUse((WorkProductDefinition)item);
					String message = "Do you want to restore linked method contents " +
							"(Role definition and Work product definition of the Task Use " +
							wpUse.getName();
					if (MessageDialog.openConfirm(shell, "Restore linked method contents confirmation", message))
					{
					createRoleUseFromWPUse(wpUse);
					createTaskUseFromWPUse(wpUse);
					}
				}
			}
	}
	/**
	 * Display normal Task Definition selection dialog
	 */
	private void ShowWorkProductDefinitionSelectionDialog ()
	{
		List<WorkProductDefinition> lstWorkProductDefinition = getAllWorkProductDefinition(methodContentPkg);
		if (lstWorkProductDefinition != null)
		{
			// display the dialog to choose task definition
						ChooseDialog dialog = new ChooseDialog(shell, lstWorkProductDefinition.toArray());
					
						dialog.setTitle("Work Product Definition Selection: ");
						dialog.setMessage("Select one work product definition to reuse.");
						dialog.setLabelProvider(new TabbedPropertiesLabelProvider(new IspemItemProviderAdapterFactory()));
						if (dialog.open() == Window.OK)
						{
							Object[] selection = dialog.getResult();
			 
							if (selection != null && selection.length > 0)
							{
								WorkProductDefinition selWPDefinition = (WorkProductDefinition) selection[0];
								
								WorkProductUse wpUse = createWPUse(selWPDefinition);
								String message = "Do you want to restore linked method contents " +
										"(Role definition and task definition of the Work Product Use " +
										wpUse.getName();
								if (MessageDialog.openConfirm(shell, "Restore linked method contents confirmation", message))
								{
								createRoleUseFromWPUse(wpUse);
								createTaskUseFromWPUse(wpUse);
								}
							}
						}
		}
	}
	private class TaskDefinitionTreeContentProvider implements ITreeContentProvider
	{
		
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
				for (MethodContentPackageableElement element : (List<MethodContentPackageableElement>)pkg.getOwnedMethodContentMember())
				{
					if (element instanceof TaskDefinitionPackage) {
						TaskDefinitionPackage taskDefPkg = (TaskDefinitionPackage) element;
						
						for (MethodContentElement element_task: (List<MethodContentElement>)taskDefPkg.getOwnedMethodContentMember())
						{
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
			
			return ((EObject)arg0).eContainer();
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
	
	/**
	 * 
	 */
	/**
	 * Create Role use and Task use from WorkProduct use
	 */
	private void createRoleUseFromWPUse (WorkProductUse wpUse)
	{
		WorkProductDefinition wpDefinition = wpUse.getWorkProduct();
		WorkProductDefinitionPackage wpDefinitionPkg = (WorkProductDefinitionPackage) wpDefinition.eContainer();
		Activity activity = (Activity) wpUse.eContainer();
		ICreationUtils factory = modeler.getActiveConfiguration().getCreationUtils();
		for (MethodContentPackageableElement element : (List<MethodContentPackageableElement>)wpDefinitionPkg.getOwnedMethodContentMember())
		{
			if (element instanceof Default_ResponsibilityAssignment) {
				Default_ResponsibilityAssignment responAssignment = (Default_ResponsibilityAssignment) element;
				if(responAssignment.getLinkedWorkProductDefinition() == wpDefinition)
				{
					//Create role use if not existing
					List<RoleUse> lstLinkedRoleUse = new ArrayList<RoleUse>();
					List<RoleDefinition> lstRoleDefinition = responAssignment.getLinkedRoleDefinition();
					List<RoleDefinition> existRoleDefinitions = new ArrayList<RoleDefinition>();
 					for (BreakdownElement bdElement: (List<BreakdownElement>)activity.getNestedBreakdownElement())
					{
						if (bdElement instanceof RoleUse)
						{
							RoleUse roleUse = (RoleUse) bdElement;
							if (lstRoleDefinition.contains(roleUse.getRole()))
							{
								existRoleDefinitions.add(roleUse.getRole());
								lstLinkedRoleUse.add(roleUse);
							}
						}
					}
 					for (RoleDefinition roleDefinition:lstRoleDefinition)
 					{
 						if (!existRoleDefinitions.contains(roleDefinition))
 						{
 							RoleUse roleUse = SpemFactoryImpl.eINSTANCE.createRoleUse();
 							roleUse.setRole(roleDefinition);
 							roleUse.setName(roleDefinition.getName());
 							lstLinkedRoleUse.add(roleUse);
 							activity.getNestedBreakdownElement().add(roleUse);
 							//Create RoleUse Node
 							
 							GraphElement graphElement = factory.createGraphElement(wpUse);
 							graphElement.setPosition(new Point(50,50));
 							modeler.getActiveDiagram().getContained().add(graphElement);
 						}
 					}
					ProcessResponsibilityAssignment processResponAssignment = SpemFactoryImpl.eINSTANCE.createProcessResponsibilityAssignment();
					processResponAssignment.setLinkedWorkProductUse(wpUse);
					processResponAssignment.getLinkedRoleUse().addAll(lstLinkedRoleUse);
					
					activity.getNestedBreakdownElement().add(processResponAssignment);
					//Create RoleUse Node
					
					GraphElement graphElement = factory.createGraphElement(processResponAssignment);
					modeler.getActiveDiagram().getContained().add(graphElement);
					
					RestoreConnectionsRequest request = new RestoreConnectionsRequest();
					
					EditPart diagramEP = modeler.getGraphicalViewer().getContents();
					EditPart wpUseEP = null;
				
					for (EditPart graphElementEP : (List<EditPart>)diagramEP.getChildren())
					{
						
						if(Utils.getElement((GraphElement) graphElementEP.getModel())== wpUse)
						{
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
	
	private void createTaskUseFromWPUse (WorkProductUse wpUse)
	{
		WorkProductDefinition wpDefinition = wpUse.getWorkProduct();
		WorkProductDefinitionPackage wpDefinitionPkg = (WorkProductDefinitionPackage) wpDefinition.eContainer();
		Activity activity = (Activity) wpUse.eContainer();
		List<TaskUse> lstTaskUse = new ArrayList<TaskUse>();
		ICreationUtils factory = modeler.getActiveConfiguration().getCreationUtils();
		 for (BreakdownElement bdElement: (List<BreakdownElement>)activity.getNestedBreakdownElement())
			{
				if (bdElement instanceof TaskUse)
				{
					TaskUse taskUse = (TaskUse) bdElement;
					lstTaskUse.add(taskUse);
				}
			}
		List<Default_TaskDefinitionParameter> lsTaskDefPara = new ArrayList<Default_TaskDefinitionParameter>();
		//Find the related TaskDefinitions
		TreeIterator<EObject> iteMethodContentElement = methodContentPkg.eAllContents();
		while (iteMethodContentElement.hasNext())
		{
			EObject object = iteMethodContentElement.next();
			if (object instanceof Default_TaskDefinitionParameter) {
				Default_TaskDefinitionParameter taskDefParam = (Default_TaskDefinitionParameter) object;
				if (taskDefParam.getParameterType() == wpDefinition)
				{
					lsTaskDefPara.add(taskDefParam);
				}
			}
		}
		for (Default_TaskDefinitionParameter taskDefPara : lsTaskDefPara)
		{
			 
			TaskDefinition taskDefinition = (TaskDefinition) taskDefPara.eContainer();
			
				TaskUse taskUse = null;
				for(TaskUse element:lstTaskUse)
				{
					if(element.getTask()==taskDefinition)
					{
						taskUse = element;
						break;
					}
				}
				if (taskUse == null)
				{
					taskUse = SpemFactoryImpl.eINSTANCE.createTaskUse();
					taskUse.setName(taskDefinition.getName());
					taskUse.setTask(taskDefinition);
					activity.getNestedBreakdownElement().add(taskUse);
					//Create WorkProductUse Node
					
					GraphElement graphElement = factory.createGraphElement(taskUse);
					
					modeler.getActiveDiagram().getContained().add(graphElement);
					graphElement.setContainer(	modeler.getActiveDiagram());
				}
				ProcessParameter processParam = SpemFactoryImpl.eINSTANCE.createProcessParameter();
				processParam.setParameterType(wpUse);
				processParam.setDirection(taskDefPara.getDirection());
				taskUse.getOwnedProcessParameter().add(processParam);
				
				//Create graph element and restore connection
				GraphElement graphElement = factory.createGraphElement(processParam);
				modeler.getActiveDiagram().getContained().add(graphElement);
				
				RestoreConnectionsRequest request = new RestoreConnectionsRequest();
				EditPart diagramEP = modeler.getGraphicalViewer().getContents();
				EditPart artifactEP = null;
				for (EditPart graphElementEP : (List<EditPart>)diagramEP.getChildren())
				{
					
					if(Utils.getElement((GraphElement) graphElementEP.getModel())== wpUse)
					{
						artifactEP = graphElementEP;
						
					}
					
				}
				Command cmd = artifactEP.getCommand(request);
				((CommandStack) modeler.getAdapter(CommandStack.class))
				.execute(cmd);
			
			
//				EMFGraphEdgeEditPart processParamEP = (EMFGraphEdgeEditPart) modeler.getActiveConfiguration().getEditPartFactory().createEditPart(null, graphElement);
//				diagramEP.getChildren().add(processParamEP);
//				processParamEP.setParent(diagramEP);
//				processParamEP.setSource(taskUseEP);
//				processParamEP.setTarget(artifactEP);
//				processParamEP.addNotify();
//				processParamEP.activate();
				
				
	
					

					
				
				
				
			
			
		
		}
	}

}
