/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.topcased.ispem.DomainTaskDefinition;
import org.topcased.ispem.IspemPackage;
import org.topcased.ispem.MethodTaskDefinition;
import org.topcased.ispem.Viewpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Task Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.ispem.impl.DomainTaskDefinitionImpl#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.DomainTaskDefinitionImpl#getApplies <em>Applies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainTaskDefinitionImpl extends TaskDefinitionImpl implements DomainTaskDefinition {
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
	 * The cached value of the '{@link #getApplies() <em>Applies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplies()
	 * @generated
	 * @ordered
	 */
	protected EList applies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainTaskDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IspemPackage.Literals.DOMAIN_TASK_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSpecializes() {
		if (specializes == null) {
			specializes = new EObjectWithInverseResolvingEList(MethodTaskDefinition.class, this, IspemPackage.DOMAIN_TASK_DEFINITION__SPECIALIZES, IspemPackage.METHOD_TASK_DEFINITION__SPECIALIZED_BY);
		}
		return specializes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getApplies() {
		if (applies == null) {
			applies = new EObjectResolvingEList(Viewpoint.class, this, IspemPackage.DOMAIN_TASK_DEFINITION__APPLIES);
		}
		return applies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IspemPackage.DOMAIN_TASK_DEFINITION__SPECIALIZES:
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
			case IspemPackage.DOMAIN_TASK_DEFINITION__SPECIALIZES:
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
			case IspemPackage.DOMAIN_TASK_DEFINITION__SPECIALIZES:
				return getSpecializes();
			case IspemPackage.DOMAIN_TASK_DEFINITION__APPLIES:
				return getApplies();
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
			case IspemPackage.DOMAIN_TASK_DEFINITION__SPECIALIZES:
				getSpecializes().clear();
				getSpecializes().addAll((Collection)newValue);
				return;
			case IspemPackage.DOMAIN_TASK_DEFINITION__APPLIES:
				getApplies().clear();
				getApplies().addAll((Collection)newValue);
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
			case IspemPackage.DOMAIN_TASK_DEFINITION__SPECIALIZES:
				getSpecializes().clear();
				return;
			case IspemPackage.DOMAIN_TASK_DEFINITION__APPLIES:
				getApplies().clear();
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
			case IspemPackage.DOMAIN_TASK_DEFINITION__SPECIALIZES:
				return specializes != null && !specializes.isEmpty();
			case IspemPackage.DOMAIN_TASK_DEFINITION__APPLIES:
				return applies != null && !applies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainTaskDefinitionImpl
