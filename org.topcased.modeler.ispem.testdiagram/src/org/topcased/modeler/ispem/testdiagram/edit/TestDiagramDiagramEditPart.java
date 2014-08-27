/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.testdiagram.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.edit.DiagramEditPart;
import org.topcased.modeler.ispem.testdiagram.figures.TestDiagramDiagramFigure;
import org.topcased.modeler.ispem.testdiagram.policies.TestDiagramDiagramLayoutEditPolicy;

/**
 * @generated
 */
public class TestDiagramDiagramEditPart extends DiagramEditPart {

	/**
	 * The Constructor
	 *
	 * @param model the root model element
	 * @generated
	 */
	public TestDiagramDiagramEditPart(Diagram model) {
		super(model);
	}

	/**
	 * @see org.topcased.modeler.edit.DiagramEditPart#getLayoutEditPolicy()
	 * @generated
	 */
	protected EditPolicy getLayoutEditPolicy() {
		return new TestDiagramDiagramLayoutEditPolicy();
	}

	/**
	 * @see org.topcased.modeler.edit.DiagramEditPart#createBodyFigure()
	 * @generated
	 */
	protected IFigure createBodyFigure() {
		return new TestDiagramDiagramFigure();
	}
}