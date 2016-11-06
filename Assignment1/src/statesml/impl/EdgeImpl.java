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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statesml.Edge;
import statesml.InitialState;
import statesml.Node;
import statesml.NormalState;
import statesml.SelectionConvergence;
import statesml.SelectionDivergence;
import statesml.StatesmlPackage;
import statesml.TerminalState;
import statesml.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statesml.impl.EdgeImpl#getName <em>Name</em>}</li>
 *   <li>{@link statesml.impl.EdgeImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link statesml.impl.EdgeImpl#getSelectionconvergence <em>Selectionconvergence</em>}</li>
 *   <li>{@link statesml.impl.EdgeImpl#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link statesml.impl.EdgeImpl#getIncomingEdge <em>Incoming Edge</em>}</li>
 *   <li>{@link statesml.impl.EdgeImpl#getConnectingEdges <em>Connecting Edges</em>}</li>
 *   <li>{@link statesml.impl.EdgeImpl#getSelectiondivergence <em>Selectiondivergence</em>}</li>
 *   <li>{@link statesml.impl.EdgeImpl#getConnectingEdge <em>Connecting Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeImpl extends MinimalEObjectImpl.Container implements Edge {
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
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> edge;

	/**
	 * The cached value of the '{@link #getSelectionconvergence() <em>Selectionconvergence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionconvergence()
	 * @generated
	 * @ordered
	 */
	protected SelectionConvergence selectionconvergence;

	/**
	 * The cached value of the '{@link #getOutgoingEdges() <em>Outgoing Edges</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingEdges()
	 * @generated
	 * @ordered
	 */
	protected TerminalState outgoingEdges;

	/**
	 * The cached value of the '{@link #getIncomingEdge() <em>Incoming Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingEdge()
	 * @generated
	 * @ordered
	 */
	protected InitialState incomingEdge;

	/**
	 * The cached value of the '{@link #getConnectingEdges() <em>Connecting Edges</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectingEdges()
	 * @generated
	 * @ordered
	 */
	protected NormalState connectingEdges;

	/**
	 * The cached value of the '{@link #getSelectiondivergence() <em>Selectiondivergence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectiondivergence()
	 * @generated
	 * @ordered
	 */
	protected SelectionDivergence selectiondivergence;

	/**
	 * The cached value of the '{@link #getConnectingEdge() <em>Connecting Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectingEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> connectingEdge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesmlPackage.Literals.EDGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatesmlPackage.EDGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEdge() {
		if (edge == null) {
			edge = new EObjectWithInverseResolvingEList.ManyInverse<Node>(Node.class, this, StatesmlPackage.EDGE__EDGE, StatesmlPackage.NODE__NODE);
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionConvergence getSelectionconvergence() {
		if (selectionconvergence != null && selectionconvergence.eIsProxy()) {
			InternalEObject oldSelectionconvergence = (InternalEObject)selectionconvergence;
			selectionconvergence = (SelectionConvergence)eResolveProxy(oldSelectionconvergence);
			if (selectionconvergence != oldSelectionconvergence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesmlPackage.EDGE__SELECTIONCONVERGENCE, oldSelectionconvergence, selectionconvergence));
			}
		}
		return selectionconvergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionConvergence basicGetSelectionconvergence() {
		return selectionconvergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectionconvergence(SelectionConvergence newSelectionconvergence, NotificationChain msgs) {
		SelectionConvergence oldSelectionconvergence = selectionconvergence;
		selectionconvergence = newSelectionconvergence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatesmlPackage.EDGE__SELECTIONCONVERGENCE, oldSelectionconvergence, newSelectionconvergence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionconvergence(SelectionConvergence newSelectionconvergence) {
		if (newSelectionconvergence != selectionconvergence) {
			NotificationChain msgs = null;
			if (selectionconvergence != null)
				msgs = ((InternalEObject)selectionconvergence).eInverseRemove(this, StatesmlPackage.SELECTION_CONVERGENCE__CONNECTING_EDGES, SelectionConvergence.class, msgs);
			if (newSelectionconvergence != null)
				msgs = ((InternalEObject)newSelectionconvergence).eInverseAdd(this, StatesmlPackage.SELECTION_CONVERGENCE__CONNECTING_EDGES, SelectionConvergence.class, msgs);
			msgs = basicSetSelectionconvergence(newSelectionconvergence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesmlPackage.EDGE__SELECTIONCONVERGENCE, newSelectionconvergence, newSelectionconvergence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalState getOutgoingEdges() {
		if (outgoingEdges != null && outgoingEdges.eIsProxy()) {
			InternalEObject oldOutgoingEdges = (InternalEObject)outgoingEdges;
			outgoingEdges = (TerminalState)eResolveProxy(oldOutgoingEdges);
			if (outgoingEdges != oldOutgoingEdges) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesmlPackage.EDGE__OUTGOING_EDGES, oldOutgoingEdges, outgoingEdges));
			}
		}
		return outgoingEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalState basicGetOutgoingEdges() {
		return outgoingEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoingEdges(TerminalState newOutgoingEdges, NotificationChain msgs) {
		TerminalState oldOutgoingEdges = outgoingEdges;
		outgoingEdges = newOutgoingEdges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatesmlPackage.EDGE__OUTGOING_EDGES, oldOutgoingEdges, newOutgoingEdges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoingEdges(TerminalState newOutgoingEdges) {
		if (newOutgoingEdges != outgoingEdges) {
			NotificationChain msgs = null;
			if (outgoingEdges != null)
				msgs = ((InternalEObject)outgoingEdges).eInverseRemove(this, StatesmlPackage.TERMINAL_STATE__TERMINAL_STATES, TerminalState.class, msgs);
			if (newOutgoingEdges != null)
				msgs = ((InternalEObject)newOutgoingEdges).eInverseAdd(this, StatesmlPackage.TERMINAL_STATE__TERMINAL_STATES, TerminalState.class, msgs);
			msgs = basicSetOutgoingEdges(newOutgoingEdges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesmlPackage.EDGE__OUTGOING_EDGES, newOutgoingEdges, newOutgoingEdges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState getIncomingEdge() {
		if (incomingEdge != null && incomingEdge.eIsProxy()) {
			InternalEObject oldIncomingEdge = (InternalEObject)incomingEdge;
			incomingEdge = (InitialState)eResolveProxy(oldIncomingEdge);
			if (incomingEdge != oldIncomingEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesmlPackage.EDGE__INCOMING_EDGE, oldIncomingEdge, incomingEdge));
			}
		}
		return incomingEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState basicGetIncomingEdge() {
		return incomingEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingEdge(InitialState newIncomingEdge, NotificationChain msgs) {
		InitialState oldIncomingEdge = incomingEdge;
		incomingEdge = newIncomingEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatesmlPackage.EDGE__INCOMING_EDGE, oldIncomingEdge, newIncomingEdge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingEdge(InitialState newIncomingEdge) {
		if (newIncomingEdge != incomingEdge) {
			NotificationChain msgs = null;
			if (incomingEdge != null)
				msgs = ((InternalEObject)incomingEdge).eInverseRemove(this, StatesmlPackage.INITIAL_STATE__INITIAL_STATE, InitialState.class, msgs);
			if (newIncomingEdge != null)
				msgs = ((InternalEObject)newIncomingEdge).eInverseAdd(this, StatesmlPackage.INITIAL_STATE__INITIAL_STATE, InitialState.class, msgs);
			msgs = basicSetIncomingEdge(newIncomingEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesmlPackage.EDGE__INCOMING_EDGE, newIncomingEdge, newIncomingEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalState getConnectingEdges() {
		if (connectingEdges != null && connectingEdges.eIsProxy()) {
			InternalEObject oldConnectingEdges = (InternalEObject)connectingEdges;
			connectingEdges = (NormalState)eResolveProxy(oldConnectingEdges);
			if (connectingEdges != oldConnectingEdges) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesmlPackage.EDGE__CONNECTING_EDGES, oldConnectingEdges, connectingEdges));
			}
		}
		return connectingEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalState basicGetConnectingEdges() {
		return connectingEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectingEdges(NormalState newConnectingEdges, NotificationChain msgs) {
		NormalState oldConnectingEdges = connectingEdges;
		connectingEdges = newConnectingEdges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatesmlPackage.EDGE__CONNECTING_EDGES, oldConnectingEdges, newConnectingEdges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectingEdges(NormalState newConnectingEdges) {
		if (newConnectingEdges != connectingEdges) {
			NotificationChain msgs = null;
			if (connectingEdges != null)
				msgs = ((InternalEObject)connectingEdges).eInverseRemove(this, StatesmlPackage.NORMAL_STATE__NORMAL_STATE, NormalState.class, msgs);
			if (newConnectingEdges != null)
				msgs = ((InternalEObject)newConnectingEdges).eInverseAdd(this, StatesmlPackage.NORMAL_STATE__NORMAL_STATE, NormalState.class, msgs);
			msgs = basicSetConnectingEdges(newConnectingEdges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesmlPackage.EDGE__CONNECTING_EDGES, newConnectingEdges, newConnectingEdges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionDivergence getSelectiondivergence() {
		if (selectiondivergence != null && selectiondivergence.eIsProxy()) {
			InternalEObject oldSelectiondivergence = (InternalEObject)selectiondivergence;
			selectiondivergence = (SelectionDivergence)eResolveProxy(oldSelectiondivergence);
			if (selectiondivergence != oldSelectiondivergence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesmlPackage.EDGE__SELECTIONDIVERGENCE, oldSelectiondivergence, selectiondivergence));
			}
		}
		return selectiondivergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionDivergence basicGetSelectiondivergence() {
		return selectiondivergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectiondivergence(SelectionDivergence newSelectiondivergence, NotificationChain msgs) {
		SelectionDivergence oldSelectiondivergence = selectiondivergence;
		selectiondivergence = newSelectiondivergence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatesmlPackage.EDGE__SELECTIONDIVERGENCE, oldSelectiondivergence, newSelectiondivergence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectiondivergence(SelectionDivergence newSelectiondivergence) {
		if (newSelectiondivergence != selectiondivergence) {
			NotificationChain msgs = null;
			if (selectiondivergence != null)
				msgs = ((InternalEObject)selectiondivergence).eInverseRemove(this, StatesmlPackage.SELECTION_DIVERGENCE__CONNECTING_EDGE, SelectionDivergence.class, msgs);
			if (newSelectiondivergence != null)
				msgs = ((InternalEObject)newSelectiondivergence).eInverseAdd(this, StatesmlPackage.SELECTION_DIVERGENCE__CONNECTING_EDGE, SelectionDivergence.class, msgs);
			msgs = basicSetSelectiondivergence(newSelectiondivergence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesmlPackage.EDGE__SELECTIONDIVERGENCE, newSelectiondivergence, newSelectiondivergence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getConnectingEdge() {
		if (connectingEdge == null) {
			connectingEdge = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, StatesmlPackage.EDGE__CONNECTING_EDGE, StatesmlPackage.TRANSITION__TRANSITION);
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
			case StatesmlPackage.EDGE__EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdge()).basicAdd(otherEnd, msgs);
			case StatesmlPackage.EDGE__SELECTIONCONVERGENCE:
				if (selectionconvergence != null)
					msgs = ((InternalEObject)selectionconvergence).eInverseRemove(this, StatesmlPackage.SELECTION_CONVERGENCE__CONNECTING_EDGES, SelectionConvergence.class, msgs);
				return basicSetSelectionconvergence((SelectionConvergence)otherEnd, msgs);
			case StatesmlPackage.EDGE__OUTGOING_EDGES:
				if (outgoingEdges != null)
					msgs = ((InternalEObject)outgoingEdges).eInverseRemove(this, StatesmlPackage.TERMINAL_STATE__TERMINAL_STATES, TerminalState.class, msgs);
				return basicSetOutgoingEdges((TerminalState)otherEnd, msgs);
			case StatesmlPackage.EDGE__INCOMING_EDGE:
				if (incomingEdge != null)
					msgs = ((InternalEObject)incomingEdge).eInverseRemove(this, StatesmlPackage.INITIAL_STATE__INITIAL_STATE, InitialState.class, msgs);
				return basicSetIncomingEdge((InitialState)otherEnd, msgs);
			case StatesmlPackage.EDGE__CONNECTING_EDGES:
				if (connectingEdges != null)
					msgs = ((InternalEObject)connectingEdges).eInverseRemove(this, StatesmlPackage.NORMAL_STATE__NORMAL_STATE, NormalState.class, msgs);
				return basicSetConnectingEdges((NormalState)otherEnd, msgs);
			case StatesmlPackage.EDGE__SELECTIONDIVERGENCE:
				if (selectiondivergence != null)
					msgs = ((InternalEObject)selectiondivergence).eInverseRemove(this, StatesmlPackage.SELECTION_DIVERGENCE__CONNECTING_EDGE, SelectionDivergence.class, msgs);
				return basicSetSelectiondivergence((SelectionDivergence)otherEnd, msgs);
			case StatesmlPackage.EDGE__CONNECTING_EDGE:
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
			case StatesmlPackage.EDGE__EDGE:
				return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
			case StatesmlPackage.EDGE__SELECTIONCONVERGENCE:
				return basicSetSelectionconvergence(null, msgs);
			case StatesmlPackage.EDGE__OUTGOING_EDGES:
				return basicSetOutgoingEdges(null, msgs);
			case StatesmlPackage.EDGE__INCOMING_EDGE:
				return basicSetIncomingEdge(null, msgs);
			case StatesmlPackage.EDGE__CONNECTING_EDGES:
				return basicSetConnectingEdges(null, msgs);
			case StatesmlPackage.EDGE__SELECTIONDIVERGENCE:
				return basicSetSelectiondivergence(null, msgs);
			case StatesmlPackage.EDGE__CONNECTING_EDGE:
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
			case StatesmlPackage.EDGE__NAME:
				return getName();
			case StatesmlPackage.EDGE__EDGE:
				return getEdge();
			case StatesmlPackage.EDGE__SELECTIONCONVERGENCE:
				if (resolve) return getSelectionconvergence();
				return basicGetSelectionconvergence();
			case StatesmlPackage.EDGE__OUTGOING_EDGES:
				if (resolve) return getOutgoingEdges();
				return basicGetOutgoingEdges();
			case StatesmlPackage.EDGE__INCOMING_EDGE:
				if (resolve) return getIncomingEdge();
				return basicGetIncomingEdge();
			case StatesmlPackage.EDGE__CONNECTING_EDGES:
				if (resolve) return getConnectingEdges();
				return basicGetConnectingEdges();
			case StatesmlPackage.EDGE__SELECTIONDIVERGENCE:
				if (resolve) return getSelectiondivergence();
				return basicGetSelectiondivergence();
			case StatesmlPackage.EDGE__CONNECTING_EDGE:
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
			case StatesmlPackage.EDGE__NAME:
				setName((String)newValue);
				return;
			case StatesmlPackage.EDGE__EDGE:
				getEdge().clear();
				getEdge().addAll((Collection<? extends Node>)newValue);
				return;
			case StatesmlPackage.EDGE__SELECTIONCONVERGENCE:
				setSelectionconvergence((SelectionConvergence)newValue);
				return;
			case StatesmlPackage.EDGE__OUTGOING_EDGES:
				setOutgoingEdges((TerminalState)newValue);
				return;
			case StatesmlPackage.EDGE__INCOMING_EDGE:
				setIncomingEdge((InitialState)newValue);
				return;
			case StatesmlPackage.EDGE__CONNECTING_EDGES:
				setConnectingEdges((NormalState)newValue);
				return;
			case StatesmlPackage.EDGE__SELECTIONDIVERGENCE:
				setSelectiondivergence((SelectionDivergence)newValue);
				return;
			case StatesmlPackage.EDGE__CONNECTING_EDGE:
				getConnectingEdge().clear();
				getConnectingEdge().addAll((Collection<? extends Transition>)newValue);
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
			case StatesmlPackage.EDGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StatesmlPackage.EDGE__EDGE:
				getEdge().clear();
				return;
			case StatesmlPackage.EDGE__SELECTIONCONVERGENCE:
				setSelectionconvergence((SelectionConvergence)null);
				return;
			case StatesmlPackage.EDGE__OUTGOING_EDGES:
				setOutgoingEdges((TerminalState)null);
				return;
			case StatesmlPackage.EDGE__INCOMING_EDGE:
				setIncomingEdge((InitialState)null);
				return;
			case StatesmlPackage.EDGE__CONNECTING_EDGES:
				setConnectingEdges((NormalState)null);
				return;
			case StatesmlPackage.EDGE__SELECTIONDIVERGENCE:
				setSelectiondivergence((SelectionDivergence)null);
				return;
			case StatesmlPackage.EDGE__CONNECTING_EDGE:
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
			case StatesmlPackage.EDGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StatesmlPackage.EDGE__EDGE:
				return edge != null && !edge.isEmpty();
			case StatesmlPackage.EDGE__SELECTIONCONVERGENCE:
				return selectionconvergence != null;
			case StatesmlPackage.EDGE__OUTGOING_EDGES:
				return outgoingEdges != null;
			case StatesmlPackage.EDGE__INCOMING_EDGE:
				return incomingEdge != null;
			case StatesmlPackage.EDGE__CONNECTING_EDGES:
				return connectingEdges != null;
			case StatesmlPackage.EDGE__SELECTIONDIVERGENCE:
				return selectiondivergence != null;
			case StatesmlPackage.EDGE__CONNECTING_EDGE:
				return connectingEdge != null && !connectingEdge.isEmpty();
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

} //EdgeImpl
