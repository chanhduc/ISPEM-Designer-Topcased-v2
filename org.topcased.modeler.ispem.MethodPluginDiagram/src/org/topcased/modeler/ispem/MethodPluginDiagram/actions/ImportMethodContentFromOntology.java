package org.topcased.modeler.ispem.MethodPluginDiagram.actions;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;


import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.edit.EMFGraphEdgeEditPart;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.ispem.MethodPluginDiagram.edit.MethodContentPackageEditPart;
import org.topcased.modeler.ispem.utils.wizards.ImportMethodContentWizard;
import org.topcased.modeler.utils.Utils;
import org.topcased.spem.MethodContentPackage;
import org.topcased.spem.MethodPlugin;
import org.xml.sax.SAXException;




public class ImportMethodContentFromOntology implements IObjectActionDelegate {

	private Shell shell;
	
	private MethodContentPackage methodContentPkg;
	
	private MethodPlugin methodPlugin;
	/**
	 * Constructor for Action1.
	 */
	public ImportMethodContentFromOntology() {
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
		try {
			ImportMethodContentWizard wizard = new ImportMethodContentWizard();
			
		WizardDialog dlgWizard = new WizardDialog(shell, wizard);
		dlgWizard.create();
		wizard.init( methodPlugin);
		dlgWizard.open();
		} catch (OWLOntologyCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	        methodContentPkg = null;
	        
	        if (selection != null && structSelection.size() == 1)
	        {
	            Object obj = structSelection.getFirstElement();
	            if (obj instanceof MethodContentPackageEditPart)
	            {
	            	MethodContentPackageEditPart methodContentPkgEP = (MethodContentPackageEditPart) obj;
	            	methodContentPkg = (MethodContentPackage) Utils.getElement((GraphElement) methodContentPkgEP.getModel());
	            	methodPlugin = (MethodPlugin) methodContentPkg.eContainer();
	            }
	        }
	}

}
