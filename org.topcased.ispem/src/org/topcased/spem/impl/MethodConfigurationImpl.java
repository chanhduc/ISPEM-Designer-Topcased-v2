/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.topcased.spem.Category;
import org.topcased.spem.MethodConfiguration;
import org.topcased.spem.MethodContentPackage;
import org.topcased.spem.MethodPlugin;
import org.topcased.spem.ProcessPackage;
import org.topcased.spem.SpemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.spem.impl.MethodConfigurationImpl#getBaseConfiguration <em>Base Configuration</em>}</li>
 *   <li>{@link org.topcased.spem.impl.MethodConfigurationImpl#getMethodPluginSelection <em>Method Plugin Selection</em>}</li>
 *   <li>{@link org.topcased.spem.impl.MethodConfigurationImpl#getProcessPackageSelection <em>Process Package Selection</em>}</li>
 *   <li>{@link org.topcased.spem.impl.MethodConfigurationImpl#getContentPackageSelection <em>Content Package Selection</em>}</li>
 *   <li>{@link org.topcased.spem.impl.MethodConfigurationImpl#getSubstractedCategory <em>Substracted Category</em>}</li>
 *   <li>{@link org.topcased.spem.impl.MethodConfigurationImpl#getDefaultView <em>Default View</em>}</li>
 *   <li>{@link org.topcased.spem.impl.MethodConfigurationImpl#getProcessView <em>Process View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodConfigurationImpl extends MethodLibraryPackageableElementImpl implements MethodConfiguration {
	/**
	 * The cached value of the '{@link #getBaseConfiguration() <em>Base Configuration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList baseConfiguration;

	/**
	 * The cached value of the '{@link #getMethodPluginSelection() <em>Method Plugin Selection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodPluginSelection()
	 * @generated
	 * @ordered
	 */
	protected EList methodPluginSelection;

	/**
	 * The cached value of the '{@link #getProcessPackageSelection() <em>Process Package Selection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessPackageSelection()
	 * @generated
	 * @ordered
	 */
	protected EList processPackageSelection;

	/**
	 * The cached value of the '{@link #getContentPackageSelection() <em>Content Package Selection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPackageSelection()
	 * @generated
	 * @ordered
	 */
	protected EList contentPackageSelection;

	/**
	 * The cached value of the '{@link #getSubstractedCategory() <em>Substracted Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstractedCategory()
	 * @generated
	 * @ordered
	 */
	protected EList substractedCategory;

	/**
	 * The cached value of the '{@link #getDefaultView() <em>Default View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultView()
	 * @generated
	 * @ordered
	 */
	protected Category defaultView;

	/**
	 * The cached value of the '{@link #getProcessView() <em>Process View</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessView()
	 * @generated
	 * @ordered
	 */
	protected EList processView;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SpemPackage.Literals.METHOD_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBaseConfiguration() {
		if (baseConfiguration == null) {
			baseConfiguration = new EObjectResolvingEList(MethodConfiguration.class, this, SpemPackage.METHOD_CONFIGURATION__BASE_CONFIGURATION);
		}
		return baseConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMethodPluginSelection() {
		if (methodPluginSelection == null) {
			methodPluginSelection = new EObjectResolvingEList(MethodPlugin.class, this, SpemPackage.METHOD_CONFIGURATION__METHOD_PLUGIN_SELECTION);
		}
		return methodPluginSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProcessPackageSelection() {
		if (processPackageSelection == null) {
			processPackageSelection = new EObjectResolvingEList(ProcessPackage.class, this, SpemPackage.METHOD_CONFIGURATION__PROCESS_PACKAGE_SELECTION);
		}
		return processPackageSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContentPackageSelection() {
		if (contentPackageSelection == null) {
			contentPackageSelection = new EObjectResolvingEList(MethodContentPackage.class, this, SpemPackage.METHOD_CONFIGURATION__CONTENT_PACKAGE_SELECTION);
		}
		return contentPackageSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubstractedCategory() {
		if (substractedCategory == null) {
			substractedCategory = new EObjectResolvingEList(Category.class, this, SpemPackage.METHOD_CONFIGURATION__SUBSTRACTED_CATEGORY);
		}
		return substractedCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getDefaultView() {
		if (defaultView != null && defaultView.eIsProxy()) {
			InternalEObject oldDefaultView = (InternalEObject)defaultView;
			defaultView = (Category)eResolveProxy(oldDefaultView);
			if (defaultView != oldDefaultView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.METHOD_CONFIGURATION__DEFAULT_VIEW, oldDefaultView, defaultView));
			}
		}
		return defaultView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetDefaultView() {
		return defaultView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultView(Category newDefaultView) {
		Category oldDefaultView = defaultView;
		defaultView = newDefaultView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.METHOD_CONFIGURATION__DEFAULT_VIEW, oldDefaultView, defaultView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProcessView() {
		if (processView == null) {
			processView = new EObjectResolvingEList(Category.class, this, SpemPackage.METHOD_CONFIGURATION__PROCESS_VIEW);
		}
		return processView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.METHOD_CONFIGURATION__BASE_CONFIGURATION:
				return getBaseConfiguration();
			case SpemPackage.METHOD_CONFIGURATION__METHOD_PLUGIN_SELECTION:
				return getMethodPluginSelection();
			case SpemPackage.METHOD_CONFIGURATION__PROCESS_PACKAGE_SELECTION:
				return getProcessPackageSelection();
			case SpemPackage.METHOD_CONFIGURATION__CONTENT_PACKAGE_SELECTION:
				return getContentPackageSelection();
			case SpemPackage.METHOD_CONFIGURATION__SUBSTRACTED_CATEGORY:
				return getSubstractedCategory();
			case SpemPackage.METHOD_CONFIGURATION__DEFAULT_VIEW:
				if (resolve) return getDefaultView();
				return basicGetDefaultView();
			case SpemPackage.METHOD_CONFIGURATION__PROCESS_VIEW:
				return getProcessView();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpemPackage.METHOD_CONFIGURATION__BASE_CONFIGURATION:
				getBaseConfiguration().clear();
				getBaseConfiguration().addAll((Collection)newValue);
				return;
			case SpemPackage.METHOD_CONFIGURATION__METHOD_PLUGIN_SELECTION:
				getMethodPluginSelection().clear();
				getMethodPluginSelection().addAll((Collection)newValue);
				return;
			case SpemPackage.METHOD_CONFIGURATION__PROCESS_PACKAGE_SELECTION:
				getProcessPackageSelection().clear();
				getProcessPackageSelection().addAll((Collection)newValue);
				return;
			case SpemPackage.METHOD_CONFIGURATION__CONTENT_PACKAGE_SELECTION:
				getContentPackageSelection().clear();
				getContentPackageSelection().addAll((Collection)newValue);
				return;
			case SpemPackage.METHOD_CONFIGURATION__SUBSTRACTED_CATEGORY:
				getSubstractedCategory().clear();
				getSubstractedCategory().addAll((Collection)newValue);
				return;
			case SpemPackage.METHOD_CONFIGURATION__DEFAULT_VIEW:
				setDefaultView((Category)newValue);
				return;
			case SpemPackage.METHOD_CONFIGURATION__PROCESS_VIEW:
				getProcessView().clear();
				getProcessView().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpemPackage.METHOD_CONFIGURATION__BASE_CONFIGURATION:
				getBaseConfiguration().clear();
				return;
			case SpemPackage.METHOD_CONFIGURATION__METHOD_PLUGIN_SELECTION:
				getMethodPluginSelection().clear();
				return;
			case SpemPackage.METHOD_CONFIGURATION__PROCESS_PACKAGE_SELECTION:
				getProcessPackageSelection().clear();
				return;
			case SpemPackage.METHOD_CONFIGURATION__CONTENT_PACKAGE_SELECTION:
				getContentPackageSelection().clear();
				return;
			case SpemPackage.METHOD_CONFIGURATION__SUBSTRACTED_CATEGORY:
				getSubstractedCategory().clear();
				return;
			case SpemPackage.METHOD_CONFIGURATION__DEFAULT_VIEW:
				setDefaultView((Category)null);
				return;
			case SpemPackage.METHOD_CONFIGURATION__PROCESS_VIEW:
				getProcessView().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpemPackage.METHOD_CONFIGURATION__BASE_CONFIGURATION:
				return baseConfiguration != null && !baseConfiguration.isEmpty();
			case SpemPackage.METHOD_CONFIGURATION__METHOD_PLUGIN_SELECTION:
				return methodPluginSelection != null && !methodPluginSelection.isEmpty();
			case SpemPackage.METHOD_CONFIGURATION__PROCESS_PACKAGE_SELECTION:
				return processPackageSelection != null && !processPackageSelection.isEmpty();
			case SpemPackage.METHOD_CONFIGURATION__CONTENT_PACKAGE_SELECTION:
				return contentPackageSelection != null && !contentPackageSelection.isEmpty();
			case SpemPackage.METHOD_CONFIGURATION__SUBSTRACTED_CATEGORY:
				return substractedCategory != null && !substractedCategory.isEmpty();
			case SpemPackage.METHOD_CONFIGURATION__DEFAULT_VIEW:
				return defaultView != null;
			case SpemPackage.METHOD_CONFIGURATION__PROCESS_VIEW:
				return processView != null && !processView.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodConfigurationImpl
