package com.example.eclipsemaven22;

import java.util.Arrays;
import java.util.Objects;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class EmployeeNewService {
	public static void main(String[] args) {
		exceptionCheck();
	}
	
	public boolean isEmpINfo(Employee employee) {
		boolean result = false;
		if(Objects.nonNull(employee) && employee.getName() != null) {
			result = true;
		}
		return result;
	}

	public int[] randomArray()
	{
		
		log.info("entered into randomArray method");
		int[] randomArray1= {5,2,9,3,1,7};
		return randomArray1;
	}
	public int[] randomArrayNullcheck()
	{
		
		log.info("entered into randomArrayNullcheck  method");
		int[] randomArray1= null;
		return randomArray1;
	}
	public int[] randomArrayNotNullcheck()
	{
		
		log.info("entered into randomArrayNotNullcheck method");
		int[] randomArray1= null;
		return randomArray1;
	}
	public static int[] exceptionCheck()
	{
		
		log.info("entered into exceptionCheck method");
		int[] randomArray1= null;
		log.info("Before exception raise");
		int length=randomArray1.length;
		
		log.info("after exception statement",length);
		return randomArray1;
	}
	
	public  int[] performanceTest()
	{
		log.info("entered into performance test");
		int[] arrayname= {1,4,9,11};
		for(int value=1;value<=1000000;value++)
		{
			arrayname[0]=value;
			Arrays.sort(arrayname);
		}
		log.info("after for loop");
		return arrayname;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
