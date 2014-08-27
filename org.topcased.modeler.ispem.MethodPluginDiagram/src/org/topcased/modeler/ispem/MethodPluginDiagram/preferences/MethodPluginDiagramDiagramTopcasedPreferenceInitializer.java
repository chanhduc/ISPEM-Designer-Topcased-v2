/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.MethodPluginDiagram.preferences;

import java.util.HashMap;

import org.eclipse.jface.resource.StringConverter;
import org.topcased.modeler.preferences.ITopcasedPreferenceInitializer;

/**
 * Initialize the preferences of MethodPluginDiagram diagram
 * 
 * @generated
 */
public class MethodPluginDiagramDiagramTopcasedPreferenceInitializer implements
		ITopcasedPreferenceInitializer {

	/** 
	 * @see org.topcased.modeler.preferences.ITopcasedPreferenceInitializer#getDefaultPreference()
	 *	@generated
	 */
	public HashMap<String, String> getDefaultPreference() {
		HashMap<String, String> defaultMethodPluginDiagramPreference = new HashMap<String, String>();
		// Initialize the default value of the METHODCONTENTPACKAGE_DEFAULT_BACKGROUND_COLOR property 
		defaultMethodPluginDiagramPreference
				.put(MethodPluginDiagramDiagramPreferenceConstants.METHODCONTENTPACKAGE_DEFAULT_BACKGROUND_COLOR,
						"255,178,102");

		// Initialize the default value of the METHODCONTENTPACKAGE_DEFAULT_FOREGROUND_COLOR property
		defaultMethodPluginDiagramPreference
				.put(MethodPluginDiagramDiagramPreferenceConstants.METHODCONTENTPACKAGE_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the METHODCONTENTPACKAGE_DEFAULT_FONT property
		defaultMethodPluginDiagramPreference
				.put(MethodPluginDiagramDiagramPreferenceConstants.METHODCONTENTPACKAGE_DEFAULT_FONT,
						StringConverter.asFontData("Segoe UI-regular-9")
								.toString());

		// Initialize the default value of the PROCESSPACKAGE_DEFAULT_BACKGROUND_COLOR property 
		defaultMethodPluginDiagramPreference
				.put(MethodPluginDiagramDiagramPreferenceConstants.PROCESSPACKAGE_DEFAULT_BACKGROUND_COLOR,
						"102,178,255");

		// Initialize the default value of the PROCESSPACKAGE_DEFAULT_FOREGROUND_COLOR property
		defaultMethodPluginDiagramPreference
				.put(MethodPluginDiagramDiagramPreferenceConstants.PROCESSPACKAGE_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the PROCESSPACKAGE_DEFAULT_FONT property
		defaultMethodPluginDiagramPreference
				.put(MethodPluginDiagramDiagramPreferenceConstants.PROCESSPACKAGE_DEFAULT_FONT,
						StringConverter.asFontData("Segoe UI-regular-9")
								.toString());

		// Initialize the default value of the METHODPLUGIN_DEFAULT_BACKGROUND_COLOR property 
		defaultMethodPluginDiagramPreference
				.put(MethodPluginDiagramDiagramPreferenceConstants.METHODPLUGIN_DEFAULT_BACKGROUND_COLOR,
						"255,255,255");

		// Initialize the default value of the METHODPLUGIN_DEFAULT_FOREGROUND_COLOR property
		defaultMethodPluginDiagramPreference
				.put(MethodPluginDiagramDiagramPreferenceConstants.METHODPLUGIN_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the METHODPLUGIN_DEFAULT_FONT property
		defaultMethodPluginDiagramPreference
				.put(MethodPluginDiagramDiagramPreferenceConstants.METHODPLUGIN_DEFAULT_FONT,
						StringConverter.asFontData("Segoe UI-regular-9")
								.toString());

		return defaultMethodPluginDiagramPreference;
	}
}
