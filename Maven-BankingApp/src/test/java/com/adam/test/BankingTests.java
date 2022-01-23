package com.adam.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.adam.SQL.DAOAccounts;
import com.adam.SQL.DAOLogins;
import com.adam.SQL.DAOMoney;

public class BankingTests {
	static DAOLogins daol = new DAOLogins();
	static DAOAccounts daoa = new DAOAccounts();
	static DAOMoney daom = new DAOMoney();
	
	@Test
	public void customerExists() {
		boolean x = daol.check("TEST");
		boolean y = daol.check("test");
		assertEquals(x,true);	
		assertEquals(y,false);
	}//END Test 1
	
	@Test
	public void customerIsRight() {
		boolean x = daol.customers("TEST", "TEST");
		boolean y = daol.customers("test", "test");
		assertEquals(x,true);
		assertEquals(y,false);
	}//END Test 2
	
	@Test
	public void employeeIsRight() {
		boolean x = daol.employees("TEST", "TEST");
		boolean y = daol.employees("test", "test");
		assertEquals(x,true);
		assertEquals(y,false);
	}//END Test 3
	
	@Test
	public void adminIsRight() {
		boolean x = daol.admin("TEST");
		boolean y = daol.admin("test");
		assertEquals(x,true);
		assertEquals(y,false);
	}//END Test 4
	
	@Test
	public void accountNumberIsRight() {
		boolean x = daoa.checkNumber(111111111);
		boolean y = daoa.checkNumber(000000000);
		assertEquals(x,true);
		assertEquals(y,false);
	}//END Test 5
	
	@Test
	public void accountNameIsRIght() {
		boolean x = daoa.checkName("TEST");
		boolean y = daoa.checkName("test");
		assertEquals(x,true);
		assertEquals(y,false);
	}//END Test 6
	
	@Test
	public void accountNameIsAccepted() {
		boolean x = daoa.checkStatus("TEST");
		boolean y = daoa.checkStatus("test");
		assertEquals(x,true);
		assertEquals(y,false);
	}//END Test 7
	
	@Test
	public void isBalanceRight() {
		double x = daom.getBalance(111111111);
		double y = daom.getBalance(101010101);
		assertEquals(x,-444);
		assertEquals(y, 0);
	}//END Test 8
}
