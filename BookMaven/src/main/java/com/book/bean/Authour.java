package com.book.bean;

public class Authour {

	String name;
	int mobileno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public Authour() {
		super();
	}
	public Authour(String name, int mobileno) {
		super();
		this.name = name;
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Authour [name=" + name + ", mobileno=" + mobileno + "]";
	}
	
}
