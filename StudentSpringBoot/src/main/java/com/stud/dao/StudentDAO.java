package com.stud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.stud.model.Student;
import com.stud.rowmapper.StudMapper;

@Repository
public class StudentDAO {

	@Autowired
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public void saveStudent(Student s)
	{
	String sql="insert into student1 values('"+s.getSid()+"','"+s.getName()+"','"+s.getCourse()+"','"+s.getAddress()+"')";
	template.update(sql);
	System.out.println("Student saved successfully");
	}
	public void updateStudent(String sid,String name)
	{
		String sql="update student1 set name='"+name+"' where sid='"+sid+"'";
		template.update(sql);
	}
	public void deleteStudent(String sid)
	{
		String sql="delete from student1  where sid='"+sid+"'";
		template.update(sql);
	}
	public List<Student> getStudent(String sid)
	{
		String sql="select * from student1 where sid='"+sid+"'";
		System.out.println("in dao"+sid);
		return template.query(sql, new StudMapper());
	}
	public List<Student> getALLStudent()
	{
		String sql="select * from student1";
		return template.query(sql, new StudMapper());
	}
}
