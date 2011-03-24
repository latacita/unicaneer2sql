/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.EERPackage;
import EER.Exclusive;
import EER.Line;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclusive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.ExclusiveImpl#getExclusive_Line <em>Exclusive Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExclusiveImpl extends ConstraintImpl implements Exclusive {
	/**
	 * The cached value of the '{@link #getExclusive_Line() <em>Exclusive Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusive_Line()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> exclusive_Line;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.EXCLUSIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getExclusive_Line() {
		if (exclusive_Line == null) {
			exclusive_Line = new EObjectResolvingEList<Line>(Line.class, this, EERPackage.EXCLUSIVE__EXCLUSIVE_LINE);
		}
		return exclusive_Line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EERPackage.EXCLUSIVE__EXCLUSIVE_LINE:
				return getExclusive_Line();
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
			case EERPackage.EXCLUSIVE__EXCLUSIVE_LINE:
				getExclusive_Line().clear();
				getExclusive_Line().addAll((Collection<? extends Line>)newValue);
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
			case EERPackage.EXCLUSIVE__EXCLUSIVE_LINE:
				getExclusive_Line().clear();
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
			case EERPackage.EXCLUSIVE__EXCLUSIVE_LINE:
				return exclusive_Line != null && !exclusive_Line.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExclusiveImpl
