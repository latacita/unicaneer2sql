package es.unican.moses.sle.db.eer2sql.diagram.custom;


import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;

/**
 * Class RelationshipOpenEditPolicy.</br>
 * 
 * @author Adrian Fernandez San Marcos 
 * @author Pablo Sanchez Barreiro
 * @version 16/06/2011
 */
public class RelationshipOpenEditPolicy extends OpenEditPolicy {
	
	protected EditPart editpart;
		
	public RelationshipOpenEditPolicy(EditPart editpart) {
		this.editpart = editpart;
	} // OpenEditPolicy
	
	
	@Override
	protected Command getOpenCommand(Request request) {

		return new Command() {
			@Override
			public void execute() {
				new RelationshipWizard(editpart);
			} // execute
		};
	}
}

