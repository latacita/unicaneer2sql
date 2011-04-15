/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.AggregationParticipant;
import EER.EERPackage;
import EER.MemberCollection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.MemberCollectionImpl#getParticipant <em>Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemberCollectionImpl extends AggregationImpl implements MemberCollection {
	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected AggregationParticipant participant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.MEMBER_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationParticipant getParticipant() {
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipant(AggregationParticipant newParticipant, NotificationChain msgs) {
		AggregationParticipant oldParticipant = participant;
		participant = newParticipant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EERPackage.MEMBER_COLLECTION__PARTICIPANT, oldParticipant, newParticipant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipant(AggregationParticipant newParticipant) {
		if (newParticipant != participant) {
			NotificationChain msgs = null;
			if (participant != null)
				msgs = ((InternalEObject)participant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EERPackage.MEMBER_COLLECTION__PARTICIPANT, null, msgs);
			if (newParticipant != null)
				msgs = ((InternalEObject)newParticipant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EERPackage.MEMBER_COLLECTION__PARTICIPANT, null, msgs);
			msgs = basicSetParticipant(newParticipant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.MEMBER_COLLECTION__PARTICIPANT, newParticipant, newParticipant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EERPackage.MEMBER_COLLECTION__PARTICIPANT:
				return basicSetParticipant(null, msgs);
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
			case EERPackage.MEMBER_COLLECTION__PARTICIPANT:
				return getParticipant();
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
			case EERPackage.MEMBER_COLLECTION__PARTICIPANT:
				setParticipant((AggregationParticipant)newValue);
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
			case EERPackage.MEMBER_COLLECTION__PARTICIPANT:
				setParticipant((AggregationParticipant)null);
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
			case EERPackage.MEMBER_COLLECTION__PARTICIPANT:
				return participant != null;
		}
		return super.eIsSet(featureID);
	}

} //MemberCollectionImpl
