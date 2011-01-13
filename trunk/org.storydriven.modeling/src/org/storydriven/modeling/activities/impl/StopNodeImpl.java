/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.activities.ActivitiesPackage;
import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Stop Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.activities.impl.StopNodeImpl#isFlowStopOnly <em>Flow Stop Only</em>}</li>
 *   <li>{@link org.storydriven.modeling.activities.impl.StopNodeImpl#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StopNodeImpl extends ActivityNodeImpl implements StopNode
{
   /**
    * The default value of the '{@link #isFlowStopOnly() <em>Flow Stop Only</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #isFlowStopOnly()
    * @generated
    * @ordered
    */
   protected static final boolean FLOW_STOP_ONLY_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isFlowStopOnly() <em>Flow Stop Only</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #isFlowStopOnly()
    * @generated
    * @ordered
    */
   protected boolean flowStopOnly = FLOW_STOP_ONLY_EDEFAULT;

   /**
    * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getReturnValue()
    * @generated
    * @ordered
    */
   protected Expression returnValue;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected StopNodeImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass ()
   {
      return ActivitiesPackage.Literals.STOP_NODE;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean isFlowStopOnly ()
   {
      return flowStopOnly;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setFlowStopOnly (boolean newFlowStopOnly)
   {
      boolean oldFlowStopOnly = flowStopOnly;
      flowStopOnly = newFlowStopOnly;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.STOP_NODE__FLOW_STOP_ONLY,
            oldFlowStopOnly, flowStopOnly));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression getReturnValue ()
   {
      if (returnValue != null && returnValue.eIsProxy())
      {
         InternalEObject oldReturnValue = (InternalEObject) returnValue;
         returnValue = (Expression) eResolveProxy(oldReturnValue);
         if (returnValue != oldReturnValue)
         {
            InternalEObject newReturnValue = (InternalEObject) returnValue;
            NotificationChain msgs = oldReturnValue.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ActivitiesPackage.STOP_NODE__RETURN_VALUE, null, null);
            if (newReturnValue.eInternalContainer() == null)
            {
               msgs = newReturnValue.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - ActivitiesPackage.STOP_NODE__RETURN_VALUE, null, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesPackage.STOP_NODE__RETURN_VALUE,
                  oldReturnValue, returnValue));
         }
      }
      return returnValue;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression basicGetReturnValue ()
   {
      return returnValue;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetReturnValue (Expression newReturnValue, NotificationChain msgs)
   {
      Expression oldReturnValue = returnValue;
      returnValue = newReturnValue;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            ActivitiesPackage.STOP_NODE__RETURN_VALUE, oldReturnValue, newReturnValue);
         if (msgs == null)
            msgs = notification;
         else
            msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setReturnValue (Expression newReturnValue)
   {
      if (newReturnValue != returnValue)
      {
         NotificationChain msgs = null;
         if (returnValue != null)
            msgs = ((InternalEObject) returnValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - ActivitiesPackage.STOP_NODE__RETURN_VALUE, null, msgs);
         if (newReturnValue != null)
            msgs = ((InternalEObject) newReturnValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - ActivitiesPackage.STOP_NODE__RETURN_VALUE, null, msgs);
         msgs = basicSetReturnValue(newReturnValue, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.STOP_NODE__RETURN_VALUE,
            newReturnValue, newReturnValue));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case ActivitiesPackage.STOP_NODE__RETURN_VALUE:
            return basicSetReturnValue(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet (int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case ActivitiesPackage.STOP_NODE__FLOW_STOP_ONLY:
            return isFlowStopOnly();
         case ActivitiesPackage.STOP_NODE__RETURN_VALUE:
            if (resolve)
               return getReturnValue();
            return basicGetReturnValue();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet (int featureID, Object newValue)
   {
      switch (featureID)
      {
         case ActivitiesPackage.STOP_NODE__FLOW_STOP_ONLY:
            setFlowStopOnly((Boolean) newValue);
            return;
         case ActivitiesPackage.STOP_NODE__RETURN_VALUE:
            setReturnValue((Expression) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset (int featureID)
   {
      switch (featureID)
      {
         case ActivitiesPackage.STOP_NODE__FLOW_STOP_ONLY:
            setFlowStopOnly(FLOW_STOP_ONLY_EDEFAULT);
            return;
         case ActivitiesPackage.STOP_NODE__RETURN_VALUE:
            setReturnValue((Expression) null);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet (int featureID)
   {
      switch (featureID)
      {
         case ActivitiesPackage.STOP_NODE__FLOW_STOP_ONLY:
            return flowStopOnly != FLOW_STOP_ONLY_EDEFAULT;
         case ActivitiesPackage.STOP_NODE__RETURN_VALUE:
            return returnValue != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString ()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (flowStopOnly: ");
      result.append(flowStopOnly);
      result.append(')');
      return result.toString();
   }

} // StopNodeImpl
