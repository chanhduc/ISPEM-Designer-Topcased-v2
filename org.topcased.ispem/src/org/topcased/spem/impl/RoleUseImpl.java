/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.topcased.spem.Qualification;
import org.topcased.spem.RoleDefinition;
import org.topcased.spem.RoleUse;
import org.topcased.spem.SpemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.spem.impl.RoleUseImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.topcased.spem.impl.RoleUseImpl#getAppliedQualification <em>Applied Qualification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleUseImpl extends MethodContentUseImpl implements RoleUse {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected RoleDefinition role;

	/**
	 * The cached value of the '{@link #getAppliedQualification() <em>Applied Qualification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedQualification()
	 * @generated
	 * @ordered
	 */
	protected EList appliedQualification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SpemPackage.Literals.ROLE_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleDefinition getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (RoleDefinition)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.ROLE_USE__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleDefinition basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(RoleDefinition newRole) {
		RoleDefinition oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.ROLE_USE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAppliedQualification() {
		if (appliedQualification == null) {
			appliedQualification = new EObjectResolvingEList(Qualification.class, this, SpemPackage.ROLE_USE__APPLIED_QUALIFICATION);
		}
		return appliedQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.ROLE_USE__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case SpemPackage.ROLE_USE__APPLIED_QUALIFICATION:
				return getAppliedQualification();
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
			case SpemPackage.ROLE_USE__ROLE:
				setRole((RoleDefinition)newValue);
				return;
			case SpemPackage.ROLE_USE__APPLIED_QUALIFICATION:
				getAppliedQualification().clear();
				getAppliedQualification().addAll((Collection)newValue);
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
			case SpemPackage.ROLE_USE__ROLE:
				setRole((RoleDefinition)null);
				return;
			case SpemPackage.ROLE_USE__APPLIED_QUALIFICATION:
				getAppliedQualification().clear();
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
			case SpemPackage.ROLE_USE__ROLE:
				return role != null;
			case SpemPackage.ROLE_USE__APPLIED_QUALIFICATION:
				return appliedQualification != null && !appliedQualification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleUseImpl
