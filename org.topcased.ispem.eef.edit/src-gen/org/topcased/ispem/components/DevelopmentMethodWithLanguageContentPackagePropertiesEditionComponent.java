/**
 * Generated with Acceleo
 */
package org.topcased.ispem.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.topcased.ispem.DevelopmentMethod;
import org.topcased.ispem.DevelopmentMethodWithLanguageContentPackage;
import org.topcased.ispem.IspemFactory;
import org.topcased.ispem.IspemPackage;
import org.topcased.ispem.RepresentativeLanguage;

import org.topcased.ispem.parts.DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart;
import org.topcased.ispem.parts.IspemViewsRepository;

import org.topcased.spem.MethodContentPackage;
import org.topcased.spem.MethodContentPackageableElement;
import org.topcased.spem.SpemPackage;


// End of user code

/**
 * 
 * 
 */
public class DevelopmentMethodWithLanguageContentPackagePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for ownedMethodContentMember ReferencesTable
	 */
	protected ReferencesTableSettings ownedMethodContentMemberSettings;
	
	/**
	 * Settings for reusedPackage ReferencesTable
	 */
	private ReferencesTableSettings reusedPackageSettings;
	
	/**
	 * Settings for relatedLanguage EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings relatedLanguageSettings;
	
	/**
	 * Settings for relatedMethod EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings relatedMethodSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public DevelopmentMethodWithLanguageContentPackagePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject developmentMethodWithLanguageContentPackage, String editing_mode) {
		super(editingContext, developmentMethodWithLanguageContentPackage, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = IspemViewsRepository.class;
		partKey = IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final DevelopmentMethodWithLanguageContentPackage developmentMethodWithLanguageContentPackage = (DevelopmentMethodWithLanguageContentPackage)elt;
			final DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart basePart = (DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, developmentMethodWithLanguageContentPackage.getName()));
			
			if (isAccessible(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.ownedMethodContentMember)) {
				ownedMethodContentMemberSettings = new ReferencesTableSettings(developmentMethodWithLanguageContentPackage, SpemPackage.eINSTANCE.getMethodContentPackage_OwnedMethodContentMember());
				basePart.initOwnedMethodContentMember(ownedMethodContentMemberSettings);
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.reusedPackage)) {
				reusedPackageSettings = new ReferencesTableSettings(developmentMethodWithLanguageContentPackage, SpemPackage.eINSTANCE.getMethodContentPackage_ReusedPackage());
				basePart.initReusedPackage(reusedPackageSettings);
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedLanguage)) {
				// init part
				relatedLanguageSettings = new EObjectFlatComboSettings(developmentMethodWithLanguageContentPackage, IspemPackage.eINSTANCE.getDevelopmentMethodWithLanguageContentPackage_RelatedLanguage());
				basePart.initRelatedLanguage(relatedLanguageSettings);
				// set the button mode
				basePart.setRelatedLanguageButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedMethod)) {
				// init part
				relatedMethodSettings = new EObjectFlatComboSettings(developmentMethodWithLanguageContentPackage, IspemPackage.eINSTANCE.getDevelopmentMethodWithLanguageContentPackage_RelatedMethod());
				basePart.initRelatedMethod(relatedMethodSettings);
				// set the button mode
				basePart.setRelatedMethodButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			if (isAccessible(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.ownedMethodContentMember)) {
				basePart.addFilterToOwnedMethodContentMember(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MethodContentPackageableElement); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for ownedMethodContentMember
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.reusedPackage)) {
				basePart.addFilterToReusedPackage(new EObjectFilter(SpemPackage.Literals.METHOD_CONTENT_PACKAGE));
				// Start of user code for additional businessfilters for reusedPackage
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedLanguage)) {
				basePart.addFilterToRelatedLanguage(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof RepresentativeLanguage); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for relatedLanguage
				// End of user code
			}
			if (isAccessible(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedMethod)) {
				basePart.addFilterToRelatedMethod(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof DevelopmentMethod); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for relatedMethod
				// End of user code
			}
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}








	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.name) {
			return SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.ownedMethodContentMember) {
			return SpemPackage.eINSTANCE.getMethodContentPackage_OwnedMethodContentMember();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.reusedPackage) {
			return SpemPackage.eINSTANCE.getMethodContentPackage_ReusedPackage();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedLanguage) {
			return IspemPackage.eINSTANCE.getDevelopmentMethodWithLanguageContentPackage_RelatedLanguage();
		}
		if (editorKey == IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedMethod) {
			return IspemPackage.eINSTANCE.getDevelopmentMethodWithLanguageContentPackage_RelatedMethod();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		DevelopmentMethodWithLanguageContentPackage developmentMethodWithLanguageContentPackage = (DevelopmentMethodWithLanguageContentPackage)semanticObject;
		if (IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.name == event.getAffectedEditor()) {
			developmentMethodWithLanguageContentPackage.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.ownedMethodContentMember == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, ownedMethodContentMemberSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				ownedMethodContentMemberSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ownedMethodContentMemberSettings.move(event.getNewIndex(), (MethodContentPackageableElement) event.getNewValue());
			}
		}
		if (IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.reusedPackage == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof MethodContentPackage) {
					reusedPackageSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				reusedPackageSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				reusedPackageSettings.move(event.getNewIndex(), (MethodContentPackage) event.getNewValue());
			}
		}
		if (IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedLanguage == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				relatedLanguageSettings.setToReference((RepresentativeLanguage)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				RepresentativeLanguage eObject = IspemFactory.eINSTANCE.createRepresentativeLanguage();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				relatedLanguageSettings.setToReference(eObject);
			}
		}
		if (IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedMethod == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				relatedMethodSettings.setToReference((DevelopmentMethod)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				DevelopmentMethod eObject = IspemFactory.eINSTANCE.createDevelopmentMethod();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				relatedMethodSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart basePart = (DevelopmentMethodWithLanguageContentPackagePropertiesEditionPart)editingPart;
			if (SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SpemPackage.eINSTANCE.getMethodContentPackage_OwnedMethodContentMember().equals(msg.getFeature()) && isAccessible(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.ownedMethodContentMember))
				basePart.updateOwnedMethodContentMember();
			if (SpemPackage.eINSTANCE.getMethodContentPackage_ReusedPackage().equals(msg.getFeature())  && isAccessible(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.reusedPackage))
				basePart.updateReusedPackage();
			if (IspemPackage.eINSTANCE.getDevelopmentMethodWithLanguageContentPackage_RelatedLanguage().equals(msg.getFeature()) && basePart != null && isAccessible(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedLanguage))
				basePart.setRelatedLanguage((EObject)msg.getNewValue());
			if (IspemPackage.eINSTANCE.getDevelopmentMethodWithLanguageContentPackage_RelatedMethod().equals(msg.getFeature()) && basePart != null && isAccessible(IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.relatedMethod))
				basePart.setRelatedMethod((EObject)msg.getNewValue());
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name(),
			SpemPackage.eINSTANCE.getMethodContentPackage_OwnedMethodContentMember(),
			SpemPackage.eINSTANCE.getMethodContentPackage_ReusedPackage(),
			IspemPackage.eINSTANCE.getDevelopmentMethodWithLanguageContentPackage_RelatedLanguage(),
			IspemPackage.eINSTANCE.getDevelopmentMethodWithLanguageContentPackage_RelatedMethod()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (IspemViewsRepository.DevelopmentMethodWithLanguageContentPackage.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SpemPackage.eINSTANCE.getMethodContentPackageableElement_Name().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
