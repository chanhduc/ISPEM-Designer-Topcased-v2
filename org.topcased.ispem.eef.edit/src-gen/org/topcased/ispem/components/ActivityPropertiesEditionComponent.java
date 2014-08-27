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

import org.topcased.ispem.Activity;
import org.topcased.ispem.EngineeringDomain;
import org.topcased.ispem.IspemFactory;
import org.topcased.ispem.IspemPackage;

import org.topcased.ispem.parts.ActivityPropertiesEditionPart;
import org.topcased.ispem.parts.IspemViewsRepository;

import org.topcased.spem.ActivityUseKind;
import org.topcased.spem.BreakdownElement;
import org.topcased.spem.Category;
import org.topcased.spem.Guidance;
import org.topcased.spem.Kind;
import org.topcased.spem.MethodConfiguration;
import org.topcased.spem.Metric;
import org.topcased.spem.SpemFactory;
import org.topcased.spem.SpemPackage;
import org.topcased.spem.VariabilityElement;
import org.topcased.spem.VariabilityType;
import org.topcased.spem.WorkSequence;


// End of user code

/**
 * 
 * 
 */
public class ActivityPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for linkToPredecessor ReferencesTable
	 */
	private ReferencesTableSettings linkToPredecessorSettings;
	
	/**
	 * Settings for linkToSuccessor ReferencesTable
	 */
	private ReferencesTableSettings linkToSuccessorSettings;
	
	/**
	 * Settings for variabilityBasedOnElement EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings variabilityBasedOnElementSettings;
	
	/**
	 * Settings for usedActivity EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings usedActivitySettings;
	
	/**
	 * Settings for suppressedBreakdownElement ReferencesTable
	 */
	private ReferencesTableSettings suppressedBreakdownElementSettings;
	
	/**
	 * Settings for defaultContext EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings defaultContextSettings;
	
	/**
	 * Settings for validContext ReferencesTable
	 */
	private ReferencesTableSettings validContextSettings;
	
	/**
	 * Settings for context EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings contextSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ActivityPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject activity, String editing_mode) {
		super(editingContext, activity, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = IspemViewsRepository.class;
		partKey = IspemViewsRepository.Activity.class;
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
			
			final Activity activity = (Activity)elt;
			final ActivityPropertiesEditionPart basePart = (ActivityPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(IspemViewsRepository.Activity.Properties.preCondition))
				basePart.setPreCondition(activity.getPreCondition());
			
			if (isAccessible(IspemViewsRepository.Activity.Properties.postCondition))
				basePart.setPostCondition(activity.getPostCondition());
			
			if (isAccessible(IspemViewsRepository.Activity.Properties.kind)) {
				// init part
				kindSettings = new EObjectFlatComboSettings(activity, SpemPackage.eINSTANCE.getExtensibleElement_Kind());
				basePart.initKind(kindSettings);
				// set the button mode
				basePart.setKindButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.presentationName))
				basePart.setPresentationName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, activity.getPresentationName()));
			
			if (isAccessible(IspemViewsRepository.Activity.Properties.briefDescription))
				basePart.setBriefDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, activity.getBriefDescription()));
			
			if (isAccessible(IspemViewsRepository.Activity.Properties.mainDescription))
				basePart.setMainDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, activity.getMainDescription()));
			
			if (isAccessible(IspemViewsRepository.Activity.Properties.purpose))
				basePart.setPurpose(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, activity.getPurpose()));
			
			if (isAccessible(IspemViewsRepository.Activity.Properties.guidance)) {
				guidanceSettings = new ReferencesTableSettings(activity, SpemPackage.eINSTANCE.getDescribableElement_Guidance());
				basePart.initGuidance(guidanceSettings);
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.metric)) {
				metricSettings = new ReferencesTableSettings(activity, SpemPackage.eINSTANCE.getDescribableElement_Metric());
				basePart.initMetric(metricSettings);
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.category)) {
				categorySettings = new ReferencesTableSettings(activity, SpemPackage.eINSTANCE.getDescribableElement_Category());
				basePart.initCategory(categorySettings);
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.copyright))
				basePart.setCopyright(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, activity.getCopyright()));
			
			if (isAccessible(IspemViewsRepository.Activity.Properties.author))
				basePart.setAuthor(activity.getAuthor());
			
			if (isAccessible(IspemViewsRepository.Activity.Properties.changeDate))
				basePart.setChangeDate(EEFConverterUtil.convertToString(EcorePackage.Literals.EDATE, activity.getChangeDate()));
			
			if (isAccessible(IspemViewsRepository.Activity.Properties.changeDescription))
				basePart.setChangeDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, activity.getChangeDescription()));
			
			if (isAccessible(IspemViewsRepository.Activity.Properties.version))
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, activity.getVersion()));
			
			if (isAccessible(IspemViewsRepository.Activity.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, activity.getName()));
			
			if (isAccessible(IspemViewsRepository.Activity.Properties.hasMultipleOccurrences)) {
				basePart.setHasMultipleOccurrences(activity.isHasMultipleOccurrences());
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.isOptional)) {
				basePart.setIsOptional(activity.isIsOptional());
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.isPlanned)) {
				basePart.setIsPlanned(activity.isIsPlanned());
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.isRepeatable)) {
				basePart.setIsRepeatable(activity.isIsRepeatable());
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.isOngoing)) {
				basePart.setIsOngoing(activity.isIsOngoing());
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.isEventDriven)) {
				basePart.setIsEventDriven(activity.isIsEventDriven());
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.linkToPredecessor)) {
				linkToPredecessorSettings = new ReferencesTableSettings(activity, SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToPredecessor());
				basePart.initLinkToPredecessor(linkToPredecessorSettings);
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.linkToSuccessor)) {
				linkToSuccessorSettings = new ReferencesTableSettings(activity, SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToSuccessor());
				basePart.initLinkToSuccessor(linkToSuccessorSettings);
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.variabilityType)) {
				basePart.initVariabilityType(EEFUtils.choiceOfValues(activity, SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType()), activity.getVariabilityType());
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.variabilityBasedOnElement)) {
				// init part
				variabilityBasedOnElementSettings = new EObjectFlatComboSettings(activity, SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement());
				basePart.initVariabilityBasedOnElement(variabilityBasedOnElementSettings);
				// set the button mode
				basePart.setVariabilityBasedOnElementButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.useKind)) {
				basePart.initUseKind(EEFUtils.choiceOfValues(activity, SpemPackage.eINSTANCE.getActivity_UseKind()), activity.getUseKind());
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.usedActivity)) {
				// init part
				usedActivitySettings = new EObjectFlatComboSettings(activity, SpemPackage.eINSTANCE.getActivity_UsedActivity());
				basePart.initUsedActivity(usedActivitySettings);
				// set the button mode
				basePart.setUsedActivityButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.suppressedBreakdownElement)) {
				suppressedBreakdownElementSettings = new ReferencesTableSettings(activity, SpemPackage.eINSTANCE.getActivity_SuppressedBreakdownElement());
				basePart.initSuppressedBreakdownElement(suppressedBreakdownElementSettings);
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.defaultContext)) {
				// init part
				defaultContextSettings = new EObjectFlatComboSettings(activity, SpemPackage.eINSTANCE.getActivity_DefaultContext());
				basePart.initDefaultContext(defaultContextSettings);
				// set the button mode
				basePart.setDefaultContextButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.validContext)) {
				validContextSettings = new ReferencesTableSettings(activity, SpemPackage.eINSTANCE.getActivity_ValidContext());
				basePart.initValidContext(validContextSettings);
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.isEnactable)) {
				basePart.setIsEnactable(activity.isIsEnactable());
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.uri))
				basePart.setUri(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, activity.getUri()));
			
			if (isAccessible(IspemViewsRepository.Activity.Properties.context)) {
				// init part
				contextSettings = new EObjectFlatComboSettings(activity, IspemPackage.eINSTANCE.getActivity_Context());
				basePart.initContext(contextSettings);
				// set the button mode
				basePart.setContextButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			if (isAccessible(IspemViewsRepository.Activity.Properties.kind)) {
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
			
			
			
			
			if (isAccessible(IspemViewsRepository.Activity.Properties.guidance)) {
				basePart.addFilterToGuidance(new EObjectFilter(SpemPackage.Literals.GUIDANCE));
				// Start of user code for additional businessfilters for guidance
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.metric)) {
				basePart.addFilterToMetric(new EObjectFilter(SpemPackage.Literals.METRIC));
				// Start of user code for additional businessfilters for metric
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.category)) {
				basePart.addFilterToCategory(new EObjectFilter(SpemPackage.Literals.CATEGORY));
				// Start of user code for additional businessfilters for category
				// End of user code
			}
			
			
			
			
			
			
			
			
			
			
			
			
			if (isAccessible(IspemViewsRepository.Activity.Properties.linkToPredecessor)) {
				basePart.addFilterToLinkToPredecessor(new EObjectFilter(SpemPackage.Literals.WORK_SEQUENCE));
				// Start of user code for additional businessfilters for linkToPredecessor
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.linkToSuccessor)) {
				basePart.addFilterToLinkToSuccessor(new EObjectFilter(SpemPackage.Literals.WORK_SEQUENCE));
				// Start of user code for additional businessfilters for linkToSuccessor
				// End of user code
			}
			
			if (isAccessible(IspemViewsRepository.Activity.Properties.variabilityBasedOnElement)) {
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
			
			if (isAccessible(IspemViewsRepository.Activity.Properties.usedActivity)) {
				basePart.addFilterToUsedActivity(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Activity); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for usedActivity
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.suppressedBreakdownElement)) {
				basePart.addFilterToSuppressedBreakdownElement(new EObjectFilter(SpemPackage.Literals.BREAKDOWN_ELEMENT));
				// Start of user code for additional businessfilters for suppressedBreakdownElement
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.defaultContext)) {
				basePart.addFilterToDefaultContext(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MethodConfiguration); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for defaultContext
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.Activity.Properties.validContext)) {
				basePart.addFilterToValidContext(new EObjectFilter(SpemPackage.Literals.METHOD_CONFIGURATION));
				// Start of user code for additional businessfilters for validContext
				// End of user code
			}
			
			
			if (isAccessible(IspemViewsRepository.Activity.Properties.context)) {
				basePart.addFilterToContext(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof EngineeringDomain); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for context
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
		if (editorKey == IspemViewsRepository.Activity.Properties.preCondition) {
			return SpemPackage.eINSTANCE.getWorkDefinition_PreCondition();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.postCondition) {
			return SpemPackage.eINSTANCE.getWorkDefinition_PostCondition();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.kind) {
			return SpemPackage.eINSTANCE.getExtensibleElement_Kind();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.presentationName) {
			return SpemPackage.eINSTANCE.getDescribableElement_PresentationName();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.briefDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_BriefDescription();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.mainDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_MainDescription();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.purpose) {
			return SpemPackage.eINSTANCE.getDescribableElement_Purpose();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.guidance) {
			return SpemPackage.eINSTANCE.getDescribableElement_Guidance();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.metric) {
			return SpemPackage.eINSTANCE.getDescribableElement_Metric();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.category) {
			return SpemPackage.eINSTANCE.getDescribableElement_Category();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.copyright) {
			return SpemPackage.eINSTANCE.getDescribableElement_Copyright();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.author) {
			return SpemPackage.eINSTANCE.getDescribableElement_Author();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.changeDate) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDate();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.changeDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.version) {
			return SpemPackage.eINSTANCE.getDescribableElement_Version();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.name) {
			return SpemPackage.eINSTANCE.getProcessPackageableElement_Name();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.hasMultipleOccurrences) {
			return SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.isOptional) {
			return SpemPackage.eINSTANCE.getBreakdownElement_IsOptional();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.isPlanned) {
			return SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.isRepeatable) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.isOngoing) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.isEventDriven) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.linkToPredecessor) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToPredecessor();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.linkToSuccessor) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToSuccessor();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.variabilityType) {
			return SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.variabilityBasedOnElement) {
			return SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.useKind) {
			return SpemPackage.eINSTANCE.getActivity_UseKind();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.usedActivity) {
			return SpemPackage.eINSTANCE.getActivity_UsedActivity();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.suppressedBreakdownElement) {
			return SpemPackage.eINSTANCE.getActivity_SuppressedBreakdownElement();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.defaultContext) {
			return SpemPackage.eINSTANCE.getActivity_DefaultContext();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.validContext) {
			return SpemPackage.eINSTANCE.getActivity_ValidContext();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.isEnactable) {
			return SpemPackage.eINSTANCE.getActivity_IsEnactable();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.uri) {
			return IspemPackage.eINSTANCE.getOntologyLinkedElement_Uri();
		}
		if (editorKey == IspemViewsRepository.Activity.Properties.context) {
			return IspemPackage.eINSTANCE.getActivity_Context();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Activity activity = (Activity)semanticObject;
		if (IspemViewsRepository.Activity.Properties.preCondition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				activity.getPreCondition().clear();
				activity.getPreCondition().addAll(((EList) event.getNewValue()));
			}
		}
		if (IspemViewsRepository.Activity.Properties.postCondition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				activity.getPostCondition().clear();
				activity.getPostCondition().addAll(((EList) event.getNewValue()));
			}
		}
		if (IspemViewsRepository.Activity.Properties.kind == event.getAffectedEditor()) {
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
		if (IspemViewsRepository.Activity.Properties.presentationName == event.getAffectedEditor()) {
			activity.setPresentationName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.Activity.Properties.briefDescription == event.getAffectedEditor()) {
			activity.setBriefDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.Activity.Properties.mainDescription == event.getAffectedEditor()) {
			activity.setMainDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.Activity.Properties.purpose == event.getAffectedEditor()) {
			activity.setPurpose((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.Activity.Properties.guidance == event.getAffectedEditor()) {
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
		if (IspemViewsRepository.Activity.Properties.metric == event.getAffectedEditor()) {
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
		if (IspemViewsRepository.Activity.Properties.category == event.getAffectedEditor()) {
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
		if (IspemViewsRepository.Activity.Properties.copyright == event.getAffectedEditor()) {
			activity.setCopyright((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.Activity.Properties.author == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				activity.getAuthor().clear();
				activity.getAuthor().addAll(((EList) event.getNewValue()));
			}
		}
		if (IspemViewsRepository.Activity.Properties.changeDate == event.getAffectedEditor()) {
			activity.setChangeDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.Literals.EDATE, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.Activity.Properties.changeDescription == event.getAffectedEditor()) {
			activity.setChangeDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.Activity.Properties.version == event.getAffectedEditor()) {
			activity.setVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.Activity.Properties.name == event.getAffectedEditor()) {
			activity.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.Activity.Properties.hasMultipleOccurrences == event.getAffectedEditor()) {
			activity.setHasMultipleOccurrences((Boolean)event.getNewValue());
		}
		if (IspemViewsRepository.Activity.Properties.isOptional == event.getAffectedEditor()) {
			activity.setIsOptional((Boolean)event.getNewValue());
		}
		if (IspemViewsRepository.Activity.Properties.isPlanned == event.getAffectedEditor()) {
			activity.setIsPlanned((Boolean)event.getNewValue());
		}
		if (IspemViewsRepository.Activity.Properties.isRepeatable == event.getAffectedEditor()) {
			activity.setIsRepeatable((Boolean)event.getNewValue());
		}
		if (IspemViewsRepository.Activity.Properties.isOngoing == event.getAffectedEditor()) {
			activity.setIsOngoing((Boolean)event.getNewValue());
		}
		if (IspemViewsRepository.Activity.Properties.isEventDriven == event.getAffectedEditor()) {
			activity.setIsEventDriven((Boolean)event.getNewValue());
		}
		if (IspemViewsRepository.Activity.Properties.linkToPredecessor == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof WorkSequence) {
					linkToPredecessorSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				linkToPredecessorSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				linkToPredecessorSettings.move(event.getNewIndex(), (WorkSequence) event.getNewValue());
			}
		}
		if (IspemViewsRepository.Activity.Properties.linkToSuccessor == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof WorkSequence) {
					linkToSuccessorSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				linkToSuccessorSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				linkToSuccessorSettings.move(event.getNewIndex(), (WorkSequence) event.getNewValue());
			}
		}
		if (IspemViewsRepository.Activity.Properties.variabilityType == event.getAffectedEditor()) {
			activity.setVariabilityType((VariabilityType)event.getNewValue());
		}
		if (IspemViewsRepository.Activity.Properties.variabilityBasedOnElement == event.getAffectedEditor()) {
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
		if (IspemViewsRepository.Activity.Properties.useKind == event.getAffectedEditor()) {
			activity.setUseKind((ActivityUseKind)event.getNewValue());
		}
		if (IspemViewsRepository.Activity.Properties.usedActivity == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				usedActivitySettings.setToReference((Activity)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Activity eObject = IspemFactory.eINSTANCE.createActivity();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				usedActivitySettings.setToReference(eObject);
			}
		}
		if (IspemViewsRepository.Activity.Properties.suppressedBreakdownElement == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BreakdownElement) {
					suppressedBreakdownElementSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				suppressedBreakdownElementSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				suppressedBreakdownElementSettings.move(event.getNewIndex(), (BreakdownElement) event.getNewValue());
			}
		}
		if (IspemViewsRepository.Activity.Properties.defaultContext == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				defaultContextSettings.setToReference((MethodConfiguration)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				MethodConfiguration eObject = SpemFactory.eINSTANCE.createMethodConfiguration();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				defaultContextSettings.setToReference(eObject);
			}
		}
		if (IspemViewsRepository.Activity.Properties.validContext == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof MethodConfiguration) {
					validContextSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				validContextSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				validContextSettings.move(event.getNewIndex(), (MethodConfiguration) event.getNewValue());
			}
		}
		if (IspemViewsRepository.Activity.Properties.isEnactable == event.getAffectedEditor()) {
			activity.setIsEnactable((Boolean)event.getNewValue());
		}
		if (IspemViewsRepository.Activity.Properties.uri == event.getAffectedEditor()) {
			activity.setUri((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.Activity.Properties.context == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				contextSettings.setToReference((EngineeringDomain)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EngineeringDomain eObject = IspemFactory.eINSTANCE.createEngineeringDomain();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				contextSettings.setToReference(eObject);
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
			ActivityPropertiesEditionPart basePart = (ActivityPropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getWorkDefinition_PreCondition().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.preCondition)) {
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
			
			if (SpemPackage.eINSTANCE.getWorkDefinition_PostCondition().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.postCondition)) {
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
			
			if (SpemPackage.eINSTANCE.getExtensibleElement_Kind().equals(msg.getFeature()) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.kind))
				basePart.setKind((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getDescribableElement_PresentationName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.presentationName)) {
				if (msg.getNewValue() != null) {
					basePart.setPresentationName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setPresentationName("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.briefDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setBriefDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setBriefDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_MainDescription().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.mainDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setMainDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setMainDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Purpose().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.purpose)) {
				if (msg.getNewValue() != null) {
					basePart.setPurpose(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setPurpose("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Guidance().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.Activity.Properties.guidance))
				basePart.updateGuidance();
			if (SpemPackage.eINSTANCE.getDescribableElement_Metric().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.Activity.Properties.metric))
				basePart.updateMetric();
			if (SpemPackage.eINSTANCE.getDescribableElement_Category().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.Activity.Properties.category))
				basePart.updateCategory();
			if (SpemPackage.eINSTANCE.getDescribableElement_Copyright().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.copyright)) {
				if (msg.getNewValue() != null) {
					basePart.setCopyright(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCopyright("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Author().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.author)) {
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
			
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.changeDate)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDate(EcoreUtil.convertToString(EcorePackage.Literals.EDATE, msg.getNewValue()));
				} else {
					basePart.setChangeDate("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.changeDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setChangeDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Version().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (SpemPackage.eINSTANCE.getProcessPackageableElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.hasMultipleOccurrences))
				basePart.setHasMultipleOccurrences((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.isOptional))
				basePart.setIsOptional((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.isPlanned))
				basePart.setIsPlanned((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.isRepeatable))
				basePart.setIsRepeatable((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.isOngoing))
				basePart.setIsOngoing((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.isEventDriven))
				basePart.setIsEventDriven((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToPredecessor().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.Activity.Properties.linkToPredecessor))
				basePart.updateLinkToPredecessor();
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToSuccessor().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.Activity.Properties.linkToSuccessor))
				basePart.updateLinkToSuccessor();
			if (SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(IspemViewsRepository.Activity.Properties.variabilityType))
				basePart.setVariabilityType((VariabilityType)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement().equals(msg.getFeature()) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.variabilityBasedOnElement))
				basePart.setVariabilityBasedOnElement((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getActivity_UseKind().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(IspemViewsRepository.Activity.Properties.useKind))
				basePart.setUseKind((ActivityUseKind)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getActivity_UsedActivity().equals(msg.getFeature()) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.usedActivity))
				basePart.setUsedActivity((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getActivity_SuppressedBreakdownElement().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.Activity.Properties.suppressedBreakdownElement))
				basePart.updateSuppressedBreakdownElement();
			if (SpemPackage.eINSTANCE.getActivity_DefaultContext().equals(msg.getFeature()) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.defaultContext))
				basePart.setDefaultContext((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getActivity_ValidContext().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.Activity.Properties.validContext))
				basePart.updateValidContext();
			if (SpemPackage.eINSTANCE.getActivity_IsEnactable().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.isEnactable))
				basePart.setIsEnactable((Boolean)msg.getNewValue());
			
			if (IspemPackage.eINSTANCE.getOntologyLinkedElement_Uri().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.uri)) {
				if (msg.getNewValue() != null) {
					basePart.setUri(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setUri("");
				}
			}
			if (IspemPackage.eINSTANCE.getActivity_Context().equals(msg.getFeature()) && basePart != null && isAccessible(IspemViewsRepository.Activity.Properties.context))
				basePart.setContext((EObject)msg.getNewValue());
			
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
			SpemPackage.eINSTANCE.getWorkDefinition_PreCondition(),
			SpemPackage.eINSTANCE.getWorkDefinition_PostCondition(),
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
			SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable(),
			SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing(),
			SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven(),
			SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToPredecessor(),
			SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToSuccessor(),
			SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType(),
			SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement(),
			SpemPackage.eINSTANCE.getActivity_UseKind(),
			SpemPackage.eINSTANCE.getActivity_UsedActivity(),
			SpemPackage.eINSTANCE.getActivity_SuppressedBreakdownElement(),
			SpemPackage.eINSTANCE.getActivity_DefaultContext(),
			SpemPackage.eINSTANCE.getActivity_ValidContext(),
			SpemPackage.eINSTANCE.getActivity_IsEnactable(),
			IspemPackage.eINSTANCE.getOntologyLinkedElement_Uri(),
			IspemPackage.eINSTANCE.getActivity_Context()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == IspemViewsRepository.Activity.Properties.hasMultipleOccurrences || key == IspemViewsRepository.Activity.Properties.isOptional || key == IspemViewsRepository.Activity.Properties.isPlanned || key == IspemViewsRepository.Activity.Properties.isRepeatable || key == IspemViewsRepository.Activity.Properties.isOngoing || key == IspemViewsRepository.Activity.Properties.isEventDriven || key == IspemViewsRepository.Activity.Properties.useKind;
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
				if (IspemViewsRepository.Activity.Properties.preCondition == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkDefinition_PreCondition().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (IspemViewsRepository.Activity.Properties.postCondition == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkDefinition_PostCondition().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (IspemViewsRepository.Activity.Properties.presentationName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.Activity.Properties.briefDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.Activity.Properties.mainDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.Activity.Properties.purpose == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.Activity.Properties.copyright == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.Activity.Properties.author == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Author().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (IspemViewsRepository.Activity.Properties.changeDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.Activity.Properties.changeDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.Activity.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.Activity.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.Activity.Properties.hasMultipleOccurrences == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.Activity.Properties.isOptional == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.Activity.Properties.isPlanned == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.Activity.Properties.isRepeatable == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.Activity.Properties.isOngoing == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.Activity.Properties.isEventDriven == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.Activity.Properties.variabilityType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.Activity.Properties.useKind == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getActivity_UseKind().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getActivity_UseKind().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.Activity.Properties.isEnactable == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getActivity_IsEnactable().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getActivity_IsEnactable().getEAttributeType(), newValue);
				}
				if (IspemViewsRepository.Activity.Properties.uri == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(IspemPackage.eINSTANCE.getOntologyLinkedElement_Uri().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(IspemPackage.eINSTANCE.getOntologyLinkedElement_Uri().getEAttributeType(), newValue);
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
