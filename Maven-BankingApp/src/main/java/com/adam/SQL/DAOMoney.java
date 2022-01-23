package com.adam.SQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOMoney {
	
	@SuppressWarnings("unused")
	public void fillAccount(String accountName, int accountNumber) {
		//Create Statement
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			//Create Result Set			
			statement.execute("INSERT INTO balances(account_username, account_number, account_balance) "
					+ "VALUES ('" + accountName + "' , '" + accountNumber + "', " + 0 + ");"); 
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}//END fillAccount
	
	@SuppressWarnings("unused")
	public void deposit(int accountNumber, double deposit) {
		//Create Statement
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			//Create Result Set			
			statement.executeUpdate("UPDATE balances SET account_balance = account_balance +" + deposit + 
					"WHERE account_number = " + accountNumber + ";"); 
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}//END fillAccount
	
	@SuppressWarnings("null")
	public double getBalance(int accountNumber) {
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			//Create Result Set
			ResultSet result = statement.executeQuery("SELECT account_balance FROM balances WHERE account_number = '" + accountNumber + "';");
			while (result.next()) {
					return result.getDouble("account_balance");
			}	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}//END show
	
	@SuppressWarnings("unused")
	public void withdraw(int accountNumber, double withdraw) {
		//Create Statement
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			//Create Result Set			
			statement.executeUpdate("UPDATE balances SET account_balance = account_balance -" + withdraw + 
					"WHERE account_number = " + accountNumber + ";"); 
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}//END fillAccount
	
	public void showBalances() {
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			//Create Result Set
			ResultSet result = statement.executeQuery("SELECT * FROM balances;");
			while(result.next()) {
				System.out.println("Account Number: " + result.getInt("account_number"));
				System.out.println("Account Balance: " + result.getDouble("account_balance"));
				System.out.println();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}//END show
}
