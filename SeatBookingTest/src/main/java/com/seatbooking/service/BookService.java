package com.seatbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seatbooking.model.Theathre;
import com.seatbooking.model.Users;
import com.seatbooking.repo.BookRepository;
import com.seatbooking.repo.UserRepoistory;

@Service
public class BookService {

	@Autowired
	BookRepository brao;
	@Autowired
	UserRepoistory urao;
	
	public BookRepository getBrao() {
		return brao;
	}
	public void setBrao(BookRepository brao) {
		this.brao = brao;
	}
	public UserRepoistory getUrao() {
		return urao;
	}
	public void setUrao(UserRepoistory urao) {
		this.urao = urao;
	}
	
	public void addUser(Users u)
	{
		urao.save(u);
	}
	 public void addTheartre(Theathre t)
	 {
		 brao.save(t);
	 }
	 public void removeUser(int id)
	 {
		 urao.deleteById(id);
	 }
	 public void removethreatre(int id)
	 {
		 brao.deleteById(id);
	 }
	 public Users viewUser(int id)
	 {
		 return urao.findById(id).get();
	 }
	 public Theathre  viewThreater(int id)
	 {
		 return brao.findById(id).get();
	 }
	 
	 public List<Users> viewAllUsers()
	 {
		 return (List<Users>) urao.findAll();
	 }
	 
	 public List<Theathre> viewAllTheathre()
	 {
		 return (List<Theathre>) brao.findAll();
	 }
	 
	 public void updateThea(Theathre t)
	 {
		Theathre t1=brao.findById(t.getTid()).get();
		t1.setMoviename(t.getMoviename());
		brao.save(t1);
	 }
	 
}
