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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.topcased.ispem.DevelopmentMethodContentPackage;
import org.topcased.ispem.DomainContentPackage;
import org.topcased.ispem.IspemFactory;

import org.topcased.spem.MethodContentPackage;
import org.topcased.spem.SpemFactory;
import org.topcased.spem.SpemPackage;

import org.topcased.spem.uma.UmaFactory;
import org.topcased.spem.uma.impl.UmaFactoryImpl;

/**
 * This is the item provider adapter for a {@link org.topcased.spem.MethodContentPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodContentPackageItemProvider
	extends MethodContentPackageableElementItemProvider
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
	public MethodContentPackageItemProvider(AdapterFactory adapterFactory) {
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

			addReusedPackagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Reused Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReusedPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MethodContentPackage_reusedPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MethodContentPackage_reusedPackage_feature", "_UI_MethodContentPackage_type"),
				 SpemPackage.Literals.METHOD_CONTENT_PACKAGE__REUSED_PACKAGE,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER);
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
	 * This returns MethodContentPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MethodContentPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MethodContentPackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MethodContentPackage_type") :
			getString("_UI_MethodContentPackage_type") + " " + label;
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

		switch (notification.getFeatureID(MethodContentPackage.class)) {
			case SpemPackage.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER:
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
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 SpemFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 SpemFactory.eINSTANCE.createGuidance()));

	

	

	
		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 SpemFactory.eINSTANCE.createMethodContentPackage()));


	
		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 IspemFactory.eINSTANCE.createEngineeringDomainPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 IspemFactory.eINSTANCE.createDevelopmentMethodPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 IspemFactory.eINSTANCE.createArtifactDefinitionPackage()));


	
		//Initialise Domain Content Package
		 DomainContentPackage domainContentPkg = IspemFactory.eINSTANCE.createDomainContentPackage();
			
			
		 UmaFactory umaFactory = new UmaFactoryImpl();
			
		 domainContentPkg.getOwnedMethodContentMember().add(umaFactory.createTaskDefinitionPackage());
		 domainContentPkg.getOwnedMethodContentMember().add(umaFactory.createWorkProductDefinitionPackage());
		 domainContentPkg.getOwnedMethodContentMember().add(umaFactory.createToolDefinitionPackage());
		 domainContentPkg.getOwnedMethodContentMember().add(umaFactory.createRoleDefinitionPackage());
		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 domainContentPkg));
		//Initialise Development Method Content Package
		
		DevelopmentMethodContentPackage developmentMethodContentPackage =  IspemFactory.eINSTANCE.createDevelopmentMethodContentPackage();
		developmentMethodContentPackage.getOwnedMethodContentMember().add(umaFactory.createTaskDefinitionPackage());
		developmentMethodContentPackage.getOwnedMethodContentMember().add(umaFactory.createWorkProductDefinitionPackage());
		developmentMethodContentPackage.getOwnedMethodContentMember().add(umaFactory.createToolDefinitionPackage());
		developmentMethodContentPackage.getOwnedMethodContentMember().add(umaFactory.createRoleDefinitionPackage());
		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				developmentMethodContentPackage));


		//Initialise Development Method with language Content Package

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 IspemFactory.eINSTANCE.createDevelopmentMethodWithLanguageContentPackage()));




		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 IspemFactory.eINSTANCE.createRepresentLanguagePackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 IspemFactory.eINSTANCE.createMetaModelPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createCategoryPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createCustomCategory()));









		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createRoleDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createTaskDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createWorkProductDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createGuidancePackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createDisciplinePackage()));




		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createWorkProductKindPackage()));

	

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_CONTENT_PACKAGE__OWNED_METHOD_CONTENT_MEMBER,
				 UmaFactory.eINSTANCE.createToolDefinitionPackage()));

		
	}

}
