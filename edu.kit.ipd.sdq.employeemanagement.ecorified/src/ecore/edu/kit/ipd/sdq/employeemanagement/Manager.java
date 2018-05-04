/**
 */
package ecore.edu.kit.ipd.sdq.employeemanagement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.edu.kit.ipd.sdq.employeemanagement.Manager#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementPackage#getManager()
 * @model
 * @generated
 */
public interface Manager extends ecore.edu.kit.ipd.sdq.employeemanagement.Employee {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(String)
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementPackage#getManager_Position()
	 * @model
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link ecore.edu.kit.ipd.sdq.employeemanagement.Manager#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

} // Manager
