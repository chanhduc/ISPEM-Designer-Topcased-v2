/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.MethodPluginDiagram;

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
import org.topcased.modeler.ispem.MethodPluginDiagram.edit.MethodContentPackageEditPart;
import org.topcased.modeler.ispem.MethodPluginDiagram.edit.MethodPluginEditPart;
import org.topcased.modeler.ispem.MethodPluginDiagram.edit.ProcessPackageEditPart;

/**
 * A diagram configuration : manages Palette, EditPartFactory for this diagram.
 *
 * @generated
 */
public class MethodPluginDiagramConfiguration implements IConfiguration {
	/**
	 * @generated
	 */
	private MethodPluginDiagramPaletteManager paletteManager;

	/**
	 * @generated
	 */
	private MethodPluginDiagramEditPartFactory editPartFactory;

	/**
	 * @generated
	 */
	private MethodPluginDiagramCreationUtils creationUtils;

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
	public MethodPluginDiagramConfiguration() {
		registerAdapters();
	}

	/**
	 * Registers the Adapter Factories for all the EditParts
	 *
	 * @generated
	 */
	private void registerAdapters() {
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(
						MethodContentPackageEditPart.class,
						org.topcased.spem.MethodContentPackage.class),
				MethodContentPackageEditPart.class);
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(ProcessPackageEditPart.class,
						org.topcased.spem.ProcessPackage.class),
				ProcessPackageEditPart.class);
		Platform.getAdapterManager().registerAdapters(
				new EditPart2ModelAdapterFactory(MethodPluginEditPart.class,
						org.topcased.spem.MethodPlugin.class),
				MethodPluginEditPart.class);
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getId()
	 * @generated
	 */
	public String getId() {
		return new String("org.topcased.modeler.ispem.MethodPluginDiagram");
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getName()
	 * @generated
	 */
	public String getName() {
		return new String("Method Plugin Diagram");
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getEditPartFactory()
	 * @generated
	 */
	public EditPartFactory getEditPartFactory() {
		if (editPartFactory == null) {
			editPartFactory = new MethodPluginDiagramEditPartFactory();
		}

		return editPartFactory;
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getPaletteManager()
	 * @generated
	 */
	public IPaletteManager getPaletteManager() {
		if (paletteManager == null) {
			paletteManager = new MethodPluginDiagramPaletteManager(
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
			creationUtils = new MethodPluginDiagramCreationUtils(
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
			URL url = MethodPluginDiagramPlugin
					.getDefault()
					.getBundle()
					.getResource(
							"org/topcased/modeler/ispem/MethodPluginDiagram/diagram.graphconf");
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