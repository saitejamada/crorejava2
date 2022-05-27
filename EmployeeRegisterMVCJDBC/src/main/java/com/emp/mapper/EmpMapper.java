package com.emp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.emp.model.Employee;

public class EmpMapper implements RowMapper {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setEid(rs.getString(1));
		e.setName(rs.getString(2));
		e.setSalary(rs.getString(3));
		e.setDesignation(rs.getString(4));

		return e;
	}

}
