/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.uma;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Risk Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.topcased.spem.uma.UmaPackage#getRiskLevel()
 * @model
 * @generated
 */
public final class RiskLevel extends AbstractEnumerator {
	/**
	 * The '<em><b>LOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOW_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOW = 0;

	/**
	 * The '<em><b>MID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MID_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MID = 1;

	/**
	 * The '<em><b>HIGH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIGH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIGH = 2;

	/**
	 * The '<em><b>LOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW
	 * @generated
	 * @ordered
	 */
	public static final RiskLevel LOW_LITERAL = new RiskLevel(LOW, "LOW", "LOW");

	/**
	 * The '<em><b>MID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MID
	 * @generated
	 * @ordered
	 */
	public static final RiskLevel MID_LITERAL = new RiskLevel(MID, "MID", "MID");

	/**
	 * The '<em><b>HIGH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH
	 * @generated
	 * @ordered
	 */
	public static final RiskLevel HIGH_LITERAL = new RiskLevel(HIGH, "HIGH", "HIGH");

	/**
	 * An array of all the '<em><b>Risk Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RiskLevel[] VALUES_ARRAY =
		new RiskLevel[] {
			LOW_LITERAL,
			MID_LITERAL,
			HIGH_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Risk Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Risk Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RiskLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RiskLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Risk Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RiskLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RiskLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Risk Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RiskLevel get(int value) {
		switch (value) {
			case LOW: return LOW_LITERAL;
			case MID: return MID_LITERAL;
			case HIGH: return HIGH_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RiskLevel(int value, String name, String literal) {
		super(value, name, literal);
	}

} //RiskLevel
