package org.storydriven.modeling.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.JunctionNode;
import org.storydriven.modeling.activities.StartNode;
import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.diagram.edit.parts.ActivityEdgeEditPart;
import org.storydriven.modeling.diagram.edit.parts.ActivityEditPart;
import org.storydriven.modeling.diagram.edit.parts.JunctionNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.MatchingPatternEditPart;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNodeName2EditPart;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNodeNameEditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeName2EditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeNameEditPart;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariable2EditPart;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableEditPart;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableName2EditPart;
import org.storydriven.modeling.diagram.edit.parts.ObjectVariableNameEditPart;
import org.storydriven.modeling.diagram.edit.parts.StartNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StartNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNodeName2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StatementNodeNameEditPart;
import org.storydriven.modeling.diagram.edit.parts.StopNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StopNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.ForkNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StoryPatternEditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNode2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeName2EditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeNameEditPart;
import org.storydriven.modeling.diagram.part.SDMDiagramEditorPlugin;
import org.storydriven.modeling.diagram.part.SDMVisualIDRegistry;
import org.storydriven.modeling.diagram.providers.SDMElementTypes;
import org.storydriven.modeling.diagram.providers.SDMParserProvider;
import org.storydriven.modeling.patterns.MatchingPattern;
import org.storydriven.modeling.patterns.StoryPattern;

/**
 * @generated
 */
public class SDMNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		SDMDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		SDMDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof SDMNavigatorItem
				&& !isOwnView(((SDMNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof SDMNavigatorGroup) {
			SDMNavigatorGroup group = (SDMNavigatorGroup) element;
			return SDMDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof SDMNavigatorItem) {
			SDMNavigatorItem navigatorItem = (SDMNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (SDMVisualIDRegistry.getVisualID(view)) {
		case ObjectVariable2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ns.storydriven.org/sdm/patterns/0.1.0?ObjectVariable", SDMElementTypes.ObjectVariable_3009); //$NON-NLS-1$
		case ModifyingStoryNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ns.storydriven.org/sdm/activities/0.1.0?ModifyingStoryNode", SDMElementTypes.ModifyingStoryNode_3011); //$NON-NLS-1$
		case ObjectVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ns.storydriven.org/sdm/patterns/0.1.0?ObjectVariable", SDMElementTypes.ObjectVariable_3007); //$NON-NLS-1$
		case StartNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ns.storydriven.org/sdm/activities/0.1.0?StartNode", SDMElementTypes.StartNode_3002); //$NON-NLS-1$
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ns.storydriven.org/sdm/activities/0.1.0?ModifyingStoryNode", SDMElementTypes.ModifyingStoryNode_2007); //$NON-NLS-1$
		case StoryPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ns.storydriven.org/sdm/patterns/0.1.0?StoryPattern", SDMElementTypes.StoryPattern_3008); //$NON-NLS-1$
		case StructuredNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ns.storydriven.org/sdm/activities/0.1.0?StructuredNode", SDMElementTypes.StructuredNode_2005); //$NON-NLS-1$
		case StructuredNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ns.storydriven.org/sdm/activities/0.1.0?StructuredNode", SDMElementTypes.StructuredNode_3005); //$NON-NLS-1$
		case ActivityEdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ns.storydriven.org/sdm/activities/0.1.0?ActivityEdge", SDMElementTypes.ActivityEdge_4001); //$NON-NLS-1$
		case StopNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ns.storydriven.org/sdm/activities/0.1.0?StopNode", SDMElementTypes.StopNode_3004); //$NON-NLS-1$
		case StatementNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ns.storydriven.org/sdm/activities/0.1.0?StatementNode", SDMElementTypes.StatementNode_2004); //$NON-NLS-1$
		case JunctionNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ns.storydriven.org/sdm/activities/0.1.0?JunctionNode", SDMElementTypes.JunctionNode_2003); //$NON-NLS-1$
		case ActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://ns.storydriven.org/sdm/activities/0.1.0?Activity", SDMElementTypes.Activity_1000); //$NON-NLS-1$
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ns.storydriven.org/sdm/activities/0.1.0?MatchingStoryNode", SDMElementTypes.MatchingStoryNode_2006); //$NON-NLS-1$
		case StopNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ns.storydriven.org/sdm/activities/0.1.0?StopNode", SDMElementTypes.StopNode_2002); //$NON-NLS-1$
		case JunctionNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ns.storydriven.org/sdm/activities/0.1.0?JunctionNode", SDMElementTypes.JunctionNode_3001); //$NON-NLS-1$
		case StatementNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ns.storydriven.org/sdm/activities/0.1.0?StatementNode", SDMElementTypes.StatementNode_3003); //$NON-NLS-1$
		case MatchingPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ns.storydriven.org/sdm/patterns/0.1.0?MatchingPattern", SDMElementTypes.MatchingPattern_3006); //$NON-NLS-1$
		case StartNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ns.storydriven.org/sdm/activities/0.1.0?StartNode", SDMElementTypes.StartNode_2001); //$NON-NLS-1$
		case MatchingStoryNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ns.storydriven.org/sdm/activities/0.1.0?MatchingStoryNode", SDMElementTypes.MatchingStoryNode_3010); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = SDMDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& SDMElementTypes.isKnownElementType(elementType)) {
			image = SDMElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof SDMNavigatorGroup) {
			SDMNavigatorGroup group = (SDMNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof SDMNavigatorItem) {
			SDMNavigatorItem navigatorItem = (SDMNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (SDMVisualIDRegistry.getVisualID(view)) {
		case ObjectVariable2EditPart.VISUAL_ID:
			return getObjectVariable_3009Text(view);
		case ModifyingStoryNode2EditPart.VISUAL_ID:
			return getModifyingStoryNode_3011Text(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3007Text(view);
		case StartNode2EditPart.VISUAL_ID:
			return getStartNode_3002Text(view);
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getModifyingStoryNode_2007Text(view);
		case StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3008Text(view);
		case StructuredNodeEditPart.VISUAL_ID:
			return getStructuredNode_2005Text(view);
		case StructuredNode2EditPart.VISUAL_ID:
			return getStructuredNode_3005Text(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001Text(view);
		case StopNode2EditPart.VISUAL_ID:
			return getStopNode_3004Text(view);
		case StatementNodeEditPart.VISUAL_ID:
			return getStatementNode_2004Text(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_2003Text(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_1000Text(view);
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return getMatchingStoryNode_2006Text(view);
		case StopNodeEditPart.VISUAL_ID:
			return getStopNode_2002Text(view);
		case JunctionNode2EditPart.VISUAL_ID:
			return getJunctionNode_3001Text(view);
		case StatementNode2EditPart.VISUAL_ID:
			return getStatementNode_3003Text(view);
		case MatchingPatternEditPart.VISUAL_ID:
			return getMatchingPattern_3006Text(view);
		case StartNodeEditPart.VISUAL_ID:
			return getStartNode_2001Text(view);
		case MatchingStoryNode2EditPart.VISUAL_ID:
			return getMatchingStoryNode_3010Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getObjectVariable_3007Text(View view) {
		IParser parser = SDMParserProvider.getParser(
				SDMElementTypes.ObjectVariable_3007,
				view.getElement() != null ? view.getElement() : view,
				SDMVisualIDRegistry
						.getType(ObjectVariableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStoryPattern_3008Text(View view) {
		StoryPattern domainModelElement = (StoryPattern) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredNode_3005Text(View view) {
		IParser parser = SDMParserProvider.getParser(
				SDMElementTypes.StructuredNode_3005,
				view.getElement() != null ? view.getElement() : view,
				SDMVisualIDRegistry
						.getType(StructuredNodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJunctionNode_3001Text(View view) {
		JunctionNode domainModelElement = (JunctionNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStartNode_3002Text(View view) {
		StartNode domainModelElement = (StartNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMatchingStoryNode_3010Text(View view) {
		IParser parser = SDMParserProvider.getParser(
				SDMElementTypes.MatchingStoryNode_3010,
				view.getElement() != null ? view.getElement() : view,
				SDMVisualIDRegistry
						.getType(MatchingStoryNodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStatementNode_2004Text(View view) {
		IParser parser = SDMParserProvider.getParser(
				SDMElementTypes.StatementNode_2004,
				view.getElement() != null ? view.getElement() : view,
				SDMVisualIDRegistry
						.getType(StatementNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStopNode_2002Text(View view) {
		StopNode domainModelElement = (StopNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getObjectVariable_3009Text(View view) {
		IParser parser = SDMParserProvider.getParser(
				SDMElementTypes.ObjectVariable_3009,
				view.getElement() != null ? view.getElement() : view,
				SDMVisualIDRegistry
						.getType(ObjectVariableName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMatchingStoryNode_2006Text(View view) {
		IParser parser = SDMParserProvider.getParser(
				SDMElementTypes.MatchingStoryNode_2006,
				view.getElement() != null ? view.getElement() : view,
				SDMVisualIDRegistry
						.getType(MatchingStoryNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStopNode_3004Text(View view) {
		StopNode domainModelElement = (StopNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStatementNode_3003Text(View view) {
		IParser parser = SDMParserProvider.getParser(
				SDMElementTypes.StatementNode_3003,
				view.getElement() != null ? view.getElement() : view,
				SDMVisualIDRegistry
						.getType(StatementNodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivity_1000Text(View view) {
		Activity domainModelElement = (Activity) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivityEdge_4001Text(View view) {
		ActivityEdge domainModelElement = (ActivityEdge) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getGuardType());
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredNode_2005Text(View view) {
		IParser parser = SDMParserProvider.getParser(
				SDMElementTypes.StructuredNode_2005,
				view.getElement() != null ? view.getElement() : view,
				SDMVisualIDRegistry
						.getType(StructuredNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMatchingPattern_3006Text(View view) {
		MatchingPattern domainModelElement = (MatchingPattern) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getModifyingStoryNode_2007Text(View view) {
		IParser parser = SDMParserProvider.getParser(
				SDMElementTypes.ModifyingStoryNode_2007,
				view.getElement() != null ? view.getElement() : view,
				SDMVisualIDRegistry
						.getType(ModifyingStoryNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJunctionNode_2003Text(View view) {
		JunctionNode domainModelElement = (JunctionNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStartNode_2001Text(View view) {
		StartNode domainModelElement = (StartNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getModifyingStoryNode_3011Text(View view) {
		IParser parser = SDMParserProvider.getParser(
				SDMElementTypes.ModifyingStoryNode_3011,
				view.getElement() != null ? view.getElement() : view,
				SDMVisualIDRegistry
						.getType(ModifyingStoryNodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SDMDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ActivityEditPart.MODEL_ID.equals(SDMVisualIDRegistry
				.getModelID(view));
	}

}