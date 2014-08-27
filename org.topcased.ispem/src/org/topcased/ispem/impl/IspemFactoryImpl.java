/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import org.topcased.ispem.ISPEM;
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
import org.topcased.spem.uma.UmaFactory;
import org.topcased.spem.uma.impl.UmaFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IspemFactoryImpl extends EFactoryImpl implements IspemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IspemFactory init() {
		try {
			IspemFactory theIspemFactory = (IspemFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.topcased.org/ispem"); 
			if (theIspemFactory != null) {
				return theIspemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IspemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IspemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IspemPackage.ENGINEERING_DOMAIN: return createEngineeringDomain();
			case IspemPackage.TOOL_DEFINITION: return createToolDefinition();
			case IspemPackage.VIEWPOINT: return createViewpoint();
			case IspemPackage.TASK_DEFINITION: return createTaskDefinition();
			case IspemPackage.WORK_PRODUCT_DEFINITION: return createWorkProductDefinition();
			case IspemPackage.ISPEM_METHOD_LIBRARY: return createISPEMMethodLibrary();
			case IspemPackage.DEVELOPMENT_METHOD: return createDevelopmentMethod();
			case IspemPackage.ENGINEERING_DOMAIN_PACKAGE: return createEngineeringDomainPackage();
			case IspemPackage.DEVELOPMENT_METHOD_PACKAGE: return createDevelopmentMethodPackage();
			case IspemPackage.ONTOLOGY_LINKED_ELEMENT: return createOntologyLinkedElement();
			case IspemPackage.ARTIFACT_DEFINITION_PACKAGE: return createArtifactDefinitionPackage();
			case IspemPackage.ARTIFACT: return createArtifact();
			case IspemPackage.ACTIVITY: return createActivity();
			case IspemPackage.ARTIFACT_TRANSFORMATION: return createArtifactTransformation();
			case IspemPackage.DOMAIN_TASK_DEFINITION: return createDomainTaskDefinition();
			case IspemPackage.METHOD_TASK_DEFINITION: return createMethodTaskDefinition();
			case IspemPackage.DOMAIN_ARTIFACT_DEFINITION: return createDomainArtifactDefinition();
			case IspemPackage.METHOD_ARTIFACT_DEFINITION: return createMethodArtifactDefinition();
			case IspemPackage.DOMAIN_CONTENT_PACKAGE: return createDomainContentPackage();
			case IspemPackage.DEVELOPMENT_METHOD_CONTENT_PACKAGE: return createDevelopmentMethodContentPackage();
			case IspemPackage.PROCESS: return createProcess();
			case IspemPackage.LANGUAGE_ARTIFACT_DEFINITION: return createLanguageArtifactDefinition();
			case IspemPackage.LANGUAGE_TASK_DEFINITION: return createLanguageTaskDefinition();
			case IspemPackage.DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE: return createDevelopmentMethodWithLanguageContentPackage();
			case IspemPackage.REPRESENTATIVE_LANGUAGE: return createRepresentativeLanguage();
			case IspemPackage.REPRESENT_LANGUAGE_PACKAGE: return createRepresentLanguagePackage();
			case IspemPackage.META_MODEL_PACKAGE: return createMetaModelPackage();
			case IspemPackage.META_MODEL: return createMetaModel();
			case IspemPackage.ECLASSES_RELATION: return createEClassesRelation();
			case IspemPackage.EREFERENCES_RELATION: return createEReferencesRelation();
			case IspemPackage.ARTIFACT_DEFINITION: return createArtifactDefinition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IspemPackage.LEVEL:
				return createLevelFromString(eDataType, initialValue);
			case IspemPackage.ENAMED_ELEMENT_RELATION_KIND:
				return createENamedElementRelationKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IspemPackage.LEVEL:
				return convertLevelToString(eDataType, instanceValue);
			case IspemPackage.ENAMED_ELEMENT_RELATION_KIND:
				return convertENamedElementRelationKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringDomain createEngineeringDomain() {
		EngineeringDomainImpl engineeringDomain = new EngineeringDomainImpl();
		return engineeringDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolDefinition createToolDefinition() {
		ToolDefinitionImpl toolDefinition = new ToolDefinitionImpl();
		return toolDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Viewpoint createViewpoint() {
		ViewpointImpl viewpoint = new ViewpointImpl();
		return viewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDefinition createTaskDefinition() {
		TaskDefinitionImpl taskDefinition = new TaskDefinitionImpl();
		return taskDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinition createWorkProductDefinition() {
		WorkProductDefinitionImpl workProductDefinition = new WorkProductDefinitionImpl();
		return workProductDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISPEMMethodLibrary createISPEMMethodLibrary() {
		ISPEMMethodLibraryImpl ispemMethodLibrary = new ISPEMMethodLibraryImpl();
		return ispemMethodLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactDefinition createArtifactDefinition() {
		ArtifactDefinitionImpl artifactDefinition = new ArtifactDefinitionImpl();
		return artifactDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentMethod createDevelopmentMethod() {
		DevelopmentMethodImpl developmentMethod = new DevelopmentMethodImpl();
		return developmentMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringDomainPackage createEngineeringDomainPackage() {
		EngineeringDomainPackageImpl engineeringDomainPackage = new EngineeringDomainPackageImpl();
		return engineeringDomainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentMethodPackage createDevelopmentMethodPackage() {
		DevelopmentMethodPackageImpl developmentMethodPackage = new DevelopmentMethodPackageImpl();
		return developmentMethodPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologyLinkedElement createOntologyLinkedElement() {
		OntologyLinkedElementImpl ontologyLinkedElement = new OntologyLinkedElementImpl();
		return ontologyLinkedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactDefinitionPackage createArtifactDefinitionPackage() {
		ArtifactDefinitionPackageImpl artifactDefinitionPackage = new ArtifactDefinitionPackageImpl();
		return artifactDefinitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactTransformation createArtifactTransformation() {
		ArtifactTransformationImpl artifactTransformation = new ArtifactTransformationImpl();
		return artifactTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainTaskDefinition createDomainTaskDefinition() {
		DomainTaskDefinitionImpl domainTaskDefinition = new DomainTaskDefinitionImpl();
		return domainTaskDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodTaskDefinition createMethodTaskDefinition() {
		MethodTaskDefinitionImpl methodTaskDefinition = new MethodTaskDefinitionImpl();
		return methodTaskDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainArtifactDefinition createDomainArtifactDefinition() {
		DomainArtifactDefinitionImpl domainArtifactDefinition = new DomainArtifactDefinitionImpl();
		return domainArtifactDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodArtifactDefinition createMethodArtifactDefinition() {
		MethodArtifactDefinitionImpl methodArtifactDefinition = new MethodArtifactDefinitionImpl();
		return methodArtifactDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainContentPackage createDomainContentPackage() {
		DomainContentPackageImpl domainContentPackage = new DomainContentPackageImpl();
		
		return domainContentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentMethodContentPackage createDevelopmentMethodContentPackage() {
		DevelopmentMethodContentPackageImpl developmentMethodContentPackage = new DevelopmentMethodContentPackageImpl();
		
		return developmentMethodContentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.topcased.ispem.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageArtifactDefinition createLanguageArtifactDefinition() {
		LanguageArtifactDefinitionImpl languageArtifactDefinition = new LanguageArtifactDefinitionImpl();
		return languageArtifactDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageTaskDefinition createLanguageTaskDefinition() {
		LanguageTaskDefinitionImpl languageTaskDefinition = new LanguageTaskDefinitionImpl();
		return languageTaskDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentMethodWithLanguageContentPackage createDevelopmentMethodWithLanguageContentPackage() {
		DevelopmentMethodWithLanguageContentPackageImpl developmentMethodWithLanguageContentPackage = new DevelopmentMethodWithLanguageContentPackageImpl();
		return developmentMethodWithLanguageContentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentativeLanguage createRepresentativeLanguage() {
		RepresentativeLanguageImpl representativeLanguage = new RepresentativeLanguageImpl();
		return representativeLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentLanguagePackage createRepresentLanguagePackage() {
		RepresentLanguagePackageImpl representLanguagePackage = new RepresentLanguagePackageImpl();
		return representLanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelPackage createMetaModelPackage() {
		MetaModelPackageImpl metaModelPackage = new MetaModelPackageImpl();
		return metaModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModel createMetaModel() {
		MetaModelImpl metaModel = new MetaModelImpl();
		return metaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassesRelation createEClassesRelation() {
		EClassesRelationImpl eClassesRelation = new EClassesRelationImpl();
		return eClassesRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReferencesRelation createEReferencesRelation() {
		EReferencesRelationImpl eReferencesRelation = new EReferencesRelationImpl();
		return eReferencesRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level createLevelFromString(EDataType eDataType, String initialValue) {
		Level result = Level.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENamedElementRelationKind createENamedElementRelationKindFromString(EDataType eDataType, String initialValue) {
		ENamedElementRelationKind result = ENamedElementRelationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENamedElementRelationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IspemPackage getIspemPackage() {
		return (IspemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static IspemPackage getPackage() {
		return IspemPackage.eINSTANCE;
	}

} //IspemFactoryImpl
