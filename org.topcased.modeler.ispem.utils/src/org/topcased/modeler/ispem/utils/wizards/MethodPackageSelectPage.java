package org.topcased.modeler.ispem.utils.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.topcased.modeler.ispem.utils.ontology.OntologyPackage;

public class MethodPackageSelectPage extends WizardPage implements Listener {
	public java.util.List<OntologyPackage> packages;
	String strDomain;
	List pkgList;
	Text txtDescription;

	protected MethodPackageSelectPage(String pageName) {
		super(pageName);

		setTitle(strDomain + " specialized Method packages selection");
		setDescription("Specify the method package");
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
		// create the widgets and their grid data objects
		// Name of package

		new Label(composite, SWT.NONE).setText("Method packages:");
		pkgList = new List(composite, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.heightHint = 100;
		pkgList.setLayoutData(gd);
		pkgList.addListener(SWT.Selection, this);
		// createLine(parent, ncol);
		// Description
		new Label(composite, SWT.NONE).setText("Description:");
		txtDescription = new Text(composite, SWT.BORDER | SWT.READ_ONLY);
		txtDescription.setLayoutData(gd);
		setControl(composite);
	}

	private void createLine(Composite parent, int ncol) {
		Label line = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL
				| SWT.BOLD);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = ncol;
		line.setLayoutData(gridData);
	}

	public boolean canFlipToNextPage() {
		// no next page for this path through the wizard
		return false;
	}

	public boolean isPageComplete() {
		if (pkgList.getSelectionCount() > 0) {
			return true;

		}
		else
		{
			if (pkgList.getItemCount()==0)
			{
				return true;
			}
		}
		return false;
	}

	public void handleEvent(Event event) {
		// TODO Auto-generated method stub
		if (event.widget == pkgList) {
			setPageComplete(isPageComplete());
			if (pkgList.getSelectionCount() > 0) {
				int i = pkgList.getSelectionIndex();
				txtDescription.setText(packages.get(i).getDescription());
			}
		}
		
	}

	public void dataChange() {
		setTitle(strDomain + " specialized Method packages selection");
		pkgList.removeAll();
		for (int i = 0; i < packages.size(); i++) {
			pkgList.add(packages.get(i).getName(), i);
		}

	}
}
