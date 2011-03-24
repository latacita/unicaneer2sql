/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER;

import java.util.calendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Line#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link EER.Line#getRol <em>Rol</em>}</li>
 *   <li>{@link EER.Line#getLine_Entity <em>Line Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends EObject {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(int)
	 * @see EER.EERPackage#getLine_Cardinality()
	 * @model dataType="EER.Cardinality_Type" required="true"
	 * @generated
	 */
	int getCardinality();

	/**
	 * Sets the value of the '{@link EER.Line#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(int value);

	/**
	 * Returns the value of the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol</em>' attribute.
	 * @see #setRol(String)
	 * @see EER.EERPackage#getLine_Rol()
	 * @model
	 * @generated
	 */
	String getRol();

	/**
	 * Sets the value of the '{@link EER.Line#getRol <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol</em>' attribute.
	 * @see #getRol()
	 * @generated
	 */
	void setRol(String value);

	/**
	 * Returns the value of the '<em><b>Line Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Entity</em>' reference.
	 * @see #setLine_Entity(Entity)
	 * @see EER.EERPackage#getLine_Line_Entity()
	 * @model
	 * @generated
	 */
	Entity getLine_Entity();

	/**
	 * Sets the value of the '{@link EER.Line#getLine_Entity <em>Line Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Entity</em>' reference.
	 * @see #getLine_Entity()
	 * @generated
	 */
	void setLine_Entity(Entity value);

} // Line
