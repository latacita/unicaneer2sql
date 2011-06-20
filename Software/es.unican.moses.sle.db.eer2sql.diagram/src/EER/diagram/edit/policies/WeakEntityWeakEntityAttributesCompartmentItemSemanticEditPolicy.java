package EER.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import EER.diagram.edit.commands.CandidateKeyCreateCommand;
import EER.diagram.edit.commands.CompositeAttributeCreateCommand;
import EER.diagram.edit.commands.SingleAttributeCreateCommand;
import EER.diagram.providers.EERmodelElementTypes;

/**
 * @generated
 */
public class WeakEntityWeakEntityAttributesCompartmentItemSemanticEditPolicy
		extends EERmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public WeakEntityWeakEntityAttributesCompartmentItemSemanticEditPolicy() {
		super(EERmodelElementTypes.WeakEntity_2009);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EERmodelElementTypes.CandidateKey_3005 == req.getElementType()) {
			return getGEFWrapper(new CandidateKeyCreateCommand(req));
		}
		if (EERmodelElementTypes.SingleAttribute_3001 == req.getElementType()) {
			return getGEFWrapper(new SingleAttributeCreateCommand(req));
		}
		if (EERmodelElementTypes.CompositeAttribute_3002 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeAttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
