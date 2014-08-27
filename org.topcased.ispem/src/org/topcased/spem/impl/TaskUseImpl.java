/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.topcased.spem.ProcessParameter;
import org.topcased.spem.Qualification;
import org.topcased.spem.SpemPackage;
import org.topcased.spem.Step;
import org.topcased.spem.TaskDefinition;
import org.topcased.spem.TaskUse;
import org.topcased.spem.WorkBreakdownElement;
import org.topcased.spem.WorkSequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.spem.impl.TaskUseImpl#isIsRepeatable <em>Is Repeatable</em>}</li>
 *   <li>{@link org.topcased.spem.impl.TaskUseImpl#isIsOngoing <em>Is Ongoing</em>}</li>
 *   <li>{@link org.topcased.spem.impl.TaskUseImpl#isIsEventDriven <em>Is Event Driven</em>}</li>
 *   <li>{@link org.topcased.spem.impl.TaskUseImpl#getLinkToPredecessor <em>Link To Predecessor</em>}</li>
 *   <li>{@link org.topcased.spem.impl.TaskUseImpl#getLinkToSuccessor <em>Link To Successor</em>}</li>
 *   <li>{@link org.topcased.spem.impl.TaskUseImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.topcased.spem.impl.TaskUseImpl#getUsedQualification <em>Used Qualification</em>}</li>
 *   <li>{@link org.topcased.spem.impl.TaskUseImpl#getSelectedStep <em>Selected Step</em>}</li>
 *   <li>{@link org.topcased.spem.impl.TaskUseImpl#getOwnedProcessParameter <em>Owned Process Parameter</em>}</li>
 *   <li>{@link org.topcased.spem.impl.TaskUseImpl#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link org.topcased.spem.impl.TaskUseImpl#getPostCondition <em>Post Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskUseImpl extends MethodContentUseImpl implements TaskUse {
	/**
	 * The default value of the '{@link #isIsRepeatable() <em>Is Repeatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRepeatable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REPEATABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRepeatable() <em>Is Repeatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRepeatable()
	 * @generated
	 * @ordered
	 */
	protected boolean isRepeatable = IS_REPEATABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOngoing() <em>Is Ongoing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOngoing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ONGOING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOngoing() <em>Is Ongoing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOngoing()
	 * @generated
	 * @ordered
	 */
	protected boolean isOngoing = IS_ONGOING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEventDriven() <em>Is Event Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEventDriven()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EVENT_DRIVEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEventDriven() <em>Is Event Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEventDriven()
	 * @generated
	 * @ordered
	 */
	protected boolean isEventDriven = IS_EVENT_DRIVEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkToPredecessor() <em>Link To Predecessor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToPredecessor()
	 * @generated
	 * @ordered
	 */
	protected EList linkToPredecessor;

	/**
	 * The cached value of the '{@link #getLinkToSuccessor() <em>Link To Successor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToSuccessor()
	 * @generated
	 * @ordered
	 */
	protected EList linkToSuccessor;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected TaskDefinition task;

	/**
	 * The cached value of the '{@link #getUsedQualification() <em>Used Qualification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedQualification()
	 * @generated
	 * @ordered
	 */
	protected EList usedQualification;

	/**
	 * The cached value of the '{@link #getSelectedStep() <em>Selected Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedStep()
	 * @generated
	 * @ordered
	 */
	protected EList selectedStep;

	/**
	 * The cached value of the '{@link #getOwnedProcessParameter() <em>Owned Process Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProcessParameter()
	 * @generated
	 * @ordered
	 */
	protected EList ownedProcessParameter;

	/**
	 * The default value of the '{@link #getPreCondition() <em>Pre Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected String preCondition = PRE_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostCondition() <em>Post Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected String postCondition = POST_CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SpemPackage.Literals.TASK_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRepeatable() {
		return isRepeatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRepeatable(boolean newIsRepeatable) {
		boolean oldIsRepeatable = isRepeatable;
		isRepeatable = newIsRepeatable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_USE__IS_REPEATABLE, oldIsRepeatable, isRepeatable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOngoing() {
		return isOngoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOngoing(boolean newIsOngoing) {
		boolean oldIsOngoing = isOngoing;
		isOngoing = newIsOngoing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_USE__IS_ONGOING, oldIsOngoing, isOngoing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEventDriven() {
		return isEventDriven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEventDriven(boolean newIsEventDriven) {
		boolean oldIsEventDriven = isEventDriven;
		isEventDriven = newIsEventDriven;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_USE__IS_EVENT_DRIVEN, oldIsEventDriven, isEventDriven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLinkToPredecessor() {
		if (linkToPredecessor == null) {
			linkToPredecessor = new EObjectWithInverseResolvingEList(WorkSequence.class, this, SpemPackage.TASK_USE__LINK_TO_PREDECESSOR, SpemPackage.WORK_SEQUENCE__SUCCESSOR);
		}
		return linkToPredecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLinkToSuccessor() {
		if (linkToSuccessor == null) {
			linkToSuccessor = new EObjectWithInverseResolvingEList(WorkSequence.class, this, SpemPackage.TASK_USE__LINK_TO_SUCCESSOR, SpemPackage.WORK_SEQUENCE__PREDECESSOR);
		}
		return linkToSuccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDefinition getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (TaskDefinition)eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.TASK_USE__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDefinition basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(TaskDefinition newTask) {
		TaskDefinition oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_USE__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsedQualification() {
		if (usedQualification == null) {
			usedQualification = new EObjectResolvingEList(Qualification.class, this, SpemPackage.TASK_USE__USED_QUALIFICATION);
		}
		return usedQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSelectedStep() {
		if (selectedStep == null) {
			selectedStep = new EObjectResolvingEList(Step.class, this, SpemPackage.TASK_USE__SELECTED_STEP);
		}
		return selectedStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedProcessParameter() {
		if (ownedProcessParameter == null) {
			ownedProcessParameter = new EObjectContainmentEList(ProcessParameter.class, this, SpemPackage.TASK_USE__OWNED_PROCESS_PARAMETER);
		}
		return ownedProcessParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreCondition() {
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreCondition(String newPreCondition) {
		String oldPreCondition = preCondition;
		preCondition = newPreCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_USE__PRE_CONDITION, oldPreCondition, preCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostCondition() {
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostCondition(String newPostCondition) {
		String oldPostCondition = postCondition;
		postCondition = newPostCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_USE__POST_CONDITION, oldPostCondition, postCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemPackage.TASK_USE__LINK_TO_PREDECESSOR:
				return ((InternalEList)getLinkToPredecessor()).basicAdd(otherEnd, msgs);
			case SpemPackage.TASK_USE__LINK_TO_SUCCESSOR:
				return ((InternalEList)getLinkToSuccessor()).basicAdd(otherEnd, msgs);
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
			case SpemPackage.TASK_USE__LINK_TO_PREDECESSOR:
				return ((InternalEList)getLinkToPredecessor()).basicRemove(otherEnd, msgs);
			case SpemPackage.TASK_USE__LINK_TO_SUCCESSOR:
				return ((InternalEList)getLinkToSuccessor()).basicRemove(otherEnd, msgs);
			case SpemPackage.TASK_USE__OWNED_PROCESS_PARAMETER:
				return ((InternalEList)getOwnedProcessParameter()).basicRemove(otherEnd, msgs);
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
			case SpemPackage.TASK_USE__IS_REPEATABLE:
				return isIsRepeatable() ? Boolean.TRUE : Boolean.FALSE;
			case SpemPackage.TASK_USE__IS_ONGOING:
				return isIsOngoing() ? Boolean.TRUE : Boolean.FALSE;
			case SpemPackage.TASK_USE__IS_EVENT_DRIVEN:
				return isIsEventDriven() ? Boolean.TRUE : Boolean.FALSE;
			case SpemPackage.TASK_USE__LINK_TO_PREDECESSOR:
				return getLinkToPredecessor();
			case SpemPackage.TASK_USE__LINK_TO_SUCCESSOR:
				return getLinkToSuccessor();
			case SpemPackage.TASK_USE__TASK:
				if (resolve) return getTask();
				return basicGetTask();
			case SpemPackage.TASK_USE__USED_QUALIFICATION:
				return getUsedQualification();
			case SpemPackage.TASK_USE__SELECTED_STEP:
				return getSelectedStep();
			case SpemPackage.TASK_USE__OWNED_PROCESS_PARAMETER:
				return getOwnedProcessParameter();
			case SpemPackage.TASK_USE__PRE_CONDITION:
				return getPreCondition();
			case SpemPackage.TASK_USE__POST_CONDITION:
				return getPostCondition();
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
			case SpemPackage.TASK_USE__IS_REPEATABLE:
				setIsRepeatable(((Boolean)newValue).booleanValue());
				return;
			case SpemPackage.TASK_USE__IS_ONGOING:
				setIsOngoing(((Boolean)newValue).booleanValue());
				return;
			case SpemPackage.TASK_USE__IS_EVENT_DRIVEN:
				setIsEventDriven(((Boolean)newValue).booleanValue());
				return;
			case SpemPackage.TASK_USE__LINK_TO_PREDECESSOR:
				getLinkToPredecessor().clear();
				getLinkToPredecessor().addAll((Collection)newValue);
				return;
			case SpemPackage.TASK_USE__LINK_TO_SUCCESSOR:
				getLinkToSuccessor().clear();
				getLinkToSuccessor().addAll((Collection)newValue);
				return;
			case SpemPackage.TASK_USE__TASK:
				setTask((TaskDefinition)newValue);
				return;
			case SpemPackage.TASK_USE__USED_QUALIFICATION:
				getUsedQualification().clear();
				getUsedQualification().addAll((Collection)newValue);
				return;
			case SpemPackage.TASK_USE__SELECTED_STEP:
				getSelectedStep().clear();
				getSelectedStep().addAll((Collection)newValue);
				return;
			case SpemPackage.TASK_USE__OWNED_PROCESS_PARAMETER:
				getOwnedProcessParameter().clear();
				getOwnedProcessParameter().addAll((Collection)newValue);
				return;
			case SpemPackage.TASK_USE__PRE_CONDITION:
				setPreCondition((String)newValue);
				return;
			case SpemPackage.TASK_USE__POST_CONDITION:
				setPostCondition((String)newValue);
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
			case SpemPackage.TASK_USE__IS_REPEATABLE:
				setIsRepeatable(IS_REPEATABLE_EDEFAULT);
				return;
			case SpemPackage.TASK_USE__IS_ONGOING:
				setIsOngoing(IS_ONGOING_EDEFAULT);
				return;
			case SpemPackage.TASK_USE__IS_EVENT_DRIVEN:
				setIsEventDriven(IS_EVENT_DRIVEN_EDEFAULT);
				return;
			case SpemPackage.TASK_USE__LINK_TO_PREDECESSOR:
				getLinkToPredecessor().clear();
				return;
			case SpemPackage.TASK_USE__LINK_TO_SUCCESSOR:
				getLinkToSuccessor().clear();
				return;
			case SpemPackage.TASK_USE__TASK:
				setTask((TaskDefinition)null);
				return;
			case SpemPackage.TASK_USE__USED_QUALIFICATION:
				getUsedQualification().clear();
				return;
			case SpemPackage.TASK_USE__SELECTED_STEP:
				getSelectedStep().clear();
				return;
			case SpemPackage.TASK_USE__OWNED_PROCESS_PARAMETER:
				getOwnedProcessParameter().clear();
				return;
			case SpemPackage.TASK_USE__PRE_CONDITION:
				setPreCondition(PRE_CONDITION_EDEFAULT);
				return;
			case SpemPackage.TASK_USE__POST_CONDITION:
				setPostCondition(POST_CONDITION_EDEFAULT);
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
			case SpemPackage.TASK_USE__IS_REPEATABLE:
				return isRepeatable != IS_REPEATABLE_EDEFAULT;
			case SpemPackage.TASK_USE__IS_ONGOING:
				return isOngoing != IS_ONGOING_EDEFAULT;
			case SpemPackage.TASK_USE__IS_EVENT_DRIVEN:
				return isEventDriven != IS_EVENT_DRIVEN_EDEFAULT;
			case SpemPackage.TASK_USE__LINK_TO_PREDECESSOR:
				return linkToPredecessor != null && !linkToPredecessor.isEmpty();
			case SpemPackage.TASK_USE__LINK_TO_SUCCESSOR:
				return linkToSuccessor != null && !linkToSuccessor.isEmpty();
			case SpemPackage.TASK_USE__TASK:
				return task != null;
			case SpemPackage.TASK_USE__USED_QUALIFICATION:
				return usedQualification != null && !usedQualification.isEmpty();
			case SpemPackage.TASK_USE__SELECTED_STEP:
				return selectedStep != null && !selectedStep.isEmpty();
			case SpemPackage.TASK_USE__OWNED_PROCESS_PARAMETER:
				return ownedProcessParameter != null && !ownedProcessParameter.isEmpty();
			case SpemPackage.TASK_USE__PRE_CONDITION:
				return PRE_CONDITION_EDEFAULT == null ? preCondition != null : !PRE_CONDITION_EDEFAULT.equals(preCondition);
			case SpemPackage.TASK_USE__POST_CONDITION:
				return POST_CONDITION_EDEFAULT == null ? postCondition != null : !POST_CONDITION_EDEFAULT.equals(postCondition);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == WorkBreakdownElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.TASK_USE__IS_REPEATABLE: return SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_REPEATABLE;
				case SpemPackage.TASK_USE__IS_ONGOING: return SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_ONGOING;
				case SpemPackage.TASK_USE__IS_EVENT_DRIVEN: return SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_EVENT_DRIVEN;
				case SpemPackage.TASK_USE__LINK_TO_PREDECESSOR: return SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_PREDECESSOR;
				case SpemPackage.TASK_USE__LINK_TO_SUCCESSOR: return SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_SUCCESSOR;
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
		if (baseClass == WorkBreakdownElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_REPEATABLE: return SpemPackage.TASK_USE__IS_REPEATABLE;
				case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_ONGOING: return SpemPackage.TASK_USE__IS_ONGOING;
				case SpemPackage.WORK_BREAKDOWN_ELEMENT__IS_EVENT_DRIVEN: return SpemPackage.TASK_USE__IS_EVENT_DRIVEN;
				case SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_PREDECESSOR: return SpemPackage.TASK_USE__LINK_TO_PREDECESSOR;
				case SpemPackage.WORK_BREAKDOWN_ELEMENT__LINK_TO_SUCCESSOR: return SpemPackage.TASK_USE__LINK_TO_SUCCESSOR;
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
		result.append(" (isRepeatable: ");
		result.append(isRepeatable);
		result.append(", isOngoing: ");
		result.append(isOngoing);
		result.append(", isEventDriven: ");
		result.append(isEventDriven);
		result.append(", preCondition: ");
		result.append(preCondition);
		result.append(", postCondition: ");
		result.append(postCondition);
		result.append(')');
		return result.toString();
	}

} //TaskUseImpl
