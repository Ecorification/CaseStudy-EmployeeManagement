package edu.kit.ipd.sdq.employeemanagement;

public class Employee implements IEmployee {
	private String name;
	private int salary;
	private Manager supervisor;
	
	public Employee() {
		this.salary = 0;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int getSalary() {
		return salary;
	}

	@Override
	public Manager getSupervisor() {
		return supervisor;
	}

	@Override
	public void setSupervisor(Manager m) {
		this.supervisor = m;
	}

	@Override
	public void fire() {
		this.supervisor = null;
		this.salary = 0;
	}

	@Override
	public void hire(Manager supervisor) {
		setSupervisor(supervisor);
		this.salary = 100;
	}
	
}
