/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.ProcessWFDiagram.figures;

import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.handles.HandleBounds;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.swt.SWT;
import org.topcased.modeler.edit.locators.EdgeObjectOffsetLocator;
import org.topcased.modeler.figures.EdgeObjectOffsetEditableLabel;
import org.topcased.modeler.figures.IEdgeObjectFigure;
import org.topcased.modeler.figures.IEdgeObjectOffsetFigure;
import org.topcased.modeler.figures.IGraphEdgeFigure;

/**
 * @generated
 */
public class WorkSequenceFigure extends PolylineConnectionEx implements
		IGraphEdgeFigure, HandleBounds {

	/**
	 * @generated
	 */
	private IEdgeObjectFigure linkKindEdgeObject;

	/**
	 * @generated
	 */
	private Locator linkKindLocator;

	/**
	 * The constructor
	 *
	 * @generated
	 */
	public WorkSequenceFigure() {
		super();

		linkKindEdgeObject = new EdgeObjectOffsetEditableLabel(this);
		linkKindLocator = new EdgeObjectOffsetLocator(
				(IEdgeObjectOffsetFigure) linkKindEdgeObject);
		add(linkKindEdgeObject, linkKindLocator);
		setLineStyle(SWT.LINE_SOLID);
	}

	/**
	 * @return the object figure
	 * @generated
	 */
	public IEdgeObjectFigure getLinkKindEdgeObjectFigure() {
		return linkKindEdgeObject;
	}

	/**
	 * @see org.topcased.modeler.figures.IGraphEdgeFigure#getLocator(org.topcased.modeler.figures.IEdgeObjectFigure)
	 * @generated
	 */
	public Locator getLocator(IEdgeObjectFigure edgeObjectfigure) {
		if (edgeObjectfigure == linkKindEdgeObject) {
			return linkKindLocator;
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