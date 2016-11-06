/**
 */
package statesml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Divergence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.SelectionDivergence#getConnectingEdge <em>Connecting Edge</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getSelectionDivergence()
 * @model
 * @generated
 */
public interface SelectionDivergence extends Node {
	/**
	 * Returns the value of the '<em><b>Connecting Edge</b></em>' reference list.
	 * The list contents are of type {@link statesml.Edge}.
	 * It is bidirectional and its opposite is '{@link statesml.Edge#getSelectiondivergence <em>Selectiondivergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connecting Edge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connecting Edge</em>' reference list.
	 * @see statesml.StatesmlPackage#getSelectionDivergence_ConnectingEdge()
	 * @see statesml.Edge#getSelectiondivergence
	 * @model opposite="selectiondivergence" lower="2" upper="2"
	 * @generated
	 */
	EList<Edge> getConnectingEdge();

} // SelectionDivergence
