/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.Attribute;
import EER.Child_Entity;
import EER.EERPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.Child_EntityImpl#getChild_Entity_Attribute <em>Child Entity Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Child_EntityImpl extends EntityImpl implements Child_Entity {
	/**
	 * The cached value of the '{@link #getChild_Entity_Attribute() <em>Child Entity Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild_Entity_Attribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> child_Entity_Attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Child_EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.CHILD_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getChild_Entity_Attribute() {
		if (child_Entity_Attribute == null) {
			child_Entity_Attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, EERPackage.CHILD_ENTITY__CHILD_ENTITY_ATTRIBUTE);
		}
		return child_Entity_Attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EERPackage.CHILD_ENTITY__CHILD_ENTITY_ATTRIBUTE:
				return ((InternalEList<?>)getChild_Entity_Attribute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EERPackage.CHILD_ENTITY__CHILD_ENTITY_ATTRIBUTE:
				return getChild_Entity_Attribute();
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
			case EERPackage.CHILD_ENTITY__CHILD_ENTITY_ATTRIBUTE:
				getChild_Entity_Attribute().clear();
				getChild_Entity_Attribute().addAll((Collection<? extends Attribute>)newValue);
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
			case EERPackage.CHILD_ENTITY__CHILD_ENTITY_ATTRIBUTE:
				getChild_Entity_Attribute().clear();
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
			case EERPackage.CHILD_ENTITY__CHILD_ENTITY_ATTRIBUTE:
				return child_Entity_Attribute != null && !child_Entity_Attribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Child_EntityImpl
