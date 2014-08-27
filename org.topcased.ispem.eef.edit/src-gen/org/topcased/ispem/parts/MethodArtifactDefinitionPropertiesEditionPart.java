/**
 * Generated with Acceleo
 */
package org.topcased.ispem.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

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
public interface MethodArtifactDefinitionPropertiesEditionPart {

	/**
	 * @return the kind
	 * 
	 */
	public EObject getKind();

	/**
	 * Init the kind
	 * @param settings the combo setting
	 */
	public void initKind(EObjectFlatComboSettings settings);

	/**
	 * Defines a new kind
	 * @param newValue the new kind to set
	 * 
	 */
	public void setKind(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setKindButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the kind edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToKind(ViewerFilter filter);

	/**
	 * Adds the given filter to the kind edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToKind(ViewerFilter filter);


	/**
	 * @return the presentationName
	 * 
	 */
	public String getPresentationName();

	/**
	 * Defines a new presentationName
	 * @param newValue the new presentationName to set
	 * 
	 */
	public void setPresentationName(String newValue);


	/**
	 * @return the briefDescription
	 * 
	 */
	public String getBriefDescription();

	/**
	 * Defines a new briefDescription
	 * @param newValue the new briefDescription to set
	 * 
	 */
	public void setBriefDescription(String newValue);


	/**
	 * @return the mainDescription
	 * 
	 */
	public String getMainDescription();

	/**
	 * Defines a new mainDescription
	 * @param newValue the new mainDescription to set
	 * 
	 */
	public void setMainDescription(String newValue);


	/**
	 * @return the purpose
	 * 
	 */
	public String getPurpose();

	/**
	 * Defines a new purpose
	 * @param newValue the new purpose to set
	 * 
	 */
	public void setPurpose(String newValue);




	/**
	 * Init the guidance
	 * @param settings settings for the guidance ReferencesTable 
	 */
	public void initGuidance(ReferencesTableSettings settings);

	/**
	 * Update the guidance
	 * @param newValue the guidance to update
	 * 
	 */
	public void updateGuidance();

	/**
	 * Adds the given filter to the guidance edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToGuidance(ViewerFilter filter);

	/**
	 * Adds the given filter to the guidance edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToGuidance(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the guidance table
	 * 
	 */
	public boolean isContainedInGuidanceTable(EObject element);




	/**
	 * Init the metric
	 * @param settings settings for the metric ReferencesTable 
	 */
	public void initMetric(ReferencesTableSettings settings);

	/**
	 * Update the metric
	 * @param newValue the metric to update
	 * 
	 */
	public void updateMetric();

	/**
	 * Adds the given filter to the metric edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMetric(ViewerFilter filter);

	/**
	 * Adds the given filter to the metric edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMetric(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the metric table
	 * 
	 */
	public boolean isContainedInMetricTable(EObject element);




	/**
	 * Init the category
	 * @param settings settings for the category ReferencesTable 
	 */
	public void initCategory(ReferencesTableSettings settings);

	/**
	 * Update the category
	 * @param newValue the category to update
	 * 
	 */
	public void updateCategory();

	/**
	 * Adds the given filter to the category edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCategory(ViewerFilter filter);

	/**
	 * Adds the given filter to the category edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCategory(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the category table
	 * 
	 */
	public boolean isContainedInCategoryTable(EObject element);


	/**
	 * @return the copyright
	 * 
	 */
	public String getCopyright();

	/**
	 * Defines a new copyright
	 * @param newValue the new copyright to set
	 * 
	 */
	public void setCopyright(String newValue);


	/**
	 * @return the author
	 * 
	 */
	public EList getAuthor();

	/**
	 * Defines a new author
	 * @param newValue the new author to set
	 * 
	 */
	public void setAuthor(EList newValue);

	/**
	 * Add a value to the author multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToAuthor(Object newValue);

	/**
	 * Remove a value to the author multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToAuthor(Object newValue);


	/**
	 * @return the changeDate
	 * 
	 */
	public String getChangeDate();

	/**
	 * Defines a new changeDate
	 * @param newValue the new changeDate to set
	 * 
	 */
	public void setChangeDate(String newValue);


	/**
	 * @return the changeDescription
	 * 
	 */
	public String getChangeDescription();

	/**
	 * Defines a new changeDescription
	 * @param newValue the new changeDescription to set
	 * 
	 */
	public void setChangeDescription(String newValue);


	/**
	 * @return the version
	 * 
	 */
	public String getVersion();

	/**
	 * Defines a new version
	 * @param newValue the new version to set
	 * 
	 */
	public void setVersion(String newValue);


	/**
	 * @return the uri
	 * 
	 */
	public String getUri();

	/**
	 * Defines a new uri
	 * @param newValue the new uri to set
	 * 
	 */
	public void setUri(String newValue);


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
	 * @return the variabilityType
	 * 
	 */
	public Enumerator getVariabilityType();

	/**
	 * Init the variabilityType
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initVariabilityType(Object input, Enumerator current);

	/**
	 * Defines a new variabilityType
	 * @param newValue the new variabilityType to set
	 * 
	 */
	public void setVariabilityType(Enumerator newValue);


	/**
	 * @return the variabilityBasedOnElement
	 * 
	 */
	public EObject getVariabilityBasedOnElement();

	/**
	 * Init the variabilityBasedOnElement
	 * @param settings the combo setting
	 */
	public void initVariabilityBasedOnElement(EObjectFlatComboSettings settings);

	/**
	 * Defines a new variabilityBasedOnElement
	 * @param newValue the new variabilityBasedOnElement to set
	 * 
	 */
	public void setVariabilityBasedOnElement(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the variabilityBasedOnElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToVariabilityBasedOnElement(ViewerFilter filter);

	/**
	 * Adds the given filter to the variabilityBasedOnElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToVariabilityBasedOnElement(ViewerFilter filter);


	/**
	 * @return the methodContentKind
	 * 
	 */
	public EObject getMethodContentKind();

	/**
	 * Init the methodContentKind
	 * @param settings the combo setting
	 */
	public void initMethodContentKind(EObjectFlatComboSettings settings);

	/**
	 * Defines a new methodContentKind
	 * @param newValue the new methodContentKind to set
	 * 
	 */
	public void setMethodContentKind(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setMethodContentKindButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the methodContentKind edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMethodContentKind(ViewerFilter filter);

	/**
	 * Adds the given filter to the methodContentKind edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMethodContentKind(ViewerFilter filter);


	/**
	 * @return the rootElement
	 * 
	 */
	public EObject getRootElement();

	/**
	 * Init the rootElement
	 * @param settings the combo setting
	 */
	public void initRootElement(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rootElement
	 * @param newValue the new rootElement to set
	 * 
	 */
	public void setRootElement(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setRootElementButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the rootElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRootElement(ViewerFilter filter);

	/**
	 * Adds the given filter to the rootElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRootElement(ViewerFilter filter);




	/**
	 * Init the usedReferences
	 * @param settings settings for the usedReferences ReferencesTable 
	 */
	public void initUsedReferences(ReferencesTableSettings settings);

	/**
	 * Update the usedReferences
	 * @param newValue the usedReferences to update
	 * 
	 */
	public void updateUsedReferences();

	/**
	 * Adds the given filter to the usedReferences edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToUsedReferences(ViewerFilter filter);

	/**
	 * Adds the given filter to the usedReferences edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToUsedReferences(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the usedReferences table
	 * 
	 */
	public boolean isContainedInUsedReferencesTable(EObject element);


	/**
	 * @return the metamodel
	 * 
	 */
	public EObject getMetamodel();

	/**
	 * Init the metamodel
	 * @param settings the combo setting
	 */
	public void initMetamodel(EObjectFlatComboSettings settings);

	/**
	 * Defines a new metamodel
	 * @param newValue the new metamodel to set
	 * 
	 */
	public void setMetamodel(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setMetamodelButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the metamodel edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMetamodel(ViewerFilter filter);

	/**
	 * Adds the given filter to the metamodel edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMetamodel(ViewerFilter filter);


	/**
	 * @return the specializedBy
	 * 
	 */
	public EObject getSpecializedBy();

	/**
	 * Init the specializedBy
	 * @param settings the combo setting
	 */
	public void initSpecializedBy(EObjectFlatComboSettings settings);

	/**
	 * Defines a new specializedBy
	 * @param newValue the new specializedBy to set
	 * 
	 */
	public void setSpecializedBy(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSpecializedByButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the specializedBy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSpecializedBy(ViewerFilter filter);

	/**
	 * Adds the given filter to the specializedBy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSpecializedBy(ViewerFilter filter);




	/**
	 * Init the specializes
	 * @param settings settings for the specializes ReferencesTable 
	 */
	public void initSpecializes(ReferencesTableSettings settings);

	/**
	 * Update the specializes
	 * @param newValue the specializes to update
	 * 
	 */
	public void updateSpecializes();

	/**
	 * Adds the given filter to the specializes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSpecializes(ViewerFilter filter);

	/**
	 * Adds the given filter to the specializes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSpecializes(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the specializes table
	 * 
	 */
	public boolean isContainedInSpecializesTable(EObject element);





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
