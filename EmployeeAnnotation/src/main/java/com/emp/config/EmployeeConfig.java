package com.emp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.emp.bean.Deapartment;
import com.emp.bean.Employee;

@Configuration
@ComponentScan("com.emp.bean")
public class EmployeeConfig {

	@Bean
	public Employee getEmp()
	{
		return new Employee();
	}
	
	@Bean
	public Deapartment getDept()
	{
		return new Deapartment();
	}
}
