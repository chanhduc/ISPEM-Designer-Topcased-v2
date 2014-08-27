/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.spem.uma.DeliveryProcess#getScale <em>Scale</em>}</li>
 *   <li>{@link org.topcased.spem.uma.DeliveryProcess#getProjectCharacteristics <em>Project Characteristics</em>}</li>
 *   <li>{@link org.topcased.spem.uma.DeliveryProcess#getRiskLevel <em>Risk Level</em>}</li>
 *   <li>{@link org.topcased.spem.uma.DeliveryProcess#getEstimatingTechnique <em>Estimating Technique</em>}</li>
 *   <li>{@link org.topcased.spem.uma.DeliveryProcess#getProjectMemberExpertise <em>Project Member Expertise</em>}</li>
 *   <li>{@link org.topcased.spem.uma.DeliveryProcess#getTypeOfContract <em>Type Of Contract</em>}</li>
 *   <li>{@link org.topcased.spem.uma.DeliveryProcess#getCommunicationMaterial <em>Communication Material</em>}</li>
 *   <li>{@link org.topcased.spem.uma.DeliveryProcess#getEducationalMaterial <em>Educational Material</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.spem.uma.UmaPackage#getDeliveryProcess()
 * @model annotation="doc scale='represents the size in man.year or other equivalent units'"
 * @generated
 */
public interface DeliveryProcess extends org.topcased.spem.uma.Process {
	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(String)
	 * @see org.topcased.spem.uma.UmaPackage#getDeliveryProcess_Scale()
	 * @model
	 * @generated
	 */
	String getScale();

	/**
	 * Sets the value of the '{@link org.topcased.spem.uma.DeliveryProcess#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(String value);

	/**
	 * Returns the value of the '<em><b>Project Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Characteristics</em>' attribute.
	 * @see #setProjectCharacteristics(String)
	 * @see org.topcased.spem.uma.UmaPackage#getDeliveryProcess_ProjectCharacteristics()
	 * @model
	 * @generated
	 */
	String getProjectCharacteristics();

	/**
	 * Sets the value of the '{@link org.topcased.spem.uma.DeliveryProcess#getProjectCharacteristics <em>Project Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Characteristics</em>' attribute.
	 * @see #getProjectCharacteristics()
	 * @generated
	 */
	void setProjectCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Risk Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.topcased.spem.uma.RiskLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Level</em>' attribute.
	 * @see org.topcased.spem.uma.RiskLevel
	 * @see #setRiskLevel(RiskLevel)
	 * @see org.topcased.spem.uma.UmaPackage#getDeliveryProcess_RiskLevel()
	 * @model
	 * @generated
	 */
	RiskLevel getRiskLevel();

	/**
	 * Sets the value of the '{@link org.topcased.spem.uma.DeliveryProcess#getRiskLevel <em>Risk Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Level</em>' attribute.
	 * @see org.topcased.spem.uma.RiskLevel
	 * @see #getRiskLevel()
	 * @generated
	 */
	void setRiskLevel(RiskLevel value);

	/**
	 * Returns the value of the '<em><b>Estimating Technique</b></em>' attribute.
	 * The literals are from the enumeration {@link org.topcased.spem.uma.EstimatingTechnique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimating Technique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimating Technique</em>' attribute.
	 * @see org.topcased.spem.uma.EstimatingTechnique
	 * @see #setEstimatingTechnique(EstimatingTechnique)
	 * @see org.topcased.spem.uma.UmaPackage#getDeliveryProcess_EstimatingTechnique()
	 * @model
	 * @generated
	 */
	EstimatingTechnique getEstimatingTechnique();

	/**
	 * Sets the value of the '{@link org.topcased.spem.uma.DeliveryProcess#getEstimatingTechnique <em>Estimating Technique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimating Technique</em>' attribute.
	 * @see org.topcased.spem.uma.EstimatingTechnique
	 * @see #getEstimatingTechnique()
	 * @generated
	 */
	void setEstimatingTechnique(EstimatingTechnique value);

	/**
	 * Returns the value of the '<em><b>Project Member Expertise</b></em>' attribute.
	 * The literals are from the enumeration {@link org.topcased.spem.uma.ExpertiseLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Member Expertise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Member Expertise</em>' attribute.
	 * @see org.topcased.spem.uma.ExpertiseLevel
	 * @see #setProjectMemberExpertise(ExpertiseLevel)
	 * @see org.topcased.spem.uma.UmaPackage#getDeliveryProcess_ProjectMemberExpertise()
	 * @model
	 * @generated
	 */
	ExpertiseLevel getProjectMemberExpertise();

	/**
	 * Sets the value of the '{@link org.topcased.spem.uma.DeliveryProcess#getProjectMemberExpertise <em>Project Member Expertise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Member Expertise</em>' attribute.
	 * @see org.topcased.spem.uma.ExpertiseLevel
	 * @see #getProjectMemberExpertise()
	 * @generated
	 */
	void setProjectMemberExpertise(ExpertiseLevel value);

	/**
	 * Returns the value of the '<em><b>Type Of Contract</b></em>' attribute.
	 * The literals are from the enumeration {@link org.topcased.spem.uma.ContractKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Of Contract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Of Contract</em>' attribute.
	 * @see org.topcased.spem.uma.ContractKind
	 * @see #setTypeOfContract(ContractKind)
	 * @see org.topcased.spem.uma.UmaPackage#getDeliveryProcess_TypeOfContract()
	 * @model
	 * @generated
	 */
	ContractKind getTypeOfContract();

	/**
	 * Sets the value of the '{@link org.topcased.spem.uma.DeliveryProcess#getTypeOfContract <em>Type Of Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Contract</em>' attribute.
	 * @see org.topcased.spem.uma.ContractKind
	 * @see #getTypeOfContract()
	 * @generated
	 */
	void setTypeOfContract(ContractKind value);

	/**
	 * Returns the value of the '<em><b>Communication Material</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.uma.SupportingMaterial}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Material</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Material</em>' reference list.
	 * @see org.topcased.spem.uma.UmaPackage#getDeliveryProcess_CommunicationMaterial()
	 * @model type="org.topcased.spem.uma.SupportingMaterial"
	 * @generated
	 */
	EList getCommunicationMaterial();

	/**
	 * Returns the value of the '<em><b>Educational Material</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.spem.uma.SupportingMaterial}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Educational Material</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Educational Material</em>' reference list.
	 * @see org.topcased.spem.uma.UmaPackage#getDeliveryProcess_EducationalMaterial()
	 * @model type="org.topcased.spem.uma.SupportingMaterial"
	 * @generated
	 */
	EList getEducationalMaterial();

} // DeliveryProcess
