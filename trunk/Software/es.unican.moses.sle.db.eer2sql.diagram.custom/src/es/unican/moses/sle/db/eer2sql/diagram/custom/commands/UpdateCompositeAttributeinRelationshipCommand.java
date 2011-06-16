package es.unican.moses.sle.db.eer2sql.diagram.custom.commands;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ui.commands.ExecutionException;

import EER.Attribute;
import EER.CompositeAttribute;
import EER.Domain;
import EER.EERFactory;
import EER.Relationship;
import EER.SingleAttribute;

public class UpdateCompositeAttributeinRelationshipCommand extends AbstractTransactionalCommand {
	
	private String name ;
	private boolean nullable;
	private Relationship relationship;
	
	private int index;
	
	public UpdateCompositeAttributeinRelationshipCommand(
				TransactionalEditingDomain domain, Relationship relationship,
				String name, boolean nullable, int index) {
			super(domain, "No label", null);
			this.name = name;
			this.nullable = nullable;
			this.relationship = relationship;
			this.index = index;
	}
	
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) {
			// Create domain element
			CompositeAttribute attribute = EERFactory.eINSTANCE.createCompositeAttribute();
			attribute.setName(name);
			attribute.setNullable(nullable);
			relationship.getAttributes().remove(index);
			relationship.getAttributes().add(index, attribute);
			return CommandResult.newOKCommandResult();
	}
	
} // UpdateAttributeinRelationshipCommand

