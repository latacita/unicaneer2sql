/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.provider;

import EER.util.EERAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EERItemProviderAdapterFactory extends EERAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EERItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.Project} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectItemProvider projectItemProvider;

	/**
	 * This creates an adapter for a {@link EER.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjectAdapter() {
		if (projectItemProvider == null) {
			projectItemProvider = new ProjectItemProvider(this);
		}

		return projectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.Entity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityItemProvider entityItemProvider;

	/**
	 * This creates an adapter for a {@link EER.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntityAdapter() {
		if (entityItemProvider == null) {
			entityItemProvider = new EntityItemProvider(this);
		}

		return entityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.WeakEntity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeakEntityItemProvider weakEntityItemProvider;

	/**
	 * This creates an adapter for a {@link EER.WeakEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWeakEntityAdapter() {
		if (weakEntityItemProvider == null) {
			weakEntityItemProvider = new WeakEntityItemProvider(this);
		}

		return weakEntityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.Constraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintItemProvider constraintItemProvider;

	/**
	 * This creates an adapter for a {@link EER.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstraintAdapter() {
		if (constraintItemProvider == null) {
			constraintItemProvider = new ConstraintItemProvider(this);
		}

		return constraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.Exclusive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusiveItemProvider exclusiveItemProvider;

	/**
	 * This creates an adapter for a {@link EER.Exclusive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExclusiveAdapter() {
		if (exclusiveItemProvider == null) {
			exclusiveItemProvider = new ExclusiveItemProvider(this);
		}

		return exclusiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.Inclusiveness} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InclusivenessItemProvider inclusivenessItemProvider;

	/**
	 * This creates an adapter for a {@link EER.Inclusiveness}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInclusivenessAdapter() {
		if (inclusivenessItemProvider == null) {
			inclusivenessItemProvider = new InclusivenessItemProvider(this);
		}

		return inclusivenessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.Exclusion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusionItemProvider exclusionItemProvider;

	/**
	 * This creates an adapter for a {@link EER.Exclusion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExclusionAdapter() {
		if (exclusionItemProvider == null) {
			exclusionItemProvider = new ExclusionItemProvider(this);
		}

		return exclusionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.Inclusion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InclusionItemProvider inclusionItemProvider;

	/**
	 * This creates an adapter for a {@link EER.Inclusion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInclusionAdapter() {
		if (inclusionItemProvider == null) {
			inclusionItemProvider = new InclusionItemProvider(this);
		}

		return inclusionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.CandidateKey} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CandidateKeyItemProvider candidateKeyItemProvider;

	/**
	 * This creates an adapter for a {@link EER.CandidateKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCandidateKeyAdapter() {
		if (candidateKeyItemProvider == null) {
			candidateKeyItemProvider = new CandidateKeyItemProvider(this);
		}

		return candidateKeyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.CompositeAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeAttributeItemProvider compositeAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link EER.CompositeAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeAttributeAdapter() {
		if (compositeAttributeItemProvider == null) {
			compositeAttributeItemProvider = new CompositeAttributeItemProvider(this);
		}

		return compositeAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.SingleAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleAttributeItemProvider singleAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link EER.SingleAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSingleAttributeAdapter() {
		if (singleAttributeItemProvider == null) {
			singleAttributeItemProvider = new SingleAttributeItemProvider(this);
		}

		return singleAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.EnumerationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationTypeItemProvider enumerationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link EER.EnumerationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationTypeAdapter() {
		if (enumerationTypeItemProvider == null) {
			enumerationTypeItemProvider = new EnumerationTypeItemProvider(this);
		}

		return enumerationTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.PrimitiveType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeItemProvider primitiveTypeItemProvider;

	/**
	 * This creates an adapter for a {@link EER.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrimitiveTypeAdapter() {
		if (primitiveTypeItemProvider == null) {
			primitiveTypeItemProvider = new PrimitiveTypeItemProvider(this);
		}

		return primitiveTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.EnumeratedLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratedLiteralItemProvider enumeratedLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link EER.EnumeratedLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumeratedLiteralAdapter() {
		if (enumeratedLiteralItemProvider == null) {
			enumeratedLiteralItemProvider = new EnumeratedLiteralItemProvider(this);
		}

		return enumeratedLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.Relationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipItemProvider relationshipItemProvider;

	/**
	 * This creates an adapter for a {@link EER.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationshipAdapter() {
		if (relationshipItemProvider == null) {
			relationshipItemProvider = new RelationshipItemProvider(this);
		}

		return relationshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.DependencyRelationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyRelationshipItemProvider dependencyRelationshipItemProvider;

	/**
	 * This creates an adapter for a {@link EER.DependencyRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDependencyRelationshipAdapter() {
		if (dependencyRelationshipItemProvider == null) {
			dependencyRelationshipItemProvider = new DependencyRelationshipItemProvider(this);
		}

		return dependencyRelationshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.Participant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantItemProvider participantItemProvider;

	/**
	 * This creates an adapter for a {@link EER.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParticipantAdapter() {
		if (participantItemProvider == null) {
			participantItemProvider = new ParticipantItemProvider(this);
		}

		return participantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.CompositeComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeComponentItemProvider compositeComponentItemProvider;

	/**
	 * This creates an adapter for a {@link EER.CompositeComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeComponentAdapter() {
		if (compositeComponentItemProvider == null) {
			compositeComponentItemProvider = new CompositeComponentItemProvider(this);
		}

		return compositeComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.MemberCollection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberCollectionItemProvider memberCollectionItemProvider;

	/**
	 * This creates an adapter for a {@link EER.MemberCollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMemberCollectionAdapter() {
		if (memberCollectionItemProvider == null) {
			memberCollectionItemProvider = new MemberCollectionItemProvider(this);
		}

		return memberCollectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.Generalization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationItemProvider generalizationItemProvider;

	/**
	 * This creates an adapter for a {@link EER.Generalization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneralizationAdapter() {
		if (generalizationItemProvider == null) {
			generalizationItemProvider = new GeneralizationItemProvider(this);
		}

		return generalizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.SpecializationRelationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationRelationshipItemProvider specializationRelationshipItemProvider;

	/**
	 * This creates an adapter for a {@link EER.SpecializationRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpecializationRelationshipAdapter() {
		if (specializationRelationshipItemProvider == null) {
			specializationRelationshipItemProvider = new SpecializationRelationshipItemProvider(this);
		}

		return specializationRelationshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.GeneralizationRelationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationRelationshipItemProvider generalizationRelationshipItemProvider;

	/**
	 * This creates an adapter for a {@link EER.GeneralizationRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneralizationRelationshipAdapter() {
		if (generalizationRelationshipItemProvider == null) {
			generalizationRelationshipItemProvider = new GeneralizationRelationshipItemProvider(this);
		}

		return generalizationRelationshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.Cardinality} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardinalityItemProvider cardinalityItemProvider;

	/**
	 * This creates an adapter for a {@link EER.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCardinalityAdapter() {
		if (cardinalityItemProvider == null) {
			cardinalityItemProvider = new CardinalityItemProvider(this);
		}

		return cardinalityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link EER.AggregationParticipant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregationParticipantItemProvider aggregationParticipantItemProvider;

	/**
	 * This creates an adapter for a {@link EER.AggregationParticipant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAggregationParticipantAdapter() {
		if (aggregationParticipantItemProvider == null) {
			aggregationParticipantItemProvider = new AggregationParticipantItemProvider(this);
		}

		return aggregationParticipantItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (projectItemProvider != null) projectItemProvider.dispose();
		if (entityItemProvider != null) entityItemProvider.dispose();
		if (weakEntityItemProvider != null) weakEntityItemProvider.dispose();
		if (constraintItemProvider != null) constraintItemProvider.dispose();
		if (exclusiveItemProvider != null) exclusiveItemProvider.dispose();
		if (inclusivenessItemProvider != null) inclusivenessItemProvider.dispose();
		if (exclusionItemProvider != null) exclusionItemProvider.dispose();
		if (inclusionItemProvider != null) inclusionItemProvider.dispose();
		if (candidateKeyItemProvider != null) candidateKeyItemProvider.dispose();
		if (compositeAttributeItemProvider != null) compositeAttributeItemProvider.dispose();
		if (singleAttributeItemProvider != null) singleAttributeItemProvider.dispose();
		if (enumerationTypeItemProvider != null) enumerationTypeItemProvider.dispose();
		if (primitiveTypeItemProvider != null) primitiveTypeItemProvider.dispose();
		if (enumeratedLiteralItemProvider != null) enumeratedLiteralItemProvider.dispose();
		if (relationshipItemProvider != null) relationshipItemProvider.dispose();
		if (dependencyRelationshipItemProvider != null) dependencyRelationshipItemProvider.dispose();
		if (participantItemProvider != null) participantItemProvider.dispose();
		if (compositeComponentItemProvider != null) compositeComponentItemProvider.dispose();
		if (memberCollectionItemProvider != null) memberCollectionItemProvider.dispose();
		if (generalizationItemProvider != null) generalizationItemProvider.dispose();
		if (specializationRelationshipItemProvider != null) specializationRelationshipItemProvider.dispose();
		if (generalizationRelationshipItemProvider != null) generalizationRelationshipItemProvider.dispose();
		if (cardinalityItemProvider != null) cardinalityItemProvider.dispose();
		if (aggregationParticipantItemProvider != null) aggregationParticipantItemProvider.dispose();
	}

}