/**
 * Generated with Acceleo
 */
package org.topcased.spem.activity.providers;

import org.eclipse.emf.common.notify.Adapter;

import org.topcased.spem.activity.util.ActivityAdapterFactory;

/**
 * 
 * 
 */
public class ActivityEEFAdapterFactory extends ActivityAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.topcased.spem.activity.util.ActivityAdapterFactory#createEdgeAdapter()
	 * 
	 */
	public Adapter createEdgeAdapter() {
		return new EdgePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.spem.activity.util.ActivityAdapterFactory#createStartNodeAdapter()
	 * 
	 */
	public Adapter createStartNodeAdapter() {
		return new StartNodePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.spem.activity.util.ActivityAdapterFactory#createEndNodeAdapter()
	 * 
	 */
	public Adapter createEndNodeAdapter() {
		return new EndNodePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.spem.activity.util.ActivityAdapterFactory#createForkNodeAdapter()
	 * 
	 */
	public Adapter createForkNodeAdapter() {
		return new ForkNodePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.spem.activity.util.ActivityAdapterFactory#createJoinNodeAdapter()
	 * 
	 */
	public Adapter createJoinNodeAdapter() {
		return new JoinNodePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.topcased.spem.activity.util.ActivityAdapterFactory#createDecisionNodeAdapter()
	 * 
	 */
	public Adapter createDecisionNodeAdapter() {
		return new DecisionNodePropertiesEditionProvider();
	}

}
