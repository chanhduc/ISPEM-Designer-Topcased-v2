/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.activityWF.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.topcased.draw2d.figures.Label;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.EdgeObject;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.edit.EMFGraphEdgeEditPart;
import org.topcased.modeler.figures.IEdgeObjectFigure;
import org.topcased.modeler.ispem.activityWF.ActivityWFEdgeObjectConstants;
import org.topcased.modeler.ispem.activityWF.figures.ProcessParameterOutFigure;
import org.topcased.modeler.ispem.activityWF.policies.ProcessParameterOutEdgeObjectUVEditPolicy;
import org.topcased.modeler.ispem.activityWF.preferences.ActivityWFDiagramPreferenceConstants;
import org.topcased.modeler.utils.Utils;
import org.topcased.spem.ProcessParameter;

/**
 * ProcessParameterOut controller
 *
 * @generated
 */
public class ProcessParameterOutEditPart extends EMFGraphEdgeEditPart {

	/**
	 * Constructor
	 *
	 * @param model the graph object
	 * @generated
	 */
	public ProcessParameterOutEditPart(GraphEdge model) {
		super(model);
	}

	/**
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 * @generated
	 */
	protected void createEditPolicies() {
		super.createEditPolicies();

		installEditPolicy(
				ModelerEditPolicyConstants.EDGE_OBJECTS_UV_EDITPOLICY,
				new ProcessParameterOutEdgeObjectUVEditPolicy());

	}

	/**
	 * @return the Figure
	 * @generated
	 */
	protected IFigure createFigure() {
		ProcessParameterOutFigure connection = new ProcessParameterOutFigure();

		createTargetDecoration(connection);

		return connection;
	}

	/**
	 * @param connection the PolylineConnection
	 * @generated
	 */
	private void createTargetDecoration(PolylineConnection connection) {

		PolylineDecoration decoration = new PolylineDecoration();
		decoration.setScale(10, 5);
		connection.setTargetDecoration(decoration);

	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getEdgeObjectFigure(org.topcased.modeler.di.model.EdgeObject)
	 * @generated
	 */
	public IEdgeObjectFigure getEdgeObjectFigure(EdgeObject edgeObject) {
		if (ActivityWFEdgeObjectConstants.DIRECTION_EDGE_OBJECT_ID
				.equals(edgeObject.getId())) {
			return ((ProcessParameterOutFigure) getFigure())
					.getDirectionEdgeObjectFigure();
		}
		return null;
	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#refreshEdgeObjects()
	 * @generated
	 */
	protected void refreshEdgeObjects() {
		super.refreshEdgeObjects();
		updateDirectionLabel();
	}

	/**
	 * Update the direction Label
	 *
	 * @personalised
	 */
	private void updateDirectionLabel() {
		((Label) ((ProcessParameterOutFigure) getFigure())
				.getDirectionEdgeObjectFigure())
				.setText(((ProcessParameter) getEObject()).getDirection().getName());
	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getPreferenceDefaultRouter()
	 * 
	 * @generated
	 */
	protected String getPreferenceDefaultRouter() {
		return getPreferenceStore()
				.getString(
						ActivityWFDiagramPreferenceConstants.PROCESSPARAMETEROUT_EDGE_DEFAULT_ROUTER);
	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getPreferenceDefaultForegroundColor()
	 * 
	 * @generated
	 */
	protected Color getPreferenceDefaultForegroundColor() {
		String preferenceForeground = getPreferenceStore()
				.getString(
						ActivityWFDiagramPreferenceConstants.PROCESSPARAMETEROUT_EDGE_DEFAULT_FOREGROUND_COLOR);
		if (preferenceForeground.length() != 0) {
			return Utils.getColor(preferenceForeground);
		}
		return null;

	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getPreferenceDefaultFont()
	 * 
	 * @generated
	 */
	protected Font getPreferenceDefaultFont() {
		String preferenceFont = getPreferenceStore()
				.getString(
						ActivityWFDiagramPreferenceConstants.PROCESSPARAMETEROUT_EDGE_DEFAULT_FONT);
		if (preferenceFont.length() != 0) {
			return Utils.getFont(new FontData(preferenceFont));
		}
		return null;
	}
}