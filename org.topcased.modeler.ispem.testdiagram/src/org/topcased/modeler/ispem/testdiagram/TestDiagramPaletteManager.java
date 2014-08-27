/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.testdiagram;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.requests.CreationFactory;
import org.topcased.modeler.editor.GraphElementCreationFactory;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.palette.ModelerCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerPaletteManager;
import org.topcased.spem.SpemPackage;

/**
 * Generated Palette Manager
 *
 * @generated
 */
public class TestDiagramPaletteManager extends ModelerPaletteManager {
	// declare all the palette categories of the diagram
	/**
	 * @generated
	 */
	private PaletteDrawer nodeDrawer;

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
	public TestDiagramPaletteManager(ICreationUtils utils) {
		super();
		this.creationUtils = utils;
	}

	/**
	 * Creates the main categories of the palette
	 *
	 * @generated
	 */
	protected void createCategories() {
		createNodeDrawer();
	}

	/**
	 * Updates the main categories of the palette
	 *
	 * @generated
	 */
	protected void updateCategories() {
		// deletion of the existing categories and creation of the updated categories

		getRoot().remove(nodeDrawer);
		createNodeDrawer();
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 *
	 * @generated
	 */
	private void createNodeDrawer() {
		nodeDrawer = new PaletteDrawer("Node", null);
		List<PaletteEntry> entries = new ArrayList<PaletteEntry>();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getTaskDefinition(), "default");
		entries.add(new ModelerCreationToolEntry("Task Definition",
				"Task Definition", factory, TestDiagramImageRegistry
						.getImageDescriptor("TASKDEFINITION"),
				TestDiagramImageRegistry
						.getImageDescriptor("TASKDEFINITION_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getRoleDefinition(), "default");
		entries.add(new ModelerCreationToolEntry("Role Definition",
				"Role Definition", factory, TestDiagramImageRegistry
						.getImageDescriptor("ROLEDEFINITION"),
				TestDiagramImageRegistry
						.getImageDescriptor("ROLEDEFINITION_LARGE")));

		nodeDrawer.addAll(entries);
		getRoot().add(nodeDrawer);
	}

}
