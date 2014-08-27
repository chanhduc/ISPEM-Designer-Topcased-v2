/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem;

import org.eclipse.emf.common.util.EList;

import org.topcased.spem.Category;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Development Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.DevelopmentMethod#getSupports <em>Supports</em>}</li>
 *   <li>{@link org.topcased.ispem.DevelopmentMethod#getDefines <em>Defines</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getDevelopmentMethod()
 * @model
 * @generated
 */
public interface DevelopmentMethod extends OntologyLinkedElement, Category {
	/**
	 * Returns the value of the '<em><b>Supports</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.ispem.Viewpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports</em>' reference list.
	 * @see org.topcased.ispem.IspemPackage#getDevelopmentMethod_Supports()
	 * @model type="org.topcased.ispem.Viewpoint"
	 * @generated
	 */
	EList getSupports();

	/**
	 * Returns the value of the '<em><b>Defines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defines</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defines</em>' reference.
	 * @see #setDefines(MethodTaskDefinition)
	 * @see org.topcased.ispem.IspemPackage#getDevelopmentMethod_Defines()
	 * @model
	 * @generated
	 */
	MethodTaskDefinition getDefines();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.DevelopmentMethod#getDefines <em>Defines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defines</em>' reference.
	 * @see #getDefines()
	 * @generated
	 */
	void setDefines(MethodTaskDefinition value);

} // DevelopmentMethod
