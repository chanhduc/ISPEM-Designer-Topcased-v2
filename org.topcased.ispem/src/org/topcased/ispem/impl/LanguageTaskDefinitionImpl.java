/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.topcased.ispem.IspemPackage;
import org.topcased.ispem.LanguageTaskDefinition;
import org.topcased.ispem.MethodTaskDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language Task Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.ispem.impl.LanguageTaskDefinitionImpl#getSpecializedBy <em>Specialized By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LanguageTaskDefinitionImpl extends TaskDefinitionImpl implements LanguageTaskDefinition {
	/**
	 * The cached value of the '{@link #getSpecializedBy() <em>Specialized By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializedBy()
	 * @generated
	 * @ordered
	 */
	protected MethodTaskDefinition specializedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageTaskDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IspemPackage.Literals.LANGUAGE_TASK_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodTaskDefinition getSpecializedBy() {
		if (specializedBy != null && specializedBy.eIsProxy()) {
			InternalEObject oldSpecializedBy = (InternalEObject)specializedBy;
			specializedBy = (MethodTaskDefinition)eResolveProxy(oldSpecializedBy);
			if (specializedBy != oldSpecializedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.LANGUAGE_TASK_DEFINITION__SPECIALIZED_BY, oldSpecializedBy, specializedBy));
			}
		}
		return specializedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodTaskDefinition basicGetSpecializedBy() {
		return specializedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecializedBy(MethodTaskDefinition newSpecializedBy, NotificationChain msgs) {
		MethodTaskDefinition oldSpecializedBy = specializedBy;
		specializedBy = newSpecializedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IspemPackage.LANGUAGE_TASK_DEFINITION__SPECIALIZED_BY, oldSpecializedBy, newSpecializedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecializedBy(MethodTaskDefinition newSpecializedBy) {
		if (newSpecializedBy != specializedBy) {
			NotificationChain msgs = null;
			if (specializedBy != null)
				msgs = ((InternalEObject)specializedBy).eInverseRemove(this, IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZES, MethodTaskDefinition.class, msgs);
			if (newSpecializedBy != null)
				msgs = ((InternalEObject)newSpecializedBy).eInverseAdd(this, IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZES, MethodTaskDefinition.class, msgs);
			msgs = basicSetSpecializedBy(newSpecializedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.LANGUAGE_TASK_DEFINITION__SPECIALIZED_BY, newSpecializedBy, newSpecializedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IspemPackage.LANGUAGE_TASK_DEFINITION__SPECIALIZED_BY:
				if (specializedBy != null)
					msgs = ((InternalEObject)specializedBy).eInverseRemove(this, IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZES, MethodTaskDefinition.class, msgs);
				return basicSetSpecializedBy((MethodTaskDefinition)otherEnd, msgs);
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
			case IspemPackage.LANGUAGE_TASK_DEFINITION__SPECIALIZED_BY:
				return basicSetSpecializedBy(null, msgs);
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
			case IspemPackage.LANGUAGE_TASK_DEFINITION__SPECIALIZED_BY:
				if (resolve) return getSpecializedBy();
				return basicGetSpecializedBy();
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
			case IspemPackage.LANGUAGE_TASK_DEFINITION__SPECIALIZED_BY:
				setSpecializedBy((MethodTaskDefinition)newValue);
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
			case IspemPackage.LANGUAGE_TASK_DEFINITION__SPECIALIZED_BY:
				setSpecializedBy((MethodTaskDefinition)null);
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
			case IspemPackage.LANGUAGE_TASK_DEFINITION__SPECIALIZED_BY:
				return specializedBy != null;
		}
		return super.eIsSet(featureID);
	}

} //LanguageTaskDefinitionImpl
