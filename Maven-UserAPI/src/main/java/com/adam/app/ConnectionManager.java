package com.adam.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private static Connection connection;
	
	private static String connectionString = "jdbc:postgresql://castor.db.elephantsql.com:5432/wdbhegza",
			username = "wdbhegza",
			password = "q1DmP8EGSkiXED-PGBHkXkMD3LxeSjZ8";
	
	public static Connection getConnection() {
		try {
			if (connection == null || connection.isClosed()) {
			
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(connectionString, username, password);
			}
			
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	// When the program is stopped, this will trigger and close the connection
	// You have to use the stop button in your IDE. Similar to finally clause in main()
	@Override
	public void finalize() {
		try {
			ConnectionManager.getConnection().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}