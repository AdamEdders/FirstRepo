package com.adam;
import java.util.InputMismatchException;
//import Scanner
import java.util.Scanner;

public class CustomerMenu {
	//Instantiate Scanner and get user input
	static Scanner scan = new Scanner(System.in);
	
	@SuppressWarnings("unused")
	public static void customerOptions() {
		//while loop to allow user to complete as many tasks as wanted
		while(true) {
			//try-catch block for Input Mismatch
			try {
				System.out.println("Welcome to the Customer Menu!");
				System.out.println("What would you like to do today?");
				System.out.println();
				System.out.println("1) Apply for an account");
				System.out.println("2) Make a withdrawal");
				System.out.println("3) Make a deposit");
				System.out.println("4) Transfer money between accounts");
				System.out.println("5) Check Account Information");
				System.out.println("6) Go Back to Home");
				System.out.println("7) Quit");
				System.out.println();
				System.out.print("Please choose the number that corresponds your answer: ");
				int x = scan.nextInt();
				//switch statement to access all possible options
				switch(x) {
				case 1:
					if(ApplyForAccount.accountCheck.isEmpty()) {
						System.out.println();
						//Enter account application
						ApplyForAccount.applyForAccount();
					}else {
						//User is trying to open 2 accounts
						Etc.single();
					}
				break;
				case 2:
					if(ApplyForAccount.accountCheck.contains(1)) {
						System.out.println();
						//Enter withdrawal
						MoveMoney.withdraw();
					}else if(ApplyForAccount.accountCheck.contains(2)){
						System.out.println();
						//Enter Joint withdrawal
						JointMoveMoney.jointWithdraw();
					}else {
						//User has not opened an account yet
						Etc.empty();
					}
				break;
				case 3:
					if(ApplyForAccount.accountCheck.contains(1)) {
						System.out.println();
						//Enter deposit
						MoveMoney.setAccount();
						MoveMoney.deposit();
					}else if(ApplyForAccount.accountCheck.contains(2)){
						System.out.println();
						//Enter Joint deposit
						JointMoveMoney.setAccount();
						JointMoveMoney.jointDeposit();
					}else {
						//User has not opened an account yet
						Etc.empty();
					}
				break;
				case 4:
					if(ApplyForAccount.accountCheck.contains(1)) {
						System.out.println();
						//User did not create a joint account
						Etc.nonjoint();
					}else if(ApplyForAccount.accountCheck.contains(2)){
						//Enter Transfer Money
						JointMoveMoney.transfer();
					}else {
						//User has not created a joint account
						Etc.nonjoint();
					}
				break;
				case 5:
					//Show Account Information and Balance
					Etc.showInfo();
				break;
				case 6:
					//Go back to Driver
					System.out.println();
					Driver.main(null);
				break;
				case 7:
					//END Service
					Etc.exit();
				break;
				default:
					//User response was incorrect
					Etc.incorrect();
				break;
				}
			}catch (Exception e) {
				String error = scan.nextLine();
				//User did not respond with an integer
				Etc.incorrect();
			}
		}
	}//END customerOptions
}