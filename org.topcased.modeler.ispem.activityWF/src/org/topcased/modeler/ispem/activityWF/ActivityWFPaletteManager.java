/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.activityWF;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.requests.CreationFactory;
import org.topcased.ispem.IspemPackage;
import org.topcased.modeler.editor.GraphElementCreationFactory;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.palette.ModelerConnectionCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerPaletteManager;
import org.topcased.modeler.ispem.activityWF.tools.ReuseTaskDefinitionTool;
import org.topcased.modeler.ispem.activityWF.tools.ReuseWorkProductDefinitionTool;
import org.topcased.spem.SpemPackage;
import org.topcased.spem.activity.ActivityPackage;

/**
 * Generated Palette Manager
 *
 * @generated
 */
public class ActivityWFPaletteManager extends ModelerPaletteManager {
	// declare all the palette categories of the diagram
	
	private PaletteDrawer reuseDrawer;
	/**
	 * @generated
	 */
	private PaletteDrawer nodeDrawer;
	/**
	 * @generated
	 */
	private PaletteDrawer processparameterDrawer;
	/**
	 * @generated
	 */
	private PaletteDrawer processperformerDrawer;
	/**
	 * @generated
	 */
	private PaletteDrawer edgeDrawer;

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
	public ActivityWFPaletteManager(ICreationUtils utils) {
		super();
		this.creationUtils = utils;
	}

	/**
	 * Creates the main categories of the palette
	 *
	 * @generated
	 */
	protected void createCategories() {
		createReuseDrawer();
		createNodeDrawer();
		createProcessParameterDrawer();
		createProcessPerformerDrawer();
		createEdgeDrawer();
	}

	/**
	 * Updates the main categories of the palette
	 *
	 * @generated
	 */
	protected void updateCategories() {
		// deletion of the existing categories and creation of the updated categories
		getRoot().remove(reuseDrawer);
		createReuseDrawer();
		
		getRoot().remove(nodeDrawer);
		createNodeDrawer();

		getRoot().remove(processparameterDrawer);
		createProcessParameterDrawer();

		getRoot().remove(processperformerDrawer);
		createProcessPerformerDrawer();

		getRoot().remove(edgeDrawer);
		createEdgeDrawer();
	}
	
	/**
	 * Createsthe Palette container containing all the Palette entries for each figure.
	 */
	private void createReuseDrawer()
	{
		reuseDrawer = new PaletteDrawer("Reuse", null);
		List<PaletteEntry> entries = new ArrayList<PaletteEntry>();
		entries.add(new ToolEntry("Reuse Task Definition", "Click on the diagram to reuse",
				ActivityWFImageRegistry.getImageDescriptor("TASKUSE"),
				ActivityWFImageRegistry.getImageDescriptor("TASKUSE_LARGE"),ReuseTaskDefinitionTool.class){});
		entries.add(new ToolEntry("Reuse Work Product Definition", "Click on the diagram to reuse",
				ActivityWFImageRegistry.getImageDescriptor("ARTIFACT"),
				ActivityWFImageRegistry.getImageDescriptor("ARTIFACT_LARGE"),ReuseWorkProductDefinitionTool.class){});
		
		reuseDrawer.addAll(entries);
		getRoot().add(reuseDrawer);
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
				SpemPackage.eINSTANCE.getTaskUse(), "default");
		entries.add(new ModelerCreationToolEntry("Create Task Use",
				"Create Task Use", factory, ActivityWFImageRegistry
						.getImageDescriptor("TASKUSE"), ActivityWFImageRegistry
						.getImageDescriptor("TASKUSE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getRoleUse(), "default");
		entries.add(new ModelerCreationToolEntry("Create Role Use",
				"Create Role Use", factory, ActivityWFImageRegistry
						.getImageDescriptor("ROLEUSE"), ActivityWFImageRegistry
						.getImageDescriptor("ROLEUSE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getWorkProductUse(), "default");
		entries.add(new ModelerCreationToolEntry("Create Artifact",
				"Create Artifact", factory, ActivityWFImageRegistry
						.getImageDescriptor("ARTIFACT"),
				ActivityWFImageRegistry.getImageDescriptor("ARTIFACT_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				ActivityPackage.eINSTANCE.getStartNode(), "default");
		entries.add(new ModelerCreationToolEntry("Start Node", "Start Node",
				factory, ActivityWFImageRegistry
						.getImageDescriptor("STARTNODE"),
				ActivityWFImageRegistry.getImageDescriptor("STARTNODE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				ActivityPackage.eINSTANCE.getEndNode(), "default");
		entries.add(new ModelerCreationToolEntry("End Node", "End Node",
				factory, ActivityWFImageRegistry.getImageDescriptor("ENDNODE"),
				ActivityWFImageRegistry.getImageDescriptor("ENDNODE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				ActivityPackage.eINSTANCE.getForkNode(), "default");
		entries.add(new ModelerCreationToolEntry("Fork Node", "Fork Node",
				factory,
				ActivityWFImageRegistry.getImageDescriptor("FORKNODE"),
				ActivityWFImageRegistry.getImageDescriptor("FORKNODE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				ActivityPackage.eINSTANCE.getJoinNode(), "default");
		entries.add(new ModelerCreationToolEntry("Join Node", "Join Node",
				factory,
				ActivityWFImageRegistry.getImageDescriptor("JOINNODE"),
				ActivityWFImageRegistry.getImageDescriptor("JOINNODE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				ActivityPackage.eINSTANCE.getDecisionNode(), "default");
		entries.add(new ModelerCreationToolEntry("Desion Node", "Desion Node",
				factory, ActivityWFImageRegistry
						.getImageDescriptor("DECISIONNODE"),
				ActivityWFImageRegistry
						.getImageDescriptor("DECISIONNODE_LARGE")));

		nodeDrawer.addAll(entries);
		getRoot().add(nodeDrawer);
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 *
	 * @generated
	 */
	private void createProcessParameterDrawer() {
		processparameterDrawer = new PaletteDrawer("ProcessParameter", null);
		List<PaletteEntry> entries = new ArrayList<PaletteEntry>();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getProcessParameter(), "artifactIn");
		
		entries.add(new ModelerConnectionCreationToolEntry("Artifact In",
				"Artifact In", factory, ActivityWFImageRegistry
						.getImageDescriptor("PROCESSPARAMETERIN"),
				ActivityWFImageRegistry
						.getImageDescriptor("PROCESSPARAMETERIN_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getProcessParameter(), "artifactOut");
		entries.add(new ModelerConnectionCreationToolEntry("Artifact Out",
				"Artifact Out", factory, ActivityWFImageRegistry
						.getImageDescriptor("PROCESSPARAMETEROUT"),
				ActivityWFImageRegistry
						.getImageDescriptor("PROCESSPARAMETEROUT_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getProcessParameter(), "artifactInOut");
		entries.add(new ModelerConnectionCreationToolEntry("Artifact InOut",
				"Artifact InOut", factory, ActivityWFImageRegistry
						.getImageDescriptor("PROCESSPARAMETERINOUT"),
				ActivityWFImageRegistry
						.getImageDescriptor("PROCESSPARAMETERINOUT_LARGE")));

		processparameterDrawer.addAll(entries);
		getRoot().add(processparameterDrawer);
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 *
	 * @generated
	 */
	private void createProcessPerformerDrawer() {
		processperformerDrawer = new PaletteDrawer("ProcessPerformer", null);
		List<PaletteEntry> entries = new ArrayList<PaletteEntry>();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getProcessPerformer(), "default");
		entries.add(new ModelerConnectionCreationToolEntry("Realize Task",
				"Realize Task", factory, ActivityWFImageRegistry
						.getImageDescriptor("PROCESSPERFORMER"),
				ActivityWFImageRegistry
						.getImageDescriptor("PROCESSPERFORMER_LARGE")));

		processperformerDrawer.addAll(entries);
		getRoot().add(processperformerDrawer);
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 *
	 * @generated
	 */
	private void createEdgeDrawer() {
		edgeDrawer = new PaletteDrawer("Edge", null);
		List<PaletteEntry> entries = new ArrayList<PaletteEntry>();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils,
				ActivityPackage.eINSTANCE.getEdge(), "default");
		entries.add(new ModelerConnectionCreationToolEntry("Edge", "Edge",
				factory, ActivityWFImageRegistry.getImageDescriptor("EDGE"),
				ActivityWFImageRegistry.getImageDescriptor("EDGE_LARGE")));

		edgeDrawer.addAll(entries);
		getRoot().add(edgeDrawer);
	}

}
