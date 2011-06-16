package es.unican.moses.sle.db.eer2sql.diagram.custom.commands;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import EER.CompositeAttribute;
import EER.Domain;
import EER.EERFactory;
import EER.Relationship;

public class CreateCompositeAttributeinRelationshipCommand extends AbstractTransactionalCommand {
	
	private String name ;
	private boolean nullable;
	private Relationship relationship;
	public CreateCompositeAttributeinRelationshipCommand(
				TransactionalEditingDomain domain, Relationship relationship,
				String name, boolean nullable) {
			super(domain, "No label", null);
			this.name = name;
			this.nullable = nullable;
			this.relationship = relationship;
	}
	
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) {
			// Create domain element
			CompositeAttribute attribute = EERFactory.eINSTANCE.createCompositeAttribute();
			attribute.setName(name);
			attribute.setNullable(nullable);
			relationship.getAttributes().add(attribute);
			return CommandResult.newOKCommandResult();
	}
	
} // CreateAttributeinRelationshipCommand

