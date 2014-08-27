/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.MethodConfiguration#getBaseConfiguration <em>Base Configuration</em>}</li>
 *   <li>{@link org.topcased.spem.MethodConfiguration#getMethodPluginSelection <em>Method Plugin Selection</em>}</li>
 *   <li>{@link org.topcased.spem.MethodConfiguration#getProcessPackageSelection <em>Process Package Selection</em>}</li>
 *   <li>{@link org.topcased.spem.MethodConfiguration#getContentPackageSelection <em>Content Package Selection</em>}</li>
 *   <li>{@link org.topcased.spem.MethodConfiguration#getSubstractedCategory <em>Substracted Category</em>}</li>
 *   <li>{@link org.topcased.spem.MethodConfiguration#getDefaultView <em>Default View</em>}</li>
 *   <li>{@link org.topcased.spem.MethodConfiguration#getProcessView <em>Process View</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.SpemPackage#getMethodConfiguration()
 * @model
 * @generated
 */
public interface MethodConfiguration extends MethodLibraryPackageableElement {
	/**
	 * Returns the value of the '<em><b>Base Configuration</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.MethodConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Configuration</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Configuration</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getMethodConfiguration_BaseConfiguration()
	 * @model type="org.topcased.spem.MethodConfiguration"
	 * @generated
	 */
	EList getBaseConfiguration();

	/**
	 * Returns the value of the '<em><b>Method Plugin Selection</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.MethodPlugin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Plugin Selection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Plugin Selection</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getMethodConfiguration_MethodPluginSelection()
	 * @model type="org.topcased.spem.MethodPlugin" required="true" derived="true"
	 * @generated
	 */
	EList getMethodPluginSelection();

	/**
	 * Returns the value of the '<em><b>Process Package Selection</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.ProcessPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Package Selection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Package Selection</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getMethodConfiguration_ProcessPackageSelection()
	 * @model type="org.topcased.spem.ProcessPackage"
	 * @generated
	 */
	EList getProcessPackageSelection();

	/**
	 * Returns the value of the '<em><b>Content Package Selection</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.MethodContentPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Package Selection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Package Selection</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getMethodConfiguration_ContentPackageSelection()
	 * @model type="org.topcased.spem.MethodContentPackage"
	 * @generated
	 */
	EList getContentPackageSelection();

	/**
	 * Returns the value of the '<em><b>Substracted Category</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substracted Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substracted Category</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getMethodConfiguration_SubstractedCategory()
	 * @model type="org.topcased.spem.Category"
	 * @generated
	 */
	EList getSubstractedCategory();

	/**
	 * Returns the value of the '<em><b>Default View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default View</em>' reference.
	 * @see #setDefaultView(Category)
	 * @see org.topcased.spem.SpemPackage#getMethodConfiguration_DefaultView()
	 * @model required="true"
	 * @generated
	 */
	Category getDefaultView();

	/**
	 * Sets the value of the '{@link org.topcased.spem.MethodConfiguration#getDefaultView <em>Default View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default View</em>' reference.
	 * @see #getDefaultView()
	 * @generated
	 */
	void setDefaultView(Category value);

	/**
	 * Returns the value of the '<em><b>Process View</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process View</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process View</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getMethodConfiguration_ProcessView()
	 * @model type="org.topcased.spem.Category"
	 * @generated
	 */
	EList getProcessView();

} // MethodConfiguration
