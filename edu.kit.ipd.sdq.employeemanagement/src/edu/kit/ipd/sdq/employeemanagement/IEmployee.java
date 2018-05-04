package edu.kit.ipd.sdq.employeemanagement;

public interface IEmployee {
	String getName();
	void setName(String name);
	int getSalary();
	Manager getSupervisor();
	void setSupervisor(Manager m);
	void hire(Manager supervisor);
	void fire();
}
