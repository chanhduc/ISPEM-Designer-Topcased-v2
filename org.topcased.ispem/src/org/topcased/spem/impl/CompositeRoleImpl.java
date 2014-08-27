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

import org.topcased.spem.CompositeRole;
import org.topcased.spem.RoleDefinition;
import org.topcased.spem.SpemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.spem.impl.CompositeRoleImpl#getAggregatedRole <em>Aggregated Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeRoleImpl extends RoleUseImpl implements CompositeRole {
	/**
	 * The cached value of the '{@link #getAggregatedRole() <em>Aggregated Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregatedRole()
	 * @generated
	 * @ordered
	 */
	protected EList aggregatedRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SpemPackage.Literals.COMPOSITE_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAggregatedRole() {
		if (aggregatedRole == null) {
			aggregatedRole = new EObjectResolvingEList(RoleDefinition.class, this, SpemPackage.COMPOSITE_ROLE__AGGREGATED_ROLE);
		}
		return aggregatedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.COMPOSITE_ROLE__AGGREGATED_ROLE:
				return getAggregatedRole();
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
			case SpemPackage.COMPOSITE_ROLE__AGGREGATED_ROLE:
				getAggregatedRole().clear();
				getAggregatedRole().addAll((Collection)newValue);
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
			case SpemPackage.COMPOSITE_ROLE__AGGREGATED_ROLE:
				getAggregatedRole().clear();
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
			case SpemPackage.COMPOSITE_ROLE__AGGREGATED_ROLE:
				return aggregatedRole != null && !aggregatedRole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeRoleImpl
