package org.topcased.modeler.ispem.utils.ontology;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.ParserConfigurationException;

import org.semanticweb.owlapi.io.SystemOutDocumentTarget;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.model.PrefixManager;
import org.semanticweb.owlapi.reasoner.ConsoleProgressMonitor;
import org.semanticweb.owlapi.reasoner.Node;
import org.semanticweb.owlapi.reasoner.NodeSet;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.SimpleConfiguration;
import org.semanticweb.owlapi.util.DefaultPrefixManager;
import org.topcased.ispem.Artifact;
import org.topcased.ispem.ArtifactTransformation;
import org.topcased.ispem.DomainArtifactDefinition;
import org.topcased.ispem.IspemFactory;
import org.topcased.ispem.LanguageArtifactDefinition;
import org.topcased.ispem.MethodArtifactDefinition;
import org.topcased.spem.ParameterDirectionKind;
import org.topcased.spem.ProcessParameter;
import org.topcased.spem.SpemFactory;
import org.topcased.spem.TaskUse;
import org.topcased.spem.WorkProductUse;
import org.topcased.spem.activity.Edge;
import org.xml.sax.SAXException;
import com.clarkparsia.pellet.rules.builtins.BuiltInRegistry; 
import com.clarkparsia.pellet.owlapiv3.PelletReasonerFactory;

public class ToolChainReasoning {
	private static ToolChainReasoning instance;
	
	ISPEMOntologyImport importer ;
	OWLClass classWorkSequence,classActivity,classArtifact,classMethodArtifactDefinition,classDomainArtifactDefinition,classLanguageArtifactDefinition ;
	OWLObjectProperty propSource,propTarget,propProduces,propConsums,propConforms,propSpecializedByDAD,propSpecializedByMAD;
	private ToolChainReasoning() throws OWLOntologyCreationException, SAXException, IOException, ParserConfigurationException
	{
		
		 importer = ISPEMOntologyImport.getInstance();
		OWLOntologyManager manager = importer.getManager();
		OWLOntology ont = importer.getOnt();
		OWLDataFactory factory = manager.getOWLDataFactory();
		classWorkSequence = ISPEM.WORKSEQUENCE;
		 propSource = ISPEM.WORKSEQUENCE_SOURCE;
		propTarget =ISPEM.WORKSEQUENCE_TARGET;
		classActivity = ISPEM.METHOD_ACTIVITY;
		 propProduces = ISPEM.PROCESSACTIVITY_PRODUCES;
		 propConsums = ISPEM.PROCESSACTIVITY_CONSUMS;
		 propConforms =ISPEM.ARTIFACT_CONFORMS;
		 classArtifact =ISPEM.ARTIFACT;
		 classLanguageArtifactDefinition = ISPEM.LANGUAGE_ARTIFACT_DEFINITION;
		 classMethodArtifactDefinition = ISPEM.METHOD_ARTIFACT_DEFINITION;
		 classDomainArtifactDefinition = ISPEM.DOMAIN_ARTIFACT_DEFINITION;
		 propSpecializedByDAD = ISPEM.METHODARTIFACTDEFINITION_SPECIALIZEDBY;
		 propSpecializedByMAD = ISPEM.LANGUAGEARTIFACTDEFINITION_SPECIALIZEDBY;
	}
	public List<org.topcased.ispem.ArtifactTransformation> reasoningArtifactTransformationRequirement(
			List<Edge> taskEdges) {
		List<ArtifactTransformation> transformations = new ArrayList<ArtifactTransformation>();
		List<WorkProductUse> artifacts = new ArrayList<WorkProductUse>();		
		OWLOntologyManager manager = importer.getManager();
		OWLOntology ont = importer.getOnt();
		OWLDataFactory factory = manager.getOWLDataFactory();
		// //////////////////////////
		// Lift process to ontology///
		// /////////////////////////////
		PrefixManager pm = new DefaultPrefixManager("http://localhost#");
		
		int i = 0;
		System.out.println("Lifting worksequence:");
		for (Edge edge : taskEdges) {
			// lift worksequence
			i++;
			OWLNamedIndividual indivWsq = factory.getOWLNamedIndividual(
					"worksequence" + i, pm);
			System.out.println(indivWsq.toStringID());
			OWLClassAssertionAxiom axiom = factory
					.getOWLClassAssertionAxiom(classWorkSequence, indivWsq);
			manager.addAxiom(ont, axiom);
			// lift task use <=> activity
			// ///source
			
			TaskUse taskUse = (TaskUse) edge.getSource();
			OWLNamedIndividual indivActivity = factory
					.getOWLNamedIndividual(
							taskUse.getName().replace(' ', '_'), pm);
			System.out.println("source: "+indivActivity.toStringID());
			OWLObjectPropertyAssertionAxiom proAxiom;
			if (!ont.containsIndividualInSignature(indivActivity.getIRI())) {
				axiom = factory.getOWLClassAssertionAxiom(classActivity,
						indivActivity);

				manager.addAxiom(ont, axiom);
				 proAxiom = factory
							.getOWLObjectPropertyAssertionAxiom(propSource,
									indivWsq, indivActivity);
					manager.addAxiom(ont, proAxiom);
					System.out.println(proAxiom.toString());
					System.out.println("Lifting method artifacts");
					List<ProcessParameter> parameters = taskUse
							.getOwnedProcessParameter();
					ProcessParameterLifting(parameters, artifacts, indivActivity, pm);
			}
			else
			{
				 proAxiom = factory
							.getOWLObjectPropertyAssertionAxiom(propSource,
									indivWsq, indivActivity);
				 System.out.println(proAxiom.toString());
					manager.addAxiom(ont, proAxiom);
			}

			
				
				
			// target
			taskUse = (TaskUse) edge.getTarget();
			indivActivity = factory.getOWLNamedIndividual(edge.getTarget()
					.getName().replace(' ', '_'), pm);
			System.out.println("target: "+indivActivity.toStringID());
			if (!ont.containsIndividualInSignature(indivActivity.getIRI())) {
				axiom = factory.getOWLClassAssertionAxiom(classActivity,
						indivActivity);

				manager.addAxiom(ont, axiom);
				proAxiom = factory.getOWLObjectPropertyAssertionAxiom(
						propTarget, indivWsq, indivActivity);
				manager.addAxiom(ont, proAxiom);
				System.out.println(proAxiom.toString());
				List<ProcessParameter> parameters = taskUse
						.getOwnedProcessParameter();
				System.out.println("Lifting method artifacts");
				ProcessParameterLifting(parameters, artifacts, indivActivity, pm);
			}
			else
			{
				proAxiom = factory.getOWLObjectPropertyAssertionAxiom(
						propTarget, indivWsq, indivActivity);
				manager.addAxiom(ont, proAxiom);
				System.out.println(proAxiom.toString());
			}
			

		}
		try {
			manager.saveOntology(ont, new SystemOutDocumentTarget());
		} catch (OWLOntologyStorageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ///////////////////////////////
		// /////////Begin resonning//////
		// ///////////////////////////////
		OWLReasonerFactory reasonerFactory = new PelletReasonerFactory();

		ConsoleProgressMonitor progressMonitor = new ConsoleProgressMonitor();

		OWLReasonerConfiguration config = new SimpleConfiguration(
				progressMonitor);

		OWLReasoner reasoner = reasonerFactory.createReasoner(ont, config);

		// Ask the reasoner to do all the necessary work now
		reasoner.precomputeInferences();
		// We can determine if the ontology is actually consistent (in this
		// case, it should be).
		boolean consistent = reasoner.isConsistent();
		System.out.println("Consistent: " + consistent);
		System.out.println("\n");

		Node<OWLClass> bottomNode = reasoner.getUnsatisfiableClasses();

		Set<OWLClass> unsatisfiable = bottomNode.getEntitiesMinusBottom();
		if (!unsatisfiable.isEmpty()) {
			System.out.println("The following classes are unsatisfiable: ");
			for (OWLClass cls : unsatisfiable) {
				System.out.println("    " + cls);
			}
		} else {
			System.out.println("There are no unsatisfiable classes");
		}
		//System.out.println("\n");
		OWLObjectProperty propHavebefore = ISPEM.ARTIFACT_HAVEBEFORE;
		OWLObjectProperty propNeedTransformation = ISPEM.ARTIFACT_NEEDBETRANSFORMEDTO;
		NodeSet<OWLNamedIndividual> nodeset_artifacts = reasoner
				.getInstances(classArtifact, true);
		for (OWLNamedIndividual a : nodeset_artifacts.getFlattened()) {
			
			NodeSet<OWLNamedIndividual> nodeset = reasoner
					.getObjectPropertyValues(a, propNeedTransformation);
			if (nodeset.isEmpty()) {
				continue;
			}

			for (OWLNamedIndividual target : nodeset.getFlattened()) {
				if (target.equals(a))
					continue;
				ArtifactTransformation transform = IspemFactory.eINSTANCE
						.createArtifactTransformation();
				WorkProductUse source_wpu = null;
				WorkProductUse target_wpu = null;
				for (WorkProductUse wpu : artifacts) {
					OWLIndividual indiviwpu = factory
							.getOWLNamedIndividual(
									wpu.getName().replace(' ', '_'), pm);
					if (indiviwpu.toStringID().equals(target.toStringID())) {
						target_wpu = wpu;
					}
					if (indiviwpu.toStringID().equals(a.toStringID())) {
						source_wpu = wpu;
					}

				}
				transform.setSource((Artifact) source_wpu);
				transform.setTarget((Artifact) target_wpu);
				transformations.add(transform);
			}

		}
		return transformations;

	}
	private void ProcessParameterLifting( List<ProcessParameter> parameters, List<WorkProductUse> artifacts, OWLNamedIndividual indivActivity, PrefixManager pm)
	{
		OWLOntologyManager manager = importer.getManager();
		OWLOntology ont = importer.getOnt();
		OWLDataFactory factory = manager.getOWLDataFactory();
		OWLClassAssertionAxiom axiom;
		OWLObjectPropertyAssertionAxiom proAxiom;
		for (ProcessParameter p : parameters) {
			// artifact
			WorkProductUse artifact = p.getParameterType();
			if (!artifacts.contains(artifact)) {
				artifacts.add(artifact);
			}

			OWLNamedIndividual indivArtifact = factory
					.getOWLNamedIndividual(p.getParameterType()
							.getName().replace(' ', '_'), pm);
			System.out.println(indivArtifact.toStringID());
			axiom = factory.getOWLClassAssertionAxiom(classArtifact,
					indivArtifact);
			if (!ont.containsAxiom(axiom)) {
				manager.addAxiom(ont, axiom);
			}
			if (p.getDirection() == ParameterDirectionKind.IN_LITERAL
					|| p.getDirection() == ParameterDirectionKind.INOUT_LITERAL) {
				proAxiom = factory.getOWLObjectPropertyAssertionAxiom(
						propConsums, indivActivity, indivArtifact);
				manager.addAxiom(ont, proAxiom);
				System.out.println(proAxiom.toString());
			}
			if (p.getDirection() == ParameterDirectionKind.OUT_LITERAL
					|| p.getDirection() == ParameterDirectionKind.INOUT_LITERAL) {
				proAxiom = factory.getOWLObjectPropertyAssertionAxiom(
						propProduces, indivActivity, indivArtifact);
				manager.addAxiom(ont, proAxiom);
				System.out.println(proAxiom.toString());
			}
			////Language artifact defintion
			LanguageArtifactDefinition languageAD = (LanguageArtifactDefinition) p
					.getParameterType().getWorkProduct();
			OWLNamedIndividual indiviArtifactDef = factory
					.getOWLNamedIndividual(
							languageAD.getName().replace(' ', '_')+"Def", pm);
			System.out.println(indiviArtifactDef.toString());
			axiom = factory.getOWLClassAssertionAxiom(
					classLanguageArtifactDefinition, indiviArtifactDef);
			if (!ont.containsAxiom(axiom)) {
				manager.addAxiom(ont, axiom);
			}
			proAxiom = factory.getOWLObjectPropertyAssertionAxiom(
					propConforms, indivArtifact, indiviArtifactDef);
			System.out.println(proAxiom.toString());
			manager.addAxiom(ont, proAxiom);
			// //////Method artifact definition
			MethodArtifactDefinition methodAD = languageAD.getSpecializedBy();
			if(methodAD==null)
				continue;
			OWLNamedIndividual indiviMethodArtifactDef = factory
					.getOWLNamedIndividual(
							methodAD.getName().replace(' ', '_')+"Def", pm);
			System.out.println(indiviMethodArtifactDef.toString());
			axiom = factory.getOWLClassAssertionAxiom(
					classMethodArtifactDefinition, indiviMethodArtifactDef);
			if (!ont.containsAxiom(axiom)) {
				manager.addAxiom(ont, axiom);
			}
			proAxiom = factory.getOWLObjectPropertyAssertionAxiom(
					propSpecializedByMAD, indiviArtifactDef, indiviMethodArtifactDef);
			System.out.println(proAxiom.toString());
			manager.addAxiom(ont, proAxiom);
			// ////////////Domain artifact definition
			DomainArtifactDefinition domainAD = methodAD
					.getSpecializedBy();
			if(domainAD==null)
				continue;
			OWLNamedIndividual indiviDomainAD = factory
					.getOWLNamedIndividual(
							domainAD.getName().replace(' ', '_'), pm);
			System.out.println(indiviDomainAD.toString());
			axiom = factory.getOWLClassAssertionAxiom(
					classDomainArtifactDefinition, indiviDomainAD);
			if (!ont.containsAxiom(axiom)) {
				manager.addAxiom(ont, axiom);
			}
			proAxiom = factory.getOWLObjectPropertyAssertionAxiom(
					propSpecializedByDAD, indiviMethodArtifactDef, indiviDomainAD);
			manager.addAxiom(ont, proAxiom);
			System.out.println(proAxiom.toString());
		}
	}
	public static ToolChainReasoning getInstance() throws OWLOntologyCreationException, SAXException, IOException, ParserConfigurationException {
		if (instance==null)
		{
			instance = new ToolChainReasoning();
		}
		return instance;
	}
}
