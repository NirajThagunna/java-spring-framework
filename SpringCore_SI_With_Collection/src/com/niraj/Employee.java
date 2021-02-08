package com.niraj;

import java.util.Iterator;
import java.util.List;

public class Employee {
	private int eid;
	private String ename;
	private List<Address> address;
	
	public Employee() {}

	public Employee(int eid, String ename, List<Address> address) {
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

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	public void show() {
		System.out.println(eid + " " + ename);
		System.out.println("Employee Details : ");
		Iterator<Address> itr = address.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
