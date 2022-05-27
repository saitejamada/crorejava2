package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.book.dao.BookDAO;
import com.book.model.Book;

@Controller
public class BookController {

	Book b;
	@Autowired
	BookDAO dao;
	ModelAndView mv;
	
	@RequestMapping("/insert")
	public ModelAndView insertBook(@RequestParam("bid") String bookid,@RequestParam("bname") String bookname,@RequestParam("bprice") String bookprice,@RequestParam("bauth") String bookauth)
	{
		mv=new ModelAndView();
		b=new Book();
		b.setBid(bookid);
		b.setBookname(bookname);
		b.setPrice(bookprice);
		b.setAuthourname(bookauth);
		dao.insertBook(b);
		mv.addObject("bk", b);
		mv.setViewName("Display.jsp");
		return mv;
		
	}
	@RequestMapping("/update")
	public ModelAndView updateBook(@RequestParam("bid") String bookid,@RequestParam("bname") String bookname)
	{
		mv=new ModelAndView();
		dao.updateBook(bookid, bookname);
		mv.setViewName("New.jsp");
		return mv;
		
	}
	@RequestMapping("/delete")
	public ModelAndView deletBook(@RequestParam("bid") String bookid)
	{
		mv=new ModelAndView();
		dao.deleteBook(bookid);
		mv.setViewName("New.jsp");
		return mv;
	}
	@RequestMapping("/view")
	public ModelAndView ViewBook(@RequestParam("bid") String bookid)
	{
		mv=new ModelAndView();
		b=dao.getBook(bookid);
		mv.addObject("book", b);
		mv.setViewName("Viewone.jsp");
		return mv;
	}
	
	@RequestMapping("/viewAll")
	public ModelAndView ViewALLBook()
	{
		mv=new ModelAndView();
		List<Book> list=dao.getAllBooks();
		mv.addObject("allbooks", list);
		mv.setViewName("DisplayAll.jsp");
		return mv;
	}
}
