/**
 * Generated with Acceleo
 */
package org.topcased.spem.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.topcased.spem.ParameterDirectionKind;
import org.topcased.spem.SpemPackage;
import org.topcased.spem.WorkDefinitionParameter;

import org.topcased.spem.parts.SpemViewsRepository;
import org.topcased.spem.parts.WorkDefinitionParameterPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class WorkDefinitionParameterPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public WorkDefinitionParameterPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject workDefinitionParameter, String editing_mode) {
		super(editingContext, workDefinitionParameter, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SpemViewsRepository.class;
		partKey = SpemViewsRepository.WorkDefinitionParameter.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final WorkDefinitionParameter workDefinitionParameter = (WorkDefinitionParameter)elt;
			final WorkDefinitionParameterPropertiesEditionPart basePart = (WorkDefinitionParameterPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SpemViewsRepository.WorkDefinitionParameter.Properties.direction)) {
				basePart.initDirection(EEFUtils.choiceOfValues(workDefinitionParameter, SpemPackage.eINSTANCE.getWorkDefinitionParameter_Direction()), workDefinitionParameter.getDirection());
			}
			// init filters
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}




	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == SpemViewsRepository.WorkDefinitionParameter.Properties.direction) {
			return SpemPackage.eINSTANCE.getWorkDefinitionParameter_Direction();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		WorkDefinitionParameter workDefinitionParameter = (WorkDefinitionParameter)semanticObject;
		if (SpemViewsRepository.WorkDefinitionParameter.Properties.direction == event.getAffectedEditor()) {
			workDefinitionParameter.setDirection((ParameterDirectionKind)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			WorkDefinitionParameterPropertiesEditionPart basePart = (WorkDefinitionParameterPropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getWorkDefinitionParameter_Direction().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(SpemViewsRepository.WorkDefinitionParameter.Properties.direction))
				basePart.setDirection((ParameterDirectionKind)msg.getNewValue());
			
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			SpemPackage.eINSTANCE.getWorkDefinitionParameter_Direction()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (SpemViewsRepository.WorkDefinitionParameter.Properties.direction == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getWorkDefinitionParameter_Direction().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getWorkDefinitionParameter_Direction().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
