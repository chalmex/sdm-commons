/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.storydiagrams.activities.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.CorePackage;
import org.storydriven.core.NamedElement;
import org.storydriven.core.impl.CommentableElementImpl;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.ActivityNode;
import org.storydriven.storydiagrams.activities.StructuredNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.storydiagrams.activities.impl.ActivityNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.activities.impl.ActivityNodeImpl#getOutgoings <em>Outgoing</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.activities.impl.ActivityNodeImpl#getOwningActivity <em>Owning Activity</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.activities.impl.ActivityNodeImpl#getOwningActivityNode <em>Owning Activity Node</em>}</li>
 *   <li>{@link org.storydriven.storydiagrams.activities.impl.ActivityNodeImpl#getIncomings <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityNodeImpl extends CommentableElementImpl implements ActivityNode {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutgoings() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoings()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> outgoings;

	/**
	 * The cached value of the '{@link #getIncomings() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomings()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> incomings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.ACTIVITY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getOutgoings() {
		if (outgoings == null) {
			outgoings = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, ActivitiesPackage.ACTIVITY_NODE__OUTGOING, ActivitiesPackage.ACTIVITY_EDGE__SOURCE);
		}
		return outgoings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getOwningActivity() {
		if (eContainerFeatureID() != ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY) return null;
		return (Activity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningActivity(Activity newOwningActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningActivity, ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningActivity(Activity newOwningActivity) {
		if (newOwningActivity != eInternalContainer() || (eContainerFeatureID() != ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY && newOwningActivity != null)) {
			if (EcoreUtil.isAncestor(this, newOwningActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningActivity != null)
				msgs = ((InternalEObject)newOwningActivity).eInverseAdd(this, ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE, Activity.class, msgs);
			msgs = basicSetOwningActivity(newOwningActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY, newOwningActivity, newOwningActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredNode getOwningActivityNode() {
		if (eContainerFeatureID() != ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE) return null;
		return (StructuredNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningActivityNode(StructuredNode newOwningActivityNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningActivityNode, ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningActivityNode(StructuredNode newOwningActivityNode) {
		if (newOwningActivityNode != eInternalContainer() || (eContainerFeatureID() != ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE && newOwningActivityNode != null)) {
			if (EcoreUtil.isAncestor(this, newOwningActivityNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningActivityNode != null)
				msgs = ((InternalEObject)newOwningActivityNode).eInverseAdd(this, ActivitiesPackage.STRUCTURED_NODE__OWNED_ACTIVITY_NODE, StructuredNode.class, msgs);
			msgs = basicSetOwningActivityNode(newOwningActivityNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE, newOwningActivityNode, newOwningActivityNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getIncomings() {
		if (incomings == null) {
			incomings = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, ActivitiesPackage.ACTIVITY_NODE__INCOMING, ActivitiesPackage.ACTIVITY_EDGE__TARGET);
		}
		return incomings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitiesPackage.ACTIVITY_NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoings()).basicAdd(otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningActivity((Activity)otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningActivityNode((StructuredNode)otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY_NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomings()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitiesPackage.ACTIVITY_NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoings()).basicRemove(otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY:
				return basicSetOwningActivity(null, msgs);
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE:
				return basicSetOwningActivityNode(null, msgs);
			case ActivitiesPackage.ACTIVITY_NODE__INCOMING:
				return ((InternalEList<?>)getIncomings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY:
				return eInternalContainer().eInverseRemove(this, ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE, Activity.class, msgs);
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE:
				return eInternalContainer().eInverseRemove(this, ActivitiesPackage.STRUCTURED_NODE__OWNED_ACTIVITY_NODE, StructuredNode.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitiesPackage.ACTIVITY_NODE__NAME:
				return getName();
			case ActivitiesPackage.ACTIVITY_NODE__OUTGOING:
				return getOutgoings();
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY:
				return getOwningActivity();
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE:
				return getOwningActivityNode();
			case ActivitiesPackage.ACTIVITY_NODE__INCOMING:
				return getIncomings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitiesPackage.ACTIVITY_NODE__NAME:
				setName((String)newValue);
				return;
			case ActivitiesPackage.ACTIVITY_NODE__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY:
				setOwningActivity((Activity)newValue);
				return;
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE:
				setOwningActivityNode((StructuredNode)newValue);
				return;
			case ActivitiesPackage.ACTIVITY_NODE__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivitiesPackage.ACTIVITY_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ActivitiesPackage.ACTIVITY_NODE__OUTGOING:
				getOutgoings().clear();
				return;
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY:
				setOwningActivity((Activity)null);
				return;
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE:
				setOwningActivityNode((StructuredNode)null);
				return;
			case ActivitiesPackage.ACTIVITY_NODE__INCOMING:
				getIncomings().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivitiesPackage.ACTIVITY_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ActivitiesPackage.ACTIVITY_NODE__OUTGOING:
				return outgoings != null && !outgoings.isEmpty();
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY:
				return getOwningActivity() != null;
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE:
				return getOwningActivityNode() != null;
			case ActivitiesPackage.ACTIVITY_NODE__INCOMING:
				return incomings != null && !incomings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case ActivitiesPackage.ACTIVITY_NODE__NAME: return CorePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CorePackage.NAMED_ELEMENT__NAME: return ActivitiesPackage.ACTIVITY_NODE__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ActivityNodeImpl