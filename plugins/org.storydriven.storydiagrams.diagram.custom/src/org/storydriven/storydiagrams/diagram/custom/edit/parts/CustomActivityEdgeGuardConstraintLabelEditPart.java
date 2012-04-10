package org.storydriven.storydiagrams.diagram.custom.edit.parts;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.EdgeGuard;
import org.storydriven.storydiagrams.diagram.custom.util.SdmUtility;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityEdgeGuardConstraintLabelEditPart;
public class CustomActivityEdgeGuardConstraintLabelEditPart extends ActivityEdgeGuardConstraintLabelEditPart
{

	public CustomActivityEdgeGuardConstraintLabelEditPart(View view)
	{
		super(view);
	}

	/*
	 * should be similar to addNotationalListeners of:
	 * 
	 * CustomActivityEdgeGuardConstraintLabelEditPart
	 * CustomActivityFinalNodeReturnValueLabelEditPart
	 * CustomAttributeAssignmentEditPart CustomCallActionExpressionEditPart
	 * CustomCallActionExpression2EditPart CustomCallActionExpression3EditPart
	 * CustomStoryPatternExpressionLinkFeatureNameLabelEditPart
	 * CustomStoryPatternObjectClassifierLabelEditPart
	 */
	
	protected void handleNotificationEvent(Notification event)
	{
		updateFigure();
		super.handleNotificationEvent(event);
	}

	protected static String format(String text)
	{
		return "[ " + text + " ]";
	}

	protected void updateFigure()
	{
		((WrappingLabel) getFigure()).setTextWrap(true);
		((WrappingLabel) getFigure()).setTextJustification(PositionConstants.CENTER);

		ActivityEdge edge = (ActivityEdge) ((View) getModel()).getElement();

		String text = "";
		if (edge.getGuardExpression() != null)
		{
			text = format(((TextualExpression) edge.getGuardExpression()).getExpressionText());
		}
		else if (edge.getGuard() != EdgeGuard.NONE)
		{
			text = format(SdmUtility.Guard2String(edge.getGuard()));
		}

		setLabelText(text);
	}

	protected void refreshVisuals()
	{
		super.refreshVisuals();
		updateFigure();
	}
}