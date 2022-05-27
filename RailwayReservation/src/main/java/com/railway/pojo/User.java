package com.railway.pojo;

public class User {

	String name;
	String mobilenumber;
	String age;
	String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return mobilenumber;
	}
	public void setNumber(String number) {
		this.mobilenumber = number;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", number=" + mobilenumber + ", age=" + age + ", password=" + password + "]";
	}
	
}
