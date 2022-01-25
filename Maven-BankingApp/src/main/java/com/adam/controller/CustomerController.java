package com.adam.controller;

import java.sql.Connection;

import com.adam.controller.CustomerDao;
import com.adam.controller.Customers;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class CustomerController {
	
	Javalin app;
	Connection conn;
	CustomerDao customerDao;
	
	public CustomerController(Javalin app, Connection conn) {
		this.app = app;
		this.conn = conn;
		customerDao = new CustomerDao(conn);
		
		app.post("/customer",createCustomer );
	}//END AccountsController
	
		public Handler createCustomer = ctx -> {
			Customers c = ctx.bodyAsClass(Customers.class);
			
			if (customerDao.createCustomer(c))
				ctx.status(201); 
			else ctx.status(400);
			
			ctx.status(200);
		};

}
