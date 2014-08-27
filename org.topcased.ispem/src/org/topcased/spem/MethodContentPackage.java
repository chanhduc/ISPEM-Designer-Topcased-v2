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
 * A representation of the model object '<em><b>Method Content Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.MethodContentPackage#getOwnedMethodContentMember <em>Owned Method Content Member</em>}</li>
 *   <li>{@link org.topcased.spem.MethodContentPackage#getReusedPackage <em>Reused Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.SpemPackage#getMethodContentPackage()
 * @model
 * @generated
 */
public interface MethodContentPackage extends MethodContentPackageableElement, MethodPluginPackageableElement {
	/**
	 * Returns the value of the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.spem.MethodContentPackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Method Content Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Method Content Member</em>' containment reference list.
	 * @see org.topcased.spem.SpemPackage#getMethodContentPackage_OwnedMethodContentMember()
	 * @model type="org.topcased.spem.MethodContentPackageableElement" containment="true"
	 * @generated
	 */
	EList getOwnedMethodContentMember();

	/**
	 * Returns the value of the '<em><b>Reused Package</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.MethodContentPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reused Package</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reused Package</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getMethodContentPackage_ReusedPackage()
	 * @model type="org.topcased.spem.MethodContentPackage"
	 * @generated
	 */
	EList getReusedPackage();

} // MethodContentPackage
