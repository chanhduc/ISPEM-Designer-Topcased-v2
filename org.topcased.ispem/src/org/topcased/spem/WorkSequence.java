/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.WorkSequence#getLinkKind <em>Link Kind</em>}</li>
 *   <li>{@link org.topcased.spem.WorkSequence#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link org.topcased.spem.WorkSequence#getSuccessor <em>Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.SpemPackage#getWorkSequence()
 * @model
 * @generated
 */
public interface WorkSequence extends BreakdownElement {
	/**
	 * Returns the value of the '<em><b>Link Kind</b></em>' attribute.
	 * The default value is <code>"finishToStart"</code>.
	 * The literals are from the enumeration {@link org.topcased.spem.WorkSequenceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Kind</em>' attribute.
	 * @see org.topcased.spem.WorkSequenceKind
	 * @see #setLinkKind(WorkSequenceKind)
	 * @see org.topcased.spem.SpemPackage#getWorkSequence_LinkKind()
	 * @model default="finishToStart" ordered="false"
	 * @generated
	 */
	WorkSequenceKind getLinkKind();

	/**
	 * Sets the value of the '{@link org.topcased.spem.WorkSequence#getLinkKind <em>Link Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Kind</em>' attribute.
	 * @see org.topcased.spem.WorkSequenceKind
	 * @see #getLinkKind()
	 * @generated
	 */
	void setLinkKind(WorkSequenceKind value);

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.topcased.spem.WorkBreakdownElement#getLinkToSuccessor <em>Link To Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(WorkBreakdownElement)
	 * @see org.topcased.spem.SpemPackage#getWorkSequence_Predecessor()
	 * @see org.topcased.spem.WorkBreakdownElement#getLinkToSuccessor
	 * @model opposite="linkToSuccessor" required="true"
	 * @generated
	 */
	WorkBreakdownElement getPredecessor();

	/**
	 * Sets the value of the '{@link org.topcased.spem.WorkSequence#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(WorkBreakdownElement value);

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.topcased.spem.WorkBreakdownElement#getLinkToPredecessor <em>Link To Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference.
	 * @see #setSuccessor(WorkBreakdownElement)
	 * @see org.topcased.spem.SpemPackage#getWorkSequence_Successor()
	 * @see org.topcased.spem.WorkBreakdownElement#getLinkToPredecessor
	 * @model opposite="linkToPredecessor" required="true"
	 * @generated
	 */
	WorkBreakdownElement getSuccessor();

	/**
	 * Sets the value of the '{@link org.topcased.spem.WorkSequence#getSuccessor <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(WorkBreakdownElement value);

} // WorkSequence
