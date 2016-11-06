/**
 */
package statesml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.TerminalState#getTerminalStates <em>Terminal States</em>}</li>
 *   <li>{@link statesml.TerminalState#isIsTerminal <em>Is Terminal</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getTerminalState()
 * @model
 * @generated
 */
public interface TerminalState extends State {
	/**
	 * Returns the value of the '<em><b>Terminal States</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link statesml.Edge#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal States</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal States</em>' reference.
	 * @see #setTerminalStates(Edge)
	 * @see statesml.StatesmlPackage#getTerminalState_TerminalStates()
	 * @see statesml.Edge#getOutgoingEdges
	 * @model opposite="outgoingEdges"
	 * @generated
	 */
	Edge getTerminalStates();

	/**
	 * Sets the value of the '{@link statesml.TerminalState#getTerminalStates <em>Terminal States</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal States</em>' reference.
	 * @see #getTerminalStates()
	 * @generated
	 */
	void setTerminalStates(Edge value);

	/**
	 * Returns the value of the '<em><b>Is Terminal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Terminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Terminal</em>' attribute.
	 * @see #setIsTerminal(boolean)
	 * @see statesml.StatesmlPackage#getTerminalState_IsTerminal()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsTerminal();

	/**
	 * Sets the value of the '{@link statesml.TerminalState#isIsTerminal <em>Is Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Terminal</em>' attribute.
	 * @see #isIsTerminal()
	 * @generated
	 */
	void setIsTerminal(boolean value);

} // TerminalState
