package EER.diagram.edit.commands;

/**
 * @generated
 */
public class DependencyRelationshipReorientCommand extends org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand {

	/**
 * @generated
 */
	private final int reorientDirection;

	/**
 * @generated
 */
	private final org.eclipse.emf.ecore.EObject oldEnd;

	/**
 * @generated
 */
	private final org.eclipse.emf.ecore.EObject newEnd;

	/**
 * @generated
 */
	public DependencyRelationshipReorientCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}
	
	/**
 * @generated
 */
	public boolean canExecute() {
			if (false == getElementToEdit() instanceof EER.DependencyRelationship) {
		return false;
	}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
 * @generated
 */
	protected boolean canReorientSource() {
			if (!(oldEnd instanceof EER.Entity && newEnd instanceof EER.Entity)) {
		return false;
	}
				
			return EER.diagram.edit.policies.Eer2sqlBaseItemSemanticEditPolicy.getLinkConstraints().canExistDependencyRelationship_4006(getLink(), getNewSource(), target);
	}

	/**
 * @generated
 */
	protected boolean canReorientTarget() {
			if (!( && )) {
		return false;
	}
			if (!(getLink().eContainer() instanceof EER.Entity)) {
			return false;
		}
		EER.Entity source = (EER.Entity) getLink().eContainer();
			return EER.diagram.edit.policies.Eer2sqlBaseItemSemanticEditPolicy.getLinkConstraints().canExistDependencyRelationship_4006(getLink(), source, getNewTarget());
	}
	
	/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult doExecuteWithResult(
			org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info)
			throws org.eclipse.core.commands.ExecutionException {
		if (!canExecute()) {
			throw new org.eclipse.core.commands.ExecutionException("Invalid arguments in reorient link command");  //$NON-NLS-1$
		}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult reorientSource() throws org.eclipse.core.commands.ExecutionException {
				getOldSource().getDependencyRelationships().remove(getLink());
	getNewSource().getDependencyRelationships().add(getLink());
	return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult(getLink());
	}

	/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult reorientTarget() throws org.eclipse.core.commands.ExecutionException {
				getLink().setType(getNewTarget());
	return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult(getLink());
	}
		
	/**
 * @generated
 */
	protected EER.DependencyRelationship getLink() {
		return (EER.DependencyRelationship) getElementToEdit();
	}
	
	/**
 * @generated
 */
	protected EER.Entity getOldSource() {
		return (EER.Entity) oldEnd;
	}
	
	/**
 * @generated
 */
	protected EER.Entity getNewSource() {
		return (EER.Entity) newEnd;
	}
	
	/**
 * @generated
 */
	protected  getOldTarget() {
		return ;
	}
	
	/**
 * @generated
 */
	protected  getNewTarget() {
		return ;
	}
}
