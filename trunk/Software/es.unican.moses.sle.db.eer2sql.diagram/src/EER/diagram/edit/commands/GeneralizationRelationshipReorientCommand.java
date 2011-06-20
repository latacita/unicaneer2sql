package EER.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import EER.Entity;
import EER.Generalization;
import EER.GeneralizationRelationship;
import EER.diagram.edit.policies.EERmodelBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class GeneralizationRelationshipReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public GeneralizationRelationshipReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof GeneralizationRelationship) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Entity && newEnd instanceof Entity)) {
			return false;
		}
		Generalization target = getLink().getRelationship();
		if (!(getLink().eContainer() instanceof Entity)) {
			return false;
		}
		Entity container = (Entity) getLink().eContainer();
		return EERmodelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistGeneralizationRelationship_4005(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Generalization && newEnd instanceof Generalization)) {
			return false;
		}
		Entity source = getLink().getChild();
		if (!(getLink().eContainer() instanceof Entity)) {
			return false;
		}
		Entity container = (Entity) getLink().eContainer();
		return EERmodelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistGeneralizationRelationship_4005(container, getLink(),
						source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setChild(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setRelationship(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected GeneralizationRelationship getLink() {
		return (GeneralizationRelationship) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Entity getOldSource() {
		return (Entity) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Entity getNewSource() {
		return (Entity) newEnd;
	}

	/**
	 * @generated
	 */
	protected Generalization getOldTarget() {
		return (Generalization) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Generalization getNewTarget() {
		return (Generalization) newEnd;
	}
}
