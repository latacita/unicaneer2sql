package EER.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import EER.diagram.edit.commands.ExclusiveCreateCommand;
import EER.diagram.edit.commands.ExclusiveReorientCommand;
import EER.diagram.edit.commands.InclusivenessCreateCommand;
import EER.diagram.edit.commands.InclusivenessReorientCommand;
import EER.diagram.edit.parts.ExclusiveEditPart;
import EER.diagram.edit.parts.InclusivenessEditPart;
import EER.diagram.providers.EERmodelElementTypes;

/**
 * @generated
 */
public class ParticipantItemSemanticEditPolicy extends
		EERmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ParticipantItemSemanticEditPolicy() {
		super(EERmodelElementTypes.Participant_4001);
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
		if (EERmodelElementTypes.Exclusive_4010 == req.getElementType()) {
			return getGEFWrapper(new ExclusiveCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EERmodelElementTypes.Inclusiveness_4011 == req.getElementType()) {
			return getGEFWrapper(new InclusivenessCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (EERmodelElementTypes.Exclusive_4010 == req.getElementType()) {
			return getGEFWrapper(new ExclusiveCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EERmodelElementTypes.Inclusiveness_4011 == req.getElementType()) {
			return getGEFWrapper(new InclusivenessCreateCommand(req,
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
		case ExclusiveEditPart.VISUAL_ID:
			return getGEFWrapper(new ExclusiveReorientCommand(req));
		case InclusivenessEditPart.VISUAL_ID:
			return getGEFWrapper(new InclusivenessReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
