package com.niraj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		
		// Object Construction || Done by developer
//		Employee emp = new Employee();
//		emp.setEid(101);
//		emp.setEname("Niraj Thagunna");
//		emp.setEaddress("Nepal");
//		System.out.println("Employee Details: " + emp);

		// Spring Way | IOC (Inversion Of Control)
		// XmlBeanFactory - Spring Container
		// Spring Container
		// Resource resource = new ClassPathResource("applicationContext.xml");
		// BeanFactory factory = new XmlBeanFactory(resource);

		// ApplicationContext Container
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee employee = context.getBean("emp", Employee.class);
		System.out.println("Employee Details: " + employee);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext) context; // Down Casting the context
		cxt.close(); // Close the context
	}
}
