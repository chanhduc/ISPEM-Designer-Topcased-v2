package org.topcased.modeler.ispem.utils.wizards;

import java.util.ArrayList;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.topcased.modeler.ispem.utils.ontology.OntologyPackage;

public class DomainPackageSelectPage extends WizardPage implements Listener{
	public java.util.List<OntologyPackage> packages;
	List pkgList;
	Text txtDescription;
	protected DomainPackageSelectPage(String pageName) {
		super(pageName);
		packages= new ArrayList<OntologyPackage>();
		setTitle("Domain OntologyPackage selection");
		setDescription("Specify the domain OntologyPackage");
		// TODO Auto-generated constructor stub
	}

	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		// create the composite to hold the widgets   
		  Composite composite = new Composite(parent, SWT.NONE);
		    // create the desired layout for this wizard page
		  GridLayout gl = new GridLayout();
		    int ncol = 2;
		    gl.numColumns = ncol;
		    composite.setLayout(gl);		
		    // create the widgets  and their grid data objects 
		    // Name of OntologyPackage
		    new Label (composite, SWT.NONE).setText("Domain packages:");  
		 pkgList = new List(composite, SWT.BORDER | SWT.V_SCROLL|SWT.H_SCROLL);
		  GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		  gd.heightHint = 100;
	
			 pkgList.setLayoutData(gd);
			pkgList.addListener(SWT.Selection, this);
		 //createLine(parent, ncol);
		 //Description
		 new Label(composite, SWT.NONE).setText("Description:");
		 txtDescription = new Text(composite, SWT.BORDER|SWT.READ_ONLY|SWT.COLOR_WHITE);
		 txtDescription.setLayoutData(gd);
		 setControl(composite);		
	}
	private void createLine(Composite parent, int ncol) 
	{
		Label line = new Label(parent, SWT.SEPARATOR|SWT.HORIZONTAL|SWT.BOLD);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = ncol;
		line.setLayoutData(gridData);
	}
	public boolean canFlipToNextPage()
	{
		// no next page for this path through the wizard
		if (pkgList.getSelectionCount()==0)
		{
			return false;
		}
		return true;
	} 
	public IWizardPage getNextPage(){
		int i = pkgList.getSelectionIndex();
		OntologyPackage p = packages.get(i);
		ImportMethodContentWizard parentWizard = (ImportMethodContentWizard)getWizard();
		parentWizard.methodpage.packages = parentWizard.factory.getMethodPackages( p.getUri());
	
	parentWizard.methodpage.strDomain = p.getName();
	parentWizard.methodpage.dataChange();
	if (parentWizard.methodpage.packages.isEmpty())
	{
		parentWizard.methodpage.setPageComplete(true);		
	}
		return parentWizard.methodpage;
	  
	  
	}
	public void dataChange()
	{
		pkgList.removeAll();
		  for (int i=0;i<packages.size();i++)
		  {
			  pkgList.add(packages.get(i).getName(),i);
		  }
	}

	public void handleEvent(Event event) {
		// TODO Auto-generated method stub
		if (event.widget==pkgList)
		{
			if (pkgList.getSelectionCount()>0)
			{
				int i = pkgList.getSelectionIndex();
				txtDescription.setText(packages.get(i).getDescription());
				setPageComplete(canFlipToNextPage());
			}
		}
	}
	public boolean isPageComplete()
	{
		if (pkgList.getSelectionCount()>0)
		{
			return true;
		}
		return false;
	}
	
}
