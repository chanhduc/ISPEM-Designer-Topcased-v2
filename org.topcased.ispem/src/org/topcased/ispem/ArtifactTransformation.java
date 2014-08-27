/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem;

import org.topcased.spem.BreakdownElement;
import org.topcased.spem.WorkProductUse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.ArtifactTransformation#getSource <em>Source</em>}</li>
 *   <li>{@link org.topcased.ispem.ArtifactTransformation#getTarget <em>Target</em>}</li>
 *   <li>{@link org.topcased.ispem.ArtifactTransformation#getTransformationFile <em>Transformation File</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getArtifactTransformation()
 * @model
 * @generated
 */
public interface ArtifactTransformation extends BreakdownElement, OntologyLinkedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Artifact)
	 * @see org.topcased.ispem.IspemPackage#getArtifactTransformation_Source()
	 * @model
	 * @generated
	 */
	Artifact getSource();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.ArtifactTransformation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Artifact value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Artifact)
	 * @see org.topcased.ispem.IspemPackage#getArtifactTransformation_Target()
	 * @model
	 * @generated
	 */
	Artifact getTarget();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.ArtifactTransformation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Artifact value);

	/**
	 * Returns the value of the '<em><b>Transformation File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation File</em>' attribute.
	 * @see #setTransformationFile(String)
	 * @see org.topcased.ispem.IspemPackage#getArtifactTransformation_TransformationFile()
	 * @model
	 * @generated
	 */
	String getTransformationFile();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.ArtifactTransformation#getTransformationFile <em>Transformation File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation File</em>' attribute.
	 * @see #getTransformationFile()
	 * @generated
	 */
	void setTransformationFile(String value);

} // ArtifactTransformation
