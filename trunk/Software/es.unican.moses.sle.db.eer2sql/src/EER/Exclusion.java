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
 * A representation of the model object '<em><b>Exclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Exclusion#getExclusion_Relationship <em>Exclusion Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getExclusion()
 * @model
 * @generated
 */
public interface Exclusion extends Constraint {
	/**
	 * Returns the value of the '<em><b>Exclusion Relationship</b></em>' reference list.
	 * The list contents are of type {@link EER.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusion Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusion Relationship</em>' reference list.
	 * @see EER.EERPackage#getExclusion_Exclusion_Relationship()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Relationship> getExclusion_Relationship();

} // Exclusion
