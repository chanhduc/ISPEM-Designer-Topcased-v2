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
 * A representation of the model object '<em><b>Tool Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.ToolDefinition#getManagedWorkProduct <em>Managed Work Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.SpemPackage#getToolDefinition()
 * @model
 * @generated
 */
public interface ToolDefinition extends MethodContentElement {
	/**
	 * Returns the value of the '<em><b>Managed Work Product</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.WorkProductDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managed Work Product</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed Work Product</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getToolDefinition_ManagedWorkProduct()
	 * @model type="org.topcased.spem.WorkProductDefinition"
	 * @generated
	 */
	EList getManagedWorkProduct();

} // ToolDefinition
