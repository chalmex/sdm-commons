/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.activities.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.activities.ActivitiesFactory;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.JunctionNode;
import org.storydriven.storydiagrams.activities.StructuredNode;
import org.storydriven.storydiagrams.activities.parts.ActivitiesViewsRepository;
import org.storydriven.storydiagrams.activities.parts.JunctionNodePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class JunctionNodePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for outgoing ReferencesTable
	 */
	private	ReferencesTableSettings outgoingSettings;
	
	/**
	 * Settings for owningActivity EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings owningActivitySettings;
	
	/**
	 * Settings for owningActivityNode EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings owningActivityNodeSettings;
	
	/**
	 * Settings for incoming ReferencesTable
	 */
	private	ReferencesTableSettings incomingSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public JunctionNodePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject junctionNode, String editing_mode) {
		super(editingContext, junctionNode, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ActivitiesViewsRepository.class;
		partKey = ActivitiesViewsRepository.JunctionNode.class;
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
			final JunctionNode junctionNode = (JunctionNode)elt;
			final JunctionNodePropertiesEditionPart basePart = (JunctionNodePropertiesEditionPart)editingPart;
			// init values
			if (junctionNode.getComment() != null && isAccessible(ActivitiesViewsRepository.JunctionNode.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), junctionNode.getComment()));
			
			if (junctionNode.getName() != null && isAccessible(ActivitiesViewsRepository.JunctionNode.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), junctionNode.getName()));
			
			if (isAccessible(ActivitiesViewsRepository.JunctionNode.Properties.outgoing)) {
				outgoingSettings = new ReferencesTableSettings(junctionNode, ActivitiesPackage.eINSTANCE.getActivityNode_Outgoing());
				basePart.initOutgoing(outgoingSettings);
			}
			if (isAccessible(ActivitiesViewsRepository.JunctionNode.Properties.owningActivity)) {
				// init part
				owningActivitySettings = new EObjectFlatComboSettings(junctionNode, ActivitiesPackage.eINSTANCE.getActivityNode_OwningActivity());
				basePart.initOwningActivity(owningActivitySettings);
				// set the button mode
				basePart.setOwningActivityButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ActivitiesViewsRepository.JunctionNode.Properties.owningActivityNode)) {
				// init part
				owningActivityNodeSettings = new EObjectFlatComboSettings(junctionNode, ActivitiesPackage.eINSTANCE.getActivityNode_OwningActivityNode());
				basePart.initOwningActivityNode(owningActivityNodeSettings);
				// set the button mode
				basePart.setOwningActivityNodeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ActivitiesViewsRepository.JunctionNode.Properties.incoming)) {
				incomingSettings = new ReferencesTableSettings(junctionNode, ActivitiesPackage.eINSTANCE.getActivityNode_Incoming());
				basePart.initIncoming(incomingSettings);
			}
			// init filters
			
			
			basePart.addFilterToOutgoing(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInOutgoingTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToOutgoing(new EObjectFilter(ActivitiesPackage.eINSTANCE.getActivityEdge()));
			// Start of user code for additional businessfilters for outgoing
			// End of user code
			
			basePart.addFilterToOwningActivity(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Activity); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for owningActivity
			// End of user code
			
			basePart.addFilterToOwningActivityNode(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof StructuredNode); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for owningActivityNode
			// End of user code
			
			basePart.addFilterToIncoming(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIncomingTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIncoming(new EObjectFilter(ActivitiesPackage.eINSTANCE.getActivityEdge()));
			// Start of user code for additional businessfilters for incoming
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
		if (editorKey == ActivitiesViewsRepository.JunctionNode.Properties.comment) {
			return CorePackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == ActivitiesViewsRepository.JunctionNode.Properties.name) {
			return CorePackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == ActivitiesViewsRepository.JunctionNode.Properties.outgoing) {
			return ActivitiesPackage.eINSTANCE.getActivityNode_Outgoing();
		}
		if (editorKey == ActivitiesViewsRepository.JunctionNode.Properties.owningActivity) {
			return ActivitiesPackage.eINSTANCE.getActivityNode_OwningActivity();
		}
		if (editorKey == ActivitiesViewsRepository.JunctionNode.Properties.owningActivityNode) {
			return ActivitiesPackage.eINSTANCE.getActivityNode_OwningActivityNode();
		}
		if (editorKey == ActivitiesViewsRepository.JunctionNode.Properties.incoming) {
			return ActivitiesPackage.eINSTANCE.getActivityNode_Incoming();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		JunctionNode junctionNode = (JunctionNode)semanticObject;
		if (ActivitiesViewsRepository.JunctionNode.Properties.comment == event.getAffectedEditor()) {
			junctionNode.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ActivitiesViewsRepository.JunctionNode.Properties.name == event.getAffectedEditor()) {
			junctionNode.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ActivitiesViewsRepository.JunctionNode.Properties.outgoing == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ActivityEdge) {
					outgoingSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				outgoingSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				outgoingSettings.move(event.getNewIndex(), (ActivityEdge) event.getNewValue());
			}
		}
		if (ActivitiesViewsRepository.JunctionNode.Properties.owningActivity == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				owningActivitySettings.setToReference((Activity)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Activity eObject = ActivitiesFactory.eINSTANCE.createActivity();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				owningActivitySettings.setToReference(eObject);
			}
		}
		if (ActivitiesViewsRepository.JunctionNode.Properties.owningActivityNode == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				owningActivityNodeSettings.setToReference((StructuredNode)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				StructuredNode eObject = ActivitiesFactory.eINSTANCE.createStructuredNode();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				owningActivityNodeSettings.setToReference(eObject);
			}
		}
		if (ActivitiesViewsRepository.JunctionNode.Properties.incoming == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ActivityEdge) {
					incomingSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				incomingSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				incomingSettings.move(event.getNewIndex(), (ActivityEdge) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			JunctionNodePropertiesEditionPart basePart = (JunctionNodePropertiesEditionPart)editingPart;
			if (CorePackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.JunctionNode.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (CorePackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.JunctionNode.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ActivitiesPackage.eINSTANCE.getActivityNode_Outgoing().equals(msg.getFeature())  && isAccessible(ActivitiesViewsRepository.JunctionNode.Properties.outgoing))
				basePart.updateOutgoing();
			if (ActivitiesPackage.eINSTANCE.getActivityNode_OwningActivity().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.JunctionNode.Properties.owningActivity))
				basePart.setOwningActivity((EObject)msg.getNewValue());
			if (ActivitiesPackage.eINSTANCE.getActivityNode_OwningActivityNode().equals(msg.getFeature()) && basePart != null && isAccessible(ActivitiesViewsRepository.JunctionNode.Properties.owningActivityNode))
				basePart.setOwningActivityNode((EObject)msg.getNewValue());
			if (ActivitiesPackage.eINSTANCE.getActivityNode_Incoming().equals(msg.getFeature())  && isAccessible(ActivitiesViewsRepository.JunctionNode.Properties.incoming))
				basePart.updateIncoming();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ActivitiesViewsRepository.JunctionNode.Properties.name;
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
				if (ActivitiesViewsRepository.JunctionNode.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CorePackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CorePackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
				}
				if (ActivitiesViewsRepository.JunctionNode.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CorePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CorePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
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