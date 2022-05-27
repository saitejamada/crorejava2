package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sample.doa.SampleDAO;

@Controller
//@ResponseBody
public class SampleController {

	@Autowired
	SampleDAO dao;

	@RequestMapping("/hello")
	public String hello()
	{
		return "hello hi";
	}

	@RequestMapping("/add")
	public ModelAndView saveEmp()
	{
	ModelAndView mv=new ModelAndView();
	dao.saveStudent();
	mv.addObject("msg", "Student saved successfully");
	mv.setViewName("Employee");
	return mv;
	}
}
