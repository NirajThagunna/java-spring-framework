package com.niraj;

// Bean Class or Model or POJO (Plain Old Java Object)
public class Employee {
	
	// Attributes
	private int eid;
	private String ename;
	private Address address; // HAS - A Relationship
	
	// Methods
	public Employee() {
		this.eid = 0;
		this.ename = "NA";
		this.address = null;
	}
	
	// Parameterized Constructor - Constructor-arg
	public Employee(int eid, String ename, Address address) {
		this.eid = eid;
		this.ename = ename;
		this.address = address;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}

	public void myInit() {
		System.out.println("--- Object Initialized ---");
	}
	
	public void myDestroy() {
		System.out.println("--- Object Destroyed ---");
	}
}
