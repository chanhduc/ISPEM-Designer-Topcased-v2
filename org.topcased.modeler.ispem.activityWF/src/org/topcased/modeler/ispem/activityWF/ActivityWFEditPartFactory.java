/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.activityWF;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.topcased.ispem.util.IspemSwitch;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.di.model.SimpleSemanticModelElement;
import org.topcased.modeler.edit.EMFGraphEdgeEditPart;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.editor.ModelerEditPartFactory;
import org.topcased.modeler.evaluator.EvaluatorException;
import org.topcased.modeler.evaluator.extension.EvaluatorsManager;
import org.topcased.modeler.ispem.activityWF.edit.ActivityWFDiagramEditPart;
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
import org.topcased.modeler.utils.Utils;
import org.topcased.spem.activity.util.ActivitySwitch;
import org.topcased.spem.uma.util.UmaSwitch;
import org.topcased.spem.util.SpemSwitch;

/**
 * Part Factory : associates a model object to its controller. <br>
 *
 * @generated
 */
public class ActivityWFEditPartFactory extends ModelerEditPartFactory {
	/**
	 * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart,java.lang.Object)
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof Diagram) {
			return new ActivityWFDiagramEditPart((Diagram) model);
		} else if (model instanceof GraphNode) {
			final GraphNode node = (GraphNode) model;
			EObject element = Utils.getElement(node);
			if (element != null) {
				if ("http://www.topcased.org/ispem".equals(element.eClass()
						.getEPackage().getNsURI())) {
					return (EditPart) new NodeIspemSwitch(node)
							.doSwitch(element);
				}
				if ("http://www.thalesgroup.com/spem/2.0".equals(element
						.eClass().getEPackage().getNsURI())) {
					return (EditPart) new NodeSpemSwitch(node)
							.doSwitch(element);
				}
				if ("http://www.thalesgroup.com/spem/2.0/uma".equals(element
						.eClass().getEPackage().getNsURI())) {
					return (EditPart) new NodeUmaSwitch(node).doSwitch(element);
				}
				if ("http://www.thalesgroup.com/spem/2.0/activity"
						.equals(element.eClass().getEPackage().getNsURI())) {
					return (EditPart) new NodeActivitySwitch(node)
							.doSwitch(element);
				}
			}

			if (node.getSemanticModel() instanceof SimpleSemanticModelElement) {
				// Manage the Element that are not associated with a model object
			}
		} else if (model instanceof GraphEdge) {
			final GraphEdge edge = (GraphEdge) model;
			EObject element = Utils.getElement(edge);
			if (element != null) {
				if ("http://www.topcased.org/ispem".equals(element.eClass()
						.getEPackage().getNsURI())) {
					return (EditPart) new EdgeIspemSwitch(edge)
							.doSwitch(element);
				}
				if ("http://www.thalesgroup.com/spem/2.0".equals(element
						.eClass().getEPackage().getNsURI())) {
					return (EditPart) new EdgeSpemSwitch(edge)
							.doSwitch(element);
				}
				if ("http://www.thalesgroup.com/spem/2.0/uma".equals(element
						.eClass().getEPackage().getNsURI())) {
					return (EditPart) new EdgeUmaSwitch(edge).doSwitch(element);
				}
				if ("http://www.thalesgroup.com/spem/2.0/activity"
						.equals(element.eClass().getEPackage().getNsURI())) {
					return (EditPart) new EdgeActivitySwitch(edge)
							.doSwitch(element);
				}
			}

			if (edge.getSemanticModel() instanceof SimpleSemanticModelElement) {
				// Manage the Element that are not associated with a model object                    
			}
		}
		return super.createEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private class NodeIspemSwitch extends IspemSwitch {
		/**
		 * The graphical node
		 * @generated
		 */
		private GraphNode node;

		/**
		 * Constructor
		 * 
		 * @param node the graphical node
		 * @generated
		 */
		public NodeIspemSwitch(GraphNode node) {
			this.node = node;
		}

		/**
		 * @see org.topcased.ispem.util.IspemSwitch#caseArtifact(org.topcased.ispem.Artifact)
		 * @generated
		 */
		public Object caseArtifact(org.topcased.ispem.Artifact object) {
			return new ArtifactEditPart(node);
		}

		/**
		 * @see org.topcased.ispem.util.IspemSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphNodeEditPart(node);
		}
	}

	/**
	 * @generated
	 */
	private class NodeSpemSwitch extends SpemSwitch {
		/**
		 * The graphical node
		 * @generated
		 */
		private GraphNode node;

		/**
		 * Constructor
		 * 
		 * @param node the graphical node
		 * @generated
		 */
		public NodeSpemSwitch(GraphNode node) {
			this.node = node;
		}

		/**
		 * @see org.topcased.spem.util.SpemSwitch#caseTaskUse(org.topcased.spem.TaskUse)
		 * @generated
		 */
		public Object caseTaskUse(org.topcased.spem.TaskUse object) {
			return new TaskUseEditPart(node);
		}

		/**
		 * @see org.topcased.spem.util.SpemSwitch#caseRoleUse(org.topcased.spem.RoleUse)
		 * @generated
		 */
		public Object caseRoleUse(org.topcased.spem.RoleUse object) {
			return new RoleUseEditPart(node);
		}
		/**
		 * @see org.topcased.ispem.util.IspemSwitch#caseArtifact(org.topcased.ispem.Artifact)
		 * @generated
		 */
		public Object caseWorkProductUse (org.topcased.spem.WorkProductUse object) {
			return new ArtifactEditPart(node);
		}
		/**
		 * @see org.topcased.spem.util.SpemSwitch#caseBreakdownElement(org.topcased.spem.BreakdownElement)
		 * @generated
		 */
		public Object caseBreakdownElement(
				org.topcased.spem.BreakdownElement object) {
			return new BreakdownElementEditPart(node);
		}

		/**
		 * @see org.topcased.spem.util.SpemSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphNodeEditPart(node);
		}
	}

	/**
	 * @generated
	 */
	private class NodeUmaSwitch extends UmaSwitch {
		/**
		 * The graphical node
		 * @generated
		 */
		private GraphNode node;

		/**
		 * Constructor
		 * 
		 * @param node the graphical node
		 * @generated
		 */
		public NodeUmaSwitch(GraphNode node) {
			this.node = node;
		}

		/**
		 * @see org.topcased.spem.uma.util.UmaSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphNodeEditPart(node);
		}
	}

	/**
	 * @generated
	 */
	private class NodeActivitySwitch extends ActivitySwitch {
		/**
		 * The graphical node
		 * @generated
		 */
		private GraphNode node;

		/**
		 * Constructor
		 * 
		 * @param node the graphical node
		 * @generated
		 */
		public NodeActivitySwitch(GraphNode node) {
			this.node = node;
		}

		/**
		 * @see org.topcased.spem.activity.util.ActivitySwitch#caseStartNode(org.topcased.spem.activity.StartNode)
		 * @generated
		 */
		public Object caseStartNode(org.topcased.spem.activity.StartNode object) {
			return new StartNodeEditPart(node);
		}

		/**
		 * @see org.topcased.spem.activity.util.ActivitySwitch#caseEndNode(org.topcased.spem.activity.EndNode)
		 * @generated
		 */
		public Object caseEndNode(org.topcased.spem.activity.EndNode object) {
			return new EndNodeEditPart(node);
		}

		/**
		 * @see org.topcased.spem.activity.util.ActivitySwitch#caseForkNode(org.topcased.spem.activity.ForkNode)
		 * @generated
		 */
		public Object caseForkNode(org.topcased.spem.activity.ForkNode object) {
			return new ForkNodeEditPart(node);
		}

		/**
		 * @see org.topcased.spem.activity.util.ActivitySwitch#caseJoinNode(org.topcased.spem.activity.JoinNode)
		 * @generated
		 */
		public Object caseJoinNode(org.topcased.spem.activity.JoinNode object) {
			return new JoinNodeEditPart(node);
		}

		/**
		 * @see org.topcased.spem.activity.util.ActivitySwitch#caseDecisionNode(org.topcased.spem.activity.DecisionNode)
		 * @generated
		 */
		public Object caseDecisionNode(
				org.topcased.spem.activity.DecisionNode object) {
			return new DecisionNodeEditPart(node);
		}

		/**
		 * @see org.topcased.spem.activity.util.ActivitySwitch#caseNode(org.topcased.spem.activity.Node)
		 * @generated
		 */
		public Object caseNode(org.topcased.spem.activity.Node object) {
			return new NodeEditPart(node);
		}

		/**
		 * @see org.topcased.spem.activity.util.ActivitySwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphNodeEditPart(node);
		}
	}

	/**
	 * @generated
	 */
	private class EdgeIspemSwitch extends IspemSwitch {
		/**
		 * The graphical edge
		 * @generated
		 */
		private GraphEdge edge;

		/**
		 * Constructor
		 * 
		 * @param edge the graphical edge
		 * @generated
		 */
		public EdgeIspemSwitch(GraphEdge edge) {
			this.edge = edge;
		}

		/**
		 * @see org.topcased.ispem.util.IspemSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphEdgeEditPart(edge);
		}
	}

	/**
	 * @generated
	 */
	private class EdgeSpemSwitch extends SpemSwitch {
		/**
		 * The graphical edge
		 * @generated
		 */
		private GraphEdge edge;

		/**
		 * Constructor
		 * 
		 * @param edge the graphical edge
		 * @generated
		 */
		public EdgeSpemSwitch(GraphEdge edge) {
			this.edge = edge;
		}

		/**
		 * @see org.topcased.spem.util.SpemSwitch#caseProcessParameter(org.topcased.spem.ProcessParameter)
		 * @generated
		 */
		public Object caseProcessParameter(
				org.topcased.spem.ProcessParameter object) {
			try {
				if (EvaluatorsManager.getInstance().evaluate(object,
						"self.direction = ParameterDirectionKind::out", "ocl")) {
					return new ProcessParameterOutEditPart(edge);
				}
			} catch (EvaluatorException ee) {
				ActivityWFPlugin.log(ee);
			}
			try {
				if (EvaluatorsManager.getInstance().evaluate(object,
						"self.direction = ParameterDirectionKind::_in", "ocl")) {
					return new ProcessParameterInEditPart(edge);
				}
			} catch (EvaluatorException ee) {
				ActivityWFPlugin.log(ee);
			}
			try {
				if (EvaluatorsManager
						.getInstance()
						.evaluate(
								object,
								"self.direction = ParameterDirectionKind::inout",
								"ocl")) {
					return new ProcessParameterInOutEditPart(edge);
				}
			} catch (EvaluatorException ee) {
				ActivityWFPlugin.log(ee);
			}
			return new EMFGraphEdgeEditPart(edge);
		}

		/**
		 * @see org.topcased.spem.util.SpemSwitch#caseProcessPerformer(org.topcased.spem.ProcessPerformer)
		 * @generated
		 */
		public Object caseProcessPerformer(
				org.topcased.spem.ProcessPerformer object) {
			return new ProcessPerformerEditPart(edge);
		}

		/**
		 * @see org.topcased.spem.util.SpemSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphEdgeEditPart(edge);
		}
	}

	/**
	 * @generated
	 */
	private class EdgeUmaSwitch extends UmaSwitch {
		/**
		 * The graphical edge
		 * @generated
		 */
		private GraphEdge edge;

		/**
		 * Constructor
		 * 
		 * @param edge the graphical edge
		 * @generated
		 */
		public EdgeUmaSwitch(GraphEdge edge) {
			this.edge = edge;
		}

		/**
		 * @see org.topcased.spem.uma.util.UmaSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphEdgeEditPart(edge);
		}
	}

	/**
	 * @generated
	 */
	private class EdgeActivitySwitch extends ActivitySwitch {
		/**
		 * The graphical edge
		 * @generated
		 */
		private GraphEdge edge;

		/**
		 * Constructor
		 * 
		 * @param edge the graphical edge
		 * @generated
		 */
		public EdgeActivitySwitch(GraphEdge edge) {
			this.edge = edge;
		}

		/**
		 * @see org.topcased.spem.activity.util.ActivitySwitch#caseEdge(org.topcased.spem.activity.Edge)
		 * @generated
		 */
		public Object caseEdge(org.topcased.spem.activity.Edge object) {
			return new EdgeEditPart(edge);
		}

		/**
		 * @see org.topcased.spem.activity.util.ActivitySwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphEdgeEditPart(edge);
		}
	}

}