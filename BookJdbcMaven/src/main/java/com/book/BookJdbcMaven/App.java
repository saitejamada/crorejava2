package com.book.BookJdbcMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.book.bookjdbc.bean.Book;
import com.book.bookjdbc.dao.BookDAO;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("/com/book/resource/Beans.xml");
    	BookDAO bda=(BookDAO)ctx.getBean("bdao");

    	Book b=new Book();
    	b.setBid(91);
    	b.setBname("Complete Refernce to Servlet");
    	bda.saveBook(b);
    	//System.out.println("Book Saved Successfully in the Database");
    	 //bda.updateBook(902, "Spring In Action");
    	 //System.out.println("Book details updated successfully");

    	 //bda.deleteBook(902);
    	 //System.out.println("Book Deleted Successfully");
    	String bookname=bda.getBookByName(90);
    	System.out.println("Book Name is=="+bookname);

    }
}
