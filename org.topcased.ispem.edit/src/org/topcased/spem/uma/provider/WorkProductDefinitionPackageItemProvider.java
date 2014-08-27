/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.uma.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.topcased.ispem.IspemFactory;
import org.topcased.ispem.provider.IspemEditPlugin;

import org.topcased.spem.SpemPackage;
import org.topcased.spem.provider.MethodContentPackageItemProvider;

import org.topcased.spem.uma.UmaFactory;
import org.topcased.spem.uma.WorkProductDefinitionPackage;

/**
 * This is the item provider adapter for a {@link org.topcased.spem.uma.WorkProductDefinitionPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkProductDefinitionPackageItemProvider
	extends MethodContentPackageItemProvider
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
	public WorkProductDefinitionPackageItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns WorkProductDefinitionPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WorkProductDefinitionPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((WorkProductDefinitionPackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_WorkProductDefinitionPackage_type") :
			getString("_UI_WorkProductDefinitionPackage_type") + " " + label;
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
		newChildDescriptors.add
		(createChildParameter
			(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
			 IspemFactory.eINSTANCE.createArtifactDefinition()));
		
		newChildDescriptors.add
		(createChildParameter
			(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
			 IspemFactory.eINSTANCE.createDomainArtifactDefinition()));
		
		newChildDescriptors.add
		(createChildParameter
			(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
			 IspemFactory.eINSTANCE.createMethodArtifactDefinition()));
		
		newChildDescriptors.add
		(createChildParameter
			(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
			 IspemFactory.eINSTANCE.createLanguageArtifactDefinition()));
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
