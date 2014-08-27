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
 * A representation of the model object '<em><b>Domain Content Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.DomainContentPackage#getRelatedDomain <em>Related Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getDomainContentPackage()
 * @model
 * @generated
 */
public interface DomainContentPackage extends MethodContentPackage {
	/**
	 * Returns the value of the '<em><b>Related Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Domain</em>' reference.
	 * @see #setRelatedDomain(EngineeringDomain)
	 * @see org.topcased.ispem.IspemPackage#getDomainContentPackage_RelatedDomain()
	 * @model
	 * @generated
	 */
	EngineeringDomain getRelatedDomain();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.DomainContentPackage#getRelatedDomain <em>Related Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Domain</em>' reference.
	 * @see #getRelatedDomain()
	 * @generated
	 */
	void setRelatedDomain(EngineeringDomain value);

} // DomainContentPackage
