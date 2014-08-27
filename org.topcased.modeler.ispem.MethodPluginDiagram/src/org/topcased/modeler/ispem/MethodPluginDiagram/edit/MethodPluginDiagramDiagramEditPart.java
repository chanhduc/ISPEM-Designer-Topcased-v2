/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.MethodPluginDiagram.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.edit.DiagramEditPart;
import org.topcased.modeler.ispem.MethodPluginDiagram.figures.MethodPluginDiagramDiagramFigure;
import org.topcased.modeler.ispem.MethodPluginDiagram.policies.MethodPluginDiagramDiagramLayoutEditPolicy;

/**
 * @generated
 */
public class MethodPluginDiagramDiagramEditPart extends DiagramEditPart {

	/**
	 * The Constructor
	 *
	 * @param model the root model element
	 * @generated
	 */
	public MethodPluginDiagramDiagramEditPart(Diagram model) {
		super(model);
	}

	/**
	 * @see org.topcased.modeler.edit.DiagramEditPart#getLayoutEditPolicy()
	 * @generated
	 */
	protected EditPolicy getLayoutEditPolicy() {
		return new MethodPluginDiagramDiagramLayoutEditPolicy();
	}

	/**
	 * @see org.topcased.modeler.edit.DiagramEditPart#createBodyFigure()
	 * @generated
	 */
	protected IFigure createBodyFigure() {
		return new MethodPluginDiagramDiagramFigure();
	}
}