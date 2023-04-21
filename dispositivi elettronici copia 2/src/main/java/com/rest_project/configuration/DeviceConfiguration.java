package com.rest_project.configuration;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.rest_project.model.Device;
import com.rest_project.model.Status;
import com.rest_project.model.Type;

@Configuration
public class DeviceConfiguration {


	
	@Bean("FakeDeviceBean")
	@Scope("prototype")
	public Device newFakeDevice() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		return Device.builder()
				.type(Type.randomType())
				.status(Status.randomStatus())
				.build();
	}


}
