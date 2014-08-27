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
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.Category#getSubCategory <em>Sub Category</em>}</li>
 *   <li>{@link org.topcased.spem.Category#getCategorizedElement <em>Categorized Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.SpemPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends MethodContentElement {
	/**
	 * Returns the value of the '<em><b>Sub Category</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Category</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getCategory_SubCategory()
	 * @model type="org.topcased.spem.Category"
	 * @generated
	 */
	EList getSubCategory();

	/**
	 * Returns the value of the '<em><b>Categorized Element</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.DescribableElement}.
	 * It is bidirectional and its opposite is '{@link org.topcased.spem.DescribableElement#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorized Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorized Element</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getCategory_CategorizedElement()
	 * @see org.topcased.spem.DescribableElement#getCategory
	 * @model type="org.topcased.spem.DescribableElement" opposite="category"
	 * @generated
	 */
	EList getCategorizedElement();

} // Category
