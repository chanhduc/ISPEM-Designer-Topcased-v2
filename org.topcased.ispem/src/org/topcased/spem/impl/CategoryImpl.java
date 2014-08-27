/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.topcased.spem.Category;
import org.topcased.spem.DescribableElement;
import org.topcased.spem.SpemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.spem.impl.CategoryImpl#getSubCategory <em>Sub Category</em>}</li>
 *   <li>{@link org.topcased.spem.impl.CategoryImpl#getCategorizedElement <em>Categorized Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryImpl extends MethodContentElementImpl implements Category {
	/**
	 * The cached value of the '{@link #getSubCategory() <em>Sub Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory()
	 * @generated
	 * @ordered
	 */
	protected EList subCategory;

	/**
	 * The cached value of the '{@link #getCategorizedElement() <em>Categorized Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorizedElement()
	 * @generated
	 * @ordered
	 */
	protected EList categorizedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SpemPackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubCategory() {
		if (subCategory == null) {
			subCategory = new EObjectResolvingEList(Category.class, this, SpemPackage.CATEGORY__SUB_CATEGORY);
		}
		return subCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCategorizedElement() {
		if (categorizedElement == null) {
			categorizedElement = new EObjectWithInverseResolvingEList.ManyInverse(DescribableElement.class, this, SpemPackage.CATEGORY__CATEGORIZED_ELEMENT, SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY);
		}
		return categorizedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemPackage.CATEGORY__CATEGORIZED_ELEMENT:
				return ((InternalEList)getCategorizedElement()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemPackage.CATEGORY__CATEGORIZED_ELEMENT:
				return ((InternalEList)getCategorizedElement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.CATEGORY__SUB_CATEGORY:
				return getSubCategory();
			case SpemPackage.CATEGORY__CATEGORIZED_ELEMENT:
				return getCategorizedElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpemPackage.CATEGORY__SUB_CATEGORY:
				getSubCategory().clear();
				getSubCategory().addAll((Collection)newValue);
				return;
			case SpemPackage.CATEGORY__CATEGORIZED_ELEMENT:
				getCategorizedElement().clear();
				getCategorizedElement().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpemPackage.CATEGORY__SUB_CATEGORY:
				getSubCategory().clear();
				return;
			case SpemPackage.CATEGORY__CATEGORIZED_ELEMENT:
				getCategorizedElement().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpemPackage.CATEGORY__SUB_CATEGORY:
				return subCategory != null && !subCategory.isEmpty();
			case SpemPackage.CATEGORY__CATEGORIZED_ELEMENT:
				return categorizedElement != null && !categorizedElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CategoryImpl
