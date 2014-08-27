package org.topcased.modeler.ispem.activityWF.actions;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.topcased.modeler.edit.EMFGraphEdgeEditPart;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;

public class GetEditPart implements IObjectActionDelegate {

	private Shell shell;
	
	 private AbstractEditPart abstractEP;


	/**
	 * Constructor for Action1.
	 */
	public GetEditPart() {
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
		EditPart parentEP = abstractEP.getParent();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		
	        if (!(selection instanceof IStructuredSelection))
	        {
	            return;
	        }
	        IStructuredSelection structSelection = (IStructuredSelection) selection;
	        abstractEP = null;

	        if (selection != null && structSelection.size() == 1)
	        {
	            Object obj = structSelection.getFirstElement();
	            if (obj instanceof EMFGraphNodeEditPart || obj instanceof EMFGraphEdgeEditPart)
	            {
	                abstractEP = (AbstractEditPart) obj;
	            }
	        }

	     
	}

}
