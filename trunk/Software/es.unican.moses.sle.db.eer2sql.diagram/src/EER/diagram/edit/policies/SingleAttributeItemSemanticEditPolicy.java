package EER.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import EER.diagram.edit.commands.CandidateKeyCreateCommand;
import EER.diagram.edit.commands.CandidateKeyReorientCommand;
import EER.diagram.edit.commands.CompositeAttributeCreateCommand;
import EER.diagram.edit.commands.CompositeAttributeReorientCommand;
import EER.diagram.edit.parts.CandidateKeyEditPart;
import EER.diagram.edit.parts.CompositeAttributeEditPart;
import EER.diagram.providers.Eer2sqlElementTypes;

/**
 * @generated
 */
public class SingleAttributeItemSemanticEditPolicy extends
		Eer2sqlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SingleAttributeItemSemanticEditPolicy() {
		super(Eer2sqlElementTypes.SingleAttribute_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Eer2sqlElementTypes.CandidateKey_4003 == req.getElementType()) {
			return null;
		}
		if (Eer2sqlElementTypes.CompositeAttribute_4007 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Eer2sqlElementTypes.CandidateKey_4003 == req.getElementType()) {
			return getGEFWrapper(new CandidateKeyCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (Eer2sqlElementTypes.CompositeAttribute_4007 == req.getElementType()) {
			return getGEFWrapper(new CompositeAttributeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case CandidateKeyEditPart.VISUAL_ID:
			return getGEFWrapper(new CandidateKeyReorientCommand(req));
		case CompositeAttributeEditPart.VISUAL_ID:
			return getGEFWrapper(new CompositeAttributeReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
