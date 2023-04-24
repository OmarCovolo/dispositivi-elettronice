package com.rest_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest_project.model.User;
import com.rest_project.service.UserService;

@RestController
@RequestMapping("/users/pageable")
public class UserPageableController {

	@Autowired UserService userService;
	
	@GetMapping
	public ResponseEntity<Page<User>> getAllPageable(Pageable pageable) {
		return new ResponseEntity<Page<User>>(userService.getAllUserPageable(pageable), HttpStatus.OK);
	}
	
}
