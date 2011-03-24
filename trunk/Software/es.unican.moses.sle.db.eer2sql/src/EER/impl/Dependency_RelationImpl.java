/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.Dependency_Relation;
import EER.Dependency_Type;
import EER.EERPackage;
import EER.Line_Dependence;

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
 * An implementation of the model object '<em><b>Dependency Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.Dependency_RelationImpl#getType <em>Type</em>}</li>
 *   <li>{@link EER.impl.Dependency_RelationImpl#getDependency_Rel_Line_Dep <em>Dependency Rel Line Dep</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Dependency_RelationImpl extends Abstract_RelationImpl implements Dependency_Relation {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Dependency_Type TYPE_EDEFAULT = Dependency_Type.ID;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Dependency_Type type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependency_Rel_Line_Dep() <em>Dependency Rel Line Dep</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency_Rel_Line_Dep()
	 * @generated
	 * @ordered
	 */
	protected EList<Line_Dependence> dependency_Rel_Line_Dep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dependency_RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.DEPENDENCY_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency_Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Dependency_Type newType) {
		Dependency_Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.DEPENDENCY_RELATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line_Dependence> getDependency_Rel_Line_Dep() {
		if (dependency_Rel_Line_Dep == null) {
			dependency_Rel_Line_Dep = new EObjectContainmentEList<Line_Dependence>(Line_Dependence.class, this, EERPackage.DEPENDENCY_RELATION__DEPENDENCY_REL_LINE_DEP);
		}
		return dependency_Rel_Line_Dep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EERPackage.DEPENDENCY_RELATION__DEPENDENCY_REL_LINE_DEP:
				return ((InternalEList<?>)getDependency_Rel_Line_Dep()).basicRemove(otherEnd, msgs);
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
			case EERPackage.DEPENDENCY_RELATION__TYPE:
				return getType();
			case EERPackage.DEPENDENCY_RELATION__DEPENDENCY_REL_LINE_DEP:
				return getDependency_Rel_Line_Dep();
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
			case EERPackage.DEPENDENCY_RELATION__TYPE:
				setType((Dependency_Type)newValue);
				return;
			case EERPackage.DEPENDENCY_RELATION__DEPENDENCY_REL_LINE_DEP:
				getDependency_Rel_Line_Dep().clear();
				getDependency_Rel_Line_Dep().addAll((Collection<? extends Line_Dependence>)newValue);
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
			case EERPackage.DEPENDENCY_RELATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EERPackage.DEPENDENCY_RELATION__DEPENDENCY_REL_LINE_DEP:
				getDependency_Rel_Line_Dep().clear();
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
			case EERPackage.DEPENDENCY_RELATION__TYPE:
				return type != TYPE_EDEFAULT;
			case EERPackage.DEPENDENCY_RELATION__DEPENDENCY_REL_LINE_DEP:
				return dependency_Rel_Line_Dep != null && !dependency_Rel_Line_Dep.isEmpty();
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

} //Dependency_RelationImpl
