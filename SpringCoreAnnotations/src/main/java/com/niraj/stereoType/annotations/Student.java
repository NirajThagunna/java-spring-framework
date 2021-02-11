package com.niraj.stereoType.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Creating the object of a class using Component Annotation
@Component
public class Student {
	
	// Injecting the values to an attributes using @Value annotation
	@Value("6317080")
	private int id;
	
	@Value("Niraj Thagunna")
	private String name;
	
	@Value("#{addr}")
	private List<String> address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
