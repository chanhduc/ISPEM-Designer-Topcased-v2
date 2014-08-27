/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.topcased.spem.Milestone;
import org.topcased.spem.SpemPackage;
import org.topcased.spem.WorkProductUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Milestone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.spem.impl.MilestoneImpl#getRequiredResult <em>Required Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MilestoneImpl extends WorkBreakdownElementImpl implements Milestone {
	/**
	 * The cached value of the '{@link #getRequiredResult() <em>Required Result</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredResult()
	 * @generated
	 * @ordered
	 */
	protected EList requiredResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MilestoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SpemPackage.Literals.MILESTONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRequiredResult() {
		if (requiredResult == null) {
			requiredResult = new EObjectResolvingEList(WorkProductUse.class, this, SpemPackage.MILESTONE__REQUIRED_RESULT);
		}
		return requiredResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.MILESTONE__REQUIRED_RESULT:
				return getRequiredResult();
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
			case SpemPackage.MILESTONE__REQUIRED_RESULT:
				getRequiredResult().clear();
				getRequiredResult().addAll((Collection)newValue);
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
			case SpemPackage.MILESTONE__REQUIRED_RESULT:
				getRequiredResult().clear();
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
			case SpemPackage.MILESTONE__REQUIRED_RESULT:
				return requiredResult != null && !requiredResult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MilestoneImpl
