/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER.impl;

import EER.*;

import es.unican.moses.sle.db.eer2sql.util.UnboundedNatural;

import java.util.calendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EERFactoryImpl extends EFactoryImpl implements EERFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EERFactory init() {
		try {
			EERFactory theEERFactory = (EERFactory)EPackage.Registry.INSTANCE.getEFactory("http://EER/1.0"); 
			if (theEERFactory != null) {
				return theEERFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EERFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EERFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EERPackage.PROJECT: return createProject();
			case EERPackage.ENTITY: return createEntity();
			case EERPackage.CHILD_ENTITY: return createChild_Entity();
			case EERPackage.WEAK_ENTITY: return createWeak_Entity();
			case EERPackage.CONSTRAINT: return createConstraint();
			case EERPackage.EXCLUSIVE: return createExclusive();
			case EERPackage.INCLUSIVENESS: return createInclusiveness();
			case EERPackage.EXCLUSION: return createExclusion();
			case EERPackage.INCLUSION: return createInclusion();
			case EERPackage.CANDIDATE_KEY: return createCandidate_Key();
			case EERPackage.PRIMARY_KEY: return createPrimary_Key();
			case EERPackage.ATTRIBUTE: return createAttribute();
			case EERPackage.COMPOSITE_ATTRIBUTE: return createComposite_Attribute();
			case EERPackage.SINGLE_ATTRIBUTE: return createSingle_Attribute();
			case EERPackage.DOMAIN: return createDomain();
			case EERPackage.ABSTRACT_RELATION: return createAbstract_Relation();
			case EERPackage.RELATIONSHIP: return createRelationship();
			case EERPackage.DEPENDENCY_RELATION: return createDependency_Relation();
			case EERPackage.LINE: return createLine();
			case EERPackage.LINE_RELATIONSHIP: return createLine_Relationship();
			case EERPackage.LINE_DEPENDENCE: return createLine_Dependence();
			case EERPackage.LINE_GENERALIZATION: return createLine_Generalization();
			case EERPackage.AGGREGATION: return createAggregation();
			case EERPackage.COMPOSITE_COMPONENT: return createComposite_Component();
			case EERPackage.MEMBER_COLLECTION: return createMember_Collection();
			case EERPackage.GENERALIZATION: return createGeneralization();
			case EERPackage.MULTIPLICITY: return createMultiplicity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EERPackage.DEPENDENCY_TYPE:
				return createDependency_TypeFromString(eDataType, initialValue);
			case EERPackage.RELATIONSHIP_TYPE:
				return createRelationship_TypeFromString(eDataType, initialValue);
			case EERPackage.GENERALIZATION_TYPE:
				return createGeneralization_TypeFromString(eDataType, initialValue);
			case EERPackage.CARDINALITY_TYPE:
				return createCardinality_TypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EERPackage.DEPENDENCY_TYPE:
				return convertDependency_TypeToString(eDataType, instanceValue);
			case EERPackage.RELATIONSHIP_TYPE:
				return convertRelationship_TypeToString(eDataType, instanceValue);
			case EERPackage.GENERALIZATION_TYPE:
				return convertGeneralization_TypeToString(eDataType, instanceValue);
			case EERPackage.CARDINALITY_TYPE:
				return convertCardinality_TypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Child_Entity createChild_Entity() {
		Child_EntityImpl child_Entity = new Child_EntityImpl();
		return child_Entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weak_Entity createWeak_Entity() {
		Weak_EntityImpl weak_Entity = new Weak_EntityImpl();
		return weak_Entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exclusive createExclusive() {
		ExclusiveImpl exclusive = new ExclusiveImpl();
		return exclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inclusiveness createInclusiveness() {
		InclusivenessImpl inclusiveness = new InclusivenessImpl();
		return inclusiveness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exclusion createExclusion() {
		ExclusionImpl exclusion = new ExclusionImpl();
		return exclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inclusion createInclusion() {
		InclusionImpl inclusion = new InclusionImpl();
		return inclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Candidate_Key createCandidate_Key() {
		Candidate_KeyImpl candidate_Key = new Candidate_KeyImpl();
		return candidate_Key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primary_Key createPrimary_Key() {
		Primary_KeyImpl primary_Key = new Primary_KeyImpl();
		return primary_Key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite_Attribute createComposite_Attribute() {
		Composite_AttributeImpl composite_Attribute = new Composite_AttributeImpl();
		return composite_Attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Single_Attribute createSingle_Attribute() {
		Single_AttributeImpl single_Attribute = new Single_AttributeImpl();
		return single_Attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abstract_Relation createAbstract_Relation() {
		Abstract_RelationImpl abstract_Relation = new Abstract_RelationImpl();
		return abstract_Relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency_Relation createDependency_Relation() {
		Dependency_RelationImpl dependency_Relation = new Dependency_RelationImpl();
		return dependency_Relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line_Relationship createLine_Relationship() {
		Line_RelationshipImpl line_Relationship = new Line_RelationshipImpl();
		return line_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line_Dependence createLine_Dependence() {
		Line_DependenceImpl line_Dependence = new Line_DependenceImpl();
		return line_Dependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line_Generalization createLine_Generalization() {
		Line_GeneralizationImpl line_Generalization = new Line_GeneralizationImpl();
		return line_Generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregation createAggregation() {
		AggregationImpl aggregation = new AggregationImpl();
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite_Component createComposite_Component() {
		Composite_ComponentImpl composite_Component = new Composite_ComponentImpl();
		return composite_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member_Collection createMember_Collection() {
		Member_CollectionImpl member_Collection = new Member_CollectionImpl();
		return member_Collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity createMultiplicity() {
		MultiplicityImpl multiplicity = new MultiplicityImpl();
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency_Type createDependency_TypeFromString(EDataType eDataType, String initialValue) {
		Dependency_Type result = Dependency_Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDependency_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship_Type createRelationship_TypeFromString(EDataType eDataType, String initialValue) {
		Relationship_Type result = Relationship_Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationship_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization_Type createGeneralization_TypeFromString(EDataType eDataType, String initialValue) {
		Generalization_Type result = Generalization_Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeneralization_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createCardinality_TypeFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinality_TypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EERPackage getEERPackage() {
		return (EERPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EERPackage getPackage() {
		return EERPackage.eINSTANCE;
	}

} //EERFactoryImpl
