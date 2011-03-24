/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.Attribute;
import EER.EERPackage;
import EER.Line_Relationship;
import EER.Relationship;
import EER.Relationship_Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.RelationshipImpl#getRelationship_Line_Rel <em>Relationship Line Rel</em>}</li>
 *   <li>{@link EER.impl.RelationshipImpl#getRelationship_Attribute <em>Relationship Attribute</em>}</li>
 *   <li>{@link EER.impl.RelationshipImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends Abstract_RelationImpl implements Relationship {
	/**
	 * The cached value of the '{@link #getRelationship_Line_Rel() <em>Relationship Line Rel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship_Line_Rel()
	 * @generated
	 * @ordered
	 */
	protected EList<Line_Relationship> relationship_Line_Rel;

	/**
	 * The cached value of the '{@link #getRelationship_Attribute() <em>Relationship Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship_Attribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> relationship_Attribute;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Relationship_Type TYPE_EDEFAULT = Relationship_Type.STRONG;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Relationship_Type type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line_Relationship> getRelationship_Line_Rel() {
		if (relationship_Line_Rel == null) {
			relationship_Line_Rel = new EObjectContainmentEList<Line_Relationship>(Line_Relationship.class, this, EERPackage.RELATIONSHIP__RELATIONSHIP_LINE_REL);
		}
		return relationship_Line_Rel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getRelationship_Attribute() {
		if (relationship_Attribute == null) {
			relationship_Attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, EERPackage.RELATIONSHIP__RELATIONSHIP_ATTRIBUTE);
		}
		return relationship_Attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship_Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Relationship_Type newType) {
		Relationship_Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.RELATIONSHIP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EERPackage.RELATIONSHIP__RELATIONSHIP_LINE_REL:
				return ((InternalEList<?>)getRelationship_Line_Rel()).basicRemove(otherEnd, msgs);
			case EERPackage.RELATIONSHIP__RELATIONSHIP_ATTRIBUTE:
				return ((InternalEList<?>)getRelationship_Attribute()).basicRemove(otherEnd, msgs);
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
			case EERPackage.RELATIONSHIP__RELATIONSHIP_LINE_REL:
				return getRelationship_Line_Rel();
			case EERPackage.RELATIONSHIP__RELATIONSHIP_ATTRIBUTE:
				return getRelationship_Attribute();
			case EERPackage.RELATIONSHIP__TYPE:
				return getType();
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
			case EERPackage.RELATIONSHIP__RELATIONSHIP_LINE_REL:
				getRelationship_Line_Rel().clear();
				getRelationship_Line_Rel().addAll((Collection<? extends Line_Relationship>)newValue);
				return;
			case EERPackage.RELATIONSHIP__RELATIONSHIP_ATTRIBUTE:
				getRelationship_Attribute().clear();
				getRelationship_Attribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case EERPackage.RELATIONSHIP__TYPE:
				setType((Relationship_Type)newValue);
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
			case EERPackage.RELATIONSHIP__RELATIONSHIP_LINE_REL:
				getRelationship_Line_Rel().clear();
				return;
			case EERPackage.RELATIONSHIP__RELATIONSHIP_ATTRIBUTE:
				getRelationship_Attribute().clear();
				return;
			case EERPackage.RELATIONSHIP__TYPE:
				setType(TYPE_EDEFAULT);
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
			case EERPackage.RELATIONSHIP__RELATIONSHIP_LINE_REL:
				return relationship_Line_Rel != null && !relationship_Line_Rel.isEmpty();
			case EERPackage.RELATIONSHIP__RELATIONSHIP_ATTRIBUTE:
				return relationship_Attribute != null && !relationship_Attribute.isEmpty();
			case EERPackage.RELATIONSHIP__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl
