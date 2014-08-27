/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.topcased.ispem.DomainArtifactDefinition;
import org.topcased.ispem.IspemPackage;
import org.topcased.ispem.MethodArtifactDefinition;
import org.topcased.ispem.Viewpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Artifact Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.ispem.impl.DomainArtifactDefinitionImpl#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link org.topcased.ispem.impl.DomainArtifactDefinitionImpl#getOrganized <em>Organized</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainArtifactDefinitionImpl extends ArtifactDefinitionImpl implements DomainArtifactDefinition {
	/**
	 * The cached value of the '{@link #getSpecializes() <em>Specializes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializes()
	 * @generated
	 * @ordered
	 */
	protected EList specializes;

	/**
	 * The cached value of the '{@link #getOrganized() <em>Organized</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganized()
	 * @generated
	 * @ordered
	 */
	protected EList organized;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainArtifactDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IspemPackage.Literals.DOMAIN_ARTIFACT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSpecializes() {
		if (specializes == null) {
			specializes = new EObjectWithInverseResolvingEList(MethodArtifactDefinition.class, this, IspemPackage.DOMAIN_ARTIFACT_DEFINITION__SPECIALIZES, IspemPackage.METHOD_ARTIFACT_DEFINITION__SPECIALIZED_BY);
		}
		return specializes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOrganized() {
		if (organized == null) {
			organized = new EObjectWithInverseResolvingEList.ManyInverse(Viewpoint.class, this, IspemPackage.DOMAIN_ARTIFACT_DEFINITION__ORGANIZED, IspemPackage.VIEWPOINT__CARACTERIZES);
		}
		return organized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IspemPackage.DOMAIN_ARTIFACT_DEFINITION__SPECIALIZES:
				return ((InternalEList)getSpecializes()).basicAdd(otherEnd, msgs);
			case IspemPackage.DOMAIN_ARTIFACT_DEFINITION__ORGANIZED:
				return ((InternalEList)getOrganized()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IspemPackage.DOMAIN_ARTIFACT_DEFINITION__SPECIALIZES:
				return ((InternalEList)getSpecializes()).basicRemove(otherEnd, msgs);
			case IspemPackage.DOMAIN_ARTIFACT_DEFINITION__ORGANIZED:
				return ((InternalEList)getOrganized()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IspemPackage.DOMAIN_ARTIFACT_DEFINITION__SPECIALIZES:
				return getSpecializes();
			case IspemPackage.DOMAIN_ARTIFACT_DEFINITION__ORGANIZED:
				return getOrganized();
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
			case IspemPackage.DOMAIN_ARTIFACT_DEFINITION__SPECIALIZES:
				getSpecializes().clear();
				getSpecializes().addAll((Collection)newValue);
				return;
			case IspemPackage.DOMAIN_ARTIFACT_DEFINITION__ORGANIZED:
				getOrganized().clear();
				getOrganized().addAll((Collection)newValue);
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
			case IspemPackage.DOMAIN_ARTIFACT_DEFINITION__SPECIALIZES:
				getSpecializes().clear();
				return;
			case IspemPackage.DOMAIN_ARTIFACT_DEFINITION__ORGANIZED:
				getOrganized().clear();
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
			case IspemPackage.DOMAIN_ARTIFACT_DEFINITION__SPECIALIZES:
				return specializes != null && !specializes.isEmpty();
			case IspemPackage.DOMAIN_ARTIFACT_DEFINITION__ORGANIZED:
				return organized != null && !organized.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainArtifactDefinitionImpl
