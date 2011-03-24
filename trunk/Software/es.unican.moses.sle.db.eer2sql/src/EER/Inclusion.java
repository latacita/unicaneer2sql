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
 * A representation of the model object '<em><b>Inclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Inclusion#getInclusion_Relationship <em>Inclusion Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getInclusion()
 * @model
 * @generated
 */
public interface Inclusion extends Constraint {
	/**
	 * Returns the value of the '<em><b>Inclusion Relationship</b></em>' reference list.
	 * The list contents are of type {@link EER.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inclusion Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclusion Relationship</em>' reference list.
	 * @see EER.EERPackage#getInclusion_Inclusion_Relationship()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Relationship> getInclusion_Relationship();

} // Inclusion
