package com.stud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.stud.dao.StudentDAO;
import com.stud.model.Student;

@Controller
public class StudentController {

	@Autowired
	StudentDAO dao;
	Student s;
	ModelAndView mv;
	
	@RequestMapping("/home")
	public ModelAndView home()
	{
		mv=new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/up")
	public ModelAndView up()
	{
		mv=new ModelAndView();
		mv.setViewName("update");
		return mv;
	}
	@RequestMapping("/del")
	public ModelAndView delete()
	{
		mv=new ModelAndView();
		mv.setViewName("delete");
		return mv;
	}
	@RequestMapping("/vie")
	public ModelAndView view()
	{
		mv=new ModelAndView();
		mv.setViewName("view");
		return mv;
	}
	@RequestMapping("/insert")
	public ModelAndView addStud(@RequestParam("sid") String sid,@RequestParam("sname") String sname,@RequestParam("scource") String course,@RequestParam("sadd") String eadd)
	{
		s=new Student();
		s.setSid(sid);s.setName(sname);s.setCourse(course);s.setAddress(eadd);
		mv=new ModelAndView();
		dao.saveStudent(s);
		mv.addObject("stud", s);
		mv.setViewName("display");
		return mv;
	}
	@RequestMapping("/update")
	public ModelAndView updateStud(@RequestParam("sid") String sid,@RequestParam("sname") String sname)
	{
		mv=new ModelAndView();
		dao.updateStudent(sid, sname);
		mv.setViewName("operation");
		return mv;
	}
	@RequestMapping("/delete")
	public ModelAndView deleteStud(@RequestParam("sid") String sid)
	{
		mv=new ModelAndView();
		dao.deleteStudent(sid);
		mv.setViewName("operation");
		return mv;
	}
	@RequestMapping("/view")
	public ModelAndView getStud(@RequestParam("sid") String sid)
	{
		mv=new ModelAndView();
		s=new Student();
		System.out.println(sid);
		s.setSid(sid);
		List<Student> list=dao.getStudent(sid);
		mv.addObject("student", list);
		mv.setViewName("viewone");
		return mv;
	}
	@RequestMapping("/viewall")
	public ModelAndView getStud()
	{
		mv=new ModelAndView();
		List<Student> list=dao.getALLStudent();
		mv.addObject("stud", list);
		mv.setViewName("viewall");
		return mv;
	}
}
