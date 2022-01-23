package com.adam.bankadmin;

import java.util.Scanner;

import com.adam.Etc;
import com.adam.SQL.DAOAccounts;

public class AdminCancel {
	static Scanner scan = new Scanner(System.in);
	
	public static void cancel() {
		DAOAccounts daoa = new DAOAccounts();
		while (true) {
			try {
				System.out.println("");
				System.out.println("Enter the correct username of the account you would like to cancel.");
				System.out.println("Enter 'BACK' to return to Admin Menu.");
				System.out.print("Enter your response here: ");
				String accountName = scan.nextLine();
				if (daoa.checkName(accountName)) {
					daoa.cancelAccount(accountName);
					daoa.cancelBalance(accountName);
					System.out.println();
					System.out.println("The username given has had all accounts cancelled and their money returned.");
					System.out.println();
					break;			
				}else {
					Etc.incorrect();
				}
			}catch (Exception e) {
				Etc.incorrect();
			}
		}
		
	}//END cancel

}
