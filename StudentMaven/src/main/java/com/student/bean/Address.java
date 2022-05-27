package com.student.bean;

public class Address {

	int hno;
	String streetname;
	String city;
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", streetname=" + streetname + ", city=" + city + "]";
	}
	public Address() {
		super();
	}
	public Address(int hno, String streetname, String city) {
		super();
		this.hno = hno;
		this.streetname = streetname;
		this.city = city;
	}
	
}
