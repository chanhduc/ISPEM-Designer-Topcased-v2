/**
 * Generated with Acceleo
 */
package org.topcased.ispem.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.topcased.ispem.Artifact;
import org.topcased.ispem.ArtifactTransformation;
import org.topcased.ispem.IspemFactory;
import org.topcased.ispem.IspemPackage;

import org.topcased.ispem.parts.ArtifactTransformationPropertiesEditionPart;
import org.topcased.ispem.parts.IspemViewsRepository;

import org.topcased.spem.Category;
import org.topcased.spem.Guidance;
import org.topcased.spem.Kind;
import org.topcased.spem.Metric;
import org.topcased.spem.SpemFactory;
import org.topcased.spem.SpemPackage;


// End of user code

/**
 * 
 * 
 */
public class ArtifactTransformationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for kind EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings kindSettings;
	
	/**
	 * Settings for guidance ReferencesTable
	 */
	private ReferencesTableSettings guidanceSettings;
	
	/**
	 * Settings for metric ReferencesTable
	 */
	private ReferencesTableSettings metricSettings;
	
	/**
	 * Settings for category ReferencesTable
	 */
	private ReferencesTableSettings categorySettings;
	
	/**
	 * Settings for source EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings sourceSettings;
	
	/**
	 * Settings for target EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings targetSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ArtifactTransformationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject artifactTransformation, String editing_mode) {
		super(editingContext, artifactTransformation, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = IspemViewsRepository.class;
		partKey = IspemViewsRepository.ArtifactTransformation.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final ArtifactTransformation artifactTransformation = (ArtifactTransformation)elt;
			final ArtifactTransformationPropertiesEditionPart basePart = (ArtifactTransformationPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.kind)) {
				// init part
				kindSettings = new EObjectFlatComboSettings(artifactTransformation, SpemPackage.eINSTANCE.getExtensibleElement_Kind());
				basePart.initKind(kindSettings);
				// set the button mode
				basePart.setKindButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.presentationName))
				basePart.setPresentationName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, artifactTransformation.getPresentationName()));
			
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.briefDescription))
				basePart.setBriefDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, artifactTransformation.getBriefDescription()));
			
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.mainDescription))
				basePart.setMainDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, artifactTransformation.getMainDescription()));
			
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.purpose))
				basePart.setPurpose(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, artifactTransformation.getPurpose()));
			
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.guidance)) {
				guidanceSettings = new ReferencesTableSettings(artifactTransformation, SpemPackage.eINSTANCE.getDescribableElement_Guidance());
				basePart.initGuidance(guidanceSettings);
			}
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.metric)) {
				metricSettings = new ReferencesTableSettings(artifactTransformation, SpemPackage.eINSTANCE.getDescribableElement_Metric());
				basePart.initMetric(metricSettings);
			}
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.category)) {
				categorySettings = new ReferencesTableSettings(artifactTransformation, SpemPackage.eINSTANCE.getDescribableElement_Category());
				basePart.initCategory(categorySettings);
			}
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.copyright))
				basePart.setCopyright(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, artifactTransformation.getCopyright()));
			
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.author))
				basePart.setAuthor(artifactTransformation.getAuthor());
			
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.changeDate))
				basePart.setChangeDate(EEFConverterUtil.convertToString(EcorePackage.Literals.EDATE, artifactTransformation.getChangeDate()));
			
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.changeDescription))
				basePart.setChangeDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, artifactTransformation.getChangeDescription()));
			
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.version))
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, artifactTransformation.getVersion()));
			
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, artifactTransformation.getName()));
			
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.hasMultipleOccurrences)) {
				basePart.setHasMultipleOccurrences(artifactTransformation.isHasMultipleOccurrences());
			}
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.isOptional)) {
				basePart.setIsOptional(artifactTransformation.isIsOptional());
			}
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.isPlanned)) {
				basePart.setIsPlanned(artifactTransformation.isIsPlanned());
			}
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.uri))
				basePart.setUri(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, artifactTransformation.getUri()));
			
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.source)) {
				// init part
				sourceSettings = new EObjectFlatComboSettings(artifactTransformation, IspemPackage.eINSTANCE.getArtifactTransformation_Source());
				basePart.initSource(sourceSettings);
				// set the button mode
				basePart.setSourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.target)) {
				// init part
				targetSettings = new EObjectFlatComboSettings(artifactTransformation, IspemPackage.eINSTANCE.getArtifactTransformation_Target());
				basePart.initTarget(targetSettings);
				// set the button mode
				basePart.setTargetButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.transformationFile))
				basePart.setTransformationFile(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, artifactTransformation.getTransformationFile()));
			
			// init filters
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.kind)) {
				basePart.addFilterToKind(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Kind); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for kind
				// End of user code
			}
			
			
			
			
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.guidance)) {
				basePart.addFilterToGuidance(new EObjectFilter(SpemPackage.Literals.GUIDANCE));
				// Start of user code for additional businessfilters for guidance
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.metric)) {
				basePart.addFilterToMetric(new EObjectFilter(SpemPackage.Literals.METRIC));
				// Start of user code for additional businessfilters for metric
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.category)) {
				basePart.addFilterToCategory(new EObjectFilter(SpemPackage.Literals.CATEGORY));
				// Start of user code for additional businessfilters for category
				// End of user code
			}
			
			
			
			
			
			
			
			
			
			
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.source)) {
				basePart.addFilterToSource(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Artifact); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for source
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.target)) {
				basePart.addFilterToTarget(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Artifact); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for target
				// End of user code
			}
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}
























	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.kind) {
			return SpemPackage.eINSTANCE.getExtensibleElement_Kind();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.presentationName) {
			return SpemPackage.eINSTANCE.getDescribableElement_PresentationName();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.briefDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_BriefDescription();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.mainDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_MainDescription();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.purpose) {
			return SpemPackage.eINSTANCE.getDescribableElement_Purpose();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.guidance) {
			return SpemPackage.eINSTANCE.getDescribableElement_Guidance();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.metric) {
			return SpemPackage.eINSTANCE.getDescribableElement_Metric();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.category) {
			return SpemPackage.eINSTANCE.getDescribableElement_Category();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.copyright) {
			return SpemPackage.eINSTANCE.getDescribableElement_Copyright();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.author) {
			return SpemPackage.eINSTANCE.getDescribableElement_Author();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.changeDate) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDate();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.changeDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.version) {
			return SpemPackage.eINSTANCE.getDescribableElement_Version();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.name) {
			return SpemPackage.eINSTANCE.getProcessPackageableElement_Name();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.hasMultipleOccurrences) {
			return SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.isOptional) {
			return SpemPackage.eINSTANCE.getBreakdownElement_IsOptional();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.isPlanned) {
			return SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.uri) {
			return IspemPackage.eINSTANCE.getOntologyLinkedElement_Uri();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.source) {
			return IspemPackage.eINSTANCE.getArtifactTransformation_Source();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.target) {
			return IspemPackage.eINSTANCE.getArtifactTransformation_Target();
		}
		if (editorKey == IspemViewsRepository.ArtifactTransformation.Properties.transformationFile) {
			return IspemPackage.eINSTANCE.getArtifactTransformation_TransformationFile();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ArtifactTransformation artifactTransformation = (ArtifactTransformation)semanticObject;
		if (IspemViewsRepository.ArtifactTransformation.Properties.kind == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				kindSettings.setToReference((Kind)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Kind eObject = SpemFactory.eINSTANCE.createKind();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				kindSettings.setToReference(eObject);
			}
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.presentationName == event.getAffectedEditor()) {
			artifactTransformation.setPresentationName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.briefDescription == event.getAffectedEditor()) {
			artifactTransformation.setBriefDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.mainDescription == event.getAffectedEditor()) {
			artifactTransformation.setMainDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.purpose == event.getAffectedEditor()) {
			artifactTransformation.setPurpose((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.guidance == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Guidance) {
					guidanceSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				guidanceSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				guidanceSettings.move(event.getNewIndex(), (Guidance) event.getNewValue());
			}
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.metric == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Metric) {
					metricSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				metricSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				metricSettings.move(event.getNewIndex(), (Metric) event.getNewValue());
			}
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.category == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Category) {
					categorySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				categorySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				categorySettings.move(event.getNewIndex(), (Category) event.getNewValue());
			}
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.copyright == event.getAffectedEditor()) {
			artifactTransformation.setCopyright((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.author == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				artifactTransformation.getAuthor().clear();
				artifactTransformation.getAuthor().addAll(((EList) event.getNewValue()));
			}
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.changeDate == event.getAffectedEditor()) {
			artifactTransformation.setChangeDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.Literals.EDATE, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.changeDescription == event.getAffectedEditor()) {
			artifactTransformation.setChangeDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.version == event.getAffectedEditor()) {
			artifactTransformation.setVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.name == event.getAffectedEditor()) {
			artifactTransformation.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.hasMultipleOccurrences == event.getAffectedEditor()) {
			artifactTransformation.setHasMultipleOccurrences((Boolean)event.getNewValue());
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.isOptional == event.getAffectedEditor()) {
			artifactTransformation.setIsOptional((Boolean)event.getNewValue());
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.isPlanned == event.getAffectedEditor()) {
			artifactTransformation.setIsPlanned((Boolean)event.getNewValue());
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.uri == event.getAffectedEditor()) {
			artifactTransformation.setUri((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.source == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				sourceSettings.setToReference((Artifact)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Artifact eObject = IspemFactory.eINSTANCE.createArtifact();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				sourceSettings.setToReference(eObject);
			}
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.target == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				targetSettings.setToReference((Artifact)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Artifact eObject = IspemFactory.eINSTANCE.createArtifact();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				targetSettings.setToReference(eObject);
			}
		}
		if (IspemViewsRepository.ArtifactTransformation.Properties.transformationFile == event.getAffectedEditor()) {
			artifactTransformation.setTransformationFile((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ArtifactTransformationPropertiesEditionPart basePart = (ArtifactTransformationPropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getExtensibleElement_Kind().equals(msg.getFeature()) && basePart != null && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.kind))
				basePart.setKind((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getDescribableElement_PresentationName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.presentationName)) {
				if (msg.getNewValue() != null) {
					basePart.setPresentationName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setPresentationName("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.briefDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setBriefDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setBriefDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_MainDescription().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.mainDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setMainDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setMainDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Purpose().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.purpose)) {
				if (msg.getNewValue() != null) {
					basePart.setPurpose(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setPurpose("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Guidance().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.guidance))
				basePart.updateGuidance();
			if (SpemPackage.eINSTANCE.getDescribableElement_Metric().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.metric))
				basePart.updateMetric();
			if (SpemPackage.eINSTANCE.getDescribableElement_Category().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.category))
				basePart.updateCategory();
			if (SpemPackage.eINSTANCE.getDescribableElement_Copyright().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.copyright)) {
				if (msg.getNewValue() != null) {
					basePart.setCopyright(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCopyright("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Author().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.author)) {
				if (msg.getNewValue() instanceof EList<?>) {
					basePart.setAuthor((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					basePart.setAuthor(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					basePart.setAuthor(newValueAsList);
				}
			}
			
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.changeDate)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDate(EcoreUtil.convertToString(EcorePackage.Literals.EDATE, msg.getNewValue()));
				} else {
					basePart.setChangeDate("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.changeDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setChangeDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Version().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (SpemPackage.eINSTANCE.getProcessPackageableElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.hasMultipleOccurrences))
				basePart.setHasMultipleOccurrences((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.isOptional))
				basePart.setIsOptional((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.isPlanned))
				basePart.setIsPlanned((Boolean)msg.getNewValue());
			
			if (IspemPackage.eINSTANCE.getOntologyLinkedElement_Uri().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.uri)) {
				if (msg.getNewValue() != null) {
					basePart.setUri(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setUri("");
				}
			}
			if (IspemPackage.eINSTANCE.getArtifactTransformation_Source().equals(msg.getFeature()) && basePart != null && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.source))
				basePart.setSource((EObject)msg.getNewValue());
			if (IspemPackage.eINSTANCE.getArtifactTransformation_Target().equals(msg.getFeature()) && basePart != null && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.target))
				basePart.setTarget((EObject)msg.getNewValue());
			if (IspemPackage.eINSTANCE.getArtifactTransformation_TransformationFile().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.ArtifactTransformation.Properties.transformationFile)) {
				if (msg.getNewValue() != null) {
					basePart.setTransformationFile(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setTransformationFile("");
				}
			}
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			SpemPackage.eINSTANCE.getExtensibleElement_Kind(),
			SpemPackage.eINSTANCE.getDescribableElement_PresentationName(),
			SpemPackage.eINSTANCE.getDescribableElement_BriefDescription(),
			SpemPackage.eINSTANCE.getDescribableElement_MainDescription(),
			SpemPackage.eINSTANCE.getDescribableElement_Purpose(),
			SpemPackage.eINSTANCE.getDescribableElement_Guidance(),
			SpemPackage.eINSTANCE.getDescribableElement_Metric(),
			SpemPackage.eINSTANCE.getDescribableElement_Category(),
			SpemPackage.eINSTANCE.getDescribableElement_Copyright(),
			SpemPackage.eINSTANCE.getDescribableElement_Author(),
			SpemPackage.eINSTANCE.getDescribableElement_ChangeDate(),
			SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription(),
			SpemPackage.eINSTANCE.getDescribableElement_Version(),
			SpemPackage.eINSTANCE.getProcessPackageableElement_Name(),
			SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences(),
			SpemPackage.eINSTANCE.getBreakdownElement_IsOptional(),
			SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned(),
			IspemPackage.eINSTANCE.getOntologyLinkedElement_Uri(),
			IspemPackage.eINSTANCE.getArtifactTransformation_Source(),
			IspemPackage.eINSTANCE.getArtifactTransformation_Target(),
			IspemPackage.eINSTANCE.getArtifactTransformation_TransformationFile()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == IspemViewsRepository.ArtifactTransformation.Properties.hasMultipleOccurrences || key == IspemViewsRepository.ArtifactTransformation.Properties.isOptional || key == IspemViewsRepository.ArtifactTransformation.Properties.isPlanned;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (IspemViewsRepository.ArtifactTransformation.Properties.presentationName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.ArtifactTransformation.Properties.briefDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.ArtifactTransformation.Properties.mainDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.ArtifactTransformation.Properties.purpose == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.ArtifactTransformation.Properties.copyright == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.ArtifactTransformation.Properties.author == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Author().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (IspemViewsRepository.ArtifactTransformation.Properties.changeDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.ArtifactTransformation.Properties.changeDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.ArtifactTransformation.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.ArtifactTransformation.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.ArtifactTransformation.Properties.hasMultipleOccurrences == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.ArtifactTransformation.Properties.isOptional == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.ArtifactTransformation.Properties.isPlanned == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.ArtifactTransformation.Properties.uri == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(IspemPackage.eINSTANCE.getOntologyLinkedElement_Uri().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(IspemPackage.eINSTANCE.getOntologyLinkedElement_Uri().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.ArtifactTransformation.Properties.transformationFile == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(IspemPackage.eINSTANCE.getArtifactTransformation_TransformationFile().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(IspemPackage.eINSTANCE.getArtifactTransformation_TransformationFile().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
