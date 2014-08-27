/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.topcased.spem.SpemPackage;

import org.topcased.spem.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.topcased.ispem.IspemFactory
 * @model kind="package"
 *        annotation="Constraint TaskDefinition_ArtifactDefinition='One task definition must be related with artifact definitions having the respective level (Domain or Method)' Artifact_ArtifactDefinition='One artifact must use one artifact definition with respective level (domain or method)'"
 * @generated
 */
public interface IspemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ispem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.topcased.org/ispem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ispem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IspemPackage eINSTANCE = org.topcased.ispem.impl.IspemPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.OntologyLinkedElementImpl <em>Ontology Linked Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.OntologyLinkedElementImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getOntologyLinkedElement()
	 * @generated
	 */
	int ONTOLOGY_LINKED_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LINKED_ELEMENT__KIND = SpemPackage.DESCRIBABLE_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LINKED_ELEMENT__PRESENTATION_NAME = SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LINKED_ELEMENT__BRIEF_DESCRIPTION = SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LINKED_ELEMENT__MAIN_DESCRIPTION = SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LINKED_ELEMENT__PURPOSE = SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LINKED_ELEMENT__GUIDANCE = SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LINKED_ELEMENT__METRIC = SpemPackage.DESCRIBABLE_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LINKED_ELEMENT__CATEGORY = SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LINKED_ELEMENT__COPYRIGHT = SpemPackage.DESCRIBABLE_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LINKED_ELEMENT__AUTHOR = SpemPackage.DESCRIBABLE_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LINKED_ELEMENT__CHANGE_DATE = SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LINKED_ELEMENT__CHANGE_DESCRIPTION = SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LINKED_ELEMENT__VERSION = SpemPackage.DESCRIBABLE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LINKED_ELEMENT__URI = SpemPackage.DESCRIBABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ontology Linked Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT = SpemPackage.DESCRIBABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.EngineeringDomainImpl <em>Engineering Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.EngineeringDomainImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getEngineeringDomain()
	 * @generated
	 */
	int ENGINEERING_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__KIND = ONTOLOGY_LINKED_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__PRESENTATION_NAME = ONTOLOGY_LINKED_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__BRIEF_DESCRIPTION = ONTOLOGY_LINKED_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__MAIN_DESCRIPTION = ONTOLOGY_LINKED_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__PURPOSE = ONTOLOGY_LINKED_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__GUIDANCE = ONTOLOGY_LINKED_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__METRIC = ONTOLOGY_LINKED_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__CATEGORY = ONTOLOGY_LINKED_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__COPYRIGHT = ONTOLOGY_LINKED_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__AUTHOR = ONTOLOGY_LINKED_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__CHANGE_DATE = ONTOLOGY_LINKED_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__CHANGE_DESCRIPTION = ONTOLOGY_LINKED_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__VERSION = ONTOLOGY_LINKED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__URI = ONTOLOGY_LINKED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__NAME = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__VARIABILITY_TYPE = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__VARIABILITY_BASED_ON_ELEMENT = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__METHOD_CONTENT_KIND = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Viewpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__VIEWPOINTS = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__DEFINES = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN__REALIZES = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Engineering Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN_FEATURE_COUNT = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.ToolDefinitionImpl <em>Tool Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.ToolDefinitionImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getToolDefinition()
	 * @generated
	 */
	int TOOL_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__KIND = SpemPackage.TOOL_DEFINITION__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__PRESENTATION_NAME = SpemPackage.TOOL_DEFINITION__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__BRIEF_DESCRIPTION = SpemPackage.TOOL_DEFINITION__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__MAIN_DESCRIPTION = SpemPackage.TOOL_DEFINITION__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__PURPOSE = SpemPackage.TOOL_DEFINITION__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__GUIDANCE = SpemPackage.TOOL_DEFINITION__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__METRIC = SpemPackage.TOOL_DEFINITION__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__CATEGORY = SpemPackage.TOOL_DEFINITION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__COPYRIGHT = SpemPackage.TOOL_DEFINITION__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__AUTHOR = SpemPackage.TOOL_DEFINITION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__CHANGE_DATE = SpemPackage.TOOL_DEFINITION__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__CHANGE_DESCRIPTION = SpemPackage.TOOL_DEFINITION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__VERSION = SpemPackage.TOOL_DEFINITION__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__NAME = SpemPackage.TOOL_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__VARIABILITY_TYPE = SpemPackage.TOOL_DEFINITION__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.TOOL_DEFINITION__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__METHOD_CONTENT_KIND = SpemPackage.TOOL_DEFINITION__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Managed Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__MANAGED_WORK_PRODUCT = SpemPackage.TOOL_DEFINITION__MANAGED_WORK_PRODUCT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__URI = SpemPackage.TOOL_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supported Enginering Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__SUPPORTED_ENGINERING_DOMAIN = SpemPackage.TOOL_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supported Representative Language</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION__SUPPORTED_REPRESENTATIVE_LANGUAGE = SpemPackage.TOOL_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tool Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_DEFINITION_FEATURE_COUNT = SpemPackage.TOOL_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.ViewpointImpl <em>Viewpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.ViewpointImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getViewpoint()
	 * @generated
	 */
	int VIEWPOINT = 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__KIND = ONTOLOGY_LINKED_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__PRESENTATION_NAME = ONTOLOGY_LINKED_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__BRIEF_DESCRIPTION = ONTOLOGY_LINKED_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__MAIN_DESCRIPTION = ONTOLOGY_LINKED_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__PURPOSE = ONTOLOGY_LINKED_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__GUIDANCE = ONTOLOGY_LINKED_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__METRIC = ONTOLOGY_LINKED_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__CATEGORY = ONTOLOGY_LINKED_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__COPYRIGHT = ONTOLOGY_LINKED_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__AUTHOR = ONTOLOGY_LINKED_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__CHANGE_DATE = ONTOLOGY_LINKED_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__CHANGE_DESCRIPTION = ONTOLOGY_LINKED_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__VERSION = ONTOLOGY_LINKED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__URI = ONTOLOGY_LINKED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__NAME = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__VARIABILITY_TYPE = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__VARIABILITY_BASED_ON_ELEMENT = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__METHOD_CONTENT_KIND = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Caracterizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__CARACTERIZES = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_FEATURE_COUNT = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.TaskDefinitionImpl <em>Task Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.TaskDefinitionImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getTaskDefinition()
	 * @generated
	 */
	int TASK_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__KIND = ONTOLOGY_LINKED_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__PRESENTATION_NAME = ONTOLOGY_LINKED_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__BRIEF_DESCRIPTION = ONTOLOGY_LINKED_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__MAIN_DESCRIPTION = ONTOLOGY_LINKED_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__PURPOSE = ONTOLOGY_LINKED_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__GUIDANCE = ONTOLOGY_LINKED_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__METRIC = ONTOLOGY_LINKED_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__CATEGORY = ONTOLOGY_LINKED_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__COPYRIGHT = ONTOLOGY_LINKED_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__AUTHOR = ONTOLOGY_LINKED_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__CHANGE_DATE = ONTOLOGY_LINKED_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__CHANGE_DESCRIPTION = ONTOLOGY_LINKED_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__VERSION = ONTOLOGY_LINKED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__URI = ONTOLOGY_LINKED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__PRE_CONDITION = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__POST_CONDITION = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__OWNED_PARAMETER = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__NAME = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__VARIABILITY_TYPE = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__METHOD_CONTENT_KIND = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Task Definition Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__STEP = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Required Qualification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__REQUIRED_QUALIFICATION = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Used Tool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__USED_TOOL = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Task Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION_FEATURE_COUNT = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.WorkProductDefinitionImpl <em>Work Product Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.WorkProductDefinitionImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getWorkProductDefinition()
	 * @generated
	 */
	int WORK_PRODUCT_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__KIND = ONTOLOGY_LINKED_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__PRESENTATION_NAME = ONTOLOGY_LINKED_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__BRIEF_DESCRIPTION = ONTOLOGY_LINKED_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__MAIN_DESCRIPTION = ONTOLOGY_LINKED_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__PURPOSE = ONTOLOGY_LINKED_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__GUIDANCE = ONTOLOGY_LINKED_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__METRIC = ONTOLOGY_LINKED_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__CATEGORY = ONTOLOGY_LINKED_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__COPYRIGHT = ONTOLOGY_LINKED_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__AUTHOR = ONTOLOGY_LINKED_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__CHANGE_DATE = ONTOLOGY_LINKED_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__CHANGE_DESCRIPTION = ONTOLOGY_LINKED_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__VERSION = ONTOLOGY_LINKED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__URI = ONTOLOGY_LINKED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__NAME = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__VARIABILITY_TYPE = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__METHOD_CONTENT_KIND = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__ROOT_ELEMENT = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Used References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__USED_REFERENCES = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__METAMODEL = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Work Product Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_FEATURE_COUNT = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.ISPEMMethodLibraryImpl <em>ISPEM Method Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.ISPEMMethodLibraryImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getISPEMMethodLibrary()
	 * @generated
	 */
	int ISPEM_METHOD_LIBRARY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISPEM_METHOD_LIBRARY__NAME = SpemPackage.METHOD_LIBRARY__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Plugin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISPEM_METHOD_LIBRARY__OWNED_METHOD_PLUGIN = SpemPackage.METHOD_LIBRARY__OWNED_METHOD_PLUGIN;

	/**
	 * The feature id for the '<em><b>Predefined Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISPEM_METHOD_LIBRARY__PREDEFINED_CONFIGURATION = SpemPackage.METHOD_LIBRARY__PREDEFINED_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Configuration Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISPEM_METHOD_LIBRARY__CONFIGURATION_PACKAGE = SpemPackage.METHOD_LIBRARY__CONFIGURATION_PACKAGE;

	/**
	 * The number of structural features of the '<em>ISPEM Method Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISPEM_METHOD_LIBRARY_FEATURE_COUNT = SpemPackage.METHOD_LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.ArtifactDefinitionImpl <em>Artifact Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.ArtifactDefinitionImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getArtifactDefinition()
	 * @generated
	 */
	int ARTIFACT_DEFINITION = 30;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.DevelopmentMethodImpl <em>Development Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.DevelopmentMethodImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getDevelopmentMethod()
	 * @generated
	 */
	int DEVELOPMENT_METHOD = 6;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__KIND = ONTOLOGY_LINKED_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__PRESENTATION_NAME = ONTOLOGY_LINKED_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__BRIEF_DESCRIPTION = ONTOLOGY_LINKED_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__MAIN_DESCRIPTION = ONTOLOGY_LINKED_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__PURPOSE = ONTOLOGY_LINKED_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__GUIDANCE = ONTOLOGY_LINKED_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__METRIC = ONTOLOGY_LINKED_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__CATEGORY = ONTOLOGY_LINKED_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__COPYRIGHT = ONTOLOGY_LINKED_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__AUTHOR = ONTOLOGY_LINKED_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__CHANGE_DATE = ONTOLOGY_LINKED_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__CHANGE_DESCRIPTION = ONTOLOGY_LINKED_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__VERSION = ONTOLOGY_LINKED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__URI = ONTOLOGY_LINKED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__NAME = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__VARIABILITY_TYPE = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__VARIABILITY_BASED_ON_ELEMENT = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__METHOD_CONTENT_KIND = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__SUB_CATEGORY = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Categorized Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__CATEGORIZED_ELEMENT = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Supports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__SUPPORTS = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD__DEFINES = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Development Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD_FEATURE_COUNT = ONTOLOGY_LINKED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.EngineeringDomainPackageImpl <em>Engineering Domain Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.EngineeringDomainPackageImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getEngineeringDomainPackage()
	 * @generated
	 */
	int ENGINEERING_DOMAIN_PACKAGE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN_PACKAGE__NAME = SpemPackage.METHOD_CONTENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN_PACKAGE__REUSED_PACKAGE = SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE;

	/**
	 * The number of structural features of the '<em>Engineering Domain Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_DOMAIN_PACKAGE_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.DevelopmentMethodPackageImpl <em>Development Method Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.DevelopmentMethodPackageImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getDevelopmentMethodPackage()
	 * @generated
	 */
	int DEVELOPMENT_METHOD_PACKAGE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD_PACKAGE__NAME = UmaPackage.CATEGORY_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = UmaPackage.CATEGORY_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD_PACKAGE__REUSED_PACKAGE = UmaPackage.CATEGORY_PACKAGE__REUSED_PACKAGE;

	/**
	 * The number of structural features of the '<em>Development Method Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD_PACKAGE_FEATURE_COUNT = UmaPackage.CATEGORY_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.ArtifactDefinitionPackageImpl <em>Artifact Definition Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.ArtifactDefinitionPackageImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getArtifactDefinitionPackage()
	 * @generated
	 */
	int ARTIFACT_DEFINITION_PACKAGE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION_PACKAGE__NAME = UmaPackage.WORK_PRODUCT_DEFINITION_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = UmaPackage.WORK_PRODUCT_DEFINITION_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION_PACKAGE__REUSED_PACKAGE = UmaPackage.WORK_PRODUCT_DEFINITION_PACKAGE__REUSED_PACKAGE;

	/**
	 * The number of structural features of the '<em>Artifact Definition Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION_PACKAGE_FEATURE_COUNT = UmaPackage.WORK_PRODUCT_DEFINITION_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.ArtifactImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 11;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__KIND = UmaPackage.ARTIFACT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PRESENTATION_NAME = UmaPackage.ARTIFACT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__BRIEF_DESCRIPTION = UmaPackage.ARTIFACT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__MAIN_DESCRIPTION = UmaPackage.ARTIFACT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PURPOSE = UmaPackage.ARTIFACT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__GUIDANCE = UmaPackage.ARTIFACT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__METRIC = UmaPackage.ARTIFACT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CATEGORY = UmaPackage.ARTIFACT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__COPYRIGHT = UmaPackage.ARTIFACT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__AUTHOR = UmaPackage.ARTIFACT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CHANGE_DATE = UmaPackage.ARTIFACT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CHANGE_DESCRIPTION = UmaPackage.ARTIFACT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__VERSION = UmaPackage.ARTIFACT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = UmaPackage.ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PROCESS_KIND = UmaPackage.ARTIFACT__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__HAS_MULTIPLE_OCCURRENCES = UmaPackage.ARTIFACT__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__IS_OPTIONAL = UmaPackage.ARTIFACT__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__IS_PLANNED = UmaPackage.ARTIFACT__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PLANNING_DATA = UmaPackage.ARTIFACT__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Synchronized With Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__IS_SYNCHRONIZED_WITH_SOURCE = UmaPackage.ARTIFACT__IS_SYNCHRONIZED_WITH_SOURCE;

	/**
	 * The feature id for the '<em><b>Work Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__WORK_PRODUCT = UmaPackage.ARTIFACT__WORK_PRODUCT;

	/**
	 * The feature id for the '<em><b>Contained Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CONTAINED_ARTIFACT = UmaPackage.ARTIFACT__CONTAINED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__URI = UmaPackage.ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__LEVEL = UmaPackage.ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = UmaPackage.ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.ActivityImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 12;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PRE_CONDITION = SpemPackage.ACTIVITY__PRE_CONDITION;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__POST_CONDITION = SpemPackage.ACTIVITY__POST_CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_PARAMETER = SpemPackage.ACTIVITY__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__KIND = SpemPackage.ACTIVITY__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PRESENTATION_NAME = SpemPackage.ACTIVITY__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__BRIEF_DESCRIPTION = SpemPackage.ACTIVITY__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__MAIN_DESCRIPTION = SpemPackage.ACTIVITY__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PURPOSE = SpemPackage.ACTIVITY__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__GUIDANCE = SpemPackage.ACTIVITY__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__METRIC = SpemPackage.ACTIVITY__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CATEGORY = SpemPackage.ACTIVITY__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__COPYRIGHT = SpemPackage.ACTIVITY__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__AUTHOR = SpemPackage.ACTIVITY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CHANGE_DATE = SpemPackage.ACTIVITY__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CHANGE_DESCRIPTION = SpemPackage.ACTIVITY__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__VERSION = SpemPackage.ACTIVITY__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = SpemPackage.ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PROCESS_KIND = SpemPackage.ACTIVITY__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__HAS_MULTIPLE_OCCURRENCES = SpemPackage.ACTIVITY__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_OPTIONAL = SpemPackage.ACTIVITY__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_PLANNED = SpemPackage.ACTIVITY__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PLANNING_DATA = SpemPackage.ACTIVITY__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_REPEATABLE = SpemPackage.ACTIVITY__IS_REPEATABLE;

	/**
	 * The feature id for the '<em><b>Is Ongoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_ONGOING = SpemPackage.ACTIVITY__IS_ONGOING;

	/**
	 * The feature id for the '<em><b>Is Event Driven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_EVENT_DRIVEN = SpemPackage.ACTIVITY__IS_EVENT_DRIVEN;

	/**
	 * The feature id for the '<em><b>Link To Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LINK_TO_PREDECESSOR = SpemPackage.ACTIVITY__LINK_TO_PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Link To Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LINK_TO_SUCCESSOR = SpemPackage.ACTIVITY__LINK_TO_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__VARIABILITY_TYPE = SpemPackage.ACTIVITY__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.ACTIVITY__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Use Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__USE_KIND = SpemPackage.ACTIVITY__USE_KIND;

	/**
	 * The feature id for the '<em><b>Used Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__USED_ACTIVITY = SpemPackage.ACTIVITY__USED_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Nested Breakdown Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NESTED_BREAKDOWN_ELEMENT = SpemPackage.ACTIVITY__NESTED_BREAKDOWN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Suppressed Breakdown Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SUPPRESSED_BREAKDOWN_ELEMENT = SpemPackage.ACTIVITY__SUPPRESSED_BREAKDOWN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Process Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_PROCESS_PARAMETER = SpemPackage.ACTIVITY__OWNED_PROCESS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Default Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DEFAULT_CONTEXT = SpemPackage.ACTIVITY__DEFAULT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Valid Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__VALID_CONTEXT = SpemPackage.ACTIVITY__VALID_CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Enactable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_ENACTABLE = SpemPackage.ACTIVITY__IS_ENACTABLE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__URI = SpemPackage.ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CONTEXT = SpemPackage.ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = SpemPackage.ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.ArtifactTransformationImpl <em>Artifact Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.ArtifactTransformationImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getArtifactTransformation()
	 * @generated
	 */
	int ARTIFACT_TRANSFORMATION = 13;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__KIND = SpemPackage.BREAKDOWN_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__PRESENTATION_NAME = SpemPackage.BREAKDOWN_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__BRIEF_DESCRIPTION = SpemPackage.BREAKDOWN_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__MAIN_DESCRIPTION = SpemPackage.BREAKDOWN_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__PURPOSE = SpemPackage.BREAKDOWN_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__GUIDANCE = SpemPackage.BREAKDOWN_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__METRIC = SpemPackage.BREAKDOWN_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__CATEGORY = SpemPackage.BREAKDOWN_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__COPYRIGHT = SpemPackage.BREAKDOWN_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__AUTHOR = SpemPackage.BREAKDOWN_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__CHANGE_DATE = SpemPackage.BREAKDOWN_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__CHANGE_DESCRIPTION = SpemPackage.BREAKDOWN_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__VERSION = SpemPackage.BREAKDOWN_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__NAME = SpemPackage.BREAKDOWN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__PROCESS_KIND = SpemPackage.BREAKDOWN_ELEMENT__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__HAS_MULTIPLE_OCCURRENCES = SpemPackage.BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__IS_OPTIONAL = SpemPackage.BREAKDOWN_ELEMENT__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__IS_PLANNED = SpemPackage.BREAKDOWN_ELEMENT__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__PLANNING_DATA = SpemPackage.BREAKDOWN_ELEMENT__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__URI = SpemPackage.BREAKDOWN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__SOURCE = SpemPackage.BREAKDOWN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__TARGET = SpemPackage.BREAKDOWN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformation File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION__TRANSFORMATION_FILE = SpemPackage.BREAKDOWN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Artifact Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TRANSFORMATION_FEATURE_COUNT = SpemPackage.BREAKDOWN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.DomainTaskDefinitionImpl <em>Domain Task Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.DomainTaskDefinitionImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getDomainTaskDefinition()
	 * @generated
	 */
	int DOMAIN_TASK_DEFINITION = 14;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__KIND = TASK_DEFINITION__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__PRESENTATION_NAME = TASK_DEFINITION__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__BRIEF_DESCRIPTION = TASK_DEFINITION__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__MAIN_DESCRIPTION = TASK_DEFINITION__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__PURPOSE = TASK_DEFINITION__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__GUIDANCE = TASK_DEFINITION__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__METRIC = TASK_DEFINITION__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__CATEGORY = TASK_DEFINITION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__COPYRIGHT = TASK_DEFINITION__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__AUTHOR = TASK_DEFINITION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__CHANGE_DATE = TASK_DEFINITION__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__CHANGE_DESCRIPTION = TASK_DEFINITION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__VERSION = TASK_DEFINITION__VERSION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__URI = TASK_DEFINITION__URI;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__PRE_CONDITION = TASK_DEFINITION__PRE_CONDITION;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__POST_CONDITION = TASK_DEFINITION__POST_CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__OWNED_PARAMETER = TASK_DEFINITION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__NAME = TASK_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__VARIABILITY_TYPE = TASK_DEFINITION__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT = TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__METHOD_CONTENT_KIND = TASK_DEFINITION__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Owned Task Definition Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER = TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__STEP = TASK_DEFINITION__STEP;

	/**
	 * The feature id for the '<em><b>Required Qualification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__REQUIRED_QUALIFICATION = TASK_DEFINITION__REQUIRED_QUALIFICATION;

	/**
	 * The feature id for the '<em><b>Used Tool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__USED_TOOL = TASK_DEFINITION__USED_TOOL;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__SPECIALIZES = TASK_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION__APPLIES = TASK_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain Task Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TASK_DEFINITION_FEATURE_COUNT = TASK_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.MethodTaskDefinitionImpl <em>Method Task Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.MethodTaskDefinitionImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getMethodTaskDefinition()
	 * @generated
	 */
	int METHOD_TASK_DEFINITION = 15;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__KIND = TASK_DEFINITION__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__PRESENTATION_NAME = TASK_DEFINITION__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__BRIEF_DESCRIPTION = TASK_DEFINITION__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__MAIN_DESCRIPTION = TASK_DEFINITION__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__PURPOSE = TASK_DEFINITION__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__GUIDANCE = TASK_DEFINITION__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__METRIC = TASK_DEFINITION__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__CATEGORY = TASK_DEFINITION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__COPYRIGHT = TASK_DEFINITION__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__AUTHOR = TASK_DEFINITION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__CHANGE_DATE = TASK_DEFINITION__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__CHANGE_DESCRIPTION = TASK_DEFINITION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__VERSION = TASK_DEFINITION__VERSION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__URI = TASK_DEFINITION__URI;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__PRE_CONDITION = TASK_DEFINITION__PRE_CONDITION;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__POST_CONDITION = TASK_DEFINITION__POST_CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__OWNED_PARAMETER = TASK_DEFINITION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__NAME = TASK_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__VARIABILITY_TYPE = TASK_DEFINITION__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT = TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__METHOD_CONTENT_KIND = TASK_DEFINITION__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Owned Task Definition Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER = TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__STEP = TASK_DEFINITION__STEP;

	/**
	 * The feature id for the '<em><b>Required Qualification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__REQUIRED_QUALIFICATION = TASK_DEFINITION__REQUIRED_QUALIFICATION;

	/**
	 * The feature id for the '<em><b>Used Tool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__USED_TOOL = TASK_DEFINITION__USED_TOOL;

	/**
	 * The feature id for the '<em><b>Specialized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__SPECIALIZED_BY = TASK_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION__SPECIALIZES = TASK_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method Task Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TASK_DEFINITION_FEATURE_COUNT = TASK_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__KIND = WORK_PRODUCT_DEFINITION__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__PRESENTATION_NAME = WORK_PRODUCT_DEFINITION__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__BRIEF_DESCRIPTION = WORK_PRODUCT_DEFINITION__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__MAIN_DESCRIPTION = WORK_PRODUCT_DEFINITION__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__PURPOSE = WORK_PRODUCT_DEFINITION__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__GUIDANCE = WORK_PRODUCT_DEFINITION__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__METRIC = WORK_PRODUCT_DEFINITION__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__CATEGORY = WORK_PRODUCT_DEFINITION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__COPYRIGHT = WORK_PRODUCT_DEFINITION__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__AUTHOR = WORK_PRODUCT_DEFINITION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__CHANGE_DATE = WORK_PRODUCT_DEFINITION__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__CHANGE_DESCRIPTION = WORK_PRODUCT_DEFINITION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__VERSION = WORK_PRODUCT_DEFINITION__VERSION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__URI = WORK_PRODUCT_DEFINITION__URI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__NAME = WORK_PRODUCT_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__VARIABILITY_TYPE = WORK_PRODUCT_DEFINITION__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT = WORK_PRODUCT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__METHOD_CONTENT_KIND = WORK_PRODUCT_DEFINITION__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__ROOT_ELEMENT = WORK_PRODUCT_DEFINITION__ROOT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Used References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__USED_REFERENCES = WORK_PRODUCT_DEFINITION__USED_REFERENCES;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__METAMODEL = WORK_PRODUCT_DEFINITION__METAMODEL;

	/**
	 * The number of structural features of the '<em>Artifact Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION_FEATURE_COUNT = WORK_PRODUCT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.DomainArtifactDefinitionImpl <em>Domain Artifact Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.DomainArtifactDefinitionImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getDomainArtifactDefinition()
	 * @generated
	 */
	int DOMAIN_ARTIFACT_DEFINITION = 16;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__KIND = ARTIFACT_DEFINITION__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__PRESENTATION_NAME = ARTIFACT_DEFINITION__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__BRIEF_DESCRIPTION = ARTIFACT_DEFINITION__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__MAIN_DESCRIPTION = ARTIFACT_DEFINITION__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__PURPOSE = ARTIFACT_DEFINITION__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__GUIDANCE = ARTIFACT_DEFINITION__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__METRIC = ARTIFACT_DEFINITION__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__CATEGORY = ARTIFACT_DEFINITION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__COPYRIGHT = ARTIFACT_DEFINITION__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__AUTHOR = ARTIFACT_DEFINITION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__CHANGE_DATE = ARTIFACT_DEFINITION__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__CHANGE_DESCRIPTION = ARTIFACT_DEFINITION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__VERSION = ARTIFACT_DEFINITION__VERSION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__URI = ARTIFACT_DEFINITION__URI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__NAME = ARTIFACT_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__VARIABILITY_TYPE = ARTIFACT_DEFINITION__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT = ARTIFACT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__METHOD_CONTENT_KIND = ARTIFACT_DEFINITION__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__ROOT_ELEMENT = ARTIFACT_DEFINITION__ROOT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Used References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__USED_REFERENCES = ARTIFACT_DEFINITION__USED_REFERENCES;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__METAMODEL = ARTIFACT_DEFINITION__METAMODEL;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__SPECIALIZES = ARTIFACT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organized</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION__ORGANIZED = ARTIFACT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain Artifact Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_DEFINITION_FEATURE_COUNT = ARTIFACT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.MethodArtifactDefinitionImpl <em>Method Artifact Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.MethodArtifactDefinitionImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getMethodArtifactDefinition()
	 * @generated
	 */
	int METHOD_ARTIFACT_DEFINITION = 17;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__KIND = ARTIFACT_DEFINITION__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__PRESENTATION_NAME = ARTIFACT_DEFINITION__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__BRIEF_DESCRIPTION = ARTIFACT_DEFINITION__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__MAIN_DESCRIPTION = ARTIFACT_DEFINITION__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__PURPOSE = ARTIFACT_DEFINITION__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__GUIDANCE = ARTIFACT_DEFINITION__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__METRIC = ARTIFACT_DEFINITION__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__CATEGORY = ARTIFACT_DEFINITION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__COPYRIGHT = ARTIFACT_DEFINITION__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__AUTHOR = ARTIFACT_DEFINITION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__CHANGE_DATE = ARTIFACT_DEFINITION__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__CHANGE_DESCRIPTION = ARTIFACT_DEFINITION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__VERSION = ARTIFACT_DEFINITION__VERSION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__URI = ARTIFACT_DEFINITION__URI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__NAME = ARTIFACT_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__VARIABILITY_TYPE = ARTIFACT_DEFINITION__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT = ARTIFACT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__METHOD_CONTENT_KIND = ARTIFACT_DEFINITION__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__ROOT_ELEMENT = ARTIFACT_DEFINITION__ROOT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Used References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__USED_REFERENCES = ARTIFACT_DEFINITION__USED_REFERENCES;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__METAMODEL = ARTIFACT_DEFINITION__METAMODEL;

	/**
	 * The feature id for the '<em><b>Specialized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__SPECIALIZED_BY = ARTIFACT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION__SPECIALIZES = ARTIFACT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method Artifact Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ARTIFACT_DEFINITION_FEATURE_COUNT = ARTIFACT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.DomainContentPackageImpl <em>Domain Content Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.DomainContentPackageImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getDomainContentPackage()
	 * @generated
	 */
	int DOMAIN_CONTENT_PACKAGE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONTENT_PACKAGE__NAME = SpemPackage.METHOD_CONTENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONTENT_PACKAGE__REUSED_PACKAGE = SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Related Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONTENT_PACKAGE__RELATED_DOMAIN = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Content Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONTENT_PACKAGE_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.DevelopmentMethodContentPackageImpl <em>Development Method Content Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.DevelopmentMethodContentPackageImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getDevelopmentMethodContentPackage()
	 * @generated
	 */
	int DEVELOPMENT_METHOD_CONTENT_PACKAGE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD_CONTENT_PACKAGE__NAME = SpemPackage.METHOD_CONTENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD_CONTENT_PACKAGE__REUSED_PACKAGE = SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Related Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD_CONTENT_PACKAGE__RELATED_METHOD = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Development Method Content Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD_CONTENT_PACKAGE_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.ProcessImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 20;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PRE_CONDITION = UmaPackage.CAPABILITY_PATTERN__PRE_CONDITION;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__POST_CONDITION = UmaPackage.CAPABILITY_PATTERN__POST_CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OWNED_PARAMETER = UmaPackage.CAPABILITY_PATTERN__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__KIND = UmaPackage.CAPABILITY_PATTERN__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PRESENTATION_NAME = UmaPackage.CAPABILITY_PATTERN__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__BRIEF_DESCRIPTION = UmaPackage.CAPABILITY_PATTERN__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MAIN_DESCRIPTION = UmaPackage.CAPABILITY_PATTERN__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PURPOSE = UmaPackage.CAPABILITY_PATTERN__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__GUIDANCE = UmaPackage.CAPABILITY_PATTERN__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__METRIC = UmaPackage.CAPABILITY_PATTERN__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CATEGORY = UmaPackage.CAPABILITY_PATTERN__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__COPYRIGHT = UmaPackage.CAPABILITY_PATTERN__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__AUTHOR = UmaPackage.CAPABILITY_PATTERN__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CHANGE_DATE = UmaPackage.CAPABILITY_PATTERN__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CHANGE_DESCRIPTION = UmaPackage.CAPABILITY_PATTERN__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VERSION = UmaPackage.CAPABILITY_PATTERN__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = UmaPackage.CAPABILITY_PATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Process Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROCESS_KIND = UmaPackage.CAPABILITY_PATTERN__PROCESS_KIND;

	/**
	 * The feature id for the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__HAS_MULTIPLE_OCCURRENCES = UmaPackage.CAPABILITY_PATTERN__HAS_MULTIPLE_OCCURRENCES;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_OPTIONAL = UmaPackage.CAPABILITY_PATTERN__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_PLANNED = UmaPackage.CAPABILITY_PATTERN__IS_PLANNED;

	/**
	 * The feature id for the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PLANNING_DATA = UmaPackage.CAPABILITY_PATTERN__PLANNING_DATA;

	/**
	 * The feature id for the '<em><b>Is Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_REPEATABLE = UmaPackage.CAPABILITY_PATTERN__IS_REPEATABLE;

	/**
	 * The feature id for the '<em><b>Is Ongoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_ONGOING = UmaPackage.CAPABILITY_PATTERN__IS_ONGOING;

	/**
	 * The feature id for the '<em><b>Is Event Driven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_EVENT_DRIVEN = UmaPackage.CAPABILITY_PATTERN__IS_EVENT_DRIVEN;

	/**
	 * The feature id for the '<em><b>Link To Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__LINK_TO_PREDECESSOR = UmaPackage.CAPABILITY_PATTERN__LINK_TO_PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Link To Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__LINK_TO_SUCCESSOR = UmaPackage.CAPABILITY_PATTERN__LINK_TO_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VARIABILITY_TYPE = UmaPackage.CAPABILITY_PATTERN__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VARIABILITY_BASED_ON_ELEMENT = UmaPackage.CAPABILITY_PATTERN__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Use Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__USE_KIND = UmaPackage.CAPABILITY_PATTERN__USE_KIND;

	/**
	 * The feature id for the '<em><b>Used Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__USED_ACTIVITY = UmaPackage.CAPABILITY_PATTERN__USED_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Nested Breakdown Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NESTED_BREAKDOWN_ELEMENT = UmaPackage.CAPABILITY_PATTERN__NESTED_BREAKDOWN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Suppressed Breakdown Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SUPPRESSED_BREAKDOWN_ELEMENT = UmaPackage.CAPABILITY_PATTERN__SUPPRESSED_BREAKDOWN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Process Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OWNED_PROCESS_PARAMETER = UmaPackage.CAPABILITY_PATTERN__OWNED_PROCESS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Default Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DEFAULT_CONTEXT = UmaPackage.CAPABILITY_PATTERN__DEFAULT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Valid Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VALID_CONTEXT = UmaPackage.CAPABILITY_PATTERN__VALID_CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Enactable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_ENACTABLE = UmaPackage.CAPABILITY_PATTERN__IS_ENACTABLE;

	/**
	 * The feature id for the '<em><b>Included Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INCLUDED_PATTERN = UmaPackage.CAPABILITY_PATTERN__INCLUDED_PATTERN;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SCOPE = UmaPackage.CAPABILITY_PATTERN__SCOPE;

	/**
	 * The feature id for the '<em><b>Usage Note</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__USAGE_NOTE = UmaPackage.CAPABILITY_PATTERN__USAGE_NOTE;

	/**
	 * The feature id for the '<em><b>Included Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INCLUDED_CONNECTOR = UmaPackage.CAPABILITY_PATTERN__INCLUDED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__LEVEL = UmaPackage.CAPABILITY_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = UmaPackage.CAPABILITY_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.LanguageArtifactDefinitionImpl <em>Language Artifact Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.LanguageArtifactDefinitionImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getLanguageArtifactDefinition()
	 * @generated
	 */
	int LANGUAGE_ARTIFACT_DEFINITION = 21;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__KIND = ARTIFACT_DEFINITION__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__PRESENTATION_NAME = ARTIFACT_DEFINITION__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__BRIEF_DESCRIPTION = ARTIFACT_DEFINITION__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__MAIN_DESCRIPTION = ARTIFACT_DEFINITION__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__PURPOSE = ARTIFACT_DEFINITION__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__GUIDANCE = ARTIFACT_DEFINITION__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__METRIC = ARTIFACT_DEFINITION__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__CATEGORY = ARTIFACT_DEFINITION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__COPYRIGHT = ARTIFACT_DEFINITION__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__AUTHOR = ARTIFACT_DEFINITION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__CHANGE_DATE = ARTIFACT_DEFINITION__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__CHANGE_DESCRIPTION = ARTIFACT_DEFINITION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__VERSION = ARTIFACT_DEFINITION__VERSION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__URI = ARTIFACT_DEFINITION__URI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__NAME = ARTIFACT_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__VARIABILITY_TYPE = ARTIFACT_DEFINITION__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT = ARTIFACT_DEFINITION__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__METHOD_CONTENT_KIND = ARTIFACT_DEFINITION__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__ROOT_ELEMENT = ARTIFACT_DEFINITION__ROOT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Used References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__USED_REFERENCES = ARTIFACT_DEFINITION__USED_REFERENCES;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__METAMODEL = ARTIFACT_DEFINITION__METAMODEL;

	/**
	 * The feature id for the '<em><b>Specialized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__SPECIALIZED_BY = ARTIFACT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Represented By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION__REPRESENTED_BY = ARTIFACT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Language Artifact Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ARTIFACT_DEFINITION_FEATURE_COUNT = ARTIFACT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.LanguageTaskDefinitionImpl <em>Language Task Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.LanguageTaskDefinitionImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getLanguageTaskDefinition()
	 * @generated
	 */
	int LANGUAGE_TASK_DEFINITION = 22;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__KIND = TASK_DEFINITION__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__PRESENTATION_NAME = TASK_DEFINITION__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__BRIEF_DESCRIPTION = TASK_DEFINITION__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__MAIN_DESCRIPTION = TASK_DEFINITION__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__PURPOSE = TASK_DEFINITION__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__GUIDANCE = TASK_DEFINITION__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__METRIC = TASK_DEFINITION__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__CATEGORY = TASK_DEFINITION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__COPYRIGHT = TASK_DEFINITION__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__AUTHOR = TASK_DEFINITION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__CHANGE_DATE = TASK_DEFINITION__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__CHANGE_DESCRIPTION = TASK_DEFINITION__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__VERSION = TASK_DEFINITION__VERSION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__URI = TASK_DEFINITION__URI;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__PRE_CONDITION = TASK_DEFINITION__PRE_CONDITION;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__POST_CONDITION = TASK_DEFINITION__POST_CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__OWNED_PARAMETER = TASK_DEFINITION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__NAME = TASK_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__VARIABILITY_TYPE = TASK_DEFINITION__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT = TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__METHOD_CONTENT_KIND = TASK_DEFINITION__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Owned Task Definition Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER = TASK_DEFINITION__OWNED_TASK_DEFINITION_PARAMETER;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__STEP = TASK_DEFINITION__STEP;

	/**
	 * The feature id for the '<em><b>Required Qualification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__REQUIRED_QUALIFICATION = TASK_DEFINITION__REQUIRED_QUALIFICATION;

	/**
	 * The feature id for the '<em><b>Used Tool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__USED_TOOL = TASK_DEFINITION__USED_TOOL;

	/**
	 * The feature id for the '<em><b>Specialized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION__SPECIALIZED_BY = TASK_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Language Task Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TASK_DEFINITION_FEATURE_COUNT = TASK_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.DevelopmentMethodWithLanguageContentPackageImpl <em>Development Method With Language Content Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.DevelopmentMethodWithLanguageContentPackageImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getDevelopmentMethodWithLanguageContentPackage()
	 * @generated
	 */
	int DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__NAME = SpemPackage.METHOD_CONTENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__REUSED_PACKAGE = SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Related Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__RELATED_LANGUAGE = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Related Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__RELATED_METHOD = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Development Method With Language Content Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.RepresentativeLanguageImpl <em>Representative Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.RepresentativeLanguageImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getRepresentativeLanguage()
	 * @generated
	 */
	int REPRESENTATIVE_LANGUAGE = 24;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__KIND = SpemPackage.CATEGORY__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__PRESENTATION_NAME = SpemPackage.CATEGORY__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__BRIEF_DESCRIPTION = SpemPackage.CATEGORY__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__MAIN_DESCRIPTION = SpemPackage.CATEGORY__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__PURPOSE = SpemPackage.CATEGORY__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__GUIDANCE = SpemPackage.CATEGORY__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__METRIC = SpemPackage.CATEGORY__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__CATEGORY = SpemPackage.CATEGORY__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__COPYRIGHT = SpemPackage.CATEGORY__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__AUTHOR = SpemPackage.CATEGORY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__CHANGE_DATE = SpemPackage.CATEGORY__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__CHANGE_DESCRIPTION = SpemPackage.CATEGORY__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__VERSION = SpemPackage.CATEGORY__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__NAME = SpemPackage.CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__VARIABILITY_TYPE = SpemPackage.CATEGORY__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.CATEGORY__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__METHOD_CONTENT_KIND = SpemPackage.CATEGORY__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Sub Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__SUB_CATEGORY = SpemPackage.CATEGORY__SUB_CATEGORY;

	/**
	 * The feature id for the '<em><b>Categorized Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__CATEGORIZED_ELEMENT = SpemPackage.CATEGORY__CATEGORIZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__URI = SpemPackage.CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE__METAMODEL = SpemPackage.CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Representative Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIVE_LANGUAGE_FEATURE_COUNT = SpemPackage.CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.RepresentLanguagePackageImpl <em>Represent Language Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.RepresentLanguagePackageImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getRepresentLanguagePackage()
	 * @generated
	 */
	int REPRESENT_LANGUAGE_PACKAGE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENT_LANGUAGE_PACKAGE__NAME = UmaPackage.CATEGORY_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENT_LANGUAGE_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = UmaPackage.CATEGORY_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENT_LANGUAGE_PACKAGE__REUSED_PACKAGE = UmaPackage.CATEGORY_PACKAGE__REUSED_PACKAGE;

	/**
	 * The number of structural features of the '<em>Represent Language Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENT_LANGUAGE_PACKAGE_FEATURE_COUNT = UmaPackage.CATEGORY_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.MetaModelPackageImpl <em>Meta Model Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.MetaModelPackageImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getMetaModelPackage()
	 * @generated
	 */
	int META_MODEL_PACKAGE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_PACKAGE__NAME = SpemPackage.METHOD_CONTENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Method Content Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_PACKAGE__OWNED_METHOD_CONTENT_MEMBER = SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER;

	/**
	 * The feature id for the '<em><b>Reused Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_PACKAGE__REUSED_PACKAGE = SpemPackage.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE;

	/**
	 * The number of structural features of the '<em>Meta Model Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_PACKAGE_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.MetaModelImpl <em>Meta Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.MetaModelImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getMetaModel()
	 * @generated
	 */
	int META_MODEL = 27;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__KIND = SpemPackage.METHOD_CONTENT_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__PRESENTATION_NAME = SpemPackage.METHOD_CONTENT_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__BRIEF_DESCRIPTION = SpemPackage.METHOD_CONTENT_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__MAIN_DESCRIPTION = SpemPackage.METHOD_CONTENT_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__PURPOSE = SpemPackage.METHOD_CONTENT_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__GUIDANCE = SpemPackage.METHOD_CONTENT_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__METRIC = SpemPackage.METHOD_CONTENT_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__CATEGORY = SpemPackage.METHOD_CONTENT_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__COPYRIGHT = SpemPackage.METHOD_CONTENT_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__AUTHOR = SpemPackage.METHOD_CONTENT_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__CHANGE_DATE = SpemPackage.METHOD_CONTENT_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__CHANGE_DESCRIPTION = SpemPackage.METHOD_CONTENT_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__VERSION = SpemPackage.METHOD_CONTENT_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__NAME = SpemPackage.METHOD_CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__VARIABILITY_TYPE = SpemPackage.METHOD_CONTENT_ELEMENT__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.METHOD_CONTENT_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__METHOD_CONTENT_KIND = SpemPackage.METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL__EPACKAGE = SpemPackage.METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meta Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.EClassesRelationImpl <em>EClasses Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.EClassesRelationImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getEClassesRelation()
	 * @generated
	 */
	int ECLASSES_RELATION = 28;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__KIND = SpemPackage.METHOD_CONTENT_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__PRESENTATION_NAME = SpemPackage.METHOD_CONTENT_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__BRIEF_DESCRIPTION = SpemPackage.METHOD_CONTENT_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__MAIN_DESCRIPTION = SpemPackage.METHOD_CONTENT_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__PURPOSE = SpemPackage.METHOD_CONTENT_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__GUIDANCE = SpemPackage.METHOD_CONTENT_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__METRIC = SpemPackage.METHOD_CONTENT_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__CATEGORY = SpemPackage.METHOD_CONTENT_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__COPYRIGHT = SpemPackage.METHOD_CONTENT_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__AUTHOR = SpemPackage.METHOD_CONTENT_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__CHANGE_DATE = SpemPackage.METHOD_CONTENT_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__CHANGE_DESCRIPTION = SpemPackage.METHOD_CONTENT_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__VERSION = SpemPackage.METHOD_CONTENT_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__NAME = SpemPackage.METHOD_CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__VARIABILITY_TYPE = SpemPackage.METHOD_CONTENT_ELEMENT__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.METHOD_CONTENT_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__METHOD_CONTENT_KIND = SpemPackage.METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__SOURCE = SpemPackage.METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__TARGET = SpemPackage.METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION__RELATION_TYPE = SpemPackage.METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EClasses Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSES_RELATION_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.impl.EReferencesRelationImpl <em>EReferences Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.impl.EReferencesRelationImpl
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getEReferencesRelation()
	 * @generated
	 */
	int EREFERENCES_RELATION = 29;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__KIND = SpemPackage.METHOD_CONTENT_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__PRESENTATION_NAME = SpemPackage.METHOD_CONTENT_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__BRIEF_DESCRIPTION = SpemPackage.METHOD_CONTENT_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__MAIN_DESCRIPTION = SpemPackage.METHOD_CONTENT_ELEMENT__MAIN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__PURPOSE = SpemPackage.METHOD_CONTENT_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__GUIDANCE = SpemPackage.METHOD_CONTENT_ELEMENT__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__METRIC = SpemPackage.METHOD_CONTENT_ELEMENT__METRIC;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__CATEGORY = SpemPackage.METHOD_CONTENT_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__COPYRIGHT = SpemPackage.METHOD_CONTENT_ELEMENT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__AUTHOR = SpemPackage.METHOD_CONTENT_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__CHANGE_DATE = SpemPackage.METHOD_CONTENT_ELEMENT__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__CHANGE_DESCRIPTION = SpemPackage.METHOD_CONTENT_ELEMENT__CHANGE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__VERSION = SpemPackage.METHOD_CONTENT_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__NAME = SpemPackage.METHOD_CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__VARIABILITY_TYPE = SpemPackage.METHOD_CONTENT_ELEMENT__VARIABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Variability Based On Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__VARIABILITY_BASED_ON_ELEMENT = SpemPackage.METHOD_CONTENT_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;

	/**
	 * The feature id for the '<em><b>Method Content Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__METHOD_CONTENT_KIND = SpemPackage.METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__SOURCE = SpemPackage.METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__TARGET = SpemPackage.METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION__RELATION_TYPE = SpemPackage.METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EReferences Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCES_RELATION_FEATURE_COUNT = SpemPackage.METHOD_CONTENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.Level <em>Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.Level
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 31;

	/**
	 * The meta object id for the '{@link org.topcased.ispem.ENamedElementRelationKind <em>ENamed Element Relation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.ispem.ENamedElementRelationKind
	 * @see org.topcased.ispem.impl.IspemPackageImpl#getENamedElementRelationKind()
	 * @generated
	 */
	int ENAMED_ELEMENT_RELATION_KIND = 32;


	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.EngineeringDomain <em>Engineering Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineering Domain</em>'.
	 * @see org.topcased.ispem.EngineeringDomain
	 * @generated
	 */
	EClass getEngineeringDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link org.topcased.ispem.EngineeringDomain#getViewpoints <em>Viewpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Viewpoints</em>'.
	 * @see org.topcased.ispem.EngineeringDomain#getViewpoints()
	 * @see #getEngineeringDomain()
	 * @generated
	 */
	EReference getEngineeringDomain_Viewpoints();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.ispem.EngineeringDomain#getDefines <em>Defines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Defines</em>'.
	 * @see org.topcased.ispem.EngineeringDomain#getDefines()
	 * @see #getEngineeringDomain()
	 * @generated
	 */
	EReference getEngineeringDomain_Defines();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.ispem.EngineeringDomain#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realizes</em>'.
	 * @see org.topcased.ispem.EngineeringDomain#getRealizes()
	 * @see #getEngineeringDomain()
	 * @generated
	 */
	EReference getEngineeringDomain_Realizes();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.ToolDefinition <em>Tool Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Definition</em>'.
	 * @see org.topcased.ispem.ToolDefinition
	 * @generated
	 */
	EClass getToolDefinition();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.ispem.ToolDefinition#getSupportedEngineringDomain <em>Supported Enginering Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Enginering Domain</em>'.
	 * @see org.topcased.ispem.ToolDefinition#getSupportedEngineringDomain()
	 * @see #getToolDefinition()
	 * @generated
	 */
	EReference getToolDefinition_SupportedEngineringDomain();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.ispem.ToolDefinition#getSupportedRepresentativeLanguage <em>Supported Representative Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Representative Language</em>'.
	 * @see org.topcased.ispem.ToolDefinition#getSupportedRepresentativeLanguage()
	 * @see #getToolDefinition()
	 * @generated
	 */
	EReference getToolDefinition_SupportedRepresentativeLanguage();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.Viewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewpoint</em>'.
	 * @see org.topcased.ispem.Viewpoint
	 * @generated
	 */
	EClass getViewpoint();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.ispem.Viewpoint#getCaracterizes <em>Caracterizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Caracterizes</em>'.
	 * @see org.topcased.ispem.Viewpoint#getCaracterizes()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_Caracterizes();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.TaskDefinition <em>Task Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Definition</em>'.
	 * @see org.topcased.ispem.TaskDefinition
	 * @generated
	 */
	EClass getTaskDefinition();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.WorkProductDefinition <em>Work Product Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product Definition</em>'.
	 * @see org.topcased.ispem.WorkProductDefinition
	 * @generated
	 */
	EClass getWorkProductDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.WorkProductDefinition#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Element</em>'.
	 * @see org.topcased.ispem.WorkProductDefinition#getRootElement()
	 * @see #getWorkProductDefinition()
	 * @generated
	 */
	EReference getWorkProductDefinition_RootElement();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.ispem.WorkProductDefinition#getUsedReferences <em>Used References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used References</em>'.
	 * @see org.topcased.ispem.WorkProductDefinition#getUsedReferences()
	 * @see #getWorkProductDefinition()
	 * @generated
	 */
	EReference getWorkProductDefinition_UsedReferences();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.WorkProductDefinition#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see org.topcased.ispem.WorkProductDefinition#getMetamodel()
	 * @see #getWorkProductDefinition()
	 * @generated
	 */
	EReference getWorkProductDefinition_Metamodel();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.ISPEMMethodLibrary <em>ISPEM Method Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISPEM Method Library</em>'.
	 * @see org.topcased.ispem.ISPEMMethodLibrary
	 * @generated
	 */
	EClass getISPEMMethodLibrary();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.ArtifactDefinition <em>Artifact Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Definition</em>'.
	 * @see org.topcased.ispem.ArtifactDefinition
	 * @generated
	 */
	EClass getArtifactDefinition();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.DevelopmentMethod <em>Development Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Development Method</em>'.
	 * @see org.topcased.ispem.DevelopmentMethod
	 * @generated
	 */
	EClass getDevelopmentMethod();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.ispem.DevelopmentMethod#getSupports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supports</em>'.
	 * @see org.topcased.ispem.DevelopmentMethod#getSupports()
	 * @see #getDevelopmentMethod()
	 * @generated
	 */
	EReference getDevelopmentMethod_Supports();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.DevelopmentMethod#getDefines <em>Defines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defines</em>'.
	 * @see org.topcased.ispem.DevelopmentMethod#getDefines()
	 * @see #getDevelopmentMethod()
	 * @generated
	 */
	EReference getDevelopmentMethod_Defines();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.EngineeringDomainPackage <em>Engineering Domain Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineering Domain Package</em>'.
	 * @see org.topcased.ispem.EngineeringDomainPackage
	 * @generated
	 */
	EClass getEngineeringDomainPackage();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.DevelopmentMethodPackage <em>Development Method Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Development Method Package</em>'.
	 * @see org.topcased.ispem.DevelopmentMethodPackage
	 * @generated
	 */
	EClass getDevelopmentMethodPackage();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.OntologyLinkedElement <em>Ontology Linked Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology Linked Element</em>'.
	 * @see org.topcased.ispem.OntologyLinkedElement
	 * @generated
	 */
	EClass getOntologyLinkedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.ispem.OntologyLinkedElement#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.topcased.ispem.OntologyLinkedElement#getUri()
	 * @see #getOntologyLinkedElement()
	 * @generated
	 */
	EAttribute getOntologyLinkedElement_Uri();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.ArtifactDefinitionPackage <em>Artifact Definition Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Definition Package</em>'.
	 * @see org.topcased.ispem.ArtifactDefinitionPackage
	 * @generated
	 */
	EClass getArtifactDefinitionPackage();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see org.topcased.ispem.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.ispem.Artifact#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.topcased.ispem.Artifact#getLevel()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Level();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.topcased.ispem.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.Activity#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.topcased.ispem.Activity#getContext()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Context();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.ArtifactTransformation <em>Artifact Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Transformation</em>'.
	 * @see org.topcased.ispem.ArtifactTransformation
	 * @generated
	 */
	EClass getArtifactTransformation();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.ArtifactTransformation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.topcased.ispem.ArtifactTransformation#getSource()
	 * @see #getArtifactTransformation()
	 * @generated
	 */
	EReference getArtifactTransformation_Source();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.ArtifactTransformation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.topcased.ispem.ArtifactTransformation#getTarget()
	 * @see #getArtifactTransformation()
	 * @generated
	 */
	EReference getArtifactTransformation_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.ispem.ArtifactTransformation#getTransformationFile <em>Transformation File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation File</em>'.
	 * @see org.topcased.ispem.ArtifactTransformation#getTransformationFile()
	 * @see #getArtifactTransformation()
	 * @generated
	 */
	EAttribute getArtifactTransformation_TransformationFile();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.DomainTaskDefinition <em>Domain Task Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Task Definition</em>'.
	 * @see org.topcased.ispem.DomainTaskDefinition
	 * @generated
	 */
	EClass getDomainTaskDefinition();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.ispem.DomainTaskDefinition#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specializes</em>'.
	 * @see org.topcased.ispem.DomainTaskDefinition#getSpecializes()
	 * @see #getDomainTaskDefinition()
	 * @generated
	 */
	EReference getDomainTaskDefinition_Specializes();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.ispem.DomainTaskDefinition#getApplies <em>Applies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applies</em>'.
	 * @see org.topcased.ispem.DomainTaskDefinition#getApplies()
	 * @see #getDomainTaskDefinition()
	 * @generated
	 */
	EReference getDomainTaskDefinition_Applies();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.MethodTaskDefinition <em>Method Task Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Task Definition</em>'.
	 * @see org.topcased.ispem.MethodTaskDefinition
	 * @generated
	 */
	EClass getMethodTaskDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.MethodTaskDefinition#getSpecializedBy <em>Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specialized By</em>'.
	 * @see org.topcased.ispem.MethodTaskDefinition#getSpecializedBy()
	 * @see #getMethodTaskDefinition()
	 * @generated
	 */
	EReference getMethodTaskDefinition_SpecializedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.ispem.MethodTaskDefinition#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specializes</em>'.
	 * @see org.topcased.ispem.MethodTaskDefinition#getSpecializes()
	 * @see #getMethodTaskDefinition()
	 * @generated
	 */
	EReference getMethodTaskDefinition_Specializes();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.DomainArtifactDefinition <em>Domain Artifact Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Artifact Definition</em>'.
	 * @see org.topcased.ispem.DomainArtifactDefinition
	 * @generated
	 */
	EClass getDomainArtifactDefinition();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.ispem.DomainArtifactDefinition#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specializes</em>'.
	 * @see org.topcased.ispem.DomainArtifactDefinition#getSpecializes()
	 * @see #getDomainArtifactDefinition()
	 * @generated
	 */
	EReference getDomainArtifactDefinition_Specializes();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.ispem.DomainArtifactDefinition#getOrganized <em>Organized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organized</em>'.
	 * @see org.topcased.ispem.DomainArtifactDefinition#getOrganized()
	 * @see #getDomainArtifactDefinition()
	 * @generated
	 */
	EReference getDomainArtifactDefinition_Organized();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.MethodArtifactDefinition <em>Method Artifact Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Artifact Definition</em>'.
	 * @see org.topcased.ispem.MethodArtifactDefinition
	 * @generated
	 */
	EClass getMethodArtifactDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.MethodArtifactDefinition#getSpecializedBy <em>Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specialized By</em>'.
	 * @see org.topcased.ispem.MethodArtifactDefinition#getSpecializedBy()
	 * @see #getMethodArtifactDefinition()
	 * @generated
	 */
	EReference getMethodArtifactDefinition_SpecializedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.ispem.MethodArtifactDefinition#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specializes</em>'.
	 * @see org.topcased.ispem.MethodArtifactDefinition#getSpecializes()
	 * @see #getMethodArtifactDefinition()
	 * @generated
	 */
	EReference getMethodArtifactDefinition_Specializes();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.DomainContentPackage <em>Domain Content Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Content Package</em>'.
	 * @see org.topcased.ispem.DomainContentPackage
	 * @generated
	 */
	EClass getDomainContentPackage();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.DomainContentPackage#getRelatedDomain <em>Related Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Domain</em>'.
	 * @see org.topcased.ispem.DomainContentPackage#getRelatedDomain()
	 * @see #getDomainContentPackage()
	 * @generated
	 */
	EReference getDomainContentPackage_RelatedDomain();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.DevelopmentMethodContentPackage <em>Development Method Content Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Development Method Content Package</em>'.
	 * @see org.topcased.ispem.DevelopmentMethodContentPackage
	 * @generated
	 */
	EClass getDevelopmentMethodContentPackage();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.DevelopmentMethodContentPackage#getRelatedMethod <em>Related Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Method</em>'.
	 * @see org.topcased.ispem.DevelopmentMethodContentPackage#getRelatedMethod()
	 * @see #getDevelopmentMethodContentPackage()
	 * @generated
	 */
	EReference getDevelopmentMethodContentPackage_RelatedMethod();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.topcased.ispem.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.ispem.Process#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.topcased.ispem.Process#getLevel()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Level();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.LanguageArtifactDefinition <em>Language Artifact Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Artifact Definition</em>'.
	 * @see org.topcased.ispem.LanguageArtifactDefinition
	 * @generated
	 */
	EClass getLanguageArtifactDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.LanguageArtifactDefinition#getSpecializedBy <em>Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specialized By</em>'.
	 * @see org.topcased.ispem.LanguageArtifactDefinition#getSpecializedBy()
	 * @see #getLanguageArtifactDefinition()
	 * @generated
	 */
	EReference getLanguageArtifactDefinition_SpecializedBy();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.LanguageArtifactDefinition#getRepresentedBy <em>Represented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represented By</em>'.
	 * @see org.topcased.ispem.LanguageArtifactDefinition#getRepresentedBy()
	 * @see #getLanguageArtifactDefinition()
	 * @generated
	 */
	EReference getLanguageArtifactDefinition_RepresentedBy();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.LanguageTaskDefinition <em>Language Task Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Task Definition</em>'.
	 * @see org.topcased.ispem.LanguageTaskDefinition
	 * @generated
	 */
	EClass getLanguageTaskDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.LanguageTaskDefinition#getSpecializedBy <em>Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specialized By</em>'.
	 * @see org.topcased.ispem.LanguageTaskDefinition#getSpecializedBy()
	 * @see #getLanguageTaskDefinition()
	 * @generated
	 */
	EReference getLanguageTaskDefinition_SpecializedBy();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.DevelopmentMethodWithLanguageContentPackage <em>Development Method With Language Content Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Development Method With Language Content Package</em>'.
	 * @see org.topcased.ispem.DevelopmentMethodWithLanguageContentPackage
	 * @generated
	 */
	EClass getDevelopmentMethodWithLanguageContentPackage();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.DevelopmentMethodWithLanguageContentPackage#getRelatedLanguage <em>Related Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Language</em>'.
	 * @see org.topcased.ispem.DevelopmentMethodWithLanguageContentPackage#getRelatedLanguage()
	 * @see #getDevelopmentMethodWithLanguageContentPackage()
	 * @generated
	 */
	EReference getDevelopmentMethodWithLanguageContentPackage_RelatedLanguage();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.DevelopmentMethodWithLanguageContentPackage#getRelatedMethod <em>Related Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Method</em>'.
	 * @see org.topcased.ispem.DevelopmentMethodWithLanguageContentPackage#getRelatedMethod()
	 * @see #getDevelopmentMethodWithLanguageContentPackage()
	 * @generated
	 */
	EReference getDevelopmentMethodWithLanguageContentPackage_RelatedMethod();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.RepresentativeLanguage <em>Representative Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representative Language</em>'.
	 * @see org.topcased.ispem.RepresentativeLanguage
	 * @generated
	 */
	EClass getRepresentativeLanguage();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.RepresentativeLanguage#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see org.topcased.ispem.RepresentativeLanguage#getMetamodel()
	 * @see #getRepresentativeLanguage()
	 * @generated
	 */
	EReference getRepresentativeLanguage_Metamodel();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.RepresentLanguagePackage <em>Represent Language Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Represent Language Package</em>'.
	 * @see org.topcased.ispem.RepresentLanguagePackage
	 * @generated
	 */
	EClass getRepresentLanguagePackage();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.MetaModelPackage <em>Meta Model Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Model Package</em>'.
	 * @see org.topcased.ispem.MetaModelPackage
	 * @generated
	 */
	EClass getMetaModelPackage();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.MetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Model</em>'.
	 * @see org.topcased.ispem.MetaModel
	 * @generated
	 */
	EClass getMetaModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.topcased.ispem.MetaModel#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EPackage</em>'.
	 * @see org.topcased.ispem.MetaModel#getEPackage()
	 * @see #getMetaModel()
	 * @generated
	 */
	EReference getMetaModel_EPackage();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.EClassesRelation <em>EClasses Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClasses Relation</em>'.
	 * @see org.topcased.ispem.EClassesRelation
	 * @generated
	 */
	EClass getEClassesRelation();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.EClassesRelation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.topcased.ispem.EClassesRelation#getSource()
	 * @see #getEClassesRelation()
	 * @generated
	 */
	EReference getEClassesRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.EClassesRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.topcased.ispem.EClassesRelation#getTarget()
	 * @see #getEClassesRelation()
	 * @generated
	 */
	EReference getEClassesRelation_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.ispem.EClassesRelation#getRelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Type</em>'.
	 * @see org.topcased.ispem.EClassesRelation#getRelationType()
	 * @see #getEClassesRelation()
	 * @generated
	 */
	EAttribute getEClassesRelation_RelationType();

	/**
	 * Returns the meta object for class '{@link org.topcased.ispem.EReferencesRelation <em>EReferences Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReferences Relation</em>'.
	 * @see org.topcased.ispem.EReferencesRelation
	 * @generated
	 */
	EClass getEReferencesRelation();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.EReferencesRelation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.topcased.ispem.EReferencesRelation#getSource()
	 * @see #getEReferencesRelation()
	 * @generated
	 */
	EReference getEReferencesRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.ispem.EReferencesRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.topcased.ispem.EReferencesRelation#getTarget()
	 * @see #getEReferencesRelation()
	 * @generated
	 */
	EReference getEReferencesRelation_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.ispem.EReferencesRelation#getRelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Type</em>'.
	 * @see org.topcased.ispem.EReferencesRelation#getRelationType()
	 * @see #getEReferencesRelation()
	 * @generated
	 */
	EAttribute getEReferencesRelation_RelationType();

	/**
	 * Returns the meta object for enum '{@link org.topcased.ispem.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Level</em>'.
	 * @see org.topcased.ispem.Level
	 * @generated
	 */
	EEnum getLevel();

	/**
	 * Returns the meta object for enum '{@link org.topcased.ispem.ENamedElementRelationKind <em>ENamed Element Relation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENamed Element Relation Kind</em>'.
	 * @see org.topcased.ispem.ENamedElementRelationKind
	 * @generated
	 */
	EEnum getENamedElementRelationKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IspemFactory getIspemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.EngineeringDomainImpl <em>Engineering Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.EngineeringDomainImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getEngineeringDomain()
		 * @generated
		 */
		EClass ENGINEERING_DOMAIN = eINSTANCE.getEngineeringDomain();

		/**
		 * The meta object literal for the '<em><b>Viewpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERING_DOMAIN__VIEWPOINTS = eINSTANCE.getEngineeringDomain_Viewpoints();

		/**
		 * The meta object literal for the '<em><b>Defines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERING_DOMAIN__DEFINES = eINSTANCE.getEngineeringDomain_Defines();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERING_DOMAIN__REALIZES = eINSTANCE.getEngineeringDomain_Realizes();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.ToolDefinitionImpl <em>Tool Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.ToolDefinitionImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getToolDefinition()
		 * @generated
		 */
		EClass TOOL_DEFINITION = eINSTANCE.getToolDefinition();

		/**
		 * The meta object literal for the '<em><b>Supported Enginering Domain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_DEFINITION__SUPPORTED_ENGINERING_DOMAIN = eINSTANCE.getToolDefinition_SupportedEngineringDomain();

		/**
		 * The meta object literal for the '<em><b>Supported Representative Language</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_DEFINITION__SUPPORTED_REPRESENTATIVE_LANGUAGE = eINSTANCE.getToolDefinition_SupportedRepresentativeLanguage();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.ViewpointImpl <em>Viewpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.ViewpointImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getViewpoint()
		 * @generated
		 */
		EClass VIEWPOINT = eINSTANCE.getViewpoint();

		/**
		 * The meta object literal for the '<em><b>Caracterizes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__CARACTERIZES = eINSTANCE.getViewpoint_Caracterizes();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.TaskDefinitionImpl <em>Task Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.TaskDefinitionImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getTaskDefinition()
		 * @generated
		 */
		EClass TASK_DEFINITION = eINSTANCE.getTaskDefinition();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.WorkProductDefinitionImpl <em>Work Product Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.WorkProductDefinitionImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getWorkProductDefinition()
		 * @generated
		 */
		EClass WORK_PRODUCT_DEFINITION = eINSTANCE.getWorkProductDefinition();

		/**
		 * The meta object literal for the '<em><b>Root Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT_DEFINITION__ROOT_ELEMENT = eINSTANCE.getWorkProductDefinition_RootElement();

		/**
		 * The meta object literal for the '<em><b>Used References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT_DEFINITION__USED_REFERENCES = eINSTANCE.getWorkProductDefinition_UsedReferences();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT_DEFINITION__METAMODEL = eINSTANCE.getWorkProductDefinition_Metamodel();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.ISPEMMethodLibraryImpl <em>ISPEM Method Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.ISPEMMethodLibraryImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getISPEMMethodLibrary()
		 * @generated
		 */
		EClass ISPEM_METHOD_LIBRARY = eINSTANCE.getISPEMMethodLibrary();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.ArtifactDefinitionImpl <em>Artifact Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.ArtifactDefinitionImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getArtifactDefinition()
		 * @generated
		 */
		EClass ARTIFACT_DEFINITION = eINSTANCE.getArtifactDefinition();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.DevelopmentMethodImpl <em>Development Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.DevelopmentMethodImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getDevelopmentMethod()
		 * @generated
		 */
		EClass DEVELOPMENT_METHOD = eINSTANCE.getDevelopmentMethod();

		/**
		 * The meta object literal for the '<em><b>Supports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_METHOD__SUPPORTS = eINSTANCE.getDevelopmentMethod_Supports();

		/**
		 * The meta object literal for the '<em><b>Defines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_METHOD__DEFINES = eINSTANCE.getDevelopmentMethod_Defines();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.EngineeringDomainPackageImpl <em>Engineering Domain Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.EngineeringDomainPackageImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getEngineeringDomainPackage()
		 * @generated
		 */
		EClass ENGINEERING_DOMAIN_PACKAGE = eINSTANCE.getEngineeringDomainPackage();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.DevelopmentMethodPackageImpl <em>Development Method Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.DevelopmentMethodPackageImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getDevelopmentMethodPackage()
		 * @generated
		 */
		EClass DEVELOPMENT_METHOD_PACKAGE = eINSTANCE.getDevelopmentMethodPackage();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.OntologyLinkedElementImpl <em>Ontology Linked Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.OntologyLinkedElementImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getOntologyLinkedElement()
		 * @generated
		 */
		EClass ONTOLOGY_LINKED_ELEMENT = eINSTANCE.getOntologyLinkedElement();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY_LINKED_ELEMENT__URI = eINSTANCE.getOntologyLinkedElement_Uri();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.ArtifactDefinitionPackageImpl <em>Artifact Definition Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.ArtifactDefinitionPackageImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getArtifactDefinitionPackage()
		 * @generated
		 */
		EClass ARTIFACT_DEFINITION_PACKAGE = eINSTANCE.getArtifactDefinitionPackage();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.ArtifactImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__LEVEL = eINSTANCE.getArtifact_Level();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.ActivityImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__CONTEXT = eINSTANCE.getActivity_Context();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.ArtifactTransformationImpl <em>Artifact Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.ArtifactTransformationImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getArtifactTransformation()
		 * @generated
		 */
		EClass ARTIFACT_TRANSFORMATION = eINSTANCE.getArtifactTransformation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_TRANSFORMATION__SOURCE = eINSTANCE.getArtifactTransformation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_TRANSFORMATION__TARGET = eINSTANCE.getArtifactTransformation_Target();

		/**
		 * The meta object literal for the '<em><b>Transformation File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_TRANSFORMATION__TRANSFORMATION_FILE = eINSTANCE.getArtifactTransformation_TransformationFile();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.DomainTaskDefinitionImpl <em>Domain Task Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.DomainTaskDefinitionImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getDomainTaskDefinition()
		 * @generated
		 */
		EClass DOMAIN_TASK_DEFINITION = eINSTANCE.getDomainTaskDefinition();

		/**
		 * The meta object literal for the '<em><b>Specializes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_TASK_DEFINITION__SPECIALIZES = eINSTANCE.getDomainTaskDefinition_Specializes();

		/**
		 * The meta object literal for the '<em><b>Applies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_TASK_DEFINITION__APPLIES = eINSTANCE.getDomainTaskDefinition_Applies();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.MethodTaskDefinitionImpl <em>Method Task Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.MethodTaskDefinitionImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getMethodTaskDefinition()
		 * @generated
		 */
		EClass METHOD_TASK_DEFINITION = eINSTANCE.getMethodTaskDefinition();

		/**
		 * The meta object literal for the '<em><b>Specialized By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_TASK_DEFINITION__SPECIALIZED_BY = eINSTANCE.getMethodTaskDefinition_SpecializedBy();

		/**
		 * The meta object literal for the '<em><b>Specializes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_TASK_DEFINITION__SPECIALIZES = eINSTANCE.getMethodTaskDefinition_Specializes();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.DomainArtifactDefinitionImpl <em>Domain Artifact Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.DomainArtifactDefinitionImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getDomainArtifactDefinition()
		 * @generated
		 */
		EClass DOMAIN_ARTIFACT_DEFINITION = eINSTANCE.getDomainArtifactDefinition();

		/**
		 * The meta object literal for the '<em><b>Specializes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ARTIFACT_DEFINITION__SPECIALIZES = eINSTANCE.getDomainArtifactDefinition_Specializes();

		/**
		 * The meta object literal for the '<em><b>Organized</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ARTIFACT_DEFINITION__ORGANIZED = eINSTANCE.getDomainArtifactDefinition_Organized();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.MethodArtifactDefinitionImpl <em>Method Artifact Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.MethodArtifactDefinitionImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getMethodArtifactDefinition()
		 * @generated
		 */
		EClass METHOD_ARTIFACT_DEFINITION = eINSTANCE.getMethodArtifactDefinition();

		/**
		 * The meta object literal for the '<em><b>Specialized By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_ARTIFACT_DEFINITION__SPECIALIZED_BY = eINSTANCE.getMethodArtifactDefinition_SpecializedBy();

		/**
		 * The meta object literal for the '<em><b>Specializes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_ARTIFACT_DEFINITION__SPECIALIZES = eINSTANCE.getMethodArtifactDefinition_Specializes();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.DomainContentPackageImpl <em>Domain Content Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.DomainContentPackageImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getDomainContentPackage()
		 * @generated
		 */
		EClass DOMAIN_CONTENT_PACKAGE = eINSTANCE.getDomainContentPackage();

		/**
		 * The meta object literal for the '<em><b>Related Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_CONTENT_PACKAGE__RELATED_DOMAIN = eINSTANCE.getDomainContentPackage_RelatedDomain();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.DevelopmentMethodContentPackageImpl <em>Development Method Content Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.DevelopmentMethodContentPackageImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getDevelopmentMethodContentPackage()
		 * @generated
		 */
		EClass DEVELOPMENT_METHOD_CONTENT_PACKAGE = eINSTANCE.getDevelopmentMethodContentPackage();

		/**
		 * The meta object literal for the '<em><b>Related Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_METHOD_CONTENT_PACKAGE__RELATED_METHOD = eINSTANCE.getDevelopmentMethodContentPackage_RelatedMethod();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.ProcessImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__LEVEL = eINSTANCE.getProcess_Level();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.LanguageArtifactDefinitionImpl <em>Language Artifact Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.LanguageArtifactDefinitionImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getLanguageArtifactDefinition()
		 * @generated
		 */
		EClass LANGUAGE_ARTIFACT_DEFINITION = eINSTANCE.getLanguageArtifactDefinition();

		/**
		 * The meta object literal for the '<em><b>Specialized By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_ARTIFACT_DEFINITION__SPECIALIZED_BY = eINSTANCE.getLanguageArtifactDefinition_SpecializedBy();

		/**
		 * The meta object literal for the '<em><b>Represented By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_ARTIFACT_DEFINITION__REPRESENTED_BY = eINSTANCE.getLanguageArtifactDefinition_RepresentedBy();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.LanguageTaskDefinitionImpl <em>Language Task Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.LanguageTaskDefinitionImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getLanguageTaskDefinition()
		 * @generated
		 */
		EClass LANGUAGE_TASK_DEFINITION = eINSTANCE.getLanguageTaskDefinition();

		/**
		 * The meta object literal for the '<em><b>Specialized By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_TASK_DEFINITION__SPECIALIZED_BY = eINSTANCE.getLanguageTaskDefinition_SpecializedBy();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.DevelopmentMethodWithLanguageContentPackageImpl <em>Development Method With Language Content Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.DevelopmentMethodWithLanguageContentPackageImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getDevelopmentMethodWithLanguageContentPackage()
		 * @generated
		 */
		EClass DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE = eINSTANCE.getDevelopmentMethodWithLanguageContentPackage();

		/**
		 * The meta object literal for the '<em><b>Related Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__RELATED_LANGUAGE = eINSTANCE.getDevelopmentMethodWithLanguageContentPackage_RelatedLanguage();

		/**
		 * The meta object literal for the '<em><b>Related Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_METHOD_WITH_LANGUAGE_CONTENT_PACKAGE__RELATED_METHOD = eINSTANCE.getDevelopmentMethodWithLanguageContentPackage_RelatedMethod();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.RepresentativeLanguageImpl <em>Representative Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.RepresentativeLanguageImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getRepresentativeLanguage()
		 * @generated
		 */
		EClass REPRESENTATIVE_LANGUAGE = eINSTANCE.getRepresentativeLanguage();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATIVE_LANGUAGE__METAMODEL = eINSTANCE.getRepresentativeLanguage_Metamodel();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.RepresentLanguagePackageImpl <em>Represent Language Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.RepresentLanguagePackageImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getRepresentLanguagePackage()
		 * @generated
		 */
		EClass REPRESENT_LANGUAGE_PACKAGE = eINSTANCE.getRepresentLanguagePackage();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.MetaModelPackageImpl <em>Meta Model Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.MetaModelPackageImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getMetaModelPackage()
		 * @generated
		 */
		EClass META_MODEL_PACKAGE = eINSTANCE.getMetaModelPackage();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.MetaModelImpl <em>Meta Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.MetaModelImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getMetaModel()
		 * @generated
		 */
		EClass META_MODEL = eINSTANCE.getMetaModel();

		/**
		 * The meta object literal for the '<em><b>EPackage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL__EPACKAGE = eINSTANCE.getMetaModel_EPackage();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.EClassesRelationImpl <em>EClasses Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.EClassesRelationImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getEClassesRelation()
		 * @generated
		 */
		EClass ECLASSES_RELATION = eINSTANCE.getEClassesRelation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASSES_RELATION__SOURCE = eINSTANCE.getEClassesRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASSES_RELATION__TARGET = eINSTANCE.getEClassesRelation_Target();

		/**
		 * The meta object literal for the '<em><b>Relation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASSES_RELATION__RELATION_TYPE = eINSTANCE.getEClassesRelation_RelationType();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.impl.EReferencesRelationImpl <em>EReferences Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.impl.EReferencesRelationImpl
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getEReferencesRelation()
		 * @generated
		 */
		EClass EREFERENCES_RELATION = eINSTANCE.getEReferencesRelation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREFERENCES_RELATION__SOURCE = eINSTANCE.getEReferencesRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREFERENCES_RELATION__TARGET = eINSTANCE.getEReferencesRelation_Target();

		/**
		 * The meta object literal for the '<em><b>Relation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCES_RELATION__RELATION_TYPE = eINSTANCE.getEReferencesRelation_RelationType();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.Level <em>Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.Level
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getLevel()
		 * @generated
		 */
		EEnum LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '{@link org.topcased.ispem.ENamedElementRelationKind <em>ENamed Element Relation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.ispem.ENamedElementRelationKind
		 * @see org.topcased.ispem.impl.IspemPackageImpl#getENamedElementRelationKind()
		 * @generated
		 */
		EEnum ENAMED_ELEMENT_RELATION_KIND = eINSTANCE.getENamedElementRelationKind();

	}

} //IspemPackage
