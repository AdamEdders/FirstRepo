package com.adam.SQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.adam.Etc;

public class DAOAccounts {
	
	public void show(String usernameCheck) {
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			//Create Result Set
			ResultSet result = statement.executeQuery("SELECT * FROM accounts WHERE account_username = '" + usernameCheck + "';");
			while (result.next()) {
					System.out.println("Status: " + result.getString("status"));
					System.out.println("Account Username: " + result.getString("account_username"));
					System.out.println("Account Password: " + result.getString("account_password"));
					System.out.println("First Name: " + result.getString("first_name"));
					System.out.println("Last Name: " + result.getString("last_name"));
					System.out.println("Account Number: " + result.getInt("account_number"));
					System.out.println("Account Type: " + result.getInt("account_type"));
					System.out.println();
			}	
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}//END show
	
	public void showAll() {
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			//Create Result Set
			ResultSet result = statement.executeQuery("SELECT * FROM accounts;");
			while (result.next()) {
					System.out.println("Status : " + result.getString("status"));
					System.out.println("Account Username: " + result.getString("account_username"));
					System.out.println("Account Password: " + result.getString("account_password"));
					System.out.println("First Name: " + result.getString("first_name"));
					System.out.println("Last Name: " + result.getString("last_name"));
					System.out.println("Account Number: " + result.getInt("account_number"));
					System.out.println("Account Type: " + result.getInt("account_type"));
					System.out.println();
			}	
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}//END showAll
	
	@SuppressWarnings("unused")
	public void fill(String status, String usernameCheck, String passwordCheck, String fName, String lName, int accountNumber, int accountType) {
		//Create Statement
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			statement.execute("INSERT INTO accounts(status, account_username, account_password, first_name, last_name, account_number, account_type) "
					+ "VALUES ('" + status + "' , '" + usernameCheck + "' , '" + passwordCheck + "' , '" + fName + "', '" + lName + "', '" + accountNumber + "', '" + accountType + "');");
		}catch(SQLException e) {
			//e.printStackTrace();
		}
	}//END fill
	
	@SuppressWarnings("unused")
	public void jointFill(String status, String usernameCheck, String passwordCheck, String fName2, String lName2, String fName3, String lName3, int accountNumber, int accountType) {
		//Create Statement
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			statement.execute("INSERT INTO accounts(status, account_username, account_password, first_name, last_name, account_number, account_type)"
					+ " VALUES ('" + status + "' , '"+ usernameCheck + "' , '" + passwordCheck + "' , '" + fName2 + "', '" + lName2 + "', '" + accountNumber + "', '" + accountType + "'),"
							+ " ('" + status + "' , '"+ usernameCheck + "' , '" + passwordCheck +"' , '" + fName3 + "' , '" + lName3 + "' , '" + accountNumber + "' , '" + accountType + "');");
		}catch(SQLException e) {
			//e.printStackTrace();
		}
	}//END jointFill
	
	@SuppressWarnings("unused")
	public void status(String status, String accountName) {
		//Create Statement
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			statement.executeUpdate("UPDATE accounts SET status = '" + status + "'" + 
					"WHERE account_username = '" + accountName + "';"); 
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}//END status
	
	public boolean checkNumber(int accountNumber) {
		//Create Statement
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			//Create Result Set
			ResultSet result = statement.executeQuery("SELECT * FROM accounts WHERE account_number = '" + accountNumber + "'");
			if(result.next()) {
				return true;
			}
			return false;
		}catch(SQLException e) {
			Etc.incorrect();
		}
		return false;
	}//END checkNumber
	
	public boolean checkName(String accountName) {
		//Create Statement
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			//Create Result Set
			ResultSet result = statement.executeQuery("SELECT * FROM accounts WHERE account_username = '" + accountName + "'");
			if(result.next()) {
				return true;
			}
			return false;
		}catch(SQLException e) {
			Etc.incorrect();
		}
		return false;
	}//END checkName
	
	public boolean checkStatus(String accountName) {
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			//Create Result Set
			ResultSet result = statement.executeQuery("SELECT * FROM accounts WHERE status = 'ACCEPTED' AND account_username = '" + accountName + "';");
			if(result.next()) {
				return true;
			}
			return false;
		}catch(SQLException e) {
			//Etc.incorrect();
		}
		return false;
	}//END checkName
	
	public void cancelAccount(String accountName) {
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			statement.executeUpdate("DELETE FROM accounts WHERE account_username = '" + accountName + "';"); 
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}//END cancel
	
	public void cancelBalance(String accountName) {
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			statement.executeUpdate("DELETE FROM balances WHERE account_username = '" + accountName + "';"); 
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}//END cancel

}
