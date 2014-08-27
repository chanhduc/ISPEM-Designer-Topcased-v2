/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.topcased.ispem.IspemPackage;
import org.topcased.ispem.MetaModel;
import org.topcased.ispem.WorkProductDefinition;

import org.topcased.spem.MethodContentElement;
import org.topcased.spem.MethodContentKind;
import org.topcased.spem.MethodContentPackageableElement;
import org.topcased.spem.SpemPackage;
import org.topcased.spem.VariabilityElement;
import org.topcased.spem.VariabilityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Product Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.ispem.impl.WorkProductDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.WorkProductDefinitionImpl#getVariabilityType <em>Variability Type</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.WorkProductDefinitionImpl#getVariabilityBasedOnElement <em>Variability Based On Element</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.WorkProductDefinitionImpl#getMethodContentKind <em>Method Content Kind</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.WorkProductDefinitionImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.WorkProductDefinitionImpl#getUsedReferences <em>Used References</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.WorkProductDefinitionImpl#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkProductDefinitionImpl extends OntologyLinkedElementImpl implements WorkProductDefinition {
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
	 * The cached value of the '{@link #getRootElement() <em>Root Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElement()
	 * @generated
	 * @ordered
	 */
	protected EClass rootElement;

	/**
	 * The cached value of the '{@link #getUsedReferences() <em>Used References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedReferences()
	 * @generated
	 * @ordered
	 */
	protected EList usedReferences;

	/**
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected MetaModel metamodel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IspemPackage.Literals.WORK_PRODUCT_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.WORK_PRODUCT_DEFINITION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.WORK_PRODUCT_DEFINITION__VARIABILITY_TYPE, oldVariabilityType, variabilityType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.WORK_PRODUCT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT, oldVariabilityBasedOnElement, variabilityBasedOnElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.WORK_PRODUCT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT, oldVariabilityBasedOnElement, variabilityBasedOnElement));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.WORK_PRODUCT_DEFINITION__METHOD_CONTENT_KIND, oldMethodContentKind, methodContentKind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.WORK_PRODUCT_DEFINITION__METHOD_CONTENT_KIND, oldMethodContentKind, methodContentKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootElement() {
		if (rootElement != null && rootElement.eIsProxy()) {
			InternalEObject oldRootElement = (InternalEObject)rootElement;
			rootElement = (EClass)eResolveProxy(oldRootElement);
			if (rootElement != oldRootElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.WORK_PRODUCT_DEFINITION__ROOT_ELEMENT, oldRootElement, rootElement));
			}
		}
		return rootElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetRootElement() {
		return rootElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootElement(EClass newRootElement) {
		EClass oldRootElement = rootElement;
		rootElement = newRootElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.WORK_PRODUCT_DEFINITION__ROOT_ELEMENT, oldRootElement, rootElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsedReferences() {
		if (usedReferences == null) {
			usedReferences = new EObjectResolvingEList(EReference.class, this, IspemPackage.WORK_PRODUCT_DEFINITION__USED_REFERENCES);
		}
		return usedReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModel getMetamodel() {
		if (metamodel != null && metamodel.eIsProxy()) {
			InternalEObject oldMetamodel = (InternalEObject)metamodel;
			metamodel = (MetaModel)eResolveProxy(oldMetamodel);
			if (metamodel != oldMetamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.WORK_PRODUCT_DEFINITION__METAMODEL, oldMetamodel, metamodel));
			}
		}
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModel basicGetMetamodel() {
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel(MetaModel newMetamodel) {
		MetaModel oldMetamodel = metamodel;
		metamodel = newMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.WORK_PRODUCT_DEFINITION__METAMODEL, oldMetamodel, metamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IspemPackage.WORK_PRODUCT_DEFINITION__NAME:
				return getName();
			case IspemPackage.WORK_PRODUCT_DEFINITION__VARIABILITY_TYPE:
				return getVariabilityType();
			case IspemPackage.WORK_PRODUCT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT:
				if (resolve) return getVariabilityBasedOnElement();
				return basicGetVariabilityBasedOnElement();
			case IspemPackage.WORK_PRODUCT_DEFINITION__METHOD_CONTENT_KIND:
				if (resolve) return getMethodContentKind();
				return basicGetMethodContentKind();
			case IspemPackage.WORK_PRODUCT_DEFINITION__ROOT_ELEMENT:
				if (resolve) return getRootElement();
				return basicGetRootElement();
			case IspemPackage.WORK_PRODUCT_DEFINITION__USED_REFERENCES:
				return getUsedReferences();
			case IspemPackage.WORK_PRODUCT_DEFINITION__METAMODEL:
				if (resolve) return getMetamodel();
				return basicGetMetamodel();
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
			case IspemPackage.WORK_PRODUCT_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case IspemPackage.WORK_PRODUCT_DEFINITION__VARIABILITY_TYPE:
				setVariabilityType((VariabilityType)newValue);
				return;
			case IspemPackage.WORK_PRODUCT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT:
				setVariabilityBasedOnElement((VariabilityElement)newValue);
				return;
			case IspemPackage.WORK_PRODUCT_DEFINITION__METHOD_CONTENT_KIND:
				setMethodContentKind((MethodContentKind)newValue);
				return;
			case IspemPackage.WORK_PRODUCT_DEFINITION__ROOT_ELEMENT:
				setRootElement((EClass)newValue);
				return;
			case IspemPackage.WORK_PRODUCT_DEFINITION__USED_REFERENCES:
				getUsedReferences().clear();
				getUsedReferences().addAll((Collection)newValue);
				return;
			case IspemPackage.WORK_PRODUCT_DEFINITION__METAMODEL:
				setMetamodel((MetaModel)newValue);
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
			case IspemPackage.WORK_PRODUCT_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IspemPackage.WORK_PRODUCT_DEFINITION__VARIABILITY_TYPE:
				setVariabilityType(VARIABILITY_TYPE_EDEFAULT);
				return;
			case IspemPackage.WORK_PRODUCT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT:
				setVariabilityBasedOnElement((VariabilityElement)null);
				return;
			case IspemPackage.WORK_PRODUCT_DEFINITION__METHOD_CONTENT_KIND:
				setMethodContentKind((MethodContentKind)null);
				return;
			case IspemPackage.WORK_PRODUCT_DEFINITION__ROOT_ELEMENT:
				setRootElement((EClass)null);
				return;
			case IspemPackage.WORK_PRODUCT_DEFINITION__USED_REFERENCES:
				getUsedReferences().clear();
				return;
			case IspemPackage.WORK_PRODUCT_DEFINITION__METAMODEL:
				setMetamodel((MetaModel)null);
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
			case IspemPackage.WORK_PRODUCT_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IspemPackage.WORK_PRODUCT_DEFINITION__VARIABILITY_TYPE:
				return variabilityType != VARIABILITY_TYPE_EDEFAULT;
			case IspemPackage.WORK_PRODUCT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT:
				return variabilityBasedOnElement != null;
			case IspemPackage.WORK_PRODUCT_DEFINITION__METHOD_CONTENT_KIND:
				return methodContentKind != null;
			case IspemPackage.WORK_PRODUCT_DEFINITION__ROOT_ELEMENT:
				return rootElement != null;
			case IspemPackage.WORK_PRODUCT_DEFINITION__USED_REFERENCES:
				return usedReferences != null && !usedReferences.isEmpty();
			case IspemPackage.WORK_PRODUCT_DEFINITION__METAMODEL:
				return metamodel != null;
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
				case IspemPackage.WORK_PRODUCT_DEFINITION__NAME: return SpemPackage.METHOD_CONTENT_PACKAGEABLE_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == VariabilityElement.class) {
			switch (derivedFeatureID) {
				case IspemPackage.WORK_PRODUCT_DEFINITION__VARIABILITY_TYPE: return SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE;
				case IspemPackage.WORK_PRODUCT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT: return SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MethodContentElement.class) {
			switch (derivedFeatureID) {
				case IspemPackage.WORK_PRODUCT_DEFINITION__METHOD_CONTENT_KIND: return SpemPackage.METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;
				default: return -1;
			}
		}
		if (baseClass == org.topcased.spem.WorkProductDefinition.class) {
			switch (derivedFeatureID) {
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
				case SpemPackage.METHOD_CONTENT_PACKAGEABLE_ELEMENT__NAME: return IspemPackage.WORK_PRODUCT_DEFINITION__NAME;
				default: return -1;
			}
		}
		if (baseClass == VariabilityElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE: return IspemPackage.WORK_PRODUCT_DEFINITION__VARIABILITY_TYPE;
				case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT: return IspemPackage.WORK_PRODUCT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MethodContentElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND: return IspemPackage.WORK_PRODUCT_DEFINITION__METHOD_CONTENT_KIND;
				default: return -1;
			}
		}
		if (baseClass == org.topcased.spem.WorkProductDefinition.class) {
			switch (baseFeatureID) {
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

} //WorkProductDefinitionImpl
