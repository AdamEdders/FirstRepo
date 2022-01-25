package com.adam.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.adam.models.User;

public class UserDao {

	// A local reference to the same Connection as ConnectionManager.getConnection();
	// Caching local copies of references is an alternative to the Singleton design pattern
	private Connection conn;
	
	// When caching local copies, the reference must be given at some point; in this case,
	//  as a constructor parameter.
	public UserDao(Connection conn) {
		this.conn = conn;
	}
	
	public User getUserByUsername(String username) {

		try {
			
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM users WHERE username = \'" 
					+ username + "\'");
			
			while (rs.next()) {
				
				String password = rs.getString("password");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String birthMonth = rs.getString("birth_month");
				
				return new User(username, password, firstName, lastName, birthMonth);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public boolean createUser(User user) {
		
		Statement statement;
		try {
			statement = conn.createStatement();
			return statement.execute("INSERT INTO users VALUES ("
					+ "\'" + user.username + "\',"
					+ "\'" + user.password + "\',"
					+ "\'" + user.firstName + "\',"
					+ "\'" + user.lastName + "\',"
					+ "\'" + user.birthMonth + "\');");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean updateUser(User user) {
		
		Statement statement;
		try {
			statement = conn.createStatement();
			return statement.execute("UPDATE users SET "
					+ "password = \'" + user.password + "\',"
					+ "first_name = \'" + user.firstName + "\',"
					+ "last_name = \'" + user.lastName + "\',"
					+ "birth_month\'" + user.birthMonth + "\'"
					+ "WHERE username = \'" + user.username + "\';");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean deleteUser(User user) {
		
		Statement statement;
		try {
			statement = conn.createStatement();
			return statement.execute("DELETE FROM users WHERE username = \'" 
					+ user.username + "\'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}