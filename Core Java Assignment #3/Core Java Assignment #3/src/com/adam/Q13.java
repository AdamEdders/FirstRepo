package com.adam;
import java.util.InputMismatchException;
//import Scanner
import java.util.Scanner;

public class Q13 {
	public static void triangle() {
		boolean test = true;
		while(test) {
			try {
				//Instantiate scanner to ask for how many lines
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter n: ");
				int n = scanner.nextInt();
				//variable to keep count
				int k = 1;
				//Loop for how many lines
				for (int i = 1; i <=n; i++) {
					//Loop for printing
					for(int j = 1; j <= i; j++) {
						int num = (k % 2 == 1) ? 0 : 1;
								System.out.print(num);
								k++;
					}
					test = false;
					System.out.println();
				}
			} catch(InputMismatchException e) {
				System.out.println("Sorry, please make sure to type an integer only.");
				//Prints what method had the crash
				//Produces red text
				//e.printStackTrace();
			}
		}
	}
}
