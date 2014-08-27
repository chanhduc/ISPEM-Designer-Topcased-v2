package org.topcased.modeler.ispem.testdiagram.popup.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.topcased.facilities.dialogs.ChooseDialog;
import org.topcased.modeler.editor.Modeler;
import org.topcased.modeler.ispem.testdiagram.edit.TaskDefinitionEditPart;
import org.topcased.modeler.utils.Utils;
import org.topcased.spem.MethodContentElement;
import org.topcased.spem.MethodContentPackage;
import org.topcased.spem.MethodContentPackageableElement;
import org.topcased.spem.RoleDefinition;
import org.topcased.spem.TaskDefinition;
import org.topcased.spem.provider.SpemItemProviderAdapterFactory;
import org.topcased.tabbedproperties.providers.TabbedPropertiesLabelProvider;

public class PerformerAssignementAction implements IObjectActionDelegate {

	private Shell shell;
	
	/**
	 * The WorkbenchPart object
	 * @generated
	 */
	private IWorkbenchPart targetPart;

	/**
	 * Modeler
	 */
	private Modeler modeler;

	
	
	/**
	 * Constructor for Action1.
	 */
	public PerformerAssignementAction() {
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
		List<RoleDefinition> lstRoleDef = getAllRoleDefinition();
		if (lstRoleDef != null)
		{
			// display the dialog to choose a role definition
			ChooseDialog dialog = new ChooseDialog(Display.getCurrent().getActiveShell(), lstRoleDef.toArray());
			dialog.setTitle("Task - Performer assign: ");
			dialog.setLabelProvider(new TabbedPropertiesLabelProvider(new SpemItemProviderAdapterFactory()));
			if (dialog.open() == Window.OK)
			{
				Object[] selection = dialog.getResult();
 
				if (selection != null && selection.length > 0)
				{
					RoleDefinition selRoleDef = (RoleDefinition)selection[0];
					MessageDialog.openInformation(shell, "Test Diagram", "You've selected "+selRoleDef.getName());
				}
			}
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}
	/**
	 * Get selected TaskDefinition
	 * 
	 */
	private TaskDefinition getTaskDefinition (ISelection selection)
	{
        TaskDefinition taskDef = null;
		
	        if (selection instanceof IStructuredSelection)
	        {
	            IStructuredSelection selectStruc = (IStructuredSelection) selection;
	    
	            if (selectStruc.getFirstElement() instanceof TaskDefinitionEditPart)
	            {
	            	TaskDefinitionEditPart part = (TaskDefinitionEditPart) selectStruc.getFirstElement();
	            	
	                if (part.getEObject() instanceof TaskDefinition)
	                {
	                     taskDef = (TaskDefinition) part.getEObject();
	                }
	            }
	            else if (selectStruc.getFirstElement() instanceof TaskDefinition)
	            {
	            	taskDef = (TaskDefinition) selectStruc.getFirstElement();
	            }
	            
	        }
	        return taskDef;
	}
	
	/**
	 * Get all RoleDefinition
	 */
	private List<RoleDefinition> getAllRoleDefinition()
	{
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		List<RoleDefinition> lstRoleDefinition = null;
		  if (editor instanceof Modeler)
	        {
	            modeler = (Modeler)  editor;
	            EObject objModel= Utils.getDiagramModelObject(modeler.getActiveDiagram());
	          if (objModel instanceof MethodContentPackage) {
					MethodContentPackage pkg = (MethodContentPackage) objModel;
					lstRoleDefinition = new ArrayList<RoleDefinition>();
					EList<MethodContentPackageableElement> elements = pkg.getOwnedMethodContentMember();
					for (MethodContentPackageableElement element : elements) {
						if (element instanceof RoleDefinition) {
							RoleDefinition roleDef = (RoleDefinition) element;
							lstRoleDefinition.add(roleDef);
						}
					}
				}
	          else
	          {
	        	  MessageDialog.openInformation(shell, "Test Diagram", "Return EObject is not a MethodContentPackage");
	            
	          }
	        }
	        else
	        {
	            MessageDialog.openInformation(shell, "Test Diagram", "Sorry, this action is available only on the Topcased Editor.");
	        }
		  return lstRoleDefinition;
	    }
	
}
