package com.adam;
import java.util.ArrayList;
import java.util.Scanner;

public class JointMoveMoney {
	static Scanner scan = new Scanner(System.in);
	public static ArrayList<Double> accountBalance1 = new ArrayList<Double>();
	public static ArrayList<Double> accountBalance2= new ArrayList<Double>();
	//boolean x to set values in both bank accounts
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
		while(true){
			try {
				System.out.println("Your account balance for account 1 is: " + accountBalance1);
				System.out.println("Your account balance for account 2 is: " + accountBalance2);
				System.out.print("Which account would you like to deposit in, 1 or 2? ");
				int choice = scan.nextInt();
				if(choice == 1) {
					System.out.print("How much money would you like to deposit? ");
					double deposit = scan.nextDouble();
					if(deposit < 0) {
						//User cannot deposit a negative value
						Etc.incorrect();
					}else {
						System.out.println();
						double newAmount = (accountBalance1.get(0) + deposit);
						accountBalance1.set(0, newAmount);
						System.out.println("Thank you for making a deposit.");
						System.out.println("Your new account balance for account 1 is: " + accountBalance1);
						System.out.println();
						break;
					}
				}else if(choice == 2) {
					System.out.print("How much money would you like to deposit? ");
					double deposit = scan.nextDouble();
					if(deposit < 0) {
						//User cannot deposit a negative value
						Etc.incorrect();
					}else {
						System.out.println();
						double newAmount = (accountBalance2.get(0) + deposit);
						accountBalance2.set(0, newAmount);
						System.out.println("Thank you for making a deposit.");
						System.out.println("Your new account balance for account 2 is: " + accountBalance2);
						System.out.println();
						break;
					}
				}else {
					//User did not respond correctly
					Etc.incorrect();
				}
			}catch (Exception e) {
				String error = scan.nextLine();
				//User did not respond with an integer
				Etc.incorrect();
			}
		}
	}//END jointDeposit
	
	static public void jointWithdraw() {
		if (x) {
			//User has not deposited any money yet
			Etc.noFunds();
		}else {
			while(true) {
				try {
				System.out.println("Your account balance for account 1 is: " + accountBalance1);
				System.out.println("Your account balance for account 2 is: " + accountBalance2);
				System.out.print("Which account would you like to withdraw from, 1 or 2? ");
				int choice = scan.nextInt();
					if(choice == 1) {
						double withdraw = 0;
						double newAmount = 0;
						System.out.println("Your account balance for account 1 is : " + accountBalance1);
						System.out.print("How much money would you like to withdraw? ");
						withdraw = scan.nextDouble();
						System.out.println();
						if(withdraw < 0) {
							//User cannot deposit a negative value
							Etc.incorrect();
						}else {
							newAmount = accountBalance1.get(0) - withdraw;
							if(newAmount < 0) {
								Etc.negative();
							}else {
								accountBalance1.set(0,newAmount);
								System.out.println();
								System.out.println("You have made a withdrawal of " + withdraw + " dollars.");
								System.out.println("Your new account balance for account 1 is: " + accountBalance1);
								System.out.println();
								break;
							}
						}
					}else if(choice == 2) {
						double withdraw = 0;
						double newAmount = 0;
						System.out.println("Your account balance for account 2 is : " + accountBalance2);
						System.out.print("How much money would you like to withdraw? ");
						withdraw = scan.nextDouble();
						System.out.println();
						if(withdraw < 0) {
							//User cannot deposit a negative value
							Etc.incorrect();
						}else {
							newAmount = accountBalance2.get(0) - withdraw;
							if(newAmount < 0) {
								Etc.negative();
							}else {
								accountBalance2.set(0,newAmount);
								System.out.println();
								System.out.println("You have made a withdrawal of " + withdraw + " dollars.");
								System.out.println("Your new account balance for account 2 is: " + accountBalance2);
								System.out.println();
								break;
							}
						}
					}else {
						//User response was incorrect
						Etc.incorrect();
					}
				}catch(Exception e) {
					String error = scan.nextLine();
					//User did not respond with an integer
					Etc.incorrect();
				}
			}
		}
		
	}//END jointWithdraw
	
	public static void transfer() {
		if(accountBalance1.isEmpty() && accountBalance2.isEmpty()) {
			Etc.noFunds();
		}else {
			while(true) {
				try {
					String blank = scan.nextLine();
					System.out.println();
					System.out.println("Your account balance for account 1 is: " + accountBalance1);
					System.out.println("Your account balance for account 2 is: " + accountBalance2);
					System.out.print("Which account would you like to withdraw from, 1 or 2? ");
					int choice = scan.nextInt();
					System.out.println();
					if (choice == 1) {
						Etc.aTOb();
						break;
					}else if(choice == 2) {
						Etc.bTOa();
						break;
					}else {
						Etc.incorrect();
					}
				}catch(Exception e) {
					Etc.incorrect();
				}
			}
		}
	}//END transfer
}