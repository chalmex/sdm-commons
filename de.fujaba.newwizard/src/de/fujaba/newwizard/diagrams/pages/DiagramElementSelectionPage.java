package de.fujaba.newwizard.diagrams.pages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.edit.provider.IWrapperItemProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.newwizard.FujabaNewwizardPlugin;
import de.fujaba.newwizard.Messages;
import de.fujaba.newwizard.diagrams.DiagramElementValidator;

public class DiagramElementSelectionPage extends WizardPage {

	/**
	 * The DiagramElementValidator that can check, if the current selection is a
	 * valid Diagram Element.
	 */
	private DiagramElementValidator diagramElementValidator;

	private ViewerFilter viewerFilter = new ViewerFilter() {

		@Override
		public boolean select(Viewer viewer, Object parentElement, Object object) {
			if (object instanceof ModelElementCategory) {

				return modelElementCategoryKey
						.equals(((ModelElementCategory) object).getKey());
			}
			return true;
		}

	};

	private String modelElementCategoryKey;

	private DiagramModelSelectionPage domainModelSelectionPage;

	/**
	 * Constructs this DiagramModelSelectionPage.
	 * 
	 * @param pageId
	 *            The ID for this Page.
	 * @param diagramElementValidator
	 *            The Validator that can check, if the current selection is a
	 *            valid Diagram Element.
	 * @param domainModelSelectionPage 
	 * @param canSelectMultipleElements
	 */
	public DiagramElementSelectionPage(String pageId,
			DiagramElementValidator diagramElementValidator,
			String modelElementCategoryKey, DiagramModelSelectionPage domainModelSelectionPage) {
		super(pageId);
		this.diagramElementValidator = diagramElementValidator;
		this.modelElementCategoryKey = modelElementCategoryKey;
		this.domainModelSelectionPage = domainModelSelectionPage;
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			setResource(domainModelSelectionPage.getResource());
			validatePage();
		}
	}

	/**
	 * Validates the current state of this Wizard Page and all its extensions.
	 * It calls setPageComplete() and setErrorMessage() to give feedback.
	 */
	public void validatePage() {
		String error = null;
		EObject selectedDiagramElement = getSelectedElement();

		if (selectedDiagramElement == null) {
			error = Messages.NewDiagramFileWizard_RootSelectionPageNoSelectionMessage;

		} else if (!diagramElementValidator
				.isValidDiagramElement(selectedDiagramElement)) {
			error = Messages.NewDiagramFileWizard_RootSelectionPageInvalidSelectionMessage;
		}

		setPageComplete(error == null);
		setErrorMessage(error);
	}

	/**
	 * The top level control for this Page Extension.
	 */
	private Composite plate;


	private TreeViewer modelViewer;


	public EObject getSelectedElement() {
		if (modelViewer != null) {
			IStructuredSelection selection = (IStructuredSelection) modelViewer
					.getSelection();
			return (EObject) unwrapElement(selection.getFirstElement());
		}
		return getModelElementCategory();
	}

	private EObject getModelElementCategory() {
		EObject rootNode = domainModelSelectionPage.getResource().getContents().get(0);
		for (EObject content: rootNode.eContents()) {
			ModelElementCategory category = (ModelElementCategory) content;
			if (modelElementCategoryKey.equals(category.getKey())) {
				return category;
			}
		}
		return null;
	}

	protected Object unwrapElement(Object element) {

		if (element instanceof IWrapperItemProvider) {
			return ((IWrapperItemProvider) element).getValue();
		}

		if (element instanceof FeatureMap.Entry) {
			return ((FeatureMap.Entry) element).getValue();
		}

		return element;
	}

	/**
	 * Create the controls for this Page Extension.
	 */
	@Override
	public void createControl(Composite parent) {

		// create the top level control
		plate = new Composite(parent, SWT.NONE);
		plate.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout();
		layout.marginWidth = 0;
		plate.setLayout(layout);

		// create the label
		Label label = new Label(plate, SWT.NONE);
		label.setText(getSelectionTitle());
		label.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

		// create the tree viewer
		int style = SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER;

		modelViewer = new TreeViewer(plate, style);
		modelViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(SelectionChangedEvent event) {
						validatePage();
					}
				});

		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.heightHint = 180;
		layoutData.widthHint = 200;
		modelViewer.getTree().setLayoutData(layoutData);

		modelViewer.setContentProvider(new AdapterFactoryContentProvider(
				FujabaNewwizardPlugin.getDefault()
						.getItemProvidersAdapterFactory()));
		modelViewer.setLabelProvider(new AdapterFactoryLabelProvider(
				FujabaNewwizardPlugin.getDefault()
						.getItemProvidersAdapterFactory()));
		modelViewer.addFilter(viewerFilter);

		setControl(plate);

	}

	/**
	 * Enables or disables this Page Extension.
	 * 
	 * @param value
	 *            The enable status to set.
	 */
	public void setEnabled(boolean value) {
		modelViewer.getTree().setEnabled(!value);
	}

	public void setResource(Resource resource) {
		if (resource != null && modelViewer.getInput() != resource) {
			modelViewer.setInput(resource);
			if (!resource.getContents().isEmpty()) {
				EObject firstElement = resource.getContents().get(0);
				modelViewer.setSelection(new StructuredSelection(firstElement));
			}
			modelViewer.expandToLevel(3);
		}
	}

	/**
	 * Override to provide custom model element description.
	 * 
	 * @generated
	 */
	protected String getSelectionTitle() {
		return Messages.ModelElementSelectionPageMessage;
	}

}