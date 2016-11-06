/**
 */
package statesml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statesml.Edge;
import statesml.Node;
import statesml.StatesML;
import statesml.StatesmlPackage;
import statesml.SystemUnits;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>States ML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statesml.impl.StatesMLImpl#getSystemunits <em>Systemunits</em>}</li>
 *   <li>{@link statesml.impl.StatesMLImpl#getNode <em>Node</em>}</li>
 *   <li>{@link statesml.impl.StatesMLImpl#getEdge <em>Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatesMLImpl extends MinimalEObjectImpl.Container implements StatesML {
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
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatesMLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesmlPackage.Literals.STATES_ML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemUnits> getSystemunits() {
		if (systemunits == null) {
			systemunits = new EObjectContainmentEList<SystemUnits>(SystemUnits.class, this, StatesmlPackage.STATES_ML__SYSTEMUNITS);
		}
		return systemunits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<Node>(Node.class, this, StatesmlPackage.STATES_ML__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdge() {
		if (edge == null) {
			edge = new EObjectContainmentEList<Edge>(Edge.class, this, StatesmlPackage.STATES_ML__EDGE);
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesmlPackage.STATES_ML__SYSTEMUNITS:
				return ((InternalEList<?>)getSystemunits()).basicRemove(otherEnd, msgs);
			case StatesmlPackage.STATES_ML__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case StatesmlPackage.STATES_ML__EDGE:
				return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
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
			case StatesmlPackage.STATES_ML__SYSTEMUNITS:
				return getSystemunits();
			case StatesmlPackage.STATES_ML__NODE:
				return getNode();
			case StatesmlPackage.STATES_ML__EDGE:
				return getEdge();
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
			case StatesmlPackage.STATES_ML__SYSTEMUNITS:
				getSystemunits().clear();
				getSystemunits().addAll((Collection<? extends SystemUnits>)newValue);
				return;
			case StatesmlPackage.STATES_ML__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends Node>)newValue);
				return;
			case StatesmlPackage.STATES_ML__EDGE:
				getEdge().clear();
				getEdge().addAll((Collection<? extends Edge>)newValue);
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
			case StatesmlPackage.STATES_ML__SYSTEMUNITS:
				getSystemunits().clear();
				return;
			case StatesmlPackage.STATES_ML__NODE:
				getNode().clear();
				return;
			case StatesmlPackage.STATES_ML__EDGE:
				getEdge().clear();
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
			case StatesmlPackage.STATES_ML__SYSTEMUNITS:
				return systemunits != null && !systemunits.isEmpty();
			case StatesmlPackage.STATES_ML__NODE:
				return node != null && !node.isEmpty();
			case StatesmlPackage.STATES_ML__EDGE:
				return edge != null && !edge.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StatesMLImpl
