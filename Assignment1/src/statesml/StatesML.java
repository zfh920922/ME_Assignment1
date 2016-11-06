/**
 */
package statesml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>States ML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.StatesML#getSystemunits <em>Systemunits</em>}</li>
 *   <li>{@link statesml.StatesML#getNode <em>Node</em>}</li>
 *   <li>{@link statesml.StatesML#getEdge <em>Edge</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getStatesML()
 * @model
 * @generated
 */
public interface StatesML extends EObject {
	/**
	 * Returns the value of the '<em><b>Systemunits</b></em>' containment reference list.
	 * The list contents are of type {@link statesml.SystemUnits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systemunits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemunits</em>' containment reference list.
	 * @see statesml.StatesmlPackage#getStatesML_Systemunits()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemUnits> getSystemunits();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link statesml.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see statesml.StatesmlPackage#getStatesML_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
	 * The list contents are of type {@link statesml.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference list.
	 * @see statesml.StatesmlPackage#getStatesML_Edge()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdge();

} // StatesML
