package EER.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import EER.diagram.providers.Eer2sqlElementTypes;

/**
 * @generated
 */
public class EnumeratedLiteralItemSemanticEditPolicy extends
		Eer2sqlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EnumeratedLiteralItemSemanticEditPolicy() {
		super(Eer2sqlElementTypes.EnumeratedLiteral_4010);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
