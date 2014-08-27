package org.topcased.modeler.ispem.MethodPluginDiagram.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.openrdf.repository.RepositoryException;
import org.topcased.modeler.ispem.utils.ontology.AddOWLFinish;
import org.topcased.modeler.ispem.utils.ontology.RepositoryHelper;

public class UploadOntology implements IObjectActionDelegate {

	private Shell shell;
	
	/**
	 * Constructor for Action1.
	 */
	public UploadOntology() {
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
		String base_path = "E:\\Dropbox\\stage\\implementation\\final\\ontology repository\\";
		String base_url = "http://www.ispem.org/ontology/";
		RepositoryHelper.addListener(new AddOWLFinish());
		try {
			RepositoryHelper.addOWL(base_path+"ispem.owl", base_url+"ispem.owl");
			RepositoryHelper.addOWL(base_path+"domain-DI.owl",  base_url+"domain/di.owl");
			RepositoryHelper.addOWL(base_path+"domain-RA.owl",  base_url+"domain/ra.owl");
			RepositoryHelper.addOWL(base_path+"MM_BlueBee.owl",  base_url+"metamodel/bluebee.owl");
			RepositoryHelper.addOWL(base_path+"MM_Csourcecode.owl",  base_url+"metamodel/csourcecode.owl");
			RepositoryHelper.addOWL(base_path+"MM_DI.owl",  base_url+"metamodel/DI.owl");
			RepositoryHelper.addOWL(base_path+"MM_MOPCOM.owl",  base_url+"metamodel/mopcom.owl");
			RepositoryHelper.addOWL(base_path+"mm_sysml.owl",  base_url+"metamodel/sysml.owl");	
			RepositoryHelper.addOWL(base_path+"MM_UML.owl",  base_url+"metamodel/uml.owl");
			RepositoryHelper.addOWL(base_path+"mapping.owl",  base_url+"metamodel/mapping.owl");
			RepositoryHelper.addOWL(base_path+"Ecore(new).owl", "http://www.eclipse.org/emf/2002/Ecore#ecore");
			RepositoryHelper.addOWL(base_path+"lib\\sqwrl.owl", "http://sqwrl.stanford.edu/ontologies/built-ins/3.4/sqwrl.owl");
			RepositoryHelper.addOWL(base_path+"lib\\swrla.owl", "http://swrl.stanford.edu/ontologies/3.3/swrla.owl#");
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

}
