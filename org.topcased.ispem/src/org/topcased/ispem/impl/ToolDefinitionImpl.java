/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.topcased.ispem.EngineeringDomain;
import org.topcased.ispem.IspemPackage;
import org.topcased.ispem.OntologyLinkedElement;
import org.topcased.ispem.RepresentativeLanguage;
import org.topcased.ispem.ToolDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.ispem.impl.ToolDefinitionImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.ToolDefinitionImpl#getSupportedEngineringDomain <em>Supported Enginering Domain</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.ToolDefinitionImpl#getSupportedRepresentativeLanguage <em>Supported Representative Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToolDefinitionImpl extends org.topcased.spem.impl.ToolDefinitionImpl implements ToolDefinition {
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = "http://www.example.org";

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedEngineringDomain() <em>Supported Enginering Domain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedEngineringDomain()
	 * @generated
	 * @ordered
	 */
	protected EList supportedEngineringDomain;

	/**
	 * The cached value of the '{@link #getSupportedRepresentativeLanguage() <em>Supported Representative Language</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedRepresentativeLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList supportedRepresentativeLanguage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IspemPackage.Literals.TOOL_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.TOOL_DEFINITION__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSupportedEngineringDomain() {
		if (supportedEngineringDomain == null) {
			supportedEngineringDomain = new EObjectResolvingEList(EngineeringDomain.class, this, IspemPackage.TOOL_DEFINITION__SUPPORTED_ENGINERING_DOMAIN);
		}
		return supportedEngineringDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSupportedRepresentativeLanguage() {
		if (supportedRepresentativeLanguage == null) {
			supportedRepresentativeLanguage = new EObjectResolvingEList(RepresentativeLanguage.class, this, IspemPackage.TOOL_DEFINITION__SUPPORTED_REPRESENTATIVE_LANGUAGE);
		}
		return supportedRepresentativeLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IspemPackage.TOOL_DEFINITION__URI:
				return getUri();
			case IspemPackage.TOOL_DEFINITION__SUPPORTED_ENGINERING_DOMAIN:
				return getSupportedEngineringDomain();
			case IspemPackage.TOOL_DEFINITION__SUPPORTED_REPRESENTATIVE_LANGUAGE:
				return getSupportedRepresentativeLanguage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IspemPackage.TOOL_DEFINITION__URI:
				setUri((String)newValue);
				return;
			case IspemPackage.TOOL_DEFINITION__SUPPORTED_ENGINERING_DOMAIN:
				getSupportedEngineringDomain().clear();
				getSupportedEngineringDomain().addAll((Collection)newValue);
				return;
			case IspemPackage.TOOL_DEFINITION__SUPPORTED_REPRESENTATIVE_LANGUAGE:
				getSupportedRepresentativeLanguage().clear();
				getSupportedRepresentativeLanguage().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case IspemPackage.TOOL_DEFINITION__URI:
				setUri(URI_EDEFAULT);
				return;
			case IspemPackage.TOOL_DEFINITION__SUPPORTED_ENGINERING_DOMAIN:
				getSupportedEngineringDomain().clear();
				return;
			case IspemPackage.TOOL_DEFINITION__SUPPORTED_REPRESENTATIVE_LANGUAGE:
				getSupportedRepresentativeLanguage().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IspemPackage.TOOL_DEFINITION__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case IspemPackage.TOOL_DEFINITION__SUPPORTED_ENGINERING_DOMAIN:
				return supportedEngineringDomain != null && !supportedEngineringDomain.isEmpty();
			case IspemPackage.TOOL_DEFINITION__SUPPORTED_REPRESENTATIVE_LANGUAGE:
				return supportedRepresentativeLanguage != null && !supportedRepresentativeLanguage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == OntologyLinkedElement.class) {
			switch (derivedFeatureID) {
				case IspemPackage.TOOL_DEFINITION__URI: return IspemPackage.ONTOLOGY_LINKED_ELEMENT__URI;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == OntologyLinkedElement.class) {
			switch (baseFeatureID) {
				case IspemPackage.ONTOLOGY_LINKED_ELEMENT__URI: return IspemPackage.TOOL_DEFINITION__URI;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //ToolDefinitionImpl
