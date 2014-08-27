package org.topcased.modeler.ispem.utils.ontology;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.ui.internal.handlers.WizardHandler.New;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.PrefixManager;
import org.semanticweb.owlapi.util.DefaultPrefixManager;

public class METAMODEL {
	//OWLClass
	private static OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
	public final static  OWLClass ENAMEDELEMENT;
	
	public final static OWLClass EATTRIBUTE;
	public final static OWLClass ECLASS;
	public final static OWLClass EPACKAGE;
	public final static OWLClass EREFERENCE;
	public final static OWLClass METAMODEL;
	//OWLReference
	public final static OWLObjectProperty ECLASSIFIER_EPACKAGE;
	public final static OWLObjectProperty ECLASS_EALLATTRIBUTES;
	public final static OWLObjectProperty ECLASS_EATTRIBUTES;
	public final static OWLObjectProperty ECLASS_EALLREFERENCES;
	public final static OWLObjectProperty ECLASS_EREFERENCES;
	public final static OWLObjectProperty ECLASS_CORRESPONDENCE;
	public final static OWLObjectProperty ECLASS_SPECIALIZEDBY;
	public final static OWLObjectProperty ECLASS_ESUPERTYPES;
	public final static OWLObjectProperty ENAMEDELEMENT_REPRESENTEDBY;
	public final static OWLObjectProperty EPACKAGE_ECLASSIFIERS;
	public final static OWLObjectProperty EREFERENCE_EREFERENCETYPE;
	public final static OWLObjectProperty EREFERENCE_CORRESPONDENCE;
	public final static OWLObjectProperty EREFERENCE_SPECIALIZEDBY;
	public final static OWLObjectProperty ESTRUCTURALFEATUER_ECONTAININGCLASS;
	//OWLDataProperties
	public final static OWLDataProperty ENAMEDELEMENT_NAME;
	public final static OWLDataProperty EPACKAGE_NSPREFIX;
	public final static OWLDataProperty EPACKAGE_NSURI;
	public final static OWLDataProperty EREFERENCE_CONTAINMENT;
	public final static OWLDataProperty ETYPEDELEMENT_LOWERBOUND;
	public final static OWLDataProperty ETYPEDELEMENT_UPPERBOUND;
	static
	{
		OWLDataFactory factory = manager.getOWLDataFactory();
		PrefixManager prefix = new DefaultPrefixManager("http://www.eclipse.org/emf/2002/Ecore#");
		ENAMEDELEMENT = factory.getOWLClass("ENamedElement",prefix);
		EATTRIBUTE = factory.getOWLClass("EAttribute",prefix);
		ECLASS = factory.getOWLClass("EClass",prefix);
		EPACKAGE = factory.getOWLClass("EPackage",prefix);
		EREFERENCE = factory.getOWLClass("EReference",prefix);
		METAMODEL = factory.getOWLClass(IRI.create("http://www.spem-ifest.org/ontology/metamodel.owl#MetaModel"));
		ECLASSIFIER_EPACKAGE = factory.getOWLObjectProperty("EClassifier_ePackage",prefix);
		ECLASS_EALLATTRIBUTES = factory.getOWLObjectProperty("EClass_eAllAttributes",prefix);
		ECLASS_EATTRIBUTES = factory.getOWLObjectProperty("EClass_eAttributes",prefix);
		ECLASS_EALLREFERENCES = factory.getOWLObjectProperty("EClass_eAllReferences",prefix);
		ECLASS_EREFERENCES = factory.getOWLObjectProperty("EClass_eReferences",prefix);
		ECLASS_CORRESPONDENCE = factory.getOWLObjectProperty("EClass_correspondence",prefix);
		ECLASS_SPECIALIZEDBY = factory.getOWLObjectProperty("EClass_specializedBy",prefix);
		ECLASS_ESUPERTYPES = factory.getOWLObjectProperty("EClass_eSuperTypes",prefix);
		
		ENAMEDELEMENT_REPRESENTEDBY = factory.getOWLObjectProperty("ENamedElement_representedBy",prefix);
		EPACKAGE_ECLASSIFIERS = factory.getOWLObjectProperty("EPackage_eClassifiers",prefix);
		EREFERENCE_EREFERENCETYPE = factory.getOWLObjectProperty("EReference_eReferenceType",prefix);
		EREFERENCE_CORRESPONDENCE = factory.getOWLObjectProperty("EReference_correspondence",prefix);
		EREFERENCE_SPECIALIZEDBY = factory.getOWLObjectProperty("EReference_specializedBy",prefix);
		ESTRUCTURALFEATUER_ECONTAININGCLASS = factory.getOWLObjectProperty("EStructuralFeature_eContainingClass",prefix);
		ENAMEDELEMENT_NAME = factory.getOWLDataProperty("ENamedElement_name",prefix);
		EREFERENCE_CONTAINMENT = factory.getOWLDataProperty("EReference_containment",prefix);
		ETYPEDELEMENT_LOWERBOUND = factory.getOWLDataProperty("ETypedElement_lowerBound",prefix);
		ETYPEDELEMENT_UPPERBOUND = factory.getOWLDataProperty("ETypedElement_upperBound",prefix);
		EPACKAGE_NSPREFIX = factory.getOWLDataProperty("EPackage_nsPrefix",prefix);
		EPACKAGE_NSURI = factory.getOWLDataProperty("EPackage_nsURI",prefix);
	}
	
}
