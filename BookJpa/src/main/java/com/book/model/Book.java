package com.book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookjpa")
public class Book {

	@Id
	int bid;
	@Column
	String bookname;
	@Column
	String authour;
	@Column
	int price;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthour() {
		return authour;
	}
	public void setAuthour(String authour) {
		this.authour = authour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(int bid, String bookname, String authour, int price) {
		super();
		this.bid = bid;
		this.bookname = bookname;
		this.authour = authour;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bookname=" + bookname + ", authour=" + authour + ", price=" + price + "]";
	}
	public Book() {
		super();
	}
}
