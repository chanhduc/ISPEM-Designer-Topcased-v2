/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.ProcessWFDiagram.edit;

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
import org.topcased.modeler.edit.policies.EdgeObjectOffsetEditPolicy;
import org.topcased.modeler.figures.IEdgeObjectFigure;
import org.topcased.modeler.ispem.ProcessWFDiagram.ProcessWFDiagramEdgeObjectConstants;
import org.topcased.modeler.ispem.ProcessWFDiagram.figures.WorkSequenceFigure;
import org.topcased.modeler.ispem.ProcessWFDiagram.preferences.ProcessWFDiagramDiagramPreferenceConstants;
import org.topcased.modeler.utils.Utils;
import org.topcased.spem.WorkSequence;

/**
 * WorkSequence controller
 *
 * @generated
 */
public class WorkSequenceEditPart extends EMFGraphEdgeEditPart {

	/**
	 * Constructor
	 *
	 * @param model the graph object
	 * @generated
	 */
	public WorkSequenceEditPart(GraphEdge model) {
		super(model);
	}

	/**
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 * @generated
	 */
	protected void createEditPolicies() {
		super.createEditPolicies();

		installEditPolicy(
				ModelerEditPolicyConstants.EDGE_OBJECTS_OFFSET_EDITPOLICY,
				new EdgeObjectOffsetEditPolicy());

	}

	/**
	 * @return the Figure
	 * @generated
	 */
	protected IFigure createFigure() {
		WorkSequenceFigure connection = new WorkSequenceFigure();

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
		if (ProcessWFDiagramEdgeObjectConstants.LINKKIND_EDGE_OBJECT_ID
				.equals(edgeObject.getId())) {
			return ((WorkSequenceFigure) getFigure())
					.getLinkKindEdgeObjectFigure();
		}
		return null;
	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#refreshEdgeObjects()
	 * @generated
	 */
	protected void refreshEdgeObjects() {
		super.refreshEdgeObjects();
		updateLinkKindLabel();
	}

	/**
	 * Update the linkKind Label
	 *
	 * @personalised
	 */
	private void updateLinkKindLabel() {
		((Label) ((WorkSequenceFigure) getFigure())
				.getLinkKindEdgeObjectFigure())
				.setText(((WorkSequence) getEObject()).getLinkKind().toString());
	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getPreferenceDefaultRouter()
	 * 
	 * @generated
	 */
	protected String getPreferenceDefaultRouter() {
		return getPreferenceStore()
				.getString(
						ProcessWFDiagramDiagramPreferenceConstants.WORKSEQUENCE_EDGE_DEFAULT_ROUTER);
	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getPreferenceDefaultForegroundColor()
	 * 
	 * @generated
	 */
	protected Color getPreferenceDefaultForegroundColor() {
		String preferenceForeground = getPreferenceStore()
				.getString(
						ProcessWFDiagramDiagramPreferenceConstants.WORKSEQUENCE_EDGE_DEFAULT_FOREGROUND_COLOR);
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
						ProcessWFDiagramDiagramPreferenceConstants.WORKSEQUENCE_EDGE_DEFAULT_FONT);
		if (preferenceFont.length() != 0) {
			return Utils.getFont(new FontData(preferenceFont));
		}
		return null;
	}
}