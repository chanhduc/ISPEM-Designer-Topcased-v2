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
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.topcased.ispem.DevelopmentMethod;
import org.topcased.ispem.IspemFactory;
import org.topcased.ispem.IspemPackage;
import org.topcased.ispem.MethodTaskDefinition;
import org.topcased.ispem.Viewpoint;

import org.topcased.ispem.parts.DevelopmentMethodPropertiesEditionPart;
import org.topcased.ispem.parts.IspemViewsRepository;

import org.topcased.spem.Category;
import org.topcased.spem.DescribableElement;
import org.topcased.spem.Guidance;
import org.topcased.spem.Kind;
import org.topcased.spem.MethodContentKind;
import org.topcased.spem.Metric;
import org.topcased.spem.SpemFactory;
import org.topcased.spem.SpemPackage;
import org.topcased.spem.VariabilityElement;
import org.topcased.spem.VariabilityType;


// End of user code

/**
 * 
 * 
 */
public class DevelopmentMethodPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for variabilityBasedOnElement EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings variabilityBasedOnElementSettings;
	
	/**
	 * Settings for methodContentKind EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings methodContentKindSettings;
	
	/**
	 * Settings for subCategory ReferencesTable
	 */
	private ReferencesTableSettings subCategorySettings;
	
	/**
	 * Settings for categorizedElement ReferencesTable
	 */
	private ReferencesTableSettings categorizedElementSettings;
	
	/**
	 * Settings for supports ReferencesTable
	 */
	private ReferencesTableSettings supportsSettings;
	
	/**
	 * Settings for defines EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings definesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public DevelopmentMethodPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject developmentMethod, String editing_mode) {
		super(editingContext, developmentMethod, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = IspemViewsRepository.class;
		partKey = IspemViewsRepository.DevelopmentMethod.class;
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
			
			final DevelopmentMethod developmentMethod = (DevelopmentMethod)elt;
			final DevelopmentMethodPropertiesEditionPart basePart = (DevelopmentMethodPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.kind)) {
				// init part
				kindSettings = new EObjectFlatComboSettings(developmentMethod, SpemPackage.eINSTANCE.getExtensibleElement_Kind());
				basePart.initKind(kindSettings);
				// set the button mode
				basePart.setKindButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.presentationName))
				basePart.setPresentationName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, developmentMethod.getPresentationName()));
			
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.briefDescription))
				basePart.setBriefDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, developmentMethod.getBriefDescription()));
			
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.mainDescription))
				basePart.setMainDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, developmentMethod.getMainDescription()));
			
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.purpose))
				basePart.setPurpose(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, developmentMethod.getPurpose()));
			
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.guidance)) {
				guidanceSettings = new ReferencesTableSettings(developmentMethod, SpemPackage.eINSTANCE.getDescribableElement_Guidance());
				basePart.initGuidance(guidanceSettings);
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.metric)) {
				metricSettings = new ReferencesTableSettings(developmentMethod, SpemPackage.eINSTANCE.getDescribableElement_Metric());
				basePart.initMetric(metricSettings);
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.category)) {
				categorySettings = new ReferencesTableSettings(developmentMethod, SpemPackage.eINSTANCE.getDescribableElement_Category());
				basePart.initCategory(categorySettings);
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.copyright))
				basePart.setCopyright(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, developmentMethod.getCopyright()));
			
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.author))
				basePart.setAuthor(developmentMethod.getAuthor());
			
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.changeDate))
				basePart.setChangeDate(EEFConverterUtil.convertToString(EcorePackage.Literals.EDATE, developmentMethod.getChangeDate()));
			
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.changeDescription))
				basePart.setChangeDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, developmentMethod.getChangeDescription()));
			
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.version))
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, developmentMethod.getVersion()));
			
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.uri))
				basePart.setUri(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, developmentMethod.getUri()));
			
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, developmentMethod.getName()));
			
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.variabilityType)) {
				basePart.initVariabilityType(EEFUtils.choiceOfValues(developmentMethod, SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType()), developmentMethod.getVariabilityType());
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.variabilityBasedOnElement)) {
				// init part
				variabilityBasedOnElementSettings = new EObjectFlatComboSettings(developmentMethod, SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement());
				basePart.initVariabilityBasedOnElement(variabilityBasedOnElementSettings);
				// set the button mode
				basePart.setVariabilityBasedOnElementButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.methodContentKind)) {
				// init part
				methodContentKindSettings = new EObjectFlatComboSettings(developmentMethod, SpemPackage.eINSTANCE.getMethodContentElement_MethodContentKind());
				basePart.initMethodContentKind(methodContentKindSettings);
				// set the button mode
				basePart.setMethodContentKindButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.subCategory)) {
				subCategorySettings = new ReferencesTableSettings(developmentMethod, SpemPackage.eINSTANCE.getCategory_SubCategory());
				basePart.initSubCategory(subCategorySettings);
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.categorizedElement)) {
				categorizedElementSettings = new ReferencesTableSettings(developmentMethod, SpemPackage.eINSTANCE.getCategory_CategorizedElement());
				basePart.initCategorizedElement(categorizedElementSettings);
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.supports)) {
				supportsSettings = new ReferencesTableSettings(developmentMethod, IspemPackage.eINSTANCE.getDevelopmentMethod_Supports());
				basePart.initSupports(supportsSettings);
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.defines)) {
				// init part
				definesSettings = new EObjectFlatComboSettings(developmentMethod, IspemPackage.eINSTANCE.getDevelopmentMethod_Defines());
				basePart.initDefines(definesSettings);
				// set the button mode
				basePart.setDefinesButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.kind)) {
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
			
			
			
			
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.guidance)) {
				basePart.addFilterToGuidance(new EObjectFilter(SpemPackage.Literals.GUIDANCE));
				// Start of user code for additional businessfilters for guidance
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.metric)) {
				basePart.addFilterToMetric(new EObjectFilter(SpemPackage.Literals.METRIC));
				// Start of user code for additional businessfilters for metric
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.category)) {
				basePart.addFilterToCategory(new EObjectFilter(SpemPackage.Literals.CATEGORY));
				// Start of user code for additional businessfilters for category
				// End of user code
			}
			
			
			
			
			
			
			
			
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.variabilityBasedOnElement)) {
				basePart.addFilterToVariabilityBasedOnElement(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof VariabilityElement); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for variabilityBasedOnElement
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.methodContentKind)) {
				basePart.addFilterToMethodContentKind(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MethodContentKind); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for methodContentKind
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.subCategory)) {
				basePart.addFilterToSubCategory(new EObjectFilter(SpemPackage.Literals.CATEGORY));
				// Start of user code for additional businessfilters for subCategory
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.categorizedElement)) {
				basePart.addFilterToCategorizedElement(new EObjectFilter(SpemPackage.Literals.DESCRIBABLE_ELEMENT));
				// Start of user code for additional businessfilters for categorizedElement
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.supports)) {
				basePart.addFilterToSupports(new EObjectFilter(IspemPackage.Literals.VIEWPOINT));
				// Start of user code for additional businessfilters for supports
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.defines)) {
				basePart.addFilterToDefines(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MethodTaskDefinition); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for defines
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
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.kind) {
			return SpemPackage.eINSTANCE.getExtensibleElement_Kind();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.presentationName) {
			return SpemPackage.eINSTANCE.getDescribableElement_PresentationName();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.briefDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_BriefDescription();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.mainDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_MainDescription();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.purpose) {
			return SpemPackage.eINSTANCE.getDescribableElement_Purpose();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.guidance) {
			return SpemPackage.eINSTANCE.getDescribableElement_Guidance();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.metric) {
			return SpemPackage.eINSTANCE.getDescribableElement_Metric();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.category) {
			return SpemPackage.eINSTANCE.getDescribableElement_Category();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.copyright) {
			return SpemPackage.eINSTANCE.getDescribableElement_Copyright();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.author) {
			return SpemPackage.eINSTANCE.getDescribableElement_Author();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.changeDate) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDate();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.changeDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.version) {
			return SpemPackage.eINSTANCE.getDescribableElement_Version();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.uri) {
			return IspemPackage.eINSTANCE.getOntologyLinkedElement_Uri();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.name) {
			return SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.variabilityType) {
			return SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.variabilityBasedOnElement) {
			return SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.methodContentKind) {
			return SpemPackage.eINSTANCE.getMethodContentElement_MethodContentKind();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.subCategory) {
			return SpemPackage.eINSTANCE.getCategory_SubCategory();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.categorizedElement) {
			return SpemPackage.eINSTANCE.getCategory_CategorizedElement();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.supports) {
			return IspemPackage.eINSTANCE.getDevelopmentMethod_Supports();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethod.Properties.defines) {
			return IspemPackage.eINSTANCE.getDevelopmentMethod_Defines();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		DevelopmentMethod developmentMethod = (DevelopmentMethod)semanticObject;
		if (IspemViewsRepository.DevelopmentMethod.Properties.kind == event.getAffectedEditor()) {
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
		if (IspemViewsRepository.DevelopmentMethod.Properties.presentationName == event.getAffectedEditor()) {
			developmentMethod.setPresentationName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.DevelopmentMethod.Properties.briefDescription == event.getAffectedEditor()) {
			developmentMethod.setBriefDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.DevelopmentMethod.Properties.mainDescription == event.getAffectedEditor()) {
			developmentMethod.setMainDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.DevelopmentMethod.Properties.purpose == event.getAffectedEditor()) {
			developmentMethod.setPurpose((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.DevelopmentMethod.Properties.guidance == event.getAffectedEditor()) {
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
		if (IspemViewsRepository.DevelopmentMethod.Properties.metric == event.getAffectedEditor()) {
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
		if (IspemViewsRepository.DevelopmentMethod.Properties.category == event.getAffectedEditor()) {
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
		if (IspemViewsRepository.DevelopmentMethod.Properties.copyright == event.getAffectedEditor()) {
			developmentMethod.setCopyright((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.DevelopmentMethod.Properties.author == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				developmentMethod.getAuthor().clear();
				developmentMethod.getAuthor().addAll(((EList) event.getNewValue()));
			}
		}
		if (IspemViewsRepository.DevelopmentMethod.Properties.changeDate == event.getAffectedEditor()) {
			developmentMethod.setChangeDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.Literals.EDATE, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.DevelopmentMethod.Properties.changeDescription == event.getAffectedEditor()) {
			developmentMethod.setChangeDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.DevelopmentMethod.Properties.version == event.getAffectedEditor()) {
			developmentMethod.setVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.DevelopmentMethod.Properties.uri == event.getAffectedEditor()) {
			developmentMethod.setUri((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.DevelopmentMethod.Properties.name == event.getAffectedEditor()) {
			developmentMethod.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.DevelopmentMethod.Properties.variabilityType == event.getAffectedEditor()) {
			developmentMethod.setVariabilityType((VariabilityType)event.getNewValue());
		}
		if (IspemViewsRepository.DevelopmentMethod.Properties.variabilityBasedOnElement == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				variabilityBasedOnElementSettings.setToReference((VariabilityElement)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, variabilityBasedOnElementSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (IspemViewsRepository.DevelopmentMethod.Properties.methodContentKind == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				methodContentKindSettings.setToReference((MethodContentKind)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, methodContentKindSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (IspemViewsRepository.DevelopmentMethod.Properties.subCategory == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Category) {
					subCategorySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				subCategorySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				subCategorySettings.move(event.getNewIndex(), (Category) event.getNewValue());
			}
		}
		if (IspemViewsRepository.DevelopmentMethod.Properties.categorizedElement == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof DescribableElement) {
					categorizedElementSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				categorizedElementSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				categorizedElementSettings.move(event.getNewIndex(), (DescribableElement) event.getNewValue());
			}
		}
		if (IspemViewsRepository.DevelopmentMethod.Properties.supports == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Viewpoint) {
					supportsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				supportsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				supportsSettings.move(event.getNewIndex(), (Viewpoint) event.getNewValue());
			}
		}
		if (IspemViewsRepository.DevelopmentMethod.Properties.defines == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				definesSettings.setToReference((MethodTaskDefinition)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				MethodTaskDefinition eObject = IspemFactory.eINSTANCE.createMethodTaskDefinition();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				definesSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			DevelopmentMethodPropertiesEditionPart basePart = (DevelopmentMethodPropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getExtensibleElement_Kind().equals(msg.getFeature()) && basePart != null && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.kind))
				basePart.setKind((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getDescribableElement_PresentationName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.presentationName)) {
				if (msg.getNewValue() != null) {
					basePart.setPresentationName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setPresentationName("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.briefDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setBriefDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setBriefDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_MainDescription().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.mainDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setMainDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setMainDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Purpose().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.purpose)) {
				if (msg.getNewValue() != null) {
					basePart.setPurpose(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setPurpose("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Guidance().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.guidance))
				basePart.updateGuidance();
			if (SpemPackage.eINSTANCE.getDescribableElement_Metric().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.metric))
				basePart.updateMetric();
			if (SpemPackage.eINSTANCE.getDescribableElement_Category().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.category))
				basePart.updateCategory();
			if (SpemPackage.eINSTANCE.getDescribableElement_Copyright().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.copyright)) {
				if (msg.getNewValue() != null) {
					basePart.setCopyright(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCopyright("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Author().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.author)) {
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
			
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.changeDate)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDate(EcoreUtil.convertToString(EcorePackage.Literals.EDATE, msg.getNewValue()));
				} else {
					basePart.setChangeDate("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.changeDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setChangeDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Version().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (IspemPackage.eINSTANCE.getOntologyLinkedElement_Uri().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.uri)) {
				if (msg.getNewValue() != null) {
					basePart.setUri(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setUri("");
				}
			}
			if (SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.variabilityType))
				basePart.setVariabilityType((VariabilityType)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement().equals(msg.getFeature()) && basePart != null && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.variabilityBasedOnElement))
				basePart.setVariabilityBasedOnElement((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getMethodContentElement_MethodContentKind().equals(msg.getFeature()) && basePart != null && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.methodContentKind))
				basePart.setMethodContentKind((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getCategory_SubCategory().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.subCategory))
				basePart.updateSubCategory();
			if (SpemPackage.eINSTANCE.getCategory_CategorizedElement().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.categorizedElement))
				basePart.updateCategorizedElement();
			if (IspemPackage.eINSTANCE.getDevelopmentMethod_Supports().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.supports))
				basePart.updateSupports();
			if (IspemPackage.eINSTANCE.getDevelopmentMethod_Defines().equals(msg.getFeature()) && basePart != null && isAccessible(IspemViewsRepository.DevelopmentMethod.Properties.defines))
				basePart.setDefines((EObject)msg.getNewValue());
			
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
			IspemPackage.eINSTANCE.getOntologyLinkedElement_Uri(),
			SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name(),
			SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType(),
			SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement(),
			SpemPackage.eINSTANCE.getMethodContentElement_MethodContentKind(),
			SpemPackage.eINSTANCE.getCategory_SubCategory(),
			SpemPackage.eINSTANCE.getCategory_CategorizedElement(),
			IspemPackage.eINSTANCE.getDevelopmentMethod_Supports(),
			IspemPackage.eINSTANCE.getDevelopmentMethod_Defines()		);
		return new NotificationFilter[] {filter,};
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
				if (IspemViewsRepository.DevelopmentMethod.Properties.presentationName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.DevelopmentMethod.Properties.briefDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.DevelopmentMethod.Properties.mainDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.DevelopmentMethod.Properties.purpose == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.DevelopmentMethod.Properties.copyright == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.DevelopmentMethod.Properties.author == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Author().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (IspemViewsRepository.DevelopmentMethod.Properties.changeDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.DevelopmentMethod.Properties.changeDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.DevelopmentMethod.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.DevelopmentMethod.Properties.uri == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(IspemPackage.eINSTANCE.getOntologyLinkedElement_Uri().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(IspemPackage.eINSTANCE.getOntologyLinkedElement_Uri().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.DevelopmentMethod.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.DevelopmentMethod.Properties.variabilityType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().getEAttributeType(), newValue);
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
