package com.register.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.register.model.Register;

@Repository
public interface RegisterRepository  extends JpaRepository<Register,Integer>{

}
