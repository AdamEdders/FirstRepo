package com.adam.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.adam.controller.Customers;

public class CustomerDao {
	
	private Connection conn;
	
	public CustomerDao(Connection conn) {
		this.conn = conn;
	}
	
	public boolean createCustomer(Customers customer) {
		try {
			Statement state = conn.createStatement();
			state.execute("INSERT INTO customers VALUES ('" + customer.username + "', '" + customer.password + "');");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}//END getAccountByUsername
}
