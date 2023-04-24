package com.rest_project.repository;

import org.springframework.data.repository.CrudRepository;

import com.rest_project.model.User;

public interface UserDaoRepository extends CrudRepository<User, Long> {
	
	public User findByEmail(String email);
	public boolean existsByEmail(String email);

}
