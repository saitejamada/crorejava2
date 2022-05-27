package com.emp.bean;

import org.springframework.beans.factory.annotation.Value;

public class Deapartment {

	int did;
	String dname;
	public int getDid() {
		return did;
	}
	@Value("10")
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	@Value("hr")
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Deapartment [did=" + did + ", dname=" + dname + "]";
	}
	public Deapartment(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	public Deapartment() {
		super();
	}
	
}
