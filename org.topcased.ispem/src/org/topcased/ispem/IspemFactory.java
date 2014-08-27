/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.topcased.ispem.IspemPackage
 * @generated
 */
public interface IspemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IspemFactory eINSTANCE = org.topcased.ispem.impl.IspemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Engineering Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Engineering Domain</em>'.
	 * @generated
	 */
	EngineeringDomain createEngineeringDomain();

	/**
	 * Returns a new object of class '<em>Tool Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Definition</em>'.
	 * @generated
	 */
	ToolDefinition createToolDefinition();

	/**
	 * Returns a new object of class '<em>Viewpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Viewpoint</em>'.
	 * @generated
	 */
	Viewpoint createViewpoint();

	/**
	 * Returns a new object of class '<em>Task Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Definition</em>'.
	 * @generated
	 */
	TaskDefinition createTaskDefinition();

	/**
	 * Returns a new object of class '<em>Work Product Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Product Definition</em>'.
	 * @generated
	 */
	WorkProductDefinition createWorkProductDefinition();

	/**
	 * Returns a new object of class '<em>ISPEM Method Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ISPEM Method Library</em>'.
	 * @generated
	 */
	ISPEMMethodLibrary createISPEMMethodLibrary();

	/**
	 * Returns a new object of class '<em>Artifact Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact Definition</em>'.
	 * @generated
	 */
	ArtifactDefinition createArtifactDefinition();

	/**
	 * Returns a new object of class '<em>Development Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Development Method</em>'.
	 * @generated
	 */
	DevelopmentMethod createDevelopmentMethod();

	/**
	 * Returns a new object of class '<em>Engineering Domain Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Engineering Domain Package</em>'.
	 * @generated
	 */
	EngineeringDomainPackage createEngineeringDomainPackage();

	/**
	 * Returns a new object of class '<em>Development Method Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Development Method Package</em>'.
	 * @generated
	 */
	DevelopmentMethodPackage createDevelopmentMethodPackage();

	/**
	 * Returns a new object of class '<em>Ontology Linked Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ontology Linked Element</em>'.
	 * @generated
	 */
	OntologyLinkedElement createOntologyLinkedElement();

	/**
	 * Returns a new object of class '<em>Artifact Definition Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact Definition Package</em>'.
	 * @generated
	 */
	ArtifactDefinitionPackage createArtifactDefinitionPackage();

	/**
	 * Returns a new object of class '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact</em>'.
	 * @generated
	 */
	Artifact createArtifact();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Artifact Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact Transformation</em>'.
	 * @generated
	 */
	ArtifactTransformation createArtifactTransformation();

	/**
	 * Returns a new object of class '<em>Domain Task Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Task Definition</em>'.
	 * @generated
	 */
	DomainTaskDefinition createDomainTaskDefinition();

	/**
	 * Returns a new object of class '<em>Method Task Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Task Definition</em>'.
	 * @generated
	 */
	MethodTaskDefinition createMethodTaskDefinition();

	/**
	 * Returns a new object of class '<em>Domain Artifact Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Artifact Definition</em>'.
	 * @generated
	 */
	DomainArtifactDefinition createDomainArtifactDefinition();

	/**
	 * Returns a new object of class '<em>Method Artifact Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Artifact Definition</em>'.
	 * @generated
	 */
	MethodArtifactDefinition createMethodArtifactDefinition();

	/**
	 * Returns a new object of class '<em>Domain Content Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Content Package</em>'.
	 * @generated
	 */
	DomainContentPackage createDomainContentPackage();

	/**
	 * Returns a new object of class '<em>Development Method Content Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Development Method Content Package</em>'.
	 * @generated
	 */
	DevelopmentMethodContentPackage createDevelopmentMethodContentPackage();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	Process createProcess();

	/**
	 * Returns a new object of class '<em>Language Artifact Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Artifact Definition</em>'.
	 * @generated
	 */
	LanguageArtifactDefinition createLanguageArtifactDefinition();

	/**
	 * Returns a new object of class '<em>Language Task Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Task Definition</em>'.
	 * @generated
	 */
	LanguageTaskDefinition createLanguageTaskDefinition();

	/**
	 * Returns a new object of class '<em>Development Method With Language Content Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Development Method With Language Content Package</em>'.
	 * @generated
	 */
	DevelopmentMethodWithLanguageContentPackage createDevelopmentMethodWithLanguageContentPackage();

	/**
	 * Returns a new object of class '<em>Representative Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Representative Language</em>'.
	 * @generated
	 */
	RepresentativeLanguage createRepresentativeLanguage();

	/**
	 * Returns a new object of class '<em>Represent Language Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Represent Language Package</em>'.
	 * @generated
	 */
	RepresentLanguagePackage createRepresentLanguagePackage();

	/**
	 * Returns a new object of class '<em>Meta Model Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Model Package</em>'.
	 * @generated
	 */
	MetaModelPackage createMetaModelPackage();

	/**
	 * Returns a new object of class '<em>Meta Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Model</em>'.
	 * @generated
	 */
	MetaModel createMetaModel();

	/**
	 * Returns a new object of class '<em>EClasses Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EClasses Relation</em>'.
	 * @generated
	 */
	EClassesRelation createEClassesRelation();

	/**
	 * Returns a new object of class '<em>EReferences Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EReferences Relation</em>'.
	 * @generated
	 */
	EReferencesRelation createEReferencesRelation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IspemPackage getIspemPackage();

} //IspemFactory
