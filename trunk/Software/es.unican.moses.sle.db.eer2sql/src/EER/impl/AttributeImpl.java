/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.Attribute;
import EER.EERPackage;
import EER.Generalization;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link EER.impl.AttributeImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link EER.impl.AttributeImpl#getAttribute_Generalization <em>Attribute Generalization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends EObjectImpl implements Attribute {
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
	 * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected boolean nullable = NULLABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttribute_Generalization() <em>Attribute Generalization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute_Generalization()
	 * @generated
	 * @ordered
	 */
	protected Generalization attribute_Generalization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNullable() {
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullable(boolean newNullable) {
		boolean oldNullable = nullable;
		nullable = newNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.ATTRIBUTE__NULLABLE, oldNullable, nullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getAttribute_Generalization() {
		return attribute_Generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribute_Generalization(Generalization newAttribute_Generalization, NotificationChain msgs) {
		Generalization oldAttribute_Generalization = attribute_Generalization;
		attribute_Generalization = newAttribute_Generalization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EERPackage.ATTRIBUTE__ATTRIBUTE_GENERALIZATION, oldAttribute_Generalization, newAttribute_Generalization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute_Generalization(Generalization newAttribute_Generalization) {
		if (newAttribute_Generalization != attribute_Generalization) {
			NotificationChain msgs = null;
			if (attribute_Generalization != null)
				msgs = ((InternalEObject)attribute_Generalization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EERPackage.ATTRIBUTE__ATTRIBUTE_GENERALIZATION, null, msgs);
			if (newAttribute_Generalization != null)
				msgs = ((InternalEObject)newAttribute_Generalization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EERPackage.ATTRIBUTE__ATTRIBUTE_GENERALIZATION, null, msgs);
			msgs = basicSetAttribute_Generalization(newAttribute_Generalization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.ATTRIBUTE__ATTRIBUTE_GENERALIZATION, newAttribute_Generalization, newAttribute_Generalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EERPackage.ATTRIBUTE__ATTRIBUTE_GENERALIZATION:
				return basicSetAttribute_Generalization(null, msgs);
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
			case EERPackage.ATTRIBUTE__NAME:
				return getName();
			case EERPackage.ATTRIBUTE__NULLABLE:
				return isNullable();
			case EERPackage.ATTRIBUTE__ATTRIBUTE_GENERALIZATION:
				return getAttribute_Generalization();
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
			case EERPackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case EERPackage.ATTRIBUTE__NULLABLE:
				setNullable((Boolean)newValue);
				return;
			case EERPackage.ATTRIBUTE__ATTRIBUTE_GENERALIZATION:
				setAttribute_Generalization((Generalization)newValue);
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
			case EERPackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EERPackage.ATTRIBUTE__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
				return;
			case EERPackage.ATTRIBUTE__ATTRIBUTE_GENERALIZATION:
				setAttribute_Generalization((Generalization)null);
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
			case EERPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EERPackage.ATTRIBUTE__NULLABLE:
				return nullable != NULLABLE_EDEFAULT;
			case EERPackage.ATTRIBUTE__ATTRIBUTE_GENERALIZATION:
				return attribute_Generalization != null;
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
		result.append(", Nullable: ");
		result.append(nullable);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
