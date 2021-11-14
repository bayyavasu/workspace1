package com.example.eclipsemaven22.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

import com.example.eclipsemaven22.EmployeeNewService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class EmployeeNewServiceTest {
private EmployeeNewService employeeNewservice; 
 
@Before
public void before()
{
	log.info("entered into before");
	employeeNewservice=new EmployeeNewService();	
}

	@Test
public 	void randomArrayTest() {
		int[] expected_value= {5,2,9,3,1,7};
		log.info("calling method");
		int[] actual_value=	employeeNewservice.randomArray();
		log.info("returned array",actual_value);
           assertArrayEquals(expected_value, actual_value);
}
	
	@Test
	public void randomArrayNullCheckTest()
	{
		int[] receivedArray=employeeNewservice.randomArrayNullcheck();
		assertNull(receivedArray);
		
	}
	
	@Test
	public void randomArrayNotNullCheckTest()
	{
		int[] receivedArray=employeeNewservice.randomArrayNotNullcheck();
		assertNotNull(receivedArray);
		
	}
	
	
	
	
	
	
	
	
}