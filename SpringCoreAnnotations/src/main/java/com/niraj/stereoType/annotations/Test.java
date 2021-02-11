package com.niraj.stereoType.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/niraj/stereoType/annotations/config.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());
	}
}
