package org.topcased.modeler.ispem.ProcessWFDiagram.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.topcased.draw2d.figures.BorderedLabel;

public class ForkNodeFigure extends BorderedLabel

{
	public ForkNodeFigure() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * @see 
	org.topcased.draw2d.figures.BorderedLabel#fillShape(org.eclipse.draw2d.Graphics)
	 */
	protected void fillShape(Graphics graphics) {
		graphics.fillRoundRectangle(getBounds(), 0, 0);
	}

	/**
	 * @see 
	org.topcased.draw2d.figures.BorderedLabel#outlineShape(org.eclipse.draw2d.Graphics)
	 */
	protected void outlineShape(Graphics graphics) {
		Rectangle r = getBounds();

		Rectangle outer = Rectangle.SINGLETON;
		outer.x = r.x + getLineWidth() / 2;
		outer.y = r.y + getLineWidth() / 2;
		outer.width = r.width - getLineWidth();
		outer.height = r.height - getLineWidth();

		graphics.drawRoundRectangle(outer, 0, 0);
	}
}