/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.expressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.storydriven.modeling.patterns.expressions.ExpressionsPackage
 * @generated
 */
public interface ExpressionsFactory extends EFactory
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   ExpressionsFactory eINSTANCE = org.storydriven.modeling.patterns.expressions.impl.ExpressionsFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Attribute Value Expression</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Attribute Value Expression</em>'.
    * @generated
    */
   AttributeValueExpression createAttributeValueExpression ();

   /**
    * Returns a new object of class '<em>Object Variable Expression</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Object Variable Expression</em>'.
    * @generated
    */
   ObjectVariableExpression createObjectVariableExpression ();

   /**
    * Returns a new object of class '<em>Object Set Size Expression</em>'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return a new object of class '<em>Object Set Size Expression</em>'.
    * @generated
    */
   ObjectSetSizeExpression createObjectSetSizeExpression ();

   /**
    * Returns a new object of class '<em>Primitive Variable Expression</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Primitive Variable Expression</em>'.
    * @generated
    */
   PrimitiveVariableExpression createPrimitiveVariableExpression ();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   ExpressionsPackage getExpressionsPackage ();

} // ExpressionsFactory
