/**
 */
package statesml.tests;

import junit.textui.TestRunner;

import statesml.ChangeEvent;
import statesml.StatesmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Change Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChangeEventTest extends EventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChangeEventTest.class);
	}

	/**
	 * Constructs a new Change Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Change Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChangeEvent getFixture() {
		return (ChangeEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StatesmlFactory.eINSTANCE.createChangeEvent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ChangeEventTest
