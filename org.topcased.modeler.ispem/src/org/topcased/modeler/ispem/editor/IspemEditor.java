/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

import org.topcased.modeler.commands.GEFtoEMFCommandStackWrapper;
import org.topcased.modeler.documentation.EAnnotationDocPage;
import org.topcased.modeler.documentation.IDocPage;
import org.topcased.modeler.editor.Modeler;
import org.topcased.modeler.ispem.IspemPlugin;

/**
 * Generated Model editor
 *
 * @generated
 * @implement ITabbedPropertySheetPageContributor
 */
public class IspemEditor extends Modeler{

	public static final String EDITOR_ID = "org.topcased.modeler.ispem.editor.IspemEditor";
	

	/**
	 * @see org.topcased.modeler.editor.Modeler#getAdapterFactories()
	 * @generated
	 */
	protected List getAdapterFactories() {
		List factories = new ArrayList();
		factories
				.add(new org.topcased.ispem.provider.IspemItemProviderAdapterFactory());
		factories
				.add(new org.topcased.modeler.ispem.providers.IspemModelerProviderAdapterFactory());
		factories
				.add(new org.topcased.spem.provider.SpemItemProviderAdapterFactory());
		factories
				.add(new org.topcased.modeler.ispem.providers.SpemModelerProviderAdapterFactory());
		factories
				.add(new org.topcased.spem.uma.provider.UmaItemProviderAdapterFactory());
		factories
				.add(new org.topcased.modeler.ispem.providers.UmaModelerProviderAdapterFactory());
		factories
				.add(new org.topcased.spem.activity.provider.ActivityItemProviderAdapterFactory());
		factories
				.add(new org.topcased.modeler.ispem.providers.ActivityModelerProviderAdapterFactory());

		factories.addAll(super.getAdapterFactories());

		return factories;
	}

	/**
	 * @see org.topcased.modeler.editor.Modeler#getId()
	 * @generated
	 */
	public String getId() {
		return EDITOR_ID;
	}

	/**
	 * @see org.topcased.modeler.editor.Modeler#getAdapter(java.lang.Class)
	 * @generated
	 */
	public Object getAdapter(Class type) {
		if (type == IDocPage.class) {
			GEFtoEMFCommandStackWrapper stack = new GEFtoEMFCommandStackWrapper(
					getCommandStack());
			return new EAnnotationDocPage(stack);
		}
		return super.getAdapter(type);
	}

	/**
	 * @see org.topcased.modeler.editor.Modeler#getPreferenceStore()
	 *
	 * @generated
	 */
	public IPreferenceStore getPreferenceStore() {
		if (getEditorInput() instanceof IFileEditorInput) {
			IProject project = (((IFileEditorInput) getEditorInput()).getFile())
					.getProject();

			Preferences root = Platform.getPreferencesService().getRootNode();
			try {
				if (root.node(ProjectScope.SCOPE).node(project.getName())
						.nodeExists(IspemPlugin.getId())) {
					return new ScopedPreferenceStore(new ProjectScope(project),
							IspemPlugin.getId());
				}
			} catch (BackingStoreException e) {
				e.printStackTrace();
			}
		}
		return IspemPlugin.getDefault().getPreferenceStore();
	}
	

	
	
}
