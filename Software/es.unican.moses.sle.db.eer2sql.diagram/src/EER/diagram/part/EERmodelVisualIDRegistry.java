package EER.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import EER.EERPackage;
import EER.Project;
import EER.diagram.edit.parts.AggregationEditPart;
import EER.diagram.edit.parts.AggregationParticipantEditPart;
import EER.diagram.edit.parts.AggregationParticipantLowerBoundUpperBoundEditPart;
import EER.diagram.edit.parts.CandidateKey2EditPart;
import EER.diagram.edit.parts.CandidateKeyEditPart;
import EER.diagram.edit.parts.CompositeAttribute2EditPart;
import EER.diagram.edit.parts.CompositeAttribute3EditPart;
import EER.diagram.edit.parts.CompositeAttributeCompositeAttributeCompartment2EditPart;
import EER.diagram.edit.parts.CompositeAttributeCompositeAttributeCompartmentEditPart;
import EER.diagram.edit.parts.CompositeAttributeEditPart;
import EER.diagram.edit.parts.CompositeAttributeName2EditPart;
import EER.diagram.edit.parts.CompositeAttributeNameEditPart;
import EER.diagram.edit.parts.DependencyRelationshipEditPart;
import EER.diagram.edit.parts.DependencyRelationshipNameEditPart;
import EER.diagram.edit.parts.DependencyRelationshipTypeEditPart;
import EER.diagram.edit.parts.EntityEditPart;
import EER.diagram.edit.parts.EntityEntityAttributesCompartmentEditPart;
import EER.diagram.edit.parts.EntityNameEditPart;
import EER.diagram.edit.parts.EnumeratedLiteralEditPart;
import EER.diagram.edit.parts.EnumerationTypeEditPart;
import EER.diagram.edit.parts.EnumerationTypeEnumerationTypeCompartmentEditPart;
import EER.diagram.edit.parts.EnumerationTypeNameEditPart;
import EER.diagram.edit.parts.ExclusionEditPart;
import EER.diagram.edit.parts.ExclusiveEditPart;
import EER.diagram.edit.parts.GeneralizationEditPart;
import EER.diagram.edit.parts.GeneralizationRelationshipEditPart;
import EER.diagram.edit.parts.InclusionEditPart;
import EER.diagram.edit.parts.InclusivenessEditPart;
import EER.diagram.edit.parts.InclusivenessLowerBoundUpperBoundEditPart;
import EER.diagram.edit.parts.ParticipantEditPart;
import EER.diagram.edit.parts.ParticipantLowerBoundUpperBoundEditPart;
import EER.diagram.edit.parts.ParticipantRoleEditPart;
import EER.diagram.edit.parts.PrimitiveTypeEditPart;
import EER.diagram.edit.parts.PrimitiveTypeNameEditPart;
import EER.diagram.edit.parts.ProjectEditPart;
import EER.diagram.edit.parts.RelationshipEditPart;
import EER.diagram.edit.parts.RelationshipNameEditPart;
import EER.diagram.edit.parts.SingleAttribute2EditPart;
import EER.diagram.edit.parts.SingleAttribute3EditPart;
import EER.diagram.edit.parts.SingleAttribute4EditPart;
import EER.diagram.edit.parts.SingleAttribute5EditPart;
import EER.diagram.edit.parts.SingleAttributeEditPart;
import EER.diagram.edit.parts.SpecializationRelationshipEditPart;
import EER.diagram.edit.parts.WeakEntityEditPart;
import EER.diagram.edit.parts.WeakEntityNameEditPart;
import EER.diagram.edit.parts.WeakEntityWeakEntityAttributesCompartmentEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class EERmodelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "es.unican.moses.sle.db.eer2sql.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ProjectEditPart.MODEL_ID.equals(view.getType())) {
				return ProjectEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return EER.diagram.part.EERmodelVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				EERmodelDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (EERPackage.eINSTANCE.getProject().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Project) domainElement)) {
			return ProjectEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = EER.diagram.part.EERmodelVisualIDRegistry
				.getModelID(containerView);
		if (!ProjectEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ProjectEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = EER.diagram.part.EERmodelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ProjectEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ProjectEditPart.VISUAL_ID:
			if (EERPackage.eINSTANCE.getWeakEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return WeakEntityEditPart.VISUAL_ID;
			}
			if (EERPackage.eINSTANCE.getEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return EntityEditPart.VISUAL_ID;
			}
			if (EERPackage.eINSTANCE.getRelationship().isSuperTypeOf(
					domainElement.eClass())) {
				return RelationshipEditPart.VISUAL_ID;
			}
			if (EERPackage.eINSTANCE.getDependencyRelationship().isSuperTypeOf(
					domainElement.eClass())) {
				return DependencyRelationshipEditPart.VISUAL_ID;
			}
			if (EERPackage.eINSTANCE.getGeneralization().isSuperTypeOf(
					domainElement.eClass())) {
				return GeneralizationEditPart.VISUAL_ID;
			}
			if (EERPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(
					domainElement.eClass())) {
				return PrimitiveTypeEditPart.VISUAL_ID;
			}
			if (EERPackage.eINSTANCE.getEnumerationType().isSuperTypeOf(
					domainElement.eClass())) {
				return EnumerationTypeEditPart.VISUAL_ID;
			}
			if (EERPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return AggregationEditPart.VISUAL_ID;
			}
			break;
		case GeneralizationEditPart.VISUAL_ID:
			if (EERPackage.eINSTANCE.getSingleAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleAttribute3EditPart.VISUAL_ID;
			}
			if (EERPackage.eINSTANCE.getCompositeAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return CompositeAttribute3EditPart.VISUAL_ID;
			}
			break;
		case WeakEntityWeakEntityAttributesCompartmentEditPart.VISUAL_ID:
			if (EERPackage.eINSTANCE.getCandidateKey().isSuperTypeOf(
					domainElement.eClass())) {
				return CandidateKeyEditPart.VISUAL_ID;
			}
			if (EERPackage.eINSTANCE.getSingleAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleAttributeEditPart.VISUAL_ID;
			}
			if (EERPackage.eINSTANCE.getCompositeAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return CompositeAttributeEditPart.VISUAL_ID;
			}
			break;
		case CompositeAttributeCompositeAttributeCompartment2EditPart.VISUAL_ID:
			if (EERPackage.eINSTANCE.getSingleAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleAttribute4EditPart.VISUAL_ID;
			}
			break;
		case EntityEntityAttributesCompartmentEditPart.VISUAL_ID:
			if (EERPackage.eINSTANCE.getCandidateKey().isSuperTypeOf(
					domainElement.eClass())) {
				return CandidateKey2EditPart.VISUAL_ID;
			}
			if (EERPackage.eINSTANCE.getSingleAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleAttribute2EditPart.VISUAL_ID;
			}
			if (EERPackage.eINSTANCE.getCompositeAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return CompositeAttribute2EditPart.VISUAL_ID;
			}
			break;
		case CompositeAttributeCompositeAttributeCompartmentEditPart.VISUAL_ID:
			if (EERPackage.eINSTANCE.getSingleAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleAttribute5EditPart.VISUAL_ID;
			}
			break;
		case EnumerationTypeEnumerationTypeCompartmentEditPart.VISUAL_ID:
			if (EERPackage.eINSTANCE.getEnumeratedLiteral().isSuperTypeOf(
					domainElement.eClass())) {
				return EnumeratedLiteralEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = EER.diagram.part.EERmodelVisualIDRegistry
				.getModelID(containerView);
		if (!ProjectEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ProjectEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = EER.diagram.part.EERmodelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ProjectEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ProjectEditPart.VISUAL_ID:
			if (WeakEntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RelationshipEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DependencyRelationshipEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GeneralizationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumerationTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WeakEntityEditPart.VISUAL_ID:
			if (WeakEntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WeakEntityWeakEntityAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityEditPart.VISUAL_ID:
			if (EntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityEntityAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RelationshipEditPart.VISUAL_ID:
			if (RelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DependencyRelationshipEditPart.VISUAL_ID:
			if (DependencyRelationshipTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DependencyRelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GeneralizationEditPart.VISUAL_ID:
			if (SingleAttribute3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeAttribute3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveTypeEditPart.VISUAL_ID:
			if (PrimitiveTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumerationTypeEditPart.VISUAL_ID:
			if (EnumerationTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumerationTypeEnumerationTypeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeAttributeEditPart.VISUAL_ID:
			if (CompositeAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeAttributeCompositeAttributeCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeAttribute2EditPart.VISUAL_ID:
			if (CompositeAttributeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeAttributeCompositeAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WeakEntityWeakEntityAttributesCompartmentEditPart.VISUAL_ID:
			if (CandidateKeyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeAttributeCompositeAttributeCompartment2EditPart.VISUAL_ID:
			if (SingleAttribute4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityEntityAttributesCompartmentEditPart.VISUAL_ID:
			if (CandidateKey2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleAttribute2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeAttribute2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeAttributeCompositeAttributeCompartmentEditPart.VISUAL_ID:
			if (SingleAttribute5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumerationTypeEnumerationTypeCompartmentEditPart.VISUAL_ID:
			if (EnumeratedLiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AggregationParticipantEditPart.VISUAL_ID:
			if (AggregationParticipantLowerBoundUpperBoundEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParticipantEditPart.VISUAL_ID:
			if (ParticipantRoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParticipantLowerBoundUpperBoundEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InclusivenessEditPart.VISUAL_ID:
			if (InclusivenessLowerBoundUpperBoundEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (EERPackage.eINSTANCE.getAggregationParticipant().isSuperTypeOf(
				domainElement.eClass())) {
			return AggregationParticipantEditPart.VISUAL_ID;
		}
		if (EERPackage.eINSTANCE.getParticipant().isSuperTypeOf(
				domainElement.eClass())) {
			return ParticipantEditPart.VISUAL_ID;
		}
		if (EERPackage.eINSTANCE.getGeneralizationRelationship().isSuperTypeOf(
				domainElement.eClass())) {
			return GeneralizationRelationshipEditPart.VISUAL_ID;
		}
		if (EERPackage.eINSTANCE.getSpecializationRelationship().isSuperTypeOf(
				domainElement.eClass())) {
			return SpecializationRelationshipEditPart.VISUAL_ID;
		}
		if (EERPackage.eINSTANCE.getInclusion().isSuperTypeOf(
				domainElement.eClass())) {
			return InclusionEditPart.VISUAL_ID;
		}
		if (EERPackage.eINSTANCE.getExclusion().isSuperTypeOf(
				domainElement.eClass())) {
			return ExclusionEditPart.VISUAL_ID;
		}
		if (EERPackage.eINSTANCE.getExclusive().isSuperTypeOf(
				domainElement.eClass())) {
			return ExclusiveEditPart.VISUAL_ID;
		}
		if (EERPackage.eINSTANCE.getInclusiveness().isSuperTypeOf(
				domainElement.eClass())) {
			return InclusivenessEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Project element) {
		return true;
	}

}
