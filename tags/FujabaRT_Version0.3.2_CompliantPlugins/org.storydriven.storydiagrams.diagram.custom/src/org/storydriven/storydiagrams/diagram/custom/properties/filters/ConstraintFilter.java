package org.storydriven.storydiagrams.diagram.custom.properties.filters;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractFilter;
import org.storydriven.storydiagrams.patterns.Constraint;

public class ConstraintFilter extends AbstractFilter {
	@Override
	protected boolean select(EObject element) {
		return element instanceof Constraint;
	}
}