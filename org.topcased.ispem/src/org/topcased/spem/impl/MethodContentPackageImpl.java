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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.topcased.spem.MethodContentPackage;
import org.topcased.spem.MethodContentPackageableElement;
import org.topcased.spem.SpemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Content Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.spem.impl.MethodContentPackageImpl#getOwnedMethodContentMember <em>Owned Method Content Member</em>}</li>
 *   <li>{@link org.topcased.spem.impl.MethodContentPackageImpl#getReusedPackage <em>Reused Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodContentPackageImpl extends MethodContentPackageableElementImpl implements MethodContentPackage {
	/**
	 * The cached value of the '{@link #getOwnedMethodContentMember() <em>Owned Method Content Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMethodContentMember()
	 * @generated
	 * @ordered
	 */
	protected EList ownedMethodContentMember;

	/**
	 * The cached value of the '{@link #getReusedPackage() <em>Reused Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReusedPackage()
	 * @generated
	 * @ordered
	 */
	protected EList reusedPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodContentPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SpemPackage.Literals.METHOD_CONTENT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMethodContentMember() {
		if (ownedMethodContentMember == null) {
			ownedMethodContentMember = new EObjectContainmentEList(MethodContentPackageableElement.class, this, SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER);
		}
		return ownedMethodContentMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReusedPackage() {
		if (reusedPackage == null) {
			reusedPackage = new EObjectResolvingEList(MethodContentPackage.class, this, SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE);
		}
		return reusedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER:
				return ((InternalEList)getOwnedMethodContentMember()).basicRemove(otherEnd, msgs);
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
			case SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER:
				return getOwnedMethodContentMember();
			case SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE:
				return getReusedPackage();
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
			case SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER:
				getOwnedMethodContentMember().clear();
				getOwnedMethodContentMember().addAll((Collection)newValue);
				return;
			case SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE:
				getReusedPackage().clear();
				getReusedPackage().addAll((Collection)newValue);
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
			case SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER:
				getOwnedMethodContentMember().clear();
				return;
			case SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE:
				getReusedPackage().clear();
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
			case SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER:
				return ownedMethodContentMember != null && !ownedMethodContentMember.isEmpty();
			case SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE:
				return reusedPackage != null && !reusedPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodContentPackageImpl
