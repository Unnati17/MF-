package com.ncu.typeques;

import java.util.List;

public class Department {
	
	private List<String> name;

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name=" + name;
	}

}
