/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.Composite_Attribute;
import EER.EERPackage;
import EER.Single_Attribute;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.Composite_AttributeImpl#getComposite_Att_Single_Att <em>Composite Att Single Att</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Composite_AttributeImpl extends AttributeImpl implements Composite_Attribute {
	/**
	 * The cached value of the '{@link #getComposite_Att_Single_Att() <em>Composite Att Single Att</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposite_Att_Single_Att()
	 * @generated
	 * @ordered
	 */
	protected EList<Single_Attribute> composite_Att_Single_Att;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Composite_AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.COMPOSITE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Single_Attribute> getComposite_Att_Single_Att() {
		if (composite_Att_Single_Att == null) {
			composite_Att_Single_Att = new EObjectContainmentEList<Single_Attribute>(Single_Attribute.class, this, EERPackage.COMPOSITE_ATTRIBUTE__COMPOSITE_ATT_SINGLE_ATT);
		}
		return composite_Att_Single_Att;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EERPackage.COMPOSITE_ATTRIBUTE__COMPOSITE_ATT_SINGLE_ATT:
				return ((InternalEList<?>)getComposite_Att_Single_Att()).basicRemove(otherEnd, msgs);
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
			case EERPackage.COMPOSITE_ATTRIBUTE__COMPOSITE_ATT_SINGLE_ATT:
				return getComposite_Att_Single_Att();
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
			case EERPackage.COMPOSITE_ATTRIBUTE__COMPOSITE_ATT_SINGLE_ATT:
				getComposite_Att_Single_Att().clear();
				getComposite_Att_Single_Att().addAll((Collection<? extends Single_Attribute>)newValue);
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
			case EERPackage.COMPOSITE_ATTRIBUTE__COMPOSITE_ATT_SINGLE_ATT:
				getComposite_Att_Single_Att().clear();
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
			case EERPackage.COMPOSITE_ATTRIBUTE__COMPOSITE_ATT_SINGLE_ATT:
				return composite_Att_Single_Att != null && !composite_Att_Single_Att.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Composite_AttributeImpl
