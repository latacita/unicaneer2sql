package EER.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import EER.Exclusive;
import EER.Participant;
import EER.diagram.edit.policies.EERmodelBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ExclusiveReorientCommand extends EditElementCommand {

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
	public ExclusiveReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Exclusive) {
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
		if (!(oldEnd instanceof Participant && newEnd instanceof Participant)) {
			return false;
		}
		Participant target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Participant)) {
			return false;
		}
		Participant container = (Participant) getLink().eContainer();
		return EERmodelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistExclusive_4010(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Participant && newEnd instanceof Participant)) {
			return false;
		}
		Participant source = getLink().getSource();
		if (!(getLink().eContainer() instanceof Participant)) {
			return false;
		}
		Participant container = (Participant) getLink().eContainer();
		return EERmodelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistExclusive_4010(container, getLink(), source,
						getNewTarget());
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
		getLink().setSource(getNewSource());
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
	protected Exclusive getLink() {
		return (Exclusive) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Participant getOldSource() {
		return (Participant) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Participant getNewSource() {
		return (Participant) newEnd;
	}

	/**
	 * @generated
	 */
	protected Participant getOldTarget() {
		return (Participant) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Participant getNewTarget() {
		return (Participant) newEnd;
	}
}
