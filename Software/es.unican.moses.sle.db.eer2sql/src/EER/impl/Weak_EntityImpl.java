/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.Attribute;
import EER.EERPackage;
import EER.Weak_Entity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weak Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.Weak_EntityImpl#getWeak_Entity_Attribute <em>Weak Entity Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Weak_EntityImpl extends EntityImpl implements Weak_Entity {
	/**
	 * The cached value of the '{@link #getWeak_Entity_Attribute() <em>Weak Entity Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeak_Entity_Attribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute weak_Entity_Attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Weak_EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.WEAK_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getWeak_Entity_Attribute() {
		return weak_Entity_Attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeak_Entity_Attribute(Attribute newWeak_Entity_Attribute, NotificationChain msgs) {
		Attribute oldWeak_Entity_Attribute = weak_Entity_Attribute;
		weak_Entity_Attribute = newWeak_Entity_Attribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EERPackage.WEAK_ENTITY__WEAK_ENTITY_ATTRIBUTE, oldWeak_Entity_Attribute, newWeak_Entity_Attribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeak_Entity_Attribute(Attribute newWeak_Entity_Attribute) {
		if (newWeak_Entity_Attribute != weak_Entity_Attribute) {
			NotificationChain msgs = null;
			if (weak_Entity_Attribute != null)
				msgs = ((InternalEObject)weak_Entity_Attribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EERPackage.WEAK_ENTITY__WEAK_ENTITY_ATTRIBUTE, null, msgs);
			if (newWeak_Entity_Attribute != null)
				msgs = ((InternalEObject)newWeak_Entity_Attribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EERPackage.WEAK_ENTITY__WEAK_ENTITY_ATTRIBUTE, null, msgs);
			msgs = basicSetWeak_Entity_Attribute(newWeak_Entity_Attribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.WEAK_ENTITY__WEAK_ENTITY_ATTRIBUTE, newWeak_Entity_Attribute, newWeak_Entity_Attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EERPackage.WEAK_ENTITY__WEAK_ENTITY_ATTRIBUTE:
				return basicSetWeak_Entity_Attribute(null, msgs);
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
			case EERPackage.WEAK_ENTITY__WEAK_ENTITY_ATTRIBUTE:
				return getWeak_Entity_Attribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EERPackage.WEAK_ENTITY__WEAK_ENTITY_ATTRIBUTE:
				setWeak_Entity_Attribute((Attribute)newValue);
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
			case EERPackage.WEAK_ENTITY__WEAK_ENTITY_ATTRIBUTE:
				setWeak_Entity_Attribute((Attribute)null);
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
			case EERPackage.WEAK_ENTITY__WEAK_ENTITY_ATTRIBUTE:
				return weak_Entity_Attribute != null;
		}
		return super.eIsSet(featureID);
	}

} //Weak_EntityImpl
