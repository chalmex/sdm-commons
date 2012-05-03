package org.storydriven.storydiagrams.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.transaction.RecordingCommand;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.storydiagrams.diagram.custom.properties.AbstractExpressionSection;
import org.storydriven.storydiagrams.patterns.AttributeAssignment;

public class AttributeAssignmentExpressionSection extends AbstractExpressionSection {
	@Override
	protected Expression getExpression() {
		if (getElement().getValueExpression() == null) {
			final TextualExpression expression = ExpressionsFactory.eINSTANCE.createTextualExpression();
			expression.setLanguage("OCL");
			expression.setLanguageVersion("1.0");

			RecordingCommand command = new RecordingCommand(getEditingDomain()) {
				@Override
				protected void doExecute() {
					getElement().setValueExpression(expression);
				}
			};
			execute(command);
		}
		return getElement().getValueExpression();
	}

	@Override
	protected EClassifier getContextClassifier() {
		if (getElement() != null && getElement().getAttribute() != null) {
			return getElement().getAttribute().getEType();
		}
		return super.getContextClassifier();
	}

	@Override
	protected AttributeAssignment getElement() {
		return (AttributeAssignment) super.getElement();
	}
}
