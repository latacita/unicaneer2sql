/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Relationship#getRelationship_Line_Rel <em>Relationship Line Rel</em>}</li>
 *   <li>{@link EER.Relationship#getRelationship_Attribute <em>Relationship Attribute</em>}</li>
 *   <li>{@link EER.Relationship#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends Abstract_Relation {
	/**
	 * Returns the value of the '<em><b>Relationship Line Rel</b></em>' containment reference list.
	 * The list contents are of type {@link EER.Line_Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Line Rel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Line Rel</em>' containment reference list.
	 * @see EER.EERPackage#getRelationship_Relationship_Line_Rel()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Line_Relationship> getRelationship_Line_Rel();

	/**
	 * Returns the value of the '<em><b>Relationship Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link EER.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Attribute</em>' containment reference list.
	 * @see EER.EERPackage#getRelationship_Relationship_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getRelationship_Attribute();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link EER.Relationship_Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see EER.Relationship_Type
	 * @see #setType(Relationship_Type)
	 * @see EER.EERPackage#getRelationship_Type()
	 * @model
	 * @generated
	 */
	Relationship_Type getType();

	/**
	 * Sets the value of the '{@link EER.Relationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see EER.Relationship_Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Relationship_Type value);

} // Relationship
