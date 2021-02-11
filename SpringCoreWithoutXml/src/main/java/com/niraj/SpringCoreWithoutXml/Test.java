package com.niraj.SpringCoreWithoutXml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp);
		emp.display();
		
		context.close();
	}
}
