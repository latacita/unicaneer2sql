package EER.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import EER.EERPackage;
import EER.diagram.edit.parts.AggregationEditPart;
import EER.diagram.edit.parts.AggregationParticipantEditPart;
import EER.diagram.edit.parts.CandidateKey2EditPart;
import EER.diagram.edit.parts.CandidateKeyEditPart;
import EER.diagram.edit.parts.CompositeAttribute2EditPart;
import EER.diagram.edit.parts.CompositeAttribute3EditPart;
import EER.diagram.edit.parts.CompositeAttributeEditPart;
import EER.diagram.edit.parts.DependencyRelationshipEditPart;
import EER.diagram.edit.parts.EntityEditPart;
import EER.diagram.edit.parts.EnumeratedLiteralEditPart;
import EER.diagram.edit.parts.EnumerationTypeEditPart;
import EER.diagram.edit.parts.ExclusionEditPart;
import EER.diagram.edit.parts.ExclusiveEditPart;
import EER.diagram.edit.parts.GeneralizationEditPart;
import EER.diagram.edit.parts.GeneralizationRelationshipEditPart;
import EER.diagram.edit.parts.InclusionEditPart;
import EER.diagram.edit.parts.InclusivenessEditPart;
import EER.diagram.edit.parts.ParticipantEditPart;
import EER.diagram.edit.parts.PrimitiveTypeEditPart;
import EER.diagram.edit.parts.ProjectEditPart;
import EER.diagram.edit.parts.RelationshipEditPart;
import EER.diagram.edit.parts.SingleAttribute2EditPart;
import EER.diagram.edit.parts.SingleAttribute3EditPart;
import EER.diagram.edit.parts.SingleAttribute4EditPart;
import EER.diagram.edit.parts.SingleAttribute5EditPart;
import EER.diagram.edit.parts.SingleAttributeEditPart;
import EER.diagram.edit.parts.SpecializationRelationshipEditPart;
import EER.diagram.edit.parts.WeakEntityEditPart;
import EER.diagram.part.EERmodelDiagramEditorPlugin;

/**
 * @generated
 */
public class EERmodelElementTypes {

	/**
	 * @generated
	 */
	private EERmodelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Project_1000 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.Project_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WeakEntity_2009 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.WeakEntity_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Entity_2003 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.Entity_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relationship_2007 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.Relationship_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DependencyRelationship_2010 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.DependencyRelationship_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Generalization_2011 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.Generalization_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PrimitiveType_2015 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.PrimitiveType_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EnumerationType_2016 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.EnumerationType_2016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Aggregation_2017 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.Aggregation_2017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CandidateKey_3005 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.CandidateKey_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleAttribute_3001 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.SingleAttribute_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeAttribute_3002 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.CompositeAttribute_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleAttribute_3012 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.SingleAttribute_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CandidateKey_3008 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.CandidateKey_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleAttribute_3007 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.SingleAttribute_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeAttribute_3004 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.CompositeAttribute_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleAttribute_3013 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.SingleAttribute_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleAttribute_3009 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.SingleAttribute_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeAttribute_3010 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.CompositeAttribute_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EnumeratedLiteral_3011 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.EnumeratedLiteral_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AggregationParticipant_4002 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.AggregationParticipant_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Participant_4001 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.Participant_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GeneralizationRelationship_4005 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.GeneralizationRelationship_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SpecializationRelationship_4007 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.SpecializationRelationship_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Inclusion_4008 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.Inclusion_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exclusion_4009 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.Exclusion_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exclusive_4010 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.Exclusive_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Inclusiveness_4011 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.Inclusiveness_4011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return EERmodelDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Project_1000, EERPackage.eINSTANCE.getProject());

			elements.put(WeakEntity_2009, EERPackage.eINSTANCE.getWeakEntity());

			elements.put(Entity_2003, EERPackage.eINSTANCE.getEntity());

			elements.put(Relationship_2007,
					EERPackage.eINSTANCE.getRelationship());

			elements.put(DependencyRelationship_2010,
					EERPackage.eINSTANCE.getDependencyRelationship());

			elements.put(Generalization_2011,
					EERPackage.eINSTANCE.getGeneralization());

			elements.put(PrimitiveType_2015,
					EERPackage.eINSTANCE.getPrimitiveType());

			elements.put(EnumerationType_2016,
					EERPackage.eINSTANCE.getEnumerationType());

			elements.put(Aggregation_2017,
					EERPackage.eINSTANCE.getAggregation());

			elements.put(CandidateKey_3005,
					EERPackage.eINSTANCE.getCandidateKey());

			elements.put(SingleAttribute_3001,
					EERPackage.eINSTANCE.getSingleAttribute());

			elements.put(CompositeAttribute_3002,
					EERPackage.eINSTANCE.getCompositeAttribute());

			elements.put(SingleAttribute_3012,
					EERPackage.eINSTANCE.getSingleAttribute());

			elements.put(CandidateKey_3008,
					EERPackage.eINSTANCE.getCandidateKey());

			elements.put(SingleAttribute_3007,
					EERPackage.eINSTANCE.getSingleAttribute());

			elements.put(CompositeAttribute_3004,
					EERPackage.eINSTANCE.getCompositeAttribute());

			elements.put(SingleAttribute_3013,
					EERPackage.eINSTANCE.getSingleAttribute());

			elements.put(SingleAttribute_3009,
					EERPackage.eINSTANCE.getSingleAttribute());

			elements.put(CompositeAttribute_3010,
					EERPackage.eINSTANCE.getCompositeAttribute());

			elements.put(EnumeratedLiteral_3011,
					EERPackage.eINSTANCE.getEnumeratedLiteral());

			elements.put(AggregationParticipant_4002,
					EERPackage.eINSTANCE.getAggregationParticipant());

			elements.put(Participant_4001,
					EERPackage.eINSTANCE.getParticipant());

			elements.put(GeneralizationRelationship_4005,
					EERPackage.eINSTANCE.getGeneralizationRelationship());

			elements.put(SpecializationRelationship_4007,
					EERPackage.eINSTANCE.getSpecializationRelationship());

			elements.put(Inclusion_4008, EERPackage.eINSTANCE.getInclusion());

			elements.put(Exclusion_4009, EERPackage.eINSTANCE.getExclusion());

			elements.put(Exclusive_4010, EERPackage.eINSTANCE.getExclusive());

			elements.put(Inclusiveness_4011,
					EERPackage.eINSTANCE.getInclusiveness());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Project_1000);
			KNOWN_ELEMENT_TYPES.add(WeakEntity_2009);
			KNOWN_ELEMENT_TYPES.add(Entity_2003);
			KNOWN_ELEMENT_TYPES.add(Relationship_2007);
			KNOWN_ELEMENT_TYPES.add(DependencyRelationship_2010);
			KNOWN_ELEMENT_TYPES.add(Generalization_2011);
			KNOWN_ELEMENT_TYPES.add(PrimitiveType_2015);
			KNOWN_ELEMENT_TYPES.add(EnumerationType_2016);
			KNOWN_ELEMENT_TYPES.add(Aggregation_2017);
			KNOWN_ELEMENT_TYPES.add(CandidateKey_3005);
			KNOWN_ELEMENT_TYPES.add(SingleAttribute_3001);
			KNOWN_ELEMENT_TYPES.add(CompositeAttribute_3002);
			KNOWN_ELEMENT_TYPES.add(SingleAttribute_3012);
			KNOWN_ELEMENT_TYPES.add(CandidateKey_3008);
			KNOWN_ELEMENT_TYPES.add(SingleAttribute_3007);
			KNOWN_ELEMENT_TYPES.add(CompositeAttribute_3004);
			KNOWN_ELEMENT_TYPES.add(SingleAttribute_3013);
			KNOWN_ELEMENT_TYPES.add(SingleAttribute_3009);
			KNOWN_ELEMENT_TYPES.add(CompositeAttribute_3010);
			KNOWN_ELEMENT_TYPES.add(EnumeratedLiteral_3011);
			KNOWN_ELEMENT_TYPES.add(AggregationParticipant_4002);
			KNOWN_ELEMENT_TYPES.add(Participant_4001);
			KNOWN_ELEMENT_TYPES.add(GeneralizationRelationship_4005);
			KNOWN_ELEMENT_TYPES.add(SpecializationRelationship_4007);
			KNOWN_ELEMENT_TYPES.add(Inclusion_4008);
			KNOWN_ELEMENT_TYPES.add(Exclusion_4009);
			KNOWN_ELEMENT_TYPES.add(Exclusive_4010);
			KNOWN_ELEMENT_TYPES.add(Inclusiveness_4011);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ProjectEditPart.VISUAL_ID:
			return Project_1000;
		case WeakEntityEditPart.VISUAL_ID:
			return WeakEntity_2009;
		case EntityEditPart.VISUAL_ID:
			return Entity_2003;
		case RelationshipEditPart.VISUAL_ID:
			return Relationship_2007;
		case DependencyRelationshipEditPart.VISUAL_ID:
			return DependencyRelationship_2010;
		case GeneralizationEditPart.VISUAL_ID:
			return Generalization_2011;
		case PrimitiveTypeEditPart.VISUAL_ID:
			return PrimitiveType_2015;
		case EnumerationTypeEditPart.VISUAL_ID:
			return EnumerationType_2016;
		case AggregationEditPart.VISUAL_ID:
			return Aggregation_2017;
		case CandidateKeyEditPart.VISUAL_ID:
			return CandidateKey_3005;
		case SingleAttributeEditPart.VISUAL_ID:
			return SingleAttribute_3001;
		case CompositeAttributeEditPart.VISUAL_ID:
			return CompositeAttribute_3002;
		case SingleAttribute4EditPart.VISUAL_ID:
			return SingleAttribute_3012;
		case CandidateKey2EditPart.VISUAL_ID:
			return CandidateKey_3008;
		case SingleAttribute2EditPart.VISUAL_ID:
			return SingleAttribute_3007;
		case CompositeAttribute2EditPart.VISUAL_ID:
			return CompositeAttribute_3004;
		case SingleAttribute5EditPart.VISUAL_ID:
			return SingleAttribute_3013;
		case SingleAttribute3EditPart.VISUAL_ID:
			return SingleAttribute_3009;
		case CompositeAttribute3EditPart.VISUAL_ID:
			return CompositeAttribute_3010;
		case EnumeratedLiteralEditPart.VISUAL_ID:
			return EnumeratedLiteral_3011;
		case AggregationParticipantEditPart.VISUAL_ID:
			return AggregationParticipant_4002;
		case ParticipantEditPart.VISUAL_ID:
			return Participant_4001;
		case GeneralizationRelationshipEditPart.VISUAL_ID:
			return GeneralizationRelationship_4005;
		case SpecializationRelationshipEditPart.VISUAL_ID:
			return SpecializationRelationship_4007;
		case InclusionEditPart.VISUAL_ID:
			return Inclusion_4008;
		case ExclusionEditPart.VISUAL_ID:
			return Exclusion_4009;
		case ExclusiveEditPart.VISUAL_ID:
			return Exclusive_4010;
		case InclusivenessEditPart.VISUAL_ID:
			return Inclusiveness_4011;
		}
		return null;
	}

}
