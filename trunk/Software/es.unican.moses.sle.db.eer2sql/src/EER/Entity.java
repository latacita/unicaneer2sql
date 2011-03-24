/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Entity#getName <em>Name</em>}</li>
 *   <li>{@link EER.Entity#getEntity_Primary_Key <em>Entity Primary Key</em>}</li>
 *   <li>{@link EER.Entity#getEntity_Candidate_Key <em>Entity Candidate Key</em>}</li>
 *   <li>{@link EER.Entity#getEntity_Attribute <em>Entity Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see EER.EERPackage#getEntity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link EER.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entity Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Primary Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Primary Key</em>' containment reference.
	 * @see #setEntity_Primary_Key(Primary_Key)
	 * @see EER.EERPackage#getEntity_Entity_Primary_Key()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Primary_Key getEntity_Primary_Key();

	/**
	 * Sets the value of the '{@link EER.Entity#getEntity_Primary_Key <em>Entity Primary Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Primary Key</em>' containment reference.
	 * @see #getEntity_Primary_Key()
	 * @generated
	 */
	void setEntity_Primary_Key(Primary_Key value);

	/**
	 * Returns the value of the '<em><b>Entity Candidate Key</b></em>' containment reference list.
	 * The list contents are of type {@link EER.Candidate_Key}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Candidate Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Candidate Key</em>' containment reference list.
	 * @see EER.EERPackage#getEntity_Entity_Candidate_Key()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Candidate_Key> getEntity_Candidate_Key();

	/**
	 * Returns the value of the '<em><b>Entity Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link EER.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Attribute</em>' containment reference list.
	 * @see EER.EERPackage#getEntity_Entity_Attribute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Attribute> getEntity_Attribute();

} // Entity
