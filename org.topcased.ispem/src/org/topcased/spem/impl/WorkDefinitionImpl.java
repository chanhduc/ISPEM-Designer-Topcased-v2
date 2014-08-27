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

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectEList;

import org.topcased.spem.SpemPackage;
import org.topcased.spem.WorkDefinition;
import org.topcased.spem.WorkDefinitionParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.spem.impl.WorkDefinitionImpl#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link org.topcased.spem.impl.WorkDefinitionImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.topcased.spem.impl.WorkDefinitionImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WorkDefinitionImpl extends EObjectImpl implements WorkDefinition {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SpemPackage.Literals.WORK_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPreCondition() {
		if (preCondition == null) {
			preCondition = new EDataTypeUniqueEList(String.class, this, SpemPackage.WORK_DEFINITION__PRE_CONDITION);
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
			postCondition = new EDataTypeUniqueEList(String.class, this, SpemPackage.WORK_DEFINITION__POST_CONDITION);
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
			ownedParameter = new EObjectEList(WorkDefinitionParameter.class, this, SpemPackage.WORK_DEFINITION__OWNED_PARAMETER);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.WORK_DEFINITION__PRE_CONDITION:
				return getPreCondition();
			case SpemPackage.WORK_DEFINITION__POST_CONDITION:
				return getPostCondition();
			case SpemPackage.WORK_DEFINITION__OWNED_PARAMETER:
				return getOwnedParameter();
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
			case SpemPackage.WORK_DEFINITION__PRE_CONDITION:
				getPreCondition().clear();
				getPreCondition().addAll((Collection)newValue);
				return;
			case SpemPackage.WORK_DEFINITION__POST_CONDITION:
				getPostCondition().clear();
				getPostCondition().addAll((Collection)newValue);
				return;
			case SpemPackage.WORK_DEFINITION__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection)newValue);
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
			case SpemPackage.WORK_DEFINITION__PRE_CONDITION:
				getPreCondition().clear();
				return;
			case SpemPackage.WORK_DEFINITION__POST_CONDITION:
				getPostCondition().clear();
				return;
			case SpemPackage.WORK_DEFINITION__OWNED_PARAMETER:
				getOwnedParameter().clear();
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
			case SpemPackage.WORK_DEFINITION__PRE_CONDITION:
				return preCondition != null && !preCondition.isEmpty();
			case SpemPackage.WORK_DEFINITION__POST_CONDITION:
				return postCondition != null && !postCondition.isEmpty();
			case SpemPackage.WORK_DEFINITION__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
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
		result.append(" (preCondition: ");
		result.append(preCondition);
		result.append(", postCondition: ");
		result.append(postCondition);
		result.append(')');
		return result.toString();
	}

} //WorkDefinitionImpl
