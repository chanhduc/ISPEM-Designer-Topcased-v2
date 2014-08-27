/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.Activity#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends org.topcased.spem.Activity, OntologyLinkedElement {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(EngineeringDomain)
	 * @see org.topcased.ispem.IspemPackage#getActivity_Context()
	 * @model
	 * @generated
	 */
	EngineeringDomain getContext();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.Activity#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(EngineeringDomain value);

} // Activity
