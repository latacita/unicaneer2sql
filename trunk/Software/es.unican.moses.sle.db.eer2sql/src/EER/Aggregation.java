/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Aggregation#getAggregation_Entity <em>Aggregation Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getAggregation()
 * @model
 * @generated
 */
public interface Aggregation extends EObject {
	/**
	 * Returns the value of the '<em><b>Aggregation Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Entity</em>' reference.
	 * @see #setAggregation_Entity(Entity)
	 * @see EER.EERPackage#getAggregation_Aggregation_Entity()
	 * @model required="true"
	 * @generated
	 */
	Entity getAggregation_Entity();

	/**
	 * Sets the value of the '{@link EER.Aggregation#getAggregation_Entity <em>Aggregation Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Entity</em>' reference.
	 * @see #getAggregation_Entity()
	 * @generated
	 */
	void setAggregation_Entity(Entity value);

} // Aggregation
