package EER.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import EER.diagram.edit.commands.GeneralizationChildsCreateCommand;
import EER.diagram.edit.commands.GeneralizationChildsReorientCommand;
import EER.diagram.edit.commands.GeneralizationParentCreateCommand;
import EER.diagram.edit.commands.GeneralizationParentReorientCommand;
import EER.diagram.edit.commands.GeneralizationRelationshipCreateCommand;
import EER.diagram.edit.commands.GeneralizationRelationshipReorientCommand;
import EER.diagram.edit.parts.GeneralizationChildsEditPart;
import EER.diagram.edit.parts.GeneralizationParentEditPart;
import EER.diagram.edit.parts.GeneralizationRelationshipEditPart;
import EER.diagram.part.Eer2sqlVisualIDRegistry;
import EER.diagram.providers.Eer2sqlElementTypes;

/**
 * @generated
 */
public class GeneralizationItemSemanticEditPolicy extends
		Eer2sqlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GeneralizationItemSemanticEditPolicy() {
		super(Eer2sqlElementTypes.Generalization_2003);
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
			if (Eer2sqlVisualIDRegistry.getVisualID(incomingLink) == GeneralizationRelationshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (Eer2sqlVisualIDRegistry.getVisualID(outgoingLink) == GeneralizationParentEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (Eer2sqlVisualIDRegistry.getVisualID(outgoingLink) == GeneralizationChildsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
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
		if (Eer2sqlElementTypes.GeneralizationRelationship_4001 == req
				.getElementType()) {
			return null;
		}
		if (Eer2sqlElementTypes.GeneralizationParent_4012 == req
				.getElementType()) {
			return getGEFWrapper(new GeneralizationParentCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (Eer2sqlElementTypes.GeneralizationChilds_4015 == req
				.getElementType()) {
			return getGEFWrapper(new GeneralizationChildsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Eer2sqlElementTypes.GeneralizationRelationship_4001 == req
				.getElementType()) {
			return getGEFWrapper(new GeneralizationRelationshipCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (Eer2sqlElementTypes.GeneralizationParent_4012 == req
				.getElementType()) {
			return null;
		}
		if (Eer2sqlElementTypes.GeneralizationChilds_4015 == req
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
		case GeneralizationRelationshipEditPart.VISUAL_ID:
			return getGEFWrapper(new GeneralizationRelationshipReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
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
		case GeneralizationParentEditPart.VISUAL_ID:
			return getGEFWrapper(new GeneralizationParentReorientCommand(req));
		case GeneralizationChildsEditPart.VISUAL_ID:
			return getGEFWrapper(new GeneralizationChildsReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
