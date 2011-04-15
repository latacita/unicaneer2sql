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
 * A representation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.CompositeComponent#getParticipants <em>Participants</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getCompositeComponent()
 * @model
 * @generated
 */
public interface CompositeComponent extends Aggregation {
	/**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
	 * The list contents are of type {@link EER.AggregationParticipant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see EER.EERPackage#getCompositeComponent_Participants()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AggregationParticipant> getParticipants();

} // CompositeComponent
