package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.book.model.Book;
import com.book.model.User;
import com.book.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bs;
	
	@RequestMapping("/home")
	public String goHome(Model m)
	{
		Book b=new Book();
		m.addAttribute("bk", b);
		return "HomePage";
	}
	@RequestMapping("/insert")
	public String saveBook(@ModelAttribute("bk") Book bk,Model m)
	{
		bs.insertBook(bk);
		return "Operation";
	}
	
	@RequestMapping("/reg")
	public String logIn(Model m)
	{
		User u=new User();
		m.addAttribute("us", u);
		return "AddUser";
	}
	@RequestMapping("/validateuser")
	public String validateuser(@ModelAttribute("us") User u,Model m)
	{
		String type=bs.validateUser(u.getUserid());
		if(type.equals("admin"))
		{
			return "Admin";
		}
		else
		{
			return "Success";
		}
	}
	@RequestMapping("/insertuser")
	public String User(@ModelAttribute("us") User u,Model m)
	{
		bs.addUser(u);
		return "login";
	}
	@RequestMapping("/menu")
	public String menu(Model m)
	{
		List<Book> list=bs.getAllBooks();
		m.addAttribute("list", list);
		return "Menu";
	}
	
	@RequestMapping("/del")
	public String goDel(Model m)
	{
		Book b=new Book();
		m.addAttribute("bk", b);
		return "DeleteBook";
	}
	@RequestMapping("/delete")
	public String delBook(@ModelAttribute("bk") Book bk,Model m)
	{
		bs.deleteBook(bk.getBid());
		return "Operation";
	}
	@RequestMapping("/deluser")
	public String del(Model m)
	{
		User u=new User();
		m.addAttribute("us", u);
		return "DeleteUser";
	}
	
	@RequestMapping("/deleteuser")
	public String delUser(@ModelAttribute("us") User user,Model m)
	{
		bs.deleteUser(user.getUserid());
		return "Operation";
	}
	@RequestMapping("/viewuser")
	public String viewuser(Model m)
	{
		List<User> list=bs.getAllusers();
		m.addAttribute("list", list);
		return "ViewAllUser";
	}
	
	@RequestMapping("/up")
	public String upBook(Model m)
	{
		Book b=new Book();
		m.addAttribute("bk", b);
		return "UpdateBook";
	}
	@RequestMapping("/update")
	public String upBook(@ModelAttribute("bk") Book bk,Model m)
	{
		bs.updateBook(bk);
		return "Operation";
	}
	
}
