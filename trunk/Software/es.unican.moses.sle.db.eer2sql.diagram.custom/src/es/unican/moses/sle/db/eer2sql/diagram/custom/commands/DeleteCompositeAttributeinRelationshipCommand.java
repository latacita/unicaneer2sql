package es.unican.moses.sle.db.eer2sql.diagram.custom.commands;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;

import EER.AbstractRelationship;


/**
 * Class DeleteCompositeAttributeinRelationshipCommand.</br>
 * 
 * @author Adrian Fdez San Marcos
 * @version 16-06-2011
 */
public class DeleteCompositeAttributeinRelationshipCommand extends AbstractTransactionalCommand{
		
	private AbstractRelationship relationship;
	private int index;
	
	public DeleteCompositeAttributeinRelationshipCommand(
				TransactionalEditingDomain domain, AbstractRelationship relationship,
				Diagram diagram, int index) {
			super(domain, "No label", null);
			this.relationship = relationship;
			this.index = index;
	}
	
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) {
			// Delete attribute
			relationship.getAttributes().remove(index);
			return CommandResult.newOKCommandResult();
	}
	
} // DeleteCompositeAttributeinRelationshipCommand

