/**
 * Generated with Acceleo
 */
package org.topcased.spem.parts.impl;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import org.topcased.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart;
import org.topcased.spem.parts.SpemViewsRepository;

import org.topcased.spem.providers.SpemMessages;

// End of user code

/**
 * 
 * 
 */
public class Default_TaskDefinitionParameterPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, Default_TaskDefinitionParameterPropertiesEditionPart {

	protected EMFComboViewer direction;
	protected Text name;
	protected EObjectFlatComboViewer parameterType;
	protected EMFComboViewer optionality;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public Default_TaskDefinitionParameterPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence default_TaskDefinitionParameterStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = default_TaskDefinitionParameterStep.addStep(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.class);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.direction);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType);
		propertiesStep.addStep(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.optionality);
		
		
		composer = new PartComposer(default_TaskDefinitionParameterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SpemViewsRepository.Default_TaskDefinitionParameter.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionParameter.Properties.direction) {
					return createDirectionEMFComboViewer(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name) {
					return createNameText(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType) {
					return createParameterTypeFlatComboViewer(parent);
				}
				if (key == SpemViewsRepository.Default_TaskDefinitionParameter.Properties.optionality) {
					return createOptionalityEMFComboViewer(parent);
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
		propertiesGroup.setText(SpemMessages.Default_TaskDefinitionParameterPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createDirectionEMFComboViewer(Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_TaskDefinitionParameter.Properties.direction, SpemMessages.Default_TaskDefinitionParameterPropertiesEditionPart_DirectionLabel);
		direction = new EMFComboViewer(parent);
		direction.setContentProvider(new ArrayContentProvider());
		direction.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData directionData = new GridData(GridData.FILL_HORIZONTAL);
		direction.getCombo().setLayoutData(directionData);
		direction.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionParameterPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionParameter.Properties.direction, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDirection()));
			}

		});
		direction.setID(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.direction);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.direction, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDirectionEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name, SpemMessages.Default_TaskDefinitionParameterPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionParameterPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionParameterPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createParameterTypeFlatComboViewer(Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType, SpemMessages.Default_TaskDefinitionParameterPropertiesEditionPart_ParameterTypeLabel);
		parameterType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType, SpemViewsRepository.SWT_KIND));
		parameterType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parameterType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionParameterPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParameterType()));
			}

		});
		GridData parameterTypeData = new GridData(GridData.FILL_HORIZONTAL);
		parameterType.setLayoutData(parameterTypeData);
		parameterType.setID(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createParameterTypeFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createOptionalityEMFComboViewer(Composite parent) {
		createDescription(parent, SpemViewsRepository.Default_TaskDefinitionParameter.Properties.optionality, SpemMessages.Default_TaskDefinitionParameterPropertiesEditionPart_OptionalityLabel);
		optionality = new EMFComboViewer(parent);
		optionality.setContentProvider(new ArrayContentProvider());
		optionality.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData optionalityData = new GridData(GridData.FILL_HORIZONTAL);
		optionality.getCombo().setLayoutData(optionalityData);
		optionality.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Default_TaskDefinitionParameterPropertiesEditionPartImpl.this, SpemViewsRepository.Default_TaskDefinitionParameter.Properties.optionality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOptionality()));
			}

		});
		optionality.setID(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.optionality);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.optionality, SpemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOptionalityEMFComboViewer

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
	 * @see org.topcased.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#getDirection()
	 * 
	 */
	public Enumerator getDirection() {
		Enumerator selection = (Enumerator) ((StructuredSelection) direction.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#initDirection(Object input, Enumerator current)
	 */
	public void initDirection(Object input, Enumerator current) {
		direction.setInput(input);
		direction.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.direction);
		if (eefElementEditorReadOnlyState && direction.isEnabled()) {
			direction.setEnabled(false);
			direction.setToolTipText(SpemMessages.Default_TaskDefinitionParameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !direction.isEnabled()) {
			direction.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#setDirection(Enumerator newValue)
	 * 
	 */
	public void setDirection(Enumerator newValue) {
		direction.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.direction);
		if (eefElementEditorReadOnlyState && direction.isEnabled()) {
			direction.setEnabled(false);
			direction.setToolTipText(SpemMessages.Default_TaskDefinitionParameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !direction.isEnabled()) {
			direction.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SpemMessages.Default_TaskDefinitionParameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#getParameterType()
	 * 
	 */
	public EObject getParameterType() {
		if (parameterType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) parameterType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#initParameterType(EObjectFlatComboSettings)
	 */
	public void initParameterType(EObjectFlatComboSettings settings) {
		parameterType.setInput(settings);
		if (current != null) {
			parameterType.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType);
		if (eefElementEditorReadOnlyState && parameterType.isEnabled()) {
			parameterType.setEnabled(false);
			parameterType.setToolTipText(SpemMessages.Default_TaskDefinitionParameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parameterType.isEnabled()) {
			parameterType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#setParameterType(EObject newValue)
	 * 
	 */
	public void setParameterType(EObject newValue) {
		if (newValue != null) {
			parameterType.setSelection(new StructuredSelection(newValue));
		} else {
			parameterType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.parameterType);
		if (eefElementEditorReadOnlyState && parameterType.isEnabled()) {
			parameterType.setEnabled(false);
			parameterType.setToolTipText(SpemMessages.Default_TaskDefinitionParameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parameterType.isEnabled()) {
			parameterType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#setParameterTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParameterTypeButtonMode(ButtonsModeEnum newValue) {
		parameterType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#addFilterParameterType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParameterType(ViewerFilter filter) {
		parameterType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#addBusinessFilterParameterType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParameterType(ViewerFilter filter) {
		parameterType.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#getOptionality()
	 * 
	 */
	public Enumerator getOptionality() {
		Enumerator selection = (Enumerator) ((StructuredSelection) optionality.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#initOptionality(Object input, Enumerator current)
	 */
	public void initOptionality(Object input, Enumerator current) {
		optionality.setInput(input);
		optionality.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.optionality);
		if (eefElementEditorReadOnlyState && optionality.isEnabled()) {
			optionality.setEnabled(false);
			optionality.setToolTipText(SpemMessages.Default_TaskDefinitionParameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !optionality.isEnabled()) {
			optionality.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.topcased.spem.parts.Default_TaskDefinitionParameterPropertiesEditionPart#setOptionality(Enumerator newValue)
	 * 
	 */
	public void setOptionality(Enumerator newValue) {
		optionality.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(SpemViewsRepository.Default_TaskDefinitionParameter.Properties.optionality);
		if (eefElementEditorReadOnlyState && optionality.isEnabled()) {
			optionality.setEnabled(false);
			optionality.setToolTipText(SpemMessages.Default_TaskDefinitionParameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !optionality.isEnabled()) {
			optionality.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SpemMessages.Default_TaskDefinitionParameter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
