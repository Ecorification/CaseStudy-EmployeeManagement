package ecore.edu.kit.ipd.sdq.employeemanagement;
	
import org.eclipse.emf.ecore.EFactory;
	
/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @see ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementPackage
 * @generated
 */
public interface EmployeemanagementFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * @generated
     */
    EmployeemanagementFactory eINSTANCE = ecore.edu.kit.ipd.sdq.employeemanagement.impl.EmployeemanagementFactoryImpl.init();
	
	/**
	 * Returns a new object of class '<em>Employee</em>'.
	 * @return a new object of class '<em>Employee</em>'.
	 * @generated
	 */
	Employee createEmployee();	    		
	
	/**
	 * Returns a new object of class '<em>EmployeeManagementTests</em>'.
	 * @return a new object of class '<em>EmployeeManagementTests</em>'.
	 * @generated
	 */
	EmployeeManagementTests createEmployeeManagementTests();	    		
	
	/**
	 * Returns a new object of class '<em>Manager</em>'.
	 * @return a new object of class '<em>Manager</em>'.
	 * @generated
	 */
	Manager createManager();	    
	
	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	EmployeemanagementPackage getEmployeemanagementPackage();
	
} //EmployeemanagementFactory
