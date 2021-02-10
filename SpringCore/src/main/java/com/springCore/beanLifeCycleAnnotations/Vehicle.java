package com.springCore.beanLifeCycleAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Vehicle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting the values!");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Initializing the values!");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Values destroyed!");
	}
}
