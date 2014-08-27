/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.topcased.modeler.providers.ILabelFeatureProvider;
import org.topcased.spem.SpemPackage;

/**
 * This is the item provider adpater for a {@link org.topcased.spem.Default_TaskDefinitionPerformer} object.
 *
 * @generated
 */
public class Default_TaskDefinitionPerformerModelerProvider extends
		MethodContentElementModelerProvider implements ILabelFeatureProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 *
	 * @param adapterFactory the adapter factory
	 * @generated
	 */
	public Default_TaskDefinitionPerformerModelerProvider(
			AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @see org.topcased.modeler.providers.ILabelFeatureProvider#getLabelFeature(java.lang.Object)
	 * @generated
	 */
	public EAttribute getLabelFeature(Object object) {
		return SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name();
	}
}