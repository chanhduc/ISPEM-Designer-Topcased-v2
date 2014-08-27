/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.activity.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.topcased.ispem.IspemPackage;

import org.topcased.ispem.impl.IspemPackageImpl;

import org.topcased.spem.SpemPackage;

import org.topcased.spem.activity.ActivityFactory;
import org.topcased.spem.activity.ActivityPackage;
import org.topcased.spem.activity.DecisionNode;
import org.topcased.spem.activity.Edge;
import org.topcased.spem.activity.EndNode;
import org.topcased.spem.activity.ForkNode;
import org.topcased.spem.activity.JoinNode;
import org.topcased.spem.activity.Node;
import org.topcased.spem.activity.StartNode;

import org.topcased.spem.impl.SpemPackageImpl;

import org.topcased.spem.uma.UmaPackage;

import org.topcased.spem.uma.impl.UmaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityPackageImpl extends EPackageImpl implements ActivityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.topcased.spem.activity.ActivityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActivityPackageImpl() {
		super(eNS_URI, ActivityFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ActivityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActivityPackage init() {
		if (isInited) return (ActivityPackage)EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI);

		// Obtain or create and register package
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActivityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		IspemPackageImpl theIspemPackage = (IspemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IspemPackage.eNS_URI) instanceof IspemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IspemPackage.eNS_URI) : IspemPackage.eINSTANCE);
		SpemPackageImpl theSpemPackage = (SpemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpemPackage.eNS_URI) instanceof SpemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpemPackage.eNS_URI) : SpemPackage.eINSTANCE);
		UmaPackageImpl theUmaPackage = (UmaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI) instanceof UmaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI) : UmaPackage.eINSTANCE);

		// Create package meta-data objects
		theActivityPackage.createPackageContents();
		theIspemPackage.createPackageContents();
		theSpemPackage.createPackageContents();
		theUmaPackage.createPackageContents();

		// Initialize created meta-data
		theActivityPackage.initializePackageContents();
		theIspemPackage.initializePackageContents();
		theSpemPackage.initializePackageContents();
		theUmaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActivityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActivityPackage.eNS_URI, theActivityPackage);
		return theActivityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_IncomingEdge() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_OutgoingEdge() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Guard() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Source() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Target() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartNode() {
		return startNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndNode() {
		return endNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNode() {
		return forkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNode() {
		return joinNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNode() {
		return decisionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFactory getActivityFactory() {
		return (ActivityFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__INCOMING_EDGE);
		createEReference(nodeEClass, NODE__OUTGOING_EDGE);

		edgeEClass = createEClass(EDGE);
		createEAttribute(edgeEClass, EDGE__GUARD);
		createEReference(edgeEClass, EDGE__SOURCE);
		createEReference(edgeEClass, EDGE__TARGET);

		startNodeEClass = createEClass(START_NODE);

		endNodeEClass = createEClass(END_NODE);

		forkNodeEClass = createEClass(FORK_NODE);

		joinNodeEClass = createEClass(JOIN_NODE);

		decisionNodeEClass = createEClass(DECISION_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SpemPackage theSpemPackage = (SpemPackage)EPackage.Registry.INSTANCE.getEPackage(SpemPackage.eNS_URI);

		// Add supertypes to classes
		nodeEClass.getESuperTypes().add(theSpemPackage.getBreakdownElement());
		edgeEClass.getESuperTypes().add(theSpemPackage.getBreakdownElement());
		startNodeEClass.getESuperTypes().add(this.getNode());
		endNodeEClass.getESuperTypes().add(this.getNode());
		forkNodeEClass.getESuperTypes().add(this.getNode());
		joinNodeEClass.getESuperTypes().add(this.getNode());
		decisionNodeEClass.getESuperTypes().add(this.getNode());

		// Initialize classes and features; add operations and parameters
		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_IncomingEdge(), this.getEdge(), null, "incomingEdge", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_OutgoingEdge(), this.getEdge(), null, "outgoingEdge", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdge_Guard(), ecorePackage.getEString(), "guard", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Source(), theSpemPackage.getBreakdownElement(), null, "source", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Target(), theSpemPackage.getBreakdownElement(), null, "target", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startNodeEClass, StartNode.class, "StartNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endNodeEClass, EndNode.class, "EndNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkNodeEClass, ForkNode.class, "ForkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(joinNodeEClass, JoinNode.class, "JoinNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionNodeEClass, DecisionNode.class, "DecisionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ActivityPackageImpl
