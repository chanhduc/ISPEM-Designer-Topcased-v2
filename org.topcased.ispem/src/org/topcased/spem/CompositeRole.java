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
 * A representation of the model object '<em><b>Composite Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.CompositeRole#getAggregatedRole <em>Aggregated Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.SpemPackage#getCompositeRole()
 * @model
 * @generated
 */
public interface CompositeRole extends RoleUse {
	/**
	 * Returns the value of the '<em><b>Aggregated Role</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.RoleDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregated Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated Role</em>' reference list.
	 * @see org.topcased.spem.SpemPackage#getCompositeRole_AggregatedRole()
	 * @model type="org.topcased.spem.RoleDefinition"
	 * @generated
	 */
	EList getAggregatedRole();

} // CompositeRole
