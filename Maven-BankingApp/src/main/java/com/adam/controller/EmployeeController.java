package com.adam.controller;

import java.sql.Connection;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class EmployeeController {
	
	Javalin app;
	Connection conn;
	EmployeeDao employeeDao;
	
	public EmployeeController(Javalin app, Connection conn) {
		this.app = app;
		this.conn = conn;
		employeeDao = new EmployeeDao(conn);
		
		app.get("/employees/{username}",chooseEmployee);
		app.post("/employees", createEmployee);
		app.put("/employees", updateEmployee);
		
	}//END EmployeeController
	
	public Handler chooseEmployee = ctx -> {
		Employees e = employeeDao.chooseEmployee(ctx.pathParam("username"));
		ctx.json(e);
		
		// Status code 200 means "OK"
		ctx.status(200);
	};
	
	public Handler createEmployee = ctx -> {
		Employees e = ctx.bodyAsClass(Employees.class);
		
		if (employeeDao.createEmployee(e)) {
			ctx.status(201); 
		}else {
			ctx.status(400);
		}
	};
	
	public Handler updateEmployee = ctx -> {
		Employees e = ctx.bodyAsClass(Employees.class);
		
		if (employeeDao.updateEmployee(e)) {
			ctx.status(201); 
		}else {
			ctx.status(400);
		}
	};

}
