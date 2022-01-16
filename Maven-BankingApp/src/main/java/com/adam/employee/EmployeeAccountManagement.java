package com.adam.employee;
import java.util.Scanner;

import com.adam.ApplyForAccount;
import com.adam.CustomerLogin;
import com.adam.Etc;
import com.adam.MoveMoney;

public class EmployeeAccountManagement {
	static Scanner scan = new Scanner(System.in);
	
	public static void accounts() {
		while (true) {
			System.out.println("Here is all account information: " + CustomerLogin.accountInformation);
			System.out.println();
			System.out.print("Would you like to 'Deny' or 'Accept' an account? ");
			String choice = scan.nextLine();
			String c = choice.toLowerCase();
			if (c.equals("deny")) {
				CustomerLogin.accountInformation.clear();
				MoveMoney.accountBalance.clear();
				ApplyForAccount.accountCheck.clear();
				System.out.println();
				System.out.println("You have denied the account and the user's money has been returned.");
				System.out.println();
				break;
			}else if(c.equals("accept")) {
				System.out.println();
				break;
				//Essentially does nothing since an acception means leave the account alone.
			}else if(choice.isEmpty()) {
				Etc.incorrect();
			}else {
				Etc.incorrect();
			}
		}
	}//END accounts
}
