/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.topcased.ispem.Artifact;
import org.topcased.ispem.ArtifactTransformation;
import org.topcased.ispem.IspemPackage;
import org.topcased.ispem.OntologyLinkedElement;

import org.topcased.spem.WorkProductUse;

import org.topcased.spem.impl.BreakdownElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.ispem.impl.ArtifactTransformationImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.ArtifactTransformationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.ArtifactTransformationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.ArtifactTransformationImpl#getTransformationFile <em>Transformation File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactTransformationImpl extends BreakdownElementImpl implements ArtifactTransformation {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Artifact source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Artifact target;

	/**
	 * The default value of the '{@link #getTransformationFile() <em>Transformation File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationFile()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORMATION_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformationFile() <em>Transformation File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationFile()
	 * @generated
	 * @ordered
	 */
	protected String transformationFile = TRANSFORMATION_FILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IspemPackage.Literals.ARTIFACT_TRANSFORMATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.ARTIFACT_TRANSFORMATION__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Artifact)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.ARTIFACT_TRANSFORMATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Artifact newSource) {
		Artifact oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.ARTIFACT_TRANSFORMATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Artifact)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IspemPackage.ARTIFACT_TRANSFORMATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Artifact newTarget) {
		Artifact oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.ARTIFACT_TRANSFORMATION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransformationFile() {
		return transformationFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationFile(String newTransformationFile) {
		String oldTransformationFile = transformationFile;
		transformationFile = newTransformationFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IspemPackage.ARTIFACT_TRANSFORMATION__TRANSFORMATION_FILE, oldTransformationFile, transformationFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IspemPackage.ARTIFACT_TRANSFORMATION__URI:
				return getUri();
			case IspemPackage.ARTIFACT_TRANSFORMATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case IspemPackage.ARTIFACT_TRANSFORMATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case IspemPackage.ARTIFACT_TRANSFORMATION__TRANSFORMATION_FILE:
				return getTransformationFile();
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
			case IspemPackage.ARTIFACT_TRANSFORMATION__URI:
				setUri((String)newValue);
				return;
			case IspemPackage.ARTIFACT_TRANSFORMATION__SOURCE:
				setSource((Artifact)newValue);
				return;
			case IspemPackage.ARTIFACT_TRANSFORMATION__TARGET:
				setTarget((Artifact)newValue);
				return;
			case IspemPackage.ARTIFACT_TRANSFORMATION__TRANSFORMATION_FILE:
				setTransformationFile((String)newValue);
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
			case IspemPackage.ARTIFACT_TRANSFORMATION__URI:
				setUri(URI_EDEFAULT);
				return;
			case IspemPackage.ARTIFACT_TRANSFORMATION__SOURCE:
				setSource((Artifact)null);
				return;
			case IspemPackage.ARTIFACT_TRANSFORMATION__TARGET:
				setTarget((Artifact)null);
				return;
			case IspemPackage.ARTIFACT_TRANSFORMATION__TRANSFORMATION_FILE:
				setTransformationFile(TRANSFORMATION_FILE_EDEFAULT);
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
			case IspemPackage.ARTIFACT_TRANSFORMATION__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case IspemPackage.ARTIFACT_TRANSFORMATION__SOURCE:
				return source != null;
			case IspemPackage.ARTIFACT_TRANSFORMATION__TARGET:
				return target != null;
			case IspemPackage.ARTIFACT_TRANSFORMATION__TRANSFORMATION_FILE:
				return TRANSFORMATION_FILE_EDEFAULT == null ? transformationFile != null : !TRANSFORMATION_FILE_EDEFAULT.equals(transformationFile);
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
				case IspemPackage.ARTIFACT_TRANSFORMATION__URI: return IspemPackage.ONTOLOGY_LINKED_ELEMENT__URI;
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
				case IspemPackage.ONTOLOGY_LINKED_ELEMENT__URI: return IspemPackage.ARTIFACT_TRANSFORMATION__URI;
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
		result.append(", TransformationFile: ");
		result.append(transformationFile);
		result.append(')');
		return result.toString();
	}

} //ArtifactTransformationImpl
