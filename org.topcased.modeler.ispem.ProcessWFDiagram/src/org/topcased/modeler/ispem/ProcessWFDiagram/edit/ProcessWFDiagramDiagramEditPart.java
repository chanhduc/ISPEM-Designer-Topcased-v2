/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.ProcessWFDiagram.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.edit.DiagramEditPart;
import org.topcased.modeler.ispem.ProcessWFDiagram.figures.ProcessWFDiagramDiagramFigure;
import org.topcased.modeler.ispem.ProcessWFDiagram.policies.ProcessWFDiagramDiagramLayoutEditPolicy;

/**
 * @generated
 */
public class ProcessWFDiagramDiagramEditPart extends DiagramEditPart {

	/**
	 * The Constructor
	 *
	 * @param model the root model element
	 * @generated
	 */
	public ProcessWFDiagramDiagramEditPart(Diagram model) {
		super(model);
	}

	/**
	 * @see org.topcased.modeler.edit.DiagramEditPart#getLayoutEditPolicy()
	 * @generated
	 */
	protected EditPolicy getLayoutEditPolicy() {
		return new ProcessWFDiagramDiagramLayoutEditPolicy();
	}

	/**
	 * @see org.topcased.modeler.edit.DiagramEditPart#createBodyFigure()
	 * @generated
	 */
	protected IFigure createBodyFigure() {
		return new ProcessWFDiagramDiagramFigure();
	}
}