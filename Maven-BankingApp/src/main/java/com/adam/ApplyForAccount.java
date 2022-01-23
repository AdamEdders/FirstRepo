package com.adam;
import java.util.ArrayList;
import java.util.Scanner;
import com.adam.SQL.DAOAccounts;
import com.adam.SQL.DAOMoney;

import java.util.concurrent.ThreadLocalRandom;

public class ApplyForAccount extends CustomerLogin {
	static ArrayList<String> accountCheck = new ArrayList<String>();
	//Instantiate Scanner and get user input
	static Scanner scan = new Scanner(System.in);
	//Strings and ints to create accounts
	static String fName, lName, fName2, lName2, fName3, lName3;
	static String status = "TBD";
	static int accountNumber, accountType;
	
	@SuppressWarnings("unused")
	public static void applyForAccount() {
		System.out.println("***************************************");
		System.out.println("You have chosen to apply for an account");
		while(true) {
			try {
			System.out.println("Which account type would you like to apply for?");
			System.out.println();
			System.out.println("1) Personal");
			System.out.println("2) Joint");
			System.out.println("3) Go Back");
			System.out.println();
			System.out.print("Please choose the number that corresponds your answer: ");
			int accountType = scan.nextInt();
				//if statement to send user to correct method
				if (accountType == 1) {
					System.out.println();
					scan.nextLine();
					createPersonal();
					break;
				}else if(accountType == 2) {
					System.out.println();
					scan.nextLine();
					createJoint();
					break;
				}else if(accountType == 3) {
					//Send user back to menu
					System.out.println();
					CustomerMenu.customerOptions();
					break;
				}else {
					//user did not input answer correctly
					Etc.incorrect();
				}
			}catch(Exception e) {
				scan.nextLine();
				//User did not respond with an integer
				Etc.incorrect();	
			}
		}
	}//END applyForAccount
	
	@SuppressWarnings("unused")
	public static void createPersonal() {
		System.out.println("*********************************************************************");
		while(true) {
			System.out.println("To create a personal account all we need is your first and last name.");
			System.out.println();
			System.out.print("Please enter your first name: ");
			fName = scan.nextLine();
			System.out.print("Please enter your last name: ");
			lName = scan.nextLine();
			if(fName.isEmpty() || lName.isEmpty()) {
				//User response was blank
				Etc.incorrect();
			}else {
				accountNumber = ThreadLocalRandom.current().nextInt(1000000, 9999998 + 1);
				accountType = 1;
				System.out.println();
				System.out.println("Congratulations, you have created a personal bank account.");
				System.out.println("Your account number is: " + accountNumber);
				System.out.println("Please do not forget it.");
				System.out.println();
				break;
			}
		}	
		DAOAccounts userDAO = new DAOAccounts();
		userDAO.fill(status,CustomerLogin.usernameCheck, CustomerLogin.passwordCheck, fName,lName,accountNumber,accountType);
		DAOMoney daom = new DAOMoney();
		daom.fillAccount(CustomerLogin.usernameCheck, accountNumber);
	}//END createPersonal
	

	public static void createJoint() {
		System.out.println("*******************************************************************");
		while(true) {
			System.out.println("To create a joint account all we need is both first and last names.");
			System.out.println();
			System.out.println("This is for the first name on the account.");
			System.out.print("Please enter your first name: ");
			fName2 = scan.nextLine();
			System.out.print("Please enter your last name: ");
			lName2 = scan.nextLine();
			if(fName2.isEmpty() || lName2.isEmpty() ) {
				//User response was blank
				Etc.incorrect();
			}else {
				System.out.println();
				break;
			}
		}
		while(true) {
			System.out.println("***************************");
			System.out.println("Now for the second account.");
			System.out.print("Please enter your first name: ");
			fName3 = scan.nextLine();
			System.out.print("Please enter your last name: ");
			lName3 = scan.nextLine();
			System.out.println();
			if(fName3.isEmpty() || lName3.isEmpty()) {
				//User response was blank
				Etc.incorrect();
			}else {
				accountNumber = ThreadLocalRandom.current().nextInt(1000000, 9999998 + 1);
				accountType = 2;
				System.out.println();
				System.out.println("Congratulations, you have created a joint bank account.");
				System.out.println("Your account number is: " + accountNumber);
				System.out.println("Please do not forget it.");
				System.out.println();
				break;
			}
		}
		DAOAccounts userDAO = new DAOAccounts();
		userDAO.jointFill(status, CustomerLogin.usernameCheck, CustomerLogin.passwordCheck, fName2, lName2, fName3, lName3, accountNumber, accountType);
		DAOMoney daom = new DAOMoney();
		daom.fillAccount(CustomerLogin.usernameCheck, accountNumber);
	}//END createJoint
}
