/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.topcased.modeler.wizards.DiagramsPage;

/**
 * @generated
 */
public class IspemDiagramsPage extends DiagramsPage {
	/**
	 * @param pageName
	 * @param selection
	 * @generated
	 */
	public IspemDiagramsPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection, true);
	}

	/**
	 * @see org.topcased.modeler.wizards.DiagramsPage#getEditorID()
	 * @generated
	 */
	public String getEditorID() {
		return "org.topcased.modeler.ispem.editor.IspemEditor";
	}

	/**
	 * @see org.topcased.modeler.wizards.DiagramsPage#getFileExtension()
	 * @generated
	 */
	public String getFileExtension() {
		return "ispem";
	}

	/**
	 * @see org.topcased.modeler.wizards.DiagramsPage#getAdapterFactory()
	 * @generated
	 */
	public ComposedAdapterFactory getAdapterFactory() {
		List factories = new ArrayList();
		factories
				.add(new org.topcased.ispem.provider.IspemItemProviderAdapterFactory());
		factories
				.add(new org.topcased.spem.provider.SpemItemProviderAdapterFactory());
		factories
				.add(new org.topcased.spem.uma.provider.UmaItemProviderAdapterFactory());
		factories
				.add(new org.topcased.spem.activity.provider.ActivityItemProviderAdapterFactory());
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());

		return new ComposedAdapterFactory(factories);
	}

	/**
	 * @see org.topcased.modeler.wizards.DiagramsPage#getDefaultTemplateId()
	 * @return String
	 * @generated
	 */
	public String getDefaultTemplateId() {
		// TODO return the corresponding ID of the default template
		return "org.topcased.modeler.ispem.templates.Common";

	}
	public String getDefaultTemplateModelId()
    {
        return "org.topcased.modeler.ispem.templates.Common";
    }
}
