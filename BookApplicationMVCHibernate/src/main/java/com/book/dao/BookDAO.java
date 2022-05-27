package com.book.dao;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.book.model.Book;

public class BookDAO {

	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	@Transactional
	public void insertBook(Book b)
	{
	template.save(b);
	}
	
	@Transactional
	public void updateBook(String bid,String nm)
	{
	Book b1=template.get(Book.class,bid);
	b1.setBookname(nm);
	template.save(b1);
	}
	
	@Transactional
	public void deleteBook(String bid)
	{
	Book b1=template.get(Book.class, bid);
	template.delete(b1);
	}
	@Transactional
	public Book getBook(String eid)
	{
		Book e=template.get(Book.class, eid);
		return e;
	}
	@Transactional
	public List<Book> getAllBooks()
	{
		List<Book> e=new ArrayList<Book>();
		e=template.loadAll(Book.class);
		return e;
	}
}
