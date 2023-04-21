package com.rest_project.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.rest_project.model.User;

public interface UserPageableRepository extends PagingAndSortingRepository<User, Long> {

}
