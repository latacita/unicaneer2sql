/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.EERPackage;
import EER.Exclusion;
import EER.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.ExclusionImpl#getExclusion_Relationship <em>Exclusion Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExclusionImpl extends ConstraintImpl implements Exclusion {
	/**
	 * The cached value of the '{@link #getExclusion_Relationship() <em>Exclusion Relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusion_Relationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> exclusion_Relationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.EXCLUSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getExclusion_Relationship() {
		if (exclusion_Relationship == null) {
			exclusion_Relationship = new EObjectResolvingEList<Relationship>(Relationship.class, this, EERPackage.EXCLUSION__EXCLUSION_RELATIONSHIP);
		}
		return exclusion_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EERPackage.EXCLUSION__EXCLUSION_RELATIONSHIP:
				return getExclusion_Relationship();
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
			case EERPackage.EXCLUSION__EXCLUSION_RELATIONSHIP:
				getExclusion_Relationship().clear();
				getExclusion_Relationship().addAll((Collection<? extends Relationship>)newValue);
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
			case EERPackage.EXCLUSION__EXCLUSION_RELATIONSHIP:
				getExclusion_Relationship().clear();
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
			case EERPackage.EXCLUSION__EXCLUSION_RELATIONSHIP:
				return exclusion_Relationship != null && !exclusion_Relationship.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExclusionImpl
