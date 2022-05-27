package com.emp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.emp.bean.Employee;

public class EmpMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setEid(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setSalary(rs.getInt(3));
		e.setDid(rs.getInt(4));
		e.setDname(rs.getString(5));
		return e;
	}

	
}
