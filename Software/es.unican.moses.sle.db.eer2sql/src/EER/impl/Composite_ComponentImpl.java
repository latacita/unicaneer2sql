/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.Composite_Component;
import EER.EERPackage;
import EER.Line_Generalization;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.Composite_ComponentImpl#getCC_Line_Gen <em>CC Line Gen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Composite_ComponentImpl extends AggregationImpl implements Composite_Component {
	/**
	 * The cached value of the '{@link #getCC_Line_Gen() <em>CC Line Gen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCC_Line_Gen()
	 * @generated
	 * @ordered
	 */
	protected EList<Line_Generalization> cC_Line_Gen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Composite_ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.COMPOSITE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line_Generalization> getCC_Line_Gen() {
		if (cC_Line_Gen == null) {
			cC_Line_Gen = new EObjectContainmentEList<Line_Generalization>(Line_Generalization.class, this, EERPackage.COMPOSITE_COMPONENT__CC_LINE_GEN);
		}
		return cC_Line_Gen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EERPackage.COMPOSITE_COMPONENT__CC_LINE_GEN:
				return ((InternalEList<?>)getCC_Line_Gen()).basicRemove(otherEnd, msgs);
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
			case EERPackage.COMPOSITE_COMPONENT__CC_LINE_GEN:
				return getCC_Line_Gen();
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
			case EERPackage.COMPOSITE_COMPONENT__CC_LINE_GEN:
				getCC_Line_Gen().clear();
				getCC_Line_Gen().addAll((Collection<? extends Line_Generalization>)newValue);
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
			case EERPackage.COMPOSITE_COMPONENT__CC_LINE_GEN:
				getCC_Line_Gen().clear();
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
			case EERPackage.COMPOSITE_COMPONENT__CC_LINE_GEN:
				return cC_Line_Gen != null && !cC_Line_Gen.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Composite_ComponentImpl
