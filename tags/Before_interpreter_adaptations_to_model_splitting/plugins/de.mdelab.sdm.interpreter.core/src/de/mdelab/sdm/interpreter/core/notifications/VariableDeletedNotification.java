package de.mdelab.sdm.interpreter.core.notifications;

import de.mdelab.sdm.interpreter.core.variables.Variable;
import de.mdelab.sdm.interpreter.core.variables.VariablesScope;

/**
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Classifier>
 */
public class VariableDeletedNotification<Classifier> extends InterpreterNotification<Classifier>
{

	private final Variable<Classifier>	variable;

	public VariableDeletedNotification(VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope, Variable<Classifier> variable)
	{
		super(variablesScope, variablesScope);

		assert variable != null;

		this.variable = variable;
	}

	@Override
	public NotificationTypeEnum getNotificationType()
	{
		return NotificationTypeEnum.VARIABLE_DELETED;
	}

	public Variable<Classifier> getVariable()
	{
		return this.variable;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return null;
	}
}
