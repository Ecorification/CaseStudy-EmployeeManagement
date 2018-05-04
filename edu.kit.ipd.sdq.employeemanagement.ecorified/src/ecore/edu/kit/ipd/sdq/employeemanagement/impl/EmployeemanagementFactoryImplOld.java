/**
 */
package ecore.edu.kit.ipd.sdq.employeemanagement.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import ecore.edu.kit.ipd.sdq.employeemanagement.Employee;
import ecore.edu.kit.ipd.sdq.employeemanagement.EmployeeManagementTests;
import ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementFactoryOld;
import ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementPackage;
import ecore.edu.kit.ipd.sdq.employeemanagement.Manager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmployeemanagementFactoryImplOld extends EFactoryImpl implements EmployeemanagementFactoryOld {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EmployeemanagementFactoryOld init() {
		return new EmployeemanagementFactoryImplOld();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeemanagementFactoryImplOld() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EmployeemanagementPackage.EMPLOYEE: return createEmployee();
			case EmployeemanagementPackage.EMPLOYEE_MANAGEMENT_TESTS: return createEmployeeManagementTests();
			case EmployeemanagementPackage.MANAGER: return createManager();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeManagementTests createEmployeeManagementTests() {
		EmployeeManagementTestsImpl employeeManagementTests = new EmployeeManagementTestsImpl();
		return employeeManagementTests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager createManager() {
		ManagerImpl manager = new ManagerImpl();
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeemanagementPackage getEmployeemanagementPackage() {
		return (EmployeemanagementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmployeemanagementPackage getPackage() {
		return EmployeemanagementPackage.eINSTANCE;
	}

} //EmployeemanagementFactoryImpl
