/**
 */
package statesml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.NormalState#getNormalState <em>Normal State</em>}</li>
 *   <li>{@link statesml.NormalState#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getNormalState()
 * @model
 * @generated
 */
public interface NormalState extends State {
	/**
	 * Returns the value of the '<em><b>Normal State</b></em>' reference list.
	 * The list contents are of type {@link statesml.Edge}.
	 * It is bidirectional and its opposite is '{@link statesml.Edge#getConnectingEdges <em>Connecting Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal State</em>' reference list.
	 * @see statesml.StatesmlPackage#getNormalState_NormalState()
	 * @see statesml.Edge#getConnectingEdges
	 * @model opposite="connectingEdges" lower="2" upper="2"
	 * @generated
	 */
	EList<Edge> getNormalState();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference list.
	 * The list contents are of type {@link statesml.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference list.
	 * @see statesml.StatesmlPackage#getNormalState_Function()
	 * @model
	 * @generated
	 */
	EList<Function> getFunction();

} // NormalState
