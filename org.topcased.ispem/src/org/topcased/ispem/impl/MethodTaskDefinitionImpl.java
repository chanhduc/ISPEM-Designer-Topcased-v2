/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.topcased.ispem.DomainTaskDefinition;
import org.topcased.ispem.IspemPackage;
import org.topcased.ispem.LanguageTaskDefinition;
import org.topcased.ispem.MethodTaskDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Task Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.ispem.impl.MethodTaskDefinitionImpl#getSpecializedBy <em>Specialized By</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.MethodTaskDefinitionImpl#getSpecializes <em>Specializes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodTaskDefinitionImpl extends TaskDefinitionImpl implements MethodTaskDefinition {
	/**
	 * The cached value of the '{@link #getSpecializedBy() <em>Specialized By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializedBy()
	 * @generated
	 * @ordered
	 */
	protected DomainTaskDefinition specializedBy;

	/**
	 * The cached value of the '{@link #getSpecializes() <em>Specializes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializes()
	 * @generated
	 * @ordered
	 */
	protected EList specializes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodTaskDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IspemPackage.Literals.METHOD_TASK_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainTaskDefinition getSpecializedBy() {
		if (specializedBy != null && specializedBy.eIsProxy()) {
			InternalEObject oldSpecializedBy = (InternalEObject)specializedBy;
			specializedBy = (DomainTaskDefinition)eResolveProxy(oldSpecializedBy);
			if (specializedBy != oldSpecializedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZED_BY, oldSpecializedBy, specializedBy));
			}
		}
		return specializedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainTaskDefinition basicGetSpecializedBy() {
		return specializedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecializedBy(DomainTaskDefinition newSpecializedBy, NotificationChain msgs) {
		DomainTaskDefinition oldSpecializedBy = specializedBy;
		specializedBy = newSpecializedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZED_BY, oldSpecializedBy, newSpecializedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecializedBy(DomainTaskDefinition newSpecializedBy) {
		if (newSpecializedBy != specializedBy) {
			NotificationChain msgs = null;
			if (specializedBy != null)
				msgs = ((InternalEObject)specializedBy).eInverseRemove(this, IspemPackage.DOMAIN_TASK_DEFINITION__SPECIALIZES, DomainTaskDefinition.class, msgs);
			if (newSpecializedBy != null)
				msgs = ((InternalEObject)newSpecializedBy).eInverseAdd(this, IspemPackage.DOMAIN_TASK_DEFINITION__SPECIALIZES, DomainTaskDefinition.class, msgs);
			msgs = basicSetSpecializedBy(newSpecializedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZED_BY, newSpecializedBy, newSpecializedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSpecializes() {
		if (specializes == null) {
			specializes = new EObjectWithInverseResolvingEList(LanguageTaskDefinition.class, this, IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZES, IspemPackage.LANGUAGE_TASK_DEFINITION__SPECIALIZED_BY);
		}
		return specializes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZED_BY:
				if (specializedBy != null)
					msgs = ((InternalEObject)specializedBy).eInverseRemove(this, IspemPackage.DOMAIN_TASK_DEFINITION__SPECIALIZES, DomainTaskDefinition.class, msgs);
				return basicSetSpecializedBy((DomainTaskDefinition)otherEnd, msgs);
			case IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZES:
				return ((InternalEList)getSpecializes()).basicAdd(otherEnd, msgs);
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
			case IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZED_BY:
				return basicSetSpecializedBy(null, msgs);
			case IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZES:
				return ((InternalEList)getSpecializes()).basicRemove(otherEnd, msgs);
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
			case IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZED_BY:
				if (resolve) return getSpecializedBy();
				return basicGetSpecializedBy();
			case IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZES:
				return getSpecializes();
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
			case IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZED_BY:
				setSpecializedBy((DomainTaskDefinition)newValue);
				return;
			case IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZES:
				getSpecializes().clear();
				getSpecializes().addAll((Collection)newValue);
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
			case IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZED_BY:
				setSpecializedBy((DomainTaskDefinition)null);
				return;
			case IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZES:
				getSpecializes().clear();
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
			case IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZED_BY:
				return specializedBy != null;
			case IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZES:
				return specializes != null && !specializes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodTaskDefinitionImpl
