package com.book.bookjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.book.bookjdbc.bean.Book;

public class BookDAO {

	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public void saveBook(Book b)
	{
	String sql="insert into books values("+b.getBid()+",'"+b.getBname()+"')";
	template.update(sql);
	}
	public void updateBook(int bid,String bnm)
	{
	String sql="update books set name='"+bnm+"'where bid="+bid;
	template.update(sql);
	}
	public void deleteBook(int bid)
	{
	String sql="delete from books where bid="+bid;
	template.update(sql);
	}
	public String getBookByName(int bid)
	{
	String sql="select name from books where bid="+bid;
	return template.queryForObject(sql,String.class);
	}
	
}



