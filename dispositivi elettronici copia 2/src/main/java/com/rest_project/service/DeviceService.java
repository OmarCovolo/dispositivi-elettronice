package com.rest_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.rest_project.model.Device;
import com.rest_project.repository.DeviceDaoRepository;
import com.rest_project.repository.DevicePageableRepository;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class DeviceService {
	
	@Autowired DeviceDaoRepository repo;
	@Autowired DevicePageableRepository repoPageable;

	public List<Device> getAllDevice() {
		return (List<Device>) repo.findAll();
	}
	
	public Page<Device> getAllDevicePageable(Pageable pageable) {
		return (Page<Device>) repoPageable.findAll(pageable);
	}
	
	public Device getDevice(Long id) {
		if(!repo.existsById(id)) {
			throw new EntityNotFoundException("Device not exists!!!");
		}
		return repo.findById(id).get();
	}
	
	public Device createDevice(Device device) {
		if(repo.existsById(device.getId())) {
			throw new EntityExistsException("id exists!!!");
		} else {
			repo.save(device);
		}
		return device;
	}
	
	public String removeDevice(Long id) {
		if(!repo.existsById(id)) {
			throw new EntityExistsException("Device not exists!!!");
		}
		repo.deleteById(id);
		return "Device Deleted!!!";
	}
	
	public Device updateDevice(Device device) {
		if(!repo.existsById(device.getId())) {
			throw new EntityExistsException("Device not exists!!!");
		}
		repo.save(device);
		return device;
	}

}
