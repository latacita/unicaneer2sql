package EER.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import EER.Aggregation;
import EER.AggregationParticipant;
import EER.MemberCollection;
import EER.diagram.edit.policies.Eer2sqlBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class AggregationParticipantReorientCommand extends EditElementCommand {

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
	public AggregationParticipantReorientCommand(
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
		if (false == getElementToEdit() instanceof AggregationParticipant) {
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
		if (!(oldEnd instanceof MemberCollection && newEnd instanceof MemberCollection)) {
			return false;
		}
		Aggregation target = getLink().getSource();
		return Eer2sqlBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAggregationParticipant_4009(getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Aggregation && newEnd instanceof Aggregation)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof MemberCollection)) {
			return false;
		}
		MemberCollection source = (MemberCollection) getLink().eContainer();
		return Eer2sqlBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAggregationParticipant_4009(getLink(), source,
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
		getOldSource().setParticipant(null);
		getNewSource().setParticipant(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setSource(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected AggregationParticipant getLink() {
		return (AggregationParticipant) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected MemberCollection getOldSource() {
		return (MemberCollection) oldEnd;
	}

	/**
	 * @generated
	 */
	protected MemberCollection getNewSource() {
		return (MemberCollection) newEnd;
	}

	/**
	 * @generated
	 */
	protected Aggregation getOldTarget() {
		return (Aggregation) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Aggregation getNewTarget() {
		return (Aggregation) newEnd;
	}
}
