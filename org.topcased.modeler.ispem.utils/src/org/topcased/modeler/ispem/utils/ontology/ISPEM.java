package org.topcased.modeler.ispem.utils.ontology;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.PrefixManager;
import org.semanticweb.owlapi.util.DefaultPrefixManager;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ISPEM {
	// Class
	private static OWLOntologyManager manager = OWLManager
			.createOWLOntologyManager();
	static final public OWLClass PROCESS_ACTIVITY;
	static final public OWLClass DOMAIN_ACTIVITY;
	static final public OWLClass METHOD_ACTIVITY;
	static final public OWLClass LANGUAGE_ACTIVITY;
	static final public OWLClass ENGINEERING_DOMAIN;
	static final public OWLClass VIEWPOINT;
	static final public OWLClass ARTIFACT;
	static final public OWLClass DOMAIN_ARTIFACT;
	static final public OWLClass METHOD_ARTIFACT;
	static final public OWLClass LANGUAGE_ARTIFACT;
	static final public OWLClass ARTIFACT_DEFINITION;
	static final public OWLClass DOMAIN_ARTIFACT_DEFINITION;
	static final public OWLClass METHOD_ARTIFACT_DEFINITION;
	static final public OWLClass LANGUAGE_ARTIFACT_DEFINITION;
	static final public OWLClass TOOL;
	static final public OWLClass METHOD;
	static final public OWLClass MODELINGLANGUAGE;
	static final public OWLClass REPRESENTATIONLANGUAGE;
	static final public OWLClass WORKSEQUENCE;
	// Reference
	static final public OWLObjectProperty ARTIFACT_CONFORMS;
	static final public OWLObjectProperty ARTIFACTDEFINITION_METAMODEL;
	static final public OWLObjectProperty ARTIFACTDEFINITION_ROOTELEMENT;
	static final public OWLObjectProperty ARTIFACTDEFINITION_USEDREFERENCES;
	static final public OWLObjectProperty ARTIFACT_BEFORE;
	static final public OWLObjectProperty ARTIFACT_NEED_BE_TRANSFORMED_TO;
	static final public OWLObjectProperty ARTIFACTDEFINTITION_CATEGORIZED;
	static final public OWLObjectProperty HAVE_VIEWPOINT;
	static final public OWLObjectProperty ENGINEERINGDOMAIN_PERFORMS;
	static final public OWLObjectProperty ENGINEERINGDOMAIN_RELIES;
	static final public OWLObjectProperty DOMAINACTIVITY_APPLIES;
	static final public OWLObjectProperty PROCESSACTIVITY_CONSUMS;
	static final public OWLObjectProperty PROCESSACTIVITY_PRODUCES;
	static final public OWLObjectProperty METHODACTIVITY_SPECIALIZED;
	static final public OWLObjectProperty TOOL_CLASSIFIEDIN;
	static final public OWLObjectProperty TOOL_CONSTRAINTBY;
	static final public OWLObjectProperty TOOL_SUPPORT;
	static final public OWLObjectProperty METHOD_BELONGTO;
	static final public OWLObjectProperty METHOD_SUPPORTS;
	static final public OWLObjectProperty METHODARTIFACTDEFINITION_SPECIALIZEDBY;
	static final public OWLObjectProperty LANGUAGEARTIFACTDEFINITION_SPECIALIZEDBY;
	static final public OWLObjectProperty LANGUAGEARTIFACTDEFINITION_REPRESENTEDBY;
	static final public OWLObjectProperty REPRESENTATIONLANGUAGE_METAMODEL;
	static final public OWLObjectProperty METHODTASKDEFINITION_SPECIALIZEDBY;
	static final public OWLObjectProperty LANGUAGETASKDEFINITION_SPECIALIZEDBY;
	static final public OWLObjectProperty WORKSEQUENCE_SOURCE;
	static final public OWLObjectProperty WORKSEQUENCE_TARGET;
	static final public OWLObjectProperty ARTIFACT_HAVEBEFORE;
	static final public OWLObjectProperty ARTIFACT_NEEDBETRANSFORMEDTO;
	static final public OWLObjectProperty ARTIFACTDEFINITION_USEDMETAMODEL;
	// Attribute
	static final public OWLDataPropertyExpression NAME;
	static final public OWLDataPropertyExpression METAMODEL_URI;
	static final public OWLDataPropertyExpression DESCRIPTION;
	static final public OWLDataPropertyExpression PACKAGE_URI;
	//IRI
	static final public String ISpemOntologyIRI = "http://www.ispem.org/ontology/ispem.owl";
	static {
		OWLDataFactory factory = manager.getOWLDataFactory();
		PrefixManager prefix = new DefaultPrefixManager(
				"http://www.ispem.org/ontology/ispem.owl#");
		PROCESS_ACTIVITY = factory.getOWLClass("ENamedElement", prefix);
		DOMAIN_ACTIVITY = factory.getOWLClass("DomainActivity", prefix);
		METHOD_ACTIVITY = factory.getOWLClass("MethodActivity", prefix);
		LANGUAGE_ACTIVITY = factory.getOWLClass("LanguageActivity", prefix);
		ENGINEERING_DOMAIN = factory.getOWLClass("EngineeringDomain", prefix);
		VIEWPOINT = factory.getOWLClass("Viewpoint", prefix);
		ARTIFACT = factory.getOWLClass("Artifact", prefix);
		DOMAIN_ARTIFACT = factory.getOWLClass("DomainArtifact", prefix);
		METHOD_ARTIFACT = factory.getOWLClass("MethodArtifact", prefix);
		LANGUAGE_ARTIFACT = factory.getOWLClass("LanguageArtifact", prefix);
		ARTIFACT_DEFINITION = factory.getOWLClass("ArtifactDefinition", prefix);
		DOMAIN_ARTIFACT_DEFINITION = factory.getOWLClass(
				"DomainArtifactDefinition", prefix);
		METHOD_ARTIFACT_DEFINITION = factory.getOWLClass(
				"MethodArtifactDefinition", prefix);
		LANGUAGE_ARTIFACT_DEFINITION = factory.getOWLClass(
				"LanguageArtifactDefinition", prefix);
		TOOL = factory.getOWLClass("Tool", prefix);
		METHOD = factory.getOWLClass("Method", prefix);
		MODELINGLANGUAGE = factory.getOWLClass("", prefix);
		REPRESENTATIONLANGUAGE = factory.getOWLClass("RepresentationLanguage",
				prefix);
		WORKSEQUENCE = factory.getOWLClass("WorkSequence", prefix);
		// OWLObjectProperties
		ARTIFACTDEFINITION_METAMODEL = factory.getOWLObjectProperty(
				"ArtifactDefinition_usedMetaModel", prefix);
		ARTIFACTDEFINITION_ROOTELEMENT = factory.getOWLObjectProperty(
				"ArtifactDefinition_rootElement", prefix);
		ARTIFACTDEFINITION_USEDREFERENCES = factory.getOWLObjectProperty(
				"ArtifactDefinition_useReference", prefix);
		ARTIFACT_CONFORMS = factory.getOWLObjectProperty("Artifact_conforms",
				prefix);
		ARTIFACT_BEFORE = factory.getOWLObjectProperty("Artifact_haveBefore",
				prefix);
		ARTIFACT_NEED_BE_TRANSFORMED_TO = factory.getOWLObjectProperty(
				"Artifact_needBeTransformedTo", prefix);
		ARTIFACTDEFINTITION_CATEGORIZED = factory.getOWLObjectProperty(
				"ArtifactDefinition_categorized", prefix);
		HAVE_VIEWPOINT = factory.getOWLObjectProperty(
				"EngineeringDomain_haveViewpoint", prefix);
		ENGINEERINGDOMAIN_PERFORMS = factory.getOWLObjectProperty(
				"EngineeringDomain_performs", prefix);
		ENGINEERINGDOMAIN_RELIES = factory.getOWLObjectProperty(
				"EngineeringDomain_relies", prefix);
		DOMAINACTIVITY_APPLIES = factory.getOWLObjectProperty(
				"DomainActivity_applies", prefix);
		PROCESSACTIVITY_CONSUMS = factory.getOWLObjectProperty(
				"ProcessActivity_consums", prefix);
		PROCESSACTIVITY_PRODUCES = factory.getOWLObjectProperty(
				"ProcessActivity_produces", prefix);
		METHODACTIVITY_SPECIALIZED = factory.getOWLObjectProperty(
				"MethodActivity_specializedBy", prefix);
		TOOL_CLASSIFIEDIN = factory.getOWLObjectProperty("Tool_classifiedIn",
				prefix);
		TOOL_CONSTRAINTBY = factory.getOWLObjectProperty(
				"Tool_contraintbyStockageLanguage", prefix);
		TOOL_SUPPORT = factory.getOWLObjectProperty(
				"Tool_supportRepresentationLanguage", prefix);
		METHOD_BELONGTO = factory.getOWLObjectProperty("", prefix);
		METHOD_SUPPORTS = factory.getOWLObjectProperty("Method_supports",
				prefix);
		METHODARTIFACTDEFINITION_SPECIALIZEDBY = factory.getOWLObjectProperty(
				"MethodArtifactDefinition_specializedBy", prefix);
		LANGUAGEARTIFACTDEFINITION_SPECIALIZEDBY = factory
				.getOWLObjectProperty(
						"LanguageArtifactDefinition_specializedBy", prefix);
		LANGUAGEARTIFACTDEFINITION_REPRESENTEDBY = factory
				.getOWLObjectProperty(
						"LanguageArtifactDefinition_representedBy", prefix);
		METHODTASKDEFINITION_SPECIALIZEDBY = factory.getOWLObjectProperty(
				"MethodActivity_specializedBy", prefix);
		LANGUAGETASKDEFINITION_SPECIALIZEDBY = factory.getOWLObjectProperty(
				"LanguageActivity_specializedBy", prefix);
		WORKSEQUENCE_SOURCE = factory.getOWLObjectProperty(
				"WorkSequence_source", prefix);
		WORKSEQUENCE_TARGET = factory.getOWLObjectProperty(
				"WorkSequence_target", prefix);
		ARTIFACT_HAVEBEFORE = factory.getOWLObjectProperty(
				"Artifact_haveBefore", prefix);
		ARTIFACT_NEEDBETRANSFORMEDTO = factory.getOWLObjectProperty(
				"Artifact_needBeTransformedTo", prefix);
		ARTIFACTDEFINITION_USEDMETAMODEL = factory.getOWLObjectProperty(
				"ArtifactDefinition_usedMetaModel", prefix);
		REPRESENTATIONLANGUAGE_METAMODEL = factory.getOWLObjectProperty(
				"RepresentationLanguage_usedMetaModel", prefix);
		// OWLDataProperties
		NAME = factory.getOWLDataProperty("Name", prefix);
		METAMODEL_URI = factory.getOWLDataProperty("MetaModel_uri", prefix);
		DESCRIPTION = factory.getOWLDataProperty("Package_description", prefix);
		PACKAGE_URI = factory.getOWLDataProperty("Package_uri", prefix);
	}
	}
