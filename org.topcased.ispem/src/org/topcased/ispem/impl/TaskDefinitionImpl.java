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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.topcased.ispem.IspemPackage;
import org.topcased.ispem.Level;
import org.topcased.ispem.TaskDefinition;
import org.topcased.ispem.Viewpoint;

import org.topcased.spem.Default_TaskDefinitionParameter;
import org.topcased.spem.MethodContentElement;
import org.topcased.spem.MethodContentKind;
import org.topcased.spem.MethodContentPackageableElement;
import org.topcased.spem.Qualification;
import org.topcased.spem.SpemPackage;
import org.topcased.spem.Step;
import org.topcased.spem.ToolDefinition;
import org.topcased.spem.VariabilityElement;
import org.topcased.spem.VariabilityType;
import org.topcased.spem.WorkDefinition;
import org.topcased.spem.WorkDefinitionParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.ispem.impl.TaskDefinitionImpl#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.TaskDefinitionImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.TaskDefinitionImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.TaskDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.TaskDefinitionImpl#getVariabilityType <em>Variability Type</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.TaskDefinitionImpl#getVariabilityBasedOnElement <em>Variability Based On Element</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.TaskDefinitionImpl#getMethodContentKind <em>Method Content Kind</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.TaskDefinitionImpl#getOwnedTaskDefinitionParameter <em>Owned Task Definition Parameter</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.TaskDefinitionImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.TaskDefinitionImpl#getRequiredQualification <em>Required Qualification</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.TaskDefinitionImpl#getUsedTool <em>Used Tool</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskDefinitionImpl extends OntologyLinkedElementImpl implements TaskDefinition {
	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected EList preCondition;

	/**
	 * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected EList postCondition;

	/**
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList ownedParameter;

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
	 * The cached value of the '{@link #getOwnedTaskDefinitionParameter() <em>Owned Task Definition Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTaskDefinitionParameter()
	 * @generated
	 * @ordered
	 */
	protected EList ownedTaskDefinitionParameter;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList step;

	/**
	 * The cached value of the '{@link #getRequiredQualification() <em>Required Qualification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredQualification()
	 * @generated
	 * @ordered
	 */
	protected EList requiredQualification;

	/**
	 * The cached value of the '{@link #getUsedTool() <em>Used Tool</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedTool()
	 * @generated
	 * @ordered
	 */
	protected EList usedTool;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IspemPackage.Literals.TASK_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPreCondition() {
		if (preCondition == null) {
			preCondition = new EDataTypeUniqueEList(String.class, this, IspemPackage.TASK_DEFINITION__PRE_CONDITION);
		}
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPostCondition() {
		if (postCondition == null) {
			postCondition = new EDataTypeUniqueEList(String.class, this, IspemPackage.TASK_DEFINITION__POST_CONDITION);
		}
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectEList(WorkDefinitionParameter.class, this, IspemPackage.TASK_DEFINITION__OWNED_PARAMETER);
		}
		return ownedParameter;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.TASK_DEFINITION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.TASK_DEFINITION__VARIABILITY_TYPE, oldVariabilityType, variabilityType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT, oldVariabilityBasedOnElement, variabilityBasedOnElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT, oldVariabilityBasedOnElement, variabilityBasedOnElement));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.TASK_DEFINITION__METHOD_CONTENT_KIND, oldMethodContentKind, methodContentKind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.TASK_DEFINITION__METHOD_CONTENT_KIND, oldMethodContentKind, methodContentKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedTaskDefinitionParameter() {
		if (ownedTaskDefinitionParameter == null) {
			ownedTaskDefinitionParameter = new EObjectContainmentEList(Default_TaskDefinitionParameter.class, this, IspemPackage.TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER);
		}
		return ownedTaskDefinitionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsedTool() {
		if (usedTool == null) {
			usedTool = new EObjectResolvingEList(ToolDefinition.class, this, IspemPackage.TASK_DEFINITION__USED_TOOL);
		}
		return usedTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStep() {
		if (step == null) {
			step = new EObjectContainmentEList(Step.class, this, IspemPackage.TASK_DEFINITION__STEP);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRequiredQualification() {
		if (requiredQualification == null) {
			requiredQualification = new EObjectResolvingEList(Qualification.class, this, IspemPackage.TASK_DEFINITION__REQUIRED_QUALIFICATION);
		}
		return requiredQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IspemPackage.TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER:
				return ((InternalEList)getOwnedTaskDefinitionParameter()).basicRemove(otherEnd, msgs);
			case IspemPackage.TASK_DEFINITION__STEP:
				return ((InternalEList)getStep()).basicRemove(otherEnd, msgs);
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
			case IspemPackage.TASK_DEFINITION__PRE_CONDITION:
				return getPreCondition();
			case IspemPackage.TASK_DEFINITION__POST_CONDITION:
				return getPostCondition();
			case IspemPackage.TASK_DEFINITION__OWNED_PARAMETER:
				return getOwnedParameter();
			case IspemPackage.TASK_DEFINITION__NAME:
				return getName();
			case IspemPackage.TASK_DEFINITION__VARIABILITY_TYPE:
				return getVariabilityType();
			case IspemPackage.TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT:
				if (resolve) return getVariabilityBasedOnElement();
				return basicGetVariabilityBasedOnElement();
			case IspemPackage.TASK_DEFINITION__METHOD_CONTENT_KIND:
				if (resolve) return getMethodContentKind();
				return basicGetMethodContentKind();
			case IspemPackage.TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER:
				return getOwnedTaskDefinitionParameter();
			case IspemPackage.TASK_DEFINITION__STEP:
				return getStep();
			case IspemPackage.TASK_DEFINITION__REQUIRED_QUALIFICATION:
				return getRequiredQualification();
			case IspemPackage.TASK_DEFINITION__USED_TOOL:
				return getUsedTool();
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
			case IspemPackage.TASK_DEFINITION__PRE_CONDITION:
				getPreCondition().clear();
				getPreCondition().addAll((Collection)newValue);
				return;
			case IspemPackage.TASK_DEFINITION__POST_CONDITION:
				getPostCondition().clear();
				getPostCondition().addAll((Collection)newValue);
				return;
			case IspemPackage.TASK_DEFINITION__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection)newValue);
				return;
			case IspemPackage.TASK_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case IspemPackage.TASK_DEFINITION__VARIABILITY_TYPE:
				setVariabilityType((VariabilityType)newValue);
				return;
			case IspemPackage.TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT:
				setVariabilityBasedOnElement((VariabilityElement)newValue);
				return;
			case IspemPackage.TASK_DEFINITION__METHOD_CONTENT_KIND:
				setMethodContentKind((MethodContentKind)newValue);
				return;
			case IspemPackage.TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER:
				getOwnedTaskDefinitionParameter().clear();
				getOwnedTaskDefinitionParameter().addAll((Collection)newValue);
				return;
			case IspemPackage.TASK_DEFINITION__STEP:
				getStep().clear();
				getStep().addAll((Collection)newValue);
				return;
			case IspemPackage.TASK_DEFINITION__REQUIRED_QUALIFICATION:
				getRequiredQualification().clear();
				getRequiredQualification().addAll((Collection)newValue);
				return;
			case IspemPackage.TASK_DEFINITION__USED_TOOL:
				getUsedTool().clear();
				getUsedTool().addAll((Collection)newValue);
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
			case IspemPackage.TASK_DEFINITION__PRE_CONDITION:
				getPreCondition().clear();
				return;
			case IspemPackage.TASK_DEFINITION__POST_CONDITION:
				getPostCondition().clear();
				return;
			case IspemPackage.TASK_DEFINITION__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case IspemPackage.TASK_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IspemPackage.TASK_DEFINITION__VARIABILITY_TYPE:
				setVariabilityType(VARIABILITY_TYPE_EDEFAULT);
				return;
			case IspemPackage.TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT:
				setVariabilityBasedOnElement((VariabilityElement)null);
				return;
			case IspemPackage.TASK_DEFINITION__METHOD_CONTENT_KIND:
				setMethodContentKind((MethodContentKind)null);
				return;
			case IspemPackage.TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER:
				getOwnedTaskDefinitionParameter().clear();
				return;
			case IspemPackage.TASK_DEFINITION__STEP:
				getStep().clear();
				return;
			case IspemPackage.TASK_DEFINITION__REQUIRED_QUALIFICATION:
				getRequiredQualification().clear();
				return;
			case IspemPackage.TASK_DEFINITION__USED_TOOL:
				getUsedTool().clear();
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
			case IspemPackage.TASK_DEFINITION__PRE_CONDITION:
				return preCondition != null && !preCondition.isEmpty();
			case IspemPackage.TASK_DEFINITION__POST_CONDITION:
				return postCondition != null && !postCondition.isEmpty();
			case IspemPackage.TASK_DEFINITION__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case IspemPackage.TASK_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IspemPackage.TASK_DEFINITION__VARIABILITY_TYPE:
				return variabilityType != VARIABILITY_TYPE_EDEFAULT;
			case IspemPackage.TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT:
				return variabilityBasedOnElement != null;
			case IspemPackage.TASK_DEFINITION__METHOD_CONTENT_KIND:
				return methodContentKind != null;
			case IspemPackage.TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER:
				return ownedTaskDefinitionParameter != null && !ownedTaskDefinitionParameter.isEmpty();
			case IspemPackage.TASK_DEFINITION__STEP:
				return step != null && !step.isEmpty();
			case IspemPackage.TASK_DEFINITION__REQUIRED_QUALIFICATION:
				return requiredQualification != null && !requiredQualification.isEmpty();
			case IspemPackage.TASK_DEFINITION__USED_TOOL:
				return usedTool != null && !usedTool.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == WorkDefinition.class) {
			switch (derivedFeatureID) {
				case IspemPackage.TASK_DEFINITION__PRE_CONDITION: return SpemPackage.WORK_DEFINITION__PRE_CONDITION;
				case IspemPackage.TASK_DEFINITION__POST_CONDITION: return SpemPackage.WORK_DEFINITION__POST_CONDITION;
				case IspemPackage.TASK_DEFINITION__OWNED_PARAMETER: return SpemPackage.WORK_DEFINITION__OWNED_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == MethodContentPackageableElement.class) {
			switch (derivedFeatureID) {
				case IspemPackage.TASK_DEFINITION__NAME: return SpemPackage.METHOD_CONTENT_PACKAGEABLE_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == VariabilityElement.class) {
			switch (derivedFeatureID) {
				case IspemPackage.TASK_DEFINITION__VARIABILITY_TYPE: return SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE;
				case IspemPackage.TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT: return SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MethodContentElement.class) {
			switch (derivedFeatureID) {
				case IspemPackage.TASK_DEFINITION__METHOD_CONTENT_KIND: return SpemPackage.METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;
				default: return -1;
			}
		}
		if (baseClass == org.topcased.spem.TaskDefinition.class) {
			switch (derivedFeatureID) {
				case IspemPackage.TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER: return SpemPackage.TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER;
				case IspemPackage.TASK_DEFINITION__STEP: return SpemPackage.TASK_DEFINITION__STEP;
				case IspemPackage.TASK_DEFINITION__REQUIRED_QUALIFICATION: return SpemPackage.TASK_DEFINITION__REQUIRED_QUALIFICATION;
				case IspemPackage.TASK_DEFINITION__USED_TOOL: return SpemPackage.TASK_DEFINITION__USED_TOOL;
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
		if (baseClass == WorkDefinition.class) {
			switch (baseFeatureID) {
				case SpemPackage.WORK_DEFINITION__PRE_CONDITION: return IspemPackage.TASK_DEFINITION__PRE_CONDITION;
				case SpemPackage.WORK_DEFINITION__POST_CONDITION: return IspemPackage.TASK_DEFINITION__POST_CONDITION;
				case SpemPackage.WORK_DEFINITION__OWNED_PARAMETER: return IspemPackage.TASK_DEFINITION__OWNED_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == MethodContentPackageableElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.METHOD_CONTENT_PACKAGEABLE_ELEMENT__NAME: return IspemPackage.TASK_DEFINITION__NAME;
				default: return -1;
			}
		}
		if (baseClass == VariabilityElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE: return IspemPackage.TASK_DEFINITION__VARIABILITY_TYPE;
				case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT: return IspemPackage.TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MethodContentElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND: return IspemPackage.TASK_DEFINITION__METHOD_CONTENT_KIND;
				default: return -1;
			}
		}
		if (baseClass == org.topcased.spem.TaskDefinition.class) {
			switch (baseFeatureID) {
				case SpemPackage.TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER: return IspemPackage.TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER;
				case SpemPackage.TASK_DEFINITION__STEP: return IspemPackage.TASK_DEFINITION__STEP;
				case SpemPackage.TASK_DEFINITION__REQUIRED_QUALIFICATION: return IspemPackage.TASK_DEFINITION__REQUIRED_QUALIFICATION;
				case SpemPackage.TASK_DEFINITION__USED_TOOL: return IspemPackage.TASK_DEFINITION__USED_TOOL;
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
		result.append(" (preCondition: ");
		result.append(preCondition);
		result.append(", postCondition: ");
		result.append(postCondition);
		result.append(", name: ");
		result.append(name);
		result.append(", variabilityType: ");
		result.append(variabilityType);
		result.append(')');
		return result.toString();
	}

} //TaskDefinitionImpl
