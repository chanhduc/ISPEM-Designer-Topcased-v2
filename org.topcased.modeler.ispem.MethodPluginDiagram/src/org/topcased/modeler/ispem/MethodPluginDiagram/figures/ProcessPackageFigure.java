package org.topcased.modeler.ispem.MethodPluginDiagram.figures;

import org.eclipse.gmf.runtime.draw2d.ui.graphics.ColorRegistry;
import org.eclipse.swt.graphics.RGB;
import org.topcased.draw2d.figures.ComposedLabel;
import org.topcased.draw2d.figures.EditableLabel;
import org.topcased.draw2d.figures.ILabel;
import org.topcased.draw2d.figures.Label;
import org.topcased.modeler.ispem.MethodPluginDiagram.MethodPluginDiagramImageRegistry;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated NOT
 */
public class ProcessPackageFigure extends org.topcased.draw2d.figures.PackageFigure
{
    /**
     * Constructor <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public ProcessPackageFigure()
    {
        super();
        this.setForegroundColor(ColorRegistry.getInstance().getColor(new RGB(0,255,0)));
    }

    /**
     * The label is a composed label
     * 
     * @see org.topcased.draw2d.figures.PackageFigure#createLabel()
     */
    protected ILabel createLabel()
    {
    	ComposedLabel label = new ComposedLabel(new Label(), new EditableLabel(), new Label(), false);
        
        return label;
    }
}