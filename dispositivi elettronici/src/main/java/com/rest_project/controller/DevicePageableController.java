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

import com.rest_project.model.Device;
import com.rest_project.service.DeviceService;

@RestController
@RequestMapping("/device/pageable")
public class DevicePageableController {

	@Autowired DeviceService deviceService;
	
	@GetMapping
	public ResponseEntity<Page<Device>> getAllPageable(Pageable pageable) {
		return new ResponseEntity<Page<Device>>(deviceService.getAllDevicePageable(pageable), HttpStatus.OK);
	}
	
}
