/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.methodcontentdefinition.commands;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.topcased.ispem.TaskDefinition;
import org.topcased.ispem.ToolDefinition;
import org.topcased.ispem.WorkProductDefinition;
import org.topcased.modeler.commands.AbstractRestoreConnectionCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.ispem.methodcontentdefinition.MethodContentDefinitionSimpleObjectConstants;
import org.topcased.modeler.utils.Utils;
import org.topcased.spem.Default_ResponsibilityAssignment;
import org.topcased.spem.Default_TaskDefinitionParameter;
import org.topcased.spem.ParameterDirectionKind;
import org.topcased.spem.RoleDefinition;

/**
 * WorkProductDefinition restore connection command
 *
 * @generated
 */
public class WorkProductDefinitionRestoreConnectionCommand extends
		AbstractRestoreConnectionCommand {
	/**
	 * @param part the EditPart that is restored
	 * @generated
	 */
	public WorkProductDefinitionRestoreConnectionCommand(EditPart part) {
		super(part);
	}

	/**
	 * @see org.topcased.modeler.commands.AbstractRestoreConnectionCommand#initializeCommands()
	 * @generated NOT
	 */
	protected void initializeCommands() {

		GraphElement graphElementSrc = getGraphElement();
		EObject eObjectSrc = Utils.getElement(graphElementSrc);

		if (eObjectSrc instanceof WorkProductDefinition) {
			for (GraphElement graphElementTgt : getAllGraphElements()) {
				boolean autoRef = graphElementTgt.equals(graphElementSrc);

				EObject eObjectTgt = Utils.getElement(graphElementTgt);

				if (eObjectTgt instanceof TaskDefinition) {
				
						// if graphElementSrc is the target of the edge or if it is the source and that the SourceTargetCouple is reversible
						createDefault_TaskDefinitionParameterInFromTaskDefinitionToWorkProductDefinition_ParameterType(
								graphElementTgt, graphElementSrc);
						createDefault_TaskDefinitionParameterOutFromTaskDefinitionToWorkProductDefinition_ParameterType(
								graphElementTgt, graphElementSrc);
						createDefault_TaskDefinitionParameterInOutFromTaskDefinitionToWorkProductDefinition_ParameterType(
								graphElementTgt, graphElementSrc);
					
				}

				
				if (eObjectTgt instanceof RoleDefinition) {
					if (autoRef) {
						// autoRef not allowed
					} else {
						// if graphElementSrc is the target of the edge or if it is the source and that the SourceTargetCouple is reversible
						createDefault_ResponsibilityAssignmentFromRoleDefinitionToWorkProductDefinition_LinkedWorkProductDefinition(
								graphElementTgt, graphElementSrc);
					}
				}

				if (eObjectTgt instanceof ToolDefinition) {
					if (autoRef) {
						// autoRef not allowed
					} else {
						// if graphElementSrc is the target of the edge or if it is the source and that the SourceTargetCouple is reversible
						createWorkProductManagementFromToolDefinitionToWorkProductDefinition(
								graphElementTgt, graphElementSrc);
					}
				}

			}
		}
	}

	/**
	 * @param srcElt the source element
	 * @param targetElt the target element
	 * @generated NOT
	 */
	private void createDefault_TaskDefinitionParameterInFromTaskDefinitionToWorkProductDefinition_ParameterType(
			GraphElement srcElt, GraphElement targetElt) {
		TaskDefinition sourceObject = (TaskDefinition) Utils.getElement(srcElt);
		WorkProductDefinition targetObject = (WorkProductDefinition) Utils
				.getElement(targetElt);

		EList edgeObjectList = sourceObject.getOwnedTaskDefinitionParameter();
		for (Iterator it = edgeObjectList.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof Default_TaskDefinitionParameter) {
				Default_TaskDefinitionParameter edgeObject = (Default_TaskDefinitionParameter) obj;
				if (targetObject.equals(edgeObject.getParameterType())
						&& sourceObject.getOwnedParameter()
								.contains(edgeObject)
						&& edgeObject.getDirection() == ParameterDirectionKind.IN_LITERAL) {
					// check if the relation does not exists yet
					List<GraphEdge> existing = getExistingEdges(srcElt,
							targetElt, Default_TaskDefinitionParameter.class);
					if (!isAlreadyPresent(existing, edgeObject)) {
						ICreationUtils factory = getModeler()
								.getActiveConfiguration().getCreationUtils();
						// restore the link with its default presentation
						GraphElement edge = factory
								.createGraphElement(edgeObject);
						if (edge instanceof GraphEdge) {
							Default_TaskDefinitionParameterInEdgeCreationCommand cmd = new Default_TaskDefinitionParameterInEdgeCreationCommand(
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
	 * @generated NOT
	 */
	private void createDefault_TaskDefinitionParameterOutFromTaskDefinitionToWorkProductDefinition_ParameterType(
			GraphElement srcElt, GraphElement targetElt) {
		TaskDefinition sourceObject = (TaskDefinition) Utils.getElement(srcElt);
		WorkProductDefinition targetObject = (WorkProductDefinition) Utils
				.getElement(targetElt);

		EList edgeObjectList = sourceObject.getOwnedTaskDefinitionParameter();
		for (Iterator it = edgeObjectList.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof Default_TaskDefinitionParameter) {
				Default_TaskDefinitionParameter edgeObject = (Default_TaskDefinitionParameter) obj;
				if (targetObject.equals(edgeObject.getParameterType())
						&& sourceObject.getOwnedParameter()
								.contains(edgeObject)
						&& edgeObject.getDirection() == ParameterDirectionKind.OUT_LITERAL) {
					// check if the relation does not exists yet
					List<GraphEdge> existing = getExistingEdges(srcElt,
							targetElt, Default_TaskDefinitionParameter.class);
					if (!isAlreadyPresent(existing, edgeObject)) {
						ICreationUtils factory = getModeler()
								.getActiveConfiguration().getCreationUtils();
						// restore the link with its default presentation
						GraphElement edge = factory
								.createGraphElement(edgeObject);
						if (edge instanceof GraphEdge) {
							Default_TaskDefinitionParameterOutEdgeCreationCommand cmd = new Default_TaskDefinitionParameterOutEdgeCreationCommand(
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
	 * @generated NOT
	 */
	private void createDefault_TaskDefinitionParameterInOutFromTaskDefinitionToWorkProductDefinition_ParameterType(
			GraphElement srcElt, GraphElement targetElt) {
		TaskDefinition sourceObject = (TaskDefinition) Utils.getElement(srcElt);
		WorkProductDefinition targetObject = (WorkProductDefinition) Utils
				.getElement(targetElt);

		EList edgeObjectList = sourceObject.getOwnedTaskDefinitionParameter();
		for (Iterator it = edgeObjectList.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof Default_TaskDefinitionParameter) {
				Default_TaskDefinitionParameter edgeObject = (Default_TaskDefinitionParameter) obj;
				if (targetObject.equals(edgeObject.getParameterType())
						&& sourceObject.getOwnedParameter()
								.contains(edgeObject)
						&& edgeObject.getDirection() == ParameterDirectionKind.INOUT_LITERAL) {
					// check if the relation does not exists yet
					List<GraphEdge> existing = getExistingEdges(srcElt,
							targetElt, Default_TaskDefinitionParameter.class);
					if (!isAlreadyPresent(existing, edgeObject)) {
						ICreationUtils factory = getModeler()
								.getActiveConfiguration().getCreationUtils();
						// restore the link with its default presentation
						GraphElement edge = factory
								.createGraphElement(edgeObject);
						if (edge instanceof GraphEdge) {
							Default_TaskDefinitionParameterInOutEdgeCreationCommand cmd = new Default_TaskDefinitionParameterInOutEdgeCreationCommand(
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

	/**
	 * @param srcElt the source element
	 * @param targetElt the target element
	 * @generated
	 */
	private void createWorkProductManagementFromToolDefinitionToWorkProductDefinition(
			GraphElement srcElt, GraphElement targetElt) {
		ToolDefinition sourceObject = (ToolDefinition) Utils.getElement(srcElt);
		WorkProductDefinition targetObject = (WorkProductDefinition) Utils
				.getElement(targetElt);

		if (sourceObject.getManagedWorkProduct().contains(targetObject)) {
			// check if the relation does not exists yet
			if (getExistingEdges(
					srcElt,
					targetElt,
					MethodContentDefinitionSimpleObjectConstants.SIMPLE_OBJECT_WORKPRODUCTMANAGEMENT)
					.size() == 0) {
				GraphEdge edge = Utils
						.createGraphEdge(MethodContentDefinitionSimpleObjectConstants.SIMPLE_OBJECT_WORKPRODUCTMANAGEMENT);
				WorkProductManagementEdgeCreationCommand cmd = new WorkProductManagementEdgeCreationCommand(
						null, edge, srcElt, false);
				cmd.setTarget(targetElt);
				add(cmd);
			}
		}
	}

}