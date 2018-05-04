package edu.kit.ipd.sdq.employeemanagement;

public class Employee extends unification.edu.kit.ipd.sdq.employeemanagement.UnifiedEmployee implements IEmployee {
	public Employee() {
		this.setSalary(0);
	}

	@Override
	public void fire() {
		this.setSupervisor(null);
		this.setSalary(0);
	}

	@Override
	public void hire(Manager supervisor) {
		setSupervisor(supervisor);
		this.setSalary(100);
	}
	
}
