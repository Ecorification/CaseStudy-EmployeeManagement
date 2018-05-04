package unification.edu.kit.ipd.sdq.employeemanagement

import ecore.edu.kit.ipd.sdq.employeemanagement.EmployeeManagementTests
import ecore.edu.kit.ipd.sdq.employeemanagement.EmployeemanagementFactoryOld
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtend.lib.annotations.Delegate
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.InternalEObject

/**
 * Unification class for the class EmployeeManagementTests
 */
class UnifiedEmployeeManagementTests extends MinimalEObjectImpl.Container implements EmployeeManagementTests {
	
	@Delegate
	protected var EmployeeManagementTests ecoreImplementation
	
	// Methods of InternalEObject must also be delegated to the wrapped class
	@DelegateExcept(Notifier, EObject)
	protected var InternalEObject internalEcoreImplementation

	new() {
		ecoreImplementation = instance
		internalEcoreImplementation = ecoreImplementation as InternalEObject
	}
	
	def protected EmployeeManagementTests getInstance() {
		return EmployeemanagementFactoryOld.eINSTANCE.createEmployeeManagementTests
	}
}
