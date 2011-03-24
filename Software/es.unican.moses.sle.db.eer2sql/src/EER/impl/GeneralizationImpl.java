/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.Attribute;
import EER.Child_Entity;
import EER.EERPackage;
import EER.Generalization;
import EER.Generalization_Type;
import EER.Line_Generalization;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.GeneralizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link EER.impl.GeneralizationImpl#getType <em>Type</em>}</li>
 *   <li>{@link EER.impl.GeneralizationImpl#getGeneralization_Child_Ent <em>Generalization Child Ent</em>}</li>
 *   <li>{@link EER.impl.GeneralizationImpl#getGeneralization_Attribute <em>Generalization Attribute</em>}</li>
 *   <li>{@link EER.impl.GeneralizationImpl#getGeneralization_Line_Gen <em>Generalization Line Gen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationImpl extends EObjectImpl implements Generalization {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Generalization_Type TYPE_EDEFAULT = Generalization_Type.TOTAL_OVERLAPPING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Generalization_Type type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneralization_Child_Ent() <em>Generalization Child Ent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization_Child_Ent()
	 * @generated
	 * @ordered
	 */
	protected EList<Child_Entity> generalization_Child_Ent;

	/**
	 * The cached value of the '{@link #getGeneralization_Attribute() <em>Generalization Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization_Attribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute generalization_Attribute;

	/**
	 * The cached value of the '{@link #getGeneralization_Line_Gen() <em>Generalization Line Gen</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization_Line_Gen()
	 * @generated
	 * @ordered
	 */
	protected EList<Line_Generalization> generalization_Line_Gen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.GENERALIZATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.GENERALIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization_Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Generalization_Type newType) {
		Generalization_Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.GENERALIZATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Child_Entity> getGeneralization_Child_Ent() {
		if (generalization_Child_Ent == null) {
			generalization_Child_Ent = new EObjectContainmentEList<Child_Entity>(Child_Entity.class, this, EERPackage.GENERALIZATION__GENERALIZATION_CHILD_ENT);
		}
		return generalization_Child_Ent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getGeneralization_Attribute() {
		return generalization_Attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralization_Attribute(Attribute newGeneralization_Attribute, NotificationChain msgs) {
		Attribute oldGeneralization_Attribute = generalization_Attribute;
		generalization_Attribute = newGeneralization_Attribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EERPackage.GENERALIZATION__GENERALIZATION_ATTRIBUTE, oldGeneralization_Attribute, newGeneralization_Attribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralization_Attribute(Attribute newGeneralization_Attribute) {
		if (newGeneralization_Attribute != generalization_Attribute) {
			NotificationChain msgs = null;
			if (generalization_Attribute != null)
				msgs = ((InternalEObject)generalization_Attribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EERPackage.GENERALIZATION__GENERALIZATION_ATTRIBUTE, null, msgs);
			if (newGeneralization_Attribute != null)
				msgs = ((InternalEObject)newGeneralization_Attribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EERPackage.GENERALIZATION__GENERALIZATION_ATTRIBUTE, null, msgs);
			msgs = basicSetGeneralization_Attribute(newGeneralization_Attribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.GENERALIZATION__GENERALIZATION_ATTRIBUTE, newGeneralization_Attribute, newGeneralization_Attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line_Generalization> getGeneralization_Line_Gen() {
		if (generalization_Line_Gen == null) {
			generalization_Line_Gen = new EObjectResolvingEList<Line_Generalization>(Line_Generalization.class, this, EERPackage.GENERALIZATION__GENERALIZATION_LINE_GEN);
		}
		return generalization_Line_Gen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EERPackage.GENERALIZATION__GENERALIZATION_CHILD_ENT:
				return ((InternalEList<?>)getGeneralization_Child_Ent()).basicRemove(otherEnd, msgs);
			case EERPackage.GENERALIZATION__GENERALIZATION_ATTRIBUTE:
				return basicSetGeneralization_Attribute(null, msgs);
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
			case EERPackage.GENERALIZATION__NAME:
				return getName();
			case EERPackage.GENERALIZATION__TYPE:
				return getType();
			case EERPackage.GENERALIZATION__GENERALIZATION_CHILD_ENT:
				return getGeneralization_Child_Ent();
			case EERPackage.GENERALIZATION__GENERALIZATION_ATTRIBUTE:
				return getGeneralization_Attribute();
			case EERPackage.GENERALIZATION__GENERALIZATION_LINE_GEN:
				return getGeneralization_Line_Gen();
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
			case EERPackage.GENERALIZATION__NAME:
				setName((String)newValue);
				return;
			case EERPackage.GENERALIZATION__TYPE:
				setType((Generalization_Type)newValue);
				return;
			case EERPackage.GENERALIZATION__GENERALIZATION_CHILD_ENT:
				getGeneralization_Child_Ent().clear();
				getGeneralization_Child_Ent().addAll((Collection<? extends Child_Entity>)newValue);
				return;
			case EERPackage.GENERALIZATION__GENERALIZATION_ATTRIBUTE:
				setGeneralization_Attribute((Attribute)newValue);
				return;
			case EERPackage.GENERALIZATION__GENERALIZATION_LINE_GEN:
				getGeneralization_Line_Gen().clear();
				getGeneralization_Line_Gen().addAll((Collection<? extends Line_Generalization>)newValue);
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
			case EERPackage.GENERALIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EERPackage.GENERALIZATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EERPackage.GENERALIZATION__GENERALIZATION_CHILD_ENT:
				getGeneralization_Child_Ent().clear();
				return;
			case EERPackage.GENERALIZATION__GENERALIZATION_ATTRIBUTE:
				setGeneralization_Attribute((Attribute)null);
				return;
			case EERPackage.GENERALIZATION__GENERALIZATION_LINE_GEN:
				getGeneralization_Line_Gen().clear();
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
			case EERPackage.GENERALIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EERPackage.GENERALIZATION__TYPE:
				return type != TYPE_EDEFAULT;
			case EERPackage.GENERALIZATION__GENERALIZATION_CHILD_ENT:
				return generalization_Child_Ent != null && !generalization_Child_Ent.isEmpty();
			case EERPackage.GENERALIZATION__GENERALIZATION_ATTRIBUTE:
				return generalization_Attribute != null;
			case EERPackage.GENERALIZATION__GENERALIZATION_LINE_GEN:
				return generalization_Line_Gen != null && !generalization_Line_Gen.isEmpty();
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
		result.append(", Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //GeneralizationImpl
