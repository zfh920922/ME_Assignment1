/**
 */
package statesml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import statesml.DataTypeLibrary;
import statesml.StatesmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Type Library</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypeLibraryTest extends TestCase {

	/**
	 * The fixture for this Data Type Library test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeLibrary fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataTypeLibraryTest.class);
	}

	/**
	 * Constructs a new Data Type Library test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeLibraryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Data Type Library test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DataTypeLibrary fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Data Type Library test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeLibrary getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StatesmlFactory.eINSTANCE.createDataTypeLibrary());
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

} //DataTypeLibraryTest
