package unification.edu.kit.ipd.sdq.employeemanagement

import ecore.edu.kit.ipd.sdq.employeemanagement.Manager
import ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementFactoryOld
import edu.kit.ipd.sdq.activextendannotations.DelegateDeclared
import edu.kit.ipd.sdq.employeemanagement.Employee

/**
 * Unification class for the class Manager
 */
class UnifiedManager extends Employee implements Manager {
	
	@DelegateDeclared
	protected var Manager ecoreImplementation
	

	new() {
		super()
		ecoreImplementation = instance
	}
	
	override protected Manager getInstance() {
		return EmployeemanagementFactoryOld.eINSTANCE.createManager
	}
}
