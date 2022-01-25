package com.adam.controller;

public class Admins {
	
public String username, password;
	
	public Admins(String username, String password){
		this.username = username;
		this.password = password;
	}//END accounts
	
	//Needed for Jackson
	public Admins() {}

}
