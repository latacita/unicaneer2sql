package EER.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import EER.diagram.edit.commands.SingleAttribute4CreateCommand;
import EER.diagram.providers.EERmodelElementTypes;

/**
 * @generated
 */
public class CompositeAttributeCompositeAttributeCompartment2ItemSemanticEditPolicy
		extends EERmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositeAttributeCompositeAttributeCompartment2ItemSemanticEditPolicy() {
		super(EERmodelElementTypes.CompositeAttribute_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EERmodelElementTypes.SingleAttribute_3012 == req.getElementType()) {
			return getGEFWrapper(new SingleAttribute4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
