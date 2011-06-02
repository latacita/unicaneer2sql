package EER.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import EER.diagram.edit.commands.CompositeAttribute3CreateCommand;
import EER.diagram.edit.commands.GeneralizationRelationshipCreateCommand;
import EER.diagram.edit.commands.GeneralizationRelationshipReorientCommand;
import EER.diagram.edit.commands.SingleAttribute3CreateCommand;
import EER.diagram.edit.commands.SpecializationRelationshipCreateCommand;
import EER.diagram.edit.commands.SpecializationRelationshipReorientCommand;
import EER.diagram.edit.parts.CompositeAttribute3EditPart;
import EER.diagram.edit.parts.GeneralizationRelationshipEditPart;
import EER.diagram.edit.parts.SingleAttribute3EditPart;
import EER.diagram.edit.parts.SpecializationRelationshipEditPart;
import EER.diagram.part.EERmodelVisualIDRegistry;
import EER.diagram.providers.EERmodelElementTypes;

/**
 * @generated
 */
public class GeneralizationItemSemanticEditPolicy extends
		EERmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GeneralizationItemSemanticEditPolicy() {
		super(EERmodelElementTypes.Generalization_2011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EERmodelElementTypes.SingleAttribute_3009 == req.getElementType()) {
			return getGEFWrapper(new SingleAttribute3CreateCommand(req));
		}
		if (EERmodelElementTypes.CompositeAttribute_3010 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeAttribute3CreateCommand(req));
		}
		return super.getCreateCommand(req);
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
			if (EERmodelVisualIDRegistry.getVisualID(incomingLink) == GeneralizationRelationshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (EERmodelVisualIDRegistry.getVisualID(incomingLink) == SpecializationRelationshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
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
			case SingleAttribute3EditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case CompositeAttribute3EditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
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
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
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
		case SpecializationRelationshipEditPart.VISUAL_ID:
			return getGEFWrapper(new SpecializationRelationshipReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
