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
 * A representation of the model object '<em><b>Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.Viewpoint#getCaracterizes <em>Caracterizes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getViewpoint()
 * @model
 * @generated
 */
public interface Viewpoint extends OntologyLinkedElement, MethodContentElement {
	/**
	 * Returns the value of the '<em><b>Caracterizes</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.ispem.DomainArtifactDefinition}.
	 * It is bidirectional and its opposite is '{@link org.topcased.ispem.DomainArtifactDefinition#getOrganized <em>Organized</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caracterizes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caracterizes</em>' reference list.
	 * @see org.topcased.ispem.IspemPackage#getViewpoint_Caracterizes()
	 * @see org.topcased.ispem.DomainArtifactDefinition#getOrganized
	 * @model type="org.topcased.ispem.DomainArtifactDefinition" opposite="organized"
	 * @generated
	 */
	EList getCaracterizes();

} // Viewpoint
