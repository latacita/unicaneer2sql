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
 * A representation of the model object '<em><b>Exclusive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Exclusive#getExclusive_Line <em>Exclusive Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getExclusive()
 * @model
 * @generated
 */
public interface Exclusive extends Constraint {
	/**
	 * Returns the value of the '<em><b>Exclusive Line</b></em>' reference list.
	 * The list contents are of type {@link EER.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusive Line</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive Line</em>' reference list.
	 * @see EER.EERPackage#getExclusive_Exclusive_Line()
	 * @model lower="2"
	 * @generated
	 */
	EList<Line> getExclusive_Line();

} // Exclusive
