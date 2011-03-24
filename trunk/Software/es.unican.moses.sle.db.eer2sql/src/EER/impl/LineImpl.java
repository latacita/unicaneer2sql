/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.EERPackage;
import EER.Entity;
import EER.Line;

import java.util.calendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.LineImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link EER.impl.LineImpl#getRol <em>Rol</em>}</li>
 *   <li>{@link EER.impl.LineImpl#getLine_Entity <em>Line Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineImpl extends EObjectImpl implements Line {
	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final int CARDINALITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected int cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRol() <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected static final String ROL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRol() <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected String rol = ROL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLine_Entity() <em>Line Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine_Entity()
	 * @generated
	 * @ordered
	 */
	protected Entity line_Entity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(int newCardinality) {
		int oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.LINE__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRol() {
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRol(String newRol) {
		String oldRol = rol;
		rol = newRol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.LINE__ROL, oldRol, rol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getLine_Entity() {
		if (line_Entity != null && line_Entity.eIsProxy()) {
			InternalEObject oldLine_Entity = (InternalEObject)line_Entity;
			line_Entity = (Entity)eResolveProxy(oldLine_Entity);
			if (line_Entity != oldLine_Entity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EERPackage.LINE__LINE_ENTITY, oldLine_Entity, line_Entity));
			}
		}
		return line_Entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetLine_Entity() {
		return line_Entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine_Entity(Entity newLine_Entity) {
		Entity oldLine_Entity = line_Entity;
		line_Entity = newLine_Entity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.LINE__LINE_ENTITY, oldLine_Entity, line_Entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EERPackage.LINE__CARDINALITY:
				return getCardinality();
			case EERPackage.LINE__ROL:
				return getRol();
			case EERPackage.LINE__LINE_ENTITY:
				if (resolve) return getLine_Entity();
				return basicGetLine_Entity();
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
			case EERPackage.LINE__CARDINALITY:
				setCardinality((Integer)newValue);
				return;
			case EERPackage.LINE__ROL:
				setRol((String)newValue);
				return;
			case EERPackage.LINE__LINE_ENTITY:
				setLine_Entity((Entity)newValue);
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
			case EERPackage.LINE__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case EERPackage.LINE__ROL:
				setRol(ROL_EDEFAULT);
				return;
			case EERPackage.LINE__LINE_ENTITY:
				setLine_Entity((Entity)null);
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
			case EERPackage.LINE__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case EERPackage.LINE__ROL:
				return ROL_EDEFAULT == null ? rol != null : !ROL_EDEFAULT.equals(rol);
			case EERPackage.LINE__LINE_ENTITY:
				return line_Entity != null;
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
		result.append(" (Cardinality: ");
		result.append(cardinality);
		result.append(", Rol: ");
		result.append(rol);
		result.append(')');
		return result.toString();
	}

} //LineImpl
