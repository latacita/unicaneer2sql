package es.unican.moses.sle.db.eer2sql.diagram.custom;


import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;

/**
 * Class RelationshipEditPolicyProvider.</br>
 * 
 * @author Adrian Fernandez San Marcos 
 * @author Pablo Sanchez Barreiro
 * @version 16/06/2011
 */
public class RelationshipEditPolicyProvider 
				extends AbstractProvider
				implements IEditPolicyProvider {

	@Override
	public boolean provides(IOperation operation) {
		return true;
	}

	@Override
	public void createEditPolicies(EditPart editPart) {
		editPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, new RelationshipOpenEditPolicy(editPart));
	}
} // RelationshipEditPoliceProvider
