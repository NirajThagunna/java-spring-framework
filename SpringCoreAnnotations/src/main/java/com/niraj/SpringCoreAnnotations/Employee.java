package com.niraj.SpringCoreAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private String name;
	
	@Autowired
	@Qualifier("address2")
	private Address address;
	
	public Employee() {}
	
	public Employee(Address address) {
		this.address = address;
		System.out.println("Calling the constructor");
	}
	
	public Employee(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Inside setter method!");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
}
