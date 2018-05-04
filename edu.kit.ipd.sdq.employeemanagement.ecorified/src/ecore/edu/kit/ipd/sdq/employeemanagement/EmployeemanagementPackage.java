/**
 */
package ecore.edu.kit.ipd.sdq.employeemanagement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementFactoryOld
 * @model kind="package"
 * @generated
 */
public interface EmployeemanagementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "employeemanagement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.employeemanagement/ecore.edu.kit.ipd.sdq.employeemanagement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "employeemanagement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmployeemanagementPackage eINSTANCE = ecore.edu.kit.ipd.sdq.employeemanagement.impl.EmployeemanagementPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecore.edu.kit.ipd.sdq.employeemanagement.IEmployee <em>IEmployee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.IEmployee
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.impl.EmployeemanagementPackageImpl#getIEmployee()
	 * @generated
	 */
	int IEMPLOYEE = 3;

	/**
	 * The number of structural features of the '<em>IEmployee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEMPLOYEE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IEmployee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEMPLOYEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.edu.kit.ipd.sdq.employeemanagement.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.impl.EmployeeImpl
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.impl.EmployeemanagementPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = IEMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__SALARY = IEMPLOYEE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__SUPERVISOR = IEMPLOYEE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = IEMPLOYEE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___FIRE = IEMPLOYEE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Hire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___HIRE__MANAGER = IEMPLOYEE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = IEMPLOYEE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ecore.edu.kit.ipd.sdq.employeemanagement.impl.EmployeeManagementTestsImpl <em>Employee Management Tests</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.impl.EmployeeManagementTestsImpl
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.impl.EmployeemanagementPackageImpl#getEmployeeManagementTests()
	 * @generated
	 */
	int EMPLOYEE_MANAGEMENT_TESTS = 1;

	/**
	 * The number of structural features of the '<em>Employee Management Tests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_MANAGEMENT_TESTS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Test Model Creation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_MANAGEMENT_TESTS___TEST_MODEL_CREATION = 0;

	/**
	 * The number of operations of the '<em>Employee Management Tests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_MANAGEMENT_TESTS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ecore.edu.kit.ipd.sdq.employeemanagement.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.impl.ManagerImpl
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.impl.EmployeemanagementPackageImpl#getManager()
	 * @generated
	 */
	int MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__NAME = EMPLOYEE__NAME;

	/**
	 * The feature id for the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__SALARY = EMPLOYEE__SALARY;

	/**
	 * The feature id for the '<em><b>Supervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__SUPERVISOR = EMPLOYEE__SUPERVISOR;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__POSITION = EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___FIRE = EMPLOYEE___FIRE;

	/**
	 * The operation id for the '<em>Hire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___HIRE__MANAGER = EMPLOYEE___HIRE__MANAGER;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OPERATION_COUNT = EMPLOYEE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ecore.edu.kit.ipd.sdq.employeemanagement.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link ecore.edu.kit.ipd.sdq.employeemanagement.Employee#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.Employee#getName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Name();

	/**
	 * Returns the meta object for the attribute '{@link ecore.edu.kit.ipd.sdq.employeemanagement.Employee#getSalary <em>Salary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salary</em>'.
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.Employee#getSalary()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Salary();

	/**
	 * Returns the meta object for the reference '{@link ecore.edu.kit.ipd.sdq.employeemanagement.Employee#getSupervisor <em>Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supervisor</em>'.
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.Employee#getSupervisor()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Supervisor();

	/**
	 * Returns the meta object for the '{@link ecore.edu.kit.ipd.sdq.employeemanagement.Employee#fire() <em>Fire</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fire</em>' operation.
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.Employee#fire()
	 * @generated
	 */
	EOperation getEmployee__Fire();

	/**
	 * Returns the meta object for the '{@link ecore.edu.kit.ipd.sdq.employeemanagement.Employee#hire(ecore.edu.kit.ipd.sdq.employeemanagement.Manager) <em>Hire</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Hire</em>' operation.
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.Employee#hire(ecore.edu.kit.ipd.sdq.employeemanagement.Manager)
	 * @generated
	 */
	EOperation getEmployee__Hire__Manager();

	/**
	 * Returns the meta object for class '{@link ecore.edu.kit.ipd.sdq.employeemanagement.EmployeeManagementTests <em>Employee Management Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee Management Tests</em>'.
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.EmployeeManagementTests
	 * @generated
	 */
	EClass getEmployeeManagementTests();

	/**
	 * Returns the meta object for the '{@link ecore.edu.kit.ipd.sdq.employeemanagement.EmployeeManagementTests#testModelCreation() <em>Test Model Creation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Model Creation</em>' operation.
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.EmployeeManagementTests#testModelCreation()
	 * @generated
	 */
	EOperation getEmployeeManagementTests__TestModelCreation();

	/**
	 * Returns the meta object for class '{@link ecore.edu.kit.ipd.sdq.employeemanagement.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.Manager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the meta object for the attribute '{@link ecore.edu.kit.ipd.sdq.employeemanagement.Manager#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.Manager#getPosition()
	 * @see #getManager()
	 * @generated
	 */
	EAttribute getManager_Position();

	/**
	 * Returns the meta object for class '{@link ecore.edu.kit.ipd.sdq.employeemanagement.IEmployee <em>IEmployee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEmployee</em>'.
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.IEmployee
	 * @generated
	 */
	EClass getIEmployee();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmployeemanagementFactory getEmployeemanagementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ecore.edu.kit.ipd.sdq.employeemanagement.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.edu.kit.ipd.sdq.employeemanagement.impl.EmployeeImpl
		 * @see ecore.edu.kit.ipd.sdq.employeemanagement.impl.EmployeemanagementPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__NAME = eINSTANCE.getEmployee_Name();

		/**
		 * The meta object literal for the '<em><b>Salary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__SALARY = eINSTANCE.getEmployee_Salary();

		/**
		 * The meta object literal for the '<em><b>Supervisor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__SUPERVISOR = eINSTANCE.getEmployee_Supervisor();

		/**
		 * The meta object literal for the '<em><b>Fire</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___FIRE = eINSTANCE.getEmployee__Fire();

		/**
		 * The meta object literal for the '<em><b>Hire</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___HIRE__MANAGER = eINSTANCE.getEmployee__Hire__Manager();

		/**
		 * The meta object literal for the '{@link ecore.edu.kit.ipd.sdq.employeemanagement.impl.EmployeeManagementTestsImpl <em>Employee Management Tests</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.edu.kit.ipd.sdq.employeemanagement.impl.EmployeeManagementTestsImpl
		 * @see ecore.edu.kit.ipd.sdq.employeemanagement.impl.EmployeemanagementPackageImpl#getEmployeeManagementTests()
		 * @generated
		 */
		EClass EMPLOYEE_MANAGEMENT_TESTS = eINSTANCE.getEmployeeManagementTests();

		/**
		 * The meta object literal for the '<em><b>Test Model Creation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE_MANAGEMENT_TESTS___TEST_MODEL_CREATION = eINSTANCE.getEmployeeManagementTests__TestModelCreation();

		/**
		 * The meta object literal for the '{@link ecore.edu.kit.ipd.sdq.employeemanagement.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.edu.kit.ipd.sdq.employeemanagement.impl.ManagerImpl
		 * @see ecore.edu.kit.ipd.sdq.employeemanagement.impl.EmployeemanagementPackageImpl#getManager()
		 * @generated
		 */
		EClass MANAGER = eINSTANCE.getManager();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER__POSITION = eINSTANCE.getManager_Position();

		/**
		 * The meta object literal for the '{@link ecore.edu.kit.ipd.sdq.employeemanagement.IEmployee <em>IEmployee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.edu.kit.ipd.sdq.employeemanagement.IEmployee
		 * @see ecore.edu.kit.ipd.sdq.employeemanagement.impl.EmployeemanagementPackageImpl#getIEmployee()
		 * @generated
		 */
		EClass IEMPLOYEE = eINSTANCE.getIEmployee();

	}

} //EmployeemanagementPackage
