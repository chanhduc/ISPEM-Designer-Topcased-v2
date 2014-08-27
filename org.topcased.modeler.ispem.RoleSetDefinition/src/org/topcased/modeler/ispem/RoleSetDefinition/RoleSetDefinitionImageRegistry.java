/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.RoleSetDefinition;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.topcased.modeler.ImageRegistry;

/**
 * Handle image
 *
 * @generated
 */
public final class RoleSetDefinitionImageRegistry {

	/**
	 * The bundle id of the images
	 * @generated
	 */
	public static final String BUNDLE = "org.topcased.modeler.ispem.RoleSetDefinition.images";

	/**
	 * The constructor
	 *
	 * @generated
	 */
	private RoleSetDefinitionImageRegistry() {
		// do nothing
	}

	/**
	 * Clients should not dispose the Image returned.
	 *
	 * @param key  the key (one of the constants defined in this class)
	 * @return the Image associated with the given key
	 * @generated
	 */
	public static Image getImage(String key) {
		return ImageRegistry.getInstance().get(
				RoleSetDefinitionPlugin.getDefault().getBundle(),
				getImageLocation(key));
	}

	/**
	 * Return the image location
	 *
	 * @param key  the key
	 * @return the Image location associated with the given key
	 * @generated
	 */
	private static String getImageLocation(String key) {
		return ResourceBundle.getBundle(BUNDLE).getString(key);
	}

	/**
	 * Build an image descriptor for the given key
	 *
	 * @param key  the key
	 * @return the ImageDescriptor associated with the given key
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(String key) {
		try {
			return ImageRegistry.getInstance().getDescriptor(
					RoleSetDefinitionPlugin.getDefault().getBundle(),
					getImageLocation(key));
		} catch (MissingResourceException mre) {
			return null;
		}
	}

}
