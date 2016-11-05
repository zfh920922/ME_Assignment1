/**
 */
package statesml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statesml.ChangeEvent;
import statesml.StatesmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statesml.impl.ChangeEventImpl#isIsFulfilled <em>Is Fulfilled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeEventImpl extends EventImpl implements ChangeEvent {
	/**
	 * The default value of the '{@link #isIsFulfilled() <em>Is Fulfilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFulfilled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FULFILLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFulfilled() <em>Is Fulfilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFulfilled()
	 * @generated
	 * @ordered
	 */
	protected boolean isFulfilled = IS_FULFILLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesmlPackage.Literals.CHANGE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFulfilled() {
		return isFulfilled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFulfilled(boolean newIsFulfilled) {
		boolean oldIsFulfilled = isFulfilled;
		isFulfilled = newIsFulfilled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesmlPackage.CHANGE_EVENT__IS_FULFILLED, oldIsFulfilled, isFulfilled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesmlPackage.CHANGE_EVENT__IS_FULFILLED:
				return isIsFulfilled();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatesmlPackage.CHANGE_EVENT__IS_FULFILLED:
				setIsFulfilled((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatesmlPackage.CHANGE_EVENT__IS_FULFILLED:
				setIsFulfilled(IS_FULFILLED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatesmlPackage.CHANGE_EVENT__IS_FULFILLED:
				return isFulfilled != IS_FULFILLED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isFulfilled: ");
		result.append(isFulfilled);
		result.append(')');
		return result.toString();
	}

} //ChangeEventImpl
