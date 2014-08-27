/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Planning Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.uma.ProcessPlanningTemplate#getBaseProcess <em>Base Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.uma.UmaPackage#getProcessPlanningTemplate()
 * @model
 * @generated
 */
public interface ProcessPlanningTemplate extends org.topcased.spem.uma.Process {
	/**
	 * Returns the value of the '<em><b>Base Process</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.uma.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Process</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Process</em>' reference list.
	 * @see org.topcased.spem.uma.UmaPackage#getProcessPlanningTemplate_BaseProcess()
	 * @model type="org.topcased.spem.uma.Process"
	 * @generated
	 */
	EList getBaseProcess();

} // ProcessPlanningTemplate
