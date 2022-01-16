package com.adam.bankadmin;
//import Scanner
import java.util.Scanner;

import com.adam.ApplyForAccount;
import com.adam.CustomerLogin;
import com.adam.Driver;
import com.adam.Etc;
import com.adam.JointMoveMoney;
import com.adam.MoveMoney;
import com.adam.employee.EmployeeAccountManagement;

public class AdminMenu {
	static Scanner scan = new Scanner(System.in);
	
	public static void adminOptions() {
		while (true) {
			try {
				System.out.println("Welcome to the Bank Admin Menu.");
				System.out.println("What would you like to do today?");
				System.out.println();
				System.out.println("1) View Customer Account Information");
				System.out.println("2) Deny/Approve Accounts");
				System.out.println("3) Withdraw from an Account");
				System.out.println("4) Deposit from an Account");
				System.out.println("5) Transfer between a Joint Account");
				System.out.println("6) Go Back to Home");
				System.out.println("7) Quit");
				System.out.println();
				System.out.print("Please choose the number that corresponds your answer: ");
				int x = scan.nextInt();
				//switch statement to access all possible options
				switch(x) {
				case 1:
					//Show Account Information and Balance
					System.out.println();
					Etc.showInfo2();
				break;
				case 2:
					if(ApplyForAccount.accountCheck.isEmpty()) {
						//No accounts to be managed
						Etc.noAccount();
					}else {
						System.out.println();
						//Enter Account Management
						EmployeeAccountManagement.accounts();
					}
				break;
				case 3:
					if(ApplyForAccount.accountCheck.contains(1)) {
						System.out.println();
						//Enter withdrawal
						MoveMoney.withdraw();
					}else if(ApplyForAccount.accountCheck.contains(2)){
						System.out.println();
						//Enter Joint withdrawal
						JointMoveMoney.jointWithdraw();
					}else {
						//User has not opened an account yet
						Etc.empty();
					}
				break;
				case 4:
					if(ApplyForAccount.accountCheck.contains(1)) {
						System.out.println();
						//Enter deposit
						MoveMoney.setAccount();
						MoveMoney.deposit();
					}else if(ApplyForAccount.accountCheck.contains(2)){
						System.out.println();
						//Enter Joint deposit
						JointMoveMoney.setAccount();
						JointMoveMoney.jointDeposit();
					}else {
						//User has not opened an account yet
						Etc.empty();
					}
				break;
				case 5:
					if(ApplyForAccount.accountCheck.contains(1)) {
						System.out.println();
						//User did not create a joint account
						Etc.nonjoint();
					}else if(ApplyForAccount.accountCheck.contains(2)){
						//Enter Transfer Money
						JointMoveMoney.transfer();
					}else {
						//User has not created a joint account
						Etc.nonjoint();
					}
				break;
				case 6:
					//Go back to Driver
					System.out.println();
					Driver.main(null);
				break;
				case 7:
					//END Service
					Etc.exit();
				break;
				default:
					Etc.incorrect();
				break;
				}
			}catch (Exception e) {
				String error = scan.nextLine();
				//User did not respond with an integer
				Etc.incorrect();
			}
		}
	}//END adminOptions
}
