/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem;

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
public final class IspemImageRegistry {

	/**
	 * The bundle id of the image
	 * @generated
	 */
	public static final String BUNDLE = "org.topcased.modeler.ispem.images";

	/**
	 * The constructor
	 *
	 * @generated
	 */
	private IspemImageRegistry() {
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
				IspemPlugin.getDefault().getBundle(), getImageLocation(key));
	}

	/**
	 * Return the image location
	 *
	 * @param key  the key
	 * @return the Image location associated with the given key
	 * @throws MissingResourceException if the image doesn't exist
	 * @generated
	 */
	private static String getImageLocation(String key)
			throws MissingResourceException {
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
			return ImageRegistry.getInstance()
					.getDescriptor(IspemPlugin.getDefault().getBundle(),
							getImageLocation(key));
		} catch (MissingResourceException mre) {
			return null;
		}
	}

}
