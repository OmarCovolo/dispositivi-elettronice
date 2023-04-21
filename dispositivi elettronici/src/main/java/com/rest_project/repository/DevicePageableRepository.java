package com.rest_project.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.rest_project.model.Device;

public interface DevicePageableRepository extends PagingAndSortingRepository<Device, Long> {

}
