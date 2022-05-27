package com.emp.dao;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.emp.mapper.EmpMapper;
import com.emp.model.Employee;


public class EmployeeDAO {
	
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public void registerEmployee(Employee e)
	{
		String sql="insert into registeremp values('"+e.getEid()+"','"+e.getName()+"','"+e.getSalary()+"','"+e.getDesignation()+"')";
		template.update(sql);
	}
	
	public void updateEmployee(String eid,String name)
	{
		String sql="update registeremp set name='"+name+"' where empid="+eid;
		template.update(sql);
	}
	public void deleteEmployee(String eid)
	{
		String sql="delete from registeremp where empid='"+eid+"'";
		template.update(sql);
	}
	public List<Employee> getALlEmployees()
	{
		String sql="select * from registeremp";
		return template.query(sql,new EmpMapper());
		
	}
	public List<Employee> getEmployee(String eid)
	{
		
		String sql="select * from registeremp where empid='"+eid+"'";
		return template.query(sql,new EmpMapper());
	}
}
