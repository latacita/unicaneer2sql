/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weak Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Weak_Entity#getWeak_Entity_Attribute <em>Weak Entity Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getWeak_Entity()
 * @model
 * @generated
 */
public interface Weak_Entity extends Entity {
	/**
	 * Returns the value of the '<em><b>Weak Entity Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weak Entity Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weak Entity Attribute</em>' containment reference.
	 * @see #setWeak_Entity_Attribute(Attribute)
	 * @see EER.EERPackage#getWeak_Entity_Weak_Entity_Attribute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Attribute getWeak_Entity_Attribute();

	/**
	 * Sets the value of the '{@link EER.Weak_Entity#getWeak_Entity_Attribute <em>Weak Entity Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weak Entity Attribute</em>' containment reference.
	 * @see #getWeak_Entity_Attribute()
	 * @generated
	 */
	void setWeak_Entity_Attribute(Attribute value);

} // Weak_Entity
