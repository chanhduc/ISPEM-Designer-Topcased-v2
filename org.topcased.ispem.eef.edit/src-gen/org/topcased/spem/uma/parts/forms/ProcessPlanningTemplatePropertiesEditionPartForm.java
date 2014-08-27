/**
 * Generated with Acceleo
 */
package org.topcased.spem.uma.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EcoreAdapterFactory;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.jface.window.Window;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.topcased.spem.SpemPackage;

import org.topcased.spem.uma.UmaPackage;

import org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart;
import org.topcased.spem.uma.parts.UmaViewsRepository;

import org.topcased.spem.uma.providers.UmaMessages;

// End of user code

/**
 * 
 * 
 */
public class ProcessPlanningTemplatePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ProcessPlanningTemplatePropertiesEditionPart {

	protected Text preCondition;
	protected Button editPreCondition;
	private EList preConditionList;
	protected Text postCondition;
	protected Button editPostCondition;
	private EList postConditionList;
	protected EObjectFlatComboViewer kind;
	protected Text presentationName;
	protected Text briefDescription;
	protected Text mainDescription;
	protected Text purpose;
	protected ReferencesTable guidance;
	protected List<ViewerFilter> guidanceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> guidanceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable metric;
	protected List<ViewerFilter> metricBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> metricFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable category;
	protected List<ViewerFilter> categoryBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> categoryFilters = new ArrayList<ViewerFilter>();
	protected Text copyright;
	protected Text author;
	protected Button editAuthor;
	private EList authorList;
	protected Text changeDate;
	protected Text changeDescription;
	protected Text version;
	protected Text name;
	protected Button hasMultipleOccurrences;
	protected Button isOptional;
	protected Button isPlanned;
	protected Button isRepeatable;
	protected Button isOngoing;
	protected Button isEventDriven;
	protected ReferencesTable linkToPredecessor;
	protected List<ViewerFilter> linkToPredecessorBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> linkToPredecessorFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable linkToSuccessor;
	protected List<ViewerFilter> linkToSuccessorBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> linkToSuccessorFilters = new ArrayList<ViewerFilter>();
	protected EMFComboViewer variabilityType;
	protected EObjectFlatComboViewer variabilityBasedOnElement;
	protected EMFComboViewer useKind;
	protected EObjectFlatComboViewer usedActivity;
	protected ReferencesTable suppressedBreakdownElement;
	protected List<ViewerFilter> suppressedBreakdownElementBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> suppressedBreakdownElementFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer defaultContext;
	protected ReferencesTable validContext;
	protected List<ViewerFilter> validContextBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> validContextFilters = new ArrayList<ViewerFilter>();
	protected Button isEnactable;
	protected Text scope;
	protected Text usageNote;
	protected Button editUsageNote;
	private EList usageNoteList;
	protected ReferencesTable baseProcess;
	protected List<ViewerFilter> baseProcessBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> baseProcessFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public ProcessPlanningTemplatePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ProcessPlanningTemplatePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence processPlanningTemplateStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = processPlanningTemplateStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.class);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.preCondition);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.postCondition);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.kind);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.presentationName);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.briefDescription);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.mainDescription);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.purpose);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.guidance);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.metric);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.category);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.copyright);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.author);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDate);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDescription);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.version);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.name);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.hasMultipleOccurrences);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.isOptional);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.isPlanned);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.isRepeatable);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.isOngoing);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.isEventDriven);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToPredecessor);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToSuccessor);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityType);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityBasedOnElement);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.useKind);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.usedActivity);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.suppressedBreakdownElement);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.defaultContext);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.validContext);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.isEnactable);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.scope);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.usageNote);
		propertiesStep.addStep(UmaViewsRepository.ProcessPlanningTemplate.Properties.baseProcess);
		
		
		composer = new PartComposer(processPlanningTemplateStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.preCondition) {
					return createPreConditionMultiValuedEditor(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.postCondition) {
					return createPostConditionMultiValuedEditor(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.kind) {
					return createKindFlatComboViewer(parent, widgetFactory);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.presentationName) {
					return createPresentationNameText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.briefDescription) {
					return createBriefDescriptionText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.mainDescription) {
					return createMainDescriptionText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.purpose) {
					return createPurposeText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.guidance) {
					return createGuidanceReferencesTable(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.metric) {
					return createMetricReferencesTable(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.category) {
					return createCategoryReferencesTable(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.copyright) {
					return createCopyrightText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.author) {
					return createAuthorMultiValuedEditor(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDate) {
					return createChangeDateText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDescription) {
					return createChangeDescriptionText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.version) {
					return createVersionText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.hasMultipleOccurrences) {
					return createHasMultipleOccurrencesCheckbox(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.isOptional) {
					return createIsOptionalCheckbox(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.isPlanned) {
					return createIsPlannedCheckbox(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.isRepeatable) {
					return createIsRepeatableCheckbox(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.isOngoing) {
					return createIsOngoingCheckbox(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.isEventDriven) {
					return createIsEventDrivenCheckbox(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToPredecessor) {
					return createLinkToPredecessorReferencesTable(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToSuccessor) {
					return createLinkToSuccessorReferencesTable(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityType) {
					return createVariabilityTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityBasedOnElement) {
					return createVariabilityBasedOnElementFlatComboViewer(parent, widgetFactory);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.useKind) {
					return createUseKindEMFComboViewer(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.usedActivity) {
					return createUsedActivityFlatComboViewer(parent, widgetFactory);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.suppressedBreakdownElement) {
					return createSuppressedBreakdownElementReferencesTable(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.defaultContext) {
					return createDefaultContextFlatComboViewer(parent, widgetFactory);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.validContext) {
					return createValidContextReferencesTable(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.isEnactable) {
					return createIsEnactableCheckbox(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.scope) {
					return createScopeText(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.usageNote) {
					return createUsageNoteMultiValuedEditor(widgetFactory, parent);
				}
				if (key == UmaViewsRepository.ProcessPlanningTemplate.Properties.baseProcess) {
					return createBaseProcessReferencesTable(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * 
	 */
	protected Composite createPreConditionMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		preCondition = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData preConditionData = new GridData(GridData.FILL_HORIZONTAL);
		preConditionData.horizontalSpan = 2;
		preCondition.setLayoutData(preConditionData);
		EditingUtils.setID(preCondition, UmaViewsRepository.ProcessPlanningTemplate.Properties.preCondition);
		EditingUtils.setEEFtype(preCondition, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editPreCondition = widgetFactory.createButton(parent, getDescription(UmaViewsRepository.ProcessPlanningTemplate.Properties.preCondition, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_PreConditionLabel), SWT.NONE);
		GridData editPreConditionData = new GridData();
		editPreCondition.setLayoutData(editPreConditionData);
		editPreCondition.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						preCondition.getShell(), "ProcessPlanningTemplate", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						preConditionList, SpemPackage.eINSTANCE.getWorkDefinition_PreCondition().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					preConditionList = dialog.getResult();
					if (preConditionList == null) {
						preConditionList = new BasicEList();
					}
					preCondition.setText(preConditionList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.preCondition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(preConditionList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editPreCondition, UmaViewsRepository.ProcessPlanningTemplate.Properties.preCondition);
		EditingUtils.setEEFtype(editPreCondition, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createPreConditionMultiValuedEditor

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createPostConditionMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		postCondition = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData postConditionData = new GridData(GridData.FILL_HORIZONTAL);
		postConditionData.horizontalSpan = 2;
		postCondition.setLayoutData(postConditionData);
		EditingUtils.setID(postCondition, UmaViewsRepository.ProcessPlanningTemplate.Properties.postCondition);
		EditingUtils.setEEFtype(postCondition, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editPostCondition = widgetFactory.createButton(parent, getDescription(UmaViewsRepository.ProcessPlanningTemplate.Properties.postCondition, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_PostConditionLabel), SWT.NONE);
		GridData editPostConditionData = new GridData();
		editPostCondition.setLayoutData(editPostConditionData);
		editPostCondition.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						postCondition.getShell(), "ProcessPlanningTemplate", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						postConditionList, SpemPackage.eINSTANCE.getWorkDefinition_PostCondition().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					postConditionList = dialog.getResult();
					if (postConditionList == null) {
						postConditionList = new BasicEList();
					}
					postCondition.setText(postConditionList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.postCondition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(postConditionList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editPostCondition, UmaViewsRepository.ProcessPlanningTemplate.Properties.postCondition);
		EditingUtils.setEEFtype(editPostCondition, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createPostConditionMultiValuedEditor

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createKindFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, UmaViewsRepository.ProcessPlanningTemplate.Properties.kind, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_KindLabel);
		kind = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmaViewsRepository.ProcessPlanningTemplate.Properties.kind, UmaViewsRepository.FORM_KIND));
		widgetFactory.adapt(kind);
		kind.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData kindData = new GridData(GridData.FILL_HORIZONTAL);
		kind.setLayoutData(kindData);
		kind.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.kind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getKind()));
			}

		});
		kind.setID(UmaViewsRepository.ProcessPlanningTemplate.Properties.kind);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.kind, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createKindFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createPresentationNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, UmaViewsRepository.ProcessPlanningTemplate.Properties.presentationName, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_PresentationNameLabel);
		presentationName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		presentationName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData presentationNameData = new GridData(GridData.FILL_HORIZONTAL);
		presentationName.setLayoutData(presentationNameData);
		presentationName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ProcessPlanningTemplatePropertiesEditionPartForm.this,
							UmaViewsRepository.ProcessPlanningTemplate.Properties.presentationName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									UmaViewsRepository.ProcessPlanningTemplate.Properties.presentationName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, presentationName.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		presentationName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
				}
			}
		});
		EditingUtils.setID(presentationName, UmaViewsRepository.ProcessPlanningTemplate.Properties.presentationName);
		EditingUtils.setEEFtype(presentationName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.presentationName, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPresentationNameText

		// End of user code
		return parent;
	}

	
	protected Composite createBriefDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, UmaViewsRepository.ProcessPlanningTemplate.Properties.briefDescription, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_BriefDescriptionLabel);
		briefDescription = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		briefDescription.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData briefDescriptionData = new GridData(GridData.FILL_HORIZONTAL);
		briefDescription.setLayoutData(briefDescriptionData);
		briefDescription.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ProcessPlanningTemplatePropertiesEditionPartForm.this,
							UmaViewsRepository.ProcessPlanningTemplate.Properties.briefDescription,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									UmaViewsRepository.ProcessPlanningTemplate.Properties.briefDescription,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, briefDescription.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		briefDescription.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
				}
			}
		});
		EditingUtils.setID(briefDescription, UmaViewsRepository.ProcessPlanningTemplate.Properties.briefDescription);
		EditingUtils.setEEFtype(briefDescription, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.briefDescription, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createBriefDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createMainDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, UmaViewsRepository.ProcessPlanningTemplate.Properties.mainDescription, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_MainDescriptionLabel);
		mainDescription = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		mainDescription.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData mainDescriptionData = new GridData(GridData.FILL_HORIZONTAL);
		mainDescription.setLayoutData(mainDescriptionData);
		mainDescription.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ProcessPlanningTemplatePropertiesEditionPartForm.this,
							UmaViewsRepository.ProcessPlanningTemplate.Properties.mainDescription,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									UmaViewsRepository.ProcessPlanningTemplate.Properties.mainDescription,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, mainDescription.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		mainDescription.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
				}
			}
		});
		EditingUtils.setID(mainDescription, UmaViewsRepository.ProcessPlanningTemplate.Properties.mainDescription);
		EditingUtils.setEEFtype(mainDescription, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.mainDescription, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMainDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createPurposeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, UmaViewsRepository.ProcessPlanningTemplate.Properties.purpose, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_PurposeLabel);
		purpose = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		purpose.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData purposeData = new GridData(GridData.FILL_HORIZONTAL);
		purpose.setLayoutData(purposeData);
		purpose.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ProcessPlanningTemplatePropertiesEditionPartForm.this,
							UmaViewsRepository.ProcessPlanningTemplate.Properties.purpose,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									UmaViewsRepository.ProcessPlanningTemplate.Properties.purpose,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, purpose.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		purpose.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
				}
			}
		});
		EditingUtils.setID(purpose, UmaViewsRepository.ProcessPlanningTemplate.Properties.purpose);
		EditingUtils.setEEFtype(purpose, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.purpose, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPurposeText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createGuidanceReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.guidance = new ReferencesTable(getDescription(UmaViewsRepository.ProcessPlanningTemplate.Properties.guidance, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_GuidanceLabel), new ReferencesTableListener	() {
			public void handleAdd() { addGuidance(); }
			public void handleEdit(EObject element) { editGuidance(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGuidance(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGuidance(element); }
			public void navigateTo(EObject element) { }
		});
		this.guidance.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.guidance, UmaViewsRepository.FORM_KIND));
		this.guidance.createControls(parent, widgetFactory);
		this.guidance.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.guidance, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData guidanceData = new GridData(GridData.FILL_HORIZONTAL);
		guidanceData.horizontalSpan = 3;
		this.guidance.setLayoutData(guidanceData);
		this.guidance.disableMove();
		guidance.setID(UmaViewsRepository.ProcessPlanningTemplate.Properties.guidance);
		guidance.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createGuidanceReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addGuidance() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(guidance.getInput(), guidanceFilters, guidanceBusinessFilters,
		"guidance", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.guidance,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				guidance.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveGuidance(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		guidance.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGuidance(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		guidance.refresh();
	}

	/**
	 * 
	 */
	protected void editGuidance(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				guidance.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createMetricReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.metric = new ReferencesTable(getDescription(UmaViewsRepository.ProcessPlanningTemplate.Properties.metric, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_MetricLabel), new ReferencesTableListener	() {
			public void handleAdd() { addMetric(); }
			public void handleEdit(EObject element) { editMetric(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMetric(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMetric(element); }
			public void navigateTo(EObject element) { }
		});
		this.metric.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.metric, UmaViewsRepository.FORM_KIND));
		this.metric.createControls(parent, widgetFactory);
		this.metric.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.metric, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData metricData = new GridData(GridData.FILL_HORIZONTAL);
		metricData.horizontalSpan = 3;
		this.metric.setLayoutData(metricData);
		this.metric.disableMove();
		metric.setID(UmaViewsRepository.ProcessPlanningTemplate.Properties.metric);
		metric.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createMetricReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addMetric() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(metric.getInput(), metricFilters, metricBusinessFilters,
		"metric", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.metric,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				metric.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveMetric(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		metric.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMetric(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		metric.refresh();
	}

	/**
	 * 
	 */
	protected void editMetric(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				metric.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createCategoryReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.category = new ReferencesTable(getDescription(UmaViewsRepository.ProcessPlanningTemplate.Properties.category, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_CategoryLabel), new ReferencesTableListener	() {
			public void handleAdd() { addCategory(); }
			public void handleEdit(EObject element) { editCategory(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCategory(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCategory(element); }
			public void navigateTo(EObject element) { }
		});
		this.category.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.category, UmaViewsRepository.FORM_KIND));
		this.category.createControls(parent, widgetFactory);
		this.category.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.category, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData categoryData = new GridData(GridData.FILL_HORIZONTAL);
		categoryData.horizontalSpan = 3;
		this.category.setLayoutData(categoryData);
		this.category.disableMove();
		category.setID(UmaViewsRepository.ProcessPlanningTemplate.Properties.category);
		category.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createCategoryReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addCategory() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(category.getInput(), categoryFilters, categoryBusinessFilters,
		"category", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.category,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				category.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveCategory(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		category.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCategory(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		category.refresh();
	}

	/**
	 * 
	 */
	protected void editCategory(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				category.refresh();
			}
		}
	}

	
	protected Composite createCopyrightText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, UmaViewsRepository.ProcessPlanningTemplate.Properties.copyright, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_CopyrightLabel);
		copyright = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		copyright.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData copyrightData = new GridData(GridData.FILL_HORIZONTAL);
		copyright.setLayoutData(copyrightData);
		copyright.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ProcessPlanningTemplatePropertiesEditionPartForm.this,
							UmaViewsRepository.ProcessPlanningTemplate.Properties.copyright,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									UmaViewsRepository.ProcessPlanningTemplate.Properties.copyright,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, copyright.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		copyright.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
				}
			}
		});
		EditingUtils.setID(copyright, UmaViewsRepository.ProcessPlanningTemplate.Properties.copyright);
		EditingUtils.setEEFtype(copyright, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.copyright, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createCopyrightText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createAuthorMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		author = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData authorData = new GridData(GridData.FILL_HORIZONTAL);
		authorData.horizontalSpan = 2;
		author.setLayoutData(authorData);
		EditingUtils.setID(author, UmaViewsRepository.ProcessPlanningTemplate.Properties.author);
		EditingUtils.setEEFtype(author, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editAuthor = widgetFactory.createButton(parent, getDescription(UmaViewsRepository.ProcessPlanningTemplate.Properties.author, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_AuthorLabel), SWT.NONE);
		GridData editAuthorData = new GridData();
		editAuthor.setLayoutData(editAuthorData);
		editAuthor.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						author.getShell(), "ProcessPlanningTemplate", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						authorList, SpemPackage.eINSTANCE.getDescribableElement_Author().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					authorList = dialog.getResult();
					if (authorList == null) {
						authorList = new BasicEList();
					}
					author.setText(authorList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.author, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(authorList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editAuthor, UmaViewsRepository.ProcessPlanningTemplate.Properties.author);
		EditingUtils.setEEFtype(editAuthor, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createAuthorMultiValuedEditor

		// End of user code
		return parent;
	}

	
	protected Composite createChangeDateText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDate, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_ChangeDateLabel);
		changeDate = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		changeDate.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData changeDateData = new GridData(GridData.FILL_HORIZONTAL);
		changeDate.setLayoutData(changeDateData);
		changeDate.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ProcessPlanningTemplatePropertiesEditionPartForm.this,
							UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDate,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDate,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, changeDate.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		changeDate.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
				}
			}
		});
		EditingUtils.setID(changeDate, UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDate);
		EditingUtils.setEEFtype(changeDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDate, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createChangeDateText

		// End of user code
		return parent;
	}

	
	protected Composite createChangeDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDescription, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_ChangeDescriptionLabel);
		changeDescription = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		changeDescription.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData changeDescriptionData = new GridData(GridData.FILL_HORIZONTAL);
		changeDescription.setLayoutData(changeDescriptionData);
		changeDescription.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ProcessPlanningTemplatePropertiesEditionPartForm.this,
							UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDescription,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDescription,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, changeDescription.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		changeDescription.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
				}
			}
		});
		EditingUtils.setID(changeDescription, UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDescription);
		EditingUtils.setEEFtype(changeDescription, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDescription, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createChangeDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createVersionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, UmaViewsRepository.ProcessPlanningTemplate.Properties.version, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_VersionLabel);
		version = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		version.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData versionData = new GridData(GridData.FILL_HORIZONTAL);
		version.setLayoutData(versionData);
		version.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ProcessPlanningTemplatePropertiesEditionPartForm.this,
							UmaViewsRepository.ProcessPlanningTemplate.Properties.version,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									UmaViewsRepository.ProcessPlanningTemplate.Properties.version,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, version.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		version.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}
		});
		EditingUtils.setID(version, UmaViewsRepository.ProcessPlanningTemplate.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.version, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createVersionText

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, UmaViewsRepository.ProcessPlanningTemplate.Properties.name, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ProcessPlanningTemplatePropertiesEditionPartForm.this,
							UmaViewsRepository.ProcessPlanningTemplate.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									UmaViewsRepository.ProcessPlanningTemplate.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, UmaViewsRepository.ProcessPlanningTemplate.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.name, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createHasMultipleOccurrencesCheckbox(FormToolkit widgetFactory, Composite parent) {
		hasMultipleOccurrences = widgetFactory.createButton(parent, getDescription(UmaViewsRepository.ProcessPlanningTemplate.Properties.hasMultipleOccurrences, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_HasMultipleOccurrencesLabel), SWT.CHECK);
		hasMultipleOccurrences.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.hasMultipleOccurrences, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(hasMultipleOccurrences.getSelection())));
			}

		});
		GridData hasMultipleOccurrencesData = new GridData(GridData.FILL_HORIZONTAL);
		hasMultipleOccurrencesData.horizontalSpan = 2;
		hasMultipleOccurrences.setLayoutData(hasMultipleOccurrencesData);
		EditingUtils.setID(hasMultipleOccurrences, UmaViewsRepository.ProcessPlanningTemplate.Properties.hasMultipleOccurrences);
		EditingUtils.setEEFtype(hasMultipleOccurrences, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.hasMultipleOccurrences, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createHasMultipleOccurrencesCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createIsOptionalCheckbox(FormToolkit widgetFactory, Composite parent) {
		isOptional = widgetFactory.createButton(parent, getDescription(UmaViewsRepository.ProcessPlanningTemplate.Properties.isOptional, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_IsOptionalLabel), SWT.CHECK);
		isOptional.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.isOptional, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isOptional.getSelection())));
			}

		});
		GridData isOptionalData = new GridData(GridData.FILL_HORIZONTAL);
		isOptionalData.horizontalSpan = 2;
		isOptional.setLayoutData(isOptionalData);
		EditingUtils.setID(isOptional, UmaViewsRepository.ProcessPlanningTemplate.Properties.isOptional);
		EditingUtils.setEEFtype(isOptional, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.isOptional, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIsOptionalCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createIsPlannedCheckbox(FormToolkit widgetFactory, Composite parent) {
		isPlanned = widgetFactory.createButton(parent, getDescription(UmaViewsRepository.ProcessPlanningTemplate.Properties.isPlanned, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_IsPlannedLabel), SWT.CHECK);
		isPlanned.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.isPlanned, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isPlanned.getSelection())));
			}

		});
		GridData isPlannedData = new GridData(GridData.FILL_HORIZONTAL);
		isPlannedData.horizontalSpan = 2;
		isPlanned.setLayoutData(isPlannedData);
		EditingUtils.setID(isPlanned, UmaViewsRepository.ProcessPlanningTemplate.Properties.isPlanned);
		EditingUtils.setEEFtype(isPlanned, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.isPlanned, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIsPlannedCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createIsRepeatableCheckbox(FormToolkit widgetFactory, Composite parent) {
		isRepeatable = widgetFactory.createButton(parent, getDescription(UmaViewsRepository.ProcessPlanningTemplate.Properties.isRepeatable, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_IsRepeatableLabel), SWT.CHECK);
		isRepeatable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.isRepeatable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isRepeatable.getSelection())));
			}

		});
		GridData isRepeatableData = new GridData(GridData.FILL_HORIZONTAL);
		isRepeatableData.horizontalSpan = 2;
		isRepeatable.setLayoutData(isRepeatableData);
		EditingUtils.setID(isRepeatable, UmaViewsRepository.ProcessPlanningTemplate.Properties.isRepeatable);
		EditingUtils.setEEFtype(isRepeatable, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.isRepeatable, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIsRepeatableCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createIsOngoingCheckbox(FormToolkit widgetFactory, Composite parent) {
		isOngoing = widgetFactory.createButton(parent, getDescription(UmaViewsRepository.ProcessPlanningTemplate.Properties.isOngoing, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_IsOngoingLabel), SWT.CHECK);
		isOngoing.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.isOngoing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isOngoing.getSelection())));
			}

		});
		GridData isOngoingData = new GridData(GridData.FILL_HORIZONTAL);
		isOngoingData.horizontalSpan = 2;
		isOngoing.setLayoutData(isOngoingData);
		EditingUtils.setID(isOngoing, UmaViewsRepository.ProcessPlanningTemplate.Properties.isOngoing);
		EditingUtils.setEEFtype(isOngoing, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.isOngoing, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIsOngoingCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createIsEventDrivenCheckbox(FormToolkit widgetFactory, Composite parent) {
		isEventDriven = widgetFactory.createButton(parent, getDescription(UmaViewsRepository.ProcessPlanningTemplate.Properties.isEventDriven, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_IsEventDrivenLabel), SWT.CHECK);
		isEventDriven.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.isEventDriven, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isEventDriven.getSelection())));
			}

		});
		GridData isEventDrivenData = new GridData(GridData.FILL_HORIZONTAL);
		isEventDrivenData.horizontalSpan = 2;
		isEventDriven.setLayoutData(isEventDrivenData);
		EditingUtils.setID(isEventDriven, UmaViewsRepository.ProcessPlanningTemplate.Properties.isEventDriven);
		EditingUtils.setEEFtype(isEventDriven, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.isEventDriven, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIsEventDrivenCheckbox

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createLinkToPredecessorReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.linkToPredecessor = new ReferencesTable(getDescription(UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToPredecessor, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_LinkToPredecessorLabel), new ReferencesTableListener	() {
			public void handleAdd() { addLinkToPredecessor(); }
			public void handleEdit(EObject element) { editLinkToPredecessor(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveLinkToPredecessor(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromLinkToPredecessor(element); }
			public void navigateTo(EObject element) { }
		});
		this.linkToPredecessor.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToPredecessor, UmaViewsRepository.FORM_KIND));
		this.linkToPredecessor.createControls(parent, widgetFactory);
		this.linkToPredecessor.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToPredecessor, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData linkToPredecessorData = new GridData(GridData.FILL_HORIZONTAL);
		linkToPredecessorData.horizontalSpan = 3;
		this.linkToPredecessor.setLayoutData(linkToPredecessorData);
		this.linkToPredecessor.disableMove();
		linkToPredecessor.setID(UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToPredecessor);
		linkToPredecessor.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createLinkToPredecessorReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addLinkToPredecessor() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(linkToPredecessor.getInput(), linkToPredecessorFilters, linkToPredecessorBusinessFilters,
		"linkToPredecessor", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToPredecessor,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				linkToPredecessor.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveLinkToPredecessor(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToPredecessor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		linkToPredecessor.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromLinkToPredecessor(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToPredecessor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		linkToPredecessor.refresh();
	}

	/**
	 * 
	 */
	protected void editLinkToPredecessor(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				linkToPredecessor.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createLinkToSuccessorReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.linkToSuccessor = new ReferencesTable(getDescription(UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToSuccessor, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_LinkToSuccessorLabel), new ReferencesTableListener	() {
			public void handleAdd() { addLinkToSuccessor(); }
			public void handleEdit(EObject element) { editLinkToSuccessor(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveLinkToSuccessor(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromLinkToSuccessor(element); }
			public void navigateTo(EObject element) { }
		});
		this.linkToSuccessor.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToSuccessor, UmaViewsRepository.FORM_KIND));
		this.linkToSuccessor.createControls(parent, widgetFactory);
		this.linkToSuccessor.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToSuccessor, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData linkToSuccessorData = new GridData(GridData.FILL_HORIZONTAL);
		linkToSuccessorData.horizontalSpan = 3;
		this.linkToSuccessor.setLayoutData(linkToSuccessorData);
		this.linkToSuccessor.disableMove();
		linkToSuccessor.setID(UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToSuccessor);
		linkToSuccessor.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createLinkToSuccessorReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addLinkToSuccessor() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(linkToSuccessor.getInput(), linkToSuccessorFilters, linkToSuccessorBusinessFilters,
		"linkToSuccessor", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToSuccessor,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				linkToSuccessor.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveLinkToSuccessor(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToSuccessor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		linkToSuccessor.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromLinkToSuccessor(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToSuccessor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		linkToSuccessor.refresh();
	}

	/**
	 * 
	 */
	protected void editLinkToSuccessor(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				linkToSuccessor.refresh();
			}
		}
	}

	
	protected Composite createVariabilityTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityType, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_VariabilityTypeLabel);
		variabilityType = new EMFComboViewer(parent);
		variabilityType.setContentProvider(new ArrayContentProvider());
		variabilityType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData variabilityTypeData = new GridData(GridData.FILL_HORIZONTAL);
		variabilityType.getCombo().setLayoutData(variabilityTypeData);
		variabilityType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVariabilityType()));
			}

		});
		variabilityType.setID(UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityType, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createVariabilityTypeEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createVariabilityBasedOnElementFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityBasedOnElement, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_VariabilityBasedOnElementLabel);
		variabilityBasedOnElement = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityBasedOnElement, UmaViewsRepository.FORM_KIND));
		widgetFactory.adapt(variabilityBasedOnElement);
		variabilityBasedOnElement.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData variabilityBasedOnElementData = new GridData(GridData.FILL_HORIZONTAL);
		variabilityBasedOnElement.setLayoutData(variabilityBasedOnElementData);
		variabilityBasedOnElement.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityBasedOnElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVariabilityBasedOnElement()));
			}

		});
		variabilityBasedOnElement.setID(UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityBasedOnElement);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityBasedOnElement, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createVariabilityBasedOnElementFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createUseKindEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, UmaViewsRepository.ProcessPlanningTemplate.Properties.useKind, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_UseKindLabel);
		useKind = new EMFComboViewer(parent);
		useKind.setContentProvider(new ArrayContentProvider());
		useKind.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData useKindData = new GridData(GridData.FILL_HORIZONTAL);
		useKind.getCombo().setLayoutData(useKindData);
		useKind.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.useKind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getUseKind()));
			}

		});
		useKind.setID(UmaViewsRepository.ProcessPlanningTemplate.Properties.useKind);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.useKind, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createUseKindEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createUsedActivityFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, UmaViewsRepository.ProcessPlanningTemplate.Properties.usedActivity, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_UsedActivityLabel);
		usedActivity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmaViewsRepository.ProcessPlanningTemplate.Properties.usedActivity, UmaViewsRepository.FORM_KIND));
		widgetFactory.adapt(usedActivity);
		usedActivity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData usedActivityData = new GridData(GridData.FILL_HORIZONTAL);
		usedActivity.setLayoutData(usedActivityData);
		usedActivity.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.usedActivity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getUsedActivity()));
			}

		});
		usedActivity.setID(UmaViewsRepository.ProcessPlanningTemplate.Properties.usedActivity);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.usedActivity, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createUsedActivityFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSuppressedBreakdownElementReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.suppressedBreakdownElement = new ReferencesTable(getDescription(UmaViewsRepository.ProcessPlanningTemplate.Properties.suppressedBreakdownElement, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_SuppressedBreakdownElementLabel), new ReferencesTableListener	() {
			public void handleAdd() { addSuppressedBreakdownElement(); }
			public void handleEdit(EObject element) { editSuppressedBreakdownElement(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSuppressedBreakdownElement(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSuppressedBreakdownElement(element); }
			public void navigateTo(EObject element) { }
		});
		this.suppressedBreakdownElement.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.suppressedBreakdownElement, UmaViewsRepository.FORM_KIND));
		this.suppressedBreakdownElement.createControls(parent, widgetFactory);
		this.suppressedBreakdownElement.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.suppressedBreakdownElement, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData suppressedBreakdownElementData = new GridData(GridData.FILL_HORIZONTAL);
		suppressedBreakdownElementData.horizontalSpan = 3;
		this.suppressedBreakdownElement.setLayoutData(suppressedBreakdownElementData);
		this.suppressedBreakdownElement.disableMove();
		suppressedBreakdownElement.setID(UmaViewsRepository.ProcessPlanningTemplate.Properties.suppressedBreakdownElement);
		suppressedBreakdownElement.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createSuppressedBreakdownElementReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addSuppressedBreakdownElement() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(suppressedBreakdownElement.getInput(), suppressedBreakdownElementFilters, suppressedBreakdownElementBusinessFilters,
		"suppressedBreakdownElement", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.suppressedBreakdownElement,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				suppressedBreakdownElement.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSuppressedBreakdownElement(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.suppressedBreakdownElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		suppressedBreakdownElement.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSuppressedBreakdownElement(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.suppressedBreakdownElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		suppressedBreakdownElement.refresh();
	}

	/**
	 * 
	 */
	protected void editSuppressedBreakdownElement(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				suppressedBreakdownElement.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createDefaultContextFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, UmaViewsRepository.ProcessPlanningTemplate.Properties.defaultContext, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_DefaultContextLabel);
		defaultContext = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmaViewsRepository.ProcessPlanningTemplate.Properties.defaultContext, UmaViewsRepository.FORM_KIND));
		widgetFactory.adapt(defaultContext);
		defaultContext.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData defaultContextData = new GridData(GridData.FILL_HORIZONTAL);
		defaultContext.setLayoutData(defaultContextData);
		defaultContext.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.defaultContext, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDefaultContext()));
			}

		});
		defaultContext.setID(UmaViewsRepository.ProcessPlanningTemplate.Properties.defaultContext);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.defaultContext, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDefaultContextFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createValidContextReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.validContext = new ReferencesTable(getDescription(UmaViewsRepository.ProcessPlanningTemplate.Properties.validContext, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_ValidContextLabel), new ReferencesTableListener	() {
			public void handleAdd() { addValidContext(); }
			public void handleEdit(EObject element) { editValidContext(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveValidContext(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromValidContext(element); }
			public void navigateTo(EObject element) { }
		});
		this.validContext.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.validContext, UmaViewsRepository.FORM_KIND));
		this.validContext.createControls(parent, widgetFactory);
		this.validContext.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.validContext, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData validContextData = new GridData(GridData.FILL_HORIZONTAL);
		validContextData.horizontalSpan = 3;
		this.validContext.setLayoutData(validContextData);
		this.validContext.disableMove();
		validContext.setID(UmaViewsRepository.ProcessPlanningTemplate.Properties.validContext);
		validContext.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createValidContextReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addValidContext() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(validContext.getInput(), validContextFilters, validContextBusinessFilters,
		"validContext", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.validContext,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				validContext.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveValidContext(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.validContext, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		validContext.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromValidContext(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.validContext, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		validContext.refresh();
	}

	/**
	 * 
	 */
	protected void editValidContext(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				validContext.refresh();
			}
		}
	}

	
	protected Composite createIsEnactableCheckbox(FormToolkit widgetFactory, Composite parent) {
		isEnactable = widgetFactory.createButton(parent, getDescription(UmaViewsRepository.ProcessPlanningTemplate.Properties.isEnactable, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_IsEnactableLabel), SWT.CHECK);
		isEnactable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.isEnactable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isEnactable.getSelection())));
			}

		});
		GridData isEnactableData = new GridData(GridData.FILL_HORIZONTAL);
		isEnactableData.horizontalSpan = 2;
		isEnactable.setLayoutData(isEnactableData);
		EditingUtils.setID(isEnactable, UmaViewsRepository.ProcessPlanningTemplate.Properties.isEnactable);
		EditingUtils.setEEFtype(isEnactable, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.isEnactable, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIsEnactableCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createScopeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, UmaViewsRepository.ProcessPlanningTemplate.Properties.scope, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_ScopeLabel);
		scope = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		scope.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData scopeData = new GridData(GridData.FILL_HORIZONTAL);
		scope.setLayoutData(scopeData);
		scope.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ProcessPlanningTemplatePropertiesEditionPartForm.this,
							UmaViewsRepository.ProcessPlanningTemplate.Properties.scope,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, scope.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									UmaViewsRepository.ProcessPlanningTemplate.Properties.scope,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, scope.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ProcessPlanningTemplatePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		scope.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.scope, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, scope.getText()));
				}
			}
		});
		EditingUtils.setID(scope, UmaViewsRepository.ProcessPlanningTemplate.Properties.scope);
		EditingUtils.setEEFtype(scope, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.scope, UmaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createScopeText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createUsageNoteMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		usageNote = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData usageNoteData = new GridData(GridData.FILL_HORIZONTAL);
		usageNoteData.horizontalSpan = 2;
		usageNote.setLayoutData(usageNoteData);
		EditingUtils.setID(usageNote, UmaViewsRepository.ProcessPlanningTemplate.Properties.usageNote);
		EditingUtils.setEEFtype(usageNote, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editUsageNote = widgetFactory.createButton(parent, getDescription(UmaViewsRepository.ProcessPlanningTemplate.Properties.usageNote, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_UsageNoteLabel), SWT.NONE);
		GridData editUsageNoteData = new GridData();
		editUsageNote.setLayoutData(editUsageNoteData);
		editUsageNote.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						usageNote.getShell(), "ProcessPlanningTemplate", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						usageNoteList, UmaPackage.eINSTANCE.getProcess_UsageNote().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					usageNoteList = dialog.getResult();
					if (usageNoteList == null) {
						usageNoteList = new BasicEList();
					}
					usageNote.setText(usageNoteList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.usageNote, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(usageNoteList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editUsageNote, UmaViewsRepository.ProcessPlanningTemplate.Properties.usageNote);
		EditingUtils.setEEFtype(editUsageNote, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createUsageNoteMultiValuedEditor

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createBaseProcessReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.baseProcess = new ReferencesTable(getDescription(UmaViewsRepository.ProcessPlanningTemplate.Properties.baseProcess, UmaMessages.ProcessPlanningTemplatePropertiesEditionPart_BaseProcessLabel), new ReferencesTableListener	() {
			public void handleAdd() { addBaseProcess(); }
			public void handleEdit(EObject element) { editBaseProcess(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveBaseProcess(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromBaseProcess(element); }
			public void navigateTo(EObject element) { }
		});
		this.baseProcess.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.ProcessPlanningTemplate.Properties.baseProcess, UmaViewsRepository.FORM_KIND));
		this.baseProcess.createControls(parent, widgetFactory);
		this.baseProcess.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.baseProcess, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData baseProcessData = new GridData(GridData.FILL_HORIZONTAL);
		baseProcessData.horizontalSpan = 3;
		this.baseProcess.setLayoutData(baseProcessData);
		this.baseProcess.disableMove();
		baseProcess.setID(UmaViewsRepository.ProcessPlanningTemplate.Properties.baseProcess);
		baseProcess.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createBaseProcessReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addBaseProcess() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(baseProcess.getInput(), baseProcessFilters, baseProcessBusinessFilters,
		"baseProcess", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.baseProcess,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				baseProcess.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveBaseProcess(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.baseProcess, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		baseProcess.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromBaseProcess(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPlanningTemplatePropertiesEditionPartForm.this, UmaViewsRepository.ProcessPlanningTemplate.Properties.baseProcess, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		baseProcess.refresh();
	}

	/**
	 * 
	 */
	protected void editBaseProcess(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				baseProcess.refresh();
			}
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getPreCondition()
	 * 
	 */
	public EList getPreCondition() {
		return preConditionList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setPreCondition(EList newValue)
	 * 
	 */
	public void setPreCondition(EList newValue) {
		preConditionList = newValue;
		if (newValue != null) {
			preCondition.setText(preConditionList.toString());
		} else {
			preCondition.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.preCondition);
		if (eefElementEditorReadOnlyState && preCondition.isEnabled()) {
			preCondition.setEnabled(false);
			preCondition.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !preCondition.isEnabled()) {
			preCondition.setEnabled(true);
		}	
		
	}

	public void addToPreCondition(Object newValue) {
		preConditionList.add(newValue);
		if (newValue != null) {
			preCondition.setText(preConditionList.toString());
		} else {
			preCondition.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToPreCondition(Object newValue) {
		preConditionList.remove(newValue);
		if (newValue != null) {
			preCondition.setText(preConditionList.toString());
		} else {
			preCondition.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getPostCondition()
	 * 
	 */
	public EList getPostCondition() {
		return postConditionList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setPostCondition(EList newValue)
	 * 
	 */
	public void setPostCondition(EList newValue) {
		postConditionList = newValue;
		if (newValue != null) {
			postCondition.setText(postConditionList.toString());
		} else {
			postCondition.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.postCondition);
		if (eefElementEditorReadOnlyState && postCondition.isEnabled()) {
			postCondition.setEnabled(false);
			postCondition.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !postCondition.isEnabled()) {
			postCondition.setEnabled(true);
		}	
		
	}

	public void addToPostCondition(Object newValue) {
		postConditionList.add(newValue);
		if (newValue != null) {
			postCondition.setText(postConditionList.toString());
		} else {
			postCondition.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToPostCondition(Object newValue) {
		postConditionList.remove(newValue);
		if (newValue != null) {
			postCondition.setText(postConditionList.toString());
		} else {
			postCondition.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getKind()
	 * 
	 */
	public EObject getKind() {
		if (kind.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) kind.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#initKind(EObjectFlatComboSettings)
	 */
	public void initKind(EObjectFlatComboSettings settings) {
		kind.setInput(settings);
		if (current != null) {
			kind.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.kind);
		if (eefElementEditorReadOnlyState && kind.isEnabled()) {
			kind.setEnabled(false);
			kind.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !kind.isEnabled()) {
			kind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setKind(EObject newValue)
	 * 
	 */
	public void setKind(EObject newValue) {
		if (newValue != null) {
			kind.setSelection(new StructuredSelection(newValue));
		} else {
			kind.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.kind);
		if (eefElementEditorReadOnlyState && kind.isEnabled()) {
			kind.setEnabled(false);
			kind.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !kind.isEnabled()) {
			kind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setKindButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKindButtonMode(ButtonsModeEnum newValue) {
		kind.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKind(ViewerFilter filter) {
		kind.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addBusinessFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKind(ViewerFilter filter) {
		kind.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getPresentationName()
	 * 
	 */
	public String getPresentationName() {
		return presentationName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setPresentationName(String newValue)
	 * 
	 */
	public void setPresentationName(String newValue) {
		if (newValue != null) {
			presentationName.setText(newValue);
		} else {
			presentationName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.presentationName);
		if (eefElementEditorReadOnlyState && presentationName.isEnabled()) {
			presentationName.setEnabled(false);
			presentationName.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !presentationName.isEnabled()) {
			presentationName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getBriefDescription()
	 * 
	 */
	public String getBriefDescription() {
		return briefDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setBriefDescription(String newValue)
	 * 
	 */
	public void setBriefDescription(String newValue) {
		if (newValue != null) {
			briefDescription.setText(newValue);
		} else {
			briefDescription.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.briefDescription);
		if (eefElementEditorReadOnlyState && briefDescription.isEnabled()) {
			briefDescription.setEnabled(false);
			briefDescription.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !briefDescription.isEnabled()) {
			briefDescription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getMainDescription()
	 * 
	 */
	public String getMainDescription() {
		return mainDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setMainDescription(String newValue)
	 * 
	 */
	public void setMainDescription(String newValue) {
		if (newValue != null) {
			mainDescription.setText(newValue);
		} else {
			mainDescription.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.mainDescription);
		if (eefElementEditorReadOnlyState && mainDescription.isEnabled()) {
			mainDescription.setEnabled(false);
			mainDescription.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mainDescription.isEnabled()) {
			mainDescription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getPurpose()
	 * 
	 */
	public String getPurpose() {
		return purpose.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setPurpose(String newValue)
	 * 
	 */
	public void setPurpose(String newValue) {
		if (newValue != null) {
			purpose.setText(newValue);
		} else {
			purpose.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.purpose);
		if (eefElementEditorReadOnlyState && purpose.isEnabled()) {
			purpose.setEnabled(false);
			purpose.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !purpose.isEnabled()) {
			purpose.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#initGuidance(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initGuidance(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		guidance.setContentProvider(contentProvider);
		guidance.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.guidance);
		if (eefElementEditorReadOnlyState && guidance.getTable().isEnabled()) {
			guidance.setEnabled(false);
			guidance.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !guidance.getTable().isEnabled()) {
			guidance.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#updateGuidance()
	 * 
	 */
	public void updateGuidance() {
	guidance.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGuidance(ViewerFilter filter) {
		guidanceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addBusinessFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGuidance(ViewerFilter filter) {
		guidanceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#isContainedInGuidanceTable(EObject element)
	 * 
	 */
	public boolean isContainedInGuidanceTable(EObject element) {
		return ((ReferencesTableSettings)guidance.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#initMetric(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMetric(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		metric.setContentProvider(contentProvider);
		metric.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.metric);
		if (eefElementEditorReadOnlyState && metric.getTable().isEnabled()) {
			metric.setEnabled(false);
			metric.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !metric.getTable().isEnabled()) {
			metric.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#updateMetric()
	 * 
	 */
	public void updateMetric() {
	metric.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMetric(ViewerFilter filter) {
		metricFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addBusinessFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMetric(ViewerFilter filter) {
		metricBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#isContainedInMetricTable(EObject element)
	 * 
	 */
	public boolean isContainedInMetricTable(EObject element) {
		return ((ReferencesTableSettings)metric.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#initCategory(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCategory(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		category.setContentProvider(contentProvider);
		category.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.category);
		if (eefElementEditorReadOnlyState && category.getTable().isEnabled()) {
			category.setEnabled(false);
			category.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !category.getTable().isEnabled()) {
			category.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#updateCategory()
	 * 
	 */
	public void updateCategory() {
	category.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCategory(ViewerFilter filter) {
		categoryFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addBusinessFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCategory(ViewerFilter filter) {
		categoryBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#isContainedInCategoryTable(EObject element)
	 * 
	 */
	public boolean isContainedInCategoryTable(EObject element) {
		return ((ReferencesTableSettings)category.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getCopyright()
	 * 
	 */
	public String getCopyright() {
		return copyright.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setCopyright(String newValue)
	 * 
	 */
	public void setCopyright(String newValue) {
		if (newValue != null) {
			copyright.setText(newValue);
		} else {
			copyright.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.copyright);
		if (eefElementEditorReadOnlyState && copyright.isEnabled()) {
			copyright.setEnabled(false);
			copyright.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !copyright.isEnabled()) {
			copyright.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getAuthor()
	 * 
	 */
	public EList getAuthor() {
		return authorList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setAuthor(EList newValue)
	 * 
	 */
	public void setAuthor(EList newValue) {
		authorList = newValue;
		if (newValue != null) {
			author.setText(authorList.toString());
		} else {
			author.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.author);
		if (eefElementEditorReadOnlyState && author.isEnabled()) {
			author.setEnabled(false);
			author.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !author.isEnabled()) {
			author.setEnabled(true);
		}	
		
	}

	public void addToAuthor(Object newValue) {
		authorList.add(newValue);
		if (newValue != null) {
			author.setText(authorList.toString());
		} else {
			author.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToAuthor(Object newValue) {
		authorList.remove(newValue);
		if (newValue != null) {
			author.setText(authorList.toString());
		} else {
			author.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getChangeDate()
	 * 
	 */
	public String getChangeDate() {
		return changeDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setChangeDate(String newValue)
	 * 
	 */
	public void setChangeDate(String newValue) {
		if (newValue != null) {
			changeDate.setText(newValue);
		} else {
			changeDate.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDate);
		if (eefElementEditorReadOnlyState && changeDate.isEnabled()) {
			changeDate.setEnabled(false);
			changeDate.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !changeDate.isEnabled()) {
			changeDate.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getChangeDescription()
	 * 
	 */
	public String getChangeDescription() {
		return changeDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setChangeDescription(String newValue)
	 * 
	 */
	public void setChangeDescription(String newValue) {
		if (newValue != null) {
			changeDescription.setText(newValue);
		} else {
			changeDescription.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.changeDescription);
		if (eefElementEditorReadOnlyState && changeDescription.isEnabled()) {
			changeDescription.setEnabled(false);
			changeDescription.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !changeDescription.isEnabled()) {
			changeDescription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setVersion(String newValue)
	 * 
	 */
	public void setVersion(String newValue) {
		if (newValue != null) {
			version.setText(newValue);
		} else {
			version.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.version);
		if (eefElementEditorReadOnlyState && version.isEnabled()) {
			version.setEnabled(false);
			version.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !version.isEnabled()) {
			version.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getHasMultipleOccurrences()
	 * 
	 */
	public Boolean getHasMultipleOccurrences() {
		return Boolean.valueOf(hasMultipleOccurrences.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setHasMultipleOccurrences(Boolean newValue)
	 * 
	 */
	public void setHasMultipleOccurrences(Boolean newValue) {
		if (newValue != null) {
			hasMultipleOccurrences.setSelection(newValue.booleanValue());
		} else {
			hasMultipleOccurrences.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.hasMultipleOccurrences);
		if (eefElementEditorReadOnlyState && hasMultipleOccurrences.isEnabled()) {
			hasMultipleOccurrences.setEnabled(false);
			hasMultipleOccurrences.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !hasMultipleOccurrences.isEnabled()) {
			hasMultipleOccurrences.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getIsOptional()
	 * 
	 */
	public Boolean getIsOptional() {
		return Boolean.valueOf(isOptional.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setIsOptional(Boolean newValue)
	 * 
	 */
	public void setIsOptional(Boolean newValue) {
		if (newValue != null) {
			isOptional.setSelection(newValue.booleanValue());
		} else {
			isOptional.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.isOptional);
		if (eefElementEditorReadOnlyState && isOptional.isEnabled()) {
			isOptional.setEnabled(false);
			isOptional.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isOptional.isEnabled()) {
			isOptional.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getIsPlanned()
	 * 
	 */
	public Boolean getIsPlanned() {
		return Boolean.valueOf(isPlanned.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setIsPlanned(Boolean newValue)
	 * 
	 */
	public void setIsPlanned(Boolean newValue) {
		if (newValue != null) {
			isPlanned.setSelection(newValue.booleanValue());
		} else {
			isPlanned.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.isPlanned);
		if (eefElementEditorReadOnlyState && isPlanned.isEnabled()) {
			isPlanned.setEnabled(false);
			isPlanned.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isPlanned.isEnabled()) {
			isPlanned.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getIsRepeatable()
	 * 
	 */
	public Boolean getIsRepeatable() {
		return Boolean.valueOf(isRepeatable.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setIsRepeatable(Boolean newValue)
	 * 
	 */
	public void setIsRepeatable(Boolean newValue) {
		if (newValue != null) {
			isRepeatable.setSelection(newValue.booleanValue());
		} else {
			isRepeatable.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.isRepeatable);
		if (eefElementEditorReadOnlyState && isRepeatable.isEnabled()) {
			isRepeatable.setEnabled(false);
			isRepeatable.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isRepeatable.isEnabled()) {
			isRepeatable.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getIsOngoing()
	 * 
	 */
	public Boolean getIsOngoing() {
		return Boolean.valueOf(isOngoing.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setIsOngoing(Boolean newValue)
	 * 
	 */
	public void setIsOngoing(Boolean newValue) {
		if (newValue != null) {
			isOngoing.setSelection(newValue.booleanValue());
		} else {
			isOngoing.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.isOngoing);
		if (eefElementEditorReadOnlyState && isOngoing.isEnabled()) {
			isOngoing.setEnabled(false);
			isOngoing.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isOngoing.isEnabled()) {
			isOngoing.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getIsEventDriven()
	 * 
	 */
	public Boolean getIsEventDriven() {
		return Boolean.valueOf(isEventDriven.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setIsEventDriven(Boolean newValue)
	 * 
	 */
	public void setIsEventDriven(Boolean newValue) {
		if (newValue != null) {
			isEventDriven.setSelection(newValue.booleanValue());
		} else {
			isEventDriven.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.isEventDriven);
		if (eefElementEditorReadOnlyState && isEventDriven.isEnabled()) {
			isEventDriven.setEnabled(false);
			isEventDriven.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isEventDriven.isEnabled()) {
			isEventDriven.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#initLinkToPredecessor(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initLinkToPredecessor(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		linkToPredecessor.setContentProvider(contentProvider);
		linkToPredecessor.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToPredecessor);
		if (eefElementEditorReadOnlyState && linkToPredecessor.getTable().isEnabled()) {
			linkToPredecessor.setEnabled(false);
			linkToPredecessor.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !linkToPredecessor.getTable().isEnabled()) {
			linkToPredecessor.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#updateLinkToPredecessor()
	 * 
	 */
	public void updateLinkToPredecessor() {
	linkToPredecessor.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addFilterLinkToPredecessor(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLinkToPredecessor(ViewerFilter filter) {
		linkToPredecessorFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addBusinessFilterLinkToPredecessor(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLinkToPredecessor(ViewerFilter filter) {
		linkToPredecessorBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#isContainedInLinkToPredecessorTable(EObject element)
	 * 
	 */
	public boolean isContainedInLinkToPredecessorTable(EObject element) {
		return ((ReferencesTableSettings)linkToPredecessor.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#initLinkToSuccessor(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initLinkToSuccessor(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		linkToSuccessor.setContentProvider(contentProvider);
		linkToSuccessor.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.linkToSuccessor);
		if (eefElementEditorReadOnlyState && linkToSuccessor.getTable().isEnabled()) {
			linkToSuccessor.setEnabled(false);
			linkToSuccessor.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !linkToSuccessor.getTable().isEnabled()) {
			linkToSuccessor.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#updateLinkToSuccessor()
	 * 
	 */
	public void updateLinkToSuccessor() {
	linkToSuccessor.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addFilterLinkToSuccessor(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLinkToSuccessor(ViewerFilter filter) {
		linkToSuccessorFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addBusinessFilterLinkToSuccessor(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLinkToSuccessor(ViewerFilter filter) {
		linkToSuccessorBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#isContainedInLinkToSuccessorTable(EObject element)
	 * 
	 */
	public boolean isContainedInLinkToSuccessorTable(EObject element) {
		return ((ReferencesTableSettings)linkToSuccessor.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getVariabilityType()
	 * 
	 */
	public Enumerator getVariabilityType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) variabilityType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#initVariabilityType(Object input, Enumerator current)
	 */
	public void initVariabilityType(Object input, Enumerator current) {
		variabilityType.setInput(input);
		variabilityType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityType);
		if (eefElementEditorReadOnlyState && variabilityType.isEnabled()) {
			variabilityType.setEnabled(false);
			variabilityType.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityType.isEnabled()) {
			variabilityType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setVariabilityType(Enumerator newValue)
	 * 
	 */
	public void setVariabilityType(Enumerator newValue) {
		variabilityType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityType);
		if (eefElementEditorReadOnlyState && variabilityType.isEnabled()) {
			variabilityType.setEnabled(false);
			variabilityType.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityType.isEnabled()) {
			variabilityType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getVariabilityBasedOnElement()
	 * 
	 */
	public EObject getVariabilityBasedOnElement() {
		if (variabilityBasedOnElement.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) variabilityBasedOnElement.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#initVariabilityBasedOnElement(EObjectFlatComboSettings)
	 */
	public void initVariabilityBasedOnElement(EObjectFlatComboSettings settings) {
		variabilityBasedOnElement.setInput(settings);
		if (current != null) {
			variabilityBasedOnElement.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityBasedOnElement);
		if (eefElementEditorReadOnlyState && variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(false);
			variabilityBasedOnElement.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setVariabilityBasedOnElement(EObject newValue)
	 * 
	 */
	public void setVariabilityBasedOnElement(EObject newValue) {
		if (newValue != null) {
			variabilityBasedOnElement.setSelection(new StructuredSelection(newValue));
		} else {
			variabilityBasedOnElement.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.variabilityBasedOnElement);
		if (eefElementEditorReadOnlyState && variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(false);
			variabilityBasedOnElement.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue)
	 */
	public void setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue) {
		variabilityBasedOnElement.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addFilterVariabilityBasedOnElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToVariabilityBasedOnElement(ViewerFilter filter) {
		variabilityBasedOnElement.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addBusinessFilterVariabilityBasedOnElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToVariabilityBasedOnElement(ViewerFilter filter) {
		variabilityBasedOnElement.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getUseKind()
	 * 
	 */
	public Enumerator getUseKind() {
		Enumerator selection = (Enumerator) ((StructuredSelection) useKind.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#initUseKind(Object input, Enumerator current)
	 */
	public void initUseKind(Object input, Enumerator current) {
		useKind.setInput(input);
		useKind.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.useKind);
		if (eefElementEditorReadOnlyState && useKind.isEnabled()) {
			useKind.setEnabled(false);
			useKind.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !useKind.isEnabled()) {
			useKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setUseKind(Enumerator newValue)
	 * 
	 */
	public void setUseKind(Enumerator newValue) {
		useKind.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.useKind);
		if (eefElementEditorReadOnlyState && useKind.isEnabled()) {
			useKind.setEnabled(false);
			useKind.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !useKind.isEnabled()) {
			useKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getUsedActivity()
	 * 
	 */
	public EObject getUsedActivity() {
		if (usedActivity.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) usedActivity.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#initUsedActivity(EObjectFlatComboSettings)
	 */
	public void initUsedActivity(EObjectFlatComboSettings settings) {
		usedActivity.setInput(settings);
		if (current != null) {
			usedActivity.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.usedActivity);
		if (eefElementEditorReadOnlyState && usedActivity.isEnabled()) {
			usedActivity.setEnabled(false);
			usedActivity.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !usedActivity.isEnabled()) {
			usedActivity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setUsedActivity(EObject newValue)
	 * 
	 */
	public void setUsedActivity(EObject newValue) {
		if (newValue != null) {
			usedActivity.setSelection(new StructuredSelection(newValue));
		} else {
			usedActivity.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.usedActivity);
		if (eefElementEditorReadOnlyState && usedActivity.isEnabled()) {
			usedActivity.setEnabled(false);
			usedActivity.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !usedActivity.isEnabled()) {
			usedActivity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setUsedActivityButtonMode(ButtonsModeEnum newValue)
	 */
	public void setUsedActivityButtonMode(ButtonsModeEnum newValue) {
		usedActivity.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addFilterUsedActivity(ViewerFilter filter)
	 * 
	 */
	public void addFilterToUsedActivity(ViewerFilter filter) {
		usedActivity.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addBusinessFilterUsedActivity(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToUsedActivity(ViewerFilter filter) {
		usedActivity.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#initSuppressedBreakdownElement(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSuppressedBreakdownElement(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		suppressedBreakdownElement.setContentProvider(contentProvider);
		suppressedBreakdownElement.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.suppressedBreakdownElement);
		if (eefElementEditorReadOnlyState && suppressedBreakdownElement.getTable().isEnabled()) {
			suppressedBreakdownElement.setEnabled(false);
			suppressedBreakdownElement.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !suppressedBreakdownElement.getTable().isEnabled()) {
			suppressedBreakdownElement.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#updateSuppressedBreakdownElement()
	 * 
	 */
	public void updateSuppressedBreakdownElement() {
	suppressedBreakdownElement.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addFilterSuppressedBreakdownElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSuppressedBreakdownElement(ViewerFilter filter) {
		suppressedBreakdownElementFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addBusinessFilterSuppressedBreakdownElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSuppressedBreakdownElement(ViewerFilter filter) {
		suppressedBreakdownElementBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#isContainedInSuppressedBreakdownElementTable(EObject element)
	 * 
	 */
	public boolean isContainedInSuppressedBreakdownElementTable(EObject element) {
		return ((ReferencesTableSettings)suppressedBreakdownElement.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getDefaultContext()
	 * 
	 */
	public EObject getDefaultContext() {
		if (defaultContext.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) defaultContext.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#initDefaultContext(EObjectFlatComboSettings)
	 */
	public void initDefaultContext(EObjectFlatComboSettings settings) {
		defaultContext.setInput(settings);
		if (current != null) {
			defaultContext.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.defaultContext);
		if (eefElementEditorReadOnlyState && defaultContext.isEnabled()) {
			defaultContext.setEnabled(false);
			defaultContext.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !defaultContext.isEnabled()) {
			defaultContext.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setDefaultContext(EObject newValue)
	 * 
	 */
	public void setDefaultContext(EObject newValue) {
		if (newValue != null) {
			defaultContext.setSelection(new StructuredSelection(newValue));
		} else {
			defaultContext.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.defaultContext);
		if (eefElementEditorReadOnlyState && defaultContext.isEnabled()) {
			defaultContext.setEnabled(false);
			defaultContext.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !defaultContext.isEnabled()) {
			defaultContext.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setDefaultContextButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDefaultContextButtonMode(ButtonsModeEnum newValue) {
		defaultContext.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addFilterDefaultContext(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDefaultContext(ViewerFilter filter) {
		defaultContext.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addBusinessFilterDefaultContext(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDefaultContext(ViewerFilter filter) {
		defaultContext.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#initValidContext(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initValidContext(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		validContext.setContentProvider(contentProvider);
		validContext.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.validContext);
		if (eefElementEditorReadOnlyState && validContext.getTable().isEnabled()) {
			validContext.setEnabled(false);
			validContext.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !validContext.getTable().isEnabled()) {
			validContext.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#updateValidContext()
	 * 
	 */
	public void updateValidContext() {
	validContext.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addFilterValidContext(ViewerFilter filter)
	 * 
	 */
	public void addFilterToValidContext(ViewerFilter filter) {
		validContextFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addBusinessFilterValidContext(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToValidContext(ViewerFilter filter) {
		validContextBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#isContainedInValidContextTable(EObject element)
	 * 
	 */
	public boolean isContainedInValidContextTable(EObject element) {
		return ((ReferencesTableSettings)validContext.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getIsEnactable()
	 * 
	 */
	public Boolean getIsEnactable() {
		return Boolean.valueOf(isEnactable.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setIsEnactable(Boolean newValue)
	 * 
	 */
	public void setIsEnactable(Boolean newValue) {
		if (newValue != null) {
			isEnactable.setSelection(newValue.booleanValue());
		} else {
			isEnactable.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.isEnactable);
		if (eefElementEditorReadOnlyState && isEnactable.isEnabled()) {
			isEnactable.setEnabled(false);
			isEnactable.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isEnactable.isEnabled()) {
			isEnactable.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getScope()
	 * 
	 */
	public String getScope() {
		return scope.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setScope(String newValue)
	 * 
	 */
	public void setScope(String newValue) {
		if (newValue != null) {
			scope.setText(newValue);
		} else {
			scope.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.scope);
		if (eefElementEditorReadOnlyState && scope.isEnabled()) {
			scope.setEnabled(false);
			scope.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scope.isEnabled()) {
			scope.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#getUsageNote()
	 * 
	 */
	public EList getUsageNote() {
		return usageNoteList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#setUsageNote(EList newValue)
	 * 
	 */
	public void setUsageNote(EList newValue) {
		usageNoteList = newValue;
		if (newValue != null) {
			usageNote.setText(usageNoteList.toString());
		} else {
			usageNote.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.usageNote);
		if (eefElementEditorReadOnlyState && usageNote.isEnabled()) {
			usageNote.setEnabled(false);
			usageNote.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !usageNote.isEnabled()) {
			usageNote.setEnabled(true);
		}	
		
	}

	public void addToUsageNote(Object newValue) {
		usageNoteList.add(newValue);
		if (newValue != null) {
			usageNote.setText(usageNoteList.toString());
		} else {
			usageNote.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToUsageNote(Object newValue) {
		usageNoteList.remove(newValue);
		if (newValue != null) {
			usageNote.setText(usageNoteList.toString());
		} else {
			usageNote.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#initBaseProcess(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initBaseProcess(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		baseProcess.setContentProvider(contentProvider);
		baseProcess.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.ProcessPlanningTemplate.Properties.baseProcess);
		if (eefElementEditorReadOnlyState && baseProcess.getTable().isEnabled()) {
			baseProcess.setEnabled(false);
			baseProcess.setToolTipText(UmaMessages.ProcessPlanningTemplate_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !baseProcess.getTable().isEnabled()) {
			baseProcess.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#updateBaseProcess()
	 * 
	 */
	public void updateBaseProcess() {
	baseProcess.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addFilterBaseProcess(ViewerFilter filter)
	 * 
	 */
	public void addFilterToBaseProcess(ViewerFilter filter) {
		baseProcessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#addBusinessFilterBaseProcess(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToBaseProcess(ViewerFilter filter) {
		baseProcessBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.ProcessPlanningTemplatePropertiesEditionPart#isContainedInBaseProcessTable(EObject element)
	 * 
	 */
	public boolean isContainedInBaseProcessTable(EObject element) {
		return ((ReferencesTableSettings)baseProcess.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return UmaMessages.ProcessPlanningTemplate_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
