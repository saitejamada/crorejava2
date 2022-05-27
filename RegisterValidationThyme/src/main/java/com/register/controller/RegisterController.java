package com.register.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.register.model.Register;

@Controller
public class RegisterController {

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
			return "Success";
			}
	}
}
