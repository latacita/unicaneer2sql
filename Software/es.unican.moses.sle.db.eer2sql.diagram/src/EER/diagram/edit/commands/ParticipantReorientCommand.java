package EER.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import EER.AbstractRelationship;
import EER.Entity;
import EER.Participant;
import EER.diagram.edit.policies.Eer2sqlBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ParticipantReorientCommand extends EditElementCommand {

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
	public ParticipantReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Participant) {
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
		if (!(oldEnd instanceof AbstractRelationship && newEnd instanceof AbstractRelationship)) {
			return false;
		}
		Entity target = getLink().getTarget();
		return Eer2sqlBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistParticipant_4008(getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Entity && newEnd instanceof Entity)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof AbstractRelationship)) {
			return false;
		}
		AbstractRelationship source = (AbstractRelationship) getLink()
				.eContainer();
		return Eer2sqlBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistParticipant_4008(getLink(), source, getNewTarget());
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
		getOldSource().getParticipants().remove(getLink());
		getNewSource().getParticipants().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Participant getLink() {
		return (Participant) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected AbstractRelationship getOldSource() {
		return (AbstractRelationship) oldEnd;
	}

	/**
	 * @generated
	 */
	protected AbstractRelationship getNewSource() {
		return (AbstractRelationship) newEnd;
	}

	/**
	 * @generated
	 */
	protected Entity getOldTarget() {
		return (Entity) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Entity getNewTarget() {
		return (Entity) newEnd;
	}
}
