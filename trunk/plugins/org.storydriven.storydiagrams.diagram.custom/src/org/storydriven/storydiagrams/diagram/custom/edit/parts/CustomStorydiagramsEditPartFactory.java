package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.diagram.edit.parts.StorydiagramsEditPartFactory;
import org.storydriven.storydiagrams.diagram.part.StorydiagramsVisualIDRegistry;

public class CustomStorydiagramsEditPartFactory extends StorydiagramsEditPartFactory {
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (StorydiagramsVisualIDRegistry.getVisualID(view)) {
			case CustomActivityCallNodeCalleeLabelEditPart.VISUAL_ID:
				return new CustomActivityCallNodeCalleeLabelEditPart(view);

			case CustomActivityEdgeGuardLabelEditPart.VISUAL_ID:
				return new CustomActivityEdgeGuardLabelEditPart(view);

			case CustomAttributeAssignmentEditPart.VISUAL_ID:
				return new CustomAttributeAssignmentEditPart(view);

			case CustomConstraint2EditPart.VISUAL_ID:
				return new CustomConstraint2EditPart(view);

			case CustomConstraintEditPart.VISUAL_ID:
				return new CustomConstraintEditPart(view);

			case CustomContainmentRelationEditPart.VISUAL_ID:
				return new CustomContainmentRelationEditPart(view);

			case CustomContainmentRelationOperatorLabelEditPart.VISUAL_ID:
				return new CustomContainmentRelationOperatorLabelEditPart(view);

			case CustomJunctionNodeEditPart.VISUAL_ID:
				return new CustomJunctionNodeEditPart(view);

			case CustomLinkVariableEditPart.VISUAL_ID:
				return new CustomLinkVariableEditPart(view);

			case CustomLinkVariableOperatorLabelEditPart.VISUAL_ID:
				return new CustomLinkVariableOperatorLabelEditPart(view);

			case CustomLinkVariableSourceEndLabelEditPart.VISUAL_ID:
				return new CustomLinkVariableSourceEndLabelEditPart(view);

			case CustomLinkVariableTargetEndLabelEditPart.VISUAL_ID:
				return new CustomLinkVariableTargetEndLabelEditPart(view);

			case CustomMatchingPatternEditPart.VISUAL_ID:
				return new CustomMatchingPatternEditPart(view);

			case CustomMatchingStoryNodeEditPart.VISUAL_ID:
				return new CustomMatchingStoryNodeEditPart(view);

			case CustomModifyingStoryNodeEditPart.VISUAL_ID:
				return new CustomModifyingStoryNodeEditPart(view);

			case CustomCollectionVariableEditPart.VISUAL_ID:
				return new CustomCollectionVariableEditPart(view);

			case CustomCollectionVariableNameLabelEditPart.VISUAL_ID:
				return new CustomCollectionVariableNameLabelEditPart(view);

			case CustomObjectVariableOperatorEditPart.VISUAL_ID:
				return new CustomObjectVariableOperatorEditPart(view);

			case CustomObjectVariableTypeLabelEditPart.VISUAL_ID:
				return new CustomObjectVariableTypeLabelEditPart(view);

			case CustomObjectVariableEditPart.VISUAL_ID:
				return new CustomObjectVariableEditPart(view);

			case CustomObjectVariableNameEditPart.VISUAL_ID:
				return new CustomObjectVariableNameEditPart(view);

			case CustomObjectVariableAttributeAssignmentsCompartmentEditPart.VISUAL_ID:
				return new CustomObjectVariableAttributeAssignmentsCompartmentEditPart(view);

			case CustomStartNodeEditPart.VISUAL_ID:
				return new CustomStartNodeEditPart(view);

			case CustomStartNodeSignatureLabelEditPart.VISUAL_ID:
				return new CustomStartNodeSignatureLabelEditPart(view);

			case CustomStatementNodeExpressionLabelEditPart.VISUAL_ID:
				return new CustomStatementNodeExpressionLabelEditPart(view);

			case CustomStopNodeEditPart.VISUAL_ID:
				return new CustomStopNodeEditPart(view);

			case CustomStopNodeSignatureLabelEditPart.VISUAL_ID:
				return new CustomStopNodeSignatureLabelEditPart(view);

			case CustomStoryPatternContentCompartmentEditPart.VISUAL_ID:
				return new CustomStoryPatternContentCompartmentEditPart(view);

			case CustomStoryPatternEditPart.VISUAL_ID:
				return new CustomStoryPatternEditPart(view);

			default:
				break;
			}
		}

		return super.createEditPart(context, model);
	}
}
