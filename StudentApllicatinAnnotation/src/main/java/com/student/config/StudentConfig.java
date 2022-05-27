package com.student.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.student.bean.Student;

@Configuration
@ComponentScan("com.student.bean")
public class StudentConfig {

	@Bean
	public Student getStudent()
	{
		return new Student();
	}
}
