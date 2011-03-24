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
 * A representation of the model object '<em><b>Inclusiveness</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Inclusiveness#getInclusiveness_Line <em>Inclusiveness Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getInclusiveness()
 * @model
 * @generated
 */
public interface Inclusiveness extends Constraint {
	/**
	 * Returns the value of the '<em><b>Inclusiveness Line</b></em>' reference list.
	 * The list contents are of type {@link EER.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inclusiveness Line</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclusiveness Line</em>' reference list.
	 * @see EER.EERPackage#getInclusiveness_Inclusiveness_Line()
	 * @model lower="2"
	 * @generated
	 */
	EList<Line> getInclusiveness_Line();

} // Inclusiveness
