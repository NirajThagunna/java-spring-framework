package com.springCore.beanLifeCycleInterface;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student1 implements InitializingBean, DisposableBean {
	private int id;
	private List<String> names;

	public Student1() {
		this.id = 0;
		this.names = null;
	}

	public Student1(int id, List<String> names) {
		this.id = id;
		this.names = names;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Setting id!");
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
		System.out.println("Setting Names!");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", names=" + names + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing values!");
	}

	public void destroy() throws Exception {
		System.out.println("Destroyed the life!");
	}
}
