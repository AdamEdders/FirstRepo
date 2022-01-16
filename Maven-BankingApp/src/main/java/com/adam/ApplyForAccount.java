package com.adam;
import java.util.ArrayList;
//import Scanner
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ApplyForAccount extends CustomerLogin {
	
	//Instantiate Scanner and get user input
	static Scanner scan = new Scanner(System.in);
	//Instantiate Array List to determine if a joint account has been made
	public static ArrayList<Integer> accountCheck = new ArrayList<Integer>();
	//Boolean x for setting account type
	static boolean x = true;
	//Strings for creating accounts
	static String fName, lName, fName2, lName2, fName3, lName3;
	
	@SuppressWarnings("unused")
	public static void applyForAccount() {
		System.out.println("You have chosen to apply for an account");
		while(true) {
			try {
			System.out.println("Which account type would you like to apply for?");
			System.out.println();
			System.out.println("1) Personal");
			System.out.println("2) Joint");
			System.out.println();
			System.out.print("Please choose the number that corresponds your answer: ");
			int accountType = scan.nextInt();
				//if statement to send user to correct method
				if (accountType == 1) {
					System.out.println();
					createPersonal();
					break;
				}else if(accountType == 2) {
					System.out.println();
					createJoint();
					break;
				}else {
					//user did not input answer correctly
					Etc.incorrect();
				}
			}catch(Exception e) {
				String error = scan.nextLine();
				//User did not respond with an integer
				Etc.incorrect();	
			}
		}
	}//END applyForAccount
	
	@SuppressWarnings("static-access")
	public static void createPersonal() {
		String blank = scan.nextLine();
		
		//if statement to assign account type as personal
		if (x) {
			accountCheck.add(1);
			x = false;
		}

		System.out.println("To create a personal account all we need is your first and last name.");
		while(true) {
			System.out.println();
			System.out.print("Please enter your first name: ");
			fName = scan.nextLine();
			System.out.print("Please enter your last name: ");
			lName = scan.nextLine();
			if(fName.isEmpty() || lName.isEmpty()) {
				//User response was blank
				Etc.incorrect();
			}else {
				System.out.println();
				break;
			}
		}	
		Etc.fillAccount();
	}//END createPersonal
	

	public static void createJoint() {
		String blank = scan.nextLine();
		//if statement to assign account type as personal
		if (x) {
			accountCheck.add(2);
			x = false;
		}
		
		System.out.println("To create a joint account all we need is both first and last names.");
		while(true) {
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
				break;
			}
		}
		while(true) {
			System.out.println();
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
				System.out.println();
				break;
			}
		}
		Etc.fillJointAccount();
	}//END createJoint
}
