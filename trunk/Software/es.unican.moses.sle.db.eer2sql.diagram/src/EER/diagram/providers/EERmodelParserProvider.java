package EER.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import EER.EERPackage;
import EER.diagram.edit.parts.CandidateKey2EditPart;
import EER.diagram.edit.parts.CandidateKeyEditPart;
import EER.diagram.edit.parts.CompositeAttribute3EditPart;
import EER.diagram.edit.parts.CompositeAttributeName2EditPart;
import EER.diagram.edit.parts.CompositeAttributeNameEditPart;
import EER.diagram.edit.parts.DependencyRelationshipNameEditPart;
import EER.diagram.edit.parts.DependencyRelationshipTypeEditPart;
import EER.diagram.edit.parts.EntityNameEditPart;
import EER.diagram.edit.parts.EnumeratedLiteralEditPart;
import EER.diagram.edit.parts.EnumerationTypeNameEditPart;
import EER.diagram.edit.parts.InclusivenessLowerBoundUpperBoundEditPart;
import EER.diagram.edit.parts.ParticipantRole2EditPart;
import EER.diagram.edit.parts.ParticipantRoleEditPart;
import EER.diagram.edit.parts.PrimitiveTypeNameEditPart;
import EER.diagram.edit.parts.RelationshipNameEditPart;
import EER.diagram.edit.parts.SingleAttribute2EditPart;
import EER.diagram.edit.parts.SingleAttribute3EditPart;
import EER.diagram.edit.parts.SingleAttributeEditPart;
import EER.diagram.edit.parts.WeakEntityNameEditPart;
import EER.diagram.parsers.MessageFormatParser;
import EER.diagram.part.EERmodelVisualIDRegistry;

/**
 * @generated
 */
public class EERmodelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser weakEntityName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getWeakEntityName_5009Parser() {
		if (weakEntityName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getAttributedNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			weakEntityName_5009Parser = parser;
		}
		return weakEntityName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser entityName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getEntityName_5003Parser() {
		if (entityName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getAttributedNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entityName_5003Parser = parser;
		}
		return entityName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser relationshipName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getRelationshipName_5007Parser() {
		if (relationshipName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getAttributedNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			relationshipName_5007Parser = parser;
		}
		return relationshipName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser dependencyRelationshipType_5010Parser;

	/**
	 * @generated
	 */
	private IParser getDependencyRelationshipType_5010Parser() {
		if (dependencyRelationshipType_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getDependencyRelationship_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dependencyRelationshipType_5010Parser = parser;
		}
		return dependencyRelationshipType_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser dependencyRelationshipName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getDependencyRelationshipName_5014Parser() {
		if (dependencyRelationshipName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getAttributedNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dependencyRelationshipName_5014Parser = parser;
		}
		return dependencyRelationshipName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser primitiveTypeName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getPrimitiveTypeName_5015Parser() {
		if (primitiveTypeName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getDomain_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("<<{0}>>"); //$NON-NLS-1$
			parser.setEditorPattern("<<{0}>>"); //$NON-NLS-1$
			parser.setEditPattern("<<{0}>>"); //$NON-NLS-1$
			primitiveTypeName_5015Parser = parser;
		}
		return primitiveTypeName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser enumerationTypeName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getEnumerationTypeName_5016Parser() {
		if (enumerationTypeName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getDomain_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("<<{0}>>"); //$NON-NLS-1$
			parser.setEditorPattern("<<{0}>>"); //$NON-NLS-1$
			parser.setEditPattern("<<{0}>>"); //$NON-NLS-1$
			enumerationTypeName_5016Parser = parser;
		}
		return enumerationTypeName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser candidateKey_3005Parser;

	/**
	 * @generated
	 */
	private IParser getCandidateKey_3005Parser() {
		if (candidateKey_3005Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getCandidateKey_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			candidateKey_3005Parser = parser;
		}
		return candidateKey_3005Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleAttribute_3001Parser;

	/**
	 * @generated
	 */
	private IParser getSingleAttribute_3001Parser() {
		if (singleAttribute_3001Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			singleAttribute_3001Parser = parser;
		}
		return singleAttribute_3001Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeAttributeName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeAttributeName_5012Parser() {
		if (compositeAttributeName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeAttributeName_5012Parser = parser;
		}
		return compositeAttributeName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser candidateKey_3008Parser;

	/**
	 * @generated
	 */
	private IParser getCandidateKey_3008Parser() {
		if (candidateKey_3008Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getCandidateKey_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			candidateKey_3008Parser = parser;
		}
		return candidateKey_3008Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleAttribute_3007Parser;

	/**
	 * @generated
	 */
	private IParser getSingleAttribute_3007Parser() {
		if (singleAttribute_3007Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			singleAttribute_3007Parser = parser;
		}
		return singleAttribute_3007Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeAttributeName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeAttributeName_5013Parser() {
		if (compositeAttributeName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeAttributeName_5013Parser = parser;
		}
		return compositeAttributeName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleAttribute_3009Parser;

	/**
	 * @generated
	 */
	private IParser getSingleAttribute_3009Parser() {
		if (singleAttribute_3009Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			singleAttribute_3009Parser = parser;
		}
		return singleAttribute_3009Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeAttribute_3010Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeAttribute_3010Parser() {
		if (compositeAttribute_3010Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeAttribute_3010Parser = parser;
		}
		return compositeAttribute_3010Parser;
	}

	/**
	 * @generated
	 */
	private IParser enumeratedLiteral_3011Parser;

	/**
	 * @generated
	 */
	private IParser getEnumeratedLiteral_3011Parser() {
		if (enumeratedLiteral_3011Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getEnumeratedLiteral_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- {0}"); //$NON-NLS-1$
			parser.setEditPattern("- {0}"); //$NON-NLS-1$
			enumeratedLiteral_3011Parser = parser;
		}
		return enumeratedLiteral_3011Parser;
	}

	/**
	 * @generated
	 */
	private IParser participantRole_6001Parser;

	/**
	 * @generated
	 */
	private IParser getParticipantRole_6001Parser() {
		if (participantRole_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getAbstractParticipant_Role() };
			MessageFormatParser parser = new MessageFormatParser(features);
			participantRole_6001Parser = parser;
		}
		return participantRole_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser participantLowerBoundUpperBound_6002Parser;

	/**
	 * @generated
	 */
	private IParser getParticipantLowerBoundUpperBound_6002Parser() {
		if (participantLowerBoundUpperBound_6002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					EERPackage.eINSTANCE.getAbstractParticipant_LowerBound(),
					EERPackage.eINSTANCE.getAbstractParticipant_UpperBound() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0,choice,-1#N| 0#{0}}..{1,choice,-1#N| 0#{1}}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}..{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}..{1}"); //$NON-NLS-1$
			participantLowerBoundUpperBound_6002Parser = parser;
		}
		return participantLowerBoundUpperBound_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser inclusivenessLowerBoundUpperBound_6003Parser;

	/**
	 * @generated
	 */
	private IParser getInclusivenessLowerBoundUpperBound_6003Parser() {
		if (inclusivenessLowerBoundUpperBound_6003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					EERPackage.eINSTANCE.getInclusiveness_LowerBound(),
					EERPackage.eINSTANCE.getInclusiveness_UpperBound() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0,choice,-1#N| 0#{0}}..{1,choice,-1#N| 0#{1}}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}..{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}..{1}"); //$NON-NLS-1$
			inclusivenessLowerBoundUpperBound_6003Parser = parser;
		}
		return inclusivenessLowerBoundUpperBound_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WeakEntityNameEditPart.VISUAL_ID:
			return getWeakEntityName_5009Parser();
		case EntityNameEditPart.VISUAL_ID:
			return getEntityName_5003Parser();
		case RelationshipNameEditPart.VISUAL_ID:
			return getRelationshipName_5007Parser();
		case DependencyRelationshipTypeEditPart.VISUAL_ID:
			return getDependencyRelationshipType_5010Parser();
		case DependencyRelationshipNameEditPart.VISUAL_ID:
			return getDependencyRelationshipName_5014Parser();
		case PrimitiveTypeNameEditPart.VISUAL_ID:
			return getPrimitiveTypeName_5015Parser();
		case EnumerationTypeNameEditPart.VISUAL_ID:
			return getEnumerationTypeName_5016Parser();
		case CandidateKeyEditPart.VISUAL_ID:
			return getCandidateKey_3005Parser();
		case SingleAttributeEditPart.VISUAL_ID:
			return getSingleAttribute_3001Parser();
		case CompositeAttributeNameEditPart.VISUAL_ID:
			return getCompositeAttributeName_5012Parser();
		case CandidateKey2EditPart.VISUAL_ID:
			return getCandidateKey_3008Parser();
		case SingleAttribute2EditPart.VISUAL_ID:
			return getSingleAttribute_3007Parser();
		case CompositeAttributeName2EditPart.VISUAL_ID:
			return getCompositeAttributeName_5013Parser();
		case SingleAttribute3EditPart.VISUAL_ID:
			return getSingleAttribute_3009Parser();
		case CompositeAttribute3EditPart.VISUAL_ID:
			return getCompositeAttribute_3010Parser();
		case EnumeratedLiteralEditPart.VISUAL_ID:
			return getEnumeratedLiteral_3011Parser();
		case ParticipantRoleEditPart.VISUAL_ID:
			return getParticipantRole_6001Parser();
		case ParticipantRole2EditPart.VISUAL_ID:
			return getParticipantLowerBoundUpperBound_6002Parser();
		case InclusivenessLowerBoundUpperBoundEditPart.VISUAL_ID:
			return getInclusivenessLowerBoundUpperBound_6003Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(EERmodelVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(EERmodelVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (EERmodelElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
