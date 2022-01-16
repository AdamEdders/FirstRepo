package com.adam;

import java.util.Scanner;
import java.util.ArrayList;

public class MoveMoney {
	
	static Scanner scan = new Scanner(System.in);
	public static ArrayList<Double> accountBalance = new ArrayList<Double>();
	//boolean x to place starting value in arrayList; opens on deposit
	static boolean x = true;
	//
	static double newAmount,withdraw,deposit;
	
	public static void setAccount() {
		double i = 0;
		if (x) {
			accountBalance.add(i);
			x = false;
		}
	}//END setAccount
	
	public static void deposit() {
		while(true) {
			System.out.println("Your account balance is: " + accountBalance);
			System.out.print("How much money would you like to deposit? ");
			try {
				deposit = scan.nextDouble();
				if(deposit < 0) {
					//User cannot deposit a negative value
					Etc.incorrect();
				}else {
					System.out.println();
					newAmount = accountBalance.get(0) + deposit;
					accountBalance.set(0, newAmount);
					System.out.println("Thank you for making a deposit.");
					System.out.println("Your new account balance is: " + accountBalance);
					System.out.println();
					break;
				}
			}catch (Exception e) {
				String error = scan.nextLine();
				//User responded with letters
				Etc.incorrect();
			}
		}
	}//END deposit
	
	public static void withdraw() {
		if (x) {
			//User has not deposited any money yet
			Etc.noFunds();
		}else {
			while(true) {
				withdraw = 0;
				newAmount = 0;
				try {
					System.out.println("Your account balance is : " + accountBalance);
					System.out.print("How much money would you like to withdraw? ");
					withdraw = scan.nextDouble();
					System.out.println();
					if(withdraw < 0) {
						//User cannot deposit a negative value
						Etc.incorrect();
					}else {
						newAmount = accountBalance.get(0) - withdraw;
						if(newAmount < 0) {
							//User does not have the funds
							Etc.negative();
						}else {
							Etc.setAmount();
							break;
						}
					}
				}catch(Exception e) {
					String error = scan.nextLine();
					//User did not respond with an integer
					Etc.incorrect();
				}
			}
		}
	}//END withdraw
}
