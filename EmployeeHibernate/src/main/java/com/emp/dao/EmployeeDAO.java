package com.emp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.emp.pojo.Employee;

public class EmployeeDAO {

	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	@Transactional
	public void insertEmp(Employee e)
	{
		template.save(e);
	}
	 @Transactional
	public void updateEmp(int eid,String name)
	{
		 Employee b1=template.get(Employee.class,eid);
			  b1.setName(name);
			  template.save(b1); 
	}
	 @Transactional
	public void deleteEmp(int eid)
	{
			 Employee b1=template.get(Employee.class,eid);
			 template.delete(b1);
	}
	@Transactional
	public Employee getEmp(int eid)
	{
		Employee e=template.get(Employee.class, eid);
		return e;
	}
	@Transactional
	public List<Employee> getAllEmp()
	{
		List<Employee> e=new ArrayList<Employee>();
		e=template.loadAll(Employee.class);
		return e;
	}
	 
}
