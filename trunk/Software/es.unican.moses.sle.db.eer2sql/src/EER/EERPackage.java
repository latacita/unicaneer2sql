/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package EER;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see EER.EERFactory
 * @model kind="package"
 * @generated
 */
public interface EERPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EER";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://EER/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EER";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EERPackage eINSTANCE = EER.impl.EERPackageImpl.init();

	/**
	 * The meta object id for the '{@link EER.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.ProjectImpl
	 * @see EER.impl.EERPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Project Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Project Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Project Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_DOMAIN = 3;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link EER.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.EntityImpl
	 * @see EER.impl.EERPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Entity Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_PRIMARY_KEY = 1;

	/**
	 * The feature id for the '<em><b>Entity Candidate Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_CANDIDATE_KEY = 2;

	/**
	 * The feature id for the '<em><b>Entity Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link EER.impl.Child_EntityImpl <em>Child Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.Child_EntityImpl
	 * @see EER.impl.EERPackageImpl#getChild_Entity()
	 * @generated
	 */
	int CHILD_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ENTITY__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Entity Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ENTITY__ENTITY_PRIMARY_KEY = ENTITY__ENTITY_PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Entity Candidate Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ENTITY__ENTITY_CANDIDATE_KEY = ENTITY__ENTITY_CANDIDATE_KEY;

	/**
	 * The feature id for the '<em><b>Entity Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ENTITY__ENTITY_ATTRIBUTE = ENTITY__ENTITY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Child Entity Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ENTITY__CHILD_ENTITY_ATTRIBUTE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Child Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link EER.impl.Weak_EntityImpl <em>Weak Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.Weak_EntityImpl
	 * @see EER.impl.EERPackageImpl#getWeak_Entity()
	 * @generated
	 */
	int WEAK_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ENTITY__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Entity Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ENTITY__ENTITY_PRIMARY_KEY = ENTITY__ENTITY_PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Entity Candidate Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ENTITY__ENTITY_CANDIDATE_KEY = ENTITY__ENTITY_CANDIDATE_KEY;

	/**
	 * The feature id for the '<em><b>Entity Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ENTITY__ENTITY_ATTRIBUTE = ENTITY__ENTITY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Weak Entity Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ENTITY__WEAK_ENTITY_ATTRIBUTE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Weak Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link EER.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.ConstraintImpl
	 * @see EER.impl.EERPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__RESTRICTION = 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link EER.impl.ExclusiveImpl <em>Exclusive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.ExclusiveImpl
	 * @see EER.impl.EERPackageImpl#getExclusive()
	 * @generated
	 */
	int EXCLUSIVE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE__COMMENT = CONSTRAINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE__RESTRICTION = CONSTRAINT__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Exclusive Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE__EXCLUSIVE_LINE = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link EER.impl.InclusivenessImpl <em>Inclusiveness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.InclusivenessImpl
	 * @see EER.impl.EERPackageImpl#getInclusiveness()
	 * @generated
	 */
	int INCLUSIVENESS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVENESS__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVENESS__COMMENT = CONSTRAINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVENESS__RESTRICTION = CONSTRAINT__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Inclusiveness Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVENESS__INCLUSIVENESS_LINE = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inclusiveness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVENESS_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link EER.impl.ExclusionImpl <em>Exclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.ExclusionImpl
	 * @see EER.impl.EERPackageImpl#getExclusion()
	 * @generated
	 */
	int EXCLUSION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION__COMMENT = CONSTRAINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION__RESTRICTION = CONSTRAINT__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Exclusion Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION__EXCLUSION_RELATIONSHIP = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link EER.impl.InclusionImpl <em>Inclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.InclusionImpl
	 * @see EER.impl.EERPackageImpl#getInclusion()
	 * @generated
	 */
	int INCLUSION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION__COMMENT = CONSTRAINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION__RESTRICTION = CONSTRAINT__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Inclusion Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION__INCLUSION_RELATIONSHIP = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link EER.impl.Candidate_KeyImpl <em>Candidate Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.Candidate_KeyImpl
	 * @see EER.impl.EERPackageImpl#getCandidate_Key()
	 * @generated
	 */
	int CANDIDATE_KEY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_KEY__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_KEY__COMMENT = CONSTRAINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_KEY__RESTRICTION = CONSTRAINT__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Candidate Key Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_KEY__CANDIDATE_KEY_ATTRIBUTE = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Candidate Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_KEY_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link EER.impl.Primary_KeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.Primary_KeyImpl
	 * @see EER.impl.EERPackageImpl#getPrimary_Key()
	 * @generated
	 */
	int PRIMARY_KEY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NAME = CANDIDATE_KEY__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__COMMENT = CANDIDATE_KEY__COMMENT;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__RESTRICTION = CANDIDATE_KEY__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Candidate Key Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__CANDIDATE_KEY_ATTRIBUTE = CANDIDATE_KEY__CANDIDATE_KEY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = CANDIDATE_KEY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link EER.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.AttributeImpl
	 * @see EER.impl.EERPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NULLABLE = 1;

	/**
	 * The feature id for the '<em><b>Attribute Generalization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_GENERALIZATION = 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link EER.impl.Composite_AttributeImpl <em>Composite Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.Composite_AttributeImpl
	 * @see EER.impl.EERPackageImpl#getComposite_Attribute()
	 * @generated
	 */
	int COMPOSITE_ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ATTRIBUTE__NULLABLE = ATTRIBUTE__NULLABLE;

	/**
	 * The feature id for the '<em><b>Attribute Generalization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ATTRIBUTE__ATTRIBUTE_GENERALIZATION = ATTRIBUTE__ATTRIBUTE_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Composite Att Single Att</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ATTRIBUTE__COMPOSITE_ATT_SINGLE_ATT = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link EER.impl.Single_AttributeImpl <em>Single Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.Single_AttributeImpl
	 * @see EER.impl.EERPackageImpl#getSingle_Attribute()
	 * @generated
	 */
	int SINGLE_ATTRIBUTE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATTRIBUTE__NULLABLE = ATTRIBUTE__NULLABLE;

	/**
	 * The feature id for the '<em><b>Attribute Generalization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATTRIBUTE__ATTRIBUTE_GENERALIZATION = ATTRIBUTE__ATTRIBUTE_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Derivate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATTRIBUTE__DERIVATE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Single Att Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATTRIBUTE__SINGLE_ATT_DOMAIN = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATTRIBUTE__MULTIPLICITY = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Single Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link EER.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.DomainImpl
	 * @see EER.impl.EERPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = 0;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link EER.impl.Abstract_RelationImpl <em>Abstract Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.Abstract_RelationImpl
	 * @see EER.impl.EERPackageImpl#getAbstract_Relation()
	 * @generated
	 */
	int ABSTRACT_RELATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link EER.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.RelationshipImpl
	 * @see EER.impl.EERPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = ABSTRACT_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Relationship Line Rel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATIONSHIP_LINE_REL = ABSTRACT_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relationship Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATIONSHIP_ATTRIBUTE = ABSTRACT_RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TYPE = ABSTRACT_RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = ABSTRACT_RELATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link EER.impl.Dependency_RelationImpl <em>Dependency Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.Dependency_RelationImpl
	 * @see EER.impl.EERPackageImpl#getDependency_Relation()
	 * @generated
	 */
	int DEPENDENCY_RELATION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATION__NAME = ABSTRACT_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATION__TYPE = ABSTRACT_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependency Rel Line Dep</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATION__DEPENDENCY_REL_LINE_DEP = ABSTRACT_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dependency Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATION_FEATURE_COUNT = ABSTRACT_RELATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link EER.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.LineImpl
	 * @see EER.impl.EERPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 18;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CARDINALITY = 0;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ROL = 1;

	/**
	 * The feature id for the '<em><b>Line Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__LINE_ENTITY = 2;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link EER.impl.Line_RelationshipImpl <em>Line Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.Line_RelationshipImpl
	 * @see EER.impl.EERPackageImpl#getLine_Relationship()
	 * @generated
	 */
	int LINE_RELATIONSHIP = 19;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_RELATIONSHIP__CARDINALITY = LINE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_RELATIONSHIP__ROL = LINE__ROL;

	/**
	 * The feature id for the '<em><b>Line Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_RELATIONSHIP__LINE_ENTITY = LINE__LINE_ENTITY;

	/**
	 * The feature id for the '<em><b>Line Rel Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_RELATIONSHIP__LINE_REL_RELATIONSHIP = LINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line Rel Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_RELATIONSHIP__LINE_REL_RELATION = LINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Line Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_RELATIONSHIP_FEATURE_COUNT = LINE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link EER.impl.Line_DependenceImpl <em>Line Dependence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.Line_DependenceImpl
	 * @see EER.impl.EERPackageImpl#getLine_Dependence()
	 * @generated
	 */
	int LINE_DEPENDENCE = 20;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_DEPENDENCE__CARDINALITY = LINE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_DEPENDENCE__ROL = LINE__ROL;

	/**
	 * The feature id for the '<em><b>Line Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_DEPENDENCE__LINE_ENTITY = LINE__LINE_ENTITY;

	/**
	 * The feature id for the '<em><b>Line Dep Dependency Rel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_DEPENDENCE__LINE_DEP_DEPENDENCY_REL = LINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line Dep Child Ent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_DEPENDENCE__LINE_DEP_CHILD_ENT = LINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Line Dependence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_DEPENDENCE_FEATURE_COUNT = LINE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link EER.impl.Line_GeneralizationImpl <em>Line Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.Line_GeneralizationImpl
	 * @see EER.impl.EERPackageImpl#getLine_Generalization()
	 * @generated
	 */
	int LINE_GENERALIZATION = 21;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_GENERALIZATION__CARDINALITY = LINE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_GENERALIZATION__ROL = LINE__ROL;

	/**
	 * The feature id for the '<em><b>Line Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_GENERALIZATION__LINE_ENTITY = LINE__LINE_ENTITY;

	/**
	 * The number of structural features of the '<em>Line Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_GENERALIZATION_FEATURE_COUNT = LINE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link EER.impl.AggregationImpl <em>Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.AggregationImpl
	 * @see EER.impl.EERPackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 22;

	/**
	 * The feature id for the '<em><b>Aggregation Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__AGGREGATION_ENTITY = 0;

	/**
	 * The number of structural features of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link EER.impl.Composite_ComponentImpl <em>Composite Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.Composite_ComponentImpl
	 * @see EER.impl.EERPackageImpl#getComposite_Component()
	 * @generated
	 */
	int COMPOSITE_COMPONENT = 23;

	/**
	 * The feature id for the '<em><b>Aggregation Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__AGGREGATION_ENTITY = AGGREGATION__AGGREGATION_ENTITY;

	/**
	 * The feature id for the '<em><b>CC Line Gen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__CC_LINE_GEN = AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_FEATURE_COUNT = AGGREGATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link EER.impl.Member_CollectionImpl <em>Member Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.Member_CollectionImpl
	 * @see EER.impl.EERPackageImpl#getMember_Collection()
	 * @generated
	 */
	int MEMBER_COLLECTION = 24;

	/**
	 * The feature id for the '<em><b>Aggregation Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_COLLECTION__AGGREGATION_ENTITY = AGGREGATION__AGGREGATION_ENTITY;

	/**
	 * The feature id for the '<em><b>MC Line Gen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_COLLECTION__MC_LINE_GEN = AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Member Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_COLLECTION_FEATURE_COUNT = AGGREGATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link EER.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.GeneralizationImpl
	 * @see EER.impl.EERPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Generalization Child Ent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERALIZATION_CHILD_ENT = 2;

	/**
	 * The feature id for the '<em><b>Generalization Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERALIZATION_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Generalization Line Gen</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERALIZATION_LINE_GEN = 4;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link EER.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.MultiplicityImpl
	 * @see EER.impl.EERPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 26;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__UPPER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__LOWER_BOUND = 1;

	/**
	 * The number of structural features of the '<em>Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link EER.Dependency_Type <em>Dependency Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.Dependency_Type
	 * @see EER.impl.EERPackageImpl#getDependency_Type()
	 * @generated
	 */
	int DEPENDENCY_TYPE = 27;

	/**
	 * The meta object id for the '{@link EER.Relationship_Type <em>Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.Relationship_Type
	 * @see EER.impl.EERPackageImpl#getRelationship_Type()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 28;

	/**
	 * The meta object id for the '{@link EER.Generalization_Type <em>Generalization Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.Generalization_Type
	 * @see EER.impl.EERPackageImpl#getGeneralization_Type()
	 * @generated
	 */
	int GENERALIZATION_TYPE = 29;

	/**
	 * The meta object id for the '<em>Cardinality Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EER.impl.EERPackageImpl#getCardinality_Type()
	 * @generated
	 */
	int CARDINALITY_TYPE = 30;

	/**
	 * The meta object id for the '<em>Unbounded Natural</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.moses.sle.db.eer2sql.util.UnboundedNatural
	 * @see EER.impl.EERPackageImpl#getUnboundedNatural()
	 * @generated
	 */
	int UNBOUNDED_NATURAL = 31;


	/**
	 * Returns the meta object for class '{@link EER.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see EER.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link EER.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see EER.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link EER.Project#getProject_Entity <em>Project Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Project Entity</em>'.
	 * @see EER.Project#getProject_Entity()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Project_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link EER.Project#getProject_Relationship <em>Project Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Project Relationship</em>'.
	 * @see EER.Project#getProject_Relationship()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Project_Relationship();

	/**
	 * Returns the meta object for the containment reference list '{@link EER.Project#getProject_Domain <em>Project Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Project Domain</em>'.
	 * @see EER.Project#getProject_Domain()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Project_Domain();

	/**
	 * Returns the meta object for class '{@link EER.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see EER.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link EER.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see EER.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the containment reference '{@link EER.Entity#getEntity_Primary_Key <em>Entity Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Primary Key</em>'.
	 * @see EER.Entity#getEntity_Primary_Key()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Entity_Primary_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link EER.Entity#getEntity_Candidate_Key <em>Entity Candidate Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Candidate Key</em>'.
	 * @see EER.Entity#getEntity_Candidate_Key()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Entity_Candidate_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link EER.Entity#getEntity_Attribute <em>Entity Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Attribute</em>'.
	 * @see EER.Entity#getEntity_Attribute()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Entity_Attribute();

	/**
	 * Returns the meta object for class '{@link EER.Child_Entity <em>Child Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Entity</em>'.
	 * @see EER.Child_Entity
	 * @generated
	 */
	EClass getChild_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link EER.Child_Entity#getChild_Entity_Attribute <em>Child Entity Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Entity Attribute</em>'.
	 * @see EER.Child_Entity#getChild_Entity_Attribute()
	 * @see #getChild_Entity()
	 * @generated
	 */
	EReference getChild_Entity_Child_Entity_Attribute();

	/**
	 * Returns the meta object for class '{@link EER.Weak_Entity <em>Weak Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weak Entity</em>'.
	 * @see EER.Weak_Entity
	 * @generated
	 */
	EClass getWeak_Entity();

	/**
	 * Returns the meta object for the containment reference '{@link EER.Weak_Entity#getWeak_Entity_Attribute <em>Weak Entity Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weak Entity Attribute</em>'.
	 * @see EER.Weak_Entity#getWeak_Entity_Attribute()
	 * @see #getWeak_Entity()
	 * @generated
	 */
	EReference getWeak_Entity_Weak_Entity_Attribute();

	/**
	 * Returns the meta object for class '{@link EER.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see EER.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link EER.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see EER.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link EER.Constraint#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see EER.Constraint#getComment()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Comment();

	/**
	 * Returns the meta object for the attribute '{@link EER.Constraint#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restriction</em>'.
	 * @see EER.Constraint#getRestriction()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Restriction();

	/**
	 * Returns the meta object for class '{@link EER.Exclusive <em>Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive</em>'.
	 * @see EER.Exclusive
	 * @generated
	 */
	EClass getExclusive();

	/**
	 * Returns the meta object for the reference list '{@link EER.Exclusive#getExclusive_Line <em>Exclusive Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exclusive Line</em>'.
	 * @see EER.Exclusive#getExclusive_Line()
	 * @see #getExclusive()
	 * @generated
	 */
	EReference getExclusive_Exclusive_Line();

	/**
	 * Returns the meta object for class '{@link EER.Inclusiveness <em>Inclusiveness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inclusiveness</em>'.
	 * @see EER.Inclusiveness
	 * @generated
	 */
	EClass getInclusiveness();

	/**
	 * Returns the meta object for the reference list '{@link EER.Inclusiveness#getInclusiveness_Line <em>Inclusiveness Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inclusiveness Line</em>'.
	 * @see EER.Inclusiveness#getInclusiveness_Line()
	 * @see #getInclusiveness()
	 * @generated
	 */
	EReference getInclusiveness_Inclusiveness_Line();

	/**
	 * Returns the meta object for class '{@link EER.Exclusion <em>Exclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusion</em>'.
	 * @see EER.Exclusion
	 * @generated
	 */
	EClass getExclusion();

	/**
	 * Returns the meta object for the reference list '{@link EER.Exclusion#getExclusion_Relationship <em>Exclusion Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exclusion Relationship</em>'.
	 * @see EER.Exclusion#getExclusion_Relationship()
	 * @see #getExclusion()
	 * @generated
	 */
	EReference getExclusion_Exclusion_Relationship();

	/**
	 * Returns the meta object for class '{@link EER.Inclusion <em>Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inclusion</em>'.
	 * @see EER.Inclusion
	 * @generated
	 */
	EClass getInclusion();

	/**
	 * Returns the meta object for the reference list '{@link EER.Inclusion#getInclusion_Relationship <em>Inclusion Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inclusion Relationship</em>'.
	 * @see EER.Inclusion#getInclusion_Relationship()
	 * @see #getInclusion()
	 * @generated
	 */
	EReference getInclusion_Inclusion_Relationship();

	/**
	 * Returns the meta object for class '{@link EER.Candidate_Key <em>Candidate Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Candidate Key</em>'.
	 * @see EER.Candidate_Key
	 * @generated
	 */
	EClass getCandidate_Key();

	/**
	 * Returns the meta object for the reference '{@link EER.Candidate_Key#getCandidate_Key_Attribute <em>Candidate Key Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Candidate Key Attribute</em>'.
	 * @see EER.Candidate_Key#getCandidate_Key_Attribute()
	 * @see #getCandidate_Key()
	 * @generated
	 */
	EReference getCandidate_Key_Candidate_Key_Attribute();

	/**
	 * Returns the meta object for class '{@link EER.Primary_Key <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see EER.Primary_Key
	 * @generated
	 */
	EClass getPrimary_Key();

	/**
	 * Returns the meta object for class '{@link EER.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see EER.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link EER.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see EER.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link EER.Attribute#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see EER.Attribute#isNullable()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Nullable();

	/**
	 * Returns the meta object for the containment reference '{@link EER.Attribute#getAttribute_Generalization <em>Attribute Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Generalization</em>'.
	 * @see EER.Attribute#getAttribute_Generalization()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Attribute_Generalization();

	/**
	 * Returns the meta object for class '{@link EER.Composite_Attribute <em>Composite Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Attribute</em>'.
	 * @see EER.Composite_Attribute
	 * @generated
	 */
	EClass getComposite_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link EER.Composite_Attribute#getComposite_Att_Single_Att <em>Composite Att Single Att</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Att Single Att</em>'.
	 * @see EER.Composite_Attribute#getComposite_Att_Single_Att()
	 * @see #getComposite_Attribute()
	 * @generated
	 */
	EReference getComposite_Attribute_Composite_Att_Single_Att();

	/**
	 * Returns the meta object for class '{@link EER.Single_Attribute <em>Single Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Attribute</em>'.
	 * @see EER.Single_Attribute
	 * @generated
	 */
	EClass getSingle_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link EER.Single_Attribute#isDerivate <em>Derivate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derivate</em>'.
	 * @see EER.Single_Attribute#isDerivate()
	 * @see #getSingle_Attribute()
	 * @generated
	 */
	EAttribute getSingle_Attribute_Derivate();

	/**
	 * Returns the meta object for the reference '{@link EER.Single_Attribute#getSingle_Att_Domain <em>Single Att Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Single Att Domain</em>'.
	 * @see EER.Single_Attribute#getSingle_Att_Domain()
	 * @see #getSingle_Attribute()
	 * @generated
	 */
	EReference getSingle_Attribute_Single_Att_Domain();

	/**
	 * Returns the meta object for the reference '{@link EER.Single_Attribute#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multiplicity</em>'.
	 * @see EER.Single_Attribute#getMultiplicity()
	 * @see #getSingle_Attribute()
	 * @generated
	 */
	EReference getSingle_Attribute_Multiplicity();

	/**
	 * Returns the meta object for class '{@link EER.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see EER.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link EER.Domain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see EER.Domain#getName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Name();

	/**
	 * Returns the meta object for class '{@link EER.Abstract_Relation <em>Abstract Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Relation</em>'.
	 * @see EER.Abstract_Relation
	 * @generated
	 */
	EClass getAbstract_Relation();

	/**
	 * Returns the meta object for the attribute '{@link EER.Abstract_Relation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see EER.Abstract_Relation#getName()
	 * @see #getAbstract_Relation()
	 * @generated
	 */
	EAttribute getAbstract_Relation_Name();

	/**
	 * Returns the meta object for class '{@link EER.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see EER.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the containment reference list '{@link EER.Relationship#getRelationship_Line_Rel <em>Relationship Line Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship Line Rel</em>'.
	 * @see EER.Relationship#getRelationship_Line_Rel()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Relationship_Line_Rel();

	/**
	 * Returns the meta object for the containment reference list '{@link EER.Relationship#getRelationship_Attribute <em>Relationship Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship Attribute</em>'.
	 * @see EER.Relationship#getRelationship_Attribute()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Relationship_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link EER.Relationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see EER.Relationship#getType()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Type();

	/**
	 * Returns the meta object for enum '{@link EER.Relationship_Type <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Type</em>'.
	 * @see EER.Relationship_Type
	 * @generated
	 */
	EEnum getRelationship_Type();

	/**
	 * Returns the meta object for enum '{@link EER.Relationship_Type <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Type</em>'.
	 * @see EER.Relationship_Type
	 * @generated
	 */
	EEnum getRelationship_Type();

	/**
	 * Returns the meta object for enum '{@link EER.Relationship_Type <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Type</em>'.
	 * @see EER.Relationship_Type
	 * @generated
	 */
	EEnum getRelationship_Type();

	/**
	 * Returns the meta object for class '{@link EER.Dependency_Relation <em>Dependency Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Relation</em>'.
	 * @see EER.Dependency_Relation
	 * @generated
	 */
	EClass getDependency_Relation();

	/**
	 * Returns the meta object for the attribute '{@link EER.Dependency_Relation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see EER.Dependency_Relation#getType()
	 * @see #getDependency_Relation()
	 * @generated
	 */
	EAttribute getDependency_Relation_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link EER.Dependency_Relation#getDependency_Rel_Line_Dep <em>Dependency Rel Line Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency Rel Line Dep</em>'.
	 * @see EER.Dependency_Relation#getDependency_Rel_Line_Dep()
	 * @see #getDependency_Relation()
	 * @generated
	 */
	EReference getDependency_Relation_Dependency_Rel_Line_Dep();

	/**
	 * Returns the meta object for class '{@link EER.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see EER.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link EER.Line#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see EER.Line#getCardinality()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link EER.Line#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol</em>'.
	 * @see EER.Line#getRol()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Rol();

	/**
	 * Returns the meta object for the reference '{@link EER.Line#getLine_Entity <em>Line Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line Entity</em>'.
	 * @see EER.Line#getLine_Entity()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Line_Entity();

	/**
	 * Returns the meta object for class '{@link EER.Line_Relationship <em>Line Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Relationship</em>'.
	 * @see EER.Line_Relationship
	 * @generated
	 */
	EClass getLine_Relationship();

	/**
	 * Returns the meta object for the reference '{@link EER.Line_Relationship#getLine_Rel_Relationship <em>Line Rel Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line Rel Relationship</em>'.
	 * @see EER.Line_Relationship#getLine_Rel_Relationship()
	 * @see #getLine_Relationship()
	 * @generated
	 */
	EReference getLine_Relationship_Line_Rel_Relationship();

	/**
	 * Returns the meta object for the reference '{@link EER.Line_Relationship#getLine_Rel_Relation <em>Line Rel Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line Rel Relation</em>'.
	 * @see EER.Line_Relationship#getLine_Rel_Relation()
	 * @see #getLine_Relationship()
	 * @generated
	 */
	EReference getLine_Relationship_Line_Rel_Relation();

	/**
	 * Returns the meta object for class '{@link EER.Line_Dependence <em>Line Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Dependence</em>'.
	 * @see EER.Line_Dependence
	 * @generated
	 */
	EClass getLine_Dependence();

	/**
	 * Returns the meta object for the reference '{@link EER.Line_Dependence#getLine_Dep_Dependency_Rel <em>Line Dep Dependency Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line Dep Dependency Rel</em>'.
	 * @see EER.Line_Dependence#getLine_Dep_Dependency_Rel()
	 * @see #getLine_Dependence()
	 * @generated
	 */
	EReference getLine_Dependence_Line_Dep_Dependency_Rel();

	/**
	 * Returns the meta object for the reference '{@link EER.Line_Dependence#getLine_Dep_Child_Ent <em>Line Dep Child Ent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line Dep Child Ent</em>'.
	 * @see EER.Line_Dependence#getLine_Dep_Child_Ent()
	 * @see #getLine_Dependence()
	 * @generated
	 */
	EReference getLine_Dependence_Line_Dep_Child_Ent();

	/**
	 * Returns the meta object for class '{@link EER.Line_Generalization <em>Line Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Generalization</em>'.
	 * @see EER.Line_Generalization
	 * @generated
	 */
	EClass getLine_Generalization();

	/**
	 * Returns the meta object for class '{@link EER.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation</em>'.
	 * @see EER.Aggregation
	 * @generated
	 */
	EClass getAggregation();

	/**
	 * Returns the meta object for the reference '{@link EER.Aggregation#getAggregation_Entity <em>Aggregation Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aggregation Entity</em>'.
	 * @see EER.Aggregation#getAggregation_Entity()
	 * @see #getAggregation()
	 * @generated
	 */
	EReference getAggregation_Aggregation_Entity();

	/**
	 * Returns the meta object for class '{@link EER.Composite_Component <em>Composite Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Component</em>'.
	 * @see EER.Composite_Component
	 * @generated
	 */
	EClass getComposite_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link EER.Composite_Component#getCC_Line_Gen <em>CC Line Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CC Line Gen</em>'.
	 * @see EER.Composite_Component#getCC_Line_Gen()
	 * @see #getComposite_Component()
	 * @generated
	 */
	EReference getComposite_Component_CC_Line_Gen();

	/**
	 * Returns the meta object for class '{@link EER.Member_Collection <em>Member Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Collection</em>'.
	 * @see EER.Member_Collection
	 * @generated
	 */
	EClass getMember_Collection();

	/**
	 * Returns the meta object for the containment reference '{@link EER.Member_Collection#getMC_Line_Gen <em>MC Line Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MC Line Gen</em>'.
	 * @see EER.Member_Collection#getMC_Line_Gen()
	 * @see #getMember_Collection()
	 * @generated
	 */
	EReference getMember_Collection_MC_Line_Gen();

	/**
	 * Returns the meta object for class '{@link EER.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see EER.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the attribute '{@link EER.Generalization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see EER.Generalization#getName()
	 * @see #getGeneralization()
	 * @generated
	 */
	EAttribute getGeneralization_Name();

	/**
	 * Returns the meta object for the attribute '{@link EER.Generalization#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see EER.Generalization#getType()
	 * @see #getGeneralization()
	 * @generated
	 */
	EAttribute getGeneralization_Type();

	/**
	 * Returns the meta object for enum '{@link EER.Generalization_Type <em>Generalization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generalization Type</em>'.
	 * @see EER.Generalization_Type
	 * @generated
	 */
	EEnum getGeneralization_Type();

	/**
	 * Returns the meta object for enum '{@link EER.Generalization_Type <em>Generalization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generalization Type</em>'.
	 * @see EER.Generalization_Type
	 * @generated
	 */
	EEnum getGeneralization_Type();

	/**
	 * Returns the meta object for enum '{@link EER.Generalization_Type <em>Generalization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generalization Type</em>'.
	 * @see EER.Generalization_Type
	 * @generated
	 */
	EEnum getGeneralization_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link EER.Generalization#getGeneralization_Child_Ent <em>Generalization Child Ent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generalization Child Ent</em>'.
	 * @see EER.Generalization#getGeneralization_Child_Ent()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Generalization_Child_Ent();

	/**
	 * Returns the meta object for the containment reference '{@link EER.Generalization#getGeneralization_Attribute <em>Generalization Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generalization Attribute</em>'.
	 * @see EER.Generalization#getGeneralization_Attribute()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Generalization_Attribute();

	/**
	 * Returns the meta object for the reference list '{@link EER.Generalization#getGeneralization_Line_Gen <em>Generalization Line Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generalization Line Gen</em>'.
	 * @see EER.Generalization#getGeneralization_Line_Gen()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Generalization_Line_Gen();

	/**
	 * Returns the meta object for class '{@link EER.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity</em>'.
	 * @see EER.Multiplicity
	 * @generated
	 */
	EClass getMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link EER.Multiplicity#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see EER.Multiplicity#getUpperBound()
	 * @see #getMultiplicity()
	 * @generated
	 */
	EAttribute getMultiplicity_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link EER.Multiplicity#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see EER.Multiplicity#getLowerBound()
	 * @see #getMultiplicity()
	 * @generated
	 */
	EAttribute getMultiplicity_LowerBound();

	/**
	 * Returns the meta object for enum '{@link EER.Dependency_Type <em>Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependency Type</em>'.
	 * @see EER.Dependency_Type
	 * @generated
	 */
	EEnum getDependency_Type();

	/**
	 * Returns the meta object for enum '{@link EER.Relationship_Type <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Type</em>'.
	 * @see EER.Relationship_Type
	 * @generated
	 */
	EEnum getRelationship_Type();

	/**
	 * Returns the meta object for enum '{@link EER.Generalization_Type <em>Generalization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generalization Type</em>'.
	 * @see EER.Generalization_Type
	 * @generated
	 */
	EEnum getGeneralization_Type();

	/**
	 * Returns the meta object for data type '<em>Cardinality Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cardinality Type</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getCardinality_Type();

	/**
	 * Returns the meta object for data type '{@link es.unican.moses.sle.db.eer2sql.util.UnboundedNatural <em>Unbounded Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unbounded Natural</em>'.
	 * @see es.unican.moses.sle.db.eer2sql.util.UnboundedNatural
	 * @model instanceClass="es.unican.moses.sle.db.eer2sql.util.UnboundedNatural" serializeable="false"
	 * @generated
	 */
	EDataType getUnboundedNatural();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EERFactory getEERFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link EER.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.ProjectImpl
		 * @see EER.impl.EERPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Project Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PROJECT_ENTITY = eINSTANCE.getProject_Project_Entity();

		/**
		 * The meta object literal for the '<em><b>Project Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PROJECT_RELATIONSHIP = eINSTANCE.getProject_Project_Relationship();

		/**
		 * The meta object literal for the '<em><b>Project Domain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PROJECT_DOMAIN = eINSTANCE.getProject_Project_Domain();

		/**
		 * The meta object literal for the '{@link EER.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.EntityImpl
		 * @see EER.impl.EERPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Entity Primary Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENTITY_PRIMARY_KEY = eINSTANCE.getEntity_Entity_Primary_Key();

		/**
		 * The meta object literal for the '<em><b>Entity Candidate Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENTITY_CANDIDATE_KEY = eINSTANCE.getEntity_Entity_Candidate_Key();

		/**
		 * The meta object literal for the '<em><b>Entity Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENTITY_ATTRIBUTE = eINSTANCE.getEntity_Entity_Attribute();

		/**
		 * The meta object literal for the '{@link EER.impl.Child_EntityImpl <em>Child Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.Child_EntityImpl
		 * @see EER.impl.EERPackageImpl#getChild_Entity()
		 * @generated
		 */
		EClass CHILD_ENTITY = eINSTANCE.getChild_Entity();

		/**
		 * The meta object literal for the '<em><b>Child Entity Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_ENTITY__CHILD_ENTITY_ATTRIBUTE = eINSTANCE.getChild_Entity_Child_Entity_Attribute();

		/**
		 * The meta object literal for the '{@link EER.impl.Weak_EntityImpl <em>Weak Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.Weak_EntityImpl
		 * @see EER.impl.EERPackageImpl#getWeak_Entity()
		 * @generated
		 */
		EClass WEAK_ENTITY = eINSTANCE.getWeak_Entity();

		/**
		 * The meta object literal for the '<em><b>Weak Entity Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEAK_ENTITY__WEAK_ENTITY_ATTRIBUTE = eINSTANCE.getWeak_Entity_Weak_Entity_Attribute();

		/**
		 * The meta object literal for the '{@link EER.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.ConstraintImpl
		 * @see EER.impl.EERPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__COMMENT = eINSTANCE.getConstraint_Comment();

		/**
		 * The meta object literal for the '<em><b>Restriction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__RESTRICTION = eINSTANCE.getConstraint_Restriction();

		/**
		 * The meta object literal for the '{@link EER.impl.ExclusiveImpl <em>Exclusive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.ExclusiveImpl
		 * @see EER.impl.EERPackageImpl#getExclusive()
		 * @generated
		 */
		EClass EXCLUSIVE = eINSTANCE.getExclusive();

		/**
		 * The meta object literal for the '<em><b>Exclusive Line</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSIVE__EXCLUSIVE_LINE = eINSTANCE.getExclusive_Exclusive_Line();

		/**
		 * The meta object literal for the '{@link EER.impl.InclusivenessImpl <em>Inclusiveness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.InclusivenessImpl
		 * @see EER.impl.EERPackageImpl#getInclusiveness()
		 * @generated
		 */
		EClass INCLUSIVENESS = eINSTANCE.getInclusiveness();

		/**
		 * The meta object literal for the '<em><b>Inclusiveness Line</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUSIVENESS__INCLUSIVENESS_LINE = eINSTANCE.getInclusiveness_Inclusiveness_Line();

		/**
		 * The meta object literal for the '{@link EER.impl.ExclusionImpl <em>Exclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.ExclusionImpl
		 * @see EER.impl.EERPackageImpl#getExclusion()
		 * @generated
		 */
		EClass EXCLUSION = eINSTANCE.getExclusion();

		/**
		 * The meta object literal for the '<em><b>Exclusion Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSION__EXCLUSION_RELATIONSHIP = eINSTANCE.getExclusion_Exclusion_Relationship();

		/**
		 * The meta object literal for the '{@link EER.impl.InclusionImpl <em>Inclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.InclusionImpl
		 * @see EER.impl.EERPackageImpl#getInclusion()
		 * @generated
		 */
		EClass INCLUSION = eINSTANCE.getInclusion();

		/**
		 * The meta object literal for the '<em><b>Inclusion Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUSION__INCLUSION_RELATIONSHIP = eINSTANCE.getInclusion_Inclusion_Relationship();

		/**
		 * The meta object literal for the '{@link EER.impl.Candidate_KeyImpl <em>Candidate Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.Candidate_KeyImpl
		 * @see EER.impl.EERPackageImpl#getCandidate_Key()
		 * @generated
		 */
		EClass CANDIDATE_KEY = eINSTANCE.getCandidate_Key();

		/**
		 * The meta object literal for the '<em><b>Candidate Key Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANDIDATE_KEY__CANDIDATE_KEY_ATTRIBUTE = eINSTANCE.getCandidate_Key_Candidate_Key_Attribute();

		/**
		 * The meta object literal for the '{@link EER.impl.Primary_KeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.Primary_KeyImpl
		 * @see EER.impl.EERPackageImpl#getPrimary_Key()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimary_Key();

		/**
		 * The meta object literal for the '{@link EER.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.AttributeImpl
		 * @see EER.impl.EERPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NULLABLE = eINSTANCE.getAttribute_Nullable();

		/**
		 * The meta object literal for the '<em><b>Attribute Generalization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ATTRIBUTE_GENERALIZATION = eINSTANCE.getAttribute_Attribute_Generalization();

		/**
		 * The meta object literal for the '{@link EER.impl.Composite_AttributeImpl <em>Composite Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.Composite_AttributeImpl
		 * @see EER.impl.EERPackageImpl#getComposite_Attribute()
		 * @generated
		 */
		EClass COMPOSITE_ATTRIBUTE = eINSTANCE.getComposite_Attribute();

		/**
		 * The meta object literal for the '<em><b>Composite Att Single Att</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_ATTRIBUTE__COMPOSITE_ATT_SINGLE_ATT = eINSTANCE.getComposite_Attribute_Composite_Att_Single_Att();

		/**
		 * The meta object literal for the '{@link EER.impl.Single_AttributeImpl <em>Single Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.Single_AttributeImpl
		 * @see EER.impl.EERPackageImpl#getSingle_Attribute()
		 * @generated
		 */
		EClass SINGLE_ATTRIBUTE = eINSTANCE.getSingle_Attribute();

		/**
		 * The meta object literal for the '<em><b>Derivate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_ATTRIBUTE__DERIVATE = eINSTANCE.getSingle_Attribute_Derivate();

		/**
		 * The meta object literal for the '<em><b>Single Att Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ATTRIBUTE__SINGLE_ATT_DOMAIN = eINSTANCE.getSingle_Attribute_Single_Att_Domain();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ATTRIBUTE__MULTIPLICITY = eINSTANCE.getSingle_Attribute_Multiplicity();

		/**
		 * The meta object literal for the '{@link EER.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.DomainImpl
		 * @see EER.impl.EERPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

		/**
		 * The meta object literal for the '{@link EER.impl.Abstract_RelationImpl <em>Abstract Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.Abstract_RelationImpl
		 * @see EER.impl.EERPackageImpl#getAbstract_Relation()
		 * @generated
		 */
		EClass ABSTRACT_RELATION = eINSTANCE.getAbstract_Relation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_RELATION__NAME = eINSTANCE.getAbstract_Relation_Name();

		/**
		 * The meta object literal for the '{@link EER.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.RelationshipImpl
		 * @see EER.impl.EERPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Relationship Line Rel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__RELATIONSHIP_LINE_REL = eINSTANCE.getRelationship_Relationship_Line_Rel();

		/**
		 * The meta object literal for the '<em><b>Relationship Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__RELATIONSHIP_ATTRIBUTE = eINSTANCE.getRelationship_Relationship_Attribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__TYPE = eINSTANCE.getRelationship_Type();

		/**
		 * The meta object literal for the '{@link EER.impl.Dependency_RelationImpl <em>Dependency Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.Dependency_RelationImpl
		 * @see EER.impl.EERPackageImpl#getDependency_Relation()
		 * @generated
		 */
		EClass DEPENDENCY_RELATION = eINSTANCE.getDependency_Relation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_RELATION__TYPE = eINSTANCE.getDependency_Relation_Type();

		/**
		 * The meta object literal for the '<em><b>Dependency Rel Line Dep</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_RELATION__DEPENDENCY_REL_LINE_DEP = eINSTANCE.getDependency_Relation_Dependency_Rel_Line_Dep();

		/**
		 * The meta object literal for the '{@link EER.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.LineImpl
		 * @see EER.impl.EERPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__CARDINALITY = eINSTANCE.getLine_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Rol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__ROL = eINSTANCE.getLine_Rol();

		/**
		 * The meta object literal for the '<em><b>Line Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__LINE_ENTITY = eINSTANCE.getLine_Line_Entity();

		/**
		 * The meta object literal for the '{@link EER.impl.Line_RelationshipImpl <em>Line Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.Line_RelationshipImpl
		 * @see EER.impl.EERPackageImpl#getLine_Relationship()
		 * @generated
		 */
		EClass LINE_RELATIONSHIP = eINSTANCE.getLine_Relationship();

		/**
		 * The meta object literal for the '<em><b>Line Rel Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_RELATIONSHIP__LINE_REL_RELATIONSHIP = eINSTANCE.getLine_Relationship_Line_Rel_Relationship();

		/**
		 * The meta object literal for the '<em><b>Line Rel Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_RELATIONSHIP__LINE_REL_RELATION = eINSTANCE.getLine_Relationship_Line_Rel_Relation();

		/**
		 * The meta object literal for the '{@link EER.impl.Line_DependenceImpl <em>Line Dependence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.Line_DependenceImpl
		 * @see EER.impl.EERPackageImpl#getLine_Dependence()
		 * @generated
		 */
		EClass LINE_DEPENDENCE = eINSTANCE.getLine_Dependence();

		/**
		 * The meta object literal for the '<em><b>Line Dep Dependency Rel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_DEPENDENCE__LINE_DEP_DEPENDENCY_REL = eINSTANCE.getLine_Dependence_Line_Dep_Dependency_Rel();

		/**
		 * The meta object literal for the '<em><b>Line Dep Child Ent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_DEPENDENCE__LINE_DEP_CHILD_ENT = eINSTANCE.getLine_Dependence_Line_Dep_Child_Ent();

		/**
		 * The meta object literal for the '{@link EER.impl.Line_GeneralizationImpl <em>Line Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.Line_GeneralizationImpl
		 * @see EER.impl.EERPackageImpl#getLine_Generalization()
		 * @generated
		 */
		EClass LINE_GENERALIZATION = eINSTANCE.getLine_Generalization();

		/**
		 * The meta object literal for the '{@link EER.impl.AggregationImpl <em>Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.AggregationImpl
		 * @see EER.impl.EERPackageImpl#getAggregation()
		 * @generated
		 */
		EClass AGGREGATION = eINSTANCE.getAggregation();

		/**
		 * The meta object literal for the '<em><b>Aggregation Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION__AGGREGATION_ENTITY = eINSTANCE.getAggregation_Aggregation_Entity();

		/**
		 * The meta object literal for the '{@link EER.impl.Composite_ComponentImpl <em>Composite Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.Composite_ComponentImpl
		 * @see EER.impl.EERPackageImpl#getComposite_Component()
		 * @generated
		 */
		EClass COMPOSITE_COMPONENT = eINSTANCE.getComposite_Component();

		/**
		 * The meta object literal for the '<em><b>CC Line Gen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_COMPONENT__CC_LINE_GEN = eINSTANCE.getComposite_Component_CC_Line_Gen();

		/**
		 * The meta object literal for the '{@link EER.impl.Member_CollectionImpl <em>Member Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.Member_CollectionImpl
		 * @see EER.impl.EERPackageImpl#getMember_Collection()
		 * @generated
		 */
		EClass MEMBER_COLLECTION = eINSTANCE.getMember_Collection();

		/**
		 * The meta object literal for the '<em><b>MC Line Gen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_COLLECTION__MC_LINE_GEN = eINSTANCE.getMember_Collection_MC_Line_Gen();

		/**
		 * The meta object literal for the '{@link EER.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.GeneralizationImpl
		 * @see EER.impl.EERPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION__NAME = eINSTANCE.getGeneralization_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION__TYPE = eINSTANCE.getGeneralization_Type();

		/**
		 * The meta object literal for the '<em><b>Generalization Child Ent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__GENERALIZATION_CHILD_ENT = eINSTANCE.getGeneralization_Generalization_Child_Ent();

		/**
		 * The meta object literal for the '<em><b>Generalization Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__GENERALIZATION_ATTRIBUTE = eINSTANCE.getGeneralization_Generalization_Attribute();

		/**
		 * The meta object literal for the '<em><b>Generalization Line Gen</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__GENERALIZATION_LINE_GEN = eINSTANCE.getGeneralization_Generalization_Line_Gen();

		/**
		 * The meta object literal for the '{@link EER.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.MultiplicityImpl
		 * @see EER.impl.EERPackageImpl#getMultiplicity()
		 * @generated
		 */
		EClass MULTIPLICITY = eINSTANCE.getMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY__UPPER_BOUND = eINSTANCE.getMultiplicity_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY__LOWER_BOUND = eINSTANCE.getMultiplicity_LowerBound();

		/**
		 * The meta object literal for the '{@link EER.Dependency_Type <em>Dependency Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.Dependency_Type
		 * @see EER.impl.EERPackageImpl#getDependency_Type()
		 * @generated
		 */
		EEnum DEPENDENCY_TYPE = eINSTANCE.getDependency_Type();

		/**
		 * The meta object literal for the '{@link EER.Relationship_Type <em>Relationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.Relationship_Type
		 * @see EER.impl.EERPackageImpl#getRelationship_Type()
		 * @generated
		 */
		EEnum RELATIONSHIP_TYPE = eINSTANCE.getRelationship_Type();

		/**
		 * The meta object literal for the '{@link EER.Generalization_Type <em>Generalization Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.Generalization_Type
		 * @see EER.impl.EERPackageImpl#getGeneralization_Type()
		 * @generated
		 */
		EEnum GENERALIZATION_TYPE = eINSTANCE.getGeneralization_Type();

		/**
		 * The meta object literal for the '<em>Cardinality Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EER.impl.EERPackageImpl#getCardinality_Type()
		 * @generated
		 */
		EDataType CARDINALITY_TYPE = eINSTANCE.getCardinality_Type();

		/**
		 * The meta object literal for the '<em>Unbounded Natural</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.moses.sle.db.eer2sql.util.UnboundedNatural
		 * @see EER.impl.EERPackageImpl#getUnboundedNatural()
		 * @generated
		 */
		EDataType UNBOUNDED_NATURAL = eINSTANCE.getUnboundedNatural();

	}

} //EERPackage
