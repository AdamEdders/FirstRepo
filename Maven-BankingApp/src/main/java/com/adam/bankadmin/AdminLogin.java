package com.adam.bankadmin;
import java.util.ArrayList;
//import Scanner
import java.util.Scanner;

public class AdminLogin {
	
	static Scanner scan = new Scanner(System.in);
	static ArrayList<String> adminInformation = new ArrayList<String>();
	
	public static void adminSignIn() {
		System.out.println();
		System.out.println("You have chosen Bank Admin Login");
		System.out.println();
		while(true) {
			try {
				System.out.print("What is the Master 4-Digit PIN? ");
				String pin = scan.nextLine();
				if(pin.equals("0000")) {
					System.out.println();
					System.out.println("You have logged in!");
					System.out.println();
					//Enter Admin menu
					AdminMenu.adminOptions();
					break;
				}else if(pin.isEmpty()){
					System.out.println();
					System.out.println("You cannot put in an empty response.");
				}else {
					System.out.println();
					System.out.println("Sorry that response is incorrect.");
				}
			}catch(Exception e) {
				System.out.println();
				System.out.println("Sorry, I did not understand your answer.");
				System.out.println();
			}
		}
	}//END adminSignIn
	

}
