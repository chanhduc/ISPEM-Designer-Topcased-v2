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
 * A representation of the model object '<em><b>Process Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.ProcessComponent#getProcess <em>Process</em>}</li>
 *   <li>{@link org.topcased.spem.ProcessComponent#getOwnedPort <em>Owned Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.SpemPackage#getProcessComponent()
 * @model
 * @generated
 */
public interface ProcessComponent extends ProcessPackage {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference.
	 * @see #setProcess(Activity)
	 * @see org.topcased.spem.SpemPackage#getProcessComponent_Process()
	 * @model containment="true"
	 * @generated
	 */
	Activity getProcess();

	/**
	 * Sets the value of the '{@link org.topcased.spem.ProcessComponent#getProcess <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' containment reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(Activity value);

	/**
	 * Returns the value of the '<em><b>Owned Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.spem.WorkProductPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Port</em>' containment reference list.
	 * @see org.topcased.spem.SpemPackage#getProcessComponent_OwnedPort()
	 * @model type="org.topcased.spem.WorkProductPort" containment="true"
	 * @generated
	 */
	EList getOwnedPort();

} // ProcessComponent
