package EER.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import EER.EERPackage;
import EER.Project;
import EER.diagram.edit.parts.AggregationParticipantEditPart;
import EER.diagram.edit.parts.CandidateKeyEditPart;
import EER.diagram.edit.parts.CompositeAttributeEditPart;
import EER.diagram.edit.parts.CompositeComponentEditPart;
import EER.diagram.edit.parts.CompositeComponentNameEditPart;
import EER.diagram.edit.parts.DependencyRelationship2EditPart;
import EER.diagram.edit.parts.DependencyRelationshipEditPart;
import EER.diagram.edit.parts.DependencyRelationshipNameEditPart;
import EER.diagram.edit.parts.EnumeratedLiteralEditPart;
import EER.diagram.edit.parts.EnumerationTypeEditPart;
import EER.diagram.edit.parts.EnumerationTypeNameEditPart;
import EER.diagram.edit.parts.ExclusionEditPart;
import EER.diagram.edit.parts.GeneralizationEditPart;
import EER.diagram.edit.parts.GeneralizationNameEditPart;
import EER.diagram.edit.parts.GeneralizationRelationshipEditPart;
import EER.diagram.edit.parts.InclusionEditPart;
import EER.diagram.edit.parts.MemberCollectionEditPart;
import EER.diagram.edit.parts.MemberCollectionNameEditPart;
import EER.diagram.edit.parts.ParticipantEditPart;
import EER.diagram.edit.parts.PrimitiveTypeEditPart;
import EER.diagram.edit.parts.PrimitiveTypeNameEditPart;
import EER.diagram.edit.parts.ProjectEditPart;
import EER.diagram.edit.parts.RelationshipEditPart;
import EER.diagram.edit.parts.RelationshipNameEditPart;
import EER.diagram.edit.parts.SingleAttributeEditPart;
import EER.diagram.edit.parts.SpecializationRelationshipEditPart;
import EER.diagram.edit.parts.WeakEntityEditPart;
import EER.diagram.edit.parts.WeakEntityNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class Eer2sqlVisualIDRegistry {

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
		return EER.diagram.part.Eer2sqlVisualIDRegistry.getVisualID(view
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
				Eer2sqlDiagramEditorPlugin.getInstance().logError(
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
		String containerModelID = EER.diagram.part.Eer2sqlVisualIDRegistry
				.getModelID(containerView);
		if (!ProjectEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ProjectEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = EER.diagram.part.Eer2sqlVisualIDRegistry
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
			if (EERPackage.eINSTANCE.getEnumerationType().isSuperTypeOf(
					domainElement.eClass())) {
				return EnumerationTypeEditPart.VISUAL_ID;
			}
			if (EERPackage.eINSTANCE.getGeneralization().isSuperTypeOf(
					domainElement.eClass())) {
				return GeneralizationEditPart.VISUAL_ID;
			}
			if (EERPackage.eINSTANCE.getMemberCollection().isSuperTypeOf(
					domainElement.eClass())) {
				return MemberCollectionEditPart.VISUAL_ID;
			}
			if (EERPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(
					domainElement.eClass())) {
				return PrimitiveTypeEditPart.VISUAL_ID;
			}
			if (EERPackage.eINSTANCE.getCompositeComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return CompositeComponentEditPart.VISUAL_ID;
			}
			if (EERPackage.eINSTANCE.getDependencyRelationship().isSuperTypeOf(
					domainElement.eClass())) {
				return DependencyRelationshipEditPart.VISUAL_ID;
			}
			if (EERPackage.eINSTANCE.getRelationship().isSuperTypeOf(
					domainElement.eClass())) {
				return RelationshipEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = EER.diagram.part.Eer2sqlVisualIDRegistry
				.getModelID(containerView);
		if (!ProjectEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ProjectEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = EER.diagram.part.Eer2sqlVisualIDRegistry
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
			if (EnumerationTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GeneralizationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MemberCollectionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DependencyRelationshipEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RelationshipEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WeakEntityEditPart.VISUAL_ID:
			if (WeakEntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumerationTypeEditPart.VISUAL_ID:
			if (EnumerationTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GeneralizationEditPart.VISUAL_ID:
			if (GeneralizationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MemberCollectionEditPart.VISUAL_ID:
			if (MemberCollectionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveTypeEditPart.VISUAL_ID:
			if (PrimitiveTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeComponentEditPart.VISUAL_ID:
			if (CompositeComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DependencyRelationshipEditPart.VISUAL_ID:
			if (DependencyRelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RelationshipEditPart.VISUAL_ID:
			if (RelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (EERPackage.eINSTANCE.getGeneralizationRelationship().isSuperTypeOf(
				domainElement.eClass())) {
			return GeneralizationRelationshipEditPart.VISUAL_ID;
		}
		if (EERPackage.eINSTANCE.getExclusion().isSuperTypeOf(
				domainElement.eClass())) {
			return ExclusionEditPart.VISUAL_ID;
		}
		if (EERPackage.eINSTANCE.getCandidateKey().isSuperTypeOf(
				domainElement.eClass())) {
			return CandidateKeyEditPart.VISUAL_ID;
		}
		if (EERPackage.eINSTANCE.getSingleAttribute().isSuperTypeOf(
				domainElement.eClass())) {
			return SingleAttributeEditPart.VISUAL_ID;
		}
		if (EERPackage.eINSTANCE.getSpecializationRelationship().isSuperTypeOf(
				domainElement.eClass())) {
			return SpecializationRelationshipEditPart.VISUAL_ID;
		}
		if (EERPackage.eINSTANCE.getDependencyRelationship().isSuperTypeOf(
				domainElement.eClass())) {
			return DependencyRelationship2EditPart.VISUAL_ID;
		}
		if (EERPackage.eINSTANCE.getCompositeAttribute().isSuperTypeOf(
				domainElement.eClass())) {
			return CompositeAttributeEditPart.VISUAL_ID;
		}
		if (EERPackage.eINSTANCE.getParticipant().isSuperTypeOf(
				domainElement.eClass())) {
			return ParticipantEditPart.VISUAL_ID;
		}
		if (EERPackage.eINSTANCE.getAggregationParticipant().isSuperTypeOf(
				domainElement.eClass())) {
			return AggregationParticipantEditPart.VISUAL_ID;
		}
		if (EERPackage.eINSTANCE.getEnumeratedLiteral().isSuperTypeOf(
				domainElement.eClass())) {
			return EnumeratedLiteralEditPart.VISUAL_ID;
		}
		if (EERPackage.eINSTANCE.getInclusion().isSuperTypeOf(
				domainElement.eClass())) {
			return InclusionEditPart.VISUAL_ID;
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
