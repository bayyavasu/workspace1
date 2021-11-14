package com.example.eclipsemaven22;


import java.util.Arrays;
import java.util.Objects;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component
public class EmployeeService {
public Long getAllemp()
{
	Employee e1=new Employee();
	e1.setId(2);
	e1.setName("emp2");
	Employee e2=new Employee();
e2.setId(3);
e2.setName("empone");
log.info("With out removing duplicate records from emp lis::{}",Arrays.asList(e1,e2,e1).stream().count());
log.info("With out removing duplicate records from emp lis::{}",Arrays.asList(e1,e2,e1).stream().distinct().count());
return Arrays.asList(e1,e2,e1).stream().distinct().count();

	
}


public boolean isEmpINfo(Employee employee) {
	boolean result = false;
	if(Objects.nonNull(employee) && employee.getName() != null) {
		result = true;
	}
	return result;
}

protected boolean isEmpINfoNew(Employee employee) {
	boolean result = false;
	if(Objects.nonNull(employee) && employee.getName() != null) {
		result = true;
	}
	return result;
}




private boolean empInfoUsingPrivCon(Employee employee) {
	boolean result = false;
	if(Objects.nonNull(employee) && employee.getName() != null) {
		result = true;
	}
	return result;
}
private String printInfo(String name) {
	return name;
	
}

}
