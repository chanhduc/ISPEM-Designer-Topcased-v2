/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.activityWF.commands;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.topcased.modeler.commands.AbstractRestoreConnectionCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.utils.Utils;
import org.topcased.spem.BreakdownElement;
import org.topcased.spem.activity.Edge;

/**
 * BreakdownElement restore connection command
 *
 * @generated
 */
public class BreakdownElementRestoreConnectionCommand extends
		AbstractRestoreConnectionCommand {
	/**
	 * @param part the EditPart that is restored
	 * @generated
	 */
	public BreakdownElementRestoreConnectionCommand(EditPart part) {
		super(part);
	}

	/**
	 * @see org.topcased.modeler.commands.AbstractRestoreConnectionCommand#initializeCommands()
	 * @generated
	 */
	protected void initializeCommands() {

		GraphElement graphElementSrc = getGraphElement();
		EObject eObjectSrc = Utils.getElement(graphElementSrc);

		if (eObjectSrc instanceof BreakdownElement) {
			for (GraphElement graphElementTgt : getAllGraphElements()) {
				boolean autoRef = graphElementTgt.equals(graphElementSrc);

				EObject eObjectTgt = Utils.getElement(graphElementTgt);

				if (eObjectTgt instanceof BreakdownElement) {
					if (autoRef) {
						// autoRef not allowed
					} else {
						// if the graphElementSrc is the source of the edge or if it is the target and that the SourceTargetCouple is reversible
						createEdgeFromBreakdownElementToBreakdownElement_Source(
								graphElementSrc, graphElementTgt);
						// if graphElementSrc is the target of the edge or if it is the source and that the SourceTargetCouple is reversible
						createEdgeFromBreakdownElementToBreakdownElement_Source(
								graphElementTgt, graphElementSrc);
					}
				}

			}
		}
	}

	/**
	 * @param srcElt the source element
	 * @param targetElt the target element
	 * @generated
	 */
	private void createEdgeFromBreakdownElementToBreakdownElement_Source(
			GraphElement srcElt, GraphElement targetElt) {
		BreakdownElement sourceObject = (BreakdownElement) Utils
				.getElement(srcElt);
		BreakdownElement targetObject = (BreakdownElement) Utils
				.getElement(targetElt);

		EList edgeObjectList = ((org.topcased.ispem.Activity) Utils
				.getDiagramModelObject(srcElt)).getNestedBreakdownElement();
		for (Iterator it = edgeObjectList.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof Edge) {
				Edge edgeObject = (Edge) obj;
				if (targetObject.equals(edgeObject.getSource())
						&& sourceObject.equals(edgeObject.getSource())) {
					// check if the relation does not exists yet
					List<GraphEdge> existing = getExistingEdges(srcElt,
							targetElt, Edge.class);
					if (!isAlreadyPresent(existing, edgeObject)) {
						ICreationUtils factory = getModeler()
								.getActiveConfiguration().getCreationUtils();
						// restore the link with its default presentation
						GraphElement edge = factory
								.createGraphElement(edgeObject);
						if (edge instanceof GraphEdge) {
							EdgeEdgeCreationCommand cmd = new EdgeEdgeCreationCommand(
									getEditDomain(), (GraphEdge) edge, srcElt,
									false);
							cmd.setTarget(targetElt);
							add(cmd);
						}
					}
				}
			}
		}
	}

}