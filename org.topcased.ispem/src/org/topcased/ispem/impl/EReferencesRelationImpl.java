/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.topcased.ispem.ENamedElementRelationKind;
import org.topcased.ispem.EReferencesRelation;
import org.topcased.ispem.IspemPackage;

import org.topcased.spem.impl.MethodContentElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EReferences Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.ispem.impl.EReferencesRelationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.EReferencesRelationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.EReferencesRelationImpl#getRelationType <em>Relation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EReferencesRelationImpl extends MethodContentElementImpl implements EReferencesRelation {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EReference source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EReference target;

	/**
	 * The default value of the '{@link #getRelationType() <em>Relation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationType()
	 * @generated
	 * @ordered
	 */
	protected static final ENamedElementRelationKind RELATION_TYPE_EDEFAULT = ENamedElementRelationKind.SPECIALIZATION_LITERAL;

	/**
	 * The cached value of the '{@link #getRelationType() <em>Relation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationType()
	 * @generated
	 * @ordered
	 */
	protected ENamedElementRelationKind relationType = RELATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EReferencesRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IspemPackage.Literals.EREFERENCES_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (EReference)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.EREFERENCES_RELATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(EReference newSource) {
		EReference oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.EREFERENCES_RELATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (EReference)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.EREFERENCES_RELATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(EReference newTarget) {
		EReference oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.EREFERENCES_RELATION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENamedElementRelationKind getRelationType() {
		return relationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationType(ENamedElementRelationKind newRelationType) {
		ENamedElementRelationKind oldRelationType = relationType;
		relationType = newRelationType == null ? RELATION_TYPE_EDEFAULT : newRelationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.EREFERENCES_RELATION__RELATION_TYPE, oldRelationType, relationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IspemPackage.EREFERENCES_RELATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case IspemPackage.EREFERENCES_RELATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case IspemPackage.EREFERENCES_RELATION__RELATION_TYPE:
				return getRelationType();
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
			case IspemPackage.EREFERENCES_RELATION__SOURCE:
				setSource((EReference)newValue);
				return;
			case IspemPackage.EREFERENCES_RELATION__TARGET:
				setTarget((EReference)newValue);
				return;
			case IspemPackage.EREFERENCES_RELATION__RELATION_TYPE:
				setRelationType((ENamedElementRelationKind)newValue);
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
			case IspemPackage.EREFERENCES_RELATION__SOURCE:
				setSource((EReference)null);
				return;
			case IspemPackage.EREFERENCES_RELATION__TARGET:
				setTarget((EReference)null);
				return;
			case IspemPackage.EREFERENCES_RELATION__RELATION_TYPE:
				setRelationType(RELATION_TYPE_EDEFAULT);
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
			case IspemPackage.EREFERENCES_RELATION__SOURCE:
				return source != null;
			case IspemPackage.EREFERENCES_RELATION__TARGET:
				return target != null;
			case IspemPackage.EREFERENCES_RELATION__RELATION_TYPE:
				return relationType != RELATION_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (relationType: ");
		result.append(relationType);
		result.append(')');
		return result.toString();
	}

} //EReferencesRelationImpl
