/**
 */
package statesml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import statesml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesmlFactoryImpl extends EFactoryImpl implements StatesmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatesmlFactory init() {
		try {
			StatesmlFactory theStatesmlFactory = (StatesmlFactory)EPackage.Registry.INSTANCE.getEFactory(StatesmlPackage.eNS_URI);
			if (theStatesmlFactory != null) {
				return theStatesmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatesmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesmlFactoryImpl() {
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
			case StatesmlPackage.SYSTEM_UNITS: return createSystemUnits();
			case StatesmlPackage.FUNCTION: return createFunction();
			case StatesmlPackage.ATTRIBUTE: return createAttribute();
			case StatesmlPackage.PARAMETER: return createParameter();
			case StatesmlPackage.DATA_TYPE: return createDataType();
			case StatesmlPackage.SYSTEM_UNIT_LIBRARIY: return createSystemUnitLibrariy();
			case StatesmlPackage.DATA_TYPE_LIBRARY: return createDataTypeLibrary();
			case StatesmlPackage.TRANSITION: return createTransition();
			case StatesmlPackage.SELECTION_DIVERGENCE: return createSelectionDivergence();
			case StatesmlPackage.SELECTION_CONVERGENCE: return createSelectionConvergence();
			case StatesmlPackage.STATES_ML: return createStatesML();
			case StatesmlPackage.CHANGE_EVENT: return createChangeEvent();
			case StatesmlPackage.EDGE: return createEdge();
			case StatesmlPackage.INITIAL_STATE: return createInitialState();
			case StatesmlPackage.NORMAL_STATE: return createNormalState();
			case StatesmlPackage.TERMINAL_STATE: return createTerminalState();
			case StatesmlPackage.NODE: return createNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnits createSystemUnits() {
		SystemUnitsImpl systemUnits = new SystemUnitsImpl();
		return systemUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
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
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitLibrariy createSystemUnitLibrariy() {
		SystemUnitLibrariyImpl systemUnitLibrariy = new SystemUnitLibrariyImpl();
		return systemUnitLibrariy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeLibrary createDataTypeLibrary() {
		DataTypeLibraryImpl dataTypeLibrary = new DataTypeLibraryImpl();
		return dataTypeLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionDivergence createSelectionDivergence() {
		SelectionDivergenceImpl selectionDivergence = new SelectionDivergenceImpl();
		return selectionDivergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionConvergence createSelectionConvergence() {
		SelectionConvergenceImpl selectionConvergence = new SelectionConvergenceImpl();
		return selectionConvergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesML createStatesML() {
		StatesMLImpl statesML = new StatesMLImpl();
		return statesML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEvent createChangeEvent() {
		ChangeEventImpl changeEvent = new ChangeEventImpl();
		return changeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalState createNormalState() {
		NormalStateImpl normalState = new NormalStateImpl();
		return normalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalState createTerminalState() {
		TerminalStateImpl terminalState = new TerminalStateImpl();
		return terminalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesmlPackage getStatesmlPackage() {
		return (StatesmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatesmlPackage getPackage() {
		return StatesmlPackage.eINSTANCE;
	}

} //StatesmlFactoryImpl
