/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.ProcessWFDiagram.edit;

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
import org.topcased.modeler.ispem.ProcessWFDiagram.ProcessWFDiagramEditPolicyConstants;
import org.topcased.modeler.ispem.ProcessWFDiagram.commands.ArtifactRestoreConnectionCommand;
import org.topcased.modeler.ispem.ProcessWFDiagram.figures.ArtifactFigure;
import org.topcased.modeler.ispem.ProcessWFDiagram.policies.ProcessParameterInEdgeCreationEditPolicy;
import org.topcased.modeler.ispem.ProcessWFDiagram.policies.ProcessParameterInOutEdgeCreationEditPolicy;
import org.topcased.modeler.ispem.ProcessWFDiagram.policies.ProcessParameterOutEdgeCreationEditPolicy;
import org.topcased.modeler.ispem.ProcessWFDiagram.preferences.ProcessWFDiagramDiagramPreferenceConstants;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;

/**
 * The Artifact object controller
 *
 * @generated
 */
public class ArtifactEditPart extends EMFGraphNodeEditPart {
	/**
	 * Constructor
	 *
	 * @param obj the graph node
	 * @generated
	 */
	public ArtifactEditPart(GraphNode obj) {
		super(obj);
	}

	/**
	 * Creates edit policies and associates these with roles
	 *
	 * @personalised
	 */
	protected void createEditPolicies() {
		super.createEditPolicies();

		installEditPolicy(
				ProcessWFDiagramEditPolicyConstants.PROCESSPARAMETERIN_EDITPOLICY,
				new ProcessParameterInEdgeCreationEditPolicy());
		installEditPolicy(
				ProcessWFDiagramEditPolicyConstants.PROCESSPARAMETEROUT_EDITPOLICY,
				new ProcessParameterOutEdgeCreationEditPolicy());
		installEditPolicy(
				ProcessWFDiagramEditPolicyConstants.PROCESSPARAMETERINOUT_EDITPOLICY,
				new ProcessParameterInOutEdgeCreationEditPolicy());
		installEditPolicy(ModelerEditPolicyConstants.RESTORE_EDITPOLICY,
				new RestoreEditPolicy() {
					protected Command getRestoreConnectionsCommand(
							RestoreConnectionsRequest request) {
						return new ArtifactRestoreConnectionCommand(getHost());
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

		return new ArtifactFigure();
	}

	/**
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getPreferenceDefaultBackgroundColor()
	 * @generated
	 */
	protected Color getPreferenceDefaultBackgroundColor() {
		String backgroundColor = getPreferenceStore()
				.getString(
						ProcessWFDiagramDiagramPreferenceConstants.ARTIFACT_DEFAULT_BACKGROUND_COLOR);
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
						ProcessWFDiagramDiagramPreferenceConstants.ARTIFACT_DEFAULT_FOREGROUND_COLOR);
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
						ProcessWFDiagramDiagramPreferenceConstants.ARTIFACT_DEFAULT_FONT);
		if (preferenceFont.length() != 0) {
			return Utils.getFont(new FontData(preferenceFont));
		}
		return null;

	}

}