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
 * A representation of the model object '<em><b>Domain Artifact Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.DomainArtifactDefinition#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link org.topcased.ispem.DomainArtifactDefinition#getOrganized <em>Organized</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getDomainArtifactDefinition()
 * @model
 * @generated
 */
public interface DomainArtifactDefinition extends ArtifactDefinition {
	/**
	 * Returns the value of the '<em><b>Specializes</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.ispem.MethodArtifactDefinition}.
	 * It is bidirectional and its opposite is '{@link org.topcased.ispem.MethodArtifactDefinition#getSpecializedBy <em>Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specializes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes</em>' reference list.
	 * @see org.topcased.ispem.IspemPackage#getDomainArtifactDefinition_Specializes()
	 * @see org.topcased.ispem.MethodArtifactDefinition#getSpecializedBy
	 * @model type="org.topcased.ispem.MethodArtifactDefinition" opposite="specializedBy"
	 * @generated
	 */
	EList getSpecializes();

	/**
	 * Returns the value of the '<em><b>Organized</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.ispem.Viewpoint}.
	 * It is bidirectional and its opposite is '{@link org.topcased.ispem.Viewpoint#getCaracterizes <em>Caracterizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organized</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organized</em>' reference list.
	 * @see org.topcased.ispem.IspemPackage#getDomainArtifactDefinition_Organized()
	 * @see org.topcased.ispem.Viewpoint#getCaracterizes
	 * @model type="org.topcased.ispem.Viewpoint" opposite="caracterizes"
	 * @generated
	 */
	EList getOrganized();

} // DomainArtifactDefinition
