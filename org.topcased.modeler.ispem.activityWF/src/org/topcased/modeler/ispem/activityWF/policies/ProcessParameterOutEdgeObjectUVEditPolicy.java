/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.activityWF.policies;

import org.topcased.modeler.edit.policies.EdgeObjectUVEditPolicy;
import org.topcased.modeler.figures.IEdgeObjectFigure;
import org.topcased.modeler.ispem.activityWF.figures.ProcessParameterOutFigure;

/**
 * An edit policy to select and move the name and the cardinality label relative to the EReference connection.
 *
 * @generated
 */
public class ProcessParameterOutEdgeObjectUVEditPolicy extends
		EdgeObjectUVEditPolicy {
	/**
	 * @see org.topcased.modeler.edit.policies.EdgeObjectUVEditPolicy#isEnd(org.topcased.modeler.figures.IEdgeObjectFigure)
	 * @generated
	 */
	protected boolean isEnd(IEdgeObjectFigure figure) {
		ProcessParameterOutFigure processparameteroutFigure = (ProcessParameterOutFigure) getHostFigure();

		if (figure == processparameteroutFigure.getDirectionEdgeObjectFigure()) {
			return true;
		}

		return true;
	}

}
