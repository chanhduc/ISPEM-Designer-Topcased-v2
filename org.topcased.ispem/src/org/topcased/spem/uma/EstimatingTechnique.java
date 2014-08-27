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
 * A representation of the literals of the enumeration '<em><b>Estimating Technique</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.topcased.spem.uma.UmaPackage#getEstimatingTechnique()
 * @model
 * @generated
 */
public final class EstimatingTechnique extends AbstractEnumerator {
	/**
	 * The '<em><b>COST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COST_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COST = 0;

	/**
	 * The '<em><b>TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME = 1;

	/**
	 * The '<em><b>SKILLS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SKILLS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SKILLS_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SKILLS = 2;

	/**
	 * The '<em><b>DEFECTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEFECTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFECTS_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFECTS = 3;

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
	public static final int OTHER = 4;

	/**
	 * The '<em><b>COST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COST
	 * @generated
	 * @ordered
	 */
	public static final EstimatingTechnique COST_LITERAL = new EstimatingTechnique(COST, "COST", "COST");

	/**
	 * The '<em><b>TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @generated
	 * @ordered
	 */
	public static final EstimatingTechnique TIME_LITERAL = new EstimatingTechnique(TIME, "TIME", "TIME");

	/**
	 * The '<em><b>SKILLS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKILLS
	 * @generated
	 * @ordered
	 */
	public static final EstimatingTechnique SKILLS_LITERAL = new EstimatingTechnique(SKILLS, "SKILLS", "SKILLS");

	/**
	 * The '<em><b>DEFECTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFECTS
	 * @generated
	 * @ordered
	 */
	public static final EstimatingTechnique DEFECTS_LITERAL = new EstimatingTechnique(DEFECTS, "DEFECTS", "DEFECTS");

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final EstimatingTechnique OTHER_LITERAL = new EstimatingTechnique(OTHER, "OTHER", "OTHER");

	/**
	 * An array of all the '<em><b>Estimating Technique</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EstimatingTechnique[] VALUES_ARRAY =
		new EstimatingTechnique[] {
			COST_LITERAL,
			TIME_LITERAL,
			SKILLS_LITERAL,
			DEFECTS_LITERAL,
			OTHER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Estimating Technique</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Estimating Technique</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EstimatingTechnique get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EstimatingTechnique result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Estimating Technique</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EstimatingTechnique getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EstimatingTechnique result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Estimating Technique</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EstimatingTechnique get(int value) {
		switch (value) {
			case COST: return COST_LITERAL;
			case TIME: return TIME_LITERAL;
			case SKILLS: return SKILLS_LITERAL;
			case DEFECTS: return DEFECTS_LITERAL;
			case OTHER: return OTHER_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EstimatingTechnique(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EstimatingTechnique
