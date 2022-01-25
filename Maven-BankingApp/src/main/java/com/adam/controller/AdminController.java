package com.adam.controller;

import java.sql.Connection;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class AdminController {
	
	Javalin app;
	Connection conn;
	AdminDao adminDao;
	
	public AdminController(Javalin app, Connection conn) {
		this.app = app;
		this.conn = conn;
		adminDao = new AdminDao(conn);
		
		app.get("/admin/{username}",chooseAdmin);
		app.post("/admin", createAdmin);
		app.put("/admin", updateAdmin);
		app.delete("/admin", deleteCustomer);
		app.delete("/admin2",deleteEmployee);
		
	}//END EmployeeController
	
	public Handler chooseAdmin = ctx -> {
		Admins a = adminDao.chooseAdmin(ctx.pathParam("username"));
		ctx.json(a);
		
		// Status code 200 means "OK"
		ctx.status(200);
	};
	
	public Handler createAdmin = ctx -> {
		Admins a = ctx.bodyAsClass(Admins.class);
		
		if (adminDao.createAdmin(a)) {
			ctx.status(201); 
		}else {
			ctx.status(400);
		}
	};
	
	public Handler updateAdmin = ctx -> {
		Admins a = ctx.bodyAsClass(Admins.class);
		
		if (adminDao.updateAdmin(a)) {
			ctx.status(201); 
		}else {
			ctx.status(400);
		}
	};
	
	public Handler deleteCustomer = ctx ->{
		Customers c = ctx.bodyAsClass(Customers.class);
		
		if(adminDao.deleteCustomer(c)) {
			ctx.status(201);
		}else {
			ctx.status(400);
		}
	};
	
	public Handler deleteEmployee = ctx ->{
		Employees e = ctx.bodyAsClass(Employees.class);
		
		if (adminDao.deleteEmployee(e)) {
			ctx.status(201);
		}else {
			ctx.status(400);
		}
	};

}
