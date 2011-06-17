package es.unican.moses.sle.db.eer2sql.diagram.custom;


import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;

/**
 * Class DependencyRelationshipOpenEditPolicy.</br>
 * 
 * @author Pablo Sanchez Barreiro
 * @author Adrian Fernandez San Marcos
 * @version 16-06-2011
 */
public class DependencyRelationshipOpenEditPolicy extends OpenEditPolicy {
	
	protected EditPart editpart;
		
	public DependencyRelationshipOpenEditPolicy(EditPart editpart) {
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