/**
 * Generated with Acceleo
 */
package org.topcased.spem.uma.components;

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

import org.topcased.spem.Activity;
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

import org.topcased.spem.uma.ContractKind;
import org.topcased.spem.uma.DeliveryProcess;
import org.topcased.spem.uma.EstimatingTechnique;
import org.topcased.spem.uma.ExpertiseLevel;
import org.topcased.spem.uma.RiskLevel;
import org.topcased.spem.uma.SupportingMaterial;
import org.topcased.spem.uma.UmaPackage;

import org.topcased.spem.uma.parts.DeliveryProcessPropertiesEditionPart;
import org.topcased.spem.uma.parts.UmaViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class DeliveryProcessPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for communicationMaterial ReferencesTable
	 */
	private ReferencesTableSettings communicationMaterialSettings;
	
	/**
	 * Settings for educationalMaterial ReferencesTable
	 */
	private ReferencesTableSettings educationalMaterialSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public DeliveryProcessPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject deliveryProcess, String editing_mode) {
		super(editingContext, deliveryProcess, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = UmaViewsRepository.class;
		partKey = UmaViewsRepository.DeliveryProcess.class;
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
			
			final DeliveryProcess deliveryProcess = (DeliveryProcess)elt;
			final DeliveryProcessPropertiesEditionPart basePart = (DeliveryProcessPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.preCondition))
				basePart.setPreCondition(deliveryProcess.getPreCondition());
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.postCondition))
				basePart.setPostCondition(deliveryProcess.getPostCondition());
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.kind)) {
				// init part
				kindSettings = new EObjectFlatComboSettings(deliveryProcess, SpemPackage.eINSTANCE.getExtensibleElement_Kind());
				basePart.initKind(kindSettings);
				// set the button mode
				basePart.setKindButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.presentationName))
				basePart.setPresentationName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, deliveryProcess.getPresentationName()));
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.briefDescription))
				basePart.setBriefDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, deliveryProcess.getBriefDescription()));
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.mainDescription))
				basePart.setMainDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, deliveryProcess.getMainDescription()));
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.purpose))
				basePart.setPurpose(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, deliveryProcess.getPurpose()));
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.guidance)) {
				guidanceSettings = new ReferencesTableSettings(deliveryProcess, SpemPackage.eINSTANCE.getDescribableElement_Guidance());
				basePart.initGuidance(guidanceSettings);
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.metric)) {
				metricSettings = new ReferencesTableSettings(deliveryProcess, SpemPackage.eINSTANCE.getDescribableElement_Metric());
				basePart.initMetric(metricSettings);
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.category)) {
				categorySettings = new ReferencesTableSettings(deliveryProcess, SpemPackage.eINSTANCE.getDescribableElement_Category());
				basePart.initCategory(categorySettings);
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.copyright))
				basePart.setCopyright(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, deliveryProcess.getCopyright()));
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.author))
				basePart.setAuthor(deliveryProcess.getAuthor());
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.changeDate))
				basePart.setChangeDate(EEFConverterUtil.convertToString(EcorePackage.Literals.EDATE, deliveryProcess.getChangeDate()));
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.changeDescription))
				basePart.setChangeDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, deliveryProcess.getChangeDescription()));
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.version))
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, deliveryProcess.getVersion()));
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, deliveryProcess.getName()));
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.hasMultipleOccurrences)) {
				basePart.setHasMultipleOccurrences(deliveryProcess.isHasMultipleOccurrences());
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.isOptional)) {
				basePart.setIsOptional(deliveryProcess.isIsOptional());
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.isPlanned)) {
				basePart.setIsPlanned(deliveryProcess.isIsPlanned());
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.isRepeatable)) {
				basePart.setIsRepeatable(deliveryProcess.isIsRepeatable());
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.isOngoing)) {
				basePart.setIsOngoing(deliveryProcess.isIsOngoing());
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.isEventDriven)) {
				basePart.setIsEventDriven(deliveryProcess.isIsEventDriven());
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.linkToPredecessor)) {
				linkToPredecessorSettings = new ReferencesTableSettings(deliveryProcess, SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToPredecessor());
				basePart.initLinkToPredecessor(linkToPredecessorSettings);
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.linkToSuccessor)) {
				linkToSuccessorSettings = new ReferencesTableSettings(deliveryProcess, SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToSuccessor());
				basePart.initLinkToSuccessor(linkToSuccessorSettings);
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.variabilityType)) {
				basePart.initVariabilityType(EEFUtils.choiceOfValues(deliveryProcess, SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType()), deliveryProcess.getVariabilityType());
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.variabilityBasedOnElement)) {
				// init part
				variabilityBasedOnElementSettings = new EObjectFlatComboSettings(deliveryProcess, SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement());
				basePart.initVariabilityBasedOnElement(variabilityBasedOnElementSettings);
				// set the button mode
				basePart.setVariabilityBasedOnElementButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.useKind)) {
				basePart.initUseKind(EEFUtils.choiceOfValues(deliveryProcess, SpemPackage.eINSTANCE.getActivity_UseKind()), deliveryProcess.getUseKind());
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.usedActivity)) {
				// init part
				usedActivitySettings = new EObjectFlatComboSettings(deliveryProcess, SpemPackage.eINSTANCE.getActivity_UsedActivity());
				basePart.initUsedActivity(usedActivitySettings);
				// set the button mode
				basePart.setUsedActivityButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.suppressedBreakdownElement)) {
				suppressedBreakdownElementSettings = new ReferencesTableSettings(deliveryProcess, SpemPackage.eINSTANCE.getActivity_SuppressedBreakdownElement());
				basePart.initSuppressedBreakdownElement(suppressedBreakdownElementSettings);
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.defaultContext)) {
				// init part
				defaultContextSettings = new EObjectFlatComboSettings(deliveryProcess, SpemPackage.eINSTANCE.getActivity_DefaultContext());
				basePart.initDefaultContext(defaultContextSettings);
				// set the button mode
				basePart.setDefaultContextButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.validContext)) {
				validContextSettings = new ReferencesTableSettings(deliveryProcess, SpemPackage.eINSTANCE.getActivity_ValidContext());
				basePart.initValidContext(validContextSettings);
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.isEnactable)) {
				basePart.setIsEnactable(deliveryProcess.isIsEnactable());
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.scope))
				basePart.setScope(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, deliveryProcess.getScope()));
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.usageNote))
				basePart.setUsageNote(deliveryProcess.getUsageNote());
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.scale))
				basePart.setScale(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, deliveryProcess.getScale()));
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.projectCharacteristics))
				basePart.setProjectCharacteristics(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, deliveryProcess.getProjectCharacteristics()));
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.riskLevel)) {
				basePart.initRiskLevel(EEFUtils.choiceOfValues(deliveryProcess, UmaPackage.eINSTANCE.getDeliveryProcess_RiskLevel()), deliveryProcess.getRiskLevel());
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.estimatingTechnique)) {
				basePart.initEstimatingTechnique(EEFUtils.choiceOfValues(deliveryProcess, UmaPackage.eINSTANCE.getDeliveryProcess_EstimatingTechnique()), deliveryProcess.getEstimatingTechnique());
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.projectMemberExpertise)) {
				basePart.initProjectMemberExpertise(EEFUtils.choiceOfValues(deliveryProcess, UmaPackage.eINSTANCE.getDeliveryProcess_ProjectMemberExpertise()), deliveryProcess.getProjectMemberExpertise());
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.typeOfContract)) {
				basePart.initTypeOfContract(EEFUtils.choiceOfValues(deliveryProcess, UmaPackage.eINSTANCE.getDeliveryProcess_TypeOfContract()), deliveryProcess.getTypeOfContract());
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.communicationMaterial)) {
				communicationMaterialSettings = new ReferencesTableSettings(deliveryProcess, UmaPackage.eINSTANCE.getDeliveryProcess_CommunicationMaterial());
				basePart.initCommunicationMaterial(communicationMaterialSettings);
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.educationalMaterial)) {
				educationalMaterialSettings = new ReferencesTableSettings(deliveryProcess, UmaPackage.eINSTANCE.getDeliveryProcess_EducationalMaterial());
				basePart.initEducationalMaterial(educationalMaterialSettings);
			}
			// init filters
			
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.kind)) {
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
			
			
			
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.guidance)) {
				basePart.addFilterToGuidance(new EObjectFilter(SpemPackage.Literals.GUIDANCE));
				// Start of user code for additional businessfilters for guidance
				// End of user code
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.metric)) {
				basePart.addFilterToMetric(new EObjectFilter(SpemPackage.Literals.METRIC));
				// Start of user code for additional businessfilters for metric
				// End of user code
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.category)) {
				basePart.addFilterToCategory(new EObjectFilter(SpemPackage.Literals.CATEGORY));
				// Start of user code for additional businessfilters for category
				// End of user code
			}
			
			
			
			
			
			
			
			
			
			
			
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.linkToPredecessor)) {
				basePart.addFilterToLinkToPredecessor(new EObjectFilter(SpemPackage.Literals.WORK_SEQUENCE));
				// Start of user code for additional businessfilters for linkToPredecessor
				// End of user code
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.linkToSuccessor)) {
				basePart.addFilterToLinkToSuccessor(new EObjectFilter(SpemPackage.Literals.WORK_SEQUENCE));
				// Start of user code for additional businessfilters for linkToSuccessor
				// End of user code
			}
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.variabilityBasedOnElement)) {
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
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.usedActivity)) {
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
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.suppressedBreakdownElement)) {
				basePart.addFilterToSuppressedBreakdownElement(new EObjectFilter(SpemPackage.Literals.BREAKDOWN_ELEMENT));
				// Start of user code for additional businessfilters for suppressedBreakdownElement
				// End of user code
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.defaultContext)) {
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
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.validContext)) {
				basePart.addFilterToValidContext(new EObjectFilter(SpemPackage.Literals.METHOD_CONFIGURATION));
				// Start of user code for additional businessfilters for validContext
				// End of user code
			}
			
			
			
			
			
			
			
			
			
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.communicationMaterial)) {
				basePart.addFilterToCommunicationMaterial(new EObjectFilter(UmaPackage.Literals.SUPPORTING_MATERIAL));
				// Start of user code for additional businessfilters for communicationMaterial
				// End of user code
			}
			if (isAccessible(UmaViewsRepository.DeliveryProcess.Properties.educationalMaterial)) {
				basePart.addFilterToEducationalMaterial(new EObjectFilter(UmaPackage.Literals.SUPPORTING_MATERIAL));
				// Start of user code for additional businessfilters for educationalMaterial
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
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.preCondition) {
			return SpemPackage.eINSTANCE.getWorkDefinition_PreCondition();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.postCondition) {
			return SpemPackage.eINSTANCE.getWorkDefinition_PostCondition();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.kind) {
			return SpemPackage.eINSTANCE.getExtensibleElement_Kind();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.presentationName) {
			return SpemPackage.eINSTANCE.getDescribableElement_PresentationName();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.briefDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_BriefDescription();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.mainDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_MainDescription();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.purpose) {
			return SpemPackage.eINSTANCE.getDescribableElement_Purpose();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.guidance) {
			return SpemPackage.eINSTANCE.getDescribableElement_Guidance();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.metric) {
			return SpemPackage.eINSTANCE.getDescribableElement_Metric();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.category) {
			return SpemPackage.eINSTANCE.getDescribableElement_Category();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.copyright) {
			return SpemPackage.eINSTANCE.getDescribableElement_Copyright();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.author) {
			return SpemPackage.eINSTANCE.getDescribableElement_Author();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.changeDate) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDate();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.changeDescription) {
			return SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.version) {
			return SpemPackage.eINSTANCE.getDescribableElement_Version();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.name) {
			return SpemPackage.eINSTANCE.getProcessPackageableElement_Name();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.hasMultipleOccurrences) {
			return SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.isOptional) {
			return SpemPackage.eINSTANCE.getBreakdownElement_IsOptional();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.isPlanned) {
			return SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.isRepeatable) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.isOngoing) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.isEventDriven) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.linkToPredecessor) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToPredecessor();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.linkToSuccessor) {
			return SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToSuccessor();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.variabilityType) {
			return SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.variabilityBasedOnElement) {
			return SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.useKind) {
			return SpemPackage.eINSTANCE.getActivity_UseKind();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.usedActivity) {
			return SpemPackage.eINSTANCE.getActivity_UsedActivity();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.suppressedBreakdownElement) {
			return SpemPackage.eINSTANCE.getActivity_SuppressedBreakdownElement();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.defaultContext) {
			return SpemPackage.eINSTANCE.getActivity_DefaultContext();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.validContext) {
			return SpemPackage.eINSTANCE.getActivity_ValidContext();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.isEnactable) {
			return SpemPackage.eINSTANCE.getActivity_IsEnactable();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.scope) {
			return UmaPackage.eINSTANCE.getProcess_Scope();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.usageNote) {
			return UmaPackage.eINSTANCE.getProcess_UsageNote();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.scale) {
			return UmaPackage.eINSTANCE.getDeliveryProcess_Scale();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.projectCharacteristics) {
			return UmaPackage.eINSTANCE.getDeliveryProcess_ProjectCharacteristics();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.riskLevel) {
			return UmaPackage.eINSTANCE.getDeliveryProcess_RiskLevel();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.estimatingTechnique) {
			return UmaPackage.eINSTANCE.getDeliveryProcess_EstimatingTechnique();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.projectMemberExpertise) {
			return UmaPackage.eINSTANCE.getDeliveryProcess_ProjectMemberExpertise();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.typeOfContract) {
			return UmaPackage.eINSTANCE.getDeliveryProcess_TypeOfContract();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.communicationMaterial) {
			return UmaPackage.eINSTANCE.getDeliveryProcess_CommunicationMaterial();
		}
		if (editorKey == UmaViewsRepository.DeliveryProcess.Properties.educationalMaterial) {
			return UmaPackage.eINSTANCE.getDeliveryProcess_EducationalMaterial();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		DeliveryProcess deliveryProcess = (DeliveryProcess)semanticObject;
		if (UmaViewsRepository.DeliveryProcess.Properties.preCondition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				deliveryProcess.getPreCondition().clear();
				deliveryProcess.getPreCondition().addAll(((EList) event.getNewValue()));
			}
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.postCondition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				deliveryProcess.getPostCondition().clear();
				deliveryProcess.getPostCondition().addAll(((EList) event.getNewValue()));
			}
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.kind == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.DeliveryProcess.Properties.presentationName == event.getAffectedEditor()) {
			deliveryProcess.setPresentationName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.briefDescription == event.getAffectedEditor()) {
			deliveryProcess.setBriefDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.mainDescription == event.getAffectedEditor()) {
			deliveryProcess.setMainDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.purpose == event.getAffectedEditor()) {
			deliveryProcess.setPurpose((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.guidance == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.DeliveryProcess.Properties.metric == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.DeliveryProcess.Properties.category == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.DeliveryProcess.Properties.copyright == event.getAffectedEditor()) {
			deliveryProcess.setCopyright((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.author == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				deliveryProcess.getAuthor().clear();
				deliveryProcess.getAuthor().addAll(((EList) event.getNewValue()));
			}
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.changeDate == event.getAffectedEditor()) {
			deliveryProcess.setChangeDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.Literals.EDATE, (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.changeDescription == event.getAffectedEditor()) {
			deliveryProcess.setChangeDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.version == event.getAffectedEditor()) {
			deliveryProcess.setVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.name == event.getAffectedEditor()) {
			deliveryProcess.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.hasMultipleOccurrences == event.getAffectedEditor()) {
			deliveryProcess.setHasMultipleOccurrences((Boolean)event.getNewValue());
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.isOptional == event.getAffectedEditor()) {
			deliveryProcess.setIsOptional((Boolean)event.getNewValue());
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.isPlanned == event.getAffectedEditor()) {
			deliveryProcess.setIsPlanned((Boolean)event.getNewValue());
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.isRepeatable == event.getAffectedEditor()) {
			deliveryProcess.setIsRepeatable((Boolean)event.getNewValue());
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.isOngoing == event.getAffectedEditor()) {
			deliveryProcess.setIsOngoing((Boolean)event.getNewValue());
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.isEventDriven == event.getAffectedEditor()) {
			deliveryProcess.setIsEventDriven((Boolean)event.getNewValue());
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.linkToPredecessor == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.DeliveryProcess.Properties.linkToSuccessor == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.DeliveryProcess.Properties.variabilityType == event.getAffectedEditor()) {
			deliveryProcess.setVariabilityType((VariabilityType)event.getNewValue());
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.variabilityBasedOnElement == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.DeliveryProcess.Properties.useKind == event.getAffectedEditor()) {
			deliveryProcess.setUseKind((ActivityUseKind)event.getNewValue());
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.usedActivity == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				usedActivitySettings.setToReference((Activity)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Activity eObject = SpemFactory.eINSTANCE.createActivity();
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
		if (UmaViewsRepository.DeliveryProcess.Properties.suppressedBreakdownElement == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.DeliveryProcess.Properties.defaultContext == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.DeliveryProcess.Properties.validContext == event.getAffectedEditor()) {
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
		if (UmaViewsRepository.DeliveryProcess.Properties.isEnactable == event.getAffectedEditor()) {
			deliveryProcess.setIsEnactable((Boolean)event.getNewValue());
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.scope == event.getAffectedEditor()) {
			deliveryProcess.setScope((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.usageNote == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				deliveryProcess.getUsageNote().clear();
				deliveryProcess.getUsageNote().addAll(((EList) event.getNewValue()));
			}
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.scale == event.getAffectedEditor()) {
			deliveryProcess.setScale((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.projectCharacteristics == event.getAffectedEditor()) {
			deliveryProcess.setProjectCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.riskLevel == event.getAffectedEditor()) {
			deliveryProcess.setRiskLevel((RiskLevel)event.getNewValue());
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.estimatingTechnique == event.getAffectedEditor()) {
			deliveryProcess.setEstimatingTechnique((EstimatingTechnique)event.getNewValue());
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.projectMemberExpertise == event.getAffectedEditor()) {
			deliveryProcess.setProjectMemberExpertise((ExpertiseLevel)event.getNewValue());
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.typeOfContract == event.getAffectedEditor()) {
			deliveryProcess.setTypeOfContract((ContractKind)event.getNewValue());
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.communicationMaterial == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SupportingMaterial) {
					communicationMaterialSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				communicationMaterialSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				communicationMaterialSettings.move(event.getNewIndex(), (SupportingMaterial) event.getNewValue());
			}
		}
		if (UmaViewsRepository.DeliveryProcess.Properties.educationalMaterial == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SupportingMaterial) {
					educationalMaterialSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				educationalMaterialSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				educationalMaterialSettings.move(event.getNewIndex(), (SupportingMaterial) event.getNewValue());
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
			DeliveryProcessPropertiesEditionPart basePart = (DeliveryProcessPropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getWorkDefinition_PreCondition().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.preCondition)) {
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
			
			if (SpemPackage.eINSTANCE.getWorkDefinition_PostCondition().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.postCondition)) {
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
			
			if (SpemPackage.eINSTANCE.getExtensibleElement_Kind().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.kind))
				basePart.setKind((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getDescribableElement_PresentationName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.presentationName)) {
				if (msg.getNewValue() != null) {
					basePart.setPresentationName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setPresentationName("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.briefDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setBriefDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setBriefDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_MainDescription().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.mainDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setMainDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setMainDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Purpose().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.purpose)) {
				if (msg.getNewValue() != null) {
					basePart.setPurpose(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setPurpose("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Guidance().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.guidance))
				basePart.updateGuidance();
			if (SpemPackage.eINSTANCE.getDescribableElement_Metric().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.metric))
				basePart.updateMetric();
			if (SpemPackage.eINSTANCE.getDescribableElement_Category().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.category))
				basePart.updateCategory();
			if (SpemPackage.eINSTANCE.getDescribableElement_Copyright().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.copyright)) {
				if (msg.getNewValue() != null) {
					basePart.setCopyright(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCopyright("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Author().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.author)) {
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
			
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.changeDate)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDate(EcoreUtil.convertToString(EcorePackage.Literals.EDATE, msg.getNewValue()));
				} else {
					basePart.setChangeDate("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.changeDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setChangeDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setChangeDescription("");
				}
			}
			if (SpemPackage.eINSTANCE.getDescribableElement_Version().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (SpemPackage.eINSTANCE.getProcessPackageableElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.hasMultipleOccurrences))
				basePart.setHasMultipleOccurrences((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.isOptional))
				basePart.setIsOptional((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.isPlanned))
				basePart.setIsPlanned((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.isRepeatable))
				basePart.setIsRepeatable((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.isOngoing))
				basePart.setIsOngoing((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.isEventDriven))
				basePart.setIsEventDriven((Boolean)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToPredecessor().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.linkToPredecessor))
				basePart.updateLinkToPredecessor();
			if (SpemPackage.eINSTANCE.getWorkBreakdownElement_LinkToSuccessor().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.linkToSuccessor))
				basePart.updateLinkToSuccessor();
			if (SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.variabilityType))
				basePart.setVariabilityType((VariabilityType)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getVariabilityElement_VariabilityBasedOnElement().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.variabilityBasedOnElement))
				basePart.setVariabilityBasedOnElement((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getActivity_UseKind().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.useKind))
				basePart.setUseKind((ActivityUseKind)msg.getNewValue());
			
			if (SpemPackage.eINSTANCE.getActivity_UsedActivity().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.usedActivity))
				basePart.setUsedActivity((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getActivity_SuppressedBreakdownElement().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.suppressedBreakdownElement))
				basePart.updateSuppressedBreakdownElement();
			if (SpemPackage.eINSTANCE.getActivity_DefaultContext().equals(msg.getFeature()) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.defaultContext))
				basePart.setDefaultContext((EObject)msg.getNewValue());
			if (SpemPackage.eINSTANCE.getActivity_ValidContext().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.validContext))
				basePart.updateValidContext();
			if (SpemPackage.eINSTANCE.getActivity_IsEnactable().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.isEnactable))
				basePart.setIsEnactable((Boolean)msg.getNewValue());
			
			if (UmaPackage.eINSTANCE.getProcess_Scope().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.scope)) {
				if (msg.getNewValue() != null) {
					basePart.setScope(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setScope("");
				}
			}
			if (UmaPackage.eINSTANCE.getProcess_UsageNote().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.usageNote)) {
				if (msg.getNewValue() instanceof EList<?>) {
					basePart.setUsageNote((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					basePart.setUsageNote(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					basePart.setUsageNote(newValueAsList);
				}
			}
			
			if (UmaPackage.eINSTANCE.getDeliveryProcess_Scale().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.scale)) {
				if (msg.getNewValue() != null) {
					basePart.setScale(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setScale("");
				}
			}
			if (UmaPackage.eINSTANCE.getDeliveryProcess_ProjectCharacteristics().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.projectCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setProjectCharacteristics(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setProjectCharacteristics("");
				}
			}
			if (UmaPackage.eINSTANCE.getDeliveryProcess_RiskLevel().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.riskLevel))
				basePart.setRiskLevel((RiskLevel)msg.getNewValue());
			
			if (UmaPackage.eINSTANCE.getDeliveryProcess_EstimatingTechnique().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.estimatingTechnique))
				basePart.setEstimatingTechnique((EstimatingTechnique)msg.getNewValue());
			
			if (UmaPackage.eINSTANCE.getDeliveryProcess_ProjectMemberExpertise().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.projectMemberExpertise))
				basePart.setProjectMemberExpertise((ExpertiseLevel)msg.getNewValue());
			
			if (UmaPackage.eINSTANCE.getDeliveryProcess_TypeOfContract().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.typeOfContract))
				basePart.setTypeOfContract((ContractKind)msg.getNewValue());
			
			if (UmaPackage.eINSTANCE.getDeliveryProcess_CommunicationMaterial().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.communicationMaterial))
				basePart.updateCommunicationMaterial();
			if (UmaPackage.eINSTANCE.getDeliveryProcess_EducationalMaterial().equals(msg.getFeature())  && isAccessible(UmaViewsRepository.DeliveryProcess.Properties.educationalMaterial))
				basePart.updateEducationalMaterial();
			
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
			UmaPackage.eINSTANCE.getProcess_Scope(),
			UmaPackage.eINSTANCE.getProcess_UsageNote(),
			UmaPackage.eINSTANCE.getDeliveryProcess_Scale(),
			UmaPackage.eINSTANCE.getDeliveryProcess_ProjectCharacteristics(),
			UmaPackage.eINSTANCE.getDeliveryProcess_RiskLevel(),
			UmaPackage.eINSTANCE.getDeliveryProcess_EstimatingTechnique(),
			UmaPackage.eINSTANCE.getDeliveryProcess_ProjectMemberExpertise(),
			UmaPackage.eINSTANCE.getDeliveryProcess_TypeOfContract(),
			UmaPackage.eINSTANCE.getDeliveryProcess_CommunicationMaterial(),
			UmaPackage.eINSTANCE.getDeliveryProcess_EducationalMaterial()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == UmaViewsRepository.DeliveryProcess.Properties.hasMultipleOccurrences || key == UmaViewsRepository.DeliveryProcess.Properties.isOptional || key == UmaViewsRepository.DeliveryProcess.Properties.isPlanned || key == UmaViewsRepository.DeliveryProcess.Properties.isRepeatable || key == UmaViewsRepository.DeliveryProcess.Properties.isOngoing || key == UmaViewsRepository.DeliveryProcess.Properties.isEventDriven || key == UmaViewsRepository.DeliveryProcess.Properties.useKind;
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
				if (UmaViewsRepository.DeliveryProcess.Properties.preCondition == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkDefinition_PreCondition().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.postCondition == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkDefinition_PostCondition().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.presentationName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_PresentationName().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.briefDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_BriefDescription().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.mainDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_MainDescription().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.purpose == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Purpose().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.copyright == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Copyright().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.author == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Author().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.changeDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDate().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.changeDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_ChangeDescription().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getDescribableElement_Version().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getProcessPackageableElement_Name().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.hasMultipleOccurrences == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_HasMultipleOccurrences().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.isOptional == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_IsOptional().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.isPlanned == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getBreakdownElement_IsPlanned().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.isRepeatable == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsRepeatable().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.isOngoing == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsOngoing().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.isEventDriven == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkBreakdownElement_IsEventDriven().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.variabilityType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getVariabilityElement_VariabilityType().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.useKind == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getActivity_UseKind().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getActivity_UseKind().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.isEnactable == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getActivity_IsEnactable().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getActivity_IsEnactable().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.scope == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(UmaPackage.eINSTANCE.getProcess_Scope().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(UmaPackage.eINSTANCE.getProcess_Scope().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.usageNote == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(UmaPackage.eINSTANCE.getProcess_UsageNote().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.scale == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(UmaPackage.eINSTANCE.getDeliveryProcess_Scale().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(UmaPackage.eINSTANCE.getDeliveryProcess_Scale().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.projectCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(UmaPackage.eINSTANCE.getDeliveryProcess_ProjectCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(UmaPackage.eINSTANCE.getDeliveryProcess_ProjectCharacteristics().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.riskLevel == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(UmaPackage.eINSTANCE.getDeliveryProcess_RiskLevel().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(UmaPackage.eINSTANCE.getDeliveryProcess_RiskLevel().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.estimatingTechnique == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(UmaPackage.eINSTANCE.getDeliveryProcess_EstimatingTechnique().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(UmaPackage.eINSTANCE.getDeliveryProcess_EstimatingTechnique().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.projectMemberExpertise == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(UmaPackage.eINSTANCE.getDeliveryProcess_ProjectMemberExpertise().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(UmaPackage.eINSTANCE.getDeliveryProcess_ProjectMemberExpertise().getEAttributeType(), newValue);
				}
				if (UmaViewsRepository.DeliveryProcess.Properties.typeOfContract == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(UmaPackage.eINSTANCE.getDeliveryProcess_TypeOfContract().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(UmaPackage.eINSTANCE.getDeliveryProcess_TypeOfContract().getEAttributeType(), newValue);
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
