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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.topcased.ispem.IspemPackage;
import org.topcased.ispem.MetaModel;

import org.topcased.spem.impl.MethodContentElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.ispem.impl.MetaModelImpl#getEPackage <em>EPackage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaModelImpl extends MethodContentElementImpl implements MetaModel {
	/**
	 * The cached value of the '{@link #getEPackage() <em>EPackage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPackage()
	 * @generated
	 * @ordered
	 */
	protected EPackage ePackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IspemPackage.Literals.META_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getEPackage() {
		return ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEPackage(EPackage newEPackage, NotificationChain msgs) {
		EPackage oldEPackage = ePackage;
		ePackage = newEPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IspemPackage.META_MODEL__EPACKAGE, oldEPackage, newEPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEPackage(EPackage newEPackage) {
		if (newEPackage != ePackage) {
			NotificationChain msgs = null;
			if (ePackage != null)
				msgs = ((InternalEObject)ePackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IspemPackage.META_MODEL__EPACKAGE, null, msgs);
			if (newEPackage != null)
				msgs = ((InternalEObject)newEPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IspemPackage.META_MODEL__EPACKAGE, null, msgs);
			msgs = basicSetEPackage(newEPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.META_MODEL__EPACKAGE, newEPackage, newEPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IspemPackage.META_MODEL__EPACKAGE:
				return basicSetEPackage(null, msgs);
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
			case IspemPackage.META_MODEL__EPACKAGE:
				return getEPackage();
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
			case IspemPackage.META_MODEL__EPACKAGE:
				setEPackage((EPackage)newValue);
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
			case IspemPackage.META_MODEL__EPACKAGE:
				setEPackage((EPackage)null);
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
			case IspemPackage.META_MODEL__EPACKAGE:
				return ePackage != null;
		}
		return super.eIsSet(featureID);
	}

} //MetaModelImpl
