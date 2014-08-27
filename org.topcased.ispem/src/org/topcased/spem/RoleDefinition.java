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
 * A representation of the model object '<em><b>Role Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.RoleDefinition#getSynonym <em>Synonym</em>}</li>
 *   <li>{@link org.topcased.spem.RoleDefinition#getProvidedQualification <em>Provided Qualification</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.SpemPackage#getRoleDefinition()
 * @model
 * @generated
 */
public interface RoleDefinition extends MethodContentElement {
	/**
	 * Returns the value of the '<em><b>Synonym</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synonym</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synonym</em>' attribute list.
	 * @see org.topcased.spem.SpemPackage#getRoleDefinition_Synonym()
	 * @model
	 * @generated
	 */
	EList getSynonym();

	/**
	 * Returns the value of the '<em><b>Provided Qualification</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.Qualification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Qualification</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Qualification</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getRoleDefinition_ProvidedQualification()
	 * @model type="org.topcased.spem.Qualification"
	 * @generated
	 */
	EList getProvidedQualification();

} // RoleDefinition
