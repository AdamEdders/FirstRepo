package com.adam.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDao {
	
	private Connection conn;
	
	public EmployeeDao(Connection conn) {
		this.conn = conn;
	}
	
	public boolean createEmployee(Employees employee) {
		try {
			Statement state = conn.createStatement();
			state.execute("INSERT INTO employees VALUES ('" + employee.username + "', '" + employee.password + "');");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}//END getAccountByUsername
	
	public Employees chooseEmployee(String username) {

		try {
			
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM employees WHERE username = '" + username + "';");
			
			while (rs.next()) {
				
				String password = rs.getString("password");				
				return new Employees(username, password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean updateEmployee(Employees employee) {
		
		try {
			Statement statement = conn.createStatement();
			return statement.execute("UPDATE employees SET "
					+ "password = '" + employee.password + "'"
					+ "WHERE username = '" + employee.username + "';");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	

}
