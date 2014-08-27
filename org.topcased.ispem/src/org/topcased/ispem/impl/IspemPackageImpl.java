/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import org.topcased.ispem.ENamedElementRelationKind;
import org.topcased.ispem.EReferencesRelation;
import org.topcased.ispem.EngineeringDomain;
import org.topcased.ispem.EngineeringDomainPackage;
import org.topcased.ispem.ISPEMMethodLibrary;
import org.topcased.ispem.IspemFactory;
import org.topcased.ispem.IspemPackage;
import org.topcased.ispem.LanguageArtifactDefinition;
import org.topcased.ispem.LanguageTaskDefinition;
import org.topcased.ispem.Level;
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
import org.topcased.spem.SpemPackage;

import org.topcased.spem.activity.ActivityPackage;
import org.topcased.spem.activity.impl.ActivityPackageImpl;
import org.topcased.spem.impl.SpemPackageImpl;

import org.topcased.spem.uma.UmaPackage;

import org.topcased.spem.uma.impl.UmaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IspemPackageImpl extends EPackageImpl implements IspemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineeringDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ispemMethodLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass developmentMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineeringDomainPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass developmentMethodPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologyLinkedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactDefinitionPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainTaskDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodTaskDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainArtifactDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodArtifactDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainContentPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass developmentMethodContentPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageArtifactDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageTaskDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass developmentMethodWithLanguageContentPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representativeLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representLanguagePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaModelPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassesRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eReferencesRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eNamedElementRelationKindEEnum = null;

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
	 * @see org.topcased.ispem.IspemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IspemPackageImpl() {
		super(eNS_URI, IspemFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IspemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IspemPackage init() {
		if (isInited) return (IspemPackage)EPackage.Registry.INSTANCE.getEPackage(IspemPackage.eNS_URI);

		// Obtain or create and register package
		IspemPackageImpl theIspemPackage = (IspemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IspemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IspemPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SpemPackageImpl theSpemPackage = (SpemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpemPackage.eNS_URI) instanceof SpemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpemPackage.eNS_URI) : SpemPackage.eINSTANCE);
		UmaPackageImpl theUmaPackage = (UmaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI) instanceof UmaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI) : UmaPackage.eINSTANCE);
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) : ActivityPackage.eINSTANCE);

		// Create package meta-data objects
		theIspemPackage.createPackageContents();
		theSpemPackage.createPackageContents();
		theUmaPackage.createPackageContents();
		theActivityPackage.createPackageContents();

		// Initialize created meta-data
		theIspemPackage.initializePackageContents();
		theSpemPackage.initializePackageContents();
		theUmaPackage.initializePackageContents();
		theActivityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIspemPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IspemPackage.eNS_URI, theIspemPackage);
		return theIspemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineeringDomain() {
		return engineeringDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringDomain_Viewpoints() {
		return (EReference)engineeringDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringDomain_Defines() {
		return (EReference)engineeringDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringDomain_Realizes() {
		return (EReference)engineeringDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolDefinition() {
		return toolDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolDefinition_SupportedEngineringDomain() {
		return (EReference)toolDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolDefinition_SupportedRepresentativeLanguage() {
		return (EReference)toolDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewpoint() {
		return viewpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewpoint_Caracterizes() {
		return (EReference)viewpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskDefinition() {
		return taskDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkProductDefinition() {
		return workProductDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProductDefinition_RootElement() {
		return (EReference)workProductDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProductDefinition_UsedReferences() {
		return (EReference)workProductDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkProductDefinition_Metamodel() {
		return (EReference)workProductDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISPEMMethodLibrary() {
		return ispemMethodLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactDefinition() {
		return artifactDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevelopmentMethod() {
		return developmentMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentMethod_Supports() {
		return (EReference)developmentMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentMethod_Defines() {
		return (EReference)developmentMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineeringDomainPackage() {
		return engineeringDomainPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevelopmentMethodPackage() {
		return developmentMethodPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOntologyLinkedElement() {
		return ontologyLinkedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOntologyLinkedElement_Uri() {
		return (EAttribute)ontologyLinkedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactDefinitionPackage() {
		return artifactDefinitionPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_Level() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Context() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactTransformation() {
		return artifactTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactTransformation_Source() {
		return (EReference)artifactTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactTransformation_Target() {
		return (EReference)artifactTransformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactTransformation_TransformationFile() {
		return (EAttribute)artifactTransformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainTaskDefinition() {
		return domainTaskDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainTaskDefinition_Specializes() {
		return (EReference)domainTaskDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainTaskDefinition_Applies() {
		return (EReference)domainTaskDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodTaskDefinition() {
		return methodTaskDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodTaskDefinition_SpecializedBy() {
		return (EReference)methodTaskDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodTaskDefinition_Specializes() {
		return (EReference)methodTaskDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainArtifactDefinition() {
		return domainArtifactDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainArtifactDefinition_Specializes() {
		return (EReference)domainArtifactDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainArtifactDefinition_Organized() {
		return (EReference)domainArtifactDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodArtifactDefinition() {
		return methodArtifactDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodArtifactDefinition_SpecializedBy() {
		return (EReference)methodArtifactDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodArtifactDefinition_Specializes() {
		return (EReference)methodArtifactDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainContentPackage() {
		return domainContentPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainContentPackage_RelatedDomain() {
		return (EReference)domainContentPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevelopmentMethodContentPackage() {
		return developmentMethodContentPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentMethodContentPackage_RelatedMethod() {
		return (EReference)developmentMethodContentPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_Level() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageArtifactDefinition() {
		return languageArtifactDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageArtifactDefinition_SpecializedBy() {
		return (EReference)languageArtifactDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageArtifactDefinition_RepresentedBy() {
		return (EReference)languageArtifactDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageTaskDefinition() {
		return languageTaskDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguageTaskDefinition_SpecializedBy() {
		return (EReference)languageTaskDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevelopmentMethodWithLanguageContentPackage() {
		return developmentMethodWithLanguageContentPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentMethodWithLanguageContentPackage_RelatedLanguage() {
		return (EReference)developmentMethodWithLanguageContentPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentMethodWithLanguageContentPackage_RelatedMethod() {
		return (EReference)developmentMethodWithLanguageContentPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentativeLanguage() {
		return representativeLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentativeLanguage_Metamodel() {
		return (EReference)representativeLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentLanguagePackage() {
		return representLanguagePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaModelPackage() {
		return metaModelPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaModel() {
		return metaModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaModel_EPackage() {
		return (EReference)metaModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClassesRelation() {
		return eClassesRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassesRelation_Source() {
		return (EReference)eClassesRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassesRelation_Target() {
		return (EReference)eClassesRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassesRelation_RelationType() {
		return (EAttribute)eClassesRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEReferencesRelation() {
		return eReferencesRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReferencesRelation_Source() {
		return (EReference)eReferencesRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReferencesRelation_Target() {
		return (EReference)eReferencesRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReferencesRelation_RelationType() {
		return (EAttribute)eReferencesRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLevel() {
		return levelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getENamedElementRelationKind() {
		return eNamedElementRelationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IspemFactory getIspemFactory() {
		return (IspemFactory)getEFactoryInstance();
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
		engineeringDomainEClass = createEClass(ENGINEERING_DOMAIN);
		createEReference(engineeringDomainEClass, ENGINEERING_DOMAIN__VIEWPOINTS);
		createEReference(engineeringDomainEClass, ENGINEERING_DOMAIN__DEFINES);
		createEReference(engineeringDomainEClass, ENGINEERING_DOMAIN__REALIZES);

		toolDefinitionEClass = createEClass(TOOL_DEFINITION);
		createEReference(toolDefinitionEClass, TOOL_DEFINITION__SUPPORTED_ENGINERING_DOMAIN);
		createEReference(toolDefinitionEClass, TOOL_DEFINITION__SUPPORTED_REPRESENTATIVE_LANGUAGE);

		viewpointEClass = createEClass(VIEWPOINT);
		createEReference(viewpointEClass, VIEWPOINT__CARACTERIZES);

		taskDefinitionEClass = createEClass(TASK_DEFINITION);

		workProductDefinitionEClass = createEClass(WORK_PRODUCT_DEFINITION);
		createEReference(workProductDefinitionEClass, WORK_PRODUCT_DEFINITION__ROOT_ELEMENT);
		createEReference(workProductDefinitionEClass, WORK_PRODUCT_DEFINITION__USED_REFERENCES);
		createEReference(workProductDefinitionEClass, WORK_PRODUCT_DEFINITION__METAMODEL);

		ispemMethodLibraryEClass = createEClass(ISPEM_METHOD_LIBRARY);

		developmentMethodEClass = createEClass(DEVELOPMENT_METHOD);
		createEReference(developmentMethodEClass, DEVELOPMENT_METHOD__SUPPORTS);
		createEReference(developmentMethodEClass, DEVELOPMENT_METHOD__DEFINES);

		engineeringDomainPackageEClass = createEClass(ENGINEERING_DOMAIN_PACKAGE);

		developmentMethodPackageEClass = createEClass(DEVELOPMENT_METHOD_PACKAGE);

		ontologyLinkedElementEClass = createEClass(ONTOLOGY_LINKED_ELEMENT);
		createEAttribute(ontologyLinkedElementEClass, ONTOLOGY_LINKED_ELEMENT__URI);

		artifactDefinitionPackageEClass = createEClass(ARTIFACT_DEFINITION_PACKAGE);

		artifactEClass = createEClass(ARTIFACT);
		createEAttribute(artifactEClass, ARTIFACT__LEVEL);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__CONTEXT);

		artifactTransformationEClass = createEClass(ARTIFACT_TRANSFORMATION);
		createEReference(artifactTransformationEClass, ARTIFACT_TRANSFORMATION__SOURCE);
		createEReference(artifactTransformationEClass, ARTIFACT_TRANSFORMATION__TARGET);
		createEAttribute(artifactTransformationEClass, ARTIFACT_TRANSFORMATION__TRANSFORMATION_FILE);

		domainTaskDefinitionEClass = createEClass(DOMAIN_TASK_DEFINITION);
		createEReference(domainTaskDefinitionEClass, DOMAIN_TASK_DEFINITION__SPECIALIZES);
		createEReference(domainTaskDefinitionEClass, DOMAIN_TASK_DEFINITION__APPLIES);

		methodTaskDefinitionEClass = createEClass(METHOD_TASK_DEFINITION);
		createEReference(methodTaskDefinitionEClass, METHOD_TASK_DEFINITION__SPECIALIZED_BY);
		createEReference(methodTaskDefinitionEClass, METHOD_TASK_DEFINITION__SPECIALIZES);

		domainArtifactDefinitionEClass = createEClass(DOMAIN_ARTIFACT_DEFINITION);
		createEReference(domainArtifactDefinitionEClass, DOMAIN_ARTIFACT_DEFINITION__SPECIALIZES);
		createEReference(domainArtifactDefinitionEClass, DOMAIN_ARTIFACT_DEFINITION__ORGANIZED);

		methodArtifactDefinitionEClass = createEClass(METHOD_ARTIFACT_DEFINITION);
		createEReference(methodArtifactDefinitionEClass, METHOD_ARTIFACT_DEFINITION__SPECIALIZED_BY);
		createEReference(methodArtifactDefinitionEClass, METHOD_ARTIFACT_DEFINITION__SPECIALIZES);

		domainContentPackageEClass = createEClass(DOMAIN_CONTENT_PACKAGE);
		createEReference(domainContentPackageEClass, DOMAIN_CONTENT_PACKAGE__RELATED_DOMAIN);

		developmentMethodContentPackageEClass = createEClass(DEVELOPMENT_METHOD_CONTENT_PACKAGE);
		createEReference(developmentMethodContentPackageEClass, DEVELOPMENT_METHOD_CONTENT_PACKAGE__RELATED_METHOD);

		processEClass = createEClass(PROCESS);
		createEAttribute(processEClass, PROCESS__LEVEL);

		languageArtifactDefinitionEClass = createEClass(LANGUAGE_ARTIFACT_DEFINITION);
		createEReference(languageArtifactDefinitionEClass, LANGUAGE_ARTIFACT_DEFINITION__SPECIALIZED_BY);
		createEReference(languageArtifactDefinitionEClass, LANGUAGE_ARTIFACT_DEFINITION__REPRESENTED_BY);

		languageTaskDefinitionEClass = createEClass(LANGUAGE_TASK_DEFINITION);
		createEReference(languageTaskDefinitionEClass, LANGUAGE_TASK_DEFINITION__SPECIALIZED_BY);

		developmentMethodWithLanguageContentPackageEClass = createEClass(DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE);
		createEReference(developmentMethodWithLanguageContentPackageEClass, DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__RELATED_LANGUAGE);
		createEReference(developmentMethodWithLanguageContentPackageEClass, DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__RELATED_METHOD);

		representativeLanguageEClass = createEClass(REPRESENTATIVE_LANGUAGE);
		createEReference(representativeLanguageEClass, REPRESENTATIVE_LANGUAGE__METAMODEL);

		representLanguagePackageEClass = createEClass(REPRESENT_LANGUAGE_PACKAGE);

		metaModelPackageEClass = createEClass(META_MODEL_PACKAGE);

		metaModelEClass = createEClass(META_MODEL);
		createEReference(metaModelEClass, META_MODEL__EPACKAGE);

		eClassesRelationEClass = createEClass(ECLASSES_RELATION);
		createEReference(eClassesRelationEClass, ECLASSES_RELATION__SOURCE);
		createEReference(eClassesRelationEClass, ECLASSES_RELATION__TARGET);
		createEAttribute(eClassesRelationEClass, ECLASSES_RELATION__RELATION_TYPE);

		eReferencesRelationEClass = createEClass(EREFERENCES_RELATION);
		createEReference(eReferencesRelationEClass, EREFERENCES_RELATION__SOURCE);
		createEReference(eReferencesRelationEClass, EREFERENCES_RELATION__TARGET);
		createEAttribute(eReferencesRelationEClass, EREFERENCES_RELATION__RELATION_TYPE);

		artifactDefinitionEClass = createEClass(ARTIFACT_DEFINITION);

		// Create enums
		levelEEnum = createEEnum(LEVEL);
		eNamedElementRelationKindEEnum = createEEnum(ENAMED_ELEMENT_RELATION_KIND);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		UmaPackage theUmaPackage = (UmaPackage)EPackage.Registry.INSTANCE.getEPackage(UmaPackage.eNS_URI);

		// Add supertypes to classes
		engineeringDomainEClass.getESuperTypes().add(this.getOntologyLinkedElement());
		engineeringDomainEClass.getESuperTypes().add(theSpemPackage.getMethodContentElement());
		toolDefinitionEClass.getESuperTypes().add(theSpemPackage.getToolDefinition());
		toolDefinitionEClass.getESuperTypes().add(this.getOntologyLinkedElement());
		viewpointEClass.getESuperTypes().add(this.getOntologyLinkedElement());
		viewpointEClass.getESuperTypes().add(theSpemPackage.getMethodContentElement());
		taskDefinitionEClass.getESuperTypes().add(this.getOntologyLinkedElement());
		taskDefinitionEClass.getESuperTypes().add(theSpemPackage.getTaskDefinition());
		workProductDefinitionEClass.getESuperTypes().add(this.getOntologyLinkedElement());
		workProductDefinitionEClass.getESuperTypes().add(theSpemPackage.getWorkProductDefinition());
		ispemMethodLibraryEClass.getESuperTypes().add(theSpemPackage.getMethodLibrary());
		developmentMethodEClass.getESuperTypes().add(this.getOntologyLinkedElement());
		developmentMethodEClass.getESuperTypes().add(theSpemPackage.getCategory());
		engineeringDomainPackageEClass.getESuperTypes().add(theSpemPackage.getMethodContentPackage());
		developmentMethodPackageEClass.getESuperTypes().add(theUmaPackage.getCategoryPackage());
		ontologyLinkedElementEClass.getESuperTypes().add(theSpemPackage.getDescribableElement());
		artifactDefinitionPackageEClass.getESuperTypes().add(theUmaPackage.getWorkProductDefinitionPackage());
		artifactEClass.getESuperTypes().add(theUmaPackage.getArtifact());
		artifactEClass.getESuperTypes().add(this.getOntologyLinkedElement());
		artifactEClass.getESuperTypes().add(theSpemPackage.getWorkProductUse());
		activityEClass.getESuperTypes().add(theSpemPackage.getActivity());
		activityEClass.getESuperTypes().add(this.getOntologyLinkedElement());
		artifactTransformationEClass.getESuperTypes().add(theSpemPackage.getBreakdownElement());
		artifactTransformationEClass.getESuperTypes().add(this.getOntologyLinkedElement());
		domainTaskDefinitionEClass.getESuperTypes().add(this.getTaskDefinition());
		methodTaskDefinitionEClass.getESuperTypes().add(this.getTaskDefinition());
		domainArtifactDefinitionEClass.getESuperTypes().add(this.getArtifactDefinition());
		methodArtifactDefinitionEClass.getESuperTypes().add(this.getArtifactDefinition());
		domainContentPackageEClass.getESuperTypes().add(theSpemPackage.getMethodContentPackage());
		developmentMethodContentPackageEClass.getESuperTypes().add(theSpemPackage.getMethodContentPackage());
		processEClass.getESuperTypes().add(theUmaPackage.getCapabilityPattern());
		languageArtifactDefinitionEClass.getESuperTypes().add(this.getArtifactDefinition());
		languageTaskDefinitionEClass.getESuperTypes().add(this.getTaskDefinition());
		developmentMethodWithLanguageContentPackageEClass.getESuperTypes().add(theSpemPackage.getMethodContentPackage());
		representativeLanguageEClass.getESuperTypes().add(theSpemPackage.getCategory());
		representativeLanguageEClass.getESuperTypes().add(this.getOntologyLinkedElement());
		representLanguagePackageEClass.getESuperTypes().add(theUmaPackage.getCategoryPackage());
		metaModelPackageEClass.getESuperTypes().add(theSpemPackage.getMethodContentPackage());
		metaModelEClass.getESuperTypes().add(theSpemPackage.getMethodContentElement());
		eClassesRelationEClass.getESuperTypes().add(theSpemPackage.getMethodContentElement());
		eReferencesRelationEClass.getESuperTypes().add(theSpemPackage.getMethodContentElement());
		artifactDefinitionEClass.getESuperTypes().add(this.getWorkProductDefinition());

		// Initialize classes and features; add operations and parameters
		initEClass(engineeringDomainEClass, EngineeringDomain.class, "EngineeringDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEngineeringDomain_Viewpoints(), this.getViewpoint(), null, "viewpoints", null, 0, -1, EngineeringDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineeringDomain_Defines(), this.getDomainTaskDefinition(), null, "defines", null, 0, -1, EngineeringDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineeringDomain_Realizes(), this.getDevelopmentMethod(), null, "realizes", null, 0, -1, EngineeringDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolDefinitionEClass, ToolDefinition.class, "ToolDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToolDefinition_SupportedEngineringDomain(), this.getEngineeringDomain(), null, "supportedEngineringDomain", null, 1, -1, ToolDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolDefinition_SupportedRepresentativeLanguage(), this.getRepresentativeLanguage(), null, "supportedRepresentativeLanguage", null, 0, -1, ToolDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewpointEClass, Viewpoint.class, "Viewpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewpoint_Caracterizes(), this.getDomainArtifactDefinition(), this.getDomainArtifactDefinition_Organized(), "caracterizes", null, 0, -1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskDefinitionEClass, TaskDefinition.class, "TaskDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workProductDefinitionEClass, WorkProductDefinition.class, "WorkProductDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkProductDefinition_RootElement(), theEcorePackage.getEClass(), null, "rootElement", null, 0, 1, WorkProductDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkProductDefinition_UsedReferences(), theEcorePackage.getEReference(), null, "usedReferences", null, 0, -1, WorkProductDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkProductDefinition_Metamodel(), this.getMetaModel(), null, "metamodel", null, 0, 1, WorkProductDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ispemMethodLibraryEClass, ISPEMMethodLibrary.class, "ISPEMMethodLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(developmentMethodEClass, DevelopmentMethod.class, "DevelopmentMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevelopmentMethod_Supports(), this.getViewpoint(), null, "supports", null, 0, -1, DevelopmentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevelopmentMethod_Defines(), this.getMethodTaskDefinition(), null, "defines", null, 0, 1, DevelopmentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(engineeringDomainPackageEClass, EngineeringDomainPackage.class, "EngineeringDomainPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(developmentMethodPackageEClass, DevelopmentMethodPackage.class, "DevelopmentMethodPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ontologyLinkedElementEClass, OntologyLinkedElement.class, "OntologyLinkedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologyLinkedElement_Uri(), ecorePackage.getEString(), "uri", "http://www.example.org", 0, 1, OntologyLinkedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactDefinitionPackageEClass, ArtifactDefinitionPackage.class, "ArtifactDefinitionPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifact_Level(), this.getLevel(), "level", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Context(), this.getEngineeringDomain(), null, "context", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactTransformationEClass, ArtifactTransformation.class, "ArtifactTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifactTransformation_Source(), this.getArtifact(), null, "source", null, 0, 1, ArtifactTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifactTransformation_Target(), this.getArtifact(), null, "target", null, 0, 1, ArtifactTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifactTransformation_TransformationFile(), ecorePackage.getEString(), "TransformationFile", null, 0, 1, ArtifactTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainTaskDefinitionEClass, DomainTaskDefinition.class, "DomainTaskDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainTaskDefinition_Specializes(), this.getMethodTaskDefinition(), this.getMethodTaskDefinition_SpecializedBy(), "specializes", null, 0, -1, DomainTaskDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainTaskDefinition_Applies(), this.getViewpoint(), null, "applies", null, 0, -1, DomainTaskDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodTaskDefinitionEClass, MethodTaskDefinition.class, "MethodTaskDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodTaskDefinition_SpecializedBy(), this.getDomainTaskDefinition(), this.getDomainTaskDefinition_Specializes(), "specializedBy", null, 0, 1, MethodTaskDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodTaskDefinition_Specializes(), this.getLanguageTaskDefinition(), this.getLanguageTaskDefinition_SpecializedBy(), "specializes", null, 0, -1, MethodTaskDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainArtifactDefinitionEClass, DomainArtifactDefinition.class, "DomainArtifactDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainArtifactDefinition_Specializes(), this.getMethodArtifactDefinition(), this.getMethodArtifactDefinition_SpecializedBy(), "specializes", null, 0, -1, DomainArtifactDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainArtifactDefinition_Organized(), this.getViewpoint(), this.getViewpoint_Caracterizes(), "organized", null, 0, -1, DomainArtifactDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodArtifactDefinitionEClass, MethodArtifactDefinition.class, "MethodArtifactDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodArtifactDefinition_SpecializedBy(), this.getDomainArtifactDefinition(), this.getDomainArtifactDefinition_Specializes(), "specializedBy", null, 0, 1, MethodArtifactDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodArtifactDefinition_Specializes(), this.getLanguageArtifactDefinition(), this.getLanguageArtifactDefinition_SpecializedBy(), "specializes", null, 0, -1, MethodArtifactDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainContentPackageEClass, DomainContentPackage.class, "DomainContentPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainContentPackage_RelatedDomain(), this.getEngineeringDomain(), null, "relatedDomain", null, 0, 1, DomainContentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(developmentMethodContentPackageEClass, DevelopmentMethodContentPackage.class, "DevelopmentMethodContentPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevelopmentMethodContentPackage_RelatedMethod(), this.getDevelopmentMethod(), null, "relatedMethod", null, 0, 1, DevelopmentMethodContentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, org.topcased.ispem.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcess_Level(), this.getLevel(), "level", null, 0, 1, org.topcased.ispem.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageArtifactDefinitionEClass, LanguageArtifactDefinition.class, "LanguageArtifactDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLanguageArtifactDefinition_SpecializedBy(), this.getMethodArtifactDefinition(), this.getMethodArtifactDefinition_Specializes(), "specializedBy", null, 0, 1, LanguageArtifactDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguageArtifactDefinition_RepresentedBy(), this.getRepresentativeLanguage(), null, "representedBy", null, 0, 1, LanguageArtifactDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageTaskDefinitionEClass, LanguageTaskDefinition.class, "LanguageTaskDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLanguageTaskDefinition_SpecializedBy(), this.getMethodTaskDefinition(), this.getMethodTaskDefinition_Specializes(), "specializedBy", null, 0, 1, LanguageTaskDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(developmentMethodWithLanguageContentPackageEClass, DevelopmentMethodWithLanguageContentPackage.class, "DevelopmentMethodWithLanguageContentPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevelopmentMethodWithLanguageContentPackage_RelatedLanguage(), this.getRepresentativeLanguage(), null, "relatedLanguage", null, 0, 1, DevelopmentMethodWithLanguageContentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevelopmentMethodWithLanguageContentPackage_RelatedMethod(), this.getDevelopmentMethod(), null, "relatedMethod", null, 0, 1, DevelopmentMethodWithLanguageContentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representativeLanguageEClass, RepresentativeLanguage.class, "RepresentativeLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepresentativeLanguage_Metamodel(), this.getMetaModel(), null, "metamodel", null, 0, 1, RepresentativeLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representLanguagePackageEClass, RepresentLanguagePackage.class, "RepresentLanguagePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metaModelPackageEClass, MetaModelPackage.class, "MetaModelPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metaModelEClass, MetaModel.class, "MetaModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetaModel_EPackage(), theEcorePackage.getEPackage(), null, "ePackage", null, 0, 1, MetaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassesRelationEClass, EClassesRelation.class, "EClassesRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEClassesRelation_Source(), theEcorePackage.getEClass(), null, "source", null, 0, 1, EClassesRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClassesRelation_Target(), theEcorePackage.getEClass(), null, "target", null, 0, 1, EClassesRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassesRelation_RelationType(), this.getENamedElementRelationKind(), "relationType", null, 0, 1, EClassesRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eReferencesRelationEClass, EReferencesRelation.class, "EReferencesRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEReferencesRelation_Source(), theEcorePackage.getEReference(), null, "source", null, 0, 1, EReferencesRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEReferencesRelation_Target(), theEcorePackage.getEReference(), null, "target", null, 0, 1, EReferencesRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEReferencesRelation_RelationType(), this.getENamedElementRelationKind(), "relationType", null, 0, 1, EReferencesRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactDefinitionEClass, ArtifactDefinition.class, "ArtifactDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(levelEEnum, Level.class, "Level");
		addEEnumLiteral(levelEEnum, Level.METHOD_LITERAL);
		addEEnumLiteral(levelEEnum, Level.DOMAIN_LITERAL);
		addEEnumLiteral(levelEEnum, Level.LANGUAGE_LITERAL);

		initEEnum(eNamedElementRelationKindEEnum, ENamedElementRelationKind.class, "ENamedElementRelationKind");
		addEEnumLiteral(eNamedElementRelationKindEEnum, ENamedElementRelationKind.SPECIALIZATION_LITERAL);
		addEEnumLiteral(eNamedElementRelationKindEEnum, ENamedElementRelationKind.REPRESENTATION_LITERAL);
		addEEnumLiteral(eNamedElementRelationKindEEnum, ENamedElementRelationKind.CORRESPONDENCE_LITERAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Constraint
		createConstraintAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Constraint</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintAnnotations() {
		String source = "Constraint";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "TaskDefinition_ArtifactDefinition", "One task definition must be related with artifact definitions having the respective level (Domain or Method)",
			 "Artifact_ArtifactDefinition", "One artifact must use one artifact definition with respective level (domain or method)"
		   });
	}

} //IspemPackageImpl
