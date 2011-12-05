package org.storydriven.modeling.interpreter.eclipse;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.interpreter.StoryDrivenInterpreter;
import org.storydriven.modeling.interpreter.facade.StoryDrivenMetamodelFacadeFactory;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.StoryPattern;

import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.eclipse.EclipseExpressionInterpreterManager;
import de.mdelab.sdm.interpreter.core.notifications.NotificationEmitter;

public class StoryDrivenEclipseInterpreter extends StoryDrivenInterpreter
{
	public StoryDrivenEclipseInterpreter(

			ClassLoader classLoader,
			NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> notificationEmitter)
			throws SDMException
	{
		super(
				new EclipseExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>(
						StoryDrivenMetamodelFacadeFactory.INSTANCE, classLoader, notificationEmitter), notificationEmitter);
	}

	public StoryDrivenEclipseInterpreter(ClassLoader classLoader) throws SDMException
	{
		this(
				classLoader,
				new NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>());
	}
}
