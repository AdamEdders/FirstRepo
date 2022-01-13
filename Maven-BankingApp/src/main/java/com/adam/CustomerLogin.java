package com.adam;
//import Scanner
import java.util.Scanner;
//import ArrayList
import java.util.ArrayList;

public class CustomerLogin {
	//Instantiate ArrayList to hold Account Information
	public static ArrayList<String> accountInformation = new ArrayList<String>();
	//Instantiate Scanner and get user input
	static Scanner scan = new Scanner(System.in);
	
	public static void startUp() {
		System.out.println("You have chosen Customer Login");
		System.out.println();
		System.out.println("What would you like to do? ");
		//while loop for user error
		while(true) {
			System.out.println();
			System.out.println("1) Create an Account");
			System.out.println("2) Sign into Account");
			System.out.println();
			System.out.print("Please choose the number that corresponds your answer: ");
			//try-catch block for user error
			try {
				String choice = scan.nextLine();
				if (choice.charAt(0) == '1') {
					//Start Account Creation
					System.out.println();
					AccountCreation();
					break;
				}else if(choice.charAt(0) == '2') {
					//Start Customer sign in
					System.out.println();
					signIn();
					break;
				}else {
					//User did not input answer correctly
					System.out.println();
					System.out.println();
					System.out.println("I'm sorry, I did not understand your answer, please try again.");
				}
			}catch(Exception e) {
				//User left answer blank
				System.out.println();
				System.out.println();
				System.out.println("I'm sorry, I did not understand your answer, please try again.");
			}
			
		}
	}//END startUp
	
	public static void AccountCreation() {
		System.out.println("You have chosen to create an account");
		System.out.println();
		//while loop for user error
		while(true) {
			System.out.print("Please enter a username: ");
			String username = scan.nextLine();
			System.out.print("Now, please enter a password: ");
			String password = scan.nextLine();
			//if statement to confirm username/password not empty
			if(username.trim() != "" && password.trim() != "") {
				System.out.println();
				System.out.println("You have chosen the username: " + username);
				System.out.println("You have chosen the password: " + password);
				System.out.println();
				System.out.println("Is the above information correct?");
				System.out.print("Please answer Yes or No: ");
				String answer = scan.nextLine();
				String a = answer.toLowerCase();
				//if statement to confirm username and password
				if (a.charAt(0) == 'y') {
					accountInformation.add(username);
					accountInformation.add(password);
					signIn();
					break;
				}else if(a.charAt(0) == 'n') {
					System.out.println();
					System.out.println();
					System.out.println("The username and password was not correct, please try again.");
				}else {
					System.out.println("I'm sorry, I did not understand your answer, please try again.");
				}
			}else {
				System.out.println();
				System.out.println();
				System.out.println("You have left the username or password blank, please try again.");
			}
		}
	}//END AccountCreation
	
	public static void signIn() {
		System.out.println();
		System.out.println();
		System.out.println("Lets sign into your account!");
		System.out.println();
		while(true) {
			System.out.print("Please enter your username: ");
			String usernameCheck = scan.nextLine();
			System.out.print("Please enter your password: ");
			String passwordCheck = scan.nextLine();
			//if statement to check if username and password are correct.
			if(accountInformation.contains(usernameCheck) && accountInformation.contains(passwordCheck)) {
				//Enter Customer Menu
				System.out.println();
				System.out.println();
				CustomerMenu.customerOptions();
				break;
			}else {
				System.out.println();
				System.out.println();
				System.out.println("The username or password was not correct, please try again.");
			}
		}
			
	}//END signIn

}
