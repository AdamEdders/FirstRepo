package com.adam.controller;

import java.sql.Connection;

import com.adam.SQL.ConnectionManager;
import com.adam.controller.CustomerController;

import io.javalin.Javalin;


public class Driver {
	public static void main(String[] args) {
		
		Javalin app = Javalin.create().start(7070);
		Connection conn = ConnectionManager.getConnection();
		CustomerController controller = new CustomerController(app,conn);
		EmployeeController controller2 = new EmployeeController(app,conn);
		AdminController controller3 = new AdminController(app,conn);


	}//END main

}
