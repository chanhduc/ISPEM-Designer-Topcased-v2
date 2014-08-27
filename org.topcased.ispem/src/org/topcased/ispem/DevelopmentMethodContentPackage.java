/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem;

import org.topcased.spem.MethodContentPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Development Method Content Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.DevelopmentMethodContentPackage#getRelatedMethod <em>Related Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getDevelopmentMethodContentPackage()
 * @model
 * @generated
 */
public interface DevelopmentMethodContentPackage extends MethodContentPackage {
	/**
	 * Returns the value of the '<em><b>Related Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Method</em>' reference.
	 * @see #setRelatedMethod(DevelopmentMethod)
	 * @see org.topcased.ispem.IspemPackage#getDevelopmentMethodContentPackage_RelatedMethod()
	 * @model
	 * @generated
	 */
	DevelopmentMethod getRelatedMethod();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.DevelopmentMethodContentPackage#getRelatedMethod <em>Related Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Method</em>' reference.
	 * @see #getRelatedMethod()
	 * @generated
	 */
	void setRelatedMethod(DevelopmentMethod value);

} // DevelopmentMethodContentPackage
