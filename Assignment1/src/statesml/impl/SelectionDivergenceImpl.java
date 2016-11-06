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
import statesml.SelectionDivergence;
import statesml.StatesmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Divergence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statesml.impl.SelectionDivergenceImpl#getConnectingEdge <em>Connecting Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionDivergenceImpl extends NodeImpl implements SelectionDivergence {
	/**
	 * The cached value of the '{@link #getConnectingEdge() <em>Connecting Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectingEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> connectingEdge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionDivergenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesmlPackage.Literals.SELECTION_DIVERGENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getConnectingEdge() {
		if (connectingEdge == null) {
			connectingEdge = new EObjectWithInverseResolvingEList<Edge>(Edge.class, this, StatesmlPackage.SELECTION_DIVERGENCE__CONNECTING_EDGE, StatesmlPackage.EDGE__SELECTIONDIVERGENCE);
		}
		return connectingEdge;
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
			case StatesmlPackage.SELECTION_DIVERGENCE__CONNECTING_EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectingEdge()).basicAdd(otherEnd, msgs);
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
			case StatesmlPackage.SELECTION_DIVERGENCE__CONNECTING_EDGE:
				return ((InternalEList<?>)getConnectingEdge()).basicRemove(otherEnd, msgs);
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
			case StatesmlPackage.SELECTION_DIVERGENCE__CONNECTING_EDGE:
				return getConnectingEdge();
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
			case StatesmlPackage.SELECTION_DIVERGENCE__CONNECTING_EDGE:
				getConnectingEdge().clear();
				getConnectingEdge().addAll((Collection<? extends Edge>)newValue);
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
			case StatesmlPackage.SELECTION_DIVERGENCE__CONNECTING_EDGE:
				getConnectingEdge().clear();
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
			case StatesmlPackage.SELECTION_DIVERGENCE__CONNECTING_EDGE:
				return connectingEdge != null && !connectingEdge.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SelectionDivergenceImpl
