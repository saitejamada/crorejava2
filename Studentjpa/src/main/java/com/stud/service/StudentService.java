package com.stud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stud.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo sr;
	
	
}
