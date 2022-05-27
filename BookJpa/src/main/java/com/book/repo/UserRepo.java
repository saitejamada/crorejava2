package com.book.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
