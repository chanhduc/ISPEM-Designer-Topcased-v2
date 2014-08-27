/**
 * Generated with Acceleo
 */
package org.topcased.spem.uma.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import org.topcased.spem.SpemPackage;

import org.topcased.spem.uma.UmaPackage;

import org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart;
import org.topcased.spem.uma.parts.UmaViewsRepository;

import org.topcased.spem.uma.providers.UmaMessages;

// End of user code

/**
 * 
 * 
 */
public class CapabilityPatternPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, CapabilityPatternPropertiesEditionPart {

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



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CapabilityPatternPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence capabilityPatternStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = capabilityPatternStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.class);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.preCondition);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.postCondition);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.kind);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.presentationName);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.briefDescription);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.mainDescription);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.purpose);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.guidance);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.metric);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.category);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.copyright);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.author);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.changeDate);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.changeDescription);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.version);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.name);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.hasMultipleOccurrences);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.isOptional);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.isPlanned);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.isRepeatable);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.isOngoing);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.isEventDriven);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.linkToPredecessor);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.linkToSuccessor);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.variabilityType);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.variabilityBasedOnElement);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.useKind);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.usedActivity);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.suppressedBreakdownElement);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.defaultContext);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.validContext);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.isEnactable);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.scope);
		propertiesStep.addStep(UmaViewsRepository.CapabilityPattern.Properties.usageNote);
		
		
		composer = new PartComposer(capabilityPatternStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == UmaViewsRepository.CapabilityPattern.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.preCondition) {
					return createPreConditionMultiValuedEditor(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.postCondition) {
					return createPostConditionMultiValuedEditor(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.kind) {
					return createKindFlatComboViewer(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.presentationName) {
					return createPresentationNameText(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.briefDescription) {
					return createBriefDescriptionText(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.mainDescription) {
					return createMainDescriptionText(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.purpose) {
					return createPurposeText(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.guidance) {
					return createGuidanceAdvancedReferencesTable(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.metric) {
					return createMetricAdvancedReferencesTable(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.category) {
					return createCategoryAdvancedReferencesTable(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.copyright) {
					return createCopyrightText(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.author) {
					return createAuthorMultiValuedEditor(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.changeDate) {
					return createChangeDateText(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.changeDescription) {
					return createChangeDescriptionText(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.version) {
					return createVersionText(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.name) {
					return createNameText(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.hasMultipleOccurrences) {
					return createHasMultipleOccurrencesCheckbox(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.isOptional) {
					return createIsOptionalCheckbox(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.isPlanned) {
					return createIsPlannedCheckbox(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.isRepeatable) {
					return createIsRepeatableCheckbox(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.isOngoing) {
					return createIsOngoingCheckbox(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.isEventDriven) {
					return createIsEventDrivenCheckbox(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.linkToPredecessor) {
					return createLinkToPredecessorAdvancedReferencesTable(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.linkToSuccessor) {
					return createLinkToSuccessorAdvancedReferencesTable(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.variabilityType) {
					return createVariabilityTypeEMFComboViewer(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.variabilityBasedOnElement) {
					return createVariabilityBasedOnElementFlatComboViewer(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.useKind) {
					return createUseKindEMFComboViewer(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.usedActivity) {
					return createUsedActivityFlatComboViewer(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.suppressedBreakdownElement) {
					return createSuppressedBreakdownElementAdvancedReferencesTable(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.defaultContext) {
					return createDefaultContextFlatComboViewer(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.validContext) {
					return createValidContextAdvancedReferencesTable(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.isEnactable) {
					return createIsEnactableCheckbox(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.scope) {
					return createScopeText(parent);
				}
				if (key == UmaViewsRepository.CapabilityPattern.Properties.usageNote) {
					return createUsageNoteMultiValuedEditor(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(UmaMessages.CapabilityPatternPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	protected Composite createPreConditionMultiValuedEditor(Composite parent) {
		preCondition = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData preConditionData = new GridData(GridData.FILL_HORIZONTAL);
		preConditionData.horizontalSpan = 2;
		preCondition.setLayoutData(preConditionData);
		EditingUtils.setID(preCondition, UmaViewsRepository.CapabilityPattern.Properties.preCondition);
		EditingUtils.setEEFtype(preCondition, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editPreCondition = new Button(parent, SWT.NONE);
		editPreCondition.setText(getDescription(UmaViewsRepository.CapabilityPattern.Properties.preCondition, UmaMessages.CapabilityPatternPropertiesEditionPart_PreConditionLabel));
		GridData editPreConditionData = new GridData();
		editPreCondition.setLayoutData(editPreConditionData);
		editPreCondition.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						preCondition.getShell(), "CapabilityPattern", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						preConditionList, SpemPackage.eINSTANCE.getWorkDefinition_PreCondition().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					preConditionList = dialog.getResult();
					if (preConditionList == null) {
						preConditionList = new BasicEList();
					}
					preCondition.setText(preConditionList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.preCondition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(preConditionList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editPreCondition, UmaViewsRepository.CapabilityPattern.Properties.preCondition);
		EditingUtils.setEEFtype(editPreCondition, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createPreConditionMultiValuedEditor

		// End of user code
		return parent;
	}

	protected Composite createPostConditionMultiValuedEditor(Composite parent) {
		postCondition = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData postConditionData = new GridData(GridData.FILL_HORIZONTAL);
		postConditionData.horizontalSpan = 2;
		postCondition.setLayoutData(postConditionData);
		EditingUtils.setID(postCondition, UmaViewsRepository.CapabilityPattern.Properties.postCondition);
		EditingUtils.setEEFtype(postCondition, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editPostCondition = new Button(parent, SWT.NONE);
		editPostCondition.setText(getDescription(UmaViewsRepository.CapabilityPattern.Properties.postCondition, UmaMessages.CapabilityPatternPropertiesEditionPart_PostConditionLabel));
		GridData editPostConditionData = new GridData();
		editPostCondition.setLayoutData(editPostConditionData);
		editPostCondition.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						postCondition.getShell(), "CapabilityPattern", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						postConditionList, SpemPackage.eINSTANCE.getWorkDefinition_PostCondition().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					postConditionList = dialog.getResult();
					if (postConditionList == null) {
						postConditionList = new BasicEList();
					}
					postCondition.setText(postConditionList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.postCondition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(postConditionList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editPostCondition, UmaViewsRepository.CapabilityPattern.Properties.postCondition);
		EditingUtils.setEEFtype(editPostCondition, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createPostConditionMultiValuedEditor

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createKindFlatComboViewer(Composite parent) {
		createDescription(parent, UmaViewsRepository.CapabilityPattern.Properties.kind, UmaMessages.CapabilityPatternPropertiesEditionPart_KindLabel);
		kind = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmaViewsRepository.CapabilityPattern.Properties.kind, UmaViewsRepository.SWT_KIND));
		kind.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		kind.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.kind, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getKind()));
			}

		});
		GridData kindData = new GridData(GridData.FILL_HORIZONTAL);
		kind.setLayoutData(kindData);
		kind.setID(UmaViewsRepository.CapabilityPattern.Properties.kind);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.kind, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createKindFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createPresentationNameText(Composite parent) {
		createDescription(parent, UmaViewsRepository.CapabilityPattern.Properties.presentationName, UmaMessages.CapabilityPatternPropertiesEditionPart_PresentationNameLabel);
		presentationName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData presentationNameData = new GridData(GridData.FILL_HORIZONTAL);
		presentationName.setLayoutData(presentationNameData);
		presentationName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
			}

		});
		presentationName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
				}
			}

		});
		EditingUtils.setID(presentationName, UmaViewsRepository.CapabilityPattern.Properties.presentationName);
		EditingUtils.setEEFtype(presentationName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.presentationName, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPresentationNameText

		// End of user code
		return parent;
	}

	
	protected Composite createBriefDescriptionText(Composite parent) {
		createDescription(parent, UmaViewsRepository.CapabilityPattern.Properties.briefDescription, UmaMessages.CapabilityPatternPropertiesEditionPart_BriefDescriptionLabel);
		briefDescription = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData briefDescriptionData = new GridData(GridData.FILL_HORIZONTAL);
		briefDescription.setLayoutData(briefDescriptionData);
		briefDescription.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
			}

		});
		briefDescription.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
				}
			}

		});
		EditingUtils.setID(briefDescription, UmaViewsRepository.CapabilityPattern.Properties.briefDescription);
		EditingUtils.setEEFtype(briefDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.briefDescription, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createBriefDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createMainDescriptionText(Composite parent) {
		createDescription(parent, UmaViewsRepository.CapabilityPattern.Properties.mainDescription, UmaMessages.CapabilityPatternPropertiesEditionPart_MainDescriptionLabel);
		mainDescription = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData mainDescriptionData = new GridData(GridData.FILL_HORIZONTAL);
		mainDescription.setLayoutData(mainDescriptionData);
		mainDescription.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
			}

		});
		mainDescription.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
				}
			}

		});
		EditingUtils.setID(mainDescription, UmaViewsRepository.CapabilityPattern.Properties.mainDescription);
		EditingUtils.setEEFtype(mainDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.mainDescription, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMainDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createPurposeText(Composite parent) {
		createDescription(parent, UmaViewsRepository.CapabilityPattern.Properties.purpose, UmaMessages.CapabilityPatternPropertiesEditionPart_PurposeLabel);
		purpose = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData purposeData = new GridData(GridData.FILL_HORIZONTAL);
		purpose.setLayoutData(purposeData);
		purpose.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
			}

		});
		purpose.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
				}
			}

		});
		EditingUtils.setID(purpose, UmaViewsRepository.CapabilityPattern.Properties.purpose);
		EditingUtils.setEEFtype(purpose, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.purpose, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPurposeText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createGuidanceAdvancedReferencesTable(Composite parent) {
		String label = getDescription(UmaViewsRepository.CapabilityPattern.Properties.guidance, UmaMessages.CapabilityPatternPropertiesEditionPart_GuidanceLabel);		 
		this.guidance = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addGuidance(); }
			public void handleEdit(EObject element) { editGuidance(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGuidance(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGuidance(element); }
			public void navigateTo(EObject element) { }
		});
		this.guidance.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.guidance, UmaViewsRepository.SWT_KIND));
		this.guidance.createControls(parent);
		this.guidance.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.guidance, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData guidanceData = new GridData(GridData.FILL_HORIZONTAL);
		guidanceData.horizontalSpan = 3;
		this.guidance.setLayoutData(guidanceData);
		this.guidance.disableMove();
		guidance.setID(UmaViewsRepository.CapabilityPattern.Properties.guidance);
		guidance.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.guidance,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		guidance.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGuidance(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createMetricAdvancedReferencesTable(Composite parent) {
		String label = getDescription(UmaViewsRepository.CapabilityPattern.Properties.metric, UmaMessages.CapabilityPatternPropertiesEditionPart_MetricLabel);		 
		this.metric = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addMetric(); }
			public void handleEdit(EObject element) { editMetric(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMetric(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMetric(element); }
			public void navigateTo(EObject element) { }
		});
		this.metric.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.metric, UmaViewsRepository.SWT_KIND));
		this.metric.createControls(parent);
		this.metric.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.metric, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData metricData = new GridData(GridData.FILL_HORIZONTAL);
		metricData.horizontalSpan = 3;
		this.metric.setLayoutData(metricData);
		this.metric.disableMove();
		metric.setID(UmaViewsRepository.CapabilityPattern.Properties.metric);
		metric.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.metric,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		metric.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMetric(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createCategoryAdvancedReferencesTable(Composite parent) {
		String label = getDescription(UmaViewsRepository.CapabilityPattern.Properties.category, UmaMessages.CapabilityPatternPropertiesEditionPart_CategoryLabel);		 
		this.category = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addCategory(); }
			public void handleEdit(EObject element) { editCategory(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCategory(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCategory(element); }
			public void navigateTo(EObject element) { }
		});
		this.category.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.category, UmaViewsRepository.SWT_KIND));
		this.category.createControls(parent);
		this.category.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.category, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData categoryData = new GridData(GridData.FILL_HORIZONTAL);
		categoryData.horizontalSpan = 3;
		this.category.setLayoutData(categoryData);
		this.category.disableMove();
		category.setID(UmaViewsRepository.CapabilityPattern.Properties.category);
		category.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.category,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		category.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCategory(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	
	protected Composite createCopyrightText(Composite parent) {
		createDescription(parent, UmaViewsRepository.CapabilityPattern.Properties.copyright, UmaMessages.CapabilityPatternPropertiesEditionPart_CopyrightLabel);
		copyright = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData copyrightData = new GridData(GridData.FILL_HORIZONTAL);
		copyright.setLayoutData(copyrightData);
		copyright.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
			}

		});
		copyright.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
				}
			}

		});
		EditingUtils.setID(copyright, UmaViewsRepository.CapabilityPattern.Properties.copyright);
		EditingUtils.setEEFtype(copyright, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.copyright, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCopyrightText

		// End of user code
		return parent;
	}

	protected Composite createAuthorMultiValuedEditor(Composite parent) {
		author = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData authorData = new GridData(GridData.FILL_HORIZONTAL);
		authorData.horizontalSpan = 2;
		author.setLayoutData(authorData);
		EditingUtils.setID(author, UmaViewsRepository.CapabilityPattern.Properties.author);
		EditingUtils.setEEFtype(author, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editAuthor = new Button(parent, SWT.NONE);
		editAuthor.setText(getDescription(UmaViewsRepository.CapabilityPattern.Properties.author, UmaMessages.CapabilityPatternPropertiesEditionPart_AuthorLabel));
		GridData editAuthorData = new GridData();
		editAuthor.setLayoutData(editAuthorData);
		editAuthor.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						author.getShell(), "CapabilityPattern", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						authorList, SpemPackage.eINSTANCE.getDescribableElement_Author().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					authorList = dialog.getResult();
					if (authorList == null) {
						authorList = new BasicEList();
					}
					author.setText(authorList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.author, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(authorList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editAuthor, UmaViewsRepository.CapabilityPattern.Properties.author);
		EditingUtils.setEEFtype(editAuthor, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createAuthorMultiValuedEditor

		// End of user code
		return parent;
	}

	
	protected Composite createChangeDateText(Composite parent) {
		createDescription(parent, UmaViewsRepository.CapabilityPattern.Properties.changeDate, UmaMessages.CapabilityPatternPropertiesEditionPart_ChangeDateLabel);
		changeDate = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData changeDateData = new GridData(GridData.FILL_HORIZONTAL);
		changeDate.setLayoutData(changeDateData);
		changeDate.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
			}

		});
		changeDate.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
				}
			}

		});
		EditingUtils.setID(changeDate, UmaViewsRepository.CapabilityPattern.Properties.changeDate);
		EditingUtils.setEEFtype(changeDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.changeDate, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createChangeDateText

		// End of user code
		return parent;
	}

	
	protected Composite createChangeDescriptionText(Composite parent) {
		createDescription(parent, UmaViewsRepository.CapabilityPattern.Properties.changeDescription, UmaMessages.CapabilityPatternPropertiesEditionPart_ChangeDescriptionLabel);
		changeDescription = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData changeDescriptionData = new GridData(GridData.FILL_HORIZONTAL);
		changeDescription.setLayoutData(changeDescriptionData);
		changeDescription.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
			}

		});
		changeDescription.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
				}
			}

		});
		EditingUtils.setID(changeDescription, UmaViewsRepository.CapabilityPattern.Properties.changeDescription);
		EditingUtils.setEEFtype(changeDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.changeDescription, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createChangeDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createVersionText(Composite parent) {
		createDescription(parent, UmaViewsRepository.CapabilityPattern.Properties.version, UmaMessages.CapabilityPatternPropertiesEditionPart_VersionLabel);
		version = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData versionData = new GridData(GridData.FILL_HORIZONTAL);
		version.setLayoutData(versionData);
		version.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
			}

		});
		version.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}

		});
		EditingUtils.setID(version, UmaViewsRepository.CapabilityPattern.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.version, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVersionText

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, UmaViewsRepository.CapabilityPattern.Properties.name, UmaMessages.CapabilityPatternPropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, UmaViewsRepository.CapabilityPattern.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.name, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createHasMultipleOccurrencesCheckbox(Composite parent) {
		hasMultipleOccurrences = new Button(parent, SWT.CHECK);
		hasMultipleOccurrences.setText(getDescription(UmaViewsRepository.CapabilityPattern.Properties.hasMultipleOccurrences, UmaMessages.CapabilityPatternPropertiesEditionPart_HasMultipleOccurrencesLabel));
		hasMultipleOccurrences.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.hasMultipleOccurrences, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(hasMultipleOccurrences.getSelection())));
			}

		});
		GridData hasMultipleOccurrencesData = new GridData(GridData.FILL_HORIZONTAL);
		hasMultipleOccurrencesData.horizontalSpan = 2;
		hasMultipleOccurrences.setLayoutData(hasMultipleOccurrencesData);
		EditingUtils.setID(hasMultipleOccurrences, UmaViewsRepository.CapabilityPattern.Properties.hasMultipleOccurrences);
		EditingUtils.setEEFtype(hasMultipleOccurrences, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.hasMultipleOccurrences, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createHasMultipleOccurrencesCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createIsOptionalCheckbox(Composite parent) {
		isOptional = new Button(parent, SWT.CHECK);
		isOptional.setText(getDescription(UmaViewsRepository.CapabilityPattern.Properties.isOptional, UmaMessages.CapabilityPatternPropertiesEditionPart_IsOptionalLabel));
		isOptional.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.isOptional, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isOptional.getSelection())));
			}

		});
		GridData isOptionalData = new GridData(GridData.FILL_HORIZONTAL);
		isOptionalData.horizontalSpan = 2;
		isOptional.setLayoutData(isOptionalData);
		EditingUtils.setID(isOptional, UmaViewsRepository.CapabilityPattern.Properties.isOptional);
		EditingUtils.setEEFtype(isOptional, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.isOptional, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIsOptionalCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createIsPlannedCheckbox(Composite parent) {
		isPlanned = new Button(parent, SWT.CHECK);
		isPlanned.setText(getDescription(UmaViewsRepository.CapabilityPattern.Properties.isPlanned, UmaMessages.CapabilityPatternPropertiesEditionPart_IsPlannedLabel));
		isPlanned.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.isPlanned, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isPlanned.getSelection())));
			}

		});
		GridData isPlannedData = new GridData(GridData.FILL_HORIZONTAL);
		isPlannedData.horizontalSpan = 2;
		isPlanned.setLayoutData(isPlannedData);
		EditingUtils.setID(isPlanned, UmaViewsRepository.CapabilityPattern.Properties.isPlanned);
		EditingUtils.setEEFtype(isPlanned, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.isPlanned, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIsPlannedCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createIsRepeatableCheckbox(Composite parent) {
		isRepeatable = new Button(parent, SWT.CHECK);
		isRepeatable.setText(getDescription(UmaViewsRepository.CapabilityPattern.Properties.isRepeatable, UmaMessages.CapabilityPatternPropertiesEditionPart_IsRepeatableLabel));
		isRepeatable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.isRepeatable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isRepeatable.getSelection())));
			}

		});
		GridData isRepeatableData = new GridData(GridData.FILL_HORIZONTAL);
		isRepeatableData.horizontalSpan = 2;
		isRepeatable.setLayoutData(isRepeatableData);
		EditingUtils.setID(isRepeatable, UmaViewsRepository.CapabilityPattern.Properties.isRepeatable);
		EditingUtils.setEEFtype(isRepeatable, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.isRepeatable, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIsRepeatableCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createIsOngoingCheckbox(Composite parent) {
		isOngoing = new Button(parent, SWT.CHECK);
		isOngoing.setText(getDescription(UmaViewsRepository.CapabilityPattern.Properties.isOngoing, UmaMessages.CapabilityPatternPropertiesEditionPart_IsOngoingLabel));
		isOngoing.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.isOngoing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isOngoing.getSelection())));
			}

		});
		GridData isOngoingData = new GridData(GridData.FILL_HORIZONTAL);
		isOngoingData.horizontalSpan = 2;
		isOngoing.setLayoutData(isOngoingData);
		EditingUtils.setID(isOngoing, UmaViewsRepository.CapabilityPattern.Properties.isOngoing);
		EditingUtils.setEEFtype(isOngoing, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.isOngoing, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIsOngoingCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createIsEventDrivenCheckbox(Composite parent) {
		isEventDriven = new Button(parent, SWT.CHECK);
		isEventDriven.setText(getDescription(UmaViewsRepository.CapabilityPattern.Properties.isEventDriven, UmaMessages.CapabilityPatternPropertiesEditionPart_IsEventDrivenLabel));
		isEventDriven.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.isEventDriven, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isEventDriven.getSelection())));
			}

		});
		GridData isEventDrivenData = new GridData(GridData.FILL_HORIZONTAL);
		isEventDrivenData.horizontalSpan = 2;
		isEventDriven.setLayoutData(isEventDrivenData);
		EditingUtils.setID(isEventDriven, UmaViewsRepository.CapabilityPattern.Properties.isEventDriven);
		EditingUtils.setEEFtype(isEventDriven, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.isEventDriven, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIsEventDrivenCheckbox

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createLinkToPredecessorAdvancedReferencesTable(Composite parent) {
		String label = getDescription(UmaViewsRepository.CapabilityPattern.Properties.linkToPredecessor, UmaMessages.CapabilityPatternPropertiesEditionPart_LinkToPredecessorLabel);		 
		this.linkToPredecessor = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addLinkToPredecessor(); }
			public void handleEdit(EObject element) { editLinkToPredecessor(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveLinkToPredecessor(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromLinkToPredecessor(element); }
			public void navigateTo(EObject element) { }
		});
		this.linkToPredecessor.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.linkToPredecessor, UmaViewsRepository.SWT_KIND));
		this.linkToPredecessor.createControls(parent);
		this.linkToPredecessor.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.linkToPredecessor, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData linkToPredecessorData = new GridData(GridData.FILL_HORIZONTAL);
		linkToPredecessorData.horizontalSpan = 3;
		this.linkToPredecessor.setLayoutData(linkToPredecessorData);
		this.linkToPredecessor.disableMove();
		linkToPredecessor.setID(UmaViewsRepository.CapabilityPattern.Properties.linkToPredecessor);
		linkToPredecessor.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.linkToPredecessor,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.linkToPredecessor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		linkToPredecessor.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromLinkToPredecessor(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.linkToPredecessor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createLinkToSuccessorAdvancedReferencesTable(Composite parent) {
		String label = getDescription(UmaViewsRepository.CapabilityPattern.Properties.linkToSuccessor, UmaMessages.CapabilityPatternPropertiesEditionPart_LinkToSuccessorLabel);		 
		this.linkToSuccessor = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addLinkToSuccessor(); }
			public void handleEdit(EObject element) { editLinkToSuccessor(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveLinkToSuccessor(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromLinkToSuccessor(element); }
			public void navigateTo(EObject element) { }
		});
		this.linkToSuccessor.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.linkToSuccessor, UmaViewsRepository.SWT_KIND));
		this.linkToSuccessor.createControls(parent);
		this.linkToSuccessor.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.linkToSuccessor, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData linkToSuccessorData = new GridData(GridData.FILL_HORIZONTAL);
		linkToSuccessorData.horizontalSpan = 3;
		this.linkToSuccessor.setLayoutData(linkToSuccessorData);
		this.linkToSuccessor.disableMove();
		linkToSuccessor.setID(UmaViewsRepository.CapabilityPattern.Properties.linkToSuccessor);
		linkToSuccessor.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.linkToSuccessor,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.linkToSuccessor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		linkToSuccessor.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromLinkToSuccessor(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.linkToSuccessor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	
	protected Composite createVariabilityTypeEMFComboViewer(Composite parent) {
		createDescription(parent, UmaViewsRepository.CapabilityPattern.Properties.variabilityType, UmaMessages.CapabilityPatternPropertiesEditionPart_VariabilityTypeLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.variabilityType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVariabilityType()));
			}

		});
		variabilityType.setID(UmaViewsRepository.CapabilityPattern.Properties.variabilityType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.variabilityType, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVariabilityTypeEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createVariabilityBasedOnElementFlatComboViewer(Composite parent) {
		createDescription(parent, UmaViewsRepository.CapabilityPattern.Properties.variabilityBasedOnElement, UmaMessages.CapabilityPatternPropertiesEditionPart_VariabilityBasedOnElementLabel);
		variabilityBasedOnElement = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmaViewsRepository.CapabilityPattern.Properties.variabilityBasedOnElement, UmaViewsRepository.SWT_KIND));
		variabilityBasedOnElement.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		variabilityBasedOnElement.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.variabilityBasedOnElement, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getVariabilityBasedOnElement()));
			}

		});
		GridData variabilityBasedOnElementData = new GridData(GridData.FILL_HORIZONTAL);
		variabilityBasedOnElement.setLayoutData(variabilityBasedOnElementData);
		variabilityBasedOnElement.setID(UmaViewsRepository.CapabilityPattern.Properties.variabilityBasedOnElement);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.variabilityBasedOnElement, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVariabilityBasedOnElementFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createUseKindEMFComboViewer(Composite parent) {
		createDescription(parent, UmaViewsRepository.CapabilityPattern.Properties.useKind, UmaMessages.CapabilityPatternPropertiesEditionPart_UseKindLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.useKind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getUseKind()));
			}

		});
		useKind.setID(UmaViewsRepository.CapabilityPattern.Properties.useKind);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.useKind, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createUseKindEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createUsedActivityFlatComboViewer(Composite parent) {
		createDescription(parent, UmaViewsRepository.CapabilityPattern.Properties.usedActivity, UmaMessages.CapabilityPatternPropertiesEditionPart_UsedActivityLabel);
		usedActivity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmaViewsRepository.CapabilityPattern.Properties.usedActivity, UmaViewsRepository.SWT_KIND));
		usedActivity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		usedActivity.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.usedActivity, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getUsedActivity()));
			}

		});
		GridData usedActivityData = new GridData(GridData.FILL_HORIZONTAL);
		usedActivity.setLayoutData(usedActivityData);
		usedActivity.setID(UmaViewsRepository.CapabilityPattern.Properties.usedActivity);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.usedActivity, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createUsedActivityFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSuppressedBreakdownElementAdvancedReferencesTable(Composite parent) {
		String label = getDescription(UmaViewsRepository.CapabilityPattern.Properties.suppressedBreakdownElement, UmaMessages.CapabilityPatternPropertiesEditionPart_SuppressedBreakdownElementLabel);		 
		this.suppressedBreakdownElement = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addSuppressedBreakdownElement(); }
			public void handleEdit(EObject element) { editSuppressedBreakdownElement(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSuppressedBreakdownElement(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSuppressedBreakdownElement(element); }
			public void navigateTo(EObject element) { }
		});
		this.suppressedBreakdownElement.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.suppressedBreakdownElement, UmaViewsRepository.SWT_KIND));
		this.suppressedBreakdownElement.createControls(parent);
		this.suppressedBreakdownElement.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.suppressedBreakdownElement, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData suppressedBreakdownElementData = new GridData(GridData.FILL_HORIZONTAL);
		suppressedBreakdownElementData.horizontalSpan = 3;
		this.suppressedBreakdownElement.setLayoutData(suppressedBreakdownElementData);
		this.suppressedBreakdownElement.disableMove();
		suppressedBreakdownElement.setID(UmaViewsRepository.CapabilityPattern.Properties.suppressedBreakdownElement);
		suppressedBreakdownElement.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.suppressedBreakdownElement,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.suppressedBreakdownElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		suppressedBreakdownElement.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSuppressedBreakdownElement(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.suppressedBreakdownElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * 
	 */
	protected Composite createDefaultContextFlatComboViewer(Composite parent) {
		createDescription(parent, UmaViewsRepository.CapabilityPattern.Properties.defaultContext, UmaMessages.CapabilityPatternPropertiesEditionPart_DefaultContextLabel);
		defaultContext = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmaViewsRepository.CapabilityPattern.Properties.defaultContext, UmaViewsRepository.SWT_KIND));
		defaultContext.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		defaultContext.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.defaultContext, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getDefaultContext()));
			}

		});
		GridData defaultContextData = new GridData(GridData.FILL_HORIZONTAL);
		defaultContext.setLayoutData(defaultContextData);
		defaultContext.setID(UmaViewsRepository.CapabilityPattern.Properties.defaultContext);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.defaultContext, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDefaultContextFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createValidContextAdvancedReferencesTable(Composite parent) {
		String label = getDescription(UmaViewsRepository.CapabilityPattern.Properties.validContext, UmaMessages.CapabilityPatternPropertiesEditionPart_ValidContextLabel);		 
		this.validContext = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addValidContext(); }
			public void handleEdit(EObject element) { editValidContext(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveValidContext(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromValidContext(element); }
			public void navigateTo(EObject element) { }
		});
		this.validContext.setHelpText(propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.validContext, UmaViewsRepository.SWT_KIND));
		this.validContext.createControls(parent);
		this.validContext.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.validContext, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData validContextData = new GridData(GridData.FILL_HORIZONTAL);
		validContextData.horizontalSpan = 3;
		this.validContext.setLayoutData(validContextData);
		this.validContext.disableMove();
		validContext.setID(UmaViewsRepository.CapabilityPattern.Properties.validContext);
		validContext.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.validContext,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.validContext, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		validContext.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromValidContext(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.validContext, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	
	protected Composite createIsEnactableCheckbox(Composite parent) {
		isEnactable = new Button(parent, SWT.CHECK);
		isEnactable.setText(getDescription(UmaViewsRepository.CapabilityPattern.Properties.isEnactable, UmaMessages.CapabilityPatternPropertiesEditionPart_IsEnactableLabel));
		isEnactable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.isEnactable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isEnactable.getSelection())));
			}

		});
		GridData isEnactableData = new GridData(GridData.FILL_HORIZONTAL);
		isEnactableData.horizontalSpan = 2;
		isEnactable.setLayoutData(isEnactableData);
		EditingUtils.setID(isEnactable, UmaViewsRepository.CapabilityPattern.Properties.isEnactable);
		EditingUtils.setEEFtype(isEnactable, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.isEnactable, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIsEnactableCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createScopeText(Composite parent) {
		createDescription(parent, UmaViewsRepository.CapabilityPattern.Properties.scope, UmaMessages.CapabilityPatternPropertiesEditionPart_ScopeLabel);
		scope = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData scopeData = new GridData(GridData.FILL_HORIZONTAL);
		scope.setLayoutData(scopeData);
		scope.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.scope, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, scope.getText()));
			}

		});
		scope.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.scope, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, scope.getText()));
				}
			}

		});
		EditingUtils.setID(scope, UmaViewsRepository.CapabilityPattern.Properties.scope);
		EditingUtils.setEEFtype(scope, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmaViewsRepository.CapabilityPattern.Properties.scope, UmaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createScopeText

		// End of user code
		return parent;
	}

	protected Composite createUsageNoteMultiValuedEditor(Composite parent) {
		usageNote = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData usageNoteData = new GridData(GridData.FILL_HORIZONTAL);
		usageNoteData.horizontalSpan = 2;
		usageNote.setLayoutData(usageNoteData);
		EditingUtils.setID(usageNote, UmaViewsRepository.CapabilityPattern.Properties.usageNote);
		EditingUtils.setEEFtype(usageNote, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editUsageNote = new Button(parent, SWT.NONE);
		editUsageNote.setText(getDescription(UmaViewsRepository.CapabilityPattern.Properties.usageNote, UmaMessages.CapabilityPatternPropertiesEditionPart_UsageNoteLabel));
		GridData editUsageNoteData = new GridData();
		editUsageNote.setLayoutData(editUsageNoteData);
		editUsageNote.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						usageNote.getShell(), "CapabilityPattern", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						usageNoteList, UmaPackage.eINSTANCE.getProcess_UsageNote().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					usageNoteList = dialog.getResult();
					if (usageNoteList == null) {
						usageNoteList = new BasicEList();
					}
					usageNote.setText(usageNoteList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CapabilityPatternPropertiesEditionPartImpl.this, UmaViewsRepository.CapabilityPattern.Properties.usageNote, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(usageNoteList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editUsageNote, UmaViewsRepository.CapabilityPattern.Properties.usageNote);
		EditingUtils.setEEFtype(editUsageNote, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createUsageNoteMultiValuedEditor

		// End of user code
		return parent;
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
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getPreCondition()
	 * 
	 */
	public EList getPreCondition() {
		return preConditionList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setPreCondition(EList newValue)
	 * 
	 */
	public void setPreCondition(EList newValue) {
		preConditionList = newValue;
		if (newValue != null) {
			preCondition.setText(preConditionList.toString());
		} else {
			preCondition.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.preCondition);
		if (eefElementEditorReadOnlyState && preCondition.isEnabled()) {
			preCondition.setEnabled(false);
			preCondition.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
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
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getPostCondition()
	 * 
	 */
	public EList getPostCondition() {
		return postConditionList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setPostCondition(EList newValue)
	 * 
	 */
	public void setPostCondition(EList newValue) {
		postConditionList = newValue;
		if (newValue != null) {
			postCondition.setText(postConditionList.toString());
		} else {
			postCondition.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.postCondition);
		if (eefElementEditorReadOnlyState && postCondition.isEnabled()) {
			postCondition.setEnabled(false);
			postCondition.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
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
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getKind()
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
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#initKind(EObjectFlatComboSettings)
	 */
	public void initKind(EObjectFlatComboSettings settings) {
		kind.setInput(settings);
		if (current != null) {
			kind.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.kind);
		if (eefElementEditorReadOnlyState && kind.isEnabled()) {
			kind.setEnabled(false);
			kind.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !kind.isEnabled()) {
			kind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setKind(EObject newValue)
	 * 
	 */
	public void setKind(EObject newValue) {
		if (newValue != null) {
			kind.setSelection(new StructuredSelection(newValue));
		} else {
			kind.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.kind);
		if (eefElementEditorReadOnlyState && kind.isEnabled()) {
			kind.setEnabled(false);
			kind.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !kind.isEnabled()) {
			kind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setKindButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKindButtonMode(ButtonsModeEnum newValue) {
		kind.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKind(ViewerFilter filter) {
		kind.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addBusinessFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKind(ViewerFilter filter) {
		kind.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getPresentationName()
	 * 
	 */
	public String getPresentationName() {
		return presentationName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setPresentationName(String newValue)
	 * 
	 */
	public void setPresentationName(String newValue) {
		if (newValue != null) {
			presentationName.setText(newValue);
		} else {
			presentationName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.presentationName);
		if (eefElementEditorReadOnlyState && presentationName.isEnabled()) {
			presentationName.setEnabled(false);
			presentationName.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !presentationName.isEnabled()) {
			presentationName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getBriefDescription()
	 * 
	 */
	public String getBriefDescription() {
		return briefDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setBriefDescription(String newValue)
	 * 
	 */
	public void setBriefDescription(String newValue) {
		if (newValue != null) {
			briefDescription.setText(newValue);
		} else {
			briefDescription.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.briefDescription);
		if (eefElementEditorReadOnlyState && briefDescription.isEnabled()) {
			briefDescription.setEnabled(false);
			briefDescription.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !briefDescription.isEnabled()) {
			briefDescription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getMainDescription()
	 * 
	 */
	public String getMainDescription() {
		return mainDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setMainDescription(String newValue)
	 * 
	 */
	public void setMainDescription(String newValue) {
		if (newValue != null) {
			mainDescription.setText(newValue);
		} else {
			mainDescription.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.mainDescription);
		if (eefElementEditorReadOnlyState && mainDescription.isEnabled()) {
			mainDescription.setEnabled(false);
			mainDescription.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mainDescription.isEnabled()) {
			mainDescription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getPurpose()
	 * 
	 */
	public String getPurpose() {
		return purpose.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setPurpose(String newValue)
	 * 
	 */
	public void setPurpose(String newValue) {
		if (newValue != null) {
			purpose.setText(newValue);
		} else {
			purpose.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.purpose);
		if (eefElementEditorReadOnlyState && purpose.isEnabled()) {
			purpose.setEnabled(false);
			purpose.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !purpose.isEnabled()) {
			purpose.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#initGuidance(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initGuidance(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		guidance.setContentProvider(contentProvider);
		guidance.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.guidance);
		if (eefElementEditorReadOnlyState && guidance.getTable().isEnabled()) {
			guidance.setEnabled(false);
			guidance.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !guidance.getTable().isEnabled()) {
			guidance.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#updateGuidance()
	 * 
	 */
	public void updateGuidance() {
	guidance.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGuidance(ViewerFilter filter) {
		guidanceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addBusinessFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGuidance(ViewerFilter filter) {
		guidanceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#isContainedInGuidanceTable(EObject element)
	 * 
	 */
	public boolean isContainedInGuidanceTable(EObject element) {
		return ((ReferencesTableSettings)guidance.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#initMetric(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMetric(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		metric.setContentProvider(contentProvider);
		metric.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.metric);
		if (eefElementEditorReadOnlyState && metric.getTable().isEnabled()) {
			metric.setEnabled(false);
			metric.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !metric.getTable().isEnabled()) {
			metric.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#updateMetric()
	 * 
	 */
	public void updateMetric() {
	metric.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMetric(ViewerFilter filter) {
		metricFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addBusinessFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMetric(ViewerFilter filter) {
		metricBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#isContainedInMetricTable(EObject element)
	 * 
	 */
	public boolean isContainedInMetricTable(EObject element) {
		return ((ReferencesTableSettings)metric.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#initCategory(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCategory(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		category.setContentProvider(contentProvider);
		category.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.category);
		if (eefElementEditorReadOnlyState && category.getTable().isEnabled()) {
			category.setEnabled(false);
			category.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !category.getTable().isEnabled()) {
			category.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#updateCategory()
	 * 
	 */
	public void updateCategory() {
	category.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCategory(ViewerFilter filter) {
		categoryFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addBusinessFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCategory(ViewerFilter filter) {
		categoryBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#isContainedInCategoryTable(EObject element)
	 * 
	 */
	public boolean isContainedInCategoryTable(EObject element) {
		return ((ReferencesTableSettings)category.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getCopyright()
	 * 
	 */
	public String getCopyright() {
		return copyright.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setCopyright(String newValue)
	 * 
	 */
	public void setCopyright(String newValue) {
		if (newValue != null) {
			copyright.setText(newValue);
		} else {
			copyright.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.copyright);
		if (eefElementEditorReadOnlyState && copyright.isEnabled()) {
			copyright.setEnabled(false);
			copyright.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !copyright.isEnabled()) {
			copyright.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getAuthor()
	 * 
	 */
	public EList getAuthor() {
		return authorList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setAuthor(EList newValue)
	 * 
	 */
	public void setAuthor(EList newValue) {
		authorList = newValue;
		if (newValue != null) {
			author.setText(authorList.toString());
		} else {
			author.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.author);
		if (eefElementEditorReadOnlyState && author.isEnabled()) {
			author.setEnabled(false);
			author.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
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
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getChangeDate()
	 * 
	 */
	public String getChangeDate() {
		return changeDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setChangeDate(String newValue)
	 * 
	 */
	public void setChangeDate(String newValue) {
		if (newValue != null) {
			changeDate.setText(newValue);
		} else {
			changeDate.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.changeDate);
		if (eefElementEditorReadOnlyState && changeDate.isEnabled()) {
			changeDate.setEnabled(false);
			changeDate.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !changeDate.isEnabled()) {
			changeDate.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getChangeDescription()
	 * 
	 */
	public String getChangeDescription() {
		return changeDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setChangeDescription(String newValue)
	 * 
	 */
	public void setChangeDescription(String newValue) {
		if (newValue != null) {
			changeDescription.setText(newValue);
		} else {
			changeDescription.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.changeDescription);
		if (eefElementEditorReadOnlyState && changeDescription.isEnabled()) {
			changeDescription.setEnabled(false);
			changeDescription.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !changeDescription.isEnabled()) {
			changeDescription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setVersion(String newValue)
	 * 
	 */
	public void setVersion(String newValue) {
		if (newValue != null) {
			version.setText(newValue);
		} else {
			version.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.version);
		if (eefElementEditorReadOnlyState && version.isEnabled()) {
			version.setEnabled(false);
			version.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !version.isEnabled()) {
			version.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getHasMultipleOccurrences()
	 * 
	 */
	public Boolean getHasMultipleOccurrences() {
		return Boolean.valueOf(hasMultipleOccurrences.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setHasMultipleOccurrences(Boolean newValue)
	 * 
	 */
	public void setHasMultipleOccurrences(Boolean newValue) {
		if (newValue != null) {
			hasMultipleOccurrences.setSelection(newValue.booleanValue());
		} else {
			hasMultipleOccurrences.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.hasMultipleOccurrences);
		if (eefElementEditorReadOnlyState && hasMultipleOccurrences.isEnabled()) {
			hasMultipleOccurrences.setEnabled(false);
			hasMultipleOccurrences.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !hasMultipleOccurrences.isEnabled()) {
			hasMultipleOccurrences.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getIsOptional()
	 * 
	 */
	public Boolean getIsOptional() {
		return Boolean.valueOf(isOptional.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setIsOptional(Boolean newValue)
	 * 
	 */
	public void setIsOptional(Boolean newValue) {
		if (newValue != null) {
			isOptional.setSelection(newValue.booleanValue());
		} else {
			isOptional.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.isOptional);
		if (eefElementEditorReadOnlyState && isOptional.isEnabled()) {
			isOptional.setEnabled(false);
			isOptional.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isOptional.isEnabled()) {
			isOptional.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getIsPlanned()
	 * 
	 */
	public Boolean getIsPlanned() {
		return Boolean.valueOf(isPlanned.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setIsPlanned(Boolean newValue)
	 * 
	 */
	public void setIsPlanned(Boolean newValue) {
		if (newValue != null) {
			isPlanned.setSelection(newValue.booleanValue());
		} else {
			isPlanned.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.isPlanned);
		if (eefElementEditorReadOnlyState && isPlanned.isEnabled()) {
			isPlanned.setEnabled(false);
			isPlanned.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isPlanned.isEnabled()) {
			isPlanned.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getIsRepeatable()
	 * 
	 */
	public Boolean getIsRepeatable() {
		return Boolean.valueOf(isRepeatable.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setIsRepeatable(Boolean newValue)
	 * 
	 */
	public void setIsRepeatable(Boolean newValue) {
		if (newValue != null) {
			isRepeatable.setSelection(newValue.booleanValue());
		} else {
			isRepeatable.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.isRepeatable);
		if (eefElementEditorReadOnlyState && isRepeatable.isEnabled()) {
			isRepeatable.setEnabled(false);
			isRepeatable.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isRepeatable.isEnabled()) {
			isRepeatable.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getIsOngoing()
	 * 
	 */
	public Boolean getIsOngoing() {
		return Boolean.valueOf(isOngoing.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setIsOngoing(Boolean newValue)
	 * 
	 */
	public void setIsOngoing(Boolean newValue) {
		if (newValue != null) {
			isOngoing.setSelection(newValue.booleanValue());
		} else {
			isOngoing.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.isOngoing);
		if (eefElementEditorReadOnlyState && isOngoing.isEnabled()) {
			isOngoing.setEnabled(false);
			isOngoing.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isOngoing.isEnabled()) {
			isOngoing.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getIsEventDriven()
	 * 
	 */
	public Boolean getIsEventDriven() {
		return Boolean.valueOf(isEventDriven.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setIsEventDriven(Boolean newValue)
	 * 
	 */
	public void setIsEventDriven(Boolean newValue) {
		if (newValue != null) {
			isEventDriven.setSelection(newValue.booleanValue());
		} else {
			isEventDriven.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.isEventDriven);
		if (eefElementEditorReadOnlyState && isEventDriven.isEnabled()) {
			isEventDriven.setEnabled(false);
			isEventDriven.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isEventDriven.isEnabled()) {
			isEventDriven.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#initLinkToPredecessor(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initLinkToPredecessor(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		linkToPredecessor.setContentProvider(contentProvider);
		linkToPredecessor.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.linkToPredecessor);
		if (eefElementEditorReadOnlyState && linkToPredecessor.getTable().isEnabled()) {
			linkToPredecessor.setEnabled(false);
			linkToPredecessor.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !linkToPredecessor.getTable().isEnabled()) {
			linkToPredecessor.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#updateLinkToPredecessor()
	 * 
	 */
	public void updateLinkToPredecessor() {
	linkToPredecessor.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addFilterLinkToPredecessor(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLinkToPredecessor(ViewerFilter filter) {
		linkToPredecessorFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addBusinessFilterLinkToPredecessor(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLinkToPredecessor(ViewerFilter filter) {
		linkToPredecessorBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#isContainedInLinkToPredecessorTable(EObject element)
	 * 
	 */
	public boolean isContainedInLinkToPredecessorTable(EObject element) {
		return ((ReferencesTableSettings)linkToPredecessor.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#initLinkToSuccessor(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initLinkToSuccessor(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		linkToSuccessor.setContentProvider(contentProvider);
		linkToSuccessor.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.linkToSuccessor);
		if (eefElementEditorReadOnlyState && linkToSuccessor.getTable().isEnabled()) {
			linkToSuccessor.setEnabled(false);
			linkToSuccessor.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !linkToSuccessor.getTable().isEnabled()) {
			linkToSuccessor.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#updateLinkToSuccessor()
	 * 
	 */
	public void updateLinkToSuccessor() {
	linkToSuccessor.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addFilterLinkToSuccessor(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLinkToSuccessor(ViewerFilter filter) {
		linkToSuccessorFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addBusinessFilterLinkToSuccessor(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLinkToSuccessor(ViewerFilter filter) {
		linkToSuccessorBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#isContainedInLinkToSuccessorTable(EObject element)
	 * 
	 */
	public boolean isContainedInLinkToSuccessorTable(EObject element) {
		return ((ReferencesTableSettings)linkToSuccessor.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getVariabilityType()
	 * 
	 */
	public Enumerator getVariabilityType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) variabilityType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#initVariabilityType(Object input, Enumerator current)
	 */
	public void initVariabilityType(Object input, Enumerator current) {
		variabilityType.setInput(input);
		variabilityType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.variabilityType);
		if (eefElementEditorReadOnlyState && variabilityType.isEnabled()) {
			variabilityType.setEnabled(false);
			variabilityType.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityType.isEnabled()) {
			variabilityType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setVariabilityType(Enumerator newValue)
	 * 
	 */
	public void setVariabilityType(Enumerator newValue) {
		variabilityType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.variabilityType);
		if (eefElementEditorReadOnlyState && variabilityType.isEnabled()) {
			variabilityType.setEnabled(false);
			variabilityType.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityType.isEnabled()) {
			variabilityType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getVariabilityBasedOnElement()
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
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#initVariabilityBasedOnElement(EObjectFlatComboSettings)
	 */
	public void initVariabilityBasedOnElement(EObjectFlatComboSettings settings) {
		variabilityBasedOnElement.setInput(settings);
		if (current != null) {
			variabilityBasedOnElement.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.variabilityBasedOnElement);
		if (eefElementEditorReadOnlyState && variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(false);
			variabilityBasedOnElement.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setVariabilityBasedOnElement(EObject newValue)
	 * 
	 */
	public void setVariabilityBasedOnElement(EObject newValue) {
		if (newValue != null) {
			variabilityBasedOnElement.setSelection(new StructuredSelection(newValue));
		} else {
			variabilityBasedOnElement.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.variabilityBasedOnElement);
		if (eefElementEditorReadOnlyState && variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(false);
			variabilityBasedOnElement.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue)
	 */
	public void setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue) {
		variabilityBasedOnElement.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addFilterVariabilityBasedOnElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToVariabilityBasedOnElement(ViewerFilter filter) {
		variabilityBasedOnElement.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addBusinessFilterVariabilityBasedOnElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToVariabilityBasedOnElement(ViewerFilter filter) {
		variabilityBasedOnElement.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getUseKind()
	 * 
	 */
	public Enumerator getUseKind() {
		Enumerator selection = (Enumerator) ((StructuredSelection) useKind.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#initUseKind(Object input, Enumerator current)
	 */
	public void initUseKind(Object input, Enumerator current) {
		useKind.setInput(input);
		useKind.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.useKind);
		if (eefElementEditorReadOnlyState && useKind.isEnabled()) {
			useKind.setEnabled(false);
			useKind.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !useKind.isEnabled()) {
			useKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setUseKind(Enumerator newValue)
	 * 
	 */
	public void setUseKind(Enumerator newValue) {
		useKind.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.useKind);
		if (eefElementEditorReadOnlyState && useKind.isEnabled()) {
			useKind.setEnabled(false);
			useKind.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !useKind.isEnabled()) {
			useKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getUsedActivity()
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
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#initUsedActivity(EObjectFlatComboSettings)
	 */
	public void initUsedActivity(EObjectFlatComboSettings settings) {
		usedActivity.setInput(settings);
		if (current != null) {
			usedActivity.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.usedActivity);
		if (eefElementEditorReadOnlyState && usedActivity.isEnabled()) {
			usedActivity.setEnabled(false);
			usedActivity.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !usedActivity.isEnabled()) {
			usedActivity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setUsedActivity(EObject newValue)
	 * 
	 */
	public void setUsedActivity(EObject newValue) {
		if (newValue != null) {
			usedActivity.setSelection(new StructuredSelection(newValue));
		} else {
			usedActivity.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.usedActivity);
		if (eefElementEditorReadOnlyState && usedActivity.isEnabled()) {
			usedActivity.setEnabled(false);
			usedActivity.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !usedActivity.isEnabled()) {
			usedActivity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setUsedActivityButtonMode(ButtonsModeEnum newValue)
	 */
	public void setUsedActivityButtonMode(ButtonsModeEnum newValue) {
		usedActivity.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addFilterUsedActivity(ViewerFilter filter)
	 * 
	 */
	public void addFilterToUsedActivity(ViewerFilter filter) {
		usedActivity.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addBusinessFilterUsedActivity(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToUsedActivity(ViewerFilter filter) {
		usedActivity.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#initSuppressedBreakdownElement(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSuppressedBreakdownElement(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		suppressedBreakdownElement.setContentProvider(contentProvider);
		suppressedBreakdownElement.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.suppressedBreakdownElement);
		if (eefElementEditorReadOnlyState && suppressedBreakdownElement.getTable().isEnabled()) {
			suppressedBreakdownElement.setEnabled(false);
			suppressedBreakdownElement.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !suppressedBreakdownElement.getTable().isEnabled()) {
			suppressedBreakdownElement.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#updateSuppressedBreakdownElement()
	 * 
	 */
	public void updateSuppressedBreakdownElement() {
	suppressedBreakdownElement.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addFilterSuppressedBreakdownElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSuppressedBreakdownElement(ViewerFilter filter) {
		suppressedBreakdownElementFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addBusinessFilterSuppressedBreakdownElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSuppressedBreakdownElement(ViewerFilter filter) {
		suppressedBreakdownElementBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#isContainedInSuppressedBreakdownElementTable(EObject element)
	 * 
	 */
	public boolean isContainedInSuppressedBreakdownElementTable(EObject element) {
		return ((ReferencesTableSettings)suppressedBreakdownElement.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getDefaultContext()
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
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#initDefaultContext(EObjectFlatComboSettings)
	 */
	public void initDefaultContext(EObjectFlatComboSettings settings) {
		defaultContext.setInput(settings);
		if (current != null) {
			defaultContext.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.defaultContext);
		if (eefElementEditorReadOnlyState && defaultContext.isEnabled()) {
			defaultContext.setEnabled(false);
			defaultContext.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !defaultContext.isEnabled()) {
			defaultContext.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setDefaultContext(EObject newValue)
	 * 
	 */
	public void setDefaultContext(EObject newValue) {
		if (newValue != null) {
			defaultContext.setSelection(new StructuredSelection(newValue));
		} else {
			defaultContext.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.defaultContext);
		if (eefElementEditorReadOnlyState && defaultContext.isEnabled()) {
			defaultContext.setEnabled(false);
			defaultContext.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !defaultContext.isEnabled()) {
			defaultContext.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setDefaultContextButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDefaultContextButtonMode(ButtonsModeEnum newValue) {
		defaultContext.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addFilterDefaultContext(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDefaultContext(ViewerFilter filter) {
		defaultContext.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addBusinessFilterDefaultContext(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDefaultContext(ViewerFilter filter) {
		defaultContext.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#initValidContext(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initValidContext(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		validContext.setContentProvider(contentProvider);
		validContext.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.validContext);
		if (eefElementEditorReadOnlyState && validContext.getTable().isEnabled()) {
			validContext.setEnabled(false);
			validContext.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !validContext.getTable().isEnabled()) {
			validContext.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#updateValidContext()
	 * 
	 */
	public void updateValidContext() {
	validContext.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addFilterValidContext(ViewerFilter filter)
	 * 
	 */
	public void addFilterToValidContext(ViewerFilter filter) {
		validContextFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#addBusinessFilterValidContext(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToValidContext(ViewerFilter filter) {
		validContextBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#isContainedInValidContextTable(EObject element)
	 * 
	 */
	public boolean isContainedInValidContextTable(EObject element) {
		return ((ReferencesTableSettings)validContext.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getIsEnactable()
	 * 
	 */
	public Boolean getIsEnactable() {
		return Boolean.valueOf(isEnactable.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setIsEnactable(Boolean newValue)
	 * 
	 */
	public void setIsEnactable(Boolean newValue) {
		if (newValue != null) {
			isEnactable.setSelection(newValue.booleanValue());
		} else {
			isEnactable.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.isEnactable);
		if (eefElementEditorReadOnlyState && isEnactable.isEnabled()) {
			isEnactable.setEnabled(false);
			isEnactable.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isEnactable.isEnabled()) {
			isEnactable.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getScope()
	 * 
	 */
	public String getScope() {
		return scope.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setScope(String newValue)
	 * 
	 */
	public void setScope(String newValue) {
		if (newValue != null) {
			scope.setText(newValue);
		} else {
			scope.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.scope);
		if (eefElementEditorReadOnlyState && scope.isEnabled()) {
			scope.setEnabled(false);
			scope.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scope.isEnabled()) {
			scope.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#getUsageNote()
	 * 
	 */
	public EList getUsageNote() {
		return usageNoteList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.uma.parts.CapabilityPatternPropertiesEditionPart#setUsageNote(EList newValue)
	 * 
	 */
	public void setUsageNote(EList newValue) {
		usageNoteList = newValue;
		if (newValue != null) {
			usageNote.setText(usageNoteList.toString());
		} else {
			usageNote.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(UmaViewsRepository.CapabilityPattern.Properties.usageNote);
		if (eefElementEditorReadOnlyState && usageNote.isEnabled()) {
			usageNote.setEnabled(false);
			usageNote.setToolTipText(UmaMessages.CapabilityPattern_ReadOnly);
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
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return UmaMessages.CapabilityPattern_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
