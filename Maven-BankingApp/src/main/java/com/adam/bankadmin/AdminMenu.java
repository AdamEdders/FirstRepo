package com.adam.bankadmin;
//import Scanner
import java.util.Scanner;

import com.adam.Driver;
import com.adam.Etc;
import com.adam.MoveMoney;
import com.adam.SQL.DAOAccounts;
import com.adam.SQL.DAOMoney;
import com.adam.employee.EmployeeAccount;

public class AdminMenu {
	static Scanner scan = new Scanner(System.in);
	
	public static void adminOptions() {
		DAOAccounts daoa = new DAOAccounts();
		while (true) {
			try {
				System.out.println("*******************************");
				System.out.println("Welcome to the Bank Admin Menu.");
				System.out.println("What would you like to do today?");
				System.out.println();
				System.out.println("1) View Customer account information");
				System.out.println("2) View Customer Account Balances");
				System.out.println("3) Deny/Approve accounts");
				System.out.println("4) Cancel an account");
				System.out.println("5) Withdraw from an account");
				System.out.println("6) Deposit from an account");
				System.out.println("7) Transfer money between accounts");
				System.out.println("8) Go Back to Home");
				System.out.println("9) Quit");
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
					System.out.println();
					System.out.println("***************************************");
					System.out.println("Listed below are all customer accounts.");
					System.out.println();
					//Cancel Account
					daoa.showAll();
					AdminCancel.cancel();	
				break;
				case 5:
					System.out.println();
					//Enter withdrawal
					MoveMoney.withdraw();
				break;
				case 6:
					System.out.println();
					//Enter Customer Deposit
					MoveMoney.deposit();
				break;
				case 7:
					System.out.println();
					//Enter Customer Deposit
					MoveMoney.deposit();
				break;
				case 8:
					//Go back to Driver
					System.out.println();
					System.out.println("*******************************************");
					Driver.main(null);
				break;
				case 9:
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
	}//END adminOptions
}
