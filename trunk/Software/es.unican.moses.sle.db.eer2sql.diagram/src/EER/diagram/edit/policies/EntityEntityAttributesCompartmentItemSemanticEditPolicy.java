package EER.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import EER.diagram.edit.commands.CandidateKey2CreateCommand;
import EER.diagram.edit.commands.CompositeAttribute2CreateCommand;
import EER.diagram.edit.commands.SingleAttribute2CreateCommand;
import EER.diagram.providers.EERmodelElementTypes;

/**
 * @generated
 */
public class EntityEntityAttributesCompartmentItemSemanticEditPolicy extends
		EERmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EntityEntityAttributesCompartmentItemSemanticEditPolicy() {
		super(EERmodelElementTypes.Entity_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EERmodelElementTypes.CandidateKey_3008 == req.getElementType()) {
			return getGEFWrapper(new CandidateKey2CreateCommand(req));
		}
		if (EERmodelElementTypes.SingleAttribute_3007 == req.getElementType()) {
			return getGEFWrapper(new SingleAttribute2CreateCommand(req));
		}
		if (EERmodelElementTypes.CompositeAttribute_3004 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeAttribute2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
