package com.book.bean;

import org.springframework.beans.factory.annotation.Value;

public class Authour {

	@Value("george rr martin")
	String aname;
	@Value("USA")
	String address;
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Authour [aname=" + aname + ", address=" + address + "]";
	}
	public Authour() {
		super();
	}
	public Authour(String aname, String address) {
		super();
		this.aname = aname;
		this.address = address;
	}
}
