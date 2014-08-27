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
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.edit.EMFGraphEdgeEditPart;
import org.topcased.modeler.ispem.activityWF.figures.ProcessParameterInFigure;
import org.topcased.modeler.ispem.activityWF.preferences.ActivityWFDiagramPreferenceConstants;
import org.topcased.modeler.utils.Utils;

/**
 * ProcessParameterIn controller
 *
 * @generated
 */
public class ProcessParameterInEditPart extends EMFGraphEdgeEditPart {

	/**
	 * Constructor
	 *
	 * @param model the graph object
	 * @generated
	 */
	public ProcessParameterInEditPart(GraphEdge model) {
		super(model);
	}

	/**
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 * @generated
	 */
	protected void createEditPolicies() {
		super.createEditPolicies();

		installEditPolicy(ModelerEditPolicyConstants.CHANGE_FONT_EDITPOLICY,
				null);

	}

	/**
	 * @return the Figure
	 * @generated
	 */
	protected IFigure createFigure() {
		ProcessParameterInFigure connection = new ProcessParameterInFigure();

		createSourceDecoration(connection);

		return connection;
	}

	/**
	 * @param connection the PolylineConnection
	 * @generated
	 */
	private void createSourceDecoration(PolylineConnection connection) {

		PolylineDecoration decoration = new PolylineDecoration();
		decoration.setScale(10, 5);
		connection.setSourceDecoration(decoration);

	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getPreferenceDefaultRouter()
	 * 
	 * @generated
	 */
	protected String getPreferenceDefaultRouter() {
		return getPreferenceStore()
				.getString(
						ActivityWFDiagramPreferenceConstants.PROCESSPARAMETERIN_EDGE_DEFAULT_ROUTER);
	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getPreferenceDefaultForegroundColor()
	 * 
	 * @generated
	 */
	protected Color getPreferenceDefaultForegroundColor() {
		String preferenceForeground = getPreferenceStore()
				.getString(
						ActivityWFDiagramPreferenceConstants.PROCESSPARAMETERIN_EDGE_DEFAULT_FOREGROUND_COLOR);
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
						ActivityWFDiagramPreferenceConstants.PROCESSPARAMETERIN_EDGE_DEFAULT_FONT);
		if (preferenceFont.length() != 0) {
			return Utils.getFont(new FontData(preferenceFont));
		}
		return null;
	}
}