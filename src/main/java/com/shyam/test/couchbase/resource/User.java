package com.shyam.test.couchbase.resource;

import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import org.springframework.data.annotation.Id;

@Document(expiry = 0)
public class User {

	@Id
	@Field("id")
	Integer id;
	
	@Field("firstName")
	String firstName;
	
	@Field("lastName")
	String lastName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
