package com.book.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.book.bean.Authour;
import com.book.bean.Book;

@Configuration
@ComponentScan("com.book.bean")
public class BookConfig {

	@Bean
	public Book getBook()
	{
		return new Book();
		
	}
	@Bean
	public Authour getAuthour()
	{
		return new Authour();
		
	}
	
}
