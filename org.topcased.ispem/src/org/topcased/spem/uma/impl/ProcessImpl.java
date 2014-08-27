/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.topcased.spem.WorkProductPortConnector;

import org.topcased.spem.impl.ActivityImpl;

import org.topcased.spem.uma.CapabilityPattern;
import org.topcased.spem.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.spem.uma.impl.ProcessImpl#getIncludedPattern <em>Included Pattern</em>}</li>
 *   <li>{@link org.topcased.spem.uma.impl.ProcessImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.topcased.spem.uma.impl.ProcessImpl#getUsageNote <em>Usage Note</em>}</li>
 *   <li>{@link org.topcased.spem.uma.impl.ProcessImpl#getIncludedConnector <em>Included Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends ActivityImpl implements org.topcased.spem.uma.Process {
	/**
	 * The cached value of the '{@link #getIncludedPattern() <em>Included Pattern</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedPattern()
	 * @generated
	 * @ordered
	 */
	protected EList includedPattern;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsageNote() <em>Usage Note</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageNote()
	 * @generated
	 * @ordered
	 */
	protected EList usageNote;

	/**
	 * The cached value of the '{@link #getIncludedConnector() <em>Included Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedConnector()
	 * @generated
	 * @ordered
	 */
	protected EList includedConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UmaPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIncludedPattern() {
		if (includedPattern == null) {
			includedPattern = new EObjectContainmentEList(CapabilityPattern.class, this, UmaPackage.PROCESS__INCLUDED_PATTERN);
		}
		return includedPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmaPackage.PROCESS__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsageNote() {
		if (usageNote == null) {
			usageNote = new EDataTypeUniqueEList(String.class, this, UmaPackage.PROCESS__USAGE_NOTE);
		}
		return usageNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIncludedConnector() {
		if (includedConnector == null) {
			includedConnector = new EObjectContainmentEList(WorkProductPortConnector.class, this, UmaPackage.PROCESS__INCLUDED_CONNECTOR);
		}
		return includedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.PROCESS__INCLUDED_PATTERN:
				return ((InternalEList)getIncludedPattern()).basicRemove(otherEnd, msgs);
			case UmaPackage.PROCESS__INCLUDED_CONNECTOR:
				return ((InternalEList)getIncludedConnector()).basicRemove(otherEnd, msgs);
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
			case UmaPackage.PROCESS__INCLUDED_PATTERN:
				return getIncludedPattern();
			case UmaPackage.PROCESS__SCOPE:
				return getScope();
			case UmaPackage.PROCESS__USAGE_NOTE:
				return getUsageNote();
			case UmaPackage.PROCESS__INCLUDED_CONNECTOR:
				return getIncludedConnector();
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
			case UmaPackage.PROCESS__INCLUDED_PATTERN:
				getIncludedPattern().clear();
				getIncludedPattern().addAll((Collection)newValue);
				return;
			case UmaPackage.PROCESS__SCOPE:
				setScope((String)newValue);
				return;
			case UmaPackage.PROCESS__USAGE_NOTE:
				getUsageNote().clear();
				getUsageNote().addAll((Collection)newValue);
				return;
			case UmaPackage.PROCESS__INCLUDED_CONNECTOR:
				getIncludedConnector().clear();
				getIncludedConnector().addAll((Collection)newValue);
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
			case UmaPackage.PROCESS__INCLUDED_PATTERN:
				getIncludedPattern().clear();
				return;
			case UmaPackage.PROCESS__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case UmaPackage.PROCESS__USAGE_NOTE:
				getUsageNote().clear();
				return;
			case UmaPackage.PROCESS__INCLUDED_CONNECTOR:
				getIncludedConnector().clear();
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
			case UmaPackage.PROCESS__INCLUDED_PATTERN:
				return includedPattern != null && !includedPattern.isEmpty();
			case UmaPackage.PROCESS__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
			case UmaPackage.PROCESS__USAGE_NOTE:
				return usageNote != null && !usageNote.isEmpty();
			case UmaPackage.PROCESS__INCLUDED_CONNECTOR:
				return includedConnector != null && !includedConnector.isEmpty();
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
		result.append(" (scope: ");
		result.append(scope);
		result.append(", usageNote: ");
		result.append(usageNote);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
