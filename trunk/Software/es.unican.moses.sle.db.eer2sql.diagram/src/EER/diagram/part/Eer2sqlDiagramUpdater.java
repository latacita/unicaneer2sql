	package EER.diagram.part;

	/**
 * @generated
 */
public class Eer2sqlDiagramUpdater {
		
		/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlNodeDescriptor> getSemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		switch (EER.diagram.part.Eer2sqlVisualIDRegistry.getVisualID(view)) {
		case EER.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
	return getProject_1000SemanticChildren(view);
	}
		return java.util.Collections.emptyList();
}
	
	/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlNodeDescriptor> getProject_1000SemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		if (!view.isSetElement()) {
	return java.util.Collections.emptyList();
}
EER.Project modelElement = (EER.Project) view.getElement();
	java.util.LinkedList<EER.diagram.part.Eer2sqlNodeDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlNodeDescriptor>();
						for (java.util.Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
		EER.AttributedNode childElement = (EER.AttributedNode) it.next();
					int visualID = EER.diagram.part.Eer2sqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EER.diagram.edit.parts.WeakEntityEditPart.VISUAL_ID) {
	result.add(new EER.diagram.part.Eer2sqlNodeDescriptor(childElement, visualID));
	continue;
}
if (visualID == EER.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID) {
	result.add(new EER.diagram.part.Eer2sqlNodeDescriptor(childElement, visualID));
	continue;
}
if (visualID == EER.diagram.edit.parts.MemberCollectionEditPart.VISUAL_ID) {
	result.add(new EER.diagram.part.Eer2sqlNodeDescriptor(childElement, visualID));
	continue;
}
if (visualID == EER.diagram.edit.parts.CompositeComponentEditPart.VISUAL_ID) {
	result.add(new EER.diagram.part.Eer2sqlNodeDescriptor(childElement, visualID));
	continue;
}
if (visualID == EER.diagram.edit.parts.DependencyRelationshipEditPart.VISUAL_ID) {
	result.add(new EER.diagram.part.Eer2sqlNodeDescriptor(childElement, visualID));
	continue;
}
if (visualID == EER.diagram.edit.parts.RelationshipEditPart.VISUAL_ID) {
	result.add(new EER.diagram.part.Eer2sqlNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getDomains().iterator(); it.hasNext();) {
		EER.Domain childElement = (EER.Domain) it.next();
					int visualID = EER.diagram.part.Eer2sqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EER.diagram.edit.parts.EnumerationTypeEditPart.VISUAL_ID) {
	result.add(new EER.diagram.part.Eer2sqlNodeDescriptor(childElement, visualID));
	continue;
}
if (visualID == EER.diagram.edit.parts.PrimitiveTypeEditPart.VISUAL_ID) {
	result.add(new EER.diagram.part.Eer2sqlNodeDescriptor(childElement, visualID));
	continue;
}
	}
			return result;
	}
	
		/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
		switch (EER.diagram.part.Eer2sqlVisualIDRegistry.getVisualID(view)) {
		case EER.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
	return getProject_1000ContainedLinks(view);
case EER.diagram.edit.parts.WeakEntityEditPart.VISUAL_ID:
	return getWeakEntity_2001ContainedLinks(view);
case EER.diagram.edit.parts.EnumerationTypeEditPart.VISUAL_ID:
	return getEnumerationType_2002ContainedLinks(view);
case EER.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID:
	return getGeneralization_2003ContainedLinks(view);
case EER.diagram.edit.parts.MemberCollectionEditPart.VISUAL_ID:
	return getMemberCollection_2004ContainedLinks(view);
case EER.diagram.edit.parts.PrimitiveTypeEditPart.VISUAL_ID:
	return getPrimitiveType_2005ContainedLinks(view);
case EER.diagram.edit.parts.CompositeComponentEditPart.VISUAL_ID:
	return getCompositeComponent_2006ContainedLinks(view);
case EER.diagram.edit.parts.DependencyRelationshipEditPart.VISUAL_ID:
	return getDependencyRelationship_2007ContainedLinks(view);
case EER.diagram.edit.parts.RelationshipEditPart.VISUAL_ID:
	return getRelationship_2008ContainedLinks(view);
case EER.diagram.edit.parts.GeneralizationRelationshipEditPart.VISUAL_ID:
	return getGeneralizationRelationship_4001ContainedLinks(view);
case EER.diagram.edit.parts.ExclusionEditPart.VISUAL_ID:
	return getExclusion_4002ContainedLinks(view);
case EER.diagram.edit.parts.CandidateKeyEditPart.VISUAL_ID:
	return getCandidateKey_4003ContainedLinks(view);
case EER.diagram.edit.parts.SingleAttributeEditPart.VISUAL_ID:
	return getSingleAttribute_4004ContainedLinks(view);
case EER.diagram.edit.parts.SpecializationRelationshipEditPart.VISUAL_ID:
	return getSpecializationRelationship_4005ContainedLinks(view);
case EER.diagram.edit.parts.DependencyRelationship2EditPart.VISUAL_ID:
	return getDependencyRelationship_4006ContainedLinks(view);
case EER.diagram.edit.parts.CompositeAttributeEditPart.VISUAL_ID:
	return getCompositeAttribute_4007ContainedLinks(view);
case EER.diagram.edit.parts.ParticipantEditPart.VISUAL_ID:
	return getParticipant_4008ContainedLinks(view);
case EER.diagram.edit.parts.AggregationParticipantEditPart.VISUAL_ID:
	return getAggregationParticipant_4009ContainedLinks(view);
case EER.diagram.edit.parts.EnumeratedLiteralEditPart.VISUAL_ID:
	return getEnumeratedLiteral_4010ContainedLinks(view);
case EER.diagram.edit.parts.InclusionEditPart.VISUAL_ID:
	return getInclusion_4011ContainedLinks(view);
	}
		return java.util.Collections.emptyList();
}
	
		/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getIncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
		switch (EER.diagram.part.Eer2sqlVisualIDRegistry.getVisualID(view)) {
		case EER.diagram.edit.parts.WeakEntityEditPart.VISUAL_ID:
	return getWeakEntity_2001IncomingLinks(view);
case EER.diagram.edit.parts.EnumerationTypeEditPart.VISUAL_ID:
	return getEnumerationType_2002IncomingLinks(view);
case EER.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID:
	return getGeneralization_2003IncomingLinks(view);
case EER.diagram.edit.parts.MemberCollectionEditPart.VISUAL_ID:
	return getMemberCollection_2004IncomingLinks(view);
case EER.diagram.edit.parts.PrimitiveTypeEditPart.VISUAL_ID:
	return getPrimitiveType_2005IncomingLinks(view);
case EER.diagram.edit.parts.CompositeComponentEditPart.VISUAL_ID:
	return getCompositeComponent_2006IncomingLinks(view);
case EER.diagram.edit.parts.DependencyRelationshipEditPart.VISUAL_ID:
	return getDependencyRelationship_2007IncomingLinks(view);
case EER.diagram.edit.parts.RelationshipEditPart.VISUAL_ID:
	return getRelationship_2008IncomingLinks(view);
case EER.diagram.edit.parts.GeneralizationRelationshipEditPart.VISUAL_ID:
	return getGeneralizationRelationship_4001IncomingLinks(view);
case EER.diagram.edit.parts.ExclusionEditPart.VISUAL_ID:
	return getExclusion_4002IncomingLinks(view);
case EER.diagram.edit.parts.CandidateKeyEditPart.VISUAL_ID:
	return getCandidateKey_4003IncomingLinks(view);
case EER.diagram.edit.parts.SingleAttributeEditPart.VISUAL_ID:
	return getSingleAttribute_4004IncomingLinks(view);
case EER.diagram.edit.parts.SpecializationRelationshipEditPart.VISUAL_ID:
	return getSpecializationRelationship_4005IncomingLinks(view);
case EER.diagram.edit.parts.DependencyRelationship2EditPart.VISUAL_ID:
	return getDependencyRelationship_4006IncomingLinks(view);
case EER.diagram.edit.parts.CompositeAttributeEditPart.VISUAL_ID:
	return getCompositeAttribute_4007IncomingLinks(view);
case EER.diagram.edit.parts.ParticipantEditPart.VISUAL_ID:
	return getParticipant_4008IncomingLinks(view);
case EER.diagram.edit.parts.AggregationParticipantEditPart.VISUAL_ID:
	return getAggregationParticipant_4009IncomingLinks(view);
case EER.diagram.edit.parts.EnumeratedLiteralEditPart.VISUAL_ID:
	return getEnumeratedLiteral_4010IncomingLinks(view);
case EER.diagram.edit.parts.InclusionEditPart.VISUAL_ID:
	return getInclusion_4011IncomingLinks(view);
	}
		return java.util.Collections.emptyList();
}
	
		/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getOutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
		switch (EER.diagram.part.Eer2sqlVisualIDRegistry.getVisualID(view)) {
		case EER.diagram.edit.parts.WeakEntityEditPart.VISUAL_ID:
	return getWeakEntity_2001OutgoingLinks(view);
case EER.diagram.edit.parts.EnumerationTypeEditPart.VISUAL_ID:
	return getEnumerationType_2002OutgoingLinks(view);
case EER.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID:
	return getGeneralization_2003OutgoingLinks(view);
case EER.diagram.edit.parts.MemberCollectionEditPart.VISUAL_ID:
	return getMemberCollection_2004OutgoingLinks(view);
case EER.diagram.edit.parts.PrimitiveTypeEditPart.VISUAL_ID:
	return getPrimitiveType_2005OutgoingLinks(view);
case EER.diagram.edit.parts.CompositeComponentEditPart.VISUAL_ID:
	return getCompositeComponent_2006OutgoingLinks(view);
case EER.diagram.edit.parts.DependencyRelationshipEditPart.VISUAL_ID:
	return getDependencyRelationship_2007OutgoingLinks(view);
case EER.diagram.edit.parts.RelationshipEditPart.VISUAL_ID:
	return getRelationship_2008OutgoingLinks(view);
case EER.diagram.edit.parts.GeneralizationRelationshipEditPart.VISUAL_ID:
	return getGeneralizationRelationship_4001OutgoingLinks(view);
case EER.diagram.edit.parts.ExclusionEditPart.VISUAL_ID:
	return getExclusion_4002OutgoingLinks(view);
case EER.diagram.edit.parts.CandidateKeyEditPart.VISUAL_ID:
	return getCandidateKey_4003OutgoingLinks(view);
case EER.diagram.edit.parts.SingleAttributeEditPart.VISUAL_ID:
	return getSingleAttribute_4004OutgoingLinks(view);
case EER.diagram.edit.parts.SpecializationRelationshipEditPart.VISUAL_ID:
	return getSpecializationRelationship_4005OutgoingLinks(view);
case EER.diagram.edit.parts.DependencyRelationship2EditPart.VISUAL_ID:
	return getDependencyRelationship_4006OutgoingLinks(view);
case EER.diagram.edit.parts.CompositeAttributeEditPart.VISUAL_ID:
	return getCompositeAttribute_4007OutgoingLinks(view);
case EER.diagram.edit.parts.ParticipantEditPart.VISUAL_ID:
	return getParticipant_4008OutgoingLinks(view);
case EER.diagram.edit.parts.AggregationParticipantEditPart.VISUAL_ID:
	return getAggregationParticipant_4009OutgoingLinks(view);
case EER.diagram.edit.parts.EnumeratedLiteralEditPart.VISUAL_ID:
	return getEnumeratedLiteral_4010OutgoingLinks(view);
case EER.diagram.edit.parts.InclusionEditPart.VISUAL_ID:
	return getInclusion_4011OutgoingLinks(view);
	}
		return java.util.Collections.emptyList();
}
		
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getProject_1000ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getWeakEntity_2001ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.WeakEntity modelElement = (EER.WeakEntity) view.getElement();
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_GeneralizationRelationship_4001(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_CandidateKey_4003(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_SingleAttribute_4004(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_SpecializationRelationship_4005(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_DependencyRelationship_4006(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_CompositeAttribute_4007(modelElement));	
	result.addAll(getOutgoingFeatureModelFacetLinks_Entity_PrimaryKey_4014(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getEnumerationType_2002ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.EnumerationType modelElement = (EER.EnumerationType) view.getElement();
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EnumeratedLiteral_4010(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getGeneralization_2003ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.Generalization modelElement = (EER.Generalization) view.getElement();
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Generalization_Parent_4012(modelElement));	
	result.addAll(getOutgoingFeatureModelFacetLinks_Generalization_Childs_4015(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getMemberCollection_2004ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.MemberCollection modelElement = (EER.MemberCollection) view.getElement();
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AggregationParticipant_4009(modelElement));	
	result.addAll(getOutgoingFeatureModelFacetLinks_Aggregation_Source_4013(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getPrimitiveType_2005ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getCompositeComponent_2006ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.CompositeComponent modelElement = (EER.CompositeComponent) view.getElement();
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Aggregation_Source_4013(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getDependencyRelationship_2007ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.DependencyRelationship modelElement = (EER.DependencyRelationship) view.getElement();
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SingleAttribute_4004(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_CompositeAttribute_4007(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_Participant_4008(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getRelationship_2008ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.Relationship modelElement = (EER.Relationship) view.getElement();
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Exclusion_4002(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_SingleAttribute_4004(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_CompositeAttribute_4007(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_Participant_4008(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_Inclusion_4011(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getGeneralizationRelationship_4001ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getExclusion_4002ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getCandidateKey_4003ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getSingleAttribute_4004ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getSpecializationRelationship_4005ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getDependencyRelationship_4006ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.DependencyRelationship modelElement = (EER.DependencyRelationship) view.getElement();
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SingleAttribute_4004(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_CompositeAttribute_4007(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_Participant_4008(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getCompositeAttribute_4007ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getParticipant_4008ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getAggregationParticipant_4009ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getEnumeratedLiteral_4010ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getInclusion_4011ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
		
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getWeakEntity_2001IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.WeakEntity modelElement = (EER.WeakEntity) view.getElement();
	java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences = org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SpecializationRelationship_4005(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_Participant_4008(modelElement, crossReferences));	
	result.addAll(getIncomingFeatureModelFacetLinks_Aggregation_Source_4013(modelElement, crossReferences));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getEnumerationType_2002IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.EnumerationType modelElement = (EER.EnumerationType) view.getElement();
	java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences = org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SingleAttribute_4004(modelElement, crossReferences));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getGeneralization_2003IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.Generalization modelElement = (EER.Generalization) view.getElement();
	java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences = org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_GeneralizationRelationship_4001(modelElement, crossReferences));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getMemberCollection_2004IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.MemberCollection modelElement = (EER.MemberCollection) view.getElement();
	java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences = org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AggregationParticipant_4009(modelElement, crossReferences));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getPrimitiveType_2005IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.PrimitiveType modelElement = (EER.PrimitiveType) view.getElement();
	java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences = org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SingleAttribute_4004(modelElement, crossReferences));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getCompositeComponent_2006IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.CompositeComponent modelElement = (EER.CompositeComponent) view.getElement();
	java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences = org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AggregationParticipant_4009(modelElement, crossReferences));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getDependencyRelationship_2007IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getRelationship_2008IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.Relationship modelElement = (EER.Relationship) view.getElement();
	java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences = org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Exclusion_4002(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_Inclusion_4011(modelElement, crossReferences));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getGeneralizationRelationship_4001IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.GeneralizationRelationship modelElement = (EER.GeneralizationRelationship) view.getElement();
	java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences = org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Generalization_Childs_4015(modelElement, crossReferences));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getExclusion_4002IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getCandidateKey_4003IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.CandidateKey modelElement = (EER.CandidateKey) view.getElement();
	java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences = org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Entity_PrimaryKey_4014(modelElement, crossReferences));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getSingleAttribute_4004IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.SingleAttribute modelElement = (EER.SingleAttribute) view.getElement();
	java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences = org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CandidateKey_4003(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_CompositeAttribute_4007(modelElement, crossReferences));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getSpecializationRelationship_4005IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.SpecializationRelationship modelElement = (EER.SpecializationRelationship) view.getElement();
	java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences = org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Generalization_Parent_4012(modelElement, crossReferences));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getDependencyRelationship_4006IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getCompositeAttribute_4007IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.CompositeAttribute modelElement = (EER.CompositeAttribute) view.getElement();
	java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences = org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CandidateKey_4003(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_CompositeAttribute_4007(modelElement, crossReferences));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getParticipant_4008IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getAggregationParticipant_4009IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getEnumeratedLiteral_4010IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getInclusion_4011IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
		
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getWeakEntity_2001OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.WeakEntity modelElement = (EER.WeakEntity) view.getElement();
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_GeneralizationRelationship_4001(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_CandidateKey_4003(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_SingleAttribute_4004(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_SpecializationRelationship_4005(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_DependencyRelationship_4006(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_CompositeAttribute_4007(modelElement));	
	result.addAll(getOutgoingFeatureModelFacetLinks_Entity_PrimaryKey_4014(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getEnumerationType_2002OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.EnumerationType modelElement = (EER.EnumerationType) view.getElement();
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EnumeratedLiteral_4010(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getGeneralization_2003OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.Generalization modelElement = (EER.Generalization) view.getElement();
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Generalization_Parent_4012(modelElement));	
	result.addAll(getOutgoingFeatureModelFacetLinks_Generalization_Childs_4015(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getMemberCollection_2004OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.MemberCollection modelElement = (EER.MemberCollection) view.getElement();
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AggregationParticipant_4009(modelElement));	
	result.addAll(getOutgoingFeatureModelFacetLinks_Aggregation_Source_4013(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getPrimitiveType_2005OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getCompositeComponent_2006OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.CompositeComponent modelElement = (EER.CompositeComponent) view.getElement();
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Aggregation_Source_4013(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getDependencyRelationship_2007OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.DependencyRelationship modelElement = (EER.DependencyRelationship) view.getElement();
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SingleAttribute_4004(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_CompositeAttribute_4007(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_Participant_4008(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getRelationship_2008OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.Relationship modelElement = (EER.Relationship) view.getElement();
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Exclusion_4002(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_SingleAttribute_4004(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_CompositeAttribute_4007(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_Participant_4008(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_Inclusion_4011(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getGeneralizationRelationship_4001OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getExclusion_4002OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getCandidateKey_4003OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getSingleAttribute_4004OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getSpecializationRelationship_4005OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getDependencyRelationship_4006OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	EER.DependencyRelationship modelElement = (EER.DependencyRelationship) view.getElement();
		java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SingleAttribute_4004(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_CompositeAttribute_4007(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_Participant_4008(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getCompositeAttribute_4007OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getParticipant_4008OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getAggregationParticipant_4009OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getEnumeratedLiteral_4010OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<EER.diagram.part.Eer2sqlLinkDescriptor> getInclusion_4011OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
	/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getContainedTypeModelFacetLinks_GeneralizationRelationship_4001(EER.Entity container) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getSpecializes().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof EER.GeneralizationRelationship) {
		continue;
	}
	EER.GeneralizationRelationship link = (EER.GeneralizationRelationship) linkObject;
		if (EER.diagram.edit.parts.GeneralizationRelationshipEditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			EER.Generalization dst = link.getRelationship();
						result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, dst, link, EER.diagram.providers.Eer2sqlElementTypes.GeneralizationRelationship_4001, EER.diagram.edit.parts.GeneralizationRelationshipEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getContainedTypeModelFacetLinks_Exclusion_4002(EER.Relationship container) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getExclusionConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof EER.Exclusion) {
		continue;
	}
	EER.Exclusion link = (EER.Exclusion) linkObject;
		if (EER.diagram.edit.parts.ExclusionEditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			EER.Relationship dst = link.getSource();
						result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, dst, link, EER.diagram.providers.Eer2sqlElementTypes.Exclusion_4002, EER.diagram.edit.parts.ExclusionEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getContainedTypeModelFacetLinks_CandidateKey_4003(EER.Entity container) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getCandidateKey().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof EER.CandidateKey) {
		continue;
	}
	EER.CandidateKey link = (EER.CandidateKey) linkObject;
		if (EER.diagram.edit.parts.CandidateKeyEditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			java.util.List targets = link.getAttribute();
Object theTarget = targets.size() == 1 ? targets.get(0) : null;
if (false == theTarget instanceof EER.Attribute) {
	continue;
}
EER.Attribute dst = (EER.Attribute) theTarget;
						result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, dst, link, EER.diagram.providers.Eer2sqlElementTypes.CandidateKey_4003, EER.diagram.edit.parts.CandidateKeyEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getContainedTypeModelFacetLinks_SingleAttribute_4004(EER.Node container) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getAttributes().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof EER.SingleAttribute) {
		continue;
	}
	EER.SingleAttribute link = (EER.SingleAttribute) linkObject;
		if (EER.diagram.edit.parts.SingleAttributeEditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			EER.Domain dst = link.getDomain();
						result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, dst, link, EER.diagram.providers.Eer2sqlElementTypes.SingleAttribute_4004, EER.diagram.edit.parts.SingleAttributeEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getContainedTypeModelFacetLinks_SpecializationRelationship_4005(EER.Entity container) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getIsSpecializedBy().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof EER.SpecializationRelationship) {
		continue;
	}
	EER.SpecializationRelationship link = (EER.SpecializationRelationship) linkObject;
		if (EER.diagram.edit.parts.SpecializationRelationshipEditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			EER.Entity dst = link.getSource();
						result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, dst, link, EER.diagram.providers.Eer2sqlElementTypes.SpecializationRelationship_4005, EER.diagram.edit.parts.SpecializationRelationshipEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getContainedTypeModelFacetLinks_DependencyRelationship_4006(EER.Entity container) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getDependencyRelationships().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof EER.DependencyRelationship) {
		continue;
	}
	EER.DependencyRelationship link = (EER.DependencyRelationship) linkObject;
		if (EER.diagram.edit.parts.DependencyRelationship2EditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			
						result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, , link, EER.diagram.providers.Eer2sqlElementTypes.DependencyRelationship_4006, EER.diagram.edit.parts.DependencyRelationship2EditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getContainedTypeModelFacetLinks_CompositeAttribute_4007(EER.Node container) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getAttributes().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof EER.CompositeAttribute) {
		continue;
	}
	EER.CompositeAttribute link = (EER.CompositeAttribute) linkObject;
		if (EER.diagram.edit.parts.CompositeAttributeEditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			java.util.List targets = link.getSinglesAttributes();
Object theTarget = targets.size() == 1 ? targets.get(0) : null;
if (false == theTarget instanceof EER.Attribute) {
	continue;
}
EER.Attribute dst = (EER.Attribute) theTarget;
						result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, dst, link, EER.diagram.providers.Eer2sqlElementTypes.CompositeAttribute_4007, EER.diagram.edit.parts.CompositeAttributeEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getContainedTypeModelFacetLinks_Participant_4008(EER.AbstractRelationship container) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getParticipants().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof EER.Participant) {
		continue;
	}
	EER.Participant link = (EER.Participant) linkObject;
		if (EER.diagram.edit.parts.ParticipantEditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			EER.Entity dst = link.getTarget();
						result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, dst, link, EER.diagram.providers.Eer2sqlElementTypes.Participant_4008, EER.diagram.edit.parts.ParticipantEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getContainedTypeModelFacetLinks_AggregationParticipant_4009(EER.MemberCollection container) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
				EER.AggregationParticipant link = container.getParticipant();
			if (EER.diagram.edit.parts.AggregationParticipantEditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	return result;
}
			EER.Aggregation dst = link.getSource();
						result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, dst, link, EER.diagram.providers.Eer2sqlElementTypes.AggregationParticipant_4009, EER.diagram.edit.parts.AggregationParticipantEditPart.VISUAL_ID));
			return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getContainedTypeModelFacetLinks_EnumeratedLiteral_4010(EER.EnumerationType container) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getLiterals().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof EER.EnumeratedLiteral) {
		continue;
	}
	EER.EnumeratedLiteral link = (EER.EnumeratedLiteral) linkObject;
		if (EER.diagram.edit.parts.EnumeratedLiteralEditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			
						result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, , link, EER.diagram.providers.Eer2sqlElementTypes.EnumeratedLiteral_4010, EER.diagram.edit.parts.EnumeratedLiteralEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getContainedTypeModelFacetLinks_Inclusion_4011(EER.Relationship container) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getInclusionConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof EER.Inclusion) {
		continue;
	}
	EER.Inclusion link = (EER.Inclusion) linkObject;
		if (EER.diagram.edit.parts.InclusionEditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			EER.Relationship dst = link.getSource();
						result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, dst, link, EER.diagram.providers.Eer2sqlElementTypes.Inclusion_4011, EER.diagram.edit.parts.InclusionEditPart.VISUAL_ID));
		}
	return result;	
}
	
/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getIncomingTypeModelFacetLinks_GeneralizationRelationship_4001(EER.Generalization target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != EER.EERPackage.eINSTANCE.getGeneralizationRelationship_Relationship() || false == setting.getEObject() instanceof EER.GeneralizationRelationship) {
	continue;
}
EER.GeneralizationRelationship link = (EER.GeneralizationRelationship) setting.getEObject();
	if (EER.diagram.edit.parts.GeneralizationRelationshipEditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			if (false == link.eContainer() instanceof EER.Entity) {
	continue;
}
EER.Entity container = (EER.Entity) link.eContainer();
		result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, target, link, EER.diagram.providers.Eer2sqlElementTypes.GeneralizationRelationship_4001, EER.diagram.edit.parts.GeneralizationRelationshipEditPart.VISUAL_ID));

		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getIncomingTypeModelFacetLinks_Exclusion_4002(EER.Relationship target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != EER.EERPackage.eINSTANCE.getExclusion_Source() || false == setting.getEObject() instanceof EER.Exclusion) {
	continue;
}
EER.Exclusion link = (EER.Exclusion) setting.getEObject();
	if (EER.diagram.edit.parts.ExclusionEditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			if (false == link.eContainer() instanceof EER.Relationship) {
	continue;
}
EER.Relationship container = (EER.Relationship) link.eContainer();
		result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, target, link, EER.diagram.providers.Eer2sqlElementTypes.Exclusion_4002, EER.diagram.edit.parts.ExclusionEditPart.VISUAL_ID));

		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getIncomingTypeModelFacetLinks_CandidateKey_4003(EER.Attribute target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != EER.EERPackage.eINSTANCE.getCandidateKey_Attribute() || false == setting.getEObject() instanceof EER.CandidateKey) {
	continue;
}
EER.CandidateKey link = (EER.CandidateKey) setting.getEObject();
	if (EER.diagram.edit.parts.CandidateKeyEditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			if (false == link.eContainer() instanceof EER.Entity) {
	continue;
}
EER.Entity container = (EER.Entity) link.eContainer();
		result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, target, link, EER.diagram.providers.Eer2sqlElementTypes.CandidateKey_4003, EER.diagram.edit.parts.CandidateKeyEditPart.VISUAL_ID));

		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getIncomingTypeModelFacetLinks_SingleAttribute_4004(EER.Domain target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != EER.EERPackage.eINSTANCE.getSingleAttribute_Domain() || false == setting.getEObject() instanceof EER.SingleAttribute) {
	continue;
}
EER.SingleAttribute link = (EER.SingleAttribute) setting.getEObject();
	if (EER.diagram.edit.parts.SingleAttributeEditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			if (false == link.eContainer() instanceof EER.Node) {
	continue;
}
EER.Node container = (EER.Node) link.eContainer();
		result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, target, link, EER.diagram.providers.Eer2sqlElementTypes.SingleAttribute_4004, EER.diagram.edit.parts.SingleAttributeEditPart.VISUAL_ID));

		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getIncomingTypeModelFacetLinks_SpecializationRelationship_4005(EER.Entity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != EER.EERPackage.eINSTANCE.getSpecializationRelationship_Source() || false == setting.getEObject() instanceof EER.SpecializationRelationship) {
	continue;
}
EER.SpecializationRelationship link = (EER.SpecializationRelationship) setting.getEObject();
	if (EER.diagram.edit.parts.SpecializationRelationshipEditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			if (false == link.eContainer() instanceof EER.Entity) {
	continue;
}
EER.Entity container = (EER.Entity) link.eContainer();
		result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, target, link, EER.diagram.providers.Eer2sqlElementTypes.SpecializationRelationship_4005, EER.diagram.edit.parts.SpecializationRelationshipEditPart.VISUAL_ID));

		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getIncomingTypeModelFacetLinks_CompositeAttribute_4007(EER.Attribute target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != EER.EERPackage.eINSTANCE.getCompositeAttribute_SinglesAttributes() || false == setting.getEObject() instanceof EER.CompositeAttribute) {
	continue;
}
EER.CompositeAttribute link = (EER.CompositeAttribute) setting.getEObject();
	if (EER.diagram.edit.parts.CompositeAttributeEditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			if (false == link.eContainer() instanceof EER.Node) {
	continue;
}
EER.Node container = (EER.Node) link.eContainer();
		result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, target, link, EER.diagram.providers.Eer2sqlElementTypes.CompositeAttribute_4007, EER.diagram.edit.parts.CompositeAttributeEditPart.VISUAL_ID));

		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getIncomingTypeModelFacetLinks_Participant_4008(EER.Entity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != EER.EERPackage.eINSTANCE.getParticipant_Target() || false == setting.getEObject() instanceof EER.Participant) {
	continue;
}
EER.Participant link = (EER.Participant) setting.getEObject();
	if (EER.diagram.edit.parts.ParticipantEditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			if (false == link.eContainer() instanceof EER.AbstractRelationship) {
	continue;
}
EER.AbstractRelationship container = (EER.AbstractRelationship) link.eContainer();
		result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, target, link, EER.diagram.providers.Eer2sqlElementTypes.Participant_4008, EER.diagram.edit.parts.ParticipantEditPart.VISUAL_ID));

		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getIncomingTypeModelFacetLinks_AggregationParticipant_4009(EER.Aggregation target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != EER.EERPackage.eINSTANCE.getAggregationParticipant_Source() || false == setting.getEObject() instanceof EER.AggregationParticipant) {
	continue;
}
EER.AggregationParticipant link = (EER.AggregationParticipant) setting.getEObject();
	if (EER.diagram.edit.parts.AggregationParticipantEditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			if (false == link.eContainer() instanceof EER.MemberCollection) {
	continue;
}
EER.MemberCollection container = (EER.MemberCollection) link.eContainer();
		result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, target, link, EER.diagram.providers.Eer2sqlElementTypes.AggregationParticipant_4009, EER.diagram.edit.parts.AggregationParticipantEditPart.VISUAL_ID));

		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getIncomingTypeModelFacetLinks_Inclusion_4011(EER.Relationship target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != EER.EERPackage.eINSTANCE.getInclusion_Source() || false == setting.getEObject() instanceof EER.Inclusion) {
	continue;
}
EER.Inclusion link = (EER.Inclusion) setting.getEObject();
	if (EER.diagram.edit.parts.InclusionEditPart.VISUAL_ID != EER.diagram.part.Eer2sqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			if (false == link.eContainer() instanceof EER.Relationship) {
	continue;
}
EER.Relationship container = (EER.Relationship) link.eContainer();
		result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(container, target, link, EER.diagram.providers.Eer2sqlElementTypes.Inclusion_4011, EER.diagram.edit.parts.InclusionEditPart.VISUAL_ID));

		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getIncomingFeatureModelFacetLinks_Generalization_Parent_4012(EER.SpecializationRelationship target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() == EER.EERPackage.eINSTANCE.getGeneralization_Parent()) {
	result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(setting.getEObject(), target, EER.diagram.providers.Eer2sqlElementTypes.GeneralizationParent_4012, EER.diagram.edit.parts.GeneralizationParentEditPart.VISUAL_ID));
}
	}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getIncomingFeatureModelFacetLinks_Aggregation_Source_4013(EER.Entity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() == EER.EERPackage.eINSTANCE.getAggregation_Source()) {
	result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(setting.getEObject(), target, EER.diagram.providers.Eer2sqlElementTypes.AggregationSource_4013, EER.diagram.edit.parts.AggregationSourceEditPart.VISUAL_ID));
}
	}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getIncomingFeatureModelFacetLinks_Entity_PrimaryKey_4014(EER.CandidateKey target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() == EER.EERPackage.eINSTANCE.getEntity_PrimaryKey()) {
	result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(setting.getEObject(), target, EER.diagram.providers.Eer2sqlElementTypes.EntityPrimaryKey_4014, EER.diagram.edit.parts.EntityPrimaryKeyEditPart.VISUAL_ID));
}
	}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getIncomingFeatureModelFacetLinks_Generalization_Childs_4015(EER.GeneralizationRelationship target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() == EER.EERPackage.eINSTANCE.getGeneralization_Childs()) {
	result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(setting.getEObject(), target, EER.diagram.providers.Eer2sqlElementTypes.GeneralizationChilds_4015, EER.diagram.edit.parts.GeneralizationChildsEditPart.VISUAL_ID));
}
	}
	return result;	
}
		
	/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getOutgoingFeatureModelFacetLinks_Generalization_Parent_4012(EER.Generalization source) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		EER.SpecializationRelationship destination = source.getParent();
	if (destination == null) {
		return result;
	}
		result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(source, destination, EER.diagram.providers.Eer2sqlElementTypes.GeneralizationParent_4012, EER.diagram.edit.parts.GeneralizationParentEditPart.VISUAL_ID));
		return result;
}
	
	/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getOutgoingFeatureModelFacetLinks_Aggregation_Source_4013(EER.Aggregation source) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		EER.Entity destination = source.getSource();
	if (destination == null) {
		return result;
	}
		result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(source, destination, EER.diagram.providers.Eer2sqlElementTypes.AggregationSource_4013, EER.diagram.edit.parts.AggregationSourceEditPart.VISUAL_ID));
		return result;
}
	
	/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getOutgoingFeatureModelFacetLinks_Entity_PrimaryKey_4014(EER.Entity source) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		EER.CandidateKey destination = source.getPrimaryKey();
	if (destination == null) {
		return result;
	}
		result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(source, destination, EER.diagram.providers.Eer2sqlElementTypes.EntityPrimaryKey_4014, EER.diagram.edit.parts.EntityPrimaryKeyEditPart.VISUAL_ID));
		return result;
}
	
	/**
 * @generated
 */
private static java.util.Collection<EER.diagram.part.Eer2sqlLinkDescriptor> getOutgoingFeatureModelFacetLinks_Generalization_Childs_4015(EER.Generalization source) {
	java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor> result = new java.util.LinkedList<EER.diagram.part.Eer2sqlLinkDescriptor>();
		for (java.util.Iterator<?> destinations = source.getChilds().iterator(); destinations.hasNext();) {
		EER.GeneralizationRelationship destination = (EER.GeneralizationRelationship) destinations.next();
		result.add(new EER.diagram.part.Eer2sqlLinkDescriptor(source, destination, EER.diagram.providers.Eer2sqlElementTypes.GeneralizationChilds_4015, EER.diagram.edit.parts.GeneralizationChildsEditPart.VISUAL_ID));
		}
		return result;
}

	}
