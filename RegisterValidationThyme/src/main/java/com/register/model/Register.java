package com.register.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Register {

	@NotNull
	@Size(min =8,max=15,message = "Should be greater than or equal 8")
	String userid;
	
	@Pattern(regexp ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,20}$",message="password should have min 8 characters and max 20 and must contain 1 number,1 special character,1uppercase alphabet")
	String password;
	
	@Email(regexp="^(.+)@(.+)$",message = "Invalid email pattern")
	String email;
	
	String gender;
	String qualification;
	
	@Pattern(regexp="(0|91)?[7-9][0-9]{9}",message="mobile should be 10 digits")
	String mobileno;
	
	@Min(value=18,message="age should be Greater than 18")
	@Max(value=60,message="age should be less than 60")
	int age;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
