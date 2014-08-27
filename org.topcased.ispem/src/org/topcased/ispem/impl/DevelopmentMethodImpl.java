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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.topcased.ispem.DevelopmentMethod;
import org.topcased.ispem.IspemPackage;
import org.topcased.ispem.MethodTaskDefinition;
import org.topcased.ispem.Viewpoint;

import org.topcased.spem.Category;
import org.topcased.spem.DescribableElement;
import org.topcased.spem.MethodContentElement;
import org.topcased.spem.MethodContentKind;
import org.topcased.spem.MethodContentPackageableElement;
import org.topcased.spem.SpemPackage;
import org.topcased.spem.VariabilityElement;
import org.topcased.spem.VariabilityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Development Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.ispem.impl.DevelopmentMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.DevelopmentMethodImpl#getVariabilityType <em>Variability Type</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.DevelopmentMethodImpl#getVariabilityBasedOnElement <em>Variability Based On Element</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.DevelopmentMethodImpl#getMethodContentKind <em>Method Content Kind</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.DevelopmentMethodImpl#getSubCategory <em>Sub Category</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.DevelopmentMethodImpl#getCategorizedElement <em>Categorized Element</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.DevelopmentMethodImpl#getSupports <em>Supports</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.DevelopmentMethodImpl#getDefines <em>Defines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DevelopmentMethodImpl extends OntologyLinkedElementImpl implements DevelopmentMethod {
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
	 * The cached value of the '{@link #getSubCategory() <em>Sub Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory()
	 * @generated
	 * @ordered
	 */
	protected EList subCategory;

	/**
	 * The cached value of the '{@link #getCategorizedElement() <em>Categorized Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorizedElement()
	 * @generated
	 * @ordered
	 */
	protected EList categorizedElement;

	/**
	 * The cached value of the '{@link #getSupports() <em>Supports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupports()
	 * @generated
	 * @ordered
	 */
	protected EList supports;

	/**
	 * The cached value of the '{@link #getDefines() <em>Defines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefines()
	 * @generated
	 * @ordered
	 */
	protected MethodTaskDefinition defines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevelopmentMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IspemPackage.Literals.DEVELOPMENT_METHOD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.DEVELOPMENT_METHOD__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.DEVELOPMENT_METHOD__VARIABILITY_TYPE, oldVariabilityType, variabilityType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.DEVELOPMENT_METHOD__VARIABILITY_BASED_ON_ELEMENT, oldVariabilityBasedOnElement, variabilityBasedOnElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.DEVELOPMENT_METHOD__VARIABILITY_BASED_ON_ELEMENT, oldVariabilityBasedOnElement, variabilityBasedOnElement));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.DEVELOPMENT_METHOD__METHOD_CONTENT_KIND, oldMethodContentKind, methodContentKind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.DEVELOPMENT_METHOD__METHOD_CONTENT_KIND, oldMethodContentKind, methodContentKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubCategory() {
		if (subCategory == null) {
			subCategory = new EObjectResolvingEList(Category.class, this, IspemPackage.DEVELOPMENT_METHOD__SUB_CATEGORY);
		}
		return subCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCategorizedElement() {
		if (categorizedElement == null) {
			categorizedElement = new EObjectWithInverseResolvingEList.ManyInverse(DescribableElement.class, this, IspemPackage.DEVELOPMENT_METHOD__CATEGORIZED_ELEMENT, SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY);
		}
		return categorizedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSupports() {
		if (supports == null) {
			supports = new EObjectResolvingEList(Viewpoint.class, this, IspemPackage.DEVELOPMENT_METHOD__SUPPORTS);
		}
		return supports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodTaskDefinition getDefines() {
		if (defines != null && defines.eIsProxy()) {
			InternalEObject oldDefines = (InternalEObject)defines;
			defines = (MethodTaskDefinition)eResolveProxy(oldDefines);
			if (defines != oldDefines) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.DEVELOPMENT_METHOD__DEFINES, oldDefines, defines));
			}
		}
		return defines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodTaskDefinition basicGetDefines() {
		return defines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefines(MethodTaskDefinition newDefines) {
		MethodTaskDefinition oldDefines = defines;
		defines = newDefines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.DEVELOPMENT_METHOD__DEFINES, oldDefines, defines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IspemPackage.DEVELOPMENT_METHOD__CATEGORIZED_ELEMENT:
				return ((InternalEList)getCategorizedElement()).basicAdd(otherEnd, msgs);
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
			case IspemPackage.DEVELOPMENT_METHOD__CATEGORIZED_ELEMENT:
				return ((InternalEList)getCategorizedElement()).basicRemove(otherEnd, msgs);
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
			case IspemPackage.DEVELOPMENT_METHOD__NAME:
				return getName();
			case IspemPackage.DEVELOPMENT_METHOD__VARIABILITY_TYPE:
				return getVariabilityType();
			case IspemPackage.DEVELOPMENT_METHOD__VARIABILITY_BASED_ON_ELEMENT:
				if (resolve) return getVariabilityBasedOnElement();
				return basicGetVariabilityBasedOnElement();
			case IspemPackage.DEVELOPMENT_METHOD__METHOD_CONTENT_KIND:
				if (resolve) return getMethodContentKind();
				return basicGetMethodContentKind();
			case IspemPackage.DEVELOPMENT_METHOD__SUB_CATEGORY:
				return getSubCategory();
			case IspemPackage.DEVELOPMENT_METHOD__CATEGORIZED_ELEMENT:
				return getCategorizedElement();
			case IspemPackage.DEVELOPMENT_METHOD__SUPPORTS:
				return getSupports();
			case IspemPackage.DEVELOPMENT_METHOD__DEFINES:
				if (resolve) return getDefines();
				return basicGetDefines();
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
			case IspemPackage.DEVELOPMENT_METHOD__NAME:
				setName((String)newValue);
				return;
			case IspemPackage.DEVELOPMENT_METHOD__VARIABILITY_TYPE:
				setVariabilityType((VariabilityType)newValue);
				return;
			case IspemPackage.DEVELOPMENT_METHOD__VARIABILITY_BASED_ON_ELEMENT:
				setVariabilityBasedOnElement((VariabilityElement)newValue);
				return;
			case IspemPackage.DEVELOPMENT_METHOD__METHOD_CONTENT_KIND:
				setMethodContentKind((MethodContentKind)newValue);
				return;
			case IspemPackage.DEVELOPMENT_METHOD__SUB_CATEGORY:
				getSubCategory().clear();
				getSubCategory().addAll((Collection)newValue);
				return;
			case IspemPackage.DEVELOPMENT_METHOD__CATEGORIZED_ELEMENT:
				getCategorizedElement().clear();
				getCategorizedElement().addAll((Collection)newValue);
				return;
			case IspemPackage.DEVELOPMENT_METHOD__SUPPORTS:
				getSupports().clear();
				getSupports().addAll((Collection)newValue);
				return;
			case IspemPackage.DEVELOPMENT_METHOD__DEFINES:
				setDefines((MethodTaskDefinition)newValue);
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
			case IspemPackage.DEVELOPMENT_METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IspemPackage.DEVELOPMENT_METHOD__VARIABILITY_TYPE:
				setVariabilityType(VARIABILITY_TYPE_EDEFAULT);
				return;
			case IspemPackage.DEVELOPMENT_METHOD__VARIABILITY_BASED_ON_ELEMENT:
				setVariabilityBasedOnElement((VariabilityElement)null);
				return;
			case IspemPackage.DEVELOPMENT_METHOD__METHOD_CONTENT_KIND:
				setMethodContentKind((MethodContentKind)null);
				return;
			case IspemPackage.DEVELOPMENT_METHOD__SUB_CATEGORY:
				getSubCategory().clear();
				return;
			case IspemPackage.DEVELOPMENT_METHOD__CATEGORIZED_ELEMENT:
				getCategorizedElement().clear();
				return;
			case IspemPackage.DEVELOPMENT_METHOD__SUPPORTS:
				getSupports().clear();
				return;
			case IspemPackage.DEVELOPMENT_METHOD__DEFINES:
				setDefines((MethodTaskDefinition)null);
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
			case IspemPackage.DEVELOPMENT_METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IspemPackage.DEVELOPMENT_METHOD__VARIABILITY_TYPE:
				return variabilityType != VARIABILITY_TYPE_EDEFAULT;
			case IspemPackage.DEVELOPMENT_METHOD__VARIABILITY_BASED_ON_ELEMENT:
				return variabilityBasedOnElement != null;
			case IspemPackage.DEVELOPMENT_METHOD__METHOD_CONTENT_KIND:
				return methodContentKind != null;
			case IspemPackage.DEVELOPMENT_METHOD__SUB_CATEGORY:
				return subCategory != null && !subCategory.isEmpty();
			case IspemPackage.DEVELOPMENT_METHOD__CATEGORIZED_ELEMENT:
				return categorizedElement != null && !categorizedElement.isEmpty();
			case IspemPackage.DEVELOPMENT_METHOD__SUPPORTS:
				return supports != null && !supports.isEmpty();
			case IspemPackage.DEVELOPMENT_METHOD__DEFINES:
				return defines != null;
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
				case IspemPackage.DEVELOPMENT_METHOD__NAME: return SpemPackage.METHOD_CONTENT_PACKAGEABLE_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == VariabilityElement.class) {
			switch (derivedFeatureID) {
				case IspemPackage.DEVELOPMENT_METHOD__VARIABILITY_TYPE: return SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE;
				case IspemPackage.DEVELOPMENT_METHOD__VARIABILITY_BASED_ON_ELEMENT: return SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MethodContentElement.class) {
			switch (derivedFeatureID) {
				case IspemPackage.DEVELOPMENT_METHOD__METHOD_CONTENT_KIND: return SpemPackage.METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;
				default: return -1;
			}
		}
		if (baseClass == Category.class) {
			switch (derivedFeatureID) {
				case IspemPackage.DEVELOPMENT_METHOD__SUB_CATEGORY: return SpemPackage.CATEGORY__SUB_CATEGORY;
				case IspemPackage.DEVELOPMENT_METHOD__CATEGORIZED_ELEMENT: return SpemPackage.CATEGORY__CATEGORIZED_ELEMENT;
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
				case SpemPackage.METHOD_CONTENT_PACKAGEABLE_ELEMENT__NAME: return IspemPackage.DEVELOPMENT_METHOD__NAME;
				default: return -1;
			}
		}
		if (baseClass == VariabilityElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE: return IspemPackage.DEVELOPMENT_METHOD__VARIABILITY_TYPE;
				case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT: return IspemPackage.DEVELOPMENT_METHOD__VARIABILITY_BASED_ON_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MethodContentElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND: return IspemPackage.DEVELOPMENT_METHOD__METHOD_CONTENT_KIND;
				default: return -1;
			}
		}
		if (baseClass == Category.class) {
			switch (baseFeatureID) {
				case SpemPackage.CATEGORY__SUB_CATEGORY: return IspemPackage.DEVELOPMENT_METHOD__SUB_CATEGORY;
				case SpemPackage.CATEGORY__CATEGORIZED_ELEMENT: return IspemPackage.DEVELOPMENT_METHOD__CATEGORIZED_ELEMENT;
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

} //DevelopmentMethodImpl
