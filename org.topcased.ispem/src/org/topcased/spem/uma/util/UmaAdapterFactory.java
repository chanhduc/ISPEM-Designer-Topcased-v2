/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.uma.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.topcased.spem.Activity;
import org.topcased.spem.BreakdownElement;
import org.topcased.spem.Category;
import org.topcased.spem.DescribableElement;
import org.topcased.spem.ExtensibleElement;
import org.topcased.spem.Guidance;
import org.topcased.spem.Kind;
import org.topcased.spem.MethodContentElement;
import org.topcased.spem.MethodContentPackage;
import org.topcased.spem.MethodContentPackageableElement;
import org.topcased.spem.MethodContentUse;
import org.topcased.spem.MethodPluginPackageableElement;
import org.topcased.spem.ProcessElement;
import org.topcased.spem.ProcessPackage;
import org.topcased.spem.ProcessPackageableElement;
import org.topcased.spem.VariabilityElement;
import org.topcased.spem.WorkBreakdownElement;
import org.topcased.spem.WorkDefinition;
import org.topcased.spem.WorkProductUse;

import org.topcased.spem.uma.Artifact;
import org.topcased.spem.uma.CapabilityPattern;
import org.topcased.spem.uma.CapabilityPatternPackage;
import org.topcased.spem.uma.CategoryPackage;
import org.topcased.spem.uma.Checklist;
import org.topcased.spem.uma.Concept;
import org.topcased.spem.uma.ConfigurationPackage;
import org.topcased.spem.uma.CustomCategory;
import org.topcased.spem.uma.Deliverable;
import org.topcased.spem.uma.DeliveryProcess;
import org.topcased.spem.uma.DeliveryProcessPackage;
import org.topcased.spem.uma.Discipline;
import org.topcased.spem.uma.DisciplineGrouping;
import org.topcased.spem.uma.DisciplinePackage;
import org.topcased.spem.uma.Domain;
import org.topcased.spem.uma.DomainPackage;
import org.topcased.spem.uma.EstimatingConsideration;
import org.topcased.spem.uma.Example;
import org.topcased.spem.uma.GuidancePackage;
import org.topcased.spem.uma.Guideline;
import org.topcased.spem.uma.Iteration;
import org.topcased.spem.uma.Outcome;
import org.topcased.spem.uma.Phase;
import org.topcased.spem.uma.Practice;
import org.topcased.spem.uma.ProcessComponentPackage;
import org.topcased.spem.uma.ProcessPlanningTemplate;
import org.topcased.spem.uma.QualificationPackage;
import org.topcased.spem.uma.Report;
import org.topcased.spem.uma.ReusableAsset;
import org.topcased.spem.uma.Roadmap;
import org.topcased.spem.uma.RoleDefinitionPackage;
import org.topcased.spem.uma.RoleSet;
import org.topcased.spem.uma.RoleSetPackage;
import org.topcased.spem.uma.Root;
import org.topcased.spem.uma.SupportingMaterial;
import org.topcased.spem.uma.TaskDefinitionPackage;
import org.topcased.spem.uma.Template;
import org.topcased.spem.uma.TermDefinition;
import org.topcased.spem.uma.ToolDefinitionPackage;
import org.topcased.spem.uma.ToolMentor;
import org.topcased.spem.uma.UmaPackage;
import org.topcased.spem.uma.Whitepaper;
import org.topcased.spem.uma.WorkProductDefinitionPackage;
import org.topcased.spem.uma.WorkProductKind;
import org.topcased.spem.uma.WorkProductKindPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.topcased.spem.uma.UmaPackage
 * @generated
 */
public class UmaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UmaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UmaPackage.eINSTANCE;
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
	protected UmaSwitch modelSwitch =
		new UmaSwitch() {
			public Object caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			public Object caseCapabilityPattern(CapabilityPattern object) {
				return createCapabilityPatternAdapter();
			}
			public Object caseChecklist(Checklist object) {
				return createChecklistAdapter();
			}
			public Object caseConcept(Concept object) {
				return createConceptAdapter();
			}
			public Object caseCategoryPackage(CategoryPackage object) {
				return createCategoryPackageAdapter();
			}
			public Object caseCustomCategory(CustomCategory object) {
				return createCustomCategoryAdapter();
			}
			public Object caseDeliverable(Deliverable object) {
				return createDeliverableAdapter();
			}
			public Object caseProcess(org.topcased.spem.uma.Process object) {
				return createProcessAdapter();
			}
			public Object caseDeliveryProcess(DeliveryProcess object) {
				return createDeliveryProcessAdapter();
			}
			public Object caseDiscipline(Discipline object) {
				return createDisciplineAdapter();
			}
			public Object caseDisciplineGrouping(DisciplineGrouping object) {
				return createDisciplineGroupingAdapter();
			}
			public Object caseRoot(Root object) {
				return createRootAdapter();
			}
			public Object caseDomain(Domain object) {
				return createDomainAdapter();
			}
			public Object caseEstimatingConsideration(EstimatingConsideration object) {
				return createEstimatingConsiderationAdapter();
			}
			public Object caseExample(Example object) {
				return createExampleAdapter();
			}
			public Object caseIteration(Iteration object) {
				return createIterationAdapter();
			}
			public Object caseOutcome(Outcome object) {
				return createOutcomeAdapter();
			}
			public Object casePhase(Phase object) {
				return createPhaseAdapter();
			}
			public Object casePractice(Practice object) {
				return createPracticeAdapter();
			}
			public Object caseProcessPlanningTemplate(ProcessPlanningTemplate object) {
				return createProcessPlanningTemplateAdapter();
			}
			public Object caseReport(Report object) {
				return createReportAdapter();
			}
			public Object caseReusableAsset(ReusableAsset object) {
				return createReusableAssetAdapter();
			}
			public Object caseRoadmap(Roadmap object) {
				return createRoadmapAdapter();
			}
			public Object caseTemplate(Template object) {
				return createTemplateAdapter();
			}
			public Object caseTermDefinition(TermDefinition object) {
				return createTermDefinitionAdapter();
			}
			public Object caseToolMentor(ToolMentor object) {
				return createToolMentorAdapter();
			}
			public Object caseWhitepaper(Whitepaper object) {
				return createWhitepaperAdapter();
			}
			public Object caseGuideline(Guideline object) {
				return createGuidelineAdapter();
			}
			public Object caseSupportingMaterial(SupportingMaterial object) {
				return createSupportingMaterialAdapter();
			}
			public Object caseRoleDefinitionPackage(RoleDefinitionPackage object) {
				return createRoleDefinitionPackageAdapter();
			}
			public Object caseTaskDefinitionPackage(TaskDefinitionPackage object) {
				return createTaskDefinitionPackageAdapter();
			}
			public Object caseWorkProductDefinitionPackage(WorkProductDefinitionPackage object) {
				return createWorkProductDefinitionPackageAdapter();
			}
			public Object caseGuidancePackage(GuidancePackage object) {
				return createGuidancePackageAdapter();
			}
			public Object caseDisciplinePackage(DisciplinePackage object) {
				return createDisciplinePackageAdapter();
			}
			public Object caseDomainPackage(DomainPackage object) {
				return createDomainPackageAdapter();
			}
			public Object caseWorkProductKindPackage(WorkProductKindPackage object) {
				return createWorkProductKindPackageAdapter();
			}
			public Object caseRoleSetPackage(RoleSetPackage object) {
				return createRoleSetPackageAdapter();
			}
			public Object caseToolDefinitionPackage(ToolDefinitionPackage object) {
				return createToolDefinitionPackageAdapter();
			}
			public Object caseConfigurationPackage(ConfigurationPackage object) {
				return createConfigurationPackageAdapter();
			}
			public Object caseCapabilityPatternPackage(CapabilityPatternPackage object) {
				return createCapabilityPatternPackageAdapter();
			}
			public Object caseDeliveryProcessPackage(DeliveryProcessPackage object) {
				return createDeliveryProcessPackageAdapter();
			}
			public Object caseRoleSet(RoleSet object) {
				return createRoleSetAdapter();
			}
			public Object caseQualificationPackage(QualificationPackage object) {
				return createQualificationPackageAdapter();
			}
			public Object caseProcessComponentPackage(ProcessComponentPackage object) {
				return createProcessComponentPackageAdapter();
			}
			public Object caseWorkProductKind(WorkProductKind object) {
				return createWorkProductKindAdapter();
			}
			public Object caseExtensibleElement(ExtensibleElement object) {
				return createExtensibleElementAdapter();
			}
			public Object caseDescribableElement(DescribableElement object) {
				return createDescribableElementAdapter();
			}
			public Object caseProcessPackageableElement(ProcessPackageableElement object) {
				return createProcessPackageableElementAdapter();
			}
			public Object caseProcessElement(ProcessElement object) {
				return createProcessElementAdapter();
			}
			public Object caseBreakdownElement(BreakdownElement object) {
				return createBreakdownElementAdapter();
			}
			public Object caseMethodContentUse(MethodContentUse object) {
				return createMethodContentUseAdapter();
			}
			public Object caseWorkProductUse(WorkProductUse object) {
				return createWorkProductUseAdapter();
			}
			public Object caseWorkDefinition(WorkDefinition object) {
				return createWorkDefinitionAdapter();
			}
			public Object caseWorkBreakdownElement(WorkBreakdownElement object) {
				return createWorkBreakdownElementAdapter();
			}
			public Object caseVariabilityElement(VariabilityElement object) {
				return createVariabilityElementAdapter();
			}
			public Object caseActivity(Activity object) {
				return createActivityAdapter();
			}
			public Object caseMethodContentPackageableElement(MethodContentPackageableElement object) {
				return createMethodContentPackageableElementAdapter();
			}
			public Object caseMethodContentElement(MethodContentElement object) {
				return createMethodContentElementAdapter();
			}
			public Object caseGuidance(Guidance object) {
				return createGuidanceAdapter();
			}
			public Object caseMethodPluginPackageableElement(MethodPluginPackageableElement object) {
				return createMethodPluginPackageableElementAdapter();
			}
			public Object caseMethodContentPackage(MethodContentPackage object) {
				return createMethodContentPackageAdapter();
			}
			public Object caseCategory(Category object) {
				return createCategoryAdapter();
			}
			public Object caseProcessPackage(ProcessPackage object) {
				return createProcessPackageAdapter();
			}
			public Object caseKind(Kind object) {
				return createKindAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.CapabilityPattern <em>Capability Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.CapabilityPattern
	 * @generated
	 */
	public Adapter createCapabilityPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.Checklist <em>Checklist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.Checklist
	 * @generated
	 */
	public Adapter createChecklistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.Concept
	 * @generated
	 */
	public Adapter createConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.CategoryPackage <em>Category Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.CategoryPackage
	 * @generated
	 */
	public Adapter createCategoryPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.CustomCategory <em>Custom Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.CustomCategory
	 * @generated
	 */
	public Adapter createCustomCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.Deliverable <em>Deliverable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.Deliverable
	 * @generated
	 */
	public Adapter createDeliverableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.DeliveryProcess <em>Delivery Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.DeliveryProcess
	 * @generated
	 */
	public Adapter createDeliveryProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.Discipline <em>Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.Discipline
	 * @generated
	 */
	public Adapter createDisciplineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.DisciplineGrouping <em>Discipline Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.DisciplineGrouping
	 * @generated
	 */
	public Adapter createDisciplineGroupingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.EstimatingConsideration <em>Estimating Consideration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.EstimatingConsideration
	 * @generated
	 */
	public Adapter createEstimatingConsiderationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.Example <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.Example
	 * @generated
	 */
	public Adapter createExampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.Iteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.Iteration
	 * @generated
	 */
	public Adapter createIterationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.Outcome <em>Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.Outcome
	 * @generated
	 */
	public Adapter createOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.Phase
	 * @generated
	 */
	public Adapter createPhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.Practice <em>Practice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.Practice
	 * @generated
	 */
	public Adapter createPracticeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.ProcessPlanningTemplate <em>Process Planning Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.ProcessPlanningTemplate
	 * @generated
	 */
	public Adapter createProcessPlanningTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.Report
	 * @generated
	 */
	public Adapter createReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.ReusableAsset <em>Reusable Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.ReusableAsset
	 * @generated
	 */
	public Adapter createReusableAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.Roadmap <em>Roadmap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.Roadmap
	 * @generated
	 */
	public Adapter createRoadmapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.Template
	 * @generated
	 */
	public Adapter createTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.TermDefinition <em>Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.TermDefinition
	 * @generated
	 */
	public Adapter createTermDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.ToolMentor <em>Tool Mentor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.ToolMentor
	 * @generated
	 */
	public Adapter createToolMentorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.Whitepaper <em>Whitepaper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.Whitepaper
	 * @generated
	 */
	public Adapter createWhitepaperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.Guideline <em>Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.Guideline
	 * @generated
	 */
	public Adapter createGuidelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.SupportingMaterial <em>Supporting Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.SupportingMaterial
	 * @generated
	 */
	public Adapter createSupportingMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.RoleDefinitionPackage <em>Role Definition Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.RoleDefinitionPackage
	 * @generated
	 */
	public Adapter createRoleDefinitionPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.TaskDefinitionPackage <em>Task Definition Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.TaskDefinitionPackage
	 * @generated
	 */
	public Adapter createTaskDefinitionPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.WorkProductDefinitionPackage <em>Work Product Definition Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.WorkProductDefinitionPackage
	 * @generated
	 */
	public Adapter createWorkProductDefinitionPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.GuidancePackage <em>Guidance Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.GuidancePackage
	 * @generated
	 */
	public Adapter createGuidancePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.DisciplinePackage <em>Discipline Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.DisciplinePackage
	 * @generated
	 */
	public Adapter createDisciplinePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.DomainPackage <em>Domain Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.DomainPackage
	 * @generated
	 */
	public Adapter createDomainPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.WorkProductKindPackage <em>Work Product Kind Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.WorkProductKindPackage
	 * @generated
	 */
	public Adapter createWorkProductKindPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.RoleSetPackage <em>Role Set Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.RoleSetPackage
	 * @generated
	 */
	public Adapter createRoleSetPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.ToolDefinitionPackage <em>Tool Definition Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.ToolDefinitionPackage
	 * @generated
	 */
	public Adapter createToolDefinitionPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.ConfigurationPackage <em>Configuration Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.ConfigurationPackage
	 * @generated
	 */
	public Adapter createConfigurationPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.CapabilityPatternPackage <em>Capability Pattern Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.CapabilityPatternPackage
	 * @generated
	 */
	public Adapter createCapabilityPatternPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.DeliveryProcessPackage <em>Delivery Process Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.DeliveryProcessPackage
	 * @generated
	 */
	public Adapter createDeliveryProcessPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.RoleSet <em>Role Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.RoleSet
	 * @generated
	 */
	public Adapter createRoleSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.QualificationPackage <em>Qualification Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.QualificationPackage
	 * @generated
	 */
	public Adapter createQualificationPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.ProcessComponentPackage <em>Process Component Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.ProcessComponentPackage
	 * @generated
	 */
	public Adapter createProcessComponentPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.WorkProductKind <em>Work Product Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.WorkProductKind
	 * @generated
	 */
	public Adapter createWorkProductKindAdapter() {
		return null;
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

} //UmaAdapterFactory
