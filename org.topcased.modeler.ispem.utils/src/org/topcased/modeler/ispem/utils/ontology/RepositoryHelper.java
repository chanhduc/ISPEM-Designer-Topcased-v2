package org.topcased.modeler.ispem.utils.ontology;

import info.aduna.iteration.Iterations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openrdf.OpenRDFException;
import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.vocabulary.RDF;
import org.openrdf.repository.Repository;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;
import org.openrdf.repository.RepositoryResult;
import org.openrdf.repository.config.RepositoryConfigException;
import org.openrdf.repository.manager.RemoteRepositoryManager;
import org.openrdf.repository.manager.RepositoryManager;
import org.openrdf.rio.RDFFormat;
import org.openrdf.rio.RDFHandler;
import org.openrdf.rio.RDFHandlerException;
import org.openrdf.rio.rdfxml.RDFXMLWriter;

import com.hp.hpl.jena.vocabulary.OWL;

public class RepositoryHelper {
	static String SERVER="http://processontology-ispem.rhcloud.com//openrdf-sesame";
	static String REPOSITORY_ID = "ProcessPackage";
	static String LIBRARY_REPOSITORY_ID="LibraryPackage";
	static String ISPEM_METACLASS_CONTEXT="http://www.ispem.org/ontology/ispem.owl";
	static String METAMODEL_METACLASS_CONTEXT="http://www.eclipse.org/emf/2002/Ecore#ecore";
	static AddOWLFinish listener;
	public static void addListener(AddOWLFinish listener)
	{
		RepositoryHelper.listener = listener; 
	}
	public static void addOWL(String owlFilePath, String baseURI) throws RepositoryException {
		File file = new File(owlFilePath);
		// Connect Repository
		Repository myRepository = null;
		RepositoryConnection con = null;
		RepositoryManager repositoryManager = new RemoteRepositoryManager(
				SERVER);
		try {
			repositoryManager.initialize();

			myRepository = (Repository) repositoryManager
					.getRepository(REPOSITORY_ID);
			ValueFactory f = myRepository.getValueFactory();
			 con = myRepository.getConnection();
			URI context = f.createURI(baseURI);
				// Use the repository
				con.add(file, baseURI, RDFFormat.RDFXML, context);
				System.out.print("Ontology "+baseURI+" added successfully\n");
				//
				// URL url = new URL("http://example.org/example/remote");
				// con.add(url, url.toString(), RDFFormat.RDFXML);
		}
		catch(Exception e){
			System.out.print(e.getMessage());
		
	} finally {
		// Shutdown connection, repository and manager
		con.close();
		myRepository.shutDown();
		repositoryManager.shutDown();
	}
	}

	@SuppressWarnings("finally")
	public static List<String> getOntologyList() {
		List<String> contexts = new ArrayList<String>();
		// Connect Repository

		RepositoryManager repositoryManager = new RemoteRepositoryManager(
				SERVER);
		try {
			repositoryManager.initialize();

			Repository myRepository = (Repository) repositoryManager
					.getRepository(REPOSITORY_ID);
			ValueFactory f = myRepository.getValueFactory();
			RepositoryConnection con = myRepository.getConnection();
			try {
				RepositoryResult<Resource> contextResource = con
						.getContextIDs();
				for (Resource s : contextResource.asList()) {
					contexts.add(s.toString());

				}
							}
			finally {
				// Shutdown connection, repository and manager
				con.close();
				myRepository.shutDown();
				repositoryManager.shutDown();
				return contexts;
			}
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (RepositoryConfigException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	/**
	 * 
	 * @param context
	 * @return
	 */
	@SuppressWarnings("finally")
	public static List<String> getOWL(String context) {
		List<String> result = new ArrayList<String>();
		// Connect Repository

		RepositoryManager repositoryManager = new RemoteRepositoryManager(
				SERVER);
		try {
			repositoryManager.initialize();

			Repository myRepository = (Repository) repositoryManager
					.getRepository(REPOSITORY_ID);
			ValueFactory f = myRepository.getValueFactory();
			RepositoryConnection con = myRepository.getConnection();
			if (!con.isOpen())
				throw new Exception("Connection failed");
			try {
				// Get all resource in the context
				URI r = f.createURI(context);
				RepositoryResult<Statement> statements = con.getStatements(
						null, null, null, true, r);
				try {
					while (statements.hasNext()) {
						Statement st = statements.next();
						result.add(st.getSubject().toString());
					}
				} finally {
					statements.close();
				}
			} finally {
				// Shutdown connection, repository and manager
				con.close();
				myRepository.shutDown();
				repositoryManager.shutDown();
				return result;
			}
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (RepositoryConfigException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static boolean getOntologyWithResource(String resource, String fileName)
	{
		// Connect Repository

		RepositoryManager repositoryManager = new RemoteRepositoryManager(
				SERVER);
		try {
			repositoryManager.initialize();

			Repository myRepository = (Repository) repositoryManager
					.getRepository(REPOSITORY_ID);
			ValueFactory f = myRepository.getValueFactory();
			RepositoryConnection con = myRepository.getConnection();
			if (!con.isOpen())
				throw new Exception("Connection failed");
			// Get all resource in the context
			URI queryUri = f.createURI(resource); 
			// Retrieve all statements about Alice and put them in a list
			RepositoryResult<Statement> statements = con.getStatements(queryUri, RDF.TYPE, null, true);
			if (!statements.hasNext())
			{
				return false;
			}
			Resource context = statements.next().getContext();
			
			// Export all statements in this context to filegfdg
			File file = new File(fileName);
			if (file.exists())
				file.delete();
			FileOutputStream outstream = new FileOutputStream(file, true);
			RDFHandler rdfxmlWriter = new RDFXMLWriter(outstream);
			con.exportStatements(null, null, null, false, rdfxmlWriter, context);
			outstream.close();
			return true;
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RepositoryConfigException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RDFHandlerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public static boolean getOntologyWithName(String name, String fileName)
	{
		// Connect Repository

				RepositoryManager repositoryManager = new RemoteRepositoryManager(
						SERVER);
				try {
					repositoryManager.initialize();

					Repository myRepository = (Repository) repositoryManager
							.getRepository(REPOSITORY_ID);
					ValueFactory f = myRepository.getValueFactory();
					RepositoryConnection con = myRepository.getConnection();
					if (!con.isOpen())
						throw new Exception("Connection failed");
					// Get all resource in the context
					URI queryUri = f.createURI(name); 
					
					RepositoryResult<Statement> statements = con.getStatements(queryUri, RDF.TYPE, f.createURI(OWL.Ontology.getURI()), true);
					if (!statements.hasNext())
					{
						return false;
					}
					Resource context = statements.next().getContext();
					
					// Export all statements in this context to filegfdg
					File file = new File(fileName);
					if (file.exists())
						file.delete();
					FileOutputStream outstream = new FileOutputStream(file, true);
					RDFHandler rdfxmlWriter = new RDFXMLWriter(outstream);
					con.exportStatements(null, null, null, false, rdfxmlWriter, context);
					outstream.close();
					return true;
				} catch (RepositoryException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (RepositoryConfigException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (RDFHandlerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return false;
	}
	/**
 * 
 * @param context
 * @param fileName
 *  This operation will get the ontology from the input context and save to file.
 */
	public static String getOWLOntologyID(String resource)
	{
		// Connect Repository
				RepositoryManager repositoryManager = new RemoteRepositoryManager(
						SERVER);
				try {
					repositoryManager.initialize();

					Repository myRepository = (Repository) repositoryManager
							.getRepository(REPOSITORY_ID);
					ValueFactory f = myRepository.getValueFactory();
					RepositoryConnection con = myRepository.getConnection();
					if (!con.isOpen())
						throw new Exception("Connection failed");
					// Get all resource in the context
					URI queryUri = f.createURI(resource); 
					// Retrieve all statements about Alice and put them in a list
					RepositoryResult<Statement> statements = con.getStatements(queryUri, RDF.TYPE, null, true);
					if (!statements.hasNext())
					{
						return null;
					}
					return statements.next().getContext().stringValue();
					
				} catch (RepositoryException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (RepositoryConfigException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (RDFHandlerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
	}
	@SuppressWarnings("finally")
	public static boolean getOWL(String context, String fileName) {

	
		// Connect Repository

		RepositoryManager repositoryManager = new RemoteRepositoryManager(
				SERVER);
		try {
			repositoryManager.initialize();
			Repository myRepository = (Repository) repositoryManager
					.getRepository(REPOSITORY_ID);
			ValueFactory f = myRepository.getValueFactory();
			RepositoryConnection con = myRepository.getConnection();
			if (!con.isOpen())
				throw new Exception("Connection failed");
			try {
				// Get all resource in the context
				URI r = f.createURI(context);
				// Export all statements in this context to filegfdg
				File newfile = null;
				File file = new File(fileName);
				if (file.exists())
					file.delete();
				FileOutputStream outstream = new FileOutputStream(file, true);
				RDFHandler rdfxmlWriter = new RDFXMLWriter(outstream);
				con.exportStatements(null, null, null, true, rdfxmlWriter, r);
				outstream.close();
				
			} finally {
				// Shutdown connection, repository and manager
				con.close();
				myRepository.shutDown();
				repositoryManager.shutDown();
				return true;
			}
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RepositoryConfigException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * 
	 * @param context
	 * @param fileName
	 *  This operation will get the ontology from the input context and save to file.
	 */
		@SuppressWarnings("finally")
		public static boolean getOWL(String context, String fileName, String statementURI) {

			// Connect Repository

			RepositoryManager repositoryManager = new RemoteRepositoryManager(
					SERVER);
			try {
				repositoryManager.initialize();

				Repository myRepository = (Repository) repositoryManager
						.getRepository(REPOSITORY_ID);
				ValueFactory f = myRepository.getValueFactory();
				RepositoryConnection con = myRepository.getConnection();
				if (!con.isOpen())
					throw new Exception("Connection failed");
				try {
					// Get all resource in the context
					URI r = f.createURI(context);
					
					// Export all statements in this context to file
					File file = new File(fileName);
					if (file.exists())
						file.delete();
					FileOutputStream outstream = new FileOutputStream(file, true);
					RDFHandler rdfxmlWriter = new RDFXMLWriter(outstream);
					con.exportStatements(null, null, f.createURI(statementURI), true, rdfxmlWriter, r);
					outstream.close();
				} finally {
					// Shutdown connection, repository and manager
					con.close();
					myRepository.shutDown();
					repositoryManager.shutDown();
					return true;
				}
			} catch (RepositoryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RepositoryConfigException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}
		public static boolean getOWL(String server, String RepositoryID, String context, String fileName) {

			String sesameServer = server;
			String repositoryID = RepositoryID;
			// Connect Repository

			RepositoryManager repositoryManager = new RemoteRepositoryManager(
					sesameServer);
			try {
				repositoryManager.initialize();

				Repository myRepository = (Repository) repositoryManager
						.getRepository(repositoryID);
				ValueFactory f = myRepository.getValueFactory();
				RepositoryConnection con = myRepository.getConnection();
				if (!con.isOpen())
					throw new Exception("Connection failed");
				try {
					// Get all resource in the context
					URI r = f.createURI(context);
					
					// Export all statements in this context to file
					File file = new File(fileName);
					if (file.exists())
						file.delete();
					FileOutputStream outstream = new FileOutputStream(file, true);
					RDFHandler rdfxmlWriter = new RDFXMLWriter(outstream);
					con.exportStatements(null, null, null, true, rdfxmlWriter, r);
					outstream.close();
				} finally {
					// Shutdown connection, repository and manager
					con.close();
					myRepository.shutDown();
					repositoryManager.shutDown();
					return true;
				}
			} catch (RepositoryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RepositoryConfigException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}
		public static List<Statement> querySubject(String iri)
		{
			
			List<Statement> queryRs = null;
		
			// Connect Repository

			RepositoryManager repositoryManager = new RemoteRepositoryManager(
					SERVER);
			try {
				repositoryManager.initialize();

				Repository myRepository = (Repository) repositoryManager
						.getRepository(REPOSITORY_ID);
				ValueFactory f = myRepository.getValueFactory();
				RepositoryConnection con = myRepository.getConnection();
				try {
					// Get all resource in the context
					URI queryUri = f.createURI(iri); 
					// Retrieve all statements about Alice and put them in a list
					RepositoryResult<Statement> statements = con.getStatements(queryUri, null, null, true);
					queryRs = Iterations.addAll(statements, new ArrayList<Statement>());
				} finally {
					// Shutdown connection, repository and manager
					con.close();
					myRepository.shutDown();
					repositoryManager.shutDown();
					return queryRs;
				}
			} catch (RepositoryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RepositoryConfigException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
			return queryRs;
		}
		public static List<Statement> queryObject(String iri)
		{
			
			List<Statement> queryRs = null;
	
			// Connect Repository

			RepositoryManager repositoryManager = new RemoteRepositoryManager(
					SERVER);
			try {
				repositoryManager.initialize();

				Repository myRepository = (Repository) repositoryManager
						.getRepository(REPOSITORY_ID);
				ValueFactory f = myRepository.getValueFactory();
				RepositoryConnection con = myRepository.getConnection();
				try {
					// Get all resource in the context
					URI queryUri = f.createURI(iri); 
					URI rdfType = f.createURI("rdf:type");
					// Retrieve all statements about Alice and put them in a list
					RepositoryResult<Statement> statements = con.getStatements(null, RDF.TYPE, queryUri, true);
					queryRs = Iterations.addAll(statements, new ArrayList<Statement>());
				} finally {
					// Shutdown connection, repository and manager
					con.close();
					myRepository.shutDown();
					repositoryManager.shutDown();
					return queryRs;
				}
			} catch (RepositoryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RepositoryConfigException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
			return queryRs;
		}
		public static List<Statement> query(String subject, String predicat)
		{
			
			List<Statement> queryRs = null;
		
			// Connect Repository

			RepositoryManager repositoryManager = new RemoteRepositoryManager(
					SERVER);
			try {
				repositoryManager.initialize();

				Repository myRepository = (Repository) repositoryManager
						.getRepository(REPOSITORY_ID);
				ValueFactory f = myRepository.getValueFactory();
				RepositoryConnection con = myRepository.getConnection();
				try {
					// Get all resource in the context
					URI subjectUri = f.createURI(subject); 
					URI predicatUri = f.createURI(predicat);
				
					// Retrieve all statements about Alice and put them in a list
					RepositoryResult<Statement> statements = con.getStatements(subjectUri,predicatUri, null, true);
					queryRs = Iterations.addAll(statements, new ArrayList<Statement>());
				} finally {
					// Shutdown connection, repository and manager
					con.close();
					myRepository.shutDown();
					repositoryManager.shutDown();
					return queryRs;
				}
			} catch (RepositoryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RepositoryConfigException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
			return queryRs;
		}
}
