package com.adam.app;

import java.sql.Connection;

import com.adam.controllers.UserController;

import io.javalin.Javalin;

public class Driver {
	
	public static void main(String[] args) {
		
		Javalin app = Javalin.create().start(7071);
		Connection conn = ConnectionManager.getConnection();
		UserController controller = new UserController(app,conn);		
	}//END main

}
