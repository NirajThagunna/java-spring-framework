package com.springCore;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private String name;
	private List<String> branch;
	private Set<String> address;
	private Map<String, String> results;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getBranch() {
		return branch;
	}
	public void setBranch(List<String> branch) {
		this.branch = branch;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getResults() {
		return results;
	}
	public void setResults(Map<String, String> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", \nbranch=" + branch + ", \naddress=" + address + ", \nresults=" + results + "]";
	}
}
