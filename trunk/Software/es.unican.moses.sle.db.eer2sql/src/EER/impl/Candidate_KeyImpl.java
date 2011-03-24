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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Candidate Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.Candidate_KeyImpl#getCandidate_Key_Attribute <em>Candidate Key Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Candidate_KeyImpl extends ConstraintImpl implements Candidate_Key {
	/**
	 * The cached value of the '{@link #getCandidate_Key_Attribute() <em>Candidate Key Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidate_Key_Attribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute candidate_Key_Attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Candidate_KeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.CANDIDATE_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getCandidate_Key_Attribute() {
		if (candidate_Key_Attribute != null && candidate_Key_Attribute.eIsProxy()) {
			InternalEObject oldCandidate_Key_Attribute = (InternalEObject)candidate_Key_Attribute;
			candidate_Key_Attribute = (Attribute)eResolveProxy(oldCandidate_Key_Attribute);
			if (candidate_Key_Attribute != oldCandidate_Key_Attribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EERPackage.CANDIDATE_KEY__CANDIDATE_KEY_ATTRIBUTE, oldCandidate_Key_Attribute, candidate_Key_Attribute));
			}
		}
		return candidate_Key_Attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetCandidate_Key_Attribute() {
		return candidate_Key_Attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCandidate_Key_Attribute(Attribute newCandidate_Key_Attribute) {
		Attribute oldCandidate_Key_Attribute = candidate_Key_Attribute;
		candidate_Key_Attribute = newCandidate_Key_Attribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.CANDIDATE_KEY__CANDIDATE_KEY_ATTRIBUTE, oldCandidate_Key_Attribute, candidate_Key_Attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EERPackage.CANDIDATE_KEY__CANDIDATE_KEY_ATTRIBUTE:
				if (resolve) return getCandidate_Key_Attribute();
				return basicGetCandidate_Key_Attribute();
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
			case EERPackage.CANDIDATE_KEY__CANDIDATE_KEY_ATTRIBUTE:
				setCandidate_Key_Attribute((Attribute)newValue);
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
			case EERPackage.CANDIDATE_KEY__CANDIDATE_KEY_ATTRIBUTE:
				setCandidate_Key_Attribute((Attribute)null);
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
			case EERPackage.CANDIDATE_KEY__CANDIDATE_KEY_ATTRIBUTE:
				return candidate_Key_Attribute != null;
		}
		return super.eIsSet(featureID);
	}

} //Candidate_KeyImpl
