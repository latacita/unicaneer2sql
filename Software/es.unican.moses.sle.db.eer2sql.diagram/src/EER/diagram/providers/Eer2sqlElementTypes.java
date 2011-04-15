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
import EER.diagram.edit.parts.AggregationParticipantEditPart;
import EER.diagram.edit.parts.AggregationSourceEditPart;
import EER.diagram.edit.parts.CandidateKeyEditPart;
import EER.diagram.edit.parts.CompositeAttributeEditPart;
import EER.diagram.edit.parts.CompositeComponentEditPart;
import EER.diagram.edit.parts.DependencyRelationship2EditPart;
import EER.diagram.edit.parts.DependencyRelationshipEditPart;
import EER.diagram.edit.parts.EntityPrimaryKeyEditPart;
import EER.diagram.edit.parts.EnumeratedLiteralEditPart;
import EER.diagram.edit.parts.EnumerationTypeEditPart;
import EER.diagram.edit.parts.ExclusionEditPart;
import EER.diagram.edit.parts.GeneralizationChildsEditPart;
import EER.diagram.edit.parts.GeneralizationEditPart;
import EER.diagram.edit.parts.GeneralizationParentEditPart;
import EER.diagram.edit.parts.GeneralizationRelationshipEditPart;
import EER.diagram.edit.parts.InclusionEditPart;
import EER.diagram.edit.parts.MemberCollectionEditPart;
import EER.diagram.edit.parts.ParticipantEditPart;
import EER.diagram.edit.parts.PrimitiveTypeEditPart;
import EER.diagram.edit.parts.ProjectEditPart;
import EER.diagram.edit.parts.RelationshipEditPart;
import EER.diagram.edit.parts.SingleAttributeEditPart;
import EER.diagram.edit.parts.SpecializationRelationshipEditPart;
import EER.diagram.edit.parts.WeakEntityEditPart;
import EER.diagram.part.Eer2sqlDiagramEditorPlugin;

/**
 * @generated
 */
public class Eer2sqlElementTypes {

	/**
	 * @generated
	 */
	private Eer2sqlElementTypes() {
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
	public static final IElementType WeakEntity_2001 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.WeakEntity_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EnumerationType_2002 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.EnumerationType_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Generalization_2003 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.Generalization_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MemberCollection_2004 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.MemberCollection_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PrimitiveType_2005 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.PrimitiveType_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeComponent_2006 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.CompositeComponent_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DependencyRelationship_2007 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.DependencyRelationship_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relationship_2008 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.Relationship_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GeneralizationRelationship_4001 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.GeneralizationRelationship_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exclusion_4002 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.Exclusion_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CandidateKey_4003 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.CandidateKey_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleAttribute_4004 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.SingleAttribute_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SpecializationRelationship_4005 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.SpecializationRelationship_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DependencyRelationship_4006 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.DependencyRelationship_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeAttribute_4007 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.CompositeAttribute_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Participant_4008 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.Participant_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AggregationParticipant_4009 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.AggregationParticipant_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EnumeratedLiteral_4010 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.EnumeratedLiteral_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Inclusion_4011 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.Inclusion_4011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GeneralizationParent_4012 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.GeneralizationParent_4012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AggregationSource_4013 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.AggregationSource_4013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntityPrimaryKey_4014 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.EntityPrimaryKey_4014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GeneralizationChilds_4015 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.GeneralizationChilds_4015"); //$NON-NLS-1$

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
				return Eer2sqlDiagramEditorPlugin.getInstance()
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

			elements.put(WeakEntity_2001, EERPackage.eINSTANCE.getWeakEntity());

			elements.put(EnumerationType_2002,
					EERPackage.eINSTANCE.getEnumerationType());

			elements.put(Generalization_2003,
					EERPackage.eINSTANCE.getGeneralization());

			elements.put(MemberCollection_2004,
					EERPackage.eINSTANCE.getMemberCollection());

			elements.put(PrimitiveType_2005,
					EERPackage.eINSTANCE.getPrimitiveType());

			elements.put(CompositeComponent_2006,
					EERPackage.eINSTANCE.getCompositeComponent());

			elements.put(DependencyRelationship_2007,
					EERPackage.eINSTANCE.getDependencyRelationship());

			elements.put(Relationship_2008,
					EERPackage.eINSTANCE.getRelationship());

			elements.put(GeneralizationRelationship_4001,
					EERPackage.eINSTANCE.getGeneralizationRelationship());

			elements.put(Exclusion_4002, EERPackage.eINSTANCE.getExclusion());

			elements.put(CandidateKey_4003,
					EERPackage.eINSTANCE.getCandidateKey());

			elements.put(SingleAttribute_4004,
					EERPackage.eINSTANCE.getSingleAttribute());

			elements.put(SpecializationRelationship_4005,
					EERPackage.eINSTANCE.getSpecializationRelationship());

			elements.put(DependencyRelationship_4006,
					EERPackage.eINSTANCE.getDependencyRelationship());

			elements.put(CompositeAttribute_4007,
					EERPackage.eINSTANCE.getCompositeAttribute());

			elements.put(Participant_4008,
					EERPackage.eINSTANCE.getParticipant());

			elements.put(AggregationParticipant_4009,
					EERPackage.eINSTANCE.getAggregationParticipant());

			elements.put(EnumeratedLiteral_4010,
					EERPackage.eINSTANCE.getEnumeratedLiteral());

			elements.put(Inclusion_4011, EERPackage.eINSTANCE.getInclusion());

			elements.put(GeneralizationParent_4012,
					EERPackage.eINSTANCE.getGeneralization_Parent());

			elements.put(AggregationSource_4013,
					EERPackage.eINSTANCE.getAggregation_Source());

			elements.put(EntityPrimaryKey_4014,
					EERPackage.eINSTANCE.getEntity_PrimaryKey());

			elements.put(GeneralizationChilds_4015,
					EERPackage.eINSTANCE.getGeneralization_Childs());
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
			KNOWN_ELEMENT_TYPES.add(WeakEntity_2001);
			KNOWN_ELEMENT_TYPES.add(EnumerationType_2002);
			KNOWN_ELEMENT_TYPES.add(Generalization_2003);
			KNOWN_ELEMENT_TYPES.add(MemberCollection_2004);
			KNOWN_ELEMENT_TYPES.add(PrimitiveType_2005);
			KNOWN_ELEMENT_TYPES.add(CompositeComponent_2006);
			KNOWN_ELEMENT_TYPES.add(DependencyRelationship_2007);
			KNOWN_ELEMENT_TYPES.add(Relationship_2008);
			KNOWN_ELEMENT_TYPES.add(GeneralizationRelationship_4001);
			KNOWN_ELEMENT_TYPES.add(Exclusion_4002);
			KNOWN_ELEMENT_TYPES.add(CandidateKey_4003);
			KNOWN_ELEMENT_TYPES.add(SingleAttribute_4004);
			KNOWN_ELEMENT_TYPES.add(SpecializationRelationship_4005);
			KNOWN_ELEMENT_TYPES.add(DependencyRelationship_4006);
			KNOWN_ELEMENT_TYPES.add(CompositeAttribute_4007);
			KNOWN_ELEMENT_TYPES.add(Participant_4008);
			KNOWN_ELEMENT_TYPES.add(AggregationParticipant_4009);
			KNOWN_ELEMENT_TYPES.add(EnumeratedLiteral_4010);
			KNOWN_ELEMENT_TYPES.add(Inclusion_4011);
			KNOWN_ELEMENT_TYPES.add(GeneralizationParent_4012);
			KNOWN_ELEMENT_TYPES.add(AggregationSource_4013);
			KNOWN_ELEMENT_TYPES.add(EntityPrimaryKey_4014);
			KNOWN_ELEMENT_TYPES.add(GeneralizationChilds_4015);
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
			return WeakEntity_2001;
		case EnumerationTypeEditPart.VISUAL_ID:
			return EnumerationType_2002;
		case GeneralizationEditPart.VISUAL_ID:
			return Generalization_2003;
		case MemberCollectionEditPart.VISUAL_ID:
			return MemberCollection_2004;
		case PrimitiveTypeEditPart.VISUAL_ID:
			return PrimitiveType_2005;
		case CompositeComponentEditPart.VISUAL_ID:
			return CompositeComponent_2006;
		case DependencyRelationshipEditPart.VISUAL_ID:
			return DependencyRelationship_2007;
		case RelationshipEditPart.VISUAL_ID:
			return Relationship_2008;
		case GeneralizationRelationshipEditPart.VISUAL_ID:
			return GeneralizationRelationship_4001;
		case ExclusionEditPart.VISUAL_ID:
			return Exclusion_4002;
		case CandidateKeyEditPart.VISUAL_ID:
			return CandidateKey_4003;
		case SingleAttributeEditPart.VISUAL_ID:
			return SingleAttribute_4004;
		case SpecializationRelationshipEditPart.VISUAL_ID:
			return SpecializationRelationship_4005;
		case DependencyRelationship2EditPart.VISUAL_ID:
			return DependencyRelationship_4006;
		case CompositeAttributeEditPart.VISUAL_ID:
			return CompositeAttribute_4007;
		case ParticipantEditPart.VISUAL_ID:
			return Participant_4008;
		case AggregationParticipantEditPart.VISUAL_ID:
			return AggregationParticipant_4009;
		case EnumeratedLiteralEditPart.VISUAL_ID:
			return EnumeratedLiteral_4010;
		case InclusionEditPart.VISUAL_ID:
			return Inclusion_4011;
		case GeneralizationParentEditPart.VISUAL_ID:
			return GeneralizationParent_4012;
		case AggregationSourceEditPart.VISUAL_ID:
			return AggregationSource_4013;
		case EntityPrimaryKeyEditPart.VISUAL_ID:
			return EntityPrimaryKey_4014;
		case GeneralizationChildsEditPart.VISUAL_ID:
			return GeneralizationChilds_4015;
		}
		return null;
	}

}
