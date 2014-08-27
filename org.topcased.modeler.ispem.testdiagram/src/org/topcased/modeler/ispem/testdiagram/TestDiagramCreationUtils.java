/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.testdiagram;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;
import org.topcased.ispem.util.IspemSwitch;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.editor.AbstractCreationUtils;
import org.topcased.modeler.graphconf.DiagramGraphConf;
import org.topcased.spem.activity.util.ActivitySwitch;
import org.topcased.spem.uma.util.UmaSwitch;
import org.topcased.spem.util.SpemSwitch;

/**
 * This utility class allows to create a GraphElement associated with a Model Object
 *
 * @generated
 */
public class TestDiagramCreationUtils extends AbstractCreationUtils {

	/**
	 * Constructor
	 *
	 * @param diagramConf the Diagram Graphical Configuration
	 * @generated
	 */
	public TestDiagramCreationUtils(DiagramGraphConf diagramConf) {
		super(diagramConf);
	}

	/**
	 * @generated
	 */
	private class GraphicIspemSwitch extends IspemSwitch {
		/**
		 * The presentation of the graphical element
		 *
		 * @generated
		 */
		private String presentation;

		/**
		 * Constructor
		 *
		 * @param presentation the presentation of the graphical element
		 * @generated
		 */
		public GraphicIspemSwitch(String presentation) {
			this.presentation = presentation;
		}

		/**
		 * @see org.topcased.ispem.util.IspemSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return null;
		}
	}

	/**
	 * @generated
	 */
	private class GraphicSpemSwitch extends SpemSwitch {
		/**
		 * The presentation of the graphical element
		 *
		 * @generated
		 */
		private String presentation;

		/**
		 * Constructor
		 *
		 * @param presentation the presentation of the graphical element
		 * @generated
		 */
		public GraphicSpemSwitch(String presentation) {
			this.presentation = presentation;
		}

		/**
		 * @see org.topcased.spem.util.SpemSwitch#caseTaskDefinition(org.topcased.spem.TaskDefinition)
		 * @generated
		 */
		public Object caseTaskDefinition(org.topcased.spem.TaskDefinition object) {
			if ("default".equals(presentation)) {
				return createGraphElementTaskDefinition(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.topcased.spem.util.SpemSwitch#caseRoleDefinition(org.topcased.spem.RoleDefinition)
		 * @generated
		 */
		public Object caseRoleDefinition(org.topcased.spem.RoleDefinition object) {
			if ("default".equals(presentation)) {
				return createGraphElementRoleDefinition(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.topcased.spem.util.SpemSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return null;
		}
	}

	/**
	 * @generated
	 */
	private class GraphicUmaSwitch extends UmaSwitch {
		/**
		 * The presentation of the graphical element
		 *
		 * @generated
		 */
		private String presentation;

		/**
		 * Constructor
		 *
		 * @param presentation the presentation of the graphical element
		 * @generated
		 */
		public GraphicUmaSwitch(String presentation) {
			this.presentation = presentation;
		}

		/**
		 * @see org.topcased.spem.uma.util.UmaSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return null;
		}
	}

	/**
	 * @generated
	 */
	private class GraphicActivitySwitch extends ActivitySwitch {
		/**
		 * The presentation of the graphical element
		 *
		 * @generated
		 */
		private String presentation;

		/**
		 * Constructor
		 *
		 * @param presentation the presentation of the graphical element
		 * @generated
		 */
		public GraphicActivitySwitch(String presentation) {
			this.presentation = presentation;
		}

		/**
		 * @see org.topcased.spem.activity.util.ActivitySwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return null;
		}
	}

	/**
	 * @see org.topcased.modeler.editor.ICreationUtils#createGraphElement(org.eclipse.emf.ecore.EObject, java.lang.String)
	 * @generated
	 */
	public GraphElement createGraphElement(EObject obj, String presentation) {
		Object graphElt = null;

		if ("http://www.topcased.org/ispem".equals(obj.eClass().getEPackage()
				.getNsURI())) {
			graphElt = new GraphicIspemSwitch(presentation).doSwitch(obj);
		}
		if ("http://www.thalesgroup.com/spem/2.0".equals(obj.eClass()
				.getEPackage().getNsURI())) {
			graphElt = new GraphicSpemSwitch(presentation).doSwitch(obj);
		}
		if ("http://www.thalesgroup.com/spem/2.0/uma".equals(obj.eClass()
				.getEPackage().getNsURI())) {
			graphElt = new GraphicUmaSwitch(presentation).doSwitch(obj);
		}
		if ("http://www.thalesgroup.com/spem/2.0/activity".equals(obj.eClass()
				.getEPackage().getNsURI())) {
			graphElt = new GraphicActivitySwitch(presentation).doSwitch(obj);
		}

		return (GraphElement) graphElt;
	}

	/**
	 * @param element the model element
	 * @param presentation the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementTaskDefinition(
			org.topcased.spem.TaskDefinition element, String presentation) {
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element the model element
	 * @param presentation the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementRoleDefinition(
			org.topcased.spem.RoleDefinition element, String presentation) {
		return createGraphNode(element, presentation);
	}

	/**
	 * Create the ModelObject with its initial children
	 * 
	 * @param obj the model object
	 * @return the model object with its children
	 * @generated
	 */
	public EObject createModelObject(EObject obj) {
		return obj;
	}

	/**
	 * Get the preference store associated with the current editor.
	 * 
	 * @return IPreferenceStore
	 * @generated
	 */
	private IPreferenceStore getPreferenceStore() {
		IEditorInput editorInput = TestDiagramPlugin.getActivePage()
				.getActiveEditor().getEditorInput();
		if (editorInput instanceof IFileEditorInput) {
			IProject project = ((IFileEditorInput) editorInput).getFile()
					.getProject();
			Preferences root = Platform.getPreferencesService().getRootNode();
			try {
				if (root.node(ProjectScope.SCOPE).node(project.getName())
						.nodeExists(TestDiagramPlugin.getId())) {
					return new ScopedPreferenceStore(new ProjectScope(project),
							TestDiagramPlugin.getId());
				}
			} catch (BackingStoreException e) {
				e.printStackTrace();
			}
		}
		return TestDiagramPlugin.getDefault().getPreferenceStore();
	}
}
