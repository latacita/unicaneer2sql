package EER.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import EER.diagram.edit.commands.CompositeAttributeCreateCommand;
import EER.diagram.edit.commands.CompositeAttributeReorientCommand;
import EER.diagram.edit.commands.ExclusionCreateCommand;
import EER.diagram.edit.commands.ExclusionReorientCommand;
import EER.diagram.edit.commands.InclusionCreateCommand;
import EER.diagram.edit.commands.InclusionReorientCommand;
import EER.diagram.edit.commands.ParticipantCreateCommand;
import EER.diagram.edit.commands.ParticipantReorientCommand;
import EER.diagram.edit.commands.SingleAttributeCreateCommand;
import EER.diagram.edit.commands.SingleAttributeReorientCommand;
import EER.diagram.edit.parts.CompositeAttributeEditPart;
import EER.diagram.edit.parts.ExclusionEditPart;
import EER.diagram.edit.parts.InclusionEditPart;
import EER.diagram.edit.parts.ParticipantEditPart;
import EER.diagram.edit.parts.SingleAttributeEditPart;
import EER.diagram.part.Eer2sqlVisualIDRegistry;
import EER.diagram.providers.Eer2sqlElementTypes;

/**
 * @generated
 */
public class RelationshipItemSemanticEditPolicy extends
		Eer2sqlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RelationshipItemSemanticEditPolicy() {
		super(Eer2sqlElementTypes.Relationship_2008);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (Eer2sqlVisualIDRegistry.getVisualID(incomingLink) == ExclusionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (Eer2sqlVisualIDRegistry.getVisualID(incomingLink) == InclusionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (Eer2sqlVisualIDRegistry.getVisualID(outgoingLink) == ExclusionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (Eer2sqlVisualIDRegistry.getVisualID(outgoingLink) == SingleAttributeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (Eer2sqlVisualIDRegistry.getVisualID(outgoingLink) == CompositeAttributeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (Eer2sqlVisualIDRegistry.getVisualID(outgoingLink) == ParticipantEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (Eer2sqlVisualIDRegistry.getVisualID(outgoingLink) == InclusionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
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
		if (Eer2sqlElementTypes.Exclusion_4002 == req.getElementType()) {
			return getGEFWrapper(new ExclusionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
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
		if (Eer2sqlElementTypes.Inclusion_4011 == req.getElementType()) {
			return getGEFWrapper(new InclusionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Eer2sqlElementTypes.Exclusion_4002 == req.getElementType()) {
			return getGEFWrapper(new ExclusionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (Eer2sqlElementTypes.SingleAttribute_4004 == req.getElementType()) {
			return null;
		}
		if (Eer2sqlElementTypes.CompositeAttribute_4007 == req.getElementType()) {
			return null;
		}
		if (Eer2sqlElementTypes.Participant_4008 == req.getElementType()) {
			return null;
		}
		if (Eer2sqlElementTypes.Inclusion_4011 == req.getElementType()) {
			return getGEFWrapper(new InclusionCreateCommand(req,
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
		case ExclusionEditPart.VISUAL_ID:
			return getGEFWrapper(new ExclusionReorientCommand(req));
		case SingleAttributeEditPart.VISUAL_ID:
			return getGEFWrapper(new SingleAttributeReorientCommand(req));
		case CompositeAttributeEditPart.VISUAL_ID:
			return getGEFWrapper(new CompositeAttributeReorientCommand(req));
		case ParticipantEditPart.VISUAL_ID:
			return getGEFWrapper(new ParticipantReorientCommand(req));
		case InclusionEditPart.VISUAL_ID:
			return getGEFWrapper(new InclusionReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
