package EER.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import EER.diagram.providers.EERmodelElementTypes;

/**
 * @generated
 */
public class EERmodelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createRelationships2Group());
		paletteRoot.add(createAggregations3Group());
		paletteRoot.add(createLinks4Group());
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Nodes1Group_title);
		paletteContainer.setId("createNodes1Group"); //$NON-NLS-1$
		paletteContainer.add(createEntity1CreationTool());
		paletteContainer.add(createWeakEntity2CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createAttribute4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Relationships" palette tool group
	 * @generated
	 */
	private PaletteContainer createRelationships2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Relationships2Group_title);
		paletteContainer.setId("createRelationships2Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Relationships2Group_desc);
		paletteContainer.add(createRelationship1CreationTool());
		paletteContainer.add(createDependencyRelationship2CreationTool());
		paletteContainer.add(createGeneralization3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Aggregations" palette tool group
	 * @generated
	 */
	private PaletteContainer createAggregations3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Aggregations3Group_title);
		paletteContainer.setId("createAggregations3Group"); //$NON-NLS-1$
		paletteContainer.add(createCompositeComponent1CreationTool());
		paletteContainer.add(createMemberCollection2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinks4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Links4Group_title);
		paletteContainer.setId("createLinks4Group"); //$NON-NLS-1$
		paletteContainer.add(createLineEntityRelationship1CreationTool());
		paletteContainer.add(createLineCompositeComponent2CreationTool());
		paletteContainer.add(createLineMemberCollection3CreationTool());
		paletteContainer.add(createLineEntityGeneralization4CreationTool());
		paletteContainer.add(createLineGeneralizationEntity5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntity1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Entity1CreationTool_title,
				Messages.Entity1CreationTool_desc,
				Collections.singletonList(EERmodelElementTypes.Entity_2003));
		entry.setId("createEntity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EERmodelElementTypes
				.getImageDescriptor(EERmodelElementTypes.Entity_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWeakEntity2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WeakEntity2CreationTool_title,
				Messages.WeakEntity2CreationTool_desc,
				Collections.singletonList(EERmodelElementTypes.WeakEntity_2009));
		entry.setId("createWeakEntity2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EERmodelElementTypes
				.getImageDescriptor(EERmodelElementTypes.WeakEntity_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute4CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Attribute4CreationTool_title,
				Messages.Attribute4CreationTool_desc, null, null) {
		};
		entry.setId("createAttribute4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationship1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Relationship1CreationTool_title, null,
				Collections
						.singletonList(EERmodelElementTypes.Relationship_2007));
		entry.setId("createRelationship1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EERmodelElementTypes
				.getImageDescriptor(EERmodelElementTypes.Relationship_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependencyRelationship2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DependencyRelationship2CreationTool_title,
				Messages.DependencyRelationship2CreationTool_desc,
				Collections
						.singletonList(EERmodelElementTypes.DependencyRelationship_2010));
		entry.setId("createDependencyRelationship2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EERmodelElementTypes
				.getImageDescriptor(EERmodelElementTypes.DependencyRelationship_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralization3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Generalization3CreationTool_title,
				null,
				Collections
						.singletonList(EERmodelElementTypes.Generalization_2011));
		entry.setId("createGeneralization3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EERmodelElementTypes
				.getImageDescriptor(EERmodelElementTypes.Generalization_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositeComponent1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CompositeComponent1CreationTool_title,
				null,
				Collections
						.singletonList(EERmodelElementTypes.CompositeComponent_2013));
		entry.setId("createCompositeComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EERmodelElementTypes
				.getImageDescriptor(EERmodelElementTypes.CompositeComponent_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMemberCollection2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MemberCollection2CreationTool_title,
				null,
				Collections
						.singletonList(EERmodelElementTypes.MemberCollection_2014));
		entry.setId("createMemberCollection2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EERmodelElementTypes
				.getImageDescriptor(EERmodelElementTypes.MemberCollection_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLineEntityRelationship1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.LineEntityRelationship1CreationTool_title, null,
				Collections
						.singletonList(EERmodelElementTypes.Participant_4001));
		entry.setId("createLineEntityRelationship1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EERmodelElementTypes
				.getImageDescriptor(EERmodelElementTypes.Participant_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLineCompositeComponent2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.LineCompositeComponent2CreationTool_title,
				null,
				Collections
						.singletonList(EERmodelElementTypes.AggregationParticipant_4002));
		entry.setId("createLineCompositeComponent2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EERmodelElementTypes
				.getImageDescriptor(EERmodelElementTypes.AggregationParticipant_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLineMemberCollection3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.LineMemberCollection3CreationTool_title,
				null,
				Collections
						.singletonList(EERmodelElementTypes.AggregationParticipant_4003));
		entry.setId("createLineMemberCollection3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EERmodelElementTypes
				.getImageDescriptor(EERmodelElementTypes.AggregationParticipant_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLineEntityGeneralization4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.LineEntityGeneralization4CreationTool_title,
				null,
				Collections
						.singletonList(EERmodelElementTypes.SpecializationRelationship_4004));
		entry.setId("createLineEntityGeneralization4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EERmodelElementTypes
				.getImageDescriptor(EERmodelElementTypes.SpecializationRelationship_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLineGeneralizationEntity5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.LineGeneralizationEntity5CreationTool_title,
				null,
				Collections
						.singletonList(EERmodelElementTypes.GeneralizationRelationship_4005));
		entry.setId("createLineGeneralizationEntity5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EERmodelElementTypes
				.getImageDescriptor(EERmodelElementTypes.GeneralizationRelationship_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
