package com.book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.book.bean.Book;
import com.book.dao.BookDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
    	BookDao bdao=(BookDao)ctx.getBean("bdao");
    	Book b=new Book();
    	b.setBid(9001);
    	b.setName("Complete Reference to Java");
    	b.setPrice(890);
    	bdao.insertBook(b);
    	System.out.println("Book Saved Successfully");

    	/* String bname="Spring In Action";
    	bdao.updateBook(9001, bname);
    	System.out.println("Book Updated Successfully");
    	*/
    	//bdao.deleteBook(9001);
    	//System.out.println("Book Deleted Successfully");
    }
}
