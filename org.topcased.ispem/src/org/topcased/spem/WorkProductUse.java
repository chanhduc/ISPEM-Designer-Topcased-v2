/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Product Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.WorkProductUse#getWorkProduct <em>Work Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.SpemPackage#getWorkProductUse()
 * @model
 * @generated
 */
public interface WorkProductUse extends MethodContentUse {
	/**
	 * Returns the value of the '<em><b>Work Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Product</em>' reference.
	 * @see #setWorkProduct(WorkProductDefinition)
	 * @see org.topcased.spem.SpemPackage#getWorkProductUse_WorkProduct()
	 * @model
	 * @generated
	 */
	WorkProductDefinition getWorkProduct();

	/**
	 * Sets the value of the '{@link org.topcased.spem.WorkProductUse#getWorkProduct <em>Work Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Product</em>' reference.
	 * @see #getWorkProduct()
	 * @generated
	 */
	void setWorkProduct(WorkProductDefinition value);

} // WorkProductUse
