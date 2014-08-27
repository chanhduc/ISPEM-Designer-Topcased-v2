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

import org.topcased.ispem.IspemFactory;
import org.topcased.ispem.IspemPackage;
import org.topcased.ispem.LanguageTaskDefinition;
import org.topcased.ispem.MethodTaskDefinition;

import org.topcased.ispem.parts.IspemViewsRepository;
import org.topcased.ispem.parts.LanguageTaskDefinitionPropertiesEditionPart;

import org.topcased.spem.Category;
import org.topcased.spem.Default_TaskDefinitionParameter;
import org.topcased.spem.Guidance;
import org.topcased.spem.Kind;
import org.topcased.spem.MethodContentKind;
import org.topcased.spem.Metric;
import org.topcased.spem.Qualification;
import org.topcased.spem.SpemFactory;
import org.topcased.spem.SpemPackage;
import org.topcased.spem.ToolDefinition;
import org.topcased.spem.VariabilityElement;
import org.topcased.spem.VariabilityType;


// End of user code

/**
 * 
 * 
 */
public class LanguageTaskDefinitionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for ownedTaskDefinitionParameter ReferencesTable
	 */
	protected ReferencesTableSettings ownedTaskDefinitionParameterSettings;
	
	/**
	 * Settings for requiredQualification ReferencesTable
	 */
	private ReferencesTableSettings requiredQualificationSettings;
	
	/**
	 * Settings for usedTool ReferencesTable
	 */
	private ReferencesTableSettings usedToolSettings;
	
	/**
	 * Settings for specializedBy EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings specializedBySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public LanguageTaskDefinitionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject languageTaskDefinition, String editing_mode) {
		super(editingContext, languageTaskDefinition, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = IspemViewsRepository.class;
		partKey = IspemViewsRepository.LanguageTaskDefinition.class;
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
			
			final LanguageTaskDefinition languageTaskDefinition = (LanguageTaskDefinition)elt;
			final LanguageTaskDefinitionPropertiesEditionPart basePart = (LanguageTaskDefinitionPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.kind)) {
				// init part
				kindSettings = new EObjectFlatComboSettings(languageTaskDefinition, SpemPackage.eINSTANCE.getExtensibleElement_Kind());
				basePart.initKind(kindSettings);
				// set the button mode
				basePart.setKindButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.presentationName))
				basePart.setPresentationName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, languageTaskDefinition.getPresentationName()));
			
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.briefDescription))
				basePart.setBriefDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, languageTaskDefinition.getBriefDescription()));
			
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.mainDescription))
				basePart.setMainDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, languageTaskDefinition.getMainDescription()));
			
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.purpose))
				basePart.setPurpose(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, languageTaskDefinition.getPurpose()));
			
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.guidance)) {
				guidanceSettings = new ReferencesTableSettings(languageTaskDefinition, SpemPackage.eINSTANCE.getDescribableElement_Guidance());
				basePart.initGuidance(guidanceSettings);
			}
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.metric)) {
				metricSettings = new ReferencesTableSettings(languageTaskDefinition, SpemPackage.eINSTANCE.getDescribableElement_Metric());
				basePart.initMetric(metricSettings);
			}
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.category)) {
				categorySettings = new ReferencesTableSettings(languageTaskDefinition, SpemPackage.eINSTANCE.getDescribableElement_Category());
				basePart.initCategory(categorySettings);
			}
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.copyright))
				basePart.setCopyright(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, languageTaskDefinition.getCopyright()));
			
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.author))
				basePart.setAuthor(languageTaskDefinition.getAuthor());
			
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.changeDate))
				basePart.setChangeDate(EEFConverterUtil.convertToString(EcorePackage.Literals.EDATE, languageTaskDefinition.getChangeDate()));
			
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.changeDescription))
				basePart.setChangeDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, languageTaskDefinition.getChangeDescription()));
			
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.version))
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, languageTaskDefinition.getVersion()));
			
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.uri))
				basePart.setUri(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, languageTaskDefinition.getUri()));
			
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.preCondition))
				basePart.setPreCondition(languageTaskDefinition.getPreCondition());
			
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.postCondition))
				basePart.setPostCondition(languageTaskDefinition.getPostCondition());
			
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, languageTaskDefinition.getName()));
			
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.variabilityType)) {
				basePart.initVariabilityType(EEFUtils.choiceOfValues(languageTaskDefinition, SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType()), languageTaskDefinition.getVariabilityType());
			}
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.variabilityBasedOnElement)) {
				// init part
				variabilityBasedOnElementSettings = new EObjectFlatComboSettings(languageTaskDefinition, SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement());
				basePart.initVariabilityBasedOnElement(variabilityBasedOnElementSettings);
				// set the button mode
				basePart.setVariabilityBasedOnElementButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.methodContentKind)) {
				// init part
				methodContentKindSettings = new EObjectFlatComboSettings(languageTaskDefinition, SpemPackage.eINSTANCE.getMethodContentElement_MethodContentKind());
				basePart.initMethodContentKind(methodContentKindSettings);
				// set the button mode
				basePart.setMethodContentKindButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.ownedTaskDefinitionParameter)) {
				ownedTaskDefinitionParameterSettings = new ReferencesTableSettings(languageTaskDefinition, SpemPackage.eINSTANCE.getTaskDefinition_OwnedTaskDefinitionParameter());
				basePart.initOwnedTaskDefinitionParameter(ownedTaskDefinitionParameterSettings);
			}
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.requiredQualification)) {
				requiredQualificationSettings = new ReferencesTableSettings(languageTaskDefinition, SpemPackage.eINSTANCE.getTaskDefinition_RequiredQualification());
				basePart.initRequiredQualification(requiredQualificationSettings);
			}
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.usedTool)) {
				usedToolSettings = new ReferencesTableSettings(languageTaskDefinition, SpemPackage.eINSTANCE.getTaskDefinition_UsedTool());
				basePart.initUsedTool(usedToolSettings);
			}
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.specializedBy)) {
				// init part
				specializedBySettings = new EObjectFlatComboSettings(languageTaskDefinition, IspemPackage.eINSTANCE.getLanguageTaskDefinition_SpecializedBy());
				basePart.initSpecializedBy(specializedBySettings);
				// set the button mode
				basePart.setSpecializedByButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.kind)) {
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
			
			
			
			
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.guidance)) {
				basePart.addFilterToGuidance(new EObjectFilter(SpemPackage.Literals.GUIDANCE));
				// Start of user code for additional businessfilters for guidance
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.metric)) {
				basePart.addFilterToMetric(new EObjectFilter(SpemPackage.Literals.METRIC));
				// Start of user code for additional businessfilters for metric
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.category)) {
				basePart.addFilterToCategory(new EObjectFilter(SpemPackage.Literals.CATEGORY));
				// Start of user code for additional businessfilters for category
				// End of user code
			}
			
			
			
			
			
			
			
			
			
			
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.variabilityBasedOnElement)) {
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
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.methodContentKind)) {
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
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.ownedTaskDefinitionParameter)) {
				basePart.addFilterToOwnedTaskDefinitionParameter(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Default_TaskDefinitionParameter); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for ownedTaskDefinitionParameter
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.requiredQualification)) {
				basePart.addFilterToRequiredQualification(new EObjectFilter(SpemPackage.Literals.QUALIFICATION));
				// Start of user code for additional businessfilters for requiredQualification
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.usedTool)) {
				basePart.addFilterToUsedTool(new EObjectFilter(SpemPackage.Literals.TOOL_DEFINITION));
				// Start of user code for additional businessfilters for usedTool
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.specializedBy)) {
				basePart.addFilterToSpecializedBy(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MethodTaskDefinition); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for specializedBy
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
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.kind) {
			return SpemPackage.eINSTANCE.getExtensibleElement_Kind();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.presentationName) {
			return SpemPackage.eINSTANCE.getDescribableElement_PresentationName();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.briefDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_BriefDescription();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.mainDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_MainDescription();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.purpose) {
			return SpemPackage.eINSTANCE.getDescribableElement_Purpose();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.guidance) {
			return SpemPackage.eINSTANCE.getDescribableElement_Guidance();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.metric) {
			return SpemPackage.eINSTANCE.getDescribableElement_Metric();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.category) {
			return SpemPackage.eINSTANCE.getDescribableElement_Category();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.copyright) {
			return SpemPackage.eINSTANCE.getDescribableElement_Copyright();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.author) {
			return SpemPackage.eINSTANCE.getDescribableElement_Author();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.changeDate) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDate();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.changeDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.version) {
			return SpemPackage.eINSTANCE.getDescribableElement_Version();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.uri) {
			return IspemPackage.eINSTANCE.getOntologyLinkedElement_Uri();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.preCondition) {
			return SpemPackage.eINSTANCE.getWorkDefinition_PreCondition();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.postCondition) {
			return SpemPackage.eINSTANCE.getWorkDefinition_PostCondition();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.name) {
			return SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.variabilityType) {
			return SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.variabilityBasedOnElement) {
			return SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.methodContentKind) {
			return SpemPackage.eINSTANCE.getMethodContentElement_MethodContentKind();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.ownedTaskDefinitionParameter) {
			return SpemPackage.eINSTANCE.getTaskDefinition_OwnedTaskDefinitionParameter();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.requiredQualification) {
			return SpemPackage.eINSTANCE.getTaskDefinition_RequiredQualification();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.usedTool) {
			return SpemPackage.eINSTANCE.getTaskDefinition_UsedTool();
		}
		if (editorKey == IspemViewsRepository.LanguageTaskDefinition.Properties.specializedBy) {
			return IspemPackage.eINSTANCE.getLanguageTaskDefinition_SpecializedBy();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		LanguageTaskDefinition languageTaskDefinition = (LanguageTaskDefinition)semanticObject;
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.kind == event.getAffectedEditor()) {
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
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.presentationName == event.getAffectedEditor()) {
			languageTaskDefinition.setPresentationName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.briefDescription == event.getAffectedEditor()) {
			languageTaskDefinition.setBriefDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.mainDescription == event.getAffectedEditor()) {
			languageTaskDefinition.setMainDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.purpose == event.getAffectedEditor()) {
			languageTaskDefinition.setPurpose((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.guidance == event.getAffectedEditor()) {
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
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.metric == event.getAffectedEditor()) {
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
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.category == event.getAffectedEditor()) {
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
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.copyright == event.getAffectedEditor()) {
			languageTaskDefinition.setCopyright((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.author == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				languageTaskDefinition.getAuthor().clear();
				languageTaskDefinition.getAuthor().addAll(((EList) event.getNewValue()));
			}
		}
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.changeDate == event.getAffectedEditor()) {
			languageTaskDefinition.setChangeDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.Literals.EDATE, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.changeDescription == event.getAffectedEditor()) {
			languageTaskDefinition.setChangeDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.version == event.getAffectedEditor()) {
			languageTaskDefinition.setVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.uri == event.getAffectedEditor()) {
			languageTaskDefinition.setUri((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.preCondition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				languageTaskDefinition.getPreCondition().clear();
				languageTaskDefinition.getPreCondition().addAll(((EList) event.getNewValue()));
			}
		}
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.postCondition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				languageTaskDefinition.getPostCondition().clear();
				languageTaskDefinition.getPostCondition().addAll(((EList) event.getNewValue()));
			}
		}
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.name == event.getAffectedEditor()) {
			languageTaskDefinition.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.variabilityType == event.getAffectedEditor()) {
			languageTaskDefinition.setVariabilityType((VariabilityType)event.getNewValue());
		}
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.variabilityBasedOnElement == event.getAffectedEditor()) {
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
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.methodContentKind == event.getAffectedEditor()) {
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
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.ownedTaskDefinitionParameter == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, ownedTaskDefinitionParameterSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				ownedTaskDefinitionParameterSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ownedTaskDefinitionParameterSettings.move(event.getNewIndex(), (Default_TaskDefinitionParameter) event.getNewValue());
			}
		}
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.requiredQualification == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Qualification) {
					requiredQualificationSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				requiredQualificationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				requiredQualificationSettings.move(event.getNewIndex(), (Qualification) event.getNewValue());
			}
		}
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.usedTool == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ToolDefinition) {
					usedToolSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				usedToolSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				usedToolSettings.move(event.getNewIndex(), (ToolDefinition) event.getNewValue());
			}
		}
		if (IspemViewsRepository.LanguageTaskDefinition.Properties.specializedBy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				specializedBySettings.setToReference((MethodTaskDefinition)event.getNewValue());
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
				specializedBySettings.setToReference(eObject);
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
			LanguageTaskDefinitionPropertiesEditionPart basePart = (LanguageTaskDefinitionPropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getExtensibleElement_Kind().equals(msg.getFeature()) && basePart != null && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.kind))
				basePart.setKind((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getDescribableElement_PresentationName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.presentationName)) {
				if (msg.getNewValue() != null) {
					basePart.setPresentationName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setPresentationName("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.briefDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setBriefDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setBriefDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_MainDescription().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.mainDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setMainDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setMainDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Purpose().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.purpose)) {
				if (msg.getNewValue() != null) {
					basePart.setPurpose(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setPurpose("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Guidance().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.guidance))
				basePart.updateGuidance();
			if (SpemPackage.eINSTANCE.getDescribableElement_Metric().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.metric))
				basePart.updateMetric();
			if (SpemPackage.eINSTANCE.getDescribableElement_Category().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.category))
				basePart.updateCategory();
			if (SpemPackage.eINSTANCE.getDescribableElement_Copyright().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.copyright)) {
				if (msg.getNewValue() != null) {
					basePart.setCopyright(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCopyright("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Author().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.author)) {
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
			
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.changeDate)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDate(EcoreUtil.convertToString(EcorePackage.Literals.EDATE, msg.getNewValue()));
				} else {
					basePart.setChangeDate("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.changeDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setChangeDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Version().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (IspemPackage.eINSTANCE.getOntologyLinkedElement_Uri().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.uri)) {
				if (msg.getNewValue() != null) {
					basePart.setUri(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setUri("");
				}
			}
			if (SpemPackage.eINSTANCE.getWorkDefinition_PreCondition().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.preCondition)) {
				if (msg.getNewValue() instanceof EList<?>) {
					basePart.setPreCondition((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					basePart.setPreCondition(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					basePart.setPreCondition(newValueAsList);
				}
			}
			
			if (SpemPackage.eINSTANCE.getWorkDefinition_PostCondition().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.postCondition)) {
				if (msg.getNewValue() instanceof EList<?>) {
					basePart.setPostCondition((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					basePart.setPostCondition(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					basePart.setPostCondition(newValueAsList);
				}
			}
			
			if (SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.variabilityType))
				basePart.setVariabilityType((VariabilityType)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement().equals(msg.getFeature()) && basePart != null && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.variabilityBasedOnElement))
				basePart.setVariabilityBasedOnElement((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getMethodContentElement_MethodContentKind().equals(msg.getFeature()) && basePart != null && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.methodContentKind))
				basePart.setMethodContentKind((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getTaskDefinition_OwnedTaskDefinitionParameter().equals(msg.getFeature()) && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.ownedTaskDefinitionParameter))
				basePart.updateOwnedTaskDefinitionParameter();
			if (SpemPackage.eINSTANCE.getTaskDefinition_RequiredQualification().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.requiredQualification))
				basePart.updateRequiredQualification();
			if (SpemPackage.eINSTANCE.getTaskDefinition_UsedTool().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.usedTool))
				basePart.updateUsedTool();
			if (IspemPackage.eINSTANCE.getLanguageTaskDefinition_SpecializedBy().equals(msg.getFeature()) && basePart != null && isAccessible(IspemViewsRepository.LanguageTaskDefinition.Properties.specializedBy))
				basePart.setSpecializedBy((EObject)msg.getNewValue());
			
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
			SpemPackage.eINSTANCE.getWorkDefinition_PreCondition(),
			SpemPackage.eINSTANCE.getWorkDefinition_PostCondition(),
			SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name(),
			SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType(),
			SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement(),
			SpemPackage.eINSTANCE.getMethodContentElement_MethodContentKind(),
			SpemPackage.eINSTANCE.getTaskDefinition_OwnedTaskDefinitionParameter(),
			SpemPackage.eINSTANCE.getTaskDefinition_RequiredQualification(),
			SpemPackage.eINSTANCE.getTaskDefinition_UsedTool(),
			IspemPackage.eINSTANCE.getLanguageTaskDefinition_SpecializedBy()		);
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
				if (IspemViewsRepository.LanguageTaskDefinition.Properties.presentationName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.LanguageTaskDefinition.Properties.briefDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.LanguageTaskDefinition.Properties.mainDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.LanguageTaskDefinition.Properties.purpose == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.LanguageTaskDefinition.Properties.copyright == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.LanguageTaskDefinition.Properties.author == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Author().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (IspemViewsRepository.LanguageTaskDefinition.Properties.changeDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.LanguageTaskDefinition.Properties.changeDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.LanguageTaskDefinition.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.LanguageTaskDefinition.Properties.uri == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(IspemPackage.eINSTANCE.getOntologyLinkedElement_Uri().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(IspemPackage.eINSTANCE.getOntologyLinkedElement_Uri().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.LanguageTaskDefinition.Properties.preCondition == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkDefinition_PreCondition().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (IspemViewsRepository.LanguageTaskDefinition.Properties.postCondition == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkDefinition_PostCondition().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (IspemViewsRepository.LanguageTaskDefinition.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.LanguageTaskDefinition.Properties.variabilityType == event.getAffectedEditor()) {
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
