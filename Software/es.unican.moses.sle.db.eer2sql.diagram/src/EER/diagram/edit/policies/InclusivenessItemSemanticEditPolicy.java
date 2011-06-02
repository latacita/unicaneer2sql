package EER.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import EER.diagram.providers.EERmodelElementTypes;

/**
 * @generated
 */
public class InclusivenessItemSemanticEditPolicy extends
		EERmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InclusivenessItemSemanticEditPolicy() {
		super(EERmodelElementTypes.Inclusiveness_4011);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
