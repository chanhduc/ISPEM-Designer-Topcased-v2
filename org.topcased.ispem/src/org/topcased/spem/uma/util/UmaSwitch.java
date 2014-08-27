/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.uma.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.topcased.spem.uma.UmaPackage
 * @generated
 */
public class UmaSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UmaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmaSwitch() {
		if (modelPackage == null) {
			modelPackage = UmaPackage.eINSTANCE;
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
			case UmaPackage.ARTIFACT: {
				Artifact artifact = (Artifact)theEObject;
				Object result = caseArtifact(artifact);
				if (result == null) result = caseWorkProductUse(artifact);
				if (result == null) result = caseMethodContentUse(artifact);
				if (result == null) result = caseBreakdownElement(artifact);
				if (result == null) result = caseProcessElement(artifact);
				if (result == null) result = caseDescribableElement(artifact);
				if (result == null) result = caseProcessPackageableElement(artifact);
				if (result == null) result = caseExtensibleElement(artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.CAPABILITY_PATTERN: {
				CapabilityPattern capabilityPattern = (CapabilityPattern)theEObject;
				Object result = caseCapabilityPattern(capabilityPattern);
				if (result == null) result = caseProcess(capabilityPattern);
				if (result == null) result = caseActivity(capabilityPattern);
				if (result == null) result = caseWorkDefinition(capabilityPattern);
				if (result == null) result = caseWorkBreakdownElement(capabilityPattern);
				if (result == null) result = caseVariabilityElement(capabilityPattern);
				if (result == null) result = caseBreakdownElement(capabilityPattern);
				if (result == null) result = caseProcessElement(capabilityPattern);
				if (result == null) result = caseDescribableElement(capabilityPattern);
				if (result == null) result = caseProcessPackageableElement(capabilityPattern);
				if (result == null) result = caseExtensibleElement(capabilityPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.CHECKLIST: {
				Checklist checklist = (Checklist)theEObject;
				Object result = caseChecklist(checklist);
				if (result == null) result = caseGuidance(checklist);
				if (result == null) result = caseMethodContentElement(checklist);
				if (result == null) result = caseDescribableElement(checklist);
				if (result == null) result = caseMethodContentPackageableElement(checklist);
				if (result == null) result = caseVariabilityElement(checklist);
				if (result == null) result = caseExtensibleElement(checklist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.CONCEPT: {
				Concept concept = (Concept)theEObject;
				Object result = caseConcept(concept);
				if (result == null) result = caseGuidance(concept);
				if (result == null) result = caseMethodContentElement(concept);
				if (result == null) result = caseDescribableElement(concept);
				if (result == null) result = caseMethodContentPackageableElement(concept);
				if (result == null) result = caseVariabilityElement(concept);
				if (result == null) result = caseExtensibleElement(concept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.CATEGORY_PACKAGE: {
				CategoryPackage categoryPackage = (CategoryPackage)theEObject;
				Object result = caseCategoryPackage(categoryPackage);
				if (result == null) result = caseMethodContentPackage(categoryPackage);
				if (result == null) result = caseMethodContentPackageableElement(categoryPackage);
				if (result == null) result = caseMethodPluginPackageableElement(categoryPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.CUSTOM_CATEGORY: {
				CustomCategory customCategory = (CustomCategory)theEObject;
				Object result = caseCustomCategory(customCategory);
				if (result == null) result = caseCategory(customCategory);
				if (result == null) result = caseMethodContentElement(customCategory);
				if (result == null) result = caseDescribableElement(customCategory);
				if (result == null) result = caseMethodContentPackageableElement(customCategory);
				if (result == null) result = caseVariabilityElement(customCategory);
				if (result == null) result = caseExtensibleElement(customCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.DELIVERABLE: {
				Deliverable deliverable = (Deliverable)theEObject;
				Object result = caseDeliverable(deliverable);
				if (result == null) result = caseWorkProductUse(deliverable);
				if (result == null) result = caseMethodContentUse(deliverable);
				if (result == null) result = caseBreakdownElement(deliverable);
				if (result == null) result = caseProcessElement(deliverable);
				if (result == null) result = caseDescribableElement(deliverable);
				if (result == null) result = caseProcessPackageableElement(deliverable);
				if (result == null) result = caseExtensibleElement(deliverable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.PROCESS: {
				org.topcased.spem.uma.Process process = (org.topcased.spem.uma.Process)theEObject;
				Object result = caseProcess(process);
				if (result == null) result = caseActivity(process);
				if (result == null) result = caseWorkDefinition(process);
				if (result == null) result = caseWorkBreakdownElement(process);
				if (result == null) result = caseVariabilityElement(process);
				if (result == null) result = caseBreakdownElement(process);
				if (result == null) result = caseProcessElement(process);
				if (result == null) result = caseDescribableElement(process);
				if (result == null) result = caseProcessPackageableElement(process);
				if (result == null) result = caseExtensibleElement(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.DELIVERY_PROCESS: {
				DeliveryProcess deliveryProcess = (DeliveryProcess)theEObject;
				Object result = caseDeliveryProcess(deliveryProcess);
				if (result == null) result = caseProcess(deliveryProcess);
				if (result == null) result = caseActivity(deliveryProcess);
				if (result == null) result = caseWorkDefinition(deliveryProcess);
				if (result == null) result = caseWorkBreakdownElement(deliveryProcess);
				if (result == null) result = caseVariabilityElement(deliveryProcess);
				if (result == null) result = caseBreakdownElement(deliveryProcess);
				if (result == null) result = caseProcessElement(deliveryProcess);
				if (result == null) result = caseDescribableElement(deliveryProcess);
				if (result == null) result = caseProcessPackageableElement(deliveryProcess);
				if (result == null) result = caseExtensibleElement(deliveryProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.DISCIPLINE: {
				Discipline discipline = (Discipline)theEObject;
				Object result = caseDiscipline(discipline);
				if (result == null) result = caseCategory(discipline);
				if (result == null) result = caseMethodContentElement(discipline);
				if (result == null) result = caseDescribableElement(discipline);
				if (result == null) result = caseMethodContentPackageableElement(discipline);
				if (result == null) result = caseVariabilityElement(discipline);
				if (result == null) result = caseExtensibleElement(discipline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.DISCIPLINE_GROUPING: {
				DisciplineGrouping disciplineGrouping = (DisciplineGrouping)theEObject;
				Object result = caseDisciplineGrouping(disciplineGrouping);
				if (result == null) result = caseCategory(disciplineGrouping);
				if (result == null) result = caseMethodContentElement(disciplineGrouping);
				if (result == null) result = caseDescribableElement(disciplineGrouping);
				if (result == null) result = caseMethodContentPackageableElement(disciplineGrouping);
				if (result == null) result = caseVariabilityElement(disciplineGrouping);
				if (result == null) result = caseExtensibleElement(disciplineGrouping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.ROOT: {
				Root root = (Root)theEObject;
				Object result = caseRoot(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				Object result = caseDomain(domain);
				if (result == null) result = caseCategory(domain);
				if (result == null) result = caseMethodContentElement(domain);
				if (result == null) result = caseDescribableElement(domain);
				if (result == null) result = caseMethodContentPackageableElement(domain);
				if (result == null) result = caseVariabilityElement(domain);
				if (result == null) result = caseExtensibleElement(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.ESTIMATING_CONSIDERATION: {
				EstimatingConsideration estimatingConsideration = (EstimatingConsideration)theEObject;
				Object result = caseEstimatingConsideration(estimatingConsideration);
				if (result == null) result = caseGuidance(estimatingConsideration);
				if (result == null) result = caseMethodContentElement(estimatingConsideration);
				if (result == null) result = caseDescribableElement(estimatingConsideration);
				if (result == null) result = caseMethodContentPackageableElement(estimatingConsideration);
				if (result == null) result = caseVariabilityElement(estimatingConsideration);
				if (result == null) result = caseExtensibleElement(estimatingConsideration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.EXAMPLE: {
				Example example = (Example)theEObject;
				Object result = caseExample(example);
				if (result == null) result = caseGuidance(example);
				if (result == null) result = caseMethodContentElement(example);
				if (result == null) result = caseDescribableElement(example);
				if (result == null) result = caseMethodContentPackageableElement(example);
				if (result == null) result = caseVariabilityElement(example);
				if (result == null) result = caseExtensibleElement(example);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.ITERATION: {
				Iteration iteration = (Iteration)theEObject;
				Object result = caseIteration(iteration);
				if (result == null) result = caseActivity(iteration);
				if (result == null) result = caseWorkDefinition(iteration);
				if (result == null) result = caseWorkBreakdownElement(iteration);
				if (result == null) result = caseVariabilityElement(iteration);
				if (result == null) result = caseBreakdownElement(iteration);
				if (result == null) result = caseProcessElement(iteration);
				if (result == null) result = caseDescribableElement(iteration);
				if (result == null) result = caseProcessPackageableElement(iteration);
				if (result == null) result = caseExtensibleElement(iteration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.OUTCOME: {
				Outcome outcome = (Outcome)theEObject;
				Object result = caseOutcome(outcome);
				if (result == null) result = caseWorkProductUse(outcome);
				if (result == null) result = caseMethodContentUse(outcome);
				if (result == null) result = caseBreakdownElement(outcome);
				if (result == null) result = caseProcessElement(outcome);
				if (result == null) result = caseDescribableElement(outcome);
				if (result == null) result = caseProcessPackageableElement(outcome);
				if (result == null) result = caseExtensibleElement(outcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.PHASE: {
				Phase phase = (Phase)theEObject;
				Object result = casePhase(phase);
				if (result == null) result = caseActivity(phase);
				if (result == null) result = caseWorkDefinition(phase);
				if (result == null) result = caseWorkBreakdownElement(phase);
				if (result == null) result = caseVariabilityElement(phase);
				if (result == null) result = caseBreakdownElement(phase);
				if (result == null) result = caseProcessElement(phase);
				if (result == null) result = caseDescribableElement(phase);
				if (result == null) result = caseProcessPackageableElement(phase);
				if (result == null) result = caseExtensibleElement(phase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.PRACTICE: {
				Practice practice = (Practice)theEObject;
				Object result = casePractice(practice);
				if (result == null) result = caseGuidance(practice);
				if (result == null) result = caseMethodContentElement(practice);
				if (result == null) result = caseDescribableElement(practice);
				if (result == null) result = caseMethodContentPackageableElement(practice);
				if (result == null) result = caseVariabilityElement(practice);
				if (result == null) result = caseExtensibleElement(practice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.PROCESS_PLANNING_TEMPLATE: {
				ProcessPlanningTemplate processPlanningTemplate = (ProcessPlanningTemplate)theEObject;
				Object result = caseProcessPlanningTemplate(processPlanningTemplate);
				if (result == null) result = caseProcess(processPlanningTemplate);
				if (result == null) result = caseActivity(processPlanningTemplate);
				if (result == null) result = caseWorkDefinition(processPlanningTemplate);
				if (result == null) result = caseWorkBreakdownElement(processPlanningTemplate);
				if (result == null) result = caseVariabilityElement(processPlanningTemplate);
				if (result == null) result = caseBreakdownElement(processPlanningTemplate);
				if (result == null) result = caseProcessElement(processPlanningTemplate);
				if (result == null) result = caseDescribableElement(processPlanningTemplate);
				if (result == null) result = caseProcessPackageableElement(processPlanningTemplate);
				if (result == null) result = caseExtensibleElement(processPlanningTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.REPORT: {
				Report report = (Report)theEObject;
				Object result = caseReport(report);
				if (result == null) result = caseGuidance(report);
				if (result == null) result = caseMethodContentElement(report);
				if (result == null) result = caseDescribableElement(report);
				if (result == null) result = caseMethodContentPackageableElement(report);
				if (result == null) result = caseVariabilityElement(report);
				if (result == null) result = caseExtensibleElement(report);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.REUSABLE_ASSET: {
				ReusableAsset reusableAsset = (ReusableAsset)theEObject;
				Object result = caseReusableAsset(reusableAsset);
				if (result == null) result = caseGuidance(reusableAsset);
				if (result == null) result = caseMethodContentElement(reusableAsset);
				if (result == null) result = caseDescribableElement(reusableAsset);
				if (result == null) result = caseMethodContentPackageableElement(reusableAsset);
				if (result == null) result = caseVariabilityElement(reusableAsset);
				if (result == null) result = caseExtensibleElement(reusableAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.ROADMAP: {
				Roadmap roadmap = (Roadmap)theEObject;
				Object result = caseRoadmap(roadmap);
				if (result == null) result = caseGuidance(roadmap);
				if (result == null) result = caseMethodContentElement(roadmap);
				if (result == null) result = caseDescribableElement(roadmap);
				if (result == null) result = caseMethodContentPackageableElement(roadmap);
				if (result == null) result = caseVariabilityElement(roadmap);
				if (result == null) result = caseExtensibleElement(roadmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.TEMPLATE: {
				Template template = (Template)theEObject;
				Object result = caseTemplate(template);
				if (result == null) result = caseGuidance(template);
				if (result == null) result = caseMethodContentElement(template);
				if (result == null) result = caseDescribableElement(template);
				if (result == null) result = caseMethodContentPackageableElement(template);
				if (result == null) result = caseVariabilityElement(template);
				if (result == null) result = caseExtensibleElement(template);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.TERM_DEFINITION: {
				TermDefinition termDefinition = (TermDefinition)theEObject;
				Object result = caseTermDefinition(termDefinition);
				if (result == null) result = caseGuidance(termDefinition);
				if (result == null) result = caseMethodContentElement(termDefinition);
				if (result == null) result = caseDescribableElement(termDefinition);
				if (result == null) result = caseMethodContentPackageableElement(termDefinition);
				if (result == null) result = caseVariabilityElement(termDefinition);
				if (result == null) result = caseExtensibleElement(termDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.TOOL_MENTOR: {
				ToolMentor toolMentor = (ToolMentor)theEObject;
				Object result = caseToolMentor(toolMentor);
				if (result == null) result = caseGuidance(toolMentor);
				if (result == null) result = caseMethodContentElement(toolMentor);
				if (result == null) result = caseDescribableElement(toolMentor);
				if (result == null) result = caseMethodContentPackageableElement(toolMentor);
				if (result == null) result = caseVariabilityElement(toolMentor);
				if (result == null) result = caseExtensibleElement(toolMentor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.WHITEPAPER: {
				Whitepaper whitepaper = (Whitepaper)theEObject;
				Object result = caseWhitepaper(whitepaper);
				if (result == null) result = caseConcept(whitepaper);
				if (result == null) result = caseGuidance(whitepaper);
				if (result == null) result = caseMethodContentElement(whitepaper);
				if (result == null) result = caseDescribableElement(whitepaper);
				if (result == null) result = caseMethodContentPackageableElement(whitepaper);
				if (result == null) result = caseVariabilityElement(whitepaper);
				if (result == null) result = caseExtensibleElement(whitepaper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.GUIDELINE: {
				Guideline guideline = (Guideline)theEObject;
				Object result = caseGuideline(guideline);
				if (result == null) result = caseGuidance(guideline);
				if (result == null) result = caseMethodContentElement(guideline);
				if (result == null) result = caseDescribableElement(guideline);
				if (result == null) result = caseMethodContentPackageableElement(guideline);
				if (result == null) result = caseVariabilityElement(guideline);
				if (result == null) result = caseExtensibleElement(guideline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.SUPPORTING_MATERIAL: {
				SupportingMaterial supportingMaterial = (SupportingMaterial)theEObject;
				Object result = caseSupportingMaterial(supportingMaterial);
				if (result == null) result = caseGuidance(supportingMaterial);
				if (result == null) result = caseMethodContentElement(supportingMaterial);
				if (result == null) result = caseDescribableElement(supportingMaterial);
				if (result == null) result = caseMethodContentPackageableElement(supportingMaterial);
				if (result == null) result = caseVariabilityElement(supportingMaterial);
				if (result == null) result = caseExtensibleElement(supportingMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.ROLE_DEFINITION_PACKAGE: {
				RoleDefinitionPackage roleDefinitionPackage = (RoleDefinitionPackage)theEObject;
				Object result = caseRoleDefinitionPackage(roleDefinitionPackage);
				if (result == null) result = caseMethodContentPackage(roleDefinitionPackage);
				if (result == null) result = caseMethodContentPackageableElement(roleDefinitionPackage);
				if (result == null) result = caseMethodPluginPackageableElement(roleDefinitionPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.TASK_DEFINITION_PACKAGE: {
				TaskDefinitionPackage taskDefinitionPackage = (TaskDefinitionPackage)theEObject;
				Object result = caseTaskDefinitionPackage(taskDefinitionPackage);
				if (result == null) result = caseMethodContentPackage(taskDefinitionPackage);
				if (result == null) result = caseMethodContentPackageableElement(taskDefinitionPackage);
				if (result == null) result = caseMethodPluginPackageableElement(taskDefinitionPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.WORK_PRODUCT_DEFINITION_PACKAGE: {
				WorkProductDefinitionPackage workProductDefinitionPackage = (WorkProductDefinitionPackage)theEObject;
				Object result = caseWorkProductDefinitionPackage(workProductDefinitionPackage);
				if (result == null) result = caseMethodContentPackage(workProductDefinitionPackage);
				if (result == null) result = caseMethodContentPackageableElement(workProductDefinitionPackage);
				if (result == null) result = caseMethodPluginPackageableElement(workProductDefinitionPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.GUIDANCE_PACKAGE: {
				GuidancePackage guidancePackage = (GuidancePackage)theEObject;
				Object result = caseGuidancePackage(guidancePackage);
				if (result == null) result = caseMethodContentPackage(guidancePackage);
				if (result == null) result = caseMethodContentPackageableElement(guidancePackage);
				if (result == null) result = caseMethodPluginPackageableElement(guidancePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.DISCIPLINE_PACKAGE: {
				DisciplinePackage disciplinePackage = (DisciplinePackage)theEObject;
				Object result = caseDisciplinePackage(disciplinePackage);
				if (result == null) result = caseMethodContentPackage(disciplinePackage);
				if (result == null) result = caseMethodContentPackageableElement(disciplinePackage);
				if (result == null) result = caseMethodPluginPackageableElement(disciplinePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.DOMAIN_PACKAGE: {
				DomainPackage domainPackage = (DomainPackage)theEObject;
				Object result = caseDomainPackage(domainPackage);
				if (result == null) result = caseMethodContentPackage(domainPackage);
				if (result == null) result = caseMethodContentPackageableElement(domainPackage);
				if (result == null) result = caseMethodPluginPackageableElement(domainPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.WORK_PRODUCT_KIND_PACKAGE: {
				WorkProductKindPackage workProductKindPackage = (WorkProductKindPackage)theEObject;
				Object result = caseWorkProductKindPackage(workProductKindPackage);
				if (result == null) result = caseMethodContentPackage(workProductKindPackage);
				if (result == null) result = caseMethodContentPackageableElement(workProductKindPackage);
				if (result == null) result = caseMethodPluginPackageableElement(workProductKindPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.ROLE_SET_PACKAGE: {
				RoleSetPackage roleSetPackage = (RoleSetPackage)theEObject;
				Object result = caseRoleSetPackage(roleSetPackage);
				if (result == null) result = caseMethodContentPackage(roleSetPackage);
				if (result == null) result = caseMethodContentPackageableElement(roleSetPackage);
				if (result == null) result = caseMethodPluginPackageableElement(roleSetPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.TOOL_DEFINITION_PACKAGE: {
				ToolDefinitionPackage toolDefinitionPackage = (ToolDefinitionPackage)theEObject;
				Object result = caseToolDefinitionPackage(toolDefinitionPackage);
				if (result == null) result = caseMethodContentPackage(toolDefinitionPackage);
				if (result == null) result = caseMethodContentPackageableElement(toolDefinitionPackage);
				if (result == null) result = caseMethodPluginPackageableElement(toolDefinitionPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.CONFIGURATION_PACKAGE: {
				ConfigurationPackage configurationPackage = (ConfigurationPackage)theEObject;
				Object result = caseConfigurationPackage(configurationPackage);
				if (result == null) result = caseMethodContentPackage(configurationPackage);
				if (result == null) result = caseMethodContentPackageableElement(configurationPackage);
				if (result == null) result = caseMethodPluginPackageableElement(configurationPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.CAPABILITY_PATTERN_PACKAGE: {
				CapabilityPatternPackage capabilityPatternPackage = (CapabilityPatternPackage)theEObject;
				Object result = caseCapabilityPatternPackage(capabilityPatternPackage);
				if (result == null) result = caseProcessPackage(capabilityPatternPackage);
				if (result == null) result = caseProcessPackageableElement(capabilityPatternPackage);
				if (result == null) result = caseMethodPluginPackageableElement(capabilityPatternPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.DELIVERY_PROCESS_PACKAGE: {
				DeliveryProcessPackage deliveryProcessPackage = (DeliveryProcessPackage)theEObject;
				Object result = caseDeliveryProcessPackage(deliveryProcessPackage);
				if (result == null) result = caseProcessPackage(deliveryProcessPackage);
				if (result == null) result = caseProcessPackageableElement(deliveryProcessPackage);
				if (result == null) result = caseMethodPluginPackageableElement(deliveryProcessPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.ROLE_SET: {
				RoleSet roleSet = (RoleSet)theEObject;
				Object result = caseRoleSet(roleSet);
				if (result == null) result = caseMethodContentElement(roleSet);
				if (result == null) result = caseDescribableElement(roleSet);
				if (result == null) result = caseMethodContentPackageableElement(roleSet);
				if (result == null) result = caseVariabilityElement(roleSet);
				if (result == null) result = caseExtensibleElement(roleSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.QUALIFICATION_PACKAGE: {
				QualificationPackage qualificationPackage = (QualificationPackage)theEObject;
				Object result = caseQualificationPackage(qualificationPackage);
				if (result == null) result = caseMethodContentPackage(qualificationPackage);
				if (result == null) result = caseMethodContentPackageableElement(qualificationPackage);
				if (result == null) result = caseMethodPluginPackageableElement(qualificationPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.PROCESS_COMPONENT_PACKAGE: {
				ProcessComponentPackage processComponentPackage = (ProcessComponentPackage)theEObject;
				Object result = caseProcessComponentPackage(processComponentPackage);
				if (result == null) result = caseProcessPackage(processComponentPackage);
				if (result == null) result = caseProcessPackageableElement(processComponentPackage);
				if (result == null) result = caseMethodPluginPackageableElement(processComponentPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UmaPackage.WORK_PRODUCT_KIND: {
				WorkProductKind workProductKind = (WorkProductKind)theEObject;
				Object result = caseWorkProductKind(workProductKind);
				if (result == null) result = caseKind(workProductKind);
				if (result == null) result = caseMethodContentElement(workProductKind);
				if (result == null) result = caseDescribableElement(workProductKind);
				if (result == null) result = caseMethodContentPackageableElement(workProductKind);
				if (result == null) result = caseVariabilityElement(workProductKind);
				if (result == null) result = caseExtensibleElement(workProductKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCapabilityPattern(CapabilityPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checklist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checklist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseChecklist(Checklist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConcept(Concept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCategoryPackage(CategoryPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomCategory(CustomCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deliverable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deliverable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeliverable(Deliverable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProcess(org.topcased.spem.uma.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delivery Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delivery Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeliveryProcess(DeliveryProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discipline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discipline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDiscipline(Discipline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discipline Grouping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discipline Grouping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDisciplineGrouping(DisciplineGrouping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Estimating Consideration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Estimating Consideration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEstimatingConsideration(EstimatingConsideration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExample(Example object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iteration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iteration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIteration(Iteration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outcome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOutcome(Outcome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePhase(Phase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Practice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Practice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePractice(Practice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Planning Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Planning Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProcessPlanningTemplate(ProcessPlanningTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReport(Report object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reusable Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reusable Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReusableAsset(ReusableAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Roadmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roadmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoadmap(Roadmap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTemplate(Template object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTermDefinition(TermDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Mentor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Mentor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseToolMentor(ToolMentor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Whitepaper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Whitepaper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWhitepaper(Whitepaper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guideline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guideline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGuideline(Guideline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supporting Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supporting Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSupportingMaterial(SupportingMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Definition Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Definition Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoleDefinitionPackage(RoleDefinitionPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Definition Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Definition Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTaskDefinitionPackage(TaskDefinitionPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Definition Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Definition Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWorkProductDefinitionPackage(WorkProductDefinitionPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guidance Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guidance Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGuidancePackage(GuidancePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discipline Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discipline Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDisciplinePackage(DisciplinePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDomainPackage(DomainPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Kind Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Kind Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWorkProductKindPackage(WorkProductKindPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Set Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Set Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoleSetPackage(RoleSetPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Definition Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Definition Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseToolDefinitionPackage(ToolDefinitionPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConfigurationPackage(ConfigurationPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Pattern Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Pattern Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCapabilityPatternPackage(CapabilityPatternPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delivery Process Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delivery Process Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeliveryProcessPackage(DeliveryProcessPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoleSet(RoleSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualification Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualification Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQualificationPackage(QualificationPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Component Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Component Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProcessComponentPackage(ProcessComponentPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWorkProductKind(WorkProductKind object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Method Content Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Content Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMethodContentUse(MethodContentUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWorkProductUse(WorkProductUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWorkDefinition(WorkDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Breakdown Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Breakdown Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWorkBreakdownElement(WorkBreakdownElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variability Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variability Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVariabilityElement(VariabilityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Content Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Content Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMethodContentPackageableElement(MethodContentPackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Content Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Content Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMethodContentElement(MethodContentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guidance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guidance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGuidance(Guidance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Plugin Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Plugin Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMethodPluginPackageableElement(MethodPluginPackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Content Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Content Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMethodContentPackage(MethodContentPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProcessPackage(ProcessPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseKind(Kind object) {
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

} //UmaSwitch
