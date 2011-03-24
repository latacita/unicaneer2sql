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
 *   <li>{@link EER.Member_Collection#getMC_Line_Gen <em>MC Line Gen</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getMember_Collection()
 * @model
 * @generated
 */
public interface Member_Collection extends Aggregation {
	/**
	 * Returns the value of the '<em><b>MC Line Gen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MC Line Gen</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MC Line Gen</em>' containment reference.
	 * @see #setMC_Line_Gen(Line_Generalization)
	 * @see EER.EERPackage#getMember_Collection_MC_Line_Gen()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Line_Generalization getMC_Line_Gen();

	/**
	 * Sets the value of the '{@link EER.Member_Collection#getMC_Line_Gen <em>MC Line Gen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MC Line Gen</em>' containment reference.
	 * @see #getMC_Line_Gen()
	 * @generated
	 */
	void setMC_Line_Gen(Line_Generalization value);

} // Member_Collection
