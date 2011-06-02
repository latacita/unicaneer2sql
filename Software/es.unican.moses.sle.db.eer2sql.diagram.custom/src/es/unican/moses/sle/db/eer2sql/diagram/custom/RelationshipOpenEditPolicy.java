package es.unican.moses.sle.db.eer2sql.diagram.custom;


import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;

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
				System.out.println("Double click captured");
				new AttributesWizard("Relation x");
//		   	new AttributesDialog("Relation x");
//				new AttributesDisplay("Relation x");
				
			} // execute
		};
	}

}
