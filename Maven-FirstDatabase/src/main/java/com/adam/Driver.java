package com.adam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver {
	
	public static void main(String[] args) {
		
		try {
			//Class.forName ensures this class is loaded and avoids a ClassNotFoundException
			Class.forName("org.postgresql.Driver");
			
			String connectionString = "jdbc:postgresql://castor.db.elephantsql.com:5432/wdbhegza",
					username = "wdbhegza",
					password = "q1DmP8EGSkiXED-PGBHkXkMD3LxeSjZ8";
			
			//Connection object is used to manage the network connection with the database
			Connection connection = DriverManager.getConnection(connectionString, username, password);
			
			//Statement object can be used to run queries and receive ResultSets
			Statement statement = connection.createStatement();
			
			ResultSet result = statement.executeQuery("SELECT * FROM apartments");
			while (result.next()) {
				System.out.println("Id: " + result.getInt("apartment_id") + " , rent: " + result.getDouble("rent"));
			}
					
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
