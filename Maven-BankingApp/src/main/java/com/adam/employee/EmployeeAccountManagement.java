package com.adam.employee;
import java.util.Scanner;

import com.adam.Driver;
import com.adam.Etc;
import com.adam.SQL.DAOAccounts;

public class EmployeeAccountManagement {
	static Scanner scan = new Scanner(System.in);
	
	public static void accounts() {
		while (true) {
			try {
				System.out.println("******************************");
				System.out.println("Listed below are all accounts.");
				DAOAccounts daoa = new DAOAccounts();
				daoa.showAll();
				System.out.println("************************************************");
				System.out.println("Would you like to 'Deny' or 'Accept' an account?");
				System.out.println("Enter 'BACK' to return to Employee Menu.");
				System.out.print("Enter your response here: ");
				String choice = scan.nextLine();
				String c = choice.toLowerCase();
				if (c.equals("accept")) {
					c = "ACCEPTED";
					System.out.println();
					System.out.println("Which account username would you like to be accepted?");
					System.out.print("Enter your response here: ");
					String accountName = scan.nextLine();
					if (daoa.checkName(accountName)) {
						daoa.status(c, accountName);
						System.out.println("The account name '" + accountName + "' has been accepted!");
						System.out.println();
						break;
					}else {
						Etc.incorrect();
					}
				}else if (c.equals("deny")) {
					c = "DENIED";
					System.out.println();
					System.out.println("Which account username would you like to be denied?");
					System.out.print("Enter your response here: ");
					String accountName = scan.nextLine();
					if (daoa.checkName(accountName)) {
						daoa.status(c, accountName);
						System.out.println("The account name " + accountName + " has been denied!");
						System.out.println();
						break;
					}else {
						Etc.incorrect();
					}
				}else if (c.equals("back")) {
					System.out.println();
					System.out.println("*******************************************");
					Driver.main(null);
					break;
				}else {
					//User response was not valid
					Etc.incorrect();
				}
			}catch(Exception e) {
				Etc.incorrect();
			}
		}
	}//END accounts
}