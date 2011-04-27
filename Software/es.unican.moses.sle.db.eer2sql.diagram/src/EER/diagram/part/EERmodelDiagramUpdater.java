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
import EER.AttributedNode;
import EER.CompositeComponent;
import EER.DependencyRelationship;
import EER.EERPackage;
import EER.Entity;
import EER.Generalization;
import EER.GeneralizationRelationship;
import EER.MemberCollection;
import EER.Node;
import EER.Participant;
import EER.Project;
import EER.Relationship;
import EER.SpecializationRelationship;
import EER.WeakEntity;
import EER.diagram.edit.parts.AggregationParticipant2EditPart;
import EER.diagram.edit.parts.AggregationParticipantEditPart;
import EER.diagram.edit.parts.CompositeComponentEditPart;
import EER.diagram.edit.parts.DependencyRelationshipEditPart;
import EER.diagram.edit.parts.EntityEditPart;
import EER.diagram.edit.parts.GeneralizationEditPart;
import EER.diagram.edit.parts.GeneralizationRelationshipEditPart;
import EER.diagram.edit.parts.MemberCollectionEditPart;
import EER.diagram.edit.parts.ParticipantEditPart;
import EER.diagram.edit.parts.ProjectEditPart;
import EER.diagram.edit.parts.RelationshipEditPart;
import EER.diagram.edit.parts.SpecializationRelationshipEditPart;
import EER.diagram.edit.parts.WeakEntityEditPart;
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
			if (visualID == EntityEditPart.VISUAL_ID) {
				result.add(new EERmodelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WeakEntityEditPart.VISUAL_ID) {
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
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getContainedLinks(View view) {
		switch (EERmodelVisualIDRegistry.getVisualID(view)) {
		case ProjectEditPart.VISUAL_ID:
			return getProject_1000ContainedLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2003ContainedLinks(view);
		case WeakEntityEditPart.VISUAL_ID:
			return getWeakEntity_2009ContainedLinks(view);
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
		case ParticipantEditPart.VISUAL_ID:
			return getParticipant_4001ContainedLinks(view);
		case AggregationParticipantEditPart.VISUAL_ID:
			return getAggregationParticipant_4002ContainedLinks(view);
		case AggregationParticipant2EditPart.VISUAL_ID:
			return getAggregationParticipant_4003ContainedLinks(view);
		case SpecializationRelationshipEditPart.VISUAL_ID:
			return getSpecializationRelationship_4004ContainedLinks(view);
		case GeneralizationRelationshipEditPart.VISUAL_ID:
			return getGeneralizationRelationship_4005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getIncomingLinks(View view) {
		switch (EERmodelVisualIDRegistry.getVisualID(view)) {
		case EntityEditPart.VISUAL_ID:
			return getEntity_2003IncomingLinks(view);
		case WeakEntityEditPart.VISUAL_ID:
			return getWeakEntity_2009IncomingLinks(view);
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
		case ParticipantEditPart.VISUAL_ID:
			return getParticipant_4001IncomingLinks(view);
		case AggregationParticipantEditPart.VISUAL_ID:
			return getAggregationParticipant_4002IncomingLinks(view);
		case AggregationParticipant2EditPart.VISUAL_ID:
			return getAggregationParticipant_4003IncomingLinks(view);
		case SpecializationRelationshipEditPart.VISUAL_ID:
			return getSpecializationRelationship_4004IncomingLinks(view);
		case GeneralizationRelationshipEditPart.VISUAL_ID:
			return getGeneralizationRelationship_4005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getOutgoingLinks(View view) {
		switch (EERmodelVisualIDRegistry.getVisualID(view)) {
		case EntityEditPart.VISUAL_ID:
			return getEntity_2003OutgoingLinks(view);
		case WeakEntityEditPart.VISUAL_ID:
			return getWeakEntity_2009OutgoingLinks(view);
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
		case ParticipantEditPart.VISUAL_ID:
			return getParticipant_4001OutgoingLinks(view);
		case AggregationParticipantEditPart.VISUAL_ID:
			return getAggregationParticipant_4002OutgoingLinks(view);
		case AggregationParticipant2EditPart.VISUAL_ID:
			return getAggregationParticipant_4003OutgoingLinks(view);
		case SpecializationRelationshipEditPart.VISUAL_ID:
			return getSpecializationRelationship_4004OutgoingLinks(view);
		case GeneralizationRelationshipEditPart.VISUAL_ID:
			return getGeneralizationRelationship_4005OutgoingLinks(view);
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
	public static List<EERmodelLinkDescriptor> getEntity_2003ContainedLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SpecializationRelationship_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_GeneralizationRelationship_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getWeakEntity_2009ContainedLinks(
			View view) {
		WeakEntity modelElement = (WeakEntity) view.getElement();
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SpecializationRelationship_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_GeneralizationRelationship_4005(modelElement));
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
		result.addAll(getContainedTypeModelFacetLinks_AggregationParticipant_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getParticipant_4001ContainedLinks(
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
	public static List<EERmodelLinkDescriptor> getAggregationParticipant_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getSpecializationRelationship_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
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
	public static List<EERmodelLinkDescriptor> getEntity_2003IncomingLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Participant_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AggregationParticipant_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AggregationParticipant_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GeneralizationRelationship_4005(
				modelElement, crossReferences));
		return result;
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
		result.addAll(getIncomingTypeModelFacetLinks_Participant_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AggregationParticipant_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AggregationParticipant_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GeneralizationRelationship_4005(
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
		result.addAll(getIncomingTypeModelFacetLinks_AggregationParticipant_4003(
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
		result.addAll(getIncomingTypeModelFacetLinks_AggregationParticipant_4003(
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
		result.addAll(getIncomingTypeModelFacetLinks_SpecializationRelationship_4004(
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
	public static List<EERmodelLinkDescriptor> getParticipant_4001IncomingLinks(
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
	public static List<EERmodelLinkDescriptor> getAggregationParticipant_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getSpecializationRelationship_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
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
	public static List<EERmodelLinkDescriptor> getEntity_2003OutgoingLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SpecializationRelationship_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getWeakEntity_2009OutgoingLinks(
			View view) {
		WeakEntity modelElement = (WeakEntity) view.getElement();
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SpecializationRelationship_4004(modelElement));
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
		Generalization modelElement = (Generalization) view.getElement();
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_GeneralizationRelationship_4005(modelElement));
		return result;
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
		result.addAll(getOutgoingTypeModelFacetLinks_AggregationParticipant_4003(modelElement));
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
		result.addAll(getOutgoingTypeModelFacetLinks_AggregationParticipant_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getParticipant_4001OutgoingLinks(
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
	public static List<EERmodelLinkDescriptor> getAggregationParticipant_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EERmodelLinkDescriptor> getSpecializationRelationship_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
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
	private static Collection<EERmodelLinkDescriptor> getContainedTypeModelFacetLinks_AggregationParticipant_4003(
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
				EERmodelElementTypes.AggregationParticipant_4003,
				AggregationParticipant2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getContainedTypeModelFacetLinks_SpecializationRelationship_4004(
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
					EERmodelElementTypes.SpecializationRelationship_4004,
					SpecializationRelationshipEditPart.VISUAL_ID));
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
			Entity dst = link.getChild();
			Generalization src = link.getRelationship();
			result.add(new EERmodelLinkDescriptor(src, dst, link,
					EERmodelElementTypes.GeneralizationRelationship_4005,
					GeneralizationRelationshipEditPart.VISUAL_ID));
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
	private static Collection<EERmodelLinkDescriptor> getIncomingTypeModelFacetLinks_AggregationParticipant_4003(
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
					EERmodelElementTypes.AggregationParticipant_4003,
					AggregationParticipant2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getIncomingTypeModelFacetLinks_SpecializationRelationship_4004(
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
					EERmodelElementTypes.SpecializationRelationship_4004,
					SpecializationRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getIncomingTypeModelFacetLinks_GeneralizationRelationship_4005(
			Entity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EERmodelLinkDescriptor> result = new LinkedList<EERmodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EERPackage.eINSTANCE
					.getGeneralizationRelationship_Child()
					|| false == setting.getEObject() instanceof GeneralizationRelationship) {
				continue;
			}
			GeneralizationRelationship link = (GeneralizationRelationship) setting
					.getEObject();
			if (GeneralizationRelationshipEditPart.VISUAL_ID != EERmodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Generalization src = link.getRelationship();
			result.add(new EERmodelLinkDescriptor(src, target, link,
					EERmodelElementTypes.GeneralizationRelationship_4005,
					GeneralizationRelationshipEditPart.VISUAL_ID));
		}
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
	private static Collection<EERmodelLinkDescriptor> getOutgoingTypeModelFacetLinks_AggregationParticipant_4003(
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
				EERmodelElementTypes.AggregationParticipant_4003,
				AggregationParticipant2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getOutgoingTypeModelFacetLinks_SpecializationRelationship_4004(
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
					EERmodelElementTypes.SpecializationRelationship_4004,
					SpecializationRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EERmodelLinkDescriptor> getOutgoingTypeModelFacetLinks_GeneralizationRelationship_4005(
			Generalization source) {
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
			Entity dst = link.getChild();
			Generalization src = link.getRelationship();
			if (src != source) {
				continue;
			}
			result.add(new EERmodelLinkDescriptor(src, dst, link,
					EERmodelElementTypes.GeneralizationRelationship_4005,
					GeneralizationRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

}
