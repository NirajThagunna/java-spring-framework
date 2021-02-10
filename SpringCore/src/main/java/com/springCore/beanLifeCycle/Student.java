package com.springCore.beanLifeCycle;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Setting value");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	public void init() {
		System.out.println("Initialized");
	}
	
	public void destroy() {
		System.out.println("Destroyed");
	}
}
