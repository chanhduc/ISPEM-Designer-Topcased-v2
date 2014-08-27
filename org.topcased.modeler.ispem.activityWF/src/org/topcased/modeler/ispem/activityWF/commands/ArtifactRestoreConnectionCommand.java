/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.activityWF.commands;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.topcased.ispem.Artifact;
import org.topcased.modeler.commands.AbstractRestoreConnectionCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.utils.Utils;
import org.topcased.spem.ParameterDirectionKind;
import org.topcased.spem.ProcessParameter;
import org.topcased.spem.TaskUse;
import org.topcased.spem.WorkProductUse;

/**
 * Artifact restore connection command
 *
 * @generated
 */
public class ArtifactRestoreConnectionCommand extends
		AbstractRestoreConnectionCommand {
	/**
	 * @param part the EditPart that is restored
	 * @generated
	 */
	public ArtifactRestoreConnectionCommand(EditPart part) {
		super(part);
	}

	/**
	 * @see org.topcased.modeler.commands.AbstractRestoreConnectionCommand#initializeCommands()
	 * @generated
	 */
	protected void initializeCommands() {

		GraphElement graphElementSrc = getGraphElement();
		EObject eObjectSrc = Utils.getElement(graphElementSrc);

		if (eObjectSrc instanceof WorkProductUse) {
			for (GraphElement graphElementTgt : getAllGraphElements()) {
				boolean autoRef = graphElementTgt.equals(graphElementSrc);

				EObject eObjectTgt = Utils.getElement(graphElementTgt);

				if (eObjectTgt instanceof TaskUse) {
					if (autoRef) {
						// autoRef not allowed
					} else {
						// if graphElementSrc is the target of the edge or if it is the source and that the SourceTargetCouple is reversible
						createProcessParameterInFromTaskUseToArtifact_ParameterType(
								graphElementTgt, graphElementSrc);
					}
				}

				if (eObjectTgt instanceof TaskUse) {
					if (autoRef) {
						// autoRef not allowed
					} else {
						// if graphElementSrc is the target of the edge or if it is the source and that the SourceTargetCouple is reversible
						createProcessParameterOutFromTaskUseToArtifact_ParameterType(
								graphElementTgt, graphElementSrc);
					}
				}

				if (eObjectTgt instanceof TaskUse) {
					if (autoRef) {
						// autoRef not allowed
					} else {
						// if graphElementSrc is the target of the edge or if it is the source and that the SourceTargetCouple is reversible
						createProcessParameterInOutFromTaskUseToArtifact_ParameterType(
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
	private void createProcessParameterOutFromTaskUseToArtifact_ParameterType(
			GraphElement srcElt, GraphElement targetElt) {
		TaskUse sourceObject = (TaskUse) Utils.getElement(srcElt);
		WorkProductUse targetObject = (WorkProductUse) Utils.getElement(targetElt);

		EList edgeObjectList = sourceObject.getOwnedProcessParameter();
		for (Iterator it = edgeObjectList.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof ProcessParameter) {
				ProcessParameter edgeObject = (ProcessParameter) obj;
				if (targetObject.equals(edgeObject.getParameterType())
						&& sourceObject.getOwnedProcessParameter().contains(
								edgeObject)&& edgeObject.getDirection() == ParameterDirectionKind.OUT_LITERAL) {
					// check if the relation does not exists yet
					List<GraphEdge> existing = getExistingEdges(srcElt,
							targetElt, ProcessParameter.class);
					if (!isAlreadyPresent(existing, edgeObject)) {
						ICreationUtils factory = getModeler()
								.getActiveConfiguration().getCreationUtils();
						// restore the link with its default presentation
						GraphElement edge = factory
								.createGraphElement(edgeObject);
						if (edge instanceof GraphEdge) {
							ProcessParameterOutEdgeCreationCommand cmd = new ProcessParameterOutEdgeCreationCommand(
									getEditDomain(), (GraphEdge) edge, srcElt,
									true);
							cmd.setTarget(targetElt);
							add(cmd);
						}
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
	private void createProcessParameterInFromTaskUseToArtifact_ParameterType(
			GraphElement srcElt, GraphElement targetElt) {
		TaskUse sourceObject = (TaskUse) Utils.getElement(srcElt);
		WorkProductUse targetObject = (WorkProductUse) Utils.getElement(targetElt);

		EList edgeObjectList = sourceObject.getOwnedProcessParameter();
		for (Iterator it = edgeObjectList.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof ProcessParameter) {
				ProcessParameter edgeObject = (ProcessParameter) obj;
				if (targetObject.equals(edgeObject.getParameterType())
						&& sourceObject.getOwnedProcessParameter().contains(
								edgeObject)&& edgeObject.getDirection() == ParameterDirectionKind.IN_LITERAL) {
					// check if the relation does not exists yet
					List<GraphEdge> existing = getExistingEdges(srcElt,
							targetElt, ProcessParameter.class);
					if (!isAlreadyPresent(existing, edgeObject)) {
						ICreationUtils factory = getModeler()
								.getActiveConfiguration().getCreationUtils();
						// restore the link with its default presentation
						GraphElement edge = factory
								.createGraphElement(edgeObject);
						if (edge instanceof GraphEdge) {
							ProcessParameterInEdgeCreationCommand cmd = new ProcessParameterInEdgeCreationCommand(
									getEditDomain(), (GraphEdge) edge, srcElt,
									true);
							cmd.setTarget(targetElt);
							add(cmd);
						}
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
	private void createProcessParameterInOutFromTaskUseToArtifact_ParameterType(
			GraphElement srcElt, GraphElement targetElt) {
		TaskUse sourceObject = (TaskUse) Utils.getElement(srcElt);
		WorkProductUse targetObject = (WorkProductUse) Utils.getElement(targetElt);

		EList edgeObjectList = sourceObject.getOwnedProcessParameter();
		for (Iterator it = edgeObjectList.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof ProcessParameter) {
				ProcessParameter edgeObject = (ProcessParameter) obj;
				if (targetObject.equals(edgeObject.getParameterType())
						&& sourceObject.getOwnedProcessParameter().contains(
								edgeObject)&& edgeObject.getDirection() == ParameterDirectionKind.INOUT_LITERAL) {
					// check if the relation does not exists yet
					List<GraphEdge> existing = getExistingEdges(srcElt,
							targetElt, ProcessParameter.class);
					if (!isAlreadyPresent(existing, edgeObject)) {
						ICreationUtils factory = getModeler()
								.getActiveConfiguration().getCreationUtils();
						// restore the link with its default presentation
						GraphElement edge = factory
								.createGraphElement(edgeObject);
						if (edge instanceof GraphEdge) {
							ProcessParameterInOutEdgeCreationCommand cmd = new ProcessParameterInOutEdgeCreationCommand(
									getEditDomain(), (GraphEdge) edge, srcElt,
									true);
							cmd.setTarget(targetElt);
							add(cmd);
						}
					}
				}
			}
		}
	}


}