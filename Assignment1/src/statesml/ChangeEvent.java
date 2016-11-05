/**
 */
package statesml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.ChangeEvent#isIsFulfilled <em>Is Fulfilled</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getChangeEvent()
 * @model
 * @generated
 */
public interface ChangeEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Is Fulfilled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Fulfilled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Fulfilled</em>' attribute.
	 * @see #setIsFulfilled(boolean)
	 * @see statesml.StatesmlPackage#getChangeEvent_IsFulfilled()
	 * @model
	 * @generated
	 */
	boolean isIsFulfilled();

	/**
	 * Sets the value of the '{@link statesml.ChangeEvent#isIsFulfilled <em>Is Fulfilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fulfilled</em>' attribute.
	 * @see #isIsFulfilled()
	 * @generated
	 */
	void setIsFulfilled(boolean value);

} // ChangeEvent
