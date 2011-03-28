/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities;

import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Stop Node</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.StopNode#isFlowStopOnly <em>Flow Stop Only</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.StopNode#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.storydriven.modeling.activities.ActivitiesPackage#getStopNode()
 * @model
 * @generated
 */
public interface StopNode extends ActivityNode
{
   /**
    * Returns the value of the '<em><b>Flow Stop Only</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> true if subactivity is stopped,
    * but not the whole control flow <!-- end-model-doc -->
    * 
    * @return the value of the '<em>Flow Stop Only</em>' attribute.
    * @see #setFlowStopOnly(boolean)
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getStopNode_FlowStopOnly()
    * @model required="true" ordered="false"
    * @generated
    */
   boolean isFlowStopOnly ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.activities.StopNode#isFlowStopOnly <em>Flow Stop Only</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @param value the new value of the '<em>Flow Stop Only</em>' attribute.
    * @see #isFlowStopOnly()
    * @generated
    */
   void setFlowStopOnly (boolean value);

   /**
    * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Return Value</em>' containment reference isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Return Value</em>' containment reference.
    * @see #setReturnValue(Expression)
    * @see org.storydriven.modeling.activities.ActivitiesPackage#getStopNode_ReturnValue()
    * @model containment="true" resolveProxies="true" ordered="false"
    * @generated
    */
   Expression getReturnValue ();

   /**
    * Sets the value of the '{@link org.storydriven.modeling.activities.StopNode#getReturnValue <em>Return Value</em>}' containment reference.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @param value the new value of the '<em>Return Value</em>' containment reference.
    * @see #getReturnValue()
    * @generated
    */
   void setReturnValue (Expression value);

} // StopNode