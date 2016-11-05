/**
 */
package statesml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.Node#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference list.
	 * The list contents are of type {@link statesml.Edge}.
	 * It is bidirectional and its opposite is '{@link statesml.Edge#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference list.
	 * @see statesml.StatesmlPackage#getNode_Node()
	 * @see statesml.Edge#getEdge
	 * @model opposite="edge" lower="2" upper="2"
	 * @generated
	 */
	EList<Edge> getNode();

} // Node
