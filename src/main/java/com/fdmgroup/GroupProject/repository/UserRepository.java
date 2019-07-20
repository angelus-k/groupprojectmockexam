package com.fdmgroup.GroupProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fdmgroup.GroupProject.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findUserById(int id);
	
	User findUserByEmail(String email);
	
}
