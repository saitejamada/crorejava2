package com.employee.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee {

	@NotNull(message="can not be null")
	private int empId;

	@Size(min=3,message="name should have min 3 characters")
	private String ename;
	public int getEmpId() {
	return empId;
	}
	public void setEmpId(int empId) {
	this.empId = empId;
	}
	@Override
	public String toString() {
	return "Employee [empId=" + empId + ", ename=" + ename + "]";
	}
	public String getEname() {
	return ename;
	}
	public void setEname(String ename) {
	this.ename = ename;
	}

}

