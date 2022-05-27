package com.stud.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

	@RequestMapping("/home")
	public String home(Model m)
	{
		m.addAttribute("msg", "Saiteja");
		return "NewFile";
	}
	
//	@RequestMapping("/lis")
//	public String list(Model m)
//	{
//		List<String> names=List.of("ankith","sai","ram","krish","pavan");
//		m.addAttribute("names", names);
//		return "NewFile.html";
//	}
	@RequestMapping("/condt")
	public String conditonhandler(Model m)
	{
		m.addAttribute("isActive", false);
		m.addAttribute("gender", "f");
		return "Condition";
	}
	
	
}
