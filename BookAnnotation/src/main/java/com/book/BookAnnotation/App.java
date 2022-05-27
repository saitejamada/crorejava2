package com.book.BookAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.book.bean.Book;
import com.book.config.BookConfig;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new AnnotationConfigApplicationContext(BookConfig.class);
    	Book e=(Book)ctx.getBean(Book.class);
    	System.out.println(e);
    
    }
}
