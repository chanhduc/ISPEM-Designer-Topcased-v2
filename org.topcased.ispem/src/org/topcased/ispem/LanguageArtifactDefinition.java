/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Artifact Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.LanguageArtifactDefinition#getSpecializedBy <em>Specialized By</em>}</li>
 *   <li>{@link org.topcased.ispem.LanguageArtifactDefinition#getRepresentedBy <em>Represented By</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getLanguageArtifactDefinition()
 * @model
 * @generated
 */
public interface LanguageArtifactDefinition extends ArtifactDefinition {
	/**
	 * Returns the value of the '<em><b>Specialized By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.topcased.ispem.MethodArtifactDefinition#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specialized By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialized By</em>' reference.
	 * @see #setSpecializedBy(MethodArtifactDefinition)
	 * @see org.topcased.ispem.IspemPackage#getLanguageArtifactDefinition_SpecializedBy()
	 * @see org.topcased.ispem.MethodArtifactDefinition#getSpecializes
	 * @model opposite="specializes"
	 * @generated
	 */
	MethodArtifactDefinition getSpecializedBy();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.LanguageArtifactDefinition#getSpecializedBy <em>Specialized By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialized By</em>' reference.
	 * @see #getSpecializedBy()
	 * @generated
	 */
	void setSpecializedBy(MethodArtifactDefinition value);

	/**
	 * Returns the value of the '<em><b>Represented By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represented By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represented By</em>' reference.
	 * @see #setRepresentedBy(RepresentativeLanguage)
	 * @see org.topcased.ispem.IspemPackage#getLanguageArtifactDefinition_RepresentedBy()
	 * @model
	 * @generated
	 */
	RepresentativeLanguage getRepresentedBy();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.LanguageArtifactDefinition#getRepresentedBy <em>Represented By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represented By</em>' reference.
	 * @see #getRepresentedBy()
	 * @generated
	 */
	void setRepresentedBy(RepresentativeLanguage value);

} // LanguageArtifactDefinition
