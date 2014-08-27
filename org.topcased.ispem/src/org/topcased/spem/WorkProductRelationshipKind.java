/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Work Product Relationship Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.topcased.spem.SpemPackage#getWorkProductRelationshipKind()
 * @model
 * @generated
 */
public final class WorkProductRelationshipKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Impacted By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Impacted By</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPACTED_BY_LITERAL
	 * @model name="impactedBy"
	 * @generated
	 * @ordered
	 */
	public static final int IMPACTED_BY = 0;

	/**
	 * The '<em><b>Composition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Composition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION_LITERAL
	 * @model name="composition"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITION = 1;

	/**
	 * The '<em><b>Aggregation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aggregation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGGREGATION_LITERAL
	 * @model name="aggregation"
	 * @generated
	 * @ordered
	 */
	public static final int AGGREGATION = 2;

	/**
	 * The '<em><b>Impacted By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPACTED_BY
	 * @generated
	 * @ordered
	 */
	public static final WorkProductRelationshipKind IMPACTED_BY_LITERAL = new WorkProductRelationshipKind(IMPACTED_BY, "impactedBy", "impactedBy");

	/**
	 * The '<em><b>Composition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION
	 * @generated
	 * @ordered
	 */
	public static final WorkProductRelationshipKind COMPOSITION_LITERAL = new WorkProductRelationshipKind(COMPOSITION, "composition", "composition");

	/**
	 * The '<em><b>Aggregation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGREGATION
	 * @generated
	 * @ordered
	 */
	public static final WorkProductRelationshipKind AGGREGATION_LITERAL = new WorkProductRelationshipKind(AGGREGATION, "aggregation", "aggregation");

	/**
	 * An array of all the '<em><b>Work Product Relationship Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WorkProductRelationshipKind[] VALUES_ARRAY =
		new WorkProductRelationshipKind[] {
			IMPACTED_BY_LITERAL,
			COMPOSITION_LITERAL,
			AGGREGATION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Work Product Relationship Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Work Product Relationship Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkProductRelationshipKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WorkProductRelationshipKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Work Product Relationship Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkProductRelationshipKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WorkProductRelationshipKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Work Product Relationship Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkProductRelationshipKind get(int value) {
		switch (value) {
			case IMPACTED_BY: return IMPACTED_BY_LITERAL;
			case COMPOSITION: return COMPOSITION_LITERAL;
			case AGGREGATION: return AGGREGATION_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private WorkProductRelationshipKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //WorkProductRelationshipKind
