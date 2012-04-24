package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityCallNode;
import org.storydriven.storydiagrams.diagram.custom.DiagramImages;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractSection;
import org.storydriven.storydiagrams.diagram.custom.providers.ActivitiesLabelProvider;
import org.storydriven.storydiagrams.diagram.custom.providers.CalledActivityBindingsContentProvider;

public class ActivityCallNodeCallsSection extends AbstractSection {
	private TableViewer activitiesViewer;
	private Button addButton;
	private Button removeButton;
	private Button calleeButton;
	private TableViewer bindingsViewer;
	private Group activitiesGroup;
	private Button upButton;
	private Button downButton;

	@Override
	public void refresh() {
		activitiesViewer.setInput(getElement().getCalledActivities());
	}

	@Override
	protected ActivityCallNode getElement() {
		return (ActivityCallNode) super.getElement();
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	protected void createWidgets(Composite parent, TabbedPropertySheetWidgetFactory factory) {
		// activities
		activitiesGroup = factory.createGroup(parent, "Activities");
		GridDataFactory.fillDefaults().grab(true, true).applyTo(activitiesGroup);
		GridLayoutFactory.fillDefaults().numColumns(2).margins(6, 6).applyTo(activitiesGroup);

		Composite activitiesControlComposite = factory.createFlatFormComposite(activitiesGroup);
		GridDataFactory.fillDefaults().align(SWT.TRAIL, SWT.FILL).indent(0, -6).applyTo(activitiesControlComposite);
		GridLayoutFactory.fillDefaults().numColumns(3).margins(0, 0).spacing(0, 0).applyTo(activitiesControlComposite);

		addButton = factory.createButton(activitiesControlComposite, EMPTY, SWT.PUSH);
		addButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_ADD));
		addButton.setToolTipText("Add");
		removeButton = factory.createButton(activitiesControlComposite, EMPTY, SWT.PUSH);
		removeButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_REMOVE));
		removeButton.setToolTipText("Remove");
		calleeButton = factory.createButton(activitiesControlComposite, EMPTY, SWT.PUSH);
		calleeButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_SHORTCUT));
		calleeButton.setToolTipText("Set as Callee");

		factory.createFlatFormComposite(activitiesGroup);

		Table activitiesTable = factory.createTable(activitiesGroup, SWT.BORDER | SWT.FULL_SELECTION);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(activitiesTable);
		activitiesTable.setLinesVisible(true);

		activitiesViewer = new TableViewer(activitiesTable);
		activitiesViewer.setContentProvider(new ArrayContentProvider());
		activitiesViewer.setLabelProvider(new ActivitiesLabelProvider());

		Composite activitiesControlUpDownComposite = factory.createFlatFormComposite(activitiesGroup);
		GridDataFactory.fillDefaults().grab(false, true).applyTo(activitiesControlUpDownComposite);
		GridLayoutFactory.fillDefaults().margins(0, 0).spacing(0, 0).applyTo(activitiesControlUpDownComposite);

		upButton = factory.createButton(activitiesControlUpDownComposite, EMPTY, SWT.PUSH);
		upButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_UP));
		upButton.setToolTipText("Up");
		downButton = factory.createButton(activitiesControlUpDownComposite, EMPTY, SWT.PUSH);
		downButton.setImage(DiagramImages.getImage(DiagramImages.CONTROL_DOWN));
		downButton.setToolTipText("Down");

		// bindings
		Group bindingGroup = factory.createGroup(activitiesGroup, "Binding");
		GridDataFactory.fillDefaults().span(2, 1).grab(true, true).applyTo(bindingGroup);
		GridLayoutFactory.fillDefaults().margins(6, 6).applyTo(bindingGroup);

		Composite bindingControlComposite = factory.createFlatFormComposite(bindingGroup);
		GridLayoutFactory.fillDefaults().numColumns(3).applyTo(bindingControlComposite);

		Table bindingViewerTable = factory.createTable(bindingGroup, SWT.BORDER | SWT.FULL_SELECTION);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(bindingViewerTable);
		bindingViewerTable.setLinesVisible(true);

		bindingsViewer = new TableViewer(bindingViewerTable);
		bindingsViewer.setContentProvider(new CalledActivityBindingsContentProvider());
		bindingsViewer.setLabelProvider(new LabelProvider());
	}

	@Override
	protected void hookWidgetListeners() {
		activitiesViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) activitiesViewer.getSelection();
				if (selection.size() == 1) {
					Object element = selection.getFirstElement();
					if (element instanceof Activity) {
						bindingsViewer.setInput(element);
					}
				}
			}
		});
	}

	@Override
	protected void layoutWidgets(Composite parent) {
		FormData data = new FormData();
		data.left = new FormAttachment(0);
		data.right = new FormAttachment(100);
		data.top = new FormAttachment(0);
		data.bottom = new FormAttachment(100);
		activitiesGroup.setLayoutData(data);
	}
}
