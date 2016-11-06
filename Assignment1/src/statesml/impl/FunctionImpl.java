/**
 */
package statesml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statesml.Function;
import statesml.Parameter;
import statesml.StatesmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statesml.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link statesml.impl.FunctionImpl#getInParameter <em>In Parameter</em>}</li>
 *   <li>{@link statesml.impl.FunctionImpl#getReturnParameter <em>Return Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInParameter() <em>In Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> inParameter;

	/**
	 * The cached value of the '{@link #getReturnParameter() <em>Return Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter returnParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesmlPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesmlPackage.FUNCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getInParameter() {
		if (inParameter == null) {
			inParameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, StatesmlPackage.FUNCTION__IN_PARAMETER);
		}
		return inParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getReturnParameter() {
		return returnParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnParameter(Parameter newReturnParameter, NotificationChain msgs) {
		Parameter oldReturnParameter = returnParameter;
		returnParameter = newReturnParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatesmlPackage.FUNCTION__RETURN_PARAMETER, oldReturnParameter, newReturnParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnParameter(Parameter newReturnParameter) {
		if (newReturnParameter != returnParameter) {
			NotificationChain msgs = null;
			if (returnParameter != null)
				msgs = ((InternalEObject)returnParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatesmlPackage.FUNCTION__RETURN_PARAMETER, null, msgs);
			if (newReturnParameter != null)
				msgs = ((InternalEObject)newReturnParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatesmlPackage.FUNCTION__RETURN_PARAMETER, null, msgs);
			msgs = basicSetReturnParameter(newReturnParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesmlPackage.FUNCTION__RETURN_PARAMETER, newReturnParameter, newReturnParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesmlPackage.FUNCTION__IN_PARAMETER:
				return ((InternalEList<?>)getInParameter()).basicRemove(otherEnd, msgs);
			case StatesmlPackage.FUNCTION__RETURN_PARAMETER:
				return basicSetReturnParameter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesmlPackage.FUNCTION__NAME:
				return getName();
			case StatesmlPackage.FUNCTION__IN_PARAMETER:
				return getInParameter();
			case StatesmlPackage.FUNCTION__RETURN_PARAMETER:
				return getReturnParameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatesmlPackage.FUNCTION__NAME:
				setName((String)newValue);
				return;
			case StatesmlPackage.FUNCTION__IN_PARAMETER:
				getInParameter().clear();
				getInParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case StatesmlPackage.FUNCTION__RETURN_PARAMETER:
				setReturnParameter((Parameter)newValue);
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
			case StatesmlPackage.FUNCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StatesmlPackage.FUNCTION__IN_PARAMETER:
				getInParameter().clear();
				return;
			case StatesmlPackage.FUNCTION__RETURN_PARAMETER:
				setReturnParameter((Parameter)null);
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
			case StatesmlPackage.FUNCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StatesmlPackage.FUNCTION__IN_PARAMETER:
				return inParameter != null && !inParameter.isEmpty();
			case StatesmlPackage.FUNCTION__RETURN_PARAMETER:
				return returnParameter != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
