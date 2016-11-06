/**
 */
package statesml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statesml.Edge;
import statesml.Function;
import statesml.NormalState;
import statesml.StatesmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statesml.impl.NormalStateImpl#getNormalState <em>Normal State</em>}</li>
 *   <li>{@link statesml.impl.NormalStateImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalStateImpl extends StateImpl implements NormalState {
	/**
	 * The cached value of the '{@link #getNormalState() <em>Normal State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalState()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> normalState;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesmlPackage.Literals.NORMAL_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getNormalState() {
		if (normalState == null) {
			normalState = new EObjectWithInverseResolvingEList<Edge>(Edge.class, this, StatesmlPackage.NORMAL_STATE__NORMAL_STATE, StatesmlPackage.EDGE__CONNECTING_EDGES);
		}
		return normalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunction() {
		if (function == null) {
			function = new EObjectResolvingEList<Function>(Function.class, this, StatesmlPackage.NORMAL_STATE__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesmlPackage.NORMAL_STATE__NORMAL_STATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNormalState()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesmlPackage.NORMAL_STATE__NORMAL_STATE:
				return ((InternalEList<?>)getNormalState()).basicRemove(otherEnd, msgs);
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
			case StatesmlPackage.NORMAL_STATE__NORMAL_STATE:
				return getNormalState();
			case StatesmlPackage.NORMAL_STATE__FUNCTION:
				return getFunction();
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
			case StatesmlPackage.NORMAL_STATE__NORMAL_STATE:
				getNormalState().clear();
				getNormalState().addAll((Collection<? extends Edge>)newValue);
				return;
			case StatesmlPackage.NORMAL_STATE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends Function>)newValue);
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
			case StatesmlPackage.NORMAL_STATE__NORMAL_STATE:
				getNormalState().clear();
				return;
			case StatesmlPackage.NORMAL_STATE__FUNCTION:
				getFunction().clear();
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
			case StatesmlPackage.NORMAL_STATE__NORMAL_STATE:
				return normalState != null && !normalState.isEmpty();
			case StatesmlPackage.NORMAL_STATE__FUNCTION:
				return function != null && !function.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NormalStateImpl
