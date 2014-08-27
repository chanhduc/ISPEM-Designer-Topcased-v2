/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.methodcontentdefinition;

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
import org.topcased.modeler.ispem.methodcontentdefinition.edit.Default_ResponsibilityAssignmentEditPart;
import org.topcased.modeler.ispem.methodcontentdefinition.edit.Default_TaskDefinitionParameterInEditPart;
import org.topcased.modeler.ispem.methodcontentdefinition.edit.Default_TaskDefinitionParameterInOutEditPart;
import org.topcased.modeler.ispem.methodcontentdefinition.edit.Default_TaskDefinitionParameterOutEditPart;
import org.topcased.modeler.ispem.methodcontentdefinition.edit.Default_TaskDefinitionPerformerEditPart;
import org.topcased.modeler.ispem.methodcontentdefinition.edit.RoleDefinitionEditPart;
import org.topcased.modeler.ispem.methodcontentdefinition.edit.TaskDefinitionEditPart;
import org.topcased.modeler.ispem.methodcontentdefinition.edit.ToolDefinitionEditPart;
import org.topcased.modeler.ispem.methodcontentdefinition.edit.WorkProductDefinitionEditPart;

/**
 * A diagram configuration : manages Palette, EditPartFactory for this diagram.
 *
 * @generated
 */
public class MethodContentDefinitionConfiguration implements IConfiguration {
	/**
	 * @generated
	 */
	private MethodContentDefinitionPaletteManager paletteManager;

	/**
	 * @generated
	 */
	private MethodContentDefinitionEditPartFactory editPartFactory;

	/**
	 * @generated
	 */
	private MethodContentDefinitionCreationUtils creationUtils;

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
	public MethodContentDefinitionConfiguration() {
		registerAdapters();
	}

	/**
	 * Registers the Adapter Factories for all the EditParts
	 *
	 * @generated
	 */
	private void registerAdapters() {
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(TaskDefinitionEditPart.class,
						org.topcased.ispem.TaskDefinition.class),
				TaskDefinitionEditPart.class);
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(RoleDefinitionEditPart.class,
						org.topcased.spem.RoleDefinition.class),
				RoleDefinitionEditPart.class);
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(
						WorkProductDefinitionEditPart.class,
						org.topcased.ispem.WorkProductDefinition.class),
				WorkProductDefinitionEditPart.class);
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(ToolDefinitionEditPart.class,
						org.topcased.ispem.ToolDefinition.class),
				ToolDefinitionEditPart.class);
		Platform.getAdapterManager()
				.registerAdapters(
						new EditPart2ModelAdapterFactory(
								Default_TaskDefinitionParameterInEditPart.class,
								org.topcased.spem.Default_TaskDefinitionParameter.class),
						Default_TaskDefinitionParameterInEditPart.class);
		Platform.getAdapterManager()
				.registerAdapters(
						new EditPart2ModelAdapterFactory(
								Default_TaskDefinitionParameterOutEditPart.class,
								org.topcased.spem.Default_TaskDefinitionParameter.class),
						Default_TaskDefinitionParameterOutEditPart.class);
		Platform.getAdapterManager()
				.registerAdapters(
						new EditPart2ModelAdapterFactory(
								Default_TaskDefinitionParameterInOutEditPart.class,
								org.topcased.spem.Default_TaskDefinitionParameter.class),
						Default_TaskDefinitionParameterInOutEditPart.class);
		Platform.getAdapterManager()
				.registerAdapters(
						new EditPart2ModelAdapterFactory(
								Default_TaskDefinitionPerformerEditPart.class,
								org.topcased.spem.Default_TaskDefinitionPerformer.class),
						Default_TaskDefinitionPerformerEditPart.class);
		Platform.getAdapterManager()
				.registerAdapters(
						new EditPart2ModelAdapterFactory(
								Default_ResponsibilityAssignmentEditPart.class,
								org.topcased.spem.Default_ResponsibilityAssignment.class),
						Default_ResponsibilityAssignmentEditPart.class);
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getId()
	 * @generated
	 */
	public String getId() {
		return new String("org.topcased.modeler.ispem.methodcontentdefinition");
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getName()
	 * @generated
	 */
	public String getName() {
		return new String("Method Content Definition Diagram");
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getEditPartFactory()
	 * @generated
	 */
	public EditPartFactory getEditPartFactory() {
		if (editPartFactory == null) {
			editPartFactory = new MethodContentDefinitionEditPartFactory();
		}

		return editPartFactory;
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getPaletteManager()
	 * @generated
	 */
	public IPaletteManager getPaletteManager() {
		if (paletteManager == null) {
			paletteManager = new MethodContentDefinitionPaletteManager(
					getCreationUtils());
		}

		return paletteManager;
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getCreationUtils()
	 * @generated
	 */
	public ICreationUtils getCreationUtils() {
		if (creationUtils == null) {
			creationUtils = new MethodContentDefinitionCreationUtils(
					getDiagramGraphConf());
		}

		return creationUtils;
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getDiagramGraphConf()
	 * @generated
	 */
	public DiagramGraphConf getDiagramGraphConf() {
		if (diagramGraphConf == null) {
			URL url = MethodContentDefinitionPlugin
					.getDefault()
					.getBundle()
					.getResource(
							"org/topcased/modeler/ispem/methodcontentdefinition/diagram.graphconf");
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