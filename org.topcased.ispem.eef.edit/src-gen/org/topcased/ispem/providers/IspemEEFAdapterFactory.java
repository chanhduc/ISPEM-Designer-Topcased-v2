/**
 * Generated with Acceleo
 */
package org.topcased.ispem.providers;

import org.eclipse.emf.common.notify.Adapter;

import org.topcased.ispem.util.IspemAdapterFactory;

import org.topcased.ispem.providers.ActivityPropertiesEditionProvider;
import org.topcased.spem.providers.CategoryPropertiesEditionProvider;
import org.topcased.spem.providers.MethodContentPackagePropertiesEditionProvider;
import org.topcased.spem.providers.MethodLibraryPropertiesEditionProvider;
import org.topcased.ispem.providers.TaskDefinitionPropertiesEditionProvider;
import org.topcased.ispem.providers.ToolDefinitionPropertiesEditionProvider;
import org.topcased.ispem.providers.WorkProductDefinitionPropertiesEditionProvider;
import org.topcased.spem.providers.WorkProductUsePropertiesEditionProvider;

import org.topcased.ispem.providers.ArtifactPropertiesEditionProvider;
import org.topcased.spem.uma.providers.CapabilityPatternPropertiesEditionProvider;
import org.topcased.spem.uma.providers.CategoryPackagePropertiesEditionProvider;
import org.topcased.ispem.providers.ProcessPropertiesEditionProvider;
import org.topcased.spem.uma.providers.WorkProductDefinitionPackagePropertiesEditionProvider;

/**
 * 
 * 
 */
public class IspemEEFAdapterFactory extends IspemAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createOntologyLinkedElementAdapter()
	 * 
	 */
	public Adapter createOntologyLinkedElementAdapter() {
		return new OntologyLinkedElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createEngineeringDomainAdapter()
	 * 
	 */
	public Adapter createEngineeringDomainAdapter() {
		return new EngineeringDomainPropertiesEditionProvider();
	}

	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createToolDefinitionAdapter()
	 * 
	 */
	public Adapter createToolDefinitionAdapter() {
		return new ToolDefinitionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createViewpointAdapter()
	 * 
	 */
	public Adapter createViewpointAdapter() {
		return new ViewpointPropertiesEditionProvider();
	}

	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createTaskDefinitionAdapter()
	 * 
	 */
	public Adapter createTaskDefinitionAdapter() {
		return new TaskDefinitionPropertiesEditionProvider();
	}

	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createWorkProductDefinitionAdapter()
	 * 
	 */
	public Adapter createWorkProductDefinitionAdapter() {
		return new WorkProductDefinitionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createMethodLibraryAdapter()
	 * 
	 */
	public Adapter createMethodLibraryAdapter() {
		return new MethodLibraryPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createISPEMMethodLibraryAdapter()
	 * 
	 */
	public Adapter createISPEMMethodLibraryAdapter() {
		return new ISPEMMethodLibraryPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createCategoryAdapter()
	 * 
	 */
	public Adapter createCategoryAdapter() {
		return new CategoryPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createDevelopmentMethodAdapter()
	 * 
	 */
	public Adapter createDevelopmentMethodAdapter() {
		return new DevelopmentMethodPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createMethodContentPackageAdapter()
	 * 
	 */
	public Adapter createMethodContentPackageAdapter() {
		return new MethodContentPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createEngineeringDomainPackageAdapter()
	 * 
	 */
	public Adapter createEngineeringDomainPackageAdapter() {
		return new EngineeringDomainPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createCategoryPackageAdapter()
	 * 
	 */
	public Adapter createCategoryPackageAdapter() {
		return new CategoryPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createDevelopmentMethodPackageAdapter()
	 * 
	 */
	public Adapter createDevelopmentMethodPackageAdapter() {
		return new DevelopmentMethodPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createWorkProductDefinitionPackageAdapter()
	 * 
	 */
	public Adapter createWorkProductDefinitionPackageAdapter() {
		return new WorkProductDefinitionPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createArtifactDefinitionPackageAdapter()
	 * 
	 */
	public Adapter createArtifactDefinitionPackageAdapter() {
		return new ArtifactDefinitionPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createWorkProductUseAdapter()
	 * 
	 */
	public Adapter createWorkProductUseAdapter() {
		return new WorkProductUsePropertiesEditionProvider();
	}

	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createArtifactAdapter()
	 * 
	 */
	public Adapter createArtifactAdapter() {
		return new ArtifactPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createActivityAdapter()
	 * 
	 */
	public Adapter createActivityAdapter() {
		return new ActivityPropertiesEditionProvider();
	}

	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createArtifactTransformationAdapter()
	 * 
	 */
	public Adapter createArtifactTransformationAdapter() {
		return new ArtifactTransformationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createDomainTaskDefinitionAdapter()
	 * 
	 */
	public Adapter createDomainTaskDefinitionAdapter() {
		return new DomainTaskDefinitionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createMethodTaskDefinitionAdapter()
	 * 
	 */
	public Adapter createMethodTaskDefinitionAdapter() {
		return new MethodTaskDefinitionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createArtifactDefinitionAdapter()
	 * 
	 */
	public Adapter createArtifactDefinitionAdapter() {
		return new ArtifactDefinitionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createDomainArtifactDefinitionAdapter()
	 * 
	 */
	public Adapter createDomainArtifactDefinitionAdapter() {
		return new DomainArtifactDefinitionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createMethodArtifactDefinitionAdapter()
	 * 
	 */
	public Adapter createMethodArtifactDefinitionAdapter() {
		return new MethodArtifactDefinitionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createDomainContentPackageAdapter()
	 * 
	 */
	public Adapter createDomainContentPackageAdapter() {
		return new DomainContentPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createDevelopmentMethodContentPackageAdapter()
	 * 
	 */
	public Adapter createDevelopmentMethodContentPackageAdapter() {
		return new DevelopmentMethodContentPackagePropertiesEditionProvider();
	}

	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createCapabilityPatternAdapter()
	 * 
	 */
	public Adapter createCapabilityPatternAdapter() {
		return new CapabilityPatternPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createProcessAdapter()
	 * 
	 */
	public Adapter createProcessAdapter() {
		return new ProcessPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createLanguageArtifactDefinitionAdapter()
	 * 
	 */
	public Adapter createLanguageArtifactDefinitionAdapter() {
		return new LanguageArtifactDefinitionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createLanguageTaskDefinitionAdapter()
	 * 
	 */
	public Adapter createLanguageTaskDefinitionAdapter() {
		return new LanguageTaskDefinitionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createDevelopmentMethodWithLanguageContentPackageAdapter()
	 * 
	 */
	public Adapter createDevelopmentMethodWithLanguageContentPackageAdapter() {
		return new DevelopmentMethodWithLanguageContentPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createRepresentativeLanguageAdapter()
	 * 
	 */
	public Adapter createRepresentativeLanguageAdapter() {
		return new RepresentativeLanguagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createRepresentLanguagePackageAdapter()
	 * 
	 */
	public Adapter createRepresentLanguagePackageAdapter() {
		return new RepresentLanguagePackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createMetaModelPackageAdapter()
	 * 
	 */
	public Adapter createMetaModelPackageAdapter() {
		return new MetaModelPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createMetaModelAdapter()
	 * 
	 */
	public Adapter createMetaModelAdapter() {
		return new MetaModelPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createEClassesRelationAdapter()
	 * 
	 */
	public Adapter createEClassesRelationAdapter() {
		return new EClassesRelationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.ispem.util.IspemAdapterFactory#createEReferencesRelationAdapter()
	 * 
	 */
	public Adapter createEReferencesRelationAdapter() {
		return new EReferencesRelationPropertiesEditionProvider();
	}

}
