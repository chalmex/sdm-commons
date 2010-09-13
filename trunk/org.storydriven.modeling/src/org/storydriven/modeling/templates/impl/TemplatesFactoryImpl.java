/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.templates.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.storydriven.modeling.templates.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplatesFactoryImpl extends EFactoryImpl implements TemplatesFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static TemplatesFactory init ()
   {
      try
      {
         TemplatesFactory theTemplatesFactory = (TemplatesFactory) EPackage.Registry.INSTANCE
            .getEFactory("http://ns.storydriven.org/sdm/templates/0.1.0");
         if (theTemplatesFactory != null)
         {
            return theTemplatesFactory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new TemplatesFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public TemplatesFactoryImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create (EClass eClass)
   {
      switch (eClass.getClassifierID())
      {
         case TemplatesPackage.OBJECT_PATTERN_TEMPLATE:
            return createObjectPatternTemplate();
         case TemplatesPackage.TEMPLATE_BINDING:
            return createTemplateBinding();
         case TemplatesPackage.PROPERTY_BINDING:
            return createPropertyBinding();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ObjectPatternTemplate createObjectPatternTemplate ()
   {
      ObjectPatternTemplateImpl objectPatternTemplate = new ObjectPatternTemplateImpl();
      return objectPatternTemplate;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public TemplateBinding createTemplateBinding ()
   {
      TemplateBindingImpl templateBinding = new TemplateBindingImpl();
      return templateBinding;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PropertyBinding createPropertyBinding ()
   {
      PropertyBindingImpl propertyBinding = new PropertyBindingImpl();
      return propertyBinding;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public TemplatesPackage getTemplatesPackage ()
   {
      return (TemplatesPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static TemplatesPackage getPackage ()
   {
      return TemplatesPackage.eINSTANCE;
   }

} //TemplatesFactoryImpl
