/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.topcased.spem.SpemPackage;
import org.topcased.spem.VariabilityElement;
import org.topcased.spem.VariabilityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variability Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.spem.impl.VariabilityElementImpl#getVariabilityType <em>Variability Type</em>}</li>
 *   <li>{@link org.topcased.spem.impl.VariabilityElementImpl#getVariabilityBasedOnElement <em>Variability Based On Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VariabilityElementImpl extends EObjectImpl implements VariabilityElement {
	/**
	 * The default value of the '{@link #getVariabilityType() <em>Variability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariabilityType()
	 * @generated
	 * @ordered
	 */
	protected static final VariabilityType VARIABILITY_TYPE_EDEFAULT = VariabilityType.NA_LITERAL;

	/**
	 * The cached value of the '{@link #getVariabilityType() <em>Variability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariabilityType()
	 * @generated
	 * @ordered
	 */
	protected VariabilityType variabilityType = VARIABILITY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariabilityBasedOnElement() <em>Variability Based On Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariabilityBasedOnElement()
	 * @generated
	 * @ordered
	 */
	protected VariabilityElement variabilityBasedOnElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariabilityElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SpemPackage.Literals.VARIABILITY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityType getVariabilityType() {
		return variabilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariabilityType(VariabilityType newVariabilityType) {
		VariabilityType oldVariabilityType = variabilityType;
		variabilityType = newVariabilityType == null ? VARIABILITY_TYPE_EDEFAULT : newVariabilityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE, oldVariabilityType, variabilityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityElement getVariabilityBasedOnElement() {
		if (variabilityBasedOnElement != null && variabilityBasedOnElement.eIsProxy()) {
			InternalEObject oldVariabilityBasedOnElement = (InternalEObject)variabilityBasedOnElement;
			variabilityBasedOnElement = (VariabilityElement)eResolveProxy(oldVariabilityBasedOnElement);
			if (variabilityBasedOnElement != oldVariabilityBasedOnElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT, oldVariabilityBasedOnElement, variabilityBasedOnElement));
			}
		}
		return variabilityBasedOnElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityElement basicGetVariabilityBasedOnElement() {
		return variabilityBasedOnElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariabilityBasedOnElement(VariabilityElement newVariabilityBasedOnElement) {
		VariabilityElement oldVariabilityBasedOnElement = variabilityBasedOnElement;
		variabilityBasedOnElement = newVariabilityBasedOnElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT, oldVariabilityBasedOnElement, variabilityBasedOnElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE:
				return getVariabilityType();
			case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT:
				if (resolve) return getVariabilityBasedOnElement();
				return basicGetVariabilityBasedOnElement();
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
			case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE:
				setVariabilityType((VariabilityType)newValue);
				return;
			case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT:
				setVariabilityBasedOnElement((VariabilityElement)newValue);
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
			case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE:
				setVariabilityType(VARIABILITY_TYPE_EDEFAULT);
				return;
			case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT:
				setVariabilityBasedOnElement((VariabilityElement)null);
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
			case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE:
				return variabilityType != VARIABILITY_TYPE_EDEFAULT;
			case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT:
				return variabilityBasedOnElement != null;
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
		result.append(" (variabilityType: ");
		result.append(variabilityType);
		result.append(')');
		return result.toString();
	}

} //VariabilityElementImpl
