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
 * A representation of the model object '<em><b>Work Product Port Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.WorkProductPortConnector#getConnectedPort <em>Connected Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.SpemPackage#getWorkProductPortConnector()
 * @model
 * @generated
 */
public interface WorkProductPortConnector extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Connected Port</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.WorkProductPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Port</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getWorkProductPortConnector_ConnectedPort()
	 * @model type="org.topcased.spem.WorkProductPort"
	 * @generated
	 */
	EList getConnectedPort();

} // WorkProductPortConnector
