package EER.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import EER.diagram.edit.commands.CompositeAttributeCreateCommand;
import EER.diagram.edit.commands.CompositeAttributeReorientCommand;
import EER.diagram.edit.commands.ParticipantCreateCommand;
import EER.diagram.edit.commands.ParticipantReorientCommand;
import EER.diagram.edit.commands.SingleAttributeCreateCommand;
import EER.diagram.edit.commands.SingleAttributeReorientCommand;
import EER.diagram.edit.parts.CompositeAttributeEditPart;
import EER.diagram.edit.parts.ParticipantEditPart;
import EER.diagram.edit.parts.SingleAttributeEditPart;
import EER.diagram.providers.Eer2sqlElementTypes;

/**
 * @generated
 */
public class DependencyRelationship2ItemSemanticEditPolicy extends
		Eer2sqlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DependencyRelationship2ItemSemanticEditPolicy() {
		super(Eer2sqlElementTypes.DependencyRelationship_4006);
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
		if (Eer2sqlElementTypes.SingleAttribute_4004 == req.getElementType()) {
			return getGEFWrapper(new SingleAttributeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (Eer2sqlElementTypes.CompositeAttribute_4007 == req.getElementType()) {
			return getGEFWrapper(new CompositeAttributeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (Eer2sqlElementTypes.Participant_4008 == req.getElementType()) {
			return getGEFWrapper(new ParticipantCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Eer2sqlElementTypes.SingleAttribute_4004 == req.getElementType()) {
			return null;
		}
		if (Eer2sqlElementTypes.CompositeAttribute_4007 == req.getElementType()) {
			return null;
		}
		if (Eer2sqlElementTypes.Participant_4008 == req.getElementType()) {
			return null;
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
		case SingleAttributeEditPart.VISUAL_ID:
			return getGEFWrapper(new SingleAttributeReorientCommand(req));
		case CompositeAttributeEditPart.VISUAL_ID:
			return getGEFWrapper(new CompositeAttributeReorientCommand(req));
		case ParticipantEditPart.VISUAL_ID:
			return getGEFWrapper(new ParticipantReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
