/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.patterns.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.BindingOperator;
import org.storydriven.modeling.patterns.BindingSemantics;
import org.storydriven.modeling.patterns.BindingState;
import org.storydriven.modeling.patterns.ContainerVariable;
import org.storydriven.modeling.patterns.PatternsFactory;
import org.storydriven.modeling.patterns.PatternsPackage;
import org.storydriven.modeling.patterns.StoryPattern;
import org.storydriven.modeling.patterns.parts.ContainerVariablePropertiesEditionPart;
import org.storydriven.modeling.patterns.parts.PatternsViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ContainerVariablePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for pattern EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings patternSettings;
	
	/**
	 * Settings for incomingLink ReferencesTable
	 */
	private	ReferencesTableSettings incomingLinkSettings;
	
	/**
	 * Settings for outgoingLink ReferencesTable
	 */
	private	ReferencesTableSettings outgoingLinkSettings;
	
	/**
	 * Settings for classifier EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings classifierSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ContainerVariablePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject containerVariable, String editing_mode) {
		super(editingContext, containerVariable, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = PatternsViewsRepository.class;
		partKey = PatternsViewsRepository.ContainerVariable.class;
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
			final ContainerVariable containerVariable = (ContainerVariable)elt;
			final ContainerVariablePropertiesEditionPart basePart = (ContainerVariablePropertiesEditionPart)editingPart;
			// init values
			if (containerVariable.getName() != null && isAccessible(PatternsViewsRepository.ContainerVariable.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), containerVariable.getName()));
			
			if (isAccessible(PatternsViewsRepository.ContainerVariable.Properties.pattern)) {
				// init part
				patternSettings = new EObjectFlatComboSettings(containerVariable, PatternsPackage.eINSTANCE.getAbstractVariable_Pattern());
				basePart.initPattern(patternSettings);
				// set the button mode
				basePart.setPatternButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternsViewsRepository.ContainerVariable.Properties.bindingState)) {
				basePart.initBindingState((EEnum) PatternsPackage.eINSTANCE.getAbstractVariable_BindingState().getEType(), containerVariable.getBindingState());
			}
			if (isAccessible(PatternsViewsRepository.ContainerVariable.Properties.incomingLink)) {
				incomingLinkSettings = new ReferencesTableSettings(containerVariable, PatternsPackage.eINSTANCE.getAbstractVariable_IncomingLink());
				basePart.initIncomingLink(incomingLinkSettings);
			}
			if (isAccessible(PatternsViewsRepository.ContainerVariable.Properties.outgoingLink)) {
				outgoingLinkSettings = new ReferencesTableSettings(containerVariable, PatternsPackage.eINSTANCE.getObjectVariable_OutgoingLink());
				basePart.initOutgoingLink(outgoingLinkSettings);
			}
			if (isAccessible(PatternsViewsRepository.ContainerVariable.Properties.bindingSemantics)) {
				basePart.initBindingSemantics((EEnum) PatternsPackage.eINSTANCE.getObjectVariable_BindingSemantics().getEType(), containerVariable.getBindingSemantics());
			}
			if (isAccessible(PatternsViewsRepository.ContainerVariable.Properties.bindingOperator)) {
				basePart.initBindingOperator((EEnum) PatternsPackage.eINSTANCE.getObjectVariable_BindingOperator().getEType(), containerVariable.getBindingOperator());
			}
			if (isAccessible(PatternsViewsRepository.ContainerVariable.Properties.classifier)) {
				// init part
				classifierSettings = new EObjectFlatComboSettings(containerVariable, PatternsPackage.eINSTANCE.getObjectVariable_Classifier());
				basePart.initClassifier(classifierSettings);
				// set the button mode
				basePart.setClassifierButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			basePart.addFilterToPattern(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof StoryPattern);
				}
			
			});
			// Start of user code for additional businessfilters for pattern
			// End of user code
			
			
			basePart.addFilterToIncomingLink(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIncomingLinkTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIncomingLink(new EObjectFilter(PatternsPackage.eINSTANCE.getAbstractLinkVariable()));
			// Start of user code for additional businessfilters for incomingLink
			// End of user code
			
			basePart.addFilterToOutgoingLink(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInOutgoingLinkTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToOutgoingLink(new EObjectFilter(PatternsPackage.eINSTANCE.getAbstractLinkVariable()));
			// Start of user code for additional businessfilters for outgoingLink
			// End of user code
			
			
			
			basePart.addFilterToClassifier(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof EClass);
				}
			
			});
			// Start of user code for additional businessfilters for classifier
			// End of user code
			
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
		if (editorKey == PatternsViewsRepository.ContainerVariable.Properties.name) {
			return SDMPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == PatternsViewsRepository.ContainerVariable.Properties.pattern) {
			return PatternsPackage.eINSTANCE.getAbstractVariable_Pattern();
		}
		if (editorKey == PatternsViewsRepository.ContainerVariable.Properties.bindingState) {
			return PatternsPackage.eINSTANCE.getAbstractVariable_BindingState();
		}
		if (editorKey == PatternsViewsRepository.ContainerVariable.Properties.incomingLink) {
			return PatternsPackage.eINSTANCE.getAbstractVariable_IncomingLink();
		}
		if (editorKey == PatternsViewsRepository.ContainerVariable.Properties.outgoingLink) {
			return PatternsPackage.eINSTANCE.getObjectVariable_OutgoingLink();
		}
		if (editorKey == PatternsViewsRepository.ContainerVariable.Properties.bindingSemantics) {
			return PatternsPackage.eINSTANCE.getObjectVariable_BindingSemantics();
		}
		if (editorKey == PatternsViewsRepository.ContainerVariable.Properties.bindingOperator) {
			return PatternsPackage.eINSTANCE.getObjectVariable_BindingOperator();
		}
		if (editorKey == PatternsViewsRepository.ContainerVariable.Properties.classifier) {
			return PatternsPackage.eINSTANCE.getObjectVariable_Classifier();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ContainerVariable containerVariable = (ContainerVariable)semanticObject;
		if (PatternsViewsRepository.ContainerVariable.Properties.name == event.getAffectedEditor()) {
			containerVariable.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (PatternsViewsRepository.ContainerVariable.Properties.pattern == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				patternSettings.setToReference((StoryPattern)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				StoryPattern eObject = PatternsFactory.eINSTANCE.createStoryPattern();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				patternSettings.setToReference(eObject);
			}
		}
		if (PatternsViewsRepository.ContainerVariable.Properties.bindingState == event.getAffectedEditor()) {
			containerVariable.setBindingState((BindingState)event.getNewValue());
		}
		if (PatternsViewsRepository.ContainerVariable.Properties.incomingLink == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof AbstractLinkVariable) {
					incomingLinkSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				incomingLinkSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				incomingLinkSettings.move(event.getNewIndex(), (AbstractLinkVariable) event.getNewValue());
			}
		}
		if (PatternsViewsRepository.ContainerVariable.Properties.outgoingLink == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof AbstractLinkVariable) {
					outgoingLinkSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				outgoingLinkSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				outgoingLinkSettings.move(event.getNewIndex(), (AbstractLinkVariable) event.getNewValue());
			}
		}
		if (PatternsViewsRepository.ContainerVariable.Properties.bindingSemantics == event.getAffectedEditor()) {
			containerVariable.setBindingSemantics((BindingSemantics)event.getNewValue());
		}
		if (PatternsViewsRepository.ContainerVariable.Properties.bindingOperator == event.getAffectedEditor()) {
			containerVariable.setBindingOperator((BindingOperator)event.getNewValue());
		}
		if (PatternsViewsRepository.ContainerVariable.Properties.classifier == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				classifierSettings.setToReference((EClass)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EClass eObject = EcoreFactory.eINSTANCE.createEClass();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				classifierSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ContainerVariablePropertiesEditionPart basePart = (ContainerVariablePropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.ContainerVariable.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (PatternsPackage.eINSTANCE.getAbstractVariable_Pattern().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.ContainerVariable.Properties.pattern))
				basePart.setPattern((EObject)msg.getNewValue());
			if (PatternsPackage.eINSTANCE.getAbstractVariable_BindingState().equals(msg.getFeature()) && isAccessible(PatternsViewsRepository.ContainerVariable.Properties.bindingState))
				basePart.setBindingState((Enumerator)msg.getNewValue());
			
			if (PatternsPackage.eINSTANCE.getAbstractVariable_IncomingLink().equals(msg.getFeature())  && isAccessible(PatternsViewsRepository.ContainerVariable.Properties.incomingLink))
				basePart.updateIncomingLink();
			if (PatternsPackage.eINSTANCE.getObjectVariable_OutgoingLink().equals(msg.getFeature())  && isAccessible(PatternsViewsRepository.ContainerVariable.Properties.outgoingLink))
				basePart.updateOutgoingLink();
			if (PatternsPackage.eINSTANCE.getObjectVariable_BindingSemantics().equals(msg.getFeature()) && isAccessible(PatternsViewsRepository.ContainerVariable.Properties.bindingSemantics))
				basePart.setBindingSemantics((Enumerator)msg.getNewValue());
			
			if (PatternsPackage.eINSTANCE.getObjectVariable_BindingOperator().equals(msg.getFeature()) && isAccessible(PatternsViewsRepository.ContainerVariable.Properties.bindingOperator))
				basePart.setBindingOperator((Enumerator)msg.getNewValue());
			
			if (PatternsPackage.eINSTANCE.getObjectVariable_Classifier().equals(msg.getFeature()) && basePart != null && isAccessible(PatternsViewsRepository.ContainerVariable.Properties.classifier))
				basePart.setClassifier((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == PatternsViewsRepository.ContainerVariable.Properties.name || key == PatternsViewsRepository.ContainerVariable.Properties.pattern || key == PatternsViewsRepository.ContainerVariable.Properties.bindingState || key == PatternsViewsRepository.ContainerVariable.Properties.bindingSemantics || key == PatternsViewsRepository.ContainerVariable.Properties.bindingOperator || key == PatternsViewsRepository.ContainerVariable.Properties.classifier;
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
				if (PatternsViewsRepository.ContainerVariable.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (PatternsViewsRepository.ContainerVariable.Properties.bindingState == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(PatternsPackage.eINSTANCE.getAbstractVariable_BindingState().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PatternsPackage.eINSTANCE.getAbstractVariable_BindingState().getEAttributeType(), newValue);
				}
				if (PatternsViewsRepository.ContainerVariable.Properties.bindingSemantics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(PatternsPackage.eINSTANCE.getObjectVariable_BindingSemantics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PatternsPackage.eINSTANCE.getObjectVariable_BindingSemantics().getEAttributeType(), newValue);
				}
				if (PatternsViewsRepository.ContainerVariable.Properties.bindingOperator == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(PatternsPackage.eINSTANCE.getObjectVariable_BindingOperator().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PatternsPackage.eINSTANCE.getObjectVariable_BindingOperator().getEAttributeType(), newValue);
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