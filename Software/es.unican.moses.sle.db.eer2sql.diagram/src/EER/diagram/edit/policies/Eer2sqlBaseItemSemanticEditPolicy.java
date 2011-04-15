package EER.diagram.edit.policies;

/**
 * @generated
 */
public class Eer2sqlBaseItemSemanticEditPolicy extends org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy {

		/**
 * Extended request data key to hold editpart visual id.
 * @generated
 */
	public static final String VISUAL_ID_KEY = "visual_id";  //$NON-NLS-1$

	/**
 * @generated
 */
	private final org.eclipse.gmf.runtime.emf.type.core.IElementType myElementType;
	
		/**
 * @generated
 */
	protected Eer2sqlBaseItemSemanticEditPolicy(org.eclipse.gmf.runtime.emf.type.core.IElementType elementType) {
		myElementType = elementType;
	}

	/**
 * Extended request data key to hold editpart visual id.
 * Add visual id of edited editpart to extended data of the request
 * so command switch can decide what kind of diagram element is being edited.
 * It is done in those cases when it's not possible to deduce diagram
 * element kind from domain element.
 * 
 * @generated
 */
	public org.eclipse.gef.commands.Command getCommand(org.eclipse.gef.Request request) {
		if (request instanceof org.eclipse.gef.requests.ReconnectRequest) {
			Object view = ((org.eclipse.gef.requests.ReconnectRequest) request).getConnectionEditPart().getModel();
			if (view instanceof org.eclipse.gmf.runtime.notation.View) {
				Integer id = new Integer(EER.diagram.part.Eer2sqlVisualIDRegistry.getVisualID((org.eclipse.gmf.runtime.notation.View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}
	
	/**
 * Returns visual id from request parameters.
 * @generated
 */
	protected int getVisualID(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

		/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getSemanticCommand(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest request) {
	org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest completedRequest = completeRequest(request);
	org.eclipse.gef.commands.Command semanticCommand = getSemanticCommandSwitch(completedRequest);
	semanticCommand = getEditHelperCommand(completedRequest, semanticCommand);
	if (completedRequest instanceof org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest) {
		org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest destroyRequest = (org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest) completedRequest;
		return shouldProceed(destroyRequest) ? addDeleteViewCommand(semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}
	
	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command addDeleteViewCommand(org.eclipse.gef.commands.Command mainCommand, org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest completedRequest){
		org.eclipse.gef.commands.Command deleteViewCommand = getGEFWrapper(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), (org.eclipse.gmf.runtime.notation.View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand.chain(deleteViewCommand);
}
	
		/**
 * @generated
 */
	private org.eclipse.gef.commands.Command getEditHelperCommand(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest request, org.eclipse.gef.commands.Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			org.eclipse.gmf.runtime.common.core.command.ICommand command = editPolicyCommand instanceof org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy ? ((org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy) editPolicyCommand).getICommand() : new org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy(editPolicyCommand);
			request.setParameter(EER.diagram.edit.helpers.Eer2sqlBaseEditHelper.EDIT_POLICY_COMMAND, command);
		}
		org.eclipse.gmf.runtime.emf.type.core.IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(EER.diagram.edit.helpers.Eer2sqlBaseEditHelper.CONTEXT_ELEMENT_TYPE, requestContextElementType);
		org.eclipse.gmf.runtime.common.core.command.ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(EER.diagram.edit.helpers.Eer2sqlBaseEditHelper.EDIT_POLICY_COMMAND, null);
		request.setParameter(EER.diagram.edit.helpers.Eer2sqlBaseEditHelper.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand)) {
				command = new org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand(getEditingDomain(), command.getLabel()).compose(command);
			}
			return new org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy(command);
		}
		return editPolicyCommand;
	}
	
		/**
 * @generated
 */
	private org.eclipse.gmf.runtime.emf.type.core.IElementType getContextElementType(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest request) {
		org.eclipse.gmf.runtime.emf.type.core.IElementType requestContextElementType = EER.diagram.providers.Eer2sqlElementTypes.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType : myElementType;
	}
	
	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getSemanticCommandSwitch(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest req) {
	if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest) {
		return getCreateRelationshipCommand((org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) {
		return getCreateCommand((org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest) {
		return getConfigureCommand((org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest) {
		return getDestroyElementCommand((org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest) {
		return getDestroyReferenceCommand((org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest) {
		return getDuplicateCommand((org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest) {
		return getEditContextCommand((org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest) {
		return getMoveCommand((org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest) {
		return getReorientReferenceRelationshipCommand((org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest) {
		return getReorientRelationshipCommand((org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest) {
		return getSetCommand((org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest) req);
	}
	return null;
}
	
	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getConfigureCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getCreateRelationshipCommand(org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getCreateCommand(org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getSetCommand(org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getEditContextCommand(org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getDestroyElementCommand(org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getDestroyReferenceCommand(org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getDuplicateCommand(org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getMoveCommand(org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getReorientReferenceRelationshipCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest req) {
	return org.eclipse.gef.commands.UnexecutableCommand.INSTANCE;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getReorientRelationshipCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest req) {
	return org.eclipse.gef.commands.UnexecutableCommand.INSTANCE;
}
	
		/**
 * @generated
 */
	protected final org.eclipse.gef.commands.Command getGEFWrapper(org.eclipse.gmf.runtime.common.core.command.ICommand cmd) {
		return new org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy(cmd);
	}

	/**
 * Returns editing domain from the host edit part.
 * @generated
 */
	protected org.eclipse.emf.transaction.TransactionalEditingDomain getEditingDomain() {
		return ((org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart) getHost()).getEditingDomain();
	}

		/**
 * Clean all shortcuts to the host element from the same diagram
 * @generated
 */
	protected void addDestroyShortcutsCommand(org.eclipse.gmf.runtime.common.core.command.ICompositeCommand cmd, org.eclipse.gmf.runtime.notation.View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (java.util.Iterator it = view.getDiagram().getChildren().iterator(); it.hasNext();) {
			org.eclipse.gmf.runtime.notation.View nextView = (org.eclipse.gmf.runtime.notation.View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), nextView));
		}
	}

	
	/**
 * @generated
 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = EER.diagram.part.Eer2sqlDiagramEditorPlugin.getInstance().getLinkConstraints();
		if (cached == null) {
			EER.diagram.part.Eer2sqlDiagramEditorPlugin.getInstance().setLinkConstraints(cached = new LinkConstraints());
		}
		return cached;
	}


/**
 * @generated
 */
public static class LinkConstraints {

	/**
 * @generated
 */
	LinkConstraints() {
		// use static method #getLinkConstraints() to access instance
	}

	
/**
 * @generated
 */
public boolean canCreateGeneralizationRelationship_4001(EER.Entity source, EER.Generalization target) {
						return canExistGeneralizationRelationship_4001(null, source, target);
}


/**
 * @generated
 */
public boolean canCreateExclusion_4002(EER.Relationship source, EER.Relationship target) {
						return canExistExclusion_4002(null, source, target);
}


/**
 * @generated
 */
public boolean canCreateCandidateKey_4003(EER.Entity source, EER.Attribute target) {
						return canExistCandidateKey_4003(null, source, target);
}


/**
 * @generated
 */
public boolean canCreateSingleAttribute_4004(EER.Node source, EER.Domain target) {
						return canExistSingleAttribute_4004(null, source, target);
}


/**
 * @generated
 */
public boolean canCreateSpecializationRelationship_4005(EER.Entity source, EER.Entity target) {
						return canExistSpecializationRelationship_4005(null, source, target);
}


/**
 * @generated
 */
public boolean canCreateDependencyRelationship_4006(EER.Entity source,  target) {
						return canExistDependencyRelationship_4006(null, source, target);
}


/**
 * @generated
 */
public boolean canCreateCompositeAttribute_4007(EER.Node source, EER.Attribute target) {
						return canExistCompositeAttribute_4007(null, source, target);
}


/**
 * @generated
 */
public boolean canCreateParticipant_4008(EER.AbstractRelationship source, EER.Entity target) {
						return canExistParticipant_4008(null, source, target);
}


/**
 * @generated
 */
public boolean canCreateAggregationParticipant_4009(EER.MemberCollection source, EER.Aggregation target) {
				if (source != null) {
			if (source.getParticipant() != null) {
	return false;
}
			}
				return canExistAggregationParticipant_4009(null, source, target);
}


/**
 * @generated
 */
public boolean canCreateEnumeratedLiteral_4010(EER.EnumerationType source,  target) {
						return canExistEnumeratedLiteral_4010(null, source, target);
}


/**
 * @generated
 */
public boolean canCreateInclusion_4011(EER.Relationship source, EER.Relationship target) {
						return canExistInclusion_4011(null, source, target);
}


/**
 * @generated
 */
public boolean canCreateGeneralizationParent_4012(EER.Generalization source, EER.SpecializationRelationship target) {
	if (source != null) {
	if (source.getParent() != null
) {
		return false;
	}
	}
if (target != null && (target.getRelationship() != null
)) {
	return false;
}

	return canExistGeneralizationParent_4012(source, target);
}


/**
 * @generated
 */
public boolean canCreateAggregationSource_4013(EER.Aggregation source, EER.Entity target) {
	if (source != null) {
	if (source.getSource() != null
) {
		return false;
	}
	}

	return canExistAggregationSource_4013(source, target);
}


/**
 * @generated
 */
public boolean canCreateEntityPrimaryKey_4014(EER.Entity source, EER.CandidateKey target) {
	if (source != null) {
	if (source.getPrimaryKey() != null
) {
		return false;
	}
	}

	return canExistEntityPrimaryKey_4014(source, target);
}


/**
 * @generated
 */
public boolean canCreateGeneralizationChilds_4015(EER.Generalization source, EER.GeneralizationRelationship target) {
	if (source != null) {
	if (source.getChilds().contains(target)
) {
		return false;
	}
	}
if (target != null && (target.getRelationship() != null
)) {
	return false;
}

	return canExistGeneralizationChilds_4015(source, target);
}

	
	/**
 * @generated
 */
	public boolean canExistGeneralizationRelationship_4001(EER.GeneralizationRelationship linkInstance, EER.Entity source, EER.Generalization target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistExclusion_4002(EER.Exclusion linkInstance, EER.Relationship source, EER.Relationship target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistCandidateKey_4003(EER.CandidateKey linkInstance, EER.Entity source, EER.Attribute target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistSingleAttribute_4004(EER.SingleAttribute linkInstance, EER.Node source, EER.Domain target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistSpecializationRelationship_4005(EER.SpecializationRelationship linkInstance, EER.Entity source, EER.Entity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistDependencyRelationship_4006(EER.DependencyRelationship linkInstance, EER.Entity source,  target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistCompositeAttribute_4007(EER.CompositeAttribute linkInstance, EER.Node source, EER.Attribute target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistParticipant_4008(EER.Participant linkInstance, EER.AbstractRelationship source, EER.Entity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistAggregationParticipant_4009(EER.AggregationParticipant linkInstance, EER.MemberCollection source, EER.Aggregation target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistEnumeratedLiteral_4010(EER.EnumeratedLiteral linkInstance, EER.EnumerationType source,  target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistInclusion_4011(EER.Inclusion linkInstance, EER.Relationship source, EER.Relationship target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistGeneralizationParent_4012(EER.Generalization source, EER.SpecializationRelationship target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistAggregationSource_4013(EER.Aggregation source, EER.Entity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistEntityPrimaryKey_4014(EER.Entity source, EER.CandidateKey target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistGeneralizationChilds_4015(EER.Generalization source, EER.GeneralizationRelationship target) {
		return true;
	}
}

	}
