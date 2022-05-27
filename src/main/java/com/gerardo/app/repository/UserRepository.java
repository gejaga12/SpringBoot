package com.gerardo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerardo.app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
	
	
	
	
	
}
