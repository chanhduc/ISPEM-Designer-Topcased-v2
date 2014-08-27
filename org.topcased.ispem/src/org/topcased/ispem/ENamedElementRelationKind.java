/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENamed Element Relation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.topcased.ispem.IspemPackage#getENamedElementRelationKind()
 * @model
 * @generated
 */
public final class ENamedElementRelationKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Specialization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Specialization</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECIALIZATION_LITERAL
	 * @model name="specialization"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIALIZATION = 0;

	/**
	 * The '<em><b>Representation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Representation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPRESENTATION_LITERAL
	 * @model name="representation"
	 * @generated
	 * @ordered
	 */
	public static final int REPRESENTATION = 1;

	/**
	 * The '<em><b>Correspondence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Correspondence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORRESPONDENCE_LITERAL
	 * @model name="correspondence"
	 * @generated
	 * @ordered
	 */
	public static final int CORRESPONDENCE = 2;

	/**
	 * The '<em><b>Specialization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIALIZATION
	 * @generated
	 * @ordered
	 */
	public static final ENamedElementRelationKind SPECIALIZATION_LITERAL = new ENamedElementRelationKind(SPECIALIZATION, "specialization", "specialization");

	/**
	 * The '<em><b>Representation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPRESENTATION
	 * @generated
	 * @ordered
	 */
	public static final ENamedElementRelationKind REPRESENTATION_LITERAL = new ENamedElementRelationKind(REPRESENTATION, "representation", "representation");

	/**
	 * The '<em><b>Correspondence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRESPONDENCE
	 * @generated
	 * @ordered
	 */
	public static final ENamedElementRelationKind CORRESPONDENCE_LITERAL = new ENamedElementRelationKind(CORRESPONDENCE, "correspondence", "correspondence");

	/**
	 * An array of all the '<em><b>ENamed Element Relation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENamedElementRelationKind[] VALUES_ARRAY =
		new ENamedElementRelationKind[] {
			SPECIALIZATION_LITERAL,
			REPRESENTATION_LITERAL,
			CORRESPONDENCE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>ENamed Element Relation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENamed Element Relation Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ENamedElementRelationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENamedElementRelationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENamed Element Relation Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ENamedElementRelationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENamedElementRelationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENamed Element Relation Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ENamedElementRelationKind get(int value) {
		switch (value) {
			case SPECIALIZATION: return SPECIALIZATION_LITERAL;
			case REPRESENTATION: return REPRESENTATION_LITERAL;
			case CORRESPONDENCE: return CORRESPONDENCE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ENamedElementRelationKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ENamedElementRelationKind
