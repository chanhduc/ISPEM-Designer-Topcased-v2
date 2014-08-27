package org.topcased.modeler.ispem.methodcontentdefinition.rules;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.topcased.modeler.editor.ModelerGraphicalViewer;
import org.topcased.modeler.extensions.SynchronizedModelDiagramRule;
import org.topcased.spem.uma.TaskDefinitionPackage;

public class TaskSynchronisedModelDiagramRule extends SynchronizedModelDiagramRule {
	/**
     * Checks if the representation has the right graphic parent.
     * 
     * Subtypes should override this method if they want to provide a new implementation of the test.
     * @Override
     * @param pTarget the target
     * 
     * @return true, if is synchronized with the model
     */
	@Override
    public boolean hasRightGraphicParent(IDecoratorTarget pTarget)
    {
        GraphicalEditPart lEditPart = (GraphicalEditPart) pTarget.getAdapter(GraphicalEditPart.class);

        if (lEditPart != null)
        {
            if (lEditPart.getViewer() instanceof ModelerGraphicalViewer)
            {
                EObject lSemanticParent = getModelParent(pTarget);
                EObject lGraphicalParent = getGraphicalParent(pTarget);
                if (lSemanticParent != null)
                {
                    //In case that TaskDefinition is contained in TaskDefinitionPackage 
                	if (lSemanticParent instanceof TaskDefinitionPackage )
                	{
                		return lSemanticParent.eContainer().equals(lGraphicalParent);
                	}
                	//Another case:TaskDefinition is contained in MethodContentPackage 
                	return lSemanticParent.equals(lGraphicalParent);
                }
                else
                {
                    // if the semantic parent is null, we must be creating the EObject
                    return true;
                }
            }
        }

        return true;
    }

}
