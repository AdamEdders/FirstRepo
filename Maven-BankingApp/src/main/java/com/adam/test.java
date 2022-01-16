package com.adam;

import com.adam.SQL.UserDAO;

public class test {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		System.out.println(userDAO.isLoginCorrect("slater"));
	}

}
