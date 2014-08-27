/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.activity.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.topcased.spem.activity.ActivityPackage;
import org.topcased.spem.activity.Edge;
import org.topcased.spem.activity.Node;

import org.topcased.spem.impl.BreakdownElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.spem.activity.impl.NodeImpl#getIncomingEdge <em>Incoming Edge</em>}</li>
 *   <li>{@link org.topcased.spem.activity.impl.NodeImpl#getOutgoingEdge <em>Outgoing Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NodeImpl extends BreakdownElementImpl implements Node {
	/**
	 * The cached value of the '{@link #getIncomingEdge() <em>Incoming Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingEdge()
	 * @generated
	 * @ordered
	 */
	protected EList incomingEdge;

	/**
	 * The cached value of the '{@link #getOutgoingEdge() <em>Outgoing Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingEdge()
	 * @generated
	 * @ordered
	 */
	protected EList outgoingEdge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIncomingEdge() {
		if (incomingEdge == null) {
			incomingEdge = new EObjectResolvingEList(Edge.class, this, ActivityPackage.NODE__INCOMING_EDGE);
		}
		return incomingEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutgoingEdge() {
		if (outgoingEdge == null) {
			outgoingEdge = new EObjectResolvingEList(Edge.class, this, ActivityPackage.NODE__OUTGOING_EDGE);
		}
		return outgoingEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityPackage.NODE__INCOMING_EDGE:
				return getIncomingEdge();
			case ActivityPackage.NODE__OUTGOING_EDGE:
				return getOutgoingEdge();
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
			case ActivityPackage.NODE__INCOMING_EDGE:
				getIncomingEdge().clear();
				getIncomingEdge().addAll((Collection)newValue);
				return;
			case ActivityPackage.NODE__OUTGOING_EDGE:
				getOutgoingEdge().clear();
				getOutgoingEdge().addAll((Collection)newValue);
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
			case ActivityPackage.NODE__INCOMING_EDGE:
				getIncomingEdge().clear();
				return;
			case ActivityPackage.NODE__OUTGOING_EDGE:
				getOutgoingEdge().clear();
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
			case ActivityPackage.NODE__INCOMING_EDGE:
				return incomingEdge != null && !incomingEdge.isEmpty();
			case ActivityPackage.NODE__OUTGOING_EDGE:
				return outgoingEdge != null && !outgoingEdge.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
