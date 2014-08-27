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
import org.topcased.ispem.LanguageArtifactDefinition;
import org.topcased.ispem.MethodArtifactDefinition;
import org.topcased.ispem.RepresentativeLanguage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language Artifact Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.ispem.impl.LanguageArtifactDefinitionImpl#getSpecializedBy <em>Specialized By</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.LanguageArtifactDefinitionImpl#getRepresentedBy <em>Represented By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LanguageArtifactDefinitionImpl extends ArtifactDefinitionImpl implements LanguageArtifactDefinition {
	/**
	 * The cached value of the '{@link #getSpecializedBy() <em>Specialized By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializedBy()
	 * @generated
	 * @ordered
	 */
	protected MethodArtifactDefinition specializedBy;

	/**
	 * The cached value of the '{@link #getRepresentedBy() <em>Represented By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedBy()
	 * @generated
	 * @ordered
	 */
	protected RepresentativeLanguage representedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageArtifactDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IspemPackage.Literals.LANGUAGE_ARTIFACT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodArtifactDefinition getSpecializedBy() {
		if (specializedBy != null && specializedBy.eIsProxy()) {
			InternalEObject oldSpecializedBy = (InternalEObject)specializedBy;
			specializedBy = (MethodArtifactDefinition)eResolveProxy(oldSpecializedBy);
			if (specializedBy != oldSpecializedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.LANGUAGE_ARTIFACT_DEFINITION__SPECIALIZED_BY, oldSpecializedBy, specializedBy));
			}
		}
		return specializedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodArtifactDefinition basicGetSpecializedBy() {
		return specializedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecializedBy(MethodArtifactDefinition newSpecializedBy, NotificationChain msgs) {
		MethodArtifactDefinition oldSpecializedBy = specializedBy;
		specializedBy = newSpecializedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IspemPackage.LANGUAGE_ARTIFACT_DEFINITION__SPECIALIZED_BY, oldSpecializedBy, newSpecializedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecializedBy(MethodArtifactDefinition newSpecializedBy) {
		if (newSpecializedBy != specializedBy) {
			NotificationChain msgs = null;
			if (specializedBy != null)
				msgs = ((InternalEObject)specializedBy).eInverseRemove(this, IspemPackage.METHOD_ARTIFACT_DEFINITION__SPECIALIZES, MethodArtifactDefinition.class, msgs);
			if (newSpecializedBy != null)
				msgs = ((InternalEObject)newSpecializedBy).eInverseAdd(this, IspemPackage.METHOD_ARTIFACT_DEFINITION__SPECIALIZES, MethodArtifactDefinition.class, msgs);
			msgs = basicSetSpecializedBy(newSpecializedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.LANGUAGE_ARTIFACT_DEFINITION__SPECIALIZED_BY, newSpecializedBy, newSpecializedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentativeLanguage getRepresentedBy() {
		if (representedBy != null && representedBy.eIsProxy()) {
			InternalEObject oldRepresentedBy = (InternalEObject)representedBy;
			representedBy = (RepresentativeLanguage)eResolveProxy(oldRepresentedBy);
			if (representedBy != oldRepresentedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.LANGUAGE_ARTIFACT_DEFINITION__REPRESENTED_BY, oldRepresentedBy, representedBy));
			}
		}
		return representedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentativeLanguage basicGetRepresentedBy() {
		return representedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentedBy(RepresentativeLanguage newRepresentedBy) {
		RepresentativeLanguage oldRepresentedBy = representedBy;
		representedBy = newRepresentedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.LANGUAGE_ARTIFACT_DEFINITION__REPRESENTED_BY, oldRepresentedBy, representedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IspemPackage.LANGUAGE_ARTIFACT_DEFINITION__SPECIALIZED_BY:
				if (specializedBy != null)
					msgs = ((InternalEObject)specializedBy).eInverseRemove(this, IspemPackage.METHOD_ARTIFACT_DEFINITION__SPECIALIZES, MethodArtifactDefinition.class, msgs);
				return basicSetSpecializedBy((MethodArtifactDefinition)otherEnd, msgs);
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
			case IspemPackage.LANGUAGE_ARTIFACT_DEFINITION__SPECIALIZED_BY:
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
			case IspemPackage.LANGUAGE_ARTIFACT_DEFINITION__SPECIALIZED_BY:
				if (resolve) return getSpecializedBy();
				return basicGetSpecializedBy();
			case IspemPackage.LANGUAGE_ARTIFACT_DEFINITION__REPRESENTED_BY:
				if (resolve) return getRepresentedBy();
				return basicGetRepresentedBy();
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
			case IspemPackage.LANGUAGE_ARTIFACT_DEFINITION__SPECIALIZED_BY:
				setSpecializedBy((MethodArtifactDefinition)newValue);
				return;
			case IspemPackage.LANGUAGE_ARTIFACT_DEFINITION__REPRESENTED_BY:
				setRepresentedBy((RepresentativeLanguage)newValue);
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
			case IspemPackage.LANGUAGE_ARTIFACT_DEFINITION__SPECIALIZED_BY:
				setSpecializedBy((MethodArtifactDefinition)null);
				return;
			case IspemPackage.LANGUAGE_ARTIFACT_DEFINITION__REPRESENTED_BY:
				setRepresentedBy((RepresentativeLanguage)null);
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
			case IspemPackage.LANGUAGE_ARTIFACT_DEFINITION__SPECIALIZED_BY:
				return specializedBy != null;
			case IspemPackage.LANGUAGE_ARTIFACT_DEFINITION__REPRESENTED_BY:
				return representedBy != null;
		}
		return super.eIsSet(featureID);
	}

} //LanguageArtifactDefinitionImpl
