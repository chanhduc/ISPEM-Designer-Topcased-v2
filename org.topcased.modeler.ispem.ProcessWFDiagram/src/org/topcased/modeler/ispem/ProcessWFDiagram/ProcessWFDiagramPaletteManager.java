/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.ProcessWFDiagram;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.requests.CreationFactory;
import org.topcased.ispem.IspemPackage;
import org.topcased.modeler.editor.GraphElementCreationFactory;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.palette.ModelerConnectionCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerPaletteManager;
import org.topcased.spem.SpemPackage;
import org.topcased.spem.activity.ActivityPackage;

/**
 * Generated Palette Manager
 *
 * @generated
 */
public class ProcessWFDiagramPaletteManager extends ModelerPaletteManager {
	// declare all the palette categories of the diagram
	/**
	 * @generated
	 */
	private PaletteDrawer nodeDrawer;
	/**
	 * @generated
	 */
	private PaletteDrawer linkDrawer;
	/**
	 * @generated
	 */
	private PaletteDrawer processparameterDrawer;

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
	public ProcessWFDiagramPaletteManager(ICreationUtils utils) {
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
		createLinkDrawer();
		createProcessParameterDrawer();
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

		getRoot().remove(linkDrawer);
		createLinkDrawer();

		getRoot().remove(processparameterDrawer);
		createProcessParameterDrawer();
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
				IspemPackage.eINSTANCE.getActivity(), "default");
		entries.add(new ModelerCreationToolEntry("Create Activity",
				"Create Activity", factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("ACTIVITY"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("ACTIVITY_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				IspemPackage.eINSTANCE.getArtifact(), "default");
		entries.add(new ModelerCreationToolEntry("Create Artifact",
				"Create Artifact", factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("ARTIFACT"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("ARTIFACT_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				ActivityPackage.eINSTANCE.getStartNode(), "default");
		entries.add(new ModelerCreationToolEntry("Start Node", "Start Node",
				factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("STARTNODE"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("STARTNODE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				ActivityPackage.eINSTANCE.getEndNode(), "default");
		entries.add(new ModelerCreationToolEntry("End Node", "End Node",
				factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("ENDNODE"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("ENDNODE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				ActivityPackage.eINSTANCE.getForkNode(), "default");
		entries.add(new ModelerCreationToolEntry("Fork Node", "Fork Node",
				factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("FORKNODE"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("FORKNODE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				ActivityPackage.eINSTANCE.getJoinNode(), "default");
		entries.add(new ModelerCreationToolEntry("Join Node", "Join Node",
				factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("JOINNODE"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("JOINNODE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				ActivityPackage.eINSTANCE.getDecisionNode(), "default");
		entries.add(new ModelerCreationToolEntry("Decision Node",
				"Decision Node", factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("DECISIONNODE"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("DECISIONNODE_LARGE")));

		nodeDrawer.addAll(entries);
		getRoot().add(nodeDrawer);
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 *
	 * @generated
	 */
	private void createLinkDrawer() {
		linkDrawer = new PaletteDrawer("Link", null);
		List<PaletteEntry> entries = new ArrayList<PaletteEntry>();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils,
				ActivityPackage.eINSTANCE.getEdge(), "default");
		entries.add(new ModelerConnectionCreationToolEntry("Edge", "Edge",
				factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("EDGE"),
				ProcessWFDiagramImageRegistry.getImageDescriptor("EDGE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getWorkSequence(), "start2start");
		entries.add(new ModelerConnectionCreationToolEntry("Start To Start",
				"Start To Start", factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("WORKSEQUENCE"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("WORKSEQUENCE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getWorkSequence(), "start2finish");
		entries.add(new ModelerConnectionCreationToolEntry("Start To Finish",
				"Start To Finish", factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("WORKSEQUENCE"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("WORKSEQUENCE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getWorkSequence(), "finish2start");
		entries.add(new ModelerConnectionCreationToolEntry("Finish To Start",
				"Finish To Start", factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("WORKSEQUENCE"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("WORKSEQUENCE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getWorkSequence(), "finish2finish");
		entries.add(new ModelerConnectionCreationToolEntry("Finish To Finish",
				"Finish To Finish", factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("WORKSEQUENCE"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("WORKSEQUENCE_LARGE")));

		linkDrawer.addAll(entries);
		getRoot().add(linkDrawer);
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
		entries.add(new ModelerConnectionCreationToolEntry("In", "In", factory,
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("PROCESSPARAMETERIN"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("PROCESSPARAMETERIN_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getProcessParameter(), "artifactOut");
		entries.add(new ModelerConnectionCreationToolEntry("Out", "Out",
				factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("PROCESSPARAMETEROUT"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("PROCESSPARAMETEROUT_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getProcessParameter(), "artifactInOut");
		entries.add(new ModelerConnectionCreationToolEntry("InOut", "InOut",
				factory, ProcessWFDiagramImageRegistry
						.getImageDescriptor("PROCESSPARAMETERINOUT"),
				ProcessWFDiagramImageRegistry
						.getImageDescriptor("PROCESSPARAMETERINOUT_LARGE")));

		processparameterDrawer.addAll(entries);
		getRoot().add(processparameterDrawer);
	}

}
