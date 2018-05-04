package edu.kit.ipd.sdq.employeemanagement;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeManagementTests {

	private static final String BOSS_NAME = "Boss";
	private static final String TEAM_ONE_BOSS_NAME = "Boss Team 1";
	private static final String TEAM_TWO_BOSS_NAME = "Boss Team 2";
	private static final String TEAM_ONE_EMPLOYEE_NAME = "Employee Team 1";
	private static final String TEAM_TWO_EMPLOYEE_NAME = "Employee Team 2";
	
	@Test
	public void testModelCreation() {
		Manager boss = new Manager();
		boss.setName(BOSS_NAME);
		Manager teamOneBoss = new Manager();
		teamOneBoss.setName(TEAM_ONE_BOSS_NAME);
		teamOneBoss.hire(boss);
		Manager teamTwoBoss = new Manager();
		teamTwoBoss.setName(TEAM_TWO_BOSS_NAME);
		teamTwoBoss.hire(boss);
		Employee teamOneEmployee = new Employee();
		teamOneEmployee.setName(TEAM_ONE_EMPLOYEE_NAME);
		teamOneEmployee.hire(teamOneBoss);
		Employee teamTwoEmployee = new Employee();
		teamTwoEmployee.setName(TEAM_TWO_EMPLOYEE_NAME);
		teamTwoEmployee.hire(teamTwoBoss);
		teamOneEmployee.fire();
		
		assertEquals(BOSS_NAME, boss.getName());
		assertEquals(TEAM_ONE_BOSS_NAME, teamOneBoss.getName());
		assertEquals(TEAM_TWO_BOSS_NAME, teamTwoBoss.getName());
		assertEquals(TEAM_ONE_EMPLOYEE_NAME, teamOneEmployee.getName());
		assertEquals(TEAM_TWO_EMPLOYEE_NAME, teamTwoEmployee.getName());
		assertEquals(boss, teamOneBoss.getSupervisor());
		assertEquals(boss, teamTwoBoss.getSupervisor());
		assertEquals(null, teamOneEmployee.getSupervisor());
		assertEquals(teamTwoBoss, teamTwoEmployee.getSupervisor());
		
		// Move employee of team one to team two
		teamOneEmployee.setSupervisor(teamTwoBoss);
		assertEquals(teamTwoBoss, teamOneEmployee.getSupervisor());
	}

}
