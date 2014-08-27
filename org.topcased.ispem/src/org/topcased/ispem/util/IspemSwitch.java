/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.topcased.ispem.Activity;
import org.topcased.ispem.Artifact;
import org.topcased.ispem.ArtifactDefinition;
import org.topcased.ispem.ArtifactDefinitionPackage;
import org.topcased.ispem.ArtifactTransformation;
import org.topcased.ispem.DevelopmentMethod;
import org.topcased.ispem.DevelopmentMethodContentPackage;
import org.topcased.ispem.DevelopmentMethodPackage;
import org.topcased.ispem.DevelopmentMethodWithLanguageContentPackage;
import org.topcased.ispem.DomainArtifactDefinition;
import org.topcased.ispem.DomainContentPackage;
import org.topcased.ispem.DomainTaskDefinition;
import org.topcased.ispem.EClassesRelation;
import org.topcased.ispem.EReferencesRelation;
import org.topcased.ispem.EngineeringDomain;
import org.topcased.ispem.EngineeringDomainPackage;
import org.topcased.ispem.ISPEMMethodLibrary;
import org.topcased.ispem.ISPEM;
import org.topcased.ispem.IspemPackage;
import org.topcased.ispem.LanguageArtifactDefinition;
import org.topcased.ispem.LanguageTaskDefinition;
import org.topcased.ispem.MetaModel;
import org.topcased.ispem.MetaModelPackage;
import org.topcased.ispem.MethodArtifactDefinition;
import org.topcased.ispem.MethodTaskDefinition;
import org.topcased.ispem.OntologyLinkedElement;
import org.topcased.ispem.RepresentLanguagePackage;
import org.topcased.ispem.RepresentativeLanguage;
import org.topcased.ispem.TaskDefinition;
import org.topcased.ispem.ToolDefinition;
import org.topcased.ispem.Viewpoint;
import org.topcased.ispem.WorkProductDefinition;
import org.topcased.spem.BreakdownElement;
import org.topcased.spem.Category;
import org.topcased.spem.DescribableElement;
import org.topcased.spem.ExtensibleElement;
import org.topcased.spem.MethodContentElement;
import org.topcased.spem.MethodContentPackage;
import org.topcased.spem.MethodContentPackageableElement;
import org.topcased.spem.MethodContentUse;
import org.topcased.spem.MethodLibrary;
import org.topcased.spem.MethodPluginPackageableElement;
import org.topcased.spem.ProcessElement;
import org.topcased.spem.ProcessPackageableElement;
import org.topcased.spem.VariabilityElement;
import org.topcased.spem.WorkBreakdownElement;
import org.topcased.spem.WorkDefinition;
import org.topcased.spem.WorkProductUse;
import org.topcased.spem.uma.CapabilityPattern;
import org.topcased.spem.uma.CategoryPackage;
import org.topcased.spem.uma.WorkProductDefinitionPackage;

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
 * @see org.topcased.ispem.IspemPackage
 * @generated
 */
public class IspemSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IspemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IspemSwitch() {
		if (modelPackage == null) {
			modelPackage = IspemPackage.eINSTANCE;
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
			case IspemPackage.ENGINEERING_DOMAIN: {
				EngineeringDomain engineeringDomain = (EngineeringDomain)theEObject;
				Object result = caseEngineeringDomain(engineeringDomain);
				if (result == null) result = caseOntologyLinkedElement(engineeringDomain);
				if (result == null) result = caseMethodContentElement(engineeringDomain);
				if (result == null) result = caseDescribableElement(engineeringDomain);
				if (result == null) result = caseMethodContentPackageableElement(engineeringDomain);
				if (result == null) result = caseVariabilityElement(engineeringDomain);
				if (result == null) result = caseExtensibleElement(engineeringDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.TOOL_DEFINITION: {
				ToolDefinition toolDefinition = (ToolDefinition)theEObject;
				Object result = caseToolDefinition(toolDefinition);
				if (result == null) result = caseSpem_ToolDefinition(toolDefinition);
				if (result == null) result = caseOntologyLinkedElement(toolDefinition);
				if (result == null) result = caseMethodContentElement(toolDefinition);
				if (result == null) result = caseDescribableElement(toolDefinition);
				if (result == null) result = caseMethodContentPackageableElement(toolDefinition);
				if (result == null) result = caseVariabilityElement(toolDefinition);
				if (result == null) result = caseExtensibleElement(toolDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.VIEWPOINT: {
				Viewpoint viewpoint = (Viewpoint)theEObject;
				Object result = caseViewpoint(viewpoint);
				if (result == null) result = caseOntologyLinkedElement(viewpoint);
				if (result == null) result = caseMethodContentElement(viewpoint);
				if (result == null) result = caseDescribableElement(viewpoint);
				if (result == null) result = caseMethodContentPackageableElement(viewpoint);
				if (result == null) result = caseVariabilityElement(viewpoint);
				if (result == null) result = caseExtensibleElement(viewpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.TASK_DEFINITION: {
				TaskDefinition taskDefinition = (TaskDefinition)theEObject;
				Object result = caseTaskDefinition(taskDefinition);
				if (result == null) result = caseOntologyLinkedElement(taskDefinition);
				if (result == null) result = caseSpem_TaskDefinition(taskDefinition);
				if (result == null) result = caseWorkDefinition(taskDefinition);
				if (result == null) result = caseMethodContentElement(taskDefinition);
				if (result == null) result = caseDescribableElement(taskDefinition);
				if (result == null) result = caseExtensibleElement(taskDefinition);
				if (result == null) result = caseMethodContentPackageableElement(taskDefinition);
				if (result == null) result = caseVariabilityElement(taskDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.WORK_PRODUCT_DEFINITION: {
				WorkProductDefinition workProductDefinition = (WorkProductDefinition)theEObject;
				Object result = caseWorkProductDefinition(workProductDefinition);
				if (result == null) result = caseOntologyLinkedElement(workProductDefinition);
				if (result == null) result = caseSpem_WorkProductDefinition(workProductDefinition);
				if (result == null) result = caseMethodContentElement(workProductDefinition);
				if (result == null) result = caseDescribableElement(workProductDefinition);
				if (result == null) result = caseExtensibleElement(workProductDefinition);
				if (result == null) result = caseMethodContentPackageableElement(workProductDefinition);
				if (result == null) result = caseVariabilityElement(workProductDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.ISPEM_METHOD_LIBRARY: {
				ISPEMMethodLibrary ispemMethodLibrary = (ISPEMMethodLibrary)theEObject;
				Object result = caseISPEMMethodLibrary(ispemMethodLibrary);
				if (result == null) result = caseMethodLibrary(ispemMethodLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.DEVELOPMENT_METHOD: {
				DevelopmentMethod developmentMethod = (DevelopmentMethod)theEObject;
				Object result = caseDevelopmentMethod(developmentMethod);
				if (result == null) result = caseOntologyLinkedElement(developmentMethod);
				if (result == null) result = caseCategory(developmentMethod);
				if (result == null) result = caseMethodContentElement(developmentMethod);
				if (result == null) result = caseDescribableElement(developmentMethod);
				if (result == null) result = caseExtensibleElement(developmentMethod);
				if (result == null) result = caseMethodContentPackageableElement(developmentMethod);
				if (result == null) result = caseVariabilityElement(developmentMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.ENGINEERING_DOMAIN_PACKAGE: {
				EngineeringDomainPackage engineeringDomainPackage = (EngineeringDomainPackage)theEObject;
				Object result = caseEngineeringDomainPackage(engineeringDomainPackage);
				if (result == null) result = caseMethodContentPackage(engineeringDomainPackage);
				if (result == null) result = caseMethodContentPackageableElement(engineeringDomainPackage);
				if (result == null) result = caseMethodPluginPackageableElement(engineeringDomainPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.DEVELOPMENT_METHOD_PACKAGE: {
				DevelopmentMethodPackage developmentMethodPackage = (DevelopmentMethodPackage)theEObject;
				Object result = caseDevelopmentMethodPackage(developmentMethodPackage);
				if (result == null) result = caseCategoryPackage(developmentMethodPackage);
				if (result == null) result = caseMethodContentPackage(developmentMethodPackage);
				if (result == null) result = caseMethodContentPackageableElement(developmentMethodPackage);
				if (result == null) result = caseMethodPluginPackageableElement(developmentMethodPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.ONTOLOGY_LINKED_ELEMENT: {
				OntologyLinkedElement ontologyLinkedElement = (OntologyLinkedElement)theEObject;
				Object result = caseOntologyLinkedElement(ontologyLinkedElement);
				if (result == null) result = caseDescribableElement(ontologyLinkedElement);
				if (result == null) result = caseExtensibleElement(ontologyLinkedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.ARTIFACT_DEFINITION_PACKAGE: {
				ArtifactDefinitionPackage artifactDefinitionPackage = (ArtifactDefinitionPackage)theEObject;
				Object result = caseArtifactDefinitionPackage(artifactDefinitionPackage);
				if (result == null) result = caseWorkProductDefinitionPackage(artifactDefinitionPackage);
				if (result == null) result = caseMethodContentPackage(artifactDefinitionPackage);
				if (result == null) result = caseMethodContentPackageableElement(artifactDefinitionPackage);
				if (result == null) result = caseMethodPluginPackageableElement(artifactDefinitionPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.ARTIFACT: {
				Artifact artifact = (Artifact)theEObject;
				Object result = caseArtifact(artifact);
				if (result == null) result = caseUma_Artifact(artifact);
				if (result == null) result = caseOntologyLinkedElement(artifact);
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
			case IspemPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				Object result = caseActivity(activity);
				if (result == null) result = caseSpem_Activity(activity);
				if (result == null) result = caseOntologyLinkedElement(activity);
				if (result == null) result = caseWorkDefinition(activity);
				if (result == null) result = caseWorkBreakdownElement(activity);
				if (result == null) result = caseVariabilityElement(activity);
				if (result == null) result = caseBreakdownElement(activity);
				if (result == null) result = caseProcessElement(activity);
				if (result == null) result = caseDescribableElement(activity);
				if (result == null) result = caseProcessPackageableElement(activity);
				if (result == null) result = caseExtensibleElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.ARTIFACT_TRANSFORMATION: {
				ArtifactTransformation artifactTransformation = (ArtifactTransformation)theEObject;
				Object result = caseArtifactTransformation(artifactTransformation);
				if (result == null) result = caseBreakdownElement(artifactTransformation);
				if (result == null) result = caseOntologyLinkedElement(artifactTransformation);
				if (result == null) result = caseProcessElement(artifactTransformation);
				if (result == null) result = caseDescribableElement(artifactTransformation);
				if (result == null) result = caseProcessPackageableElement(artifactTransformation);
				if (result == null) result = caseExtensibleElement(artifactTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.DOMAIN_TASK_DEFINITION: {
				DomainTaskDefinition domainTaskDefinition = (DomainTaskDefinition)theEObject;
				Object result = caseDomainTaskDefinition(domainTaskDefinition);
				if (result == null) result = caseTaskDefinition(domainTaskDefinition);
				if (result == null) result = caseOntologyLinkedElement(domainTaskDefinition);
				if (result == null) result = caseSpem_TaskDefinition(domainTaskDefinition);
				if (result == null) result = caseWorkDefinition(domainTaskDefinition);
				if (result == null) result = caseMethodContentElement(domainTaskDefinition);
				if (result == null) result = caseDescribableElement(domainTaskDefinition);
				if (result == null) result = caseExtensibleElement(domainTaskDefinition);
				if (result == null) result = caseMethodContentPackageableElement(domainTaskDefinition);
				if (result == null) result = caseVariabilityElement(domainTaskDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.METHOD_TASK_DEFINITION: {
				MethodTaskDefinition methodTaskDefinition = (MethodTaskDefinition)theEObject;
				Object result = caseMethodTaskDefinition(methodTaskDefinition);
				if (result == null) result = caseTaskDefinition(methodTaskDefinition);
				if (result == null) result = caseOntologyLinkedElement(methodTaskDefinition);
				if (result == null) result = caseSpem_TaskDefinition(methodTaskDefinition);
				if (result == null) result = caseWorkDefinition(methodTaskDefinition);
				if (result == null) result = caseMethodContentElement(methodTaskDefinition);
				if (result == null) result = caseDescribableElement(methodTaskDefinition);
				if (result == null) result = caseExtensibleElement(methodTaskDefinition);
				if (result == null) result = caseMethodContentPackageableElement(methodTaskDefinition);
				if (result == null) result = caseVariabilityElement(methodTaskDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.DOMAIN_ARTIFACT_DEFINITION: {
				DomainArtifactDefinition domainArtifactDefinition = (DomainArtifactDefinition)theEObject;
				Object result = caseDomainArtifactDefinition(domainArtifactDefinition);
				if (result == null) result = caseArtifactDefinition(domainArtifactDefinition);
				if (result == null) result = caseWorkProductDefinition(domainArtifactDefinition);
				if (result == null) result = caseOntologyLinkedElement(domainArtifactDefinition);
				if (result == null) result = caseSpem_WorkProductDefinition(domainArtifactDefinition);
				if (result == null) result = caseMethodContentElement(domainArtifactDefinition);
				if (result == null) result = caseDescribableElement(domainArtifactDefinition);
				if (result == null) result = caseExtensibleElement(domainArtifactDefinition);
				if (result == null) result = caseMethodContentPackageableElement(domainArtifactDefinition);
				if (result == null) result = caseVariabilityElement(domainArtifactDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.METHOD_ARTIFACT_DEFINITION: {
				MethodArtifactDefinition methodArtifactDefinition = (MethodArtifactDefinition)theEObject;
				Object result = caseMethodArtifactDefinition(methodArtifactDefinition);
				if (result == null) result = caseArtifactDefinition(methodArtifactDefinition);
				if (result == null) result = caseWorkProductDefinition(methodArtifactDefinition);
				if (result == null) result = caseOntologyLinkedElement(methodArtifactDefinition);
				if (result == null) result = caseSpem_WorkProductDefinition(methodArtifactDefinition);
				if (result == null) result = caseMethodContentElement(methodArtifactDefinition);
				if (result == null) result = caseDescribableElement(methodArtifactDefinition);
				if (result == null) result = caseExtensibleElement(methodArtifactDefinition);
				if (result == null) result = caseMethodContentPackageableElement(methodArtifactDefinition);
				if (result == null) result = caseVariabilityElement(methodArtifactDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.DOMAIN_CONTENT_PACKAGE: {
				DomainContentPackage domainContentPackage = (DomainContentPackage)theEObject;
				Object result = caseDomainContentPackage(domainContentPackage);
				if (result == null) result = caseMethodContentPackage(domainContentPackage);
				if (result == null) result = caseMethodContentPackageableElement(domainContentPackage);
				if (result == null) result = caseMethodPluginPackageableElement(domainContentPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.DEVELOPMENT_METHOD_CONTENT_PACKAGE: {
				DevelopmentMethodContentPackage developmentMethodContentPackage = (DevelopmentMethodContentPackage)theEObject;
				Object result = caseDevelopmentMethodContentPackage(developmentMethodContentPackage);
				if (result == null) result = caseMethodContentPackage(developmentMethodContentPackage);
				if (result == null) result = caseMethodContentPackageableElement(developmentMethodContentPackage);
				if (result == null) result = caseMethodPluginPackageableElement(developmentMethodContentPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.PROCESS: {
				org.topcased.ispem.Process process = (org.topcased.ispem.Process)theEObject;
				Object result = caseProcess(process);
				if (result == null) result = caseCapabilityPattern(process);
				if (result == null) result = caseUma_Process(process);
				if (result == null) result = caseSpem_Activity(process);
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
			case IspemPackage.LANGUAGE_ARTIFACT_DEFINITION: {
				LanguageArtifactDefinition languageArtifactDefinition = (LanguageArtifactDefinition)theEObject;
				Object result = caseLanguageArtifactDefinition(languageArtifactDefinition);
				if (result == null) result = caseArtifactDefinition(languageArtifactDefinition);
				if (result == null) result = caseWorkProductDefinition(languageArtifactDefinition);
				if (result == null) result = caseOntologyLinkedElement(languageArtifactDefinition);
				if (result == null) result = caseSpem_WorkProductDefinition(languageArtifactDefinition);
				if (result == null) result = caseMethodContentElement(languageArtifactDefinition);
				if (result == null) result = caseDescribableElement(languageArtifactDefinition);
				if (result == null) result = caseExtensibleElement(languageArtifactDefinition);
				if (result == null) result = caseMethodContentPackageableElement(languageArtifactDefinition);
				if (result == null) result = caseVariabilityElement(languageArtifactDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.LANGUAGE_TASK_DEFINITION: {
				LanguageTaskDefinition languageTaskDefinition = (LanguageTaskDefinition)theEObject;
				Object result = caseLanguageTaskDefinition(languageTaskDefinition);
				if (result == null) result = caseTaskDefinition(languageTaskDefinition);
				if (result == null) result = caseOntologyLinkedElement(languageTaskDefinition);
				if (result == null) result = caseSpem_TaskDefinition(languageTaskDefinition);
				if (result == null) result = caseWorkDefinition(languageTaskDefinition);
				if (result == null) result = caseMethodContentElement(languageTaskDefinition);
				if (result == null) result = caseDescribableElement(languageTaskDefinition);
				if (result == null) result = caseExtensibleElement(languageTaskDefinition);
				if (result == null) result = caseMethodContentPackageableElement(languageTaskDefinition);
				if (result == null) result = caseVariabilityElement(languageTaskDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE: {
				DevelopmentMethodWithLanguageContentPackage developmentMethodWithLanguageContentPackage = (DevelopmentMethodWithLanguageContentPackage)theEObject;
				Object result = caseDevelopmentMethodWithLanguageContentPackage(developmentMethodWithLanguageContentPackage);
				if (result == null) result = caseMethodContentPackage(developmentMethodWithLanguageContentPackage);
				if (result == null) result = caseMethodContentPackageableElement(developmentMethodWithLanguageContentPackage);
				if (result == null) result = caseMethodPluginPackageableElement(developmentMethodWithLanguageContentPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.REPRESENTATIVE_LANGUAGE: {
				RepresentativeLanguage representativeLanguage = (RepresentativeLanguage)theEObject;
				Object result = caseRepresentativeLanguage(representativeLanguage);
				if (result == null) result = caseCategory(representativeLanguage);
				if (result == null) result = caseOntologyLinkedElement(representativeLanguage);
				if (result == null) result = caseMethodContentElement(representativeLanguage);
				if (result == null) result = caseDescribableElement(representativeLanguage);
				if (result == null) result = caseMethodContentPackageableElement(representativeLanguage);
				if (result == null) result = caseVariabilityElement(representativeLanguage);
				if (result == null) result = caseExtensibleElement(representativeLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.REPRESENT_LANGUAGE_PACKAGE: {
				RepresentLanguagePackage representLanguagePackage = (RepresentLanguagePackage)theEObject;
				Object result = caseRepresentLanguagePackage(representLanguagePackage);
				if (result == null) result = caseCategoryPackage(representLanguagePackage);
				if (result == null) result = caseMethodContentPackage(representLanguagePackage);
				if (result == null) result = caseMethodContentPackageableElement(representLanguagePackage);
				if (result == null) result = caseMethodPluginPackageableElement(representLanguagePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.META_MODEL_PACKAGE: {
				MetaModelPackage metaModelPackage = (MetaModelPackage)theEObject;
				Object result = caseMetaModelPackage(metaModelPackage);
				if (result == null) result = caseMethodContentPackage(metaModelPackage);
				if (result == null) result = caseMethodContentPackageableElement(metaModelPackage);
				if (result == null) result = caseMethodPluginPackageableElement(metaModelPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.META_MODEL: {
				MetaModel metaModel = (MetaModel)theEObject;
				Object result = caseMetaModel(metaModel);
				if (result == null) result = caseMethodContentElement(metaModel);
				if (result == null) result = caseDescribableElement(metaModel);
				if (result == null) result = caseMethodContentPackageableElement(metaModel);
				if (result == null) result = caseVariabilityElement(metaModel);
				if (result == null) result = caseExtensibleElement(metaModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.ECLASSES_RELATION: {
				EClassesRelation eClassesRelation = (EClassesRelation)theEObject;
				Object result = caseEClassesRelation(eClassesRelation);
				if (result == null) result = caseMethodContentElement(eClassesRelation);
				if (result == null) result = caseDescribableElement(eClassesRelation);
				if (result == null) result = caseMethodContentPackageableElement(eClassesRelation);
				if (result == null) result = caseVariabilityElement(eClassesRelation);
				if (result == null) result = caseExtensibleElement(eClassesRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.EREFERENCES_RELATION: {
				EReferencesRelation eReferencesRelation = (EReferencesRelation)theEObject;
				Object result = caseEReferencesRelation(eReferencesRelation);
				if (result == null) result = caseMethodContentElement(eReferencesRelation);
				if (result == null) result = caseDescribableElement(eReferencesRelation);
				if (result == null) result = caseMethodContentPackageableElement(eReferencesRelation);
				if (result == null) result = caseVariabilityElement(eReferencesRelation);
				if (result == null) result = caseExtensibleElement(eReferencesRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IspemPackage.ARTIFACT_DEFINITION: {
				ArtifactDefinition artifactDefinition = (ArtifactDefinition)theEObject;
				Object result = caseArtifactDefinition(artifactDefinition);
				if (result == null) result = caseWorkProductDefinition(artifactDefinition);
				if (result == null) result = caseOntologyLinkedElement(artifactDefinition);
				if (result == null) result = caseSpem_WorkProductDefinition(artifactDefinition);
				if (result == null) result = caseMethodContentElement(artifactDefinition);
				if (result == null) result = caseDescribableElement(artifactDefinition);
				if (result == null) result = caseExtensibleElement(artifactDefinition);
				if (result == null) result = caseMethodContentPackageableElement(artifactDefinition);
				if (result == null) result = caseVariabilityElement(artifactDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engineering Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engineering Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEngineeringDomain(EngineeringDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseToolDefinition(ToolDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Viewpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Viewpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseViewpoint(Viewpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTaskDefinition(TaskDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArtifactDefinition(ArtifactDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Development Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Development Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDevelopmentMethod(DevelopmentMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engineering Domain Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engineering Domain Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEngineeringDomainPackage(EngineeringDomainPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Development Method Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Development Method Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDevelopmentMethodPackage(DevelopmentMethodPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology Linked Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology Linked Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOntologyLinkedElement(OntologyLinkedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Definition Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Definition Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArtifactDefinitionPackage(ArtifactDefinitionPackage object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArtifactTransformation(ArtifactTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Task Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Task Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDomainTaskDefinition(DomainTaskDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Task Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Task Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMethodTaskDefinition(MethodTaskDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Artifact Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Artifact Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDomainArtifactDefinition(DomainArtifactDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Artifact Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Artifact Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMethodArtifactDefinition(MethodArtifactDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Content Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Content Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDomainContentPackage(DomainContentPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Development Method Content Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Development Method Content Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDevelopmentMethodContentPackage(DevelopmentMethodContentPackage object) {
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
	public Object caseProcess(org.topcased.ispem.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Artifact Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Artifact Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLanguageArtifactDefinition(LanguageArtifactDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Task Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Task Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLanguageTaskDefinition(LanguageTaskDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Development Method With Language Content Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Development Method With Language Content Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDevelopmentMethodWithLanguageContentPackage(DevelopmentMethodWithLanguageContentPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representative Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representative Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRepresentativeLanguage(RepresentativeLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Represent Language Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Represent Language Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRepresentLanguagePackage(RepresentLanguagePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Model Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Model Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMetaModelPackage(MetaModelPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMetaModel(MetaModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClasses Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClasses Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEClassesRelation(EClassesRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EReferences Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EReferences Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEReferencesRelation(EReferencesRelation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Tool Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSpem_ToolDefinition(org.topcased.spem.ToolDefinition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Task Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSpem_TaskDefinition(org.topcased.spem.TaskDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSpem_WorkProductDefinition(org.topcased.spem.WorkProductDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWorkProductDefinition(WorkProductDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISPEM Method Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISPEM Method Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseISPEMMethodLibrary(ISPEMMethodLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMethodLibrary(MethodLibrary object) {
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
	public Object caseUma_Artifact(org.topcased.spem.uma.Artifact object) {
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
	public Object caseSpem_Activity(org.topcased.spem.Activity object) {
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
	public Object caseUma_Process(org.topcased.spem.uma.Process object) {
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

} //IspemSwitch
