package com.rest_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest_project.model.Device;
import com.rest_project.service.DeviceService;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/device")
public class DeviceController {
	
	@Autowired DeviceService deviceService;
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		return new ResponseEntity<List<Device>>(deviceService.getAllDevice(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getDevice(@PathVariable Long id){
		return new ResponseEntity<Device>(deviceService.getDevice(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> createDevice(@RequestBody Device device) {
		return new ResponseEntity<Device>(deviceService.createDevice(device), HttpStatus.CREATED);

	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletDevice(@PathVariable Long id){
		return new ResponseEntity<String>(deviceService.removeDevice(id), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateUser(@RequestBody Device device) {
		return new ResponseEntity<Device>(deviceService.updateDevice(device), HttpStatus.CREATED);
	}
	

}
