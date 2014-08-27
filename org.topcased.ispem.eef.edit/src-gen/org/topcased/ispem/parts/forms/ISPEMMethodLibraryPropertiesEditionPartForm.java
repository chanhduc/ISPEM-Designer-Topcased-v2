/**
 * Generated with Acceleo
 */
package org.topcased.ispem.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

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

import org.topcased.ispem.parts.ISPEMMethodLibraryPropertiesEditionPart;
import org.topcased.ispem.parts.IspemViewsRepository;

import org.topcased.ispem.providers.IspemMessages;

// End of user code

/**
 * 
 * 
 */
public class ISPEMMethodLibraryPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ISPEMMethodLibraryPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable ownedMethodPlugin;
	protected List<ViewerFilter> ownedMethodPluginBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedMethodPluginFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable predefinedConfiguration;
	protected List<ViewerFilter> predefinedConfigurationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> predefinedConfigurationFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public ISPEMMethodLibraryPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ISPEMMethodLibraryPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence iSPEMMethodLibraryStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = iSPEMMethodLibraryStep.addStep(IspemViewsRepository.ISPEMMethodLibrary.Properties.class);
		propertiesStep.addStep(IspemViewsRepository.ISPEMMethodLibrary.Properties.name);
		propertiesStep.addStep(IspemViewsRepository.ISPEMMethodLibrary.Properties.ownedMethodPlugin);
		propertiesStep.addStep(IspemViewsRepository.ISPEMMethodLibrary.Properties.predefinedConfiguration);
		
		
		composer = new PartComposer(iSPEMMethodLibraryStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == IspemViewsRepository.ISPEMMethodLibrary.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == IspemViewsRepository.ISPEMMethodLibrary.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == IspemViewsRepository.ISPEMMethodLibrary.Properties.ownedMethodPlugin) {
					return createOwnedMethodPluginTableComposition(widgetFactory, parent);
				}
				if (key == IspemViewsRepository.ISPEMMethodLibrary.Properties.predefinedConfiguration) {
					return createPredefinedConfigurationTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(IspemMessages.ISPEMMethodLibraryPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, IspemViewsRepository.ISPEMMethodLibrary.Properties.name, IspemMessages.ISPEMMethodLibraryPropertiesEditionPart_NameLabel);
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
							ISPEMMethodLibraryPropertiesEditionPartForm.this,
							IspemViewsRepository.ISPEMMethodLibrary.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ISPEMMethodLibraryPropertiesEditionPartForm.this,
									IspemViewsRepository.ISPEMMethodLibrary.Properties.name,
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
									ISPEMMethodLibraryPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ISPEMMethodLibraryPropertiesEditionPartForm.this, IspemViewsRepository.ISPEMMethodLibrary.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, IspemViewsRepository.ISPEMMethodLibrary.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.ISPEMMethodLibrary.Properties.name, IspemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedMethodPluginTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ownedMethodPlugin = new ReferencesTable(getDescription(IspemViewsRepository.ISPEMMethodLibrary.Properties.ownedMethodPlugin, IspemMessages.ISPEMMethodLibraryPropertiesEditionPart_OwnedMethodPluginLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ISPEMMethodLibraryPropertiesEditionPartForm.this, IspemViewsRepository.ISPEMMethodLibrary.Properties.ownedMethodPlugin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedMethodPlugin.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ISPEMMethodLibraryPropertiesEditionPartForm.this, IspemViewsRepository.ISPEMMethodLibrary.Properties.ownedMethodPlugin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedMethodPlugin.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ISPEMMethodLibraryPropertiesEditionPartForm.this, IspemViewsRepository.ISPEMMethodLibrary.Properties.ownedMethodPlugin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedMethodPlugin.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ISPEMMethodLibraryPropertiesEditionPartForm.this, IspemViewsRepository.ISPEMMethodLibrary.Properties.ownedMethodPlugin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedMethodPlugin.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedMethodPluginFilters) {
			this.ownedMethodPlugin.addFilter(filter);
		}
		this.ownedMethodPlugin.setHelpText(propertiesEditionComponent.getHelpContent(IspemViewsRepository.ISPEMMethodLibrary.Properties.ownedMethodPlugin, IspemViewsRepository.FORM_KIND));
		this.ownedMethodPlugin.createControls(parent, widgetFactory);
		this.ownedMethodPlugin.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ISPEMMethodLibraryPropertiesEditionPartForm.this, IspemViewsRepository.ISPEMMethodLibrary.Properties.ownedMethodPlugin, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownedMethodPluginData = new GridData(GridData.FILL_HORIZONTAL);
		ownedMethodPluginData.horizontalSpan = 3;
		this.ownedMethodPlugin.setLayoutData(ownedMethodPluginData);
		this.ownedMethodPlugin.setLowerBound(0);
		this.ownedMethodPlugin.setUpperBound(-1);
		ownedMethodPlugin.setID(IspemViewsRepository.ISPEMMethodLibrary.Properties.ownedMethodPlugin);
		ownedMethodPlugin.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedMethodPluginTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPredefinedConfigurationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.predefinedConfiguration = new ReferencesTable(getDescription(IspemViewsRepository.ISPEMMethodLibrary.Properties.predefinedConfiguration, IspemMessages.ISPEMMethodLibraryPropertiesEditionPart_PredefinedConfigurationLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ISPEMMethodLibraryPropertiesEditionPartForm.this, IspemViewsRepository.ISPEMMethodLibrary.Properties.predefinedConfiguration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				predefinedConfiguration.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ISPEMMethodLibraryPropertiesEditionPartForm.this, IspemViewsRepository.ISPEMMethodLibrary.Properties.predefinedConfiguration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				predefinedConfiguration.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ISPEMMethodLibraryPropertiesEditionPartForm.this, IspemViewsRepository.ISPEMMethodLibrary.Properties.predefinedConfiguration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				predefinedConfiguration.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ISPEMMethodLibraryPropertiesEditionPartForm.this, IspemViewsRepository.ISPEMMethodLibrary.Properties.predefinedConfiguration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				predefinedConfiguration.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.predefinedConfigurationFilters) {
			this.predefinedConfiguration.addFilter(filter);
		}
		this.predefinedConfiguration.setHelpText(propertiesEditionComponent.getHelpContent(IspemViewsRepository.ISPEMMethodLibrary.Properties.predefinedConfiguration, IspemViewsRepository.FORM_KIND));
		this.predefinedConfiguration.createControls(parent, widgetFactory);
		this.predefinedConfiguration.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ISPEMMethodLibraryPropertiesEditionPartForm.this, IspemViewsRepository.ISPEMMethodLibrary.Properties.predefinedConfiguration, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData predefinedConfigurationData = new GridData(GridData.FILL_HORIZONTAL);
		predefinedConfigurationData.horizontalSpan = 3;
		this.predefinedConfiguration.setLayoutData(predefinedConfigurationData);
		this.predefinedConfiguration.setLowerBound(0);
		this.predefinedConfiguration.setUpperBound(-1);
		predefinedConfiguration.setID(IspemViewsRepository.ISPEMMethodLibrary.Properties.predefinedConfiguration);
		predefinedConfiguration.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createPredefinedConfigurationTableComposition

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
	 * @see org.topcased.ispem.parts.ISPEMMethodLibraryPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.ISPEMMethodLibraryPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.ISPEMMethodLibrary.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(IspemMessages.ISPEMMethodLibrary_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.ISPEMMethodLibraryPropertiesEditionPart#initOwnedMethodPlugin(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedMethodPlugin(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedMethodPlugin.setContentProvider(contentProvider);
		ownedMethodPlugin.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.ISPEMMethodLibrary.Properties.ownedMethodPlugin);
		if (eefElementEditorReadOnlyState && ownedMethodPlugin.isEnabled()) {
			ownedMethodPlugin.setEnabled(false);
			ownedMethodPlugin.setToolTipText(IspemMessages.ISPEMMethodLibrary_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedMethodPlugin.isEnabled()) {
			ownedMethodPlugin.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.ISPEMMethodLibraryPropertiesEditionPart#updateOwnedMethodPlugin()
	 * 
	 */
	public void updateOwnedMethodPlugin() {
	ownedMethodPlugin.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.ISPEMMethodLibraryPropertiesEditionPart#addFilterOwnedMethodPlugin(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwnedMethodPlugin(ViewerFilter filter) {
		ownedMethodPluginFilters.add(filter);
		if (this.ownedMethodPlugin != null) {
			this.ownedMethodPlugin.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.ISPEMMethodLibraryPropertiesEditionPart#addBusinessFilterOwnedMethodPlugin(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnedMethodPlugin(ViewerFilter filter) {
		ownedMethodPluginBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.ISPEMMethodLibraryPropertiesEditionPart#isContainedInOwnedMethodPluginTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnedMethodPluginTable(EObject element) {
		return ((ReferencesTableSettings)ownedMethodPlugin.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.ISPEMMethodLibraryPropertiesEditionPart#initPredefinedConfiguration(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initPredefinedConfiguration(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		predefinedConfiguration.setContentProvider(contentProvider);
		predefinedConfiguration.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.ISPEMMethodLibrary.Properties.predefinedConfiguration);
		if (eefElementEditorReadOnlyState && predefinedConfiguration.isEnabled()) {
			predefinedConfiguration.setEnabled(false);
			predefinedConfiguration.setToolTipText(IspemMessages.ISPEMMethodLibrary_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !predefinedConfiguration.isEnabled()) {
			predefinedConfiguration.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.ISPEMMethodLibraryPropertiesEditionPart#updatePredefinedConfiguration()
	 * 
	 */
	public void updatePredefinedConfiguration() {
	predefinedConfiguration.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.ISPEMMethodLibraryPropertiesEditionPart#addFilterPredefinedConfiguration(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPredefinedConfiguration(ViewerFilter filter) {
		predefinedConfigurationFilters.add(filter);
		if (this.predefinedConfiguration != null) {
			this.predefinedConfiguration.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.ISPEMMethodLibraryPropertiesEditionPart#addBusinessFilterPredefinedConfiguration(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPredefinedConfiguration(ViewerFilter filter) {
		predefinedConfigurationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.ISPEMMethodLibraryPropertiesEditionPart#isContainedInPredefinedConfigurationTable(EObject element)
	 * 
	 */
	public boolean isContainedInPredefinedConfigurationTable(EObject element) {
		return ((ReferencesTableSettings)predefinedConfiguration.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return IspemMessages.ISPEMMethodLibrary_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
