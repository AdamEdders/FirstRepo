package com.adam.models;

public class User {
	
	public String username, password, firstName, lastName, birthMonth;
	
	public User(String username, String password, String firstName, String lastName, String birthMonth) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthMonth = birthMonth;
	}//END User
	
	//To use Jackson, our models must have a no-params constructor.
	public User() {}

}
