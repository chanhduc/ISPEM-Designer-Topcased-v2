/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Task Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.LanguageTaskDefinition#getSpecializedBy <em>Specialized By</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getLanguageTaskDefinition()
 * @model
 * @generated
 */
public interface LanguageTaskDefinition extends TaskDefinition {
	/**
	 * Returns the value of the '<em><b>Specialized By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.topcased.ispem.MethodTaskDefinition#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specialized By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialized By</em>' reference.
	 * @see #setSpecializedBy(MethodTaskDefinition)
	 * @see org.topcased.ispem.IspemPackage#getLanguageTaskDefinition_SpecializedBy()
	 * @see org.topcased.ispem.MethodTaskDefinition#getSpecializes
	 * @model opposite="specializes"
	 * @generated
	 */
	MethodTaskDefinition getSpecializedBy();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.LanguageTaskDefinition#getSpecializedBy <em>Specialized By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialized By</em>' reference.
	 * @see #getSpecializedBy()
	 * @generated
	 */
	void setSpecializedBy(MethodTaskDefinition value);

} // LanguageTaskDefinition
