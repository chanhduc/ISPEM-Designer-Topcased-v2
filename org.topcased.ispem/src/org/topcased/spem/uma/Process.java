/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.uma;

import org.eclipse.emf.common.util.EList;

import org.topcased.spem.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.uma.Process#getIncludedPattern <em>Included Pattern</em>}</li>
 *   <li>{@link org.topcased.spem.uma.Process#getScope <em>Scope</em>}</li>
 *   <li>{@link org.topcased.spem.uma.Process#getUsageNote <em>Usage Note</em>}</li>
 *   <li>{@link org.topcased.spem.uma.Process#getIncludedConnector <em>Included Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.uma.UmaPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends Activity {
	/**
	 * Returns the value of the '<em><b>Included Pattern</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.spem.uma.CapabilityPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Pattern</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Pattern</em>' containment reference list.
	 * @see org.topcased.spem.uma.UmaPackage#getProcess_IncludedPattern()
	 * @model type="org.topcased.spem.uma.CapabilityPattern" containment="true"
	 * @generated
	 */
	EList getIncludedPattern();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see org.topcased.spem.uma.UmaPackage#getProcess_Scope()
	 * @model
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link org.topcased.spem.uma.Process#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>Usage Note</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Note</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Note</em>' attribute list.
	 * @see org.topcased.spem.uma.UmaPackage#getProcess_UsageNote()
	 * @model
	 * @generated
	 */
	EList getUsageNote();

	/**
	 * Returns the value of the '<em><b>Included Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.spem.WorkProductPortConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Connector</em>' containment reference list.
	 * @see org.topcased.spem.uma.UmaPackage#getProcess_IncludedConnector()
	 * @model type="org.topcased.spem.WorkProductPortConnector" containment="true"
	 * @generated
	 */
	EList getIncludedConnector();

} // Process
