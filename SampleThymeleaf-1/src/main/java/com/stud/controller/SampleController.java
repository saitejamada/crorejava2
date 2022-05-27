package com.stud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class SampleController {

	@RequestMapping("/home")
	public String home(Model m)
	{
		m.addAttribute("msg", "done are macha");
		return "NewFile.html";
	}
}
