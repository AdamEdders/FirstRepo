package com.adam;
import java.util.Scanner;

import com.adam.SQL.DAOAccounts;

public class CustomerMenu {
	//Instantiate Scanner and get user input
	static Scanner scan = new Scanner(System.in);
	
	public static void customerOptions() {
		DAOAccounts daoa = new DAOAccounts();
		//while loop to allow user to complete as many tasks as wanted
		while(true) {
			//try-catch block for Input Mismatch
			try {
				System.out.println("*****************************");
				System.out.println("Welcome to the Customer Menu!");
				System.out.println("What would you like to do today?");
				System.out.println();
				System.out.println("1) Apply for an account");
				System.out.println("2) Make a withdrawal");
				System.out.println("3) Make a deposit");
				System.out.println("4) Transfer money between accounts");
				System.out.println("5) Check Account Information");
				System.out.println("6) Show Account Balances");
				System.out.println("7) Go Back to Home");
				System.out.println("8) Quit");
				System.out.println();
				System.out.print("Please choose the number that corresponds to your answer: ");
				int x = scan.nextInt();
				//switch statement to access all possible options
				switch(x) {
				case 1:
						System.out.println();
						//Enter account application
						ApplyForAccount.applyForAccount();
				break;
				case 2:
					if (daoa.checkStatus(CustomerLogin.usernameCheck)) {
						System.out.println();
						//Enter withdrawal
						MoveMoney.withdraw();
					}else {
						Etc.status();
					}
				break;
				case 3:
					if (daoa.checkStatus(CustomerLogin.usernameCheck)) {
						System.out.println();
						//Enter Customer Deposit
						MoveMoney.deposit();
					}else {
						Etc.status();
					}
				break;
				case 4:
					if (daoa.checkStatus(CustomerLogin.usernameCheck)) {
						System.out.println();
						//Enter money transfer
						MoveMoney.transfer();
					}else {
						Etc.status();
					}
				break;
				case 5:
					//Show Account Information
					System.out.println();
					System.out.println("*********************************************************");
					daoa.show(CustomerLogin.usernameCheck);
					System.out.println();
				break;
				case 6:
					//Show Account Balance
					MoveMoney.checkBalance();
				break;
				case 7:
					//Go back to Driver
					System.out.println();
					System.out.println("*******************************************");
					Driver.main(null);
				break;
				case 8:
					//END Service
					Etc.exit();
				break;
				default:
					//User response was incorrect
					Etc.incorrect();
				break;
				}
			}catch (Exception e) {
				scan.nextLine();
				//User did not respond with an integer
				Etc.incorrect();
			}
		}
	}//END customerOptions
}