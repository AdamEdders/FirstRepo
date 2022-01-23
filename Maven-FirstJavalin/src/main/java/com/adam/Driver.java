package com.adam;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class Driver {
	
	public static void main(String[] args) {
		//Reserves the port and sets up Javalin
		Javalin app = Javalin.create().start(7071);
		
		//In order to access request and build response, use ctx static variable
		
		//Every URL endpoint and HTTP verb requires a handler
		//HANDLERS can be defined in one line like below
		app.get("/hello", ctx -> {
			//The syntax above is know as 'lambda' an anonymous method (i.e. no name) passed as a parameter
			//Code to execute when someone accesses site.com/users
			//ctx,result returns a String in the response body
			ctx.result("Hello World!");
		});
		//Access above behavior at 'localhost:7070/hello
		
		//To separate behavior from path, use Handler variables to store lambdas
		app.get("/user/{id}", getUserById);
		
		//The {id} syntax represents a path parameter called id, can be accessed using ctx.
	}
	
	public static Handler getUserById = ctx -> {
		//JDBC code for looking for a user
		ctx.result("You entered the Id: " + ctx.pathParam("id"));
	};

}
