/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.templates.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.Expression;
import org.storydriven.modeling.impl.ExtendableElementImpl;
import org.storydriven.modeling.templates.ObjectPatternTemplate;
import org.storydriven.modeling.templates.PropertyBinding;
import org.storydriven.modeling.templates.TemplateBinding;
import org.storydriven.modeling.templates.TemplatesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Template Binding</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.storydriven.modeling.templates.impl.TemplateBindingImpl#getBoundParameter <em>Bound Parameter</em>}</li>
 * <li>{@link org.storydriven.modeling.templates.impl.TemplateBindingImpl#getBindingExpression <em>Binding Expression</em>}</li>
 * <li>{@link org.storydriven.modeling.templates.impl.TemplateBindingImpl#getPropertyBindings <em>Property Binding</em>}</li>
 * <li>{@link org.storydriven.modeling.templates.impl.TemplateBindingImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TemplateBindingImpl extends ExtendableElementImpl implements TemplateBinding
{
   /**
    * The cached value of the '{@link #getBoundParameter() <em>Bound Parameter</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getBoundParameter()
    * @generated
    * @ordered
    */
   protected EClassifier boundParameter;

   /**
    * The cached value of the '{@link #getBindingExpression() <em>Binding Expression</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getBindingExpression()
    * @generated
    * @ordered
    */
   protected Expression bindingExpression;

   /**
    * The cached value of the '{@link #getPropertyBindings() <em>Property Binding</em>}' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #getPropertyBindings()
    * @generated
    * @ordered
    */
   protected EList<PropertyBinding> propertyBindings;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected TemplateBindingImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   protected EClass eStaticClass ()
   {
      return TemplatesPackage.Literals.TEMPLATE_BINDING;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClassifier getBoundParameter ()
   {
      if (this.boundParameter != null && this.boundParameter.eIsProxy())
      {
         InternalEObject oldBoundParameter = (InternalEObject) this.boundParameter;
         this.boundParameter = (EClassifier) eResolveProxy(oldBoundParameter);
         if (this.boundParameter != oldBoundParameter)
         {
            if (eNotificationRequired())
            {
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  TemplatesPackage.TEMPLATE_BINDING__BOUND_PARAMETER, oldBoundParameter, this.boundParameter));
            }
         }
      }
      return this.boundParameter;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClassifier basicGetBoundParameter ()
   {
      return this.boundParameter;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setBoundParameter (EClassifier newBoundParameter)
   {
      EClassifier oldBoundParameter = this.boundParameter;
      this.boundParameter = newBoundParameter;
      if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, TemplatesPackage.TEMPLATE_BINDING__BOUND_PARAMETER,
            oldBoundParameter, this.boundParameter));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public Expression getBindingExpression ()
   {
      if (this.bindingExpression != null && this.bindingExpression.eIsProxy())
      {
         InternalEObject oldBindingExpression = (InternalEObject) this.bindingExpression;
         this.bindingExpression = (Expression) eResolveProxy(oldBindingExpression);
         if (this.bindingExpression != oldBindingExpression)
         {
            InternalEObject newBindingExpression = (InternalEObject) this.bindingExpression;
            NotificationChain msgs = oldBindingExpression.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TemplatesPackage.TEMPLATE_BINDING__BINDING_EXPRESSION, null, null);
            if (newBindingExpression.eInternalContainer() == null)
            {
               msgs = newBindingExpression.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - TemplatesPackage.TEMPLATE_BINDING__BINDING_EXPRESSION, null, msgs);
            }
            if (msgs != null)
            {
               msgs.dispatch();
            }
            if (eNotificationRequired())
            {
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  TemplatesPackage.TEMPLATE_BINDING__BINDING_EXPRESSION, oldBindingExpression, this.bindingExpression));
            }
         }
      }
      return this.bindingExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public Expression basicGetBindingExpression ()
   {
      return this.bindingExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetBindingExpression (Expression newBindingExpression, NotificationChain msgs)
   {
      Expression oldBindingExpression = this.bindingExpression;
      this.bindingExpression = newBindingExpression;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            TemplatesPackage.TEMPLATE_BINDING__BINDING_EXPRESSION, oldBindingExpression, newBindingExpression);
         if (msgs == null)
         {
            msgs = notification;
         }
         else
         {
            msgs.add(notification);
         }
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setBindingExpression (Expression newBindingExpression)
   {
      if (newBindingExpression != this.bindingExpression)
      {
         NotificationChain msgs = null;
         if (this.bindingExpression != null)
         {
            msgs = ((InternalEObject) this.bindingExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - TemplatesPackage.TEMPLATE_BINDING__BINDING_EXPRESSION, null, msgs);
         }
         if (newBindingExpression != null)
         {
            msgs = ((InternalEObject) newBindingExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - TemplatesPackage.TEMPLATE_BINDING__BINDING_EXPRESSION, null, msgs);
         }
         msgs = basicSetBindingExpression(newBindingExpression, msgs);
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }
      else if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, TemplatesPackage.TEMPLATE_BINDING__BINDING_EXPRESSION,
            newBindingExpression, newBindingExpression));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<PropertyBinding> getPropertyBindings ()
   {
      if (this.propertyBindings == null)
      {
         this.propertyBindings = new EObjectContainmentWithInverseEList.Resolving<PropertyBinding>(
            PropertyBinding.class, this, TemplatesPackage.TEMPLATE_BINDING__PROPERTY_BINDING,
            TemplatesPackage.PROPERTY_BINDING__TEMPLATE_BINDING);
      }
      return this.propertyBindings;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public ObjectPatternTemplate getTemplate ()
   {
      if (eContainerFeatureID() != TemplatesPackage.TEMPLATE_BINDING__TEMPLATE)
      {
         return null;
      }
      return (ObjectPatternTemplate) eContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public ObjectPatternTemplate basicGetTemplate ()
   {
      if (eContainerFeatureID() != TemplatesPackage.TEMPLATE_BINDING__TEMPLATE)
      {
         return null;
      }
      return (ObjectPatternTemplate) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetTemplate (ObjectPatternTemplate newTemplate, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newTemplate, TemplatesPackage.TEMPLATE_BINDING__TEMPLATE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setTemplate (ObjectPatternTemplate newTemplate)
   {
      if (newTemplate != eInternalContainer()
         || (eContainerFeatureID() != TemplatesPackage.TEMPLATE_BINDING__TEMPLATE && newTemplate != null))
      {
         if (EcoreUtil.isAncestor(this, newTemplate))
         {
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         }
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
         {
            msgs = eBasicRemoveFromContainer(msgs);
         }
         if (newTemplate != null)
         {
            msgs = ((InternalEObject) newTemplate).eInverseAdd(this,
               TemplatesPackage.OBJECT_PATTERN_TEMPLATE__TEMPLATE_BINDING, ObjectPatternTemplate.class, msgs);
         }
         msgs = basicSetTemplate(newTemplate, msgs);
         if (msgs != null)
         {
            msgs.dispatch();
         }
      }
      else if (eNotificationRequired())
      {
         eNotify(new ENotificationImpl(this, Notification.SET, TemplatesPackage.TEMPLATE_BINDING__TEMPLATE,
            newTemplate, newTemplate));
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @SuppressWarnings ("unchecked")
   @Override
   public NotificationChain eInverseAdd (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case TemplatesPackage.TEMPLATE_BINDING__PROPERTY_BINDING:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getPropertyBindings()).basicAdd(otherEnd, msgs);
         case TemplatesPackage.TEMPLATE_BINDING__TEMPLATE:
            if (eInternalContainer() != null)
            {
               msgs = eBasicRemoveFromContainer(msgs);
            }
            return basicSetTemplate((ObjectPatternTemplate) otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case TemplatesPackage.TEMPLATE_BINDING__BINDING_EXPRESSION:
            return basicSetBindingExpression(null, msgs);
         case TemplatesPackage.TEMPLATE_BINDING__PROPERTY_BINDING:
            return ((InternalEList<?>) getPropertyBindings()).basicRemove(otherEnd, msgs);
         case TemplatesPackage.TEMPLATE_BINDING__TEMPLATE:
            return basicSetTemplate(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature (NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
         case TemplatesPackage.TEMPLATE_BINDING__TEMPLATE:
            return eInternalContainer().eInverseRemove(this,
               TemplatesPackage.OBJECT_PATTERN_TEMPLATE__TEMPLATE_BINDING, ObjectPatternTemplate.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public Object eGet (int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case TemplatesPackage.TEMPLATE_BINDING__BOUND_PARAMETER:
            if (resolve)
            {
               return getBoundParameter();
            }
            return basicGetBoundParameter();
         case TemplatesPackage.TEMPLATE_BINDING__BINDING_EXPRESSION:
            if (resolve)
            {
               return getBindingExpression();
            }
            return basicGetBindingExpression();
         case TemplatesPackage.TEMPLATE_BINDING__PROPERTY_BINDING:
            return getPropertyBindings();
         case TemplatesPackage.TEMPLATE_BINDING__TEMPLATE:
            if (resolve)
            {
               return getTemplate();
            }
            return basicGetTemplate();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @SuppressWarnings ("unchecked")
   @Override
   public void eSet (int featureID, Object newValue)
   {
      switch (featureID)
      {
         case TemplatesPackage.TEMPLATE_BINDING__BOUND_PARAMETER:
            setBoundParameter((EClassifier) newValue);
            return;
         case TemplatesPackage.TEMPLATE_BINDING__BINDING_EXPRESSION:
            setBindingExpression((Expression) newValue);
            return;
         case TemplatesPackage.TEMPLATE_BINDING__PROPERTY_BINDING:
            getPropertyBindings().clear();
            getPropertyBindings().addAll((Collection<? extends PropertyBinding>) newValue);
            return;
         case TemplatesPackage.TEMPLATE_BINDING__TEMPLATE:
            setTemplate((ObjectPatternTemplate) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eUnset (int featureID)
   {
      switch (featureID)
      {
         case TemplatesPackage.TEMPLATE_BINDING__BOUND_PARAMETER:
            setBoundParameter((EClassifier) null);
            return;
         case TemplatesPackage.TEMPLATE_BINDING__BINDING_EXPRESSION:
            setBindingExpression((Expression) null);
            return;
         case TemplatesPackage.TEMPLATE_BINDING__PROPERTY_BINDING:
            getPropertyBindings().clear();
            return;
         case TemplatesPackage.TEMPLATE_BINDING__TEMPLATE:
            setTemplate((ObjectPatternTemplate) null);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public boolean eIsSet (int featureID)
   {
      switch (featureID)
      {
         case TemplatesPackage.TEMPLATE_BINDING__BOUND_PARAMETER:
            return this.boundParameter != null;
         case TemplatesPackage.TEMPLATE_BINDING__BINDING_EXPRESSION:
            return this.bindingExpression != null;
         case TemplatesPackage.TEMPLATE_BINDING__PROPERTY_BINDING:
            return this.propertyBindings != null && !this.propertyBindings.isEmpty();
         case TemplatesPackage.TEMPLATE_BINDING__TEMPLATE:
            return basicGetTemplate() != null;
      }
      return super.eIsSet(featureID);
   }

} // TemplateBindingImpl
