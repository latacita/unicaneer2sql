/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.EERPackage;
import EER.Inclusion;
import EER.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.InclusionImpl#getInclusion_Relationship <em>Inclusion Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InclusionImpl extends ConstraintImpl implements Inclusion {
	/**
	 * The cached value of the '{@link #getInclusion_Relationship() <em>Inclusion Relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclusion_Relationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> inclusion_Relationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InclusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.INCLUSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getInclusion_Relationship() {
		if (inclusion_Relationship == null) {
			inclusion_Relationship = new EObjectResolvingEList<Relationship>(Relationship.class, this, EERPackage.INCLUSION__INCLUSION_RELATIONSHIP);
		}
		return inclusion_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EERPackage.INCLUSION__INCLUSION_RELATIONSHIP:
				return getInclusion_Relationship();
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
			case EERPackage.INCLUSION__INCLUSION_RELATIONSHIP:
				getInclusion_Relationship().clear();
				getInclusion_Relationship().addAll((Collection<? extends Relationship>)newValue);
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
			case EERPackage.INCLUSION__INCLUSION_RELATIONSHIP:
				getInclusion_Relationship().clear();
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
			case EERPackage.INCLUSION__INCLUSION_RELATIONSHIP:
				return inclusion_Relationship != null && !inclusion_Relationship.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InclusionImpl
