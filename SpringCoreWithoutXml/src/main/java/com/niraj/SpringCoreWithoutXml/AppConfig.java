package com.niraj.SpringCoreWithoutXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Address getAddress() {
		return new Address();
	}
	
	@Bean(name = "employee")
	public Employee getEmployee() {
		
		// Creating a new object for Employee class
		Employee emp = new Employee(getAddress());
		return emp;
	}
}
