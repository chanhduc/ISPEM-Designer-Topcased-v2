/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.activity.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.topcased.spem.BreakdownElement;
import org.topcased.spem.DescribableElement;
import org.topcased.spem.ExtensibleElement;
import org.topcased.spem.ProcessElement;
import org.topcased.spem.ProcessPackageableElement;

import org.topcased.spem.activity.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.topcased.spem.activity.ActivityPackage
 * @generated
 */
public class ActivitySwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActivityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitySwitch() {
		if (modelPackage == null) {
			modelPackage = ActivityPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ActivityPackage.NODE: {
				Node node = (Node)theEObject;
				Object result = caseNode(node);
				if (result == null) result = caseBreakdownElement(node);
				if (result == null) result = caseProcessElement(node);
				if (result == null) result = caseDescribableElement(node);
				if (result == null) result = caseProcessPackageableElement(node);
				if (result == null) result = caseExtensibleElement(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				Object result = caseEdge(edge);
				if (result == null) result = caseBreakdownElement(edge);
				if (result == null) result = caseProcessElement(edge);
				if (result == null) result = caseDescribableElement(edge);
				if (result == null) result = caseProcessPackageableElement(edge);
				if (result == null) result = caseExtensibleElement(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.START_NODE: {
				StartNode startNode = (StartNode)theEObject;
				Object result = caseStartNode(startNode);
				if (result == null) result = caseNode(startNode);
				if (result == null) result = caseBreakdownElement(startNode);
				if (result == null) result = caseProcessElement(startNode);
				if (result == null) result = caseDescribableElement(startNode);
				if (result == null) result = caseProcessPackageableElement(startNode);
				if (result == null) result = caseExtensibleElement(startNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.END_NODE: {
				EndNode endNode = (EndNode)theEObject;
				Object result = caseEndNode(endNode);
				if (result == null) result = caseNode(endNode);
				if (result == null) result = caseBreakdownElement(endNode);
				if (result == null) result = caseProcessElement(endNode);
				if (result == null) result = caseDescribableElement(endNode);
				if (result == null) result = caseProcessPackageableElement(endNode);
				if (result == null) result = caseExtensibleElement(endNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.FORK_NODE: {
				ForkNode forkNode = (ForkNode)theEObject;
				Object result = caseForkNode(forkNode);
				if (result == null) result = caseNode(forkNode);
				if (result == null) result = caseBreakdownElement(forkNode);
				if (result == null) result = caseProcessElement(forkNode);
				if (result == null) result = caseDescribableElement(forkNode);
				if (result == null) result = caseProcessPackageableElement(forkNode);
				if (result == null) result = caseExtensibleElement(forkNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.JOIN_NODE: {
				JoinNode joinNode = (JoinNode)theEObject;
				Object result = caseJoinNode(joinNode);
				if (result == null) result = caseNode(joinNode);
				if (result == null) result = caseBreakdownElement(joinNode);
				if (result == null) result = caseProcessElement(joinNode);
				if (result == null) result = caseDescribableElement(joinNode);
				if (result == null) result = caseProcessPackageableElement(joinNode);
				if (result == null) result = caseExtensibleElement(joinNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.DECISION_NODE: {
				DecisionNode decisionNode = (DecisionNode)theEObject;
				Object result = caseDecisionNode(decisionNode);
				if (result == null) result = caseNode(decisionNode);
				if (result == null) result = caseBreakdownElement(decisionNode);
				if (result == null) result = caseProcessElement(decisionNode);
				if (result == null) result = caseDescribableElement(decisionNode);
				if (result == null) result = caseProcessPackageableElement(decisionNode);
				if (result == null) result = caseExtensibleElement(decisionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStartNode(StartNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEndNode(EndNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseForkNode(ForkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJoinNode(JoinNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDecisionNode(DecisionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExtensibleElement(ExtensibleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Describable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Describable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDescribableElement(DescribableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProcessPackageableElement(ProcessPackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProcessElement(ProcessElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breakdown Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breakdown Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBreakdownElement(BreakdownElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //ActivitySwitch
