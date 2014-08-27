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

import org.topcased.spem.SpemPackage;
import org.topcased.spem.WorkProductRelationshipKind;
import org.topcased.spem.WorkProductUse;
import org.topcased.spem.WorkProductUseRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Product Use Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.spem.impl.WorkProductUseRelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.topcased.spem.impl.WorkProductUseRelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.topcased.spem.impl.WorkProductUseRelationshipImpl#getRelationshipKind <em>Relationship Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkProductUseRelationshipImpl extends BreakdownElementImpl implements WorkProductUseRelationship {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected WorkProductUse source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList target;

	/**
	 * The default value of the '{@link #getRelationshipKind() <em>Relationship Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipKind()
	 * @generated
	 * @ordered
	 */
	protected static final WorkProductRelationshipKind RELATIONSHIP_KIND_EDEFAULT = WorkProductRelationshipKind.IMPACTED_BY_LITERAL;

	/**
	 * The cached value of the '{@link #getRelationshipKind() <em>Relationship Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipKind()
	 * @generated
	 * @ordered
	 */
	protected WorkProductRelationshipKind relationshipKind = RELATIONSHIP_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductUseRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SpemPackage.Literals.WORK_PRODUCT_USE_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductUse getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (WorkProductUse)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.WORK_PRODUCT_USE_RELATIONSHIP__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductUse basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(WorkProductUse newSource) {
		WorkProductUse oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_PRODUCT_USE_RELATIONSHIP__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList(WorkProductUse.class, this, SpemPackage.WORK_PRODUCT_USE_RELATIONSHIP__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductRelationshipKind getRelationshipKind() {
		return relationshipKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipKind(WorkProductRelationshipKind newRelationshipKind) {
		WorkProductRelationshipKind oldRelationshipKind = relationshipKind;
		relationshipKind = newRelationshipKind == null ? RELATIONSHIP_KIND_EDEFAULT : newRelationshipKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_PRODUCT_USE_RELATIONSHIP__RELATIONSHIP_KIND, oldRelationshipKind, relationshipKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.WORK_PRODUCT_USE_RELATIONSHIP__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SpemPackage.WORK_PRODUCT_USE_RELATIONSHIP__TARGET:
				return getTarget();
			case SpemPackage.WORK_PRODUCT_USE_RELATIONSHIP__RELATIONSHIP_KIND:
				return getRelationshipKind();
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
			case SpemPackage.WORK_PRODUCT_USE_RELATIONSHIP__SOURCE:
				setSource((WorkProductUse)newValue);
				return;
			case SpemPackage.WORK_PRODUCT_USE_RELATIONSHIP__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection)newValue);
				return;
			case SpemPackage.WORK_PRODUCT_USE_RELATIONSHIP__RELATIONSHIP_KIND:
				setRelationshipKind((WorkProductRelationshipKind)newValue);
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
			case SpemPackage.WORK_PRODUCT_USE_RELATIONSHIP__SOURCE:
				setSource((WorkProductUse)null);
				return;
			case SpemPackage.WORK_PRODUCT_USE_RELATIONSHIP__TARGET:
				getTarget().clear();
				return;
			case SpemPackage.WORK_PRODUCT_USE_RELATIONSHIP__RELATIONSHIP_KIND:
				setRelationshipKind(RELATIONSHIP_KIND_EDEFAULT);
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
			case SpemPackage.WORK_PRODUCT_USE_RELATIONSHIP__SOURCE:
				return source != null;
			case SpemPackage.WORK_PRODUCT_USE_RELATIONSHIP__TARGET:
				return target != null && !target.isEmpty();
			case SpemPackage.WORK_PRODUCT_USE_RELATIONSHIP__RELATIONSHIP_KIND:
				return relationshipKind != RELATIONSHIP_KIND_EDEFAULT;
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
		result.append(" (relationshipKind: ");
		result.append(relationshipKind);
		result.append(')');
		return result.toString();
	}

} //WorkProductUseRelationshipImpl
