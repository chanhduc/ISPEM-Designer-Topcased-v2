/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.topcased.ispem.IspemFactory;

import org.topcased.ispem.provider.IspemEditPlugin;

import org.topcased.spem.MethodLibrary;
import org.topcased.spem.SpemFactory;
import org.topcased.spem.SpemPackage;

import org.topcased.spem.uma.UmaFactory;

/**
 * This is the item provider adapter for a {@link org.topcased.spem.MethodLibrary} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodLibraryItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodLibraryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MethodLibrary_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MethodLibrary_name_feature", "_UI_MethodLibrary_type"),
				 SpemPackage.Literals.METHOD_LIBRARY__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SpemPackage.Literals.METHOD_LIBRARY__OWNED_METHOD_PLUGIN);
			childrenFeatures.add(SpemPackage.Literals.METHOD_LIBRARY__PREDEFINED_CONFIGURATION);
			childrenFeatures.add(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MethodLibrary.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MethodLibrary"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MethodLibrary)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MethodLibrary_type") :
			getString("_UI_MethodLibrary_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MethodLibrary.class)) {
			case SpemPackage.METHOD_LIBRARY__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpemPackage.METHOD_LIBRARY__OWNED_METHOD_PLUGIN:
			case SpemPackage.METHOD_LIBRARY__PREDEFINED_CONFIGURATION:
			case SpemPackage.METHOD_LIBRARY__CONFIGURATION_PACKAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__OWNED_METHOD_PLUGIN,
				 SpemFactory.eINSTANCE.createMethodPlugin()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__PREDEFINED_CONFIGURATION,
				 SpemFactory.eINSTANCE.createMethodConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 SpemFactory.eINSTANCE.createMethodContentPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 IspemFactory.eINSTANCE.createEngineeringDomainPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 IspemFactory.eINSTANCE.createDevelopmentMethodPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 IspemFactory.eINSTANCE.createArtifactDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 IspemFactory.eINSTANCE.createDomainContentPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 IspemFactory.eINSTANCE.createDevelopmentMethodContentPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 IspemFactory.eINSTANCE.createDevelopmentMethodWithLanguageContentPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 IspemFactory.eINSTANCE.createRepresentLanguagePackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 IspemFactory.eINSTANCE.createMetaModelPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 UmaFactory.eINSTANCE.createCategoryPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 UmaFactory.eINSTANCE.createRoleDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 UmaFactory.eINSTANCE.createTaskDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 UmaFactory.eINSTANCE.createWorkProductDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 UmaFactory.eINSTANCE.createGuidancePackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 UmaFactory.eINSTANCE.createDisciplinePackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 UmaFactory.eINSTANCE.createDomainPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 UmaFactory.eINSTANCE.createWorkProductKindPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 UmaFactory.eINSTANCE.createRoleSetPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 UmaFactory.eINSTANCE.createToolDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 UmaFactory.eINSTANCE.createConfigurationPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 UmaFactory.eINSTANCE.createQualificationPackage()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return IspemEditPlugin.INSTANCE;
	}

}
