/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.MemberCollection#getParticipant <em>Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getMemberCollection()
 * @model
 * @generated
 */
public interface MemberCollection extends Aggregation {
	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference.
	 * @see #setParticipant(AggregationParticipant)
	 * @see EER.EERPackage#getMemberCollection_Participant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AggregationParticipant getParticipant();

	/**
	 * Sets the value of the '{@link EER.MemberCollection#getParticipant <em>Participant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant</em>' containment reference.
	 * @see #getParticipant()
	 * @generated
	 */
	void setParticipant(AggregationParticipant value);

} // MemberCollection
