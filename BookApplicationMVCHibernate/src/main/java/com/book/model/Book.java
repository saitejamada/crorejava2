package com.book.model;

public class Book {

	String bid;
	String bookname;
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	String price;
	String authourname;
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAuthourname() {
		return authourname;
	}
	public void setAuthourname(String authourname) {
		this.authourname = authourname;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bookname=" + bookname + ", price=" + price + ", authourname=" + authourname
				+ "]";
	}
	
}
