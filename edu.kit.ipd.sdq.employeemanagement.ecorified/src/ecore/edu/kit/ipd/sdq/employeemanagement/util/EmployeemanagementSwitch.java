/**
 */
package ecore.edu.kit.ipd.sdq.employeemanagement.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import ecore.edu.kit.ipd.sdq.employeemanagement.Employee;
import ecore.edu.kit.ipd.sdq.employeemanagement.EmployeeManagementTests;
import ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementPackage;
import ecore.edu.kit.ipd.sdq.employeemanagement.IEmployee;
import ecore.edu.kit.ipd.sdq.employeemanagement.Manager;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementPackage
 * @generated
 */
public class EmployeemanagementSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EmployeemanagementPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeemanagementSwitch() {
		if (modelPackage == null) {
			modelPackage = EmployeemanagementPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EmployeemanagementPackage.EMPLOYEE: {
				Employee employee = (Employee)theEObject;
				T result = caseEmployee(employee);
				if (result == null) result = caseIEmployee(employee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmployeemanagementPackage.EMPLOYEE_MANAGEMENT_TESTS: {
				EmployeeManagementTests employeeManagementTests = (EmployeeManagementTests)theEObject;
				T result = caseEmployeeManagementTests(employeeManagementTests);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmployeemanagementPackage.MANAGER: {
				Manager manager = (Manager)theEObject;
				T result = caseManager(manager);
				if (result == null) result = caseEmployee(manager);
				if (result == null) result = caseIEmployee(manager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmployeemanagementPackage.IEMPLOYEE: {
				IEmployee iEmployee = (IEmployee)theEObject;
				T result = caseIEmployee(iEmployee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Employee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmployee(Employee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Employee Management Tests</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Employee Management Tests</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmployeeManagementTests(EmployeeManagementTests object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManager(Manager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEmployee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEmployee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEmployee(IEmployee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EmployeemanagementSwitch
