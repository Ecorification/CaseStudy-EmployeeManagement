package edu.kit.ipd.sdq.employeemanagement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;

import ecore.EcoreFactory;
import ecore.RootContainer;

public class EmployeeManagementTests
		extends unification.edu.kit.ipd.sdq.employeemanagement.UnifiedEmployeeManagementTests {

	private static String BOSS_NAME = "Boss";
	private static String TEAM_ONE_BOSS_NAME = "Boss Team 1";
	private static String TEAM_TWO_BOSS_NAME = "Boss Team 2";
	private static String TEAM_ONE_EMPLOYEE_NAME = "Employee Team 1";
	private static String TEAM_TWO_EMPLOYEE_NAME = "Employee Team 2";

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

		// Add to virtual root container
		RootContainer rootContainer = EcoreFactory.eINSTANCE.createRootContainer();
		rootContainer.getContainedElements().add(boss);
		rootContainer.getContainedElements().add(teamOneBoss);
		rootContainer.getContainedElements().add(teamTwoBoss);
		rootContainer.getContainedElements().add(teamOneEmployee);
		rootContainer.getContainedElements().add(teamTwoEmployee);

		// Persist and reload
		try {
			URI tempFileUri = URI.createFileURI(File.createTempFile("test", "employee").getPath());
			Resource savedResource = new ResourceSetImpl().createResource(tempFileUri);
			savedResource.getContents().add(rootContainer);
			savedResource.save(null);
			Resource loadedResource = new ResourceSetImpl().getResource(tempFileUri, true);
			EObject loadedRoot = loadedResource.getContents().get(0);
			assertTrue(loadedRoot instanceof RootContainer);
			List<EObject> containedElements = ((RootContainer) loadedRoot).getContainedElements();
			assertEquals(5, containedElements.size());
			assertTrue(EcoreUtil.equals(boss, containedElements.get(0)));
			assertTrue(EcoreUtil.equals(teamOneBoss, containedElements.get(1)));
			assertTrue(EcoreUtil.equals(teamTwoBoss, containedElements.get(2)));
			assertTrue(EcoreUtil.equals(teamOneEmployee, containedElements.get(3)));
			assertTrue(EcoreUtil.equals(teamTwoEmployee, containedElements.get(4)));
		} catch (IOException e) {
		}

	}

}
