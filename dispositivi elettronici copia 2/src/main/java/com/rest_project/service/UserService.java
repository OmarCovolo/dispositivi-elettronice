package com.rest_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.rest_project.model.User;
import com.rest_project.repository.UserDaoRepository;
import com.rest_project.repository.UserPageableRepository;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
	
	@Autowired UserDaoRepository repo;
	@Autowired UserPageableRepository repoPageable;

	public List<User> getAllUser() {
		return (List<User>) repo.findAll();
	}
	
	public Page<User> getAllUserPageable(Pageable pageable) {
		return (Page<User>) repoPageable.findAll(pageable);
	}
	
	public User getUser(Long id) {
		if(!repo.existsById(id)) {
			throw new EntityNotFoundException("User not exists!!!");
		}
		return repo.findById(id).get();
	}
	
	public User createUser(User user) {
		if(repo.existsByEmail(user.getEmail())) {
			throw new EntityExistsException("Email exists!!!");
		} else {
			repo.save(user);
		}
		return user;
	}
	
	public String removeUser(Long id) {
		if(!repo.existsById(id)) {
			throw new EntityExistsException("User not exists!!!");
		}
		repo.deleteById(id);
		return "User Deleted!!!";
	}
	
	public User updateUser(User user) {
		if(!repo.existsById(user.getId())) {
			throw new EntityExistsException("User not exists!!!");
		}
		repo.save(user);
		return user;
	}

}
