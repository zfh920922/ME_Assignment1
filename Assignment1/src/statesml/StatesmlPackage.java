/**
 */
package statesml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see statesml.StatesmlFactory
 * @model kind="package"
 * @generated
 */
public interface StatesmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statesml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/statesml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "statesml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesmlPackage eINSTANCE = statesml.impl.StatesmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link statesml.impl.SystemUnitsImpl <em>System Units</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.SystemUnitsImpl
	 * @see statesml.impl.StatesmlPackageImpl#getSystemUnits()
	 * @generated
	 */
	int SYSTEM_UNITS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNITS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNITS__FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNITS__ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>System Units</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNITS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>System Units</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNITS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.FunctionImpl
	 * @see statesml.impl.StatesmlPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>In Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IN_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Return Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RETURN_PARAMETER = 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.AttributeImpl
	 * @see statesml.impl.StatesmlPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATATYPE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.ParameterImpl
	 * @see statesml.impl.StatesmlPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DATATYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.DataTypeImpl
	 * @see statesml.impl.StatesmlPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__FUNCTION = 1;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.SystemUnitLibrariyImpl <em>System Unit Librariy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.SystemUnitLibrariyImpl
	 * @see statesml.impl.StatesmlPackageImpl#getSystemUnitLibrariy()
	 * @generated
	 */
	int SYSTEM_UNIT_LIBRARIY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_LIBRARIY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Systemunits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_LIBRARIY__SYSTEMUNITS = 1;

	/**
	 * The number of structural features of the '<em>System Unit Librariy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_LIBRARIY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>System Unit Librariy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_LIBRARIY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.DataTypeLibraryImpl <em>Data Type Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.DataTypeLibraryImpl
	 * @see statesml.impl.StatesmlPackageImpl#getDataTypeLibrary()
	 * @generated
	 */
	int DATA_TYPE_LIBRARY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_LIBRARY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_LIBRARY__DATATYPE = 1;

	/**
	 * The number of structural features of the '<em>Data Type Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_LIBRARY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Type Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.NodeImpl
	 * @see statesml.impl.StatesmlPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 18;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.StateImpl
	 * @see statesml.impl.StatesmlPackageImpl#getState()
	 * @generated
	 */
	int STATE = 7;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NODE = NODE__NODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.TransitionImpl
	 * @see statesml.impl.StatesmlPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 8;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NODE = NODE__NODE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRANSITION = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___FIRE = NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Activated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___IS_ACTIVATED = NODE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NODE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link statesml.impl.SelectionDivergenceImpl <em>Selection Divergence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.SelectionDivergenceImpl
	 * @see statesml.impl.StatesmlPackageImpl#getSelectionDivergence()
	 * @generated
	 */
	int SELECTION_DIVERGENCE = 9;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE__NODE = NODE__NODE;

	/**
	 * The feature id for the '<em><b>Connecting Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE__CONNECTING_EDGE = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selection Divergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Selection Divergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.SelectionConvergenceImpl <em>Selection Convergence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.SelectionConvergenceImpl
	 * @see statesml.impl.StatesmlPackageImpl#getSelectionConvergence()
	 * @generated
	 */
	int SELECTION_CONVERGENCE = 10;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE__NODE = NODE__NODE;

	/**
	 * The feature id for the '<em><b>Connecting Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE__CONNECTING_EDGES = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selection Convergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Selection Convergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.StatesMLImpl <em>States ML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.StatesMLImpl
	 * @see statesml.impl.StatesmlPackageImpl#getStatesML()
	 * @generated
	 */
	int STATES_ML = 11;

	/**
	 * The feature id for the '<em><b>Systemunits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_ML__SYSTEMUNITS = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_ML__NODE = 1;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_ML__EDGE = 2;

	/**
	 * The number of structural features of the '<em>States ML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_ML_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>States ML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_ML_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.EventImpl
	 * @see statesml.impl.StatesmlPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 12;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NODE = NODE__NODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.ChangeEventImpl <em>Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.ChangeEventImpl
	 * @see statesml.impl.StatesmlPackageImpl#getChangeEvent()
	 * @generated
	 */
	int CHANGE_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__NODE = EVENT__NODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Fulfilled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__IS_FULFILLED = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.EdgeImpl
	 * @see statesml.impl.StatesmlPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__EDGE = 1;

	/**
	 * The feature id for the '<em><b>Selectionconvergence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SELECTIONCONVERGENCE = 2;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__OUTGOING_EDGES = 3;

	/**
	 * The feature id for the '<em><b>Incoming Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__INCOMING_EDGE = 4;

	/**
	 * The feature id for the '<em><b>Connecting Edges</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__CONNECTING_EDGES = 5;

	/**
	 * The feature id for the '<em><b>Selectiondivergence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SELECTIONDIVERGENCE = 6;

	/**
	 * The feature id for the '<em><b>Connecting Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__CONNECTING_EDGE = 7;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.InitialStateImpl
	 * @see statesml.impl.StatesmlPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 15;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__NODE = STATE__NODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__IS_INITIAL = STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__INITIAL_STATE = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.NormalStateImpl <em>Normal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.NormalStateImpl
	 * @see statesml.impl.StatesmlPackageImpl#getNormalState()
	 * @generated
	 */
	int NORMAL_STATE = 16;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STATE__NODE = STATE__NODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Normal State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STATE__NORMAL_STATE = STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STATE__FUNCTION = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Normal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.TerminalStateImpl <em>Terminal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.TerminalStateImpl
	 * @see statesml.impl.StatesmlPackageImpl#getTerminalState()
	 * @generated
	 */
	int TERMINAL_STATE = 17;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_STATE__NODE = STATE__NODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Terminal States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_STATE__TERMINAL_STATES = STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_STATE__IS_TERMINAL = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Terminal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Terminal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link statesml.SystemUnits <em>System Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Units</em>'.
	 * @see statesml.SystemUnits
	 * @generated
	 */
	EClass getSystemUnits();

	/**
	 * Returns the meta object for the attribute '{@link statesml.SystemUnits#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statesml.SystemUnits#getName()
	 * @see #getSystemUnits()
	 * @generated
	 */
	EAttribute getSystemUnits_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.SystemUnits#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see statesml.SystemUnits#getFunction()
	 * @see #getSystemUnits()
	 * @generated
	 */
	EReference getSystemUnits_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.SystemUnits#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see statesml.SystemUnits#getAttribute()
	 * @see #getSystemUnits()
	 * @generated
	 */
	EReference getSystemUnits_Attribute();

	/**
	 * Returns the meta object for class '{@link statesml.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see statesml.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link statesml.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statesml.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.Function#getInParameter <em>In Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Parameter</em>'.
	 * @see statesml.Function#getInParameter()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_InParameter();

	/**
	 * Returns the meta object for the containment reference '{@link statesml.Function#getReturnParameter <em>Return Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Parameter</em>'.
	 * @see statesml.Function#getReturnParameter()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_ReturnParameter();

	/**
	 * Returns the meta object for class '{@link statesml.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see statesml.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link statesml.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statesml.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the containment reference '{@link statesml.Attribute#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datatype</em>'.
	 * @see statesml.Attribute#getDatatype()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Datatype();

	/**
	 * Returns the meta object for class '{@link statesml.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see statesml.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link statesml.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statesml.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the containment reference '{@link statesml.Parameter#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datatype</em>'.
	 * @see statesml.Parameter#getDatatype()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Datatype();

	/**
	 * Returns the meta object for class '{@link statesml.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see statesml.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link statesml.DataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statesml.DataType#getName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.DataType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see statesml.DataType#getFunction()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Function();

	/**
	 * Returns the meta object for class '{@link statesml.SystemUnitLibrariy <em>System Unit Librariy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Unit Librariy</em>'.
	 * @see statesml.SystemUnitLibrariy
	 * @generated
	 */
	EClass getSystemUnitLibrariy();

	/**
	 * Returns the meta object for the attribute '{@link statesml.SystemUnitLibrariy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statesml.SystemUnitLibrariy#getName()
	 * @see #getSystemUnitLibrariy()
	 * @generated
	 */
	EAttribute getSystemUnitLibrariy_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.SystemUnitLibrariy#getSystemunits <em>Systemunits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Systemunits</em>'.
	 * @see statesml.SystemUnitLibrariy#getSystemunits()
	 * @see #getSystemUnitLibrariy()
	 * @generated
	 */
	EReference getSystemUnitLibrariy_Systemunits();

	/**
	 * Returns the meta object for class '{@link statesml.DataTypeLibrary <em>Data Type Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Library</em>'.
	 * @see statesml.DataTypeLibrary
	 * @generated
	 */
	EClass getDataTypeLibrary();

	/**
	 * Returns the meta object for the attribute '{@link statesml.DataTypeLibrary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statesml.DataTypeLibrary#getName()
	 * @see #getDataTypeLibrary()
	 * @generated
	 */
	EAttribute getDataTypeLibrary_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.DataTypeLibrary#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatype</em>'.
	 * @see statesml.DataTypeLibrary#getDatatype()
	 * @see #getDataTypeLibrary()
	 * @generated
	 */
	EReference getDataTypeLibrary_Datatype();

	/**
	 * Returns the meta object for class '{@link statesml.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statesml.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link statesml.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statesml.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for class '{@link statesml.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statesml.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link statesml.Transition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see statesml.Transition#getEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Event();

	/**
	 * Returns the meta object for the attribute '{@link statesml.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statesml.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the reference '{@link statesml.Transition#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see statesml.Transition#getTransition()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Transition();

	/**
	 * Returns the meta object for the '{@link statesml.Transition#fire() <em>Fire</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fire</em>' operation.
	 * @see statesml.Transition#fire()
	 * @generated
	 */
	EOperation getTransition__Fire();

	/**
	 * Returns the meta object for the '{@link statesml.Transition#isActivated() <em>Is Activated</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Activated</em>' operation.
	 * @see statesml.Transition#isActivated()
	 * @generated
	 */
	EOperation getTransition__IsActivated();

	/**
	 * Returns the meta object for class '{@link statesml.SelectionDivergence <em>Selection Divergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Divergence</em>'.
	 * @see statesml.SelectionDivergence
	 * @generated
	 */
	EClass getSelectionDivergence();

	/**
	 * Returns the meta object for the reference list '{@link statesml.SelectionDivergence#getConnectingEdge <em>Connecting Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connecting Edge</em>'.
	 * @see statesml.SelectionDivergence#getConnectingEdge()
	 * @see #getSelectionDivergence()
	 * @generated
	 */
	EReference getSelectionDivergence_ConnectingEdge();

	/**
	 * Returns the meta object for class '{@link statesml.SelectionConvergence <em>Selection Convergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Convergence</em>'.
	 * @see statesml.SelectionConvergence
	 * @generated
	 */
	EClass getSelectionConvergence();

	/**
	 * Returns the meta object for the reference list '{@link statesml.SelectionConvergence#getConnectingEdges <em>Connecting Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connecting Edges</em>'.
	 * @see statesml.SelectionConvergence#getConnectingEdges()
	 * @see #getSelectionConvergence()
	 * @generated
	 */
	EReference getSelectionConvergence_ConnectingEdges();

	/**
	 * Returns the meta object for class '{@link statesml.StatesML <em>States ML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>States ML</em>'.
	 * @see statesml.StatesML
	 * @generated
	 */
	EClass getStatesML();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.StatesML#getSystemunits <em>Systemunits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Systemunits</em>'.
	 * @see statesml.StatesML#getSystemunits()
	 * @see #getStatesML()
	 * @generated
	 */
	EReference getStatesML_Systemunits();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.StatesML#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see statesml.StatesML#getNode()
	 * @see #getStatesML()
	 * @generated
	 */
	EReference getStatesML_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.StatesML#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edge</em>'.
	 * @see statesml.StatesML#getEdge()
	 * @see #getStatesML()
	 * @generated
	 */
	EReference getStatesML_Edge();

	/**
	 * Returns the meta object for class '{@link statesml.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see statesml.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link statesml.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statesml.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link statesml.ChangeEvent <em>Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Event</em>'.
	 * @see statesml.ChangeEvent
	 * @generated
	 */
	EClass getChangeEvent();

	/**
	 * Returns the meta object for the attribute '{@link statesml.ChangeEvent#isIsFulfilled <em>Is Fulfilled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Fulfilled</em>'.
	 * @see statesml.ChangeEvent#isIsFulfilled()
	 * @see #getChangeEvent()
	 * @generated
	 */
	EAttribute getChangeEvent_IsFulfilled();

	/**
	 * Returns the meta object for class '{@link statesml.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see statesml.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link statesml.Edge#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statesml.Edge#getName()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Name();

	/**
	 * Returns the meta object for the reference list '{@link statesml.Edge#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edge</em>'.
	 * @see statesml.Edge#getEdge()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Edge();

	/**
	 * Returns the meta object for the reference '{@link statesml.Edge#getSelectionconvergence <em>Selectionconvergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selectionconvergence</em>'.
	 * @see statesml.Edge#getSelectionconvergence()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Selectionconvergence();

	/**
	 * Returns the meta object for the reference '{@link statesml.Edge#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing Edges</em>'.
	 * @see statesml.Edge#getOutgoingEdges()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_OutgoingEdges();

	/**
	 * Returns the meta object for the reference '{@link statesml.Edge#getIncomingEdge <em>Incoming Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming Edge</em>'.
	 * @see statesml.Edge#getIncomingEdge()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_IncomingEdge();

	/**
	 * Returns the meta object for the reference '{@link statesml.Edge#getConnectingEdges <em>Connecting Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connecting Edges</em>'.
	 * @see statesml.Edge#getConnectingEdges()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_ConnectingEdges();

	/**
	 * Returns the meta object for the reference '{@link statesml.Edge#getSelectiondivergence <em>Selectiondivergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selectiondivergence</em>'.
	 * @see statesml.Edge#getSelectiondivergence()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Selectiondivergence();

	/**
	 * Returns the meta object for the reference list '{@link statesml.Edge#getConnectingEdge <em>Connecting Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connecting Edge</em>'.
	 * @see statesml.Edge#getConnectingEdge()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_ConnectingEdge();

	/**
	 * Returns the meta object for class '{@link statesml.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statesml.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for the attribute '{@link statesml.InitialState#isIsInitial <em>Is Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial</em>'.
	 * @see statesml.InitialState#isIsInitial()
	 * @see #getInitialState()
	 * @generated
	 */
	EAttribute getInitialState_IsInitial();

	/**
	 * Returns the meta object for the reference '{@link statesml.InitialState#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see statesml.InitialState#getInitialState()
	 * @see #getInitialState()
	 * @generated
	 */
	EReference getInitialState_InitialState();

	/**
	 * Returns the meta object for class '{@link statesml.NormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal State</em>'.
	 * @see statesml.NormalState
	 * @generated
	 */
	EClass getNormalState();

	/**
	 * Returns the meta object for the reference list '{@link statesml.NormalState#getNormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Normal State</em>'.
	 * @see statesml.NormalState#getNormalState()
	 * @see #getNormalState()
	 * @generated
	 */
	EReference getNormalState_NormalState();

	/**
	 * Returns the meta object for the reference list '{@link statesml.NormalState#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Function</em>'.
	 * @see statesml.NormalState#getFunction()
	 * @see #getNormalState()
	 * @generated
	 */
	EReference getNormalState_Function();

	/**
	 * Returns the meta object for class '{@link statesml.TerminalState <em>Terminal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal State</em>'.
	 * @see statesml.TerminalState
	 * @generated
	 */
	EClass getTerminalState();

	/**
	 * Returns the meta object for the reference '{@link statesml.TerminalState#getTerminalStates <em>Terminal States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal States</em>'.
	 * @see statesml.TerminalState#getTerminalStates()
	 * @see #getTerminalState()
	 * @generated
	 */
	EReference getTerminalState_TerminalStates();

	/**
	 * Returns the meta object for the attribute '{@link statesml.TerminalState#isIsTerminal <em>Is Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Terminal</em>'.
	 * @see statesml.TerminalState#isIsTerminal()
	 * @see #getTerminalState()
	 * @generated
	 */
	EAttribute getTerminalState_IsTerminal();

	/**
	 * Returns the meta object for class '{@link statesml.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see statesml.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link statesml.Node#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node</em>'.
	 * @see statesml.Node#getNode()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Node();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatesmlFactory getStatesmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link statesml.impl.SystemUnitsImpl <em>System Units</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.SystemUnitsImpl
		 * @see statesml.impl.StatesmlPackageImpl#getSystemUnits()
		 * @generated
		 */
		EClass SYSTEM_UNITS = eINSTANCE.getSystemUnits();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_UNITS__NAME = eINSTANCE.getSystemUnits_Name();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNITS__FUNCTION = eINSTANCE.getSystemUnits_Function();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNITS__ATTRIBUTE = eINSTANCE.getSystemUnits_Attribute();

		/**
		 * The meta object literal for the '{@link statesml.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.FunctionImpl
		 * @see statesml.impl.StatesmlPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>In Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__IN_PARAMETER = eINSTANCE.getFunction_InParameter();

		/**
		 * The meta object literal for the '<em><b>Return Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__RETURN_PARAMETER = eINSTANCE.getFunction_ReturnParameter();

		/**
		 * The meta object literal for the '{@link statesml.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.AttributeImpl
		 * @see statesml.impl.StatesmlPackageImpl#getAttribute()
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
		 * The meta object literal for the '<em><b>Datatype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__DATATYPE = eINSTANCE.getAttribute_Datatype();

		/**
		 * The meta object literal for the '{@link statesml.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.ParameterImpl
		 * @see statesml.impl.StatesmlPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__DATATYPE = eINSTANCE.getParameter_Datatype();

		/**
		 * The meta object literal for the '{@link statesml.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.DataTypeImpl
		 * @see statesml.impl.StatesmlPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__FUNCTION = eINSTANCE.getDataType_Function();

		/**
		 * The meta object literal for the '{@link statesml.impl.SystemUnitLibrariyImpl <em>System Unit Librariy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.SystemUnitLibrariyImpl
		 * @see statesml.impl.StatesmlPackageImpl#getSystemUnitLibrariy()
		 * @generated
		 */
		EClass SYSTEM_UNIT_LIBRARIY = eINSTANCE.getSystemUnitLibrariy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_UNIT_LIBRARIY__NAME = eINSTANCE.getSystemUnitLibrariy_Name();

		/**
		 * The meta object literal for the '<em><b>Systemunits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_LIBRARIY__SYSTEMUNITS = eINSTANCE.getSystemUnitLibrariy_Systemunits();

		/**
		 * The meta object literal for the '{@link statesml.impl.DataTypeLibraryImpl <em>Data Type Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.DataTypeLibraryImpl
		 * @see statesml.impl.StatesmlPackageImpl#getDataTypeLibrary()
		 * @generated
		 */
		EClass DATA_TYPE_LIBRARY = eINSTANCE.getDataTypeLibrary();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_LIBRARY__NAME = eINSTANCE.getDataTypeLibrary_Name();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_LIBRARY__DATATYPE = eINSTANCE.getDataTypeLibrary_Datatype();

		/**
		 * The meta object literal for the '{@link statesml.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.StateImpl
		 * @see statesml.impl.StatesmlPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '{@link statesml.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.TransitionImpl
		 * @see statesml.impl.StatesmlPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__EVENT = eINSTANCE.getTransition_Event();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRANSITION = eINSTANCE.getTransition_Transition();

		/**
		 * The meta object literal for the '<em><b>Fire</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___FIRE = eINSTANCE.getTransition__Fire();

		/**
		 * The meta object literal for the '<em><b>Is Activated</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___IS_ACTIVATED = eINSTANCE.getTransition__IsActivated();

		/**
		 * The meta object literal for the '{@link statesml.impl.SelectionDivergenceImpl <em>Selection Divergence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.SelectionDivergenceImpl
		 * @see statesml.impl.StatesmlPackageImpl#getSelectionDivergence()
		 * @generated
		 */
		EClass SELECTION_DIVERGENCE = eINSTANCE.getSelectionDivergence();

		/**
		 * The meta object literal for the '<em><b>Connecting Edge</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_DIVERGENCE__CONNECTING_EDGE = eINSTANCE.getSelectionDivergence_ConnectingEdge();

		/**
		 * The meta object literal for the '{@link statesml.impl.SelectionConvergenceImpl <em>Selection Convergence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.SelectionConvergenceImpl
		 * @see statesml.impl.StatesmlPackageImpl#getSelectionConvergence()
		 * @generated
		 */
		EClass SELECTION_CONVERGENCE = eINSTANCE.getSelectionConvergence();

		/**
		 * The meta object literal for the '<em><b>Connecting Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_CONVERGENCE__CONNECTING_EDGES = eINSTANCE.getSelectionConvergence_ConnectingEdges();

		/**
		 * The meta object literal for the '{@link statesml.impl.StatesMLImpl <em>States ML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.StatesMLImpl
		 * @see statesml.impl.StatesmlPackageImpl#getStatesML()
		 * @generated
		 */
		EClass STATES_ML = eINSTANCE.getStatesML();

		/**
		 * The meta object literal for the '<em><b>Systemunits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATES_ML__SYSTEMUNITS = eINSTANCE.getStatesML_Systemunits();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATES_ML__NODE = eINSTANCE.getStatesML_Node();

		/**
		 * The meta object literal for the '<em><b>Edge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATES_ML__EDGE = eINSTANCE.getStatesML_Edge();

		/**
		 * The meta object literal for the '{@link statesml.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.EventImpl
		 * @see statesml.impl.StatesmlPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link statesml.impl.ChangeEventImpl <em>Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.ChangeEventImpl
		 * @see statesml.impl.StatesmlPackageImpl#getChangeEvent()
		 * @generated
		 */
		EClass CHANGE_EVENT = eINSTANCE.getChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Is Fulfilled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_EVENT__IS_FULFILLED = eINSTANCE.getChangeEvent_IsFulfilled();

		/**
		 * The meta object literal for the '{@link statesml.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.EdgeImpl
		 * @see statesml.impl.StatesmlPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__NAME = eINSTANCE.getEdge_Name();

		/**
		 * The meta object literal for the '<em><b>Edge</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__EDGE = eINSTANCE.getEdge_Edge();

		/**
		 * The meta object literal for the '<em><b>Selectionconvergence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SELECTIONCONVERGENCE = eINSTANCE.getEdge_Selectionconvergence();

		/**
		 * The meta object literal for the '<em><b>Outgoing Edges</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__OUTGOING_EDGES = eINSTANCE.getEdge_OutgoingEdges();

		/**
		 * The meta object literal for the '<em><b>Incoming Edge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__INCOMING_EDGE = eINSTANCE.getEdge_IncomingEdge();

		/**
		 * The meta object literal for the '<em><b>Connecting Edges</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__CONNECTING_EDGES = eINSTANCE.getEdge_ConnectingEdges();

		/**
		 * The meta object literal for the '<em><b>Selectiondivergence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SELECTIONDIVERGENCE = eINSTANCE.getEdge_Selectiondivergence();

		/**
		 * The meta object literal for the '<em><b>Connecting Edge</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__CONNECTING_EDGE = eINSTANCE.getEdge_ConnectingEdge();

		/**
		 * The meta object literal for the '{@link statesml.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.InitialStateImpl
		 * @see statesml.impl.StatesmlPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIAL_STATE__IS_INITIAL = eINSTANCE.getInitialState_IsInitial();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_STATE__INITIAL_STATE = eINSTANCE.getInitialState_InitialState();

		/**
		 * The meta object literal for the '{@link statesml.impl.NormalStateImpl <em>Normal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.NormalStateImpl
		 * @see statesml.impl.StatesmlPackageImpl#getNormalState()
		 * @generated
		 */
		EClass NORMAL_STATE = eINSTANCE.getNormalState();

		/**
		 * The meta object literal for the '<em><b>Normal State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL_STATE__NORMAL_STATE = eINSTANCE.getNormalState_NormalState();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL_STATE__FUNCTION = eINSTANCE.getNormalState_Function();

		/**
		 * The meta object literal for the '{@link statesml.impl.TerminalStateImpl <em>Terminal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.TerminalStateImpl
		 * @see statesml.impl.StatesmlPackageImpl#getTerminalState()
		 * @generated
		 */
		EClass TERMINAL_STATE = eINSTANCE.getTerminalState();

		/**
		 * The meta object literal for the '<em><b>Terminal States</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL_STATE__TERMINAL_STATES = eINSTANCE.getTerminalState_TerminalStates();

		/**
		 * The meta object literal for the '<em><b>Is Terminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL_STATE__IS_TERMINAL = eINSTANCE.getTerminalState_IsTerminal();

		/**
		 * The meta object literal for the '{@link statesml.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.NodeImpl
		 * @see statesml.impl.StatesmlPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__NODE = eINSTANCE.getNode_Node();

	}

} //StatesmlPackage
