/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.methodcontentdefinition.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.commands.Command;
import org.topcased.modeler.commands.CreateTypedEdgeCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.SimpleSemanticModelElement;
import org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy;
import org.topcased.modeler.ispem.methodcontentdefinition.MethodContentDefinitionSimpleObjectConstants;
import org.topcased.modeler.ispem.methodcontentdefinition.commands.ToolUseEdgeCreationCommand;
import org.topcased.modeler.utils.SourceTargetData;
import org.topcased.modeler.utils.Utils;

/**
 * ToolUse edge creation
 *
 * @generated
 */
public class ToolUseEdgeCreationEditPolicy extends
		AbstractEdgeCreationEditPolicy {
	/**
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#createCommand(org.eclipse.gef.EditDomain, org.topcased.modeler.di.model.GraphEdge, org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected CreateTypedEdgeCommand createCommand(EditDomain domain,
			GraphEdge edge, GraphElement source) {
		return new ToolUseEdgeCreationCommand(domain, edge, source);
	}

	/**
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkEdge(org.topcased.modeler.di.model.GraphEdge)
	 * @generated
	 */
	protected boolean checkEdge(GraphEdge edge) {
		if (edge.getSemanticModel() instanceof SimpleSemanticModelElement) {
			return MethodContentDefinitionSimpleObjectConstants.SIMPLE_OBJECT_TOOLUSE
					.equals(((SimpleSemanticModelElement) edge
							.getSemanticModel()).getTypeInfo());
		}
		return false;
	}

	/**
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkSource(org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected boolean checkSource(GraphElement source) {
		EObject object = Utils.getElement(source);
		if (object instanceof org.topcased.ispem.TaskDefinition) {
			return true;
		}
		return false;
	}

	/**
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkTargetForSource(org.topcased.modeler.di.model.GraphElement, org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected boolean checkTargetForSource(GraphElement source,
			GraphElement target) {
		EObject sourceObject = Utils.getElement(source);
		EObject targetObject = Utils.getElement(target);

		if (sourceObject instanceof org.topcased.ispem.TaskDefinition
				&& targetObject instanceof org.topcased.ispem.ToolDefinition) {
			if (!sourceObject.equals(targetObject)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkCommand(org.eclipse.gef.commands.Command)
	 * @generated
	 */
	protected boolean checkCommand(Command command) {
		return command instanceof ToolUseEdgeCreationCommand;
	}

	/**
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#getSourceTargetData(org.topcased.modeler.di.model.GraphElement, org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected SourceTargetData getSourceTargetData(GraphElement source,
			GraphElement target) {
		EObject sourceObject = Utils.getElement(source);
		EObject targetObject = Utils.getElement(target);

		if (sourceObject instanceof org.topcased.ispem.TaskDefinition
				&& targetObject instanceof org.topcased.ispem.ToolDefinition) {
			return new SourceTargetData(false, false, SourceTargetData.NONE,
					null, null, null, null, null, "usedTool", null, null);
		}
		return null;
	}

}