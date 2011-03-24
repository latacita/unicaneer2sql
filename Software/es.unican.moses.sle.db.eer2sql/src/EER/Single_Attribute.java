/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Single_Attribute#isDerivate <em>Derivate</em>}</li>
 *   <li>{@link EER.Single_Attribute#getSingle_Att_Domain <em>Single Att Domain</em>}</li>
 *   <li>{@link EER.Single_Attribute#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getSingle_Attribute()
 * @model
 * @generated
 */
public interface Single_Attribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Derivate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivate</em>' attribute.
	 * @see #setDerivate(boolean)
	 * @see EER.EERPackage#getSingle_Attribute_Derivate()
	 * @model required="true"
	 * @generated
	 */
	boolean isDerivate();

	/**
	 * Sets the value of the '{@link EER.Single_Attribute#isDerivate <em>Derivate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivate</em>' attribute.
	 * @see #isDerivate()
	 * @generated
	 */
	void setDerivate(boolean value);

	/**
	 * Returns the value of the '<em><b>Single Att Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Att Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Att Domain</em>' reference.
	 * @see #setSingle_Att_Domain(Domain)
	 * @see EER.EERPackage#getSingle_Attribute_Single_Att_Domain()
	 * @model required="true"
	 * @generated
	 */
	Domain getSingle_Att_Domain();

	/**
	 * Sets the value of the '{@link EER.Single_Attribute#getSingle_Att_Domain <em>Single Att Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Att Domain</em>' reference.
	 * @see #getSingle_Att_Domain()
	 * @generated
	 */
	void setSingle_Att_Domain(Domain value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' reference.
	 * @see #setMultiplicity(Multiplicity)
	 * @see EER.EERPackage#getSingle_Attribute_Multiplicity()
	 * @model required="true"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link EER.Single_Attribute#getMultiplicity <em>Multiplicity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

} // Single_Attribute
