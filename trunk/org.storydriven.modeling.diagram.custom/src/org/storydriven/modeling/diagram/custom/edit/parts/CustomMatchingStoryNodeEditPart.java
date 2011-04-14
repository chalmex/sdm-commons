package org.storydriven.modeling.diagram.custom.edit.parts;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.modeling.activities.StoryNode;
import org.storydriven.modeling.diagram.edit.parts.MatchingStoryNodeEditPart;

public class CustomMatchingStoryNodeEditPart extends MatchingStoryNodeEditPart {

	/*
	 * Same Code in CustomModifying StoryNode! Please copy changes.
	 */
	
	Rectangle initialBounds;
	
	public CustomMatchingStoryNodeEditPart(View view) {
		super(view);
	}
	
	public void setInitialBounds(Rectangle initialBounds) {
		this.initialBounds = initialBounds;
	}
		
	private void updateFigure(Notification event) {
			
			boolean isForEach = ((StoryNode) ((View) getModel()).getElement()).isForEach();
			RectangleFigure frontRectangle = (RectangleFigure) getPrimaryShape().getChildren().get(1);
			
			Insets frontInsets = frontRectangle.getBorder().getInsets(frontRectangle);
			if (!isForEach)
			{
				frontInsets.top = 0;
				frontInsets.bottom = 0;
				frontInsets.left = 0;
				frontInsets.right = 0;
			}
			else
			{
				frontInsets.top = 0;
				frontInsets.bottom = 10;
				frontInsets.left = 0;
				frontInsets.right = 10;
			}
			
			IFigure rectangleFront = (IFigure) ((IFigure) getFigure().getChildren().get(0)).getChildren().get(1);
			rectangleFront =  (IFigure) rectangleFront.getChildren().get(0);
			IFigure rectangleContent = (IFigure) rectangleFront.getChildren().get(1);
			rectangleContent = (IFigure) rectangleContent.getChildren().get(1);
			if(!rectangleContent.getChildren().isEmpty()) 
			{
				ResizableCompartmentFigure upperCompartment = (ResizableCompartmentFigure) rectangleContent.getChildren().get(0);
				upperCompartment.getScrollPane().setHorizontalScrollBarVisibility(ScrollPane.NEVER);
				upperCompartment.getScrollPane().setVerticalScrollBarVisibility(ScrollPane.NEVER);
				upperCompartment.setLayoutManager(new BorderLayout());
				upperCompartment.add(((AbstractGraphicalEditPart) ((EditPart) this.getChildren().get(1)).getChildren().get(0)).getFigure(), 
									BorderLayout.CENTER);
			}
	}
	
	
	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		updateFigure(event);
		super.refreshVisuals();
	}

}