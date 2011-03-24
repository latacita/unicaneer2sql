/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Dependence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Line_Dependence#getLine_Dep_Dependency_Rel <em>Line Dep Dependency Rel</em>}</li>
 *   <li>{@link EER.Line_Dependence#getLine_Dep_Child_Ent <em>Line Dep Child Ent</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getLine_Dependence()
 * @model
 * @generated
 */
public interface Line_Dependence extends Line {
	/**
	 * Returns the value of the '<em><b>Line Dep Dependency Rel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Dep Dependency Rel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Dep Dependency Rel</em>' reference.
	 * @see #setLine_Dep_Dependency_Rel(Dependency_Relation)
	 * @see EER.EERPackage#getLine_Dependence_Line_Dep_Dependency_Rel()
	 * @model required="true"
	 * @generated
	 */
	Dependency_Relation getLine_Dep_Dependency_Rel();

	/**
	 * Sets the value of the '{@link EER.Line_Dependence#getLine_Dep_Dependency_Rel <em>Line Dep Dependency Rel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Dep Dependency Rel</em>' reference.
	 * @see #getLine_Dep_Dependency_Rel()
	 * @generated
	 */
	void setLine_Dep_Dependency_Rel(Dependency_Relation value);

	/**
	 * Returns the value of the '<em><b>Line Dep Child Ent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Dep Child Ent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Dep Child Ent</em>' reference.
	 * @see #setLine_Dep_Child_Ent(Child_Entity)
	 * @see EER.EERPackage#getLine_Dependence_Line_Dep_Child_Ent()
	 * @model required="true"
	 * @generated
	 */
	Child_Entity getLine_Dep_Child_Ent();

	/**
	 * Sets the value of the '{@link EER.Line_Dependence#getLine_Dep_Child_Ent <em>Line Dep Child Ent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Dep Child Ent</em>' reference.
	 * @see #getLine_Dep_Child_Ent()
	 * @generated
	 */
	void setLine_Dep_Child_Ent(Child_Entity value);

} // Line_Dependence
