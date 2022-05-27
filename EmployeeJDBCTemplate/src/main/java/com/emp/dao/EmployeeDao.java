package com.emp.dao;
import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;

import com.emp.bean.Employee;
import com.emp.mapper.EmpMapper;

public class EmployeeDao {

	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public void saveEmp(Employee e)
	{
	String sql="insert into employee values("+e.getEid()+",'"+e.getName()+"',"+e.getSalary()+","+e.getDid()+",'"+e.getDname()+"')";
	template.update(sql);
	}
	public void updateEmp(int eid,String name)
	{
	String sql="update employee set name='"+name+"'where eid="+eid;
	template.update(sql);
	}
	public void deleteEmp(int eid)
	{
	String sql="delete from employee where eid="+eid;
	template.update(sql);
	}
	public String getEmpByName(int eid)
	{
	String sql="select name from employee where eid="+eid;
	return template.queryForObject(sql,String.class);
	}
	public List<Employee> getAllEmp()
	{
		String sql="select * from employee";
		return template.query(sql, new EmpMapper());
	}
}
