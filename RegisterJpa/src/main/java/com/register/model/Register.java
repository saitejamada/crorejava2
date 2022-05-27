package com.register.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Entity
@Table(name = "student2")
public class Register {


	@Min(value=1001,message="should be greater than 1001")
	@Id
	int userid;
	
	@Pattern(regexp ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,20}$",message="password should have min 8 characters and max 20 and must contain 1 number,1 special character,1uppercase alphabet")
	@Column
	String password;
	@Column
	@Pattern(regexp="[a-z][._a-z0-9]+@[a-z]+.[c][o][m]+$",message = "Email Should start with lowercase character and end with com")
	String email;
	@Column
	String gender;
	@Column
	String qualification;
	
	@Pattern(regexp="(0|91)?[7-9][0-9]{9}",message="mobile should be 10 digits")
	@Column
	String mobileno;
	
	@Min(value=18,message="age should be Greater than 18")
	@Max(value=60,message="age should be less than 60")
	@Column
	int age;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Register [userid=" + userid + ", password=" + password + ", email=" + email + ", gender=" + gender
				+ ", qualification=" + qualification + ", mobileno=" + mobileno + ", age=" + age + "]";
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
