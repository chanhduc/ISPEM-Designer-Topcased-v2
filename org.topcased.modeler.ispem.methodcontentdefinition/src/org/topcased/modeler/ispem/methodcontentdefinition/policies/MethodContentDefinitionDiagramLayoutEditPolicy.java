/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.methodcontentdefinition.policies;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.topcased.ispem.ToolDefinition;
import org.topcased.ispem.WorkProductDefinition;
import org.topcased.modeler.di.model.DiagramElement;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.edit.policies.ModelerLayoutEditPolicy;
import org.topcased.modeler.utils.Utils;
import org.topcased.spem.MethodContentPackage;
import org.topcased.spem.MethodContentPackageableElement;
import org.topcased.spem.RoleDefinition;
import org.topcased.spem.TaskDefinition;
import org.topcased.spem.uma.CategoryPackage;
import org.topcased.spem.uma.RoleDefinitionPackage;
import org.topcased.spem.uma.TaskDefinitionPackage;
import org.topcased.spem.uma.ToolDefinitionPackage;
import org.topcased.spem.uma.WorkProductDefinitionPackage;

/**
 * @generated
 */
public class MethodContentDefinitionDiagramLayoutEditPolicy extends
		ModelerLayoutEditPolicy {
	/**
	 * Default contructor.
	 * 
	 * @generated
	 */
	public MethodContentDefinitionDiagramLayoutEditPolicy() {
		super();
	}

	/**
	 * By default, it is the model object associated with the parent node that should contain the child
	 * 
	 * @param parent the parent node
	 * @return the model object that should contain the child object
	 * @generated NOT
	 */
	@Override
	protected EObject getParentContainerEObject(GraphElement parent,
			DiagramElement child) {
		EObject childModel = Utils.getElement((GraphElement) child);
		if (childModel instanceof TaskDefinition) {
			TaskDefinition taskDef = (TaskDefinition) childModel;
			TaskDefinitionPackage taskPackage = findTaskDefinitionPackage((MethodContentPackage) Utils
					.getElement(parent));
			if (taskPackage != null) {
				return taskPackage;
			}
		}
		if (childModel instanceof RoleDefinition) {
			RoleDefinition roleDef = (RoleDefinition) childModel;
			RoleDefinitionPackage rolePackage = findRoleDefinitionPackage((MethodContentPackage) Utils
					.getElement(parent));
			if (rolePackage != null) {
				return rolePackage;
			}
		}
		if (childModel instanceof WorkProductDefinition) {
			WorkProductDefinition wpDef = (WorkProductDefinition) childModel;
			WorkProductDefinitionPackage wpPackage = findWorkProductDefinitionPackage((MethodContentPackage) Utils
					.getElement(parent));
			if (wpPackage != null) {
				return wpPackage;
			}
		}
		
		if (childModel instanceof ToolDefinition) {
			ToolDefinition toolDef = (ToolDefinition) childModel;
			ToolDefinitionPackage toolPackage = findToolDefinitionPackage((MethodContentPackage) Utils
					.getElement(parent));
			if (toolPackage != null) {
				return toolPackage;
			}
		}
		return Utils.getElement(parent);
	}

	/**
	 * 
	 * @param parent
	 * @return the TaskDefinitionPackage owned in the MethodContentPackage
	 *  @generated NOT
	 */
	private TaskDefinitionPackage findTaskDefinitionPackage(
			MethodContentPackage parent) {
		TaskDefinitionPackage result = null;
		for (MethodContentPackageableElement element : (List<MethodContentPackageableElement>) parent
				.getOwnedMethodContentMember()) {
			if (element instanceof TaskDefinitionPackage) {
				result = (TaskDefinitionPackage) element;
				break;
			}
		}
		return result;
	}

	/**
	 * 
	 * @param parent
	 * @return the RoleDefinitionPackage owned in the MethodContentPackage
	 *  @generated NOT
	 */
	private RoleDefinitionPackage findRoleDefinitionPackage(
			MethodContentPackage parent) {
		RoleDefinitionPackage result = null;
		for (MethodContentPackageableElement element : (List<MethodContentPackageableElement>) parent
				.getOwnedMethodContentMember()) {
			if (element instanceof RoleDefinitionPackage) {
				result = (RoleDefinitionPackage) element;
				break;
			}
		}
		return result;
	}

	/**
	 * 
	 * @param parent
	 * @return the WorkProductDefinitionPackage owned in the
	 *         MethodContentPackage
	 *          @generated NOT
	 */
	private WorkProductDefinitionPackage findWorkProductDefinitionPackage(
			MethodContentPackage parent) {
		WorkProductDefinitionPackage result = null;
		for (MethodContentPackageableElement element : (List<MethodContentPackageableElement>) parent
				.getOwnedMethodContentMember()) {
			if (element instanceof WorkProductDefinitionPackage) {
				result = (WorkProductDefinitionPackage) element;
				break;
			}
		}
		return result;
	}

	/**
	 *  @generated NOT
	 * @param parent
	 * @return
	 */
	private ToolDefinitionPackage findToolDefinitionPackage(
			MethodContentPackage parent) {
		ToolDefinitionPackage result = null;
		for (MethodContentPackageableElement element : (List<MethodContentPackageableElement>) parent
				.getOwnedMethodContentMember()) {
			if (element instanceof CategoryPackage) {
				CategoryPackage catPackage = (CategoryPackage) element;
				for (MethodContentPackageableElement element1 : (List<MethodContentPackageableElement>) catPackage
						.getOwnedMethodContentMember()) {
					if (element1 instanceof ToolDefinitionPackage) {
						result = (ToolDefinitionPackage) element1;
						return result;
					}
				}
				break;
			}
		}
		return result;
	}
}
