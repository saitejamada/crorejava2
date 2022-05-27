package com.book.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Book {

	@Value("1321")
	int bid;
	@Value("Game Of Thrones")
	String bname;
	@Value("550")
	int price;
	@Autowired
	Authour auth;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Authour getAuth() {
		return auth;
	}
	public void setAuth(Authour auth) {
		this.auth = auth;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price + ", auth=" + auth + "]";
	}
	public Book() {
		super();
	}
	public Book(int bid, String bname, int price, Authour auth) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
		this.auth = auth;
	}
	
}
