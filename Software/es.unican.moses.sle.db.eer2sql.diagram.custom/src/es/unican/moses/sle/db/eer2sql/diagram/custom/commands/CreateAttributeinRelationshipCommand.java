package es.unican.moses.sle.db.eer2sql.diagram.custom.commands;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ui.commands.ExecutionException;

import EER.Attribute;
import EER.EERFactory;
import EER.Relationship;

public class CreateAttributeinRelationshipCommand extends AbstractTransactionalCommand {
	
	private String name ;
	private Relationship relationship;
	private Diagram diagram;
	
	public CreateAttributeinRelationshipCommand(
				TransactionalEditingDomain domain, Relationship relationship,
				String name, Diagram diagram) {
			super(domain, "No label", null);
			this.name=name;
			this.relationship = relationship;
			this.diagram = diagram;
	}
	
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) {
			// Create domain element
			Attribute attribute = EERFactory.eINSTANCE.createSingleAttribute();
			attribute.setName(name);
			relationship.getAttributes().add(attribute);
			return CommandResult.newOKCommandResult();
	}
	
} // CreateAttributeinRelationshipCommand
