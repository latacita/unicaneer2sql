package EER.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import EER.diagram.edit.commands.SingleAttribute5CreateCommand;
import EER.diagram.providers.EERmodelElementTypes;

/**
 * @generated
 */
public class CompositeAttributeCompositeAttributeCompartmentItemSemanticEditPolicy
		extends EERmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositeAttributeCompositeAttributeCompartmentItemSemanticEditPolicy() {
		super(EERmodelElementTypes.CompositeAttribute_3004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EERmodelElementTypes.SingleAttribute_3013 == req.getElementType()) {
			return getGEFWrapper(new SingleAttribute5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
