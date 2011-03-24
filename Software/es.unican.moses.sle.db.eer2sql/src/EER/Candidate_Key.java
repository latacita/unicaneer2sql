/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Candidate Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Candidate_Key#getCandidate_Key_Attribute <em>Candidate Key Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getCandidate_Key()
 * @model
 * @generated
 */
public interface Candidate_Key extends Constraint {
	/**
	 * Returns the value of the '<em><b>Candidate Key Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate Key Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate Key Attribute</em>' reference.
	 * @see #setCandidate_Key_Attribute(Attribute)
	 * @see EER.EERPackage#getCandidate_Key_Candidate_Key_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getCandidate_Key_Attribute();

	/**
	 * Sets the value of the '{@link EER.Candidate_Key#getCandidate_Key_Attribute <em>Candidate Key Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Candidate Key Attribute</em>' reference.
	 * @see #getCandidate_Key_Attribute()
	 * @generated
	 */
	void setCandidate_Key_Attribute(Attribute value);

} // Candidate_Key
