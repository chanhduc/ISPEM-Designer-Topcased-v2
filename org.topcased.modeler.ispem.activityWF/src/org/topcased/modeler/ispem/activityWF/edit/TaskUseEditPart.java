/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.activityWF.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.edit.policies.ResizableEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.ispem.activityWF.ActivityWFEditPolicyConstants;
import org.topcased.modeler.ispem.activityWF.commands.TaskUseRestoreConnectionCommand;
import org.topcased.modeler.ispem.activityWF.figures.TaskUseFigure;
import org.topcased.modeler.ispem.activityWF.policies.ProcessParameterInEdgeCreationEditPolicy;
import org.topcased.modeler.ispem.activityWF.policies.ProcessParameterInOutEdgeCreationEditPolicy;
import org.topcased.modeler.ispem.activityWF.policies.ProcessParameterOutEdgeCreationEditPolicy;
import org.topcased.modeler.ispem.activityWF.policies.ProcessPerformerEdgeCreationEditPolicy;
import org.topcased.modeler.ispem.activityWF.preferences.ActivityWFDiagramPreferenceConstants;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;

/**
 * The TaskUse object controller
 *
 * @generated
 */
public class TaskUseEditPart extends BreakdownElementEditPart {
	/**
	 * Constructor
	 *
	 * @param obj the graph node
	 * @generated
	 */
	public TaskUseEditPart(GraphNode obj) {
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
				ActivityWFEditPolicyConstants.PROCESSPARAMETERIN_EDITPOLICY,
				new ProcessParameterInEdgeCreationEditPolicy());

		installEditPolicy(
				ActivityWFEditPolicyConstants.PROCESSPARAMETEROUT_EDITPOLICY,
				new ProcessParameterOutEdgeCreationEditPolicy());
		
		installEditPolicy(
				ActivityWFEditPolicyConstants.PROCESSPARAMETERINOUT_EDITPOLICY,
				new ProcessParameterInOutEdgeCreationEditPolicy());
		
		installEditPolicy(
				ActivityWFEditPolicyConstants.PROCESSPERFORMER_EDITPOLICY,
				new ProcessPerformerEdgeCreationEditPolicy());

		installEditPolicy(ModelerEditPolicyConstants.RESTORE_EDITPOLICY,
				new RestoreEditPolicy() {
					protected Command getRestoreConnectionsCommand(
							RestoreConnectionsRequest request) {
						return new TaskUseRestoreConnectionCommand(getHost());
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

		return new TaskUseFigure();
	}

	/**
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getPreferenceDefaultBackgroundColor()
	 * @generated
	 */
	protected Color getPreferenceDefaultBackgroundColor() {
		String backgroundColor = getPreferenceStore()
				.getString(
						ActivityWFDiagramPreferenceConstants.TASKUSE_DEFAULT_BACKGROUND_COLOR);
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
						ActivityWFDiagramPreferenceConstants.TASKUSE_DEFAULT_FOREGROUND_COLOR);
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
		String preferenceFont = getPreferenceStore().getString(
				ActivityWFDiagramPreferenceConstants.TASKUSE_DEFAULT_FONT);
		if (preferenceFont.length() != 0) {
			return Utils.getFont(new FontData(preferenceFont));
		}
		return null;

	}

}