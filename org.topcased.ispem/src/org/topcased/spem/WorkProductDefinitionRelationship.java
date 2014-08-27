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
 * A representation of the model object '<em><b>Work Product Definition Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.WorkProductDefinitionRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link org.topcased.spem.WorkProductDefinitionRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.SpemPackage#getWorkProductDefinitionRelationship()
 * @model
 * @generated
 */
public interface WorkProductDefinitionRelationship extends MethodContentElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(WorkProductDefinition)
	 * @see org.topcased.spem.SpemPackage#getWorkProductDefinitionRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	WorkProductDefinition getSource();

	/**
	 * Sets the value of the '{@link org.topcased.spem.WorkProductDefinitionRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(WorkProductDefinition value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.WorkProductDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getWorkProductDefinitionRelationship_Target()
	 * @model type="org.topcased.spem.WorkProductDefinition" required="true"
	 * @generated
	 */
	EList getTarget();

} // WorkProductDefinitionRelationship
