package com.adam.SQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	
	public boolean isLoginCorrect(String username) {
		//Create Statement
		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			//Create Result Set
			ResultSet result = statement.executeQuery("SELECT * FROM users WHERE username = '" + username + "'");
			if(result.next()) {
				return true;
			}
			return false;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
