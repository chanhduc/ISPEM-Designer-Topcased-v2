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
 * A representation of the model object '<em><b>Role Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.RoleUse#getRole <em>Role</em>}</li>
 *   <li>{@link org.topcased.spem.RoleUse#getAppliedQualification <em>Applied Qualification</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.SpemPackage#getRoleUse()
 * @model
 * @generated
 */
public interface RoleUse extends MethodContentUse {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(RoleDefinition)
	 * @see org.topcased.spem.SpemPackage#getRoleUse_Role()
	 * @model
	 * @generated
	 */
	RoleDefinition getRole();

	/**
	 * Sets the value of the '{@link org.topcased.spem.RoleUse#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(RoleDefinition value);

	/**
	 * Returns the value of the '<em><b>Applied Qualification</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.Qualification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Qualification</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Qualification</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getRoleUse_AppliedQualification()
	 * @model type="org.topcased.spem.Qualification"
	 * @generated
	 */
	EList getAppliedQualification();

} // RoleUse
