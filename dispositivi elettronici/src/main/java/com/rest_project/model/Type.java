package com.rest_project.model;

import com.github.javafaker.Faker;

public enum Type {
	SMARTPHONE, TABLET, LAPTOP;
	
	private static final Faker faker = new Faker();

	  public static Type randomType() {
	    return Type.values()[faker.random().nextInt(Status.values().length)];
	  }

}
