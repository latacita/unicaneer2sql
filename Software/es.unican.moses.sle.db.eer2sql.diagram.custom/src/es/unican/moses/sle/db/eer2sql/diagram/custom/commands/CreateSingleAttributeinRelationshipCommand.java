package es.unican.moses.sle.db.eer2sql.diagram.custom.commands;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;

import EER.AbstractRelationship;
import EER.Domain;
import EER.EERFactory;
import EER.SingleAttribute;

/**
 * Class CreateSingleAttributeinRelationshipCommand.</br>
 * 
 * @author Adrian Fdez San Marcos
 * @version 16-06-2011
 */
public class CreateSingleAttributeinRelationshipCommand extends AbstractTransactionalCommand {
	
	private String name ;
	private boolean nullable;
	private boolean derivate;
	private Domain dom;
	private int multiplicity;
	private AbstractRelationship relationship;
	
	public CreateSingleAttributeinRelationshipCommand(
				TransactionalEditingDomain domain, AbstractRelationship relationship,
				String name, boolean nullable, boolean derivate, Domain dom, int multiplicity) {
			super(domain, "No label", null);
			this.name = name;
			this.nullable = nullable;
			this.derivate = derivate;
			this.dom = dom;
			this.multiplicity = multiplicity;
			this.relationship = relationship;

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
			relationship.getAttributes().add(attribute);
			return CommandResult.newOKCommandResult();
	}
	
} // CreateSingleAttributeinRelationshipCommand

