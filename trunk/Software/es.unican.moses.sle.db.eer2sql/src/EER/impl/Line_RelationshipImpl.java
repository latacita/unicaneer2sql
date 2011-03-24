/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.Dependency_Relation;
import EER.EERPackage;
import EER.Line_Relationship;
import EER.Relationship;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.Line_RelationshipImpl#getLine_Rel_Relationship <em>Line Rel Relationship</em>}</li>
 *   <li>{@link EER.impl.Line_RelationshipImpl#getLine_Rel_Relation <em>Line Rel Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Line_RelationshipImpl extends LineImpl implements Line_Relationship {
	/**
	 * The cached value of the '{@link #getLine_Rel_Relationship() <em>Line Rel Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine_Rel_Relationship()
	 * @generated
	 * @ordered
	 */
	protected Relationship line_Rel_Relationship;

	/**
	 * The cached value of the '{@link #getLine_Rel_Relation() <em>Line Rel Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine_Rel_Relation()
	 * @generated
	 * @ordered
	 */
	protected Dependency_Relation line_Rel_Relation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Line_RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.LINE_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship getLine_Rel_Relationship() {
		if (line_Rel_Relationship != null && line_Rel_Relationship.eIsProxy()) {
			InternalEObject oldLine_Rel_Relationship = (InternalEObject)line_Rel_Relationship;
			line_Rel_Relationship = (Relationship)eResolveProxy(oldLine_Rel_Relationship);
			if (line_Rel_Relationship != oldLine_Rel_Relationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EERPackage.LINE_RELATIONSHIP__LINE_REL_RELATIONSHIP, oldLine_Rel_Relationship, line_Rel_Relationship));
			}
		}
		return line_Rel_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship basicGetLine_Rel_Relationship() {
		return line_Rel_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine_Rel_Relationship(Relationship newLine_Rel_Relationship) {
		Relationship oldLine_Rel_Relationship = line_Rel_Relationship;
		line_Rel_Relationship = newLine_Rel_Relationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.LINE_RELATIONSHIP__LINE_REL_RELATIONSHIP, oldLine_Rel_Relationship, line_Rel_Relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency_Relation getLine_Rel_Relation() {
		if (line_Rel_Relation != null && line_Rel_Relation.eIsProxy()) {
			InternalEObject oldLine_Rel_Relation = (InternalEObject)line_Rel_Relation;
			line_Rel_Relation = (Dependency_Relation)eResolveProxy(oldLine_Rel_Relation);
			if (line_Rel_Relation != oldLine_Rel_Relation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EERPackage.LINE_RELATIONSHIP__LINE_REL_RELATION, oldLine_Rel_Relation, line_Rel_Relation));
			}
		}
		return line_Rel_Relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency_Relation basicGetLine_Rel_Relation() {
		return line_Rel_Relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine_Rel_Relation(Dependency_Relation newLine_Rel_Relation) {
		Dependency_Relation oldLine_Rel_Relation = line_Rel_Relation;
		line_Rel_Relation = newLine_Rel_Relation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.LINE_RELATIONSHIP__LINE_REL_RELATION, oldLine_Rel_Relation, line_Rel_Relation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EERPackage.LINE_RELATIONSHIP__LINE_REL_RELATIONSHIP:
				if (resolve) return getLine_Rel_Relationship();
				return basicGetLine_Rel_Relationship();
			case EERPackage.LINE_RELATIONSHIP__LINE_REL_RELATION:
				if (resolve) return getLine_Rel_Relation();
				return basicGetLine_Rel_Relation();
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
			case EERPackage.LINE_RELATIONSHIP__LINE_REL_RELATIONSHIP:
				setLine_Rel_Relationship((Relationship)newValue);
				return;
			case EERPackage.LINE_RELATIONSHIP__LINE_REL_RELATION:
				setLine_Rel_Relation((Dependency_Relation)newValue);
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
			case EERPackage.LINE_RELATIONSHIP__LINE_REL_RELATIONSHIP:
				setLine_Rel_Relationship((Relationship)null);
				return;
			case EERPackage.LINE_RELATIONSHIP__LINE_REL_RELATION:
				setLine_Rel_Relation((Dependency_Relation)null);
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
			case EERPackage.LINE_RELATIONSHIP__LINE_REL_RELATIONSHIP:
				return line_Rel_Relationship != null;
			case EERPackage.LINE_RELATIONSHIP__LINE_REL_RELATION:
				return line_Rel_Relation != null;
		}
		return super.eIsSet(featureID);
	}

} //Line_RelationshipImpl
