/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.EERPackage;
import EER.Line_Generalization;
import EER.Member_Collection;

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
 *   <li>{@link EER.impl.Member_CollectionImpl#getMC_Line_Gen <em>MC Line Gen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Member_CollectionImpl extends AggregationImpl implements Member_Collection {
	/**
	 * The cached value of the '{@link #getMC_Line_Gen() <em>MC Line Gen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMC_Line_Gen()
	 * @generated
	 * @ordered
	 */
	protected Line_Generalization mC_Line_Gen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Member_CollectionImpl() {
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
	public Line_Generalization getMC_Line_Gen() {
		return mC_Line_Gen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMC_Line_Gen(Line_Generalization newMC_Line_Gen, NotificationChain msgs) {
		Line_Generalization oldMC_Line_Gen = mC_Line_Gen;
		mC_Line_Gen = newMC_Line_Gen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EERPackage.MEMBER_COLLECTION__MC_LINE_GEN, oldMC_Line_Gen, newMC_Line_Gen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMC_Line_Gen(Line_Generalization newMC_Line_Gen) {
		if (newMC_Line_Gen != mC_Line_Gen) {
			NotificationChain msgs = null;
			if (mC_Line_Gen != null)
				msgs = ((InternalEObject)mC_Line_Gen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EERPackage.MEMBER_COLLECTION__MC_LINE_GEN, null, msgs);
			if (newMC_Line_Gen != null)
				msgs = ((InternalEObject)newMC_Line_Gen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EERPackage.MEMBER_COLLECTION__MC_LINE_GEN, null, msgs);
			msgs = basicSetMC_Line_Gen(newMC_Line_Gen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.MEMBER_COLLECTION__MC_LINE_GEN, newMC_Line_Gen, newMC_Line_Gen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EERPackage.MEMBER_COLLECTION__MC_LINE_GEN:
				return basicSetMC_Line_Gen(null, msgs);
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
			case EERPackage.MEMBER_COLLECTION__MC_LINE_GEN:
				return getMC_Line_Gen();
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
			case EERPackage.MEMBER_COLLECTION__MC_LINE_GEN:
				setMC_Line_Gen((Line_Generalization)newValue);
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
			case EERPackage.MEMBER_COLLECTION__MC_LINE_GEN:
				setMC_Line_Gen((Line_Generalization)null);
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
			case EERPackage.MEMBER_COLLECTION__MC_LINE_GEN:
				return mC_Line_Gen != null;
		}
		return super.eIsSet(featureID);
	}

} //Member_CollectionImpl
