package EER.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import EER.diagram.edit.commands.AggregationParticipant2CreateCommand;
import EER.diagram.edit.commands.AggregationParticipant2ReorientCommand;
import EER.diagram.edit.commands.AggregationParticipantCreateCommand;
import EER.diagram.edit.commands.AggregationParticipantReorientCommand;
import EER.diagram.edit.commands.GeneralizationRelationshipCreateCommand;
import EER.diagram.edit.commands.GeneralizationRelationshipReorientCommand;
import EER.diagram.edit.commands.ParticipantCreateCommand;
import EER.diagram.edit.commands.ParticipantReorientCommand;
import EER.diagram.edit.commands.SpecializationRelationshipCreateCommand;
import EER.diagram.edit.commands.SpecializationRelationshipReorientCommand;
import EER.diagram.edit.parts.AggregationParticipant2EditPart;
import EER.diagram.edit.parts.AggregationParticipantEditPart;
import EER.diagram.edit.parts.CandidateKeyEditPart;
import EER.diagram.edit.parts.CompositeAttributeEditPart;
import EER.diagram.edit.parts.GeneralizationRelationshipEditPart;
import EER.diagram.edit.parts.ParticipantEditPart;
import EER.diagram.edit.parts.SingleAttributeEditPart;
import EER.diagram.edit.parts.SpecializationRelationshipEditPart;
import EER.diagram.edit.parts.WeakEntityWeakEntityAttributesCompartmentEditPart;
import EER.diagram.part.EERmodelVisualIDRegistry;
import EER.diagram.providers.EERmodelElementTypes;

/**
 * @generated
 */
public class WeakEntityItemSemanticEditPolicy extends
		EERmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public WeakEntityItemSemanticEditPolicy() {
		super(EERmodelElementTypes.WeakEntity_2009);
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
			if (EERmodelVisualIDRegistry.getVisualID(incomingLink) == AggregationParticipantEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (EERmodelVisualIDRegistry.getVisualID(incomingLink) == AggregationParticipant2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (EERmodelVisualIDRegistry.getVisualID(incomingLink) == ParticipantEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (EERmodelVisualIDRegistry.getVisualID(outgoingLink) == GeneralizationRelationshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EERmodelVisualIDRegistry.getVisualID(outgoingLink) == SpecializationRelationshipEditPart.VISUAL_ID) {
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
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (EERmodelVisualIDRegistry.getVisualID(node)) {
			case WeakEntityWeakEntityAttributesCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (EERmodelVisualIDRegistry.getVisualID(cnode)) {
					case CandidateKeyEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case SingleAttributeEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case CompositeAttributeEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
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
		if (EERmodelElementTypes.AggregationParticipant_4002 == req
				.getElementType()) {
			return null;
		}
		if (EERmodelElementTypes.AggregationParticipant_4006 == req
				.getElementType()) {
			return null;
		}
		if (EERmodelElementTypes.Participant_4001 == req.getElementType()) {
			return null;
		}
		if (EERmodelElementTypes.GeneralizationRelationship_4005 == req
				.getElementType()) {
			return getGEFWrapper(new GeneralizationRelationshipCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EERmodelElementTypes.SpecializationRelationship_4007 == req
				.getElementType()) {
			return getGEFWrapper(new SpecializationRelationshipCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (EERmodelElementTypes.AggregationParticipant_4002 == req
				.getElementType()) {
			return getGEFWrapper(new AggregationParticipantCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EERmodelElementTypes.AggregationParticipant_4006 == req
				.getElementType()) {
			return getGEFWrapper(new AggregationParticipant2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EERmodelElementTypes.Participant_4001 == req.getElementType()) {
			return getGEFWrapper(new ParticipantCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EERmodelElementTypes.GeneralizationRelationship_4005 == req
				.getElementType()) {
			return null;
		}
		if (EERmodelElementTypes.SpecializationRelationship_4007 == req
				.getElementType()) {
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
		case AggregationParticipantEditPart.VISUAL_ID:
			return getGEFWrapper(new AggregationParticipantReorientCommand(req));
		case AggregationParticipant2EditPart.VISUAL_ID:
			return getGEFWrapper(new AggregationParticipant2ReorientCommand(req));
		case ParticipantEditPart.VISUAL_ID:
			return getGEFWrapper(new ParticipantReorientCommand(req));
		case GeneralizationRelationshipEditPart.VISUAL_ID:
			return getGEFWrapper(new GeneralizationRelationshipReorientCommand(
					req));
		case SpecializationRelationshipEditPart.VISUAL_ID:
			return getGEFWrapper(new SpecializationRelationshipReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
