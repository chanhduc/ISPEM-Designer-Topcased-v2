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

import org.topcased.spem.ProcessResponsibilityAssignment;
import org.topcased.spem.RoleUse;
import org.topcased.spem.SpemPackage;
import org.topcased.spem.WorkProductUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Responsibility Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.spem.impl.ProcessResponsibilityAssignmentImpl#getLinkedRoleUse <em>Linked Role Use</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessResponsibilityAssignmentImpl#getLinkedWorkProductUse <em>Linked Work Product Use</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessResponsibilityAssignmentImpl extends BreakdownElementImpl implements ProcessResponsibilityAssignment {
	/**
	 * The cached value of the '{@link #getLinkedRoleUse() <em>Linked Role Use</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedRoleUse()
	 * @generated
	 * @ordered
	 */
	protected EList linkedRoleUse;

	/**
	 * The cached value of the '{@link #getLinkedWorkProductUse() <em>Linked Work Product Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedWorkProductUse()
	 * @generated
	 * @ordered
	 */
	protected WorkProductUse linkedWorkProductUse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessResponsibilityAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SpemPackage.Literals.PROCESS_RESPONSIBILITY_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLinkedRoleUse() {
		if (linkedRoleUse == null) {
			linkedRoleUse = new EObjectResolvingEList(RoleUse.class, this, SpemPackage.PROCESS_RESPONSIBILITY_ASSIGNMENT__LINKED_ROLE_USE);
		}
		return linkedRoleUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductUse getLinkedWorkProductUse() {
		if (linkedWorkProductUse != null && linkedWorkProductUse.eIsProxy()) {
			InternalEObject oldLinkedWorkProductUse = (InternalEObject)linkedWorkProductUse;
			linkedWorkProductUse = (WorkProductUse)eResolveProxy(oldLinkedWorkProductUse);
			if (linkedWorkProductUse != oldLinkedWorkProductUse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.PROCESS_RESPONSIBILITY_ASSIGNMENT__LINKED_WORK_PRODUCT_USE, oldLinkedWorkProductUse, linkedWorkProductUse));
			}
		}
		return linkedWorkProductUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductUse basicGetLinkedWorkProductUse() {
		return linkedWorkProductUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedWorkProductUse(WorkProductUse newLinkedWorkProductUse) {
		WorkProductUse oldLinkedWorkProductUse = linkedWorkProductUse;
		linkedWorkProductUse = newLinkedWorkProductUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_RESPONSIBILITY_ASSIGNMENT__LINKED_WORK_PRODUCT_USE, oldLinkedWorkProductUse, linkedWorkProductUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.PROCESS_RESPONSIBILITY_ASSIGNMENT__LINKED_ROLE_USE:
				return getLinkedRoleUse();
			case SpemPackage.PROCESS_RESPONSIBILITY_ASSIGNMENT__LINKED_WORK_PRODUCT_USE:
				if (resolve) return getLinkedWorkProductUse();
				return basicGetLinkedWorkProductUse();
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
			case SpemPackage.PROCESS_RESPONSIBILITY_ASSIGNMENT__LINKED_ROLE_USE:
				getLinkedRoleUse().clear();
				getLinkedRoleUse().addAll((Collection)newValue);
				return;
			case SpemPackage.PROCESS_RESPONSIBILITY_ASSIGNMENT__LINKED_WORK_PRODUCT_USE:
				setLinkedWorkProductUse((WorkProductUse)newValue);
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
			case SpemPackage.PROCESS_RESPONSIBILITY_ASSIGNMENT__LINKED_ROLE_USE:
				getLinkedRoleUse().clear();
				return;
			case SpemPackage.PROCESS_RESPONSIBILITY_ASSIGNMENT__LINKED_WORK_PRODUCT_USE:
				setLinkedWorkProductUse((WorkProductUse)null);
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
			case SpemPackage.PROCESS_RESPONSIBILITY_ASSIGNMENT__LINKED_ROLE_USE:
				return linkedRoleUse != null && !linkedRoleUse.isEmpty();
			case SpemPackage.PROCESS_RESPONSIBILITY_ASSIGNMENT__LINKED_WORK_PRODUCT_USE:
				return linkedWorkProductUse != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessResponsibilityAssignmentImpl
