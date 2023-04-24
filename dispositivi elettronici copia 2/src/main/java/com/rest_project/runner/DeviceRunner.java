package com.rest_project.runner;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.rest_project.model.Device;
import com.rest_project.service.DeviceService;

@Component
public class DeviceRunner implements ApplicationRunner {
	
	@Autowired @Qualifier("FakeDeviceBean") ObjectProvider<Device> deviceBeanProvider;
	
	@Autowired DeviceService DeviceService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Run...");
	DeviceService.createDevice(deviceBeanProvider.getObject());
	}

}
