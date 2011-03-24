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
 * A representation of the model object '<em><b>Dependency Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Dependency_Relation#getType <em>Type</em>}</li>
 *   <li>{@link EER.Dependency_Relation#getDependency_Rel_Line_Dep <em>Dependency Rel Line Dep</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getDependency_Relation()
 * @model
 * @generated
 */
public interface Dependency_Relation extends Abstract_Relation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link EER.Dependency_Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see EER.Dependency_Type
	 * @see #setType(Dependency_Type)
	 * @see EER.EERPackage#getDependency_Relation_Type()
	 * @model required="true"
	 * @generated
	 */
	Dependency_Type getType();

	/**
	 * Sets the value of the '{@link EER.Dependency_Relation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see EER.Dependency_Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Dependency_Type value);

	/**
	 * Returns the value of the '<em><b>Dependency Rel Line Dep</b></em>' containment reference list.
	 * The list contents are of type {@link EER.Line_Dependence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency Rel Line Dep</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency Rel Line Dep</em>' containment reference list.
	 * @see EER.EERPackage#getDependency_Relation_Dependency_Rel_Line_Dep()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Line_Dependence> getDependency_Rel_Line_Dep();

} // Dependency_Relation
