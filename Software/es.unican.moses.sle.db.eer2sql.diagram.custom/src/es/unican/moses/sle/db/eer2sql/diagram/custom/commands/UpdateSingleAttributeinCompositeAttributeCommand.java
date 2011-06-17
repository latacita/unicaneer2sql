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
import EER.SingleAttribute;

/**
 * Class UpdateSingleAttributeinCompositeAttributeCommand.</br>
 * 
 * @author Adrian Fdez San Marcos
 * @version 16-06-2011
 */
public class UpdateSingleAttributeinCompositeAttributeCommand extends AbstractTransactionalCommand {
	
	private String name ;
	private boolean nullable;
	private boolean derivate;
	private Domain dom;
	private int multiplicity;
	private CompositeAttribute element;
	private int index;
	
	public UpdateSingleAttributeinCompositeAttributeCommand(
				TransactionalEditingDomain domain, CompositeAttribute element,
				String name, boolean nullable, boolean derivate, Domain dom, int multiplicity,
				Diagram diagram, int index) {
			super(domain, "No label", null);
			this.name = name;
			this.nullable = nullable;
			this.derivate = derivate;
			this.dom = dom;
			this.multiplicity = multiplicity;
			this.element = element;
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
			element.getSinglesAttributes().remove(index);
			element.getSinglesAttributes().add(index, attribute);
			return CommandResult.newOKCommandResult();
	}
	
} // UpdateSingleAttributeinCompositeAttributeCommand


