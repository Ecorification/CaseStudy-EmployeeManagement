/**
 */
package ecore.edu.kit.ipd.sdq.employeemanagement.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee Management Tests</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EmployeeManagementTestsImpl extends MinimalEObjectImpl.Container implements ecore.edu.kit.ipd.sdq.employeemanagement.EmployeeManagementTests {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeManagementTestsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmployeemanagementPackage.Literals.EMPLOYEE_MANAGEMENT_TESTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void testModelCreation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EmployeemanagementPackage.EMPLOYEE_MANAGEMENT_TESTS___TEST_MODEL_CREATION:
				testModelCreation();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //EmployeeManagementTestsImpl
