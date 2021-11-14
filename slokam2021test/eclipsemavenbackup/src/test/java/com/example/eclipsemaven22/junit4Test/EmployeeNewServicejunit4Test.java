package com.example.eclipsemaven22.junit4Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import com.example.eclipsemaven22.Employee;
import com.example.eclipsemaven22.EmployeeNewService;
import com.example.eclipsemaven22.EmployeeService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class EmployeeNewServicejunit4Test {
	
	private EmployeeNewService employeeNewservice; 

	@Test
	public void isEmpINfoTest() {
		EmployeeService employeeService = new EmployeeService();
		Employee emp = new Employee();
		emp.setName("Slokam");
		assertEquals(false, employeeService.isEmpINfo(emp));
	}
	
	@Test
	public void isEmpINfoNewTest() {
		EmployeeService employeeService = new EmployeeService();
		Employee emp = new Employee();
		emp.setName("Slokam");
		//assertTrue(employeeService.isEmpINfoNew(emp));
	}
	
	
	@Test
	public void empInfoUsingPrivConTest() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		EmployeeService employeeService = new EmployeeService();
		Method method  = EmployeeService.class.getDeclaredMethod("empInfoUsingPrivCon", Employee.class);
		method.setAccessible(true);
		Employee emp = new Employee();
		emp.setName("Slokam");
		boolean result  = (boolean) method.invoke(employeeService, emp);
		assertTrue(result);
	}
	@Test
	public void printInfoTest() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		EmployeeService employeeService = new EmployeeService();
		Method method = EmployeeService.class.getDeclaredMethod("printInfo", String.class);
		method.setAccessible(true);
		String value = (String)method.invoke(employeeService, "slokam");
		assertEquals("slokam", value);
	}
	@Before
	public void before()
	{
		log.info("entered into before");
		employeeNewservice=new EmployeeNewService();	
	}
	@Test(expected = Exception.class)
	public void exceptionCheck()
	{
		employeeNewservice.exceptionCheck();
		}
	@Test(timeout = 100)
public void performanceTest()
{
		log.info("performance test");
	int[] receivedvalue=employeeNewservice.performanceTest();
	int[] expectedvalue= {4,9,11,1000000};
	//log.info("received value:::{}", receivedvalue);
	//assertArrayEquals(expectedvalue, receivedvalue);
}
}
