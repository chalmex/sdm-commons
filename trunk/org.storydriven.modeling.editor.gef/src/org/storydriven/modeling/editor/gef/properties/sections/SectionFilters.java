package org.storydriven.modeling.editor.gef.properties.sections;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.fujaba.commons.identifier.Identifier;
import org.fujaba.commons.properties.util.AdapterUtil;
import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.activities.ActivityCallNode;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.patterns.Constraint;
import org.storydriven.modeling.patterns.LinkVariable;
import org.storydriven.modeling.patterns.ObjectVariable;


public enum SectionFilters
{
   INSTANCE;

   public static class IdentifierFilter implements IFilter
   {
      @Override
      public boolean select(Object object)
      {
         // get adapted element
         EObject element = AdapterUtil.adaptObject(object);

         return element instanceof Identifier;
      }
   }

   public static class NamedElementFilter implements IFilter
   {
      @Override
      public boolean select(Object object)
      {
         // get adapted element
         EObject element = AdapterUtil.adaptObject(object);

         return element instanceof NamedElement;
      }
   }

   public static class ActivityCallNodeFilter implements IFilter
   {
      @Override
      public boolean select(Object object)
      {
         // get adapted element
         EObject element = AdapterUtil.adaptObject(object);

         return element instanceof ActivityCallNode;
      }
   }
   
   public static class ConstraintExpressionFilter implements IFilter
   {
      @Override
      public boolean select(Object object)
      {
         // get adapted element
         EObject element = AdapterUtil.adaptObject(object);

         return element instanceof Constraint;
      }
   }
   
   public static class ActivityEdgeExpressionGuardFilter implements IFilter
   {
      @Override
      public boolean select(Object object)
      {
         // get adapted element
         EObject element = AdapterUtil.adaptObject(object);

         return element instanceof ActivityEdge;
      }
   }
   
   public static class StopNodeReturnExpressionFilter implements IFilter
   {
      @Override
      public boolean select(Object object)
      {
         // get adapted element
         EObject element = AdapterUtil.adaptObject(object);

         return element instanceof StopNode;
      }
   }
   
   public static class LinkVariableFilter implements IFilter
   {
      @Override
      public boolean select(Object object)
      {
         // get adapted element
         EObject element = AdapterUtil.adaptObject(object);

         return element instanceof LinkVariable;
      }
   }
   
   public static class ObjectVariableFilter implements IFilter
   {
      @Override
      public boolean select(Object object)
      {
         // get adapted element
         EObject element = AdapterUtil.adaptObject(object);

         return element instanceof ObjectVariable;
      }
   }
}
