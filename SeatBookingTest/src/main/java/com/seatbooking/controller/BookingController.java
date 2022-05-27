package com.seatbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seatbooking.model.Theathre;
import com.seatbooking.model.Users;
import com.seatbooking.service.BookService;

@Controller
public class BookingController {

	@Autowired
	BookService bs;
	
	@RequestMapping("/home")
	public String getIndex(Model m)
	{
		Users user=new Users();
		m.addAttribute("user", user);
		return "Home";
	}
	
	@RequestMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") Users user,Model m)
	{
		bs.addUser(user);
		return "Home";
	}
	
	@RequestMapping("/thea")
	public String getThea(Model m)
	{
		Theathre th=new Theathre();
		m.addAttribute("thea", th);
		return"Theater";
	}
	@RequestMapping("/registerTheathre")
	public String registerTheatre(@ModelAttribute("th") Theathre th,Model m)
	{
		bs.addTheartre(th);
		return "HomePage";
		
	}
	@RequestMapping("/viewth")
	public String viewThea(Model m)
	{
		List<Theathre> list=bs.viewAllTheathre();
		m.addAttribute("list", list);
		return "HomePage";
		
	}
	@RequestMapping("/admin")
	public String admin(Model m)
	{
		return "Admin";
	}
	@RequestMapping("/viewuser")
	public String viewuser(Model m)
	{
		List<Users> list=bs.viewAllUsers();
		m.addAttribute("list", list);
		return "ViewAll";
	}
	
	@RequestMapping("/final")
	public String finals(Model m)
	{
		return "final";
	}
	@RequestMapping("/removeUser")
	public String deleteUser(@ModelAttribute("user") Users user,Model m)
	{
		bs.removeUser(user.getUserid());
		return "Condition";
	}
	
	@RequestMapping("/deluser")
	public String del(Model m)
	{
		Users user=new Users();
		m.addAttribute("user", user);
		return "RemoveUser";
	}
	@RequestMapping("/delthe")
	public String delethe(Model m)
	{
		Theathre th=new Theathre();
		m.addAttribute("thea", th);
		return "RemoveThea";
	}
	@RequestMapping("/removeTheathre")
	public String deleteT(@ModelAttribute("thea") Theathre th,Model m)
	{
		bs.removethreatre(th.getTid());
		return "Condition";
	}
	@RequestMapping("/vius")
	public String viewUs(Model m)
	{
		Users user=new Users();
		m.addAttribute("user", user);
		return "ViewUser";
	}
	@RequestMapping("/viewUse")
	public String viewU(@ModelAttribute("user") Users user,Model m)
	{
		Users list =bs.viewUser(user.getUserid());
		m.addAttribute("list", list);
		return "ViewOneUser";
	}
	
	@RequestMapping("/vith")
	public String viewTh(Model m)
	{
		Theathre th=new Theathre();
		m.addAttribute("thea", th);
		return "ViewThea";
	}
	@RequestMapping("/viewTheathre")
	public String viewThe(@ModelAttribute("thea") Theathre th,Model m)
	{
		Theathre th1=bs.viewThreater(th.getTid());
		m.addAttribute("list", th1);
		return "ViewOneThea";
	}
	@RequestMapping("/upth")
	public String upTh(Model m)
	{
		Theathre th=new Theathre();
		m.addAttribute("thea", th);
		return "Update";
	}
	@RequestMapping("/upTheathre")
	public String updateTh(@ModelAttribute("thea")Theathre th,Model m)
	{
		bs.updateThea(th);
		return "Condition";
		
	}
}
