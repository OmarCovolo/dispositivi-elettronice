package com.rest_project.runner;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.rest_project.model.User;
import com.rest_project.service.UserService;

@Component
public class UserRunner implements ApplicationRunner {
	
	@Autowired @Qualifier("AdminUserBean") ObjectProvider<User> adminBeanProvider;
	@Autowired @Qualifier("FakeUserBean") ObjectProvider<User> fakeBeanProvider;
	
	@Autowired UserService userService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
//		System.out.println("Run...");
//		userService.createUser(adminBeanProvider.getObject());
//		userService.createUser(fakeBeanProvider.getObject());
//		userService.createUser(fakeBeanProvider.getObject());
//		userService.createUser(fakeBeanProvider.getObject());
//		userService.createUser(fakeBeanProvider.getObject());
	}

}
