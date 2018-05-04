/**
 */
package ecore.edu.kit.ipd.sdq.employeemanagement;

import edu.kit.ipd.sdq.employeemanagement.Manager;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.edu.kit.ipd.sdq.employeemanagement.Employee#getName <em>Name</em>}</li>
 *   <li>{@link ecore.edu.kit.ipd.sdq.employeemanagement.Employee#getSalary <em>Salary</em>}</li>
 *   <li>{@link ecore.edu.kit.ipd.sdq.employeemanagement.Employee#getSupervisor <em>Supervisor</em>}</li>
 * </ul>
 *
 * @see ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends ecore.edu.kit.ipd.sdq.employeemanagement.IEmployee {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementPackage#getEmployee_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecore.edu.kit.ipd.sdq.employeemanagement.Employee#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salary</em>' attribute.
	 * @see #setSalary(int)
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementPackage#getEmployee_Salary()
	 * @model
	 * @generated
	 */
	int getSalary();

	/**
	 * Sets the value of the '{@link ecore.edu.kit.ipd.sdq.employeemanagement.Employee#getSalary <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salary</em>' attribute.
	 * @see #getSalary()
	 * @generated
	 */
	void setSalary(int value);

	/**
	 * Returns the value of the '<em><b>Supervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supervisor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisor</em>' reference.
	 * @see #setSupervisor(Manager)
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementPackage#getEmployee_Supervisor()
	 * @model
	 * @generated
	 */
	Manager getSupervisor();

	/**
	 * Sets the value of the '{@link ecore.edu.kit.ipd.sdq.employeemanagement.Employee#getSupervisor <em>Supervisor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supervisor</em>' reference.
	 * @see #getSupervisor()
	 * @generated
	 */
	void setSupervisor(Manager value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fire();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void hire(Manager supervisor);

} // Employee
