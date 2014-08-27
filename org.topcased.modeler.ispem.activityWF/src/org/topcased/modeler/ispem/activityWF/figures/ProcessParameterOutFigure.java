/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.activityWF.figures;

import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.handles.HandleBounds;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.swt.SWT;
import org.topcased.modeler.edit.locators.EdgeObjectOffsetLocator;
import org.topcased.modeler.figures.EdgeObjectEditableLabel;
import org.topcased.modeler.figures.EdgeObjectLabel;
import org.topcased.modeler.figures.EdgeObjectOffsetLabel;
import org.topcased.modeler.figures.IGraphEdgeFigure;
import org.topcased.modeler.figures.IEdgeObjectFigure;
import org.topcased.modeler.figures.IEdgeObjectOffsetFigure;

/**
 * @generated
 */
public class ProcessParameterOutFigure extends PolylineConnectionEx implements
		IGraphEdgeFigure, HandleBounds {

	/**
	 * @generated
	 */
	private IEdgeObjectFigure directionEdgeObject;

	/**
	 * @generated
	 */
	private Locator directionLocator;

	/**
	 * The constructor
	 *
	 * @generated
	 */
	public ProcessParameterOutFigure() {
		super();

		directionEdgeObject = new EdgeObjectEditableLabel(this);
		directionLocator = new ConnectionEndpointLocator(this, true);
		add(directionEdgeObject, directionLocator);
		setLineStyle(SWT.LINE_SOLID);
	}

	/**
	 * @return the object figure
	 * @generated
	 */
	public IEdgeObjectFigure getDirectionEdgeObjectFigure() {
		return directionEdgeObject;
	}

	/**
	 * @see org.topcased.modeler.figures.IGraphEdgeFigure#getLocator(org.topcased.modeler.figures.IEdgeObjectFigure)
	 * @generated
	 */
	public Locator getLocator(IEdgeObjectFigure edgeObjectfigure) {
		if (edgeObjectfigure == directionEdgeObject) {
			return directionLocator;
		}

		return null;
	}

	/**
	 * @see org.eclipse.gef.handles.HandleBounds#getHandleBounds()
	 * @generated
	 */
	public Rectangle getHandleBounds() {
		return getPoints().getBounds();
	}
}