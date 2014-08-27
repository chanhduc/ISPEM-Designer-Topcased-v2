/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.topcased.ispem.IspemPackage
 * @generated
 */
public class IspemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IspemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IspemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IspemPackage.eINSTANCE;
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
	protected IspemSwitch modelSwitch =
		new IspemSwitch() {
			public Object caseEngineeringDomain(EngineeringDomain object) {
				return createEngineeringDomainAdapter();
			}
			public Object caseToolDefinition(ToolDefinition object) {
				return createToolDefinitionAdapter();
			}
			public Object caseViewpoint(Viewpoint object) {
				return createViewpointAdapter();
			}
			public Object caseTaskDefinition(TaskDefinition object) {
				return createTaskDefinitionAdapter();
			}
			public Object caseWorkProductDefinition(WorkProductDefinition object) {
				return createWorkProductDefinitionAdapter();
			}
			public Object caseISPEMMethodLibrary(ISPEMMethodLibrary object) {
				return createISPEMMethodLibraryAdapter();
			}
			public Object caseDevelopmentMethod(DevelopmentMethod object) {
				return createDevelopmentMethodAdapter();
			}
			public Object caseEngineeringDomainPackage(EngineeringDomainPackage object) {
				return createEngineeringDomainPackageAdapter();
			}
			public Object caseDevelopmentMethodPackage(DevelopmentMethodPackage object) {
				return createDevelopmentMethodPackageAdapter();
			}
			public Object caseOntologyLinkedElement(OntologyLinkedElement object) {
				return createOntologyLinkedElementAdapter();
			}
			public Object caseArtifactDefinitionPackage(ArtifactDefinitionPackage object) {
				return createArtifactDefinitionPackageAdapter();
			}
			public Object caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			public Object caseActivity(Activity object) {
				return createActivityAdapter();
			}
			public Object caseArtifactTransformation(ArtifactTransformation object) {
				return createArtifactTransformationAdapter();
			}
			public Object caseDomainTaskDefinition(DomainTaskDefinition object) {
				return createDomainTaskDefinitionAdapter();
			}
			public Object caseMethodTaskDefinition(MethodTaskDefinition object) {
				return createMethodTaskDefinitionAdapter();
			}
			public Object caseDomainArtifactDefinition(DomainArtifactDefinition object) {
				return createDomainArtifactDefinitionAdapter();
			}
			public Object caseMethodArtifactDefinition(MethodArtifactDefinition object) {
				return createMethodArtifactDefinitionAdapter();
			}
			public Object caseDomainContentPackage(DomainContentPackage object) {
				return createDomainContentPackageAdapter();
			}
			public Object caseDevelopmentMethodContentPackage(DevelopmentMethodContentPackage object) {
				return createDevelopmentMethodContentPackageAdapter();
			}
			public Object caseProcess(org.topcased.ispem.Process object) {
				return createProcessAdapter();
			}
			public Object caseLanguageArtifactDefinition(LanguageArtifactDefinition object) {
				return createLanguageArtifactDefinitionAdapter();
			}
			public Object caseLanguageTaskDefinition(LanguageTaskDefinition object) {
				return createLanguageTaskDefinitionAdapter();
			}
			public Object caseDevelopmentMethodWithLanguageContentPackage(DevelopmentMethodWithLanguageContentPackage object) {
				return createDevelopmentMethodWithLanguageContentPackageAdapter();
			}
			public Object caseRepresentativeLanguage(RepresentativeLanguage object) {
				return createRepresentativeLanguageAdapter();
			}
			public Object caseRepresentLanguagePackage(RepresentLanguagePackage object) {
				return createRepresentLanguagePackageAdapter();
			}
			public Object caseMetaModelPackage(MetaModelPackage object) {
				return createMetaModelPackageAdapter();
			}
			public Object caseMetaModel(MetaModel object) {
				return createMetaModelAdapter();
			}
			public Object caseEClassesRelation(EClassesRelation object) {
				return createEClassesRelationAdapter();
			}
			public Object caseEReferencesRelation(EReferencesRelation object) {
				return createEReferencesRelationAdapter();
			}
			public Object caseArtifactDefinition(ArtifactDefinition object) {
				return createArtifactDefinitionAdapter();
			}
			public Object caseExtensibleElement(ExtensibleElement object) {
				return createExtensibleElementAdapter();
			}
			public Object caseDescribableElement(DescribableElement object) {
				return createDescribableElementAdapter();
			}
			public Object caseMethodContentPackageableElement(MethodContentPackageableElement object) {
				return createMethodContentPackageableElementAdapter();
			}
			public Object caseVariabilityElement(VariabilityElement object) {
				return createVariabilityElementAdapter();
			}
			public Object caseMethodContentElement(MethodContentElement object) {
				return createMethodContentElementAdapter();
			}
			public Object caseSpem_ToolDefinition(org.topcased.spem.ToolDefinition object) {
				return createSpem_ToolDefinitionAdapter();
			}
			public Object caseWorkDefinition(WorkDefinition object) {
				return createWorkDefinitionAdapter();
			}
			public Object caseSpem_TaskDefinition(org.topcased.spem.TaskDefinition object) {
				return createSpem_TaskDefinitionAdapter();
			}
			public Object caseSpem_WorkProductDefinition(org.topcased.spem.WorkProductDefinition object) {
				return createSpem_WorkProductDefinitionAdapter();
			}
			public Object caseMethodLibrary(MethodLibrary object) {
				return createMethodLibraryAdapter();
			}
			public Object caseCategory(Category object) {
				return createCategoryAdapter();
			}
			public Object caseMethodPluginPackageableElement(MethodPluginPackageableElement object) {
				return createMethodPluginPackageableElementAdapter();
			}
			public Object caseMethodContentPackage(MethodContentPackage object) {
				return createMethodContentPackageAdapter();
			}
			public Object caseCategoryPackage(CategoryPackage object) {
				return createCategoryPackageAdapter();
			}
			public Object caseWorkProductDefinitionPackage(WorkProductDefinitionPackage object) {
				return createWorkProductDefinitionPackageAdapter();
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
			public Object caseUma_Artifact(org.topcased.spem.uma.Artifact object) {
				return createUma_ArtifactAdapter();
			}
			public Object caseWorkBreakdownElement(WorkBreakdownElement object) {
				return createWorkBreakdownElementAdapter();
			}
			public Object caseSpem_Activity(org.topcased.spem.Activity object) {
				return createSpem_ActivityAdapter();
			}
			public Object caseUma_Process(org.topcased.spem.uma.Process object) {
				return createUma_ProcessAdapter();
			}
			public Object caseCapabilityPattern(CapabilityPattern object) {
				return createCapabilityPatternAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.EngineeringDomain <em>Engineering Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.EngineeringDomain
	 * @generated
	 */
	public Adapter createEngineeringDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.ToolDefinition <em>Tool Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.ToolDefinition
	 * @generated
	 */
	public Adapter createToolDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.Viewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.Viewpoint
	 * @generated
	 */
	public Adapter createViewpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.TaskDefinition <em>Task Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.TaskDefinition
	 * @generated
	 */
	public Adapter createTaskDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.ArtifactDefinition <em>Artifact Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.ArtifactDefinition
	 * @generated
	 */
	public Adapter createArtifactDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.DevelopmentMethod <em>Development Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.DevelopmentMethod
	 * @generated
	 */
	public Adapter createDevelopmentMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.EngineeringDomainPackage <em>Engineering Domain Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.EngineeringDomainPackage
	 * @generated
	 */
	public Adapter createEngineeringDomainPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.DevelopmentMethodPackage <em>Development Method Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.DevelopmentMethodPackage
	 * @generated
	 */
	public Adapter createDevelopmentMethodPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.OntologyLinkedElement <em>Ontology Linked Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.OntologyLinkedElement
	 * @generated
	 */
	public Adapter createOntologyLinkedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.ArtifactDefinitionPackage <em>Artifact Definition Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.ArtifactDefinitionPackage
	 * @generated
	 */
	public Adapter createArtifactDefinitionPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.ArtifactTransformation <em>Artifact Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.ArtifactTransformation
	 * @generated
	 */
	public Adapter createArtifactTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.DomainTaskDefinition <em>Domain Task Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.DomainTaskDefinition
	 * @generated
	 */
	public Adapter createDomainTaskDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.MethodTaskDefinition <em>Method Task Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.MethodTaskDefinition
	 * @generated
	 */
	public Adapter createMethodTaskDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.DomainArtifactDefinition <em>Domain Artifact Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.DomainArtifactDefinition
	 * @generated
	 */
	public Adapter createDomainArtifactDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.MethodArtifactDefinition <em>Method Artifact Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.MethodArtifactDefinition
	 * @generated
	 */
	public Adapter createMethodArtifactDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.DomainContentPackage <em>Domain Content Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.DomainContentPackage
	 * @generated
	 */
	public Adapter createDomainContentPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.DevelopmentMethodContentPackage <em>Development Method Content Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.DevelopmentMethodContentPackage
	 * @generated
	 */
	public Adapter createDevelopmentMethodContentPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.LanguageArtifactDefinition <em>Language Artifact Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.LanguageArtifactDefinition
	 * @generated
	 */
	public Adapter createLanguageArtifactDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.LanguageTaskDefinition <em>Language Task Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.LanguageTaskDefinition
	 * @generated
	 */
	public Adapter createLanguageTaskDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.DevelopmentMethodWithLanguageContentPackage <em>Development Method With Language Content Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.DevelopmentMethodWithLanguageContentPackage
	 * @generated
	 */
	public Adapter createDevelopmentMethodWithLanguageContentPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.RepresentativeLanguage <em>Representative Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.RepresentativeLanguage
	 * @generated
	 */
	public Adapter createRepresentativeLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.RepresentLanguagePackage <em>Represent Language Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.RepresentLanguagePackage
	 * @generated
	 */
	public Adapter createRepresentLanguagePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.MetaModelPackage <em>Meta Model Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.MetaModelPackage
	 * @generated
	 */
	public Adapter createMetaModelPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.MetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.MetaModel
	 * @generated
	 */
	public Adapter createMetaModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.EClassesRelation <em>EClasses Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.EClassesRelation
	 * @generated
	 */
	public Adapter createEClassesRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.EReferencesRelation <em>EReferences Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.EReferencesRelation
	 * @generated
	 */
	public Adapter createEReferencesRelationAdapter() {
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
	public Adapter createSpem_ToolDefinitionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.TaskDefinition <em>Task Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.TaskDefinition
	 * @generated
	 */
	public Adapter createSpem_TaskDefinitionAdapter() {
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
	public Adapter createSpem_WorkProductDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.WorkProductDefinition <em>Work Product Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.WorkProductDefinition
	 * @generated
	 */
	public Adapter createWorkProductDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.ispem.ISPEMMethodLibrary <em>ISPEM Method Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.ispem.ISPEMMethodLibrary
	 * @generated
	 */
	public Adapter createISPEMMethodLibraryAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.uma.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.uma.Artifact
	 * @generated
	 */
	public Adapter createUma_ArtifactAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.topcased.spem.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.spem.Activity
	 * @generated
	 */
	public Adapter createSpem_ActivityAdapter() {
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
	public Adapter createUma_ProcessAdapter() {
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

} //IspemAdapterFactory
