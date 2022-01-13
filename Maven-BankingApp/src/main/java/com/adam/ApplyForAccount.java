package com.adam;
import java.util.ArrayList;
//import Scanner
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class ApplyForAccount extends CustomerLogin {
	static CustomerLogin cl = new CustomerLogin();
	//Instantiate Scanner and get user input
	static Scanner scan = new Scanner(System.in);
	//Instantiate Array List to determine if a joint account has been made
	static ArrayList<Integer> accountCheck = new ArrayList<Integer>();
	static boolean x = true;
	
	public static void applyForAccount() {
		System.out.println();
		System.out.println();
		System.out.println("You have chosen to apply for an account");
		while(true) {
			System.out.println("Which account type would you like to apply for?");
			System.out.println();
			System.out.println("1) Personal");
			System.out.println("2) Joint");
			System.out.println();
			System.out.print("Please choose the number that corresponds your answer: ");
			try {
				String accountType = scan.nextLine();
				char at = accountType.charAt(0);
				//if statement to send user to correct method
				if (at == '1') {
					createPersonal();
					break;
				}else if(at == '2') {
					createJoint();
					break;
				}else {
					//user did not input answer correctly
					System.out.println();
					System.out.println();
					System.out.println("I'm sorry, I did not understand your answer, please try again.");
				}
			}catch(Exception e) {
				//user left input empty
				System.out.println();
				System.out.println();
				System.out.println("I'm sorry, I did not understand your answer, please try again.");
			}
		}
	}//END applyForAccount
	
	@SuppressWarnings("static-access")
	public static void createPersonal() {
		if (x) {
			accountCheck.add(1);
			x = false;
		}
		String fName,lName;
		System.out.println();
		System.out.println();
		System.out.println("To create a personal account all we need is your first and last name.");
		System.out.println();
		while(true) {
			System.out.print("Please enter your first name: ");
			fName = scan.nextLine();
			System.out.print("Please enter your last name: ");
			lName = scan.nextLine();
			System.out.println();
			if(fName == "" || lName == "") {
				System.out.println();
				System.out.println();
				System.out.println("It seems you may have left one of the options blank, please try again.");
			}else {
				break;
			}
		}	
		System.out.println("Congratulations on your new account!");
		System.out.println("You will now be given a bank account number.");
		int accountNumber = ThreadLocalRandom.current().nextInt(10000, 99998 + 1);
		String s = String.valueOf(accountNumber);
		cl.accountInformation.add(fName);
		cl.accountInformation.add(lName);
		cl.accountInformation.add(s);
		System.out.println("Your personal account number is " + s + " .");
		System.out.println("Please do not forget it.");
		System.out.println();
	}//END createPersonal
	
	@SuppressWarnings("static-access")
	public static void createJoint() {
		if (x) {
			accountCheck.add(2);
			x = false;
		}
		String fName,lName,fName2,lName2;
		System.out.println();
		System.out.println();
		System.out.println("To create a joint account all we need is both first and last names.");
		System.out.println();
		while(true) {
			System.out.print("Please enter your first name: ");
			fName = scan.nextLine();
			System.out.print("Please enter your last name: ");
			lName = scan.nextLine();
			System.out.println();
			if(fName == "" || lName == "") {
				System.out.println();
				System.out.println();
				System.out.println("It seems you may have left one of the options blank, please try again.");
			}else {
				break;
			}
		}
		System.out.println();
		System.out.println();
		while(true) {
			System.out.println("Now for the second account.");
			System.out.print("Please enter your first name: ");
			fName2 = scan.nextLine();
			System.out.print("Please enter your last name: ");
			lName2 = scan.nextLine();
			System.out.println();
			if(fName2 == "" || lName2 == "") {
				System.out.println();
				System.out.println();
				System.out.println("It seems you may have left one of the options blank, please try again.");
			}else {
				break;
			}
		}
		System.out.println("Congratulations on your new account!");
		System.out.println("You will now be given a bank account number.");
		int accountNumber = ThreadLocalRandom.current().nextInt(10000, 99998 + 1);
		String s = String.valueOf(accountNumber);
		cl.accountInformation.add(fName);
		cl.accountInformation.add(lName);
		cl.accountInformation.add(fName2);
		cl.accountInformation.add(lName2);
		cl.accountInformation.add(s);
		System.out.println("Your joint account number is " + s + " .");
		System.out.println("Please do not forget it.");
		System.out.println();
	}//END createJoint

}
