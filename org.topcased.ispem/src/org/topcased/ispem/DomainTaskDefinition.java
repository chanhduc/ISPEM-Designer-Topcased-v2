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
 * A representation of the model object '<em><b>Domain Task Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.DomainTaskDefinition#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link org.topcased.ispem.DomainTaskDefinition#getApplies <em>Applies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getDomainTaskDefinition()
 * @model
 * @generated
 */
public interface DomainTaskDefinition extends TaskDefinition {
	/**
	 * Returns the value of the '<em><b>Specializes</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.ispem.MethodTaskDefinition}.
	 * It is bidirectional and its opposite is '{@link org.topcased.ispem.MethodTaskDefinition#getSpecializedBy <em>Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specializes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes</em>' reference list.
	 * @see org.topcased.ispem.IspemPackage#getDomainTaskDefinition_Specializes()
	 * @see org.topcased.ispem.MethodTaskDefinition#getSpecializedBy
	 * @model type="org.topcased.ispem.MethodTaskDefinition" opposite="specializedBy"
	 * @generated
	 */
	EList getSpecializes();

	/**
	 * Returns the value of the '<em><b>Applies</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.ispem.Viewpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies</em>' reference list.
	 * @see org.topcased.ispem.IspemPackage#getDomainTaskDefinition_Applies()
	 * @model type="org.topcased.ispem.Viewpoint"
	 * @generated
	 */
	EList getApplies();

} // DomainTaskDefinition
