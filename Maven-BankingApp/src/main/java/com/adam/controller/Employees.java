package com.adam.controller;

public class Employees {
	
	public String username, password;
	
	public Employees(String username, String password){
		this.username = username;
		this.password = password;
	}//END accounts
	
	//Needed for Jackson
	public Employees() {}

}
