/**
 * Generated with Acceleo
 */
package org.topcased.spem.activity.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import org.topcased.spem.activity.parts.ActivityViewsRepository;

import org.topcased.spem.activity.parts.forms.DecisionNodePropertiesEditionPartForm;
import org.topcased.spem.activity.parts.forms.EdgePropertiesEditionPartForm;
import org.topcased.spem.activity.parts.forms.EndNodePropertiesEditionPartForm;
import org.topcased.spem.activity.parts.forms.ForkNodePropertiesEditionPartForm;
import org.topcased.spem.activity.parts.forms.JoinNodePropertiesEditionPartForm;
import org.topcased.spem.activity.parts.forms.StartNodePropertiesEditionPartForm;

import org.topcased.spem.activity.parts.impl.DecisionNodePropertiesEditionPartImpl;
import org.topcased.spem.activity.parts.impl.EdgePropertiesEditionPartImpl;
import org.topcased.spem.activity.parts.impl.EndNodePropertiesEditionPartImpl;
import org.topcased.spem.activity.parts.impl.ForkNodePropertiesEditionPartImpl;
import org.topcased.spem.activity.parts.impl.JoinNodePropertiesEditionPartImpl;
import org.topcased.spem.activity.parts.impl.StartNodePropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class ActivityPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == ActivityViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == ActivityViewsRepository.Edge.class) {
			if (kind == ActivityViewsRepository.SWT_KIND)
				return new EdgePropertiesEditionPartImpl(component);
			if (kind == ActivityViewsRepository.FORM_KIND)
				return new EdgePropertiesEditionPartForm(component);
		}
		if (key == ActivityViewsRepository.StartNode.class) {
			if (kind == ActivityViewsRepository.SWT_KIND)
				return new StartNodePropertiesEditionPartImpl(component);
			if (kind == ActivityViewsRepository.FORM_KIND)
				return new StartNodePropertiesEditionPartForm(component);
		}
		if (key == ActivityViewsRepository.EndNode.class) {
			if (kind == ActivityViewsRepository.SWT_KIND)
				return new EndNodePropertiesEditionPartImpl(component);
			if (kind == ActivityViewsRepository.FORM_KIND)
				return new EndNodePropertiesEditionPartForm(component);
		}
		if (key == ActivityViewsRepository.ForkNode.class) {
			if (kind == ActivityViewsRepository.SWT_KIND)
				return new ForkNodePropertiesEditionPartImpl(component);
			if (kind == ActivityViewsRepository.FORM_KIND)
				return new ForkNodePropertiesEditionPartForm(component);
		}
		if (key == ActivityViewsRepository.JoinNode.class) {
			if (kind == ActivityViewsRepository.SWT_KIND)
				return new JoinNodePropertiesEditionPartImpl(component);
			if (kind == ActivityViewsRepository.FORM_KIND)
				return new JoinNodePropertiesEditionPartForm(component);
		}
		if (key == ActivityViewsRepository.DecisionNode.class) {
			if (kind == ActivityViewsRepository.SWT_KIND)
				return new DecisionNodePropertiesEditionPartImpl(component);
			if (kind == ActivityViewsRepository.FORM_KIND)
				return new DecisionNodePropertiesEditionPartForm(component);
		}
		return null;
	}

}
