/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.patterns.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart;
import org.storydriven.modeling.patterns.parts.PatternsViewsRepository;
import org.storydriven.modeling.patterns.providers.PatternsMessages;


// End of user code

/**
 * 
 * 
 */
public class LinkVariablePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, LinkVariablePropertiesEditionPart {

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
	protected EObjectFlatComboViewer targetEnd;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public LinkVariablePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence linkVariableStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = linkVariableStep.addStep(PatternsViewsRepository.LinkVariable.Properties.class);
		propertiesStep.addStep(PatternsViewsRepository.LinkVariable.Properties.name);
		propertiesStep.addStep(PatternsViewsRepository.LinkVariable.Properties.bindingSemantics);
		propertiesStep.addStep(PatternsViewsRepository.LinkVariable.Properties.bindingOperator);
		propertiesStep.addStep(PatternsViewsRepository.LinkVariable.Properties.source);
		propertiesStep.addStep(PatternsViewsRepository.LinkVariable.Properties.secondLinkConstraint);
		propertiesStep.addStep(PatternsViewsRepository.LinkVariable.Properties.firstLinkConstraint);
		propertiesStep.addStep(PatternsViewsRepository.LinkVariable.Properties.bindingState);
		propertiesStep.addStep(PatternsViewsRepository.LinkVariable.Properties.pattern);
		propertiesStep.addStep(PatternsViewsRepository.LinkVariable.Properties.target);
		propertiesStep.addStep(PatternsViewsRepository.LinkVariable.Properties.targetEnd);
		
		
		composer = new PartComposer(linkVariableStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == PatternsViewsRepository.LinkVariable.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.LinkVariable.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.LinkVariable.Properties.bindingSemantics) {
					return createBindingSemanticsEMFComboViewer(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.LinkVariable.Properties.bindingOperator) {
					return createBindingOperatorEMFComboViewer(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.LinkVariable.Properties.source) {
					return createSourceFlatComboViewer(parent, widgetFactory);
				}
				if (key == PatternsViewsRepository.LinkVariable.Properties.secondLinkConstraint) {
					return createSecondLinkConstraintReferencesTable(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.LinkVariable.Properties.firstLinkConstraint) {
					return createFirstLinkConstraintReferencesTable(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.LinkVariable.Properties.bindingState) {
					return createBindingStateEMFComboViewer(widgetFactory, parent);
				}
				if (key == PatternsViewsRepository.LinkVariable.Properties.pattern) {
					return createPatternFlatComboViewer(parent, widgetFactory);
				}
				if (key == PatternsViewsRepository.LinkVariable.Properties.target) {
					return createTargetFlatComboViewer(parent, widgetFactory);
				}
				if (key == PatternsViewsRepository.LinkVariable.Properties.targetEnd) {
					return createTargetEndFlatComboViewer(parent, widgetFactory);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(PatternsMessages.LinkVariablePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.LinkVariablePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkVariable.Properties.name, PatternsViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkVariablePropertiesEditionPartForm.this, PatternsViewsRepository.LinkVariable.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkVariablePropertiesEditionPartForm.this, PatternsViewsRepository.LinkVariable.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, PatternsViewsRepository.LinkVariable.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkVariable.Properties.name, PatternsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBindingSemanticsEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.LinkVariablePropertiesEditionPart_BindingSemanticsLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkVariable.Properties.bindingSemantics, PatternsViewsRepository.FORM_KIND));
		bindingSemantics = new EMFComboViewer(parent);
		bindingSemantics.setContentProvider(new ArrayContentProvider());
		bindingSemantics.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData bindingSemanticsData = new GridData(GridData.FILL_HORIZONTAL);
		bindingSemantics.getCombo().setLayoutData(bindingSemanticsData);
		bindingSemantics.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkVariablePropertiesEditionPartForm.this, PatternsViewsRepository.LinkVariable.Properties.bindingSemantics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBindingSemantics()));
			}

		});
		bindingSemantics.setID(PatternsViewsRepository.LinkVariable.Properties.bindingSemantics);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkVariable.Properties.bindingSemantics, PatternsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBindingOperatorEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.LinkVariablePropertiesEditionPart_BindingOperatorLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkVariable.Properties.bindingOperator, PatternsViewsRepository.FORM_KIND));
		bindingOperator = new EMFComboViewer(parent);
		bindingOperator.setContentProvider(new ArrayContentProvider());
		bindingOperator.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData bindingOperatorData = new GridData(GridData.FILL_HORIZONTAL);
		bindingOperator.getCombo().setLayoutData(bindingOperatorData);
		bindingOperator.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkVariablePropertiesEditionPartForm.this, PatternsViewsRepository.LinkVariable.Properties.bindingOperator, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBindingOperator()));
			}

		});
		bindingOperator.setID(PatternsViewsRepository.LinkVariable.Properties.bindingOperator);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkVariable.Properties.bindingOperator, PatternsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSourceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.LinkVariablePropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkVariable.Properties.source, PatternsViewsRepository.FORM_KIND));
		source = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkVariable.Properties.source, PatternsViewsRepository.FORM_KIND));
		widgetFactory.adapt(source);
		source.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData sourceData = new GridData(GridData.FILL_HORIZONTAL);
		source.setLayoutData(sourceData);
		source.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkVariablePropertiesEditionPartForm.this, PatternsViewsRepository.LinkVariable.Properties.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSource()));
			}

		});
		source.setID(PatternsViewsRepository.LinkVariable.Properties.source);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkVariable.Properties.source, PatternsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSecondLinkConstraintReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.secondLinkConstraint = new ReferencesTable(PatternsMessages.LinkVariablePropertiesEditionPart_SecondLinkConstraintLabel, new ReferencesTableListener	() {
			public void handleAdd() { addSecondLinkConstraint(); }
			public void handleEdit(EObject element) { editSecondLinkConstraint(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSecondLinkConstraint(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSecondLinkConstraint(element); }
			public void navigateTo(EObject element) { }
		});
		this.secondLinkConstraint.setHelpText(propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkVariable.Properties.secondLinkConstraint, PatternsViewsRepository.FORM_KIND));
		this.secondLinkConstraint.createControls(parent, widgetFactory);
		this.secondLinkConstraint.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkVariablePropertiesEditionPartForm.this, PatternsViewsRepository.LinkVariable.Properties.secondLinkConstraint, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData secondLinkConstraintData = new GridData(GridData.FILL_HORIZONTAL);
		secondLinkConstraintData.horizontalSpan = 3;
		this.secondLinkConstraint.setLayoutData(secondLinkConstraintData);
		this.secondLinkConstraint.disableMove();
		secondLinkConstraint.setID(PatternsViewsRepository.LinkVariable.Properties.secondLinkConstraint);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkVariablePropertiesEditionPartForm.this, PatternsViewsRepository.LinkVariable.Properties.secondLinkConstraint,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkVariablePropertiesEditionPartForm.this, PatternsViewsRepository.LinkVariable.Properties.secondLinkConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		secondLinkConstraint.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSecondLinkConstraint(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkVariablePropertiesEditionPartForm.this, PatternsViewsRepository.LinkVariable.Properties.secondLinkConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createFirstLinkConstraintReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.firstLinkConstraint = new ReferencesTable(PatternsMessages.LinkVariablePropertiesEditionPart_FirstLinkConstraintLabel, new ReferencesTableListener	() {
			public void handleAdd() { addFirstLinkConstraint(); }
			public void handleEdit(EObject element) { editFirstLinkConstraint(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveFirstLinkConstraint(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromFirstLinkConstraint(element); }
			public void navigateTo(EObject element) { }
		});
		this.firstLinkConstraint.setHelpText(propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkVariable.Properties.firstLinkConstraint, PatternsViewsRepository.FORM_KIND));
		this.firstLinkConstraint.createControls(parent, widgetFactory);
		this.firstLinkConstraint.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkVariablePropertiesEditionPartForm.this, PatternsViewsRepository.LinkVariable.Properties.firstLinkConstraint, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData firstLinkConstraintData = new GridData(GridData.FILL_HORIZONTAL);
		firstLinkConstraintData.horizontalSpan = 3;
		this.firstLinkConstraint.setLayoutData(firstLinkConstraintData);
		this.firstLinkConstraint.disableMove();
		firstLinkConstraint.setID(PatternsViewsRepository.LinkVariable.Properties.firstLinkConstraint);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkVariablePropertiesEditionPartForm.this, PatternsViewsRepository.LinkVariable.Properties.firstLinkConstraint,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkVariablePropertiesEditionPartForm.this, PatternsViewsRepository.LinkVariable.Properties.firstLinkConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		firstLinkConstraint.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromFirstLinkConstraint(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkVariablePropertiesEditionPartForm.this, PatternsViewsRepository.LinkVariable.Properties.firstLinkConstraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	
	protected Composite createBindingStateEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.LinkVariablePropertiesEditionPart_BindingStateLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkVariable.Properties.bindingState, PatternsViewsRepository.FORM_KIND));
		bindingState = new EMFComboViewer(parent);
		bindingState.setContentProvider(new ArrayContentProvider());
		bindingState.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData bindingStateData = new GridData(GridData.FILL_HORIZONTAL);
		bindingState.getCombo().setLayoutData(bindingStateData);
		bindingState.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkVariablePropertiesEditionPartForm.this, PatternsViewsRepository.LinkVariable.Properties.bindingState, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBindingState()));
			}

		});
		bindingState.setID(PatternsViewsRepository.LinkVariable.Properties.bindingState);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkVariable.Properties.bindingState, PatternsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createPatternFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.LinkVariablePropertiesEditionPart_PatternLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkVariable.Properties.pattern, PatternsViewsRepository.FORM_KIND));
		pattern = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkVariable.Properties.pattern, PatternsViewsRepository.FORM_KIND));
		widgetFactory.adapt(pattern);
		pattern.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData patternData = new GridData(GridData.FILL_HORIZONTAL);
		pattern.setLayoutData(patternData);
		pattern.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkVariablePropertiesEditionPartForm.this, PatternsViewsRepository.LinkVariable.Properties.pattern, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPattern()));
			}

		});
		pattern.setID(PatternsViewsRepository.LinkVariable.Properties.pattern);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkVariable.Properties.pattern, PatternsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createTargetFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.LinkVariablePropertiesEditionPart_TargetLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkVariable.Properties.target, PatternsViewsRepository.FORM_KIND));
		target = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkVariable.Properties.target, PatternsViewsRepository.FORM_KIND));
		widgetFactory.adapt(target);
		target.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
		target.setLayoutData(targetData);
		target.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkVariablePropertiesEditionPartForm.this, PatternsViewsRepository.LinkVariable.Properties.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTarget()));
			}

		});
		target.setID(PatternsViewsRepository.LinkVariable.Properties.target);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkVariable.Properties.target, PatternsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createTargetEndFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, PatternsMessages.LinkVariablePropertiesEditionPart_TargetEndLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkVariable.Properties.targetEnd, PatternsViewsRepository.FORM_KIND));
		targetEnd = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.LinkVariable.Properties.targetEnd, PatternsViewsRepository.FORM_KIND));
		widgetFactory.adapt(targetEnd);
		targetEnd.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData targetEndData = new GridData(GridData.FILL_HORIZONTAL);
		targetEnd.setLayoutData(targetEndData);
		targetEnd.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkVariablePropertiesEditionPartForm.this, PatternsViewsRepository.LinkVariable.Properties.targetEnd, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTargetEnd()));
			}

		});
		targetEnd.setID(PatternsViewsRepository.LinkVariable.Properties.targetEnd);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.LinkVariable.Properties.targetEnd, PatternsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#setName(String newValue)
	 * 
	 */
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
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#getBindingSemantics()
	 * 
	 */
	public Enumerator getBindingSemantics() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) bindingSemantics.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#initBindingSemantics(EEnum eenum, Enumerator current)
	 */
	public void initBindingSemantics(EEnum eenum, Enumerator current) {
		bindingSemantics.setInput(eenum.getELiterals());
		bindingSemantics.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#setBindingSemantics(Enumerator newValue)
	 * 
	 */
	public void setBindingSemantics(Enumerator newValue) {
		bindingSemantics.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#getBindingOperator()
	 * 
	 */
	public Enumerator getBindingOperator() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) bindingOperator.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#initBindingOperator(EEnum eenum, Enumerator current)
	 */
	public void initBindingOperator(EEnum eenum, Enumerator current) {
		bindingOperator.setInput(eenum.getELiterals());
		bindingOperator.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#setBindingOperator(Enumerator newValue)
	 * 
	 */
	public void setBindingOperator(Enumerator newValue) {
		bindingOperator.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#getSource()
	 * 
	 */
	public EObject getSource() {
		if (source.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) source.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#initSource(EObjectFlatComboSettings)
	 */
	public void initSource(EObjectFlatComboSettings settings) {
		source.setInput(settings);
		if (current != null) {
			source.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#setSource(EObject newValue)
	 * 
	 */
	public void setSource(EObject newValue) {
		if (newValue != null) {
			source.setSelection(new StructuredSelection(newValue));
		} else {
			source.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#setSourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSourceButtonMode(ButtonsModeEnum newValue) {
		source.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#addFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSource(ViewerFilter filter) {
		source.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#addBusinessFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSource(ViewerFilter filter) {
		source.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#initSecondLinkConstraint(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSecondLinkConstraint(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		secondLinkConstraint.setContentProvider(contentProvider);
		secondLinkConstraint.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#updateSecondLinkConstraint()
	 * 
	 */
	public void updateSecondLinkConstraint() {
	secondLinkConstraint.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#addFilterSecondLinkConstraint(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSecondLinkConstraint(ViewerFilter filter) {
		secondLinkConstraintFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#addBusinessFilterSecondLinkConstraint(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSecondLinkConstraint(ViewerFilter filter) {
		secondLinkConstraintBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#isContainedInSecondLinkConstraintTable(EObject element)
	 * 
	 */
	public boolean isContainedInSecondLinkConstraintTable(EObject element) {
		return ((ReferencesTableSettings)secondLinkConstraint.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#initFirstLinkConstraint(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initFirstLinkConstraint(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		firstLinkConstraint.setContentProvider(contentProvider);
		firstLinkConstraint.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#updateFirstLinkConstraint()
	 * 
	 */
	public void updateFirstLinkConstraint() {
	firstLinkConstraint.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#addFilterFirstLinkConstraint(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFirstLinkConstraint(ViewerFilter filter) {
		firstLinkConstraintFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#addBusinessFilterFirstLinkConstraint(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFirstLinkConstraint(ViewerFilter filter) {
		firstLinkConstraintBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#isContainedInFirstLinkConstraintTable(EObject element)
	 * 
	 */
	public boolean isContainedInFirstLinkConstraintTable(EObject element) {
		return ((ReferencesTableSettings)firstLinkConstraint.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#getBindingState()
	 * 
	 */
	public Enumerator getBindingState() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) bindingState.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#initBindingState(EEnum eenum, Enumerator current)
	 */
	public void initBindingState(EEnum eenum, Enumerator current) {
		bindingState.setInput(eenum.getELiterals());
		bindingState.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#setBindingState(Enumerator newValue)
	 * 
	 */
	public void setBindingState(Enumerator newValue) {
		bindingState.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#getPattern()
	 * 
	 */
	public EObject getPattern() {
		if (pattern.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) pattern.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#initPattern(EObjectFlatComboSettings)
	 */
	public void initPattern(EObjectFlatComboSettings settings) {
		pattern.setInput(settings);
		if (current != null) {
			pattern.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#setPattern(EObject newValue)
	 * 
	 */
	public void setPattern(EObject newValue) {
		if (newValue != null) {
			pattern.setSelection(new StructuredSelection(newValue));
		} else {
			pattern.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#setPatternButtonMode(ButtonsModeEnum newValue)
	 */
	public void setPatternButtonMode(ButtonsModeEnum newValue) {
		pattern.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#addFilterPattern(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPattern(ViewerFilter filter) {
		pattern.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#addBusinessFilterPattern(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPattern(ViewerFilter filter) {
		pattern.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#getTarget()
	 * 
	 */
	public EObject getTarget() {
		if (target.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) target.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#initTarget(EObjectFlatComboSettings)
	 */
	public void initTarget(EObjectFlatComboSettings settings) {
		target.setInput(settings);
		if (current != null) {
			target.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#setTarget(EObject newValue)
	 * 
	 */
	public void setTarget(EObject newValue) {
		if (newValue != null) {
			target.setSelection(new StructuredSelection(newValue));
		} else {
			target.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#setTargetButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTargetButtonMode(ButtonsModeEnum newValue) {
		target.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#addFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTarget(ViewerFilter filter) {
		target.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#addBusinessFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTarget(ViewerFilter filter) {
		target.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#getTargetEnd()
	 * 
	 */
	public EObject getTargetEnd() {
		if (targetEnd.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) targetEnd.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#initTargetEnd(EObjectFlatComboSettings)
	 */
	public void initTargetEnd(EObjectFlatComboSettings settings) {
		targetEnd.setInput(settings);
		if (current != null) {
			targetEnd.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#setTargetEnd(EObject newValue)
	 * 
	 */
	public void setTargetEnd(EObject newValue) {
		if (newValue != null) {
			targetEnd.setSelection(new StructuredSelection(newValue));
		} else {
			targetEnd.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#setTargetEndButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTargetEndButtonMode(ButtonsModeEnum newValue) {
		targetEnd.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#addFilterTargetEnd(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTargetEnd(ViewerFilter filter) {
		targetEnd.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.LinkVariablePropertiesEditionPart#addBusinessFilterTargetEnd(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTargetEnd(ViewerFilter filter) {
		targetEnd.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return PatternsMessages.LinkVariable_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}