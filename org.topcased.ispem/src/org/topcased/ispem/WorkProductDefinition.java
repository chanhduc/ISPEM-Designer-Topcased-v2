/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Product Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.WorkProductDefinition#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link org.topcased.ispem.WorkProductDefinition#getUsedReferences <em>Used References</em>}</li>
 *   <li>{@link org.topcased.ispem.WorkProductDefinition#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getWorkProductDefinition()
 * @model
 * @generated
 */
public interface WorkProductDefinition extends OntologyLinkedElement, org.topcased.spem.WorkProductDefinition {
	/**
	 * Returns the value of the '<em><b>Root Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Element</em>' reference.
	 * @see #setRootElement(EClass)
	 * @see org.topcased.ispem.IspemPackage#getWorkProductDefinition_RootElement()
	 * @model
	 * @generated
	 */
	EClass getRootElement();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.WorkProductDefinition#getRootElement <em>Root Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Element</em>' reference.
	 * @see #getRootElement()
	 * @generated
	 */
	void setRootElement(EClass value);

	/**
	 * Returns the value of the '<em><b>Used References</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used References</em>' reference list.
	 * @see org.topcased.ispem.IspemPackage#getWorkProductDefinition_UsedReferences()
	 * @model type="org.eclipse.emf.ecore.EReference"
	 * @generated
	 */
	EList getUsedReferences();

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference.
	 * @see #setMetamodel(MetaModel)
	 * @see org.topcased.ispem.IspemPackage#getWorkProductDefinition_Metamodel()
	 * @model
	 * @generated
	 */
	MetaModel getMetamodel();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.WorkProductDefinition#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(MetaModel value);

} // WorkProductDefinition
