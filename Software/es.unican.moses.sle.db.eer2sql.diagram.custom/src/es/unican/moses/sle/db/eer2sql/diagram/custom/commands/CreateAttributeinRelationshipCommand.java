package es.unican.moses.sle.db.eer2sql.diagram.custom.commands;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ui.commands.ExecutionException;

import EER.Attribute;
import EER.Domain;
import EER.EERFactory;
import EER.Relationship;

public class CreateAttributeinRelationshipCommand extends AbstractTransactionalCommand {
	
	private String name ;
	private boolean nullable;
	private boolean derivate;
	private Domain dom;
	private int multiplicity;
	private Relationship relationship;
	private Diagram diagram;
	
	public CreateAttributeinRelationshipCommand(
				TransactionalEditingDomain domain, Relationship relationship,
				String name, boolean nullable, boolean derivate, Domain dom, int multiplicity,
				Diagram diagram) {
			super(domain, "No label", null);
			this.name = name;
			this.nullable = nullable;
			this.derivate = derivate;
			this.dom = dom;
			this.multiplicity = multiplicity;
			this.relationship = relationship;
			this.diagram = diagram;
	}
	
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) {
			// Create domain element
			Attribute attribute = EERFactory.eINSTANCE.createSingleAttribute();
			attribute.setName(name);
			attribute.setNullable(nullable);
			relationship.getAttributes().add(attribute);
			return CommandResult.newOKCommandResult();
	}
	
} // CreateAttributeinRelationshipCommand
