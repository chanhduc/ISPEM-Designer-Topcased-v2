/*******************************************************************************
 * 
 * Copyright AIRBUS FRANCE, 2005. All rights reserved.
 * 
 * This document and all information contained herein is the sole property of
 * AIRBUS FRANCE. No intellectual property rights are granted by the delivery of
 * this document or the disclosure of its content.
 * 
 ******************************************************************************/
package org.topcased.modeler.ispem.outline.menus;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.topcased.modeler.actions.CreateChildAction;
import org.topcased.modeler.editor.MixedEditDomain;
import org.topcased.modeler.editor.outline.ICreateChildMenu;
import org.topcased.modeler.ispem.outline.util.ExactIspemSwitch;

/**
 * A customized 'Create child' menu manager.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class iSPEMCreateChildMenu extends MenuManager implements
		ICreateChildMenu {
	/**
	 * @generated
	 */
	private static final String UNAPPLIED_ACTIONS_GROUP = "unappliedActions";

	/**
	 * @generated
	 */
	private MixedEditDomain domain;

	/**
	 * @generated
	 */
	private EObject selectedObject;

	/**
	 * @generated
	 */
	private Collection descriptors;

	/**
	 * @generated
	 */
	private MenuManager thisMenu;

	/**
	 * The 'Activity Diagram' menu manager.
	 * @generated
	 */
	private MenuManager AddActivityDiagramMenu;

	/**
	 * Constructor.
	 * @generated
	 */
	public iSPEMCreateChildMenu() {
		super("Create child");
		thisMenu = this;
	}

	/**
	 * @see org.topcased.modeler.editor.outline.ICreateChildMenu#setMixedEditDomain(org.topcased.modeler.editor.MixedEditDomain)
	 */
	public void setMixedEditDomain(MixedEditDomain domain) {
		this.domain = domain;
	}

	/**
	 * @see org.topcased.modeler.editor.outline.ICreateChildMenu#setSelectedEObject(org.eclipse.emf.ecore.EObject)
	 */
	public void setSelectedEObject(EObject object) {
		selectedObject = object;
	}

	/**
	 * Creates this menu contents.<br>
	 * It creates the menu structure and add all the create child actions.<br> 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void createMenuContents() {
		this.descriptors = domain.getEMFEditingDomain().getNewChildDescriptors(
				selectedObject, null);
		createMenus(this);

		for (Iterator it = descriptors.iterator(); it.hasNext();) {
			CommandParameter descriptor = (CommandParameter) it.next();
			EObject child = (EObject) descriptor.getValue();
			CreateChildAction action = new CreateChildAction(domain,
					selectedObject, descriptor);

			boolean added = false;

			added = addToAddDiagramGroup(child, action) || added;

			added = addToAddActivityDiagramMenu(child, action) || added;

			if (!added) {
				appendToGroup(UNAPPLIED_ACTIONS_GROUP, action);
			}
		}
	}

	/**
	 * Create this menu structure. <br>
	 * It creates all the menus and groups.<br>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param menu the create child menu manager 
	 * @generated
	 */
	protected void createMenus(MenuManager menu) {

		Separator AddDiagramGroup = new Separator("AddDiagram");

		menu.add(AddDiagramGroup);

		AddActivityDiagramMenu = new MenuManager("Activity Diagram");

		menu.add(AddActivityDiagramMenu);

		// Group containing non sorted actions. 
		menu.add(new Separator(UNAPPLIED_ACTIONS_GROUP));
	}

	/**
	 * Tries to add for the given child object the associated action to the
	 * 'AddDiagram' group.<br>
	 * If this group has groups or submenus, it also tries to add the action in each
	 * of them.<br>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param child the child object for the one the action must be added
	 * @param childAction the action to add
	 * @return <code>true</code> if the given action has been added to this group or one
	 * of its groups or submenus, or <code>false</code> otherwise.
	 * @generated
	 */
	private boolean addToAddDiagramGroup(EObject child,
			CreateChildAction childAction) {
		boolean added = false;
		final CreateChildAction action = childAction;

		return added;
	}

	/**
	 * Tries to add for the given child object the associated action to the
	 * 'AddActivityDiagram' menu.<br>
	 * If this menu has groups or submenus, it also tries to add the action in each
	 * of them.<br>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param child the child object for the one the action must be added
	 * @param childAction the action to add
	 * @return <code>true</code> if the given action has been added to this menu or one
	 * of its groups or submenus, or <code>false</code> otherwise.
	 * @generated
	 */
	private boolean addToAddActivityDiagramMenu(EObject child,
			CreateChildAction childAction) {
		boolean added = false;
		final CreateChildAction action = childAction;

		Object exactResult = new ExactIspemSwitch() {

			public Object caseActivity(org.topcased.ispem.Activity object) {

				AddActivityDiagramMenu.add(action);

				return action;
			}

		}.doSwitch(child);
		added = added || (exactResult == action);

		return added;
	}

}
