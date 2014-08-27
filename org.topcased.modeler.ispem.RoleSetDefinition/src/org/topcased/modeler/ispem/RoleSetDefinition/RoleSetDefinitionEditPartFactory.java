/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.RoleSetDefinition;

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
import org.topcased.modeler.ispem.RoleSetDefinition.edit.CategorizeRoleDefinitionEditPart;
import org.topcased.modeler.ispem.RoleSetDefinition.edit.RoleDefinitionEditPart;
import org.topcased.modeler.ispem.RoleSetDefinition.edit.RoleSetDefinitionDiagramEditPart;
import org.topcased.modeler.ispem.RoleSetDefinition.edit.RoleSetEditPart;
import org.topcased.modeler.utils.Utils;
import org.topcased.spem.activity.util.ActivitySwitch;
import org.topcased.spem.uma.util.UmaSwitch;
import org.topcased.spem.util.SpemSwitch;

/**
 * Part Factory : associates a model object to its controller. <br>
 *
 * @generated
 */
public class RoleSetDefinitionEditPartFactory extends ModelerEditPartFactory {
	/**
	 * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart,java.lang.Object)
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof Diagram) {
			return new RoleSetDefinitionDiagramEditPart((Diagram) model);
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
				if (RoleSetDefinitionSimpleObjectConstants.SIMPLE_OBJECT_CATEGORIZEROLEDEFINITION
						.equals(((SimpleSemanticModelElement) edge
								.getSemanticModel()).getTypeInfo())) {
					return new CategorizeRoleDefinitionEditPart(edge);
				}
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
		 * @see org.topcased.spem.util.SpemSwitch#caseRoleDefinition(org.topcased.spem.RoleDefinition)
		 * @generated
		 */
		public Object caseRoleDefinition(org.topcased.spem.RoleDefinition object) {
			return new RoleDefinitionEditPart(node);
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
		 * @see org.topcased.spem.uma.util.UmaSwitch#caseRoleSet(org.topcased.spem.uma.RoleSet)
		 * @generated
		 */
		public Object caseRoleSet(org.topcased.spem.uma.RoleSet object) {
			return new RoleSetEditPart(node);
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
		 * @see org.topcased.spem.activity.util.ActivitySwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphEdgeEditPart(edge);
		}
	}

}