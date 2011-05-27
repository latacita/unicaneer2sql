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
import EER.diagram.edit.parts.DependencyRelationshipNameEditPart;
import EER.diagram.edit.parts.EntityNameEditPart;
import EER.diagram.edit.parts.GeneralizationNameEditPart;
import EER.diagram.edit.parts.ParticipantRoleEditPart;
import EER.diagram.edit.parts.RelationshipNameEditPart;
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
	private IParser dependencyRelationshipName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getDependencyRelationshipName_5010Parser() {
		if (dependencyRelationshipName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getAttributedNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dependencyRelationshipName_5010Parser = parser;
		}
		return dependencyRelationshipName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser generalizationName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getGeneralizationName_5011Parser() {
		if (generalizationName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getAttributedNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			generalizationName_5011Parser = parser;
		}
		return generalizationName_5011Parser;
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
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case EntityNameEditPart.VISUAL_ID:
			return getEntityName_5003Parser();
		case WeakEntityNameEditPart.VISUAL_ID:
			return getWeakEntityName_5009Parser();
		case RelationshipNameEditPart.VISUAL_ID:
			return getRelationshipName_5007Parser();
		case DependencyRelationshipNameEditPart.VISUAL_ID:
			return getDependencyRelationshipName_5010Parser();
		case GeneralizationNameEditPart.VISUAL_ID:
			return getGeneralizationName_5011Parser();
		case ParticipantRoleEditPart.VISUAL_ID:
			return getParticipantRole_6001Parser();
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