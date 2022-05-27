package com.seatbooking.repo;

import org.springframework.data.repository.CrudRepository;

import com.seatbooking.model.Users;

public interface UserRepoistory extends CrudRepository<Users,Integer> {

}
