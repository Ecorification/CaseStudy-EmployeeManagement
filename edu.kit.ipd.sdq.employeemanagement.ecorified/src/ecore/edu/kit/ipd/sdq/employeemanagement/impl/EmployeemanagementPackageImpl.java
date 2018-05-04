/**
 */
package ecore.edu.kit.ipd.sdq.employeemanagement.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ecore.EcorePackage;
import ecore.edu.kit.ipd.sdq.employeemanagement.Employee;
import ecore.edu.kit.ipd.sdq.employeemanagement.EmployeeManagementTests;
import ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementFactory;
import ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementPackage;
import ecore.edu.kit.ipd.sdq.employeemanagement.IEmployee;
import ecore.edu.kit.ipd.sdq.employeemanagement.Manager;
import ecore.impl.EcorePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmployeemanagementPackageImpl extends EPackageImpl implements EmployeemanagementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeManagementTestsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iEmployeeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EmployeemanagementPackageImpl() {
		super(eNS_URI, EmployeemanagementFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EmployeemanagementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EmployeemanagementPackage init() {
		if (isInited) return (EmployeemanagementPackage)EPackage.Registry.INSTANCE.getEPackage(EmployeemanagementPackage.eNS_URI);

		// Obtain or create and register package
		EmployeemanagementPackageImpl theEmployeemanagementPackage = (EmployeemanagementPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EmployeemanagementPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EmployeemanagementPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);

		// Create package meta-data objects
		theEmployeemanagementPackage.createPackageContents();
		theEcorePackage.createPackageContents();

		// Initialize created meta-data
		theEmployeemanagementPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEmployeemanagementPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EmployeemanagementPackage.eNS_URI, theEmployeemanagementPackage);
		return theEmployeemanagementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployee() {
		return employeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Name() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Salary() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmployee_Supervisor() {
		return (EReference)employeeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmployee__Fire() {
		return employeeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmployee__Hire__Manager() {
		return employeeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployeeManagementTests() {
		return employeeManagementTestsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmployeeManagementTests__TestModelCreation() {
		return employeeManagementTestsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManager() {
		return managerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManager_Position() {
		return (EAttribute)managerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEmployee() {
		return iEmployeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeemanagementFactory getEmployeemanagementFactory() {
		return (EmployeemanagementFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		employeeEClass = createEClass(EMPLOYEE);
		createEAttribute(employeeEClass, EMPLOYEE__NAME);
		createEAttribute(employeeEClass, EMPLOYEE__SALARY);
		createEReference(employeeEClass, EMPLOYEE__SUPERVISOR);
		createEOperation(employeeEClass, EMPLOYEE___FIRE);
		createEOperation(employeeEClass, EMPLOYEE___HIRE__MANAGER);

		employeeManagementTestsEClass = createEClass(EMPLOYEE_MANAGEMENT_TESTS);
		createEOperation(employeeManagementTestsEClass, EMPLOYEE_MANAGEMENT_TESTS___TEST_MODEL_CREATION);

		managerEClass = createEClass(MANAGER);
		createEAttribute(managerEClass, MANAGER__POSITION);

		iEmployeeEClass = createEClass(IEMPLOYEE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		employeeEClass.getESuperTypes().add(this.getIEmployee());
		managerEClass.getESuperTypes().add(this.getEmployee());

		// Initialize classes, features, and operations; add parameters
		initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmployee_Name(), ecorePackage.getEString(), "name", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_Salary(), ecorePackage.getEInt(), "salary", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmployee_Supervisor(), this.getManager(), null, "supervisor", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEmployee__Fire(), null, "fire", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getEmployee__Hire__Manager(), null, "hire", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getManager(), "supervisor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(employeeManagementTestsEClass, EmployeeManagementTests.class, "EmployeeManagementTests", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEmployeeManagementTests__TestModelCreation(), null, "testModelCreation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(managerEClass, Manager.class, "Manager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManager_Position(), ecorePackage.getEString(), "position", null, 0, 1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iEmployeeEClass, IEmployee.class, "IEmployee", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //EmployeemanagementPackageImpl
