package com.stud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.stud.service.StudentService;

public class StudentController {

	@Autowired
	StudentService ss;
	
	@RequestMapping("/up")
	public ModelAndView goHome()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("hello");
		return mv;
	}
}
