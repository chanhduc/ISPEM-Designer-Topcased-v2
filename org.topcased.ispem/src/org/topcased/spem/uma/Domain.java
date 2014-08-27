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
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.uma.Domain#getRelatedProduct <em>Related Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.uma.UmaPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends Category {
	/**
	 * Returns the value of the '<em><b>Related Product</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.WorkProductDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Product</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Product</em>' reference list.
	 * @see org.topcased.spem.uma.UmaPackage#getDomain_RelatedProduct()
	 * @model type="org.topcased.spem.WorkProductDefinition"
	 * @generated
	 */
	EList getRelatedProduct();

} // Domain
