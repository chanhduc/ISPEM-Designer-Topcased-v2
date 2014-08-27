/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.activityWF.preferences;

import java.util.HashMap;

import org.eclipse.jface.resource.StringConverter;
import org.topcased.modeler.preferences.ITopcasedPreferenceInitializer;

/**
 * Initialize the preferences of ActivityWF diagram
 * 
 * @generated
 */
public class ActivityWFDiagramTopcasedPreferenceInitializer implements
		ITopcasedPreferenceInitializer {

	/** 
	 * @see org.topcased.modeler.preferences.ITopcasedPreferenceInitializer#getDefaultPreference()
	 *	@generated
	 */
	public HashMap<String, String> getDefaultPreference() {
		HashMap<String, String> defaultActivityWFPreference = new HashMap<String, String>();
		// Initialize the default value of the TASKUSE_DEFAULT_BACKGROUND_COLOR property 
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.TASKUSE_DEFAULT_BACKGROUND_COLOR,
						"255,255,255");

		// Initialize the default value of the TASKUSE_DEFAULT_FOREGROUND_COLOR property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.TASKUSE_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the TASKUSE_DEFAULT_FONT property
		defaultActivityWFPreference.put(
				ActivityWFDiagramPreferenceConstants.TASKUSE_DEFAULT_FONT,
				StringConverter.asFontData("Segoe UI-regular-9").toString());

		// Initialize the default value of the ARTIFACT_DEFAULT_BACKGROUND_COLOR property 
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.ARTIFACT_DEFAULT_BACKGROUND_COLOR,
						"255,255,255");

		// Initialize the default value of the ARTIFACT_DEFAULT_FOREGROUND_COLOR property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.ARTIFACT_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the ARTIFACT_DEFAULT_FONT property
		defaultActivityWFPreference.put(
				ActivityWFDiagramPreferenceConstants.ARTIFACT_DEFAULT_FONT,
				StringConverter.asFontData("Segoe UI-regular-9").toString());

		// Initialize the default value of the ROLEUSE_DEFAULT_BACKGROUND_COLOR property 
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.ROLEUSE_DEFAULT_BACKGROUND_COLOR,
						"255,255,255");

		// Initialize the default value of the ROLEUSE_DEFAULT_FOREGROUND_COLOR property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.ROLEUSE_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the ROLEUSE_DEFAULT_FONT property
		defaultActivityWFPreference.put(
				ActivityWFDiagramPreferenceConstants.ROLEUSE_DEFAULT_FONT,
				StringConverter.asFontData("Segoe UI-regular-9").toString());

		// Initialize the default value of the PROCESSPARAMETEROUT_EDGE_DEFAULT_FONT property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.PROCESSPARAMETEROUT_EDGE_DEFAULT_FONT,
						StringConverter.asFontData("Segoe UI-regular-9")
								.toString());

		// Initialize the default value of the PROCESSPARAMETEROUT_EDGE_DEFAULT_FOREGROUND_COLOR property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.PROCESSPARAMETEROUT_EDGE_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the PROCESSPARAMETEROUT_EDGE_DEFAULT_ROUTER property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.PROCESSPARAMETEROUT_EDGE_DEFAULT_ROUTER,
						"ObliqueRouter");

		// Initialize the default value of the PROCESSPARAMETEROUT_DIRECTION_EDGE_OBJECT_DEFAULT_VISIBILITY property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.PROCESSPARAMETEROUT_DIRECTION_EDGE_OBJECT_DEFAULT_VISIBILITY,
						"true");

		// Initialize the default value of the PROCESSPARAMETERIN_EDGE_DEFAULT_FONT property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.PROCESSPARAMETERIN_EDGE_DEFAULT_FONT,
						StringConverter.asFontData("Segoe UI-regular-9")
								.toString());

		// Initialize the default value of the PROCESSPARAMETERIN_EDGE_DEFAULT_FOREGROUND_COLOR property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.PROCESSPARAMETERIN_EDGE_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the PROCESSPARAMETERIN_EDGE_DEFAULT_ROUTER property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.PROCESSPARAMETERIN_EDGE_DEFAULT_ROUTER,
						"ObliqueRouter");

		// Initialize the default value of the PROCESSPARAMETERINOUT_EDGE_DEFAULT_FONT property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.PROCESSPARAMETERINOUT_EDGE_DEFAULT_FONT,
						StringConverter.asFontData("Segoe UI-regular-9")
								.toString());

		// Initialize the default value of the PROCESSPARAMETERINOUT_EDGE_DEFAULT_FOREGROUND_COLOR property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.PROCESSPARAMETERINOUT_EDGE_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the PROCESSPARAMETERINOUT_EDGE_DEFAULT_ROUTER property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.PROCESSPARAMETERINOUT_EDGE_DEFAULT_ROUTER,
						"ObliqueRouter");

		// Initialize the default value of the PROCESSPERFORMER_EDGE_DEFAULT_FONT property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.PROCESSPERFORMER_EDGE_DEFAULT_FONT,
						StringConverter.asFontData("Segoe UI-regular-9")
								.toString());

		// Initialize the default value of the PROCESSPERFORMER_EDGE_DEFAULT_FOREGROUND_COLOR property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.PROCESSPERFORMER_EDGE_DEFAULT_FOREGROUND_COLOR,
						"255,128,0");

		// Initialize the default value of the PROCESSPERFORMER_EDGE_DEFAULT_ROUTER property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.PROCESSPERFORMER_EDGE_DEFAULT_ROUTER,
						"ObliqueRouter");

		// Initialize the default value of the STARTNODE_DEFAULT_BACKGROUND_COLOR property 
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.STARTNODE_DEFAULT_BACKGROUND_COLOR,
						"255,255,255");

		// Initialize the default value of the STARTNODE_DEFAULT_FOREGROUND_COLOR property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.STARTNODE_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the STARTNODE_DEFAULT_FONT property
		defaultActivityWFPreference.put(
				ActivityWFDiagramPreferenceConstants.STARTNODE_DEFAULT_FONT,
				StringConverter.asFontData("Segoe UI-regular-9").toString());

		// Initialize the default value of the ENDNODE_DEFAULT_BACKGROUND_COLOR property 
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.ENDNODE_DEFAULT_BACKGROUND_COLOR,
						"255,255,255");

		// Initialize the default value of the ENDNODE_DEFAULT_FOREGROUND_COLOR property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.ENDNODE_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the ENDNODE_DEFAULT_FONT property
		defaultActivityWFPreference.put(
				ActivityWFDiagramPreferenceConstants.ENDNODE_DEFAULT_FONT,
				StringConverter.asFontData("Segoe UI-regular-9").toString());

		// Initialize the default value of the FORKNODE_DEFAULT_BACKGROUND_COLOR property 
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.FORKNODE_DEFAULT_BACKGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the FORKNODE_DEFAULT_FOREGROUND_COLOR property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.FORKNODE_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the FORKNODE_DEFAULT_FONT property
		defaultActivityWFPreference.put(
				ActivityWFDiagramPreferenceConstants.FORKNODE_DEFAULT_FONT,
				StringConverter.asFontData("Segoe UI-regular-9").toString());

		// Initialize the default value of the JOINNODE_DEFAULT_BACKGROUND_COLOR property 
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.JOINNODE_DEFAULT_BACKGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the JOINNODE_DEFAULT_FOREGROUND_COLOR property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.JOINNODE_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the JOINNODE_DEFAULT_FONT property
		defaultActivityWFPreference.put(
				ActivityWFDiagramPreferenceConstants.JOINNODE_DEFAULT_FONT,
				StringConverter.asFontData("Segoe UI-regular-9").toString());

		// Initialize the default value of the DECISIONNODE_DEFAULT_BACKGROUND_COLOR property 
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.DECISIONNODE_DEFAULT_BACKGROUND_COLOR,
						"255,255,255");

		// Initialize the default value of the DECISIONNODE_DEFAULT_FOREGROUND_COLOR property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.DECISIONNODE_DEFAULT_FOREGROUND_COLOR,
						"0,0,0");

		// Initialize the default value of the DECISIONNODE_DEFAULT_FONT property
		defaultActivityWFPreference.put(
				ActivityWFDiagramPreferenceConstants.DECISIONNODE_DEFAULT_FONT,
				StringConverter.asFontData("Segoe UI-regular-9").toString());

		// Initialize the default value of the EDGE_EDGE_DEFAULT_FONT property
		defaultActivityWFPreference.put(
				ActivityWFDiagramPreferenceConstants.EDGE_EDGE_DEFAULT_FONT,
				StringConverter.asFontData("Segoe UI-regular-9").toString());

		// Initialize the default value of the EDGE_EDGE_DEFAULT_FOREGROUND_COLOR property
		defaultActivityWFPreference
				.put(ActivityWFDiagramPreferenceConstants.EDGE_EDGE_DEFAULT_FOREGROUND_COLOR,
						"0,0,255");

		// Initialize the default value of the EDGE_EDGE_DEFAULT_ROUTER property
		defaultActivityWFPreference.put(
				ActivityWFDiagramPreferenceConstants.EDGE_EDGE_DEFAULT_ROUTER,
				"ObliqueRouter");

		return defaultActivityWFPreference;
	}
}
