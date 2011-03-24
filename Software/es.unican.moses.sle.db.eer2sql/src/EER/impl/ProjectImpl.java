/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.Domain;
import EER.EERPackage;
import EER.Entity;
import EER.Project;
import EER.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EER.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link EER.impl.ProjectImpl#getProject_Entity <em>Project Entity</em>}</li>
 *   <li>{@link EER.impl.ProjectImpl#getProject_Relationship <em>Project Relationship</em>}</li>
 *   <li>{@link EER.impl.ProjectImpl#getProject_Domain <em>Project Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends EObjectImpl implements Project {
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
	 * The cached value of the '{@link #getProject_Entity() <em>Project Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject_Entity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> project_Entity;

	/**
	 * The cached value of the '{@link #getProject_Relationship() <em>Project Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject_Relationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> project_Relationship;

	/**
	 * The cached value of the '{@link #getProject_Domain() <em>Project Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject_Domain()
	 * @generated
	 * @ordered
	 */
	protected EList<Domain> project_Domain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EERPackage.Literals.PROJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EERPackage.PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getProject_Entity() {
		if (project_Entity == null) {
			project_Entity = new EObjectContainmentEList<Entity>(Entity.class, this, EERPackage.PROJECT__PROJECT_ENTITY);
		}
		return project_Entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getProject_Relationship() {
		if (project_Relationship == null) {
			project_Relationship = new EObjectContainmentEList<Relationship>(Relationship.class, this, EERPackage.PROJECT__PROJECT_RELATIONSHIP);
		}
		return project_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Domain> getProject_Domain() {
		if (project_Domain == null) {
			project_Domain = new EObjectContainmentEList<Domain>(Domain.class, this, EERPackage.PROJECT__PROJECT_DOMAIN);
		}
		return project_Domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EERPackage.PROJECT__PROJECT_ENTITY:
				return ((InternalEList<?>)getProject_Entity()).basicRemove(otherEnd, msgs);
			case EERPackage.PROJECT__PROJECT_RELATIONSHIP:
				return ((InternalEList<?>)getProject_Relationship()).basicRemove(otherEnd, msgs);
			case EERPackage.PROJECT__PROJECT_DOMAIN:
				return ((InternalEList<?>)getProject_Domain()).basicRemove(otherEnd, msgs);
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
			case EERPackage.PROJECT__NAME:
				return getName();
			case EERPackage.PROJECT__PROJECT_ENTITY:
				return getProject_Entity();
			case EERPackage.PROJECT__PROJECT_RELATIONSHIP:
				return getProject_Relationship();
			case EERPackage.PROJECT__PROJECT_DOMAIN:
				return getProject_Domain();
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
			case EERPackage.PROJECT__NAME:
				setName((String)newValue);
				return;
			case EERPackage.PROJECT__PROJECT_ENTITY:
				getProject_Entity().clear();
				getProject_Entity().addAll((Collection<? extends Entity>)newValue);
				return;
			case EERPackage.PROJECT__PROJECT_RELATIONSHIP:
				getProject_Relationship().clear();
				getProject_Relationship().addAll((Collection<? extends Relationship>)newValue);
				return;
			case EERPackage.PROJECT__PROJECT_DOMAIN:
				getProject_Domain().clear();
				getProject_Domain().addAll((Collection<? extends Domain>)newValue);
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
			case EERPackage.PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EERPackage.PROJECT__PROJECT_ENTITY:
				getProject_Entity().clear();
				return;
			case EERPackage.PROJECT__PROJECT_RELATIONSHIP:
				getProject_Relationship().clear();
				return;
			case EERPackage.PROJECT__PROJECT_DOMAIN:
				getProject_Domain().clear();
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
			case EERPackage.PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EERPackage.PROJECT__PROJECT_ENTITY:
				return project_Entity != null && !project_Entity.isEmpty();
			case EERPackage.PROJECT__PROJECT_RELATIONSHIP:
				return project_Relationship != null && !project_Relationship.isEmpty();
			case EERPackage.PROJECT__PROJECT_DOMAIN:
				return project_Domain != null && !project_Domain.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
