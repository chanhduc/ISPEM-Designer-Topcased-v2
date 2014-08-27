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
import org.topcased.ispem.DevelopmentMethod;
import org.topcased.ispem.DevelopmentMethodWithLanguageContentPackage;
import org.topcased.ispem.IspemPackage;
import org.topcased.ispem.RepresentativeLanguage;
import org.topcased.spem.impl.MethodContentPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Development Method With Language Content Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.ispem.impl.DevelopmentMethodWithLanguageContentPackageImpl#getRelatedLanguage <em>Related Language</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.DevelopmentMethodWithLanguageContentPackageImpl#getRelatedMethod <em>Related Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DevelopmentMethodWithLanguageContentPackageImpl extends MethodContentPackageImpl implements DevelopmentMethodWithLanguageContentPackage {
	/**
	 * The cached value of the '{@link #getRelatedLanguage() <em>Related Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedLanguage()
	 * @generated
	 * @ordered
	 */
	protected RepresentativeLanguage relatedLanguage;

	/**
	 * The cached value of the '{@link #getRelatedMethod() <em>Related Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedMethod()
	 * @generated
	 * @ordered
	 */
	protected DevelopmentMethod relatedMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevelopmentMethodWithLanguageContentPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IspemPackage.Literals.DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentativeLanguage getRelatedLanguage() {
		if (relatedLanguage != null && relatedLanguage.eIsProxy()) {
			InternalEObject oldRelatedLanguage = (InternalEObject)relatedLanguage;
			relatedLanguage = (RepresentativeLanguage)eResolveProxy(oldRelatedLanguage);
			if (relatedLanguage != oldRelatedLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__RELATED_LANGUAGE, oldRelatedLanguage, relatedLanguage));
			}
		}
		return relatedLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentativeLanguage basicGetRelatedLanguage() {
		return relatedLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedLanguage(RepresentativeLanguage newRelatedLanguage) {
		RepresentativeLanguage oldRelatedLanguage = relatedLanguage;
		relatedLanguage = newRelatedLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__RELATED_LANGUAGE, oldRelatedLanguage, relatedLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentMethod getRelatedMethod() {
		if (relatedMethod != null && relatedMethod.eIsProxy()) {
			InternalEObject oldRelatedMethod = (InternalEObject)relatedMethod;
			relatedMethod = (DevelopmentMethod)eResolveProxy(oldRelatedMethod);
			if (relatedMethod != oldRelatedMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__RELATED_METHOD, oldRelatedMethod, relatedMethod));
			}
		}
		return relatedMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentMethod basicGetRelatedMethod() {
		return relatedMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedMethod(DevelopmentMethod newRelatedMethod) {
		DevelopmentMethod oldRelatedMethod = relatedMethod;
		relatedMethod = newRelatedMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__RELATED_METHOD, oldRelatedMethod, relatedMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IspemPackage.DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__RELATED_LANGUAGE:
				if (resolve) return getRelatedLanguage();
				return basicGetRelatedLanguage();
			case IspemPackage.DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__RELATED_METHOD:
				if (resolve) return getRelatedMethod();
				return basicGetRelatedMethod();
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
			case IspemPackage.DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__RELATED_LANGUAGE:
				setRelatedLanguage((RepresentativeLanguage)newValue);
				return;
			case IspemPackage.DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__RELATED_METHOD:
				setRelatedMethod((DevelopmentMethod)newValue);
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
			case IspemPackage.DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__RELATED_LANGUAGE:
				setRelatedLanguage((RepresentativeLanguage)null);
				return;
			case IspemPackage.DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__RELATED_METHOD:
				setRelatedMethod((DevelopmentMethod)null);
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
			case IspemPackage.DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__RELATED_LANGUAGE:
				return relatedLanguage != null;
			case IspemPackage.DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__RELATED_METHOD:
				return relatedMethod != null;
		}
		return super.eIsSet(featureID);
	}

} //DevelopmentMethodWithLanguageContentPackageImpl
