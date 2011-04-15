package EER.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

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
import EER.diagram.part.Eer2sqlVisualIDRegistry;
import EER.diagram.part.Messages;

/**
 * @generated
 */
public class Eer2sqlNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public Eer2sqlNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<Eer2sqlNavigatorItem> result = new ArrayList<Eer2sqlNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, ProjectEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof Eer2sqlNavigatorGroup) {
			Eer2sqlNavigatorGroup group = (Eer2sqlNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof Eer2sqlNavigatorItem) {
			Eer2sqlNavigatorItem navigatorItem = (Eer2sqlNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (Eer2sqlVisualIDRegistry.getVisualID(view)) {

		case AggregationSourceEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Eer2sqlNavigatorGroup target = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_AggregationSource_4013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup source = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_AggregationSource_4013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(WeakEntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(MemberCollectionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(CompositeComponentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ParticipantEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Eer2sqlNavigatorGroup target = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_Participant_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup source = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_Participant_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(WeakEntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(DependencyRelationshipEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GeneralizationChildsEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Eer2sqlNavigatorGroup target = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_GeneralizationChilds_4015_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup source = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_GeneralizationChilds_4015_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(GeneralizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ExclusionEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Eer2sqlNavigatorGroup target = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_Exclusion_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup source = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_Exclusion_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case WeakEntityEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			Eer2sqlNavigatorGroup outgoinglinks = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_WeakEntity_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup incominglinks = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_WeakEntity_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(GeneralizationRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(CandidateKeyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(SingleAttributeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(SpecializationRelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(SpecializationRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(DependencyRelationship2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(CompositeAttributeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(ParticipantEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(AggregationSourceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(EntityPrimaryKeyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SpecializationRelationshipEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Eer2sqlNavigatorGroup target = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_SpecializationRelationship_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup source = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_SpecializationRelationship_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup incominglinks = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_SpecializationRelationship_4005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(WeakEntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(WeakEntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case GeneralizationEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			Eer2sqlNavigatorGroup incominglinks = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_Generalization_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup outgoinglinks = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_Generalization_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(GeneralizationRelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(GeneralizationParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(GeneralizationChildsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DependencyRelationshipEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			Eer2sqlNavigatorGroup outgoinglinks = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_DependencyRelationship_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(SingleAttributeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(CompositeAttributeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(ParticipantEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InclusionEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Eer2sqlNavigatorGroup target = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_Inclusion_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup source = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_Inclusion_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DependencyRelationship2EditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Eer2sqlNavigatorGroup source = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_DependencyRelationship_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup outgoinglinks = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_DependencyRelationship_4006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(WeakEntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AggregationParticipantEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Eer2sqlNavigatorGroup target = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_AggregationParticipant_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup source = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_AggregationParticipant_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(MemberCollectionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(CompositeComponentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(MemberCollectionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RelationshipEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			Eer2sqlNavigatorGroup incominglinks = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_Relationship_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup outgoinglinks = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_Relationship_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(ExclusionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(ExclusionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(SingleAttributeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(CompositeAttributeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(ParticipantEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(InclusionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(InclusionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SingleAttributeEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Eer2sqlNavigatorGroup target = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_SingleAttribute_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup source = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_SingleAttribute_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(EnumerationTypeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(PrimitiveTypeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(WeakEntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(DependencyRelationshipEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case MemberCollectionEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			Eer2sqlNavigatorGroup incominglinks = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_MemberCollection_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup outgoinglinks = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_MemberCollection_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(AggregationParticipantEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(AggregationParticipantEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(AggregationSourceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GeneralizationParentEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Eer2sqlNavigatorGroup target = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_GeneralizationParent_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup source = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_GeneralizationParent_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(GeneralizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case CompositeAttributeEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Eer2sqlNavigatorGroup source = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_CompositeAttribute_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(WeakEntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(DependencyRelationshipEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ProjectEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			Eer2sqlNavigatorGroup links = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_Project_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(WeakEntityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(EnumerationTypeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(GeneralizationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(MemberCollectionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(PrimitiveTypeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(CompositeComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(DependencyRelationshipEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(GeneralizationRelationshipEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(ExclusionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(CandidateKeyEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(SingleAttributeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(SpecializationRelationshipEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(DependencyRelationship2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(CompositeAttributeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(ParticipantEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(AggregationParticipantEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(EnumeratedLiteralEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(InclusionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(GeneralizationParentEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(AggregationSourceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(EntityPrimaryKeyEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(GeneralizationChildsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case PrimitiveTypeEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			Eer2sqlNavigatorGroup incominglinks = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_PrimitiveType_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(SingleAttributeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EnumeratedLiteralEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Eer2sqlNavigatorGroup source = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_EnumeratedLiteral_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(EnumerationTypeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GeneralizationRelationshipEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Eer2sqlNavigatorGroup target = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_GeneralizationRelationship_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup source = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_GeneralizationRelationship_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup incominglinks = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_GeneralizationRelationship_4001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(GeneralizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(WeakEntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EntityPrimaryKeyEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Eer2sqlNavigatorGroup target = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_EntityPrimaryKey_4014_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup source = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_EntityPrimaryKey_4014_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(WeakEntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case CandidateKeyEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Eer2sqlNavigatorGroup source = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_CandidateKey_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup incominglinks = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_CandidateKey_4003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(WeakEntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EnumerationTypeEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			Eer2sqlNavigatorGroup incominglinks = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_EnumerationType_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup outgoinglinks = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_EnumerationType_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(SingleAttributeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(EnumeratedLiteralEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CompositeComponentEditPart.VISUAL_ID: {
			LinkedList<Eer2sqlAbstractNavigatorItem> result = new LinkedList<Eer2sqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			Eer2sqlNavigatorGroup incominglinks = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_CompositeComponent_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Eer2sqlNavigatorGroup outgoinglinks = new Eer2sqlNavigatorGroup(
					Messages.NavigatorGroupName_CompositeComponent_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(AggregationParticipantEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Eer2sqlVisualIDRegistry
							.getType(AggregationSourceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ProjectEditPart.MODEL_ID.equals(Eer2sqlVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<Eer2sqlNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<Eer2sqlNavigatorItem> result = new ArrayList<Eer2sqlNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new Eer2sqlNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof Eer2sqlAbstractNavigatorItem) {
			Eer2sqlAbstractNavigatorItem abstractNavigatorItem = (Eer2sqlAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
