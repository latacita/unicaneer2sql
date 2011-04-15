package EER.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import EER.diagram.providers.Eer2sqlElementTypes;

/**
 * @generated
 */
public class Eer2sqlPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createEER1Group());
	}

	/**
	 * Creates "EER" palette tool group
	 * @generated
	 */
	private PaletteContainer createEER1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.EER1Group_title);
		paletteContainer.setId("createEER1Group"); //$NON-NLS-1$
		paletteContainer.add(createEntity1CreationTool());
		paletteContainer.add(createEntityPrimaryKey2CreationTool());
		paletteContainer.add(createWeakEntity3CreationTool());
		paletteContainer.add(createEntityPrimaryKey24CreationTool());
		paletteContainer.add(createExclusive5CreationTool());
		paletteContainer.add(createInclusiveness6CreationTool());
		paletteContainer.add(createInclusivenessTarget7CreationTool());
		paletteContainer.add(createExclusion8CreationTool());
		paletteContainer.add(createInclusion9CreationTool());
		paletteContainer.add(createCandidateKey10CreationTool());
		paletteContainer.add(createCandidateKeyAttribute11CreationTool());
		paletteContainer.add(createCompositeAttribute12CreationTool());
		paletteContainer.add(createSingleAttribute13CreationTool());
		paletteContainer.add(createEnumerationType14CreationTool());
		paletteContainer.add(createPrimitiveType15CreationTool());
		paletteContainer.add(createEnumeratedLiteral16CreationTool());
		paletteContainer.add(createRelationship17CreationTool());
		paletteContainer.add(createDependencyRelationship18CreationTool());
		paletteContainer.add(createParticipant19CreationTool());
		paletteContainer.add(createParticipantTarget20CreationTool());
		paletteContainer.add(createCompositeComponent21CreationTool());
		paletteContainer.add(createAggregationSource22CreationTool());
		paletteContainer.add(createMemberCollection23CreationTool());
		paletteContainer.add(createAggregationSource224CreationTool());
		paletteContainer.add(createGeneralization25CreationTool());
		paletteContainer.add(createGeneralizationParent26CreationTool());
		paletteContainer.add(createGeneralizationChilds27CreationTool());
		paletteContainer.add(createSpecializationRelationship28CreationTool());
		paletteContainer.add(createGeneralizationRelationship29CreationTool());
		paletteContainer.add(createCardinality30CreationTool());
		paletteContainer.add(createAggregationParticipant31CreationTool());
		paletteContainer
				.add(createAggregationParticipantSource32CreationTool());
		paletteContainer
				.add(createAggregationParticipantTarget33CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntity1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Entity1CreationTool_title,
				Messages.Entity1CreationTool_desc,
				Collections.singletonList(Eer2sqlElementTypes.WeakEntity_2001));
		entry.setId("createEntity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.WeakEntity_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntityPrimaryKey2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EntityPrimaryKey2CreationTool_title,
				Messages.EntityPrimaryKey2CreationTool_desc,
				Collections
						.singletonList(Eer2sqlElementTypes.EnumerationType_2002));
		entry.setId("createEntityPrimaryKey2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.EnumerationType_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWeakEntity3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WeakEntity3CreationTool_title,
				Messages.WeakEntity3CreationTool_desc,
				Collections
						.singletonList(Eer2sqlElementTypes.Generalization_2003));
		entry.setId("createWeakEntity3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.Generalization_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntityPrimaryKey24CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EntityPrimaryKey24CreationTool_title,
				Messages.EntityPrimaryKey24CreationTool_desc,
				Collections
						.singletonList(Eer2sqlElementTypes.MemberCollection_2004));
		entry.setId("createEntityPrimaryKey24CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.MemberCollection_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExclusive5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Exclusive5CreationTool_title,
				Messages.Exclusive5CreationTool_desc,
				Collections
						.singletonList(Eer2sqlElementTypes.PrimitiveType_2005));
		entry.setId("createExclusive5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.PrimitiveType_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInclusiveness6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Inclusiveness6CreationTool_title,
				Messages.Inclusiveness6CreationTool_desc,
				Collections
						.singletonList(Eer2sqlElementTypes.CompositeComponent_2006));
		entry.setId("createInclusiveness6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.CompositeComponent_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInclusivenessTarget7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InclusivenessTarget7CreationTool_title,
				Messages.InclusivenessTarget7CreationTool_desc,
				Collections
						.singletonList(Eer2sqlElementTypes.DependencyRelationship_2007));
		entry.setId("createInclusivenessTarget7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.DependencyRelationship_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExclusion8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Exclusion8CreationTool_title,
				Messages.Exclusion8CreationTool_desc,
				Collections
						.singletonList(Eer2sqlElementTypes.Relationship_2008));
		entry.setId("createExclusion8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.Relationship_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInclusion9CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Inclusion9CreationTool_title,
				Messages.Inclusion9CreationTool_desc,
				Collections
						.singletonList(Eer2sqlElementTypes.GeneralizationRelationship_4001));
		entry.setId("createInclusion9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.GeneralizationRelationship_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCandidateKey10CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.CandidateKey10CreationTool_title,
				Messages.CandidateKey10CreationTool_desc,
				Collections.singletonList(Eer2sqlElementTypes.Exclusion_4002));
		entry.setId("createCandidateKey10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.Exclusion_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCandidateKeyAttribute11CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.CandidateKeyAttribute11CreationTool_title,
				Messages.CandidateKeyAttribute11CreationTool_desc,
				Collections
						.singletonList(Eer2sqlElementTypes.CandidateKey_4003));
		entry.setId("createCandidateKeyAttribute11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.CandidateKey_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositeAttribute12CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.CompositeAttribute12CreationTool_title,
				Messages.CompositeAttribute12CreationTool_desc,
				Collections
						.singletonList(Eer2sqlElementTypes.SingleAttribute_4004));
		entry.setId("createCompositeAttribute12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.SingleAttribute_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSingleAttribute13CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SingleAttribute13CreationTool_title,
				Messages.SingleAttribute13CreationTool_desc,
				Collections
						.singletonList(Eer2sqlElementTypes.SpecializationRelationship_4005));
		entry.setId("createSingleAttribute13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.SpecializationRelationship_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumerationType14CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.EnumerationType14CreationTool_title,
				Messages.EnumerationType14CreationTool_desc,
				Collections
						.singletonList(Eer2sqlElementTypes.DependencyRelationship_4006));
		entry.setId("createEnumerationType14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.DependencyRelationship_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrimitiveType15CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PrimitiveType15CreationTool_title,
				Messages.PrimitiveType15CreationTool_desc,
				Collections
						.singletonList(Eer2sqlElementTypes.CompositeAttribute_4007));
		entry.setId("createPrimitiveType15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.CompositeAttribute_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumeratedLiteral16CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.EnumeratedLiteral16CreationTool_title,
				Messages.EnumeratedLiteral16CreationTool_desc,
				Collections.singletonList(Eer2sqlElementTypes.Participant_4008));
		entry.setId("createEnumeratedLiteral16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.Participant_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationship17CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Relationship17CreationTool_title,
				Messages.Relationship17CreationTool_desc,
				Collections
						.singletonList(Eer2sqlElementTypes.AggregationParticipant_4009));
		entry.setId("createRelationship17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.AggregationParticipant_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependencyRelationship18CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.DependencyRelationship18CreationTool_title,
				Messages.DependencyRelationship18CreationTool_desc,
				Collections
						.singletonList(Eer2sqlElementTypes.EnumeratedLiteral_4010));
		entry.setId("createDependencyRelationship18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.EnumeratedLiteral_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParticipant19CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Participant19CreationTool_title,
				Messages.Participant19CreationTool_desc,
				Collections.singletonList(Eer2sqlElementTypes.Inclusion_4011));
		entry.setId("createParticipant19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.Inclusion_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParticipantTarget20CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ParticipantTarget20CreationTool_title,
				Messages.ParticipantTarget20CreationTool_desc,
				Collections
						.singletonList(Eer2sqlElementTypes.GeneralizationParent_4012));
		entry.setId("createParticipantTarget20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.GeneralizationParent_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositeComponent21CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.CompositeComponent21CreationTool_title,
				Messages.CompositeComponent21CreationTool_desc,
				Collections
						.singletonList(Eer2sqlElementTypes.AggregationSource_4013));
		entry.setId("createCompositeComponent21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.AggregationSource_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAggregationSource22CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.AggregationSource22CreationTool_title,
				Messages.AggregationSource22CreationTool_desc,
				Collections
						.singletonList(Eer2sqlElementTypes.EntityPrimaryKey_4014));
		entry.setId("createAggregationSource22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.EntityPrimaryKey_4014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMemberCollection23CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.MemberCollection23CreationTool_title,
				Messages.MemberCollection23CreationTool_desc,
				Collections
						.singletonList(Eer2sqlElementTypes.GeneralizationChilds_4015));
		entry.setId("createMemberCollection23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Eer2sqlElementTypes
				.getImageDescriptor(Eer2sqlElementTypes.GeneralizationChilds_4015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAggregationSource224CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.AggregationSource224CreationTool_title,
				Messages.AggregationSource224CreationTool_desc, null, null) {
		};
		entry.setId("createAggregationSource224CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralization25CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.Generalization25CreationTool_title,
				Messages.Generalization25CreationTool_desc, null, null) {
		};
		entry.setId("createGeneralization25CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralizationParent26CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.GeneralizationParent26CreationTool_title,
				Messages.GeneralizationParent26CreationTool_desc, null, null) {
		};
		entry.setId("createGeneralizationParent26CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralizationChilds27CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.GeneralizationChilds27CreationTool_title,
				Messages.GeneralizationChilds27CreationTool_desc, null, null) {
		};
		entry.setId("createGeneralizationChilds27CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSpecializationRelationship28CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.SpecializationRelationship28CreationTool_title,
				Messages.SpecializationRelationship28CreationTool_desc, null,
				null) {
		};
		entry.setId("createSpecializationRelationship28CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralizationRelationship29CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.GeneralizationRelationship29CreationTool_title,
				Messages.GeneralizationRelationship29CreationTool_desc, null,
				null) {
		};
		entry.setId("createGeneralizationRelationship29CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCardinality30CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.Cardinality30CreationTool_title,
				Messages.Cardinality30CreationTool_desc, null, null) {
		};
		entry.setId("createCardinality30CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAggregationParticipant31CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.AggregationParticipant31CreationTool_title,
				Messages.AggregationParticipant31CreationTool_desc, null, null) {
		};
		entry.setId("createAggregationParticipant31CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAggregationParticipantSource32CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.AggregationParticipantSource32CreationTool_title,
				Messages.AggregationParticipantSource32CreationTool_desc, null,
				null) {
		};
		entry.setId("createAggregationParticipantSource32CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAggregationParticipantTarget33CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.AggregationParticipantTarget33CreationTool_title,
				Messages.AggregationParticipantTarget33CreationTool_desc, null,
				null) {
		};
		entry.setId("createAggregationParticipantTarget33CreationTool"); //$NON-NLS-1$
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
