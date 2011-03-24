/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Line_Relationship#getLine_Rel_Relationship <em>Line Rel Relationship</em>}</li>
 *   <li>{@link EER.Line_Relationship#getLine_Rel_Relation <em>Line Rel Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getLine_Relationship()
 * @model
 * @generated
 */
public interface Line_Relationship extends Line {
	/**
	 * Returns the value of the '<em><b>Line Rel Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Rel Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Rel Relationship</em>' reference.
	 * @see #setLine_Rel_Relationship(Relationship)
	 * @see EER.EERPackage#getLine_Relationship_Line_Rel_Relationship()
	 * @model
	 * @generated
	 */
	Relationship getLine_Rel_Relationship();

	/**
	 * Sets the value of the '{@link EER.Line_Relationship#getLine_Rel_Relationship <em>Line Rel Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Rel Relationship</em>' reference.
	 * @see #getLine_Rel_Relationship()
	 * @generated
	 */
	void setLine_Rel_Relationship(Relationship value);

	/**
	 * Returns the value of the '<em><b>Line Rel Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Rel Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Rel Relation</em>' reference.
	 * @see #setLine_Rel_Relation(Dependency_Relation)
	 * @see EER.EERPackage#getLine_Relationship_Line_Rel_Relation()
	 * @model
	 * @generated
	 */
	Dependency_Relation getLine_Rel_Relation();

	/**
	 * Sets the value of the '{@link EER.Line_Relationship#getLine_Rel_Relation <em>Line Rel Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Rel Relation</em>' reference.
	 * @see #getLine_Rel_Relation()
	 * @generated
	 */
	void setLine_Rel_Relation(Dependency_Relation value);

} // Line_Relationship
