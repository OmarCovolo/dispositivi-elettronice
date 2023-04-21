package com.rest_project.repository;

import org.springframework.data.repository.CrudRepository;

import com.rest_project.model.Device;

public interface DeviceDaoRepository extends CrudRepository<Device, Long> {
	
	public Device findById(String id);
	public boolean existsByid(String id);

}
