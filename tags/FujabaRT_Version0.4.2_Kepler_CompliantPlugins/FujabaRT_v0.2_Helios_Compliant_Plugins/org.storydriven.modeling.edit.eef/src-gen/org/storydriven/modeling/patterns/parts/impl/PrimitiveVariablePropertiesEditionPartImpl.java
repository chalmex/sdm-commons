/**
 * Generated with Acceleo
 */
package org.storydriven.modeling.patterns.parts.impl;

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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
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
import org.storydriven.modeling.patterns.parts.PatternsViewsRepository;
import org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart;
import org.storydriven.modeling.patterns.providers.PatternsMessages;


// End of user code

/**
 * 
 * 
 */
public class PrimitiveVariablePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PrimitiveVariablePropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer pattern;
	protected EMFComboViewer bindingState;
	protected ReferencesTable incomingLink;
	protected List<ViewerFilter> incomingLinkBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> incomingLinkFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer classifier;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PrimitiveVariablePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
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
	public void createControls(Composite view) { 
		CompositionSequence primitiveVariableStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = primitiveVariableStep.addStep(PatternsViewsRepository.PrimitiveVariable.Properties.class);
		propertiesStep.addStep(PatternsViewsRepository.PrimitiveVariable.Properties.name);
		propertiesStep.addStep(PatternsViewsRepository.PrimitiveVariable.Properties.pattern);
		propertiesStep.addStep(PatternsViewsRepository.PrimitiveVariable.Properties.bindingState);
		propertiesStep.addStep(PatternsViewsRepository.PrimitiveVariable.Properties.incomingLink);
		propertiesStep.addStep(PatternsViewsRepository.PrimitiveVariable.Properties.classifier);
		
		
		composer = new PartComposer(primitiveVariableStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == PatternsViewsRepository.PrimitiveVariable.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == PatternsViewsRepository.PrimitiveVariable.Properties.name) {
					return createNameText(parent);
				}
				if (key == PatternsViewsRepository.PrimitiveVariable.Properties.pattern) {
					return createPatternFlatComboViewer(parent);
				}
				if (key == PatternsViewsRepository.PrimitiveVariable.Properties.bindingState) {
					return createBindingStateEMFComboViewer(parent);
				}
				if (key == PatternsViewsRepository.PrimitiveVariable.Properties.incomingLink) {
					return createIncomingLinkAdvancedReferencesTable(parent);
				}
				if (key == PatternsViewsRepository.PrimitiveVariable.Properties.classifier) {
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
		propertiesGroup.setText(PatternsMessages.PrimitiveVariablePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.PrimitiveVariablePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.PrimitiveVariable.Properties.name, PatternsViewsRepository.SWT_KIND));
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
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.PrimitiveVariable.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.PrimitiveVariable.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, PatternsViewsRepository.PrimitiveVariable.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.PrimitiveVariable.Properties.name, PatternsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createPatternFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.PrimitiveVariablePropertiesEditionPart_PatternLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.PrimitiveVariable.Properties.pattern, PatternsViewsRepository.SWT_KIND));
		pattern = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.PrimitiveVariable.Properties.pattern, PatternsViewsRepository.SWT_KIND));
		pattern.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		pattern.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.PrimitiveVariable.Properties.pattern, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getPattern()));
			}

		});
		GridData patternData = new GridData(GridData.FILL_HORIZONTAL);
		pattern.setLayoutData(patternData);
		pattern.setID(PatternsViewsRepository.PrimitiveVariable.Properties.pattern);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.PrimitiveVariable.Properties.pattern, PatternsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBindingStateEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.PrimitiveVariablePropertiesEditionPart_BindingStateLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.PrimitiveVariable.Properties.bindingState, PatternsViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.PrimitiveVariable.Properties.bindingState, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBindingState()));
			}

		});
		bindingState.setID(PatternsViewsRepository.PrimitiveVariable.Properties.bindingState);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.PrimitiveVariable.Properties.bindingState, PatternsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createIncomingLinkAdvancedReferencesTable(Composite parent) {
		this.incomingLink = new ReferencesTable(PatternsMessages.PrimitiveVariablePropertiesEditionPart_IncomingLinkLabel, new ReferencesTableListener() {
			public void handleAdd() { addIncomingLink(); }
			public void handleEdit(EObject element) { editIncomingLink(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncomingLink(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIncomingLink(element); }
			public void navigateTo(EObject element) { }
		});
		this.incomingLink.setHelpText(propertiesEditionComponent.getHelpContent(PatternsViewsRepository.PrimitiveVariable.Properties.incomingLink, PatternsViewsRepository.SWT_KIND));
		this.incomingLink.createControls(parent);
		this.incomingLink.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.PrimitiveVariable.Properties.incomingLink, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData incomingLinkData = new GridData(GridData.FILL_HORIZONTAL);
		incomingLinkData.horizontalSpan = 3;
		this.incomingLink.setLayoutData(incomingLinkData);
		this.incomingLink.disableMove();
		incomingLink.setID(PatternsViewsRepository.PrimitiveVariable.Properties.incomingLink);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.PrimitiveVariable.Properties.incomingLink,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.PrimitiveVariable.Properties.incomingLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		incomingLink.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIncomingLink(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.PrimitiveVariable.Properties.incomingLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createClassifierFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternsMessages.PrimitiveVariablePropertiesEditionPart_ClassifierLabel, propertiesEditionComponent.isRequired(PatternsViewsRepository.PrimitiveVariable.Properties.classifier, PatternsViewsRepository.SWT_KIND));
		classifier = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternsViewsRepository.PrimitiveVariable.Properties.classifier, PatternsViewsRepository.SWT_KIND));
		classifier.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		classifier.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveVariablePropertiesEditionPartImpl.this, PatternsViewsRepository.PrimitiveVariable.Properties.classifier, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getClassifier()));
			}

		});
		GridData classifierData = new GridData(GridData.FILL_HORIZONTAL);
		classifier.setLayoutData(classifierData);
		classifier.setID(PatternsViewsRepository.PrimitiveVariable.Properties.classifier);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternsViewsRepository.PrimitiveVariable.Properties.classifier, PatternsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#setName(String newValue)
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
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#getPattern()
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
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#initPattern(EObjectFlatComboSettings)
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
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#setPattern(EObject newValue)
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
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#setPatternButtonMode(ButtonsModeEnum newValue)
	 */
	public void setPatternButtonMode(ButtonsModeEnum newValue) {
		pattern.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#addFilterPattern(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPattern(ViewerFilter filter) {
		pattern.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#addBusinessFilterPattern(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPattern(ViewerFilter filter) {
		pattern.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#getBindingState()
	 * 
	 */
	public Enumerator getBindingState() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) bindingState.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#initBindingState(EEnum eenum, Enumerator current)
	 */
	public void initBindingState(EEnum eenum, Enumerator current) {
		bindingState.setInput(eenum.getELiterals());
		bindingState.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#setBindingState(Enumerator newValue)
	 * 
	 */
	public void setBindingState(Enumerator newValue) {
		bindingState.modelUpdating(new StructuredSelection(newValue));
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#initIncomingLink(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIncomingLink(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		incomingLink.setContentProvider(contentProvider);
		incomingLink.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#updateIncomingLink()
	 * 
	 */
	public void updateIncomingLink() {
	incomingLink.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#addFilterIncomingLink(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIncomingLink(ViewerFilter filter) {
		incomingLinkFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#addBusinessFilterIncomingLink(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIncomingLink(ViewerFilter filter) {
		incomingLinkBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#isContainedInIncomingLinkTable(EObject element)
	 * 
	 */
	public boolean isContainedInIncomingLinkTable(EObject element) {
		return ((ReferencesTableSettings)incomingLink.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#getClassifier()
	 * 
	 */
	public EObject getClassifier() {
		if (classifier.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) classifier.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#initClassifier(EObjectFlatComboSettings)
	 */
	public void initClassifier(EObjectFlatComboSettings settings) {
		classifier.setInput(settings);
		if (current != null) {
			classifier.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#setClassifier(EObject newValue)
	 * 
	 */
	public void setClassifier(EObject newValue) {
		if (newValue != null) {
			classifier.setSelection(new StructuredSelection(newValue));
		} else {
			classifier.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#setClassifierButtonMode(ButtonsModeEnum newValue)
	 */
	public void setClassifierButtonMode(ButtonsModeEnum newValue) {
		classifier.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#addFilterClassifier(ViewerFilter filter)
	 * 
	 */
	public void addFilterToClassifier(ViewerFilter filter) {
		classifier.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.storydriven.modeling.patterns.parts.PrimitiveVariablePropertiesEditionPart#addBusinessFilterClassifier(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToClassifier(ViewerFilter filter) {
		classifier.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return PatternsMessages.PrimitiveVariable_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
