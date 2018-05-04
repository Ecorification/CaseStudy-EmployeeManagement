/**
 */
package ecore.edu.kit.ipd.sdq.employeemanagement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementPackage
 * @generated
 */
public interface EmployeemanagementFactoryOld extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmployeemanagementFactoryOld eINSTANCE = ecore.edu.kit.ipd.sdq.employeemanagement.impl.EmployeemanagementFactoryImplOld.init();

	/**
	 * Returns a new object of class '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee</em>'.
	 * @generated
	 */
	Employee createEmployee();

	/**
	 * Returns a new object of class '<em>Employee Management Tests</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee Management Tests</em>'.
	 * @generated
	 */
	EmployeeManagementTests createEmployeeManagementTests();

	/**
	 * Returns a new object of class '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manager</em>'.
	 * @generated
	 */
	Manager createManager();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EmployeemanagementPackage getEmployeemanagementPackage();

} //EmployeemanagementFactory
