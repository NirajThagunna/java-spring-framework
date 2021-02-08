package com.niraj;

public class Types {
	
	// Attributes
	private int modelNo;
	private String name;
	private String company;
	
	public Types() {}

	public Types(int modelNo, String name, String company) {
		this.modelNo = modelNo;
		this.name = name;
		this.company = company;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Types [modelNo=" + modelNo + ", name=" + name + ", company=" + company + "]";
	}
}
