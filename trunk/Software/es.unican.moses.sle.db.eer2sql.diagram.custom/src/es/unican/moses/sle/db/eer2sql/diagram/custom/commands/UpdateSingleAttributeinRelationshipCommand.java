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
import EER.SingleAttribute;

public class UpdateSingleAttributeinRelationshipCommand extends AbstractTransactionalCommand {
	
	private String name ;
	private boolean nullable;
	private boolean derivate;
	private Domain dom;
	private int multiplicity;
	private Relationship relationship;
	private Diagram diagram;
	
	private int index;
	
	public UpdateSingleAttributeinRelationshipCommand(
				TransactionalEditingDomain domain, Relationship relationship,
				String name, boolean nullable, boolean derivate, Domain dom, int multiplicity,
				Diagram diagram, int index) {
			super(domain, "No label", null);
			this.name = name;
			this.nullable = nullable;
			this.derivate = derivate;
			this.dom = dom;
			this.multiplicity = multiplicity;
			this.relationship = relationship;
			this.diagram = diagram;
			this.index = index;
	}
	
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) {
			// Create domain element
			SingleAttribute attribute = EERFactory.eINSTANCE.createSingleAttribute();
			attribute.setName(name);
			attribute.setNullable(nullable);
			attribute.setDerivate(derivate);
			attribute.setDomain(dom);
			attribute.setMultiplicity(multiplicity);
			relationship.getAttributes().remove(index);
			relationship.getAttributes().add(index, attribute);
			return CommandResult.newOKCommandResult();
	}
	
} // UpdateAttributeinRelationshipCommand

