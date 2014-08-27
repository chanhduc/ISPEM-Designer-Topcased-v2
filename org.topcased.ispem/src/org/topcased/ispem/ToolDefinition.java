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
 * A representation of the model object '<em><b>Tool Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.ToolDefinition#getSupportedEngineringDomain <em>Supported Enginering Domain</em>}</li>
 *   <li>{@link org.topcased.ispem.ToolDefinition#getSupportedRepresentativeLanguage <em>Supported Representative Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getToolDefinition()
 * @model
 * @generated
 */
public interface ToolDefinition extends org.topcased.spem.ToolDefinition, OntologyLinkedElement {
	/**
	 * Returns the value of the '<em><b>Supported Enginering Domain</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.ispem.EngineeringDomain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Enginering Domain</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Enginering Domain</em>' reference list.
	 * @see org.topcased.ispem.IspemPackage#getToolDefinition_SupportedEngineringDomain()
	 * @model type="org.topcased.ispem.EngineeringDomain" required="true"
	 * @generated
	 */
	EList getSupportedEngineringDomain();

	/**
	 * Returns the value of the '<em><b>Supported Representative Language</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.ispem.RepresentativeLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Representative Language</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Representative Language</em>' reference list.
	 * @see org.topcased.ispem.IspemPackage#getToolDefinition_SupportedRepresentativeLanguage()
	 * @model type="org.topcased.ispem.RepresentativeLanguage"
	 * @generated
	 */
	EList getSupportedRepresentativeLanguage();

} // ToolDefinition
