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
		//while loop for user error
		while(true) {
			System.out.println("What would you like to do? ");
			System.out.println();
			System.out.println("1) Create an Account");
			System.out.println("2) Sign into Account");
			System.out.println("3) Go Back to Home Screen");
			System.out.println();
			System.out.print("Please choose the number that corresponds your answer: ");
			String choice = scan.nextLine();
			if (choice.equals("1")) {
				System.out.println();
				//Start Account Creation
				AccountCreation();
				break;
			}else if(choice.equals("2")) {
				System.out.println();
				//Start Customer sign in
				signIn();
				break;
			}else if(choice.equals("3")) {
				System.out.println();
				//Back to Home Screen
				Driver.main(null);
			}else {
				//User did not input answer correctly
				Etc.incorrect();
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
				System.out.println("Does everything look okay?");
				System.out.print("Please answer Yes or No: ");
				String answer = scan.nextLine();
				String a = answer.toLowerCase();
				//if statement to confirm username and password
				if (a.equals("yes")) {
					System.out.println();
					accountInformation.add(username);
					accountInformation.add(password);
					signIn();
					break;
				}else if(a.equals("no")) {
					//User does not agree with shown username/password
					Etc.retry();
				}else {
					//User did not input response correctly
					Etc.incorrect();
				}
			}else {
				//User did not input response correctly
				Etc.incorrect();
			}
		}
	}//END AccountCreation
	
	public static void signIn() {
		System.out.println("Lets sign into your account!");
		System.out.println("If you want to leave this screen type 'BACK' as a response.");
		System.out.println();
		while(true) {
			System.out.print("Please enter your username: ");
			String usernameCheck = scan.nextLine();
			System.out.print("Please enter your password: ");
			String passwordCheck = scan.nextLine();
			//if statement to check if username and password are correct.
			if(accountInformation.contains(usernameCheck) && accountInformation.contains(passwordCheck)) {
				System.out.println();
				//Enter Customer Menu
				CustomerMenu.customerOptions();
				break;
			}else if(usernameCheck.equals("BACK") || passwordCheck.equals("BACK")) {
				System.out.println();
				//Back to Home Screen
				Driver.main(null);
			}else {
				//User response was incorrect
				Etc.incorrect();
			}
		}			
	}//END signIn
}