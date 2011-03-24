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
 * A representation of the model object '<em><b>Composite Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Composite_Attribute#getComposite_Att_Single_Att <em>Composite Att Single Att</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getComposite_Attribute()
 * @model
 * @generated
 */
public interface Composite_Attribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Composite Att Single Att</b></em>' containment reference list.
	 * The list contents are of type {@link EER.Single_Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Att Single Att</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Att Single Att</em>' containment reference list.
	 * @see EER.EERPackage#getComposite_Attribute_Composite_Att_Single_Att()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Single_Attribute> getComposite_Att_Single_Att();

} // Composite_Attribute
