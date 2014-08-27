/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.topcased.spem.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.topcased.spem.SpemPackage
 * @generated
 */
public class SpemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpemPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpemSwitch modelSwitch =
		new SpemSwitch() {
			public Object caseExtensibleElement(ExtensibleElement object) {
				return createExtensibleElementAdapter();
			}
			public Object caseKind(Kind object) {
				return createKindAdapter();
			}
			public Object caseWorkDefinitionPerformer(WorkDefinitionPerformer object) {
				return createWorkDefinitionPerformerAdapter();
			}
			public Object caseWorkDefinition(WorkDefinition object) {
				return createWorkDefinitionAdapter();
			}
			public Object caseWorkDefinitionParameter(WorkDefinitionParameter object) {
				return createWorkDefinitionParameterAdapter();
			}
			public Object caseBreakdownElement(BreakdownElement object) {
				return createBreakdownElementAdapter();
			}
			public Object caseWorkBreakdownElement(WorkBreakdownElement object) {
				return createWorkBreakdownElementAdapter();
			}
			public Object caseWorkSequence(WorkSequence object) {
				return createWorkSequenceAdapter();
			}
			public Object caseActivity(Activity object) {
				return createActivityAdapter();
			}
			public Object caseProcessPerformer(ProcessPerformer object) {
				return createProcessPerformerAdapter();
			}
			public Object caseRoleUse(RoleUse object) {
				return createRoleUseAdapter();
			}
			public Object caseProcessResponsibilityAssignment(ProcessResponsibilityAssignment object) {
				return createProcessResponsibilityAssignmentAdapter();
			}
			public Object caseWorkProductUse(WorkProductUse object) {
				return createWorkProductUseAdapter();
			}
			public Object caseWorkProductUseRelationship(WorkProductUseRelationship object) {
				return createWorkProductUseRelationshipAdapter();
			}
			public Object caseProcessParameter(ProcessParameter object) {
				return createProcessParameterAdapter();
			}
			public Object caseMilestone(Milestone object) {
				return createMilestoneAdapter();
			}
			public Object caseProcessElement(ProcessElement object) {
				return createProcessElementAdapter();
			}
			public Object caseDescribableElement(DescribableElement object) {
				return createDescribableElementAdapter();
			}
			public Object caseCategory(Category object) {
				return createCategoryAdapter();
			}
			public Object caseGuidance(Guidance object) {
				return createGuidanceAdapter();
			}
			public Object caseMetric(Metric object) {
				return createMetricAdapter();
			}
			public Object caseMethodContentElement(MethodContentElement object) {
				return createMethodContentElementAdapter();
			}
			public Object caseToolDefinition(ToolDefinition object) {
				return createToolDefinitionAdapter();
			}
			public Object caseTaskDefinition(TaskDefinition object) {
				return createTaskDefinitionAdapter();
			}
			public Object caseStep(Step object) {
				return createStepAdapter();
			}
			public Object caseWorkProductDefinition(WorkProductDefinition object) {
				return createWorkProductDefinitionAdapter();
			}
			public Object caseRoleDefinition(RoleDefinition object) {
				return createRoleDefinitionAdapter();
			}
			public Object caseWorkProductDefinitionRelationship(WorkProductDefinitionRelationship object) {
				return createWorkProductDefinitionRelationshipAdapter();
			}
			public Object caseDefault_TaskDefinitionPerformer(Default_TaskDefinitionPerformer object) {
				return createDefault_TaskDefinitionPerformerAdapter();
			}
			public Object caseDefault_ResponsibilityAssignment(Default_ResponsibilityAssignment object) {
				return createDefault_ResponsibilityAssignmentAdapter();
			}
			public Object caseDefault_TaskDefinitionParameter(Default_TaskDefinitionParameter object) {
				return createDefault_TaskDefinitionParameterAdapter();
			}
			public Object caseQualification(Qualification object) {
				return createQualificationAdapter();
			}
			public Object caseMethodContentPackageableElement(MethodContentPackageableElement object) {
				return createMethodContentPackageableElementAdapter();
			}
			public Object caseProcessPackageableElement(ProcessPackageableElement object) {
				return createProcessPackageableElementAdapter();
			}
			public Object caseMethodContentPackage(MethodContentPackage object) {
				return createMethodContentPackageAdapter();
			}
			public Object caseProcessPackage(ProcessPackage object) {
				return createProcessPackageAdapter();
			}
			public Object caseMethodContentKind(MethodContentKind object) {
				return createMethodContentKindAdapter();
			}
			public Object caseProcessKind(ProcessKind object) {
				return createProcessKindAdapter();
			}
			public Object casePlanningData(PlanningData object) {
				return createPlanningDataAdapter();
			}
			public Object caseMethodContentUse(MethodContentUse object) {
				return createMethodContentUseAdapter();
			}
			public Object caseTaskUse(TaskUse object) {
				return createTaskUseAdapter();
			}
			public Object caseCompositeRole(CompositeRole object) {
				return createCompositeRoleAdapter();
			}
			public Object caseTeamProfile(TeamProfile object) {
				return createTeamProfileAdapter();
			}
			public Object caseVariabilityElement(VariabilityElement object) {
				return createVariabilityElementAdapter();
			}
			public Object caseProcessComponent(ProcessComponent object) {
				return createProcessComponentAdapter();
			}
			public Object caseProcessComponentUse(ProcessComponentUse object) {
				return createProcessComponentUseAdapter();
			}
			public Object caseMethodLibraryPackageableElement(MethodLibraryPackageableElement object) {
				return createMethodLibraryPackageableElementAdapter();
			}
			public Object caseMethodPluginPackageableElement(MethodPluginPackageableElement object) {
				return createMethodPluginPackageableElementAdapter();
			}
			public Object caseMethodConfiguration(MethodConfiguration object) {
				return createMethodConfigurationAdapter();
			}
			public Object caseMethodPlugin(MethodPlugin object) {
				return createMethodPluginAdapter();
			}
			public Object caseMethodLibrary(MethodLibrary object) {
				return createMethodLibraryAdapter();
			}
			public Object caseWorkProductPort(WorkProductPort object) {
				return createWorkProductPortAdapter();
			}
			public Object caseWorkProductPortConnector(WorkProductPortConnector object) {
				return createWorkProductPortConnectorAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.ExtensibleElement <em>Extensible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.ExtensibleElement
	 * @generated
	 */
	public Adapter createExtensibleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.Kind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.Kind
	 * @generated
	 */
	public Adapter createKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.WorkDefinitionPerformer <em>Work Definition Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.WorkDefinitionPerformer
	 * @generated
	 */
	public Adapter createWorkDefinitionPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.WorkDefinition <em>Work Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.WorkDefinition
	 * @generated
	 */
	public Adapter createWorkDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.WorkDefinitionParameter <em>Work Definition Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.WorkDefinitionParameter
	 * @generated
	 */
	public Adapter createWorkDefinitionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.BreakdownElement <em>Breakdown Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.BreakdownElement
	 * @generated
	 */
	public Adapter createBreakdownElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.WorkBreakdownElement <em>Work Breakdown Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.WorkBreakdownElement
	 * @generated
	 */
	public Adapter createWorkBreakdownElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.WorkSequence <em>Work Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.WorkSequence
	 * @generated
	 */
	public Adapter createWorkSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.ProcessPerformer <em>Process Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.ProcessPerformer
	 * @generated
	 */
	public Adapter createProcessPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.RoleUse <em>Role Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.RoleUse
	 * @generated
	 */
	public Adapter createRoleUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.ProcessResponsibilityAssignment <em>Process Responsibility Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.ProcessResponsibilityAssignment
	 * @generated
	 */
	public Adapter createProcessResponsibilityAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.WorkProductUse <em>Work Product Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.WorkProductUse
	 * @generated
	 */
	public Adapter createWorkProductUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.WorkProductUseRelationship <em>Work Product Use Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.WorkProductUseRelationship
	 * @generated
	 */
	public Adapter createWorkProductUseRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.ProcessParameter <em>Process Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.ProcessParameter
	 * @generated
	 */
	public Adapter createProcessParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.Milestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.Milestone
	 * @generated
	 */
	public Adapter createMilestoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.ProcessElement <em>Process Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.ProcessElement
	 * @generated
	 */
	public Adapter createProcessElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.DescribableElement <em>Describable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.DescribableElement
	 * @generated
	 */
	public Adapter createDescribableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.Guidance <em>Guidance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.Guidance
	 * @generated
	 */
	public Adapter createGuidanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.MethodContentElement <em>Method Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.MethodContentElement
	 * @generated
	 */
	public Adapter createMethodContentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.ToolDefinition <em>Tool Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.ToolDefinition
	 * @generated
	 */
	public Adapter createToolDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.TaskDefinition <em>Task Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.TaskDefinition
	 * @generated
	 */
	public Adapter createTaskDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.WorkProductDefinition <em>Work Product Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.WorkProductDefinition
	 * @generated
	 */
	public Adapter createWorkProductDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.RoleDefinition <em>Role Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.RoleDefinition
	 * @generated
	 */
	public Adapter createRoleDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.WorkProductDefinitionRelationship <em>Work Product Definition Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.WorkProductDefinitionRelationship
	 * @generated
	 */
	public Adapter createWorkProductDefinitionRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.Default_TaskDefinitionPerformer <em>Default Task Definition Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.Default_TaskDefinitionPerformer
	 * @generated
	 */
	public Adapter createDefault_TaskDefinitionPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.Default_ResponsibilityAssignment <em>Default Responsibility Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.Default_ResponsibilityAssignment
	 * @generated
	 */
	public Adapter createDefault_ResponsibilityAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.Default_TaskDefinitionParameter <em>Default Task Definition Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.Default_TaskDefinitionParameter
	 * @generated
	 */
	public Adapter createDefault_TaskDefinitionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.Qualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.Qualification
	 * @generated
	 */
	public Adapter createQualificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.MethodContentPackageableElement <em>Method Content Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.MethodContentPackageableElement
	 * @generated
	 */
	public Adapter createMethodContentPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.ProcessPackageableElement <em>Process Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.ProcessPackageableElement
	 * @generated
	 */
	public Adapter createProcessPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.MethodContentPackage <em>Method Content Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.MethodContentPackage
	 * @generated
	 */
	public Adapter createMethodContentPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.ProcessPackage <em>Process Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.ProcessPackage
	 * @generated
	 */
	public Adapter createProcessPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.MethodContentKind <em>Method Content Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.MethodContentKind
	 * @generated
	 */
	public Adapter createMethodContentKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.ProcessKind <em>Process Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.ProcessKind
	 * @generated
	 */
	public Adapter createProcessKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.PlanningData <em>Planning Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.PlanningData
	 * @generated
	 */
	public Adapter createPlanningDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.MethodContentUse <em>Method Content Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.MethodContentUse
	 * @generated
	 */
	public Adapter createMethodContentUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.TaskUse <em>Task Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.TaskUse
	 * @generated
	 */
	public Adapter createTaskUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.CompositeRole <em>Composite Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.CompositeRole
	 * @generated
	 */
	public Adapter createCompositeRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.TeamProfile <em>Team Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.TeamProfile
	 * @generated
	 */
	public Adapter createTeamProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.VariabilityElement <em>Variability Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.VariabilityElement
	 * @generated
	 */
	public Adapter createVariabilityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.ProcessComponent <em>Process Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.ProcessComponent
	 * @generated
	 */
	public Adapter createProcessComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.ProcessComponentUse <em>Process Component Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.ProcessComponentUse
	 * @generated
	 */
	public Adapter createProcessComponentUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.MethodLibraryPackageableElement <em>Method Library Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.MethodLibraryPackageableElement
	 * @generated
	 */
	public Adapter createMethodLibraryPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.MethodPluginPackageableElement <em>Method Plugin Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.MethodPluginPackageableElement
	 * @generated
	 */
	public Adapter createMethodPluginPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.MethodConfiguration <em>Method Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.MethodConfiguration
	 * @generated
	 */
	public Adapter createMethodConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.MethodPlugin <em>Method Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.MethodPlugin
	 * @generated
	 */
	public Adapter createMethodPluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.MethodLibrary <em>Method Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.MethodLibrary
	 * @generated
	 */
	public Adapter createMethodLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.WorkProductPort <em>Work Product Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.WorkProductPort
	 * @generated
	 */
	public Adapter createWorkProductPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.WorkProductPortConnector <em>Work Product Port Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.WorkProductPortConnector
	 * @generated
	 */
	public Adapter createWorkProductPortConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SpemAdapterFactory
