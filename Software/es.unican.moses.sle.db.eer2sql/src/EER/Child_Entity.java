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
 * A representation of the model object '<em><b>Child Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Child_Entity#getChild_Entity_Attribute <em>Child Entity Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getChild_Entity()
 * @model
 * @generated
 */
public interface Child_Entity extends Entity {
	/**
	 * Returns the value of the '<em><b>Child Entity Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link EER.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Entity Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Entity Attribute</em>' containment reference list.
	 * @see EER.EERPackage#getChild_Entity_Child_Entity_Attribute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Attribute> getChild_Entity_Attribute();

} // Child_Entity
