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
 * A representation of the literals of the enumeration '<em><b>Expertise Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.topcased.spem.uma.UmaPackage#getExpertiseLevel()
 * @model
 * @generated
 */
public final class ExpertiseLevel extends AbstractEnumerator {
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
	 * The '<em><b>LEVEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEVEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEVEL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL = 2;

	/**
	 * The '<em><b>LOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW
	 * @generated
	 * @ordered
	 */
	public static final ExpertiseLevel LOW_LITERAL = new ExpertiseLevel(LOW, "LOW", "LOW");

	/**
	 * The '<em><b>MID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MID
	 * @generated
	 * @ordered
	 */
	public static final ExpertiseLevel MID_LITERAL = new ExpertiseLevel(MID, "MID", "MID");

	/**
	 * The '<em><b>LEVEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL
	 * @generated
	 * @ordered
	 */
	public static final ExpertiseLevel LEVEL_LITERAL = new ExpertiseLevel(LEVEL, "LEVEL", "LEVEL");

	/**
	 * An array of all the '<em><b>Expertise Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExpertiseLevel[] VALUES_ARRAY =
		new ExpertiseLevel[] {
			LOW_LITERAL,
			MID_LITERAL,
			LEVEL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Expertise Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Expertise Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpertiseLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpertiseLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expertise Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpertiseLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpertiseLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expertise Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpertiseLevel get(int value) {
		switch (value) {
			case LOW: return LOW_LITERAL;
			case MID: return MID_LITERAL;
			case LEVEL: return LEVEL_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ExpertiseLevel(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ExpertiseLevel
