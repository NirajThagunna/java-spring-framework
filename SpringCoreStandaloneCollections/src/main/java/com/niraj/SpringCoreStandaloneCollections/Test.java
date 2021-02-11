package com.niraj.SpringCoreStandaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student.names());
		System.out.println(student.getNames().getClass().getName());
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(student.fees());
		System.out.println(student.getFees().getClass().getName());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(student.properties());
		System.out.println(student.getProperties().getClass().getName());
	}
}
