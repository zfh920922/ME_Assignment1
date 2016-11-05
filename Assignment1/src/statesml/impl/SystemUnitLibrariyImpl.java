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

import statesml.StatesmlPackage;
import statesml.SystemUnitLibrariy;
import statesml.SystemUnits;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Unit Librariy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statesml.impl.SystemUnitLibrariyImpl#getName <em>Name</em>}</li>
 *   <li>{@link statesml.impl.SystemUnitLibrariyImpl#getSystemunits <em>Systemunits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemUnitLibrariyImpl extends MinimalEObjectImpl.Container implements SystemUnitLibrariy {
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
	 * The cached value of the '{@link #getSystemunits() <em>Systemunits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemunits()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemUnits> systemunits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemUnitLibrariyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesmlPackage.Literals.SYSTEM_UNIT_LIBRARIY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatesmlPackage.SYSTEM_UNIT_LIBRARIY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemUnits> getSystemunits() {
		if (systemunits == null) {
			systemunits = new EObjectContainmentEList<SystemUnits>(SystemUnits.class, this, StatesmlPackage.SYSTEM_UNIT_LIBRARIY__SYSTEMUNITS);
		}
		return systemunits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesmlPackage.SYSTEM_UNIT_LIBRARIY__SYSTEMUNITS:
				return ((InternalEList<?>)getSystemunits()).basicRemove(otherEnd, msgs);
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
			case StatesmlPackage.SYSTEM_UNIT_LIBRARIY__NAME:
				return getName();
			case StatesmlPackage.SYSTEM_UNIT_LIBRARIY__SYSTEMUNITS:
				return getSystemunits();
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
			case StatesmlPackage.SYSTEM_UNIT_LIBRARIY__NAME:
				setName((String)newValue);
				return;
			case StatesmlPackage.SYSTEM_UNIT_LIBRARIY__SYSTEMUNITS:
				getSystemunits().clear();
				getSystemunits().addAll((Collection<? extends SystemUnits>)newValue);
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
			case StatesmlPackage.SYSTEM_UNIT_LIBRARIY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StatesmlPackage.SYSTEM_UNIT_LIBRARIY__SYSTEMUNITS:
				getSystemunits().clear();
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
			case StatesmlPackage.SYSTEM_UNIT_LIBRARIY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StatesmlPackage.SYSTEM_UNIT_LIBRARIY__SYSTEMUNITS:
				return systemunits != null && !systemunits.isEmpty();
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

} //SystemUnitLibrariyImpl
