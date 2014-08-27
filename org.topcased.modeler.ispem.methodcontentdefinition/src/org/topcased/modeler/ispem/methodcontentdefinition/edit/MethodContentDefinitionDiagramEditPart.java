/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.methodcontentdefinition.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.edit.DiagramEditPart;
import org.topcased.modeler.ispem.methodcontentdefinition.figures.MethodContentDefinitionDiagramFigure;
import org.topcased.modeler.ispem.methodcontentdefinition.policies.MethodContentDefinitionDiagramLayoutEditPolicy;

/**
 * @generated
 */
public class MethodContentDefinitionDiagramEditPart extends DiagramEditPart {

	/**
	 * The Constructor
	 *
	 * @param model the root model element
	 * @generated
	 */
	public MethodContentDefinitionDiagramEditPart(Diagram model) {
		super(model);
	}

	/**
	 * @see org.topcased.modeler.edit.DiagramEditPart#getLayoutEditPolicy()
	 * @generated
	 */
	protected EditPolicy getLayoutEditPolicy() {
		return new MethodContentDefinitionDiagramLayoutEditPolicy();
	}

	/**
	 * @see org.topcased.modeler.edit.DiagramEditPart#createBodyFigure()
	 * @generated
	 */
	protected IFigure createBodyFigure() {
		return new MethodContentDefinitionDiagramFigure();
	}
}