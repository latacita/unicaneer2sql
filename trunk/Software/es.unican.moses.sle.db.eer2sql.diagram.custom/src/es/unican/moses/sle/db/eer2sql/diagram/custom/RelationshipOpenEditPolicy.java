package es.unican.moses.sle.db.eer2sql.diagram.custom;


import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.ui.commands.ExecutionException;

import es.unican.moses.sle.db.eer2sql.diagram.custom.commands.CreateAttributeinRelationshipCommand;

import EER.Relationship;

public class RelationshipOpenEditPolicy extends OpenEditPolicy {
	
	protected EditPart editpart;
		
	public RelationshipOpenEditPolicy(EditPart editpart) {
		this.editpart = editpart;
	} // OpenEditPolicy
	
	protected void addCodeProgramatically() {
		Node node = (Node) editpart.getModel();
		Diagram diagram = node.getDiagram();
		Relationship element = (Relationship) node.getElement();
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(element);
		CreateAttributeinRelationshipCommand cmd = 
				new CreateAttributeinRelationshipCommand(domain, element,"HolaMundo", diagram);
		try {
			cmd.execute(new NullProgressMonitor(), null);
		} catch (org.eclipse.core.commands.ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // try
	} //
	
	@Override
	protected Command getOpenCommand(Request request) {

		return new Command() {
			@Override
			public void execute() {
				System.out.println("Double click captured");
				new AttributesWizard("Relation x");
				
				// Added by Pablo.  
				addCodeProgramatically();
				
//		   	new AttributesDialog("Relation x");
//				new AttributesDisplay("Relation x");
				
			} // execute
		};
	}

}

