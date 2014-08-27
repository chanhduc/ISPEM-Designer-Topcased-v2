/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.topcased.ispem.DevelopmentMethod;
import org.topcased.ispem.DomainTaskDefinition;
import org.topcased.ispem.EngineeringDomain;
import org.topcased.ispem.IspemPackage;
import org.topcased.ispem.TaskDefinition;
import org.topcased.ispem.Viewpoint;

import org.topcased.spem.MethodContentElement;
import org.topcased.spem.MethodContentKind;
import org.topcased.spem.MethodContentPackageableElement;
import org.topcased.spem.SpemPackage;
import org.topcased.spem.VariabilityElement;
import org.topcased.spem.VariabilityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engineering Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.ispem.impl.EngineeringDomainImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.EngineeringDomainImpl#getVariabilityType <em>Variability Type</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.EngineeringDomainImpl#getVariabilityBasedOnElement <em>Variability Based On Element</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.EngineeringDomainImpl#getMethodContentKind <em>Method Content Kind</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.EngineeringDomainImpl#getViewpoints <em>Viewpoints</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.EngineeringDomainImpl#getDefines <em>Defines</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.EngineeringDomainImpl#getRealizes <em>Realizes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EngineeringDomainImpl extends OntologyLinkedElementImpl implements EngineeringDomain {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getMethodContentKind() <em>Method Content Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodContentKind()
	 * @generated
	 * @ordered
	 */
	protected MethodContentKind methodContentKind;

	/**
	 * The cached value of the '{@link #getViewpoints() <em>Viewpoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpoints()
	 * @generated
	 * @ordered
	 */
	protected EList viewpoints;

	/**
	 * The cached value of the '{@link #getDefines() <em>Defines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefines()
	 * @generated
	 * @ordered
	 */
	protected EList defines;

	/**
	 * The cached value of the '{@link #getRealizes() <em>Realizes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizes()
	 * @generated
	 * @ordered
	 */
	protected EList realizes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineeringDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IspemPackage.Literals.ENGINEERING_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.ENGINEERING_DOMAIN__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.ENGINEERING_DOMAIN__VARIABILITY_TYPE, oldVariabilityType, variabilityType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.ENGINEERING_DOMAIN__VARIABILITY_BASED_ON_ELEMENT, oldVariabilityBasedOnElement, variabilityBasedOnElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.ENGINEERING_DOMAIN__VARIABILITY_BASED_ON_ELEMENT, oldVariabilityBasedOnElement, variabilityBasedOnElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodContentKind getMethodContentKind() {
		if (methodContentKind != null && methodContentKind.eIsProxy()) {
			InternalEObject oldMethodContentKind = (InternalEObject)methodContentKind;
			methodContentKind = (MethodContentKind)eResolveProxy(oldMethodContentKind);
			if (methodContentKind != oldMethodContentKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.ENGINEERING_DOMAIN__METHOD_CONTENT_KIND, oldMethodContentKind, methodContentKind));
			}
		}
		return methodContentKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodContentKind basicGetMethodContentKind() {
		return methodContentKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodContentKind(MethodContentKind newMethodContentKind) {
		MethodContentKind oldMethodContentKind = methodContentKind;
		methodContentKind = newMethodContentKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.ENGINEERING_DOMAIN__METHOD_CONTENT_KIND, oldMethodContentKind, methodContentKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getViewpoints() {
		if (viewpoints == null) {
			viewpoints = new EObjectContainmentEList(Viewpoint.class, this, IspemPackage.ENGINEERING_DOMAIN__VIEWPOINTS);
		}
		return viewpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDefines() {
		if (defines == null) {
			defines = new EObjectResolvingEList(DomainTaskDefinition.class, this, IspemPackage.ENGINEERING_DOMAIN__DEFINES);
		}
		return defines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRealizes() {
		if (realizes == null) {
			realizes = new EObjectResolvingEList(DevelopmentMethod.class, this, IspemPackage.ENGINEERING_DOMAIN__REALIZES);
		}
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IspemPackage.ENGINEERING_DOMAIN__VIEWPOINTS:
				return ((InternalEList)getViewpoints()).basicRemove(otherEnd, msgs);
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
			case IspemPackage.ENGINEERING_DOMAIN__NAME:
				return getName();
			case IspemPackage.ENGINEERING_DOMAIN__VARIABILITY_TYPE:
				return getVariabilityType();
			case IspemPackage.ENGINEERING_DOMAIN__VARIABILITY_BASED_ON_ELEMENT:
				if (resolve) return getVariabilityBasedOnElement();
				return basicGetVariabilityBasedOnElement();
			case IspemPackage.ENGINEERING_DOMAIN__METHOD_CONTENT_KIND:
				if (resolve) return getMethodContentKind();
				return basicGetMethodContentKind();
			case IspemPackage.ENGINEERING_DOMAIN__VIEWPOINTS:
				return getViewpoints();
			case IspemPackage.ENGINEERING_DOMAIN__DEFINES:
				return getDefines();
			case IspemPackage.ENGINEERING_DOMAIN__REALIZES:
				return getRealizes();
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
			case IspemPackage.ENGINEERING_DOMAIN__NAME:
				setName((String)newValue);
				return;
			case IspemPackage.ENGINEERING_DOMAIN__VARIABILITY_TYPE:
				setVariabilityType((VariabilityType)newValue);
				return;
			case IspemPackage.ENGINEERING_DOMAIN__VARIABILITY_BASED_ON_ELEMENT:
				setVariabilityBasedOnElement((VariabilityElement)newValue);
				return;
			case IspemPackage.ENGINEERING_DOMAIN__METHOD_CONTENT_KIND:
				setMethodContentKind((MethodContentKind)newValue);
				return;
			case IspemPackage.ENGINEERING_DOMAIN__VIEWPOINTS:
				getViewpoints().clear();
				getViewpoints().addAll((Collection)newValue);
				return;
			case IspemPackage.ENGINEERING_DOMAIN__DEFINES:
				getDefines().clear();
				getDefines().addAll((Collection)newValue);
				return;
			case IspemPackage.ENGINEERING_DOMAIN__REALIZES:
				getRealizes().clear();
				getRealizes().addAll((Collection)newValue);
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
			case IspemPackage.ENGINEERING_DOMAIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IspemPackage.ENGINEERING_DOMAIN__VARIABILITY_TYPE:
				setVariabilityType(VARIABILITY_TYPE_EDEFAULT);
				return;
			case IspemPackage.ENGINEERING_DOMAIN__VARIABILITY_BASED_ON_ELEMENT:
				setVariabilityBasedOnElement((VariabilityElement)null);
				return;
			case IspemPackage.ENGINEERING_DOMAIN__METHOD_CONTENT_KIND:
				setMethodContentKind((MethodContentKind)null);
				return;
			case IspemPackage.ENGINEERING_DOMAIN__VIEWPOINTS:
				getViewpoints().clear();
				return;
			case IspemPackage.ENGINEERING_DOMAIN__DEFINES:
				getDefines().clear();
				return;
			case IspemPackage.ENGINEERING_DOMAIN__REALIZES:
				getRealizes().clear();
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
			case IspemPackage.ENGINEERING_DOMAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IspemPackage.ENGINEERING_DOMAIN__VARIABILITY_TYPE:
				return variabilityType != VARIABILITY_TYPE_EDEFAULT;
			case IspemPackage.ENGINEERING_DOMAIN__VARIABILITY_BASED_ON_ELEMENT:
				return variabilityBasedOnElement != null;
			case IspemPackage.ENGINEERING_DOMAIN__METHOD_CONTENT_KIND:
				return methodContentKind != null;
			case IspemPackage.ENGINEERING_DOMAIN__VIEWPOINTS:
				return viewpoints != null && !viewpoints.isEmpty();
			case IspemPackage.ENGINEERING_DOMAIN__DEFINES:
				return defines != null && !defines.isEmpty();
			case IspemPackage.ENGINEERING_DOMAIN__REALIZES:
				return realizes != null && !realizes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == MethodContentPackageableElement.class) {
			switch (derivedFeatureID) {
				case IspemPackage.ENGINEERING_DOMAIN__NAME: return SpemPackage.METHOD_CONTENT_PACKAGEABLE_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == VariabilityElement.class) {
			switch (derivedFeatureID) {
				case IspemPackage.ENGINEERING_DOMAIN__VARIABILITY_TYPE: return SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE;
				case IspemPackage.ENGINEERING_DOMAIN__VARIABILITY_BASED_ON_ELEMENT: return SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MethodContentElement.class) {
			switch (derivedFeatureID) {
				case IspemPackage.ENGINEERING_DOMAIN__METHOD_CONTENT_KIND: return SpemPackage.METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == MethodContentPackageableElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.METHOD_CONTENT_PACKAGEABLE_ELEMENT__NAME: return IspemPackage.ENGINEERING_DOMAIN__NAME;
				default: return -1;
			}
		}
		if (baseClass == VariabilityElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE: return IspemPackage.ENGINEERING_DOMAIN__VARIABILITY_TYPE;
				case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT: return IspemPackage.ENGINEERING_DOMAIN__VARIABILITY_BASED_ON_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MethodContentElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND: return IspemPackage.ENGINEERING_DOMAIN__METHOD_CONTENT_KIND;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", variabilityType: ");
		result.append(variabilityType);
		result.append(')');
		return result.toString();
	}

} //EngineeringDomainImpl
