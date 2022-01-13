package com.adam;
//import Scanner
import java.util.Scanner;

public class CustomerMenu {
	//Instantiate Scanner and get user input
	static Scanner scan = new Scanner(System.in);
	public static void customerOptions() {
		//while loop to allow user to complete as many tasks as wanted
		while(true) {
			System.out.println("Welcome to the Customer Menu!");
			System.out.println("What would you like to do today?");
			System.out.println();
			System.out.println("1) Apply for an account");
			System.out.println("2) Make a withdrawal");
			System.out.println("3) Make a deposit");
			System.out.println("4) Transfer money between accounts");
			System.out.println("5) Check Account Information");
			System.out.println("6) Quit");
			System.out.println();
			System.out.print("Please choose the number that corresponds your answer: ");
			String x = scan.nextLine();
			//switch statement to access all possible options
			switch(x) {
			case "1":
				if(ApplyForAccount.accountCheck.isEmpty()) {
					//Enter account application
					ApplyForAccount.applyForAccount();
				}else {
					System.out.println();
					System.out.println("Sorry, you may only have one account per username.");
					System.out.println();
				}
			break;
			case "2":
				if(ApplyForAccount.accountCheck.contains(1)) {
					//Enter withdrawal
					MoveMoney.withdraw();
				}else if(ApplyForAccount.accountCheck.contains(2)){
					//Enter Joint withdrawal
					JointMoveMoney.jointWithdraw();
				}else {
					System.out.println();
					System.out.println("You need to apply for an account in order to withdraw any money.");
					System.out.println();
				}
			break;
			case "3":
				if(ApplyForAccount.accountCheck.contains(1)) {
					//Enter deposit
					MoveMoney.setAccount();
					MoveMoney.deposit();
				}else if(ApplyForAccount.accountCheck.contains(2)){
					//Enter Joint deposit
					JointMoveMoney.setAccount();
					JointMoveMoney.jointDeposit();
				}else {
					System.out.println();
					System.out.println("You need to apply for an account in order to deposit any money.");
					System.out.println();
				}
			break;
			case "4":
				if(ApplyForAccount.accountCheck.contains(1)) {
					System.out.println();
					System.out.println("This feature can only be used for joint accounts.");
					System.out.println();
				}else if(ApplyForAccount.accountCheck.contains(2)){
					//Enter Transfer Money
					JointMoveMoney.transfer();
				}else {
					System.out.println();
					System.out.println("You need to apply for a joint account in order to transfer money.");
					System.out.println();
				}
			break;
			case "5":
				//Show Account Information and Balance
				System.out.println();
				System.out.println("Here is your account information: " + CustomerLogin.accountInformation);
				if(ApplyForAccount.accountCheck.contains(1)) {
					System.out.println("Here is your account balance: " + MoveMoney.accountBalance);
				}else if(ApplyForAccount.accountCheck.contains(2)) {
					System.out.println("Here is your account balance for account 1 is: " + JointMoveMoney.accountBalance1);
					System.out.println("Here is your account balance for account 2 is: " + JointMoveMoney.accountBalance2);
				}
				System.out.println("Account Check: " + ApplyForAccount.accountCheck);
				System.out.println();
			break;
			case "6":
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
	}//END customerOptions

}
