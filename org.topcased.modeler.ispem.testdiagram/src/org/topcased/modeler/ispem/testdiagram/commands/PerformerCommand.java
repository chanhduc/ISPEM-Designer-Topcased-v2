
/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/

package org.topcased.modeler.ispem.testdiagram.commands;

import org.eclipse.gef.commands.Command;
import org.topcased.modeler.di.model.GraphNode;

/**
 * @generated
 */
public class PerformerCommand extends Command {

	/**
	 * The the selected graph object
	 * @generated
	 */
	private GraphNode graphObject;

	/**
	 * The Constructor
	 * @generated
	 */
	public PerformerCommand() {
		super("Set performer");
	}

	/**
	 * Check if the command can be executed
	 * 
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 * @generated
	 */
	public boolean canExecute() {
		// TODO Add the checking conditions
		return true;
	}

	/**
	 * Refresh the graphical view
	 *
	 * @see org.eclipse.gef.commands.Command#redo()
	 * @generated
	 */
	public void redo() {
		// TODO Add the redo() source
		redoModel();
	}

	/**
	 * Refresh the model objects
	 *
	 * @see org.eclipse.gef.commands.Command#redoModel()
	 * @generated
	 */
	protected void redoModel() {
		// TODO Add the redoModel() source
	}

	/**
	 * Execute the command
	 * 
	 * @see org.eclipse.gef.commands.Command#execute()
	 * @generated
	 */
	public void execute() {
		redo();
	}

	/**
	 * Restore the graphical view
	 *
	 * @see org.eclipse.gef.commands.Command#undo()
	 * @generated
	 */
	public void undo() {
		// TODO Add the undo() source
		undoModel();
	}

	/**
	 * Restore the the model objects
	 *
	 * @see org.eclipse.gef.commands.Command#undoModel()
	 * @generated
	 */
	protected void undoModel() {
		// TODO Add the undoModel() source
	}

	/**
	 * Set the edit part that supports the action
	 * 
	 * @param model the selected graph object
	 * @return the given command
	 * @generated
	 */
	public Command setCurrentPart(Object model) {

		if (model instanceof GraphNode) {
			graphObject = (GraphNode) model;
			// TODO Add the settings procedure
			// If you have setted the procedure, uncomment the following line
			//return this;
		}

		return null;
	}

}