package EER.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import EER.diagram.edit.commands.EnumeratedLiteralCreateCommand;
import EER.diagram.providers.EERmodelElementTypes;

/**
 * @generated
 */
public class EnumerationTypeEnumerationTypeCompartmentItemSemanticEditPolicy
		extends EERmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EnumerationTypeEnumerationTypeCompartmentItemSemanticEditPolicy() {
		super(EERmodelElementTypes.EnumerationType_2016);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EERmodelElementTypes.EnumeratedLiteral_3011 == req.getElementType()) {
			return getGEFWrapper(new EnumeratedLiteralCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
