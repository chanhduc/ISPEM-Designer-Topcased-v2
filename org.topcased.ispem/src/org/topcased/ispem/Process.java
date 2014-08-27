/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem;

import org.topcased.spem.uma.CapabilityPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.Process#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends CapabilityPattern {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.topcased.ispem.Level}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see org.topcased.ispem.Level
	 * @see #setLevel(Level)
	 * @see org.topcased.ispem.IspemPackage#getProcess_Level()
	 * @model
	 * @generated
	 */
	Level getLevel();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.Process#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see org.topcased.ispem.Level
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Level value);

} // Process
