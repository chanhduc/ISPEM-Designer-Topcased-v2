/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.methodcontentdefinition.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.edit.policies.ResizableEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.ispem.methodcontentdefinition.MethodContentDefinitionEditPolicyConstants;
import org.topcased.modeler.ispem.methodcontentdefinition.commands.ToolDefinitionRestoreConnectionCommand;
import org.topcased.modeler.ispem.methodcontentdefinition.figures.ToolDefinitionFigure;
import org.topcased.modeler.ispem.methodcontentdefinition.policies.ToolUseEdgeCreationEditPolicy;
import org.topcased.modeler.ispem.methodcontentdefinition.policies.WorkProductManagementEdgeCreationEditPolicy;
import org.topcased.modeler.ispem.methodcontentdefinition.preferences.MethodContentDefinitionDiagramPreferenceConstants;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;

/**
 * The ToolDefinition object controller
 *
 * @generated
 */
public class ToolDefinitionEditPart extends EMFGraphNodeEditPart {
	/**
	 * Constructor
	 *
	 * @param obj the graph node
	 * @generated
	 */
	public ToolDefinitionEditPart(GraphNode obj) {
		super(obj);
	}

	/**
	 * Creates edit policies and associates these with roles
	 *
	 * @generated
	 */
	protected void createEditPolicies() {
		super.createEditPolicies();

		installEditPolicy(
				MethodContentDefinitionEditPolicyConstants.WORKPRODUCTMANAGEMENT_EDITPOLICY,
				new WorkProductManagementEdgeCreationEditPolicy());

		installEditPolicy(
				MethodContentDefinitionEditPolicyConstants.TOOLUSE_EDITPOLICY,
				new ToolUseEdgeCreationEditPolicy());

		installEditPolicy(ModelerEditPolicyConstants.RESTORE_EDITPOLICY,
				new RestoreEditPolicy() {
					protected Command getRestoreConnectionsCommand(
							RestoreConnectionsRequest request) {
						return new ToolDefinitionRestoreConnectionCommand(
								getHost());
					}
				});

		installEditPolicy(ModelerEditPolicyConstants.RESIZABLE_EDITPOLICY,
				new ResizableEditPolicy());

		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new LabelDirectEditPolicy());
	}

	/**
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 * @generated
	 */
	protected IFigure createFigure() {

		return new ToolDefinitionFigure();
	}

	/**
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getPreferenceDefaultBackgroundColor()
	 * @generated
	 */
	protected Color getPreferenceDefaultBackgroundColor() {
		String backgroundColor = getPreferenceStore()
				.getString(
						MethodContentDefinitionDiagramPreferenceConstants.TOOLDEFINITION_DEFAULT_BACKGROUND_COLOR);
		if (backgroundColor.length() != 0) {
			return Utils.getColor(backgroundColor);
		}
		return null;
	}

	/**
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getPreferenceDefaultForegroundColor()
	 * @generated
	 */
	protected Color getPreferenceDefaultForegroundColor() {
		String foregroundColor = getPreferenceStore()
				.getString(
						MethodContentDefinitionDiagramPreferenceConstants.TOOLDEFINITION_DEFAULT_FOREGROUND_COLOR);
		if (foregroundColor.length() != 0) {
			return Utils.getColor(foregroundColor);
		}
		return null;
	}

	/**
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getPreferenceDefaultFont()
	 * @generated
	 */
	protected Font getPreferenceDefaultFont() {
		String preferenceFont = getPreferenceStore()
				.getString(
						MethodContentDefinitionDiagramPreferenceConstants.TOOLDEFINITION_DEFAULT_FONT);
		if (preferenceFont.length() != 0) {
			return Utils.getFont(new FontData(preferenceFont));
		}
		return null;

	}

}