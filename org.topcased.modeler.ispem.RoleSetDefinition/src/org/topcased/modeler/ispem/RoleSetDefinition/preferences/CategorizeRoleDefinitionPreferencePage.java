/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.RoleSetDefinition.preferences;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.preference.IPreferenceStore;
import org.topcased.modeler.ispem.IspemPlugin;
import org.topcased.modeler.ispem.RoleSetDefinition.RoleSetDefinitionEdgeObjectConstants;
import org.topcased.modeler.preferences.AbstractEdgePreferencePage;

/**
 * This class represents a preference page that is contributed to the Preferences dialog. This page is used to modify
 * preferences only. They are stored in the preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 *
 * @generated
 */
public class CategorizeRoleDefinitionPreferencePage extends
		AbstractEdgePreferencePage {
	/**
	 * @see org.topcased.modeler.preferences.AbstractEdgePreferencePage#getEdgeFont()
	 * @generated
	 */
	protected String getEdgeFont() {
		return RoleSetDefinitionDiagramPreferenceConstants.CATEGORIZEROLEDEFINITION_EDGE_DEFAULT_FONT;
	}

	/**
	 * @see org.topcased.modeler.preferences.AbstractEdgePreferencePage#getEdgeForegroundColor()
	 * @generated
	 */
	protected String getEdgeForegroundColor() {
		return RoleSetDefinitionDiagramPreferenceConstants.CATEGORIZEROLEDEFINITION_EDGE_DEFAULT_FOREGROUND_COLOR;
	}

	/**
	 * @see org.topcased.modeler.preferences.AbstractEdgePreferencePage#getEdgeRouter()
	 * @generated
	 */
	protected String getEdgeRouter() {
		return RoleSetDefinitionDiagramPreferenceConstants.CATEGORIZEROLEDEFINITION_EDGE_DEFAULT_ROUTER;
	}

	/**
	 * @see org.topcased.modeler.preferences.AbstractEdgePreferencePage#getHiddenElements()
	 * @generated
	 */
	protected List<String> getHiddenElements() {
		List<String> choiceOfValues = new ArrayList<String>();
		IPreferenceStore ps = getPreferenceStore();
		if (!ps.getBoolean(RoleSetDefinitionDiagramPreferenceConstants.CATEGORIZEROLEDEFINITION_CATEGORIZE_EDGE_OBJECT_DEFAULT_VISIBILITY)) {
			choiceOfValues
					.add(RoleSetDefinitionEdgeObjectConstants.CATEGORIZE_EDGE_OBJECT_ID);
		}
		return choiceOfValues;
	}

	/**
	 * @see org.topcased.modeler.preferences.AbstractEdgePreferencePage#getDefaultHiddenElements()
	 * @generated
	 */
	protected List<String> getDefaultHiddenElements() {
		List<String> choiceOfValues = new ArrayList<String>();
		IPreferenceStore ps = getPreferenceStore();
		if (!ps.getDefaultBoolean(RoleSetDefinitionDiagramPreferenceConstants.CATEGORIZEROLEDEFINITION_CATEGORIZE_EDGE_OBJECT_DEFAULT_VISIBILITY)) {
			choiceOfValues
					.add(RoleSetDefinitionEdgeObjectConstants.CATEGORIZE_EDGE_OBJECT_ID);
		}
		return choiceOfValues;
	}

	/**
	 * @see org.topcased.modeler.preferences.AbstractEdgePreferencePage#getVisibleElements()
	 * @generated
	 */
	protected List<String> getVisibleElements() {
		List<String> choiceOfValues = new ArrayList<String>();
		IPreferenceStore ps = getPreferenceStore();
		if (ps.getBoolean(RoleSetDefinitionDiagramPreferenceConstants.CATEGORIZEROLEDEFINITION_CATEGORIZE_EDGE_OBJECT_DEFAULT_VISIBILITY)) {
			choiceOfValues
					.add(RoleSetDefinitionEdgeObjectConstants.CATEGORIZE_EDGE_OBJECT_ID);
		}
		return choiceOfValues;
	}

	/**
	 * @see org.topcased.modeler.preferences.AbstractEdgePreferencePage#getDefaultVisibleElements()
	 * @generated
	 */
	protected List<String> getDefaultVisibleElements() {
		List<String> choiceOfValues = new ArrayList<String>();
		IPreferenceStore ps = getPreferenceStore();
		if (ps.getDefaultBoolean(RoleSetDefinitionDiagramPreferenceConstants.CATEGORIZEROLEDEFINITION_CATEGORIZE_EDGE_OBJECT_DEFAULT_VISIBILITY)) {
			choiceOfValues
					.add(RoleSetDefinitionEdgeObjectConstants.CATEGORIZE_EDGE_OBJECT_ID);
		}
		return choiceOfValues;
	}

	/**
	 * @see org.topcased.modeler.preferences.AbstractEdgePreferencePage#storeEdgeObjectVisibility(java.util.List)
	 * @generated
	 */
	protected void storeEdgeObjectVisibility(List<String> visibleElement) {
		IPreferenceStore ps = getPreferenceStore();
		if (visibleElement
				.contains(RoleSetDefinitionEdgeObjectConstants.CATEGORIZE_EDGE_OBJECT_ID)) {
			ps.setValue(
					RoleSetDefinitionDiagramPreferenceConstants.CATEGORIZEROLEDEFINITION_CATEGORIZE_EDGE_OBJECT_DEFAULT_VISIBILITY,
					true);
		} else {
			ps.setValue(
					RoleSetDefinitionDiagramPreferenceConstants.CATEGORIZEROLEDEFINITION_CATEGORIZE_EDGE_OBJECT_DEFAULT_VISIBILITY,
					false);
		}
	}

	/**
	 * @see org.topcased.facilities.preferences.AbstractTopcasedPreferencePage#getBundleId()
	 * @generated
	 */
	protected String getBundleId() {
		return IspemPlugin.getId();
	}

}
