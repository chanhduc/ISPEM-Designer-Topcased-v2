/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.methodcontentdefinition.commands;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.topcased.ispem.TaskDefinition;
import org.topcased.ispem.ToolDefinition;
import org.topcased.ispem.WorkProductDefinition;
import org.topcased.modeler.commands.AbstractRestoreConnectionCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.ispem.methodcontentdefinition.MethodContentDefinitionSimpleObjectConstants;
import org.topcased.modeler.utils.Utils;

/**
 * ToolDefinition restore connection command
 *
 * @generated
 */
public class ToolDefinitionRestoreConnectionCommand extends
		AbstractRestoreConnectionCommand {
	/**
	 * @param part the EditPart that is restored
	 * @generated
	 */
	public ToolDefinitionRestoreConnectionCommand(EditPart part) {
		super(part);
	}

	/**
	 * @see org.topcased.modeler.commands.AbstractRestoreConnectionCommand#initializeCommands()
	 * @generated
	 */
	protected void initializeCommands() {

		GraphElement graphElementSrc = getGraphElement();
		EObject eObjectSrc = Utils.getElement(graphElementSrc);

		if (eObjectSrc instanceof ToolDefinition) {
			for (GraphElement graphElementTgt : getAllGraphElements()) {
				boolean autoRef = graphElementTgt.equals(graphElementSrc);

				EObject eObjectTgt = Utils.getElement(graphElementTgt);
				if (eObjectTgt instanceof WorkProductDefinition) {
					if (autoRef) {
						// autoRef not allowed
					} else {
						// if the graphElementSrc is the source of the edge or if it is the target and that the SourceTargetCouple is reversible
						createWorkProductManagementFromToolDefinitionToWorkProductDefinition(
								graphElementSrc, graphElementTgt);
					}
				}
				if (eObjectTgt instanceof TaskDefinition) {
					if (autoRef) {
						// autoRef not allowed
					} else {
						// if graphElementSrc is the target of the edge or if it is the source and that the SourceTargetCouple is reversible
						createToolUseFromTaskDefinitionToToolDefinition(
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

	/**
	 * @param srcElt the source element
	 * @param targetElt the target element
	 * @generated
	 */
	private void createToolUseFromTaskDefinitionToToolDefinition(
			GraphElement srcElt, GraphElement targetElt) {
		TaskDefinition sourceObject = (TaskDefinition) Utils.getElement(srcElt);
		ToolDefinition targetObject = (ToolDefinition) Utils
				.getElement(targetElt);

		if (sourceObject.getUsedTool().contains(targetObject)) {
			// check if the relation does not exists yet
			if (getExistingEdges(
					srcElt,
					targetElt,
					MethodContentDefinitionSimpleObjectConstants.SIMPLE_OBJECT_TOOLUSE)
					.size() == 0) {
				GraphEdge edge = Utils
						.createGraphEdge(MethodContentDefinitionSimpleObjectConstants.SIMPLE_OBJECT_TOOLUSE);
				ToolUseEdgeCreationCommand cmd = new ToolUseEdgeCreationCommand(
						null, edge, srcElt, false);
				cmd.setTarget(targetElt);
				add(cmd);
			}
		}
	}

}