package EER.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import EER.diagram.edit.parts.AggregationEditPart;
import EER.diagram.edit.parts.CompositeAttribute2EditPart;
import EER.diagram.edit.parts.CompositeAttributeEditPart;
import EER.diagram.edit.parts.DependencyRelationshipEditPart;
import EER.diagram.edit.parts.EntityEditPart;
import EER.diagram.edit.parts.EnumerationTypeEditPart;
import EER.diagram.edit.parts.GeneralizationEditPart;
import EER.diagram.edit.parts.ProjectEditPart;
import EER.diagram.edit.parts.RelationshipEditPart;
import EER.diagram.edit.parts.WeakEntityEditPart;
import EER.diagram.part.EERmodelDiagramEditorPlugin;
import EER.diagram.part.Messages;

/**
 * @generated
 */
public class EERmodelModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof ProjectEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(8);
			types.add(EERmodelElementTypes.WeakEntity_2009);
			types.add(EERmodelElementTypes.Entity_2003);
			types.add(EERmodelElementTypes.Relationship_2007);
			types.add(EERmodelElementTypes.DependencyRelationship_2010);
			types.add(EERmodelElementTypes.Generalization_2011);
			types.add(EERmodelElementTypes.PrimitiveType_2015);
			types.add(EERmodelElementTypes.EnumerationType_2016);
			types.add(EERmodelElementTypes.Aggregation_2017);
			return types;
		}
		if (editPart instanceof WeakEntityEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(EERmodelElementTypes.CandidateKey_3005);
			types.add(EERmodelElementTypes.SingleAttribute_3001);
			types.add(EERmodelElementTypes.CompositeAttribute_3002);
			return types;
		}
		if (editPart instanceof EntityEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(EERmodelElementTypes.CandidateKey_3008);
			types.add(EERmodelElementTypes.SingleAttribute_3007);
			types.add(EERmodelElementTypes.CompositeAttribute_3004);
			return types;
		}
		if (editPart instanceof GeneralizationEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EERmodelElementTypes.SingleAttribute_3009);
			types.add(EERmodelElementTypes.CompositeAttribute_3010);
			return types;
		}
		if (editPart instanceof EnumerationTypeEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(EERmodelElementTypes.EnumeratedLiteral_3011);
			return types;
		}
		if (editPart instanceof CompositeAttributeEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(EERmodelElementTypes.SingleAttribute_3012);
			return types;
		}
		if (editPart instanceof CompositeAttribute2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(EERmodelElementTypes.SingleAttribute_3013);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof WeakEntityEditPart) {
			return ((WeakEntityEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RelationshipEditPart) {
			return ((RelationshipEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof DependencyRelationshipEditPart) {
			return ((DependencyRelationshipEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AggregationEditPart) {
			return ((AggregationEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof WeakEntityEditPart) {
			return ((WeakEntityEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof RelationshipEditPart) {
			return ((RelationshipEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DependencyRelationshipEditPart) {
			return ((DependencyRelationshipEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof GeneralizationEditPart) {
			return ((GeneralizationEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof WeakEntityEditPart) {
			return ((WeakEntityEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RelationshipEditPart) {
			return ((RelationshipEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof DependencyRelationshipEditPart) {
			return ((DependencyRelationshipEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AggregationEditPart) {
			return ((AggregationEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof WeakEntityEditPart) {
			return ((WeakEntityEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof RelationshipEditPart) {
			return ((RelationshipEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DependencyRelationshipEditPart) {
			return ((DependencyRelationshipEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof GeneralizationEditPart) {
			return ((GeneralizationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof WeakEntityEditPart) {
			return ((WeakEntityEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RelationshipEditPart) {
			return ((RelationshipEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof DependencyRelationshipEditPart) {
			return ((DependencyRelationshipEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AggregationEditPart) {
			return ((AggregationEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				EERmodelDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.EERmodelModelingAssistantProviderMessage);
		dialog.setTitle(Messages.EERmodelModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
