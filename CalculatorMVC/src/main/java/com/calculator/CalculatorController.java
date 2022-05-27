package com.calculator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController  {

	int num1;int num2;int result;

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response)
	{
		num1=Integer.parseInt(request.getParameter("t1"));
		num2=Integer.parseInt(request.getParameter("t2"));
		result=num1+num2;
		ModelAndView mv=new ModelAndView();
		mv.addObject("res", result);
		mv.setViewName("Display.jsp");
		return mv;
	}
	@RequestMapping("/sub")
	public ModelAndView sub(HttpServletRequest request, HttpServletResponse response)
	{
		System.out.println(request.getParameter("t1"));
		num1=Integer.parseInt(request.getParameter("t1"));
		num2=Integer.parseInt(request.getParameter("t2"));
		result=num1-num2;
		ModelAndView mv=new ModelAndView();
		mv.addObject("res", result);
		mv.setViewName("Display.jsp");
		return mv;
		
	}
	@RequestMapping("/mul")
	public ModelAndView mul(HttpServletRequest request, HttpServletResponse response)
	{
		num1=Integer.parseInt(request.getParameter("t1"));
		num2=Integer.parseInt(request.getParameter("t2"));
		result=num1*num2;
		ModelAndView mv=new ModelAndView();
		mv.addObject("res", result);
		mv.setViewName("Display.jsp");
		return mv;
	}
	@RequestMapping("/div")
	public ModelAndView div(HttpServletRequest request, HttpServletResponse response)
	{
		num1=Integer.parseInt(request.getParameter("t1"));
		num2=Integer.parseInt(request.getParameter("t2"));
		result=num1/num2;
		ModelAndView mv=new ModelAndView();
		mv.addObject("res", result);
		mv.setViewName("Display.jsp");
		return mv;
	}
	@RequestMapping("/cal")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv=new ModelAndView();
		num1=Integer.parseInt(request.getParameter("t1"));
		num2=Integer.parseInt(request.getParameter("t2"));
		String op=request.getParameter("b1");
		if(op.equalsIgnoreCase("add"))
			result=num1+num2;
		else if(op.equalsIgnoreCase("sub"))
		result=num1-num2;
		else if(op.equalsIgnoreCase("mul"))
			result=num1*num2;
		else if(op.equalsIgnoreCase("div"))
			result=num1/num2;
			
		mv.addObject("res", result);
		mv.setViewName("Display.jsp");
		
		return mv;	
	}

}
