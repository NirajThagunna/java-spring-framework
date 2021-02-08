package com.niraj;

import java.util.Iterator;
import java.util.List;

public class Vehicle {

	// Attributes
	private int no;
	private String name;
	private List<Types> type;

	public Vehicle() {}

	public Vehicle(int no, String name, List<Types> type) {
		this.no = no;
		this.name = name;
		this.type = type;
	}
	
	public void details() {
		System.out.println(no + " " + name);
		System.out.println("Brands of Vehicle's are : ");
		Iterator<Types> itr = type.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
