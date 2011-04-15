package EER.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;

import EER.diagram.edit.commands.EntityPrimaryKeyCreateCommand;
import EER.diagram.edit.commands.EntityPrimaryKeyReorientCommand;
import EER.diagram.edit.parts.EntityPrimaryKeyEditPart;
import EER.diagram.providers.Eer2sqlElementTypes;

/**
 * @generated
 */
public class CandidateKeyItemSemanticEditPolicy extends
		Eer2sqlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CandidateKeyItemSemanticEditPolicy() {
		super(Eer2sqlElementTypes.CandidateKey_4003);
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
		if (Eer2sqlElementTypes.EntityPrimaryKey_4014 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Eer2sqlElementTypes.EntityPrimaryKey_4014 == req.getElementType()) {
			return getGEFWrapper(new EntityPrimaryKeyCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case EntityPrimaryKeyEditPart.VISUAL_ID:
			return getGEFWrapper(new EntityPrimaryKeyReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
