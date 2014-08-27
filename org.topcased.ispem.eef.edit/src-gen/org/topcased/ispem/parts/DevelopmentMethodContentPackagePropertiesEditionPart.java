/**
 * Generated with Acceleo
 */
package org.topcased.ispem.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface DevelopmentMethodContentPackagePropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);




	/**
	 * Init the ownedMethodContentMember
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedMethodContentMember(ReferencesTableSettings settings);

	/**
	 * Update the ownedMethodContentMember
	 * @param newValue the ownedMethodContentMember to update
	 * 
	 */
	public void updateOwnedMethodContentMember();

	/**
	 * Adds the given filter to the ownedMethodContentMember edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwnedMethodContentMember(ViewerFilter filter);

	/**
	 * Adds the given filter to the ownedMethodContentMember edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwnedMethodContentMember(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ownedMethodContentMember table
	 * 
	 */
	public boolean isContainedInOwnedMethodContentMemberTable(EObject element);




	/**
	 * Init the reusedPackage
	 * @param settings settings for the reusedPackage ReferencesTable 
	 */
	public void initReusedPackage(ReferencesTableSettings settings);

	/**
	 * Update the reusedPackage
	 * @param newValue the reusedPackage to update
	 * 
	 */
	public void updateReusedPackage();

	/**
	 * Adds the given filter to the reusedPackage edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReusedPackage(ViewerFilter filter);

	/**
	 * Adds the given filter to the reusedPackage edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReusedPackage(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the reusedPackage table
	 * 
	 */
	public boolean isContainedInReusedPackageTable(EObject element);


	/**
	 * @return the relatedMethod
	 * 
	 */
	public EObject getRelatedMethod();

	/**
	 * Init the relatedMethod
	 * @param settings the combo setting
	 */
	public void initRelatedMethod(EObjectFlatComboSettings settings);

	/**
	 * Defines a new relatedMethod
	 * @param newValue the new relatedMethod to set
	 * 
	 */
	public void setRelatedMethod(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setRelatedMethodButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the relatedMethod edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRelatedMethod(ViewerFilter filter);

	/**
	 * Adds the given filter to the relatedMethod edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRelatedMethod(ViewerFilter filter);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
