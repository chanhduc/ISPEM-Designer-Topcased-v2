/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.preferences;

import org.eclipse.core.runtime.Preferences;
import org.topcased.modeler.ispem.IspemPlugin;
import org.topcased.modeler.ispem.editor.IspemEditor;
import org.topcased.modeler.preferences.AbstractTopcasedPreferenceInitializer;

/**
 * Initialize preferences to all Ispem diagrams.
 * @generated
 */
public class AllDiagramPreferenceInitializer extends
		AbstractTopcasedPreferenceInitializer {

	/**
	 * @see org.topcased.modeler.preferences.AbstractTopcasedPreferenceInitializer#getPreferences()
	 * @generated
	 */
	@Override
	protected Preferences getPreferences() {
		return IspemPlugin.getDefault().getPluginPreferences();
	}

	/**
	 * @see org.topcased.modeler.preferences.AbstractTopcasedPreferenceInitializer#getEditorId()
	 * @generated
	 */
	protected String getEditorId() {
		return IspemEditor.EDITOR_ID;
	}
}