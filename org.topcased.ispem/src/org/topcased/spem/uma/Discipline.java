/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.uma;

import org.eclipse.emf.common.util.EList;

import org.topcased.spem.Category;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discipline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.uma.Discipline#getRelatedTask <em>Related Task</em>}</li>
 *   <li>{@link org.topcased.spem.uma.Discipline#getRelatedWorflow <em>Related Worflow</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.uma.UmaPackage#getDiscipline()
 * @model
 * @generated
 */
public interface Discipline extends Category {
	/**
	 * Returns the value of the '<em><b>Related Task</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.TaskDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Task</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Task</em>' reference list.
	 * @see org.topcased.spem.uma.UmaPackage#getDiscipline_RelatedTask()
	 * @model type="org.topcased.spem.TaskDefinition"
	 * @generated
	 */
	EList getRelatedTask();

	/**
	 * Returns the value of the '<em><b>Related Worflow</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.uma.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Worflow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Worflow</em>' reference list.
	 * @see org.topcased.spem.uma.UmaPackage#getDiscipline_RelatedWorflow()
	 * @model type="org.topcased.spem.uma.Process"
	 * @generated
	 */
	EList getRelatedWorflow();

} // Discipline
