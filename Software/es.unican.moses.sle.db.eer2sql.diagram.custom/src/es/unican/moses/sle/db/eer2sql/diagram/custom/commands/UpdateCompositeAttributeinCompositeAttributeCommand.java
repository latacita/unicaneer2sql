package es.unican.moses.sle.db.eer2sql.diagram.custom.commands;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import EER.CompositeAttribute;
import EER.EERFactory;

/**
 * Class UpdateCompositeAttributeinCompositeAttributeCommand.</br>
 * 
 * @author Adrian Fdez San Marcos
 * @version 16-06-2011
 */
public class UpdateCompositeAttributeinCompositeAttributeCommand extends AbstractTransactionalCommand {
	
	private String name ;
	private boolean nullable;
	private CompositeAttribute element;
	
	private int index;
	
	public UpdateCompositeAttributeinCompositeAttributeCommand(
				TransactionalEditingDomain domain, CompositeAttribute element,
				String name, boolean nullable, int index) {
			super(domain, "No label", null);
			this.name = name;
			this.nullable = nullable;
			this.element = element;
			this.index = index;
	}
	
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) {
			// Create domain element
			CompositeAttribute attribute = EERFactory.eINSTANCE.createCompositeAttribute();
			attribute.setName(name);
			attribute.setNullable(nullable);
			element.getSinglesAttributes().remove(index);
			element.getSinglesAttributes().add(index, attribute);
			return CommandResult.newOKCommandResult();
	}
	
} // UpdateCompositeAttributeinCompositeAttributeCommand

