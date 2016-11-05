/**
 */
package statesml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statesml.Edge;
import statesml.SelectionConvergence;
import statesml.StatesmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Convergence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statesml.impl.SelectionConvergenceImpl#getConnectingEdges <em>Connecting Edges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionConvergenceImpl extends NodeImpl implements SelectionConvergence {
	/**
	 * The cached value of the '{@link #getConnectingEdges() <em>Connecting Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectingEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> connectingEdges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionConvergenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesmlPackage.Literals.SELECTION_CONVERGENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getConnectingEdges() {
		if (connectingEdges == null) {
			connectingEdges = new EObjectWithInverseResolvingEList<Edge>(Edge.class, this, StatesmlPackage.SELECTION_CONVERGENCE__CONNECTING_EDGES, StatesmlPackage.EDGE__SELECTIONCONVERGENCE);
		}
		return connectingEdges;
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
			case StatesmlPackage.SELECTION_CONVERGENCE__CONNECTING_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectingEdges()).basicAdd(otherEnd, msgs);
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
			case StatesmlPackage.SELECTION_CONVERGENCE__CONNECTING_EDGES:
				return ((InternalEList<?>)getConnectingEdges()).basicRemove(otherEnd, msgs);
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
			case StatesmlPackage.SELECTION_CONVERGENCE__CONNECTING_EDGES:
				return getConnectingEdges();
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
			case StatesmlPackage.SELECTION_CONVERGENCE__CONNECTING_EDGES:
				getConnectingEdges().clear();
				getConnectingEdges().addAll((Collection<? extends Edge>)newValue);
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
			case StatesmlPackage.SELECTION_CONVERGENCE__CONNECTING_EDGES:
				getConnectingEdges().clear();
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
			case StatesmlPackage.SELECTION_CONVERGENCE__CONNECTING_EDGES:
				return connectingEdges != null && !connectingEdges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SelectionConvergenceImpl
