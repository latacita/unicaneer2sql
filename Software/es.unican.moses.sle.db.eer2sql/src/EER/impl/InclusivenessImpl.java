/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.EERPackage;
import EER.Inclusiveness;
import EER.Line;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inclusiveness</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.InclusivenessImpl#getInclusiveness_Line <em>Inclusiveness Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InclusivenessImpl extends ConstraintImpl implements Inclusiveness {
	/**
	 * The cached value of the '{@link #getInclusiveness_Line() <em>Inclusiveness Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclusiveness_Line()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> inclusiveness_Line;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InclusivenessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.INCLUSIVENESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getInclusiveness_Line() {
		if (inclusiveness_Line == null) {
			inclusiveness_Line = new EObjectResolvingEList<Line>(Line.class, this, EERPackage.INCLUSIVENESS__INCLUSIVENESS_LINE);
		}
		return inclusiveness_Line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EERPackage.INCLUSIVENESS__INCLUSIVENESS_LINE:
				return getInclusiveness_Line();
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
			case EERPackage.INCLUSIVENESS__INCLUSIVENESS_LINE:
				getInclusiveness_Line().clear();
				getInclusiveness_Line().addAll((Collection<? extends Line>)newValue);
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
			case EERPackage.INCLUSIVENESS__INCLUSIVENESS_LINE:
				getInclusiveness_Line().clear();
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
			case EERPackage.INCLUSIVENESS__INCLUSIVENESS_LINE:
				return inclusiveness_Line != null && !inclusiveness_Line.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InclusivenessImpl
