/**
 */
package statesml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.Function#getName <em>Name</em>}</li>
 *   <li>{@link statesml.Function#getInParameter <em>In Parameter</em>}</li>
 *   <li>{@link statesml.Function#getReturnParameter <em>Return Parameter</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject {
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
	 * @see statesml.StatesmlPackage#getFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link statesml.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>In Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link statesml.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Parameter</em>' containment reference list.
	 * @see statesml.StatesmlPackage#getFunction_InParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getInParameter();

	/**
	 * Returns the value of the '<em><b>Return Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Parameter</em>' containment reference.
	 * @see #setReturnParameter(Parameter)
	 * @see statesml.StatesmlPackage#getFunction_ReturnParameter()
	 * @model containment="true"
	 * @generated
	 */
	Parameter getReturnParameter();

	/**
	 * Sets the value of the '{@link statesml.Function#getReturnParameter <em>Return Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Parameter</em>' containment reference.
	 * @see #getReturnParameter()
	 * @generated
	 */
	void setReturnParameter(Parameter value);

} // Function
