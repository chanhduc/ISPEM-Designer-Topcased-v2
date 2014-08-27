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
 * A representation of the model object '<em><b>Task Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.TaskUse#getTask <em>Task</em>}</li>
 *   <li>{@link org.topcased.spem.TaskUse#getUsedQualification <em>Used Qualification</em>}</li>
 *   <li>{@link org.topcased.spem.TaskUse#getSelectedStep <em>Selected Step</em>}</li>
 *   <li>{@link org.topcased.spem.TaskUse#getOwnedProcessParameter <em>Owned Process Parameter</em>}</li>
 *   <li>{@link org.topcased.spem.TaskUse#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link org.topcased.spem.TaskUse#getPostCondition <em>Post Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.SpemPackage#getTaskUse()
 * @model
 * @generated
 */
public interface TaskUse extends MethodContentUse, WorkBreakdownElement {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(TaskDefinition)
	 * @see org.topcased.spem.SpemPackage#getTaskUse_Task()
	 * @model
	 * @generated
	 */
	TaskDefinition getTask();

	/**
	 * Sets the value of the '{@link org.topcased.spem.TaskUse#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(TaskDefinition value);

	/**
	 * Returns the value of the '<em><b>Used Qualification</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.Qualification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Qualification</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Qualification</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getTaskUse_UsedQualification()
	 * @model type="org.topcased.spem.Qualification"
	 * @generated
	 */
	EList getUsedQualification();

	/**
	 * Returns the value of the '<em><b>Selected Step</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Step</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Step</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getTaskUse_SelectedStep()
	 * @model type="org.topcased.spem.Step"
	 * @generated
	 */
	EList getSelectedStep();

	/**
	 * Returns the value of the '<em><b>Owned Process Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.spem.ProcessParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Process Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Process Parameter</em>' containment reference list.
	 * @see org.topcased.spem.SpemPackage#getTaskUse_OwnedProcessParameter()
	 * @model type="org.topcased.spem.ProcessParameter" containment="true"
	 * @generated
	 */
	EList getOwnedProcessParameter();

	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Condition</em>' attribute.
	 * @see #setPreCondition(String)
	 * @see org.topcased.spem.SpemPackage#getTaskUse_PreCondition()
	 * @model
	 * @generated
	 */
	String getPreCondition();

	/**
	 * Sets the value of the '{@link org.topcased.spem.TaskUse#getPreCondition <em>Pre Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition</em>' attribute.
	 * @see #getPreCondition()
	 * @generated
	 */
	void setPreCondition(String value);

	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Condition</em>' attribute.
	 * @see #setPostCondition(String)
	 * @see org.topcased.spem.SpemPackage#getTaskUse_PostCondition()
	 * @model
	 * @generated
	 */
	String getPostCondition();

	/**
	 * Sets the value of the '{@link org.topcased.spem.TaskUse#getPostCondition <em>Post Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Condition</em>' attribute.
	 * @see #getPostCondition()
	 * @generated
	 */
	void setPostCondition(String value);

} // TaskUse
