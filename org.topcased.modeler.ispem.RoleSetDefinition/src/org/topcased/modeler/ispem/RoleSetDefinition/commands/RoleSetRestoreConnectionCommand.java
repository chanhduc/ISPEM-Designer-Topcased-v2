/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.RoleSetDefinition.commands;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.topcased.modeler.commands.AbstractRestoreConnectionCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.ispem.RoleSetDefinition.RoleSetDefinitionSimpleObjectConstants;
import org.topcased.modeler.utils.Utils;
import org.topcased.spem.RoleDefinition;
import org.topcased.spem.uma.RoleSet;

/**
 * RoleSet restore connection command
 *
 * @generated
 */
public class RoleSetRestoreConnectionCommand extends
		AbstractRestoreConnectionCommand {
	/**
	 * @param part the EditPart that is restored
	 * @generated
	 */
	public RoleSetRestoreConnectionCommand(EditPart part) {
		super(part);
	}

	/**
	 * @see org.topcased.modeler.commands.AbstractRestoreConnectionCommand#initializeCommands()
	 * @generated
	 */
	protected void initializeCommands() {

		GraphElement graphElementSrc = getGraphElement();
		EObject eObjectSrc = Utils.getElement(graphElementSrc);

		if (eObjectSrc instanceof RoleSet) {
			for (GraphElement graphElementTgt : getAllGraphElements()) {
				boolean autoRef = graphElementTgt.equals(graphElementSrc);

				EObject eObjectTgt = Utils.getElement(graphElementTgt);
				if (eObjectTgt instanceof RoleDefinition) {
					if (autoRef) {
						// autoRef not allowed
					} else {
						// if the graphElementSrc is the source of the edge or if it is the target and that the SourceTargetCouple is reversible
						createCategorizeRoleDefinitionFromRoleSetToRoleDefinition(
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
	private void createCategorizeRoleDefinitionFromRoleSetToRoleDefinition(
			GraphElement srcElt, GraphElement targetElt) {
		RoleSet sourceObject = (RoleSet) Utils.getElement(srcElt);
		RoleDefinition targetObject = (RoleDefinition) Utils
				.getElement(targetElt);

		if (sourceObject.getRole().contains(targetObject)) {
			// check if the relation does not exists yet
			if (getExistingEdges(
					srcElt,
					targetElt,
					RoleSetDefinitionSimpleObjectConstants.SIMPLE_OBJECT_CATEGORIZEROLEDEFINITION)
					.size() == 0) {
				GraphEdge edge = Utils
						.createGraphEdge(RoleSetDefinitionSimpleObjectConstants.SIMPLE_OBJECT_CATEGORIZEROLEDEFINITION);
				CategorizeRoleDefinitionEdgeCreationCommand cmd = new CategorizeRoleDefinitionEdgeCreationCommand(
						null, edge, srcElt, false);
				cmd.setTarget(targetElt);
				add(cmd);
			}
		}
	}

}