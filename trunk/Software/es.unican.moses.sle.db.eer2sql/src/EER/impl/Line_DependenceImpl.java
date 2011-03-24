/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.Child_Entity;
import EER.Dependency_Relation;
import EER.EERPackage;
import EER.Line_Dependence;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Dependence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.Line_DependenceImpl#getLine_Dep_Dependency_Rel <em>Line Dep Dependency Rel</em>}</li>
 *   <li>{@link EER.impl.Line_DependenceImpl#getLine_Dep_Child_Ent <em>Line Dep Child Ent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Line_DependenceImpl extends LineImpl implements Line_Dependence {
	/**
	 * The cached value of the '{@link #getLine_Dep_Dependency_Rel() <em>Line Dep Dependency Rel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine_Dep_Dependency_Rel()
	 * @generated
	 * @ordered
	 */
	protected Dependency_Relation line_Dep_Dependency_Rel;

	/**
	 * The cached value of the '{@link #getLine_Dep_Child_Ent() <em>Line Dep Child Ent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine_Dep_Child_Ent()
	 * @generated
	 * @ordered
	 */
	protected Child_Entity line_Dep_Child_Ent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Line_DependenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.LINE_DEPENDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency_Relation getLine_Dep_Dependency_Rel() {
		if (line_Dep_Dependency_Rel != null && line_Dep_Dependency_Rel.eIsProxy()) {
			InternalEObject oldLine_Dep_Dependency_Rel = (InternalEObject)line_Dep_Dependency_Rel;
			line_Dep_Dependency_Rel = (Dependency_Relation)eResolveProxy(oldLine_Dep_Dependency_Rel);
			if (line_Dep_Dependency_Rel != oldLine_Dep_Dependency_Rel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EERPackage.LINE_DEPENDENCE__LINE_DEP_DEPENDENCY_REL, oldLine_Dep_Dependency_Rel, line_Dep_Dependency_Rel));
			}
		}
		return line_Dep_Dependency_Rel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency_Relation basicGetLine_Dep_Dependency_Rel() {
		return line_Dep_Dependency_Rel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine_Dep_Dependency_Rel(Dependency_Relation newLine_Dep_Dependency_Rel) {
		Dependency_Relation oldLine_Dep_Dependency_Rel = line_Dep_Dependency_Rel;
		line_Dep_Dependency_Rel = newLine_Dep_Dependency_Rel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.LINE_DEPENDENCE__LINE_DEP_DEPENDENCY_REL, oldLine_Dep_Dependency_Rel, line_Dep_Dependency_Rel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Child_Entity getLine_Dep_Child_Ent() {
		if (line_Dep_Child_Ent != null && line_Dep_Child_Ent.eIsProxy()) {
			InternalEObject oldLine_Dep_Child_Ent = (InternalEObject)line_Dep_Child_Ent;
			line_Dep_Child_Ent = (Child_Entity)eResolveProxy(oldLine_Dep_Child_Ent);
			if (line_Dep_Child_Ent != oldLine_Dep_Child_Ent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EERPackage.LINE_DEPENDENCE__LINE_DEP_CHILD_ENT, oldLine_Dep_Child_Ent, line_Dep_Child_Ent));
			}
		}
		return line_Dep_Child_Ent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Child_Entity basicGetLine_Dep_Child_Ent() {
		return line_Dep_Child_Ent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine_Dep_Child_Ent(Child_Entity newLine_Dep_Child_Ent) {
		Child_Entity oldLine_Dep_Child_Ent = line_Dep_Child_Ent;
		line_Dep_Child_Ent = newLine_Dep_Child_Ent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.LINE_DEPENDENCE__LINE_DEP_CHILD_ENT, oldLine_Dep_Child_Ent, line_Dep_Child_Ent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EERPackage.LINE_DEPENDENCE__LINE_DEP_DEPENDENCY_REL:
				if (resolve) return getLine_Dep_Dependency_Rel();
				return basicGetLine_Dep_Dependency_Rel();
			case EERPackage.LINE_DEPENDENCE__LINE_DEP_CHILD_ENT:
				if (resolve) return getLine_Dep_Child_Ent();
				return basicGetLine_Dep_Child_Ent();
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
			case EERPackage.LINE_DEPENDENCE__LINE_DEP_DEPENDENCY_REL:
				setLine_Dep_Dependency_Rel((Dependency_Relation)newValue);
				return;
			case EERPackage.LINE_DEPENDENCE__LINE_DEP_CHILD_ENT:
				setLine_Dep_Child_Ent((Child_Entity)newValue);
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
			case EERPackage.LINE_DEPENDENCE__LINE_DEP_DEPENDENCY_REL:
				setLine_Dep_Dependency_Rel((Dependency_Relation)null);
				return;
			case EERPackage.LINE_DEPENDENCE__LINE_DEP_CHILD_ENT:
				setLine_Dep_Child_Ent((Child_Entity)null);
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
			case EERPackage.LINE_DEPENDENCE__LINE_DEP_DEPENDENCY_REL:
				return line_Dep_Dependency_Rel != null;
			case EERPackage.LINE_DEPENDENCE__LINE_DEP_CHILD_ENT:
				return line_Dep_Child_Ent != null;
		}
		return super.eIsSet(featureID);
	}

} //Line_DependenceImpl
