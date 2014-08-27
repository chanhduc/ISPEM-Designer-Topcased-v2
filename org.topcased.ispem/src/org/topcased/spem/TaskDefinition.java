/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.TaskDefinition#getOwnedTaskDefinitionParameter <em>Owned Task Definition Parameter</em>}</li>
 *   <li>{@link org.topcased.spem.TaskDefinition#getStep <em>Step</em>}</li>
 *   <li>{@link org.topcased.spem.TaskDefinition#getRequiredQualification <em>Required Qualification</em>}</li>
 *   <li>{@link org.topcased.spem.TaskDefinition#getUsedTool <em>Used Tool</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.SpemPackage#getTaskDefinition()
 * @model
 * @generated
 */
public interface TaskDefinition extends WorkDefinition, MethodContentElement {
	/**
	 * Returns the value of the '<em><b>Owned Task Definition Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.spem.Default_TaskDefinitionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Task Definition Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Task Definition Parameter</em>' containment reference list.
	 * @see org.topcased.spem.SpemPackage#getTaskDefinition_OwnedTaskDefinitionParameter()
	 * @model type="org.topcased.spem.Default_TaskDefinitionParameter" containment="true"
	 * @generated
	 */
	EList getOwnedTaskDefinitionParameter();

	/**
	 * Returns the value of the '<em><b>Used Tool</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.ToolDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Tool</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Tool</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getTaskDefinition_UsedTool()
	 * @model type="org.topcased.spem.ToolDefinition"
	 * @generated
	 */
	EList getUsedTool();

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.spem.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see org.topcased.spem.SpemPackage#getTaskDefinition_Step()
	 * @model type="org.topcased.spem.Step" containment="true"
	 * @generated
	 */
	EList getStep();

	/**
	 * Returns the value of the '<em><b>Required Qualification</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.Qualification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Qualification</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Qualification</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getTaskDefinition_RequiredQualification()
	 * @model type="org.topcased.spem.Qualification"
	 * @generated
	 */
	EList getRequiredQualification();

} // TaskDefinition
