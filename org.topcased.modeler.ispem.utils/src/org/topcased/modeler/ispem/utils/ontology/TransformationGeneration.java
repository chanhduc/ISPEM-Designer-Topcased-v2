package org.topcased.modeler.ispem.utils.ontology;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.ParserConfigurationException;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.io.RDFXMLOntologyFormat;
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.AddImport;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.MissingImportEvent;
import org.semanticweb.owlapi.model.MissingImportListener;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLImportsDeclaration;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.model.SWRLAtom;
import org.semanticweb.owlapi.model.SWRLObjectPropertyAtom;
import org.semanticweb.owlapi.model.SWRLRule;
import org.semanticweb.owlapi.model.SWRLVariable;
import org.semanticweb.owlapi.reasoner.ConsoleProgressMonitor;
import org.semanticweb.owlapi.reasoner.Node;
import org.semanticweb.owlapi.reasoner.NodeSet;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.SimpleConfiguration;
import org.semanticweb.owlapi.util.DefaultPrefixManager;
import org.semanticweb.owlapi.util.OWLOntologyMerger;
import org.semanticweb.owlapi.util.SimpleIRIMapper;
import org.topcased.ispem.ArtifactTransformation;
import org.topcased.ispem.LanguageArtifactDefinition;
import org.xml.sax.SAXException;


import com.clarkparsia.pellet.owlapiv3.PelletReasonerFactory;

public class TransformationGeneration {
	List<ArtifactTransformation> transformations = new ArrayList<ArtifactTransformation>();
	String rsPath="";
	String tempFile ;
	String importTempFile;
	List<URI> missingOntology = new ArrayList<URI>();
	private static TransformationGeneration instance;
	private TransformationGeneration()
	{
		File tmpDir = new File(System.getProperty("java.io.tmpdir"));
		File file = new File(tmpDir, "tempfile.owl");
		tempFile = file.getAbsolutePath();
		file = new File(tmpDir,"importtempfile.owl");
		importTempFile = file.getAbsolutePath();
	}
	public boolean run(List<ArtifactTransformation> inputs, String folderPath)
			throws Exception {
		rsPath=folderPath;
		try {
		for (ArtifactTransformation t:inputs)
		{
			
				generateTransformation(t);
		
		}
		return true;
		} catch (OWLOntologyStorageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public List<String> validateKnowledgeBase(ArtifactTransformation arg0) throws Exception
	{
		List<String> lstUnMappedElement = new ArrayList<String>();
		String ifestURI = RepositoryHelper.ISPEM_METACLASS_CONTEXT;
		String mappingURI = "http://www.spem-ifest.org/ontology/metamodel/mapping.owl";
		String metamodeURI = RepositoryHelper.METAMODEL_METACLASS_CONTEXT;
		manager = OWLManager.createOWLOntologyManager();
		manager.addMissingImportListener(new MissingImportListener() {

			public void importMissing(MissingImportEvent arg0) {
				// TODO Auto-generated method stub
				try {
					
					System.out.println("missing ontology: "+arg0.getImportedOntologyURI());
					DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			        Date date = new Date();
					String filename = "D://Working/Ontologies/Temp/importtempfile_"+dateFormat.format(date)+".owl";
				if(RepositoryHelper.getOntologyWithName(arg0
						.getImportedOntologyURI().toString(), filename))
				{
					File file = new File(filename);
					OWLOntology ont = manager.loadOntologyFromOntologyDocument(file);
					Set<OWLOntology> ontologies = ont.getDirectImports();
					for (OWLOntology o:ontologies)
					{
						manager.addAxioms(ont, o.getAxioms());
					}
					System.out.println("import missing ontology: "+ont.toString());
					file.delete();
				}
					
				} catch (OWLOntologyCreationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		manager.setSilentMissingImportsHandling(true);
		OWLDataFactory fac = manager.getOWLDataFactory();
		IRI iri = IRI
				.create("http://sqwrl.stanford.edu/ontologies/built-ins/3.4/sqwrl.owl");
		File file = new File("D://Working/ontologies/lib/sqwrl.owl");
		manager.addIRIMapper(new SimpleIRIMapper(iri, IRI.create(file)));
		iri = IRI.create("http://swrl.stanford.edu/ontologies/3.3/swrla.owl");
		file = new File("D://Working/ontologies/lib/swrla.owl");
		manager.addIRIMapper(new SimpleIRIMapper(iri, IRI.create(file)));
		RepositoryHelper.getOWL(RepositoryHelper.METAMODEL_METACLASS_CONTEXT,
				tempFile);

		OWLOntology ont = manager.loadOntologyFromOntologyDocument(new File(
				tempFile));
		System.out.println("load ontology: " + ont.toString());
		RepositoryHelper.getOWL(RepositoryHelper.ISPEM_METACLASS_CONTEXT,
				tempFile);
		manager.addAxioms(ont, manager.loadOntologyFromOntologyDocument(new File(tempFile)).getAxioms());
		//System.out.println("load ontology: " + ont.toString());
	
		RepositoryHelper.getOWL(mappingURI, tempFile);
		manager.addAxioms(ont, manager.loadOntologyFromOntologyDocument(new File(tempFile)).getAxioms());
		System.out.println(ont.toString());
		OWLImportsDeclaration importDeclaraton =
				   fac.getOWLImportsDeclaration(IRI.create(metamodeURI));
				manager.applyChange(new AddImport(ont, importDeclaraton));
		
				LanguageArtifactDefinition languageAD1 = ((LanguageArtifactDefinition) arg0.getSource()
						.getWorkProduct());
				LanguageArtifactDefinition languageAD2 = ((LanguageArtifactDefinition) arg0.getTarget()
						.getWorkProduct());

		////////////////////////////////
		///////// get 2 metamodel/////////
		////////////////////////////////////
		//meta model 1
		String ontologyID = RepositoryHelper.getOWLOntologyID(languageAD1.getSpecializedBy().getUri());
		if (ontologyID!=null)
		{
			if (!manager.contains(IRI.create(ontologyID)))
			{
				RepositoryHelper.getOntologyWithResource(languageAD1.getSpecializedBy().getUri(), tempFile);
				manager.addAxioms(ont, manager.loadOntologyFromOntologyDocument(new File(tempFile)).getAxioms());
				System.out.println(ont.toString());
			}
		}
		
		OWLObjectProperty propUsedMetaModel = fac
				.getOWLObjectProperty(IRI
						.create("http://www.obeonetwork.org/ontologies/spem/ifest.owl#ArtifactDefinition_usedMetaModel"));
		OWLNamedIndividual indiMethodArtDef1 = fac.getOWLNamedIndividual(IRI.create(languageAD1.getSpecializedBy().getUri()));
		OWLNamedIndividual indiMetaModel1 = (OWLNamedIndividual) indiMethodArtDef1.getObjectPropertyValues(propUsedMetaModel, ont).iterator().next();
		//meta model 2
		ontologyID = RepositoryHelper.getOWLOntologyID(languageAD1.getSpecializedBy().getUri());
		if (ontologyID!=null)
		{
			if (!manager.contains(IRI.create(ontologyID)))
			{
				RepositoryHelper.getOntologyWithResource(languageAD2.getSpecializedBy().getUri(), tempFile);
				manager.addAxioms(ont, manager.loadOntologyFromOntologyDocument(new File(tempFile)).getAxioms());
				System.out.println(ont.toString());
			}
		}
		
		OWLNamedIndividual indiMethodArtDef2 = fac.getOWLNamedIndividual(IRI.create(languageAD2.getSpecializedBy().getUri()));
		OWLNamedIndividual indiMetaModel2 = (OWLNamedIndividual) indiMethodArtDef2.getObjectPropertyValues(propUsedMetaModel, ont).iterator().next();
		/////////////////////////////////////////////////////////
		///////////get representation language metamode//////////
		/////////////////////////////////////////////////////////
		String language1 = languageAD1.getRepresentedBy().getUri();
		OWLNamedIndividual indiLanguage1 = fac.getOWLNamedIndividual(IRI.create(language1));
		String language2 = languageAD2.getRepresentedBy().getUri();
		OWLNamedIndividual indiLanguage2 = fac.getOWLNamedIndividual(IRI.create(language2));
		//OWLObjectProperty propRepresentedBy = fac.getOWLObjectProperty(IRI.create(ISPEM.LANGUAGEARTIFACTDEFINITION_REPRESENTEDBY));
		OWLObjectProperty propUsedMetaModel2 = fac.getOWLObjectProperty(IRI.create("http://www.obeonetwork.org/ontologies/spem/ifest.owl#RepresentationLanguage_usedMetaModel")); 
		Set<OWLIndividual> setIndividuals = indiLanguage1.getObjectPropertyValues(propUsedMetaModel2, ont);
		//System.out.println(ont.getAxioms().toString());
		if (setIndividuals.size()==0)
		{
			throw new Exception("No Representation Language <"+language1+"> MetaModel");
		}
		OWLNamedIndividual indiLanguageMM1 = setIndividuals.iterator().next().asOWLNamedIndividual();
		setIndividuals = indiLanguage2.getObjectPropertyValues(propUsedMetaModel2, ont);
		if (setIndividuals.size()==0)
		{
			throw new Exception("No Representation Language <"+language2+"> MetaModel");
		}
		OWLNamedIndividual indiLanguageMM2 = setIndividuals.iterator().next().asOWLNamedIndividual();
		// ////////////////////////////////////
		// /////////////////////////////////////
		// /Create rule//////////////////////////
		// ////////////////////////////////////////
		OWLObjectProperty op_hasClass = METAMODEL.EPACKAGE_ECLASSIFIERS;
		OWLObjectProperty op_itsMetaModel = METAMODEL.ECLASSIFIER_EPACKAGE;
	
		// ////////////////////
		// mapping inference rule
		// //////////////////////////
		//class
		SWRLVariable varX = fac.getSWRLVariable(IRI.create(ifestURI + "#x"));
		SWRLVariable varY = fac.getSWRLVariable(IRI.create(ifestURI + "#y"));
		SWRLObjectPropertyAtom propAtom1;
		SWRLObjectPropertyAtom propAtom2 ;
		OWLClass eclass = METAMODEL.ECLASS;
		OWLClass reference = METAMODEL.EREFERENCE;
		OWLObjectProperty propClassSpecializedBy = METAMODEL.ECLASS_SPECIALIZEDBY;
		OWLObjectProperty op_class = METAMODEL.EPACKAGE_ECLASSIFIERS;
		OWLObjectProperty propEClass_Correspond = METAMODEL.ECLASS_CORRESPONDENCE;
		SWRLVariable varZ = fac.getSWRLVariable(IRI.create(ifestURI + "#z"));
		propAtom1 = fac.getSWRLObjectPropertyAtom(op_class,
				fac.getSWRLIndividualArgument(indiMetaModel1), varX);
		propAtom2 = fac.getSWRLObjectPropertyAtom(op_class,
				fac.getSWRLIndividualArgument(indiMetaModel2), varY);
		SWRLObjectPropertyAtom propAtom3 = fac.getSWRLObjectPropertyAtom(
				propClassSpecializedBy, varX, varZ);
		SWRLObjectPropertyAtom propAtom4 = fac.getSWRLObjectPropertyAtom(
				propClassSpecializedBy, varY, varZ);
		SWRLObjectPropertyAtom propAtom5 = fac.getSWRLObjectPropertyAtom(
				propEClass_Correspond, varX, varY);
		Set<SWRLAtom> antecedent = new HashSet<SWRLAtom>();
		antecedent.add(propAtom1);
		antecedent.add(propAtom2);
		antecedent.add(propAtom3);
		antecedent.add(propAtom4);
		SWRLRule rule3 = fac.getSWRLRule(antecedent,
				Collections.singleton(propAtom5));
		manager.applyChange(new AddAxiom(ont, rule3));
		
		//reference
		OWLObjectProperty ob_referencemap = METAMODEL.EREFERENCE_SPECIALIZEDBY;
		OWLObjectProperty propEReferencecorrespond = METAMODEL.EREFERENCE_CORRESPONDENCE;
		OWLObjectProperty propEClass_eAllReferences = METAMODEL.ECLASS_EALLREFERENCES;
		SWRLVariable varA = fac.getSWRLVariable(IRI.create(ifestURI + "#a"));
		SWRLVariable varB = fac.getSWRLVariable(IRI.create(ifestURI + "#b"));
		propAtom1 = fac.getSWRLObjectPropertyAtom(op_class,
				fac.getSWRLIndividualArgument(indiMetaModel1), varX);
		propAtom2 = fac.getSWRLObjectPropertyAtom(op_class,
				fac.getSWRLIndividualArgument(indiMetaModel2), varY);
		propAtom3 = fac.getSWRLObjectPropertyAtom(propEClass_eAllReferences, varX, varA);
		propAtom4 = fac.getSWRLObjectPropertyAtom(propEClass_eAllReferences, varY, varB);
		propAtom5 = fac.getSWRLObjectPropertyAtom(ob_referencemap, varA, varZ);
		SWRLObjectPropertyAtom propAtom6 = fac.getSWRLObjectPropertyAtom(ob_referencemap, varB, varZ);
		SWRLObjectPropertyAtom propAtom7 = fac.getSWRLObjectPropertyAtom(propEReferencecorrespond, varA, varB);
		antecedent = new HashSet<SWRLAtom>();
		antecedent.add(propAtom1);
		antecedent.add(propAtom2);
		antecedent.add(propAtom3);
		antecedent.add(propAtom4);
		antecedent.add(propAtom5);
		antecedent.add(propAtom6);
		SWRLRule rule4 = fac.getSWRLRule(antecedent,
				Collections.singleton(propAtom7));
		manager.applyChange(new AddAxiom(ont, rule4));
		
		
		OWLOntologyMerger merger = new OWLOntologyMerger(manager);
		OWLOntology merged = merger.createMergedOntology(manager,
				IRI.create("http://mergedontology.com"));
		manager.saveOntology(merged, new RDFXMLOntologyFormat(), IRI.create((new File (tempFile)).toURI()));
		
		OWLReasonerFactory reasonerFactory = new PelletReasonerFactory();

		// We'll now create an instance of an OWLReasoner (the implementation
		// being provided by HermiT as
		// we're using the HermiT reasoner factory). The are two categories of
		// reasoner, Buffering and
		// NonBuffering. In our case, we'll create the buffering reasoner, which
		// is the default kind of reasoner.
		// We'll also attach a progress monitor to the reasoner. To do this we
		// set up a configuration that
		// knows about a progress monitor.

		// Create a console progress monitor. This will print the reasoner
		// progress out to the console.
		ConsoleProgressMonitor progressMonitor = new ConsoleProgressMonitor();
		// Specify the progress monitor via a configuration. We could also
		// specify other setup parameters in
		// the configuration, and different reasoners may accept their own
		// defined parameters this way.
		OWLReasonerConfiguration config = new SimpleConfiguration(
				progressMonitor);
		// Create a reasoner that will reason over our ontology and its imports
		// closure. Pass in the configuration.
		OWLReasoner reasoner = reasonerFactory.createReasoner(merged, config);

		// Ask the reasoner to do all the necessary work now
		reasoner.precomputeInferences();
		// We can determine if the ontology is actually consistent (in this
		// case, it should be).
		boolean consistent = reasoner.isConsistent();
		System.out.println("Consistent: " + consistent);
		//System.out.println("\n");
		
		// We can easily get a list of unsatisfiable classes. (A class is
		// unsatisfiable if it
		// can't possibly have any instances). Note that the
		// getUnsatisfiableClasses method
		// is really just a convenience method for obtaining the classes that
		// are equivalent
		// to owl:Nothing. In our case there should be just one unsatisfiable
		// class - "mad_cow"
		// We ask the reasoner for the unsatisfiable classes, which returns the
		// bottom node
		// in the class hierarchy (an unsatisfiable class is a subclass of every
		// class).
		Node<OWLClass> bottomNode = reasoner.getUnsatisfiableClasses();
		// This node contains owl:Nothing and all the classes that are
		// equivalent to owl:Nothing -
		// i.e. the unsatisfiable classes.
		// We just want to print out the unsatisfiable classes excluding
		// owl:Nothing, and we can
		// used a convenience method on the node to get these
		Set<OWLClass> unsatisfiable = bottomNode.getEntitiesMinusBottom();
		if (!unsatisfiable.isEmpty()) {
			System.out.println("The following classes are unsatisfiable: ");
			for (OWLClass cls : unsatisfiable) {
				System.out.println("    " + cls);
			}
		} else {
			System.out.println("There are no unsatisfiable classes");
		}
		System.out.println("\n");
		OWLDataFactory owlfactory = manager.getOWLDataFactory();
		OWLNamedIndividual indiLanguageAD1 = fac.getOWLNamedIndividual(IRI.create(languageAD1.getUri()));
		OWLNamedIndividual indiLanguageAD2 = fac.getOWLNamedIndividual(IRI.create(languageAD2.getUri()));
		// ////////////////////////////
		// //////////////////////////
		// Generate Transformation rule:
		// /////////////////////////
		// //////////////////////////////
		// //////////////////////////
		// 1. get root element and usedReference
		// ///////////////////////
		OWLObjectProperty op_rootelement = owlfactory
				.getOWLObjectProperty(IRI
						.create("http://www.obeonetwork.org/ontologies/spem/ifest.owl#ArtifactDefinition_rootElement"));
		OWLIndividual element = indiMethodArtDef1
				.getObjectPropertyValues(op_rootelement, merged).iterator()
				.next();
		// System.out.println(owlinArtdef1 + " have root element: ");

		// System.out.println(element.toStringID().substring(
		// element.toStringID().indexOf("#") + 1));

		OWLObjectProperty op_usedReference = owlfactory
				.getOWLObjectProperty(IRI
						.create("http://www.obeonetwork.org/ontologies/spem/ifest.owl#ArtifactDefinition_useReference"));
		Set<OWLIndividual> setReference = indiMethodArtDef1.getObjectPropertyValues(
				op_usedReference, merged);
		// ///////////////////
		// 2. get classMapping
		// /////////////////
		Set<Mapping> classMapping = new HashSet<Mapping>();
		Set<Mapping> referenceMapping = new HashSet<Mapping>();
		NodeSet<OWLNamedIndividual> individualsNodeSet = reasoner.getObjectPropertyValues(indiMetaModel1, METAMODEL.EPACKAGE_ECLASSIFIERS);
		Set<OWLNamedIndividual> individuals = individualsNodeSet.getFlattened();
		for (OWLNamedIndividual ind : individuals) {	
			NodeSet<OWLNamedIndividual> list_map = reasoner
					.getObjectPropertyValues(ind, propEClass_Correspond);
			Set<OWLNamedIndividual> list = list_map.getFlattened();
			Mapping m = null;
			for (OWLNamedIndividual ind2 : list) {

				if (reasoner.getObjectPropertyValues(ind2, op_itsMetaModel)
						.containsEntity((OWLNamedIndividual) indiMetaModel2)) {
					m = new Mapping();
					m.setSource(ind);
					m.setTarget(ind2);
					classMapping.add(m);
					// System.out.println("correspond with BlueBee:");
					// printShortIRI(ind2);
					// System.out.println();
				}
			}
			if (m!=null)
			{
				NodeSet<OWLNamedIndividual> list_reference = reasoner.getObjectPropertyValues(ind, propEClass_eAllReferences);
				
				for (OWLNamedIndividual indReference : list_reference.getFlattened())
				{
					if (findMappingResult(referenceMapping, indReference)!=null)
					{
						continue;
					}
					NodeSet<OWLNamedIndividual> referencemappings = reasoner
							.getObjectPropertyValues(indReference, propEReferencecorrespond);
					Mapping m_ref = null;
					for (OWLNamedIndividual ind2 : referencemappings.getFlattened()) {
							if (reasoner.getObjectPropertyValues(m.getTarget().asOWLNamedIndividual(), propEClass_eAllReferences).containsEntity(ind2))
							{
								m_ref = new Mapping();
								m_ref.setSource(indReference);
								m_ref.setTarget(ind2);
								referenceMapping.add(m_ref);
						}
					}
				}
			}
		}
	
		System.out.println("retrieve mapping successfully");
		lstUnMappedElement=findUnMappedElement(manager, merged, reasoner, element, setReference, classMapping, referenceMapping);
		for (int i=0;i<lstUnMappedElement.size()-1;i++)
		{
			for (int j=i+1;j<lstUnMappedElement.size();j++)
			{
				if (lstUnMappedElement.get(i).equals(lstUnMappedElement.get(j)))
				{
					lstUnMappedElement.remove(j);
					j--;
				}
			}
		}
		return lstUnMappedElement;
	}
	private  void print(Node<OWLClass> parent, OWLReasoner reasoner,
			int depth) {
		// We don't want to print out the bottom node (containing owl:Nothing
		// and unsatisfiable classes)
		// because this would appear as a leaf node everywhere
		if (parent.isBottomNode()) {
			return;
		}
		// Print an indent to denote parent-child relationships
		printIndent(depth);
		// Now print the node (containing the child classes)
		printNode(parent);
		for (Node<OWLClass> child : reasoner.getSubClasses(
				parent.getRepresentativeElement(), true)) {
			// Recurse to do the children. Note that we don't have to worry
			// about cycles as there
			// are non in the inferred class hierarchy graph - a cycle gets
			// collapsed into a single
			// node since each class in the cycle is equivalent.
			print(child, reasoner, depth + 1);
		}
	}

	private  void printIndent(int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("    ");
		}
	}

	private  DefaultPrefixManager pm = new DefaultPrefixManager(
			"http://www.obeonetwork.org/ontologies/spem/ifest.owl#");

	private  void printNode(Node<OWLClass> node) {
		// Print out a node as a list of class names in curly brackets
		System.out.print("{");
		for (Iterator<OWLClass> it = node.getEntities().iterator(); it
				.hasNext();) {
			OWLClass cls = it.next();
			// User a prefix manager to provide a slightly nicer shorter name
			System.out.print(pm.getShortForm(cls));
			if (it.hasNext()) {
				System.out.print(" ");
			}
		}
		System.out.println("}");
	}

	OWLOntologyManager manager;

	public void generateTransformation(ArtifactTransformation input)
			throws Exception {
		String ifestURI = RepositoryHelper.ISPEM_METACLASS_CONTEXT;
		String mappingURI = "http://www.spem-ifest.org/ontology/metamodel/mapping.owl";
		String metamodeURI = RepositoryHelper.METAMODEL_METACLASS_CONTEXT;
		manager = OWLManager.createOWLOntologyManager();
		manager.addMissingImportListener(new MissingImportListener() {

			public void importMissing(MissingImportEvent arg0) {
				// TODO Auto-generated method stub
				try {
					
					System.out.println("missing ontology: "+arg0.getImportedOntologyURI());
					DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			        Date date = new Date();
					String filename = "D://Working/Ontologies/Temp/importtempfile_"+dateFormat.format(date)+".owl";
				if(RepositoryHelper.getOntologyWithName(arg0
						.getImportedOntologyURI().toString(), filename))
				{
					File file = new File(filename);
					OWLOntology ont = manager.loadOntologyFromOntologyDocument(file);
					Set<OWLOntology> ontologies = ont.getDirectImports();
					for (OWLOntology o:ontologies)
					{
						manager.addAxioms(ont, o.getAxioms());
					}
					System.out.println("import missing ontology: "+ont.toString());
					file.delete();
				}
					
				} catch (OWLOntologyCreationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		manager.setSilentMissingImportsHandling(true);
		OWLDataFactory fac = manager.getOWLDataFactory();
		IRI iri = IRI
				.create("http://sqwrl.stanford.edu/ontologies/built-ins/3.4/sqwrl.owl");
		File file = new File("D://Working/ontologies/lib/sqwrl.owl");
		manager.addIRIMapper(new SimpleIRIMapper(iri, IRI.create(file)));
		iri = IRI.create("http://swrl.stanford.edu/ontologies/3.3/swrla.owl");
		file = new File("D://Working/ontologies/lib/swrla.owl");
		manager.addIRIMapper(new SimpleIRIMapper(iri, IRI.create(file)));
		RepositoryHelper.getOWL(RepositoryHelper.METAMODEL_METACLASS_CONTEXT,
				tempFile);

		OWLOntology ont = manager.loadOntologyFromOntologyDocument(new File(
				tempFile));
		System.out.println("load ontology: " + ont.toString());
		RepositoryHelper.getOWL(RepositoryHelper.ISPEM_METACLASS_CONTEXT,
				tempFile);
		manager.addAxioms(ont, manager.loadOntologyFromOntologyDocument(new File(tempFile)).getAxioms());
		System.out.println("load ontology: " + ont.toString());
	
		RepositoryHelper.getOWL(mappingURI, tempFile);
		manager.addAxioms(ont, manager.loadOntologyFromOntologyDocument(new File(tempFile)).getAxioms());
		System.out.println(ont.toString());
		OWLImportsDeclaration importDeclaraton =
				   fac.getOWLImportsDeclaration(IRI.create(metamodeURI));
				manager.applyChange(new AddImport(ont, importDeclaraton));
		
				LanguageArtifactDefinition languageAD1 = ((LanguageArtifactDefinition) input.getSource()
						.getWorkProduct());
				LanguageArtifactDefinition languageAD2 = ((LanguageArtifactDefinition) input.getTarget()
						.getWorkProduct());

		////////////////////////////////
		///////// get 2 metamodel/////////
		////////////////////////////////////
		//meta model 1
		String ontologyID = RepositoryHelper.getOWLOntologyID(languageAD1.getSpecializedBy().getUri());
		if (ontologyID!=null)
		{
			if (!manager.contains(IRI.create(ontologyID)))
			{
				RepositoryHelper.getOntologyWithResource(languageAD1.getSpecializedBy().getUri(), tempFile);
				manager.addAxioms(ont, manager.loadOntologyFromOntologyDocument(new File(tempFile)).getAxioms());
				System.out.println(ont.toString());
			}
		}
		
		OWLObjectProperty propUsedMetaModel = fac
				.getOWLObjectProperty(IRI
						.create("http://www.obeonetwork.org/ontologies/spem/ifest.owl#ArtifactDefinition_usedMetaModel"));
		OWLNamedIndividual indiMethodArtDef1 = fac.getOWLNamedIndividual(IRI.create(languageAD1.getSpecializedBy().getUri()));
		OWLNamedIndividual indiMetaModel1 = (OWLNamedIndividual) indiMethodArtDef1.getObjectPropertyValues(propUsedMetaModel, ont).iterator().next();
		//meta model 2
		ontologyID = RepositoryHelper.getOWLOntologyID(languageAD1.getSpecializedBy().getUri());
		if (ontologyID!=null)
		{
			if (!manager.contains(IRI.create(ontologyID)))
			{
				RepositoryHelper.getOntologyWithResource(languageAD2.getSpecializedBy().getUri(), tempFile);
				manager.addAxioms(ont, manager.loadOntologyFromOntologyDocument(new File(tempFile)).getAxioms());
				System.out.println(ont.toString());
			}
		}
		
		OWLNamedIndividual indiMethodArtDef2 = fac.getOWLNamedIndividual(IRI.create(languageAD2.getSpecializedBy().getUri()));
		OWLNamedIndividual indiMetaModel2 = (OWLNamedIndividual) indiMethodArtDef2.getObjectPropertyValues(propUsedMetaModel, ont).iterator().next();
		/////////////////////////////////////////////////////////
		///////////get representation language metamode//////////
		/////////////////////////////////////////////////////////
		String language1 = languageAD1.getRepresentedBy().getUri();
		OWLNamedIndividual indiLanguage1 = fac.getOWLNamedIndividual(IRI.create(language1));
		String language2 = languageAD2.getRepresentedBy().getUri();
		OWLNamedIndividual indiLanguage2 = fac.getOWLNamedIndividual(IRI.create(language2));
		//OWLObjectProperty propRepresentedBy = fac.getOWLObjectProperty(IRI.create(ISPEM.LANGUAGEARTIFACTDEFINITION_REPRESENTEDBY));
		OWLObjectProperty propUsedMetaModel2 = fac.getOWLObjectProperty(IRI.create("http://www.obeonetwork.org/ontologies/spem/ifest.owl#RepresentationLanguage_usedMetaModel")); 
		Set<OWLIndividual> setIndividuals = indiLanguage1.getObjectPropertyValues(propUsedMetaModel2, ont);
		//System.out.println(ont.getAxioms().toString());
		if (setIndividuals.size()==0)
		{
			throw new Exception("No Representation Language <"+language1+"> MetaModel");
		}
		OWLNamedIndividual indiLanguageMM1 = setIndividuals.iterator().next().asOWLNamedIndividual();
		setIndividuals = indiLanguage2.getObjectPropertyValues(propUsedMetaModel2, ont);
		if (setIndividuals.size()==0)
		{
			throw new Exception("No Representation Language <"+language2+"> MetaModel");
		}
		OWLNamedIndividual indiLanguageMM2 = setIndividuals.iterator().next().asOWLNamedIndividual();
		// ////////////////////////////////////
		// /////////////////////////////////////
		// /Create rule//////////////////////////
		// ////////////////////////////////////////
		OWLObjectProperty op_hasClass = METAMODEL.EPACKAGE_ECLASSIFIERS;
		OWLObjectProperty op_itsMetaModel = METAMODEL.ECLASSIFIER_EPACKAGE;
	
		// ////////////////////
		// mapping inference rule
		// //////////////////////////
		//class
		SWRLVariable varX = fac.getSWRLVariable(IRI.create(ifestURI + "#x"));
		SWRLVariable varY = fac.getSWRLVariable(IRI.create(ifestURI + "#y"));
		SWRLObjectPropertyAtom propAtom1;
		SWRLObjectPropertyAtom propAtom2 ;
		OWLClass eclass = METAMODEL.ECLASS;
		OWLClass reference = METAMODEL.EREFERENCE;
		OWLObjectProperty propClassSpecializedBy = METAMODEL.ECLASS_SPECIALIZEDBY;
		OWLObjectProperty op_class = METAMODEL.EPACKAGE_ECLASSIFIERS;
		OWLObjectProperty propEClassCorrespond = METAMODEL.ECLASS_CORRESPONDENCE;
		SWRLVariable varZ = fac.getSWRLVariable(IRI.create(ifestURI + "#z"));
		propAtom1 = fac.getSWRLObjectPropertyAtom(op_class,
				fac.getSWRLIndividualArgument(indiMetaModel1), varX);
		propAtom2 = fac.getSWRLObjectPropertyAtom(op_class,
				fac.getSWRLIndividualArgument(indiMetaModel2), varY);
		SWRLObjectPropertyAtom propAtom3 = fac.getSWRLObjectPropertyAtom(
				propClassSpecializedBy, varX, varZ);
		SWRLObjectPropertyAtom propAtom4 = fac.getSWRLObjectPropertyAtom(
				propClassSpecializedBy, varY, varZ);
		SWRLObjectPropertyAtom propAtom5 = fac.getSWRLObjectPropertyAtom(
				propEClassCorrespond, varX, varY);
		Set<SWRLAtom> antecedent = new HashSet<SWRLAtom>();
		antecedent.add(propAtom1);
		antecedent.add(propAtom2);
		antecedent.add(propAtom3);
		antecedent.add(propAtom4);
		SWRLRule rule3 = fac.getSWRLRule(antecedent,
				Collections.singleton(propAtom5));
		manager.applyChange(new AddAxiom(ont, rule3));
		
		//reference
		OWLObjectProperty ob_referencemap = METAMODEL.EREFERENCE_SPECIALIZEDBY;
		OWLObjectProperty propreferencecorrespond = METAMODEL.EREFERENCE_CORRESPONDENCE;
		OWLObjectProperty propEClass_eAllReferences = METAMODEL.ECLASS_EALLREFERENCES;
		SWRLVariable varA = fac.getSWRLVariable(IRI.create(ifestURI + "#a"));
		SWRLVariable varB = fac.getSWRLVariable(IRI.create(ifestURI + "#b"));
		propAtom1 = fac.getSWRLObjectPropertyAtom(op_class,
				fac.getSWRLIndividualArgument(indiMetaModel1), varX);
		propAtom2 = fac.getSWRLObjectPropertyAtom(op_class,
				fac.getSWRLIndividualArgument(indiMetaModel2), varY);
		propAtom3 = fac.getSWRLObjectPropertyAtom(propEClass_eAllReferences, varX, varA);
		propAtom4 = fac.getSWRLObjectPropertyAtom(propEClass_eAllReferences, varY, varB);
		propAtom5 = fac.getSWRLObjectPropertyAtom(ob_referencemap, varA, varZ);
		SWRLObjectPropertyAtom propAtom6 = fac.getSWRLObjectPropertyAtom(ob_referencemap, varB, varZ);
		SWRLObjectPropertyAtom propAtom7 = fac.getSWRLObjectPropertyAtom(propreferencecorrespond, varA, varB);
		antecedent = new HashSet<SWRLAtom>();
		antecedent.add(propAtom1);
		antecedent.add(propAtom2);
		antecedent.add(propAtom3);
		antecedent.add(propAtom4);
		antecedent.add(propAtom5);
		antecedent.add(propAtom6);
		SWRLRule rule4 = fac.getSWRLRule(antecedent,
				Collections.singleton(propAtom7));
		manager.applyChange(new AddAxiom(ont, rule4));
	
		
		
		OWLOntologyMerger merger = new OWLOntologyMerger(manager);
		OWLOntology merged = merger.createMergedOntology(manager,
				IRI.create("http://mergedontology.com"));
		manager.saveOntology(merged, new RDFXMLOntologyFormat(), IRI.create((new File (tempFile)).toURI()));
		
		OWLReasonerFactory reasonerFactory = new PelletReasonerFactory();

		// We'll now create an instance of an OWLReasoner (the implementation
		// being provided by HermiT as
		// we're using the HermiT reasoner factory). The are two categories of
		// reasoner, Buffering and
		// NonBuffering. In our case, we'll create the buffering reasoner, which
		// is the default kind of reasoner.
		// We'll also attach a progress monitor to the reasoner. To do this we
		// set up a configuration that
		// knows about a progress monitor.

		// Create a console progress monitor. This will print the reasoner
		// progress out to the console.
		ConsoleProgressMonitor progressMonitor = new ConsoleProgressMonitor();
		// Specify the progress monitor via a configuration. We could also
		// specify other setup parameters in
		// the configuration, and different reasoners may accept their own
		// defined parameters this way.
		OWLReasonerConfiguration config = new SimpleConfiguration(
				progressMonitor);
		// Create a reasoner that will reason over our ontology and its imports
		// closure. Pass in the configuration.
		OWLReasoner reasoner = reasonerFactory.createReasoner(merged, config);

		// Ask the reasoner to do all the necessary work now
		reasoner.precomputeInferences();
		// We can determine if the ontology is actually consistent (in this
		// case, it should be).
		boolean consistent = reasoner.isConsistent();
		System.out.println("Consistent: " + consistent);
		//System.out.println("\n");
		
		// We can easily get a list of unsatisfiable classes. (A class is
		// unsatisfiable if it
		// can't possibly have any instances). Note that the
		// getUnsatisfiableClasses method
		// is really just a convenience method for obtaining the classes that
		// are equivalent
		// to owl:Nothing. In our case there should be just one unsatisfiable
		// class - "mad_cow"
		// We ask the reasoner for the unsatisfiable classes, which returns the
		// bottom node
		// in the class hierarchy (an unsatisfiable class is a subclass of every
		// class).
		Node<OWLClass> bottomNode = reasoner.getUnsatisfiableClasses();
		// This node contains owl:Nothing and all the classes that are
		// equivalent to owl:Nothing -
		// i.e. the unsatisfiable classes.
		// We just want to print out the unsatisfiable classes excluding
		// owl:Nothing, and we can
		// used a convenience method on the node to get these
		Set<OWLClass> unsatisfiable = bottomNode.getEntitiesMinusBottom();
		if (!unsatisfiable.isEmpty()) {
			System.out.println("The following classes are unsatisfiable: ");
			for (OWLClass cls : unsatisfiable) {
				System.out.println("    " + cls);
			}
		} else {
			System.out.println("There are no unsatisfiable classes");
		}
		System.out.println("\n");
		OWLDataFactory owlfactory = manager.getOWLDataFactory();
		OWLNamedIndividual indiLanguageAD1 = fac.getOWLNamedIndividual(IRI.create(languageAD1.getUri()));
		OWLNamedIndividual indiLanguageAD2 = fac.getOWLNamedIndividual(IRI.create(languageAD2.getUri()));
		//printArtifactDefinitionStructure(indiMethodArtDef1, indiLanguageMM1, reasoner, manager);
		// get artifact definition 2

		//printArtifactDefinitionStructure(indiMethodArtDef2, indiLanguageMM2, reasoner, manager);
		// ////////////////////////////
		// //////////////////////////
		// Generate Transformation rule:
		// /////////////////////////
		// //////////////////////////////
		System.out.println("Generate the transformation from ");
		printShortIRI(indiMethodArtDef1);
		System.out.print(" to ");
		printShortIRI(indiMethodArtDef2);
		// //////////////////////////
		// 1. get root element and usedReference
		// ///////////////////////
		OWLObjectProperty op_rootelement = owlfactory
				.getOWLObjectProperty(IRI
						.create("http://www.obeonetwork.org/ontologies/spem/ifest.owl#ArtifactDefinition_rootElement"));
		OWLIndividual element = indiMethodArtDef1
				.getObjectPropertyValues(op_rootelement, merged).iterator()
				.next();
		// System.out.println(owlinArtdef1 + " have root element: ");

		// System.out.println(element.toStringID().substring(
		// element.toStringID().indexOf("#") + 1));

		OWLObjectProperty op_usedReference = owlfactory
				.getOWLObjectProperty(IRI
						.create("http://www.obeonetwork.org/ontologies/spem/ifest.owl#ArtifactDefinition_useReference"));
		Set<OWLIndividual> setReference = indiMethodArtDef1.getObjectPropertyValues(
				op_usedReference, merged);
		// ///////////////////
		// 2. get classMapping
		// /////////////////
		// ///////////////////
				// 2. get classMapping
				// /////////////////
				Set<Mapping> classMapping = new HashSet<Mapping>();
				Set<Mapping> referenceMapping = new HashSet<Mapping>();
				NodeSet<OWLNamedIndividual> individualsNodeSet = reasoner.getObjectPropertyValues(indiMetaModel1, METAMODEL.EPACKAGE_ECLASSIFIERS);
				Set<OWLNamedIndividual> individuals = individualsNodeSet.getFlattened();
				for (OWLNamedIndividual ind : individuals) {	
					NodeSet<OWLNamedIndividual> list_map = reasoner
							.getObjectPropertyValues(ind, propEClassCorrespond);
					Set<OWLNamedIndividual> list = list_map.getFlattened();
					Mapping m = null;
					for (OWLNamedIndividual ind2 : list) {

						if (reasoner.getObjectPropertyValues(ind2, op_itsMetaModel)
								.containsEntity((OWLNamedIndividual) indiMetaModel2)) {
							m = new Mapping();
							m.setSource(ind);
							m.setTarget(ind2);
							classMapping.add(m);
							// System.out.println("correspond with BlueBee:");
							// printShortIRI(ind2);
							// System.out.println();
						}
					}
					if (m!=null)
					{
						NodeSet<OWLNamedIndividual> list_reference = reasoner.getObjectPropertyValues(ind, propEClass_eAllReferences);
						
						for (OWLNamedIndividual indReference : list_reference.getFlattened())
						{
							if (findMappingResult(referenceMapping, indReference)!=null)
							{
								continue;
							}
							NodeSet<OWLNamedIndividual> referencemappings = reasoner
									.getObjectPropertyValues(indReference, propreferencecorrespond);
							Mapping m_ref = null;
							for (OWLNamedIndividual ind2 : referencemappings.getFlattened()) {
									if (reasoner.getObjectPropertyValues(m.getTarget().asOWLNamedIndividual(), propEClass_eAllReferences).containsEntity(ind2))
									{
										m_ref = new Mapping();
										m_ref.setSource(indReference);
										m_ref.setTarget(ind2);
										referenceMapping.add(m_ref);
								}
							}
						}
					}
				}
		System.out.println("retrieve mapping successfully");
		// //////////////////////
		// 4. generate transformation
		// //////////////////////////
		String sourcePrefix = getName(indiMetaModel1, merged, manager);
		String sourceLangPrefix = getName(indiLanguageMM1, merged, manager);
		String targetPrefix = getName(indiMetaModel2, merged, manager);
		String targetLangPrefix = getName(indiLanguageMM2, merged, manager);
		File path = new File(rsPath);
		String filename = printShortIRI(indiLanguageAD1)+"_to_"+printShortIRI(indiLanguageAD2)+".txt";
		input.setTransformationFile(filename);
		File newfile = new File(path, filename);
		FileOutputStream fos = new FileOutputStream(newfile);
		
		OutputStreamWriter out = new OutputStreamWriter(fos, "UTF-8");
		generateTransformationRules(manager, merged, reasoner,indiLanguageMM1,indiLanguageMM2,element, setReference,
				classMapping, referenceMapping, sourcePrefix,sourceLangPrefix,targetPrefix,targetLangPrefix,0,out);
		out.close();
		fos.close();
		
	}

	private void printArtifactDefinitionStructure(
			OWLIndividual artifactDefinition, OWLIndividual language, OWLReasoner ont,
			OWLOntologyManager manager) throws Exception {
		OWLDataFactory owlfactory = manager.getOWLDataFactory();
		
		OWLObjectProperty op_rootelement = owlfactory
				.getOWLObjectProperty(IRI
						.create("http://www.obeonetwork.org/ontologies/spem/ifest.owl#ArtifactDefinition_rootElement"));
		OWLIndividual element = ont.getObjectPropertyValues(artifactDefinition.asOWLNamedIndividual(), op_rootelement).getFlattened().iterator().next();
		System.out.println(artifactDefinition + " have root element: ");

		System.out.println(element.toStringID().substring(
				element.toStringID().indexOf("#") + 1));

		OWLObjectProperty op_usedReference = owlfactory
				.getOWLObjectProperty(IRI
						.create("http://www.obeonetwork.org/ontologies/spem/ifest.owl#ArtifactDefinition_useReference"));
		Set<OWLNamedIndividual> setReference = ont.getObjectPropertyValues(artifactDefinition.asOWLNamedIndividual(), op_usedReference).getFlattened();
		System.out.println(artifactDefinition + " uses references: ");
		for (OWLIndividual i : setReference) {
			System.out.println(i.toStringID().substring(
					i.toStringID().indexOf("#") + 1));
		}
		System.out.println("Compute structure:");
		printStructure(element, language, ont, manager, 0, setReference);
	}
	private OWLIndividual getEClassRepresentationType(OWLIndividual element, OWLIndividual language, OWLReasoner reasoner)
	{
		OWLIndividual rs= null;
		OWLDataFactory factory = manager.getOWLDataFactory();
		OWLObjectProperty propRepresentedBy = METAMODEL.ENAMEDELEMENT_REPRESENTEDBY;
		Set<OWLNamedIndividual> setIndividual = reasoner.getObjectPropertyValues(element.asOWLNamedIndividual(), propRepresentedBy).getFlattened();
		if (setIndividual.size()==0)
		{
			return rs;
		}
		for (OWLNamedIndividual i : setIndividual)
		{
			OWLObjectProperty propItsMetaModel = METAMODEL.ECLASSIFIER_EPACKAGE;
			Set<OWLNamedIndividual> itsmetamodel = reasoner.getObjectPropertyValues(i, propItsMetaModel).getFlattened();
			if (itsmetamodel.contains(language))
			{
				rs = i;
				break;
			}
		}
		return rs;
	}
	private OWLIndividual getEReferenceRepresentationType(OWLIndividual eclassElement, OWLIndividual ereferenceElement, OWLIndividual language, OWLReasoner reasoner)
	{
		OWLIndividual rs= null;
		OWLDataFactory factory = manager.getOWLDataFactory();
		OWLIndividual indiLanguageClass = getEClassRepresentationType(eclassElement, language, reasoner);
		Set<OWLNamedIndividual> references = reasoner.getObjectPropertyValues(indiLanguageClass.asOWLNamedIndividual(), METAMODEL.ECLASS_EALLREFERENCES).getFlattened();
		OWLObjectProperty propRepresentedBy = METAMODEL.ENAMEDELEMENT_REPRESENTEDBY;
		Set<OWLNamedIndividual> representations = reasoner.getObjectPropertyValues(ereferenceElement.asOWLNamedIndividual(), propRepresentedBy).getFlattened();  
		if (representations.size()==0)
		{
			return rs;
		}
		for (OWLNamedIndividual i : representations)
		{
			if (references.contains(i))
			{
				rs = i;
				break;
			}
		}
		return rs;
	}
	
	private void printStructure(OWLIndividual parentElement, OWLIndividual language, OWLReasoner reasoner,
			OWLOntologyManager manager, int level,
			Set<OWLNamedIndividual> usedReference) throws Exception {
		if (parentElement == null)
			return;
		List<ArtifactDefinitionStructure> artifactDefinitionStructures = new ArrayList<ArtifactDefinitionStructure>();
		OWLDataFactory factory = manager.getOWLDataFactory();
		

		// for (int i = 0; i < level; i++)
		 System.out.print("--");
		OWLIndividual represent = getEClassRepresentationType(parentElement, language, reasoner);
		if (represent==null)
		{
			//throw new Exception("This element has no relevant representation type: <"+ parentElement.toStringID()+">");
			System.out.print("<"+printShortIRI(parentElement)+"(represent element not found) ");
		}
		else
		{
			System.out.print("<" + printShortIRI(represent)+"("+printShortIRI(parentElement)+")");	
		}
		OWLClass classReference = METAMODEL.EREFERENCE;
		OWLObjectProperty op_references =METAMODEL.ECLASS_EALLREFERENCES;
		OWLNamedIndividual owlclass=parentElement.asOWLNamedIndividual();
		if(reasoner.getTypes(parentElement.asOWLNamedIndividual(), true).containsEntity(classReference))
		{
			OWLObjectProperty propOwnedType = METAMODEL.EREFERENCE_EREFERENCETYPE;
			OWLNamedIndividual indiType = reasoner.getObjectPropertyValues(parentElement.asOWLNamedIndividual(), propOwnedType).getFlattened().iterator().next();
			OWLIndividual represented = getEClassRepresentationType(indiType, language, reasoner);
			if (represented!=null)
				System.out.print(" type=\""+printShortIRI(represented)+"\"("+printShortIRI(indiType)+") ");
			else
				System.out.print(" type=\""+printShortIRI(indiType)+"\"(represent element not found) ");
			owlclass = reasoner.getObjectPropertyValues(parentElement.asOWLNamedIndividual(), propOwnedType).getFlattened()
					.iterator().next();
		}
		
		Set<OWLNamedIndividual> setReference = reasoner.getObjectPropertyValues(owlclass.asOWLNamedIndividual(), op_references).getFlattened();
		

		for (OWLNamedIndividual i : setReference) {
			if (usedReference.contains(i) == false)
				continue;
			// System.out.print(" <<"
			// + i.toStringID().substring(i.toStringID().indexOf("#") + 1)
			// + ">> ");
			OWLObjectProperty propOwnedType = METAMODEL.EREFERENCE_EREFERENCETYPE;
			OWLNamedIndividual ref_class = reasoner.getObjectPropertyValues(i, propOwnedType).getFlattened()
					.iterator().next();
			
			OWLDataProperty op_isContaining = METAMODEL.EREFERENCE_CONTAINMENT;
			Set<OWLLiteral> setLit = reasoner.getDataPropertyValues(i, op_isContaining);
			if (!setLit.isEmpty()) {
				boolean isContaining = setLit.iterator().next().parseBoolean();
				if (!isContaining) {
					OWLIndividual refType = getEClassRepresentationType(i, language, reasoner);
					if (refType==null)
					{
						//throw new Exception("This reference has no relevant representation type: <"+ i.toStringID()+">");
						System.out.print("\t"+ printShortIRI(i)+"(represent element not found) =\"");
					}
					else
					{
						System.out.print("\t"+printShortIRI(refType)+"("+printShortIRI(i)+") =\"");
					}					
					OWLIndividual classType = getEClassRepresentationType(ref_class, language, reasoner);
					if (classType==null)
					{
						//throw new Exception("This class has no relevant representation type: <"+ i.toStringID()+">");
						System.out.print(printShortIRI(ref_class)+"(represent element not found)\" ");
					}
					else
					{
						System.out.print(printShortIRI(classType)+"("+printShortIRI(ref_class)+")\" ");
					}
				}
			}

		}

		System.out.print(">");
		System.out.println();
		for (OWLNamedIndividual i : setReference) {
			if (usedReference.contains(i) == false)
				continue;
			// System.out.print(" <<"
			// + i.toStringID().substring(i.toStringID().indexOf("#") + 1)
			// + ">> ");
			OWLObjectProperty propOwnedType = METAMODEL.EREFERENCE_EREFERENCETYPE;
			OWLNamedIndividual ref_class = reasoner.getObjectPropertyValues(i, propOwnedType).getFlattened()
					.iterator().next();
			OWLDataProperty op_isContaining = METAMODEL.EREFERENCE_CONTAINMENT;
			Set<OWLLiteral> setLit = reasoner.getDataPropertyValues(i, op_isContaining);
			if (!setLit.isEmpty()) {
				boolean isContaining = setLit.iterator().next().parseBoolean();
				if (isContaining) {
					printStructure(i, language, reasoner, manager, level + 1,
							usedReference);
				}

			} else {
				printStructure(i,language, reasoner, manager, level + 1,
						usedReference);
			}

		}
		if (represent!=null)
			System.out.print("</" + printShortIRI(represent));
		else
			System.out.print("</" + printShortIRI(parentElement));

		System.out.print(">");
		System.out.println();
		return;
	}
	
	private void generateTransformationRules(OWLOntologyManager man, OWLOntology ont, OWLReasoner reasoner, OWLIndividual sourceLanguage, OWLIndividual targetLanguage,
			OWLIndividual rootElement, Set<OWLIndividual> usedReference,
			Set<Mapping> classMapping, Set<Mapping> referenceMapping, String sourcePrefix, String sourceLangPrefix, String targetPrefix, String targetLangPrefix, int level, OutputStreamWriter out) throws IOException {
		if (rootElement == null)
			return;
		// find all references of rootElement are contains in usedReference
		String s1 = "";
		String role="";
		boolean noCorrespond = false;
		boolean isContinue=true;
		//OWLNamedIndividual source_represent = getRepresentationType(rootElement, sourceLanguage, ont).asOWLNamedIndividual();
		OWLIndividual represent1=null;
		if(rootElement.getTypes(ont).contains(METAMODEL.EREFERENCE))
				{
			OWLIndividual indiContainingClass = reasoner.getObjectPropertyValues(rootElement.asOWLNamedIndividual(), METAMODEL.ESTRUCTURALFEATUER_ECONTAININGCLASS).getFlattened().iterator().next();		
			represent1 = getEReferenceRepresentationType(indiContainingClass, rootElement, sourceLanguage, reasoner);
				}
		else
		{
			represent1 = getEClassRepresentationType(rootElement, sourceLanguage, reasoner);	
		}
		
		String element="";
		role="<role>\n<"+sourcePrefix+":"+printShortIRI(rootElement);
		if (represent1==null)
		{
			element="empty";
			//throw new Exception("This element has no relevant representation type: <"+ parentElement.toStringID()+">");
			s1=s1+"<" +":empty ";
		}
		else
		{
			element=sourceLangPrefix+":"+printShortIRI(represent1);
			s1 =s1+ "<" + sourceLangPrefix+":"+printShortIRI(represent1);
		}
		OWLClass classReference = METAMODEL.EREFERENCE;
		OWLObjectProperty op_references =METAMODEL.ECLASS_EALLREFERENCES;
		OWLNamedIndividual owlclass=rootElement.asOWLNamedIndividual();
		OWLIndividual correspondElement;
		if(rootElement.getTypes(ont).contains(classReference))
		{
			OWLObjectProperty propOwnedType = METAMODEL.EREFERENCE_EREFERENCETYPE;
			
			OWLNamedIndividual indiType = rootElement.getObjectPropertyValues(propOwnedType, ont).iterator().next().asOWLNamedIndividual();
			OWLIndividual represented = getEClassRepresentationType(indiType, sourceLanguage, reasoner);
			role=role+" type=\""+sourcePrefix+":"+printShortIRI(indiType)+"\"/></role>\n";
			if (represented!=null)
				s1=s1+" type=\""+sourceLangPrefix+":"+printShortIRI(represented)+"\">\n";
			else
				s1=s1+" type=\"empty\""+ ">\n";
			
			owlclass=indiType;
			correspondElement = findMappingResult(referenceMapping, rootElement);
			OWLDataProperty op_isContaining = METAMODEL.EREFERENCE_CONTAINMENT;
			Set<OWLLiteral> setLit = rootElement.getDataPropertyValues(op_isContaining,
					ont);
			if (!setLit.isEmpty())
			{
				boolean isContaining = setLit.iterator().next().parseBoolean();
				if (!isContaining)
				{
					isContinue=false;
				}
			}
		}
		else
		{
			s1=s1+">\n";
			role+="/></role>\n";
			correspondElement = findMappingResult(classMapping, rootElement);
		}
		out.append(s1);
		out.append(role);
		s1="<TransformTo>\n";
		
		OWLIndividual represent2=null;
		if (correspondElement == null)
			noCorrespond = true;
		if (!noCorrespond)
			{
			role="<role>\n";
			if(correspondElement.getTypes(ont).contains(METAMODEL.EREFERENCE))
			{
				OWLIndividual indiContainingClass = reasoner.getObjectPropertyValues(correspondElement.asOWLNamedIndividual(), METAMODEL.ESTRUCTURALFEATUER_ECONTAININGCLASS).getFlattened().iterator().next();		
				represent2 = getEReferenceRepresentationType(indiContainingClass, correspondElement, targetLanguage, reasoner);
			}
			else
			{
				represent2 = getEClassRepresentationType(correspondElement, targetLanguage, reasoner);
			}
			role=role+"<"+targetPrefix+":"+printShortIRI(correspondElement);
			if (represent2!=null)
			{
				s1 = s1+"<"	+targetLangPrefix+":"				
					+ printShortIRI(represent2)+"\"";
				
			}
			else
				s1=s1+" type=\"empty\"";
			if(correspondElement.getTypes(ont).contains(classReference))
			{
				OWLObjectProperty propOwnedType = METAMODEL.EREFERENCE_EREFERENCETYPE;
				OWLNamedIndividual sourceindiType = rootElement.getObjectPropertyValues(propOwnedType, ont).iterator().next().asOWLNamedIndividual();
				OWLNamedIndividual indiType = correspondElement.getObjectPropertyValues(propOwnedType, ont).iterator().next().asOWLNamedIndividual();
				OWLIndividual indiTypeCorrespond = findMappingResult(classMapping, sourceindiType);
				OWLIndividual represented;
				if (indiTypeCorrespond!=null)
					represented = getEClassRepresentationType(indiTypeCorrespond, targetLanguage, reasoner);
				else
					represented = getEClassRepresentationType(indiType, targetLanguage, reasoner);
				role=role+" type=\""+targetPrefix+":"+printShortIRI(indiType)+"\"/></role>\n";
				if (represented!=null)
					s1=s1+" type=\""+targetLangPrefix+":"+printShortIRI(represented)+"\"/>\n";
				else
					s1=s1+" type=\"empty\""+"/>\n";
				
				//owlclass=indiType;
				
			}
			else
			{
				s1=s1+"/>\n";
				role=role+"/></role>\n";
			}
			}
		s1=s1+role+"</TransformTo>\n";
		out.append(s1);
		OWLDataFactory owlfactory = man.getOWLDataFactory();
		OWLObjectProperty propReferences = METAMODEL.ECLASS_EALLREFERENCES;
		Set<OWLNamedIndividual> list = reasoner.getObjectPropertyValues(owlclass.asOWLNamedIndividual(), propReferences).getFlattened();
		Set<OWLIndividual> setReference = new HashSet<OWLIndividual>();
		for (OWLIndividual i : list) {

			if (isContainSameIndividual(usedReference, i)) {
				setReference.add(i);
				continue;
			}

		}
		if (isContinue==false)
		{
			out.append("</"+element+">");
			return;
		}
		s1="<Reference>\n";
		out.append(s1);
		// for each reference
		// not contaning element first
		for (OWLIndividual i : setReference) {
			generateTransformationRules(man, ont,reasoner, sourceLanguage,targetLanguage, i, usedReference,
							classMapping, referenceMapping, sourcePrefix,sourceLangPrefix,targetPrefix,targetLangPrefix,level,out);
		}
		out.append("</Reference>\n");
		out.append("</"+element+">\n");
		return;
	}
	private List<String> findUnMappedElement(OWLOntologyManager man,OWLOntology ont, OWLReasoner reasoner,OWLIndividual rootElement, Set<OWLIndividual> usedReference,
			Set<Mapping> classMapping, Set<Mapping> referenceMapping)
			{
				List<String> lstUnMappedElement= new ArrayList<String>();
				if(rootElement==null)
					return lstUnMappedElement;
				// find all references of rootElement are contains in usedReference
				boolean noCorrespond = false;
				//OWLNamedIndividual source_represent = getRepresentationType(rootElement, sourceLanguage, ont).asOWLNamedIndividual();}
				OWLClass classReference = METAMODEL.EREFERENCE;
				OWLObjectProperty op_references =METAMODEL.ECLASS_EALLREFERENCES;
				OWLNamedIndividual owlclass=rootElement.asOWLNamedIndividual();
				OWLIndividual correspondElement;
				if(rootElement.getTypes(ont).contains(classReference))
				{
					OWLObjectProperty propOwnedType = METAMODEL.EREFERENCE_EREFERENCETYPE;
					OWLNamedIndividual indiType = rootElement.getObjectPropertyValues(propOwnedType, ont).iterator().next().asOWLNamedIndividual();			
					owlclass=indiType;
					correspondElement = findMappingResult(referenceMapping, rootElement);
					
				}
				else
					correspondElement = findMappingResult(classMapping, rootElement);
				OWLNamedIndividual represent2=null;
				if (correspondElement == null)
				{
					noCorrespond = true;
					lstUnMappedElement.add(printShortIRI(rootElement));
				}
					
				if (!noCorrespond)
					{
		
					if(correspondElement.getTypes(ont).contains(classReference))
					{
						OWLObjectProperty propOwnedType = METAMODEL.EREFERENCE_EREFERENCETYPE;
						OWLNamedIndividual sourceindiType = rootElement.getObjectPropertyValues(propOwnedType, ont).iterator().next().asOWLNamedIndividual();
						OWLNamedIndividual indiType = correspondElement.getObjectPropertyValues(propOwnedType, ont).iterator().next().asOWLNamedIndividual();
						OWLIndividual indiTypeCorrespond = findMappingResult(classMapping, sourceindiType);
						
						
						//owlclass=indiType;
						
					}
					}
				OWLDataFactory owlfactory = man.getOWLDataFactory();
				OWLObjectProperty propReferences = METAMODEL.ECLASS_EALLREFERENCES;
				Set<OWLNamedIndividual> list = reasoner.getObjectPropertyValues(owlclass.asOWLNamedIndividual(), propReferences).getFlattened();
				Set<OWLIndividual> setReference = new HashSet<OWLIndividual>();
				for (OWLIndividual i : list) {

					if (isContainSameIndividual(usedReference, i)) {
						setReference.add(i);
						continue;
					}

				}
				// for each reference
				// not contaning element first
				for (OWLIndividual i : setReference) {
					if (usedReference.contains(i) == false)
						continue;
					OWLDataProperty op_isContaining = METAMODEL.EREFERENCE_CONTAINMENT;
					Set<OWLLiteral> setLit = i.getDataPropertyValues(op_isContaining,
							ont);
					OWLObjectProperty propOwnedType = METAMODEL.EREFERENCE_EREFERENCETYPE;
					OWLIndividual indiType = i.getObjectPropertyValues(propOwnedType, ont)
							.iterator().next();
					if (!setLit.isEmpty()) {
						boolean isContaining = setLit.iterator().next().parseBoolean();
						if (!isContaining) {
				
					
							if (!noCorrespond) {
								OWLIndividual mappingref = findMappingResult(
										referenceMapping, i);
								if (mappingref==null){
									lstUnMappedElement.add(printShortIRI(i));
								}
								else
									
								{
											
									OWLIndividual indiCorrespond=findMappingResult(classMapping, indiType);
									if (indiCorrespond==null)
										lstUnMappedElement.add(printShortIRI(indiType));
					
									
								}
							}
						}

					}

				}

				for (OWLIndividual i : setReference) {
					if (usedReference.contains(i) == false)
						continue;
					OWLDataProperty op_isContaining = METAMODEL.EREFERENCE_CONTAINMENT;
					Set<OWLLiteral> setLit = i.getDataPropertyValues(op_isContaining,
							ont);
					if (!setLit.isEmpty()) {
						boolean isContaining = setLit.iterator().next().parseBoolean();
						if (isContaining) {
							lstUnMappedElement.addAll(findUnMappedElement(man, ont,reasoner,  i, usedReference,
									classMapping, referenceMapping ));
						}

					} else {
						lstUnMappedElement.addAll(findUnMappedElement(man, ont,reasoner,  i, usedReference,
								classMapping, referenceMapping ));
					}

				}		
				return lstUnMappedElement;
			}
	private boolean isContainSameIndividual(Set<OWLIndividual> set,
			OWLIndividual ind) {
		for (OWLIndividual i : set) {
			if (i.toStringID().equals(ind.toStringID())) {
				return true;
			}
		}
		return false;
	}

	private OWLIndividual findMappingResult(Set<Mapping> setMapping,
			OWLIndividual ind) {
		for (Mapping m : setMapping) {
			if (ind.toStringID().equals(m.getSource().toStringID())) {
				return m.getTarget();
			}
			if (ind.toStringID().equals(m.getTarget().toStringID())) {
				return m.getSource();
			}
		}
		return null;
	}

	private String printShortIRI(OWLIndividual owlIndividual) {
		if (owlIndividual == null) {
			// System.out.print("null");
			return "null";
		}
		String s = owlIndividual.toStringID().substring(
				owlIndividual.toStringID().indexOf("#") + 1);
		// System.out.print(s);
		return s;
	}
	protected String getName(OWLNamedIndividual indivi,OWLOntology ont, OWLOntologyManager manager) {
		String name = "";
		Set<OWLLiteral> values = indivi.getDataPropertyValues(
			METAMODEL.ENAMEDELEMENT_NAME, ont);
		if (values.size() > 0)
			name = values.iterator().next().getLiteral();
		return name;
	}
	public static TransformationGeneration getInstance() {
		if (instance==null)
		{
			instance = new TransformationGeneration();
		}
		return instance;
	}

}

class ArtifactDefinitionStructure {
	private OWLIndividual owlClass;
	private List<OWLIndividual> owlReference;

	public OWLIndividual getOwlClass() {
		return owlClass;
	}

	public void setOwlClass(OWLIndividual owlClass) {
		this.owlClass = owlClass;
	}

	public List<OWLIndividual> getOwlReference() {
		return owlReference;
	}

	public void setOwlReference(List<OWLIndividual> owlReference) {
		this.owlReference = owlReference;
	}
}

class Mapping {
	private OWLIndividual source;
	private OWLIndividual target;

	public OWLIndividual getSource() {
		return source;
	}

	public void setSource(OWLIndividual source) {
		this.source = source;
	}

	public OWLIndividual getTarget() {
		return target;
	}

	public void setTarget(OWLIndividual target) {
		this.target = target;
	}

}
