package com.adam.employee;
import java.util.Scanner;

import com.adam.ApplyForAccount;
import com.adam.CustomerLogin;
import com.adam.MoveMoney;

public class EmployeeAccountManagement {
	static Scanner scan = new Scanner(System.in);
	
	public static void accounts() {
		System.out.println();
		while (true) {
			System.out.println("Here is all account information: " + CustomerLogin.accountInformation);
			System.out.println();
			System.out.print("Would you like to 'Deny' or 'Accept' an account? ");
			String choice = scan.nextLine();
			String c = choice.toLowerCase();
			if (c.charAt(0) == 'd') {
				CustomerLogin.accountInformation.clear();
				MoveMoney.accountBalance.clear();
				ApplyForAccount.accountCheck.clear();
				System.out.println();
				System.out.println("You have denied the account and the user's money has been returned.");
				System.out.println();
				break;
			}else if(c.charAt(0) == 'a') {
				System.out.println();
				break;
				//Essentially does nothing since an acception means leave the account alone.
			}else if(choice.isEmpty()) {
				System.out.println();
				System.out.println("Sorry you did not type in 'Deny' or 'Accept'.");
				System.out.println();
			}else {
				System.out.println();
				System.out.println("Sorry you did not type in 'Deny' or 'Accept'.");
				System.out.println();
			}
		}
	}//END accounts
}
