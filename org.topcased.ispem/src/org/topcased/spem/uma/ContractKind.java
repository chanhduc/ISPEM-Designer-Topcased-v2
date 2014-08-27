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
 * A representation of the literals of the enumeration '<em><b>Contract Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.topcased.spem.uma.UmaPackage#getContractKind()
 * @model
 * @generated
 */
public final class ContractKind extends AbstractEnumerator {
	/**
	 * The '<em><b>EXPRESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXPRESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPRESS_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPRESS = 1;

	/**
	 * The '<em><b>IMPLIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMPLIED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPLIED_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMPLIED = 2;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER = 2;

	/**
	 * The '<em><b>EXPRESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPRESS
	 * @generated
	 * @ordered
	 */
	public static final ContractKind EXPRESS_LITERAL = new ContractKind(EXPRESS, "EXPRESS", "EXPRESS");

	/**
	 * The '<em><b>IMPLIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLIED
	 * @generated
	 * @ordered
	 */
	public static final ContractKind IMPLIED_LITERAL = new ContractKind(IMPLIED, "IMPLIED", "IMPLIED");

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final ContractKind OTHER_LITERAL = new ContractKind(OTHER, "OTHER", "OTHER");

	/**
	 * An array of all the '<em><b>Contract Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContractKind[] VALUES_ARRAY =
		new ContractKind[] {
			EXPRESS_LITERAL,
			IMPLIED_LITERAL,
			OTHER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Contract Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Contract Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContractKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContractKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contract Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContractKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContractKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contract Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContractKind get(int value) {
		switch (value) {
			case EXPRESS: return EXPRESS_LITERAL;
			case IMPLIED: return IMPLIED_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ContractKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ContractKind
