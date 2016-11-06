/**
 */
package statesml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statesml.Edge;
import statesml.StatesmlPackage;
import statesml.TerminalState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statesml.impl.TerminalStateImpl#getTerminalStates <em>Terminal States</em>}</li>
 *   <li>{@link statesml.impl.TerminalStateImpl#isIsTerminal <em>Is Terminal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminalStateImpl extends StateImpl implements TerminalState {
	/**
	 * The cached value of the '{@link #getTerminalStates() <em>Terminal States</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminalStates()
	 * @generated
	 * @ordered
	 */
	protected Edge terminalStates;

	/**
	 * The default value of the '{@link #isIsTerminal() <em>Is Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTerminal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TERMINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTerminal() <em>Is Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTerminal()
	 * @generated
	 * @ordered
	 */
	protected boolean isTerminal = IS_TERMINAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesmlPackage.Literals.TERMINAL_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge getTerminalStates() {
		if (terminalStates != null && terminalStates.eIsProxy()) {
			InternalEObject oldTerminalStates = (InternalEObject)terminalStates;
			terminalStates = (Edge)eResolveProxy(oldTerminalStates);
			if (terminalStates != oldTerminalStates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesmlPackage.TERMINAL_STATE__TERMINAL_STATES, oldTerminalStates, terminalStates));
			}
		}
		return terminalStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge basicGetTerminalStates() {
		return terminalStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminalStates(Edge newTerminalStates, NotificationChain msgs) {
		Edge oldTerminalStates = terminalStates;
		terminalStates = newTerminalStates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatesmlPackage.TERMINAL_STATE__TERMINAL_STATES, oldTerminalStates, newTerminalStates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminalStates(Edge newTerminalStates) {
		if (newTerminalStates != terminalStates) {
			NotificationChain msgs = null;
			if (terminalStates != null)
				msgs = ((InternalEObject)terminalStates).eInverseRemove(this, StatesmlPackage.EDGE__OUTGOING_EDGES, Edge.class, msgs);
			if (newTerminalStates != null)
				msgs = ((InternalEObject)newTerminalStates).eInverseAdd(this, StatesmlPackage.EDGE__OUTGOING_EDGES, Edge.class, msgs);
			msgs = basicSetTerminalStates(newTerminalStates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesmlPackage.TERMINAL_STATE__TERMINAL_STATES, newTerminalStates, newTerminalStates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTerminal() {
		return isTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTerminal(boolean newIsTerminal) {
		boolean oldIsTerminal = isTerminal;
		isTerminal = newIsTerminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesmlPackage.TERMINAL_STATE__IS_TERMINAL, oldIsTerminal, isTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesmlPackage.TERMINAL_STATE__TERMINAL_STATES:
				if (terminalStates != null)
					msgs = ((InternalEObject)terminalStates).eInverseRemove(this, StatesmlPackage.EDGE__OUTGOING_EDGES, Edge.class, msgs);
				return basicSetTerminalStates((Edge)otherEnd, msgs);
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
			case StatesmlPackage.TERMINAL_STATE__TERMINAL_STATES:
				return basicSetTerminalStates(null, msgs);
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
			case StatesmlPackage.TERMINAL_STATE__TERMINAL_STATES:
				if (resolve) return getTerminalStates();
				return basicGetTerminalStates();
			case StatesmlPackage.TERMINAL_STATE__IS_TERMINAL:
				return isIsTerminal();
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
			case StatesmlPackage.TERMINAL_STATE__TERMINAL_STATES:
				setTerminalStates((Edge)newValue);
				return;
			case StatesmlPackage.TERMINAL_STATE__IS_TERMINAL:
				setIsTerminal((Boolean)newValue);
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
			case StatesmlPackage.TERMINAL_STATE__TERMINAL_STATES:
				setTerminalStates((Edge)null);
				return;
			case StatesmlPackage.TERMINAL_STATE__IS_TERMINAL:
				setIsTerminal(IS_TERMINAL_EDEFAULT);
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
			case StatesmlPackage.TERMINAL_STATE__TERMINAL_STATES:
				return terminalStates != null;
			case StatesmlPackage.TERMINAL_STATE__IS_TERMINAL:
				return isTerminal != IS_TERMINAL_EDEFAULT;
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
		result.append(" (isTerminal: ");
		result.append(isTerminal);
		result.append(')');
		return result.toString();
	}

} //TerminalStateImpl
