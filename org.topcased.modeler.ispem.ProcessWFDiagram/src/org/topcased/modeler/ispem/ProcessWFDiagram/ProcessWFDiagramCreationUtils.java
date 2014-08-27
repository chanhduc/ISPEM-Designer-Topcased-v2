/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.ProcessWFDiagram;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;
import org.topcased.ispem.util.IspemSwitch;
import org.topcased.modeler.di.model.DiagramInterchangeFactory;
import org.topcased.modeler.di.model.EdgeObjectOffset;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.editor.AbstractCreationUtils;
import org.topcased.modeler.evaluator.EvaluatorException;
import org.topcased.modeler.evaluator.extension.EvaluatorsManager;
import org.topcased.modeler.graphconf.DiagramGraphConf;
import org.topcased.modeler.ispem.ProcessWFDiagram.preferences.ProcessWFDiagramDiagramPreferenceConstants;
import org.topcased.spem.ParameterDirectionKind;
import org.topcased.spem.WorkSequenceKind;
import org.topcased.spem.activity.util.ActivitySwitch;
import org.topcased.spem.uma.util.UmaSwitch;
import org.topcased.spem.util.SpemSwitch;

/**
 * This utility class allows to create a GraphElement associated with a Model
 * Object
 * 
 * @generated
 */
public class ProcessWFDiagramCreationUtils extends AbstractCreationUtils {

	/**
	 * Constructor
	 * 
	 * @param diagramConf
	 *            the Diagram Graphical Configuration
	 * @generated
	 */
	public ProcessWFDiagramCreationUtils(DiagramGraphConf diagramConf) {
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
		 * @param presentation
		 *            the presentation of the graphical element
		 * @generated
		 */
		public GraphicIspemSwitch(String presentation) {
			this.presentation = presentation;
		}

		/**
		 * @see org.topcased.ispem.util.IspemSwitch#caseActivity(org.topcased.ispem.Activity)
		 * @generated
		 */
		public Object caseActivity(org.topcased.ispem.Activity object) {
			if ("default".equals(presentation)) {
				return createGraphElementActivity(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.topcased.ispem.util.IspemSwitch#caseArtifact(org.topcased.ispem.Artifact)
		 * @generated
		 */
		public Object caseArtifact(org.topcased.ispem.Artifact object) {
			if ("default".equals(presentation)) {
				return createGraphElementArtifact(object, presentation);
			}
			return null;
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
		 * @param presentation
		 *            the presentation of the graphical element
		 * @generated
		 */
		public GraphicSpemSwitch(String presentation) {
			this.presentation = presentation;
		}

		/**
		 * @see org.topcased.spem.util.SpemSwitch#caseWorkSequence(org.topcased.spem.WorkSequence)
		 * @generated
		 */
		public Object caseWorkSequence(org.topcased.spem.WorkSequence object) {
			if ("start2start".equals(presentation)) {
				object.setLinkKind(WorkSequenceKind.START_TO_START_LITERAL);
			}
			if ("start2finish".equals(presentation)) {
				object.setLinkKind(WorkSequenceKind.START_TO_FINISH_LITERAL);
			}
			if ("finish2start".equals(presentation)) {
				object.setLinkKind(WorkSequenceKind.FINISH_TO_START_LITERAL);
			}
			if ("finish2finish".equals(presentation)) {
				object.setLinkKind(WorkSequenceKind.FINISH_TO_FINISH_LITERAL);
			}
			return createGraphElementWorkSequence(object, presentation);
			
		}

		/**
		 * @see org.topcased.spem.util.SpemSwitch#caseProcessParameter(org.topcased.spem.ProcessParameter)
		 * @personalised
		 */
		public Object caseProcessParameter(
				org.topcased.spem.ProcessParameter object) {
			// add some properties for specific Process Parameter when creating
			if ("artifactIn".equals(presentation)
					&& object.getDirection() != ParameterDirectionKind.IN_LITERAL) {
				object.setDirection(ParameterDirectionKind.IN_LITERAL);
			}
			if ("artifactOut".equals(presentation)
					&& object.getDirection() != ParameterDirectionKind.OUT_LITERAL) {
				object.setDirection(ParameterDirectionKind.OUT_LITERAL);
			}
			if ("artifactInOut".equals(presentation)
					&& object.getDirection() != ParameterDirectionKind.INOUT_LITERAL) {
				object.setDirection(ParameterDirectionKind.INOUT_LITERAL);
			}

			try {
				if ("artifactIn".equals(presentation)
						&& EvaluatorsManager.getInstance().evaluate(object,
								"self.direction = ParameterDirectionKind::_in",
								"ocl")) {
					return createGraphElementProcessParameterIn(object,
							presentation);
				}
			} catch (EvaluatorException ee) {
				ProcessWFDiagramPlugin.log(ee);
			}
			try {
				if ("artifactOut".equals(presentation)
						&& EvaluatorsManager.getInstance().evaluate(object,
								"self.direction = ParameterDirectionKind::out",
								"ocl")) {
					return createGraphElementProcessParameterOut(object,
							presentation);
				}
			} catch (EvaluatorException ee) {
				ProcessWFDiagramPlugin.log(ee);
			}
			try {
				if ("artifactInOut".equals(presentation)
						&& EvaluatorsManager
								.getInstance()
								.evaluate(
										object,
										"self.direction = ParameterDirectionKind::inout",
										"ocl")) {
					return createGraphElementProcessParameterInOut(object,
							presentation);
				}
			} catch (EvaluatorException ee) {
				ProcessWFDiagramPlugin.log(ee);
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
		 * @param presentation
		 *            the presentation of the graphical element
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
		 * @param presentation
		 *            the presentation of the graphical element
		 * @generated
		 */
		public GraphicActivitySwitch(String presentation) {
			this.presentation = presentation;
		}

		/**
		 * @see org.topcased.spem.activity.util.ActivitySwitch#caseStartNode(org.topcased.spem.activity.StartNode)
		 * @generated
		 */
		public Object caseStartNode(org.topcased.spem.activity.StartNode object) {
			if ("default".equals(presentation)) {
				return createGraphElementStartNode(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.topcased.spem.activity.util.ActivitySwitch#caseEndNode(org.topcased.spem.activity.EndNode)
		 * @generated
		 */
		public Object caseEndNode(org.topcased.spem.activity.EndNode object) {
			if ("default".equals(presentation)) {
				return createGraphElementEndNode(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.topcased.spem.activity.util.ActivitySwitch#caseForkNode(org.topcased.spem.activity.ForkNode)
		 * @generated
		 */
		public Object caseForkNode(org.topcased.spem.activity.ForkNode object) {
			if ("default".equals(presentation)) {
				return createGraphElementForkNode(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.topcased.spem.activity.util.ActivitySwitch#caseJoinNode(org.topcased.spem.activity.JoinNode)
		 * @generated
		 */
		public Object caseJoinNode(org.topcased.spem.activity.JoinNode object) {
			if ("default".equals(presentation)) {
				return createGraphElementJoinNode(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.topcased.spem.activity.util.ActivitySwitch#caseDecisionNode(org.topcased.spem.activity.DecisionNode)
		 * @generated
		 */
		public Object caseDecisionNode(
				org.topcased.spem.activity.DecisionNode object) {
			if ("default".equals(presentation)) {
				return createGraphElementDecisionNode(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.topcased.spem.activity.util.ActivitySwitch#caseEdge(org.topcased.spem.activity.Edge)
		 * @generated
		 */
		public Object caseEdge(org.topcased.spem.activity.Edge object) {
			if ("default".equals(presentation)) {
				return createGraphElementEdge(object, presentation);
			}
			return null;
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
	 * @see org.topcased.modeler.editor.ICreationUtils#createGraphElement(org.eclipse.emf.ecore.EObject,
	 *      java.lang.String)
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
	 * @param element
	 *            the model element
	 * @param presentation
	 *            the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementActivity(
			org.topcased.ispem.Activity element, String presentation) {
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element
	 *            the model element
	 * @param presentation
	 *            the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementArtifact(
			org.topcased.ispem.Artifact element, String presentation) {
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element
	 *            the model element
	 * @param presentation
	 *            the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementStartNode(
			org.topcased.spem.activity.StartNode element, String presentation) {
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element
	 *            the model element
	 * @param presentation
	 *            the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementEndNode(
			org.topcased.spem.activity.EndNode element, String presentation) {
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element
	 *            the model element
	 * @param presentation
	 *            the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementForkNode(
			org.topcased.spem.activity.ForkNode element, String presentation) {
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element
	 *            the model element
	 * @param presentation
	 *            the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementJoinNode(
			org.topcased.spem.activity.JoinNode element, String presentation) {
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element
	 *            the model element
	 * @param presentation
	 *            the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementDecisionNode(
			org.topcased.spem.activity.DecisionNode element, String presentation) {
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element the model element
	 * @param presentation the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementEdge(
			org.topcased.spem.activity.Edge element, String presentation) {
		GraphEdge graphEdge = createGraphEdge(element, presentation);
		return graphEdge;
	}


	/**
	 * @param element
	 *            the model element
	 * @param presentation
	 *            the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementWorkSequence(
			org.topcased.spem.WorkSequence element, String presentation) {
		GraphEdge graphEdge = createGraphEdge(element, presentation);
		EdgeObjectOffset linkkindEdgeObjectOffset = DiagramInterchangeFactory.eINSTANCE
				.createEdgeObjectOffset();
		linkkindEdgeObjectOffset
				.setId(ProcessWFDiagramEdgeObjectConstants.LINKKIND_EDGE_OBJECT_ID);
		linkkindEdgeObjectOffset.setOffset(new Dimension(0, 0));
		linkkindEdgeObjectOffset
				.setVisible(getPreferenceStore()
						.getBoolean(
								ProcessWFDiagramDiagramPreferenceConstants.WORKSEQUENCE_LINKKIND_EDGE_OBJECT_DEFAULT_VISIBILITY));
		graphEdge.getContained().add(linkkindEdgeObjectOffset);
		return graphEdge;
	}

	/**
	 * @param element
	 *            the model element
	 * @param presentation
	 *            the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementProcessParameterIn(
			org.topcased.spem.ProcessParameter element, String presentation) {
		GraphEdge graphEdge = createGraphEdge(element, presentation);
		return graphEdge;
	}

	/**
	 * @param element
	 *            the model element
	 * @param presentation
	 *            the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementProcessParameterOut(
			org.topcased.spem.ProcessParameter element, String presentation) {
		GraphEdge graphEdge = createGraphEdge(element, presentation);
		return graphEdge;
	}

	/**
	 * @param element
	 *            the model element
	 * @param presentation
	 *            the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementProcessParameterInOut(
			org.topcased.spem.ProcessParameter element, String presentation) {
		GraphEdge graphEdge = createGraphEdge(element, presentation);
		return graphEdge;
	}

	/**
	 * Create the ModelObject with its initial children
	 * 
	 * @param obj
	 *            the model object
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
		IEditorInput editorInput = ProcessWFDiagramPlugin.getActivePage()
				.getActiveEditor().getEditorInput();
		if (editorInput instanceof IFileEditorInput) {
			IProject project = ((IFileEditorInput) editorInput).getFile()
					.getProject();
			Preferences root = Platform.getPreferencesService().getRootNode();
			try {
				if (root.node(ProjectScope.SCOPE).node(project.getName())
						.nodeExists(ProcessWFDiagramPlugin.getId())) {
					return new ScopedPreferenceStore(new ProjectScope(project),
							ProcessWFDiagramPlugin.getId());
				}
			} catch (BackingStoreException e) {
				e.printStackTrace();
			}
		}
		return ProcessWFDiagramPlugin.getDefault().getPreferenceStore();
	}
}
