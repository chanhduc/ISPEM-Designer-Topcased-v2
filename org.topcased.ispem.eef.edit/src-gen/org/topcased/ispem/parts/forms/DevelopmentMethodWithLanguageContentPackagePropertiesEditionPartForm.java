/**
 * Generated with Acceleo
 */
package org.topcased.ispem.parts.forms;

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

import org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart;
import org.topcased.ispem.parts.IspemViewsRepository;

import org.topcased.ispem.providers.IspemMessages;

// End of user code

/**
 * 
 * 
 */
public class DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart {

	protected Text name;
	protected ReferencesTable ownedMethodContentMember;
	protected List<ViewerFilter> ownedMethodContentMemberBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedMethodContentMemberFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable reusedPackage;
	protected List<ViewerFilter> reusedPackageBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> reusedPackageFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer relatedLanguage;
	protected EObjectFlatComboViewer relatedMethod;



	/**
	 * For {@link ISection} use only.
	 */
	public DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence developmentMethodWithLanguageContentPackageStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = developmentMethodWithLanguageContentPackageStep.addStep(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.class);
		propertiesStep.addStep(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.name);
		propertiesStep.addStep(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.ownedMethodContentMember);
		propertiesStep.addStep(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.reusedPackage);
		propertiesStep.addStep(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedLanguage);
		propertiesStep.addStep(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedMethod);
		
		
		composer = new PartComposer(developmentMethodWithLanguageContentPackageStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.ownedMethodContentMember) {
					return createOwnedMethodContentMemberTableComposition(widgetFactory, parent);
				}
				if (key == IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.reusedPackage) {
					return createReusedPackageReferencesTable(widgetFactory, parent);
				}
				if (key == IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedLanguage) {
					return createRelatedLanguageFlatComboViewer(parent, widgetFactory);
				}
				if (key == IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedMethod) {
					return createRelatedMethodFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(IspemMessages.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.name, IspemMessages.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart_NameLabel);
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
							DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm.this,
							IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm.this,
									IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.name,
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
									DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm.this, IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.name, IspemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedMethodContentMemberTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ownedMethodContentMember = new ReferencesTable(getDescription(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.ownedMethodContentMember, IspemMessages.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart_OwnedMethodContentMemberLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm.this, IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.ownedMethodContentMember, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedMethodContentMember.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm.this, IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.ownedMethodContentMember, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedMethodContentMember.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm.this, IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.ownedMethodContentMember, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedMethodContentMember.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm.this, IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.ownedMethodContentMember, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedMethodContentMember.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedMethodContentMemberFilters) {
			this.ownedMethodContentMember.addFilter(filter);
		}
		this.ownedMethodContentMember.setHelpText(propertiesEditionComponent.getHelpContent(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.ownedMethodContentMember, IspemViewsRepository.FORM_KIND));
		this.ownedMethodContentMember.createControls(parent, widgetFactory);
		this.ownedMethodContentMember.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm.this, IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.ownedMethodContentMember, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownedMethodContentMemberData = new GridData(GridData.FILL_HORIZONTAL);
		ownedMethodContentMemberData.horizontalSpan = 3;
		this.ownedMethodContentMember.setLayoutData(ownedMethodContentMemberData);
		this.ownedMethodContentMember.setLowerBound(0);
		this.ownedMethodContentMember.setUpperBound(-1);
		ownedMethodContentMember.setID(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.ownedMethodContentMember);
		ownedMethodContentMember.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedMethodContentMemberTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createReusedPackageReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.reusedPackage = new ReferencesTable(getDescription(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.reusedPackage, IspemMessages.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart_ReusedPackageLabel), new ReferencesTableListener	() {
			public void handleAdd() { addReusedPackage(); }
			public void handleEdit(EObject element) { editReusedPackage(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveReusedPackage(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromReusedPackage(element); }
			public void navigateTo(EObject element) { }
		});
		this.reusedPackage.setHelpText(propertiesEditionComponent.getHelpContent(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.reusedPackage, IspemViewsRepository.FORM_KIND));
		this.reusedPackage.createControls(parent, widgetFactory);
		this.reusedPackage.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm.this, IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.reusedPackage, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData reusedPackageData = new GridData(GridData.FILL_HORIZONTAL);
		reusedPackageData.horizontalSpan = 3;
		this.reusedPackage.setLayoutData(reusedPackageData);
		this.reusedPackage.disableMove();
		reusedPackage.setID(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.reusedPackage);
		reusedPackage.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createReusedPackageReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addReusedPackage() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(reusedPackage.getInput(), reusedPackageFilters, reusedPackageBusinessFilters,
		"reusedPackage", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm.this, IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.reusedPackage,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				reusedPackage.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveReusedPackage(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm.this, IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.reusedPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		reusedPackage.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromReusedPackage(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm.this, IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.reusedPackage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		reusedPackage.refresh();
	}

	/**
	 * 
	 */
	protected void editReusedPackage(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				reusedPackage.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRelatedLanguageFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedLanguage, IspemMessages.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart_RelatedLanguageLabel);
		relatedLanguage = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedLanguage, IspemViewsRepository.FORM_KIND));
		widgetFactory.adapt(relatedLanguage);
		relatedLanguage.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData relatedLanguageData = new GridData(GridData.FILL_HORIZONTAL);
		relatedLanguage.setLayoutData(relatedLanguageData);
		relatedLanguage.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm.this, IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedLanguage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getRelatedLanguage()));
			}

		});
		relatedLanguage.setID(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedLanguage);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedLanguage, IspemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createRelatedLanguageFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRelatedMethodFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedMethod, IspemMessages.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart_RelatedMethodLabel);
		relatedMethod = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedMethod, IspemViewsRepository.FORM_KIND));
		widgetFactory.adapt(relatedMethod);
		relatedMethod.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData relatedMethodData = new GridData(GridData.FILL_HORIZONTAL);
		relatedMethod.setLayoutData(relatedMethodData);
		relatedMethod.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DevelopmentMethodWithLanguageContentPackagePropertiesEditionPartForm.this, IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedMethod, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getRelatedMethod()));
			}

		});
		relatedMethod.setID(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedMethod);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedMethod, IspemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createRelatedMethodFlatComboViewer

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
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(IspemMessages.DevelopmentMethodWithLanguageContentPackage_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#initOwnedMethodContentMember(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedMethodContentMember(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedMethodContentMember.setContentProvider(contentProvider);
		ownedMethodContentMember.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.ownedMethodContentMember);
		if (eefElementEditorReadOnlyState && ownedMethodContentMember.isEnabled()) {
			ownedMethodContentMember.setEnabled(false);
			ownedMethodContentMember.setToolTipText(IspemMessages.DevelopmentMethodWithLanguageContentPackage_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedMethodContentMember.isEnabled()) {
			ownedMethodContentMember.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#updateOwnedMethodContentMember()
	 * 
	 */
	public void updateOwnedMethodContentMember() {
	ownedMethodContentMember.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#addFilterOwnedMethodContentMember(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwnedMethodContentMember(ViewerFilter filter) {
		ownedMethodContentMemberFilters.add(filter);
		if (this.ownedMethodContentMember != null) {
			this.ownedMethodContentMember.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#addBusinessFilterOwnedMethodContentMember(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnedMethodContentMember(ViewerFilter filter) {
		ownedMethodContentMemberBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#isContainedInOwnedMethodContentMemberTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnedMethodContentMemberTable(EObject element) {
		return ((ReferencesTableSettings)ownedMethodContentMember.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#initReusedPackage(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initReusedPackage(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		reusedPackage.setContentProvider(contentProvider);
		reusedPackage.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.reusedPackage);
		if (eefElementEditorReadOnlyState && reusedPackage.getTable().isEnabled()) {
			reusedPackage.setEnabled(false);
			reusedPackage.setToolTipText(IspemMessages.DevelopmentMethodWithLanguageContentPackage_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !reusedPackage.getTable().isEnabled()) {
			reusedPackage.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#updateReusedPackage()
	 * 
	 */
	public void updateReusedPackage() {
	reusedPackage.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#addFilterReusedPackage(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReusedPackage(ViewerFilter filter) {
		reusedPackageFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#addBusinessFilterReusedPackage(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReusedPackage(ViewerFilter filter) {
		reusedPackageBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#isContainedInReusedPackageTable(EObject element)
	 * 
	 */
	public boolean isContainedInReusedPackageTable(EObject element) {
		return ((ReferencesTableSettings)reusedPackage.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#getRelatedLanguage()
	 * 
	 */
	public EObject getRelatedLanguage() {
		if (relatedLanguage.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) relatedLanguage.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#initRelatedLanguage(EObjectFlatComboSettings)
	 */
	public void initRelatedLanguage(EObjectFlatComboSettings settings) {
		relatedLanguage.setInput(settings);
		if (current != null) {
			relatedLanguage.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedLanguage);
		if (eefElementEditorReadOnlyState && relatedLanguage.isEnabled()) {
			relatedLanguage.setEnabled(false);
			relatedLanguage.setToolTipText(IspemMessages.DevelopmentMethodWithLanguageContentPackage_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !relatedLanguage.isEnabled()) {
			relatedLanguage.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#setRelatedLanguage(EObject newValue)
	 * 
	 */
	public void setRelatedLanguage(EObject newValue) {
		if (newValue != null) {
			relatedLanguage.setSelection(new StructuredSelection(newValue));
		} else {
			relatedLanguage.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedLanguage);
		if (eefElementEditorReadOnlyState && relatedLanguage.isEnabled()) {
			relatedLanguage.setEnabled(false);
			relatedLanguage.setToolTipText(IspemMessages.DevelopmentMethodWithLanguageContentPackage_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !relatedLanguage.isEnabled()) {
			relatedLanguage.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#setRelatedLanguageButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRelatedLanguageButtonMode(ButtonsModeEnum newValue) {
		relatedLanguage.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#addFilterRelatedLanguage(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRelatedLanguage(ViewerFilter filter) {
		relatedLanguage.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#addBusinessFilterRelatedLanguage(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRelatedLanguage(ViewerFilter filter) {
		relatedLanguage.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#getRelatedMethod()
	 * 
	 */
	public EObject getRelatedMethod() {
		if (relatedMethod.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) relatedMethod.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#initRelatedMethod(EObjectFlatComboSettings)
	 */
	public void initRelatedMethod(EObjectFlatComboSettings settings) {
		relatedMethod.setInput(settings);
		if (current != null) {
			relatedMethod.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedMethod);
		if (eefElementEditorReadOnlyState && relatedMethod.isEnabled()) {
			relatedMethod.setEnabled(false);
			relatedMethod.setToolTipText(IspemMessages.DevelopmentMethodWithLanguageContentPackage_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !relatedMethod.isEnabled()) {
			relatedMethod.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#setRelatedMethod(EObject newValue)
	 * 
	 */
	public void setRelatedMethod(EObject newValue) {
		if (newValue != null) {
			relatedMethod.setSelection(new StructuredSelection(newValue));
		} else {
			relatedMethod.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedMethod);
		if (eefElementEditorReadOnlyState && relatedMethod.isEnabled()) {
			relatedMethod.setEnabled(false);
			relatedMethod.setToolTipText(IspemMessages.DevelopmentMethodWithLanguageContentPackage_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !relatedMethod.isEnabled()) {
			relatedMethod.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#setRelatedMethodButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRelatedMethodButtonMode(ButtonsModeEnum newValue) {
		relatedMethod.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#addFilterRelatedMethod(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRelatedMethod(ViewerFilter filter) {
		relatedMethod.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart#addBusinessFilterRelatedMethod(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRelatedMethod(ViewerFilter filter) {
		relatedMethod.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return IspemMessages.DevelopmentMethodWithLanguageContentPackage_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
