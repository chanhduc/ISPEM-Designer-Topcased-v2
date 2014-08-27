/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.methodcontentdefinition.commands;

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
import org.topcased.spem.Default_ResponsibilityAssignment;
import org.topcased.spem.Default_TaskDefinitionPerformer;
import org.topcased.spem.RoleDefinition;
import org.topcased.spem.TaskDefinition;
import org.topcased.spem.WorkProductDefinition;

/**
 * RoleDefinition restore connection command
 *
 * @generated
 */
public class RoleDefinitionRestoreConnectionCommand extends
		AbstractRestoreConnectionCommand {
	/**
	 * @param part the EditPart that is restored
	 * @generated
	 */
	public RoleDefinitionRestoreConnectionCommand(EditPart part) {
		super(part);
	}

	/**
	 * @see org.topcased.modeler.commands.AbstractRestoreConnectionCommand#initializeCommands()
	 * @generated
	 */
	protected void initializeCommands() {

		GraphElement graphElementSrc = getGraphElement();
		EObject eObjectSrc = Utils.getElement(graphElementSrc);

		if (eObjectSrc instanceof RoleDefinition) {
			for (GraphElement graphElementTgt : getAllGraphElements()) {
				boolean autoRef = graphElementTgt.equals(graphElementSrc);

				EObject eObjectTgt = Utils.getElement(graphElementTgt);

				if (eObjectTgt instanceof TaskDefinition) {
					
						// if the graphElementSrc is the source of the edge or if it is the target and that the SourceTargetCouple is reversible
						createDefault_TaskDefinitionPerformerFromRoleDefinitionToTaskDefinition_LinkedTaskDefinition(
								graphElementSrc, graphElementTgt);
					
				}

				if (eObjectTgt instanceof WorkProductDefinition) {
					if (autoRef) {
						// autoRef not allowed
					} else {
						// if the graphElementSrc is the source of the edge or if it is the target and that the SourceTargetCouple is reversible
						createDefault_ResponsibilityAssignmentFromRoleDefinitionToWorkProductDefinition_LinkedWorkProductDefinition(
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
	private void createDefault_TaskDefinitionPerformerFromRoleDefinitionToTaskDefinition_LinkedTaskDefinition(
			GraphElement srcElt, GraphElement targetElt) {
		RoleDefinition sourceObject = (RoleDefinition) Utils.getElement(srcElt);
		TaskDefinition targetObject = (TaskDefinition) Utils
				.getElement(targetElt);

		EList edgeObjectList = ((org.topcased.spem.MethodContentPackage) Utils
				.getDiagramModelObject(srcElt)).getOwnedMethodContentMember();
		for (Iterator it = edgeObjectList.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof Default_TaskDefinitionPerformer) {
				Default_TaskDefinitionPerformer edgeObject = (Default_TaskDefinitionPerformer) obj;
				if (targetObject.equals(edgeObject.getLinkedTaskDefinition())
						&& edgeObject.getLinkedRoleDefinition().contains(
								sourceObject)) {
					// check if the relation does not exists yet
					List<GraphEdge> existing = getExistingEdges(srcElt,
							targetElt, Default_TaskDefinitionPerformer.class);
					if (!isAlreadyPresent(existing, edgeObject)) {
						ICreationUtils factory = getModeler()
								.getActiveConfiguration().getCreationUtils();
						// restore the link with its default presentation
						GraphElement edge = factory
								.createGraphElement(edgeObject);
						if (edge instanceof GraphEdge) {
							Default_TaskDefinitionPerformerEdgeCreationCommand cmd = new Default_TaskDefinitionPerformerEdgeCreationCommand(
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
	 * @generated
	 */
	private void createDefault_ResponsibilityAssignmentFromRoleDefinitionToWorkProductDefinition_LinkedWorkProductDefinition(
			GraphElement srcElt, GraphElement targetElt) {
		RoleDefinition sourceObject = (RoleDefinition) Utils.getElement(srcElt);
		WorkProductDefinition targetObject = (WorkProductDefinition) Utils
				.getElement(targetElt);

		EList edgeObjectList = ((org.topcased.spem.MethodContentPackage) Utils
				.getDiagramModelObject(srcElt)).getOwnedMethodContentMember();
		for (Iterator it = edgeObjectList.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof Default_ResponsibilityAssignment) {
				Default_ResponsibilityAssignment edgeObject = (Default_ResponsibilityAssignment) obj;
				if (targetObject.equals(edgeObject
						.getLinkedWorkProductDefinition())
						&& edgeObject.getLinkedRoleDefinition().contains(
								sourceObject)) {
					// check if the relation does not exists yet
					List<GraphEdge> existing = getExistingEdges(srcElt,
							targetElt, Default_ResponsibilityAssignment.class);
					if (!isAlreadyPresent(existing, edgeObject)) {
						ICreationUtils factory = getModeler()
								.getActiveConfiguration().getCreationUtils();
						// restore the link with its default presentation
						GraphElement edge = factory
								.createGraphElement(edgeObject);
						if (edge instanceof GraphEdge) {
							Default_ResponsibilityAssignmentEdgeCreationCommand cmd = new Default_ResponsibilityAssignmentEdgeCreationCommand(
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