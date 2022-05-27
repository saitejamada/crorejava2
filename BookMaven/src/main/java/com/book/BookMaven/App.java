package com.book.BookMaven;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.book.bean.Book;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("/com/book/resource/Beans.xml");
        Book s=(Book)ctx.getBean("bk");
        System.out.println(s);
    }
}
