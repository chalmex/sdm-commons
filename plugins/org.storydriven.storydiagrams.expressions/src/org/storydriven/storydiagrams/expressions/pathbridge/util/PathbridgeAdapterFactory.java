/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.expressions.pathbridge.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.TypedElement;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.expressions.pathbridge.PathExpressionBridge;
import org.storydriven.storydiagrams.expressions.pathbridge.PathbridgePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.storydriven.storydiagrams.expressions.pathbridge.PathbridgePackage
 * @generated
 */
public class PathbridgeAdapterFactory extends AdapterFactoryImpl
{
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static PathbridgePackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PathbridgeAdapterFactory()
   {
      if (modelPackage == null)
      {
         modelPackage = PathbridgePackage.eINSTANCE;
      }
   }

   /**
    * Returns whether this factory is applicable for the type of the object.
    * <!-- begin-user-doc -->
    * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
    * <!-- end-user-doc -->
    * @return whether this factory is applicable for the type of the object.
    * @generated
    */
   @Override
   public boolean isFactoryForType(Object object)
   {
      if (object == modelPackage)
      {
         return true;
      }
      if (object instanceof EObject)
      {
         return ((EObject)object).eClass().getEPackage() == modelPackage;
      }
      return false;
   }

   /**
    * The switch that delegates to the <code>createXXX</code> methods.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected PathbridgeSwitch<Adapter> modelSwitch =
      new PathbridgeSwitch<Adapter>()
      {
         @Override
         public Adapter casePathExpressionBridge(PathExpressionBridge object)
         {
            return createPathExpressionBridgeAdapter();
         }
         @Override
         public Adapter caseExtendableElement(ExtendableElement object)
         {
            return createExtendableElementAdapter();
         }
         @Override
         public Adapter caseTypedElement(TypedElement object)
         {
            return createTypedElementAdapter();
         }
         @Override
         public Adapter caseCommentableElement(CommentableElement object)
         {
            return createCommentableElementAdapter();
         }
         @Override
         public Adapter caseExpression(Expression object)
         {
            return createExpressionAdapter();
         }
         @Override
         public Adapter defaultCase(EObject object)
         {
            return createEObjectAdapter();
         }
      };

   /**
    * Creates an adapter for the <code>target</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param target the object to adapt.
    * @return the adapter for the <code>target</code>.
    * @generated
    */
   @Override
   public Adapter createAdapter(Notifier target)
   {
      return modelSwitch.doSwitch((EObject)target);
   }


   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.storydiagrams.expressions.pathbridge.PathExpressionBridge <em>Path Expression Bridge</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.storydiagrams.expressions.pathbridge.PathExpressionBridge
    * @generated
    */
   public Adapter createPathExpressionBridgeAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.storydiagrams.ExtendableElement <em>Extendable Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.storydiagrams.ExtendableElement
    * @generated
    */
   public Adapter createExtendableElementAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.storydiagrams.TypedElement <em>Typed Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.storydiagrams.TypedElement
    * @generated
    */
   public Adapter createTypedElementAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.storydiagrams.CommentableElement <em>Commentable Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.storydiagrams.CommentableElement
    * @generated
    */
   public Adapter createCommentableElementAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.storydriven.storydiagrams.expressions.Expression <em>Expression</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.storydriven.storydiagrams.expressions.Expression
    * @generated
    */
   public Adapter createExpressionAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for the default case.
    * <!-- begin-user-doc -->
    * This default implementation returns null.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter()
   {
      return null;
   }

} //PathbridgeAdapterFactory