package com.emp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.emp.dao.EmployeeDAO;
import com.emp.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDAO dao;
	
	ModelAndView mv;
	Employee e;
	
	@RequestMapping("/emp")
	public ModelAndView register(@RequestParam("eid") String eid,@RequestParam("ename") String ename,@RequestParam("salary") String salary,@RequestParam("des") String designation)
	{
		mv=new ModelAndView();
		e=new Employee();
		e.setEid(eid);e.setName(ename);e.setSalary(salary);e.setDesignation(designation);
		mv.addObject("employee", e);
		dao.registerEmployee(e);
		mv.setViewName("Display.jsp");
		return mv;
		
	}
	@RequestMapping("/update")
	public  ModelAndView update(@RequestParam("eid") String eid,@RequestParam("ename") String ename)
	{
		mv=new ModelAndView();
		e=new Employee();
		e.setEid(eid);e.setName(ename);
		mv.addObject("update", e);
		dao.updateEmployee(eid, ename);
		mv.setViewName("UpdatedDisplay.jsp");
		return mv;
	}
	@RequestMapping("/delete")
	public  ModelAndView delete(@RequestParam("eid") String eid)
	{
		mv=new ModelAndView();
		e=new Employee();
		e.setEid(eid);
		mv.addObject("delete", e);
		dao.deleteEmployee(eid);
		mv.setViewName("");
		return mv;
	}
	@RequestMapping("/viewall")
	public ModelAndView viewAll()
	{
		mv=new ModelAndView();
		e=new Employee();
		List<Employee> list=dao.getALlEmployees();
		mv.addObject("view",list);
		mv.setViewName("ViewAll.jsp");
		return mv;
	}
	@RequestMapping("/viewone")
	public ModelAndView view(@RequestParam("eid") String eid)
	{
		mv=new ModelAndView();
		//e=new Employee();
		//e.setEid(eid);
		List<Employee> al=dao.getEmployee(eid);
		mv.addObject("v",al);
		mv.setViewName("View.jsp");
		return mv;
	}
	
	
}
