/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem;

import org.eclipse.emf.ecore.EClass;

import org.topcased.spem.MethodContentElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClasses Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.EClassesRelation#getSource <em>Source</em>}</li>
 *   <li>{@link org.topcased.ispem.EClassesRelation#getTarget <em>Target</em>}</li>
 *   <li>{@link org.topcased.ispem.EClassesRelation#getRelationType <em>Relation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getEClassesRelation()
 * @model
 * @generated
 */
public interface EClassesRelation extends MethodContentElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EClass)
	 * @see org.topcased.ispem.IspemPackage#getEClassesRelation_Source()
	 * @model
	 * @generated
	 */
	EClass getSource();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.EClassesRelation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EClass value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EClass)
	 * @see org.topcased.ispem.IspemPackage#getEClassesRelation_Target()
	 * @model
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.EClassesRelation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EClass value);

	/**
	 * Returns the value of the '<em><b>Relation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.topcased.ispem.ENamedElementRelationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Type</em>' attribute.
	 * @see org.topcased.ispem.ENamedElementRelationKind
	 * @see #setRelationType(ENamedElementRelationKind)
	 * @see org.topcased.ispem.IspemPackage#getEClassesRelation_RelationType()
	 * @model
	 * @generated
	 */
	ENamedElementRelationKind getRelationType();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.EClassesRelation#getRelationType <em>Relation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Type</em>' attribute.
	 * @see org.topcased.ispem.ENamedElementRelationKind
	 * @see #getRelationType()
	 * @generated
	 */
	void setRelationType(ENamedElementRelationKind value);

} // EClassesRelation
