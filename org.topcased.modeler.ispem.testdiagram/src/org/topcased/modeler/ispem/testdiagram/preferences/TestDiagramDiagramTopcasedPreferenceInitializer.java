/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.testdiagram.preferences;

import java.util.HashMap;

import org.eclipse.jface.resource.StringConverter;
import org.topcased.modeler.preferences.ITopcasedPreferenceInitializer;

/**
 * Initialize the preferences of TestDiagram diagram
 * 
 * @generated
 */
public class TestDiagramDiagramTopcasedPreferenceInitializer implements
		ITopcasedPreferenceInitializer {

	/** 
	 * @see org.topcased.modeler.preferences.ITopcasedPreferenceInitializer#getDefaultPreference()
	 *	@generated
	 */
	public HashMap<String, String> getDefaultPreference() {
		HashMap<String, String> defaultTestDiagramPreference = new HashMap<String, String>();
		// Initialize the default value of the TASKDEFINITION_DEFAULT_BACKGROUND_COLOR property 
		defaultTestDiagramPreference
				.put(TestDiagramDiagramPreferenceConstants.TASKDEFINITION_DEFAULT_BACKGROUND_COLOR,
						"255,255,255");

		// Initialize the default value of the TASKDEFINITION_DEFAULT_FOREGROUND_COLOR property
		defaultTestDiagramPreference
				.put(TestDiagramDiagramPreferenceConstants.TASKDEFINITION_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the TASKDEFINITION_DEFAULT_FONT property
		defaultTestDiagramPreference
				.put(TestDiagramDiagramPreferenceConstants.TASKDEFINITION_DEFAULT_FONT,
						StringConverter.asFontData("Segoe UI-regular-9")
								.toString());

		// Initialize the default value of the ROLEDEFINITION_DEFAULT_BACKGROUND_COLOR property 
		defaultTestDiagramPreference
				.put(TestDiagramDiagramPreferenceConstants.ROLEDEFINITION_DEFAULT_BACKGROUND_COLOR,
						"255,255,255");

		// Initialize the default value of the ROLEDEFINITION_DEFAULT_FOREGROUND_COLOR property
		defaultTestDiagramPreference
				.put(TestDiagramDiagramPreferenceConstants.ROLEDEFINITION_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the ROLEDEFINITION_DEFAULT_FONT property
		defaultTestDiagramPreference
				.put(TestDiagramDiagramPreferenceConstants.ROLEDEFINITION_DEFAULT_FONT,
						StringConverter.asFontData("Segoe UI-regular-9")
								.toString());

		return defaultTestDiagramPreference;
	}
}
