package com.stud.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.stud.model.Student;

public class StudMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setSid(rs.getString("sid"));
		s.setName(rs.getString(2));
		s.setCourse(rs.getString(3));
		s.setAddress(rs.getString(4));
		return s;
	}
	

}
