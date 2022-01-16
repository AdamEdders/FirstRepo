package com.adam.employee;
//import Scanner
import java.util.Scanner;

import com.adam.ApplyForAccount;
import com.adam.CustomerLogin;
import com.adam.Driver;
import com.adam.Etc;
import com.adam.JointMoveMoney;
import com.adam.MoveMoney;

public class EmployeeMenu {
	static Scanner scan = new Scanner(System.in);
	
	public static void employeeOptions() {
		while (true) {
			try {
				System.out.println("Welcome to the Employee Menu.");
				System.out.println("What would you like to do today?");
				System.out.println();
				System.out.println("1) View Customer Account Information");
				System.out.println("2) Deny/Approve Accounts");
				System.out.println("3) Go Back to Home");
				System.out.println("4) Quit");
				System.out.println();
				System.out.print("Please choose the number that corresponds your answer: ");
				int x = scan.nextInt();
				//switch statement to access all possible options
				switch(x) {
				case 1:
					System.out.println();
					//Show Account Information and Balance
					Etc.showInfo2();
				break;
				case 2:
					if(ApplyForAccount.accountCheck.isEmpty()) {
						//No accounts to be managed
						Etc.noAccount();
					}else {
						System.out.println();
						//Enter Account Management
						EmployeeAccountManagement.accounts();
					}
				break;
				case 3:
					//Go back to Driver
					System.out.println();
					Driver.main(null);
				break;
				case 4:
					//END Service
					Etc.exit();
				break;
				default:
					Etc.incorrect();
				break;
				}
			}catch (Exception e) {
				String error = scan.nextLine();
				//User did not respond with an integer
				Etc.incorrect();
				}
		}
	}//END employeeOptions

}
