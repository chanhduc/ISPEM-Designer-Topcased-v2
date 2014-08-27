/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.ProcessWFDiagram.commands;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.topcased.ispem.Activity;
import org.topcased.ispem.Artifact;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.utils.Utils;
import org.topcased.spem.ParameterDirectionKind;
import org.topcased.spem.ProcessParameter;
import org.topcased.spem.WorkSequence;

/**
 * Activity restore connection command
 *
 * @generated
 */
public class ActivityRestoreConnectionCommand extends
		BreakdownElementRestoreConnectionCommand {
	/**
	 * @param part the EditPart that is restored
	 * @generated
	 */
	public ActivityRestoreConnectionCommand(EditPart part) {
		super(part);
	}

	/**
	 * @see org.topcased.modeler.commands.AbstractRestoreConnectionCommand#initializeCommands()
	 * @personalised
	 */
	protected void initializeCommands() {

		GraphElement graphElementSrc = getGraphElement();
		EObject eObjectSrc = Utils.getElement(graphElementSrc);

		if (eObjectSrc instanceof Activity) {
			for (GraphElement graphElementTgt : getAllGraphElements()) {
				boolean autoRef = graphElementTgt.equals(graphElementSrc);

				EObject eObjectTgt = Utils.getElement(graphElementTgt);

				if (eObjectTgt instanceof Activity) {
					if (autoRef) {
						// autoRef not allowed
					} else {
						// if the graphElementSrc is the source of the edge or if it is the target and that the SourceTargetCouple is reversible
						createWorkSequenceFromActivityToActivity_VariabilityBasedOnElement(
								graphElementSrc, graphElementTgt);
						// if graphElementSrc is the target of the edge or if it is the source and that the SourceTargetCouple is reversible
						createWorkSequenceFromActivityToActivity_VariabilityBasedOnElement(
								graphElementTgt, graphElementSrc);
					}
				}

				if (eObjectTgt instanceof Artifact) {
					if (autoRef) {
						// autoRef not allowed
					} else {
						// if the graphElementSrc is the source of the edge or if it is the target and that the SourceTargetCouple is reversible
						createProcessParameterInFromActivityToArtifact(
								graphElementSrc, graphElementTgt);
						createProcessParameterOutFromActivityToArtifact(
								graphElementSrc, graphElementTgt);
						createProcessParameterInOutFromActivityToArtifact(
								graphElementSrc, graphElementTgt);
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
	private void createWorkSequenceFromActivityToActivity_VariabilityBasedOnElement(
			GraphElement srcElt, GraphElement targetElt) {
		Activity sourceObject = (Activity) Utils.getElement(srcElt);
		Activity targetObject = (Activity) Utils.getElement(targetElt);

		EList edgeObjectList = sourceObject.getLinkToSuccessor();
		for (Iterator it = edgeObjectList.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof WorkSequence) {
				WorkSequence edgeObject = (WorkSequence) obj;
				if (targetObject.equals(edgeObject.getPredecessor())
						&& sourceObject.equals(edgeObject.getPredecessor())
						&& sourceObject.getLinkToPredecessor().contains(
								edgeObject)
						&& targetObject.getLinkToPredecessor().contains(
								edgeObject)
						&& targetObject.equals(sourceObject
								.getVariabilityBasedOnElement())
						&& sourceObject.equals(targetObject
								.getVariabilityBasedOnElement())) {
					// check if the relation does not exists yet
					List<GraphEdge> existing = getExistingEdges(srcElt,
							targetElt, WorkSequence.class);
					if (!isAlreadyPresent(existing, edgeObject)) {
						ICreationUtils factory = getModeler()
								.getActiveConfiguration().getCreationUtils();
						// restore the link with its default presentation
						GraphElement edge = factory
								.createGraphElement(edgeObject);
						if (edge instanceof GraphEdge) {
							WorkSequenceEdgeCreationCommand cmd = new WorkSequenceEdgeCreationCommand(
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


	/**
	 * @param srcElt the source element
	 * @param targetElt the target element
	 * @personalised
	 */
	private void createProcessParameterInFromActivityToArtifact(
			GraphElement srcElt, GraphElement targetElt) {
		Activity sourceObject = (Activity) Utils.getElement(srcElt);
		Artifact targetObject = (Artifact) Utils.getElement(targetElt);

		EList edgeObjectList = ((org.topcased.ispem.Process) Utils
				.getDiagramModelObject(srcElt)).getOwnedParameter();
		for (Iterator it = edgeObjectList.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof ProcessParameter) {
				ProcessParameter edgeObject = (ProcessParameter) obj;

				if (edgeObject.getDirection() == ParameterDirectionKind.IN_LITERAL) {
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
									false);
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
	 * @personalised
	 */
	private void createProcessParameterOutFromActivityToArtifact(
			GraphElement srcElt, GraphElement targetElt) {
		Activity sourceObject = (Activity) Utils.getElement(srcElt);
		Artifact targetObject = (Artifact) Utils.getElement(targetElt);

		EList edgeObjectList = ((org.topcased.ispem.Process) Utils
				.getDiagramModelObject(srcElt)).getOwnedParameter();
		for (Iterator it = edgeObjectList.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof ProcessParameter) {
				ProcessParameter edgeObject = (ProcessParameter) obj;
				if (edgeObject.getDirection() == ParameterDirectionKind.OUT_LITERAL) {
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
									false);
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
	 * @personalised
	 */
	private void createProcessParameterInOutFromActivityToArtifact(
			GraphElement srcElt, GraphElement targetElt) {
		Activity sourceObject = (Activity) Utils.getElement(srcElt);
		Artifact targetObject = (Artifact) Utils.getElement(targetElt);

		EList edgeObjectList = ((org.topcased.ispem.Process) Utils
				.getDiagramModelObject(srcElt)).getOwnedParameter();
		for (Iterator it = edgeObjectList.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof ProcessParameter) {
				ProcessParameter edgeObject = (ProcessParameter) obj;
				if (edgeObject.getDirection() == ParameterDirectionKind.INOUT_LITERAL) {
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