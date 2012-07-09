package org.storydriven.storydiagrams.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.storydriven.storydiagrams.diagram.edit.commands.AttributeAssignmentCreateCommand;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class CollectionVariableCollectionVariableAttributeAssignmentsCompartmentItemSemanticEditPolicy extends
		StorydiagramsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CollectionVariableCollectionVariableAttributeAssignmentsCompartmentItemSemanticEditPolicy() {
		super(StorydiagramsElementTypes.CollectionVariable_3023);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (StorydiagramsElementTypes.AttributeAssignment_3021 == req.getElementType()) {
			return getGEFWrapper(new AttributeAssignmentCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}