/**
 * Generated with Acceleo
 */
package org.topcased.spem.parts.impl;

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

import org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart;
import org.topcased.spem.parts.SpemViewsRepository;

import org.topcased.spem.providers.SpemMessages;

// End of user code

/**
 * 
 * 
 */
public class Default_TaskDefinitionPerformerPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, Default_TaskDefinitionPerformerPropertiesEditionPart {

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
	protected EMFComboViewer variabilityType;
	protected EObjectFlatComboViewer variabilityBasedOnElement;
	protected EObjectFlatComboViewer methodContentKind;
	protected EObjectFlatComboViewer linkedTaskDefinition;
	protected ReferencesTable linkedRoleDefinition;
	protected List<ViewerFilter> linkedRoleDefinitionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> linkedRoleDefinitionFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public Default_TaskDefinitionPerformerPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence default_TaskDefinitionPerformerStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = default_TaskDefinitionPerformerStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.class);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.kind);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.presentationName);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.briefDescription);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.mainDescription);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.purpose);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.guidance);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.metric);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.category);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.copyright);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.author);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.changeDate);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.changeDescription);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.version);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.name);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.variabilityType);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.variabilityBasedOnElement);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.methodContentKind);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.linkedTaskDefinition);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.linkedRoleDefinition);
		
		
		composer = new PartComposer(default_TaskDefinitionPerformerStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.kind) {
					return createKindFlatComboViewer(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.presentationName) {
					return createPresentationNameText(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.briefDescription) {
					return createBriefDescriptionText(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.mainDescription) {
					return createMainDescriptionText(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.purpose) {
					return createPurposeText(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.guidance) {
					return createGuidanceAdvancedReferencesTable(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.metric) {
					return createMetricAdvancedReferencesTable(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.category) {
					return createCategoryAdvancedReferencesTable(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.copyright) {
					return createCopyrightText(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.author) {
					return createAuthorMultiValuedEditor(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.changeDate) {
					return createChangeDateText(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.changeDescription) {
					return createChangeDescriptionText(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.version) {
					return createVersionText(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.name) {
					return createNameText(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.variabilityType) {
					return createVariabilityTypeEMFComboViewer(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.variabilityBasedOnElement) {
					return createVariabilityBasedOnElementFlatComboViewer(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.methodContentKind) {
					return createMethodContentKindFlatComboViewer(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.linkedTaskDefinition) {
					return createLinkedTaskDefinitionFlatComboViewer(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.linkedRoleDefinition) {
					return createLinkedRoleDefinitionAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.kind, SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_KindLabel);
		kind = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.kind, SpemViewsRepository.SWT_KIND));
		kind.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		kind.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.kind, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getKind()));
			}

		});
		GridData kindData = new GridData(GridData.FILL_HORIZONTAL);
		kind.setLayoutData(kindData);
		kind.setID(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.kind);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.kind, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createKindFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createPresentationNameText(Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.presentationName, SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_PresentationNameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
				}
			}

		});
		EditingUtils.setID(presentationName, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.presentationName);
		EditingUtils.setEEFtype(presentationName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.presentationName, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPresentationNameText

		// End of user code
		return parent;
	}

	
	protected Composite createBriefDescriptionText(Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.briefDescription, SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_BriefDescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
				}
			}

		});
		EditingUtils.setID(briefDescription, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.briefDescription);
		EditingUtils.setEEFtype(briefDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.briefDescription, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createBriefDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createMainDescriptionText(Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.mainDescription, SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_MainDescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
				}
			}

		});
		EditingUtils.setID(mainDescription, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.mainDescription);
		EditingUtils.setEEFtype(mainDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.mainDescription, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMainDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createPurposeText(Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.purpose, SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_PurposeLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
				}
			}

		});
		EditingUtils.setID(purpose, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.purpose);
		EditingUtils.setEEFtype(purpose, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.purpose, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPurposeText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createGuidanceAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.guidance, SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_GuidanceLabel);		 
		this.guidance = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addGuidance(); }
			public void handleEdit(EObject element) { editGuidance(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGuidance(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGuidance(element); }
			public void navigateTo(EObject element) { }
		});
		this.guidance.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.guidance, SpemViewsRepository.SWT_KIND));
		this.guidance.createControls(parent);
		this.guidance.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.guidance, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData guidanceData = new GridData(GridData.FILL_HORIZONTAL);
		guidanceData.horizontalSpan = 3;
		this.guidance.setLayoutData(guidanceData);
		this.guidance.disableMove();
		guidance.setID(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.guidance);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.guidance,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		guidance.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGuidance(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		String label = getDescription(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.metric, SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_MetricLabel);		 
		this.metric = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addMetric(); }
			public void handleEdit(EObject element) { editMetric(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMetric(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMetric(element); }
			public void navigateTo(EObject element) { }
		});
		this.metric.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.metric, SpemViewsRepository.SWT_KIND));
		this.metric.createControls(parent);
		this.metric.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.metric, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData metricData = new GridData(GridData.FILL_HORIZONTAL);
		metricData.horizontalSpan = 3;
		this.metric.setLayoutData(metricData);
		this.metric.disableMove();
		metric.setID(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.metric);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.metric,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		metric.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMetric(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		String label = getDescription(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.category, SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_CategoryLabel);		 
		this.category = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addCategory(); }
			public void handleEdit(EObject element) { editCategory(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCategory(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCategory(element); }
			public void navigateTo(EObject element) { }
		});
		this.category.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.category, SpemViewsRepository.SWT_KIND));
		this.category.createControls(parent);
		this.category.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.category, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData categoryData = new GridData(GridData.FILL_HORIZONTAL);
		categoryData.horizontalSpan = 3;
		this.category.setLayoutData(categoryData);
		this.category.disableMove();
		category.setID(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.category);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.category,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		category.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCategory(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		createDescription(parent, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.copyright, SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_CopyrightLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
				}
			}

		});
		EditingUtils.setID(copyright, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.copyright);
		EditingUtils.setEEFtype(copyright, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.copyright, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCopyrightText

		// End of user code
		return parent;
	}

	protected Composite createAuthorMultiValuedEditor(Composite parent) {
		author = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData authorData = new GridData(GridData.FILL_HORIZONTAL);
		authorData.horizontalSpan = 2;
		author.setLayoutData(authorData);
		EditingUtils.setID(author, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.author);
		EditingUtils.setEEFtype(author, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editAuthor = new Button(parent, SWT.NONE);
		editAuthor.setText(getDescription(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.author, SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_AuthorLabel));
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
						author.getShell(), "Default_TaskDefinitionPerformer", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						authorList, SpemPackage.eINSTANCE.getDescribableElement_Author().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					authorList = dialog.getResult();
					if (authorList == null) {
						authorList = new BasicEList();
					}
					author.setText(authorList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.author, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(authorList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editAuthor, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.author);
		EditingUtils.setEEFtype(editAuthor, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createAuthorMultiValuedEditor

		// End of user code
		return parent;
	}

	
	protected Composite createChangeDateText(Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.changeDate, SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_ChangeDateLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
				}
			}

		});
		EditingUtils.setID(changeDate, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.changeDate);
		EditingUtils.setEEFtype(changeDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.changeDate, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createChangeDateText

		// End of user code
		return parent;
	}

	
	protected Composite createChangeDescriptionText(Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.changeDescription, SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_ChangeDescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
				}
			}

		});
		EditingUtils.setID(changeDescription, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.changeDescription);
		EditingUtils.setEEFtype(changeDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.changeDescription, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createChangeDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createVersionText(Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.version, SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_VersionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}

		});
		EditingUtils.setID(version, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.version, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVersionText

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.name, SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.name, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createVariabilityTypeEMFComboViewer(Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.variabilityType, SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_VariabilityTypeLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.variabilityType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVariabilityType()));
			}

		});
		variabilityType.setID(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.variabilityType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.variabilityType, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVariabilityTypeEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createVariabilityBasedOnElementFlatComboViewer(Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.variabilityBasedOnElement, SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_VariabilityBasedOnElementLabel);
		variabilityBasedOnElement = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.variabilityBasedOnElement, SpemViewsRepository.SWT_KIND));
		variabilityBasedOnElement.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		variabilityBasedOnElement.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.variabilityBasedOnElement, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getVariabilityBasedOnElement()));
			}

		});
		GridData variabilityBasedOnElementData = new GridData(GridData.FILL_HORIZONTAL);
		variabilityBasedOnElement.setLayoutData(variabilityBasedOnElementData);
		variabilityBasedOnElement.setID(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.variabilityBasedOnElement);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.variabilityBasedOnElement, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVariabilityBasedOnElementFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createMethodContentKindFlatComboViewer(Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.methodContentKind, SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_MethodContentKindLabel);
		methodContentKind = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.methodContentKind, SpemViewsRepository.SWT_KIND));
		methodContentKind.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		methodContentKind.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.methodContentKind, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getMethodContentKind()));
			}

		});
		GridData methodContentKindData = new GridData(GridData.FILL_HORIZONTAL);
		methodContentKind.setLayoutData(methodContentKindData);
		methodContentKind.setID(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.methodContentKind);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.methodContentKind, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMethodContentKindFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createLinkedTaskDefinitionFlatComboViewer(Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.linkedTaskDefinition, SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_LinkedTaskDefinitionLabel);
		linkedTaskDefinition = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.linkedTaskDefinition, SpemViewsRepository.SWT_KIND));
		linkedTaskDefinition.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		linkedTaskDefinition.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.linkedTaskDefinition, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getLinkedTaskDefinition()));
			}

		});
		GridData linkedTaskDefinitionData = new GridData(GridData.FILL_HORIZONTAL);
		linkedTaskDefinition.setLayoutData(linkedTaskDefinitionData);
		linkedTaskDefinition.setID(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.linkedTaskDefinition);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.linkedTaskDefinition, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createLinkedTaskDefinitionFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createLinkedRoleDefinitionAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.linkedRoleDefinition, SpemMessages.Default_TaskDefinitionPerformerPropertiesEditionPart_LinkedRoleDefinitionLabel);		 
		this.linkedRoleDefinition = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addLinkedRoleDefinition(); }
			public void handleEdit(EObject element) { editLinkedRoleDefinition(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveLinkedRoleDefinition(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromLinkedRoleDefinition(element); }
			public void navigateTo(EObject element) { }
		});
		this.linkedRoleDefinition.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.linkedRoleDefinition, SpemViewsRepository.SWT_KIND));
		this.linkedRoleDefinition.createControls(parent);
		this.linkedRoleDefinition.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.linkedRoleDefinition, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData linkedRoleDefinitionData = new GridData(GridData.FILL_HORIZONTAL);
		linkedRoleDefinitionData.horizontalSpan = 3;
		this.linkedRoleDefinition.setLayoutData(linkedRoleDefinitionData);
		this.linkedRoleDefinition.disableMove();
		linkedRoleDefinition.setID(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.linkedRoleDefinition);
		linkedRoleDefinition.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addLinkedRoleDefinition() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(linkedRoleDefinition.getInput(), linkedRoleDefinitionFilters, linkedRoleDefinitionBusinessFilters,
		"linkedRoleDefinition", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.linkedRoleDefinition,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				linkedRoleDefinition.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveLinkedRoleDefinition(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.linkedRoleDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		linkedRoleDefinition.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromLinkedRoleDefinition(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionPerformerPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.linkedRoleDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		linkedRoleDefinition.refresh();
	}

	/**
	 * 
	 */
	protected void editLinkedRoleDefinition(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				linkedRoleDefinition.refresh();
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
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#getKind()
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
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#initKind(EObjectFlatComboSettings)
	 */
	public void initKind(EObjectFlatComboSettings settings) {
		kind.setInput(settings);
		if (current != null) {
			kind.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.kind);
		if (eefElementEditorReadOnlyState && kind.isEnabled()) {
			kind.setEnabled(false);
			kind.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !kind.isEnabled()) {
			kind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#setKind(EObject newValue)
	 * 
	 */
	public void setKind(EObject newValue) {
		if (newValue != null) {
			kind.setSelection(new StructuredSelection(newValue));
		} else {
			kind.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.kind);
		if (eefElementEditorReadOnlyState && kind.isEnabled()) {
			kind.setEnabled(false);
			kind.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !kind.isEnabled()) {
			kind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#setKindButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKindButtonMode(ButtonsModeEnum newValue) {
		kind.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#addFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKind(ViewerFilter filter) {
		kind.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#addBusinessFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKind(ViewerFilter filter) {
		kind.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#getPresentationName()
	 * 
	 */
	public String getPresentationName() {
		return presentationName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#setPresentationName(String newValue)
	 * 
	 */
	public void setPresentationName(String newValue) {
		if (newValue != null) {
			presentationName.setText(newValue);
		} else {
			presentationName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.presentationName);
		if (eefElementEditorReadOnlyState && presentationName.isEnabled()) {
			presentationName.setEnabled(false);
			presentationName.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !presentationName.isEnabled()) {
			presentationName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#getBriefDescription()
	 * 
	 */
	public String getBriefDescription() {
		return briefDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#setBriefDescription(String newValue)
	 * 
	 */
	public void setBriefDescription(String newValue) {
		if (newValue != null) {
			briefDescription.setText(newValue);
		} else {
			briefDescription.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.briefDescription);
		if (eefElementEditorReadOnlyState && briefDescription.isEnabled()) {
			briefDescription.setEnabled(false);
			briefDescription.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !briefDescription.isEnabled()) {
			briefDescription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#getMainDescription()
	 * 
	 */
	public String getMainDescription() {
		return mainDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#setMainDescription(String newValue)
	 * 
	 */
	public void setMainDescription(String newValue) {
		if (newValue != null) {
			mainDescription.setText(newValue);
		} else {
			mainDescription.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.mainDescription);
		if (eefElementEditorReadOnlyState && mainDescription.isEnabled()) {
			mainDescription.setEnabled(false);
			mainDescription.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mainDescription.isEnabled()) {
			mainDescription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#getPurpose()
	 * 
	 */
	public String getPurpose() {
		return purpose.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#setPurpose(String newValue)
	 * 
	 */
	public void setPurpose(String newValue) {
		if (newValue != null) {
			purpose.setText(newValue);
		} else {
			purpose.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.purpose);
		if (eefElementEditorReadOnlyState && purpose.isEnabled()) {
			purpose.setEnabled(false);
			purpose.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !purpose.isEnabled()) {
			purpose.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#initGuidance(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initGuidance(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		guidance.setContentProvider(contentProvider);
		guidance.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.guidance);
		if (eefElementEditorReadOnlyState && guidance.getTable().isEnabled()) {
			guidance.setEnabled(false);
			guidance.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !guidance.getTable().isEnabled()) {
			guidance.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#updateGuidance()
	 * 
	 */
	public void updateGuidance() {
	guidance.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#addFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGuidance(ViewerFilter filter) {
		guidanceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#addBusinessFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGuidance(ViewerFilter filter) {
		guidanceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#isContainedInGuidanceTable(EObject element)
	 * 
	 */
	public boolean isContainedInGuidanceTable(EObject element) {
		return ((ReferencesTableSettings)guidance.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#initMetric(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMetric(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		metric.setContentProvider(contentProvider);
		metric.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.metric);
		if (eefElementEditorReadOnlyState && metric.getTable().isEnabled()) {
			metric.setEnabled(false);
			metric.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !metric.getTable().isEnabled()) {
			metric.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#updateMetric()
	 * 
	 */
	public void updateMetric() {
	metric.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#addFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMetric(ViewerFilter filter) {
		metricFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#addBusinessFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMetric(ViewerFilter filter) {
		metricBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#isContainedInMetricTable(EObject element)
	 * 
	 */
	public boolean isContainedInMetricTable(EObject element) {
		return ((ReferencesTableSettings)metric.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#initCategory(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCategory(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		category.setContentProvider(contentProvider);
		category.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.category);
		if (eefElementEditorReadOnlyState && category.getTable().isEnabled()) {
			category.setEnabled(false);
			category.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !category.getTable().isEnabled()) {
			category.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#updateCategory()
	 * 
	 */
	public void updateCategory() {
	category.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#addFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCategory(ViewerFilter filter) {
		categoryFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#addBusinessFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCategory(ViewerFilter filter) {
		categoryBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#isContainedInCategoryTable(EObject element)
	 * 
	 */
	public boolean isContainedInCategoryTable(EObject element) {
		return ((ReferencesTableSettings)category.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#getCopyright()
	 * 
	 */
	public String getCopyright() {
		return copyright.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#setCopyright(String newValue)
	 * 
	 */
	public void setCopyright(String newValue) {
		if (newValue != null) {
			copyright.setText(newValue);
		} else {
			copyright.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.copyright);
		if (eefElementEditorReadOnlyState && copyright.isEnabled()) {
			copyright.setEnabled(false);
			copyright.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !copyright.isEnabled()) {
			copyright.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#getAuthor()
	 * 
	 */
	public EList getAuthor() {
		return authorList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#setAuthor(EList newValue)
	 * 
	 */
	public void setAuthor(EList newValue) {
		authorList = newValue;
		if (newValue != null) {
			author.setText(authorList.toString());
		} else {
			author.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.author);
		if (eefElementEditorReadOnlyState && author.isEnabled()) {
			author.setEnabled(false);
			author.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
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
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#getChangeDate()
	 * 
	 */
	public String getChangeDate() {
		return changeDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#setChangeDate(String newValue)
	 * 
	 */
	public void setChangeDate(String newValue) {
		if (newValue != null) {
			changeDate.setText(newValue);
		} else {
			changeDate.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.changeDate);
		if (eefElementEditorReadOnlyState && changeDate.isEnabled()) {
			changeDate.setEnabled(false);
			changeDate.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !changeDate.isEnabled()) {
			changeDate.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#getChangeDescription()
	 * 
	 */
	public String getChangeDescription() {
		return changeDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#setChangeDescription(String newValue)
	 * 
	 */
	public void setChangeDescription(String newValue) {
		if (newValue != null) {
			changeDescription.setText(newValue);
		} else {
			changeDescription.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.changeDescription);
		if (eefElementEditorReadOnlyState && changeDescription.isEnabled()) {
			changeDescription.setEnabled(false);
			changeDescription.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !changeDescription.isEnabled()) {
			changeDescription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#setVersion(String newValue)
	 * 
	 */
	public void setVersion(String newValue) {
		if (newValue != null) {
			version.setText(newValue);
		} else {
			version.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.version);
		if (eefElementEditorReadOnlyState && version.isEnabled()) {
			version.setEnabled(false);
			version.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !version.isEnabled()) {
			version.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#getVariabilityType()
	 * 
	 */
	public Enumerator getVariabilityType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) variabilityType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#initVariabilityType(Object input, Enumerator current)
	 */
	public void initVariabilityType(Object input, Enumerator current) {
		variabilityType.setInput(input);
		variabilityType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.variabilityType);
		if (eefElementEditorReadOnlyState && variabilityType.isEnabled()) {
			variabilityType.setEnabled(false);
			variabilityType.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityType.isEnabled()) {
			variabilityType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#setVariabilityType(Enumerator newValue)
	 * 
	 */
	public void setVariabilityType(Enumerator newValue) {
		variabilityType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.variabilityType);
		if (eefElementEditorReadOnlyState && variabilityType.isEnabled()) {
			variabilityType.setEnabled(false);
			variabilityType.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityType.isEnabled()) {
			variabilityType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#getVariabilityBasedOnElement()
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
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#initVariabilityBasedOnElement(EObjectFlatComboSettings)
	 */
	public void initVariabilityBasedOnElement(EObjectFlatComboSettings settings) {
		variabilityBasedOnElement.setInput(settings);
		if (current != null) {
			variabilityBasedOnElement.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.variabilityBasedOnElement);
		if (eefElementEditorReadOnlyState && variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(false);
			variabilityBasedOnElement.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#setVariabilityBasedOnElement(EObject newValue)
	 * 
	 */
	public void setVariabilityBasedOnElement(EObject newValue) {
		if (newValue != null) {
			variabilityBasedOnElement.setSelection(new StructuredSelection(newValue));
		} else {
			variabilityBasedOnElement.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.variabilityBasedOnElement);
		if (eefElementEditorReadOnlyState && variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(false);
			variabilityBasedOnElement.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue)
	 */
	public void setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue) {
		variabilityBasedOnElement.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#addFilterVariabilityBasedOnElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToVariabilityBasedOnElement(ViewerFilter filter) {
		variabilityBasedOnElement.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#addBusinessFilterVariabilityBasedOnElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToVariabilityBasedOnElement(ViewerFilter filter) {
		variabilityBasedOnElement.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#getMethodContentKind()
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
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#initMethodContentKind(EObjectFlatComboSettings)
	 */
	public void initMethodContentKind(EObjectFlatComboSettings settings) {
		methodContentKind.setInput(settings);
		if (current != null) {
			methodContentKind.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.methodContentKind);
		if (eefElementEditorReadOnlyState && methodContentKind.isEnabled()) {
			methodContentKind.setEnabled(false);
			methodContentKind.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !methodContentKind.isEnabled()) {
			methodContentKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#setMethodContentKind(EObject newValue)
	 * 
	 */
	public void setMethodContentKind(EObject newValue) {
		if (newValue != null) {
			methodContentKind.setSelection(new StructuredSelection(newValue));
		} else {
			methodContentKind.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.methodContentKind);
		if (eefElementEditorReadOnlyState && methodContentKind.isEnabled()) {
			methodContentKind.setEnabled(false);
			methodContentKind.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !methodContentKind.isEnabled()) {
			methodContentKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#setMethodContentKindButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMethodContentKindButtonMode(ButtonsModeEnum newValue) {
		methodContentKind.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#addFilterMethodContentKind(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMethodContentKind(ViewerFilter filter) {
		methodContentKind.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#addBusinessFilterMethodContentKind(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMethodContentKind(ViewerFilter filter) {
		methodContentKind.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#getLinkedTaskDefinition()
	 * 
	 */
	public EObject getLinkedTaskDefinition() {
		if (linkedTaskDefinition.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) linkedTaskDefinition.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#initLinkedTaskDefinition(EObjectFlatComboSettings)
	 */
	public void initLinkedTaskDefinition(EObjectFlatComboSettings settings) {
		linkedTaskDefinition.setInput(settings);
		if (current != null) {
			linkedTaskDefinition.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.linkedTaskDefinition);
		if (eefElementEditorReadOnlyState && linkedTaskDefinition.isEnabled()) {
			linkedTaskDefinition.setEnabled(false);
			linkedTaskDefinition.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !linkedTaskDefinition.isEnabled()) {
			linkedTaskDefinition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#setLinkedTaskDefinition(EObject newValue)
	 * 
	 */
	public void setLinkedTaskDefinition(EObject newValue) {
		if (newValue != null) {
			linkedTaskDefinition.setSelection(new StructuredSelection(newValue));
		} else {
			linkedTaskDefinition.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.linkedTaskDefinition);
		if (eefElementEditorReadOnlyState && linkedTaskDefinition.isEnabled()) {
			linkedTaskDefinition.setEnabled(false);
			linkedTaskDefinition.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !linkedTaskDefinition.isEnabled()) {
			linkedTaskDefinition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#setLinkedTaskDefinitionButtonMode(ButtonsModeEnum newValue)
	 */
	public void setLinkedTaskDefinitionButtonMode(ButtonsModeEnum newValue) {
		linkedTaskDefinition.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#addFilterLinkedTaskDefinition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLinkedTaskDefinition(ViewerFilter filter) {
		linkedTaskDefinition.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#addBusinessFilterLinkedTaskDefinition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLinkedTaskDefinition(ViewerFilter filter) {
		linkedTaskDefinition.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#initLinkedRoleDefinition(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initLinkedRoleDefinition(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		linkedRoleDefinition.setContentProvider(contentProvider);
		linkedRoleDefinition.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionPerformer.Properties.linkedRoleDefinition);
		if (eefElementEditorReadOnlyState && linkedRoleDefinition.getTable().isEnabled()) {
			linkedRoleDefinition.setEnabled(false);
			linkedRoleDefinition.setToolTipText(SpemMessages.Default_TaskDefinitionPerformer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !linkedRoleDefinition.getTable().isEnabled()) {
			linkedRoleDefinition.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#updateLinkedRoleDefinition()
	 * 
	 */
	public void updateLinkedRoleDefinition() {
	linkedRoleDefinition.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#addFilterLinkedRoleDefinition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLinkedRoleDefinition(ViewerFilter filter) {
		linkedRoleDefinitionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#addBusinessFilterLinkedRoleDefinition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLinkedRoleDefinition(ViewerFilter filter) {
		linkedRoleDefinitionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionPerformerPropertiesEditionPart#isContainedInLinkedRoleDefinitionTable(EObject element)
	 * 
	 */
	public boolean isContainedInLinkedRoleDefinitionTable(EObject element) {
		return ((ReferencesTableSettings)linkedRoleDefinition.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SpemMessages.Default_TaskDefinitionPerformer_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
