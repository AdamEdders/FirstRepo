package com.adam.SQL;

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
			if(connection == null || connection.isClosed()) {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(connectionString, username, password);
			}		
			return connection;
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public void finalize() {
		try {
			ConnectionManager.getConnection().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//END finalize
}