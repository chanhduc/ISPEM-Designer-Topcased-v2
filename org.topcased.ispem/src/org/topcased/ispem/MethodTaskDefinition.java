/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Task Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.MethodTaskDefinition#getSpecializedBy <em>Specialized By</em>}</li>
 *   <li>{@link org.topcased.ispem.MethodTaskDefinition#getSpecializes <em>Specializes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getMethodTaskDefinition()
 * @model
 * @generated
 */
public interface MethodTaskDefinition extends TaskDefinition {
	/**
	 * Returns the value of the '<em><b>Specialized By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.topcased.ispem.DomainTaskDefinition#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specialized By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialized By</em>' reference.
	 * @see #setSpecializedBy(DomainTaskDefinition)
	 * @see org.topcased.ispem.IspemPackage#getMethodTaskDefinition_SpecializedBy()
	 * @see org.topcased.ispem.DomainTaskDefinition#getSpecializes
	 * @model opposite="specializes"
	 * @generated
	 */
	DomainTaskDefinition getSpecializedBy();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.MethodTaskDefinition#getSpecializedBy <em>Specialized By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialized By</em>' reference.
	 * @see #getSpecializedBy()
	 * @generated
	 */
	void setSpecializedBy(DomainTaskDefinition value);

	/**
	 * Returns the value of the '<em><b>Specializes</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.ispem.LanguageTaskDefinition}.
	 * It is bidirectional and its opposite is '{@link org.topcased.ispem.LanguageTaskDefinition#getSpecializedBy <em>Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specializes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes</em>' reference list.
	 * @see org.topcased.ispem.IspemPackage#getMethodTaskDefinition_Specializes()
	 * @see org.topcased.ispem.LanguageTaskDefinition#getSpecializedBy
	 * @model type="org.topcased.ispem.LanguageTaskDefinition" opposite="specializedBy"
	 * @generated
	 */
	EList getSpecializes();

} // MethodTaskDefinition
