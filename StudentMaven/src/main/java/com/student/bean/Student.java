package com.student.bean;

public class Student {

	int sid;
	String name;
	String course;
	Address add;
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", course=" + course + ", add=" + add + "]";
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student() {
		super();
	}
	public Student(int sid, String name, String course, Address add) {
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;
		this.add = add;
	}

}
