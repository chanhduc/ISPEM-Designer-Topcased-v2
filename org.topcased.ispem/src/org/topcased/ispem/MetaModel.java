/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem;

import org.eclipse.emf.ecore.EPackage;

import org.topcased.spem.MethodContentElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.MetaModel#getEPackage <em>EPackage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getMetaModel()
 * @model
 * @generated
 */
public interface MetaModel extends MethodContentElement {
	/**
	 * Returns the value of the '<em><b>EPackage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EPackage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPackage</em>' containment reference.
	 * @see #setEPackage(EPackage)
	 * @see org.topcased.ispem.IspemPackage#getMetaModel_EPackage()
	 * @model containment="true"
	 * @generated
	 */
	EPackage getEPackage();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.MetaModel#getEPackage <em>EPackage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EPackage</em>' containment reference.
	 * @see #getEPackage()
	 * @generated
	 */
	void setEPackage(EPackage value);

} // MetaModel
