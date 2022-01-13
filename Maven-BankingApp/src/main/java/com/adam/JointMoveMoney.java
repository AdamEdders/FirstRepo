package com.adam;
import java.util.ArrayList;
import java.util.Scanner;

public class JointMoveMoney {
	static Scanner scan = new Scanner(System.in);
	public static ArrayList<Double> accountBalance1 = new ArrayList<Double>();
	public static ArrayList<Double> accountBalance2= new ArrayList<Double>();
	static boolean x = true;
	
	public static void setAccount() {
		double i = 0;
		if (x) {
			accountBalance1.add(i);
			accountBalance2.add(i);
			x = false;
		}
	}//END setAccount
	
	public static void jointDeposit() {
		System.out.println();
		while(true){
			System.out.println("Your account balance for account 1 is: " + accountBalance1);
			System.out.println("Your account balance for account 2 is: " + accountBalance2);
			System.out.print("Which account would you like to deposit in, 1 or 2? ");
			String choice = scan.nextLine();
			if(choice.charAt(0) == '1') {
				System.out.print("How much money would you like to deposit? ");
				double deposit = scan.nextDouble();
				double newAmount = (accountBalance1.get(0) + deposit);
				accountBalance1.set(0, newAmount);
				System.out.println("Thank you for making a deposit.");
				System.out.println("Your new account balance for account 1 is: " + accountBalance1);
				System.out.println();
				break;
			}else if(choice.charAt(0) == '2') {
				System.out.print("How much money would you like to deposit? ");
				double deposit = scan.nextDouble();
				double newAmount = (accountBalance2.get(0) + deposit);
				accountBalance2.set(0, newAmount);
				System.out.println("Thank you for making a deposit.");
				System.out.println("Your new account balance for account 2 is: " + accountBalance2);
				System.out.println();
				break;
			}else {
				System.out.println();
				System.out.println();
				System.out.println("Sorry, you need to choose 1 or 2.");
			}
		}
		

	}//END jointDeposit
	
	static public void jointWithdraw() {
		System.out.println();
		String choice;
		if (x) {
			System.out.println();
			System.out.println("Sorry you must deposit money first in order to withdraw any.");
			System.out.println();
		}else {
			while(true) {
				try {
				System.out.println("Your account balance for account 1 is: " + accountBalance1);
				System.out.println("Your account balance for account 2 is: " + accountBalance2);
				System.out.print("Which account would you like to withdraw from, 1 or 2? ");
				choice = scan.nextLine();
					if(choice.charAt(0) == '1') {
						double withdraw = 0;
						double newAmount = 0;
						System.out.println("Your account balance for account 1 is : " + accountBalance1);
						System.out.print("How much money would you like to withdraw? ");
						System.out.println();
						withdraw = scan.nextDouble();
						newAmount = accountBalance1.get(0) - withdraw;
						if(newAmount < 0) {
							System.out.println();
							System.out.println("Im sorry, you will go negative if you take that amount out.");
							System.out.println();
						}else {
							accountBalance1.set(0,newAmount);
							System.out.println();
							System.out.println("You have made a withdrawal of " + withdraw + " dollars.");
							System.out.println("Your new account balance for account 1 is: " + accountBalance1);
							System.out.println();
							break;
						}
					}else if(choice.charAt(0) == '2') {
						double withdraw = 0;
						double newAmount = 0;
						System.out.println("Your account balance for account 2 is : " + accountBalance2);
						System.out.print("How much money would you like to withdraw? ");
						System.out.println();
						withdraw = scan.nextDouble();
						newAmount = accountBalance2.get(0) - withdraw;
						if(newAmount < 0) {
							System.out.println();
							System.out.println("Im sorry, you will go negative if you take that amount out.");
							System.out.println();
						}else {
							accountBalance2.set(0,newAmount);
							System.out.println();
							System.out.println("You have made a withdrawal of " + withdraw + " dollars.");
							System.out.println("Your new account balance for account 2 is: " + accountBalance2);
							System.out.println();
							break;
						}
					}else {
						System.out.println();
						System.out.println();
						System.out.println("Sorry, you need to choose 1 or 2.");
					}
				}catch(Exception e) {
					System.out.println();
					System.out.println();
					System.out.println("Sorry, your answer was not read correctly.");
				}
			}
		}
		
	}//END jointWithdraw
	
	public static void transfer() {
		if(accountBalance1.isEmpty() && accountBalance2.isEmpty()) {
			System.out.println();
			System.out.println("At least one account needs to have money in order to transfer funds.");
			System.out.println();
		}else {
			while(true) {
				try {
					System.out.println();
					System.out.println("Your account balance for account 1 is: " + accountBalance1);
					System.out.println("Your account balance for account 2 is: " + accountBalance2);
					System.out.print("Which account would you like to withdraw from, 1 or 2? ");
					String choice = scan.nextLine();
					if (choice.charAt(0) == '1') {
						System.out.println("Your account balance for account 1 is: " + accountBalance1);
						System.out.print("How much money would you like to withdraw? ");
						double withdraw = scan.nextDouble();
						double newAmount = accountBalance1.get(0) - withdraw;
						if(newAmount < 0 ) {
							System.out.println();
							System.out.println("Im sorry, you will go negative if you take that amount out.");
							System.out.println();
						}else {
							double addAmount = accountBalance2.get(0) + newAmount;
							accountBalance1.set(0, newAmount);
							accountBalance2.set(0, addAmount);
							System.out.println();
							System.out.println("You have transferred " + withdraw + " dollars.");
							System.out.println("Your new account balance for account 1 is: " + accountBalance1);
							System.out.println("Your new account balance for account 2 is: " + accountBalance2);
							System.out.println();
							break;
						}
					}else if(choice.charAt(0) == '2') {
						System.out.println("Your account balance for account 2 is: " + accountBalance2);
						System.out.print("How much money would you like to withdraw? ");
						double withdraw = scan.nextDouble();
						double newAmount = accountBalance2.get(0) - withdraw;
						if(newAmount < 0 ) {
							System.out.println();
							System.out.println("Im sorry, you will go negative if you take that amount out.");
							System.out.println();
						}else {
							double addAmount = accountBalance1.get(0) + newAmount;
							accountBalance2.set(0, newAmount);
							accountBalance1.set(0, addAmount);
							System.out.println();
							System.out.println("You have transferred " + withdraw + " dollars.");
							System.out.println("Your new account balance for account 1 is: " + accountBalance1);
							System.out.println("Your new account balance for account 2 is: " + accountBalance2);
							System.out.println();
							break;
						}
					}else {
						System.out.println();
						System.out.println();
						System.out.println("Sorry, I could not understand your answer.");
					}
				}catch(Exception e) {
					System.out.println();
					System.out.println();
					System.out.println("Sorry, I could not understand your answer.");
				}
			}
		}
	}//END transfer

}
