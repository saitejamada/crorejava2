package com.register.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;
import com.register.model.Register;
import com.register.repo.RegisterRepository;

@Service
public class RegisterService {

	@Autowired
	RegisterRepository rr;

	public RegisterRepository getRr() {
		return rr;
	}

	public void setRr(RegisterRepository rr) {
		this.rr = rr;
	}
	
	public void registerUser(Register r)
	{
		rr.save(r);
	}
	
	public void updateUser(Register r)
	{
		Register r1=rr.findById(r.getUserid()).get();
		r1.setQualification(r.getQualification());
		rr.save(r1);
	}
	public void deleteUser(int id)
	{
		rr.deleteById(id);
	}
	
	public Register getUserByID(int id)
	{
		 return rr.findById(id).get();
	}
	
	public List<Register> getAllUsers()
	{
		return (List<Register>) rr.findAll();
	}
	public List<Register> sortbyEmail()
	{
		return rr.findAll(Sort.by(Sort.Direction.DESC,"email"));
	}
}
