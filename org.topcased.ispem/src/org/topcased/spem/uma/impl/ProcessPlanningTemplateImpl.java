/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.topcased.spem.uma.ProcessPlanningTemplate;
import org.topcased.spem.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Planning Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.spem.uma.impl.ProcessPlanningTemplateImpl#getBaseProcess <em>Base Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessPlanningTemplateImpl extends ProcessImpl implements ProcessPlanningTemplate {
	/**
	 * The cached value of the '{@link #getBaseProcess() <em>Base Process</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseProcess()
	 * @generated
	 * @ordered
	 */
	protected EList baseProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessPlanningTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UmaPackage.Literals.PROCESS_PLANNING_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBaseProcess() {
		if (baseProcess == null) {
			baseProcess = new EObjectResolvingEList(org.topcased.spem.uma.Process.class, this, UmaPackage.PROCESS_PLANNING_TEMPLATE__BASE_PROCESS);
		}
		return baseProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.PROCESS_PLANNING_TEMPLATE__BASE_PROCESS:
				return getBaseProcess();
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
			case UmaPackage.PROCESS_PLANNING_TEMPLATE__BASE_PROCESS:
				getBaseProcess().clear();
				getBaseProcess().addAll((Collection)newValue);
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
			case UmaPackage.PROCESS_PLANNING_TEMPLATE__BASE_PROCESS:
				getBaseProcess().clear();
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
			case UmaPackage.PROCESS_PLANNING_TEMPLATE__BASE_PROCESS:
				return baseProcess != null && !baseProcess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessPlanningTemplateImpl
