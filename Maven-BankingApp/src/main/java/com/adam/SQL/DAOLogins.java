package com.adam.SQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOLogins {
	
	@SuppressWarnings("unused")
	public void create(String username, String password) {
		//Create Statement
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			//Create Result Set
			statement.execute("INSERT INTO customers(username, password) VALUES ('" + username + "', '" + password + "');");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}//END create
	
	public boolean check(String username) {
		//Create Statement
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			//Create Result Set
			ResultSet result = statement.executeQuery("SELECT * FROM customers WHERE username = '" + username + "'");
			if(result.next()) {
				return true;
			}
			return false;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}//END customers
	
	public boolean customers(String username, String password) {
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			//Create Result Set
			ResultSet result = statement.executeQuery("SELECT * FROM customers WHERE username = '" + username + "'" + "AND password = '" + password + "';");
			if(result.next()) {
				return true;
			}
			return false;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}//END customers
	
	public boolean employees(String username, String password) {
		//Create Statement
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			//Create Result Set
			ResultSet result = statement.executeQuery("SELECT * FROM employees WHERE username = '" + username + "'" + "AND password = '" + password + "';");
			if(result.next()) {
				return true;
			}
			return false;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}//END employees
	
	public boolean admin(String password) {
		//Create Statement
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			//Create Result Set
			ResultSet result = statement.executeQuery("SELECT * FROM admin WHERE password = '" + password + "';");
			if(result.next()) {
				return true;
			}
			return false;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}//END admin
}
