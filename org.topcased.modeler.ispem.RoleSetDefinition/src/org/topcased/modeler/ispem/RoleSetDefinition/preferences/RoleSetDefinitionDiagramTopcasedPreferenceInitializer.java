/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.RoleSetDefinition.preferences;

import java.util.HashMap;

import org.eclipse.jface.resource.StringConverter;
import org.topcased.modeler.preferences.ITopcasedPreferenceInitializer;

/**
 * Initialize the preferences of RoleSetDefinition diagram
 * 
 * @generated
 */
public class RoleSetDefinitionDiagramTopcasedPreferenceInitializer implements
		ITopcasedPreferenceInitializer {

	/** 
	 * @see org.topcased.modeler.preferences.ITopcasedPreferenceInitializer#getDefaultPreference()
	 *	@generated
	 */
	public HashMap<String, String> getDefaultPreference() {
		HashMap<String, String> defaultRoleSetDefinitionPreference = new HashMap<String, String>();
		// Initialize the default value of the ROLESET_DEFAULT_BACKGROUND_COLOR property 
		defaultRoleSetDefinitionPreference
				.put(RoleSetDefinitionDiagramPreferenceConstants.ROLESET_DEFAULT_BACKGROUND_COLOR,
						"255,255,255");

		// Initialize the default value of the ROLESET_DEFAULT_FOREGROUND_COLOR property
		defaultRoleSetDefinitionPreference
				.put(RoleSetDefinitionDiagramPreferenceConstants.ROLESET_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the ROLESET_DEFAULT_FONT property
		defaultRoleSetDefinitionPreference
				.put(RoleSetDefinitionDiagramPreferenceConstants.ROLESET_DEFAULT_FONT,
						StringConverter.asFontData("Segoe UI-regular-9")
								.toString());

		// Initialize the default value of the ROLEDEFINITION_DEFAULT_BACKGROUND_COLOR property 
		defaultRoleSetDefinitionPreference
				.put(RoleSetDefinitionDiagramPreferenceConstants.ROLEDEFINITION_DEFAULT_BACKGROUND_COLOR,
						"255,255,255");

		// Initialize the default value of the ROLEDEFINITION_DEFAULT_FOREGROUND_COLOR property
		defaultRoleSetDefinitionPreference
				.put(RoleSetDefinitionDiagramPreferenceConstants.ROLEDEFINITION_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the ROLEDEFINITION_DEFAULT_FONT property
		defaultRoleSetDefinitionPreference
				.put(RoleSetDefinitionDiagramPreferenceConstants.ROLEDEFINITION_DEFAULT_FONT,
						StringConverter.asFontData("Segoe UI-regular-9")
								.toString());

		// Initialize the default value of the CATEGORIZEROLEDEFINITION_EDGE_DEFAULT_FONT property
		defaultRoleSetDefinitionPreference
				.put(RoleSetDefinitionDiagramPreferenceConstants.CATEGORIZEROLEDEFINITION_EDGE_DEFAULT_FONT,
						StringConverter.asFontData("Segoe UI-regular-9")
								.toString());

		// Initialize the default value of the CATEGORIZEROLEDEFINITION_EDGE_DEFAULT_FOREGROUND_COLOR property
		defaultRoleSetDefinitionPreference
				.put(RoleSetDefinitionDiagramPreferenceConstants.CATEGORIZEROLEDEFINITION_EDGE_DEFAULT_FOREGROUND_COLOR,
						"255,128,64");

		// Initialize the default value of the CATEGORIZEROLEDEFINITION_EDGE_DEFAULT_ROUTER property
		defaultRoleSetDefinitionPreference
				.put(RoleSetDefinitionDiagramPreferenceConstants.CATEGORIZEROLEDEFINITION_EDGE_DEFAULT_ROUTER,
						"ObliqueRouter");

		// Initialize the default value of the CATEGORIZEROLEDEFINITION_CATEGORIZE_EDGE_OBJECT_DEFAULT_VISIBILITY property
		defaultRoleSetDefinitionPreference
				.put(RoleSetDefinitionDiagramPreferenceConstants.CATEGORIZEROLEDEFINITION_CATEGORIZE_EDGE_OBJECT_DEFAULT_VISIBILITY,
						"true");

		return defaultRoleSetDefinitionPreference;
	}
}
