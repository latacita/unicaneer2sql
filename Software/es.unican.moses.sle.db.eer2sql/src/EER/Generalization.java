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
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Generalization#getName <em>Name</em>}</li>
 *   <li>{@link EER.Generalization#getType <em>Type</em>}</li>
 *   <li>{@link EER.Generalization#getGeneralization_Child_Ent <em>Generalization Child Ent</em>}</li>
 *   <li>{@link EER.Generalization#getGeneralization_Attribute <em>Generalization Attribute</em>}</li>
 *   <li>{@link EER.Generalization#getGeneralization_Line_Gen <em>Generalization Line Gen</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends EObject {
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
	 * @see EER.EERPackage#getGeneralization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link EER.Generalization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link EER.Generalization_Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see EER.Generalization_Type
	 * @see #setType(Generalization_Type)
	 * @see EER.EERPackage#getGeneralization_Type()
	 * @model required="true"
	 * @generated
	 */
	Generalization_Type getType();

	/**
	 * Sets the value of the '{@link EER.Generalization#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see EER.Generalization_Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Generalization_Type value);

	/**
	 * Returns the value of the '<em><b>Generalization Child Ent</b></em>' containment reference list.
	 * The list contents are of type {@link EER.Child_Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization Child Ent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization Child Ent</em>' containment reference list.
	 * @see EER.EERPackage#getGeneralization_Generalization_Child_Ent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Child_Entity> getGeneralization_Child_Ent();

	/**
	 * Returns the value of the '<em><b>Generalization Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization Attribute</em>' containment reference.
	 * @see #setGeneralization_Attribute(Attribute)
	 * @see EER.EERPackage#getGeneralization_Generalization_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	Attribute getGeneralization_Attribute();

	/**
	 * Sets the value of the '{@link EER.Generalization#getGeneralization_Attribute <em>Generalization Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalization Attribute</em>' containment reference.
	 * @see #getGeneralization_Attribute()
	 * @generated
	 */
	void setGeneralization_Attribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Generalization Line Gen</b></em>' reference list.
	 * The list contents are of type {@link EER.Line_Generalization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization Line Gen</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization Line Gen</em>' reference list.
	 * @see EER.EERPackage#getGeneralization_Generalization_Line_Gen()
	 * @model required="true"
	 * @generated
	 */
	EList<Line_Generalization> getGeneralization_Line_Gen();

} // Generalization
