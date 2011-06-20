package EER.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import EER.diagram.edit.commands.AggregationCreateCommand;
import EER.diagram.edit.commands.DependencyRelationshipCreateCommand;
import EER.diagram.edit.commands.EntityCreateCommand;
import EER.diagram.edit.commands.EnumerationTypeCreateCommand;
import EER.diagram.edit.commands.GeneralizationCreateCommand;
import EER.diagram.edit.commands.PrimitiveTypeCreateCommand;
import EER.diagram.edit.commands.RelationshipCreateCommand;
import EER.diagram.edit.commands.WeakEntityCreateCommand;
import EER.diagram.providers.EERmodelElementTypes;

/**
 * @generated
 */
public class ProjectItemSemanticEditPolicy extends
		EERmodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProjectItemSemanticEditPolicy() {
		super(EERmodelElementTypes.Project_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EERmodelElementTypes.WeakEntity_2009 == req.getElementType()) {
			return getGEFWrapper(new WeakEntityCreateCommand(req));
		}
		if (EERmodelElementTypes.Entity_2003 == req.getElementType()) {
			return getGEFWrapper(new EntityCreateCommand(req));
		}
		if (EERmodelElementTypes.Relationship_2007 == req.getElementType()) {
			return getGEFWrapper(new RelationshipCreateCommand(req));
		}
		if (EERmodelElementTypes.DependencyRelationship_2010 == req
				.getElementType()) {
			return getGEFWrapper(new DependencyRelationshipCreateCommand(req));
		}
		if (EERmodelElementTypes.Generalization_2011 == req.getElementType()) {
			return getGEFWrapper(new GeneralizationCreateCommand(req));
		}
		if (EERmodelElementTypes.PrimitiveType_2015 == req.getElementType()) {
			return getGEFWrapper(new PrimitiveTypeCreateCommand(req));
		}
		if (EERmodelElementTypes.EnumerationType_2016 == req.getElementType()) {
			return getGEFWrapper(new EnumerationTypeCreateCommand(req));
		}
		if (EERmodelElementTypes.Aggregation_2017 == req.getElementType()) {
			return getGEFWrapper(new AggregationCreateCommand(req));
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
