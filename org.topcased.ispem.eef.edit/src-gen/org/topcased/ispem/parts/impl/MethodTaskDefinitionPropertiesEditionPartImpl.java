/**
 * Generated with Acceleo
 */
package org.topcased.ispem.parts.impl;

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

import org.topcased.ispem.parts.IspemViewsRepository;
import org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart;

import org.topcased.ispem.providers.IspemMessages;

import org.topcased.spem.SpemPackage;

// End of user code

/**
 * 
 * 
 */
public class MethodTaskDefinitionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, MethodTaskDefinitionPropertiesEditionPart {

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
	protected Text uri;
	protected Text preCondition;
	protected Button editPreCondition;
	private EList preConditionList;
	protected Text postCondition;
	protected Button editPostCondition;
	private EList postConditionList;
	protected Text name;
	protected EMFComboViewer variabilityType;
	protected EObjectFlatComboViewer variabilityBasedOnElement;
	protected EObjectFlatComboViewer methodContentKind;
	protected ReferencesTable ownedTaskDefinitionParameter;
	protected List<ViewerFilter> ownedTaskDefinitionParameterBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedTaskDefinitionParameterFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable requiredQualification;
	protected List<ViewerFilter> requiredQualificationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> requiredQualificationFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable usedTool;
	protected List<ViewerFilter> usedToolBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> usedToolFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer specializedBy;
	protected ReferencesTable specializes;
	protected List<ViewerFilter> specializesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> specializesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MethodTaskDefinitionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence methodTaskDefinitionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = methodTaskDefinitionStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.class);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.kind);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.presentationName);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.briefDescription);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.mainDescription);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.purpose);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.guidance);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.metric);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.category);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.copyright);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.author);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.changeDate);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.changeDescription);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.version);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.uri);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.preCondition);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.postCondition);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.name);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.variabilityType);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.variabilityBasedOnElement);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.methodContentKind);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.ownedTaskDefinitionParameter);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.requiredQualification);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.usedTool);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.specializedBy);
		propertiesStep.addStep(IspemViewsRepository.MethodTaskDefinition.Properties.specializes);
		
		
		composer = new PartComposer(methodTaskDefinitionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.kind) {
					return createKindFlatComboViewer(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.presentationName) {
					return createPresentationNameText(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.briefDescription) {
					return createBriefDescriptionText(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.mainDescription) {
					return createMainDescriptionText(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.purpose) {
					return createPurposeText(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.guidance) {
					return createGuidanceAdvancedReferencesTable(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.metric) {
					return createMetricAdvancedReferencesTable(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.category) {
					return createCategoryAdvancedReferencesTable(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.copyright) {
					return createCopyrightText(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.author) {
					return createAuthorMultiValuedEditor(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.changeDate) {
					return createChangeDateText(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.changeDescription) {
					return createChangeDescriptionText(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.version) {
					return createVersionText(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.uri) {
					return createUriText(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.preCondition) {
					return createPreConditionMultiValuedEditor(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.postCondition) {
					return createPostConditionMultiValuedEditor(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.name) {
					return createNameText(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.variabilityType) {
					return createVariabilityTypeEMFComboViewer(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.variabilityBasedOnElement) {
					return createVariabilityBasedOnElementFlatComboViewer(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.methodContentKind) {
					return createMethodContentKindFlatComboViewer(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.ownedTaskDefinitionParameter) {
					return createOwnedTaskDefinitionParameterAdvancedTableComposition(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.requiredQualification) {
					return createRequiredQualificationAdvancedReferencesTable(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.usedTool) {
					return createUsedToolAdvancedReferencesTable(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.specializedBy) {
					return createSpecializedByFlatComboViewer(parent);
				}
				if (key == IspemViewsRepository.MethodTaskDefinition.Properties.specializes) {
					return createSpecializesAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(IspemMessages.MethodTaskDefinitionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createKindFlatComboViewer(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodTaskDefinition.Properties.kind, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_KindLabel);
		kind = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(IspemViewsRepository.MethodTaskDefinition.Properties.kind, IspemViewsRepository.SWT_KIND));
		kind.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		kind.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.kind, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getKind()));
			}

		});
		GridData kindData = new GridData(GridData.FILL_HORIZONTAL);
		kind.setLayoutData(kindData);
		kind.setID(IspemViewsRepository.MethodTaskDefinition.Properties.kind);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.kind, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createKindFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createPresentationNameText(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodTaskDefinition.Properties.presentationName, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_PresentationNameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
				}
			}

		});
		EditingUtils.setID(presentationName, IspemViewsRepository.MethodTaskDefinition.Properties.presentationName);
		EditingUtils.setEEFtype(presentationName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.presentationName, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPresentationNameText

		// End of user code
		return parent;
	}

	
	protected Composite createBriefDescriptionText(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodTaskDefinition.Properties.briefDescription, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_BriefDescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
				}
			}

		});
		EditingUtils.setID(briefDescription, IspemViewsRepository.MethodTaskDefinition.Properties.briefDescription);
		EditingUtils.setEEFtype(briefDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.briefDescription, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createBriefDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createMainDescriptionText(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodTaskDefinition.Properties.mainDescription, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_MainDescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
				}
			}

		});
		EditingUtils.setID(mainDescription, IspemViewsRepository.MethodTaskDefinition.Properties.mainDescription);
		EditingUtils.setEEFtype(mainDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.mainDescription, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMainDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createPurposeText(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodTaskDefinition.Properties.purpose, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_PurposeLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
				}
			}

		});
		EditingUtils.setID(purpose, IspemViewsRepository.MethodTaskDefinition.Properties.purpose);
		EditingUtils.setEEFtype(purpose, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.purpose, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPurposeText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createGuidanceAdvancedReferencesTable(Composite parent) {
		String label = getDescription(IspemViewsRepository.MethodTaskDefinition.Properties.guidance, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_GuidanceLabel);		 
		this.guidance = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addGuidance(); }
			public void handleEdit(EObject element) { editGuidance(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGuidance(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGuidance(element); }
			public void navigateTo(EObject element) { }
		});
		this.guidance.setHelpText(propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.guidance, IspemViewsRepository.SWT_KIND));
		this.guidance.createControls(parent);
		this.guidance.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.guidance, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData guidanceData = new GridData(GridData.FILL_HORIZONTAL);
		guidanceData.horizontalSpan = 3;
		this.guidance.setLayoutData(guidanceData);
		this.guidance.disableMove();
		guidance.setID(IspemViewsRepository.MethodTaskDefinition.Properties.guidance);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.guidance,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		guidance.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGuidance(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		String label = getDescription(IspemViewsRepository.MethodTaskDefinition.Properties.metric, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_MetricLabel);		 
		this.metric = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addMetric(); }
			public void handleEdit(EObject element) { editMetric(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMetric(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMetric(element); }
			public void navigateTo(EObject element) { }
		});
		this.metric.setHelpText(propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.metric, IspemViewsRepository.SWT_KIND));
		this.metric.createControls(parent);
		this.metric.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.metric, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData metricData = new GridData(GridData.FILL_HORIZONTAL);
		metricData.horizontalSpan = 3;
		this.metric.setLayoutData(metricData);
		this.metric.disableMove();
		metric.setID(IspemViewsRepository.MethodTaskDefinition.Properties.metric);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.metric,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		metric.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMetric(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		String label = getDescription(IspemViewsRepository.MethodTaskDefinition.Properties.category, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_CategoryLabel);		 
		this.category = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addCategory(); }
			public void handleEdit(EObject element) { editCategory(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCategory(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCategory(element); }
			public void navigateTo(EObject element) { }
		});
		this.category.setHelpText(propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.category, IspemViewsRepository.SWT_KIND));
		this.category.createControls(parent);
		this.category.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.category, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData categoryData = new GridData(GridData.FILL_HORIZONTAL);
		categoryData.horizontalSpan = 3;
		this.category.setLayoutData(categoryData);
		this.category.disableMove();
		category.setID(IspemViewsRepository.MethodTaskDefinition.Properties.category);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.category,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		category.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCategory(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		createDescription(parent, IspemViewsRepository.MethodTaskDefinition.Properties.copyright, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_CopyrightLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
				}
			}

		});
		EditingUtils.setID(copyright, IspemViewsRepository.MethodTaskDefinition.Properties.copyright);
		EditingUtils.setEEFtype(copyright, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.copyright, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCopyrightText

		// End of user code
		return parent;
	}

	protected Composite createAuthorMultiValuedEditor(Composite parent) {
		author = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData authorData = new GridData(GridData.FILL_HORIZONTAL);
		authorData.horizontalSpan = 2;
		author.setLayoutData(authorData);
		EditingUtils.setID(author, IspemViewsRepository.MethodTaskDefinition.Properties.author);
		EditingUtils.setEEFtype(author, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editAuthor = new Button(parent, SWT.NONE);
		editAuthor.setText(getDescription(IspemViewsRepository.MethodTaskDefinition.Properties.author, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_AuthorLabel));
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
						author.getShell(), "MethodTaskDefinition", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						authorList, SpemPackage.eINSTANCE.getDescribableElement_Author().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					authorList = dialog.getResult();
					if (authorList == null) {
						authorList = new BasicEList();
					}
					author.setText(authorList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.author, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(authorList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editAuthor, IspemViewsRepository.MethodTaskDefinition.Properties.author);
		EditingUtils.setEEFtype(editAuthor, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createAuthorMultiValuedEditor

		// End of user code
		return parent;
	}

	
	protected Composite createChangeDateText(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodTaskDefinition.Properties.changeDate, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_ChangeDateLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
				}
			}

		});
		EditingUtils.setID(changeDate, IspemViewsRepository.MethodTaskDefinition.Properties.changeDate);
		EditingUtils.setEEFtype(changeDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.changeDate, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createChangeDateText

		// End of user code
		return parent;
	}

	
	protected Composite createChangeDescriptionText(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodTaskDefinition.Properties.changeDescription, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_ChangeDescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
				}
			}

		});
		EditingUtils.setID(changeDescription, IspemViewsRepository.MethodTaskDefinition.Properties.changeDescription);
		EditingUtils.setEEFtype(changeDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.changeDescription, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createChangeDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createVersionText(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodTaskDefinition.Properties.version, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_VersionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}

		});
		EditingUtils.setID(version, IspemViewsRepository.MethodTaskDefinition.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.version, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVersionText

		// End of user code
		return parent;
	}

	
	protected Composite createUriText(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodTaskDefinition.Properties.uri, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_UriLabel);
		uri = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData uriData = new GridData(GridData.FILL_HORIZONTAL);
		uri.setLayoutData(uriData);
		uri.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.uri, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, uri.getText()));
			}

		});
		uri.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.uri, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, uri.getText()));
				}
			}

		});
		EditingUtils.setID(uri, IspemViewsRepository.MethodTaskDefinition.Properties.uri);
		EditingUtils.setEEFtype(uri, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.uri, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createUriText

		// End of user code
		return parent;
	}

	protected Composite createPreConditionMultiValuedEditor(Composite parent) {
		preCondition = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData preConditionData = new GridData(GridData.FILL_HORIZONTAL);
		preConditionData.horizontalSpan = 2;
		preCondition.setLayoutData(preConditionData);
		EditingUtils.setID(preCondition, IspemViewsRepository.MethodTaskDefinition.Properties.preCondition);
		EditingUtils.setEEFtype(preCondition, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editPreCondition = new Button(parent, SWT.NONE);
		editPreCondition.setText(getDescription(IspemViewsRepository.MethodTaskDefinition.Properties.preCondition, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_PreConditionLabel));
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
						preCondition.getShell(), "MethodTaskDefinition", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						preConditionList, SpemPackage.eINSTANCE.getWorkDefinition_PreCondition().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					preConditionList = dialog.getResult();
					if (preConditionList == null) {
						preConditionList = new BasicEList();
					}
					preCondition.setText(preConditionList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.preCondition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(preConditionList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editPreCondition, IspemViewsRepository.MethodTaskDefinition.Properties.preCondition);
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
		EditingUtils.setID(postCondition, IspemViewsRepository.MethodTaskDefinition.Properties.postCondition);
		EditingUtils.setEEFtype(postCondition, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editPostCondition = new Button(parent, SWT.NONE);
		editPostCondition.setText(getDescription(IspemViewsRepository.MethodTaskDefinition.Properties.postCondition, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_PostConditionLabel));
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
						postCondition.getShell(), "MethodTaskDefinition", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						postConditionList, SpemPackage.eINSTANCE.getWorkDefinition_PostCondition().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					postConditionList = dialog.getResult();
					if (postConditionList == null) {
						postConditionList = new BasicEList();
					}
					postCondition.setText(postConditionList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.postCondition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(postConditionList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editPostCondition, IspemViewsRepository.MethodTaskDefinition.Properties.postCondition);
		EditingUtils.setEEFtype(editPostCondition, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createPostConditionMultiValuedEditor

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodTaskDefinition.Properties.name, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, IspemViewsRepository.MethodTaskDefinition.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.name, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createVariabilityTypeEMFComboViewer(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodTaskDefinition.Properties.variabilityType, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_VariabilityTypeLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.variabilityType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVariabilityType()));
			}

		});
		variabilityType.setID(IspemViewsRepository.MethodTaskDefinition.Properties.variabilityType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.variabilityType, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVariabilityTypeEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createVariabilityBasedOnElementFlatComboViewer(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodTaskDefinition.Properties.variabilityBasedOnElement, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_VariabilityBasedOnElementLabel);
		variabilityBasedOnElement = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(IspemViewsRepository.MethodTaskDefinition.Properties.variabilityBasedOnElement, IspemViewsRepository.SWT_KIND));
		variabilityBasedOnElement.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		variabilityBasedOnElement.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.variabilityBasedOnElement, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getVariabilityBasedOnElement()));
			}

		});
		GridData variabilityBasedOnElementData = new GridData(GridData.FILL_HORIZONTAL);
		variabilityBasedOnElement.setLayoutData(variabilityBasedOnElementData);
		variabilityBasedOnElement.setID(IspemViewsRepository.MethodTaskDefinition.Properties.variabilityBasedOnElement);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.variabilityBasedOnElement, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVariabilityBasedOnElementFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createMethodContentKindFlatComboViewer(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodTaskDefinition.Properties.methodContentKind, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_MethodContentKindLabel);
		methodContentKind = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(IspemViewsRepository.MethodTaskDefinition.Properties.methodContentKind, IspemViewsRepository.SWT_KIND));
		methodContentKind.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		methodContentKind.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.methodContentKind, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getMethodContentKind()));
			}

		});
		GridData methodContentKindData = new GridData(GridData.FILL_HORIZONTAL);
		methodContentKind.setLayoutData(methodContentKindData);
		methodContentKind.setID(IspemViewsRepository.MethodTaskDefinition.Properties.methodContentKind);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.methodContentKind, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMethodContentKindFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedTaskDefinitionParameterAdvancedTableComposition(Composite parent) {
		this.ownedTaskDefinitionParameter = new ReferencesTable(getDescription(IspemViewsRepository.MethodTaskDefinition.Properties.ownedTaskDefinitionParameter, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_OwnedTaskDefinitionParameterLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.ownedTaskDefinitionParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedTaskDefinitionParameter.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.ownedTaskDefinitionParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedTaskDefinitionParameter.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.ownedTaskDefinitionParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedTaskDefinitionParameter.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.ownedTaskDefinitionParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedTaskDefinitionParameter.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedTaskDefinitionParameterFilters) {
			this.ownedTaskDefinitionParameter.addFilter(filter);
		}
		this.ownedTaskDefinitionParameter.setHelpText(propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.ownedTaskDefinitionParameter, IspemViewsRepository.SWT_KIND));
		this.ownedTaskDefinitionParameter.createControls(parent);
		this.ownedTaskDefinitionParameter.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.ownedTaskDefinitionParameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownedTaskDefinitionParameterData = new GridData(GridData.FILL_HORIZONTAL);
		ownedTaskDefinitionParameterData.horizontalSpan = 3;
		this.ownedTaskDefinitionParameter.setLayoutData(ownedTaskDefinitionParameterData);
		this.ownedTaskDefinitionParameter.setLowerBound(0);
		this.ownedTaskDefinitionParameter.setUpperBound(-1);
		ownedTaskDefinitionParameter.setID(IspemViewsRepository.MethodTaskDefinition.Properties.ownedTaskDefinitionParameter);
		ownedTaskDefinitionParameter.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedTaskDefinitionParameterAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRequiredQualificationAdvancedReferencesTable(Composite parent) {
		String label = getDescription(IspemViewsRepository.MethodTaskDefinition.Properties.requiredQualification, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_RequiredQualificationLabel);		 
		this.requiredQualification = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addRequiredQualification(); }
			public void handleEdit(EObject element) { editRequiredQualification(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveRequiredQualification(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromRequiredQualification(element); }
			public void navigateTo(EObject element) { }
		});
		this.requiredQualification.setHelpText(propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.requiredQualification, IspemViewsRepository.SWT_KIND));
		this.requiredQualification.createControls(parent);
		this.requiredQualification.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.requiredQualification, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData requiredQualificationData = new GridData(GridData.FILL_HORIZONTAL);
		requiredQualificationData.horizontalSpan = 3;
		this.requiredQualification.setLayoutData(requiredQualificationData);
		this.requiredQualification.disableMove();
		requiredQualification.setID(IspemViewsRepository.MethodTaskDefinition.Properties.requiredQualification);
		requiredQualification.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addRequiredQualification() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(requiredQualification.getInput(), requiredQualificationFilters, requiredQualificationBusinessFilters,
		"requiredQualification", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.requiredQualification,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				requiredQualification.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveRequiredQualification(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.requiredQualification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		requiredQualification.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRequiredQualification(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.requiredQualification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		requiredQualification.refresh();
	}

	/**
	 * 
	 */
	protected void editRequiredQualification(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				requiredQualification.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createUsedToolAdvancedReferencesTable(Composite parent) {
		String label = getDescription(IspemViewsRepository.MethodTaskDefinition.Properties.usedTool, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_UsedToolLabel);		 
		this.usedTool = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addUsedTool(); }
			public void handleEdit(EObject element) { editUsedTool(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveUsedTool(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromUsedTool(element); }
			public void navigateTo(EObject element) { }
		});
		this.usedTool.setHelpText(propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.usedTool, IspemViewsRepository.SWT_KIND));
		this.usedTool.createControls(parent);
		this.usedTool.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.usedTool, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData usedToolData = new GridData(GridData.FILL_HORIZONTAL);
		usedToolData.horizontalSpan = 3;
		this.usedTool.setLayoutData(usedToolData);
		this.usedTool.disableMove();
		usedTool.setID(IspemViewsRepository.MethodTaskDefinition.Properties.usedTool);
		usedTool.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addUsedTool() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(usedTool.getInput(), usedToolFilters, usedToolBusinessFilters,
		"usedTool", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.usedTool,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				usedTool.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveUsedTool(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.usedTool, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		usedTool.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromUsedTool(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.usedTool, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		usedTool.refresh();
	}

	/**
	 * 
	 */
	protected void editUsedTool(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				usedTool.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSpecializedByFlatComboViewer(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodTaskDefinition.Properties.specializedBy, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_SpecializedByLabel);
		specializedBy = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(IspemViewsRepository.MethodTaskDefinition.Properties.specializedBy, IspemViewsRepository.SWT_KIND));
		specializedBy.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		specializedBy.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.specializedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSpecializedBy()));
			}

		});
		GridData specializedByData = new GridData(GridData.FILL_HORIZONTAL);
		specializedBy.setLayoutData(specializedByData);
		specializedBy.setID(IspemViewsRepository.MethodTaskDefinition.Properties.specializedBy);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.specializedBy, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSpecializedByFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSpecializesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(IspemViewsRepository.MethodTaskDefinition.Properties.specializes, IspemMessages.MethodTaskDefinitionPropertiesEditionPart_SpecializesLabel);		 
		this.specializes = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addSpecializes(); }
			public void handleEdit(EObject element) { editSpecializes(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSpecializes(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSpecializes(element); }
			public void navigateTo(EObject element) { }
		});
		this.specializes.setHelpText(propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodTaskDefinition.Properties.specializes, IspemViewsRepository.SWT_KIND));
		this.specializes.createControls(parent);
		this.specializes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.specializes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData specializesData = new GridData(GridData.FILL_HORIZONTAL);
		specializesData.horizontalSpan = 3;
		this.specializes.setLayoutData(specializesData);
		this.specializes.disableMove();
		specializes.setID(IspemViewsRepository.MethodTaskDefinition.Properties.specializes);
		specializes.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSpecializes() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(specializes.getInput(), specializesFilters, specializesBusinessFilters,
		"specializes", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.specializes,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				specializes.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSpecializes(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.specializes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		specializes.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSpecializes(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodTaskDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodTaskDefinition.Properties.specializes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		specializes.refresh();
	}

	/**
	 * 
	 */
	protected void editSpecializes(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				specializes.refresh();
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
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#getKind()
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
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#initKind(EObjectFlatComboSettings)
	 */
	public void initKind(EObjectFlatComboSettings settings) {
		kind.setInput(settings);
		if (current != null) {
			kind.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.kind);
		if (eefElementEditorReadOnlyState && kind.isEnabled()) {
			kind.setEnabled(false);
			kind.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !kind.isEnabled()) {
			kind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setKind(EObject newValue)
	 * 
	 */
	public void setKind(EObject newValue) {
		if (newValue != null) {
			kind.setSelection(new StructuredSelection(newValue));
		} else {
			kind.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.kind);
		if (eefElementEditorReadOnlyState && kind.isEnabled()) {
			kind.setEnabled(false);
			kind.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !kind.isEnabled()) {
			kind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setKindButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKindButtonMode(ButtonsModeEnum newValue) {
		kind.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKind(ViewerFilter filter) {
		kind.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addBusinessFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKind(ViewerFilter filter) {
		kind.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#getPresentationName()
	 * 
	 */
	public String getPresentationName() {
		return presentationName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setPresentationName(String newValue)
	 * 
	 */
	public void setPresentationName(String newValue) {
		if (newValue != null) {
			presentationName.setText(newValue);
		} else {
			presentationName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.presentationName);
		if (eefElementEditorReadOnlyState && presentationName.isEnabled()) {
			presentationName.setEnabled(false);
			presentationName.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !presentationName.isEnabled()) {
			presentationName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#getBriefDescription()
	 * 
	 */
	public String getBriefDescription() {
		return briefDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setBriefDescription(String newValue)
	 * 
	 */
	public void setBriefDescription(String newValue) {
		if (newValue != null) {
			briefDescription.setText(newValue);
		} else {
			briefDescription.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.briefDescription);
		if (eefElementEditorReadOnlyState && briefDescription.isEnabled()) {
			briefDescription.setEnabled(false);
			briefDescription.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !briefDescription.isEnabled()) {
			briefDescription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#getMainDescription()
	 * 
	 */
	public String getMainDescription() {
		return mainDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setMainDescription(String newValue)
	 * 
	 */
	public void setMainDescription(String newValue) {
		if (newValue != null) {
			mainDescription.setText(newValue);
		} else {
			mainDescription.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.mainDescription);
		if (eefElementEditorReadOnlyState && mainDescription.isEnabled()) {
			mainDescription.setEnabled(false);
			mainDescription.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mainDescription.isEnabled()) {
			mainDescription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#getPurpose()
	 * 
	 */
	public String getPurpose() {
		return purpose.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setPurpose(String newValue)
	 * 
	 */
	public void setPurpose(String newValue) {
		if (newValue != null) {
			purpose.setText(newValue);
		} else {
			purpose.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.purpose);
		if (eefElementEditorReadOnlyState && purpose.isEnabled()) {
			purpose.setEnabled(false);
			purpose.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !purpose.isEnabled()) {
			purpose.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#initGuidance(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initGuidance(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		guidance.setContentProvider(contentProvider);
		guidance.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.guidance);
		if (eefElementEditorReadOnlyState && guidance.getTable().isEnabled()) {
			guidance.setEnabled(false);
			guidance.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !guidance.getTable().isEnabled()) {
			guidance.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#updateGuidance()
	 * 
	 */
	public void updateGuidance() {
	guidance.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGuidance(ViewerFilter filter) {
		guidanceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addBusinessFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGuidance(ViewerFilter filter) {
		guidanceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#isContainedInGuidanceTable(EObject element)
	 * 
	 */
	public boolean isContainedInGuidanceTable(EObject element) {
		return ((ReferencesTableSettings)guidance.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#initMetric(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMetric(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		metric.setContentProvider(contentProvider);
		metric.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.metric);
		if (eefElementEditorReadOnlyState && metric.getTable().isEnabled()) {
			metric.setEnabled(false);
			metric.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !metric.getTable().isEnabled()) {
			metric.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#updateMetric()
	 * 
	 */
	public void updateMetric() {
	metric.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMetric(ViewerFilter filter) {
		metricFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addBusinessFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMetric(ViewerFilter filter) {
		metricBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#isContainedInMetricTable(EObject element)
	 * 
	 */
	public boolean isContainedInMetricTable(EObject element) {
		return ((ReferencesTableSettings)metric.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#initCategory(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCategory(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		category.setContentProvider(contentProvider);
		category.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.category);
		if (eefElementEditorReadOnlyState && category.getTable().isEnabled()) {
			category.setEnabled(false);
			category.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !category.getTable().isEnabled()) {
			category.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#updateCategory()
	 * 
	 */
	public void updateCategory() {
	category.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCategory(ViewerFilter filter) {
		categoryFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addBusinessFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCategory(ViewerFilter filter) {
		categoryBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#isContainedInCategoryTable(EObject element)
	 * 
	 */
	public boolean isContainedInCategoryTable(EObject element) {
		return ((ReferencesTableSettings)category.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#getCopyright()
	 * 
	 */
	public String getCopyright() {
		return copyright.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setCopyright(String newValue)
	 * 
	 */
	public void setCopyright(String newValue) {
		if (newValue != null) {
			copyright.setText(newValue);
		} else {
			copyright.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.copyright);
		if (eefElementEditorReadOnlyState && copyright.isEnabled()) {
			copyright.setEnabled(false);
			copyright.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !copyright.isEnabled()) {
			copyright.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#getAuthor()
	 * 
	 */
	public EList getAuthor() {
		return authorList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setAuthor(EList newValue)
	 * 
	 */
	public void setAuthor(EList newValue) {
		authorList = newValue;
		if (newValue != null) {
			author.setText(authorList.toString());
		} else {
			author.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.author);
		if (eefElementEditorReadOnlyState && author.isEnabled()) {
			author.setEnabled(false);
			author.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
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
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#getChangeDate()
	 * 
	 */
	public String getChangeDate() {
		return changeDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setChangeDate(String newValue)
	 * 
	 */
	public void setChangeDate(String newValue) {
		if (newValue != null) {
			changeDate.setText(newValue);
		} else {
			changeDate.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.changeDate);
		if (eefElementEditorReadOnlyState && changeDate.isEnabled()) {
			changeDate.setEnabled(false);
			changeDate.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !changeDate.isEnabled()) {
			changeDate.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#getChangeDescription()
	 * 
	 */
	public String getChangeDescription() {
		return changeDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setChangeDescription(String newValue)
	 * 
	 */
	public void setChangeDescription(String newValue) {
		if (newValue != null) {
			changeDescription.setText(newValue);
		} else {
			changeDescription.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.changeDescription);
		if (eefElementEditorReadOnlyState && changeDescription.isEnabled()) {
			changeDescription.setEnabled(false);
			changeDescription.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !changeDescription.isEnabled()) {
			changeDescription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setVersion(String newValue)
	 * 
	 */
	public void setVersion(String newValue) {
		if (newValue != null) {
			version.setText(newValue);
		} else {
			version.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.version);
		if (eefElementEditorReadOnlyState && version.isEnabled()) {
			version.setEnabled(false);
			version.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !version.isEnabled()) {
			version.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#getUri()
	 * 
	 */
	public String getUri() {
		return uri.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setUri(String newValue)
	 * 
	 */
	public void setUri(String newValue) {
		if (newValue != null) {
			uri.setText(newValue);
		} else {
			uri.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.uri);
		if (eefElementEditorReadOnlyState && uri.isEnabled()) {
			uri.setEnabled(false);
			uri.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !uri.isEnabled()) {
			uri.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#getPreCondition()
	 * 
	 */
	public EList getPreCondition() {
		return preConditionList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setPreCondition(EList newValue)
	 * 
	 */
	public void setPreCondition(EList newValue) {
		preConditionList = newValue;
		if (newValue != null) {
			preCondition.setText(preConditionList.toString());
		} else {
			preCondition.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.preCondition);
		if (eefElementEditorReadOnlyState && preCondition.isEnabled()) {
			preCondition.setEnabled(false);
			preCondition.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
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
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#getPostCondition()
	 * 
	 */
	public EList getPostCondition() {
		return postConditionList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setPostCondition(EList newValue)
	 * 
	 */
	public void setPostCondition(EList newValue) {
		postConditionList = newValue;
		if (newValue != null) {
			postCondition.setText(postConditionList.toString());
		} else {
			postCondition.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.postCondition);
		if (eefElementEditorReadOnlyState && postCondition.isEnabled()) {
			postCondition.setEnabled(false);
			postCondition.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
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
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#getVariabilityType()
	 * 
	 */
	public Enumerator getVariabilityType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) variabilityType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#initVariabilityType(Object input, Enumerator current)
	 */
	public void initVariabilityType(Object input, Enumerator current) {
		variabilityType.setInput(input);
		variabilityType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.variabilityType);
		if (eefElementEditorReadOnlyState && variabilityType.isEnabled()) {
			variabilityType.setEnabled(false);
			variabilityType.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityType.isEnabled()) {
			variabilityType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setVariabilityType(Enumerator newValue)
	 * 
	 */
	public void setVariabilityType(Enumerator newValue) {
		variabilityType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.variabilityType);
		if (eefElementEditorReadOnlyState && variabilityType.isEnabled()) {
			variabilityType.setEnabled(false);
			variabilityType.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityType.isEnabled()) {
			variabilityType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#getVariabilityBasedOnElement()
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
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#initVariabilityBasedOnElement(EObjectFlatComboSettings)
	 */
	public void initVariabilityBasedOnElement(EObjectFlatComboSettings settings) {
		variabilityBasedOnElement.setInput(settings);
		if (current != null) {
			variabilityBasedOnElement.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.variabilityBasedOnElement);
		if (eefElementEditorReadOnlyState && variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(false);
			variabilityBasedOnElement.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setVariabilityBasedOnElement(EObject newValue)
	 * 
	 */
	public void setVariabilityBasedOnElement(EObject newValue) {
		if (newValue != null) {
			variabilityBasedOnElement.setSelection(new StructuredSelection(newValue));
		} else {
			variabilityBasedOnElement.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.variabilityBasedOnElement);
		if (eefElementEditorReadOnlyState && variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(false);
			variabilityBasedOnElement.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue)
	 */
	public void setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue) {
		variabilityBasedOnElement.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addFilterVariabilityBasedOnElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToVariabilityBasedOnElement(ViewerFilter filter) {
		variabilityBasedOnElement.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addBusinessFilterVariabilityBasedOnElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToVariabilityBasedOnElement(ViewerFilter filter) {
		variabilityBasedOnElement.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#getMethodContentKind()
	 * 
	 */
	public EObject getMethodContentKind() {
		if (methodContentKind.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) methodContentKind.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#initMethodContentKind(EObjectFlatComboSettings)
	 */
	public void initMethodContentKind(EObjectFlatComboSettings settings) {
		methodContentKind.setInput(settings);
		if (current != null) {
			methodContentKind.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.methodContentKind);
		if (eefElementEditorReadOnlyState && methodContentKind.isEnabled()) {
			methodContentKind.setEnabled(false);
			methodContentKind.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !methodContentKind.isEnabled()) {
			methodContentKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setMethodContentKind(EObject newValue)
	 * 
	 */
	public void setMethodContentKind(EObject newValue) {
		if (newValue != null) {
			methodContentKind.setSelection(new StructuredSelection(newValue));
		} else {
			methodContentKind.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.methodContentKind);
		if (eefElementEditorReadOnlyState && methodContentKind.isEnabled()) {
			methodContentKind.setEnabled(false);
			methodContentKind.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !methodContentKind.isEnabled()) {
			methodContentKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setMethodContentKindButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMethodContentKindButtonMode(ButtonsModeEnum newValue) {
		methodContentKind.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addFilterMethodContentKind(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMethodContentKind(ViewerFilter filter) {
		methodContentKind.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addBusinessFilterMethodContentKind(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMethodContentKind(ViewerFilter filter) {
		methodContentKind.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#initOwnedTaskDefinitionParameter(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedTaskDefinitionParameter(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedTaskDefinitionParameter.setContentProvider(contentProvider);
		ownedTaskDefinitionParameter.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.ownedTaskDefinitionParameter);
		if (eefElementEditorReadOnlyState && ownedTaskDefinitionParameter.isEnabled()) {
			ownedTaskDefinitionParameter.setEnabled(false);
			ownedTaskDefinitionParameter.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedTaskDefinitionParameter.isEnabled()) {
			ownedTaskDefinitionParameter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#updateOwnedTaskDefinitionParameter()
	 * 
	 */
	public void updateOwnedTaskDefinitionParameter() {
	ownedTaskDefinitionParameter.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addFilterOwnedTaskDefinitionParameter(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwnedTaskDefinitionParameter(ViewerFilter filter) {
		ownedTaskDefinitionParameterFilters.add(filter);
		if (this.ownedTaskDefinitionParameter != null) {
			this.ownedTaskDefinitionParameter.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addBusinessFilterOwnedTaskDefinitionParameter(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnedTaskDefinitionParameter(ViewerFilter filter) {
		ownedTaskDefinitionParameterBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#isContainedInOwnedTaskDefinitionParameterTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnedTaskDefinitionParameterTable(EObject element) {
		return ((ReferencesTableSettings)ownedTaskDefinitionParameter.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#initRequiredQualification(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRequiredQualification(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		requiredQualification.setContentProvider(contentProvider);
		requiredQualification.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.requiredQualification);
		if (eefElementEditorReadOnlyState && requiredQualification.getTable().isEnabled()) {
			requiredQualification.setEnabled(false);
			requiredQualification.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !requiredQualification.getTable().isEnabled()) {
			requiredQualification.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#updateRequiredQualification()
	 * 
	 */
	public void updateRequiredQualification() {
	requiredQualification.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addFilterRequiredQualification(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRequiredQualification(ViewerFilter filter) {
		requiredQualificationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addBusinessFilterRequiredQualification(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRequiredQualification(ViewerFilter filter) {
		requiredQualificationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#isContainedInRequiredQualificationTable(EObject element)
	 * 
	 */
	public boolean isContainedInRequiredQualificationTable(EObject element) {
		return ((ReferencesTableSettings)requiredQualification.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#initUsedTool(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initUsedTool(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		usedTool.setContentProvider(contentProvider);
		usedTool.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.usedTool);
		if (eefElementEditorReadOnlyState && usedTool.getTable().isEnabled()) {
			usedTool.setEnabled(false);
			usedTool.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !usedTool.getTable().isEnabled()) {
			usedTool.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#updateUsedTool()
	 * 
	 */
	public void updateUsedTool() {
	usedTool.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addFilterUsedTool(ViewerFilter filter)
	 * 
	 */
	public void addFilterToUsedTool(ViewerFilter filter) {
		usedToolFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addBusinessFilterUsedTool(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToUsedTool(ViewerFilter filter) {
		usedToolBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#isContainedInUsedToolTable(EObject element)
	 * 
	 */
	public boolean isContainedInUsedToolTable(EObject element) {
		return ((ReferencesTableSettings)usedTool.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#getSpecializedBy()
	 * 
	 */
	public EObject getSpecializedBy() {
		if (specializedBy.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) specializedBy.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#initSpecializedBy(EObjectFlatComboSettings)
	 */
	public void initSpecializedBy(EObjectFlatComboSettings settings) {
		specializedBy.setInput(settings);
		if (current != null) {
			specializedBy.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.specializedBy);
		if (eefElementEditorReadOnlyState && specializedBy.isEnabled()) {
			specializedBy.setEnabled(false);
			specializedBy.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !specializedBy.isEnabled()) {
			specializedBy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setSpecializedBy(EObject newValue)
	 * 
	 */
	public void setSpecializedBy(EObject newValue) {
		if (newValue != null) {
			specializedBy.setSelection(new StructuredSelection(newValue));
		} else {
			specializedBy.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.specializedBy);
		if (eefElementEditorReadOnlyState && specializedBy.isEnabled()) {
			specializedBy.setEnabled(false);
			specializedBy.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !specializedBy.isEnabled()) {
			specializedBy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#setSpecializedByButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSpecializedByButtonMode(ButtonsModeEnum newValue) {
		specializedBy.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addFilterSpecializedBy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSpecializedBy(ViewerFilter filter) {
		specializedBy.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addBusinessFilterSpecializedBy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSpecializedBy(ViewerFilter filter) {
		specializedBy.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#initSpecializes(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSpecializes(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		specializes.setContentProvider(contentProvider);
		specializes.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodTaskDefinition.Properties.specializes);
		if (eefElementEditorReadOnlyState && specializes.getTable().isEnabled()) {
			specializes.setEnabled(false);
			specializes.setToolTipText(IspemMessages.MethodTaskDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !specializes.getTable().isEnabled()) {
			specializes.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#updateSpecializes()
	 * 
	 */
	public void updateSpecializes() {
	specializes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addFilterSpecializes(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSpecializes(ViewerFilter filter) {
		specializesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#addBusinessFilterSpecializes(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSpecializes(ViewerFilter filter) {
		specializesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodTaskDefinitionPropertiesEditionPart#isContainedInSpecializesTable(EObject element)
	 * 
	 */
	public boolean isContainedInSpecializesTable(EObject element) {
		return ((ReferencesTableSettings)specializes.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return IspemMessages.MethodTaskDefinition_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
