/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.providers;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.topcased.modeler.providers.ILabelFeatureProvider;
import org.topcased.spem.activity.util.ActivityAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The adapters also support Eclipse property sheets. Note that most of the adapters are shared among multiple instances.
 * 
 * @generated
 */
public class ActivityModelerProviderAdapterFactory extends
		ActivityAdapterFactory implements ComposeableAdapterFactory,
		IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * 
	 * @generated
	 */
	private ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * 
	 * @generated
	 */
	private IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * 
	 * @generated
	 */
	private Collection supportedTypes = new ArrayList();

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.spem.activity.Node} instances.
	 * 
	 * @generated
	 */
	private NodeModelerProvider nodeModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.spem.activity.Edge} instances.
	 * 
	 * @generated
	 */
	private EdgeModelerProvider edgeModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.spem.activity.StartNode} instances.
	 * 
	 * @generated
	 */
	private StartNodeModelerProvider startnodeModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.spem.activity.EndNode} instances.
	 * 
	 * @generated
	 */
	private EndNodeModelerProvider endnodeModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.spem.activity.ForkNode} instances.
	 * 
	 * @generated
	 */
	private ForkNodeModelerProvider forknodeModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.spem.activity.JoinNode} instances.
	 * 
	 * @generated
	 */
	private JoinNodeModelerProvider joinnodeModelerProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.topcased.spem.activity.DecisionNode} instances.
	 * 
	 * @generated
	 */
	private DecisionNodeModelerProvider decisionnodeModelerProvider;

	/**
	 * This constructs an instance.
	 * 
	 * @generated
	 */
	public ActivityModelerProviderAdapterFactory() {
		supportedTypes.add(ILabelFeatureProvider.class);
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 *
	 * @return the root AdapterFactory
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory
				.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 *
	 * @param parentAdapterFactory the new parent adapter factory
	 * @generated
	 */
	public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * @param type the type to test
	 * @return true if supported
	 * 
	 * @generated
	 */
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 *
	 * @param notifier the notifier
	 * @param type the object to adapt
	 * @return the Adapter the created adatper
	 * @generated
	 */
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * @param object the object to adapt
	 * @param type the type to adapt
	 * @return the adapted Object
	 * @generated
	 */
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class)
					|| (((Class) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 *
	 * @param notifyChangedListener the listener to add
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 *
	 * @param notifyChangedListener the listener to remove
	 * 
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 *
	 * @param notification the notification to fire
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This creates an adapter for a {@link org.topcased.spem.activity.Node}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		if (nodeModelerProvider == null) {
			nodeModelerProvider = new NodeModelerProvider(this);
		}

		return nodeModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.spem.activity.Edge}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		if (edgeModelerProvider == null) {
			edgeModelerProvider = new EdgeModelerProvider(this);
		}

		return edgeModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.spem.activity.StartNode}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createStartNodeAdapter() {
		if (startnodeModelerProvider == null) {
			startnodeModelerProvider = new StartNodeModelerProvider(this);
		}

		return startnodeModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.spem.activity.EndNode}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createEndNodeAdapter() {
		if (endnodeModelerProvider == null) {
			endnodeModelerProvider = new EndNodeModelerProvider(this);
		}

		return endnodeModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.spem.activity.ForkNode}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createForkNodeAdapter() {
		if (forknodeModelerProvider == null) {
			forknodeModelerProvider = new ForkNodeModelerProvider(this);
		}

		return forknodeModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.spem.activity.JoinNode}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createJoinNodeAdapter() {
		if (joinnodeModelerProvider == null) {
			joinnodeModelerProvider = new JoinNodeModelerProvider(this);
		}

		return joinnodeModelerProvider;
	}

	/**
	 * This creates an adapter for a {@link org.topcased.spem.activity.DecisionNode}.
	 *
	 * @return the Adapter
	 * @generated
	 */
	public Adapter createDecisionNodeAdapter() {
		if (decisionnodeModelerProvider == null) {
			decisionnodeModelerProvider = new DecisionNodeModelerProvider(this);
		}

		return decisionnodeModelerProvider;
	}

	/**
	 * This disposes all of the item providers created by this factory.
	 * 
	 * @generated
	 */
	public void dispose() {
		if (nodeModelerProvider != null) {
			nodeModelerProvider.dispose();
		}
		if (edgeModelerProvider != null) {
			edgeModelerProvider.dispose();
		}
		if (startnodeModelerProvider != null) {
			startnodeModelerProvider.dispose();
		}
		if (endnodeModelerProvider != null) {
			endnodeModelerProvider.dispose();
		}
		if (forknodeModelerProvider != null) {
			forknodeModelerProvider.dispose();
		}
		if (joinnodeModelerProvider != null) {
			joinnodeModelerProvider.dispose();
		}
		if (decisionnodeModelerProvider != null) {
			decisionnodeModelerProvider.dispose();
		}
	}

}
