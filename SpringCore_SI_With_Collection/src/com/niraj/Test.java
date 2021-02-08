package com.niraj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee employee = context.getBean("emp", Employee.class);
		employee.show();
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext) context;
		cxt.close();
	}
}
