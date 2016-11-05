/**
 */
package statesml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.InitialState#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link statesml.InitialState#getInitialState <em>Initial State</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getInitialState()
 * @model
 * @generated
 */
public interface InitialState extends State {
	/**
	 * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial</em>' attribute.
	 * @see #setIsInitial(boolean)
	 * @see statesml.StatesmlPackage#getInitialState_IsInitial()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsInitial();

	/**
	 * Sets the value of the '{@link statesml.InitialState#isIsInitial <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial</em>' attribute.
	 * @see #isIsInitial()
	 * @generated
	 */
	void setIsInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link statesml.Edge#getIncomingEdge <em>Incoming Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(Edge)
	 * @see statesml.StatesmlPackage#getInitialState_InitialState()
	 * @see statesml.Edge#getIncomingEdge
	 * @model opposite="incomingEdge"
	 * @generated
	 */
	Edge getInitialState();

	/**
	 * Sets the value of the '{@link statesml.InitialState#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(Edge value);

} // InitialState
