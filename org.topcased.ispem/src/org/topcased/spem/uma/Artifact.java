/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.uma;

import org.eclipse.emf.common.util.EList;

import org.topcased.spem.WorkProductUse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.uma.Artifact#getContainedArtifact <em>Contained Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.uma.UmaPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends WorkProductUse {
	/**
	 * Returns the value of the '<em><b>Contained Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.spem.uma.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Artifact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Artifact</em>' containment reference list.
	 * @see org.topcased.spem.uma.UmaPackage#getArtifact_ContainedArtifact()
	 * @model type="org.topcased.spem.uma.Artifact" containment="true"
	 * @generated
	 */
	EList getContainedArtifact();

} // Artifact
