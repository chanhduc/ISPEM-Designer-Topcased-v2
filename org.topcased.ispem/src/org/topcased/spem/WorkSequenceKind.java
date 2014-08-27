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
 * A representation of the literals of the enumeration '<em><b>Work Sequence Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.topcased.spem.SpemPackage#getWorkSequenceKind()
 * @model
 * @generated
 */
public final class WorkSequenceKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Finish To Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Finish To Start</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINISH_TO_START_LITERAL
	 * @model name="finishToStart"
	 * @generated
	 * @ordered
	 */
	public static final int FINISH_TO_START = 0;

	/**
	 * The '<em><b>Finish To Finish</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Finish To Finish</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINISH_TO_FINISH_LITERAL
	 * @model name="finishToFinish"
	 * @generated
	 * @ordered
	 */
	public static final int FINISH_TO_FINISH = 1;

	/**
	 * The '<em><b>Start To Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Start To Start</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #START_TO_START_LITERAL
	 * @model name="startToStart"
	 * @generated
	 * @ordered
	 */
	public static final int START_TO_START = 2;

	/**
	 * The '<em><b>Start To Finish</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Start To Finish</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #START_TO_FINISH_LITERAL
	 * @model name="startToFinish"
	 * @generated
	 * @ordered
	 */
	public static final int START_TO_FINISH = 3;

	/**
	 * The '<em><b>Finish To Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISH_TO_START
	 * @generated
	 * @ordered
	 */
	public static final WorkSequenceKind FINISH_TO_START_LITERAL = new WorkSequenceKind(FINISH_TO_START, "finishToStart", "finishToStart");

	/**
	 * The '<em><b>Finish To Finish</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISH_TO_FINISH
	 * @generated
	 * @ordered
	 */
	public static final WorkSequenceKind FINISH_TO_FINISH_LITERAL = new WorkSequenceKind(FINISH_TO_FINISH, "finishToFinish", "finishToFinish");

	/**
	 * The '<em><b>Start To Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_TO_START
	 * @generated
	 * @ordered
	 */
	public static final WorkSequenceKind START_TO_START_LITERAL = new WorkSequenceKind(START_TO_START, "startToStart", "startToStart");

	/**
	 * The '<em><b>Start To Finish</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_TO_FINISH
	 * @generated
	 * @ordered
	 */
	public static final WorkSequenceKind START_TO_FINISH_LITERAL = new WorkSequenceKind(START_TO_FINISH, "startToFinish", "startToFinish");

	/**
	 * An array of all the '<em><b>Work Sequence Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WorkSequenceKind[] VALUES_ARRAY =
		new WorkSequenceKind[] {
			FINISH_TO_START_LITERAL,
			FINISH_TO_FINISH_LITERAL,
			START_TO_START_LITERAL,
			START_TO_FINISH_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Work Sequence Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Work Sequence Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkSequenceKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WorkSequenceKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Work Sequence Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkSequenceKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WorkSequenceKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Work Sequence Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkSequenceKind get(int value) {
		switch (value) {
			case FINISH_TO_START: return FINISH_TO_START_LITERAL;
			case FINISH_TO_FINISH: return FINISH_TO_FINISH_LITERAL;
			case START_TO_START: return START_TO_START_LITERAL;
			case START_TO_FINISH: return START_TO_FINISH_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private WorkSequenceKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //WorkSequenceKind
