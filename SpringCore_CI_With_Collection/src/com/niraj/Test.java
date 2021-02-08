package com.niraj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
		vehicle.details();
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext) context;
		cxt.close(); // Closing the context
	}
}
