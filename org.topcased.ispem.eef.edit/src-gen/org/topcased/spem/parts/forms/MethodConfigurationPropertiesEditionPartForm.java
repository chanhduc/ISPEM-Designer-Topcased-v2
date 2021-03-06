/**
 * Generated with Acceleo
 */
package org.topcased.spem.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

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
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart;
import org.topcased.spem.parts.SpemViewsRepository;

import org.topcased.spem.providers.SpemMessages;

// End of user code

/**
 * 
 * 
 */
public class MethodConfigurationPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, MethodConfigurationPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable baseConfiguration;
	protected List<ViewerFilter> baseConfigurationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> baseConfigurationFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable processPackageSelection;
	protected List<ViewerFilter> processPackageSelectionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> processPackageSelectionFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable contentPackageSelection;
	protected List<ViewerFilter> contentPackageSelectionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> contentPackageSelectionFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable substractedCategory;
	protected List<ViewerFilter> substractedCategoryBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> substractedCategoryFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer defaultView;
	protected ReferencesTable processView;
	protected List<ViewerFilter> processViewBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> processViewFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public MethodConfigurationPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MethodConfigurationPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence methodConfigurationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = methodConfigurationStep.addStep(SpemViewsRepository.MethodConfiguration.Properties.class);
		propertiesStep.addStep(SpemViewsRepository.MethodConfiguration.Properties.name);
		propertiesStep.addStep(SpemViewsRepository.MethodConfiguration.Properties.baseConfiguration);
		propertiesStep.addStep(SpemViewsRepository.MethodConfiguration.Properties.processPackageSelection);
		propertiesStep.addStep(SpemViewsRepository.MethodConfiguration.Properties.contentPackageSelection);
		propertiesStep.addStep(SpemViewsRepository.MethodConfiguration.Properties.substractedCategory);
		propertiesStep.addStep(SpemViewsRepository.MethodConfiguration.Properties.defaultView);
		propertiesStep.addStep(SpemViewsRepository.MethodConfiguration.Properties.processView);
		
		
		composer = new PartComposer(methodConfigurationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SpemViewsRepository.MethodConfiguration.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.MethodConfiguration.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.MethodConfiguration.Properties.baseConfiguration) {
					return createBaseConfigurationReferencesTable(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.MethodConfiguration.Properties.processPackageSelection) {
					return createProcessPackageSelectionReferencesTable(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.MethodConfiguration.Properties.contentPackageSelection) {
					return createContentPackageSelectionReferencesTable(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.MethodConfiguration.Properties.substractedCategory) {
					return createSubstractedCategoryReferencesTable(widgetFactory, parent);
				}
				if (key == SpemViewsRepository.MethodConfiguration.Properties.defaultView) {
					return createDefaultViewFlatComboViewer(parent, widgetFactory);
				}
				if (key == SpemViewsRepository.MethodConfiguration.Properties.processView) {
					return createProcessViewReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(SpemMessages.MethodConfigurationPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SpemViewsRepository.MethodConfiguration.Properties.name, SpemMessages.MethodConfigurationPropertiesEditionPart_NameLabel);
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
							MethodConfigurationPropertiesEditionPartForm.this,
							SpemViewsRepository.MethodConfiguration.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									MethodConfigurationPropertiesEditionPartForm.this,
									SpemViewsRepository.MethodConfiguration.Properties.name,
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
									MethodConfigurationPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, SpemViewsRepository.MethodConfiguration.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.MethodConfiguration.Properties.name, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createBaseConfigurationReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.baseConfiguration = new ReferencesTable(getDescription(SpemViewsRepository.MethodConfiguration.Properties.baseConfiguration, SpemMessages.MethodConfigurationPropertiesEditionPart_BaseConfigurationLabel), new ReferencesTableListener	() {
			public void handleAdd() { addBaseConfiguration(); }
			public void handleEdit(EObject element) { editBaseConfiguration(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveBaseConfiguration(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromBaseConfiguration(element); }
			public void navigateTo(EObject element) { }
		});
		this.baseConfiguration.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.MethodConfiguration.Properties.baseConfiguration, SpemViewsRepository.FORM_KIND));
		this.baseConfiguration.createControls(parent, widgetFactory);
		this.baseConfiguration.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.baseConfiguration, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData baseConfigurationData = new GridData(GridData.FILL_HORIZONTAL);
		baseConfigurationData.horizontalSpan = 3;
		this.baseConfiguration.setLayoutData(baseConfigurationData);
		this.baseConfiguration.disableMove();
		baseConfiguration.setID(SpemViewsRepository.MethodConfiguration.Properties.baseConfiguration);
		baseConfiguration.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createBaseConfigurationReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addBaseConfiguration() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(baseConfiguration.getInput(), baseConfigurationFilters, baseConfigurationBusinessFilters,
		"baseConfiguration", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.baseConfiguration,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				baseConfiguration.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveBaseConfiguration(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.baseConfiguration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		baseConfiguration.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromBaseConfiguration(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.baseConfiguration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		baseConfiguration.refresh();
	}

	/**
	 * 
	 */
	protected void editBaseConfiguration(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				baseConfiguration.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createProcessPackageSelectionReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.processPackageSelection = new ReferencesTable(getDescription(SpemViewsRepository.MethodConfiguration.Properties.processPackageSelection, SpemMessages.MethodConfigurationPropertiesEditionPart_ProcessPackageSelectionLabel), new ReferencesTableListener	() {
			public void handleAdd() { addProcessPackageSelection(); }
			public void handleEdit(EObject element) { editProcessPackageSelection(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProcessPackageSelection(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProcessPackageSelection(element); }
			public void navigateTo(EObject element) { }
		});
		this.processPackageSelection.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.MethodConfiguration.Properties.processPackageSelection, SpemViewsRepository.FORM_KIND));
		this.processPackageSelection.createControls(parent, widgetFactory);
		this.processPackageSelection.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.processPackageSelection, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData processPackageSelectionData = new GridData(GridData.FILL_HORIZONTAL);
		processPackageSelectionData.horizontalSpan = 3;
		this.processPackageSelection.setLayoutData(processPackageSelectionData);
		this.processPackageSelection.disableMove();
		processPackageSelection.setID(SpemViewsRepository.MethodConfiguration.Properties.processPackageSelection);
		processPackageSelection.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createProcessPackageSelectionReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addProcessPackageSelection() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(processPackageSelection.getInput(), processPackageSelectionFilters, processPackageSelectionBusinessFilters,
		"processPackageSelection", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.processPackageSelection,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				processPackageSelection.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveProcessPackageSelection(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.processPackageSelection, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		processPackageSelection.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProcessPackageSelection(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.processPackageSelection, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		processPackageSelection.refresh();
	}

	/**
	 * 
	 */
	protected void editProcessPackageSelection(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				processPackageSelection.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createContentPackageSelectionReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.contentPackageSelection = new ReferencesTable(getDescription(SpemViewsRepository.MethodConfiguration.Properties.contentPackageSelection, SpemMessages.MethodConfigurationPropertiesEditionPart_ContentPackageSelectionLabel), new ReferencesTableListener	() {
			public void handleAdd() { addContentPackageSelection(); }
			public void handleEdit(EObject element) { editContentPackageSelection(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveContentPackageSelection(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromContentPackageSelection(element); }
			public void navigateTo(EObject element) { }
		});
		this.contentPackageSelection.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.MethodConfiguration.Properties.contentPackageSelection, SpemViewsRepository.FORM_KIND));
		this.contentPackageSelection.createControls(parent, widgetFactory);
		this.contentPackageSelection.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.contentPackageSelection, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData contentPackageSelectionData = new GridData(GridData.FILL_HORIZONTAL);
		contentPackageSelectionData.horizontalSpan = 3;
		this.contentPackageSelection.setLayoutData(contentPackageSelectionData);
		this.contentPackageSelection.disableMove();
		contentPackageSelection.setID(SpemViewsRepository.MethodConfiguration.Properties.contentPackageSelection);
		contentPackageSelection.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createContentPackageSelectionReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addContentPackageSelection() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(contentPackageSelection.getInput(), contentPackageSelectionFilters, contentPackageSelectionBusinessFilters,
		"contentPackageSelection", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.contentPackageSelection,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				contentPackageSelection.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveContentPackageSelection(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.contentPackageSelection, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		contentPackageSelection.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromContentPackageSelection(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.contentPackageSelection, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		contentPackageSelection.refresh();
	}

	/**
	 * 
	 */
	protected void editContentPackageSelection(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				contentPackageSelection.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSubstractedCategoryReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.substractedCategory = new ReferencesTable(getDescription(SpemViewsRepository.MethodConfiguration.Properties.substractedCategory, SpemMessages.MethodConfigurationPropertiesEditionPart_SubstractedCategoryLabel), new ReferencesTableListener	() {
			public void handleAdd() { addSubstractedCategory(); }
			public void handleEdit(EObject element) { editSubstractedCategory(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSubstractedCategory(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSubstractedCategory(element); }
			public void navigateTo(EObject element) { }
		});
		this.substractedCategory.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.MethodConfiguration.Properties.substractedCategory, SpemViewsRepository.FORM_KIND));
		this.substractedCategory.createControls(parent, widgetFactory);
		this.substractedCategory.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.substractedCategory, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData substractedCategoryData = new GridData(GridData.FILL_HORIZONTAL);
		substractedCategoryData.horizontalSpan = 3;
		this.substractedCategory.setLayoutData(substractedCategoryData);
		this.substractedCategory.disableMove();
		substractedCategory.setID(SpemViewsRepository.MethodConfiguration.Properties.substractedCategory);
		substractedCategory.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createSubstractedCategoryReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addSubstractedCategory() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(substractedCategory.getInput(), substractedCategoryFilters, substractedCategoryBusinessFilters,
		"substractedCategory", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.substractedCategory,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				substractedCategory.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSubstractedCategory(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.substractedCategory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		substractedCategory.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSubstractedCategory(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.substractedCategory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		substractedCategory.refresh();
	}

	/**
	 * 
	 */
	protected void editSubstractedCategory(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				substractedCategory.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createDefaultViewFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SpemViewsRepository.MethodConfiguration.Properties.defaultView, SpemMessages.MethodConfigurationPropertiesEditionPart_DefaultViewLabel);
		defaultView = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SpemViewsRepository.MethodConfiguration.Properties.defaultView, SpemViewsRepository.FORM_KIND));
		widgetFactory.adapt(defaultView);
		defaultView.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData defaultViewData = new GridData(GridData.FILL_HORIZONTAL);
		defaultView.setLayoutData(defaultViewData);
		defaultView.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.defaultView, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDefaultView()));
			}

		});
		defaultView.setID(SpemViewsRepository.MethodConfiguration.Properties.defaultView);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.MethodConfiguration.Properties.defaultView, SpemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDefaultViewFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createProcessViewReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.processView = new ReferencesTable(getDescription(SpemViewsRepository.MethodConfiguration.Properties.processView, SpemMessages.MethodConfigurationPropertiesEditionPart_ProcessViewLabel), new ReferencesTableListener	() {
			public void handleAdd() { addProcessView(); }
			public void handleEdit(EObject element) { editProcessView(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProcessView(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProcessView(element); }
			public void navigateTo(EObject element) { }
		});
		this.processView.setHelpText(propertiesEditionComponent.getHelpContent(SpemViewsRepository.MethodConfiguration.Properties.processView, SpemViewsRepository.FORM_KIND));
		this.processView.createControls(parent, widgetFactory);
		this.processView.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.processView, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData processViewData = new GridData(GridData.FILL_HORIZONTAL);
		processViewData.horizontalSpan = 3;
		this.processView.setLayoutData(processViewData);
		this.processView.disableMove();
		processView.setID(SpemViewsRepository.MethodConfiguration.Properties.processView);
		processView.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createProcessViewReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addProcessView() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(processView.getInput(), processViewFilters, processViewBusinessFilters,
		"processView", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.processView,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				processView.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveProcessView(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.processView, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		processView.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProcessView(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MethodConfigurationPropertiesEditionPartForm.this, SpemViewsRepository.MethodConfiguration.Properties.processView, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		processView.refresh();
	}

	/**
	 * 
	 */
	protected void editProcessView(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				processView.refresh();
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
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.MethodConfiguration.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SpemMessages.MethodConfiguration_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#initBaseConfiguration(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initBaseConfiguration(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		baseConfiguration.setContentProvider(contentProvider);
		baseConfiguration.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.MethodConfiguration.Properties.baseConfiguration);
		if (eefElementEditorReadOnlyState && baseConfiguration.getTable().isEnabled()) {
			baseConfiguration.setEnabled(false);
			baseConfiguration.setToolTipText(SpemMessages.MethodConfiguration_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !baseConfiguration.getTable().isEnabled()) {
			baseConfiguration.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#updateBaseConfiguration()
	 * 
	 */
	public void updateBaseConfiguration() {
	baseConfiguration.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#addFilterBaseConfiguration(ViewerFilter filter)
	 * 
	 */
	public void addFilterToBaseConfiguration(ViewerFilter filter) {
		baseConfigurationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#addBusinessFilterBaseConfiguration(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToBaseConfiguration(ViewerFilter filter) {
		baseConfigurationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#isContainedInBaseConfigurationTable(EObject element)
	 * 
	 */
	public boolean isContainedInBaseConfigurationTable(EObject element) {
		return ((ReferencesTableSettings)baseConfiguration.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#initProcessPackageSelection(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initProcessPackageSelection(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		processPackageSelection.setContentProvider(contentProvider);
		processPackageSelection.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.MethodConfiguration.Properties.processPackageSelection);
		if (eefElementEditorReadOnlyState && processPackageSelection.getTable().isEnabled()) {
			processPackageSelection.setEnabled(false);
			processPackageSelection.setToolTipText(SpemMessages.MethodConfiguration_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !processPackageSelection.getTable().isEnabled()) {
			processPackageSelection.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#updateProcessPackageSelection()
	 * 
	 */
	public void updateProcessPackageSelection() {
	processPackageSelection.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#addFilterProcessPackageSelection(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcessPackageSelection(ViewerFilter filter) {
		processPackageSelectionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#addBusinessFilterProcessPackageSelection(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcessPackageSelection(ViewerFilter filter) {
		processPackageSelectionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#isContainedInProcessPackageSelectionTable(EObject element)
	 * 
	 */
	public boolean isContainedInProcessPackageSelectionTable(EObject element) {
		return ((ReferencesTableSettings)processPackageSelection.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#initContentPackageSelection(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initContentPackageSelection(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		contentPackageSelection.setContentProvider(contentProvider);
		contentPackageSelection.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.MethodConfiguration.Properties.contentPackageSelection);
		if (eefElementEditorReadOnlyState && contentPackageSelection.getTable().isEnabled()) {
			contentPackageSelection.setEnabled(false);
			contentPackageSelection.setToolTipText(SpemMessages.MethodConfiguration_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !contentPackageSelection.getTable().isEnabled()) {
			contentPackageSelection.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#updateContentPackageSelection()
	 * 
	 */
	public void updateContentPackageSelection() {
	contentPackageSelection.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#addFilterContentPackageSelection(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContentPackageSelection(ViewerFilter filter) {
		contentPackageSelectionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#addBusinessFilterContentPackageSelection(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContentPackageSelection(ViewerFilter filter) {
		contentPackageSelectionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#isContainedInContentPackageSelectionTable(EObject element)
	 * 
	 */
	public boolean isContainedInContentPackageSelectionTable(EObject element) {
		return ((ReferencesTableSettings)contentPackageSelection.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#initSubstractedCategory(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSubstractedCategory(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		substractedCategory.setContentProvider(contentProvider);
		substractedCategory.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.MethodConfiguration.Properties.substractedCategory);
		if (eefElementEditorReadOnlyState && substractedCategory.getTable().isEnabled()) {
			substractedCategory.setEnabled(false);
			substractedCategory.setToolTipText(SpemMessages.MethodConfiguration_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !substractedCategory.getTable().isEnabled()) {
			substractedCategory.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#updateSubstractedCategory()
	 * 
	 */
	public void updateSubstractedCategory() {
	substractedCategory.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#addFilterSubstractedCategory(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSubstractedCategory(ViewerFilter filter) {
		substractedCategoryFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#addBusinessFilterSubstractedCategory(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSubstractedCategory(ViewerFilter filter) {
		substractedCategoryBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#isContainedInSubstractedCategoryTable(EObject element)
	 * 
	 */
	public boolean isContainedInSubstractedCategoryTable(EObject element) {
		return ((ReferencesTableSettings)substractedCategory.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#getDefaultView()
	 * 
	 */
	public EObject getDefaultView() {
		if (defaultView.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) defaultView.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#initDefaultView(EObjectFlatComboSettings)
	 */
	public void initDefaultView(EObjectFlatComboSettings settings) {
		defaultView.setInput(settings);
		if (current != null) {
			defaultView.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.MethodConfiguration.Properties.defaultView);
		if (eefElementEditorReadOnlyState && defaultView.isEnabled()) {
			defaultView.setEnabled(false);
			defaultView.setToolTipText(SpemMessages.MethodConfiguration_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !defaultView.isEnabled()) {
			defaultView.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#setDefaultView(EObject newValue)
	 * 
	 */
	public void setDefaultView(EObject newValue) {
		if (newValue != null) {
			defaultView.setSelection(new StructuredSelection(newValue));
		} else {
			defaultView.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.MethodConfiguration.Properties.defaultView);
		if (eefElementEditorReadOnlyState && defaultView.isEnabled()) {
			defaultView.setEnabled(false);
			defaultView.setToolTipText(SpemMessages.MethodConfiguration_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !defaultView.isEnabled()) {
			defaultView.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#setDefaultViewButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDefaultViewButtonMode(ButtonsModeEnum newValue) {
		defaultView.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#addFilterDefaultView(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDefaultView(ViewerFilter filter) {
		defaultView.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#addBusinessFilterDefaultView(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDefaultView(ViewerFilter filter) {
		defaultView.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#initProcessView(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initProcessView(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		processView.setContentProvider(contentProvider);
		processView.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.MethodConfiguration.Properties.processView);
		if (eefElementEditorReadOnlyState && processView.getTable().isEnabled()) {
			processView.setEnabled(false);
			processView.setToolTipText(SpemMessages.MethodConfiguration_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !processView.getTable().isEnabled()) {
			processView.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#updateProcessView()
	 * 
	 */
	public void updateProcessView() {
	processView.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#addFilterProcessView(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcessView(ViewerFilter filter) {
		processViewFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#addBusinessFilterProcessView(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcessView(ViewerFilter filter) {
		processViewBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.MethodConfigurationPropertiesEditionPart#isContainedInProcessViewTable(EObject element)
	 * 
	 */
	public boolean isContainedInProcessViewTable(EObject element) {
		return ((ReferencesTableSettings)processView.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SpemMessages.MethodConfiguration_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
