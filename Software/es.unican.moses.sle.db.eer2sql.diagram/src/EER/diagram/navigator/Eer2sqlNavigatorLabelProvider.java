package EER.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import EER.AggregationParticipant;
import EER.CandidateKey;
import EER.CompositeAttribute;
import EER.DependencyRelationship;
import EER.EnumeratedLiteral;
import EER.Exclusion;
import EER.Inclusion;
import EER.Participant;
import EER.Project;
import EER.SingleAttribute;
import EER.diagram.edit.parts.AggregationParticipantEditPart;
import EER.diagram.edit.parts.AggregationSourceEditPart;
import EER.diagram.edit.parts.CandidateKeyEditPart;
import EER.diagram.edit.parts.CompositeAttributeEditPart;
import EER.diagram.edit.parts.CompositeComponentEditPart;
import EER.diagram.edit.parts.CompositeComponentNameEditPart;
import EER.diagram.edit.parts.DependencyRelationship2EditPart;
import EER.diagram.edit.parts.DependencyRelationshipEditPart;
import EER.diagram.edit.parts.DependencyRelationshipNameEditPart;
import EER.diagram.edit.parts.EntityPrimaryKeyEditPart;
import EER.diagram.edit.parts.EnumeratedLiteralEditPart;
import EER.diagram.edit.parts.EnumerationTypeEditPart;
import EER.diagram.edit.parts.EnumerationTypeNameEditPart;
import EER.diagram.edit.parts.ExclusionEditPart;
import EER.diagram.edit.parts.GeneralizationChildsEditPart;
import EER.diagram.edit.parts.GeneralizationEditPart;
import EER.diagram.edit.parts.GeneralizationNameEditPart;
import EER.diagram.edit.parts.GeneralizationParentEditPart;
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
import EER.diagram.part.Eer2sqlDiagramEditorPlugin;
import EER.diagram.part.Eer2sqlVisualIDRegistry;
import EER.diagram.providers.Eer2sqlElementTypes;
import EER.diagram.providers.Eer2sqlParserProvider;

/**
 * @generated
 */
public class Eer2sqlNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		Eer2sqlDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		Eer2sqlDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof Eer2sqlNavigatorItem
				&& !isOwnView(((Eer2sqlNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof Eer2sqlNavigatorGroup) {
			Eer2sqlNavigatorGroup group = (Eer2sqlNavigatorGroup) element;
			return Eer2sqlDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof Eer2sqlNavigatorItem) {
			Eer2sqlNavigatorItem navigatorItem = (Eer2sqlNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (Eer2sqlVisualIDRegistry.getVisualID(view)) {
		case AggregationSourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://EER/1.0?Aggregation?source", Eer2sqlElementTypes.AggregationSource_4013); //$NON-NLS-1$
		case ParticipantEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://EER/1.0?Participant", Eer2sqlElementTypes.Participant_4008); //$NON-NLS-1$
		case GeneralizationChildsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://EER/1.0?Generalization?childs", Eer2sqlElementTypes.GeneralizationChilds_4015); //$NON-NLS-1$
		case ExclusionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://EER/1.0?Exclusion", Eer2sqlElementTypes.Exclusion_4002); //$NON-NLS-1$
		case WeakEntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://EER/1.0?WeakEntity", Eer2sqlElementTypes.WeakEntity_2001); //$NON-NLS-1$
		case SpecializationRelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://EER/1.0?SpecializationRelationship", Eer2sqlElementTypes.SpecializationRelationship_4005); //$NON-NLS-1$
		case GeneralizationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://EER/1.0?Generalization", Eer2sqlElementTypes.Generalization_2003); //$NON-NLS-1$
		case DependencyRelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://EER/1.0?DependencyRelationship", Eer2sqlElementTypes.DependencyRelationship_2007); //$NON-NLS-1$
		case InclusionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://EER/1.0?Inclusion", Eer2sqlElementTypes.Inclusion_4011); //$NON-NLS-1$
		case DependencyRelationship2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://EER/1.0?DependencyRelationship", Eer2sqlElementTypes.DependencyRelationship_4006); //$NON-NLS-1$
		case AggregationParticipantEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://EER/1.0?AggregationParticipant", Eer2sqlElementTypes.AggregationParticipant_4009); //$NON-NLS-1$
		case RelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://EER/1.0?Relationship", Eer2sqlElementTypes.Relationship_2008); //$NON-NLS-1$
		case SingleAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://EER/1.0?SingleAttribute", Eer2sqlElementTypes.SingleAttribute_4004); //$NON-NLS-1$
		case MemberCollectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://EER/1.0?MemberCollection", Eer2sqlElementTypes.MemberCollection_2004); //$NON-NLS-1$
		case GeneralizationParentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://EER/1.0?Generalization?parent", Eer2sqlElementTypes.GeneralizationParent_4012); //$NON-NLS-1$
		case CompositeAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://EER/1.0?CompositeAttribute", Eer2sqlElementTypes.CompositeAttribute_4007); //$NON-NLS-1$
		case ProjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://EER/1.0?Project", Eer2sqlElementTypes.Project_1000); //$NON-NLS-1$
		case PrimitiveTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://EER/1.0?PrimitiveType", Eer2sqlElementTypes.PrimitiveType_2005); //$NON-NLS-1$
		case EnumeratedLiteralEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://EER/1.0?EnumeratedLiteral", Eer2sqlElementTypes.EnumeratedLiteral_4010); //$NON-NLS-1$
		case GeneralizationRelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://EER/1.0?GeneralizationRelationship", Eer2sqlElementTypes.GeneralizationRelationship_4001); //$NON-NLS-1$
		case EntityPrimaryKeyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://EER/1.0?Entity?primaryKey", Eer2sqlElementTypes.EntityPrimaryKey_4014); //$NON-NLS-1$
		case CandidateKeyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://EER/1.0?CandidateKey", Eer2sqlElementTypes.CandidateKey_4003); //$NON-NLS-1$
		case EnumerationTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://EER/1.0?EnumerationType", Eer2sqlElementTypes.EnumerationType_2002); //$NON-NLS-1$
		case CompositeComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://EER/1.0?CompositeComponent", Eer2sqlElementTypes.CompositeComponent_2006); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = Eer2sqlDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& Eer2sqlElementTypes.isKnownElementType(elementType)) {
			image = Eer2sqlElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof Eer2sqlNavigatorGroup) {
			Eer2sqlNavigatorGroup group = (Eer2sqlNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof Eer2sqlNavigatorItem) {
			Eer2sqlNavigatorItem navigatorItem = (Eer2sqlNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (Eer2sqlVisualIDRegistry.getVisualID(view)) {
		case AggregationSourceEditPart.VISUAL_ID:
			return getAggregationSource_4013Text(view);
		case ParticipantEditPart.VISUAL_ID:
			return getParticipant_4008Text(view);
		case GeneralizationChildsEditPart.VISUAL_ID:
			return getGeneralizationChilds_4015Text(view);
		case ExclusionEditPart.VISUAL_ID:
			return getExclusion_4002Text(view);
		case WeakEntityEditPart.VISUAL_ID:
			return getWeakEntity_2001Text(view);
		case SpecializationRelationshipEditPart.VISUAL_ID:
			return getSpecializationRelationship_4005Text(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_2003Text(view);
		case DependencyRelationshipEditPart.VISUAL_ID:
			return getDependencyRelationship_2007Text(view);
		case InclusionEditPart.VISUAL_ID:
			return getInclusion_4011Text(view);
		case DependencyRelationship2EditPart.VISUAL_ID:
			return getDependencyRelationship_4006Text(view);
		case AggregationParticipantEditPart.VISUAL_ID:
			return getAggregationParticipant_4009Text(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2008Text(view);
		case SingleAttributeEditPart.VISUAL_ID:
			return getSingleAttribute_4004Text(view);
		case MemberCollectionEditPart.VISUAL_ID:
			return getMemberCollection_2004Text(view);
		case GeneralizationParentEditPart.VISUAL_ID:
			return getGeneralizationParent_4012Text(view);
		case CompositeAttributeEditPart.VISUAL_ID:
			return getCompositeAttribute_4007Text(view);
		case ProjectEditPart.VISUAL_ID:
			return getProject_1000Text(view);
		case PrimitiveTypeEditPart.VISUAL_ID:
			return getPrimitiveType_2005Text(view);
		case EnumeratedLiteralEditPart.VISUAL_ID:
			return getEnumeratedLiteral_4010Text(view);
		case GeneralizationRelationshipEditPart.VISUAL_ID:
			return getGeneralizationRelationship_4001Text(view);
		case EntityPrimaryKeyEditPart.VISUAL_ID:
			return getEntityPrimaryKey_4014Text(view);
		case CandidateKeyEditPart.VISUAL_ID:
			return getCandidateKey_4003Text(view);
		case EnumerationTypeEditPart.VISUAL_ID:
			return getEnumerationType_2002Text(view);
		case CompositeComponentEditPart.VISUAL_ID:
			return getCompositeComponent_2006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getAggregationSource_4013Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getParticipant_4008Text(View view) {
		Participant domainModelElement = (Participant) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getRole();
		} else {
			Eer2sqlDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGeneralizationChilds_4015Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getExclusion_4002Text(View view) {
		Exclusion domainModelElement = (Exclusion) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			Eer2sqlDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWeakEntity_2001Text(View view) {
		IParser parser = Eer2sqlParserProvider.getParser(
				Eer2sqlElementTypes.WeakEntity_2001,
				view.getElement() != null ? view.getElement() : view,
				Eer2sqlVisualIDRegistry
						.getType(WeakEntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Eer2sqlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSpecializationRelationship_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getGeneralization_2003Text(View view) {
		IParser parser = Eer2sqlParserProvider.getParser(
				Eer2sqlElementTypes.Generalization_2003,
				view.getElement() != null ? view.getElement() : view,
				Eer2sqlVisualIDRegistry
						.getType(GeneralizationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Eer2sqlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDependencyRelationship_2007Text(View view) {
		IParser parser = Eer2sqlParserProvider.getParser(
				Eer2sqlElementTypes.DependencyRelationship_2007, view
						.getElement() != null ? view.getElement() : view,
				Eer2sqlVisualIDRegistry
						.getType(DependencyRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Eer2sqlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInclusion_4011Text(View view) {
		Inclusion domainModelElement = (Inclusion) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			Eer2sqlDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDependencyRelationship_4006Text(View view) {
		DependencyRelationship domainModelElement = (DependencyRelationship) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			Eer2sqlDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAggregationParticipant_4009Text(View view) {
		AggregationParticipant domainModelElement = (AggregationParticipant) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getRole();
		} else {
			Eer2sqlDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationship_2008Text(View view) {
		IParser parser = Eer2sqlParserProvider.getParser(
				Eer2sqlElementTypes.Relationship_2008,
				view.getElement() != null ? view.getElement() : view,
				Eer2sqlVisualIDRegistry
						.getType(RelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Eer2sqlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleAttribute_4004Text(View view) {
		SingleAttribute domainModelElement = (SingleAttribute) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			Eer2sqlDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMemberCollection_2004Text(View view) {
		IParser parser = Eer2sqlParserProvider.getParser(
				Eer2sqlElementTypes.MemberCollection_2004,
				view.getElement() != null ? view.getElement() : view,
				Eer2sqlVisualIDRegistry
						.getType(MemberCollectionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Eer2sqlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGeneralizationParent_4012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCompositeAttribute_4007Text(View view) {
		CompositeAttribute domainModelElement = (CompositeAttribute) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			Eer2sqlDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProject_1000Text(View view) {
		Project domainModelElement = (Project) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			Eer2sqlDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPrimitiveType_2005Text(View view) {
		IParser parser = Eer2sqlParserProvider.getParser(
				Eer2sqlElementTypes.PrimitiveType_2005,
				view.getElement() != null ? view.getElement() : view,
				Eer2sqlVisualIDRegistry
						.getType(PrimitiveTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Eer2sqlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnumeratedLiteral_4010Text(View view) {
		EnumeratedLiteral domainModelElement = (EnumeratedLiteral) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			Eer2sqlDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGeneralizationRelationship_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEntityPrimaryKey_4014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCandidateKey_4003Text(View view) {
		CandidateKey domainModelElement = (CandidateKey) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			Eer2sqlDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnumerationType_2002Text(View view) {
		IParser parser = Eer2sqlParserProvider.getParser(
				Eer2sqlElementTypes.EnumerationType_2002,
				view.getElement() != null ? view.getElement() : view,
				Eer2sqlVisualIDRegistry
						.getType(EnumerationTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Eer2sqlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeComponent_2006Text(View view) {
		IParser parser = Eer2sqlParserProvider.getParser(
				Eer2sqlElementTypes.CompositeComponent_2006,
				view.getElement() != null ? view.getElement() : view,
				Eer2sqlVisualIDRegistry
						.getType(CompositeComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Eer2sqlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ProjectEditPart.MODEL_ID.equals(Eer2sqlVisualIDRegistry
				.getModelID(view));
	}

}
