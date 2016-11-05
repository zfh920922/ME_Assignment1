/**
 */
package statesml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Convergence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.SelectionConvergence#getConnectingEdges <em>Connecting Edges</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getSelectionConvergence()
 * @model
 * @generated
 */
public interface SelectionConvergence extends Node {
	/**
	 * Returns the value of the '<em><b>Connecting Edges</b></em>' reference list.
	 * The list contents are of type {@link statesml.Edge}.
	 * It is bidirectional and its opposite is '{@link statesml.Edge#getSelectionconvergence <em>Selectionconvergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connecting Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connecting Edges</em>' reference list.
	 * @see statesml.StatesmlPackage#getSelectionConvergence_ConnectingEdges()
	 * @see statesml.Edge#getSelectionconvergence
	 * @model opposite="selectionconvergence" lower="2" upper="2"
	 * @generated
	 */
	EList<Edge> getConnectingEdges();

} // SelectionConvergence
