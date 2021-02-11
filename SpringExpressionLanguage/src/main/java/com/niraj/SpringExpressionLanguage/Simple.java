package com.niraj.SpringExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Simple {
	
	@Value("#{10 * 20 / 2}")
	private int x;
	
	@Value("#{20>30?1:-1}")
	private int y;
	
	// Calling or invoking a static method = T(class name).method(parameter)
	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private double z;
	
	// Invoke static variable = T(class name).variable
	@Value("#{ T(java.lang.Math).PI }")
	private double e;
	
	// Creating an object = new Object(value) - Object means Constructor name
	@Value("#{ new java.lang.String('Niraj Thagunna') }")
	private String name;
	
	// boolean data type
	@Value("#{ 'Niraj'.length == 5 }")
	private boolean isActive;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Simple [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
}
