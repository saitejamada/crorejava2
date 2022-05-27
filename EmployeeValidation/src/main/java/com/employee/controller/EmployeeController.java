package com.employee.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.model.Employee;

@Controller
public class EmployeeController {

@RequestMapping("/emp")
public String diplayEmployee(Model m1)
{

m1.addAttribute("emp",new Employee());
return "EmpDetails";
}

@RequestMapping("/addEmp")
public String addNewEmp(@Valid @ModelAttribute("emp") Employee emp,BindingResult br)
{
if(br.hasErrors())
{
System.out.println("Error is there");
return "EmpDetails";
}
else
return "ViewEmpDetails";
}
}