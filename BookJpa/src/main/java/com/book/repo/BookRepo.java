package com.book.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.model.Book;

public interface BookRepo extends JpaRepository<Book,Integer> {

	
}
