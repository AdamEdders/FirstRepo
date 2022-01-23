package com.adam.bankadmin;
//import Scanner
import java.util.Scanner;
import com.adam.Driver;
import com.adam.Etc;
import com.adam.SQL.DAOLogins;

public class AdminLogin {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void adminSignIn() {
		DAOLogins daol = new DAOLogins();
		System.out.println("********************************");
		System.out.println("You have chosen Bank Admin Login");
		System.out.println("If you want to leave this screen type 'BACK' as a response.");
		System.out.println();
		while(true) {
			try {
				System.out.print("What is the Master 4-Digit PIN? ");
				String pin = scan.nextLine();
				if(daol.admin(pin)) {
					System.out.println();
					System.out.println("You have logged in!");
					System.out.println();
					//Enter Admin menu
					AdminMenu.adminOptions();
					break;
				}else if(pin.equals("BACK")) {
					System.out.println();
					System.out.println("*******************************************");
					//Back to Home Screen
					Driver.main(null);
				}else if(pin.isEmpty()){
					Etc.incorrect();
				}else {
					Etc.incorrect();
				}
			}catch(Exception e) {
				Etc.incorrect();
			}
		}
	}//END adminSignIn
	

}
