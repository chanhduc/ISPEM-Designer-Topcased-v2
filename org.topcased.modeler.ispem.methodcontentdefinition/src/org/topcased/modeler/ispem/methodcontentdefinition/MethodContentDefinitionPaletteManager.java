/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.topcased.modeler.ispem.methodcontentdefinition;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.requests.CreationFactory;
import org.topcased.ispem.IspemPackage;
import org.topcased.modeler.editor.GraphElementCreationFactory;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.palette.ModelerConnectionCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerPaletteManager;
import org.topcased.spem.Default_TaskDefinitionParameter;
import org.topcased.spem.ParameterDirectionKind;
import org.topcased.spem.SpemPackage;

/**
 * Generated Palette Manager
 *
 * @generated
 */
public class MethodContentDefinitionPaletteManager extends
		ModelerPaletteManager {
	// declare all the palette categories of the diagram
	/**
	 * @generated
	 */
	private PaletteDrawer methodcontentelementDrawer;
	/**
	 * @generated
	 */
	private PaletteDrawer methodcontentrelationshipDrawer;

	/**
	 * @generated
	 */
	private ICreationUtils creationUtils;

	/**
	 * The Constructor
	 *
	 * @param utils the creation utils for the tools of the palette 
	 * @generated
	 */
	public MethodContentDefinitionPaletteManager(ICreationUtils utils) {
		super();
		this.creationUtils = utils;
	}

	/**
	 * Creates the main categories of the palette
	 *
	 * @generated
	 */
	protected void createCategories() {
		createMethodContentElementDrawer();
		createMethodContentRelationshipDrawer();
	}

	/**
	 * Updates the main categories of the palette
	 *
	 * @generated
	 */
	protected void updateCategories() {
		// deletion of the existing categories and creation of the updated categories

		getRoot().remove(methodcontentelementDrawer);
		createMethodContentElementDrawer();

		getRoot().remove(methodcontentrelationshipDrawer);
		createMethodContentRelationshipDrawer();
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 *
	 * @generated
	 */
	private void createMethodContentElementDrawer() {
		methodcontentelementDrawer = new PaletteDrawer("MethodContentElement",
				null);
		List<PaletteEntry> entries = new ArrayList<PaletteEntry>();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils,
				IspemPackage.eINSTANCE.getTaskDefinition(), "default");
		entries.add(new ModelerCreationToolEntry("Task Definition",
				"Task Definition", factory,
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("TASKDEFINITION"),
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("TASKDEFINITION_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getRoleDefinition(), "default");
		entries.add(new ModelerCreationToolEntry("Role Definition",
				"Role Definition", factory,
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("ROLEDEFINITION"),
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("ROLEDEFINITION_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				IspemPackage.eINSTANCE.getWorkProductDefinition(), "default");
		entries.add(new ModelerCreationToolEntry("Work Product Definition",
				"Work Product Definition", factory,
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("WORKPRODUCTDEFINITION"),
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("WORKPRODUCTDEFINITION_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				IspemPackage.eINSTANCE.getToolDefinition(), "default");
		entries.add(new ModelerCreationToolEntry("Tool Definition",
				"Tool Definition", factory,
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("TOOLDEFINITION"),
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("TOOLDEFINITION_LARGE")));
		
		methodcontentelementDrawer.addAll(entries);
		getRoot().add(methodcontentelementDrawer);
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 *
	 * @generated NOT
	 */
	private void createMethodContentRelationshipDrawer() {
		methodcontentrelationshipDrawer = new PaletteDrawer(
				"MethodContentRelationship", null);
		List<PaletteEntry> entries = new ArrayList<PaletteEntry>();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getDefault_TaskDefinitionParameter(),
				"default") {
			/**
			 * Get the EObject that is instantiated
			 * 
			 * @return EObject
			 */
			public EObject getNewModelObject() {
				// TODO should directly return the eobject without calling the deprecated method
				Default_TaskDefinitionParameter taskDefParam = (Default_TaskDefinitionParameter) super
						.getNewModelObject();
				taskDefParam.setDirection(ParameterDirectionKind.IN_LITERAL);
				return taskDefParam;
			}

		};

		entries.add(new ModelerConnectionCreationToolEntry(
				"Task Parameter In",
				"Task Parameter In",
				factory,
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("DEFAULT_TASKDEFINITIONPARAMETERIN"),
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("DEFAULT_TASKDEFINITIONPARAMETERIN_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getDefault_TaskDefinitionParameter(),
				"default") {
			/**
			 * Get the EObject that is instantiated
			 * 
			 * @return EObject
			 */
			public EObject getNewModelObject() {
				// TODO should directly return the eobject without calling the deprecated method
				Default_TaskDefinitionParameter taskDefParam = (Default_TaskDefinitionParameter) super
						.getNewModelObject();
				taskDefParam.setDirection(ParameterDirectionKind.OUT_LITERAL);
				return taskDefParam;
			}

		};
		entries.add(new ModelerConnectionCreationToolEntry(
				"Task Parameter Out",
				"Task Parameter Out",
				factory,
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("DEFAULT_TASKDEFINITIONPARAMETEROUT"),
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("DEFAULT_TASKDEFINITIONPARAMETEROUT_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getDefault_TaskDefinitionParameter(),
				"default") {
			/**
			 * Get the EObject that is instantiated
			 * 
			 * @return EObject
			 */
			public EObject getNewModelObject() {
				// TODO should directly return the eobject without calling the deprecated method
				Default_TaskDefinitionParameter taskDefParam = (Default_TaskDefinitionParameter) super
						.getNewModelObject();
				taskDefParam.setDirection(ParameterDirectionKind.INOUT_LITERAL);
				return taskDefParam;
			}

		};
		entries.add(new ModelerConnectionCreationToolEntry(
				"Task Parameter InOut",
				"Task Parameter InOut",
				factory,
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("DEFAULT_TASKDEFINITIONPARAMETERINOUT"),
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("DEFAULT_TASKDEFINITIONPARAMETERINOUT_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getDefault_TaskDefinitionPerformer(),
				"default");
		entries.add(new ModelerConnectionCreationToolEntry(
				"Task Performer",
				"Task Performer",
				factory,
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("DEFAULT_TASKDEFINITIONPERFORMER"),
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("DEFAULT_TASKDEFINITIONPERFORMER_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				SpemPackage.eINSTANCE.getDefault_ResponsibilityAssignment(),
				"default");
		entries.add(new ModelerConnectionCreationToolEntry(
				"Assign Work Product Responsibility",
				"Assign Work Product Responsibility",
				factory,
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("DEFAULT_RESPONSIBILITYASSIGNMENT"),
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("DEFAULT_RESPONSIBILITYASSIGNMENT_LARGE")));
		
		factory = new GraphElementCreationFactory(creationUtils,
				MethodContentDefinitionSimpleObjectConstants.SIMPLE_OBJECT_TOOLUSE,
				"default",false);
		entries.add(new ModelerConnectionCreationToolEntry(
				"Use Tool",
				"Use Tool",
				factory,
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("TOOLUSE"),
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("TOOLUSE_LARGE")));
		
		factory = new GraphElementCreationFactory(creationUtils,
				MethodContentDefinitionSimpleObjectConstants.SIMPLE_OBJECT_WORKPRODUCTMANAGEMENT,
				"default",false);
		entries.add(new ModelerConnectionCreationToolEntry(
				"Manage Work Product",
				"Manage Work Product",
				factory,
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("WORKPRODUCTMANAGEMENT"),
				MethodContentDefinitionImageRegistry
						.getImageDescriptor("WORKPRODUCTMANAGEMENT_LARGE")));
		
		methodcontentrelationshipDrawer.addAll(entries);
		getRoot().add(methodcontentrelationshipDrawer);
	}

}
