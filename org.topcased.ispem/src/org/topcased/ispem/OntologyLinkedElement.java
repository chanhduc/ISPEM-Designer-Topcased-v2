/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem;

import org.topcased.spem.DescribableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology Linked Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.ispem.OntologyLinkedElement#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.ispem.IspemPackage#getOntologyLinkedElement()
 * @model
 * @generated
 */
public interface OntologyLinkedElement extends DescribableElement {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * The default value is <code>"http://www.example.org"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.topcased.ispem.IspemPackage#getOntologyLinkedElement_Uri()
	 * @model default="http://www.example.org"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.topcased.ispem.OntologyLinkedElement#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // OntologyLinkedElement
