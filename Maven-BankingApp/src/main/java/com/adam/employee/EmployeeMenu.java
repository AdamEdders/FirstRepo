package com.adam.employee;
//import Scanner
import java.util.Scanner;

import com.adam.ApplyForAccount;
import com.adam.CustomerLogin;
import com.adam.Driver;
import com.adam.JointMoveMoney;
import com.adam.MoveMoney;

public class EmployeeMenu {
	static Scanner scan = new Scanner(System.in);
	
	public static void employeeOptions() {
		System.out.println();
		while (true) {
			System.out.println("Welcome to the Employee Menu.");
			System.out.println("What would you like to do today?");
			System.out.println();
			System.out.println("1) View Customer Account Information");
			System.out.println("2) Deny/Approve Accounts");
			System.out.println("3) Go Back to Home");
			System.out.println("4) Quit");
			System.out.println();
			System.out.print("Please choose the number that corresponds your answer: ");
			String x = scan.nextLine();
			//switch statement to access all possible options
			switch(x) {
			case "1":
				//Show Account Information and Balance
				System.out.println();
				System.out.println("Here is all account information: " + CustomerLogin.accountInformation);
				if(ApplyForAccount.accountCheck.contains(1)) {
					System.out.println("Here is your account balance: " + MoveMoney.accountBalance);
				}else if(ApplyForAccount.accountCheck.contains(2)) {
					System.out.println("Here is your account balance for account 1 is: " + JointMoveMoney.accountBalance1);
					System.out.println("Here is your account balance for account 2 is: " + JointMoveMoney.accountBalance2);
				}
				System.out.println("Account Check: " + ApplyForAccount.accountCheck);
				System.out.println();
			break;
			case "2":
				if(ApplyForAccount.accountCheck.isEmpty()) {
					//No accounts to be managed
					System.out.println();
					System.out.println("There are no accounts to be managed at this time");
					System.out.println();
				}else {
					//Enter Account Management
					EmployeeAccountManagement.accounts();
				}
				
			break;
			case "3":
				//Go back to Driver
				System.out.println();
				Driver.main(null);
			break;
			case "4":
				//End Customer Access
				System.out.println();
				System.out.println();
				System.out.println("You have been logged out.");
				System.exit(0);
			break;
			default:
				System.out.println();
				System.out.println();
				System.out.println("Sorry, you did not type in a correct number, please try again.");
			break;
			}


		}		
	}//END employeeOptions

}
