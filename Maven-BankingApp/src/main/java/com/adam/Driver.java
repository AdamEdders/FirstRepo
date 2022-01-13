package com.adam;
//import Scanner
import java.util.Scanner;

import com.adam.employee.EmployeeLogin;

public class Driver {
	
	//Instantiate Scanner for user input
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Welcome user and choose login type
		System.out.println("Howdy, and welcome to The Bank!");
		//while loop for user error
		while(true) {
			System.out.println();
			System.out.println("1) Customer");
			System.out.println("2) Employee");
			System.out.println("3) Bank Admin");
			System.out.println();
			System.out.print("Please choose the number that corresponds your login type: ");
			//try-catch block for user error
			try {
			String lt = scan.nextLine();
			//Use nested if-statements to determine login type
				if (lt.charAt(0) == '1') {
					//Start Customer Login
					System.out.println();
					CustomerLogin.startUp();
					break;
				}else if(lt.charAt(0) == '2') {
					//Start Employee Login
					EmployeeLogin.setAccount();
					EmployeeLogin.employeeSignIn();
					System.out.println();
					
					break;
				}else if(lt.charAt(0) == '3') {
					//Start Bank Admin Login
					System.out.println();
					
					break;
				}else{
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
	}
}
