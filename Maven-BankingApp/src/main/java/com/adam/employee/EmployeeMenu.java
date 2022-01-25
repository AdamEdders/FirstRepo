package com.adam.employee;
//import Scanner
import java.util.Scanner;

import com.adam.Driver;
import com.adam.Etc;
import com.adam.SQL.DAOAccounts;
import com.adam.SQL.DAOMoney;

public class EmployeeMenu {
	static Scanner scan = new Scanner(System.in);
	
	public static void employeeOptions() {
		while (true) {
			try {
				System.out.println("*****************************");
				System.out.println("Welcome to the Employee Menu.");
				System.out.println("What would you like to do today?");
				System.out.println();
				System.out.println("1) View Customer Account Information");
				System.out.println("2) View Customer Account Balances");
				System.out.println("3) Deny/Approve Accounts");
				System.out.println("4) Go Back to Home");
				System.out.println("5) Quit");
				System.out.println();
				System.out.print("Please choose the number that corresponds your answer: ");
				int x = scan.nextInt();
				//switch statement to access all possible options
				switch(x) {
				case 1:
					System.out.println();
					System.out.println("***************************************");
					System.out.println("Listed below are all customer accounts.");
					System.out.println();
					//Show Account Information
					DAOAccounts daoa = new DAOAccounts();
					daoa.showAll();
				break;
				case 2:
					System.out.println();
					System.out.println("***********************************************");
					System.out.println("Listed below are all customer account balances.");
					System.out.println();
					//Show customer balances
					DAOMoney daom = new DAOMoney();
					daom.showBalances();
				break;
				case 3:
					System.out.println();
					//Enter Account Management
					EmployeeAccount.accounts();
				break;
				case 4:
					//Go back to Driver
					System.out.println();
					System.out.println("*******************************************");
					Driver.main(null);
				break;
				case 5:
					//END Service
					Etc.exit();
				break;
				default:
					Etc.incorrect();
				break;
				}
			}catch (Exception e) {
				scan.nextLine();
				//User did not respond with an integer
				Etc.incorrect();
				}
		}
	}//END employeeOptions

}
