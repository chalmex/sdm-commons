/**

 * 
 * 
 * 
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
import org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart;
import org.storydriven.storydiagrams.patterns.parts.PatternsViewsRepository;
import org.storydriven.storydiagrams.patterns.providers.PatternsMessages;


// End of user code

/**
 * 
 * 
 */
public class ContainmentRelationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ContainmentRelationPropertiesEditionPart {

	protected Text name;
	protected EMFComboViewer bindingSemantics;
	protected EMFComboViewer bindingOperator;
	protected EObjectFlatComboViewer source;
	protected ReferencesTable secondLinkConstraint;
	protected List<ViewerFilter> secondLinkConstraintBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> secondLinkConstraintFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable firstLinkConstraint;
	protected List<ViewerFilter> firstLinkConstraintBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> firstLinkConstraintFilters = new ArrayList<ViewerFilter>();
	protected EMFComboViewer bindingState;
	protected EObjectFlatComboViewer pattern;
	protected EObjectFlatComboViewer target;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ContainmentRelationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence containmentRelationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = containmentRelationStep.addStep(PatternsViewsRepository.ContainmentRelation.Properties.class);
		propertiesStep.addStep(PatternsViewsRepository.ContainmentRelation.Properties.name);
		propertiesStep.addStep(PatternsViewsRepository.ContainmentRelation.Properties.bindingSemantics);
		propertiesStep.addStep(PatternsViewsRepository.ContainmentRelation.Properties.bindingOperator);
		propertiesStep.addStep(PatternsViewsRepository.ContainmentRelation.Properties.source);
		propertiesStep.addStep(PatternsViewsRepository.ContainmentRelation.Properties.secondLinkConstraint);
		propertiesStep.addStep(PatternsViewsRepository.ContainmentRelation.Properties.firstLinkConstraint);
		propertiesStep.addStep(PatternsViewsRepository.ContainmentRelation.Properties.bindingState);
		propertiesStep.addStep(PatternsViewsRepository.ContainmentRelation.Properties.pattern);
		propertiesStep.addStep(PatternsViewsRepository.ContainmentRelation.Properties.target);
		
		
		composer = new PartComposer(containmentRelationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == PatternsViewsRepository.ContainmentRelation.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == PatternsViewsRepository.ContainmentRelation.Properties.name) {
					return createNameText(parent);
				}
				if (key == PatternsViewsRepository.ContainmentRelation.Properties.bindingSemantics) {
					return createBindingSemanticsEMFComboViewer(parent);
				}
				if (key == PatternsViewsRepository.ContainmentRelation.Properties.bindingOperator) {
					return createBindingOperatorEMFComboViewer(parent);
				}
				if (key == PatternsViewsRepository.ContainmentRelation.Properties.source) {
					return createSourceFlatComboViewer(parent);
				}
				if (key == PatternsViewsRepository.ContainmentRelation.Properties.secondLinkConstraint) {
					return createSecondLinkConstraintAdvancedReferencesTable(parent);
				}
				if (key == PatternsViewsRepository.ContainmentRelation.Properties.firstLinkConstraint) {
					return createFirstLinkConstraintAdvancedReferencesTable(parent);
				}
				if (key == PatternsViewsRepository.ContainmentRelation.Properties.bindingState) {
					return createBindingStateEMFComboViewer(parent);
				}
				if (key == PatternsViewsRepository.ContainmentRelation.Properties.pattern) {
					return createPatternFlatComboViewer(parent);
				}
				if (key == PatternsViewsRepository.ContainmentRelation.Properties.target) {
					return createTargetFlatComboViewer(parent);
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
		propertiesGroup.setText(PatternsMessages.ContainmentRelationPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.ContainmentRelationPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ContainmentRelation.Properties.name, PatternsViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainmentRelationPropertiesEditionPartImpl.this, PatternsViewsRepository.ContainmentRelation.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainmentRelationPropertiesEditionPartImpl.this, PatternsViewsRepository.ContainmentRelation.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					}
				}
			}

		});
		EditingUtils.setID(name, PatternsViewsRepository.ContainmentRelation.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ContainmentRelation.Properties.name, PatternsViewsRepository.SWT_KIND), null); 
		return parent;
	}

	
	protected Composite createBindingSemanticsEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.ContainmentRelationPropertiesEditionPart_BindingSemanticsLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ContainmentRelation.Properties.bindingSemantics, PatternsViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainmentRelationPropertiesEditionPartImpl.this, PatternsViewsRepository.ContainmentRelation.Properties.bindingSemantics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBindingSemantics()));
				}
			}

		});
		bindingSemantics.setID(PatternsViewsRepository.ContainmentRelation.Properties.bindingSemantics);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ContainmentRelation.Properties.bindingSemantics, PatternsViewsRepository.SWT_KIND), null); 
		return parent;
	}

	
	protected Composite createBindingOperatorEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.ContainmentRelationPropertiesEditionPart_BindingOperatorLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ContainmentRelation.Properties.bindingOperator, PatternsViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainmentRelationPropertiesEditionPartImpl.this, PatternsViewsRepository.ContainmentRelation.Properties.bindingOperator, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBindingOperator()));
				}
			}

		});
		bindingOperator.setID(PatternsViewsRepository.ContainmentRelation.Properties.bindingOperator);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ContainmentRelation.Properties.bindingOperator, PatternsViewsRepository.SWT_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSourceFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.ContainmentRelationPropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ContainmentRelation.Properties.source, PatternsViewsRepository.SWT_KIND));
		source = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.ContainmentRelation.Properties.source, PatternsViewsRepository.SWT_KIND));
		source.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		source.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainmentRelationPropertiesEditionPartImpl.this, PatternsViewsRepository.ContainmentRelation.Properties.source, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSource()));
			}

		});
		GridData sourceData = new GridData(GridData.FILL_HORIZONTAL);
		source.setLayoutData(sourceData);
		source.setID(PatternsViewsRepository.ContainmentRelation.Properties.source);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ContainmentRelation.Properties.source, PatternsViewsRepository.SWT_KIND), null); 
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSecondLinkConstraintAdvancedReferencesTable(Composite parent) {
		this.secondLinkConstraint = new ReferencesTable(PatternsMessages.ContainmentRelationPropertiesEditionPart_SecondLinkConstraintLabel, new org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener() {
			public void handleAdd() { addSecondLinkConstraint(); }
			public void handleEdit(EObject element) { editSecondLinkConstraint(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSecondLinkConstraint(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSecondLinkConstraint(element); }
			public void navigateTo(EObject element) { }
		});
		this.secondLinkConstraint.setHelpText(propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ContainmentRelation.Properties.secondLinkConstraint, PatternsViewsRepository.SWT_KIND));
		this.secondLinkConstraint.createControls(parent);
		this.secondLinkConstraint.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainmentRelationPropertiesEditionPartImpl.this, PatternsViewsRepository.ContainmentRelation.Properties.secondLinkConstraint, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData secondLinkConstraintData = new GridData(GridData.FILL_HORIZONTAL);
		secondLinkConstraintData.horizontalSpan = 3;
		this.secondLinkConstraint.setLayoutData(secondLinkConstraintData);
		this.secondLinkConstraint.disableMove();
		secondLinkConstraint.setID(PatternsViewsRepository.ContainmentRelation.Properties.secondLinkConstraint);
		secondLinkConstraint.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSecondLinkConstraint() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(secondLinkConstraint.getInput(), secondLinkConstraintFilters, secondLinkConstraintBusinessFilters,
		"secondLinkConstraint", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainmentRelationPropertiesEditionPartImpl.this, PatternsViewsRepository.ContainmentRelation.Properties.secondLinkConstraint,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				secondLinkConstraint.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSecondLinkConstraint(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainmentRelationPropertiesEditionPartImpl.this, PatternsViewsRepository.ContainmentRelation.Properties.secondLinkConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		secondLinkConstraint.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSecondLinkConstraint(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainmentRelationPropertiesEditionPartImpl.this, PatternsViewsRepository.ContainmentRelation.Properties.secondLinkConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		secondLinkConstraint.refresh();
	}

	/**
	 * 
	 */
	protected void editSecondLinkConstraint(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				secondLinkConstraint.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createFirstLinkConstraintAdvancedReferencesTable(Composite parent) {
		this.firstLinkConstraint = new ReferencesTable(PatternsMessages.ContainmentRelationPropertiesEditionPart_FirstLinkConstraintLabel, new org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener() {
			public void handleAdd() { addFirstLinkConstraint(); }
			public void handleEdit(EObject element) { editFirstLinkConstraint(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveFirstLinkConstraint(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromFirstLinkConstraint(element); }
			public void navigateTo(EObject element) { }
		});
		this.firstLinkConstraint.setHelpText(propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ContainmentRelation.Properties.firstLinkConstraint, PatternsViewsRepository.SWT_KIND));
		this.firstLinkConstraint.createControls(parent);
		this.firstLinkConstraint.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainmentRelationPropertiesEditionPartImpl.this, PatternsViewsRepository.ContainmentRelation.Properties.firstLinkConstraint, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData firstLinkConstraintData = new GridData(GridData.FILL_HORIZONTAL);
		firstLinkConstraintData.horizontalSpan = 3;
		this.firstLinkConstraint.setLayoutData(firstLinkConstraintData);
		this.firstLinkConstraint.disableMove();
		firstLinkConstraint.setID(PatternsViewsRepository.ContainmentRelation.Properties.firstLinkConstraint);
		firstLinkConstraint.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addFirstLinkConstraint() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(firstLinkConstraint.getInput(), firstLinkConstraintFilters, firstLinkConstraintBusinessFilters,
		"firstLinkConstraint", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainmentRelationPropertiesEditionPartImpl.this, PatternsViewsRepository.ContainmentRelation.Properties.firstLinkConstraint,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				firstLinkConstraint.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveFirstLinkConstraint(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainmentRelationPropertiesEditionPartImpl.this, PatternsViewsRepository.ContainmentRelation.Properties.firstLinkConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		firstLinkConstraint.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromFirstLinkConstraint(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainmentRelationPropertiesEditionPartImpl.this, PatternsViewsRepository.ContainmentRelation.Properties.firstLinkConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		firstLinkConstraint.refresh();
	}

	/**
	 * 
	 */
	protected void editFirstLinkConstraint(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				firstLinkConstraint.refresh();
			}
		}
	}

	
	protected Composite createBindingStateEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.ContainmentRelationPropertiesEditionPart_BindingStateLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ContainmentRelation.Properties.bindingState, PatternsViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainmentRelationPropertiesEditionPartImpl.this, PatternsViewsRepository.ContainmentRelation.Properties.bindingState, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBindingState()));
				}
			}

		});
		bindingState.setID(PatternsViewsRepository.ContainmentRelation.Properties.bindingState);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ContainmentRelation.Properties.bindingState, PatternsViewsRepository.SWT_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createPatternFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.ContainmentRelationPropertiesEditionPart_PatternLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ContainmentRelation.Properties.pattern, PatternsViewsRepository.SWT_KIND));
		pattern = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.ContainmentRelation.Properties.pattern, PatternsViewsRepository.SWT_KIND));
		pattern.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		pattern.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainmentRelationPropertiesEditionPartImpl.this, PatternsViewsRepository.ContainmentRelation.Properties.pattern, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getPattern()));
			}

		});
		GridData patternData = new GridData(GridData.FILL_HORIZONTAL);
		pattern.setLayoutData(patternData);
		pattern.setID(PatternsViewsRepository.ContainmentRelation.Properties.pattern);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ContainmentRelation.Properties.pattern, PatternsViewsRepository.SWT_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTargetFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.ContainmentRelationPropertiesEditionPart_TargetLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.ContainmentRelation.Properties.target, PatternsViewsRepository.SWT_KIND));
		target = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.ContainmentRelation.Properties.target, PatternsViewsRepository.SWT_KIND));
		target.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		target.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContainmentRelationPropertiesEditionPartImpl.this, PatternsViewsRepository.ContainmentRelation.Properties.target, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTarget()));
			}

		});
		GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
		target.setLayoutData(targetData);
		target.setID(PatternsViewsRepository.ContainmentRelation.Properties.target);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.ContainmentRelation.Properties.target, PatternsViewsRepository.SWT_KIND), null); 
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
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#getName()
	 * 
	 */
	@Override
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#setName(String newValue)
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
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#getBindingSemantics()
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
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#initBindingSemantics(Object input, Enumerator current)
	 */
	@Override
	public void initBindingSemantics(Object input, Enumerator current) {
		bindingSemantics.setInput(input);
		bindingSemantics.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#setBindingSemantics(Enumerator newValue)
	 * 
	 */
	@Override
	public void setBindingSemantics(Enumerator newValue) {
		bindingSemantics.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#getBindingOperator()
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
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#initBindingOperator(Object input, Enumerator current)
	 */
	@Override
	public void initBindingOperator(Object input, Enumerator current) {
		bindingOperator.setInput(input);
		bindingOperator.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#setBindingOperator(Enumerator newValue)
	 * 
	 */
	@Override
	public void setBindingOperator(Enumerator newValue) {
		bindingOperator.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#getSource()
	 * 
	 */
	@Override
	public EObject getSource() {
		if (source.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) source.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#initSource(EObjectFlatComboSettings)
	 */
	@Override
	public void initSource(EObjectFlatComboSettings settings) {
		source.setInput(settings);
		if (current != null) {
			source.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#setSource(EObject newValue)
	 * 
	 */
	@Override
	public void setSource(EObject newValue) {
		if (newValue != null) {
			source.setSelection(new StructuredSelection(newValue));
		} else {
			source.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#setSourceButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setSourceButtonMode(ButtonsModeEnum newValue) {
		source.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#addFilterSource(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToSource(ViewerFilter filter) {
		source.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#addBusinessFilterSource(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToSource(ViewerFilter filter) {
		source.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#initSecondLinkConstraint(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	@Override
	public void initSecondLinkConstraint(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null) {
			this.resourceSet = current.eResource().getResourceSet();
		}
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		secondLinkConstraint.setContentProvider(contentProvider);
		secondLinkConstraint.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#updateSecondLinkConstraint()
	 * 
	 */
	@Override
	public void updateSecondLinkConstraint() {
	secondLinkConstraint.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#addFilterSecondLinkConstraint(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToSecondLinkConstraint(ViewerFilter filter) {
		secondLinkConstraintFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#addBusinessFilterSecondLinkConstraint(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToSecondLinkConstraint(ViewerFilter filter) {
		secondLinkConstraintBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#isContainedInSecondLinkConstraintTable(EObject element)
	 * 
	 */
	@Override
	public boolean isContainedInSecondLinkConstraintTable(EObject element) {
		return ((ReferencesTableSettings)secondLinkConstraint.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#initFirstLinkConstraint(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	@Override
	public void initFirstLinkConstraint(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null) {
			this.resourceSet = current.eResource().getResourceSet();
		}
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		firstLinkConstraint.setContentProvider(contentProvider);
		firstLinkConstraint.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#updateFirstLinkConstraint()
	 * 
	 */
	@Override
	public void updateFirstLinkConstraint() {
	firstLinkConstraint.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#addFilterFirstLinkConstraint(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToFirstLinkConstraint(ViewerFilter filter) {
		firstLinkConstraintFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#addBusinessFilterFirstLinkConstraint(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToFirstLinkConstraint(ViewerFilter filter) {
		firstLinkConstraintBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#isContainedInFirstLinkConstraintTable(EObject element)
	 * 
	 */
	@Override
	public boolean isContainedInFirstLinkConstraintTable(EObject element) {
		return ((ReferencesTableSettings)firstLinkConstraint.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#getBindingState()
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
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#initBindingState(Object input, Enumerator current)
	 */
	@Override
	public void initBindingState(Object input, Enumerator current) {
		bindingState.setInput(input);
		bindingState.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#setBindingState(Enumerator newValue)
	 * 
	 */
	@Override
	public void setBindingState(Enumerator newValue) {
		bindingState.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#getPattern()
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
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#initPattern(EObjectFlatComboSettings)
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
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#setPattern(EObject newValue)
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
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#setPatternButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setPatternButtonMode(ButtonsModeEnum newValue) {
		pattern.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#addFilterPattern(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToPattern(ViewerFilter filter) {
		pattern.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#addBusinessFilterPattern(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToPattern(ViewerFilter filter) {
		pattern.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#getTarget()
	 * 
	 */
	@Override
	public EObject getTarget() {
		if (target.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) target.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#initTarget(EObjectFlatComboSettings)
	 */
	@Override
	public void initTarget(EObjectFlatComboSettings settings) {
		target.setInput(settings);
		if (current != null) {
			target.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#setTarget(EObject newValue)
	 * 
	 */
	@Override
	public void setTarget(EObject newValue) {
		if (newValue != null) {
			target.setSelection(new StructuredSelection(newValue));
		} else {
			target.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#setTargetButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setTargetButtonMode(ButtonsModeEnum newValue) {
		target.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#addFilterTarget(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToTarget(ViewerFilter filter) {
		target.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.storydiagrams.patterns.parts.ContainmentRelationPropertiesEditionPart#addBusinessFilterTarget(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToTarget(ViewerFilter filter) {
		target.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	@Override
	public String getTitle() {
		return PatternsMessages.ContainmentRelation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
