package com.rest_project.model;
import com.github.javafaker.Faker;

public enum Status {
DISPONIBILE, MANUTENZIONE, DISMESSO;

	  private static final Faker faker = new Faker();

	  public static Status randomStatus() {
	    return Status.values()[faker.random().nextInt(Status.values().length)];
	  }
	}
