package com.adam;
import java.util.Scanner;

import com.adam.bankadmin.AdminLogin;
import com.adam.employee.EmployeeLogin;

public class Driver {
	//Instantiate Scanner for user input
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//while loop for user error
		while(true) {
			//Welcome user and choose login type
			System.out.println("Howdy, and welcome to The Bank Home Screen!");
			System.out.println();
			System.out.println("1) Customer");
			System.out.println("2) Employee");
			System.out.println("3) Bank Admin");
			System.out.println("4) Quit");
			System.out.println();
			System.out.print("Please choose the number that corresponds to your login type: ");
			String lt = scan.nextLine();
			//Use nested if-statements to determine login type
			if (lt.equals("1")) {
				System.out.println();
				//Start Customer Login
				CustomerLogin.startUp();
				break;
			}else if(lt.equals("2")) {
				System.out.println();
				//Start Employee Login
				EmployeeLogin.employeeSignIn();
				break;
			}else if(lt.equals("3")) {
				System.out.println();
				//Start Bank Admin Login
				AdminLogin.adminSignIn();
				break;
			}else if(lt.equals("4")) {
				//END Service
				Etc.exit();
			}else{
				//User did not input response correctly
				Etc.incorrect();
			}
		}
	}
}
