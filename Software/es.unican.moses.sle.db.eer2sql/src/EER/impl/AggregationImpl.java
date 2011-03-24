/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.Aggregation;
import EER.EERPackage;
import EER.Entity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.AggregationImpl#getAggregation_Entity <em>Aggregation Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregationImpl extends EObjectImpl implements Aggregation {
	/**
	 * The cached value of the '{@link #getAggregation_Entity() <em>Aggregation Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation_Entity()
	 * @generated
	 * @ordered
	 */
	protected Entity aggregation_Entity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.AGGREGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getAggregation_Entity() {
		if (aggregation_Entity != null && aggregation_Entity.eIsProxy()) {
			InternalEObject oldAggregation_Entity = (InternalEObject)aggregation_Entity;
			aggregation_Entity = (Entity)eResolveProxy(oldAggregation_Entity);
			if (aggregation_Entity != oldAggregation_Entity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EERPackage.AGGREGATION__AGGREGATION_ENTITY, oldAggregation_Entity, aggregation_Entity));
			}
		}
		return aggregation_Entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetAggregation_Entity() {
		return aggregation_Entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregation_Entity(Entity newAggregation_Entity) {
		Entity oldAggregation_Entity = aggregation_Entity;
		aggregation_Entity = newAggregation_Entity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.AGGREGATION__AGGREGATION_ENTITY, oldAggregation_Entity, aggregation_Entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EERPackage.AGGREGATION__AGGREGATION_ENTITY:
				if (resolve) return getAggregation_Entity();
				return basicGetAggregation_Entity();
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
			case EERPackage.AGGREGATION__AGGREGATION_ENTITY:
				setAggregation_Entity((Entity)newValue);
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
			case EERPackage.AGGREGATION__AGGREGATION_ENTITY:
				setAggregation_Entity((Entity)null);
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
			case EERPackage.AGGREGATION__AGGREGATION_ENTITY:
				return aggregation_Entity != null;
		}
		return super.eIsSet(featureID);
	}

} //AggregationImpl
