package ecore.edu.kit.ipd.sdq.employeemanagement.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementFactory;
import ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementPackage;
import edu.kit.ipd.sdq.employeemanagement.Employee;
import edu.kit.ipd.sdq.employeemanagement.EmployeeManagementTests;
import edu.kit.ipd.sdq.employeemanagement.Manager;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class EmployeemanagementFactoryImpl extends EFactoryImpl implements EmployeemanagementFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EmployeemanagementFactory init() {
        try {
            EmployeemanagementFactory theEmployeemanagementFactory = (EmployeemanagementFactory)EPackage.Registry.INSTANCE.getEFactory(EmployeemanagementPackage.eNS_URI);
            if (theEmployeemanagementFactory != null) {
                return theEmployeemanagementFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new EmployeemanagementFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * @generated
     */
    public EmployeemanagementFactoryImpl() {
        super();
    }

    /**
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
	 * @generated
	 */
	public Employee createEmployee() {
		return new Employee(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public EmployeeManagementTests createEmployeeManagementTests() {
		return new EmployeeManagementTests(); // origin code instance
	}			
	
	/**
	 * @generated
	 */
	public Manager createManager() {
		return new Manager(); // origin code instance
	}	
	
	/**
	 * @generated
	 */
	public EmployeemanagementPackage getEmployeemanagementPackage() {
	return (EmployeemanagementPackage)getEPackage();
	}

    /**
     * @deprecated
     * @generated
     */
    @Deprecated
    public static EmployeemanagementPackage getPackage() {
        return EmployeemanagementPackage.eINSTANCE;
    }
    
} //EmployeemanagementFactoryImpl
