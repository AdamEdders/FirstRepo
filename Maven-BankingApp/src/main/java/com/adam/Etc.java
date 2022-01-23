package com.adam;

import java.util.Scanner;

public class Etc {
	static Scanner scan = new Scanner(System.in);
	
	public static void incorrect() {
		System.out.println();
		System.out.println("*****************************************************");
		System.out.println("Sorry, your response was incorrect, please try again.");
		System.out.println("*****************************************************");
		System.out.println();
	}//END incorrect
	
	public static void wrong() {
		System.out.println();
		System.out.println("***********************************************");
		System.out.println("Sorry, your username or password was incorrect.");
		System.out.println("***********************************************");
		System.out.println();
	}//END wrong
	
	public static void exit() {
		System.out.println();
		System.out.println("*****************************");
		System.out.println("You have been logged out.");
		System.out.println("The terminal has been closed.");
		System.out.println("*****************************");
		System.exit(0);
	}//END exit
	
	public static void retry() {
		System.out.println();
		System.out.println("*********************************");
		System.out.println("Please re-enter your information.");
		System.out.println("*********************************");
		System.out.println();
	}//END retry
	
	public static void negative() {
		System.out.println();
		System.out.println("***********************************************************");
		System.out.println("Im sorry, you will go negative if you take that amount out.");
		System.out.println("***********************************************************");
		System.out.println();
	}//END negative
	
	public static void duplicate() {
		System.out.println();
		System.out.println("******************************");
		System.out.println("The username is already taken.");
		System.out.println("Returning to Home Screen...   ");
		System.out.println("******************************");
		System.out.println();
	}//END duplicate
	
	public static void status() {
		System.out.println();
		System.out.println("***********************************************");
		System.out.println("The username has not been accepted by the bank.");
		System.out.println("***********************************************");
		System.out.println();
	}//END status
}
