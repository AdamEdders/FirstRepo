package com.adam;

import java.util.Scanner;
import java.util.ArrayList;

public class MoveMoney {
	
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Double> accountBalance = new ArrayList<Double>();
	static boolean x = true;
	
	public static void setAccount() {
		double i = 0;
		if (x) {
			accountBalance.add(i);
			x = false;
		}
	}//END setAccount
	
	public static void deposit() {
		System.out.println();
		System.out.println("Your account balance is: " + accountBalance);
		System.out.print("How much money would you like to deposit? ");
		double deposit = scan.nextDouble();
		double newAmount = (accountBalance.get(0) + deposit);
		accountBalance.set(0, newAmount);
		System.out.println("Thank you for making a deposit.");
		System.out.println("Your new account balance is: " + accountBalance);
		System.out.println();
	}//END deposit
	
	public static void withdraw() {
		System.out.println();
		if (x) {
			System.out.println();
			System.out.println("Sorry you must deposit money first in order to withdraw any.");
			System.out.println();
		}else {
			double withdraw = 0;
			double newAmount = 0;
			System.out.println("Your account balance for is : " + accountBalance);
			System.out.print("How much money would you like to withdraw? ");
			System.out.println();
			withdraw = scan.nextDouble();
			newAmount = accountBalance.get(0) - withdraw;
			if(newAmount < 0) {
				System.out.println();
				System.out.println("Im sorry, you will go negative if you take that amount out.");
				System.out.println();
			}else {
				accountBalance.set(0,newAmount);
				System.out.println();
				System.out.println("You have made a withdrawal of " + withdraw + " dollars.");
				System.out.println("Your new account balance is: " + accountBalance);
				System.out.println();
			}
		}
	}//END withdraw

}
