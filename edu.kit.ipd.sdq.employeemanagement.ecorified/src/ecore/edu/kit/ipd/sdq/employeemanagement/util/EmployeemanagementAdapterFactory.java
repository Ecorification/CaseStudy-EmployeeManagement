/**
 */
package ecore.edu.kit.ipd.sdq.employeemanagement.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import ecore.edu.kit.ipd.sdq.employeemanagement.Employee;
import ecore.edu.kit.ipd.sdq.employeemanagement.EmployeeManagementTests;
import ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementPackage;
import ecore.edu.kit.ipd.sdq.employeemanagement.IEmployee;
import ecore.edu.kit.ipd.sdq.employeemanagement.Manager;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementPackage
 * @generated
 */
public class EmployeemanagementAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EmployeemanagementPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeemanagementAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EmployeemanagementPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeemanagementSwitch<Adapter> modelSwitch =
		new EmployeemanagementSwitch<Adapter>() {
			@Override
			public Adapter caseEmployee(Employee object) {
				return createEmployeeAdapter();
			}
			@Override
			public Adapter caseEmployeeManagementTests(EmployeeManagementTests object) {
				return createEmployeeManagementTestsAdapter();
			}
			@Override
			public Adapter caseManager(Manager object) {
				return createManagerAdapter();
			}
			@Override
			public Adapter caseIEmployee(IEmployee object) {
				return createIEmployeeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ecore.edu.kit.ipd.sdq.employeemanagement.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.Employee
	 * @generated
	 */
	public Adapter createEmployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.edu.kit.ipd.sdq.employeemanagement.EmployeeManagementTests <em>Employee Management Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.EmployeeManagementTests
	 * @generated
	 */
	public Adapter createEmployeeManagementTestsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.edu.kit.ipd.sdq.employeemanagement.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.Manager
	 * @generated
	 */
	public Adapter createManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore.edu.kit.ipd.sdq.employeemanagement.IEmployee <em>IEmployee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.IEmployee
	 * @generated
	 */
	public Adapter createIEmployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EmployeemanagementAdapterFactory
