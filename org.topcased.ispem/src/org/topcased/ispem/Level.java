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
 * A representation of the literals of the enumeration '<em><b>Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.topcased.ispem.IspemPackage#getLevel()
 * @model
 * @generated
 */
public final class Level extends AbstractEnumerator {
	/**
	 * The '<em><b>Method</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Method</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METHOD_LITERAL
	 * @model name="Method"
	 * @generated
	 * @ordered
	 */
	public static final int METHOD = 2;

	/**
	 * The '<em><b>Domain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Domain</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_LITERAL
	 * @model name="Domain"
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN = 1;

	/**
	 * The '<em><b>Language</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Language</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LANGUAGE_LITERAL
	 * @model name="Language"
	 * @generated
	 * @ordered
	 */
	public static final int LANGUAGE = 3;

	/**
	 * The '<em><b>Method</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD
	 * @generated
	 * @ordered
	 */
	public static final Level METHOD_LITERAL = new Level(METHOD, "Method", "Method");

	/**
	 * The '<em><b>Domain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMAIN
	 * @generated
	 * @ordered
	 */
	public static final Level DOMAIN_LITERAL = new Level(DOMAIN, "Domain", "Domain");

	/**
	 * The '<em><b>Language</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANGUAGE
	 * @generated
	 * @ordered
	 */
	public static final Level LANGUAGE_LITERAL = new Level(LANGUAGE, "Language", "Language");

	/**
	 * An array of all the '<em><b>Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Level[] VALUES_ARRAY =
		new Level[] {
			METHOD_LITERAL,
			DOMAIN_LITERAL,
			LANGUAGE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Level get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Level result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Level getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Level result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Level get(int value) {
		switch (value) {
			case METHOD: return METHOD_LITERAL;
			case DOMAIN: return DOMAIN_LITERAL;
			case LANGUAGE: return LANGUAGE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Level(int value, String name, String literal) {
		super(value, name, literal);
	}

} //Level
