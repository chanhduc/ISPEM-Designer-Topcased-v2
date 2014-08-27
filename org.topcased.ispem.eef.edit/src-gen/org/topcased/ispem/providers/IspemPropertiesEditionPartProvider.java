/**
 * Generated with Acceleo
 */
package org.topcased.ispem.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import org.topcased.ispem.parts.IspemViewsRepository;

import org.topcased.ispem.parts.forms.ActivityPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.ArtifactDefinitionPackagePropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.ArtifactDefinitionPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.ArtifactPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.ArtifactTransformationPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.DevelopmentMethodContentPackagePropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.DevelopmentMethodPackagePropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.DevelopmentMethodPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.DomainArtifactDefinitionPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.DomainContentPackagePropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.DomainTaskDefinitionPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.EClassesRelationPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.EReferencesRelationPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.EngineeringDomainPackagePropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.EngineeringDomainPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.ISPEMMethodLibraryPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.LanguageArtifactDefinitionPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.LanguageTaskDefinitionPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.MetaModelPackagePropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.MetaModelPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.MethodArtifactDefinitionPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.MethodTaskDefinitionPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.OntologyLinkedElementPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.ProcessPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.RepresentLanguagePackagePropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.RepresentativeLanguagePropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.TaskDefinitionPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.ToolDefinitionPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.ViewpointPropertiesEditionPartForm;
import org.topcased.ispem.parts.forms.WorkProductDefinitionPropertiesEditionPartForm;

import org.topcased.ispem.parts.impl.ActivityPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.ArtifactDefinitionPackagePropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.ArtifactDefinitionPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.ArtifactPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.ArtifactTransformationPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.DevelopmentMethodContentPackagePropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.DevelopmentMethodPackagePropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.DevelopmentMethodPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.DomainArtifactDefinitionPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.DomainContentPackagePropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.DomainTaskDefinitionPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.EClassesRelationPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.EReferencesRelationPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.EngineeringDomainPackagePropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.EngineeringDomainPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.ISPEMMethodLibraryPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.LanguageArtifactDefinitionPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.LanguageTaskDefinitionPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.MetaModelPackagePropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.MetaModelPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.MethodArtifactDefinitionPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.MethodTaskDefinitionPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.OntologyLinkedElementPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.ProcessPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.RepresentLanguagePackagePropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.RepresentativeLanguagePropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.TaskDefinitionPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.ToolDefinitionPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.ViewpointPropertiesEditionPartImpl;
import org.topcased.ispem.parts.impl.WorkProductDefinitionPropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class IspemPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == IspemViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == IspemViewsRepository.EngineeringDomain.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new EngineeringDomainPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new EngineeringDomainPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.ToolDefinition.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new ToolDefinitionPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new ToolDefinitionPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.Viewpoint.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new ViewpointPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new ViewpointPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.TaskDefinition.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new TaskDefinitionPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new TaskDefinitionPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.WorkProductDefinition.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new WorkProductDefinitionPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new WorkProductDefinitionPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.ISPEMMethodLibrary.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new ISPEMMethodLibraryPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new ISPEMMethodLibraryPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.DevelopmentMethod.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new DevelopmentMethodPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new DevelopmentMethodPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.EngineeringDomainPackage.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new EngineeringDomainPackagePropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new EngineeringDomainPackagePropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.DevelopmentMethodPackage.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new DevelopmentMethodPackagePropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new DevelopmentMethodPackagePropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.OntologyLinkedElement.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new OntologyLinkedElementPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new OntologyLinkedElementPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.ArtifactDefinitionPackage.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new ArtifactDefinitionPackagePropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new ArtifactDefinitionPackagePropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.Artifact.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new ArtifactPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new ArtifactPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.Activity.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new ActivityPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new ActivityPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.ArtifactTransformation.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new ArtifactTransformationPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new ArtifactTransformationPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.DomainTaskDefinition.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new DomainTaskDefinitionPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new DomainTaskDefinitionPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.MethodTaskDefinition.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new MethodTaskDefinitionPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new MethodTaskDefinitionPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.DomainArtifactDefinition.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new DomainArtifactDefinitionPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new DomainArtifactDefinitionPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.MethodArtifactDefinition.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new MethodArtifactDefinitionPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new MethodArtifactDefinitionPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.DomainContentPackage.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new DomainContentPackagePropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new DomainContentPackagePropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.DevelopmentMethodContentPackage.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new DevelopmentMethodContentPackagePropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new DevelopmentMethodContentPackagePropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.Process.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new ProcessPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new ProcessPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.LanguageArtifactDefinition.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new LanguageArtifactDefinitionPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new LanguageArtifactDefinitionPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.LanguageTaskDefinition.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new LanguageTaskDefinitionPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new LanguageTaskDefinitionPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.RepresentativeLanguage.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new RepresentativeLanguagePropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new RepresentativeLanguagePropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.RepresentLanguagePackage.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new RepresentLanguagePackagePropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new RepresentLanguagePackagePropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.MetaModelPackage.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new MetaModelPackagePropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new MetaModelPackagePropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.MetaModel.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new MetaModelPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new MetaModelPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.EClassesRelation.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new EClassesRelationPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new EClassesRelationPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.EReferencesRelation.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new EReferencesRelationPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new EReferencesRelationPropertiesEditionPartForm(component);
		}
		if (key == IspemViewsRepository.ArtifactDefinition.class) {
			if (kind == IspemViewsRepository.SWT_KIND)
				return new ArtifactDefinitionPropertiesEditionPartImpl(component);
			if (kind == IspemViewsRepository.FORM_KIND)
				return new ArtifactDefinitionPropertiesEditionPartForm(component);
		}
		return null;
	}

}
