package com.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.book.model.Book;
import com.book.model.User;
import com.book.repo.BookRepo;
import com.book.repo.UserRepo;


@Service
public class BookService {

	@Autowired
	BookRepo br;
	@Autowired
	UserRepo ur;
	
	
	public BookRepo getBr() {
		return br;
	}

	public void setBr(BookRepo br) {
		this.br = br;
	}
	
	public void insertBook(Book b) {
		br.save(b);
	}
	
	public void deleteBook(int id)
	{
		br.deleteById(id);
	}
	
	public Book getbookByID(int id)
	{
		 return br.findById(id).get();
	}
	public List<Book> getAllBooks()
	{
		return (List<Book>) br.findAll();
	}
	public List<Book> sortbyName()
	{
		return br.findAll(Sort.by(Sort.Direction.DESC,"bookname"));
	}
	public void addUser(User user)
	{
		ur.save(user);
	}
	public String validateUser(int userid)
	{
		User u=ur.findById(userid).get();
		return u.getType();
	}
	public void deleteUser(int uid)
	{
		ur.deleteById(uid);
	}
	public List<User> getAllusers()
	{
		return (List<User>) ur.findAll();
	}
	public void updateBook(Book b)
	{
		Book b1=br.findById(b.getBid()).get();
		b1.setBookname(b.getBookname());
		br.save(b1);
	}
	
}
