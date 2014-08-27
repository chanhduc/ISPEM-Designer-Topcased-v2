/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem;

import org.eclipse.emf.common.util.EList;

import org.topcased.spem.MethodContentElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engineering Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.EngineeringDomain#getViewpoints <em>Viewpoints</em>}</li>
 *   <li>{@link org.topcased.ispem.EngineeringDomain#getDefines <em>Defines</em>}</li>
 *   <li>{@link org.topcased.ispem.EngineeringDomain#getRealizes <em>Realizes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getEngineeringDomain()
 * @model
 * @generated
 */
public interface EngineeringDomain extends OntologyLinkedElement, MethodContentElement {
	/**
	 * Returns the value of the '<em><b>Viewpoints</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.ispem.Viewpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Viewpoints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewpoints</em>' containment reference list.
	 * @see org.topcased.ispem.IspemPackage#getEngineeringDomain_Viewpoints()
	 * @model type="org.topcased.ispem.Viewpoint" containment="true"
	 * @generated
	 */
	EList getViewpoints();

	/**
	 * Returns the value of the '<em><b>Defines</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.ispem.DomainTaskDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defines</em>' reference list.
	 * @see org.topcased.ispem.IspemPackage#getEngineeringDomain_Defines()
	 * @model type="org.topcased.ispem.DomainTaskDefinition"
	 * @generated
	 */
	EList getDefines();

	/**
	 * Returns the value of the '<em><b>Realizes</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.ispem.DevelopmentMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes</em>' reference list.
	 * @see org.topcased.ispem.IspemPackage#getEngineeringDomain_Realizes()
	 * @model type="org.topcased.ispem.DevelopmentMethod"
	 * @generated
	 */
	EList getRealizes();

} // EngineeringDomain
