/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.Domain;
import EER.EERPackage;
import EER.Multiplicity;
import EER.Single_Attribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.Single_AttributeImpl#isDerivate <em>Derivate</em>}</li>
 *   <li>{@link EER.impl.Single_AttributeImpl#getSingle_Att_Domain <em>Single Att Domain</em>}</li>
 *   <li>{@link EER.impl.Single_AttributeImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Single_AttributeImpl extends AttributeImpl implements Single_Attribute {
	/**
	 * The default value of the '{@link #isDerivate() <em>Derivate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerivate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DERIVATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDerivate() <em>Derivate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerivate()
	 * @generated
	 * @ordered
	 */
	protected boolean derivate = DERIVATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSingle_Att_Domain() <em>Single Att Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingle_Att_Domain()
	 * @generated
	 * @ordered
	 */
	protected Domain single_Att_Domain;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity multiplicity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Single_AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.SINGLE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerivate() {
		return derivate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivate(boolean newDerivate) {
		boolean oldDerivate = derivate;
		derivate = newDerivate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.SINGLE_ATTRIBUTE__DERIVATE, oldDerivate, derivate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getSingle_Att_Domain() {
		if (single_Att_Domain != null && single_Att_Domain.eIsProxy()) {
			InternalEObject oldSingle_Att_Domain = (InternalEObject)single_Att_Domain;
			single_Att_Domain = (Domain)eResolveProxy(oldSingle_Att_Domain);
			if (single_Att_Domain != oldSingle_Att_Domain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EERPackage.SINGLE_ATTRIBUTE__SINGLE_ATT_DOMAIN, oldSingle_Att_Domain, single_Att_Domain));
			}
		}
		return single_Att_Domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain basicGetSingle_Att_Domain() {
		return single_Att_Domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingle_Att_Domain(Domain newSingle_Att_Domain) {
		Domain oldSingle_Att_Domain = single_Att_Domain;
		single_Att_Domain = newSingle_Att_Domain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.SINGLE_ATTRIBUTE__SINGLE_ATT_DOMAIN, oldSingle_Att_Domain, single_Att_Domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity getMultiplicity() {
		if (multiplicity != null && multiplicity.eIsProxy()) {
			InternalEObject oldMultiplicity = (InternalEObject)multiplicity;
			multiplicity = (Multiplicity)eResolveProxy(oldMultiplicity);
			if (multiplicity != oldMultiplicity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EERPackage.SINGLE_ATTRIBUTE__MULTIPLICITY, oldMultiplicity, multiplicity));
			}
		}
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity basicGetMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(Multiplicity newMultiplicity) {
		Multiplicity oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.SINGLE_ATTRIBUTE__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EERPackage.SINGLE_ATTRIBUTE__DERIVATE:
				return isDerivate();
			case EERPackage.SINGLE_ATTRIBUTE__SINGLE_ATT_DOMAIN:
				if (resolve) return getSingle_Att_Domain();
				return basicGetSingle_Att_Domain();
			case EERPackage.SINGLE_ATTRIBUTE__MULTIPLICITY:
				if (resolve) return getMultiplicity();
				return basicGetMultiplicity();
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
			case EERPackage.SINGLE_ATTRIBUTE__DERIVATE:
				setDerivate((Boolean)newValue);
				return;
			case EERPackage.SINGLE_ATTRIBUTE__SINGLE_ATT_DOMAIN:
				setSingle_Att_Domain((Domain)newValue);
				return;
			case EERPackage.SINGLE_ATTRIBUTE__MULTIPLICITY:
				setMultiplicity((Multiplicity)newValue);
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
			case EERPackage.SINGLE_ATTRIBUTE__DERIVATE:
				setDerivate(DERIVATE_EDEFAULT);
				return;
			case EERPackage.SINGLE_ATTRIBUTE__SINGLE_ATT_DOMAIN:
				setSingle_Att_Domain((Domain)null);
				return;
			case EERPackage.SINGLE_ATTRIBUTE__MULTIPLICITY:
				setMultiplicity((Multiplicity)null);
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
			case EERPackage.SINGLE_ATTRIBUTE__DERIVATE:
				return derivate != DERIVATE_EDEFAULT;
			case EERPackage.SINGLE_ATTRIBUTE__SINGLE_ATT_DOMAIN:
				return single_Att_Domain != null;
			case EERPackage.SINGLE_ATTRIBUTE__MULTIPLICITY:
				return multiplicity != null;
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
		result.append(" (Derivate: ");
		result.append(derivate);
		result.append(')');
		return result.toString();
	}

} //Single_AttributeImpl
