package org.storydriven.modeling.diagram.custom.edit.commands;

import java.util.Collection;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.CrossReferenceAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IObjectActionDelegate;
import org.storydriven.modeling.activities.MatchingStoryNode;
import org.storydriven.modeling.activities.ModifyingStoryNode;
import org.storydriven.modeling.activities.impl.MatchingStoryNodeImpl;
import org.storydriven.modeling.diagram.custom.edit.parts.CustomMatchingStoryNodeEditPart;
import org.storydriven.modeling.diagram.custom.edit.parts.CustomModifyingStoryNodeEditPart;
import org.storydriven.modeling.diagram.custom.util.StoryPatternConverter;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StoryPatternEditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeEditPart;
import org.storydriven.modeling.diagram.edit.parts.StructuredNodeStructuredNodeCompartmentEditPart;
import org.storydriven.modeling.diagram.part.SDMVisualIDRegistry;
import org.storydriven.modeling.diagram.providers.SDMElementTypes;
import org.storydriven.modeling.patterns.MatchingPattern;
import org.storydriven.modeling.patterns.StoryPattern;

public class MatchingStoryNodeToggleModifyingCommand extends AbstractActionDelegate implements
		IObjectActionDelegate {

	MatchingStoryNodeEditPart storyNodeEditPart = ((MatchingStoryNodeEditPart) getStructuredSelection().getFirstElement());
	MatchingStoryNode matchingNodeElement;
	View matchingNodeView;
	StructuredNodeStructuredNodeCompartmentEditPart owningStructuredNodeEditPart;
	
	DiagramEditPart diagramEditPart;
	
	View modifyingNodeView;
	
	@Override
	protected void doRun(IProgressMonitor progressMonitor) {
		
		storyNodeEditPart = ((MatchingStoryNodeEditPart) getStructuredSelection().getFirstElement());
		
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(storyNodeEditPart.getEditingDomain(),
					"Toggle StoryNode to Modifying", null) {
			
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
					IAdaptable info) throws ExecutionException {
				
				initialize();

				IElementType type = SDMElementTypes.ModifyingStoryNode_2007;
				ViewAndElementDescriptor viewDescriptor = new ViewAndElementDescriptor(
						new CreateElementRequestAdapter(new CreateElementRequest(type)),
						Node.class,
						((IHintedType) type).getSemanticHint(), 
						((GraphicalEditPart) diagramEditPart).getDiagramPreferencesHint());
				CreateViewAndElementRequest req = new CreateViewAndElementRequest(viewDescriptor);
								
				// Use CompoundCommand to encapsulate the specific command returned by .getCommand
				CompoundCommand cmd = new CompoundCommand("Create modifying story node");
				cmd.add(diagramEditPart.getCommand(req));
				((GraphicalEditPart) diagramEditPart).getDiagramEditDomain().getDiagramCommandStack().execute(cmd);
				
				
				Collection results = DiagramCommandStack.getReturnValues(cmd);
				for (Object res: results) {
					if (res instanceof IAdaptable) {
						IAdaptable adapter = (IAdaptable) res;
						modifyingNodeView = (View) adapter.getAdapter(View.class);
						
						if (modifyingNodeView != null) {
							ModifyingStoryNode newElement = (ModifyingStoryNode)modifyingNodeView.getElement();
							
							// The excluded features are nasty. They break the copying process and we deal with them further down.
							for( EStructuralFeature aFeature : ( matchingNodeElement.eClass().getEAllStructuralFeatures()) ) {	
								if(!(aFeature.getName().equals("storyPattern")) && 
								   !(aFeature.getName().equals("ownedPattern"))	&&
								   !(aFeature.getName().equals("owningActivityNode"))) {
									newElement.eSet(aFeature, (matchingNodeElement.eGet(aFeature))); }
							}
							if(matchingNodeElement.getOwningActivityNode() != null) {
								newElement.setOwningActivityNode(matchingNodeElement.getOwningActivityNode());
							}
							
							// After semantic copying we now copy the functional features for the editor.
							for( EStructuralFeature aFeature : ( matchingNodeView.eClass().getEAllStructuralFeatures()) ) {	
								if(!(aFeature.getName().equals("element"))	&&
								   !(aFeature.getName().equals("diagram"))) {
									modifyingNodeView.eSet(aFeature, (matchingNodeView.eGet(aFeature)) ); }
							}
							if(owningStructuredNodeEditPart != null) {
								((View) owningStructuredNodeEditPart.getModel()).insertChild(modifyingNodeView);
							}		
						}
					}
				}
				
				return CommandResult.newOKCommandResult();
				
			}
		};
		executeCommand(command);
		
		
		command = new AbstractTransactionalCommand(storyNodeEditPart.getEditingDomain(), 
				"Configure the new MatchingStoryNode after conversion", null) {
		
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
					IAdaptable info) throws ExecutionException {
				
				CustomModifyingStoryNodeEditPart resultEditPart = (CustomModifyingStoryNodeEditPart) getNewEditPart();
				
				StoryPatternConverter theConverter = new StoryPatternConverter(diagramEditPart, (EditPart) resultEditPart.getChildren().get(2));
				((ModifyingStoryNode) ((View) resultEditPart.getModel()).getElement())
					.setOwnedRule(theConverter.convertMatchingToStory(matchingNodeElement.getOwnedPattern()));
				
				if(resultEditPart == null || resultEditPart.getClass() != CustomModifyingStoryNodeEditPart.class) {
					return CommandResult.newErrorCommandResult("Could not find newly created Editpart");
				}
				else {
					Bounds initialBounds = (Bounds) ((Node) resultEditPart.getModel()).getLayoutConstraint();					
					Rectangle tempBounds = storyNodeEditPart.getFigure().getBounds();

					initialBounds.setX(tempBounds.x);
					initialBounds.setY(tempBounds.y);
					initialBounds.setHeight(tempBounds.height);
					initialBounds.setWidth(tempBounds.width);
					
					resultEditPart.refresh();
				}
				
				removeOldNode();
												
				return CommandResult.newOKCommandResult();
			}

			
		};	
		
		executeCommand(command);
		
		cleanUp();

	}
	
	private EditPart getNewEditPart() {
		// New Elements are added at the end of the children list. But changed elements are also at the end so
		// we search the list from the back
		
		EditPart resultEditPart = null;
		
		if(owningStructuredNodeEditPart == null) {
			int amountOfDiagramChildren = diagramEditPart.getChildren().size();
			for(int i = 1; i <= amountOfDiagramChildren && resultEditPart == null; i++) 
			{
				Object aDiagramChild = diagramEditPart.getChildren().get(amountOfDiagramChildren - i);
				if( aDiagramChild.getClass() == CustomModifyingStoryNodeEditPart.class) {
					resultEditPart = (CustomModifyingStoryNodeEditPart) aDiagramChild;
				}
			} 
		}
		else
		{
			int amountOfDiagramChildren = owningStructuredNodeEditPart.getChildren().size();
			for(int i = 1; i <= amountOfDiagramChildren && resultEditPart == null; i++) 
			{
				Object aDiagramChild = owningStructuredNodeEditPart.getChildren().get(amountOfDiagramChildren - i);
				if( aDiagramChild.getClass() == CustomModifyingStoryNodeEditPart.class) {
					resultEditPart = (CustomModifyingStoryNodeEditPart) aDiagramChild;
				}
			} 
		}
		
		return resultEditPart;
	}
	
	private void cleanUp() {
		matchingNodeElement = null;
		matchingNodeView = null;
		diagramEditPart = null;
		owningStructuredNodeEditPart = null;
		storyNodeEditPart = null;
	}

	protected void removeOldNode() {
		
		ViewUtil.destroy(matchingNodeView);
		
		if(owningStructuredNodeEditPart != null) {			
			Request destroyOldNodeRequest = new EditCommandRequestWrapper(new DestroyElementRequest(storyNodeEditPart.getEditingDomain(), matchingNodeElement, false)); 
			Command destroyOldNodeCommand = owningStructuredNodeEditPart.getCommand(destroyOldNodeRequest); 

			((GraphicalEditPart) storyNodeEditPart).getEditingDomain().getCommandStack().execute((org.eclipse.emf.common.command.Command) destroyOldNodeCommand);
				
		}
		else
		{
			DestroyElementRequest destroyOldNodeRequest = new DestroyElementRequest(storyNodeEditPart.getEditingDomain(), matchingNodeElement, false); 
			DestroyElementCommand destroyOldNodeCommand = new DestroyElementCommand(destroyOldNodeRequest); 

			executeCommand(destroyOldNodeCommand);
		}
		
		
	}
	
	protected void executeCommand(IUndoableOperation cmd) {
		try
		{
			OperationHistoryFactory.getOperationHistory().execute(cmd, new NullProgressMonitor(), null);
		}
		catch (ExecutionException ee) {
			ee.printStackTrace();
		}
	}
	
	protected void initialize() {
		matchingNodeElement = (MatchingStoryNode) ((View) storyNodeEditPart.getModel()).getElement();
		matchingNodeView = ((View) storyNodeEditPart.getModel());
		diagramEditPart = (DiagramEditPart) storyNodeEditPart.getRoot().getContents();
		owningStructuredNodeEditPart = (StructuredNodeStructuredNodeCompartmentEditPart) ((storyNodeEditPart.getParent() == diagramEditPart) ? null : storyNodeEditPart.getParent());
	}
}

