package com.register.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.register.model.Register;
import com.register.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	RegisterService rs;
	
	@RequestMapping(path="/validate",method = RequestMethod.GET)
	public String validateUser(Model m)
	{
	Register reg=new Register();
	m.addAttribute("reg", reg);
	return "login1";
	}
	
	@RequestMapping(path="/register",method=RequestMethod.POST)
	public String submitForm(@Valid @ModelAttribute("reg") Register reg,BindingResult bindingResult, Model model)
	{
		if (bindingResult.hasErrors()) {
			return "login1";
			} else {
			rs.registerUser(reg);
			return "Success";
			}
	}
	@RequestMapping("/update")
	public String update(@ModelAttribute("reg") Register reg,Model model)
	{
		rs.updateUser(reg);
		return "Success";
		
	}
	@RequestMapping("/delete")
	public String delete(@ModelAttribute("reg") Register reg,Model model)
	{
		rs.deleteUser(reg.getUserid());
		return "Success";
	}
	@RequestMapping("/view")
	public String view(@ModelAttribute("reg") Register reg,Model model)
	{
		Register reg1=rs.getUserByID(reg.getUserid());
		model.addAttribute("reg", reg1);
		return "ViewOne";	
	}
	@RequestMapping("/viewall")
	public String getAllUsers(Model m)
	{
		List<Register> list=rs.getAllUsers();
		m.addAttribute("list", list);
		return "ViewAll";
	}
	
	
	@RequestMapping(path="/vi")
	public String viUser(Model m)
	{
		Register reg=new Register();
		m.addAttribute("reg", reg);
		return"View";
	}
	@RequestMapping(path="/up")
	public String updateUser(Model m)
	{
		Register reg=new Register();
		m.addAttribute("reg", reg);
		return"Update";
	}
	@RequestMapping(path="/del")
	public String deleteUser(Model m)
	{
		Register reg=new Register();
		m.addAttribute("reg", reg);
		return"Delete";
	}
	@RequestMapping(path="/sort")
	public String sortEmail(Model m)
	{
		List<Register> list=rs.sortbyEmail();
		m.addAttribute("list", list);
		return "ViewAll";
	}
}

