package org.storydriven.modeling.interpreter.facade;

import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ActivityNode;

import de.mdelab.sdm.interpreter.core.facade.IActivityEdgeFacade;

public class StoryDrivenActivityEdgeFacade implements IActivityEdgeFacade<ActivityNode, ActivityEdge>
{

	@Override
	public ActivityNode getSource(ActivityEdge activityEdge)
	{
		assert activityEdge != null;

		return activityEdge.getSource();
	}

	@Override
	public ActivityNode getTarget(ActivityEdge activityEdge)
	{
		assert activityEdge != null;

		return activityEdge.getTarget();
	}

}