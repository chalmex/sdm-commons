package org.storydriven.storydiagrams.diagram.custom.util;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.TypedElement;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.StoryNode;
import org.storydriven.storydiagrams.patterns.AbstractVariable;
import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.StoryPattern;

public final class BoundUtil {
	private BoundUtil() {
		// hide constructor
	}

	public static Map<String, EClassifier> getBoundObjects(EObject element) {
		Map<String, EClassifier> map = new LinkedHashMap<String, EClassifier>();
		if (element instanceof ActivityNode) {
			collect(map, (ActivityNode) element);
		}
		if (element instanceof ActivityEdge) {
			collect(map, (ActivityEdge) element);
		}
		return map;
	}

	private static void collect(Map<String, EClassifier> map, ActivityNode node) {
		for (ActivityEdge incoming : node.getIncomings()) {
			collect(map, incoming);
		}

		if (node instanceof StoryNode) {
			collect(map, ((StoryNode) node).getStoryPattern());
		}
	}

	private static void collect(Map<String, EClassifier> map, ActivityEdge incoming) {
		collect(map, incoming.getSource());
	}

	private static void collect(Map<String, EClassifier> map, StoryPattern pattern) {
		// collect all elements from contained patterns
		for (StoryPattern childPattern : pattern.getContainedPatterns()) {
			collect(map, childPattern);
		}

		// only collect when they could have been matched
		if (!BindingSemantics.NEGATIVE.equals(pattern.getBindingSemantics())) {
			// collect object variables
			for (AbstractVariable variable : pattern.getVariables()) {
				collect(map, variable);
			}
		}
	}

	private static void collect(Map<String, EClassifier> map, AbstractVariable variable) {
		if (variable instanceof TypedElement) {
			if (map.containsKey(variable.getName())) {
				System.err.println("the variable name exists already: " + variable.getName());
			} else {
				map.put(variable.getName(), variable.getType());
			}
		}
	}
}