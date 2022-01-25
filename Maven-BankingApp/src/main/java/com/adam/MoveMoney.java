package com.adam;

import java.util.Scanner;


import com.adam.SQL.DAOAccounts;
import com.adam.SQL.DAOMoney;
public class MoveMoney {
	
	static Scanner scan = new Scanner(System.in);
	static double newAmount,withdraw,deposit;
	
	public static void deposit() {
		DAOAccounts daoa = new DAOAccounts();
		while(true) {
			System.out.println("***********************************************************");
			System.out.println("To deposit funds, please enter your Account Number.");
			System.out.println("If you do not know your account number, please enter '-1'");
			System.out.print("Enter your response here: ");
			try {
				int accountNumber = scan.nextInt();
				if(accountNumber == -1) {
					//Send User to Customer Menu
					System.out.println();
					System.out.println("*******************************************");
					Driver.main(null);
					break;
				}else if(daoa.checkNumber(accountNumber)) {
					System.out.println();
					System.out.println("**********************");
					System.out.print("Enter Deposit Amount: ");
					double deposit = scan.nextDouble();
					if (deposit >= 0) {
						System.out.println();
						//RUN DAO to deposit funds
						DAOMoney daom = new DAOMoney();
						daom.deposit(accountNumber, deposit);
						break;
					}else if (deposit < 0) {
						//User can not input negative numbers
						Etc.incorrect();
					}
				}else {
					//User did not input response correctly
					Etc.incorrect();
				}
			}catch (Exception e) {
				scan.nextLine();
				//User responded with letters
				Etc.incorrect();
			}
		}
	}//END deposit
	
	public static void withdraw() {
		DAOAccounts daoa = new DAOAccounts();
		while(true) {
			System.out.println("***********************************************************");
			System.out.println("To withdraw funds, please enter your account number.");
			System.out.println("If you do not know your account number, please enter '-1'");
			System.out.print("Enter your response here: ");
			try {
				int accountNumber = scan.nextInt();
				if (accountNumber == -1) {
					//Send User to Customer Menu
					System.out.println();
					System.out.println("*******************************************");
					Driver.main(null);
					break;
				}else if (daoa.checkNumber(accountNumber)) {
					DAOMoney daom = new DAOMoney();
					double balance = daom.getBalance(accountNumber);
					System.out.println();
					System.out.println("**********************");
					System.out.println("Your Account Balance is: " + balance);
					System.out.print("Enter Withdrawal Amount: ");
					double withdraw = scan.nextDouble();
					if (withdraw > balance) {
						//User does not have the funds
						Etc.negative();
					}else if (withdraw >= 0) {
						System.out.println();
						//Run DAO to withdraw funds
						daom.withdraw(accountNumber,withdraw);
						break;
					}
				}else {
					//User did not input response correctly
					Etc.incorrect();
				}
			}catch(Exception e) {
				scan.nextLine();
				//User did not respond with an integer
				Etc.incorrect();
			}
		}
	}//END withdraw
	
	public static void transfer() {
		DAOAccounts daoa = new DAOAccounts();
		while (true) {
			System.out.println("***********************************************************");
			System.out.println("To start the transfer of funds, you will need two accounts.");
			System.out.println("The first account number will be withdrawn from.");
			System.out.println("If you do not know BOTH account numbers, please enter '-1'");
			try {
				System.out.print("Enter the first account number here: ");
				int accountNumber1 = scan.nextInt();
				System.out.print("Enter the second account number here: ");
				int accountNumber2 = scan.nextInt();
				if (accountNumber1 == -1 || accountNumber2 == -1) {
					//Send User to Customer Menu
					System.out.println();
					System.out.println("*******************************************");
					Driver.main(null);
					break;
				}else if (daoa.checkNumber(accountNumber1) && daoa.checkNumber(accountNumber2)) {
					DAOMoney daom = new DAOMoney();
					double balance = daom.getBalance(accountNumber1);
					System.out.println();
					System.out.println("**********************");
					System.out.println("Your Account Balance is: " + balance);
					System.out.print("Enter Withdrawal Amount: ");
					double withdraw = scan.nextDouble();
					if (withdraw > balance) {
						//User does not have the funds
						Etc.negative();
					}else if (withdraw >= 0) {
						System.out.println();
						//Run DAO to withdraw funds
						daom.withdraw(accountNumber1,withdraw);
						daom.deposit(accountNumber2, withdraw);
						break;
					}
				}else {
					//User did not input response correctly
					Etc.incorrect();
				}
			}catch(Exception e) {
				//User did not input response correctly.
				Etc.incorrect();
			}
		}	
	}//END transfer
	
	public static void checkBalance() {
		while (true) {
			DAOAccounts daoa = new DAOAccounts();
			System.out.println("**********************************************************");
			System.out.println("To check account balance, please enter the account number.");
			System.out.println("If you do not know your account number, please enter '-1'");
			System.out.print("Enter your response here: ");
			try {
				int accountNumber = scan.nextInt();
				if (accountNumber == -1) {
					//Send User to Customer Menu
					CustomerMenu.customerOptions();
					break;
				}else if(daoa.checkNumber(accountNumber)) {
					DAOMoney daom = new DAOMoney();
					double balance = daom.getBalance(accountNumber);
					System.out.println();
					System.out.println("The current account balance is: " + balance);
					break;
				}else {
					Etc.incorrect();
				}
				
			}catch (Exception e) {
				scan.nextLine();
				//User did not input response correctly
				Etc.incorrect();
			}
		}
		
		
	}//END checkBalance
}