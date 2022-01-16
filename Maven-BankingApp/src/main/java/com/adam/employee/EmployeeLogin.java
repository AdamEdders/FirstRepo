package com.adam.employee;
//import Scanner
import java.util.Scanner;

import com.adam.Driver;
import com.adam.Etc;

//import ArrayList
import java.util.ArrayList;

public class EmployeeLogin {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<String> employeeInformation = new ArrayList<String>();
	
	public static void employeeSignIn() {
		System.out.println("You have chosen Employee Login.");
		System.out.println();
		System.out.println("Let's sign into the employee account.");
		System.out.println("If you want to leave this screen type 'BACK' as a response.");
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
				System.out.println();
				//Enter Employee Menu
				EmployeeMenu.employeeOptions();
				break;
			}else if(username.equals("BACK") || password.equals("BACK")) {
				System.out.println();
				//Back to Home Screen
				Driver.main(null);
			}else {
				Etc.incorrect();
			}
		}
	}//END employeeLogin

}
