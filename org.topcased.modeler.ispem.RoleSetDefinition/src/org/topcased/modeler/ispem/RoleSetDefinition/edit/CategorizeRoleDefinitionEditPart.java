/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.RoleSetDefinition.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.EdgeObject;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.edit.GraphEdgeEditPart;
import org.topcased.modeler.edit.policies.EdgeObjectOffsetEditPolicy;
import org.topcased.modeler.figures.IEdgeObjectFigure;
import org.topcased.modeler.ispem.RoleSetDefinition.RoleSetDefinitionEdgeObjectConstants;
import org.topcased.modeler.ispem.RoleSetDefinition.figures.CategorizeRoleDefinitionFigure;
import org.topcased.modeler.ispem.RoleSetDefinition.preferences.RoleSetDefinitionDiagramPreferenceConstants;
import org.topcased.modeler.utils.Utils;

/**
 * CategorizeRoleDefinition controller
 *
 * @generated
 */
public class CategorizeRoleDefinitionEditPart extends GraphEdgeEditPart {

	/**
	 * Constructor
	 *
	 * @param model the graph object
	 * @generated
	 */
	public CategorizeRoleDefinitionEditPart(GraphEdge model) {
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
		CategorizeRoleDefinitionFigure connection = new CategorizeRoleDefinitionFigure();

		createSourceDecoration(connection);

		return connection;
	}

	/**
	 * @param connection the PolylineConnection
	 * @generated
	 */
	private void createSourceDecoration(PolylineConnection connection) {

		PolygonDecoration decoration = new PolygonDecoration();
		PointList decorationPointList = new PointList();
		decorationPointList.addPoint(0, 0);
		decorationPointList.addPoint(-1, 1);
		decorationPointList.addPoint(-2, 0);
		decorationPointList.addPoint(-1, -1);
		decoration.setTemplate(decorationPointList);
		decoration.setScale(10, 5);
		connection.setSourceDecoration(decoration);

	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getEdgeObjectFigure(org.topcased.modeler.di.model.EdgeObject)
	 * @generated
	 */
	public IEdgeObjectFigure getEdgeObjectFigure(EdgeObject edgeObject) {
		if (RoleSetDefinitionEdgeObjectConstants.CATEGORIZE_EDGE_OBJECT_ID
				.equals(edgeObject.getId())) {
			return ((CategorizeRoleDefinitionFigure) getFigure())
					.getCategorizeEdgeObjectFigure();
		}
		return null;
	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#refreshEdgeObjects()
	 * @generated
	 */
	protected void refreshEdgeObjects() {
		super.refreshEdgeObjects();
		updateCategorizeLabel();
	}

	/**
	 * Update the categorize Label
	 *
	 * @generated
	 */
	private void updateCategorizeLabel() {
		//TODO set the text to update
		//((Label) ((CategorizeRoleDefinitionFigure) getFigure()).getCategorizeEdgeObjectFigure()).setText(((CategorizeRoleDefinition) getEObject()).getCategorize());
	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getPreferenceDefaultRouter()
	 * 
	 * @generated
	 */
	protected String getPreferenceDefaultRouter() {
		return getPreferenceStore()
				.getString(
						RoleSetDefinitionDiagramPreferenceConstants.CATEGORIZEROLEDEFINITION_EDGE_DEFAULT_ROUTER);
	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getPreferenceDefaultForegroundColor()
	 * 
	 * @generated
	 */
	protected Color getPreferenceDefaultForegroundColor() {
		String preferenceForeground = getPreferenceStore()
				.getString(
						RoleSetDefinitionDiagramPreferenceConstants.CATEGORIZEROLEDEFINITION_EDGE_DEFAULT_FOREGROUND_COLOR);
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
						RoleSetDefinitionDiagramPreferenceConstants.CATEGORIZEROLEDEFINITION_EDGE_DEFAULT_FONT);
		if (preferenceFont.length() != 0) {
			return Utils.getFont(new FontData(preferenceFont));
		}
		return null;
	}
}