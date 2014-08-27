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
 * A representation of the model object '<em><b>Method Artifact Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.MethodArtifactDefinition#getSpecializedBy <em>Specialized By</em>}</li>
 *   <li>{@link org.topcased.ispem.MethodArtifactDefinition#getSpecializes <em>Specializes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getMethodArtifactDefinition()
 * @model
 * @generated
 */
public interface MethodArtifactDefinition extends ArtifactDefinition {
	/**
	 * Returns the value of the '<em><b>Specialized By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.topcased.ispem.DomainArtifactDefinition#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specialized By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialized By</em>' reference.
	 * @see #setSpecializedBy(DomainArtifactDefinition)
	 * @see org.topcased.ispem.IspemPackage#getMethodArtifactDefinition_SpecializedBy()
	 * @see org.topcased.ispem.DomainArtifactDefinition#getSpecializes
	 * @model opposite="specializes"
	 * @generated
	 */
	DomainArtifactDefinition getSpecializedBy();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.MethodArtifactDefinition#getSpecializedBy <em>Specialized By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialized By</em>' reference.
	 * @see #getSpecializedBy()
	 * @generated
	 */
	void setSpecializedBy(DomainArtifactDefinition value);

	/**
	 * Returns the value of the '<em><b>Specializes</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.ispem.LanguageArtifactDefinition}.
	 * It is bidirectional and its opposite is '{@link org.topcased.ispem.LanguageArtifactDefinition#getSpecializedBy <em>Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specializes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes</em>' reference list.
	 * @see org.topcased.ispem.IspemPackage#getMethodArtifactDefinition_Specializes()
	 * @see org.topcased.ispem.LanguageArtifactDefinition#getSpecializedBy
	 * @model type="org.topcased.ispem.LanguageArtifactDefinition" opposite="specializedBy"
	 * @generated
	 */
	EList getSpecializes();

} // MethodArtifactDefinition
