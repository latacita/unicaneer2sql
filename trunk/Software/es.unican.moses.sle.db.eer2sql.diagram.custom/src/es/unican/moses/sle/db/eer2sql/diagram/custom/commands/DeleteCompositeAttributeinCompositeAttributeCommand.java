package es.unican.moses.sle.db.eer2sql.diagram.custom.commands;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;

import EER.CompositeAttribute;

/**
 * Class DeleteCompositeAttributeinCompositeAttributeCommand.</br>
 * 
 * @author Adrian Fdez San Marcos
 * @version 16-06-2011
 */
public class DeleteCompositeAttributeinCompositeAttributeCommand extends AbstractTransactionalCommand{
		
	private CompositeAttribute element;
	private int index;
	
	public DeleteCompositeAttributeinCompositeAttributeCommand(
				TransactionalEditingDomain domain, CompositeAttribute element,
				Diagram diagram, int index) {
			super(domain, "No label", null);
			this.element = element;
			this.index = index;
	}
	
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) {
			// Delete attribute
			element.getSinglesAttributes().remove(index);
			return CommandResult.newOKCommandResult();
	}
	
} // DeleteCompositeAttributeinCompositeAttributeCommand

