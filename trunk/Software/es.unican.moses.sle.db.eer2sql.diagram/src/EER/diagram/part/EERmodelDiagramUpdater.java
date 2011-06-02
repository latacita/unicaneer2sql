package EER.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import EER.AbstractRelationship;
import EER.Aggregation;
import EER.AggregationParticipant;
import EER.Attribute;
import EER.AttributedNode;
import EER.CandidateKey;
import EER.CompositeComponent;
import EER.DependencyRelationship;
import EER.Domain;
import EER.EERPackage;
import EER.Entity;
import EER.EnumeratedLiteral;
import EER.EnumerationType;
import EER.Exclusion;
import EER.Exclusive;
import EER.Generalization;
import EER.GeneralizationRelationship;
import EER.Inclusion;
import EER.Inclusiveness;
import EER.MemberCollection;
import EER.Node;
import EER.Participant;
import EER.Project;
import EER.Relationship;
import EER.SpecializationRelationship;
import EER.WeakEntity;
import EER.diagram.edit.parts.AggregationParticipant2EditPart;
import EER.diagram.edit.parts.AggregationParticipantEditPart;
import EER.diagram.edit.parts.CandidateKey2EditPart;
import EER.diagram.edit.parts.CandidateKeyEditPart;
import EER.diagram.edit.parts.CompositeAttribute2EditPart;
import EER.diagram.edit.parts.CompositeAttribute3EditPart;
import EER.diagram.edit.parts.CompositeAttributeEditPart;
import EER.diagram.edit.parts.CompositeComponentEditPart;
import EER.diagram.edit.parts.DependencyRelationshipEditPart;
import EER.diagram.edit.parts.EntityEditPart;
import EER.diagram.edit.parts.EntityEntityAttributesCompartmentEditPart;
import EER.diagram.edit.parts.EnumeratedLiteralEditPart;
import EER.diagram.edit.parts.EnumerationTypeEditPart;
import EER.diagram.edit.parts.EnumerationTypeEnumerationTypeCompartmentEditPart;
import EER.diagram.edit.parts.ExclusionEditPart;
import EER.diagram.edit.parts.ExclusiveEditPart;
import EER.diagram.edit.parts.GeneralizationEditPart;
import EER.diagram.edit.parts.GeneralizationRelationshipEditPart;
import EER.diagram.edit.parts.InclusionEditPart;
import EER.diagram.edit.parts.InclusivenessEditPart;
import EER.diagram.edit.parts.MemberCollectionEditPart;
import EER.diagram.edit.parts.ParticipantEditPart;
import EER.diagram.edit.parts.PrimitiveTypeEditPart;
import EER.diagram.edit.parts.ProjectEditPart;
import EER.diagram.edit.parts.RelationshipEditPart;
import EER.diagram.edit.parts.SingleAttribute2EditPart;
import EER.diagram.edit.parts.SingleAttribute3EditPart;
import EER.diagram.edit.parts.SingleAttributeEditPart;
import EER.diagram.edit.parts.SpecializationRelationshipEditPart;
import EER.diagram.edit.parts.WeakEntityEditPart;
import EER.diagram.edit.parts.WeakEntityWeakEntityAttributesCompartmentEditPart;
import EER.diagram.providers.EERmodelElementTypes;

/**
 * @generated
 */
public class EERmodelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<EERmodelNodeDescriptor> getSemanticChildren(View view) {
		switch (EERmodelVisualIDRegistry.getVisualID(view)) {
		case ProjectEditPart.VISUAL_ID:
			return getProject_1000SemanticChildren(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_2011SemanticChildren(view);
		case WeakEntityWeakEntityAttributesCompartmentEditPart.VISUAL_ID:
			return getWeakEntityWeakEntityAttributesCompartment_7002SemanticChildren(view);
		case EntityEntityAttributesCompartmentEditPart.VISUAL_ID:
			return getEntityEntityAttributesCompartment_7001SemanticChildren(view);
		case EnumerationTypeEnumerationTypeCompartmentEditPart.VISUAL_ID:
			return getEnumerationTypeEnumerationTypeCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelNodeDescriptor> getProject_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Project modelElement = (Project) view.getElement();
		LinkedList<EERmodelNodeDescriptor> result = new LinkedList<EERmodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			AttributedNode childElement = (AttributedNode) it.next();
			int visualID = EERmodelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WeakEntityEditPart.VISUAL_ID) {
				result.add(new EERmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntityEditPart.VISUAL_ID) {
				result.add(new EERmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RelationshipEditPart.VISUAL_ID) {
				result.add(new EERmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DependencyRelationshipEditPart.VISUAL_ID) {
				result.add(new EERmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GeneralizationEditPart.VISUAL_ID) {
				result.add(new EERmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompositeComponentEditPart.VISUAL_ID) {
				result.add(new EERmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MemberCollectionEditPart.VISUAL_ID) {
				result.add(new EERmodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getDomains().iterator(); it
				.hasNext();) {
			Domain childElement = (Domain) it.next();
			int visualID = EERmodelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PrimitiveTypeEditPart.VISUAL_ID) {
				result.add(new EERmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnumerationTypeEditPart.VISUAL_ID) {
				result.add(new EERmodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelNodeDescriptor> getGeneralization_2011SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Generalization modelElement = (Generalization) view.getElement();
		LinkedList<EERmodelNodeDescriptor> result = new LinkedList<EERmodelNodeDescriptor>();
		{
			Attribute childElement = modelElement.getAttribute();
			int visualID = EERmodelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleAttribute3EditPart.VISUAL_ID) {
				result.add(new EERmodelNodeDescriptor(childElement, visualID));
			}
			if (visualID == CompositeAttribute3EditPart.VISUAL_ID) {
				result.add(new EERmodelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelNodeDescriptor> getWeakEntityWeakEntityAttributesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WeakEntity modelElement = (WeakEntity) containerView.getElement();
		LinkedList<EERmodelNodeDescriptor> result = new LinkedList<EERmodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCandidateKey().iterator(); it
				.hasNext();) {
			CandidateKey childElement = (CandidateKey) it.next();
			int visualID = EERmodelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CandidateKeyEditPart.VISUAL_ID) {
				result.add(new EERmodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = EERmodelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleAttributeEditPart.VISUAL_ID) {
				result.add(new EERmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompositeAttributeEditPart.VISUAL_ID) {
				result.add(new EERmodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelNodeDescriptor> getEntityEntityAttributesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Entity modelElement = (Entity) containerView.getElement();
		LinkedList<EERmodelNodeDescriptor> result = new LinkedList<EERmodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCandidateKey().iterator(); it
				.hasNext();) {
			CandidateKey childElement = (CandidateKey) it.next();
			int visualID = EERmodelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CandidateKey2EditPart.VISUAL_ID) {
				result.add(new EERmodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = EERmodelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleAttribute2EditPart.VISUAL_ID) {
				result.add(new EERmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompositeAttribute2EditPart.VISUAL_ID) {
				result.add(new EERmodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelNodeDescriptor> getEnumerationTypeEnumerationTypeCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EnumerationType modelElement = (EnumerationType) containerView
				.getElement();
		LinkedList<EERmodelNodeDescriptor> result = new LinkedList<EERmodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLiterals().iterator(); it
				.hasNext();) {
			EnumeratedLiteral childElement = (EnumeratedLiteral) it.next();
			int visualID = EERmodelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EnumeratedLiteralEditPart.VISUAL_ID) {
				result.add(new EERmodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getContainedLinks(View view) {
		switch (EERmodelVisualIDRegistry.getVisualID(view)) {
		case ProjectEditPart.VISUAL_ID:
			return getProject_1000ContainedLinks(view);
		case WeakEntityEditPart.VISUAL_ID:
			return getWeakEntity_2009ContainedLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2003ContainedLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2007ContainedLinks(view);
		case DependencyRelationshipEditPart.VISUAL_ID:
			return getDependencyRelationship_2010ContainedLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_2011ContainedLinks(view);
		case CompositeComponentEditPart.VISUAL_ID:
			return getCompositeComponent_2013ContainedLinks(view);
		case MemberCollectionEditPart.VISUAL_ID:
			return getMemberCollection_2014ContainedLinks(view);
		case PrimitiveTypeEditPart.VISUAL_ID:
			return getPrimitiveType_2015ContainedLinks(view);
		case EnumerationTypeEditPart.VISUAL_ID:
			return getEnumerationType_2016ContainedLinks(view);
		case CandidateKeyEditPart.VISUAL_ID:
			return getCandidateKey_3005ContainedLinks(view);
		case SingleAttributeEditPart.VISUAL_ID:
			return getSingleAttribute_3001ContainedLinks(view);
		case CompositeAttributeEditPart.VISUAL_ID:
			return getCompositeAttribute_3002ContainedLinks(view);
		case CandidateKey2EditPart.VISUAL_ID:
			return getCandidateKey_3008ContainedLinks(view);
		case SingleAttribute2EditPart.VISUAL_ID:
			return getSingleAttribute_3007ContainedLinks(view);
		case CompositeAttribute2EditPart.VISUAL_ID:
			return getCompositeAttribute_3004ContainedLinks(view);
		case SingleAttribute3EditPart.VISUAL_ID:
			return getSingleAttribute_3009ContainedLinks(view);
		case CompositeAttribute3EditPart.VISUAL_ID:
			return getCompositeAttribute_3010ContainedLinks(view);
		case EnumeratedLiteralEditPart.VISUAL_ID:
			return getEnumeratedLiteral_3011ContainedLinks(view);
		case AggregationParticipantEditPart.VISUAL_ID:
			return getAggregationParticipant_4002ContainedLinks(view);
		case AggregationParticipant2EditPart.VISUAL_ID:
			return getAggregationParticipant_4006ContainedLinks(view);
		case ParticipantEditPart.VISUAL_ID:
			return getParticipant_4001ContainedLinks(view);
		case GeneralizationRelationshipEditPart.VISUAL_ID:
			return getGeneralizationRelationship_4005ContainedLinks(view);
		case SpecializationRelationshipEditPart.VISUAL_ID:
			return getSpecializationRelationship_4007ContainedLinks(view);
		case InclusionEditPart.VISUAL_ID:
			return getInclusion_4008ContainedLinks(view);
		case ExclusionEditPart.VISUAL_ID:
			return getExclusion_4009ContainedLinks(view);
		case ExclusiveEditPart.VISUAL_ID:
			return getExclusive_4010ContainedLinks(view);
		case InclusivenessEditPart.VISUAL_ID:
			return getInclusiveness_4011ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getIncomingLinks(View view) {
		switch (EERmodelVisualIDRegistry.getVisualID(view)) {
		case WeakEntityEditPart.VISUAL_ID:
			return getWeakEntity_2009IncomingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2003IncomingLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2007IncomingLinks(view);
		case DependencyRelationshipEditPart.VISUAL_ID:
			return getDependencyRelationship_2010IncomingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_2011IncomingLinks(view);
		case CompositeComponentEditPart.VISUAL_ID:
			return getCompositeComponent_2013IncomingLinks(view);
		case MemberCollectionEditPart.VISUAL_ID:
			return getMemberCollection_2014IncomingLinks(view);
		case PrimitiveTypeEditPart.VISUAL_ID:
			return getPrimitiveType_2015IncomingLinks(view);
		case EnumerationTypeEditPart.VISUAL_ID:
			return getEnumerationType_2016IncomingLinks(view);
		case CandidateKeyEditPart.VISUAL_ID:
			return getCandidateKey_3005IncomingLinks(view);
		case SingleAttributeEditPart.VISUAL_ID:
			return getSingleAttribute_3001IncomingLinks(view);
		case CompositeAttributeEditPart.VISUAL_ID:
			return getCompositeAttribute_3002IncomingLinks(view);
		case CandidateKey2EditPart.VISUAL_ID:
			return getCandidateKey_3008IncomingLinks(view);
		case SingleAttribute2EditPart.VISUAL_ID:
			return getSingleAttribute_3007IncomingLinks(view);
		case CompositeAttribute2EditPart.VISUAL_ID:
			return getCompositeAttribute_3004IncomingLinks(view);
		case SingleAttribute3EditPart.VISUAL_ID:
			return getSingleAttribute_3009IncomingLinks(view);
		case CompositeAttribute3EditPart.VISUAL_ID:
			return getCompositeAttribute_3010IncomingLinks(view);
		case EnumeratedLiteralEditPart.VISUAL_ID:
			return getEnumeratedLiteral_3011IncomingLinks(view);
		case AggregationParticipantEditPart.VISUAL_ID:
			return getAggregationParticipant_4002IncomingLinks(view);
		case AggregationParticipant2EditPart.VISUAL_ID:
			return getAggregationParticipant_4006IncomingLinks(view);
		case ParticipantEditPart.VISUAL_ID:
			return getParticipant_4001IncomingLinks(view);
		case GeneralizationRelationshipEditPart.VISUAL_ID:
			return getGeneralizationRelationship_4005IncomingLinks(view);
		case SpecializationRelationshipEditPart.VISUAL_ID:
			return getSpecializationRelationship_4007IncomingLinks(view);
		case InclusionEditPart.VISUAL_ID:
			return getInclusion_4008IncomingLinks(view);
		case ExclusionEditPart.VISUAL_ID:
			return getExclusion_4009IncomingLinks(view);
		case ExclusiveEditPart.VISUAL_ID:
			return getExclusive_4010IncomingLinks(view);
		case InclusivenessEditPart.VISUAL_ID:
			return getInclusiveness_4011IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getOutgoingLinks(View view) {
		switch (EERmodelVisualIDRegistry.getVisualID(view)) {
		case WeakEntityEditPart.VISUAL_ID:
			return getWeakEntity_2009OutgoingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2003OutgoingLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2007OutgoingLinks(view);
		case DependencyRelationshipEditPart.VISUAL_ID:
			return getDependencyRelationship_2010OutgoingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_2011OutgoingLinks(view);
		case CompositeComponentEditPart.VISUAL_ID:
			return getCompositeComponent_2013OutgoingLinks(view);
		case MemberCollectionEditPart.VISUAL_ID:
			return getMemberCollection_2014OutgoingLinks(view);
		case PrimitiveTypeEditPart.VISUAL_ID:
			return getPrimitiveType_2015OutgoingLinks(view);
		case EnumerationTypeEditPart.VISUAL_ID:
			return getEnumerationType_2016OutgoingLinks(view);
		case CandidateKeyEditPart.VISUAL_ID:
			return getCandidateKey_3005OutgoingLinks(view);
		case SingleAttributeEditPart.VISUAL_ID:
			return getSingleAttribute_3001OutgoingLinks(view);
		case CompositeAttributeEditPart.VISUAL_ID:
			return getCompositeAttribute_3002OutgoingLinks(view);
		case CandidateKey2EditPart.VISUAL_ID:
			return getCandidateKey_3008OutgoingLinks(view);
		case SingleAttribute2EditPart.VISUAL_ID:
			return getSingleAttribute_3007OutgoingLinks(view);
		case CompositeAttribute2EditPart.VISUAL_ID:
			return getCompositeAttribute_3004OutgoingLinks(view);
		case SingleAttribute3EditPart.VISUAL_ID:
			return getSingleAttribute_3009OutgoingLinks(view);
		case CompositeAttribute3EditPart.VISUAL_ID:
			return getCompositeAttribute_3010OutgoingLinks(view);
		case EnumeratedLiteralEditPart.VISUAL_ID:
			return getEnumeratedLiteral_3011OutgoingLinks(view);
		case AggregationParticipantEditPart.VISUAL_ID:
			return getAggregationParticipant_4002OutgoingLinks(view);
		case AggregationParticipant2EditPart.VISUAL_ID:
			return getAggregationParticipant_4006OutgoingLinks(view);
		case ParticipantEditPart.VISUAL_ID:
			return getParticipant_4001OutgoingLinks(view);
		case GeneralizationRelationshipEditPart.VISUAL_ID:
			return getGeneralizationRelationship_4005OutgoingLinks(view);
		case SpecializationRelationshipEditPart.VISUAL_ID:
			return getSpecializationRelationship_4007OutgoingLinks(view);
		case InclusionEditPart.VISUAL_ID:
			return getInclusion_4008OutgoingLinks(view);
		case ExclusionEditPart.VISUAL_ID:
			return getExclusion_4009OutgoingLinks(view);
		case ExclusiveEditPart.VISUAL_ID:
			return getExclusive_4010OutgoingLinks(view);
		case InclusivenessEditPart.VISUAL_ID:
			return getInclusiveness_4011OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getProject_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getWeakEntity_2009ContainedLinks(
			View view) {
		WeakEntity modelElement = (WeakEntity) view.getElement();
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_GeneralizationRelationship_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SpecializationRelationship_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getEntity_2003ContainedLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_GeneralizationRelationship_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SpecializationRelationship_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getRelationship_2007ContainedLinks(
			View view) {
		Relationship modelElement = (Relationship) view.getElement();
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Participant_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Inclusion_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Exclusion_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getDependencyRelationship_2010ContainedLinks(
			View view) {
		DependencyRelationship modelElement = (DependencyRelationship) view
				.getElement();
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Participant_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getGeneralization_2011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getCompositeComponent_2013ContainedLinks(
			View view) {
		CompositeComponent modelElement = (CompositeComponent) view
				.getElement();
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AggregationParticipant_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getMemberCollection_2014ContainedLinks(
			View view) {
		MemberCollection modelElement = (MemberCollection) view.getElement();
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AggregationParticipant_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getPrimitiveType_2015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getEnumerationType_2016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getCandidateKey_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getSingleAttribute_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getCompositeAttribute_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getCandidateKey_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getSingleAttribute_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getCompositeAttribute_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getSingleAttribute_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getCompositeAttribute_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getEnumeratedLiteral_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getAggregationParticipant_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getAggregationParticipant_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getParticipant_4001ContainedLinks(
			View view) {
		Participant modelElement = (Participant) view.getElement();
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Exclusive_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Inclusiveness_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getGeneralizationRelationship_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getSpecializationRelationship_4007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getInclusion_4008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getExclusion_4009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getExclusive_4010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getInclusiveness_4011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getWeakEntity_2009IncomingLinks(
			View view) {
		WeakEntity modelElement = (WeakEntity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AggregationParticipant_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AggregationParticipant_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Participant_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getEntity_2003IncomingLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AggregationParticipant_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AggregationParticipant_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Participant_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getRelationship_2007IncomingLinks(
			View view) {
		Relationship modelElement = (Relationship) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AggregationParticipant_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AggregationParticipant_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Inclusion_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Exclusion_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getDependencyRelationship_2010IncomingLinks(
			View view) {
		DependencyRelationship modelElement = (DependencyRelationship) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AggregationParticipant_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AggregationParticipant_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getGeneralization_2011IncomingLinks(
			View view) {
		Generalization modelElement = (Generalization) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_GeneralizationRelationship_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SpecializationRelationship_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getCompositeComponent_2013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getMemberCollection_2014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getPrimitiveType_2015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getEnumerationType_2016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getCandidateKey_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getSingleAttribute_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getCompositeAttribute_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getCandidateKey_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getSingleAttribute_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getCompositeAttribute_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getSingleAttribute_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getCompositeAttribute_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getEnumeratedLiteral_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getAggregationParticipant_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getAggregationParticipant_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getParticipant_4001IncomingLinks(
			View view) {
		Participant modelElement = (Participant) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Exclusive_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Inclusiveness_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getGeneralizationRelationship_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getSpecializationRelationship_4007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getInclusion_4008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getExclusion_4009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getExclusive_4010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getInclusiveness_4011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getWeakEntity_2009OutgoingLinks(
			View view) {
		WeakEntity modelElement = (WeakEntity) view.getElement();
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_GeneralizationRelationship_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SpecializationRelationship_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getEntity_2003OutgoingLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_GeneralizationRelationship_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SpecializationRelationship_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getRelationship_2007OutgoingLinks(
			View view) {
		Relationship modelElement = (Relationship) view.getElement();
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Participant_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Inclusion_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Exclusion_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getDependencyRelationship_2010OutgoingLinks(
			View view) {
		DependencyRelationship modelElement = (DependencyRelationship) view
				.getElement();
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Participant_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getGeneralization_2011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getCompositeComponent_2013OutgoingLinks(
			View view) {
		CompositeComponent modelElement = (CompositeComponent) view
				.getElement();
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AggregationParticipant_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AggregationParticipant_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getMemberCollection_2014OutgoingLinks(
			View view) {
		MemberCollection modelElement = (MemberCollection) view.getElement();
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AggregationParticipant_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AggregationParticipant_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getPrimitiveType_2015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getEnumerationType_2016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getCandidateKey_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getSingleAttribute_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getCompositeAttribute_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getCandidateKey_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getSingleAttribute_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getCompositeAttribute_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getSingleAttribute_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getCompositeAttribute_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getEnumeratedLiteral_3011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getAggregationParticipant_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getAggregationParticipant_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getParticipant_4001OutgoingLinks(
			View view) {
		Participant modelElement = (Participant) view.getElement();
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Exclusive_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Inclusiveness_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getGeneralizationRelationship_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getSpecializationRelationship_4007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getInclusion_4008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getExclusion_4009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getExclusive_4010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getInclusiveness_4011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getContainedTypeModelFacetLinks_AggregationParticipant_4002(
			CompositeComponent container) {
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		for (Iterator<?> links = container.getParticipants().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AggregationParticipant) {
				continue;
			}
			AggregationParticipant link = (AggregationParticipant) linkObject;
			if (AggregationParticipantEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Aggregation src = link.getSource();
			result.add(new EERmodelLinkDescriptor(src, dst, link,
					EERmodelElementTypes.AggregationParticipant_4002,
					AggregationParticipantEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getContainedTypeModelFacetLinks_AggregationParticipant_4006(
			MemberCollection container) {
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		AggregationParticipant link = container.getParticipant();
		if (AggregationParticipant2EditPart.VISUAL_ID != EERmodelVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getTarget();
		Aggregation src = link.getSource();
		result.add(new EERmodelLinkDescriptor(src, dst, link,
				EERmodelElementTypes.AggregationParticipant_4006,
				AggregationParticipant2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getContainedTypeModelFacetLinks_Participant_4001(
			AbstractRelationship container) {
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		for (Iterator<?> links = container.getParticipants().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Participant) {
				continue;
			}
			Participant link = (Participant) linkObject;
			if (ParticipantEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity dst = link.getTarget();
			AbstractRelationship src = link.getSource();
			result.add(new EERmodelLinkDescriptor(src, dst, link,
					EERmodelElementTypes.Participant_4001,
					ParticipantEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getContainedTypeModelFacetLinks_GeneralizationRelationship_4005(
			Entity container) {
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		for (Iterator<?> links = container.getSpecializes().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GeneralizationRelationship) {
				continue;
			}
			GeneralizationRelationship link = (GeneralizationRelationship) linkObject;
			if (GeneralizationRelationshipEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Generalization dst = link.getRelationship();
			Entity src = link.getChild();
			result.add(new EERmodelLinkDescriptor(src, dst, link,
					EERmodelElementTypes.GeneralizationRelationship_4005,
					GeneralizationRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getContainedTypeModelFacetLinks_SpecializationRelationship_4007(
			Entity container) {
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		for (Iterator<?> links = container.getIsSpecializedBy().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SpecializationRelationship) {
				continue;
			}
			SpecializationRelationship link = (SpecializationRelationship) linkObject;
			if (SpecializationRelationshipEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Generalization dst = link.getRelationship();
			Entity src = link.getSource();
			result.add(new EERmodelLinkDescriptor(src, dst, link,
					EERmodelElementTypes.SpecializationRelationship_4007,
					SpecializationRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getContainedTypeModelFacetLinks_Inclusion_4008(
			Relationship container) {
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		for (Iterator<?> links = container.getInclusionConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Inclusion) {
				continue;
			}
			Inclusion link = (Inclusion) linkObject;
			if (InclusionEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Relationship dst = link.getTarget();
			Relationship src = link.getSource();
			result.add(new EERmodelLinkDescriptor(src, dst, link,
					EERmodelElementTypes.Inclusion_4008,
					InclusionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getContainedTypeModelFacetLinks_Exclusion_4009(
			Relationship container) {
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		for (Iterator<?> links = container.getExclusionConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Exclusion) {
				continue;
			}
			Exclusion link = (Exclusion) linkObject;
			if (ExclusionEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Relationship dst = link.getTarget();
			Relationship src = link.getSource();
			result.add(new EERmodelLinkDescriptor(src, dst, link,
					EERmodelElementTypes.Exclusion_4009,
					ExclusionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getContainedTypeModelFacetLinks_Exclusive_4010(
			Participant container) {
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		for (Iterator<?> links = container.getExclusiveConstraint().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Exclusive) {
				continue;
			}
			Exclusive link = (Exclusive) linkObject;
			if (ExclusiveEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Participant dst = link.getTarget();
			Participant src = link.getSource();
			result.add(new EERmodelLinkDescriptor(src, dst, link,
					EERmodelElementTypes.Exclusive_4010,
					ExclusiveEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getContainedTypeModelFacetLinks_Inclusiveness_4011(
			Participant container) {
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		for (Iterator<?> links = container.getInclusivenessConstraint()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Inclusiveness) {
				continue;
			}
			Inclusiveness link = (Inclusiveness) linkObject;
			if (InclusivenessEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Participant dst = link.getTarget();
			Participant src = link.getSource();
			result.add(new EERmodelLinkDescriptor(src, dst, link,
					EERmodelElementTypes.Inclusiveness_4011,
					InclusivenessEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getIncomingTypeModelFacetLinks_AggregationParticipant_4002(
			Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EERPackage.eINSTANCE
					.getAggregationParticipant_Target()
					|| false == setting.getEObject() instanceof AggregationParticipant) {
				continue;
			}
			AggregationParticipant link = (AggregationParticipant) setting
					.getEObject();
			if (AggregationParticipantEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Aggregation src = link.getSource();
			result.add(new EERmodelLinkDescriptor(src, target, link,
					EERmodelElementTypes.AggregationParticipant_4002,
					AggregationParticipantEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getIncomingTypeModelFacetLinks_AggregationParticipant_4006(
			Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EERPackage.eINSTANCE
					.getAggregationParticipant_Target()
					|| false == setting.getEObject() instanceof AggregationParticipant) {
				continue;
			}
			AggregationParticipant link = (AggregationParticipant) setting
					.getEObject();
			if (AggregationParticipant2EditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Aggregation src = link.getSource();
			result.add(new EERmodelLinkDescriptor(src, target, link,
					EERmodelElementTypes.AggregationParticipant_4006,
					AggregationParticipant2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getIncomingTypeModelFacetLinks_Participant_4001(
			Entity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EERPackage.eINSTANCE
					.getParticipant_Target()
					|| false == setting.getEObject() instanceof Participant) {
				continue;
			}
			Participant link = (Participant) setting.getEObject();
			if (ParticipantEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractRelationship src = link.getSource();
			result.add(new EERmodelLinkDescriptor(src, target, link,
					EERmodelElementTypes.Participant_4001,
					ParticipantEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getIncomingTypeModelFacetLinks_GeneralizationRelationship_4005(
			Generalization target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EERPackage.eINSTANCE
					.getGeneralizationRelationship_Relationship()
					|| false == setting.getEObject() instanceof GeneralizationRelationship) {
				continue;
			}
			GeneralizationRelationship link = (GeneralizationRelationship) setting
					.getEObject();
			if (GeneralizationRelationshipEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity src = link.getChild();
			result.add(new EERmodelLinkDescriptor(src, target, link,
					EERmodelElementTypes.GeneralizationRelationship_4005,
					GeneralizationRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getIncomingTypeModelFacetLinks_SpecializationRelationship_4007(
			Generalization target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EERPackage.eINSTANCE
					.getSpecializationRelationship_Relationship()
					|| false == setting.getEObject() instanceof SpecializationRelationship) {
				continue;
			}
			SpecializationRelationship link = (SpecializationRelationship) setting
					.getEObject();
			if (SpecializationRelationshipEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity src = link.getSource();
			result.add(new EERmodelLinkDescriptor(src, target, link,
					EERmodelElementTypes.SpecializationRelationship_4007,
					SpecializationRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getIncomingTypeModelFacetLinks_Inclusion_4008(
			Relationship target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EERPackage.eINSTANCE
					.getInclusion_Target()
					|| false == setting.getEObject() instanceof Inclusion) {
				continue;
			}
			Inclusion link = (Inclusion) setting.getEObject();
			if (InclusionEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Relationship src = link.getSource();
			result.add(new EERmodelLinkDescriptor(src, target, link,
					EERmodelElementTypes.Inclusion_4008,
					InclusionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getIncomingTypeModelFacetLinks_Exclusion_4009(
			Relationship target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EERPackage.eINSTANCE
					.getExclusion_Target()
					|| false == setting.getEObject() instanceof Exclusion) {
				continue;
			}
			Exclusion link = (Exclusion) setting.getEObject();
			if (ExclusionEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Relationship src = link.getSource();
			result.add(new EERmodelLinkDescriptor(src, target, link,
					EERmodelElementTypes.Exclusion_4009,
					ExclusionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getIncomingTypeModelFacetLinks_Exclusive_4010(
			Participant target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EERPackage.eINSTANCE
					.getExclusive_Target()
					|| false == setting.getEObject() instanceof Exclusive) {
				continue;
			}
			Exclusive link = (Exclusive) setting.getEObject();
			if (ExclusiveEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Participant src = link.getSource();
			result.add(new EERmodelLinkDescriptor(src, target, link,
					EERmodelElementTypes.Exclusive_4010,
					ExclusiveEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getIncomingTypeModelFacetLinks_Inclusiveness_4011(
			Participant target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EERPackage.eINSTANCE
					.getInclusiveness_Target()
					|| false == setting.getEObject() instanceof Inclusiveness) {
				continue;
			}
			Inclusiveness link = (Inclusiveness) setting.getEObject();
			if (InclusivenessEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Participant src = link.getSource();
			result.add(new EERmodelLinkDescriptor(src, target, link,
					EERmodelElementTypes.Inclusiveness_4011,
					InclusivenessEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getOutgoingTypeModelFacetLinks_AggregationParticipant_4002(
			Aggregation source) {
		CompositeComponent container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof CompositeComponent) {
				container = (CompositeComponent) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		for (Iterator<?> links = container.getParticipants().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AggregationParticipant) {
				continue;
			}
			AggregationParticipant link = (AggregationParticipant) linkObject;
			if (AggregationParticipantEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Aggregation src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new EERmodelLinkDescriptor(src, dst, link,
					EERmodelElementTypes.AggregationParticipant_4002,
					AggregationParticipantEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getOutgoingTypeModelFacetLinks_AggregationParticipant_4006(
			Aggregation source) {
		MemberCollection container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MemberCollection) {
				container = (MemberCollection) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		AggregationParticipant link = container.getParticipant();
		if (AggregationParticipant2EditPart.VISUAL_ID != EERmodelVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		Node dst = link.getTarget();
		Aggregation src = link.getSource();
		if (src != source) {
			return result;
		}
		result.add(new EERmodelLinkDescriptor(src, dst, link,
				EERmodelElementTypes.AggregationParticipant_4006,
				AggregationParticipant2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getOutgoingTypeModelFacetLinks_Participant_4001(
			AbstractRelationship source) {
		AbstractRelationship container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof AbstractRelationship) {
				container = (AbstractRelationship) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		for (Iterator<?> links = container.getParticipants().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Participant) {
				continue;
			}
			Participant link = (Participant) linkObject;
			if (ParticipantEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity dst = link.getTarget();
			AbstractRelationship src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new EERmodelLinkDescriptor(src, dst, link,
					EERmodelElementTypes.Participant_4001,
					ParticipantEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getOutgoingTypeModelFacetLinks_GeneralizationRelationship_4005(
			Entity source) {
		Entity container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Entity) {
				container = (Entity) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		for (Iterator<?> links = container.getSpecializes().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof GeneralizationRelationship) {
				continue;
			}
			GeneralizationRelationship link = (GeneralizationRelationship) linkObject;
			if (GeneralizationRelationshipEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Generalization dst = link.getRelationship();
			Entity src = link.getChild();
			if (src != source) {
				continue;
			}
			result.add(new EERmodelLinkDescriptor(src, dst, link,
					EERmodelElementTypes.GeneralizationRelationship_4005,
					GeneralizationRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getOutgoingTypeModelFacetLinks_SpecializationRelationship_4007(
			Entity source) {
		Entity container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Entity) {
				container = (Entity) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		for (Iterator<?> links = container.getIsSpecializedBy().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SpecializationRelationship) {
				continue;
			}
			SpecializationRelationship link = (SpecializationRelationship) linkObject;
			if (SpecializationRelationshipEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Generalization dst = link.getRelationship();
			Entity src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new EERmodelLinkDescriptor(src, dst, link,
					EERmodelElementTypes.SpecializationRelationship_4007,
					SpecializationRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getOutgoingTypeModelFacetLinks_Inclusion_4008(
			Relationship source) {
		Relationship container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Relationship) {
				container = (Relationship) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		for (Iterator<?> links = container.getInclusionConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Inclusion) {
				continue;
			}
			Inclusion link = (Inclusion) linkObject;
			if (InclusionEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Relationship dst = link.getTarget();
			Relationship src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new EERmodelLinkDescriptor(src, dst, link,
					EERmodelElementTypes.Inclusion_4008,
					InclusionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getOutgoingTypeModelFacetLinks_Exclusion_4009(
			Relationship source) {
		Relationship container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Relationship) {
				container = (Relationship) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		for (Iterator<?> links = container.getExclusionConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Exclusion) {
				continue;
			}
			Exclusion link = (Exclusion) linkObject;
			if (ExclusionEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Relationship dst = link.getTarget();
			Relationship src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new EERmodelLinkDescriptor(src, dst, link,
					EERmodelElementTypes.Exclusion_4009,
					ExclusionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getOutgoingTypeModelFacetLinks_Exclusive_4010(
			Participant source) {
		Participant container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Participant) {
				container = (Participant) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		for (Iterator<?> links = container.getExclusiveConstraint().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Exclusive) {
				continue;
			}
			Exclusive link = (Exclusive) linkObject;
			if (ExclusiveEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Participant dst = link.getTarget();
			Participant src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new EERmodelLinkDescriptor(src, dst, link,
					EERmodelElementTypes.Exclusive_4010,
					ExclusiveEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getOutgoingTypeModelFacetLinks_Inclusiveness_4011(
			Participant source) {
		Participant container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Participant) {
				container = (Participant) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		for (Iterator<?> links = container.getInclusivenessConstraint()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Inclusiveness) {
				continue;
			}
			Inclusiveness link = (Inclusiveness) linkObject;
			if (InclusivenessEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Participant dst = link.getTarget();
			Participant src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new EERmodelLinkDescriptor(src, dst, link,
					EERmodelElementTypes.Inclusiveness_4011,
					InclusivenessEditPart.VISUAL_ID));
		}
		return result;
	}

}
