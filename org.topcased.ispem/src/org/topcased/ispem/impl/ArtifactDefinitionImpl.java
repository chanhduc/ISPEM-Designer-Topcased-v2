/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.ispem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.topcased.ispem.ArtifactDefinition;
import org.topcased.ispem.IspemPackage;
import org.topcased.ispem.Level;
import org.topcased.ispem.MetaModel;
import org.topcased.ispem.Viewpoint;

import org.topcased.spem.MethodContentElement;
import org.topcased.spem.MethodContentKind;
import org.topcased.spem.MethodContentPackageableElement;
import org.topcased.spem.SpemPackage;
import org.topcased.spem.VariabilityElement;
import org.topcased.spem.VariabilityType;
import org.topcased.spem.WorkProductDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ArtifactDefinitionImpl extends WorkProductDefinitionImpl implements ArtifactDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IspemPackage.Literals.ARTIFACT_DEFINITION;
	}

} //ArtifactDefinitionImpl
