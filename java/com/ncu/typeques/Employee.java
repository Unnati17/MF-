package com.ncu.typeques;

import java.util.List;

public class Employee {
	
	private Address add;
	
	private String emp_name;
	private List<Department> dname;
	
	@Override
	public String toString() 
	{
		return "Employee name=" + emp_name + " Department name=" + dname;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public List<Department> getDname() {
		return dname;
	}
	public void setDname(List<Department> dname) {
		this.dname = dname;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	

}
