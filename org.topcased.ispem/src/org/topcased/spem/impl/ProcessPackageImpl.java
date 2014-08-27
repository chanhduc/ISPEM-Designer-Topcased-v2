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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.topcased.spem.ProcessPackage;
import org.topcased.spem.ProcessPackageableElement;
import org.topcased.spem.SpemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.spem.impl.ProcessPackageImpl#getOwnedProcessMember <em>Owned Process Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessPackageImpl extends ProcessPackageableElementImpl implements ProcessPackage {
	/**
	 * The cached value of the '{@link #getOwnedProcessMember() <em>Owned Process Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProcessMember()
	 * @generated
	 * @ordered
	 */
	protected EList ownedProcessMember;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SpemPackage.Literals.PROCESS_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedProcessMember() {
		if (ownedProcessMember == null) {
			ownedProcessMember = new EObjectContainmentEList(ProcessPackageableElement.class, this, SpemPackage.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER);
		}
		return ownedProcessMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemPackage.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER:
				return ((InternalEList)getOwnedProcessMember()).basicRemove(otherEnd, msgs);
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
			case SpemPackage.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER:
				return getOwnedProcessMember();
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
			case SpemPackage.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER:
				getOwnedProcessMember().clear();
				getOwnedProcessMember().addAll((Collection)newValue);
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
			case SpemPackage.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER:
				getOwnedProcessMember().clear();
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
			case SpemPackage.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER:
				return ownedProcessMember != null && !ownedProcessMember.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessPackageImpl
