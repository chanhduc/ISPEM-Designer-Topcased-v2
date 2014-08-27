/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.topcased.spem.SpemPackage;
import org.topcased.spem.ToolDefinition;
import org.topcased.spem.WorkProductDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.spem.impl.ToolDefinitionImpl#getManagedWorkProduct <em>Managed Work Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToolDefinitionImpl extends MethodContentElementImpl implements ToolDefinition {
	/**
	 * The cached value of the '{@link #getManagedWorkProduct() <em>Managed Work Product</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedWorkProduct()
	 * @generated
	 * @ordered
	 */
	protected EList managedWorkProduct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SpemPackage.Literals.TOOL_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getManagedWorkProduct() {
		if (managedWorkProduct == null) {
			managedWorkProduct = new EObjectResolvingEList(WorkProductDefinition.class, this, SpemPackage.TOOL_DEFINITION__MANAGED_WORK_PRODUCT);
		}
		return managedWorkProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.TOOL_DEFINITION__MANAGED_WORK_PRODUCT:
				return getManagedWorkProduct();
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
			case SpemPackage.TOOL_DEFINITION__MANAGED_WORK_PRODUCT:
				getManagedWorkProduct().clear();
				getManagedWorkProduct().addAll((Collection)newValue);
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
			case SpemPackage.TOOL_DEFINITION__MANAGED_WORK_PRODUCT:
				getManagedWorkProduct().clear();
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
			case SpemPackage.TOOL_DEFINITION__MANAGED_WORK_PRODUCT:
				return managedWorkProduct != null && !managedWorkProduct.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ToolDefinitionImpl
