/**
 * Generated with Acceleo
 */
package org.storydriven.storydiagrams.patterns.parts.impl;

// Start of user code for imports







import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart;
import org.storydriven.storydiagrams.patterns.parts.PatternsViewsRepository;
import org.storydriven.storydiagrams.patterns.providers.PatternsMessages;


// End of user code

/**
 * 
 * 
 */
public class ObjectVariablePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ObjectVariablePropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer pattern;
	protected EMFComboViewer bindingState;
	protected ReferencesTable incomingLink;
	protected List<ViewerFilter> incomingLinkBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> incomingLinkFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable outgoingLink;
	protected List<ViewerFilter> outgoingLinkBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outgoingLinkFilters = new ArrayList<ViewerFilter>();
	protected EMFComboViewer bindingSemantics;
	protected EMFComboViewer bindingOperator;
	protected EObjectFlatComboViewer classifier;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ObjectVariablePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	@Override
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	@Override
	public void createControls(Composite view) { 
		CompositionSequence objectVariableStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = objectVariableStep.addStep(PatternsViewsRepository.ObjectVariable.Properties.class);
		propertiesStep.addStep(PatternsViewsRepository.ObjectVariable.Properties.name);
		propertiesStep.addStep(PatternsViewsRepository.ObjectVariable.Properties.pattern);
		propertiesStep.addStep(PatternsViewsRepository.ObjectVariable.Properties.bindingState);
		propertiesStep.addStep(PatternsViewsRepository.ObjectVariable.Properties.incomingLink);
		propertiesStep.addStep(PatternsViewsRepository.ObjectVariable.Properties.outgoingLink);
		propertiesStep.addStep(PatternsViewsRepository.ObjectVariable.Properties.bindingSemantics);
		propertiesStep.addStep(PatternsViewsRepository.ObjectVariable.Properties.bindingOperator);
		propertiesStep.addStep(PatternsViewsRepository.ObjectVariable.Properties.classifier);
		
		
		composer = new PartComposer(objectVariableStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == PatternsViewsRepository.ObjectVariable.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == PatternsViewsRepository.ObjectVariable.Properties.name) {
					return createNameText(parent);
				}
				if (key == PatternsViewsRepository.ObjectVariable.Properties.pattern) {
					return createPatternFlatComboViewer(parent);
				}
				if (key == PatternsViewsRepository.ObjectVariable.Properties.bindingState) {
					return createBindingStateEMFComboViewer(parent);
				}
				if (key == PatternsViewsRepository.ObjectVariable.Properties.incomingLink) {
					return createIncomingLinkAdvancedReferencesTable(parent);
				}
				if (key == PatternsViewsRepository.ObjectVariable.Properties.outgoingLink) {
					return createOutgoingLinkAdvancedReferencesTable(parent);
				}
				if (key == PatternsViewsRepository.ObjectVariable.Properties.bindingSemantics) {
					return createBindingSemanticsEMFComboViewer(parent);
				}
				if (key == PatternsViewsRepository.ObjectVariable.Properties.bindingOperator) {
					return createBindingOperatorEMFComboViewer(parent);
				}
				if (key == PatternsViewsRepository.ObjectVariable.Properties.classifier) {
					return createClassifierFlatComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(PatternsMessages.ObjectVariablePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.ObjectVariablePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ObjectVariable.Properties.name, PatternsViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.ObjectVariable.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.ObjectVariable.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					}
				}
			}

		});
		EditingUtils.setID(name, PatternsViewsRepository.ObjectVariable.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ObjectVariable.Properties.name, PatternsViewsRepository.SWT_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createPatternFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.ObjectVariablePropertiesEditionPart_PatternLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ObjectVariable.Properties.pattern, PatternsViewsRepository.SWT_KIND));
		pattern = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.ObjectVariable.Properties.pattern, PatternsViewsRepository.SWT_KIND));
		pattern.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		pattern.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.ObjectVariable.Properties.pattern, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getPattern()));
			}

		});
		GridData patternData = new GridData(GridData.FILL_HORIZONTAL);
		pattern.setLayoutData(patternData);
		pattern.setID(PatternsViewsRepository.ObjectVariable.Properties.pattern);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ObjectVariable.Properties.pattern, PatternsViewsRepository.SWT_KIND), null); 
		return parent;
	}

	
	protected Composite createBindingStateEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.ObjectVariablePropertiesEditionPart_BindingStateLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ObjectVariable.Properties.bindingState, PatternsViewsRepository.SWT_KIND));
		bindingState = new EMFComboViewer(parent);
		bindingState.setContentProvider(new ArrayContentProvider());
		bindingState.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData bindingStateData = new GridData(GridData.FILL_HORIZONTAL);
		bindingState.getCombo().setLayoutData(bindingStateData);
		bindingState.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.ObjectVariable.Properties.bindingState, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBindingState()));
				}
			}

		});
		bindingState.setID(PatternsViewsRepository.ObjectVariable.Properties.bindingState);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ObjectVariable.Properties.bindingState, PatternsViewsRepository.SWT_KIND), null); 
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createIncomingLinkAdvancedReferencesTable(Composite parent) {
		this.incomingLink = new ReferencesTable(PatternsMessages.ObjectVariablePropertiesEditionPart_IncomingLinkLabel, new org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener() {
			public void handleAdd() { addIncomingLink(); }
			public void handleEdit(EObject element) { editIncomingLink(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncomingLink(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIncomingLink(element); }
			public void navigateTo(EObject element) { }
		});
		this.incomingLink.setHelpText(propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ObjectVariable.Properties.incomingLink, PatternsViewsRepository.SWT_KIND));
		this.incomingLink.createControls(parent);
		this.incomingLink.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.ObjectVariable.Properties.incomingLink, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData incomingLinkData = new GridData(GridData.FILL_HORIZONTAL);
		incomingLinkData.horizontalSpan = 3;
		this.incomingLink.setLayoutData(incomingLinkData);
		this.incomingLink.disableMove();
		incomingLink.setID(PatternsViewsRepository.ObjectVariable.Properties.incomingLink);
		incomingLink.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIncomingLink() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(incomingLink.getInput(), incomingLinkFilters, incomingLinkBusinessFilters,
		"incomingLink", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.ObjectVariable.Properties.incomingLink,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				incomingLink.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIncomingLink(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.ObjectVariable.Properties.incomingLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		incomingLink.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIncomingLink(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.ObjectVariable.Properties.incomingLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		incomingLink.refresh();
	}

	/**
	 * 
	 */
	protected void editIncomingLink(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				incomingLink.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createOutgoingLinkAdvancedReferencesTable(Composite parent) {
		this.outgoingLink = new ReferencesTable(PatternsMessages.ObjectVariablePropertiesEditionPart_OutgoingLinkLabel, new org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener() {
			public void handleAdd() { addOutgoingLink(); }
			public void handleEdit(EObject element) { editOutgoingLink(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutgoingLink(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutgoingLink(element); }
			public void navigateTo(EObject element) { }
		});
		this.outgoingLink.setHelpText(propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ObjectVariable.Properties.outgoingLink, PatternsViewsRepository.SWT_KIND));
		this.outgoingLink.createControls(parent);
		this.outgoingLink.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.ObjectVariable.Properties.outgoingLink, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outgoingLinkData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingLinkData.horizontalSpan = 3;
		this.outgoingLink.setLayoutData(outgoingLinkData);
		this.outgoingLink.disableMove();
		outgoingLink.setID(PatternsViewsRepository.ObjectVariable.Properties.outgoingLink);
		outgoingLink.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutgoingLink() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outgoingLink.getInput(), outgoingLinkFilters, outgoingLinkBusinessFilters,
		"outgoingLink", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.ObjectVariable.Properties.outgoingLink,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				outgoingLink.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutgoingLink(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.ObjectVariable.Properties.outgoingLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outgoingLink.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutgoingLink(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.ObjectVariable.Properties.outgoingLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outgoingLink.refresh();
	}

	/**
	 * 
	 */
	protected void editOutgoingLink(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outgoingLink.refresh();
			}
		}
	}

	
	protected Composite createBindingSemanticsEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.ObjectVariablePropertiesEditionPart_BindingSemanticsLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ObjectVariable.Properties.bindingSemantics, PatternsViewsRepository.SWT_KIND));
		bindingSemantics = new EMFComboViewer(parent);
		bindingSemantics.setContentProvider(new ArrayContentProvider());
		bindingSemantics.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData bindingSemanticsData = new GridData(GridData.FILL_HORIZONTAL);
		bindingSemantics.getCombo().setLayoutData(bindingSemanticsData);
		bindingSemantics.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.ObjectVariable.Properties.bindingSemantics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBindingSemantics()));
				}
			}

		});
		bindingSemantics.setID(PatternsViewsRepository.ObjectVariable.Properties.bindingSemantics);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ObjectVariable.Properties.bindingSemantics, PatternsViewsRepository.SWT_KIND), null); 
		return parent;
	}

	
	protected Composite createBindingOperatorEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.ObjectVariablePropertiesEditionPart_BindingOperatorLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ObjectVariable.Properties.bindingOperator, PatternsViewsRepository.SWT_KIND));
		bindingOperator = new EMFComboViewer(parent);
		bindingOperator.setContentProvider(new ArrayContentProvider());
		bindingOperator.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData bindingOperatorData = new GridData(GridData.FILL_HORIZONTAL);
		bindingOperator.getCombo().setLayoutData(bindingOperatorData);
		bindingOperator.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.ObjectVariable.Properties.bindingOperator, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBindingOperator()));
				}
			}

		});
		bindingOperator.setID(PatternsViewsRepository.ObjectVariable.Properties.bindingOperator);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ObjectVariable.Properties.bindingOperator, PatternsViewsRepository.SWT_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createClassifierFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.ObjectVariablePropertiesEditionPart_ClassifierLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ObjectVariable.Properties.classifier, PatternsViewsRepository.SWT_KIND));
		classifier = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.ObjectVariable.Properties.classifier, PatternsViewsRepository.SWT_KIND));
		classifier.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		classifier.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ObjectVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.ObjectVariable.Properties.classifier, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getClassifier()));
			}

		});
		GridData classifierData = new GridData(GridData.FILL_HORIZONTAL);
		classifier.setLayoutData(classifierData);
		classifier.setID(PatternsViewsRepository.ObjectVariable.Properties.classifier);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ObjectVariable.Properties.classifier, PatternsViewsRepository.SWT_KIND), null); 
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	@Override
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#getName()
	 * 
	 */
	@Override
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	@Override
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#getPattern()
	 * 
	 */
	@Override
	public EObject getPattern() {
		if (pattern.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) pattern.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#initPattern(EObjectFlatComboSettings)
	 */
	@Override
	public void initPattern(EObjectFlatComboSettings settings) {
		pattern.setInput(settings);
		if (current != null) {
			pattern.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#setPattern(EObject newValue)
	 * 
	 */
	@Override
	public void setPattern(EObject newValue) {
		if (newValue != null) {
			pattern.setSelection(new StructuredSelection(newValue));
		} else {
			pattern.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#setPatternButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setPatternButtonMode(ButtonsModeEnum newValue) {
		pattern.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#addFilterPattern(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToPattern(ViewerFilter filter) {
		pattern.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#addBusinessFilterPattern(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToPattern(ViewerFilter filter) {
		pattern.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#getBindingState()
	 * 
	 */
	@Override
	public Enumerator getBindingState() {
		Enumerator selection = (Enumerator) ((StructuredSelection) bindingState.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#initBindingState(Object input, Enumerator current)
	 */
	@Override
	public void initBindingState(Object input, Enumerator current) {
		bindingState.setInput(input);
		bindingState.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#setBindingState(Enumerator newValue)
	 * 
	 */
	@Override
	public void setBindingState(Enumerator newValue) {
		bindingState.modelUpdating(new StructuredSelection(newValue));
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#initIncomingLink(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	@Override
	public void initIncomingLink(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null) {
			this.resourceSet = current.eResource().getResourceSet();
		}
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		incomingLink.setContentProvider(contentProvider);
		incomingLink.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#updateIncomingLink()
	 * 
	 */
	@Override
	public void updateIncomingLink() {
	incomingLink.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#addFilterIncomingLink(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToIncomingLink(ViewerFilter filter) {
		incomingLinkFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#addBusinessFilterIncomingLink(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToIncomingLink(ViewerFilter filter) {
		incomingLinkBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#isContainedInIncomingLinkTable(EObject element)
	 * 
	 */
	@Override
	public boolean isContainedInIncomingLinkTable(EObject element) {
		return ((ReferencesTableSettings)incomingLink.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#initOutgoingLink(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	@Override
	public void initOutgoingLink(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null) {
			this.resourceSet = current.eResource().getResourceSet();
		}
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outgoingLink.setContentProvider(contentProvider);
		outgoingLink.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#updateOutgoingLink()
	 * 
	 */
	@Override
	public void updateOutgoingLink() {
	outgoingLink.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#addFilterOutgoingLink(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToOutgoingLink(ViewerFilter filter) {
		outgoingLinkFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#addBusinessFilterOutgoingLink(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToOutgoingLink(ViewerFilter filter) {
		outgoingLinkBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#isContainedInOutgoingLinkTable(EObject element)
	 * 
	 */
	@Override
	public boolean isContainedInOutgoingLinkTable(EObject element) {
		return ((ReferencesTableSettings)outgoingLink.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#getBindingSemantics()
	 * 
	 */
	@Override
	public Enumerator getBindingSemantics() {
		Enumerator selection = (Enumerator) ((StructuredSelection) bindingSemantics.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#initBindingSemantics(Object input, Enumerator current)
	 */
	@Override
	public void initBindingSemantics(Object input, Enumerator current) {
		bindingSemantics.setInput(input);
		bindingSemantics.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#setBindingSemantics(Enumerator newValue)
	 * 
	 */
	@Override
	public void setBindingSemantics(Enumerator newValue) {
		bindingSemantics.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#getBindingOperator()
	 * 
	 */
	@Override
	public Enumerator getBindingOperator() {
		Enumerator selection = (Enumerator) ((StructuredSelection) bindingOperator.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#initBindingOperator(Object input, Enumerator current)
	 */
	@Override
	public void initBindingOperator(Object input, Enumerator current) {
		bindingOperator.setInput(input);
		bindingOperator.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#setBindingOperator(Enumerator newValue)
	 * 
	 */
	@Override
	public void setBindingOperator(Enumerator newValue) {
		bindingOperator.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#getClassifier()
	 * 
	 */
	@Override
	public EObject getClassifier() {
		if (classifier.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) classifier.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#initClassifier(EObjectFlatComboSettings)
	 */
	@Override
	public void initClassifier(EObjectFlatComboSettings settings) {
		classifier.setInput(settings);
		if (current != null) {
			classifier.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#setClassifier(EObject newValue)
	 * 
	 */
	@Override
	public void setClassifier(EObject newValue) {
		if (newValue != null) {
			classifier.setSelection(new StructuredSelection(newValue));
		} else {
			classifier.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#setClassifierButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setClassifierButtonMode(ButtonsModeEnum newValue) {
		classifier.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#addFilterClassifier(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToClassifier(ViewerFilter filter) {
		classifier.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ObjectVariablePropertiesEditionPart#addBusinessFilterClassifier(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToClassifier(ViewerFilter filter) {
		classifier.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	@Override
	public String getTitle() {
		return PatternsMessages.ObjectVariable_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
