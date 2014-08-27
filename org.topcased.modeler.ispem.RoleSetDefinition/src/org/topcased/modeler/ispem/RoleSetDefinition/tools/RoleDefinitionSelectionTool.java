package org.topcased.modeler.ispem.RoleSetDefinition.tools;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.tools.SelectionTool;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.topcased.facilities.dialogs.ChooseDialog;
import org.topcased.ispem.provider.IspemItemProviderAdapterFactory;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.edit.DiagramsRootEditPart;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.Modeler;
import org.topcased.modeler.ispem.RoleSetDefinition.RoleSetDefinitionImageRegistry;
import org.topcased.modeler.utils.Utils;
import org.topcased.spem.MethodContentPackage;
import org.topcased.spem.MethodPlugin;
import org.topcased.spem.RoleDefinition;
import org.topcased.spem.provider.RoleDefinitionItemProvider;
import org.topcased.spem.provider.SpemItemProviderAdapterFactory;
import org.topcased.spem.uma.RoleSetPackage;
import org.topcased.tabbedproperties.providers.TabbedPropertiesLabelProvider;

public class RoleDefinitionSelectionTool extends SelectionTool {

	public static final int DISTANCE_X = 100;
	public  static final int DISTANCE_Y = 100;
	private Point recentlyLocation = null;
	private Point selectedLocation = null;
	private Shell shell;
	private EditPart rootEP;
	/**
	 * Modeler
	 */
	private Modeler modeler;

	/**
	 * Constructor for Action1.
	 */

	/**
	 * Current activity;
	 */
	private RoleSetPackage roleSetPkg;

	/**
	 * MethodContentPackage
	 */
	private MethodContentPackage methodContentPkg;
	/**
	 * Current editor's creation utils
	 */
	private ICreationUtils factory;

	@Override
	protected boolean handleButtonDown(int button) {
		// super.handleButtonDown(button);
		if (button != 1)
		{
			return false;
		}
		selectedLocation = getLocation();
		EditPart editPart = getTargetEditPart();

		shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		getEditorInformation();

		if (editPart instanceof DiagramsRootEditPart) {
			
			methodContentPkg = getMethodContentPackage();
			if (roleSetPkg instanceof RoleSetPackage) {
				ShowRoleDefinitionSelectionDialog();
			}
			return true;
		}
		return false;
	}
	/**
	 * Get modeler and factory from editor
	 */
	private void getEditorInformation() {
		IEditorPart editor = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editor instanceof Modeler) {
			modeler = (Modeler) editor;
			factory = modeler.getActiveConfiguration().getCreationUtils();
			rootEP = modeler.getRootEditPart();
		}
	}

	/**
	 * Get Method Content Package
	 * @return
	 */
	private MethodContentPackage getMethodContentPackage() {
		MethodContentPackage pkg = null;

		EObject objModel = Utils.getDiagramModelObject(modeler
				.getActiveDiagram());
		if (objModel instanceof RoleSetPackage) {
			roleSetPkg = (RoleSetPackage) objModel;
			
			EObject objParent = objModel.eContainer();

			while (!(objParent instanceof MethodPlugin)) {
				objParent = objParent.eContainer();
				if (objParent == null)
					break;
			}
			if (objParent instanceof MethodPlugin) {
				MethodPlugin plugin = (MethodPlugin) objParent;
				pkg = (MethodContentPackage) plugin
						.getOwnedMethodContentPackage().get(0);
			}

		}

		return pkg;
	}

	/**
	 * Get all Task Definition
	 */
	private List<RoleDefinition> getAllRoleDefinition(
			MethodContentPackage methodContentPkg) {
		List<RoleDefinition> lstRoleDefinition = new ArrayList<RoleDefinition>();
		TreeIterator<EObject> elements = methodContentPkg.eAllContents();
		while (elements.hasNext()) {
			EObject element = elements.next();
			if (element instanceof RoleDefinition) {
				RoleDefinition roleDef = (RoleDefinition) element;
				lstRoleDefinition.add(roleDef);
			}
		}
		return lstRoleDefinition;
	}

	

	/**
		/**
	 * Create a graph element from input object and add it to Diagram
	 * @param object
	 * @param position
	 * @return
	 */
	private GraphElement createGraphElement(EObject object, Point position
			) {
		GraphElement graphElement = factory.createGraphElement(object);
		graphElement.setPosition(position);
		modeler.getActiveDiagram().getContained().add(graphElement);
		recentlyLocation = position;
		return graphElement;
	}
	
	private Point getNextPostion()
	{
		Point newPoint = new Point();
		if (recentlyLocation == getLocation())
		{
			newPoint.setX(recentlyLocation.x+DISTANCE_X);
			newPoint.setY(recentlyLocation.y);
		}
		else
		{
			newPoint.setX(recentlyLocation.x);
			newPoint.setY(recentlyLocation.y+DISTANCE_Y);
		}
		return newPoint;	
		
	}
	
	private Point getRelativeLocationOnGraphicalViewer (Point absoluteLocation)
	{
			
		FigureCanvas figureCanvas = (FigureCanvas)modeler.getGraphicalViewer().getControl();
		Point location = figureCanvas.getViewport().getViewLocation();
		location = new Point(absoluteLocation.x + location.x, absoluteLocation.y + location.y);
		return location;
	}
	
	public RoleDefinitionSelectionTool()
	{
		super();
		setDefaultCursor(new Cursor(Display.getCurrent(),RoleSetDefinitionImageRegistry.getImage("ROLEDEFINITION").getImageData(),0,0));
	}
	
	private void ShowRoleDefinitionSelectionDialog()
	{
		List<RoleDefinition> lstRoleDefinition = getAllRoleDefinition(methodContentPkg);
		if (lstRoleDefinition != null) {
			// display the dialog to choose task definition
			ChooseDialog dialog = new ChooseDialog(shell,
					lstRoleDefinition.toArray());

			dialog.setTitle("Role Definition Selection: ");
			dialog.setMessage("Select one role definition.");
			dialog.setLabelProvider(new TabbedPropertiesLabelProvider(
					new SpemItemProviderAdapterFactory()));
			if (dialog.open() == Window.OK) {
				Object[] selection = dialog.getResult();

				if (selection != null && selection.length > 0) {
					RoleDefinition selRoleDefinition = (RoleDefinition) selection[0];
					createGraphElement(selRoleDefinition, getStartLocation());
					
					
				}
			}
		}
	}
}
