/**
 */
package statesml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Unit Librariy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.SystemUnitLibrariy#getName <em>Name</em>}</li>
 *   <li>{@link statesml.SystemUnitLibrariy#getSystemunits <em>Systemunits</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getSystemUnitLibrariy()
 * @model
 * @generated
 */
public interface SystemUnitLibrariy extends EObject {
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
	 * @see statesml.StatesmlPackage#getSystemUnitLibrariy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link statesml.SystemUnitLibrariy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see statesml.StatesmlPackage#getSystemUnitLibrariy_Systemunits()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemUnits> getSystemunits();

} // SystemUnitLibrariy
