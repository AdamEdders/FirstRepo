package com.adam.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminDao {
	
	private Connection conn;
	
	public AdminDao(Connection conn) {
		this.conn = conn;
	}
	
	public boolean createAdmin(Admins admin) {
		try {
			Statement state = conn.createStatement();
			state.execute("INSERT INTO admin VALUES ('" + admin.username + "', '" + admin.password + "');");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}//END getAccountByUsername
	
	public Admins chooseAdmin(String username) {

		try {
			
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM admin WHERE username = '" + username + "';");
			
			while (rs.next()) {
				
				String password = rs.getString("password");				
				return new Admins(username, password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean updateAdmin(Admins admin) {
		
		try {
			Statement statement = conn.createStatement();
			return statement.execute("UPDATE admin SET "
					+ "password = '" + admin.password + "'"
					+ "WHERE username = '" + admin.username + "';");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean deleteCustomer(Customers customer) {
		
		try {
			Statement statement = conn.createStatement();
			return statement.execute("DELETE FROM customers WHERE username = '" 
					+ customer.username + "'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean deleteEmployee(Employees employee) {
		
		try {
			Statement statement = conn.createStatement();
			return statement.execute("DELETE FROM employees WHERE username = '" 
					+ employee.username + "'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	

}
