/**
 * Generated with Acceleo
 */
package org.topcased.spem.parts.forms;

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

import org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart;
import org.topcased.spem.parts.SpemViewsRepository;

import org.topcased.spem.providers.SpemMessages;

// End of user code

/**
 * 
 * 
 */
public class Default_ResponsibilityAssignmentPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, Default_ResponsibilityAssignmentPropertiesEditionPart {

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
	protected ReferencesTable linkedRoleDefinition;
	protected List<ViewerFilter> linkedRoleDefinitionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> linkedRoleDefinitionFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer linkedWorkProductDefinition;



	/**
	 * For {@link ISection} use only.
	 */
	public Default_ResponsibilityAssignmentPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public Default_ResponsibilityAssignmentPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence default_ResponsibilityAssignmentStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = default_ResponsibilityAssignmentStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.class);
		propertiesStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.kind);
		propertiesStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.presentationName);
		propertiesStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.briefDescription);
		propertiesStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.mainDescription);
		propertiesStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.purpose);
		propertiesStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.guidance);
		propertiesStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.metric);
		propertiesStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.category);
		propertiesStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.copyright);
		propertiesStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.author);
		propertiesStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.changeDate);
		propertiesStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.changeDescription);
		propertiesStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.version);
		propertiesStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.name);
		propertiesStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.variabilityType);
		propertiesStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.variabilityBasedOnElement);
		propertiesStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.methodContentKind);
		propertiesStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.linkedRoleDefinition);
		propertiesStep.addStep(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.linkedWorkProductDefinition);
		
		
		composer = new PartComposer(default_ResponsibilityAssignmentStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.kind) {
					return createKindFlatComboViewer(parent, widgetFactory);
				}
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.presentationName) {
					return createPresentationNameText(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.briefDescription) {
					return createBriefDescriptionText(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.mainDescription) {
					return createMainDescriptionText(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.purpose) {
					return createPurposeText(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.guidance) {
					return createGuidanceReferencesTable(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.metric) {
					return createMetricReferencesTable(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.category) {
					return createCategoryReferencesTable(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.copyright) {
					return createCopyrightText(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.author) {
					return createAuthorMultiValuedEditor(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.changeDate) {
					return createChangeDateText(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.changeDescription) {
					return createChangeDescriptionText(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.version) {
					return createVersionText(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.variabilityType) {
					return createVariabilityTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.variabilityBasedOnElement) {
					return createVariabilityBasedOnElementFlatComboViewer(parent, widgetFactory);
				}
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.methodContentKind) {
					return createMethodContentKindFlatComboViewer(parent, widgetFactory);
				}
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.linkedRoleDefinition) {
					return createLinkedRoleDefinitionReferencesTable(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.Default_ResponsibilityAssignment.Properties.linkedWorkProductDefinition) {
					return createLinkedWorkProductDefinitionFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_PropertiesGroupLabel);
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
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createKindFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.kind, SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_KindLabel);
		kind = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.kind, SpemViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.kind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getKind()));
			}

		});
		kind.setID(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.kind);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.kind, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createKindFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createPresentationNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.presentationName, SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_PresentationNameLabel);
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
							Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
							SpemViewsRepository.Default_ResponsibilityAssignment.Properties.presentationName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
									SpemViewsRepository.Default_ResponsibilityAssignment.Properties.presentationName,
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
									Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.presentationName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, presentationName.getText()));
				}
			}
		});
		EditingUtils.setID(presentationName, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.presentationName);
		EditingUtils.setEEFtype(presentationName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.presentationName, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPresentationNameText

		// End of user code
		return parent;
	}

	
	protected Composite createBriefDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.briefDescription, SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_BriefDescriptionLabel);
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
							Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
							SpemViewsRepository.Default_ResponsibilityAssignment.Properties.briefDescription,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
									SpemViewsRepository.Default_ResponsibilityAssignment.Properties.briefDescription,
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
									Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.briefDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, briefDescription.getText()));
				}
			}
		});
		EditingUtils.setID(briefDescription, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.briefDescription);
		EditingUtils.setEEFtype(briefDescription, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.briefDescription, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createBriefDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createMainDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.mainDescription, SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_MainDescriptionLabel);
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
							Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
							SpemViewsRepository.Default_ResponsibilityAssignment.Properties.mainDescription,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
									SpemViewsRepository.Default_ResponsibilityAssignment.Properties.mainDescription,
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
									Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.mainDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mainDescription.getText()));
				}
			}
		});
		EditingUtils.setID(mainDescription, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.mainDescription);
		EditingUtils.setEEFtype(mainDescription, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.mainDescription, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMainDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createPurposeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.purpose, SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_PurposeLabel);
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
							Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
							SpemViewsRepository.Default_ResponsibilityAssignment.Properties.purpose,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
									SpemViewsRepository.Default_ResponsibilityAssignment.Properties.purpose,
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
									Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.purpose, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, purpose.getText()));
				}
			}
		});
		EditingUtils.setID(purpose, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.purpose);
		EditingUtils.setEEFtype(purpose, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.purpose, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPurposeText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createGuidanceReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.guidance = new ReferencesTable(getDescription(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.guidance, SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_GuidanceLabel), new ReferencesTableListener	() {
			public void handleAdd() { addGuidance(); }
			public void handleEdit(EObject element) { editGuidance(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGuidance(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGuidance(element); }
			public void navigateTo(EObject element) { }
		});
		this.guidance.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.guidance, SpemViewsRepository.FORM_KIND));
		this.guidance.createControls(parent, widgetFactory);
		this.guidance.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.guidance, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData guidanceData = new GridData(GridData.FILL_HORIZONTAL);
		guidanceData.horizontalSpan = 3;
		this.guidance.setLayoutData(guidanceData);
		this.guidance.disableMove();
		guidance.setID(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.guidance);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.guidance,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		guidance.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGuidance(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.guidance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.metric = new ReferencesTable(getDescription(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.metric, SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_MetricLabel), new ReferencesTableListener	() {
			public void handleAdd() { addMetric(); }
			public void handleEdit(EObject element) { editMetric(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMetric(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMetric(element); }
			public void navigateTo(EObject element) { }
		});
		this.metric.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.metric, SpemViewsRepository.FORM_KIND));
		this.metric.createControls(parent, widgetFactory);
		this.metric.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.metric, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData metricData = new GridData(GridData.FILL_HORIZONTAL);
		metricData.horizontalSpan = 3;
		this.metric.setLayoutData(metricData);
		this.metric.disableMove();
		metric.setID(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.metric);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.metric,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		metric.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMetric(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.metric, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.category = new ReferencesTable(getDescription(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.category, SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_CategoryLabel), new ReferencesTableListener	() {
			public void handleAdd() { addCategory(); }
			public void handleEdit(EObject element) { editCategory(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCategory(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCategory(element); }
			public void navigateTo(EObject element) { }
		});
		this.category.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.category, SpemViewsRepository.FORM_KIND));
		this.category.createControls(parent, widgetFactory);
		this.category.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.category, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData categoryData = new GridData(GridData.FILL_HORIZONTAL);
		categoryData.horizontalSpan = 3;
		this.category.setLayoutData(categoryData);
		this.category.disableMove();
		category.setID(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.category);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.category,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		category.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCategory(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		createDescription(parent, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.copyright, SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_CopyrightLabel);
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
							Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
							SpemViewsRepository.Default_ResponsibilityAssignment.Properties.copyright,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
									SpemViewsRepository.Default_ResponsibilityAssignment.Properties.copyright,
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
									Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.copyright, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, copyright.getText()));
				}
			}
		});
		EditingUtils.setID(copyright, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.copyright);
		EditingUtils.setEEFtype(copyright, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.copyright, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
		EditingUtils.setID(author, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.author);
		EditingUtils.setEEFtype(author, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editAuthor = widgetFactory.createButton(parent, getDescription(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.author, SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_AuthorLabel), SWT.NONE);
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
						author.getShell(), "Default_ResponsibilityAssignment", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						authorList, SpemPackage.eINSTANCE.getDescribableElement_Author().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					authorList = dialog.getResult();
					if (authorList == null) {
						authorList = new BasicEList();
					}
					author.setText(authorList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.author, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(authorList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editAuthor, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.author);
		EditingUtils.setEEFtype(editAuthor, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createAuthorMultiValuedEditor

		// End of user code
		return parent;
	}

	
	protected Composite createChangeDateText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.changeDate, SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_ChangeDateLabel);
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
							Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
							SpemViewsRepository.Default_ResponsibilityAssignment.Properties.changeDate,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
									SpemViewsRepository.Default_ResponsibilityAssignment.Properties.changeDate,
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
									Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.changeDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDate.getText()));
				}
			}
		});
		EditingUtils.setID(changeDate, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.changeDate);
		EditingUtils.setEEFtype(changeDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.changeDate, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createChangeDateText

		// End of user code
		return parent;
	}

	
	protected Composite createChangeDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.changeDescription, SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_ChangeDescriptionLabel);
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
							Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
							SpemViewsRepository.Default_ResponsibilityAssignment.Properties.changeDescription,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
									SpemViewsRepository.Default_ResponsibilityAssignment.Properties.changeDescription,
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
									Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.changeDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, changeDescription.getText()));
				}
			}
		});
		EditingUtils.setID(changeDescription, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.changeDescription);
		EditingUtils.setEEFtype(changeDescription, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.changeDescription, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createChangeDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createVersionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.version, SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_VersionLabel);
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
							Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
							SpemViewsRepository.Default_ResponsibilityAssignment.Properties.version,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
									SpemViewsRepository.Default_ResponsibilityAssignment.Properties.version,
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
									Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}
		});
		EditingUtils.setID(version, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.version, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createVersionText

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.name, SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_NameLabel);
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
							Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
							SpemViewsRepository.Default_ResponsibilityAssignment.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
									SpemViewsRepository.Default_ResponsibilityAssignment.Properties.name,
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
									Default_ResponsibilityAssignmentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.name, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createVariabilityTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.variabilityType, SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_VariabilityTypeLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.variabilityType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVariabilityType()));
			}

		});
		variabilityType.setID(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.variabilityType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.variabilityType, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
		createDescription(parent, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.variabilityBasedOnElement, SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_VariabilityBasedOnElementLabel);
		variabilityBasedOnElement = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.variabilityBasedOnElement, SpemViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.variabilityBasedOnElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVariabilityBasedOnElement()));
			}

		});
		variabilityBasedOnElement.setID(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.variabilityBasedOnElement);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.variabilityBasedOnElement, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createVariabilityBasedOnElementFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createMethodContentKindFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.methodContentKind, SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_MethodContentKindLabel);
		methodContentKind = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.methodContentKind, SpemViewsRepository.FORM_KIND));
		widgetFactory.adapt(methodContentKind);
		methodContentKind.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData methodContentKindData = new GridData(GridData.FILL_HORIZONTAL);
		methodContentKind.setLayoutData(methodContentKindData);
		methodContentKind.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.methodContentKind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getMethodContentKind()));
			}

		});
		methodContentKind.setID(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.methodContentKind);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.methodContentKind, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMethodContentKindFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createLinkedRoleDefinitionReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.linkedRoleDefinition = new ReferencesTable(getDescription(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.linkedRoleDefinition, SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_LinkedRoleDefinitionLabel), new ReferencesTableListener	() {
			public void handleAdd() { addLinkedRoleDefinition(); }
			public void handleEdit(EObject element) { editLinkedRoleDefinition(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveLinkedRoleDefinition(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromLinkedRoleDefinition(element); }
			public void navigateTo(EObject element) { }
		});
		this.linkedRoleDefinition.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.linkedRoleDefinition, SpemViewsRepository.FORM_KIND));
		this.linkedRoleDefinition.createControls(parent, widgetFactory);
		this.linkedRoleDefinition.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.linkedRoleDefinition, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData linkedRoleDefinitionData = new GridData(GridData.FILL_HORIZONTAL);
		linkedRoleDefinitionData.horizontalSpan = 3;
		this.linkedRoleDefinition.setLayoutData(linkedRoleDefinitionData);
		this.linkedRoleDefinition.disableMove();
		linkedRoleDefinition.setID(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.linkedRoleDefinition);
		linkedRoleDefinition.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createLinkedRoleDefinitionReferencesTable

		// End of user code
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.linkedRoleDefinition,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.linkedRoleDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		linkedRoleDefinition.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromLinkedRoleDefinition(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.linkedRoleDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createLinkedWorkProductDefinitionFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.linkedWorkProductDefinition, SpemMessages.Default_ResponsibilityAssignmentPropertiesEditionPart_LinkedWorkProductDefinitionLabel);
		linkedWorkProductDefinition = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.linkedWorkProductDefinition, SpemViewsRepository.FORM_KIND));
		widgetFactory.adapt(linkedWorkProductDefinition);
		linkedWorkProductDefinition.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData linkedWorkProductDefinitionData = new GridData(GridData.FILL_HORIZONTAL);
		linkedWorkProductDefinition.setLayoutData(linkedWorkProductDefinitionData);
		linkedWorkProductDefinition.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_ResponsibilityAssignmentPropertiesEditionPartForm.this, SpemViewsRepository.Default_ResponsibilityAssignment.Properties.linkedWorkProductDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getLinkedWorkProductDefinition()));
			}

		});
		linkedWorkProductDefinition.setID(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.linkedWorkProductDefinition);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.linkedWorkProductDefinition, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createLinkedWorkProductDefinitionFlatComboViewer

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
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#getKind()
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
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#initKind(EObjectFlatComboSettings)
	 */
	public void initKind(EObjectFlatComboSettings settings) {
		kind.setInput(settings);
		if (current != null) {
			kind.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.kind);
		if (eefElementEditorReadOnlyState && kind.isEnabled()) {
			kind.setEnabled(false);
			kind.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !kind.isEnabled()) {
			kind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#setKind(EObject newValue)
	 * 
	 */
	public void setKind(EObject newValue) {
		if (newValue != null) {
			kind.setSelection(new StructuredSelection(newValue));
		} else {
			kind.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.kind);
		if (eefElementEditorReadOnlyState && kind.isEnabled()) {
			kind.setEnabled(false);
			kind.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !kind.isEnabled()) {
			kind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#setKindButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKindButtonMode(ButtonsModeEnum newValue) {
		kind.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#addFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKind(ViewerFilter filter) {
		kind.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#addBusinessFilterKind(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKind(ViewerFilter filter) {
		kind.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#getPresentationName()
	 * 
	 */
	public String getPresentationName() {
		return presentationName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#setPresentationName(String newValue)
	 * 
	 */
	public void setPresentationName(String newValue) {
		if (newValue != null) {
			presentationName.setText(newValue);
		} else {
			presentationName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.presentationName);
		if (eefElementEditorReadOnlyState && presentationName.isEnabled()) {
			presentationName.setEnabled(false);
			presentationName.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !presentationName.isEnabled()) {
			presentationName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#getBriefDescription()
	 * 
	 */
	public String getBriefDescription() {
		return briefDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#setBriefDescription(String newValue)
	 * 
	 */
	public void setBriefDescription(String newValue) {
		if (newValue != null) {
			briefDescription.setText(newValue);
		} else {
			briefDescription.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.briefDescription);
		if (eefElementEditorReadOnlyState && briefDescription.isEnabled()) {
			briefDescription.setEnabled(false);
			briefDescription.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !briefDescription.isEnabled()) {
			briefDescription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#getMainDescription()
	 * 
	 */
	public String getMainDescription() {
		return mainDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#setMainDescription(String newValue)
	 * 
	 */
	public void setMainDescription(String newValue) {
		if (newValue != null) {
			mainDescription.setText(newValue);
		} else {
			mainDescription.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.mainDescription);
		if (eefElementEditorReadOnlyState && mainDescription.isEnabled()) {
			mainDescription.setEnabled(false);
			mainDescription.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mainDescription.isEnabled()) {
			mainDescription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#getPurpose()
	 * 
	 */
	public String getPurpose() {
		return purpose.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#setPurpose(String newValue)
	 * 
	 */
	public void setPurpose(String newValue) {
		if (newValue != null) {
			purpose.setText(newValue);
		} else {
			purpose.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.purpose);
		if (eefElementEditorReadOnlyState && purpose.isEnabled()) {
			purpose.setEnabled(false);
			purpose.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !purpose.isEnabled()) {
			purpose.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#initGuidance(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initGuidance(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		guidance.setContentProvider(contentProvider);
		guidance.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.guidance);
		if (eefElementEditorReadOnlyState && guidance.getTable().isEnabled()) {
			guidance.setEnabled(false);
			guidance.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !guidance.getTable().isEnabled()) {
			guidance.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#updateGuidance()
	 * 
	 */
	public void updateGuidance() {
	guidance.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#addFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGuidance(ViewerFilter filter) {
		guidanceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#addBusinessFilterGuidance(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGuidance(ViewerFilter filter) {
		guidanceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#isContainedInGuidanceTable(EObject element)
	 * 
	 */
	public boolean isContainedInGuidanceTable(EObject element) {
		return ((ReferencesTableSettings)guidance.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#initMetric(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMetric(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		metric.setContentProvider(contentProvider);
		metric.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.metric);
		if (eefElementEditorReadOnlyState && metric.getTable().isEnabled()) {
			metric.setEnabled(false);
			metric.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !metric.getTable().isEnabled()) {
			metric.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#updateMetric()
	 * 
	 */
	public void updateMetric() {
	metric.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#addFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMetric(ViewerFilter filter) {
		metricFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#addBusinessFilterMetric(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMetric(ViewerFilter filter) {
		metricBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#isContainedInMetricTable(EObject element)
	 * 
	 */
	public boolean isContainedInMetricTable(EObject element) {
		return ((ReferencesTableSettings)metric.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#initCategory(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCategory(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		category.setContentProvider(contentProvider);
		category.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.category);
		if (eefElementEditorReadOnlyState && category.getTable().isEnabled()) {
			category.setEnabled(false);
			category.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !category.getTable().isEnabled()) {
			category.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#updateCategory()
	 * 
	 */
	public void updateCategory() {
	category.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#addFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCategory(ViewerFilter filter) {
		categoryFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#addBusinessFilterCategory(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCategory(ViewerFilter filter) {
		categoryBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#isContainedInCategoryTable(EObject element)
	 * 
	 */
	public boolean isContainedInCategoryTable(EObject element) {
		return ((ReferencesTableSettings)category.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#getCopyright()
	 * 
	 */
	public String getCopyright() {
		return copyright.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#setCopyright(String newValue)
	 * 
	 */
	public void setCopyright(String newValue) {
		if (newValue != null) {
			copyright.setText(newValue);
		} else {
			copyright.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.copyright);
		if (eefElementEditorReadOnlyState && copyright.isEnabled()) {
			copyright.setEnabled(false);
			copyright.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !copyright.isEnabled()) {
			copyright.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#getAuthor()
	 * 
	 */
	public EList getAuthor() {
		return authorList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#setAuthor(EList newValue)
	 * 
	 */
	public void setAuthor(EList newValue) {
		authorList = newValue;
		if (newValue != null) {
			author.setText(authorList.toString());
		} else {
			author.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.author);
		if (eefElementEditorReadOnlyState && author.isEnabled()) {
			author.setEnabled(false);
			author.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
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
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#getChangeDate()
	 * 
	 */
	public String getChangeDate() {
		return changeDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#setChangeDate(String newValue)
	 * 
	 */
	public void setChangeDate(String newValue) {
		if (newValue != null) {
			changeDate.setText(newValue);
		} else {
			changeDate.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.changeDate);
		if (eefElementEditorReadOnlyState && changeDate.isEnabled()) {
			changeDate.setEnabled(false);
			changeDate.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !changeDate.isEnabled()) {
			changeDate.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#getChangeDescription()
	 * 
	 */
	public String getChangeDescription() {
		return changeDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#setChangeDescription(String newValue)
	 * 
	 */
	public void setChangeDescription(String newValue) {
		if (newValue != null) {
			changeDescription.setText(newValue);
		} else {
			changeDescription.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.changeDescription);
		if (eefElementEditorReadOnlyState && changeDescription.isEnabled()) {
			changeDescription.setEnabled(false);
			changeDescription.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !changeDescription.isEnabled()) {
			changeDescription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#setVersion(String newValue)
	 * 
	 */
	public void setVersion(String newValue) {
		if (newValue != null) {
			version.setText(newValue);
		} else {
			version.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.version);
		if (eefElementEditorReadOnlyState && version.isEnabled()) {
			version.setEnabled(false);
			version.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !version.isEnabled()) {
			version.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#getVariabilityType()
	 * 
	 */
	public Enumerator getVariabilityType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) variabilityType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#initVariabilityType(Object input, Enumerator current)
	 */
	public void initVariabilityType(Object input, Enumerator current) {
		variabilityType.setInput(input);
		variabilityType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.variabilityType);
		if (eefElementEditorReadOnlyState && variabilityType.isEnabled()) {
			variabilityType.setEnabled(false);
			variabilityType.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityType.isEnabled()) {
			variabilityType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#setVariabilityType(Enumerator newValue)
	 * 
	 */
	public void setVariabilityType(Enumerator newValue) {
		variabilityType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.variabilityType);
		if (eefElementEditorReadOnlyState && variabilityType.isEnabled()) {
			variabilityType.setEnabled(false);
			variabilityType.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityType.isEnabled()) {
			variabilityType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#getVariabilityBasedOnElement()
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
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#initVariabilityBasedOnElement(EObjectFlatComboSettings)
	 */
	public void initVariabilityBasedOnElement(EObjectFlatComboSettings settings) {
		variabilityBasedOnElement.setInput(settings);
		if (current != null) {
			variabilityBasedOnElement.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.variabilityBasedOnElement);
		if (eefElementEditorReadOnlyState && variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(false);
			variabilityBasedOnElement.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#setVariabilityBasedOnElement(EObject newValue)
	 * 
	 */
	public void setVariabilityBasedOnElement(EObject newValue) {
		if (newValue != null) {
			variabilityBasedOnElement.setSelection(new StructuredSelection(newValue));
		} else {
			variabilityBasedOnElement.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.variabilityBasedOnElement);
		if (eefElementEditorReadOnlyState && variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(false);
			variabilityBasedOnElement.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !variabilityBasedOnElement.isEnabled()) {
			variabilityBasedOnElement.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue)
	 */
	public void setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue) {
		variabilityBasedOnElement.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#addFilterVariabilityBasedOnElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToVariabilityBasedOnElement(ViewerFilter filter) {
		variabilityBasedOnElement.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#addBusinessFilterVariabilityBasedOnElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToVariabilityBasedOnElement(ViewerFilter filter) {
		variabilityBasedOnElement.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#getMethodContentKind()
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
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#initMethodContentKind(EObjectFlatComboSettings)
	 */
	public void initMethodContentKind(EObjectFlatComboSettings settings) {
		methodContentKind.setInput(settings);
		if (current != null) {
			methodContentKind.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.methodContentKind);
		if (eefElementEditorReadOnlyState && methodContentKind.isEnabled()) {
			methodContentKind.setEnabled(false);
			methodContentKind.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !methodContentKind.isEnabled()) {
			methodContentKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#setMethodContentKind(EObject newValue)
	 * 
	 */
	public void setMethodContentKind(EObject newValue) {
		if (newValue != null) {
			methodContentKind.setSelection(new StructuredSelection(newValue));
		} else {
			methodContentKind.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.methodContentKind);
		if (eefElementEditorReadOnlyState && methodContentKind.isEnabled()) {
			methodContentKind.setEnabled(false);
			methodContentKind.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !methodContentKind.isEnabled()) {
			methodContentKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#setMethodContentKindButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMethodContentKindButtonMode(ButtonsModeEnum newValue) {
		methodContentKind.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#addFilterMethodContentKind(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMethodContentKind(ViewerFilter filter) {
		methodContentKind.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#addBusinessFilterMethodContentKind(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMethodContentKind(ViewerFilter filter) {
		methodContentKind.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#initLinkedRoleDefinition(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initLinkedRoleDefinition(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		linkedRoleDefinition.setContentProvider(contentProvider);
		linkedRoleDefinition.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.linkedRoleDefinition);
		if (eefElementEditorReadOnlyState && linkedRoleDefinition.getTable().isEnabled()) {
			linkedRoleDefinition.setEnabled(false);
			linkedRoleDefinition.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !linkedRoleDefinition.getTable().isEnabled()) {
			linkedRoleDefinition.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#updateLinkedRoleDefinition()
	 * 
	 */
	public void updateLinkedRoleDefinition() {
	linkedRoleDefinition.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#addFilterLinkedRoleDefinition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLinkedRoleDefinition(ViewerFilter filter) {
		linkedRoleDefinitionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#addBusinessFilterLinkedRoleDefinition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLinkedRoleDefinition(ViewerFilter filter) {
		linkedRoleDefinitionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#isContainedInLinkedRoleDefinitionTable(EObject element)
	 * 
	 */
	public boolean isContainedInLinkedRoleDefinitionTable(EObject element) {
		return ((ReferencesTableSettings)linkedRoleDefinition.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#getLinkedWorkProductDefinition()
	 * 
	 */
	public EObject getLinkedWorkProductDefinition() {
		if (linkedWorkProductDefinition.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) linkedWorkProductDefinition.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#initLinkedWorkProductDefinition(EObjectFlatComboSettings)
	 */
	public void initLinkedWorkProductDefinition(EObjectFlatComboSettings settings) {
		linkedWorkProductDefinition.setInput(settings);
		if (current != null) {
			linkedWorkProductDefinition.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.linkedWorkProductDefinition);
		if (eefElementEditorReadOnlyState && linkedWorkProductDefinition.isEnabled()) {
			linkedWorkProductDefinition.setEnabled(false);
			linkedWorkProductDefinition.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !linkedWorkProductDefinition.isEnabled()) {
			linkedWorkProductDefinition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#setLinkedWorkProductDefinition(EObject newValue)
	 * 
	 */
	public void setLinkedWorkProductDefinition(EObject newValue) {
		if (newValue != null) {
			linkedWorkProductDefinition.setSelection(new StructuredSelection(newValue));
		} else {
			linkedWorkProductDefinition.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_ResponsibilityAssignment.Properties.linkedWorkProductDefinition);
		if (eefElementEditorReadOnlyState && linkedWorkProductDefinition.isEnabled()) {
			linkedWorkProductDefinition.setEnabled(false);
			linkedWorkProductDefinition.setToolTipText(SpemMessages.Default_ResponsibilityAssignment_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !linkedWorkProductDefinition.isEnabled()) {
			linkedWorkProductDefinition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#setLinkedWorkProductDefinitionButtonMode(ButtonsModeEnum newValue)
	 */
	public void setLinkedWorkProductDefinitionButtonMode(ButtonsModeEnum newValue) {
		linkedWorkProductDefinition.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#addFilterLinkedWorkProductDefinition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLinkedWorkProductDefinition(ViewerFilter filter) {
		linkedWorkProductDefinition.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_ResponsibilityAssignmentPropertiesEditionPart#addBusinessFilterLinkedWorkProductDefinition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLinkedWorkProductDefinition(ViewerFilter filter) {
		linkedWorkProductDefinition.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SpemMessages.Default_ResponsibilityAssignment_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
