package com.example.eclipsemaven22;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
import sun.rmi.runtime.Log;
@Slf4j
@SpringBootApplication
public class Eclipsemaven22Application implements CommandLineRunner{
	@Autowired
	EmployeeService employeeservice;

	public static void main(String[] args) {
		SpringApplication.run(Eclipsemaven22Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
log.info("inside run pojo");
		Employee employee=new Employee();
		employee.setId(1);
employee.setName("Harish");
log.info("emp name is:::{}",employee.getName());
Long s=employeeservice.getAllemp();
	log.info("calling getAll in Emplyee service:::{}",s);
	
	}
	

}

