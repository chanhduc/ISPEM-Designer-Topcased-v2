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
 * A representation of the model object '<em><b>Default Task Definition Performer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.Default_TaskDefinitionPerformer#getLinkedTaskDefinition <em>Linked Task Definition</em>}</li>
 *   <li>{@link org.topcased.spem.Default_TaskDefinitionPerformer#getLinkedRoleDefinition <em>Linked Role Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.SpemPackage#getDefault_TaskDefinitionPerformer()
 * @model
 * @generated
 */
public interface Default_TaskDefinitionPerformer extends MethodContentElement {
	/**
	 * Returns the value of the '<em><b>Linked Task Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Task Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Task Definition</em>' reference.
	 * @see #setLinkedTaskDefinition(TaskDefinition)
	 * @see org.topcased.spem.SpemPackage#getDefault_TaskDefinitionPerformer_LinkedTaskDefinition()
	 * @model required="true"
	 * @generated
	 */
	TaskDefinition getLinkedTaskDefinition();

	/**
	 * Sets the value of the '{@link org.topcased.spem.Default_TaskDefinitionPerformer#getLinkedTaskDefinition <em>Linked Task Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Task Definition</em>' reference.
	 * @see #getLinkedTaskDefinition()
	 * @generated
	 */
	void setLinkedTaskDefinition(TaskDefinition value);

	/**
	 * Returns the value of the '<em><b>Linked Role Definition</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.RoleDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Role Definition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Role Definition</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getDefault_TaskDefinitionPerformer_LinkedRoleDefinition()
	 * @model type="org.topcased.spem.RoleDefinition" required="true"
	 * @generated
	 */
	EList getLinkedRoleDefinition();

} // Default_TaskDefinitionPerformer
