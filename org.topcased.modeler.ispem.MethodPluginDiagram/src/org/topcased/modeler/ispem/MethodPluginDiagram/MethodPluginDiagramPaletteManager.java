/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.MethodPluginDiagram;

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
public class MethodPluginDiagramPaletteManager extends ModelerPaletteManager {
	// declare all the palette categories of the diagram
	/**
	 * @generated
	 */
	private PaletteDrawer nodesDrawer;

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
	public MethodPluginDiagramPaletteManager(ICreationUtils utils) {
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
				SpemPackage.eINSTANCE.getMethodContentPackage(), "default");
		entries.add(new ModelerCreationToolEntry(
				"Create Method Content Package",
				"Create Method Content Package", factory,
				MethodPluginDiagramImageRegistry
						.getImageDescriptor("METHODCONTENTPACKAGE"),
				MethodPluginDiagramImageRegistry
						.getImageDescriptor("METHODCONTENTPACKAGE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getProcessPackage(), "default");
		entries.add(new ModelerCreationToolEntry("Create Process Package",
				"Create Process Package", factory,
				MethodPluginDiagramImageRegistry
						.getImageDescriptor("PROCESSPACKAGE"),
				MethodPluginDiagramImageRegistry
						.getImageDescriptor("PROCESSPACKAGE_LARGE")));

		nodesDrawer.addAll(entries);
		getRoot().add(nodesDrawer);
	}

}
