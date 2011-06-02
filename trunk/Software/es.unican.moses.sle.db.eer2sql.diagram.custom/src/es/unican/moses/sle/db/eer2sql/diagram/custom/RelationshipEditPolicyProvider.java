package es.unican.moses.sle.db.eer2sql.diagram.custom;


import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;


public class RelationshipEditPolicyProvider 
				extends AbstractProvider
				implements IEditPolicyProvider {

	@Override
	public boolean provides(IOperation operation) {
		 
		return true;
	}

	@Override
	public void createEditPolicies(EditPart editPart) {
		System.out.println("Instalando el EntityEditPolicy");
		editPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, new EntityOpenEditPolicy(editPart));
	}
	
	

} // RelationshipEditPoliceProvider
