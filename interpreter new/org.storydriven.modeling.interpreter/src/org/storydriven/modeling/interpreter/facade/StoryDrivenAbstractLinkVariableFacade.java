package org.storydriven.modeling.interpreter.facade;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.AbstractVariable;

import de.mdelab.sdm.interpreter.core.facade.IStoryPatternLinkFacade;

public class StoryDrivenAbstractLinkVariableFacade implements
		IStoryPatternLinkFacade<AbstractVariable, AbstractLinkVariable, EStructuralFeature>
{

	@Override
	public String getName(AbstractLinkVariable spl)
	{
		return spl.getName();
	}

}
