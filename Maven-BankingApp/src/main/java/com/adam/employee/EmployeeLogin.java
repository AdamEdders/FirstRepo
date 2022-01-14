package com.adam.employee;
//import Scanner
import java.util.Scanner;
//import ArrayList
import java.util.ArrayList;

public class EmployeeLogin {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<String> employeeInformation = new ArrayList<String>();
	
	public static void employeeSignIn() {
		System.out.println();
		System.out.println("You have chosen Employee Login.");
		System.out.println();
		System.out.println("Let's sign into the employee account.");
		System.out.println();
		while(true) {
			System.out.print("Please enter the employee username: ");
			String username = scan.nextLine();
			System.out.print("Please enter the employee password: ");
			String password = scan.nextLine();
			//if statement to confirm username and password.
			if(username.equals("Cheddars") && password.equals("Slugger1")) {
				System.out.println();
				System.out.println("You have logged in!");
				//Enter Employee Menu
				EmployeeMenu.employeeOptions();
				break;
			}else {
				System.out.println();
				System.out.println("Sorry, the username or password was incorrect");
				System.out.println();
			}
		}
	}//END employeeLogin

}
