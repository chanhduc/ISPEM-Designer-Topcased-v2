package org.topcased.modeler.ispem.utils.ontology;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;

import org.topcased.ispem.*;
import org.topcased.spem.*;
import org.topcased.spem.uma.*;
import org.topcased.spem.activity.*;
import org.topcased.spem.impl.SpemFactoryImpl;

import org.openrdf.model.Statement;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.MissingImportEvent;
import org.semanticweb.owlapi.model.MissingImportListener;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.util.SimpleIRIMapper;
import org.topcased.ispem.IspemFactory;
import org.topcased.ispem.impl.IspemFactoryImpl;
import org.xml.sax.SAXException;

public class ISPEMOntologyImport {
	private String ispemOntologyBaseUrl;
	private OWLOntologyManager manager;
	private OWLOntology ont;
	private IspemFactory ispemFactory;
	private String tempFileName;
	private String tmpDir;
	private String server = "";
	private String repoID = "";
	private List<String> strMissingOntologies = new ArrayList<String>();
	private static ISPEMOntologyImport instance;
	private ISPEMOntologyImport() throws OWLOntologyCreationException, SAXException, IOException, ParserConfigurationException
	{
		init();
	}
	@SuppressWarnings("deprecation")
	public void init()
			throws SAXException, IOException, ParserConfigurationException,
			OWLOntologyCreationException {
		tmpDir = System.getProperty("java.io.tmpdir");
		File file = new File(tmpDir, "tempfile.owl");
		tempFileName = file.getAbsolutePath();
		ispemFactory = IspemFactoryImpl.eINSTANCE;
		server = RepositoryHelper.SERVER;
		repoID = RepositoryHelper.REPOSITORY_ID;
		ispemOntologyBaseUrl = ISPEM.ISpemOntologyIRI;
		setManager(OWLManager.createOWLOntologyManager());
		getManager().setSilentMissingImportsHandling(true);
		getManager().addMissingImportListener(new MissingImportListener() {

			public void importMissing(MissingImportEvent arg0) {
				// TODO Auto-generated method stub
					try {
					
					System.out.println("missing ontology: "+arg0.getImportedOntologyURI());
					DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSS");
			        Date date = new Date();
					String filename = tmpDir+"/importtempfile_"+dateFormat.format(date)+".owl";
				if(RepositoryHelper.getOntologyWithName(arg0
						.getImportedOntologyURI().toString(), filename))
				{
					File file = new File(filename);
					OWLOntology ont = manager.loadOntologyFromOntologyDocument(file);
					
					System.out.println("import missing ontology: "+ont.toString());
					file.delete();
				}
					
				} catch (OWLOntologyCreationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		getOntologyContent(RepositoryHelper.ISPEM_METACLASS_CONTEXT);
	}

	public void getOntologyContent(String uri) {
		RepositoryHelper.getOWL(server,repoID,uri, tempFileName);
		File file = new File(tempFileName);
		try {
			 if(manager.getOntology(IRI.create(uri))==null)
				ont=manager.loadOntologyFromOntologyDocument(file);
			 else
				 ont = manager.getOntology(IRI.create(uri));
		//	else
		//		manager.addAxioms(getOnt(), manager.loadOntologyFromOntologyDocument(file).getAxioms());
			
		} catch (OWLOntologyCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("load ontology: " + getOnt().getOntologyID());
	}

	public List<EngineeringDomain> getEngineeringDomain()
	{
		List<EngineeringDomain> list = new ArrayList<EngineeringDomain>();
		OWLDataFactory factory = getManager().getOWLDataFactory();
		OWLClass clsEngineeringDomain = ISPEM.ENGINEERING_DOMAIN;
		OWLClass clsViewpoint = ISPEM.VIEWPOINT;
		// get Engineering Domain Individuals
		Set<OWLClassAssertionAxiom> individuals = getOnt()
				.getClassAssertionAxioms(clsEngineeringDomain);
		for (OWLClassAssertionAxiom i : individuals) {
			OWLNamedIndividual instance = (OWLNamedIndividual) i
					.getIndividual();
			EngineeringDomain e = ispemFactory.createEngineeringDomain();
			e.setName(getName(instance));
			e.setUri(instance.toStringID());
			e.getViewpoints().addAll(getViewPoints(instance));

			list.add(e);
		}
		return list;
	}

	protected String getName(OWLNamedIndividual indivi) {
		String name = "";
		Set<OWLLiteral> values = indivi.getDataPropertyValues(
				ISPEM.NAME, getOnt());
		if (values.size() > 0)
			name = values.iterator().next().getLiteral();
		return name;
	}

	protected List<Viewpoint> getViewPoints(OWLNamedIndividual indivi) {
		List<Viewpoint> list = new ArrayList<Viewpoint>();
		OWLDataFactory factory = getManager().getOWLDataFactory();
		OWLObjectProperty containsViewpoint = ISPEM.HAVE_VIEWPOINT;
		Set<OWLObjectPropertyAssertionAxiom> objectproperties = getOnt()
				.getObjectPropertyAssertionAxioms(indivi);
		for (OWLObjectPropertyAssertionAxiom o : objectproperties) {
			if (o.getProperty() == containsViewpoint) {
				// get all contained viewpoints
				Set<OWLClassAssertionAxiom> classAssViewpoints = getOnt()
						.getClassAssertionAxioms(o.getObject());
				for (OWLClassAssertionAxiom v : classAssViewpoints) {
					OWLNamedIndividual owlViewpoint = (OWLNamedIndividual) v
							.getIndividual();
					Viewpoint viewpoint = ispemFactory.createViewpoint();
					viewpoint.setName(getName(owlViewpoint));
					viewpoint.setUri(owlViewpoint.toStringID());
					list.add(viewpoint);
				}

			}
		}
		return list;
	}

public List<DevelopmentMethod> getMethods(
			List<EngineeringDomain> engineeringDomains) {
		List<DevelopmentMethod> list = new ArrayList<DevelopmentMethod>();

		OWLDataFactory factory = getManager().getOWLDataFactory();
		OWLClass clssToolType = ISPEM.METHOD;
		Set<OWLClassAssertionAxiom> instances = getOnt()
				.getClassAssertionAxioms(clssToolType);
		for (OWLClassAssertionAxiom i : instances) {
			OWLNamedIndividual instance = (OWLNamedIndividual) i
					.getIndividual();
			DevelopmentMethod element = ispemFactory.createDevelopmentMethod();
			element.setName(getName(instance));
			element.setUri(instance.toStringID());
			OWLObjectProperty op_supports = ISPEM.METHOD_SUPPORTS;
			Set<OWLIndividual> viewpoints = instance.getObjectPropertyValues(
					op_supports, getOnt());
			List<String> viewpointsURIs = new ArrayList<String>();
			for (OWLIndividual v : viewpoints) {
				viewpointsURIs.add(v.toStringID());
			}
			for (EngineeringDomain domain : engineeringDomains) {
				for (Viewpoint viewpoint : (List<Viewpoint>)domain.getViewpoints()) {
					for (String uri : viewpointsURIs) {
						if (viewpoint.getUri().equalsIgnoreCase(uri)) {
							element.getSupports().add(viewpoint);
							if (!domain.getRealizes().contains(element)) {
								domain.getRealizes().add(element);
							}
							viewpoints.remove(uri);
						}
					}

				}
			

			}
			list.add(element);
		}
		return list;

	}
public List<RepresentativeLanguage> getRepresentLanguages(MetaModelPackage metamodelPkg) throws OWLOntologyCreationException
{
	List<RepresentativeLanguage> list = new ArrayList<RepresentativeLanguage>();

	OWLDataFactory factory = getManager().getOWLDataFactory();
	OWLClass clssRepresentationLanguage = ISPEM.REPRESENTATIONLANGUAGE;
	Set<OWLClassAssertionAxiom> instances = ont
			.getClassAssertionAxioms(clssRepresentationLanguage);
	for (OWLClassAssertionAxiom i : instances) {
		OWLNamedIndividual instance = (OWLNamedIndividual) i
				.getIndividual();
		RepresentativeLanguage element = ispemFactory.createRepresentativeLanguage();
		element.setName(getName(instance));
		element.setUri(instance.toStringID());
		Set<OWLIndividual> rsSet = instance.getObjectPropertyValues(ISPEM.REPRESENTATIONLANGUAGE_METAMODEL, ont);
		if (rsSet.size()>0)
		{
			OWLIndividual indiMetaModel = rsSet.iterator().next();
			boolean importnew=true;
			for (MethodContentPackageableElement e:(List<MethodContentPackageableElement>)metamodelPkg.getOwnedMethodContentMember())
			{
				if (e instanceof MetaModel)
				{
					if (((MetaModel) e).getEPackage().getNsURI().equals(RepositoryHelper.getOWLOntologyID(indiMetaModel.toStringID())))
					{
						element.setMetamodel((MetaModel) e);
						importnew=false;
					}
				}
			}
			if (importnew)
			{
				MetaModel metamodel = importMetaModel(indiMetaModel.toStringID());
				metamodelPkg.getOwnedMethodContentMember().add(metamodel);
				element.setMetamodel(metamodel);
			}
			
				
		}
		list.add(element);
	}
	return list;
	
}
	public List<DomainTaskDefinition> getDomainTaskDefinitions(
			Set<OWLIndividual> setIndividual,
			List<EngineeringDomain> engineeringDomains,
			List<DomainArtifactDefinition> artifactDefs) {
		List<DomainTaskDefinition> list = new ArrayList<DomainTaskDefinition>();

		OWLDataFactory factory = getManager().getOWLDataFactory();
		OWLClass clsActivity = ISPEM.DOMAIN_ACTIVITY;
		Set<OWLClassAssertionAxiom> individuals = getOnt()
				.getClassAssertionAxioms(clsActivity);
		for (OWLIndividual i : setIndividual) {
			if (!i.getTypes(ont).contains(clsActivity))
				continue;
			OWLNamedIndividual instance = (OWLNamedIndividual) i
					.asOWLNamedIndividual();
			DomainTaskDefinition e = ispemFactory.createDomainTaskDefinition();
			e.setName(getName(instance));
			e.setUri(instance.toStringID());
			// Set applies viewpoint property
			OWLObjectProperty op_apply = ISPEM.DOMAINACTIVITY_APPLIES;
			Set<OWLIndividual> instances = instance.getObjectPropertyValues(
					op_apply, getOnt());
			List<String> viewpoints = new ArrayList<String>();
			for (OWLIndividual o : instances) {

				String viewpoint_uri = ((OWLNamedIndividual) o).toStringID();
				viewpoints.add(viewpoint_uri);
			}
			
			
			for (EngineeringDomain domain : engineeringDomains) {
				for (Viewpoint viewpoint :(List<Viewpoint>) domain.getViewpoints()) {
					for (String uri : viewpoints) {
						if (viewpoint.getUri().equalsIgnoreCase(uri)) {
							e.getApplies().add(viewpoint);

						}
					}

				}
				OWLObjectProperty propPerforms = ISPEM.ENGINEERINGDOMAIN_PERFORMS;
				OWLNamedIndividual indiDomain = factory.getOWLNamedIndividual(IRI.create(domain.getUri()));
				Set<OWLIndividual> indiTasks = indiDomain.getObjectPropertyValues(propPerforms, getOnt());
				for (OWLIndividual o:indiTasks)
				{
					if (o.equals(instance))
					{
						domain.getDefines().add(e);
						break;
					}
				}
			}
			// Set in, out artifact property
			OWLObjectProperty op_in = ISPEM.PROCESSACTIVITY_CONSUMS;
			SpemFactoryImpl spemFactory = new SpemFactoryImpl();
			instances = instance.getObjectPropertyValues(op_in, getOnt());
			OWLObjectProperty op_conforms = ISPEM.ARTIFACT_CONFORMS;
			for (OWLIndividual o : instances) {
				Set<OWLIndividual> indiArtifactDef = o.getObjectPropertyValues(
						op_conforms, getOnt());
				for (OWLIndividual o2 : indiArtifactDef) {
					for (ArtifactDefinition a : artifactDefs) {
						if (a.getUri().equalsIgnoreCase(o2.toStringID())) {
							Default_TaskDefinitionParameter inproduct = spemFactory
									.createDefault_TaskDefinitionParameter();
							inproduct.setDirection(ParameterDirectionKind.IN_LITERAL);
							inproduct.setParameterType(a);
							e.getOwnedTaskDefinitionParameter().add(inproduct);
							break;
						}
					}
				}

			}
			OWLObjectProperty op_out = ISPEM.PROCESSACTIVITY_PRODUCES;

			instances = instance.getObjectPropertyValues(op_out, getOnt());

			for (OWLIndividual o : instances) {
				Set<OWLIndividual> indiArtifactDef = o.getObjectPropertyValues(
						op_conforms, getOnt());
				for (OWLIndividual o2 : indiArtifactDef) {
					for (ArtifactDefinition a : artifactDefs) {
						if (a.getUri().equalsIgnoreCase(o2.toStringID())) {
							Default_TaskDefinitionParameter inproduct = spemFactory
									.createDefault_TaskDefinitionParameter();
							inproduct.setDirection(ParameterDirectionKind.OUT_LITERAL);
							inproduct.setParameterType(a);
							e.getOwnedTaskDefinitionParameter().add(inproduct);
							break;
						}
					}
				}

			}
			list.add(e);
		}

		return list;

	}

	public List<MethodTaskDefinition> getMethodTaskDefinition(
			Set<OWLIndividual> setIndividual,
			List<DomainTaskDefinition> domainTasks,
			List<MethodArtifactDefinition> artifactDefs) {
		List<MethodTaskDefinition> list = new ArrayList<MethodTaskDefinition>();
		OWLDataFactory factory = getManager().getOWLDataFactory();
		
		OWLClass clsActivity = ISPEM.METHOD_ACTIVITY;
		for (OWLIndividual i : setIndividual) {
			if (!i.getTypes(ont).contains(clsActivity))
				continue;
			OWLNamedIndividual instance = (OWLNamedIndividual) i
					.asOWLNamedIndividual();
			MethodTaskDefinition e = ispemFactory.createMethodTaskDefinition();
			e.setName(getName(instance));
			e.setUri(instance.toStringID());
			// Set applies viewpoint property
			OWLObjectProperty op_specialized = ISPEM.METHODACTIVITY_SPECIALIZED;
			Set<OWLIndividual> instances = instance.getObjectPropertyValues(
					op_specialized, getOnt());
			if (instances.size() > 0) {
				for (DomainTaskDefinition t : domainTasks) {

					if (t.getUri().equalsIgnoreCase(
							instances.iterator().next().toStringID())) {
						e.setSpecializedBy(t);
						break;
					}

				}
			}

			// Set in, out artifact property
			// Set in, out artifact property
			OWLObjectProperty op_in = ISPEM.PROCESSACTIVITY_CONSUMS;
			SpemFactoryImpl spemFactory = new SpemFactoryImpl();
			instances = instance.getObjectPropertyValues(op_in, getOnt());
			OWLObjectProperty op_conforms = ISPEM.ARTIFACT_CONFORMS;
			for (OWLIndividual o : instances) {
				Set<OWLIndividual> indiArtifactDef = o.getObjectPropertyValues(
						op_conforms, getOnt());
				for (OWLIndividual o2 : indiArtifactDef) {
					for (MethodArtifactDefinition a : artifactDefs) {
						if (a.getUri().equalsIgnoreCase(o2.toStringID())) {
							Default_TaskDefinitionParameter inproduct = spemFactory
									.createDefault_TaskDefinitionParameter();
							inproduct.setDirection(ParameterDirectionKind.IN_LITERAL);
							inproduct.setParameterType(a);
							e.getOwnedTaskDefinitionParameter().add(inproduct);
							break;
						}
					}
				}

			}
			OWLObjectProperty op_out = ISPEM.PROCESSACTIVITY_PRODUCES;

			instances = instance.getObjectPropertyValues(op_out, getOnt());

			for (OWLIndividual o : instances) {
				Set<OWLIndividual> indiArtifactDef = o.getObjectPropertyValues(
						op_conforms, getOnt());
				for (OWLIndividual o2 : indiArtifactDef) {
					for (MethodArtifactDefinition a : artifactDefs) {
						if (a.getUri().equalsIgnoreCase(o2.toStringID())) {
							Default_TaskDefinitionParameter inproduct = spemFactory
									.createDefault_TaskDefinitionParameter();
							inproduct.setDirection(ParameterDirectionKind.OUT_LITERAL);
							inproduct.setParameterType(a);
							e.getOwnedTaskDefinitionParameter().add(inproduct);
							break;
						}
					}
				}

			}
			list.add(e);
		}
		return list;
	}
	public List<LanguageTaskDefinition> getLanguageTaskDefinition(
			Set<OWLIndividual> setIndividual,
			List<MethodTaskDefinition> methodTasks,
			List<LanguageArtifactDefinition> artifactDefs) {
		List<LanguageTaskDefinition> list = new ArrayList<LanguageTaskDefinition>();
		OWLDataFactory factory = getManager().getOWLDataFactory();
		OWLClass clsActivity = ISPEM.LANGUAGE_ACTIVITY;
		for (OWLIndividual i : setIndividual) {
			if (!i.getTypes(ont).contains(clsActivity))
				continue;
			OWLNamedIndividual instance = (OWLNamedIndividual) i
					.asOWLNamedIndividual();
			LanguageTaskDefinition e = ispemFactory.createLanguageTaskDefinition();
			e.setName(getName(instance));
			e.setUri(instance.toStringID());
			// Set applies viewpoint property
			OWLObjectProperty op_specialized = ISPEM.LANGUAGETASKDEFINITION_SPECIALIZEDBY;
			Set<OWLIndividual> instances = instance.getObjectPropertyValues(
					op_specialized, getOnt());
			if (instances.size() > 0) {
				for (MethodTaskDefinition t : methodTasks) {

					if (t.getUri().equalsIgnoreCase(
							instances.iterator().next().toStringID())) {
						e.setSpecializedBy(t);
						break;
					}

				}
			}

			// Set in, out artifact property
			// Set in, out artifact property
			OWLObjectProperty op_in = ISPEM.PROCESSACTIVITY_CONSUMS;
			SpemFactoryImpl spemFactory = new SpemFactoryImpl();
			instances = instance.getObjectPropertyValues(op_in, getOnt());
			OWLObjectProperty op_conforms = ISPEM.ARTIFACT_CONFORMS;
			for (OWLIndividual o : instances) {
				Set<OWLIndividual> indiArtifactDef = o.getObjectPropertyValues(
						op_conforms, getOnt());
				for (OWLIndividual o2 : indiArtifactDef) {
					for (LanguageArtifactDefinition a : artifactDefs) {
						if (a.getUri().equalsIgnoreCase(o2.toStringID())) {
							Default_TaskDefinitionParameter inproduct = spemFactory
									.createDefault_TaskDefinitionParameter();
							inproduct.setDirection(ParameterDirectionKind.IN_LITERAL);
							inproduct.setParameterType(a);
							e.getOwnedTaskDefinitionParameter().add(inproduct);
							break;
						}
					}
				}

			}
			OWLObjectProperty op_out = ISPEM.PROCESSACTIVITY_PRODUCES;

			instances = instance.getObjectPropertyValues(op_out, getOnt());

			for (OWLIndividual o : instances) {
				Set<OWLIndividual> indiArtifactDef = o.getObjectPropertyValues(
						op_conforms, getOnt());
				for (OWLIndividual o2 : indiArtifactDef) {
					for (LanguageArtifactDefinition a : artifactDefs) {
						if (a.getUri().equalsIgnoreCase(o2.toStringID())) {
							Default_TaskDefinitionParameter inproduct = spemFactory
									.createDefault_TaskDefinitionParameter();
							inproduct.setDirection(ParameterDirectionKind.OUT_LITERAL);
							inproduct.setParameterType(a);
							e.getOwnedTaskDefinitionParameter().add(inproduct);
							break;
						}
					}
				}

			}
			list.add(e);
		}
		return list;
	}

	public List<DevelopmentMethod> getMethods(String context,
			List<EngineeringDomain> engineeringDomains) {
		List<DevelopmentMethod> list = new ArrayList<DevelopmentMethod>();

		OWLDataFactory factory = getManager().getOWLDataFactory();
		OWLClass clssToolType = ISPEM.METHOD;
		Set<OWLClassAssertionAxiom> instances = getOnt()
				.getClassAssertionAxioms(clssToolType);
		for (OWLClassAssertionAxiom i : instances) {
			OWLNamedIndividual instance = (OWLNamedIndividual) i
					.getIndividual();
			DevelopmentMethod element = ispemFactory.createDevelopmentMethod();
			element.setName(getName(instance));
			element.setUri(instance.toStringID());
			OWLObjectProperty op_supports = ISPEM.METHOD_SUPPORTS;
			Set<OWLIndividual> viewpoints = instance.getObjectPropertyValues(
					op_supports, getOnt());
			List<String> viewpointsURIs = new ArrayList<String>();
			for (OWLIndividual v : viewpoints) {
				viewpointsURIs.add(v.toStringID());
			}
			for (EngineeringDomain domain : engineeringDomains) {
				for (Viewpoint viewpoint : (List<Viewpoint>)domain.getViewpoints()) {
					for (String uri : viewpointsURIs) {
						if (viewpoint.getUri().equalsIgnoreCase(uri)) {
							element.getSupports().add(viewpoint);
							if (!domain.getRealizes().contains(element)) {
								domain.getRealizes().add(element);
							}
							// viewpoints.remove(uri);
						}
					}

				}

			}
			list.add(element);
		}

		return list;

	}

	public List<ArtifactDefinition> getArtifactDefinition(
			List<EngineeringDomain> engineeringDomains) {
		List<ArtifactDefinition> rs = new ArrayList<ArtifactDefinition>();
		//rs.addAll(getDomainArtifactDefinition(engineeringDomains));
		//rs.addAll(getMethodArtifactDefinition(rs));
		return rs;
	}

	public List<DomainArtifactDefinition> getDomainArtifactDefinition(Set<OWLIndividual> setIndividual,
			List<EngineeringDomain> engineeringDomains, MethodContentPackage metamodelPkg) throws OWLOntologyCreationException {
	List<DomainArtifactDefinition> rs = new ArrayList<DomainArtifactDefinition>();

		OWLDataFactory factory = getManager().getOWLDataFactory();
		OWLClass owlArtifactDefinition = ISPEM.DOMAIN_ARTIFACT_DEFINITION;
		for (OWLIndividual i : setIndividual) {
			if (!i.getTypes(ont).contains(owlArtifactDefinition))
				continue;
			OWLNamedIndividual instance = (OWLNamedIndividual) i
					.asOWLNamedIndividual();
			DomainArtifactDefinition element = ispemFactory
					.createDomainArtifactDefinition();
			element.setName(getName(instance));
			element.setUri(instance.toStringID());
			
			OWLObjectProperty op_categorized = ISPEM.ARTIFACTDEFINTITION_CATEGORIZED;
			Set<OWLIndividual> viewpoints = instance.getObjectPropertyValues(
					op_categorized, getOnt());
			List<String> viewpointsURIs = new ArrayList<String>();
			for (OWLIndividual v : viewpoints) {
				viewpointsURIs.add(v.toStringID());
			}
			for (EngineeringDomain domain : engineeringDomains) {
				for (Viewpoint viewpoint : (List<Viewpoint>)domain.getViewpoints()) {
					for (String uri : viewpointsURIs) {
						if (viewpoint.getUri().equalsIgnoreCase(uri)) {
							element.getOrganized().add(viewpoint);

							// viewpoints.remove(uri);
						}
					}

				}

			}
			
			Set<OWLIndividual> rsSet = instance.getObjectPropertyValues(ISPEM.ARTIFACTDEFINITION_USEDMETAMODEL, ont);
			List<MetaModel> metamodels = new ArrayList<MetaModel>();
			for (MethodContentPackageableElement e:(List<MethodContentPackageableElement>)metamodelPkg.getOwnedMethodContentMember())
			{
				if (e instanceof MetaModel)
				{
					metamodels.add((MetaModel) e);
				}
			}
			if (rsSet.size()>0)
			{
				OWLIndividual indiMetaModel = rsSet.iterator().next();
				boolean existMetaModel=false;
				for (MetaModel p:metamodels)
				{
					if (p.getEPackage().getNsURI().equals(RepositoryHelper.getOWLOntologyID(indiMetaModel.toStringID())))
							{
						existMetaModel = true;
						element.setMetamodel(p);
						break;
							}
				}
				if (existMetaModel==false)
				{
					MetaModel metamodel = importMetaModel(indiMetaModel.toStringID());
					metamodelPkg.getOwnedMethodContentMember().add(metamodel);
					element.setMetamodel(metamodel);
				}
			}
			rsSet = instance.getObjectPropertyValues(ISPEM.ARTIFACTDEFINITION_ROOTELEMENT, ont);
			if (rsSet.size()>0)
			{
				OWLIndividual indiRoot = rsSet.iterator().next();
				EClass eclass = findEClass(indiRoot, element.getMetamodel().getEPackage());
				if (eclass!=null)
					element.setRootElement(eclass);
			}
			rsSet = instance.getObjectPropertyValues(ISPEM.ARTIFACTDEFINITION_USEDREFERENCES, ont);
			for (OWLIndividual indiRef:rsSet)
			{
				EReference eref = findEReference(indiRef, element.getMetamodel().getEPackage());
				if (eref!=null)
					element.getUsedReferences().add(eref);
			}
			rs.add(element);
		}

		return rs;
	}
	public EReference findEReference (OWLIndividual indiReference, EPackage epackage)
	{
		EReference eref=null;
		for (EClassifier c:epackage.getEClassifiers())
		{
			if (c instanceof EClass)
			{
				for (EReference r:((EClass) c).getEReferences())
				{
					String uri = epackage.getNsURI().concat("#"+c.getName()+"_"+r.getName());
					System.out.println("String1: "+indiReference.toStringID());
					System.out.println("String2: "+uri);
					if (indiReference.toStringID().compareTo(uri)==0)
					{
						System.out.println("equal");
						return (EReference) r;
						
					}
					else
					{
						System.out.println("not equal");
					}
				}
				
				
			}
		}
		return eref;
	}
	public EClass findEClass (OWLIndividual indiEClass, EPackage epackage)
	{
		EClass eclass=null;
		for (EClassifier e:epackage.getEClassifiers())
		{
			if (e instanceof EClass)
			{
				String uri = epackage.getNsURI().concat("#"+e.getName());
				if (indiEClass.toStringID().equals(uri))
				{
					return (EClass) e;
				}
			}
		}
		return eclass;
	}
	public List<MethodArtifactDefinition> getMethodArtifactDefinition(
			Set<OWLIndividual> setIndividual,
			List<DomainArtifactDefinition> domainArtifactDefinitions, MetaModelPackage metamodelPkg) throws OWLOntologyCreationException {
		List<MethodArtifactDefinition> rs = new ArrayList<MethodArtifactDefinition>();

		OWLDataFactory factory = getManager().getOWLDataFactory();
		OWLClass owlArtifactDefinition = ISPEM.METHOD_ARTIFACT_DEFINITION;
		for (OWLIndividual i : setIndividual) {
			if (!i.getTypes(ont).contains(owlArtifactDefinition))
				continue;
			OWLNamedIndividual instance = (OWLNamedIndividual) i
					.asOWLNamedIndividual();
			MethodArtifactDefinition element = ispemFactory
					.createMethodArtifactDefinition();
			element.setName(getName(instance));
			element.setUri(instance.toStringID());
			
			// Set specialized properties
			OWLObjectProperty op_specialized = ISPEM.METHODARTIFACTDEFINITION_SPECIALIZEDBY;
			Set<OWLIndividual> domainADs = instance.getObjectPropertyValues(
					op_specialized, getOnt());
			String domainADUri = "";
			for (OWLIndividual a : domainADs) {
				domainADUri=a.toStringID();
			}
			for (DomainArtifactDefinition da:domainArtifactDefinitions)
			{
				if (da.getUri().equalsIgnoreCase(domainADUri))
				{
					element.setSpecializedBy(da);
				}
			}
			Set<OWLIndividual> rsSet = instance.getObjectPropertyValues(ISPEM.ARTIFACTDEFINITION_USEDMETAMODEL, ont);
			List<MetaModel> metamodels = new ArrayList<MetaModel>();
			for (MethodContentPackageableElement e:(List<MethodContentPackageableElement>)metamodelPkg.getOwnedMethodContentMember())
			{
				if (e instanceof MetaModel)
				{
					metamodels.add((MetaModel) e);
				}
			}
			if (rsSet.size()>0)
			{
				OWLIndividual indiMetaModel = rsSet.iterator().next();
				boolean existMetaModel=false;
				for (MetaModel p:metamodels)
				{
					if (p.getEPackage().getNsURI().equals(RepositoryHelper.getOWLOntologyID(indiMetaModel.toStringID())))
							{
						existMetaModel = true;
						element.setMetamodel(p);
						break;
							}
				}
				if (existMetaModel==false)
				{
					MetaModel metamodel = importMetaModel(indiMetaModel.toStringID());
					metamodelPkg.getOwnedMethodContentMember().add(metamodel);
					element.setMetamodel(metamodel);
				}
				rsSet = instance.getObjectPropertyValues(ISPEM.ARTIFACTDEFINITION_ROOTELEMENT, ont);
				if (rsSet.size()>0)
				{
					OWLIndividual indiRoot = rsSet.iterator().next();
					EClass eclass = findEClass(indiRoot, element.getMetamodel().getEPackage());
					if (eclass!=null)
						element.setRootElement(eclass);
				}
				rsSet = instance.getObjectPropertyValues(ISPEM.ARTIFACTDEFINITION_USEDREFERENCES, ont);
				for (OWLIndividual indiRef:rsSet)
				{
					EReference eref = findEReference(indiRef, element.getMetamodel().getEPackage());
					if (eref!=null)
						element.getUsedReferences().add(eref);
				}
				rs.add(element);
			}
			rs.add(element);
		}
		
		return rs;
	}
	public List<LanguageArtifactDefinition> getLanguageArtifactDefinition(
			Set<OWLIndividual> setIndividual, List<MethodArtifactDefinition> methodArtifactDefinitions, List<RepresentativeLanguage> representLanguages) {
		List<LanguageArtifactDefinition> rs = new ArrayList<LanguageArtifactDefinition>();
		
		OWLDataFactory factory = getManager().getOWLDataFactory();
		OWLClass owlArtifactDefinition = ISPEM.LANGUAGE_ARTIFACT_DEFINITION;
		for (OWLIndividual i : setIndividual) {
			if (!i.getTypes(ont).contains(owlArtifactDefinition))
				continue;
			OWLNamedIndividual instance = (OWLNamedIndividual) i
				.asOWLNamedIndividual();
			LanguageArtifactDefinition element = ispemFactory
					.createLanguageArtifactDefinition();
			element.setName(getName(instance));
			element.setUri(instance.toStringID());
		
			// Set specialized properties
			OWLObjectProperty op_specialized = ISPEM.LANGUAGEARTIFACTDEFINITION_SPECIALIZEDBY;
			Set<OWLIndividual> methodADs = instance.getObjectPropertyValues(
					op_specialized, getOnt());
			String methodADUri = "";
			for (OWLIndividual a : methodADs) {
				methodADUri=a.toStringID();
			}
			for (MethodArtifactDefinition da:methodArtifactDefinitions)
			{
				if (da.getUri().equalsIgnoreCase(methodADUri))
				{
					element.setSpecializedBy(da);
				}
			}
			OWLObjectProperty propRepresentedBy = ISPEM.LANGUAGEARTIFACTDEFINITION_REPRESENTEDBY;
			Set<OWLIndividual> setIndivi = instance.getObjectPropertyValues(
					propRepresentedBy, getOnt());
			String RepresentLanguageUri = "";
			for (OWLIndividual a : setIndivi) {
				RepresentLanguageUri=a.toStringID();
			}
			for (RepresentativeLanguage da:representLanguages)
			{
				if (da.getUri().equalsIgnoreCase(RepresentLanguageUri))
				{
					element.setRepresentedBy(da);
				}
			}
			rs.add(element);
		}

		return rs;
	}
//Package feature
	public List<OntologyPackage> getDomainPackages()
	{
		List<OntologyPackage> rs = new ArrayList<OntologyPackage>();
		String domainPackageUri = ispemOntologyBaseUrl+"#DomainPackage";
		List<Statement> statements = RepositoryHelper.queryObject(domainPackageUri);
		for (Statement s:statements)
		{
			OntologyPackage domain = new OntologyPackage();
			domain.setUri(s.getSubject().stringValue());
			List<Statement> sts = RepositoryHelper.querySubject(s.getSubject().stringValue());
			for (Statement s2:sts)
			{
				if (s2.getPredicate().stringValue().equalsIgnoreCase(ispemOntologyBaseUrl+"#Name"))
				{
					domain.setName(s2.getObject().stringValue());
				}
				if (s2.getPredicate().stringValue().equalsIgnoreCase(ispemOntologyBaseUrl+"#Package_description"))
				{
					domain.setDescription(s2.getObject().stringValue());
				}
				if (s2.getPredicate().stringValue().equalsIgnoreCase(ispemOntologyBaseUrl+"#Package_uri"))
				{
					domain.setOntologyUri(s2.getObject().stringValue());
				}
			}
			rs.add(domain);
		}
		return rs;
	}
public List<OntologyPackage> getMethodPackages(String domainUri)
{
	List<OntologyPackage> list = new ArrayList<OntologyPackage>();
	String packageContains = ispemOntologyBaseUrl+"#DomainPackage_contains";
	List<Statement> statements = RepositoryHelper.query(domainUri,packageContains);
	for (Statement s:statements)
	{
		OntologyPackage domain = new OntologyPackage();
		domain.setUri(s.getObject().stringValue());
		List<Statement> sts = RepositoryHelper.querySubject(s.getObject().stringValue());
		for (Statement s2:sts)
		{
			if (s2.getPredicate().stringValue().equalsIgnoreCase(ISPEM.NAME.asOWLDataProperty().toStringID()))
			{
				domain.setName(s2.getObject().stringValue());
			}
			if (s2.getPredicate().stringValue().equalsIgnoreCase(ISPEM.DESCRIPTION.asOWLDataProperty().toStringID()))
			{
				domain.setDescription(s2.getObject().stringValue());
			}
			if (s2.getPredicate().stringValue().equalsIgnoreCase(ISPEM.PACKAGE_URI.asOWLDataProperty().toStringID()))
			{
				domain.setOntologyUri(s2.getObject().stringValue());
			}
		}
		list.add(domain);
	}
	return list;
}
public List<OWLIndividual> getMethodWithLanguagePackage(String methodPackageURI)
{
	List<OWLIndividual> list = new ArrayList<OWLIndividual>();
	OWLDataFactory factory = getManager().getOWLDataFactory();
	String packageContains = ispemOntologyBaseUrl+"#MethodPackage_contains";
	List<Statement> statements = RepositoryHelper.query(methodPackageURI,packageContains);
	for (Statement s:statements)
	{
		
		list.add(factory.getOWLNamedIndividual(IRI.create(s.getObject().stringValue())));
	}
	return list;
}
public boolean importBaseCategory(MethodContentPackage rootPackage) throws OWLOntologyCreationException
{
	EngineeringDomainPackage domainPkg=null;
	DevelopmentMethodPackage methodPkg=null;
	RepresentLanguagePackage languagePkg=null;
	MetaModelPackage metamodelPkg=null;
	int found=0;
	for (MethodContentPackageableElement e:(List<MethodContentPackageableElement>) rootPackage.getOwnedMethodContentMember())
	{
		if (found==4) break;
		if (e instanceof CategoryPackage)
		{
			CategoryPackage p = (CategoryPackage) e;
			for (MethodContentPackageableElement e1:(List<MethodContentPackageableElement>)p.getOwnedMethodContentMember())
			{
				if (e1 instanceof EngineeringDomainPackage)
				{
					domainPkg=(EngineeringDomainPackage) e1;
					found++;
				}
				if (e1 instanceof DevelopmentMethodPackage)
				{
					methodPkg=(DevelopmentMethodPackage) e1;
					found++;
				}
				if (e1 instanceof RepresentLanguagePackage)
				{
					languagePkg=(RepresentLanguagePackage) e1;
					found++;
				}
			}
		}
		if (e instanceof MetaModelPackage)
		{
			metamodelPkg=(MetaModelPackage) e;
		}
	}
	List<EngineeringDomain> domains = getEngineeringDomain();
	for (EngineeringDomain e:domains)
	{
		if (!isExistedOntologyElement(e, domainPkg.getOwnedMethodContentMember()))
		{
			domainPkg.getOwnedMethodContentMember().add(e);
		}
	}
	List<DevelopmentMethod> methods = getMethods(domains);
	for (DevelopmentMethod e:methods)
	{
		if (!isExistedOntologyElement(e, methodPkg.getOwnedMethodContentMember()))
		{
			methodPkg.getOwnedMethodContentMember().add(e);
		}
	}
	List<RepresentativeLanguage> representLanguage = getRepresentLanguages(metamodelPkg);
	for (RepresentativeLanguage e:representLanguage)
	{
		if (!isExistedOntologyElement(e, languagePkg.getOwnedMethodContentMember()))
		{
			languagePkg.getOwnedMethodContentMember().add(e);
		}
	}
	return true;
}
private <T> boolean isExistedOntologyElement(T element, Collection<T> collect)
{
	if (!(element instanceof OntologyLinkedElement))return false;
	OntologyLinkedElement newelement = (OntologyLinkedElement) element;
	for (T t:collect)
	{
		if (t instanceof OntologyLinkedElement)
		{
			OntologyLinkedElement e = (OntologyLinkedElement) t;
			if (e.getUri().equals(newelement.getUri()))
			{
				return true;
			}
		}
	}
	return false;
}
public Set<OWLIndividual> getContainedElement(OWLIndividual indiPackage)
{
	Set<OWLIndividual> rs = new HashSet<OWLIndividual>();
	OWLDataFactory factory = manager.getOWLDataFactory();
	OWLObjectProperty propContains = factory.getOWLObjectProperty(IRI.create(ispemOntologyBaseUrl+"#Package_contains"));
	rs = indiPackage.getObjectPropertyValues(propContains, ont);
	return rs;
}
public DomainContentPackage importDomainPackage(OntologyPackage domainPkg, MethodContentPackage rootPackage) throws OWLOntologyCreationException
{
	
		//createPackage
	DomainContentPackage  mp = ispemFactory.createDomainContentPackage();
	mp.setName(domainPkg.getName());
	
	RoleDefinitionPackage rdp = UmaFactory.eINSTANCE.createRoleDefinitionPackage();
	rdp.setName("Roles");
	mp.getOwnedMethodContentMember().add(rdp);
	TaskDefinitionPackage tdp = UmaFactory.eINSTANCE.createTaskDefinitionPackage();
	tdp.setName("Tasks");
	mp.getOwnedMethodContentMember().add(tdp);
	WorkProductDefinitionPackage wdp = UmaFactory.eINSTANCE.createWorkProductDefinitionPackage();
	wdp.setName("Work Products");
	mp.getOwnedMethodContentMember().add(wdp);
	GuidancePackage gp = UmaFactory.eINSTANCE.createGuidancePackage();
	gp.setName("Guidances");
	mp.getOwnedMethodContentMember().add(gp);
	getOntologyContent(domainPkg.getOntologyUri());
	importBaseCategory(rootPackage);
	//get Engineering Domain Package
	EngineeringDomainPackage domains=null;
	MetaModelPackage metaModelPackage = null;

	for (MethodContentPackageableElement e:(List<MethodContentPackageableElement>)rootPackage.getOwnedMethodContentMember())
	{
		if (e instanceof CategoryPackage)
		{
			CategoryPackage p = (CategoryPackage) e;
			for (MethodContentPackageableElement e1:(List<MethodContentPackageableElement>)p.getOwnedMethodContentMember())
			{
				if (e1 instanceof EngineeringDomainPackage)
				{
					domains=(EngineeringDomainPackage) e1;			
				}
			}
		}
		if (e instanceof MetaModelPackage)
		{
			metaModelPackage=(MetaModelPackage) e;
		}
	}
	OWLIndividual indiDomainpkg = getManager().getOWLDataFactory().getOWLNamedIndividual(IRI.create(domainPkg.getUri()));
	OWLIndividual indiDomain = getRelatedDomain(indiDomainpkg);
	List<EngineeringDomain> engineeringDomains = new ArrayList<EngineeringDomain>();
	for (MethodContentPackageableElement e: (List<MethodContentPackageableElement>)domains.getOwnedMethodContentMember())
	{
		if (e instanceof EngineeringDomain)
		{
			EngineeringDomain domain = (EngineeringDomain) e;
			engineeringDomains.add(domain);
			if (domain.getUri().equals(indiDomain.toStringID()))
			{
				mp.setRelatedDomain((EngineeringDomain) e);
			}
		}
	}
	//generate spem artifact definition
	Set<OWLIndividual> containedElements = getContainedElement(indiDomainpkg); 
	List<DomainArtifactDefinition> listAD = getDomainArtifactDefinition(containedElements, engineeringDomains,metaModelPackage);
	wdp.getOwnedMethodContentMember().addAll(listAD);
	//generate spem task definition
	tdp.getOwnedMethodContentMember().addAll(getDomainTaskDefinitions(containedElements, engineeringDomains,listAD));
	return mp;
}
public MethodContentPackage importMethodPackage(OntologyPackage methodPkg, DomainContentPackage domainPkg, MethodContentPackage rootPkg) throws ExecutionException, OWLOntologyCreationException
{

	//createPackage
	DevelopmentMethodContentPackage  mp = ispemFactory.createDevelopmentMethodContentPackage();
	mp.setName(methodPkg.getName());
	RoleDefinitionPackage rdp = UmaFactory.eINSTANCE.createRoleDefinitionPackage();
	rdp.setName("Roles");
	mp.getOwnedMethodContentMember().add(rdp);
	TaskDefinitionPackage tdp = UmaFactory.eINSTANCE.createTaskDefinitionPackage();
	tdp.setName("Tasks");
	mp.getOwnedMethodContentMember().add(tdp);
	WorkProductDefinitionPackage wdp = UmaFactory.eINSTANCE.createWorkProductDefinitionPackage();
	wdp.setName("Work Products");
	mp.getOwnedMethodContentMember().add(wdp);
	GuidancePackage gp = UmaFactory.eINSTANCE.createGuidancePackage();
	gp.setName("Guidances");
	mp.getOwnedMethodContentMember().add(gp);
	
	//get method package ontology
	getOntologyContent(methodPkg.getOntologyUri());
	importBaseCategory(rootPkg);
	EngineeringDomainPackage domains = ispemFactory.createEngineeringDomainPackage();
	domains=getSpecifiedPackage(domains, rootPkg);
	MetaModelPackage metamodelPkg = getSpecifiedPackage(ispemFactory.createMetaModelPackage(), rootPkg);
	List<EngineeringDomain> lsDomains = new ArrayList<EngineeringDomain>();
	for (MethodContentPackageableElement e: (List<MethodContentPackageableElement>)domains.getOwnedMethodContentMember())
	{
		if (e instanceof EngineeringDomain)
		{
			lsDomains.add((EngineeringDomain) e);
		}
	}

	//get method package
		DevelopmentMethodPackage methods=ispemFactory.createDevelopmentMethodPackage();
		methods=getSpecifiedPackage(methods, rootPkg);
	
	DevelopmentMethod method=null;
	OWLIndividual indiMethod=getRelatedMethod(getManager().getOWLDataFactory().getOWLNamedIndividual(IRI.create(methodPkg.getUri())));
	for (MethodContentPackageableElement element:(List<MethodContentPackageableElement>)methods.getOwnedMethodContentMember())
	{
		if (element instanceof DevelopmentMethod)
		{
			method = (DevelopmentMethod) element;
			if (method.getUri().equals(indiMethod.toStringID()))
					{
				mp.setRelatedMethod(method);
					}
		}
	}
	RepresentLanguagePackage languages = ispemFactory.createRepresentLanguagePackage();
	languages=getSpecifiedPackage(languages, rootPkg);
	
	
	
	List<DomainArtifactDefinition> domainArtifactDefinitions= new ArrayList<DomainArtifactDefinition>();
	List<DomainTaskDefinition> domainTasks = new ArrayList<DomainTaskDefinition>();
	
	List<EObject> objects = domainPkg.eContents();
	for (Object o:objects)
	{
		if (o instanceof WorkProductDefinitionPackage)
		{
			WorkProductDefinitionPackage WPDPkg = (WorkProductDefinitionPackage) o;
			for (MethodContentPackageableElement e:(List<MethodContentPackageableElement>)WPDPkg.getOwnedMethodContentMember())
			{
				if (e instanceof DomainArtifactDefinition)
				{
					domainArtifactDefinitions.add((DomainArtifactDefinition)e);
				}
			}
			
		}
		if (o instanceof TaskDefinitionPackage)
		{
			TaskDefinitionPackage taskDefPkg = (TaskDefinitionPackage) o;
			for (MethodContentPackageableElement e:(List<MethodContentPackageableElement>)taskDefPkg.getOwnedMethodContentMember())
			{
				if (e instanceof DomainTaskDefinition)
				{
					domainTasks.add((DomainTaskDefinition)e);
				}
			}
		}
	}
	Set<OWLIndividual> containedElements = getContainedElement(manager.getOWLDataFactory().getOWLNamedIndividual(IRI.create(methodPkg.getUri()))); 
	List<MethodArtifactDefinition> methodArtifactDefinitions = getMethodArtifactDefinition(containedElements,domainArtifactDefinitions,metamodelPkg);
	wdp.getOwnedMethodContentMember().addAll(methodArtifactDefinitions);
	//get method task definition	
	tdp.getOwnedMethodContentMember().addAll(getMethodTaskDefinition(containedElements,domainTasks, methodArtifactDefinitions));
	List<OWLIndividual> listIndi = getMethodWithLanguagePackage(methodPkg.getUri());
	for (OWLIndividual i:listIndi)
	{
		mp.getOwnedMethodContentMember().add(importMethodWithLanguagePackage(i, mp, method, languages));
	}
	return mp;
}

public MethodContentPackage importMethodWithLanguagePackage(OWLIndividual indiMethodlanguagePkg, DevelopmentMethodContentPackage methodPkg, DevelopmentMethod method, RepresentLanguagePackage languages) throws ExecutionException
{
	
	//createPackage
	DevelopmentMethodWithLanguageContentPackage  mp = ispemFactory.createDevelopmentMethodWithLanguageContentPackage();
	mp.setName(getName(indiMethodlanguagePkg.asOWLNamedIndividual()));
	mp.setRelatedMethod(method);
	RoleDefinitionPackage rdp = UmaFactory.eINSTANCE.createRoleDefinitionPackage();
	rdp.setName("Roles");
	mp.getOwnedMethodContentMember().add(rdp);
	TaskDefinitionPackage tdp = UmaFactory.eINSTANCE.createTaskDefinitionPackage();
	tdp.setName("Tasks");
	mp.getOwnedMethodContentMember().add(tdp);
	WorkProductDefinitionPackage wdp = UmaFactory.eINSTANCE.createWorkProductDefinitionPackage();
	wdp.setName("Work Products");
	mp.getOwnedMethodContentMember().add(wdp);
	GuidancePackage gp = UmaFactory.eINSTANCE.createGuidancePackage();
	gp.setName("Guidances");
	mp.getOwnedMethodContentMember().add(gp);
	List<RepresentativeLanguage> lsLanguage = new ArrayList<RepresentativeLanguage>();
	for (MethodContentPackageableElement e: (List<MethodContentPackageableElement>)languages.getOwnedMethodContentMember())
	{
		if (e instanceof RepresentativeLanguage)
		{
			lsLanguage.add((RepresentativeLanguage) e);
		}
	}
	//get method package ontology
	//getOntologyContent(methodlanguagePkg.getOntologyUri());
	OWLIndividual indiRelatedLanguage = getRelatedLanguage(indiMethodlanguagePkg);
	for (RepresentativeLanguage l:lsLanguage)
	{
		if (l.getUri().equalsIgnoreCase(indiRelatedLanguage.toStringID()))
		{
			mp.setRelatedLanguage(l);
		}
	}
	List<MethodArtifactDefinition> methodArtifactDefinitions= new ArrayList<MethodArtifactDefinition>();
	List<MethodTaskDefinition> methodTasks = new ArrayList<MethodTaskDefinition>();
	
	for (MethodContentPackageableElement o: (List<MethodContentPackageableElement>) methodPkg.getOwnedMethodContentMember())
	{
		if (o instanceof WorkProductDefinitionPackage)
		{
			WorkProductDefinitionPackage WPDPkg = (WorkProductDefinitionPackage) o;
			for (MethodContentPackageableElement e: (List<MethodContentPackageableElement>) WPDPkg.getOwnedMethodContentMember())
			{
				if (e instanceof MethodArtifactDefinition)
				{
					methodArtifactDefinitions.add((MethodArtifactDefinition)e);
				}
			}
			
		}
		if (o instanceof TaskDefinitionPackage)
		{
			TaskDefinitionPackage taskDefPkg = (TaskDefinitionPackage) o;
			for (MethodContentPackageableElement e:(List<MethodContentPackageableElement>)taskDefPkg.getOwnedMethodContentMember())
			{
				if (e instanceof MethodTaskDefinition)
				{
					methodTasks.add((MethodTaskDefinition)e);
				}
			}
		}
	}
	Set<OWLIndividual> containedElements = getContainedElement(indiMethodlanguagePkg); 
	List<LanguageArtifactDefinition> languageArtifactDefinitions = getLanguageArtifactDefinition(containedElements,methodArtifactDefinitions,lsLanguage);
	wdp.getOwnedMethodContentMember().addAll(languageArtifactDefinitions);
	//get method task definition	
	tdp.getOwnedMethodContentMember().addAll(getLanguageTaskDefinition(containedElements,methodTasks, languageArtifactDefinitions));
	return mp;
}
private OWLIndividual getRelatedLanguage(OWLIndividual indiMethodWithLanguagePackage)
{
	OWLDataFactory factory = getManager().getOWLDataFactory();;
	OWLIndividual rs= factory.getOWLAnonymousIndividual();
	OWLObjectProperty propRelatedLanguage = factory.getOWLObjectProperty(IRI.create(ispemOntologyBaseUrl+"#Package_relatedLanguage"));
	Set<OWLIndividual> setIndi = indiMethodWithLanguagePackage.getObjectPropertyValues(propRelatedLanguage,getOnt());
	if (setIndi.size()>0)
		rs = setIndi.iterator().next();
	return rs;
}
private OWLIndividual getRelatedDomain(OWLIndividual indiDomainPackage)
{
	OWLDataFactory factory = getManager().getOWLDataFactory();;
	OWLIndividual rs= factory.getOWLAnonymousIndividual();
	OWLObjectProperty propRelatedDomain = factory.getOWLObjectProperty(IRI.create(ispemOntologyBaseUrl+"#Package_relatedDomain"));
	Set<OWLIndividual> setIndi = indiDomainPackage.getObjectPropertyValues(propRelatedDomain,getOnt());
	if (setIndi.size()>0)
		rs = setIndi.iterator().next();
	return rs;
}
private OWLIndividual getRelatedMethod(OWLIndividual indiPackage)
{
	OWLDataFactory factory = getManager().getOWLDataFactory();;
	OWLIndividual rs= factory.getOWLAnonymousIndividual();
	OWLObjectProperty propRelatedDomain = factory.getOWLObjectProperty(IRI.create(ispemOntologyBaseUrl+"#Package_relatedMethod"));
	Set<OWLIndividual> setIndi = indiPackage.getObjectPropertyValues(propRelatedDomain,getOnt());
	if (setIndi.size()>0)
		rs = setIndi.iterator().next();
	return rs;
}
private <T> T getSpecifiedPackage (T element, MethodContentPackage rootPackage)
{
	
	MethodContentPackageableElement newelement = (MethodContentPackageableElement) element;
	TreeIterator<EObject> tree = rootPackage.eAllContents();
	while (tree.hasNext())
	{
		MethodContentPackageableElement e = (MethodContentPackageableElement) tree.next();
		if (e.getClass().equals(element.getClass()))
		{
			return (T) e;
		}
		if (!(e instanceof MethodContentPackage))
		{
			tree.prune();
		}
		
	}
	return null;
}
public OWLOntology getOnt() {
	return ont;
}

public void setOnt(OWLOntology ont) {
	this.ont = ont;
}

public OWLOntologyManager getManager() {
	return manager;
}

public void setManager(OWLOntologyManager manager) {
	this.manager = manager;
}
/////////import meta model////////////
public MetaModel importMetaModel(String MetaModelUri) throws OWLOntologyCreationException
{
	MetaModel metamodel = ispemFactory.createMetaModel();
	EPackage epackage = EcoreFactoryImpl.eINSTANCE.createEPackage();
	File tempFile = new File(tempFileName);
	String ontID = RepositoryHelper.getOWLOntologyID(MetaModelUri);
	OWLOntology ontology;
	File file = new File(tempFileName);
		 if(manager.getOntology(IRI.create(ontID))==null)
		 {
			RepositoryHelper.getOntologyWithName(ontID, tempFileName);
			 ontology=manager.loadOntologyFromOntologyDocument(file);
		 }
		 else
			 ontology = manager.getOntology(IRI.create(ontID));
	OWLIndividual indiPackage = manager.getOWLDataFactory().getOWLNamedIndividual(IRI.create(MetaModelUri));
	epackage.setName(getNamedElement_Name(indiPackage, ontology));
	epackage.setNsURI(getNsUri(indiPackage, ontology));
	epackage.setNsPrefix(getNsPrefix(indiPackage, ontology));
	epackage.getEClassifiers().addAll(getEClassifiers(indiPackage, ontology));
	metamodel.setEPackage(epackage);
	metamodel.setName(metamodel.getEPackage().getName());
	return metamodel;
}
public String getNamedElement_Name(OWLIndividual indiNamedElement,OWLOntology ont)
{
	String name="";
	Set<OWLLiteral> values = indiNamedElement.getDataPropertyValues(METAMODEL.ENAMEDELEMENT_NAME, ont);
	if (values.size()>0)
		name = values.iterator().next().getLiteral();
	return name;
}
public String getNsUri (OWLIndividual indiPackage, OWLOntology ontology)
{
	String uri="";
	Set<OWLLiteral> values = indiPackage.getDataPropertyValues(METAMODEL.EPACKAGE_NSURI, ontology);
	if (values.size()>0)
		uri = values.iterator().next().getLiteral();
	return uri;
}
public String getNsPrefix (OWLIndividual indiPackage, OWLOntology ontology)
{
	String prefix="";
	Set<OWLLiteral> values = indiPackage.getDataPropertyValues(METAMODEL.EPACKAGE_NSPREFIX, ontology);
	if (values.size()>0)
		prefix = values.iterator().next().getLiteral();
	return prefix;
}
public Set<EClassifier> getEClassifiers(OWLIndividual indiPackage,OWLOntology ontology)
{
	Set<EClassifier> eClassifiers = new HashSet<EClassifier>();
	Set<OWLIndividual> indiEClassifiers = indiPackage.getObjectPropertyValues(METAMODEL.EPACKAGE_ECLASSIFIERS, ontology);
	for (OWLIndividual i:indiEClassifiers)
	{
		if (i.getTypes(ontology).contains(METAMODEL.ECLASS))
		{
			EClass eClass = getEClass(i, ontology);
			eClassifiers.add(eClass);
		}
	}
	for (EClassifier e:eClassifiers)
	{
		if (e instanceof EClass)
		{
			EClass eClass = (EClass)e;
			//determine eReferenceType
			for (EReference ref:eClass.getEReferences())
			{
				String refUri = getNsUri(indiPackage, ontology)+"#"+eClass.getName()+"_"+ref.getName();
				OWLIndividual indiRef = manager.getOWLDataFactory().getOWLNamedIndividual(IRI.create(refUri));
				OWLIndividual indiRefType = getEReferenceType(indiRef, ontology);
				String name = getNamedElement_Name(indiRefType, ontology);
				for (EClassifier type :eClassifiers)
				{
					if (type instanceof EClass)
					{
						if (type.getName().equals(name))
						{
							ref.setEType(type);
							break;
						}
					}
				}
			}
			//determine eSuperTypes
			String classUri = getNsUri(indiPackage, ontology)+"#"+eClass.getName();
			OWLIndividual indiClass = manager.getOWLDataFactory().getOWLNamedIndividual(IRI.create(classUri));
			for (OWLIndividual indiType:getESuperTypes(indiClass, ontology))
			{
				for (EClassifier type :eClassifiers)
				{
					if (type instanceof EClass)
					{
						String uri = getNsUri(indiPackage, ontology)+"#"+type.getName();
						if (indiType.toStringID().equals(uri))
						{
							eClass.getESuperTypes().add((EClass) type);
							break;
						}
					}
				}
			}
		}
	}
	return eClassifiers;
}
public EClass getEClass (OWLIndividual indiEClass,OWLOntology ontology)
{
	EClass eClass = EcoreFactoryImpl.eINSTANCE.createEClass();
	eClass.setName(getNamedElement_Name(indiEClass, ontology));
	eClass.getEStructuralFeatures().addAll(getEReferences(indiEClass, ontology));
	eClass.getEStructuralFeatures().addAll(getEAttributes(indiEClass, ontology));
	return eClass;
}
public Set<EReference> getEReferences (OWLIndividual indiEClass,OWLOntology ontology)
{
	Set<EReference> eReferences = new HashSet<EReference>();
	Set<OWLIndividual> indiEReferences = indiEClass.getObjectPropertyValues(METAMODEL.ECLASS_EREFERENCES, ontology);
	for (OWLIndividual i:indiEReferences)
	{
			EReference eref = getEReference(i, ontology);
			eReferences.add(eref);
	}
	return eReferences;
}
public EReference getEReference (OWLIndividual indiEReference,OWLOntology ontology)
{
	EReference eReference = EcoreFactoryImpl.eINSTANCE.createEReference();
	eReference.setName(getNamedElement_Name(indiEReference, ontology));
	eReference.setContainment(getBooleanAttribute(indiEReference, METAMODEL.EREFERENCE_CONTAINMENT, ontology));
	return eReference;
}
public OWLIndividual getEReferenceType (OWLIndividual indiEReference,OWLOntology ontology)
{
	OWLIndividual indi = manager.getOWLDataFactory().getOWLAnonymousIndividual();
	Set<OWLIndividual> rs = indiEReference.getObjectPropertyValues(METAMODEL.EREFERENCE_EREFERENCETYPE, ontology);
	if (rs.size()>0)
	{
		indi = rs.iterator().next();
	}
	return indi;
}
public Set<OWLIndividual> getESuperTypes(OWLIndividual indiEClass, OWLOntology ontology)
{
	System.out.println(indiEClass.toStringID());
	Set<OWLIndividual> setESuperTypes = new HashSet<OWLIndividual>();
	setESuperTypes.addAll(indiEClass.getObjectPropertyValues(METAMODEL.ECLASS_ESUPERTYPES, ontology));
	return setESuperTypes;
}
public boolean getBooleanAttribute(OWLIndividual indiElement, OWLDataPropertyExpression property, OWLOntology ontology)
{
	boolean flag=false;
	Set<OWLLiteral> values = indiElement.getDataPropertyValues(property, ontology);
	if (values.size()>0)
		flag = values.iterator().next().parseBoolean();
	return flag;
}
public Set<EAttribute> getEAttributes (OWLIndividual indiEClass,OWLOntology ontology)
{
	Set<EAttribute> eAttributes = new HashSet<EAttribute>();
	Set<OWLIndividual> indiEAttributes = indiEClass.getObjectPropertyValues(METAMODEL.ECLASS_EATTRIBUTES, ontology);
	for (OWLIndividual i:indiEAttributes)
	{
			EAttribute eAttr = getEAttribute(i, ontology);
			eAttributes.add(eAttr);
	}
	return eAttributes;
}
public EAttribute getEAttribute (OWLIndividual indiEAttribute,OWLOntology ontology)
{
	EAttribute eAttribute = EcoreFactoryImpl.eINSTANCE.createEAttribute();
	eAttribute.setName(getNamedElement_Name(indiEAttribute, ontology));
	return eAttribute;
}
public void getMetaModelsRelation(MethodContentPackage rootPkg)
{
	MetaModelPackage metamodelPkg=ispemFactory.createMetaModelPackage();
	metamodelPkg = getSpecifiedPackage(metamodelPkg, rootPkg);
	//Initialize datas
	getOntologyContent("http://www.spem-ifest.org/ontology/metamodel/mapping.owl");
	OWLDataFactory owlfactory = manager.getOWLDataFactory();
	Set<OWLIndividual> indiEClasses = new HashSet<OWLIndividual>();
			Set<OWLIndividual> indiEReference = new HashSet<OWLIndividual>();
	List<Statement> statements = RepositoryHelper.queryObject(METAMODEL.ECLASS.toStringID());
	for (Statement s:statements)
	{
		OWLIndividual indi = owlfactory.getOWLNamedIndividual(IRI.create(s.getSubject().stringValue()));
		indiEClasses.add(indi);
	}
	statements = RepositoryHelper.queryObject(METAMODEL.EREFERENCE.toStringID());
	for (Statement s:statements)
	{
		OWLIndividual indi = owlfactory.getOWLNamedIndividual(IRI.create(s.getSubject().stringValue()));
		indiEReference.add(indi);
	}
	
	Map<OWLIndividual,OWLIndividual> eclassMapping = new HashMap<OWLIndividual,OWLIndividual>();
	Map<OWLIndividual,OWLIndividual> ereferenceMapping = new HashMap<OWLIndividual,OWLIndividual>();
	Map<OWLIndividual,Set<OWLIndividual>> eclassRepresentMapping = new HashMap<OWLIndividual, Set<OWLIndividual>>();
	Map<OWLIndividual,Set<OWLIndividual>> ereferenceRepresentMapping = new HashMap<OWLIndividual, Set<OWLIndividual>>();
	for (OWLIndividual a:indiEClasses)
	{
		Set<OWLIndividual> setIndi = a.getObjectPropertyValues(METAMODEL.ECLASS_SPECIALIZEDBY, ont);
		if (!setIndi.isEmpty())
		{
			OWLIndividual indiSpecializedEClass = setIndi.iterator().next();
			eclassMapping.put(a, indiSpecializedEClass);
		}
		setIndi = a.getObjectPropertyValues(METAMODEL.ENAMEDELEMENT_REPRESENTEDBY, ont);
			eclassRepresentMapping.put(a, setIndi);
	
	}
	for (OWLIndividual a:indiEReference)
	{
		Set<OWLIndividual> setIndi = a.getObjectPropertyValues(METAMODEL.EREFERENCE_SPECIALIZEDBY, ont);
		if (!setIndi.isEmpty())
		{
			OWLIndividual indiSpecializedEClass = setIndi.iterator().next();
			ereferenceMapping.put(a, indiSpecializedEClass);
		}
		setIndi = a.getObjectPropertyValues(METAMODEL.ENAMEDELEMENT_REPRESENTEDBY, ont);
		ereferenceRepresentMapping.put(a, setIndi);
	}
	Set<EClass> eclasses = new HashSet<EClass>();
	Set<EReference> eReferences = new HashSet<EReference>();
	Set<EClassesRelation> eClassRelations = new HashSet<EClassesRelation>();
	Set<EReferencesRelation> eReferenceRelations = new HashSet<EReferencesRelation>();
	TreeIterator<EObject> tree = metamodelPkg.eAllContents();
	while (tree.hasNext())
	{
		EObject o = tree.next();
		if (o instanceof EClass)
		{
			eclasses.add((EClass) o);
		}
		if (o instanceof EReference)
		{
			eReferences.add((EReference) o);
		}
		if (o instanceof EClassesRelation)
		{
			eClassRelations.add((EClassesRelation) o);
		}
		if (o instanceof EReferencesRelation)
		{
			eReferenceRelations.add((EReferencesRelation) o);
		}
	}
	//Create relation for EClass
	for (EClass c:eclasses)
	{
		String uri = c.getEPackage().getNsURI()+"#"+c.getName(); 
		OWLIndividual indi = eclassMapping.get(owlfactory.getOWLNamedIndividual(IRI.create(uri)));
		Set<OWLIndividual> setIndiRepresent = eclassRepresentMapping.get(owlfactory.getOWLNamedIndividual(IRI.create(uri)));
		
			for (EClass c2:eclasses)
			{
				String uri2 = c2.getEPackage().getNsURI()+"#"+c2.getName();
				if (indi!=null)
				{
					if (uri2.equals(indi.toStringID()))
					{
						EClassesRelation relation = ispemFactory.createEClassesRelation();
						relation.setSource(c);
						relation.setTarget(c2);
						relation.setRelationType(ENamedElementRelationKind.SPECIALIZATION_LITERAL);
						if (!checkExisteEClassRelation(relation, eClassRelations))
						{
							metamodelPkg.getOwnedMethodContentMember().add(relation);	
						}
						
					}	
				}
				if (setIndiRepresent!=null)
				{
					if (setIndiRepresent.contains(owlfactory.getOWLNamedIndividual(IRI.create(uri2))))
					{
						EClassesRelation relation = ispemFactory.createEClassesRelation();
						relation.setSource(c);
						relation.setTarget(c2);
						relation.setRelationType(ENamedElementRelationKind.REPRESENTATION_LITERAL);
						if (!checkExisteEClassRelation(relation, eClassRelations))
						{
							metamodelPkg.getOwnedMethodContentMember().add(relation);	
						}
					}	
				}
				
			}
		
	}
	//Create relation for EReference
	for (EReference r:eReferences)
	{
		String uri = r.getEContainingClass().getEPackage().getNsURI()+"#"+r.getEContainingClass().getName()+"_"+r.getName(); 
		OWLIndividual indi = ereferenceMapping.get(owlfactory.getOWLNamedIndividual(IRI.create(uri)));
		Set<OWLIndividual> setIndiRepresent = ereferenceRepresentMapping.get(owlfactory.getOWLNamedIndividual(IRI.create(uri)));
		
			for (EReference r2:eReferences)
			{
				String uri2 = r2.getEContainingClass().getEPackage().getNsURI()+"#"+r2.getEContainingClass().getName()+"_"+r2.getName();
				if (indi!=null)
				{
					if (uri2.equals(indi.toStringID()))
					{
						EReferencesRelation relation = ispemFactory.createEReferencesRelation();
						relation.setSource(r);
						relation.setTarget(r2);
						relation.setRelationType(ENamedElementRelationKind.REPRESENTATION_LITERAL);
						if (!checkExisteEReferencesRelation(relation, eReferenceRelations))
						{
							metamodelPkg.getOwnedMethodContentMember().add(relation);	
						}
						
					}
				}
				if (setIndiRepresent!=null)
				{
					if (setIndiRepresent.contains(owlfactory.getOWLNamedIndividual(IRI.create(uri2))))
					{
						EReferencesRelation relation = ispemFactory.createEReferencesRelation();
						relation.setSource(r);
						relation.setTarget(r2);
						relation.setRelationType(ENamedElementRelationKind.REPRESENTATION_LITERAL);
						if (!checkExisteEReferencesRelation(relation, eReferenceRelations))
						{
							metamodelPkg.getOwnedMethodContentMember().add(relation);	
						}
					}
				}
				
			
			}
		
	}

}
private boolean checkExisteEClassRelation(EClassesRelation relation, Set<EClassesRelation> setRelation)
{
	for (EClassesRelation r:setRelation)
	{
		if (r.getSource()==relation.getSource() 
				&& r.getTarget() == relation.getTarget()
				&& r.getRelationType()==relation.getRelationType())
		{
			return true;
		}
	}
	return false;
}
private boolean checkExisteEReferencesRelation(EReferencesRelation relation, Set<EReferencesRelation> setRelation)
{
	for (EReferencesRelation r:setRelation)
	{
		if (r.getSource()==relation.getSource() 
				&& r.getTarget() == relation.getTarget()
				&& r.getRelationType()==relation.getRelationType())
		{
			return true;
		}
	}
	return false;
}
static public ISPEMOntologyImport getInstance() throws OWLOntologyCreationException, SAXException, IOException, ParserConfigurationException {
	if (instance==null)
	{
		instance = new ISPEMOntologyImport();
	}
	return instance;
}
}

