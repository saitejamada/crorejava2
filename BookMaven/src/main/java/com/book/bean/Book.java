package com.book.bean;

public class Book {

	int bid;
	String name;
	int price;
	Authour auth;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "Book [bid=" + bid + ", name=" + name + ", price=" + price + ", auth=" + auth + "]";
	}
	public Book() {
		super();
	}
	public Book(int bid, String name, int price, Authour auth) {
		super();
		this.bid = bid;
		this.name = name;
		this.price = price;
		this.auth = auth;
	}
	
}
