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
import org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart;

import org.topcased.ispem.providers.IspemMessages;

import org.topcased.spem.SpemPackage;

// End of user code

/**
 * 
 * 
 */
public class MethodArtifactDefinitionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, MethodArtifactDefinitionPropertiesEditionPart {

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
	protected Text name;
	protected EMFComboViewer variabilityType;
	protected EObjectFlatComboViewer variabilityBasedOnElement;
	protected EObjectFlatComboViewer methodContentKind;
	protected EObjectFlatComboViewer rootElement;
	protected ReferencesTable usedReferences;
	protected List<ViewerFilter> usedReferencesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> usedReferencesFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer metamodel;
	protected EObjectFlatComboViewer specializedBy;
	protected ReferencesTable specializes;
	protected List<ViewerFilter> specializesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> specializesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MethodArtifactDefinitionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence methodArtifactDefinitionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = methodArtifactDefinitionStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.class);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.kind);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.presentationName);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.briefDescription);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.mainDescription);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.purpose);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.guidance);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.metric);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.category);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.copyright);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.author);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.changeDate);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.changeDescription);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.version);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.uri);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.name);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.variabilityType);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.variabilityBasedOnElement);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.methodContentKind);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.rootElement);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.usedReferences);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.metamodel);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.specializedBy);
		propertiesStep.addStep(IspemViewsRepository.MethodArtifactDefinition.Properties.specializes);
		
		
		composer = new PartComposer(methodArtifactDefinitionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.kind) {
					return createKindFlatComboViewer(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.presentationName) {
					return createPresentationNameText(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.briefDescription) {
					return createBriefDescriptionText(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.mainDescription) {
					return createMainDescriptionText(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.purpose) {
					return createPurposeText(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.guidance) {
					return createGuidanceAdvancedReferencesTable(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.metric) {
					return createMetricAdvancedReferencesTable(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.category) {
					return createCategoryAdvancedReferencesTable(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.copyright) {
					return createCopyrightText(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.author) {
					return createAuthorMultiValuedEditor(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.changeDate) {
					return createChangeDateText(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.changeDescription) {
					return createChangeDescriptionText(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.version) {
					return createVersionText(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.uri) {
					return createUriText(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.name) {
					return createNameText(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.variabilityType) {
					return createVariabilityTypeEMFComboViewer(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.variabilityBasedOnElement) {
					return createVariabilityBasedOnElementFlatComboViewer(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.methodContentKind) {
					return createMethodContentKindFlatComboViewer(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.rootElement) {
					return createRootElementFlatComboViewer(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.usedReferences) {
					return createUsedReferencesAdvancedReferencesTable(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.metamodel) {
					return createMetamodelFlatComboViewer(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.specializedBy) {
					return createSpecializedByFlatComboViewer(parent);
				}
				if (key == IspemViewsRepository.MethodArtifactDefinition.Properties.specializes) {
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
		propertiesGroup.setText(IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, IspemViewsRepository.MethodArtifactDefinition.Properties.kind, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_KindLabel);
		kind = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(IspemViewsRepository.MethodArtifactDefinition.Properties.kind, IspemViewsRepository.SWT_KIND));
		kind.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		kind.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.kind, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getKind()));
			}

		});
		GridData kindData = new GridData(GridData.FILL_HORIZONTAL);
		kind.setLayoutData(kindData);
		kind.setID(IspemViewsRepository.MethodArtifactDefinition.Properties.kind);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.kind, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createKindFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createPresentationNameText(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodArtifactDefinition.Properties.presentationName, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_PresentationNameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
				}
			}

		});
		EditingUtils.setID(presentationName, IspemViewsRepository.MethodArtifactDefinition.Properties.presentationName);
		EditingUtils.setEEFtype(presentationName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.presentationName, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPresentationNameText

		// End of user code
		return parent;
	}

	
	protected Composite createBriefDescriptionText(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodArtifactDefinition.Properties.briefDescription, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_BriefDescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
				}
			}

		});
		EditingUtils.setID(briefDescription, IspemViewsRepository.MethodArtifactDefinition.Properties.briefDescription);
		EditingUtils.setEEFtype(briefDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.briefDescription, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createBriefDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createMainDescriptionText(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodArtifactDefinition.Properties.mainDescription, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_MainDescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
				}
			}

		});
		EditingUtils.setID(mainDescription, IspemViewsRepository.MethodArtifactDefinition.Properties.mainDescription);
		EditingUtils.setEEFtype(mainDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.mainDescription, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMainDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createPurposeText(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodArtifactDefinition.Properties.purpose, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_PurposeLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
				}
			}

		});
		EditingUtils.setID(purpose, IspemViewsRepository.MethodArtifactDefinition.Properties.purpose);
		EditingUtils.setEEFtype(purpose, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.purpose, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPurposeText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createGuidanceAdvancedReferencesTable(Composite parent) {
		String label = getDescription(IspemViewsRepository.MethodArtifactDefinition.Properties.guidance, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_GuidanceLabel);		 
		this.guidance = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addGuidance(); }
			public void handleEdit(EObject element) { editGuidance(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGuidance(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGuidance(element); }
			public void navigateTo(EObject element) { }
		});
		this.guidance.setHelpText(propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.guidance, IspemViewsRepository.SWT_KIND));
		this.guidance.createControls(parent);
		this.guidance.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.guidance, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData guidanceData = new GridData(GridData.FILL_HORIZONTAL);
		guidanceData.horizontalSpan = 3;
		this.guidance.setLayoutData(guidanceData);
		this.guidance.disableMove();
		guidance.setID(IspemViewsRepository.MethodArtifactDefinition.Properties.guidance);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.guidance,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		guidance.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGuidance(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		String label = getDescription(IspemViewsRepository.MethodArtifactDefinition.Properties.metric, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_MetricLabel);		 
		this.metric = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addMetric(); }
			public void handleEdit(EObject element) { editMetric(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMetric(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMetric(element); }
			public void navigateTo(EObject element) { }
		});
		this.metric.setHelpText(propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.metric, IspemViewsRepository.SWT_KIND));
		this.metric.createControls(parent);
		this.metric.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.metric, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData metricData = new GridData(GridData.FILL_HORIZONTAL);
		metricData.horizontalSpan = 3;
		this.metric.setLayoutData(metricData);
		this.metric.disableMove();
		metric.setID(IspemViewsRepository.MethodArtifactDefinition.Properties.metric);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.metric,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		metric.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMetric(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		String label = getDescription(IspemViewsRepository.MethodArtifactDefinition.Properties.category, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_CategoryLabel);		 
		this.category = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addCategory(); }
			public void handleEdit(EObject element) { editCategory(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCategory(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCategory(element); }
			public void navigateTo(EObject element) { }
		});
		this.category.setHelpText(propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.category, IspemViewsRepository.SWT_KIND));
		this.category.createControls(parent);
		this.category.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.category, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData categoryData = new GridData(GridData.FILL_HORIZONTAL);
		categoryData.horizontalSpan = 3;
		this.category.setLayoutData(categoryData);
		this.category.disableMove();
		category.setID(IspemViewsRepository.MethodArtifactDefinition.Properties.category);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.category,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		category.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCategory(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		createDescription(parent, IspemViewsRepository.MethodArtifactDefinition.Properties.copyright, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_CopyrightLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
				}
			}

		});
		EditingUtils.setID(copyright, IspemViewsRepository.MethodArtifactDefinition.Properties.copyright);
		EditingUtils.setEEFtype(copyright, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.copyright, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCopyrightText

		// End of user code
		return parent;
	}

	protected Composite createAuthorMultiValuedEditor(Composite parent) {
		author = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData authorData = new GridData(GridData.FILL_HORIZONTAL);
		authorData.horizontalSpan = 2;
		author.setLayoutData(authorData);
		EditingUtils.setID(author, IspemViewsRepository.MethodArtifactDefinition.Properties.author);
		EditingUtils.setEEFtype(author, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editAuthor = new Button(parent, SWT.NONE);
		editAuthor.setText(getDescription(IspemViewsRepository.MethodArtifactDefinition.Properties.author, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_AuthorLabel));
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
						author.getShell(), "MethodArtifactDefinition", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						authorList, SpemPackage.eINSTANCE.getDescribableElement_Author().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					authorList = dialog.getResult();
					if (authorList == null) {
						authorList = new BasicEList();
					}
					author.setText(authorList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.author, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(authorList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editAuthor, IspemViewsRepository.MethodArtifactDefinition.Properties.author);
		EditingUtils.setEEFtype(editAuthor, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createAuthorMultiValuedEditor

		// End of user code
		return parent;
	}

	
	protected Composite createChangeDateText(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodArtifactDefinition.Properties.changeDate, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_ChangeDateLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
				}
			}

		});
		EditingUtils.setID(changeDate, IspemViewsRepository.MethodArtifactDefinition.Properties.changeDate);
		EditingUtils.setEEFtype(changeDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.changeDate, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createChangeDateText

		// End of user code
		return parent;
	}

	
	protected Composite createChangeDescriptionText(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodArtifactDefinition.Properties.changeDescription, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_ChangeDescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
				}
			}

		});
		EditingUtils.setID(changeDescription, IspemViewsRepository.MethodArtifactDefinition.Properties.changeDescription);
		EditingUtils.setEEFtype(changeDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.changeDescription, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createChangeDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createVersionText(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodArtifactDefinition.Properties.version, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_VersionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}

		});
		EditingUtils.setID(version, IspemViewsRepository.MethodArtifactDefinition.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.version, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVersionText

		// End of user code
		return parent;
	}

	
	protected Composite createUriText(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodArtifactDefinition.Properties.uri, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_UriLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.uri, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, uri.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.uri, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, uri.getText()));
				}
			}

		});
		EditingUtils.setID(uri, IspemViewsRepository.MethodArtifactDefinition.Properties.uri);
		EditingUtils.setEEFtype(uri, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.uri, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createUriText

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodArtifactDefinition.Properties.name, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, IspemViewsRepository.MethodArtifactDefinition.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.name, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createVariabilityTypeEMFComboViewer(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodArtifactDefinition.Properties.variabilityType, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_VariabilityTypeLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.variabilityType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVariabilityType()));
			}

		});
		variabilityType.setID(IspemViewsRepository.MethodArtifactDefinition.Properties.variabilityType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.variabilityType, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVariabilityTypeEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createVariabilityBasedOnElementFlatComboViewer(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodArtifactDefinition.Properties.variabilityBasedOnElement, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_VariabilityBasedOnElementLabel);
		variabilityBasedOnElement = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(IspemViewsRepository.MethodArtifactDefinition.Properties.variabilityBasedOnElement, IspemViewsRepository.SWT_KIND));
		variabilityBasedOnElement.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		variabilityBasedOnElement.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.variabilityBasedOnElement, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getVariabilityBasedOnElement()));
			}

		});
		GridData variabilityBasedOnElementData = new GridData(GridData.FILL_HORIZONTAL);
		variabilityBasedOnElement.setLayoutData(variabilityBasedOnElementData);
		variabilityBasedOnElement.setID(IspemViewsRepository.MethodArtifactDefinition.Properties.variabilityBasedOnElement);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.variabilityBasedOnElement, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVariabilityBasedOnElementFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createMethodContentKindFlatComboViewer(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodArtifactDefinition.Properties.methodContentKind, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_MethodContentKindLabel);
		methodContentKind = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(IspemViewsRepository.MethodArtifactDefinition.Properties.methodContentKind, IspemViewsRepository.SWT_KIND));
		methodContentKind.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		methodContentKind.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.methodContentKind, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getMethodContentKind()));
			}

		});
		GridData methodContentKindData = new GridData(GridData.FILL_HORIZONTAL);
		methodContentKind.setLayoutData(methodContentKindData);
		methodContentKind.setID(IspemViewsRepository.MethodArtifactDefinition.Properties.methodContentKind);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.methodContentKind, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMethodContentKindFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRootElementFlatComboViewer(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodArtifactDefinition.Properties.rootElement, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_RootElementLabel);
		rootElement = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(IspemViewsRepository.MethodArtifactDefinition.Properties.rootElement, IspemViewsRepository.SWT_KIND));
		rootElement.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		rootElement.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.rootElement, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRootElement()));
			}

		});
		GridData rootElementData = new GridData(GridData.FILL_HORIZONTAL);
		rootElement.setLayoutData(rootElementData);
		rootElement.setID(IspemViewsRepository.MethodArtifactDefinition.Properties.rootElement);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.rootElement, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createRootElementFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createUsedReferencesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(IspemViewsRepository.MethodArtifactDefinition.Properties.usedReferences, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_UsedReferencesLabel);		 
		this.usedReferences = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addUsedReferences(); }
			public void handleEdit(EObject element) { editUsedReferences(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveUsedReferences(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromUsedReferences(element); }
			public void navigateTo(EObject element) { }
		});
		this.usedReferences.setHelpText(propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.usedReferences, IspemViewsRepository.SWT_KIND));
		this.usedReferences.createControls(parent);
		this.usedReferences.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.usedReferences, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData usedReferencesData = new GridData(GridData.FILL_HORIZONTAL);
		usedReferencesData.horizontalSpan = 3;
		this.usedReferences.setLayoutData(usedReferencesData);
		this.usedReferences.disableMove();
		usedReferences.setID(IspemViewsRepository.MethodArtifactDefinition.Properties.usedReferences);
		usedReferences.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addUsedReferences() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(usedReferences.getInput(), usedReferencesFilters, usedReferencesBusinessFilters,
		"usedReferences", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.usedReferences,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				usedReferences.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveUsedReferences(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.usedReferences, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		usedReferences.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromUsedReferences(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.usedReferences, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		usedReferences.refresh();
	}

	/**
	 * 
	 */
	protected void editUsedReferences(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				usedReferences.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createMetamodelFlatComboViewer(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodArtifactDefinition.Properties.metamodel, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_MetamodelLabel);
		metamodel = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(IspemViewsRepository.MethodArtifactDefinition.Properties.metamodel, IspemViewsRepository.SWT_KIND));
		metamodel.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		metamodel.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.metamodel, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getMetamodel()));
			}

		});
		GridData metamodelData = new GridData(GridData.FILL_HORIZONTAL);
		metamodel.setLayoutData(metamodelData);
		metamodel.setID(IspemViewsRepository.MethodArtifactDefinition.Properties.metamodel);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.metamodel, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMetamodelFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSpecializedByFlatComboViewer(Composite parent) {
		createDescription(parent, IspemViewsRepository.MethodArtifactDefinition.Properties.specializedBy, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_SpecializedByLabel);
		specializedBy = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(IspemViewsRepository.MethodArtifactDefinition.Properties.specializedBy, IspemViewsRepository.SWT_KIND));
		specializedBy.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		specializedBy.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.specializedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSpecializedBy()));
			}

		});
		GridData specializedByData = new GridData(GridData.FILL_HORIZONTAL);
		specializedBy.setLayoutData(specializedByData);
		specializedBy.setID(IspemViewsRepository.MethodArtifactDefinition.Properties.specializedBy);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.specializedBy, IspemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSpecializedByFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSpecializesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(IspemViewsRepository.MethodArtifactDefinition.Properties.specializes, IspemMessages.MethodArtifactDefinitionPropertiesEditionPart_SpecializesLabel);		 
		this.specializes = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addSpecializes(); }
			public void handleEdit(EObject element) { editSpecializes(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSpecializes(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSpecializes(element); }
			public void navigateTo(EObject element) { }
		});
		this.specializes.setHelpText(propertiesEditionComponent.getHelpContent(IspemViewsRepository.MethodArtifactDefinition.Properties.specializes, IspemViewsRepository.SWT_KIND));
		this.specializes.createControls(parent);
		this.specializes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.specializes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData specializesData = new GridData(GridData.FILL_HORIZONTAL);
		specializesData.horizontalSpan = 3;
		this.specializes.setLayoutData(specializesData);
		this.specializes.disableMove();
		specializes.setID(IspemViewsRepository.MethodArtifactDefinition.Properties.specializes);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.specializes,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.specializes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		specializes.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSpecializes(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodArtifactDefinitionPropertiesEditionPartImpl.this, IspemViewsRepository.MethodArtifactDefinition.Properties.specializes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#getKind()
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
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#initKind(EObjectFlatComboSettings)
	 */
	public void initKind(EObjectFlatComboSettings settings) {
		kind.setInput(settings);
		if (current != null) {
			kind.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.kind);
		if (eefElementEditorReadOnlyState && kind.isEnabled()) {
			kind.setEnabled(false);
			kind.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !kind.isEnabled()) {
			kind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setKind(EObject newValue)
	 * 
	 */
	public void setKind(EObject newValue) {
		if (newValue != null) {
			kind.setSelection(new StructuredSelection(newValue));
		} else {
			kind.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.kind);
		if (eefElementEditorReadOnlyState && kind.isEnabled()) {
			kind.setEnabled(false);
			kind.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !kind.isEnabled()) {
			kind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setKindButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKindButtonMode(ButtonsModeEnum newValue) {
		kind.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKind(ViewerFilter filter) {
		kind.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addBusinessFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKind(ViewerFilter filter) {
		kind.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#getPresentationName()
	 * 
	 */
	public String getPresentationName() {
		return presentationName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setPresentationName(String newValue)
	 * 
	 */
	public void setPresentationName(String newValue) {
		if (newValue != null) {
			presentationName.setText(newValue);
		} else {
			presentationName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.presentationName);
		if (eefElementEditorReadOnlyState && presentationName.isEnabled()) {
			presentationName.setEnabled(false);
			presentationName.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !presentationName.isEnabled()) {
			presentationName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#getBriefDescription()
	 * 
	 */
	public String getBriefDescription() {
		return briefDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setBriefDescription(String newValue)
	 * 
	 */
	public void setBriefDescription(String newValue) {
		if (newValue != null) {
			briefDescription.setText(newValue);
		} else {
			briefDescription.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.briefDescription);
		if (eefElementEditorReadOnlyState && briefDescription.isEnabled()) {
			briefDescription.setEnabled(false);
			briefDescription.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !briefDescription.isEnabled()) {
			briefDescription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#getMainDescription()
	 * 
	 */
	public String getMainDescription() {
		return mainDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setMainDescription(String newValue)
	 * 
	 */
	public void setMainDescription(String newValue) {
		if (newValue != null) {
			mainDescription.setText(newValue);
		} else {
			mainDescription.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.mainDescription);
		if (eefElementEditorReadOnlyState && mainDescription.isEnabled()) {
			mainDescription.setEnabled(false);
			mainDescription.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mainDescription.isEnabled()) {
			mainDescription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#getPurpose()
	 * 
	 */
	public String getPurpose() {
		return purpose.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setPurpose(String newValue)
	 * 
	 */
	public void setPurpose(String newValue) {
		if (newValue != null) {
			purpose.setText(newValue);
		} else {
			purpose.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.purpose);
		if (eefElementEditorReadOnlyState && purpose.isEnabled()) {
			purpose.setEnabled(false);
			purpose.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !purpose.isEnabled()) {
			purpose.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#initGuidance(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initGuidance(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		guidance.setContentProvider(contentProvider);
		guidance.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.guidance);
		if (eefElementEditorReadOnlyState && guidance.getTable().isEnabled()) {
			guidance.setEnabled(false);
			guidance.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !guidance.getTable().isEnabled()) {
			guidance.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#updateGuidance()
	 * 
	 */
	public void updateGuidance() {
	guidance.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGuidance(ViewerFilter filter) {
		guidanceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addBusinessFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGuidance(ViewerFilter filter) {
		guidanceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#isContainedInGuidanceTable(EObject element)
	 * 
	 */
	public boolean isContainedInGuidanceTable(EObject element) {
		return ((ReferencesTableSettings)guidance.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#initMetric(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMetric(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		metric.setContentProvider(contentProvider);
		metric.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.metric);
		if (eefElementEditorReadOnlyState && metric.getTable().isEnabled()) {
			metric.setEnabled(false);
			metric.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !metric.getTable().isEnabled()) {
			metric.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#updateMetric()
	 * 
	 */
	public void updateMetric() {
	metric.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMetric(ViewerFilter filter) {
		metricFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addBusinessFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMetric(ViewerFilter filter) {
		metricBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#isContainedInMetricTable(EObject element)
	 * 
	 */
	public boolean isContainedInMetricTable(EObject element) {
		return ((ReferencesTableSettings)metric.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#initCategory(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCategory(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		category.setContentProvider(contentProvider);
		category.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.category);
		if (eefElementEditorReadOnlyState && category.getTable().isEnabled()) {
			category.setEnabled(false);
			category.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !category.getTable().isEnabled()) {
			category.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#updateCategory()
	 * 
	 */
	public void updateCategory() {
	category.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCategory(ViewerFilter filter) {
		categoryFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addBusinessFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCategory(ViewerFilter filter) {
		categoryBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#isContainedInCategoryTable(EObject element)
	 * 
	 */
	public boolean isContainedInCategoryTable(EObject element) {
		return ((ReferencesTableSettings)category.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#getCopyright()
	 * 
	 */
	public String getCopyright() {
		return copyright.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setCopyright(String newValue)
	 * 
	 */
	public void setCopyright(String newValue) {
		if (newValue != null) {
			copyright.setText(newValue);
		} else {
			copyright.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.copyright);
		if (eefElementEditorReadOnlyState && copyright.isEnabled()) {
			copyright.setEnabled(false);
			copyright.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !copyright.isEnabled()) {
			copyright.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#getAuthor()
	 * 
	 */
	public EList getAuthor() {
		return authorList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setAuthor(EList newValue)
	 * 
	 */
	public void setAuthor(EList newValue) {
		authorList = newValue;
		if (newValue != null) {
			author.setText(authorList.toString());
		} else {
			author.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.author);
		if (eefElementEditorReadOnlyState && author.isEnabled()) {
			author.setEnabled(false);
			author.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
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
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#getChangeDate()
	 * 
	 */
	public String getChangeDate() {
		return changeDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setChangeDate(String newValue)
	 * 
	 */
	public void setChangeDate(String newValue) {
		if (newValue != null) {
			changeDate.setText(newValue);
		} else {
			changeDate.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.changeDate);
		if (eefElementEditorReadOnlyState && changeDate.isEnabled()) {
			changeDate.setEnabled(false);
			changeDate.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !changeDate.isEnabled()) {
			changeDate.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#getChangeDescription()
	 * 
	 */
	public String getChangeDescription() {
		return changeDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setChangeDescription(String newValue)
	 * 
	 */
	public void setChangeDescription(String newValue) {
		if (newValue != null) {
			changeDescription.setText(newValue);
		} else {
			changeDescription.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.changeDescription);
		if (eefElementEditorReadOnlyState && changeDescription.isEnabled()) {
			changeDescription.setEnabled(false);
			changeDescription.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !changeDescription.isEnabled()) {
			changeDescription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setVersion(String newValue)
	 * 
	 */
	public void setVersion(String newValue) {
		if (newValue != null) {
			version.setText(newValue);
		} else {
			version.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.version);
		if (eefElementEditorReadOnlyState && version.isEnabled()) {
			version.setEnabled(false);
			version.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !version.isEnabled()) {
			version.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#getUri()
	 * 
	 */
	public String getUri() {
		return uri.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setUri(String newValue)
	 * 
	 */
	public void setUri(String newValue) {
		if (newValue != null) {
			uri.setText(newValue);
		} else {
			uri.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.uri);
		if (eefElementEditorReadOnlyState && uri.isEnabled()) {
			uri.setEnabled(false);
			uri.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !uri.isEnabled()) {
			uri.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#getVariabilityType()
	 * 
	 */
	public Enumerator getVariabilityType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) variabilityType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#initVariabilityType(Object input, Enumerator current)
	 */
	public void initVariabilityType(Object input, Enumerator current) {
		variabilityType.setInput(input);
		variabilityType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.variabilityType);
		if (eefElementEditorReadOnlyState && variabilityType.isEnabled()) {
			variabilityType.setEnabled(false);
			variabilityType.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityType.isEnabled()) {
			variabilityType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setVariabilityType(Enumerator newValue)
	 * 
	 */
	public void setVariabilityType(Enumerator newValue) {
		variabilityType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.variabilityType);
		if (eefElementEditorReadOnlyState && variabilityType.isEnabled()) {
			variabilityType.setEnabled(false);
			variabilityType.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityType.isEnabled()) {
			variabilityType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#getVariabilityBasedOnElement()
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
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#initVariabilityBasedOnElement(EObjectFlatComboSettings)
	 */
	public void initVariabilityBasedOnElement(EObjectFlatComboSettings settings) {
		variabilityBasedOnElement.setInput(settings);
		if (current != null) {
			variabilityBasedOnElement.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.variabilityBasedOnElement);
		if (eefElementEditorReadOnlyState && variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(false);
			variabilityBasedOnElement.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setVariabilityBasedOnElement(EObject newValue)
	 * 
	 */
	public void setVariabilityBasedOnElement(EObject newValue) {
		if (newValue != null) {
			variabilityBasedOnElement.setSelection(new StructuredSelection(newValue));
		} else {
			variabilityBasedOnElement.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.variabilityBasedOnElement);
		if (eefElementEditorReadOnlyState && variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(false);
			variabilityBasedOnElement.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue)
	 */
	public void setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue) {
		variabilityBasedOnElement.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addFilterVariabilityBasedOnElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToVariabilityBasedOnElement(ViewerFilter filter) {
		variabilityBasedOnElement.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addBusinessFilterVariabilityBasedOnElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToVariabilityBasedOnElement(ViewerFilter filter) {
		variabilityBasedOnElement.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#getMethodContentKind()
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
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#initMethodContentKind(EObjectFlatComboSettings)
	 */
	public void initMethodContentKind(EObjectFlatComboSettings settings) {
		methodContentKind.setInput(settings);
		if (current != null) {
			methodContentKind.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.methodContentKind);
		if (eefElementEditorReadOnlyState && methodContentKind.isEnabled()) {
			methodContentKind.setEnabled(false);
			methodContentKind.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !methodContentKind.isEnabled()) {
			methodContentKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setMethodContentKind(EObject newValue)
	 * 
	 */
	public void setMethodContentKind(EObject newValue) {
		if (newValue != null) {
			methodContentKind.setSelection(new StructuredSelection(newValue));
		} else {
			methodContentKind.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.methodContentKind);
		if (eefElementEditorReadOnlyState && methodContentKind.isEnabled()) {
			methodContentKind.setEnabled(false);
			methodContentKind.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !methodContentKind.isEnabled()) {
			methodContentKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setMethodContentKindButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMethodContentKindButtonMode(ButtonsModeEnum newValue) {
		methodContentKind.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addFilterMethodContentKind(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMethodContentKind(ViewerFilter filter) {
		methodContentKind.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addBusinessFilterMethodContentKind(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMethodContentKind(ViewerFilter filter) {
		methodContentKind.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#getRootElement()
	 * 
	 */
	public EObject getRootElement() {
		if (rootElement.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) rootElement.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#initRootElement(EObjectFlatComboSettings)
	 */
	public void initRootElement(EObjectFlatComboSettings settings) {
		rootElement.setInput(settings);
		if (current != null) {
			rootElement.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.rootElement);
		if (eefElementEditorReadOnlyState && rootElement.isEnabled()) {
			rootElement.setEnabled(false);
			rootElement.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !rootElement.isEnabled()) {
			rootElement.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setRootElement(EObject newValue)
	 * 
	 */
	public void setRootElement(EObject newValue) {
		if (newValue != null) {
			rootElement.setSelection(new StructuredSelection(newValue));
		} else {
			rootElement.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.rootElement);
		if (eefElementEditorReadOnlyState && rootElement.isEnabled()) {
			rootElement.setEnabled(false);
			rootElement.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !rootElement.isEnabled()) {
			rootElement.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setRootElementButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRootElementButtonMode(ButtonsModeEnum newValue) {
		rootElement.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addFilterRootElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRootElement(ViewerFilter filter) {
		rootElement.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addBusinessFilterRootElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRootElement(ViewerFilter filter) {
		rootElement.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#initUsedReferences(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initUsedReferences(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		usedReferences.setContentProvider(contentProvider);
		usedReferences.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.usedReferences);
		if (eefElementEditorReadOnlyState && usedReferences.getTable().isEnabled()) {
			usedReferences.setEnabled(false);
			usedReferences.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !usedReferences.getTable().isEnabled()) {
			usedReferences.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#updateUsedReferences()
	 * 
	 */
	public void updateUsedReferences() {
	usedReferences.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addFilterUsedReferences(ViewerFilter filter)
	 * 
	 */
	public void addFilterToUsedReferences(ViewerFilter filter) {
		usedReferencesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addBusinessFilterUsedReferences(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToUsedReferences(ViewerFilter filter) {
		usedReferencesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#isContainedInUsedReferencesTable(EObject element)
	 * 
	 */
	public boolean isContainedInUsedReferencesTable(EObject element) {
		return ((ReferencesTableSettings)usedReferences.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#getMetamodel()
	 * 
	 */
	public EObject getMetamodel() {
		if (metamodel.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) metamodel.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#initMetamodel(EObjectFlatComboSettings)
	 */
	public void initMetamodel(EObjectFlatComboSettings settings) {
		metamodel.setInput(settings);
		if (current != null) {
			metamodel.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.metamodel);
		if (eefElementEditorReadOnlyState && metamodel.isEnabled()) {
			metamodel.setEnabled(false);
			metamodel.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !metamodel.isEnabled()) {
			metamodel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setMetamodel(EObject newValue)
	 * 
	 */
	public void setMetamodel(EObject newValue) {
		if (newValue != null) {
			metamodel.setSelection(new StructuredSelection(newValue));
		} else {
			metamodel.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.metamodel);
		if (eefElementEditorReadOnlyState && metamodel.isEnabled()) {
			metamodel.setEnabled(false);
			metamodel.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !metamodel.isEnabled()) {
			metamodel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setMetamodelButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMetamodelButtonMode(ButtonsModeEnum newValue) {
		metamodel.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addFilterMetamodel(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMetamodel(ViewerFilter filter) {
		metamodel.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addBusinessFilterMetamodel(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMetamodel(ViewerFilter filter) {
		metamodel.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#getSpecializedBy()
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
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#initSpecializedBy(EObjectFlatComboSettings)
	 */
	public void initSpecializedBy(EObjectFlatComboSettings settings) {
		specializedBy.setInput(settings);
		if (current != null) {
			specializedBy.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.specializedBy);
		if (eefElementEditorReadOnlyState && specializedBy.isEnabled()) {
			specializedBy.setEnabled(false);
			specializedBy.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !specializedBy.isEnabled()) {
			specializedBy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setSpecializedBy(EObject newValue)
	 * 
	 */
	public void setSpecializedBy(EObject newValue) {
		if (newValue != null) {
			specializedBy.setSelection(new StructuredSelection(newValue));
		} else {
			specializedBy.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.specializedBy);
		if (eefElementEditorReadOnlyState && specializedBy.isEnabled()) {
			specializedBy.setEnabled(false);
			specializedBy.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !specializedBy.isEnabled()) {
			specializedBy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#setSpecializedByButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSpecializedByButtonMode(ButtonsModeEnum newValue) {
		specializedBy.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addFilterSpecializedBy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSpecializedBy(ViewerFilter filter) {
		specializedBy.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addBusinessFilterSpecializedBy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSpecializedBy(ViewerFilter filter) {
		specializedBy.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#initSpecializes(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSpecializes(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		specializes.setContentProvider(contentProvider);
		specializes.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.MethodArtifactDefinition.Properties.specializes);
		if (eefElementEditorReadOnlyState && specializes.getTable().isEnabled()) {
			specializes.setEnabled(false);
			specializes.setToolTipText(IspemMessages.MethodArtifactDefinition_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !specializes.getTable().isEnabled()) {
			specializes.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#updateSpecializes()
	 * 
	 */
	public void updateSpecializes() {
	specializes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addFilterSpecializes(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSpecializes(ViewerFilter filter) {
		specializesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#addBusinessFilterSpecializes(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSpecializes(ViewerFilter filter) {
		specializesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.MethodArtifactDefinitionPropertiesEditionPart#isContainedInSpecializesTable(EObject element)
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
		return IspemMessages.MethodArtifactDefinition_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
