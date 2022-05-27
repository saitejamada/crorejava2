package com.emp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Employee {

	int eid;
	String name;
	int salary;
	@Autowired
	Deapartment dept;
	public int getEid() {
		return eid;
	}
	@Value("112")
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	@Value("saiteja")
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	@Value("25000")
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Deapartment getDept() {
		return dept;
	}
	public void setDept(Deapartment dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
}
