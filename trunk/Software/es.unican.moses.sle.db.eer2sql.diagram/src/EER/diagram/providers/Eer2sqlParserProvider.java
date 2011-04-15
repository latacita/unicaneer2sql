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
import EER.diagram.edit.parts.CompositeComponentNameEditPart;
import EER.diagram.edit.parts.DependencyRelationshipNameEditPart;
import EER.diagram.edit.parts.EnumerationTypeNameEditPart;
import EER.diagram.edit.parts.GeneralizationNameEditPart;
import EER.diagram.edit.parts.MemberCollectionNameEditPart;
import EER.diagram.edit.parts.PrimitiveTypeNameEditPart;
import EER.diagram.edit.parts.RelationshipNameEditPart;
import EER.diagram.edit.parts.WeakEntityNameEditPart;
import EER.diagram.parsers.MessageFormatParser;
import EER.diagram.part.Eer2sqlVisualIDRegistry;

/**
 * @generated
 */
public class Eer2sqlParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser weakEntityName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getWeakEntityName_5001Parser() {
		if (weakEntityName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getAttributedNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			weakEntityName_5001Parser = parser;
		}
		return weakEntityName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser enumerationTypeName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getEnumerationTypeName_5002Parser() {
		if (enumerationTypeName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getDomain_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enumerationTypeName_5002Parser = parser;
		}
		return enumerationTypeName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser generalizationName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getGeneralizationName_5003Parser() {
		if (generalizationName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getAttributedNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			generalizationName_5003Parser = parser;
		}
		return generalizationName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser memberCollectionName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getMemberCollectionName_5004Parser() {
		if (memberCollectionName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getAttributedNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			memberCollectionName_5004Parser = parser;
		}
		return memberCollectionName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser primitiveTypeName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getPrimitiveTypeName_5005Parser() {
		if (primitiveTypeName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getDomain_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			primitiveTypeName_5005Parser = parser;
		}
		return primitiveTypeName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeComponentName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeComponentName_5006Parser() {
		if (compositeComponentName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getAttributedNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeComponentName_5006Parser = parser;
		}
		return compositeComponentName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser dependencyRelationshipName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getDependencyRelationshipName_5007Parser() {
		if (dependencyRelationshipName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getAttributedNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dependencyRelationshipName_5007Parser = parser;
		}
		return dependencyRelationshipName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser relationshipName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getRelationshipName_5008Parser() {
		if (relationshipName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { EERPackage.eINSTANCE
					.getAttributedNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			relationshipName_5008Parser = parser;
		}
		return relationshipName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WeakEntityNameEditPart.VISUAL_ID:
			return getWeakEntityName_5001Parser();
		case EnumerationTypeNameEditPart.VISUAL_ID:
			return getEnumerationTypeName_5002Parser();
		case GeneralizationNameEditPart.VISUAL_ID:
			return getGeneralizationName_5003Parser();
		case MemberCollectionNameEditPart.VISUAL_ID:
			return getMemberCollectionName_5004Parser();
		case PrimitiveTypeNameEditPart.VISUAL_ID:
			return getPrimitiveTypeName_5005Parser();
		case CompositeComponentNameEditPart.VISUAL_ID:
			return getCompositeComponentName_5006Parser();
		case DependencyRelationshipNameEditPart.VISUAL_ID:
			return getDependencyRelationshipName_5007Parser();
		case RelationshipNameEditPart.VISUAL_ID:
			return getRelationshipName_5008Parser();
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
			return getParser(Eer2sqlVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(Eer2sqlVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (Eer2sqlElementTypes.getElement(hint) == null) {
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
