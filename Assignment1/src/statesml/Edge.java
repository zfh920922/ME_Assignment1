/**
 */
package statesml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.Edge#getName <em>Name</em>}</li>
 *   <li>{@link statesml.Edge#getEdge <em>Edge</em>}</li>
 *   <li>{@link statesml.Edge#getSelectionconvergence <em>Selectionconvergence</em>}</li>
 *   <li>{@link statesml.Edge#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link statesml.Edge#getIncomingEdge <em>Incoming Edge</em>}</li>
 *   <li>{@link statesml.Edge#getConnectingEdges <em>Connecting Edges</em>}</li>
 *   <li>{@link statesml.Edge#getSelectiondivergence <em>Selectiondivergence</em>}</li>
 *   <li>{@link statesml.Edge#getConnectingEdge <em>Connecting Edge</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see statesml.StatesmlPackage#getEdge_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link statesml.Edge#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' reference list.
	 * The list contents are of type {@link statesml.Node}.
	 * It is bidirectional and its opposite is '{@link statesml.Node#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' reference list.
	 * @see statesml.StatesmlPackage#getEdge_Edge()
	 * @see statesml.Node#getNode
	 * @model opposite="node" required="true"
	 * @generated
	 */
	EList<Node> getEdge();

	/**
	 * Returns the value of the '<em><b>Selectionconvergence</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link statesml.SelectionConvergence#getConnectingEdges <em>Connecting Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selectionconvergence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectionconvergence</em>' reference.
	 * @see #setSelectionconvergence(SelectionConvergence)
	 * @see statesml.StatesmlPackage#getEdge_Selectionconvergence()
	 * @see statesml.SelectionConvergence#getConnectingEdges
	 * @model opposite="connectingEdges"
	 * @generated
	 */
	SelectionConvergence getSelectionconvergence();

	/**
	 * Sets the value of the '{@link statesml.Edge#getSelectionconvergence <em>Selectionconvergence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectionconvergence</em>' reference.
	 * @see #getSelectionconvergence()
	 * @generated
	 */
	void setSelectionconvergence(SelectionConvergence value);

	/**
	 * Returns the value of the '<em><b>Outgoing Edges</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link statesml.TerminalState#getTerminalStates <em>Terminal States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Edges</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Edges</em>' reference.
	 * @see #setOutgoingEdges(TerminalState)
	 * @see statesml.StatesmlPackage#getEdge_OutgoingEdges()
	 * @see statesml.TerminalState#getTerminalStates
	 * @model opposite="terminalStates"
	 * @generated
	 */
	TerminalState getOutgoingEdges();

	/**
	 * Sets the value of the '{@link statesml.Edge#getOutgoingEdges <em>Outgoing Edges</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Edges</em>' reference.
	 * @see #getOutgoingEdges()
	 * @generated
	 */
	void setOutgoingEdges(TerminalState value);

	/**
	 * Returns the value of the '<em><b>Incoming Edge</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link statesml.InitialState#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Edge</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Edge</em>' reference.
	 * @see #setIncomingEdge(InitialState)
	 * @see statesml.StatesmlPackage#getEdge_IncomingEdge()
	 * @see statesml.InitialState#getInitialState
	 * @model opposite="initialState"
	 * @generated
	 */
	InitialState getIncomingEdge();

	/**
	 * Sets the value of the '{@link statesml.Edge#getIncomingEdge <em>Incoming Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Edge</em>' reference.
	 * @see #getIncomingEdge()
	 * @generated
	 */
	void setIncomingEdge(InitialState value);

	/**
	 * Returns the value of the '<em><b>Connecting Edges</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link statesml.NormalState#getNormalState <em>Normal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connecting Edges</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connecting Edges</em>' reference.
	 * @see #setConnectingEdges(NormalState)
	 * @see statesml.StatesmlPackage#getEdge_ConnectingEdges()
	 * @see statesml.NormalState#getNormalState
	 * @model opposite="normalState"
	 * @generated
	 */
	NormalState getConnectingEdges();

	/**
	 * Sets the value of the '{@link statesml.Edge#getConnectingEdges <em>Connecting Edges</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connecting Edges</em>' reference.
	 * @see #getConnectingEdges()
	 * @generated
	 */
	void setConnectingEdges(NormalState value);

	/**
	 * Returns the value of the '<em><b>Selectiondivergence</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link statesml.SelectionDivergence#getConnectingEdge <em>Connecting Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selectiondivergence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectiondivergence</em>' reference.
	 * @see #setSelectiondivergence(SelectionDivergence)
	 * @see statesml.StatesmlPackage#getEdge_Selectiondivergence()
	 * @see statesml.SelectionDivergence#getConnectingEdge
	 * @model opposite="connectingEdge"
	 * @generated
	 */
	SelectionDivergence getSelectiondivergence();

	/**
	 * Sets the value of the '{@link statesml.Edge#getSelectiondivergence <em>Selectiondivergence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectiondivergence</em>' reference.
	 * @see #getSelectiondivergence()
	 * @generated
	 */
	void setSelectiondivergence(SelectionDivergence value);

	/**
	 * Returns the value of the '<em><b>Connecting Edge</b></em>' reference list.
	 * The list contents are of type {@link statesml.Transition}.
	 * It is bidirectional and its opposite is '{@link statesml.Transition#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connecting Edge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connecting Edge</em>' reference list.
	 * @see statesml.StatesmlPackage#getEdge_ConnectingEdge()
	 * @see statesml.Transition#getTransition
	 * @model opposite="transition" lower="2" upper="2"
	 * @generated
	 */
	EList<Transition> getConnectingEdge();

} // Edge
