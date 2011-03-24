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
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Project#getName <em>Name</em>}</li>
 *   <li>{@link EER.Project#getProject_Entity <em>Project Entity</em>}</li>
 *   <li>{@link EER.Project#getProject_Relationship <em>Project Relationship</em>}</li>
 *   <li>{@link EER.Project#getProject_Domain <em>Project Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
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
	 * @see EER.EERPackage#getProject_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link EER.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Project Entity</b></em>' containment reference list.
	 * The list contents are of type {@link EER.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Entity</em>' containment reference list.
	 * @see EER.EERPackage#getProject_Project_Entity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Entity> getProject_Entity();

	/**
	 * Returns the value of the '<em><b>Project Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link EER.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Relationship</em>' containment reference list.
	 * @see EER.EERPackage#getProject_Project_Relationship()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getProject_Relationship();

	/**
	 * Returns the value of the '<em><b>Project Domain</b></em>' containment reference list.
	 * The list contents are of type {@link EER.Domain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Domain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Domain</em>' containment reference list.
	 * @see EER.EERPackage#getProject_Project_Domain()
	 * @model containment="true"
	 * @generated
	 */
	EList<Domain> getProject_Domain();

} // Project
