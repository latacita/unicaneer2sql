package EER.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import EER.diagram.edit.commands.CompositeComponentCreateCommand;
import EER.diagram.edit.commands.DependencyRelationshipCreateCommand;
import EER.diagram.edit.commands.EnumerationTypeCreateCommand;
import EER.diagram.edit.commands.GeneralizationCreateCommand;
import EER.diagram.edit.commands.MemberCollectionCreateCommand;
import EER.diagram.edit.commands.PrimitiveTypeCreateCommand;
import EER.diagram.edit.commands.RelationshipCreateCommand;
import EER.diagram.edit.commands.WeakEntityCreateCommand;
import EER.diagram.providers.Eer2sqlElementTypes;

/**
 * @generated
 */
public class ProjectItemSemanticEditPolicy extends
		Eer2sqlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProjectItemSemanticEditPolicy() {
		super(Eer2sqlElementTypes.Project_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Eer2sqlElementTypes.WeakEntity_2001 == req.getElementType()) {
			return getGEFWrapper(new WeakEntityCreateCommand(req));
		}
		if (Eer2sqlElementTypes.EnumerationType_2002 == req.getElementType()) {
			return getGEFWrapper(new EnumerationTypeCreateCommand(req));
		}
		if (Eer2sqlElementTypes.Generalization_2003 == req.getElementType()) {
			return getGEFWrapper(new GeneralizationCreateCommand(req));
		}
		if (Eer2sqlElementTypes.MemberCollection_2004 == req.getElementType()) {
			return getGEFWrapper(new MemberCollectionCreateCommand(req));
		}
		if (Eer2sqlElementTypes.PrimitiveType_2005 == req.getElementType()) {
			return getGEFWrapper(new PrimitiveTypeCreateCommand(req));
		}
		if (Eer2sqlElementTypes.CompositeComponent_2006 == req.getElementType()) {
			return getGEFWrapper(new CompositeComponentCreateCommand(req));
		}
		if (Eer2sqlElementTypes.DependencyRelationship_2007 == req
				.getElementType()) {
			return getGEFWrapper(new DependencyRelationshipCreateCommand(req));
		}
		if (Eer2sqlElementTypes.Relationship_2008 == req.getElementType()) {
			return getGEFWrapper(new RelationshipCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
