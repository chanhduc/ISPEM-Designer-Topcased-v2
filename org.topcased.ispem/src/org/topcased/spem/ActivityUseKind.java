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
 * A representation of the literals of the enumeration '<em><b>Activity Use Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.topcased.spem.SpemPackage#getActivityUseKind()
 * @model
 * @generated
 */
public final class ActivityUseKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Na</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Na</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NA_LITERAL
	 * @model name="na"
	 * @generated
	 * @ordered
	 */
	public static final int NA = 0;

	/**
	 * The '<em><b>Extension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Extension</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_LITERAL
	 * @model name="extension"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION = 1;

	/**
	 * The '<em><b>Local Contribution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Local Contribution</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL_CONTRIBUTION_LITERAL
	 * @model name="localContribution"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_CONTRIBUTION = 2;

	/**
	 * The '<em><b>Local Replacement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Local Replacement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL_REPLACEMENT_LITERAL
	 * @model name="localReplacement"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_REPLACEMENT = 3;

	/**
	 * The '<em><b>Na</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NA
	 * @generated
	 * @ordered
	 */
	public static final ActivityUseKind NA_LITERAL = new ActivityUseKind(NA, "na", "na");

	/**
	 * The '<em><b>Extension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION
	 * @generated
	 * @ordered
	 */
	public static final ActivityUseKind EXTENSION_LITERAL = new ActivityUseKind(EXTENSION, "extension", "extension");

	/**
	 * The '<em><b>Local Contribution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_CONTRIBUTION
	 * @generated
	 * @ordered
	 */
	public static final ActivityUseKind LOCAL_CONTRIBUTION_LITERAL = new ActivityUseKind(LOCAL_CONTRIBUTION, "localContribution", "localContribution");

	/**
	 * The '<em><b>Local Replacement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_REPLACEMENT
	 * @generated
	 * @ordered
	 */
	public static final ActivityUseKind LOCAL_REPLACEMENT_LITERAL = new ActivityUseKind(LOCAL_REPLACEMENT, "localReplacement", "localReplacement");

	/**
	 * An array of all the '<em><b>Activity Use Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActivityUseKind[] VALUES_ARRAY =
		new ActivityUseKind[] {
			NA_LITERAL,
			EXTENSION_LITERAL,
			LOCAL_CONTRIBUTION_LITERAL,
			LOCAL_REPLACEMENT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Activity Use Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Activity Use Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityUseKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityUseKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Use Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityUseKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityUseKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Use Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityUseKind get(int value) {
		switch (value) {
			case NA: return NA_LITERAL;
			case EXTENSION: return EXTENSION_LITERAL;
			case LOCAL_CONTRIBUTION: return LOCAL_CONTRIBUTION_LITERAL;
			case LOCAL_REPLACEMENT: return LOCAL_REPLACEMENT_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActivityUseKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ActivityUseKind
