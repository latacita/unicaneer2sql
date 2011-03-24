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
 * A representation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EER.Composite_Component#getCC_Line_Gen <em>CC Line Gen</em>}</li>
 * </ul>
 * </p>
 *
 * @see EER.EERPackage#getComposite_Component()
 * @model
 * @generated
 */
public interface Composite_Component extends Aggregation {
	/**
	 * Returns the value of the '<em><b>CC Line Gen</b></em>' containment reference list.
	 * The list contents are of type {@link EER.Line_Generalization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CC Line Gen</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CC Line Gen</em>' containment reference list.
	 * @see EER.EERPackage#getComposite_Component_CC_Line_Gen()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Line_Generalization> getCC_Line_Gen();

} // Composite_Component
