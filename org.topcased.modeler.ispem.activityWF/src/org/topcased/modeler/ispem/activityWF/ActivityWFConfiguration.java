/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.activityWF;

import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gef.EditPartFactory;
import org.topcased.modeler.editor.IConfiguration;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.IPaletteManager;
import org.topcased.modeler.graphconf.DiagramGraphConf;
import org.topcased.modeler.graphconf.exceptions.MissingGraphConfFileException;
import org.topcased.modeler.ispem.activityWF.edit.ArtifactEditPart;
import org.topcased.modeler.ispem.activityWF.edit.BreakdownElementEditPart;
import org.topcased.modeler.ispem.activityWF.edit.DecisionNodeEditPart;
import org.topcased.modeler.ispem.activityWF.edit.EdgeEditPart;
import org.topcased.modeler.ispem.activityWF.edit.EndNodeEditPart;
import org.topcased.modeler.ispem.activityWF.edit.ForkNodeEditPart;
import org.topcased.modeler.ispem.activityWF.edit.JoinNodeEditPart;
import org.topcased.modeler.ispem.activityWF.edit.NodeEditPart;
import org.topcased.modeler.ispem.activityWF.edit.ProcessParameterInEditPart;
import org.topcased.modeler.ispem.activityWF.edit.ProcessParameterInOutEditPart;
import org.topcased.modeler.ispem.activityWF.edit.ProcessParameterOutEditPart;
import org.topcased.modeler.ispem.activityWF.edit.ProcessPerformerEditPart;
import org.topcased.modeler.ispem.activityWF.edit.RoleUseEditPart;
import org.topcased.modeler.ispem.activityWF.edit.StartNodeEditPart;
import org.topcased.modeler.ispem.activityWF.edit.TaskUseEditPart;

/**
 * A diagram configuration : manages Palette, EditPartFactory for this diagram.
 *
 * @generated
 */
public class ActivityWFConfiguration implements IConfiguration {
	/**
	 * @generated
	 */
	private ActivityWFPaletteManager paletteManager;

	/**
	 * @generated
	 */
	private ActivityWFEditPartFactory editPartFactory;

	/**
	 * @generated
	 */
	private ActivityWFCreationUtils creationUtils;

	/**
	 * The DiagramGraphConf that contains graphical informations on the configuration
	 * @generated
	 */
	private DiagramGraphConf diagramGraphConf;

	/**
	 * Constructor. Initialize Adapter factories.
	 *
	 * @generated
	 */
	public ActivityWFConfiguration() {
		registerAdapters();
	}

	/**
	 * Registers the Adapter Factories for all the EditParts
	 *
	 * @generated
	 */
	private void registerAdapters() {
		Platform.getAdapterManager()
				.registerAdapters(
						new EditPart2ModelAdapterFactory(TaskUseEditPart.class,
								org.topcased.spem.TaskUse.class),
						TaskUseEditPart.class);
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(ArtifactEditPart.class,
						org.topcased.ispem.Artifact.class),
				ArtifactEditPart.class);
		Platform.getAdapterManager()
				.registerAdapters(
						new EditPart2ModelAdapterFactory(RoleUseEditPart.class,
								org.topcased.spem.RoleUse.class),
						RoleUseEditPart.class);
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(
						ProcessParameterOutEditPart.class,
						org.topcased.spem.ProcessParameter.class),
				ProcessParameterOutEditPart.class);
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(
						ProcessParameterInEditPart.class,
						org.topcased.spem.ProcessParameter.class),
				ProcessParameterInEditPart.class);
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(
						ProcessParameterInOutEditPart.class,
						org.topcased.spem.ProcessParameter.class),
				ProcessParameterInOutEditPart.class);
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(
						ProcessPerformerEditPart.class,
						org.topcased.spem.ProcessPerformer.class),
				ProcessPerformerEditPart.class);
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(StartNodeEditPart.class,
						org.topcased.spem.activity.StartNode.class),
				StartNodeEditPart.class);
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(EndNodeEditPart.class,
						org.topcased.spem.activity.EndNode.class),
				EndNodeEditPart.class);
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(ForkNodeEditPart.class,
						org.topcased.spem.activity.ForkNode.class),
				ForkNodeEditPart.class);
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(JoinNodeEditPart.class,
						org.topcased.spem.activity.JoinNode.class),
				JoinNodeEditPart.class);
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(DecisionNodeEditPart.class,
						org.topcased.spem.activity.DecisionNode.class),
				DecisionNodeEditPart.class);
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(EdgeEditPart.class,
						org.topcased.spem.activity.Edge.class),
				EdgeEditPart.class);
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(NodeEditPart.class,
						org.topcased.spem.activity.Node.class),
				NodeEditPart.class);
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(
						BreakdownElementEditPart.class,
						org.topcased.spem.BreakdownElement.class),
				BreakdownElementEditPart.class);
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getId()
	 * @generated
	 */
	public String getId() {
		return new String("org.topcased.modeler.ispem.activityWF");
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getName()
	 * @generated
	 */
	public String getName() {
		return new String("Activity Workflow");
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getEditPartFactory()
	 * @generated
	 */
	public EditPartFactory getEditPartFactory() {
		if (editPartFactory == null) {
			editPartFactory = new ActivityWFEditPartFactory();
		}

		return editPartFactory;
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getPaletteManager()
	 * @generated
	 */
	public IPaletteManager getPaletteManager() {
		if (paletteManager == null) {
			paletteManager = new ActivityWFPaletteManager(getCreationUtils());
		}

		return paletteManager;
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getCreationUtils()
	 * @generated
	 */
	public ICreationUtils getCreationUtils() {
		if (creationUtils == null) {
			creationUtils = new ActivityWFCreationUtils(getDiagramGraphConf());
		}

		return creationUtils;
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getDiagramGraphConf()
	 * @generated
	 */
	public DiagramGraphConf getDiagramGraphConf() {
		if (diagramGraphConf == null) {
			URL url = ActivityWFPlugin
					.getDefault()
					.getBundle()
					.getResource(
							"org/topcased/modeler/ispem/activityWF/diagram.graphconf");
			if (url != null) {
				URI fileURI = URI.createURI(url.toString());
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource resource = resourceSet.getResource(fileURI, true);
				if (resource != null
						&& resource.getContents().get(0) instanceof DiagramGraphConf) {
					diagramGraphConf = (DiagramGraphConf) resource
							.getContents().get(0);
				}
			} else {
				new MissingGraphConfFileException(
						"The *.diagramgraphconf file can not be retrieved. Check if the path is correct in the Configuration class of your diagram.");
			}
		}

		return diagramGraphConf;
	}

}