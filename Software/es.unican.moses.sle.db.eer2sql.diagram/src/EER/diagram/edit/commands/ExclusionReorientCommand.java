package EER.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import EER.Exclusion;
import EER.Relationship;
import EER.diagram.edit.policies.Eer2sqlBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ExclusionReorientCommand extends EditElementCommand {

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
	public ExclusionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Exclusion) {
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
		if (!(oldEnd instanceof Relationship && newEnd instanceof Relationship)) {
			return false;
		}
		Relationship target = getLink().getSource();
		return Eer2sqlBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistExclusion_4002(getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Relationship && newEnd instanceof Relationship)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Relationship)) {
			return false;
		}
		Relationship source = (Relationship) getLink().eContainer();
		return Eer2sqlBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistExclusion_4002(getLink(), source, getNewTarget());
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
		getOldSource().getExclusionConstraints().remove(getLink());
		getNewSource().getExclusionConstraints().add(getLink());
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
	protected Exclusion getLink() {
		return (Exclusion) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Relationship getOldSource() {
		return (Relationship) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Relationship getNewSource() {
		return (Relationship) newEnd;
	}

	/**
	 * @generated
	 */
	protected Relationship getOldTarget() {
		return (Relationship) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Relationship getNewTarget() {
		return (Relationship) newEnd;
	}
}
