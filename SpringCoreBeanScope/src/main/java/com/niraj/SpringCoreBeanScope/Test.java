package com.niraj.SpringCoreBeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		
		Student student1 = context.getBean("student", Student.class);
		System.out.println(student1);
		
		Student student2 = context.getBean("student", Student.class);
		System.out.println(student2);
	}
}
