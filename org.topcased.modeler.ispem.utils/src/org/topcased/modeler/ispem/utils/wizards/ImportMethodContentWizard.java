package org.topcased.modeler.ispem.utils.wizards;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.topcased.ispem.DevelopmentMethodContentPackage;
import org.topcased.ispem.DevelopmentMethodPackage;
import org.topcased.ispem.DomainContentPackage;
import org.topcased.ispem.EngineeringDomainPackage;
import org.topcased.modeler.ispem.utils.ontology.ISPEMOntologyImport;
import org.topcased.modeler.ispem.utils.ontology.OntologyPackage;
import org.topcased.spem.MethodContentPackage;
import org.topcased.spem.MethodContentPackageableElement;
import org.topcased.spem.MethodPlugin;
import org.topcased.spem.uma.CategoryPackage;
import org.xml.sax.SAXException;

public class ImportMethodContentWizard extends Wizard{
	public DomainPackageSelectPage domainpage;
	public MethodPackageSelectPage methodpage;
	public ISPEMOntologyImport factory;
	private MethodPlugin plugin;
	public void init(MethodPlugin plugin) throws OWLOntologyCreationException, SAXException, IOException, ParserConfigurationException
	{
		this.plugin = plugin;
		factory = ISPEMOntologyImport.getInstance();
			java.util.List<OntologyPackage> strDomainPackages = factory.getDomainPackages();
			domainpage.packages= strDomainPackages;
			domainpage.dataChange();
			this.setNeedsProgressMonitor(true);
	}
	public void addPages()
	{
	     domainpage = new DomainPackageSelectPage("Domain selection");
	     addPage(domainpage);
	     methodpage = new MethodPackageSelectPage("Method selection:");
	     addPage(methodpage);
	    		 
	    		 
	}
	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		
		OntologyPackage domain = domainpage.packages
				.get(domainpage.pkgList.getSelectionIndex());
		OntologyPackage method = null;
		if (methodpage.pkgList.getSelectionIndex()>-1)
		{
			method = methodpage.packages.get(methodpage.pkgList.getSelectionIndex());
		}
		 
		DomainContentPackage domainMp = null;
		MethodContentPackage methodContentPkg = (MethodContentPackage) plugin.getOwnedMethodContentPackage().get(0);
		for (MethodContentPackageableElement p :  (List<MethodContentPackageableElement>)(methodContentPkg
				.getOwnedMethodContentMember()) ){
			if (p instanceof CategoryPackage) {
				for (MethodContentPackageableElement p2 : (List<MethodContentPackageableElement>)((CategoryPackage) p)
						.getOwnedMethodContentMember()) {
					if (p2 instanceof EngineeringDomainPackage) {
					}
					if (p2 instanceof DevelopmentMethodPackage) {

					}
				}
			}
			if (p instanceof DomainContentPackage) {
				// domainPkgs.add((DomainContentPackage) p);
				if (p.getName().equalsIgnoreCase(domain.getName())) {

					domainMp = (DomainContentPackage) p;

				}
			}

		}
		MethodContentPackage rootPkg = (MethodContentPackage) plugin
				.getOwnedMethodContentPackage().get(0);
		if (domainMp == null) {
			try {
				domainMp = factory.importDomainPackage(domain,
						rootPkg);
			} catch (OWLOntologyCreationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			((MethodContentPackage) plugin.getOwnedMethodContentPackage().get(0))
					.getOwnedMethodContentMember().add(domainMp);
		}
		for (MethodContentPackageableElement p : (List<MethodContentPackageableElement>)domainMp
				.getOwnedMethodContentMember()) {
			if (p instanceof DevelopmentMethodContentPackage) {
				if (p.getName().equalsIgnoreCase(method.getName())) {
					MessageBox dlg = new MessageBox(getShell(), SWT.YES
							| SWT.NO);
					dlg.setText("Import problem");
					dlg.setMessage("Package is existing in your model. Do you want to overwrite?");

					if (dlg.open() == SWT.YES) {
						domainMp.getOwnedMethodContentMember().remove(p);
						break;
					}

					return false;
				}

			}
		}
		if (method!=null){
		try {
			domainMp.getOwnedMethodContentMember().add(
					factory.importMethodPackage(method, domainMp,
							(MethodContentPackage) plugin.getOwnedMethodContentPackage()
									.get(0)));
			factory.getMetaModelsRelation((MethodContentPackage) plugin.getOwnedMethodContentPackage().get(0));
			MessageDialog.openInformation(getShell(), "Import successfully", "Import successfully Method package: "+method.getName());
			return true;
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			MessageDialog.openError(getShell(), "Error", e.getMessage());

		} catch (OWLOntologyCreationException e) {
			// TODO Auto-generated catch block
			MessageDialog.openError(getShell(), "Error", e.getMessage());
			// e.printStackTrace();
		}
		}
		return true;
	}
	
}