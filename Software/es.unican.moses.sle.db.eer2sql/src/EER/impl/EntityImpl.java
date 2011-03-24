/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.Attribute;
import EER.Candidate_Key;
import EER.EERPackage;
import EER.Entity;
import EER.Primary_Key;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link EER.impl.EntityImpl#getEntity_Primary_Key <em>Entity Primary Key</em>}</li>
 *   <li>{@link EER.impl.EntityImpl#getEntity_Candidate_Key <em>Entity Candidate Key</em>}</li>
 *   <li>{@link EER.impl.EntityImpl#getEntity_Attribute <em>Entity Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends EObjectImpl implements Entity {
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
	 * The cached value of the '{@link #getEntity_Primary_Key() <em>Entity Primary Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity_Primary_Key()
	 * @generated
	 * @ordered
	 */
	protected Primary_Key entity_Primary_Key;

	/**
	 * The cached value of the '{@link #getEntity_Candidate_Key() <em>Entity Candidate Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity_Candidate_Key()
	 * @generated
	 * @ordered
	 */
	protected EList<Candidate_Key> entity_Candidate_Key;

	/**
	 * The cached value of the '{@link #getEntity_Attribute() <em>Entity Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity_Attribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> entity_Attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primary_Key getEntity_Primary_Key() {
		return entity_Primary_Key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity_Primary_Key(Primary_Key newEntity_Primary_Key, NotificationChain msgs) {
		Primary_Key oldEntity_Primary_Key = entity_Primary_Key;
		entity_Primary_Key = newEntity_Primary_Key;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EERPackage.ENTITY__ENTITY_PRIMARY_KEY, oldEntity_Primary_Key, newEntity_Primary_Key);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity_Primary_Key(Primary_Key newEntity_Primary_Key) {
		if (newEntity_Primary_Key != entity_Primary_Key) {
			NotificationChain msgs = null;
			if (entity_Primary_Key != null)
				msgs = ((InternalEObject)entity_Primary_Key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EERPackage.ENTITY__ENTITY_PRIMARY_KEY, null, msgs);
			if (newEntity_Primary_Key != null)
				msgs = ((InternalEObject)newEntity_Primary_Key).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EERPackage.ENTITY__ENTITY_PRIMARY_KEY, null, msgs);
			msgs = basicSetEntity_Primary_Key(newEntity_Primary_Key, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.ENTITY__ENTITY_PRIMARY_KEY, newEntity_Primary_Key, newEntity_Primary_Key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Candidate_Key> getEntity_Candidate_Key() {
		if (entity_Candidate_Key == null) {
			entity_Candidate_Key = new EObjectContainmentEList<Candidate_Key>(Candidate_Key.class, this, EERPackage.ENTITY__ENTITY_CANDIDATE_KEY);
		}
		return entity_Candidate_Key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getEntity_Attribute() {
		if (entity_Attribute == null) {
			entity_Attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, EERPackage.ENTITY__ENTITY_ATTRIBUTE);
		}
		return entity_Attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EERPackage.ENTITY__ENTITY_PRIMARY_KEY:
				return basicSetEntity_Primary_Key(null, msgs);
			case EERPackage.ENTITY__ENTITY_CANDIDATE_KEY:
				return ((InternalEList<?>)getEntity_Candidate_Key()).basicRemove(otherEnd, msgs);
			case EERPackage.ENTITY__ENTITY_ATTRIBUTE:
				return ((InternalEList<?>)getEntity_Attribute()).basicRemove(otherEnd, msgs);
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
			case EERPackage.ENTITY__NAME:
				return getName();
			case EERPackage.ENTITY__ENTITY_PRIMARY_KEY:
				return getEntity_Primary_Key();
			case EERPackage.ENTITY__ENTITY_CANDIDATE_KEY:
				return getEntity_Candidate_Key();
			case EERPackage.ENTITY__ENTITY_ATTRIBUTE:
				return getEntity_Attribute();
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
			case EERPackage.ENTITY__NAME:
				setName((String)newValue);
				return;
			case EERPackage.ENTITY__ENTITY_PRIMARY_KEY:
				setEntity_Primary_Key((Primary_Key)newValue);
				return;
			case EERPackage.ENTITY__ENTITY_CANDIDATE_KEY:
				getEntity_Candidate_Key().clear();
				getEntity_Candidate_Key().addAll((Collection<? extends Candidate_Key>)newValue);
				return;
			case EERPackage.ENTITY__ENTITY_ATTRIBUTE:
				getEntity_Attribute().clear();
				getEntity_Attribute().addAll((Collection<? extends Attribute>)newValue);
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
			case EERPackage.ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EERPackage.ENTITY__ENTITY_PRIMARY_KEY:
				setEntity_Primary_Key((Primary_Key)null);
				return;
			case EERPackage.ENTITY__ENTITY_CANDIDATE_KEY:
				getEntity_Candidate_Key().clear();
				return;
			case EERPackage.ENTITY__ENTITY_ATTRIBUTE:
				getEntity_Attribute().clear();
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
			case EERPackage.ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EERPackage.ENTITY__ENTITY_PRIMARY_KEY:
				return entity_Primary_Key != null;
			case EERPackage.ENTITY__ENTITY_CANDIDATE_KEY:
				return entity_Candidate_Key != null && !entity_Candidate_Key.isEmpty();
			case EERPackage.ENTITY__ENTITY_ATTRIBUTE:
				return entity_Attribute != null && !entity_Attribute.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
