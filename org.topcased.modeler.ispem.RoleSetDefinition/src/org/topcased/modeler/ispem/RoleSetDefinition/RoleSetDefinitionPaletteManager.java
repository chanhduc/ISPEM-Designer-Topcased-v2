/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.RoleSetDefinition;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.requests.CreationFactory;
import org.topcased.modeler.editor.GraphElementCreationFactory;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.palette.ModelerConnectionCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerPaletteManager;
import org.topcased.modeler.ispem.RoleSetDefinition.tools.RoleDefinitionSelectionTool;
import org.topcased.spem.SpemPackage;
import org.topcased.spem.uma.UmaPackage;

/**
 * Generated Palette Manager
 *
 * @generated
 */
public class RoleSetDefinitionPaletteManager extends ModelerPaletteManager {
	// declare all the palette categories of the diagram
	/**
	 * @generated
	 */
	private PaletteDrawer nodesDrawer;
	/**
	 * @generated
	 */
	private PaletteDrawer linksDrawer;

	/**
	 * @generated
	 */
	private ICreationUtils creationUtils;

	/**
	 * The Constructor
	 *
	 * @param utils the creation utils for the tools of the palette 
	 * @generated
	 */
	public RoleSetDefinitionPaletteManager(ICreationUtils utils) {
		super();
		this.creationUtils = utils;
	}

	/**
	 * Creates the main categories of the palette
	 *
	 * @generated
	 */
	protected void createCategories() {
		createNodesDrawer();
		createLinksDrawer();
	}

	/**
	 * Updates the main categories of the palette
	 *
	 * @generated
	 */
	protected void updateCategories() {
		// deletion of the existing categories and creation of the updated categories

		getRoot().remove(nodesDrawer);
		createNodesDrawer();

		getRoot().remove(linksDrawer);
		createLinksDrawer();
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 *
	 * @generated
	 */
	private void createNodesDrawer() {
		nodesDrawer = new PaletteDrawer("Nodes", null);
		List<PaletteEntry> entries = new ArrayList<PaletteEntry>();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils,
				UmaPackage.eINSTANCE.getRoleSet(), "default");
		entries.add(new ModelerCreationToolEntry("Create Role Set",
				"Create Role Set", factory, RoleSetDefinitionImageRegistry
						.getImageDescriptor("ROLESET"),
				RoleSetDefinitionImageRegistry
						.getImageDescriptor("ROLESET_LARGE")));

		
		entries.add(new ToolEntry("Select Role Definition",
				"Select Role Definition",
				RoleSetDefinitionImageRegistry
						.getImageDescriptor("ROLEDEFINITION"),
				RoleSetDefinitionImageRegistry
						.getImageDescriptor("ROLEDEFINITION_LARGE"),
						RoleDefinitionSelectionTool.class) {});

		nodesDrawer.addAll(entries);
		getRoot().add(nodesDrawer);
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 *
	 * @generated
	 */
	private void createLinksDrawer() {
		linksDrawer = new PaletteDrawer("Links", null);
		List<PaletteEntry> entries = new ArrayList<PaletteEntry>();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(
				creationUtils,
				RoleSetDefinitionSimpleObjectConstants.SIMPLE_OBJECT_CATEGORIZEROLEDEFINITION,
				"default", false);
		entries.add(new ModelerConnectionCreationToolEntry("Categorize",
				"Categorize", factory, RoleSetDefinitionImageRegistry
						.getImageDescriptor("CATEGORIZEROLEDEFINITION"),
				RoleSetDefinitionImageRegistry
						.getImageDescriptor("CATEGORIZEROLEDEFINITION_LARGE")));

		linksDrawer.addAll(entries);
		getRoot().add(linksDrawer);
	}

}
