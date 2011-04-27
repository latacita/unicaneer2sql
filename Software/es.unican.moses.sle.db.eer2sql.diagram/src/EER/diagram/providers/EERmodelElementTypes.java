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
	public static final IElementType Entity_2003 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.Entity_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WeakEntity_2009 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.WeakEntity_2009"); //$NON-NLS-1$
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
	public static final IElementType CompositeComponent_2013 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.CompositeComponent_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MemberCollection_2014 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.MemberCollection_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Participant_4001 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.Participant_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AggregationParticipant_4002 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.AggregationParticipant_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AggregationParticipant_4003 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.AggregationParticipant_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SpecializationRelationship_4004 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.SpecializationRelationship_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GeneralizationRelationship_4005 = getElementType("es.unican.moses.sle.db.eer2sql.diagram.GeneralizationRelationship_4005"); //$NON-NLS-1$

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

			elements.put(Entity_2003, EERPackage.eINSTANCE.getEntity());

			elements.put(WeakEntity_2009, EERPackage.eINSTANCE.getWeakEntity());

			elements.put(Relationship_2007,
					EERPackage.eINSTANCE.getRelationship());

			elements.put(DependencyRelationship_2010,
					EERPackage.eINSTANCE.getDependencyRelationship());

			elements.put(Generalization_2011,
					EERPackage.eINSTANCE.getGeneralization());

			elements.put(CompositeComponent_2013,
					EERPackage.eINSTANCE.getCompositeComponent());

			elements.put(MemberCollection_2014,
					EERPackage.eINSTANCE.getMemberCollection());

			elements.put(Participant_4001,
					EERPackage.eINSTANCE.getParticipant());

			elements.put(AggregationParticipant_4002,
					EERPackage.eINSTANCE.getAggregationParticipant());

			elements.put(AggregationParticipant_4003,
					EERPackage.eINSTANCE.getAggregationParticipant());

			elements.put(SpecializationRelationship_4004,
					EERPackage.eINSTANCE.getSpecializationRelationship());

			elements.put(GeneralizationRelationship_4005,
					EERPackage.eINSTANCE.getGeneralizationRelationship());
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
			KNOWN_ELEMENT_TYPES.add(Entity_2003);
			KNOWN_ELEMENT_TYPES.add(WeakEntity_2009);
			KNOWN_ELEMENT_TYPES.add(Relationship_2007);
			KNOWN_ELEMENT_TYPES.add(DependencyRelationship_2010);
			KNOWN_ELEMENT_TYPES.add(Generalization_2011);
			KNOWN_ELEMENT_TYPES.add(CompositeComponent_2013);
			KNOWN_ELEMENT_TYPES.add(MemberCollection_2014);
			KNOWN_ELEMENT_TYPES.add(Participant_4001);
			KNOWN_ELEMENT_TYPES.add(AggregationParticipant_4002);
			KNOWN_ELEMENT_TYPES.add(AggregationParticipant_4003);
			KNOWN_ELEMENT_TYPES.add(SpecializationRelationship_4004);
			KNOWN_ELEMENT_TYPES.add(GeneralizationRelationship_4005);
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
		case EntityEditPart.VISUAL_ID:
			return Entity_2003;
		case WeakEntityEditPart.VISUAL_ID:
			return WeakEntity_2009;
		case RelationshipEditPart.VISUAL_ID:
			return Relationship_2007;
		case DependencyRelationshipEditPart.VISUAL_ID:
			return DependencyRelationship_2010;
		case GeneralizationEditPart.VISUAL_ID:
			return Generalization_2011;
		case CompositeComponentEditPart.VISUAL_ID:
			return CompositeComponent_2013;
		case MemberCollectionEditPart.VISUAL_ID:
			return MemberCollection_2014;
		case ParticipantEditPart.VISUAL_ID:
			return Participant_4001;
		case AggregationParticipantEditPart.VISUAL_ID:
			return AggregationParticipant_4002;
		case AggregationParticipant2EditPart.VISUAL_ID:
			return AggregationParticipant_4003;
		case SpecializationRelationshipEditPart.VISUAL_ID:
			return SpecializationRelationship_4004;
		case GeneralizationRelationshipEditPart.VISUAL_ID:
			return GeneralizationRelationship_4005;
		}
		return null;
	}

}
