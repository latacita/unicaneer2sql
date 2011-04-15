/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inclusiveness</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Inclusiveness#getSource <em>Source</em>}</li>
 *   <li>{@link EER.Inclusiveness#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link EER.Inclusiveness#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getInclusiveness()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SourceTarget'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SourceTarget='\n\t\t\tself.target <> self.source'"
 * @generated
 */
public interface Inclusiveness extends Constraint {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link EER.Participant#getInclusivenessConstraint <em>Inclusiveness Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Participant)
	 * @see EER.EERPackage#getInclusiveness_Source()
	 * @see EER.Participant#getInclusivenessConstraint
	 * @model opposite="inclusivenessConstraint" required="true" transient="false"
	 * @generated
	 */
	Participant getSource();

	/**
	 * Sets the value of the '{@link EER.Inclusiveness#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Participant value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see EER.EERPackage#getInclusiveness_Cardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link EER.Inclusiveness#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Participant)
	 * @see EER.EERPackage#getInclusiveness_Target()
	 * @model required="true"
	 * @generated
	 */
	Participant getTarget();

	/**
	 * Sets the value of the '{@link EER.Inclusiveness#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Participant value);

} // Inclusiveness
