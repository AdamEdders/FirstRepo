package com.adam.controller;

public class Customers {
	
	public String username, password;
	
	public Customers(String username, String password){
		this.username = username;
		this.password = password;
	}//END accounts
	
	//Needed for Jackson
	public Customers() {}

}
