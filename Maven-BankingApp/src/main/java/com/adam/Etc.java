package com.adam;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Etc {
	static Scanner scan = new Scanner(System.in);
	
	public static void incorrect() {
		System.out.println();
		System.out.println("*****************************************************");
		System.out.println("Sorry, your response was incorrect, please try again.");
		System.out.println("*****************************************************");
		System.out.println();
	}//END blank
	
	public static void exit() {
		System.out.println();
		System.out.println("*****************************");
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
	
	public static void single() {
		System.out.println();
		System.out.println("**************************************************");
		System.out.println("Sorry, you may only have one account per username.");
		System.out.println("**************************************************");
		System.out.println();
	}//END single
	
	public static void empty() {
		System.out.println();
		System.out.println("****************************************************************");
		System.out.println("You need to apply for an account in order to withdraw any money.");
		System.out.println("****************************************************************");
		System.out.println();
	}//END empty
	
	public static void nonjoint() {
		System.out.println();
		System.out.println("*****************************************************************");
		System.out.println("You need to apply for a joint account in order to transfer money.");
		System.out.println("*****************************************************************");
		System.out.println();
	}//END nonjoint
	
	public static void noFunds() {
		System.out.println("************************************************************");
		System.out.println("Sorry you must deposit money first in order to withdraw any.");
		System.out.println("************************************************************");
		System.out.println();
	}//END deposit
	
	public static void negative() {
		System.out.println();
		System.out.println("***********************************************************");
		System.out.println("Im sorry, you will go negative if you take that amount out.");
		System.out.println("***********************************************************");
		System.out.println();
	}//END negative
	
	public static void noAccount() {
		System.out.println();
		System.out.println("************************************************");
		System.out.println("There are no accounts to be managed at this time");
		System.out.println("************************************************");
		System.out.println();
	}//END noAccount
	
	public static void showInfo() {
		System.out.println();
		System.out.println("Here is your account information: " + CustomerLogin.accountInformation);
		if(ApplyForAccount.accountCheck.contains(1)) {
			System.out.println("Here is your account balance: " + MoveMoney.accountBalance);
		}else if(ApplyForAccount.accountCheck.contains(2)) {
			System.out.println("Here is your account balance for account 1 is: " + JointMoveMoney.accountBalance1);
			System.out.println("Here is your account balance for account 2 is: " + JointMoveMoney.accountBalance2);
		}
		System.out.println("Account Check: " + ApplyForAccount.accountCheck);
		System.out.println();
	}//END showINFO
	
	public static void fillAccount() {
		CustomerLogin cl = new CustomerLogin();
		ApplyForAccount afa = new ApplyForAccount();
		
		System.out.println("Congratulations on your new account!");
		System.out.println("You will now be given a bank account number.");
		int accountNumber = ThreadLocalRandom.current().nextInt(10000, 99998 + 1);
		String s = String.valueOf(accountNumber);
		cl.accountInformation.add(afa.fName);
		cl.accountInformation.add(afa.lName);
		cl.accountInformation.add(s);
		System.out.println("Your personal account number is " + s + " .");
		System.out.println("Please do not forget it.");
		System.out.println();
	}//END fillAccount
	
	@SuppressWarnings("static-access")
	public static void fillJointAccount() {
		CustomerLogin cl = new CustomerLogin();
		ApplyForAccount afa = new ApplyForAccount();
		
		System.out.println("Congratulations on your new account!");
		System.out.println("You will now be given a bank account number.");
		int accountNumber = ThreadLocalRandom.current().nextInt(10000, 99998 + 1);
		String s = String.valueOf(accountNumber);
		cl.accountInformation.add(afa.fName2);
		cl.accountInformation.add(afa.lName2);
		cl.accountInformation.add(afa.fName3);
		cl.accountInformation.add(afa.lName3);
		cl.accountInformation.add(s);
		System.out.println("Your joint account number is " + s + " .");
		System.out.println("Please do not forget it.");
		System.out.println();
	}//END fillJointAccount
	
	@SuppressWarnings("static-access")
	public static void setAmount() {
		MoveMoney mm = new MoveMoney();
		
		mm.accountBalance.set(0,mm.newAmount);
		System.out.println();
		System.out.println("You have made a withdrawal of " + mm.withdraw + " dollars.");
		System.out.println("Your new account balance is: " + mm.accountBalance);
		System.out.println();
	}//END setAmount
	
	
	public static void aTOb() {
		JointMoveMoney jmm = new JointMoveMoney();
		
		System.out.println("Your account balance for account 1 is: " + jmm.accountBalance1);
		System.out.print("How much money would you like to withdraw? ");
		double withdraw = scan.nextDouble();
		double newAmount = jmm.accountBalance1.get(0) - withdraw;
		if(newAmount < 0 ) {
			Etc.negative();
		}else {
			double addAmount = jmm.accountBalance2.get(0) + withdraw;
			jmm.accountBalance1.set(0, newAmount);
			jmm.accountBalance2.set(0, addAmount);
			System.out.println();
			System.out.println("You have transferred " + withdraw + " dollars.");
			System.out.println("Your new account balance for account 1 is: " + jmm.accountBalance1);
			System.out.println("Your new account balance for account 2 is: " + jmm.accountBalance2);
			System.out.println();
		}
	}//END aTOb
	
	public static void bTOa() {
		JointMoveMoney jmm = new JointMoveMoney();

		System.out.println("Your account balance for account 2 is: " + jmm.accountBalance2);
		System.out.print("How much money would you like to withdraw? ");
		double withdraw = scan.nextDouble();
		double newAmount = jmm.accountBalance2.get(0) - withdraw;
		if(newAmount < 0 ) {
			Etc.negative();
		}else {
			double addAmount = jmm.accountBalance1.get(0) + withdraw;
			jmm.accountBalance2.set(0, newAmount);
			jmm.accountBalance1.set(0, addAmount);
			System.out.println();
			System.out.println("You have transferred " + withdraw + " dollars.");
			System.out.println("Your new account balance for account 1 is: " + jmm.accountBalance1);
			System.out.println("Your new account balance for account 2 is: " + jmm.accountBalance2);
			System.out.println();
		}
	}//END bTOa
	
	public static void showInfo2() {
		System.out.println("Here is all account information: " + CustomerLogin.accountInformation);
		if(ApplyForAccount.accountCheck.contains(1)) {
			System.out.println("Here is the account balance: " + MoveMoney.accountBalance);
		}else if(ApplyForAccount.accountCheck.contains(2)) {
			System.out.println("Here is the account balance for account 1 is: " + JointMoveMoney.accountBalance1);
			System.out.println("Here is the account balance for account 2 is: " + JointMoveMoney.accountBalance2);
		}
		System.out.println("Account Check: " + ApplyForAccount.accountCheck);
		System.out.println();
	}//END showInfo2

}
