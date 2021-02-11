package com.niraj.SpringCoreWithoutXml;

public class Employee {
	
	private Address address;
	
	public Employee() {}
	
	public Employee(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		address.print();
		System.out.println("Hey, I am Employee.");
	}
}
