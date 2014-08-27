/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.topcased.ispem.DomainContentPackage;
import org.topcased.ispem.EngineeringDomain;
import org.topcased.ispem.IspemPackage;

import org.topcased.spem.impl.MethodContentPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Content Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.ispem.impl.DomainContentPackageImpl#getRelatedDomain <em>Related Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainContentPackageImpl extends MethodContentPackageImpl implements DomainContentPackage {
	/**
	 * The cached value of the '{@link #getRelatedDomain() <em>Related Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedDomain()
	 * @generated
	 * @ordered
	 */
	protected EngineeringDomain relatedDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainContentPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IspemPackage.Literals.DOMAIN_CONTENT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringDomain getRelatedDomain() {
		if (relatedDomain != null && relatedDomain.eIsProxy()) {
			InternalEObject oldRelatedDomain = (InternalEObject)relatedDomain;
			relatedDomain = (EngineeringDomain)eResolveProxy(oldRelatedDomain);
			if (relatedDomain != oldRelatedDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.DOMAIN_CONTENT_PACKAGE__RELATED_DOMAIN, oldRelatedDomain, relatedDomain));
			}
		}
		return relatedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringDomain basicGetRelatedDomain() {
		return relatedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedDomain(EngineeringDomain newRelatedDomain) {
		EngineeringDomain oldRelatedDomain = relatedDomain;
		relatedDomain = newRelatedDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.DOMAIN_CONTENT_PACKAGE__RELATED_DOMAIN, oldRelatedDomain, relatedDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IspemPackage.DOMAIN_CONTENT_PACKAGE__RELATED_DOMAIN:
				if (resolve) return getRelatedDomain();
				return basicGetRelatedDomain();
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
			case IspemPackage.DOMAIN_CONTENT_PACKAGE__RELATED_DOMAIN:
				setRelatedDomain((EngineeringDomain)newValue);
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
			case IspemPackage.DOMAIN_CONTENT_PACKAGE__RELATED_DOMAIN:
				setRelatedDomain((EngineeringDomain)null);
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
			case IspemPackage.DOMAIN_CONTENT_PACKAGE__RELATED_DOMAIN:
				return relatedDomain != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainContentPackageImpl
